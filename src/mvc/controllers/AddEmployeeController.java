package mvc.controllers;


import mvc.data.EmployeeMapper;
import mvc.models.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddEmployeeController {
	
	private String name;
	@Autowired
	public EmployeeMapper employeeMapper;

	@RequestMapping(value = "newEmployee.mvc")
	public String newEmployee(@RequestParam String firstname,
							  @RequestParam String surname, 
							  @RequestParam String house_number,
							  @RequestParam String postcode,
							  @RequestParam String national_insurance_number,
							  @RequestParam String salary, 
							  @RequestParam String department,
							  @RequestParam String bankaccount) {
		
		this.name = firstname;
	
		Employee emp = new Employee(firstname, surname, house_number, postcode,
									national_insurance_number, Float.parseFloat(salary), department, bankaccount);
		
		employeeMapper.setEmployee(emp);
		return "redirect:addedEmployee.mvc";
	}
	
	@RequestMapping(value = "addedEmployee.mvc")
	public ModelAndView addedEmployee(ModelAndView modelAndView) {
		
		modelAndView.setViewName("addedEmployee");
		modelAndView.addObject("employeeName", this.getName());
		return modelAndView;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
