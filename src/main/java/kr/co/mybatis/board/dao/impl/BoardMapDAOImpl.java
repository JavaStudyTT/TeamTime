package kr.co.mybatis.board.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import kr.co.mybatis.board.dao.IBoardMapDAO;
import kr.co.mybatis.board.dto.BoardMapDTO;

@Repository
public class BoardMapDAOImpl extends SqlSessionDaoSupport implements IBoardMapDAO {
	public void insertData(BoardMapDTO boardMapDto){
		getSqlSession().insert("BoardMap.insertData", boardMapDto);
	}
}
