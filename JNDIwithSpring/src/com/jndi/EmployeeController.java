package com.jndi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAOImpl myDao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showEmployee(ModelMap model) {
		List<Employee> myList = myDao.employeeList();
		model.addAttribute("employeeList", myList);
		return "employee";
		
	}
}
