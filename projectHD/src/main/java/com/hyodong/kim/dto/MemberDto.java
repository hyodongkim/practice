package com.hyodong.kim.dto;

import lombok.Data;

	@Data
	public class MemberDto {
		private int num;
		private String id;
		private String password;
		private String name;
		private int birthday_year;
		private int birthday_month;
		private int sex;
		private String email;
		private String phone;
		private int ticket;
		private int auth;
		
		public MemberDto() {}
		
		public MemberDto(int num, String id, String password, String name, int birthday_year, int birthday_month,
				int sex, String email, String phone, int ticket, int auth) {
			super();
			this.num = num;
			this.id = id;
			this.password = password;
			this.name = name;
			this.birthday_year = birthday_year;
			this.birthday_month = birthday_month;
			this.sex = sex;
			this.email = email;
			this.phone = phone;
			this.ticket = ticket;
			this.auth = auth;
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



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public int getBirthday_year() {
			return birthday_year;
		}



		public void setBirthday_year(int birthday_year) {
			this.birthday_year = birthday_year;
		}



		public int getBirthday_month() {
			return birthday_month;
		}



		public void setBirthday_month(int birthday_month) {
			this.birthday_month = birthday_month;
		}



		public int getSex() {
			return sex;
		}



		public void setSex(int sex) {
			this.sex = sex;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public String getPhone() {
			return phone;
		}



		public void setPhone(String phone) {
			this.phone = phone;
		}



		public int getTicket() {
			return ticket;
		}



		public void setTicket(int ticket) {
			this.ticket = ticket;
		}



		public int getAuth() {
			return auth;
		}



		public void setAuth(int auth) {
			this.auth = auth;
		}
		
		
		
		
		
	}

