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
import org.springframework.web.multipart.MultipartFile;

import com.hyodong.kim.dao.ICookDao;
import com.hyodong.kim.dao.IMemberDao;
import com.hyodong.kim.dto.CookDto;
import com.hyodong.kim.dto.MemberDto;
import com.hyodong.kim.service.hyodongKimService;

@Controller
public class MyController {
	
	@Autowired 
	private IMemberDao memberDao;
	@Autowired
	private hyodongKimService service;
	@Autowired
	private ICookDao cookDao;
	@Autowired
	private FileUploadService fileUploadService;
	
	@RequestMapping("/")
	public String main(HttpServletRequest req, Model model) {
				
		
		return "main";
	}

	@RequestMapping("/admin/memberMange")
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
	
	@RequestMapping("/admin/cookManage")
	public String cookManage( HttpServletRequest req, Model model) {
		
		List<CookDto> list = cookDao.cookList();
		model.addAttribute("cookList", list);
		
		return "admin/cookManage";
	}
	
	@RequestMapping("/admin/write_cook")
	public String write_cook( @RequestParam("cook_Index") int cook_Index,
							  HttpServletRequest req, Model model){
		
		List<CookDto> list = cookDao.callCook(cook_Index);
		model.addAttribute("cookList", list);
		
		return "admin/write_cook";
	}
	
	@RequestMapping("/admin/write_cook1")
	public String write_cook1( HttpServletRequest req, Model model) {
	
		
		return "admin/write_cook1";
	}
	
	@RequestMapping("/admin/write_cook2")
	public String write_cook2(@RequestParam("cook_Index") int cook_Index,
							  HttpServletRequest req, Model model){
		
		List<CookDto> list = cookDao.callCook_Index(cook_Index);
		model.addAttribute("cookList", list);
		
		return "admin/write_cook2";
	}
	
	@RequestMapping(value="/addCook", method=RequestMethod.GET)
	public String addCook( 	
					        
					            @RequestParam("cook_Title") String cook_Title, 
					            @RequestParam("cook_Writer") String cook_Writer, 
					            @RequestParam("cook_Company") String cook_Company,
					            @RequestParam("cook_Image") String cook_Image,
					            @RequestParam("cook_Content") String cook_Content,
					            @RequestParam("cook_Introduce") String cook_Introduce,
					            @RequestParam("cook_Category") int cook_Category,
					            Model model ) throws Exception{
								
		
								cookDao.addCook(cook_Title, cook_Writer, cook_Company, cook_Image, cook_Content, cook_Introduce, cook_Category);
					            

								List<CookDto> list = cookDao.cookList();
								model.addAttribute("cookList", list);
								
		return "admin/cookManage";
				
		
	}

	@RequestMapping(value="/updateCook", method=RequestMethod.GET)
	public String updateCook( 
					          
								@RequestParam("cook_Index") int cook_Index,
								@RequestParam("cook_Title") String cook_Title, 
								@RequestParam("cook_Writer") String cook_Writer, 
								@RequestParam("cook_Company") String cook_Company,
								@RequestParam("cook_Image") MultipartFile  cook_Image,
								@RequestParam("cook_Content") String cook_Content,
								@RequestParam("cook_Introduce") String cook_Introduce,
								@RequestParam("cook_Category") int cook_Category,
								Model model ) throws Exception{
		
								String filename = fileUploadService.restore(cook_Image);
								
								cookDao.updateCook(cook_Index, cook_Title, cook_Writer, cook_Company, filename, cook_Content, cook_Introduce, cook_Category);
							    
								List<CookDto> list = cookDao.cookList();
								model.addAttribute("cookList", list);
								
		return "admin/cookManage";
						
	}
			
	@RequestMapping(value="/deleteCook", method=RequestMethod.GET)
	public String deleteCook( @RequestParam("cook_Index") int cook_Index, Model model ) throws Exception {
		
		cookDao.deleteCook(cook_Index);
		
		List<CookDto> list = cookDao.cookList();
		model.addAttribute("cookList", list);
							                     
	    return "admin/cookManage";
						
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(MemberDto memberDto, 
						@RequestParam("id") String id, 
						@RequestParam("password") String password,
						HttpServletRequest request, Model model ) throws Exception {
	
		memberDto = service.login(memberDto);
		
		if(memberDto != null ) {
			request.getSession().setAttribute("id",id);	    	   
			request.getSession().setAttribute("password",password);
			
			HttpSession session = request.getSession();
			
			session.getAttribute("id");
			session.getAttribute("password");
			
			return "user/login_ok";
		}
		else {
			
			return "user/login_fail";
		}
		
		
	}
	
	@RequestMapping("/user/login")
	public String login( HttpServletRequest req, Model model) {
				
		
		return "user/login";
	}
	
	@RequestMapping("/user/logout")
	public String logout_page( 
			 				   HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		session.invalidate();
		
		return "user/logout";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout( HttpServletRequest request, Model model) throws Exception {
		
		
		return "user/logout";  
	}
	
	@RequestMapping("/user/login_fail")
	public String login_fail( HttpServletRequest req, Model model) {
		
		return "user/login_fail";
	}
	
	@RequestMapping("/user/login_ok")
	public String login_ok( MemberDto memberDto,
			 				@RequestParam("id") String id,
			 				@RequestParam("password") String password,
							HttpServletRequest request, Model model) throws Exception {
		
		HttpSession session = request.getSession();
		
		session.setAttribute("id",id);
		session.setAttribute("password", password);
		
		
		return "user/login_ok";
	}
	
	@RequestMapping("/user/all_cook")
	public String all_cook( HttpServletRequest req, Model model) {
		
		return "user/all_cook";
	}
	
	@RequestMapping("/user/fast_cook")
	public String fast_cook( HttpServletRequest req, Model model) {
		
		return "user/fast_cook";
	}
	
	
}
