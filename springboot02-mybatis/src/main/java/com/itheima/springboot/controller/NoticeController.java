package com.itheima.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.springboot.domain.Notice;
import com.itheima.springboot.service.NoticeService;

@Controller
public class NoticeController {
//	注入NoticeService
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Notice> findAll(){
		return noticeService.findAll();
	}
	
	@RequestMapping("/show")
	public String show(){
		return "/html/notice.html";
	}
	
	/**
	 * 分页查询
	 * @return
	 */
	@PostMapping("/findByPage")
	@ResponseBody
	public Map<String, Object> findByPage(@RequestParam("page")Integer page,@RequestParam("rows")Integer rows){
		
		return noticeService.findByPage(page, rows);
	}
}
