package com.ezen.mybatis;

import java.util.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

public class MyBatisMain {
	public static void main(String[] args) {
		String resource = "com/ezen/mybatis/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session = sqlSessionFactory.openSession();
			System.out.println("sqlSessionFactory" + sqlSessionFactory);
			System.out.println("session : " + session + System.lineSeparator()
			);
			
			BoardMethod mapper = session.getMapper(BoardMethod.class);
			BoardVO vo = mapper.selectOne(1);
			System.out.println(vo.toString() + System.lineSeparator());
			
			List<BoardVO> list = mapper.selectAllMember();
			for(BoardVO vo2 : list) System.out.println(vo2.toString());
			System.out.println();
			
//			BoardVO vo3 = new BoardVO();
//			vo3.setId(7);
//			vo3.setName("홍길구");
//			vo3.setPhone("010-0101-1017");
//			vo3.setAddress("방방곡곡");
//			mapper.insertBoard(vo3);
//			session.commit();
			
//			mapper.deleteBoard(1);
//			session.commit();
			
			BoardVO vo4 = new BoardVO();
			vo4.setId(7);
			vo4.setName("홍길영");
			vo4.setPhone("010-0101-1016");
			vo4.setAddress("방방곡곡");
			mapper.updateBoard(vo4);
			session.commit();
			
			System.out.println(vo4.toString() + System.lineSeparator());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
