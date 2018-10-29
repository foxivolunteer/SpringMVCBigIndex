package com.jndi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee(rs.getInt("user_id"), rs.getString("user_email"), rs.getString("user_name"));
		return emp;
	}

}
