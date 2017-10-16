package kr.co.mybatis.mem2.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.mybatis.mem2.dto.Mem2DTO;
import kr.co.mybatis.service.IMem2Service;

@Controller
public class Mem2Controller {
	
	private Logger logger = LoggerFactory.getLogger(Mem2Controller.class);
	
	@Autowired IMem2Service Mem2ServiceImpl = null;
	
	String pswChange = null;
	
	@RequestMapping(value="/idCheck", method=RequestMethod.GET)
	public void idCheck(){
		logger.debug("==> index");
	}
	
	
	@RequestMapping(value="/findId", method=RequestMethod.POST)
	public void findId(Model model, @RequestParam("name") String name, @RequestParam("email") String email){
		logger.debug("==> 이름, 이메일 {}, {}", name, email);
		
		Mem2DTO dto = new Mem2DTO();
		dto.setName(name);
		dto.setEmail(email);
		
		logger.debug("==> 디티오 이름, 이메일!! {}, {}", dto.getName(), dto.getEmail());
		Mem2DTO mem2Dto = Mem2ServiceImpl.view(dto);
		
		List<String> list = new ArrayList<String>();
		
		String id = mem2Dto.getId().substring(0, mem2Dto.getId().length()-2)+"**";
		list.add(id);
		
		
		logger.debug("==> 최종 리스트 {}", list);
		
		
		model.addAttribute("list", list);
		
	
	}
	
	@RequestMapping(value = "/findPsw", method = RequestMethod.POST)
	public void findPsw(Model model, @RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("email") String email){
		logger.debug("==> 파인드 해브러따 "+ id+ name+email);
		
		Mem2DTO dto = new Mem2DTO();
		dto.setId(id);
		dto.setName(name);
		dto.setEmail(email);
		
		Mem2DTO mem2Dto = Mem2ServiceImpl.viewPw(dto);
		
		
		
		model.addAttribute("mem2Dto", mem2Dto);
		
		
	}
	
	
	
	
	@RequestMapping(value = "/rePsw", method = RequestMethod.POST)
	public void rePsw(Model model, @RequestParam("answer") String answer){
		logger.debug("==> 파인드 해브러따 "+ answer);
		
		Mem2DTO dto = new Mem2DTO();
		dto.setAnswer(answer);
		
		Mem2DTO mem2Dto = Mem2ServiceImpl.viewAnser(dto);
		
		model.addAttribute("mem2Dto", mem2Dto);
		
		pswChange = mem2Dto.getId();
		logger.debug("==> 바꿀꺼야 "+ pswChange);
	}
	
	
	
	
	@RequestMapping(value = "/ChangePsw", method = RequestMethod.POST)
	public void ChangePsw(Model model, @RequestParam("psw1") String psw1){
		logger.debug("==>  바뀐 비밀번호"+ psw1 + pswChange);
		
		Mem2DTO dto = new Mem2DTO();
		dto.setPwd(psw1);
		dto.setId(pswChange);
		
		Integer checkNum = Mem2ServiceImpl.editPsw(dto);
		
		model.addAttribute("checkNum" ,	checkNum );
		
	}
	
	
	
	
	
	
}
