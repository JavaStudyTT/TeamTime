<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"  pageEncoding="UTF-8"%>
<html>
<head>
	<title>Insert title</title>
</head>
<body>
	<h1>회원님의 PW는</h1>
	<h1>
	${mem2Dto.question}
	</h1>
	<form action="/mybatis/rePsw" method="post">
		<input type="text" name="answer">
		<input type="submit" value="전송">
	</form>


</body>
</html>
