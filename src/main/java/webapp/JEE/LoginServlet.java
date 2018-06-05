package webapp.JEE;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.getRequestDispatcher("/WEB-INF/views/LoginPage.jsp").forward(req, resp);

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//		String answer = req.getParameter("answer");
//		if(answer.equals("yes")){
		req.getRequestDispatcher("/WEB-INF/views/diary.jsp").forward(req, resp);
//		}else{
//		req.getRequestDispatcher("/WEB-INF/views/LoginPage.jsp").forward(req, resp);
//
//		}
	}


}