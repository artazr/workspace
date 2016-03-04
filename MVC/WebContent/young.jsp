<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Young man</title>
</head>
<body>
<jsp:useBean id="person" scope="request" type="lab.mvc.model.Person" />

<h2> Hello Young Man</h2>
Prénom : <b><jsp:getProperty name="person" property="first" /></b><br />
Nom : <b><jsp:getProperty name="person" property="last" /></b><br />
Année de naissance : <b><jsp:getProperty name="person" property="birth" /></b><br />
Genre : <b><jsp:getProperty name="person" property="sex" /></b><br />


</body>
</html>