package com.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.service.AddRecordService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 * Servlet implementation class ValidationController
 */
public class ValidationController extends HttpServlet {
 private static final long serialVersionUID = 1L;
 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
 		protected void doGet(HttpServletRequest request, HttpServletResponse response)
		 				throws ServletException, IOException {
 			response.sendRedirect("index.jsp");
 		}

 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		 				throws ServletException, IOException { 	
	 String VID1 = request.getParameter("vid1"); 
	 String AGE1 = request.getParameter("age1");
	 int vid1 = Integer.parseInt(request.getParameter("vid1")); 
	 String vname1 = request.getParameter("vname1");
	 int age1 = Integer.parseInt(request.getParameter("age1")); 
	 
	 String VID2 = request.getParameter("vid2"); 
	 String AGE2 = request.getParameter("age2");
	 int vid2 = Integer.parseInt(request.getParameter("vid2")); 
	 String vname2 = request.getParameter("vname2");
	 int age2 = Integer.parseInt(request.getParameter("age2")); 
	 
	 String VID3 = request.getParameter("vid3"); 
	 String AGE3 = request.getParameter("age3");
	 int vid3 = Integer.parseInt(request.getParameter("vid3")); 
	 String vname3 = request.getParameter("vname3");
	 int age3 = Integer.parseInt(request.getParameter("age3")); 
	 
	 			if(!(VID1.equals(null)) && !(AGE1.equals(null))){
	            if((VID1.trim().length()!=3) || (age1<18)) {
	            	String message = "Bad job, Inavlid entries for Record 1";
		          	  System.out.println(message);
		          	  System.out.println("Enter valid Voter-ID and Age");
		          	  System.out.println( );
		          	  request.setAttribute("msg1", message);    
	            }
	             else {
	          	AddRecordService addService=new AddRecordService();
	          	if(addService.addRecords(vid1,vname1,age1)) {
	          		String message = "Record 1 inserted";
	          		System.out.println(message);
	          		System.out.println( );
	          		request.setAttribute("msg1", message);
	          	}	            	              
	           }
	 		}
	 			if(!(VID2.equals(null)) && !(AGE2.equals(null))){
		            if((VID2.trim().length()!=3) || (age2<18)) {
		            String message = "Bad job, Inavlid entries for Record 2";
		          	  System.out.println(message);
		          	  System.out.println("Enter valid Voter-ID and Age");
		          	  System.out.println( );
		          	  request.setAttribute("msg2", message);   
		            }
		             else {
		          	AddRecordService addService=new AddRecordService();
		          	if(addService.addRecords(vid1,vname1,age1)) {
		          		String message = "Record 2 inserted";
		          		System.out.println(message);
		          		System.out.println( );
		          		request.setAttribute("msg2", message);
		          	}          
		           }
		 		}
		 
	 			if(!(VID3.equals(null)) && !(AGE3.equals(null))){
		            if((VID3.trim().length()!=3) || (age3<18)) {
		            	String message = "Bad job, Inavlid entries for Record 3";
			          	  System.out.println(message);
			          	  System.out.println("Enter valid Voter-ID and Age");
			          	System.out.println( );
			          	  request.setAttribute("msg3", message);     
		            }
		             else {
		          	AddRecordService addService=new AddRecordService();
		          	if(addService.addRecords(vid1,vname1,age1)) {
		          		String message = "Record 3 inserted";
		          		System.out.println(message);
		          		System.out.println( );
		          		request.setAttribute("msg3", message);
		          	}	              
		           }
		 		}		 	 
	      String page="result.jsp";
	      request.getRequestDispatcher(page).include(request, response);
 	}
}
