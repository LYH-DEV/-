package com.itheima.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.springboot.domain.Notice;
import com.itheima.springboot.mapper.NoticeMapper;
import com.itheima.springboot.service.NoticeService;
@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {
	
//	注入NoticeMapper
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}

	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		Map<String, Object> map = new HashMap<String,Object>();
		Long total = noticeMapper.count();
		map.put("total", total);
		List<Notice> notices = noticeMapper.findByPage(page, rows);
		map.put("rows", notices);
		return map;
	}

}
