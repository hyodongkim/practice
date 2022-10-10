package com.hyodong.kim.dto;

import java.util.List;

import lombok.Data;

@Data
public class KIMDto {
	
	private int num;
	private String id;
	
	public KIMDto() {}
	
	public KIMDto(int num, String id) {
		super();
		this.num = num;
		this.id = id;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public List<KIMDto> dto(int num, String id) {
		
		this.num = num;
		this.id = id;
		
		return dto(1,"김효동");
		
	}

}
