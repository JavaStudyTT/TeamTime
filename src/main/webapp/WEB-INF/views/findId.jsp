<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"  pageEncoding="UTF-8"%>
<html>
<head>
	<title>Insert title</title>
		
</head>
<body>
	<h1>회원님의 ID는</h1>
	<h1>
		<c:forEach items="${list}" var = "list">
			${list} 입니다.
		</c:forEach>
	</h1>


</body>
</html>
