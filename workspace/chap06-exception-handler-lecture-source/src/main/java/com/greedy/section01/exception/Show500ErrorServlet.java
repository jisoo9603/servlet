package com.greedy.section01.exception;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Show500Error")
public class Show500ErrorServlet extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      response.sendError(500, "500번 에러는 누구 잘못?? 강사님!! 강사님은 누구??? 김진호강사님!!");
   }

   
}