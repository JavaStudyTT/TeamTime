package kr.co.mybatis.mem2.dao;

import kr.co.mybatis.mem2.dto.Mem2DTO;

public interface IMem2DAO {
	
	public Mem2DTO selectOne(Mem2DTO dto);
	public Mem2DTO selectOnePsw(Mem2DTO dto);
	public Mem2DTO selectOneAnswer(Mem2DTO dto);
	public Integer updatePsw(Mem2DTO dto);
}
