package com.hyodong.kim.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hyodong.kim.dto.MemberDto;

@Mapper
public interface IMemberDao {
	
    public List<MemberDto> memberlist();
    public List<MemberDto> callmember(int num);
    public int addMember_findnum(int num);
    
    public int addMember(int num, String id, String password, String name,
			int birthday_year, int birthday_month, int sex, 
			String email, String phone, int ticket, int auth);
 
    public int updateMember( int num, String id, String password, String name, 
		  					int birthday_year, int birthday_month, int sex, 
		  					String email, String phone, int ticket, int auth);

    public int deleteMember( int num );
    
 
    
    
    
    
    
    
		
}