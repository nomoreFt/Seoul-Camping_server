package com.sopoong.camp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sopoong.camp.dao.CommentDao;
import com.sopoong.camp.vo.Comment;


@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	CommentDao commentDao;
	
	@RequestMapping(value = "/listAll",method=RequestMethod.GET, produces="application/json;charset=UTF-8")
	public List<Comment> listComment(@RequestParam String camp){
		
		return commentDao.listComment(camp);
	}

	
	@RequestMapping(value = "/addList",method=RequestMethod.POST, produces="application/json;charset=UTF-8")
	public int addComment(@RequestBody Comment cm){
		return commentDao.addComment(cm);
	}

	
	@RequestMapping(value = "/delList",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public int delComment(@RequestBody Comment cm) {
		return commentDao.delComment(cm);
	}
}
