<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>${echoMsg}</h1>
<form action="${pageContext.request.contextPath}/echo.action" method="post">
	请输入信息:<input type="text" name="msg" id="msg">
	<input type="submit" value="提交">
</form>
</body>
</html>