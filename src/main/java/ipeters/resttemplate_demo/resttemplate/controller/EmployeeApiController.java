package ipeters.resttemplate_demo.resttemplate.controller;

import ipeters.resttemplate_demo.resttemplate.web.model.Employee;
import ipeters.resttemplate_demo.resttemplate.web.service.EmployeeDtoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/* carlpeters created on 22/12/2024 inside the package - ipeters.resttemplate_demo.resttemplate.controller */
@Slf4j
@RestController
@RequestMapping("/app-api/employee")
public class EmployeeApiController {
    private final EmployeeDtoService employeeDtoService;

    public EmployeeApiController(EmployeeDtoService employeeDtoService) {
        this.employeeDtoService = employeeDtoService;
    }

    public List<Employee> findAll() {
        log.debug("findAll");
        return employeeDtoService.findAll();
    }

    public List<Employee> findDefault() {
        log.debug("findDefault");
        return employeeDtoService.findAll();
    }

    public ResponseEntity<Employee> findById(@PathVariable(value = "id") Long id) {
        log.debug("findById");
        Employee employee = employeeDtoService.findById(id);
        return ResponseEntity.ok().body(employee);
    }

}
