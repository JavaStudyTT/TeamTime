package kr.co.mybatis.mem2.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import kr.co.mybatis.mem2.dao.IMem2DAO;
import kr.co.mybatis.mem2.dto.Mem2DTO;

@Repository
public class Mem2DAO extends SqlSessionDaoSupport implements IMem2DAO {
	
	private Logger logger = LoggerFactory.getLogger(Mem2DAO.class);
	
	@Override
	public Mem2DTO selectOne(Mem2DTO dto) {
		logger.debug("==> ���̿� {}", dto);
		return getSqlSession().selectOne("Mem2Map.selectOne", dto);
	}

	@Override
	public Mem2DTO selectOnePsw(Mem2DTO dto) {
		logger.debug("==> ���̿� ����Ʈ �н��͵�" + dto);
		
		
		return getSqlSession().selectOne("Mem2Map.selectOnePsw", dto);
	}

	@Override
	public Mem2DTO selectOneAnswer(Mem2DTO dto) {
		logger.debug("아잉몰라 ==>"+ dto);
		
		return getSqlSession().selectOne("Mem2Map.selectOneAnswer", dto);
		
	}

	
	@Override
	public  Integer updatePsw(Mem2DTO dto) {
		logger.debug("디에이오 패스워드 변경==>" + dto);
		
		return getSqlSession().update("Mem2Map.updatePsw",dto);
		
		
	}

}
