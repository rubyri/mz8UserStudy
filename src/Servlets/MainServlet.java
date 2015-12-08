package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import video.Video;
import video.VideoDAO;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MainServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String param = request.getParameter("radios");
	    
		if(param != null) {
            if(param.equals("radio1")) {
                out.println("Radio button 1 was selected.");
            }
            else {
            	out.println("Radio button 1 was not selected.");
            }
            if(param.equals("radio2")) {
            	out.println("Radio button 2 was selected.");
            }
            else {
            	out.println("Radio button 2 was not selected.");
            }
            if(param.equals("radio3")) {
            	out.println("Radio button 3 was selected.");
            }
            else {
            	out.println("Radio button 3 was not selected.");
            }
        }
		
    
	}

}
