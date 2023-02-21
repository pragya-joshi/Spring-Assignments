package com.springmvcProject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvcProject.model.Empl;

public class RowMapperImpl implements RowMapper<Empl> {

	public Empl mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
	
		Empl emp=new Empl();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getFloat(3));
		emp.setDesignation(rs.getString(4));
		return emp;
	}

}