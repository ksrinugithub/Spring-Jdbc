package com.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.bean.Emp;

public class EmpDao {
	JdbcTemplate template;

	public void setJdbc(JdbcTemplate jdbc) {
		this.template = template;
	}

	public int save(Emp p) {
		String sql = "insert into Emp99(name,salary,designation) values('" + p.getName() + "'," + p.getSalary() + ",'"
				+ p.getDesignation() + "')";
		return template.update(sql);
	}
}
