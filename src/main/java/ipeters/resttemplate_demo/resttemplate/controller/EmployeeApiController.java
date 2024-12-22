package ipeters.resttemplate_demo.resttemplate.controller;

import ipeters.resttemplate_demo.resttemplate.web.model.Employee;
import ipeters.resttemplate_demo.resttemplate.web.service.EmployeeDtoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    @GetMapping(value = "/all")
    public List<Employee> findAll() {
        log.debug("findAll");
        return employeeDtoService.findAll();
    }

    public List<Employee> findDefault() {
        log.debug("findDefault");
        return employeeDtoService.findAll();
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Employee> findById(@PathVariable(value = "id") Long id) {
        log.debug("findById");
        Employee employee = employeeDtoService.findById(id);
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/create")
    public ResponseEntity<Employee> createCity(@RequestBody Employee employee){
        log.debug("create new Employee");
        return ResponseEntity.ok().body(employeeDtoService.save(employee));
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long id, Employee employee) {
        log.debug("updateEmployee with id {}", id);
        Employee foundEmployee = employeeDtoService.findById(id);
        foundEmployee.setId(employee.getId());
        foundEmployee.setName(employee.getName());
        foundEmployee.setAddress(employee.getAddress());
        Employee updatedEmployee = employeeDtoService.update(foundEmployee);
        return ResponseEntity.ok().body(updatedEmployee);
    }
    @DeleteMapping({"{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable("id") Long id){
        log.debug("delete with just an id: {}", id);
        employeeDtoService.deleteById(id);
    }
}
