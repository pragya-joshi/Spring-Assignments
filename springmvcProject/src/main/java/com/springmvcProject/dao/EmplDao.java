package com.springmvcProject.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.springmvcProject.model.Empl;

public class EmplDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public int save(Empl e) {
		String query="insert into empl (id,name,salary,designation) values(?,?,?,?)";
		int r=this.jdbcTemplate.update(query,e.getId(),e.getName(),e.getSalary(),e.getDesignation());
		
		return r;
		
	}
	
	public int update(Empl e) {
		String query="update empl set name=?, salary=? ,designation=? where id=?";
		int r=this.jdbcTemplate.update(query,e.getName(),e.getSalary(),e.getDesignation(),e.getId());
		
		return r;
		
	}
	
	public int delete(int id) {
		Empl emp=getEmp(id);
		String query="delete from empl where id=?";
		int r=this.jdbcTemplate.update(query,emp.getId());
		
		return r;
	}
	
	public Empl getEmp(int id) {
		String query="select * from empl where id=?";
		RowMapper<Empl>rowMapper=new RowMapperImpl();
		Empl emp=this.jdbcTemplate.queryForObject(query, rowMapper,id);
		return emp;
		
	}
	
	public List<Empl> getEmployees(){
		String query="select * from empl";
		RowMapper<Empl>rowMapper=new RowMapperImpl();
		List<Empl> emp= this.jdbcTemplate.query(query, rowMapper);
		return emp;
	}
}
