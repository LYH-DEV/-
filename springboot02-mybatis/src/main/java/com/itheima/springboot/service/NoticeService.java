package com.itheima.springboot.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.itheima.springboot.domain.Notice;

public interface NoticeService {
	
	/**
	 * 查询所有
	 * @return
	 */
	List<Notice> findAll();
	
	/**
	 * 分页查询
	 * @param page
	 * @param rows
	 * @return
	 */
	Map<String, Object> findByPage(Integer page,Integer rows);
}
