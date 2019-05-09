<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--webパッケージのEmpBeanクラスを使うよって定義 --%>
    <jsp:useBean id="emp" scope="request" class="web.EmpBean"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>炒った豆</title>
</head>
<body>
<h1>UseBean</h1>
<table border="1">

<tr>
<td>Name</td>
  <%--リクエストオブジェクトに格納されている
    beanの中のプロパティー名がnameの値を取得している
   --%>
<td><jsp:getProperty name="emp" property="name"/></td>
</tr>
<tr>
<td>Age</td>
<td><jsp:getProperty name="emp" property="age"/></td>
</tr>

</table>
</body>
</html>