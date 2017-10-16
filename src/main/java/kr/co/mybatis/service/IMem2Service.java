package kr.co.mybatis.service;

import kr.co.mybatis.mem2.dto.Mem2DTO;

public interface IMem2Service {
	public Mem2DTO view(Mem2DTO mem2DTO);
	public Mem2DTO viewPw(Mem2DTO mem2DTO);
	public Mem2DTO viewAnser(Mem2DTO mem2DTO);
	public Integer editPsw(Mem2DTO mem2DTO);

}
