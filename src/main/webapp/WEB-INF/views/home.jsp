<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js">
</script>
<script>
//test
//라디오 버튼 체크시 div on/off
$(function(){
	$("#find_phone").click(function(){
		$(".find_area_phone").show();
		$(".find_area_mail").hide();
	});
	
		
	
	
	$("#find_mail").click(function(){
		$(".find_area_phone").hide();
		$(".find_area_mail").show();
	});
	
////////////////////////////////////////////////////////////////////////////////////	
// 아이디 찾기/비밀번호 찾기 버튼 클릭시 div on/off	
	$("#id_tab").click(function(){
		$(".id_info").show();
		$(".pw_info").hide();
	});
	
		
	
	
	$("#pw_tab").click(function(){
		$(".id_info").hide();
		$(".pw_info").show();
	});
	
////////////////////////////////////////////////////////////////////////////////////
//아이디 찾기/비밀번호 찾기 버튼 클릭시 div on/off	
	$("#find_phone_pw").click(function(){
		$(".find_area_phone_pw").show();
		$(".find_area_mail_pw").hide();
	});
	
		
	
	
	$("#find_mail_pw").click(function(){
		$(".find_area_phone_pw").hide();
		$(".find_area_mail_pw").show();
	});
	
	
//////////////////////////////////////////////////////////////////
//id tab 과 pw tab 클릭시 나타나는 효과
	$("#id_tab").click(function(){
		$("#id_tab").css({"border-left":"solid 2px gold", "border-top":"solid 2px gold", "border-bottom":"solid 2px white"});
		$("#pw_tab").css({"border-bottom":"solid 2px gold", "border-top":"solid 2px #dcdcdc", "border-right":"solid 2px #dcdcdc"})
	});
	
	
	
	$("#pw_tab").click(function(){
		$("#id_tab").css({"border-bottom":"solid 2px gold","border-left":"solid 2px #dcdcdc", "border-top":"solid 2px #dcdcdc"});
		$("#pw_tab").css({"border-top":"solid 2px gold", "border-right":" solid 2px gold","border-bottom":"solid 2px white"});
	});
	
	
});


</script>
<style>
	div.pw_info {
		display:none;
	}

	
	h3.find_title {
		font-size: 25px;	
	}
	
	div.left_tab {
		float: left;
		width: 48.8%;
		height:40px;
		border-left: solid 2px gold;
		border-top: solid 2px gold;
		border-right: solid 2px gold;
	}
	
	div.right_tab {
		float: left;
		width: 49.61%;
		height:40px;
		border-bottom: solid 2px gold;
		
	}
	
	div.tab span {
		text-align: center;
		color: black;
		font-size: 25px;
		color: orange;
	}
	
	a {
		text-decoration:none;
		
	}
	div.find_id_page {
		width:565px;
		margin: 0 auto;
	}
	
	input.name_input {
		width:80%;
		height:40px;
	}
	
	input.phone_input{
		width:80%;
		height:40px;
	}
	
	input.cert_input{
		width:80%;
		height:40px;
	}
	
	span.next_btn {
		text-align: center;
		border: solid 1px orange;
		blackground-color: orange;
		font-size: 30px;
	}	
	
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>아이디 / 비밀번호 찾기</title>
</head>
<body>
<div class = "find_id_page">
	<h3 class = "find_title">아이디 / 비밀번호 찾기</h3>
		
			
			<div class = "left_tab" id="id_tab">
			<center>	
			<a href ="#" class = "find_tab_left" role ="botton">
			<span style ="font-size: 25px;">아이디 찾기</span>			
			</a>
			</center>
			</div>
			
			<div class = "right_tab" id="pw_tab">
			<center>
			<a href = "#" class = "find_tab_right" role ="botton">
			<span style = "font-size: 25px;">비밀번호 찾기</span>
			</a>
			</center>
			</div>
		<br>
		<br>


		<div class=id_info>
			<form action="#" method="post">
				<div>
					<p style="font-size: 11px"></p>
				</div>

				<br>

				<div class="find_area_phone">
					<div class="name_input">
						<input class="name_input" type="text" name="irum" placeholder="이름을 입력하세요">
					</div>
					<br>
					<div class="phone_input">
						<input class="phone_input" type="text" name="email" placeholder="이메일을 입력하세요">
					</div>
					<br>

				</div>
				<!-- --------------------------------------------------------------------------------------------- -->

				<br>
				<div>
					<p style="font-size: 11px">가입당시 입력한 이름과, 이메일을 통해 아이디를 찾을수 있습니다</p>
				</div>
				<br>

				<div class="find_foot" style="border-top: solid 0.5px black;">
					<div style="margin: 0 auto; width: 150px;">
						<a class="find_footer_btn" role="botton" id="btn_find" style="cursor: pointer">
							<button style="width: 150px; height: 50px; background-color: orange; border: solid 0.5px black;">아이디 찾기</button>
						</a>
					</div>
				</div>
			</form>
		</div>
		<!-- --------------------------비밀번호----------------------------------	 -->
		<div class = "pw_info">
			<form action = "#" method = "post">
				
		
		
		
		<br>
		
		<div class = "find_area_phone_pw">
			<div class = "name_input" ><input class = "name_input" type ="text" name = "irum" placeholder="아이디를 입력하세요"> </div>
			<br>
			<div class = "name_input"><input class = "name_input" type ="text" name = "irum" placeholder="이름을 입력하세요"> </div>
			<br>
			<div class = "phone_input"><input class = "phone_input" type = "text" name="phone" placeholder="핸드폰번호를 입력하세요"></div>
			<br>
			<div class = "cert_input"><input class = "cert_input" type = "text" name="cert" placeholder="인증번호를 입력하세요"></div>
		</div>
		<!-- --------------------------------------------------------------------------------------------- -->

		
				<div class = "find_foot" style="border-top: solid 0.5px black;">
					<p style="font-size:15px;">본인 인증시 제공되는 정보는 인증 이외의 용도로 이용 또는 저장하지 않습니다</p>
					
					<div style = "margin: 0 auto; width: 150px;">
					<a class = "find_footer_btn" role = "botton" id = "btn_find" style = "cursor:pointer">
					<button style ="width:150px; height:50px; background-color: orange; border:solid 0.5px black;">다음</button>
					</a>
					</div>
				</div>
			</form>
		</div>
	
	</div>
		

</body>
</html>
