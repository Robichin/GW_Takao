<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>転送されたよ</title>
</head>
<body>
<h1>ごちそうさまです。</h1>

sessionで送られたnameは「<%= session.getAttribute("name") %>」
requestで送られたageは「<%= request.getAttribute("age") %>」
</body>
</html>