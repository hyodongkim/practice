package com.hyodong.kim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hyodong.kim.dao.IMemberDao;
import com.hyodong.kim.dto.MemberDto;

@Component
public class hyodongKimService {
	
	
	@Autowired
	private IMemberDao memberDao;
	
	public MemberDto login( MemberDto memberDto ) throws Exception{
	
		return memberDao.login(memberDto);
	}
	
	public int findId(String id, String password) throws Exception{
		
		return memberDao.findId(id, password);
	}

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
}