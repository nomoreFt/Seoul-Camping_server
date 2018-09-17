package com.sopoong.camp.mapper;

import java.util.List;

import com.sopoong.camp.vo.Comment;

public interface CampMapper {

	List<Comment> listComment(String camp);

	int addComment(Comment cm);
	
	int delComment(Comment cm);

}
