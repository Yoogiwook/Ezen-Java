package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset = utf-8"); // 한글이 들어갈경우 ; charset = utf-8 설정해줘야함
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>");
		out.println("Hello Servlet 유기욱 입니다");
		out.println("</h1></body></html>");
		
		out.close();
	}

}
