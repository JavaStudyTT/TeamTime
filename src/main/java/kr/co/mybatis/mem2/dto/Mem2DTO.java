package kr.co.mybatis.mem2.dto;

public class Mem2DTO {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String question;
	private String answer;
	
	public Mem2DTO() {

	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Mem2DTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", question=" + question
				+ ", answer=" + answer + "]";
	}
}
