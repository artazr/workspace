<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>
      Ramdom number from 0 to 1000 : 
      <FONT COLOR="RED">
        <%= (int) (Math.random() * 1000) %>
      </FONT>
    </h3>
    <h4>Refresh the page to see if the number changes...</H4>
</body>
</html>