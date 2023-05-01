package com.example.springserver;

import com.example.springserver.entity.Employee;
import com.example.springserver.service.EmployeeService;
import com.example.springserver.service.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringFullStackAppClientServerApplicationTests {

	@Autowired
	private EmployeeService employeeService;

	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setEmployeeName("Iron");
		employee.setEmployeeBranch("CSME");
		employee.setEmployeeLocation("Vivekanada`");
		employeeService.saveEmployee(employee);
	}

}
