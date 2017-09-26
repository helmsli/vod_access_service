package com.company.course.domain;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {
	private String title;
	/**
	 * 初级，中级，高级
	 */
	private String difficultyLevel;
	/**
	 * 标签
	 */
	private String tag;
	/**
	 * 学习人数
	 */
	private int studyPerson;
	
	/**
	 *课程时长(秒) 
	 */
	private int durationSeconds;
	/**
	 * 综合评分
	 */
	private float totalScore;
	/**
	 * 
	 */
	private String vodeoId;
	
	/**
	 * 课程分类，以 \ 分割
	 */
	private String catrgory;
	
	/**
	 * 发布者
	 */
	private String owner;
	/**
	 * 
	 */
	private Date createTime;
	
	
}
