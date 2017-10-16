package kr.co.mybatis.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mybatis.mem2.dao.IMem2DAO;
import kr.co.mybatis.mem2.dto.Mem2DTO;
import kr.co.mybatis.service.IMem2Service;

@Service
public class Mem2ServiceImpl implements IMem2Service {
	
	private Logger logger = LoggerFactory.getLogger(Mem2ServiceImpl.class);
	@Autowired IMem2DAO mem2DAO = null;
	
	
	@Override
	public Mem2DTO view(Mem2DTO mem2dto) {
		logger.debug("==>���� : {}", mem2dto);
		
		Mem2DTO list = mem2DAO.selectOne(mem2dto);
		
		return list;
	}


	@Override
	public Mem2DTO viewPw(Mem2DTO mem2dto) {
		logger.debug("==>��й�ȣ ���� : " + mem2dto);
		
		Mem2DTO list = mem2DAO.selectOnePsw(mem2dto);
		
		return list;
	}


	@Override
	public Mem2DTO viewAnser(Mem2DTO mem2dto) {
		logger.debug("==>야메뗗 " + mem2dto);
		
		Mem2DTO list = mem2DAO.selectOneAnswer(mem2dto);
		
		return list;
	}


	
	@Override
	public Integer editPsw(Mem2DTO mem2dto) {
		logger.debug("바뀐 비밀번호 서비스 ==> : " + mem2dto);
		
		Integer checkNum = mem2DAO.updatePsw(mem2dto);
		
		return checkNum;
	}

}
