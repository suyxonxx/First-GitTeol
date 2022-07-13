package org.zerock.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml", 
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class BoardServiceImplTests {
	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void testList() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
				.andReturn().getModelAndView().getModelMap());
	}
	
	@Test
	public void testRegister() throws Exception {
		String resultPage =
			mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
				.param("title", "가나")
				.param("content", "다라")
				.param("writer", "마바사")
				)
			.andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
	}
	
	@Test
	public void testGet() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/get").param("bno", "40"))
				.andReturn().getModelAndView().getModelMap());
	}
	
	@Test
	public void testRemove() throws Exception {
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/remove").param("bno", "30"))
							.andReturn().getModelAndView().getViewName();
		log.info(resultPage);
	}
	
	@Test
	public void testModify() throws Exception {
		String resultPage = 
				mockMvc.perform(
					MockMvcRequestBuilders.post("/board/modify")
					.param("bno", "31")
					.param("title", "아자")
					.param("content", "차카")
					.param("writer", "타파하")
					)
				.andReturn().getModelAndView().getViewName();
		log.info(resultPage);
	}
 }
