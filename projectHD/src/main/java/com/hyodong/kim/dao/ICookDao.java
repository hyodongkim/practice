package com.hyodong.kim.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.hyodong.kim.dto.CookDto;

@Mapper
public interface ICookDao {
	
	public List<CookDto> cookList();
	public List<CookDto> callCook(int cook_Index);
	
	public int addCook(String cook_Title, String cook_Writer, String cook_Company, String cook_Image,
			String cook_Content, String cook_Introduce, int cook_Category);
 
    public int updateCook( int cook_Index, String cook_Title, String cook_Writer, String cook_Company, String cook_Image,
			String cook_Content, String cook_Introduce, int cook_Category);

    public int deleteCook( int cook_Index );
    
    public List<CookDto> callCook_Index(int cook_Index);
}