package com.hyodong.kim;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hyodong.kim.dao.IMemberDao;
import com.hyodong.kim.dto.MemberDto;
import com.hyodong.kim.service.hyodongKimService;

@Controller
public class MyController {
	
	@Autowired 
	private IMemberDao memberDao;
	@Autowired
	private hyodongKimService service;

	@RequestMapping("/")
	public String memberlist( HttpServletRequest req, Model model ) {
		
		List<MemberDto> list = memberDao.memberlist();
		model.addAttribute("memberlist",list);
		
		return "admin/memberManage";
	}
	

	@RequestMapping("/admin/write_member")
	public String member(		@RequestParam("num") int num,
								HttpServletRequest req, Model model) {
		
		model.addAttribute("callmember",memberDao.callmember(num));
		
		return "admin/write_member";
	}
	

	@RequestMapping("/admin/write_member1")
	public String member1(HttpServletRequest req, Model model) {
				
		
		return "admin/write_member1";
	}

	@RequestMapping("/admin/write_member2")
	public String member2(		@RequestParam("num") int num,
								HttpServletRequest req, Model model) {
		
		model.addAttribute("callmember",memberDao.callmember(num));
		
		return "admin/write_member2";
	}
			
	@RequestMapping(value="/addMember_findnum", method=RequestMethod.GET)
	public String addMembe_findnum( 	
					        	@RequestParam("id") String id,
					            @RequestParam("password") String password, 
					            @RequestParam("name") String name, 
					            @RequestParam("birthday_year") int birthday_year,
					            @RequestParam("birthday_month") int birthday_month,
					            @RequestParam("sex") int sex,
					            @RequestParam("email") String email,
					            @RequestParam("phone") String phone,
					            @RequestParam("ticket") int ticket,
					            @RequestParam("auth") int auth,
					              
					       Model model ) throws Exception{
				
				           memberDao.addMember_findnum(id, password, name, birthday_year, birthday_month,
						           sex, email, phone, ticket, auth);
				                   
				           List<MemberDto> list = memberDao.memberlist();
				           model.addAttribute("memberlist",list);
					                     
		return "admin/memberManage";
				
		
	}
			
	@RequestMapping(value="/addMember", method=RequestMethod.GET)
	public String addMember( 	
					        	@RequestParam("id") String id,
					            @RequestParam("password") String password, 
					            @RequestParam("name") String name, 
					            @RequestParam("birthday_year") int birthday_year,
					            @RequestParam("birthday_month") int birthday_month,
					            @RequestParam("sex") int sex,
					            @RequestParam("email") String email,
					            @RequestParam("phone") String phone,
					            @RequestParam("ticket") int ticket,
					            @RequestParam("auth") int auth,
					              
					       Model model ) throws Exception{
				
				           memberDao.addMember(id, password, name, birthday_year, birthday_month,
				           sex, email, phone, ticket, auth);
				                   
				           List<MemberDto> list = memberDao.memberlist();
				           model.addAttribute("memberlist",list);
					                     
		return "admin/memberManage";
				
		
	}

	@RequestMapping(value="/updateMember", method=RequestMethod.GET)
	public String updateMember( 
					          
					   		   @RequestParam("num") int num,
					   		   @RequestParam("id") String id,
					   		   @RequestParam("password") String password, 
					   		   @RequestParam("name") String name, 
					   		   @RequestParam("birthday_year") int birthday_year,
					   		   @RequestParam("birthday_month") int birthday_month,
					   		   @RequestParam("sex") int sex,
					   		   @RequestParam("email") String email,
					   		   @RequestParam("phone") String phone,
					   		   @RequestParam("ticket") int ticket,
					   		   @RequestParam("auth") int auth, Model model) throws Exception{
				
						  memberDao.updateMember(num, id, password, name, birthday_year, birthday_month,
                		  sex, email, phone, ticket, auth);
				
						  List<MemberDto> list = memberDao.memberlist();
						  model.addAttribute("memberlist",list);
							                     
		return "admin/memberManage";
						
	}
			
	@RequestMapping(value="/deleteMember", method=RequestMethod.GET)
	public String deleteMember( @RequestParam("num") int num, Model model ) throws Exception {
				
		memberDao.deleteMember(num);
		
		List<MemberDto> list = memberDao.memberlist();
		model.addAttribute("memberlist",list);
			
							                     
	    return "admin/memberManage";
						
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(MemberDto memberDto, HttpSession session, HttpServletRequest request, Model model ) throws Exception {
				
//	   int result = service.login(id, password);
//       
//       if( result == 1) {
//    	   
//    	   request.getSession().setAttribute("alert", "로그인되었습니다.");
//    	   request.getSession().setAttribute("id",id);
//    	   request.getSession().setAttribute("password",password);
//       	   System.out.println("관리자 로그인 성공");
//       	   
//              return "user/login_ok";
//
//       } else {
//    		 
//    	   request.getSession().setAttribute("id",id);
//    	   request.getSession().setAttribute("password", password);
//       	   System.out.println("관리자 로그인 실패");
//       	   
//           	 return "user/login_fail";
//            	 
//       }
//						
//	}
	
		memberDto = service.login(memberDto);
		
		if(memberDto != null ) {
			
			return "user/login_ok";
		}
		else {
			
			return "user/login_fail";
		}
		
		
	}
		
	
	@RequestMapping("/user/login")
	public String login(HttpServletRequest req, Model model) {
				
		
		return "user/login";
	}
	
	@RequestMapping("/user/main")
	public String main(HttpServletRequest req, Model model) {
				
		
		return "user/main";
	}
	
	@RequestMapping("/user/login_fail")
	public String login_fail(HttpServletRequest req, Model model) {
				
		
		return "user/login_fail";
	}
	
	@RequestMapping("/user/login_ok")
	public String login_ok(HttpServletRequest req, Model model) {
				
		
		return "user/login_ok";
	}
	
	
}
