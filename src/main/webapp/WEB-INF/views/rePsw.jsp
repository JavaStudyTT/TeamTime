<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"  pageEncoding="UTF-8"%>
<html>
<head>
	<title>비밀번호 재설정</title>
</head>
	<script type="text/javascript">
	function getCheckPassWord(psw1, psw2){
		   if(psw1.value != psw2.value){
		      alert("입력하신 비밀번호와 비밀번호확인이 일치하지 않습니다");
		      psw1.value="";
		      psw2.value="";
		      psw1.focus();
		      return false;
		   }else{
		      return true;
		      
		   }
		}

		 </script>



		</head>
		<body>
		   <form action="/mybatis/ChangePsw" method="post" onsubmit="return getCheckPassWord(psw1,psw2);">
		      <h1>비밀번호 : <input type="password" name="psw1"></h1>
		      <h1>비밀번호 확인 : <input type="password" name="psw2"></h1>
		      <input type="submit" id = "B1" value="비밀번호 바꾸기" >
		   </form>


</body>
</html>
