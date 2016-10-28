package com.allwinn;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;






public class AnocationMVCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private HanderMapping handermapping;
    
    @Override
	public void init() throws ServletException {
    	handermapping=  new HanderMapping(new OperationalObject());
    	
    	
	}

	public AnocationMVCServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstrequestmapping=null;
		String[]b=null;
		HashMap<String,Object> hashMap = new HashMap<String,Object>();
	 String servletPath = request.getServletPath();
		if(servletPath!=null){
		String substring = servletPath.substring(1);
		b=substring.split("/");	
		
		Class handeler = handermapping.gethandeler(b[0]);
		
		if(handeler!=null){
		Method method = handermapping.getmethod(b[1]);
		if(method!=null){
			try {
				method.invoke(handeler.newInstance(), null);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
		}
		
		
		
		
		}
		
	
	
	
	
	
	
	}
		

	
	public static void main(String[]args){
		
		
		String a ="/banner/insert/abc";
		 a=a.substring(1);
		 String[]b=a.split("/");
		//String replaceAll = a.replaceAll("/", ".");
		System.out.println(a.lastIndexOf("/")); 
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
	}
	
	
	
	
	
	
	
	
}
