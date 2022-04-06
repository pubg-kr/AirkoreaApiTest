package com.example.openapitest.control;

import java.io.IOException;
import java.sql.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.openapitest.model.AirKoreaOpenApiAgent;
import com.example.openapitest.model.AlarmInfo;
import com.example.openapitest.model.AlarmInfoParams;

/**
 * Servlet implementation class OpenApiTestController
 */
@WebServlet("/openapitest")
public class OpenApiTestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OpenApiTestController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// step #1. get request parameters
		request.setCharacterEncoding("UTF-8");
		
		int op = 1;
		int pageNo = 1;
		String paramStr = request.getParameter("op");
		
		if(paramStr != null) {
			op = Integer.parseInt(paramStr);
		}
		paramStr = request.getParameter("pageNo");
		if(paramStr != null) {
			pageNo = Integer.parseInt(paramStr);
		}
		// step #2. data processing
		AirKoreaOpenApiAgent agent = new AirKoreaOpenApiAgent();
		
		String viewName = null;
		AlarmInfo alarmInfo = null;
		if(op == 1) {
			AlarmInfoParams params = new AlarmInfoParams();
			params.setPageNo(pageNo);
			params.setNumOfRows(10);
			params.setYear(2020);
			
			alarmInfo = agent.getDustAlarmInfo(params);
			
			request.setAttribute("alarmparams", params);
			request.setAttribute("alarminfo", alarmInfo);
			
			viewName = "displayAlarmInfo.jsp";
		}
		// step #3. output processing result
		if(viewName == null) {
			viewName = "errors.jsp";
		}
		
		RequestDispatcher view = request.getRequestDispatcher(viewName);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
