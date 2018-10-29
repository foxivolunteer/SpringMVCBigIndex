package com.jndi;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("dao")
public class EmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;
	private JdbcTemplate template;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		template = new JdbcTemplate(dataSource);
	}
	@Override
	public List<Employee> employeeList() {
		List<Employee> list = template.query("select * from user_table", new EmployeeMapper());
		return list;
	}

}
