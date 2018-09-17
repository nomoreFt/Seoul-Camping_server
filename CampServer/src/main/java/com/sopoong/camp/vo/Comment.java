package com.sopoong.camp.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Comment {

	private int num;
	private String camp;
	private String id;
	private String name;
	private String text;
	private double star;
	private Date regdate;
	private String password;
}
