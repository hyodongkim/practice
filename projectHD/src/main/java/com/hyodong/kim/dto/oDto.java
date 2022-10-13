package com.hyodong.kim.dto;

import lombok.Data;

@Data
public class oDto {
		
		private String ooo;
		
		public oDto() {}

		public oDto(String ooo) {
			super();
			this.ooo = ooo;
		}

		public String getOoo() {
			return ooo;
		}

		public void setOoo(String ooo) {
			this.ooo = ooo;
		}
		

}
