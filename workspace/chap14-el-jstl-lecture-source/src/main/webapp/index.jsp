<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1 align="center">jsp action tag</h1>
   
   <h3><a href="Views/action/testAction.jsp">jsp action tag 테스트</a></h3>
   
   <h2>EL test</h2>
   <h3><a href="test1">request.getAttribute() 테스트</a></h3>
   <h3><a href="test2">request에 저장된 객체 출력 테스트</a></h3>
   <h3><a href="views/el/testEl3.jsp?name=galaxy&price=95&no=5&no=6&option=삼성">parameter로 값</a></h3>
   <h4><a href="test4">requestScope와 sessionScope 테스트</a></h4>
   
   <h2>JSTL test</h2>
   <h3><a href="views/jstl/testjstlCore.jsp">Core library test</a></h3>
   
</body>
</html>