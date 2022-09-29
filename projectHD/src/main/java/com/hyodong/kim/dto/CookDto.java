package com.hyodong.kim.dto;

import lombok.Data;

@Data
public class CookDto {
	
	private int cook_Index;
	private String cook_Title;           
	private String cook_Writer;          
	private String cook_Company;          
	private String cook_Image;            
	private String cook_Content;          
	private String cook_Introduce;        
	private int cook_Category;
	
	public CookDto() {}
	
	public CookDto(int cook_Index, String cook_Title, String cook_Writer, String cook_Company, String cook_Image,
					String cook_Content, String cook_Introduce, int cook_Category) {
		super();
		this.cook_Index = cook_Index;
		this.cook_Title = cook_Title;
		this.cook_Writer = cook_Writer;
		this.cook_Company = cook_Company;
		this.cook_Image = cook_Image;
		this.cook_Content = cook_Content;
		this.cook_Introduce = cook_Introduce;
		this.cook_Category = cook_Category;
	}


	public int getCook_Index() {
		return cook_Index;
	}


	public void setCook_Index(int cook_Index) {
		this.cook_Index = cook_Index;
	}


	public String getCook_Title() {
		return cook_Title;
	}


	public void setCook_Title(String cook_Title) {
		this.cook_Title = cook_Title;
	}


	public String getCook_Writer() {
		return cook_Writer;
	}


	public void setCook_Writer(String cook_Writer) {
		this.cook_Writer = cook_Writer;
	}


	public String getCook_Company() {
		return cook_Company;
	}


	public void setCook_Company(String cook_Company) {
		this.cook_Company = cook_Company;
	}


	public String getCook_Image() {
		return cook_Image;
	}


	public void setCook_Image(String cook_Image) {
		this.cook_Image = cook_Image;
	}


	public String getCook_Content() {
		return cook_Content;
	}


	public void setCook_Content(String cook_Content) {
		this.cook_Content = cook_Content;
	}


	public String getCook_Introduce() {
		return cook_Introduce;
	}


	public void setCook_Introduce(String cook_Introduce) {
		this.cook_Introduce = cook_Introduce;
	}


	public int getCook_Category() {
		return cook_Category;
	}


	public void setCook_Category(int cook_Category) {
		this.cook_Category = cook_Category;
	} 


	
	

}
