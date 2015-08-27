package mvc.controllers;

import mvc.models.Employee;
import mvc.data.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmployeeController {

	@Autowired
	public EmployeeMapper employeeMapper;
	
	//@RequestMapping("/continent.mvc")
	public String employee(Model m)
	{
		m.addAttribute("employee", employeeMapper.getEmployee());
		return "employee";
	}
	
	@RequestMapping("employee.mvc")
	public String setEmployee(Model m)
	{
		Employee s=new Employee();
		s.setFirstName("Stefan3");
		s.setLastName("Totev");
		s.setHouseNumber("12");
		s.setPostCode("sakgd");
		s.setNationalInsuranceNumber("asjhfkh");
		s.setStartingSalary(20000.00f);
		s.setDepartment("Evolve");
		s.setBankDetails("adfasf");
		employeeMapper.setEmployee(s);
		m.addAttribute("employee", employeeMapper.getEmployee());
		return "employee";
	}
	
//	@RequestMapping("/{cont}/regions.mvc")
//	public String regions(Model m, @PathVariable("cont") String continent)
//	{
//		m.addAttribute("regions", worldMapper.getRegionsForContinent(continent));
//		m.addAttribute("continent", continent);
//		return "regions";
//	}
	
//	@RequestMapping("/{region}/countries.mvc")
//	public String countries(Model m, @PathVariable String region)
//	{
//		m.addAttribute("countries", worldMapper.getCountriesForRegion(region));
//		m.addAttribute("region", region);
//		return "countries";
//	}

}
