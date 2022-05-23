package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/He") //접근하고자 하는 주소명에 반영됨.
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		아래에서 인코딩 형식을 잘 설정해주지 않으면, 한글이 아주 외계어가 됨.
		response.setContentType("text/html; charset = utf-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body><h1>");
		out.print("10Hellium헬륨10");
		out.print("</h1></body></html>");
	}

}
