package com.sri.patterns.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher {

	public void dispatch(HttpServletRequest request, HttpServletResponse response, String view) {
		if (view != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(mapToView(view));
			try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
	}

	private String mapToView(String view) {
		if (view.equals("showStudentDetails")) {
			return "viewStudentDetails.jsp";
		}
		return null;
	}
}
