<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/pages/emp/emp_add.action" method="post">
	雇员编号:<input type="text" name="empno" id="empno" value="7369"><br>
	雇员姓名:<input type="text" name="ename" id="ename" value="SMITH"><br>
	雇佣日期:<input type="text" name="hiredate" id="hiredate" value="1980-10-10"><br>
	<input type="submit" value="提交">
</form>
</body>
</html>