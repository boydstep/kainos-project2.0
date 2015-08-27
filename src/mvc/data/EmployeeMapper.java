package mvc.data;

import java.util.List;

import mvc.models.Employee;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface EmployeeMapper {

@Select("select FirstName from Employee")
	List<String> getEmployee();
	
	@Insert("insert into Employee(FirstName, LastName, HouseNumber,PostCode, NationalInsuranceNumber, BankAccountNumber, StartingSalary, Department) values (#{firstName}, #{lastName}, #{houseNumber}, #{postCode}, #{nationalInsuranceNumber}, #{bankDetails},#{startingSalary},#{department})")
	int setEmployee(Employee s);
}
