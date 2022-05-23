package practice01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet("/NameCalc")
public class NameCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		String name = request.getParameter("name");
		
		try {
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			
			int addition = num1 + num2;
			int subtraction = num1 - num2;
			int multiplication = num1 * num2;
			int division = num1 / num2;
			
			PrintWriter out = response.getWriter();
			
			out.println("name : " + name + "<br><br>");
			out.println(num1 + " + " + num2 + " = " + addition + "<br>");
			out.println(num1 + " - " + num2 + " = " + subtraction + "<br>");
			out.println(num1 + " × " + num2 + " = " + multiplication + "<br>");
			out.println(num1 + " ÷ " + num2 + " = " + division + "<br>");
		} catch(Exception e) {
			PrintWriter out = response.getWriter();
			out.println("다시 입력해주시기 바랍니다.<br><h3><a href=\"NameCalcJ.jsp\">뒤로가기</a></h3>");
		}
	}
}
