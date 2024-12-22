package ipeters.resttemplate_demo.resttemplate.web.service;

import ipeters.resttemplate_demo.persistence.EmployeePersistenceFacade;
import ipeters.resttemplate_demo.resttemplate.web.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/* carlpeters created on 22/12/2024 inside the package - ipeters.resttemplate_demo.resttemplate.web.service */
@Slf4j
@Service
public class EmployeeDtoService {
    private EmployeePersistenceFacade employeePersistenceFacade;

    public EmployeeDtoService(EmployeePersistenceFacade employeePersistenceFacade) {
        this.employeePersistenceFacade = employeePersistenceFacade;
    }

    public Employee save(Employee employee) {
        return this.employeePersistenceFacade.save(employee);
    }

    public List<Employee> findAll() {
        return this.employeePersistenceFacade.findAll();
    }

    public Employee findById(Long id) {
        return this.employeePersistenceFacade.findById(id);
    }

    public void delete(Employee employee) {
        this.employeePersistenceFacade.delete(employee);
    }

    public void deleteById(Long id) {
        this.employeePersistenceFacade.deleteById(id);
    }

    public Employee update(Employee employee) {
        return this.employeePersistenceFacade.update(employee);
    }

}
