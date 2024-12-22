package ipeters.resttemplate_demo.persistence;

import ipeters.resttemplate_demo.resttemplate.web.model.Employee;

import java.util.List;

public interface EmployeePersistenceFacade {

        Employee save(Employee employee);

        List<Employee> findAll();

        Employee findById(Long id);

        void delete(Employee employee);

        void deleteById(Long id);

        Employee update(Employee employee);

        Employee findByEmployeeId(long theId);
}
