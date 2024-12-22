package ipeters.resttemplate_demo.persistence;

import ipeters.resttemplate_demo.resttemplate.web.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeeJpaPersistenceService implements EmployeePersistenceFacade {

    private final EmployeeJpaDaoMapper employeeJpaDaoMapper;
    private final EmployeeJpaRepository employeeJpaRepository;

    public EmployeeJpaPersistenceService(EmployeeJpaDaoMapper employeeJpaDaoMapper, EmployeeJpaRepository employeeJpaRepository) {
        this.employeeJpaDaoMapper = employeeJpaDaoMapper;
        this.employeeJpaRepository = employeeJpaRepository;
    }


    @Override
    public Employee save(Employee employee) {
        final EmployeeJpaEntity employeeJpaEntity = this.employeeJpaRepository.save(employeeJpaDaoMapper.modelToJpaEntity(employee));
        log.debug("Employee JPA = {}", employeeJpaEntity.getName());
        return this.employeeJpaDaoMapper.jpaEntityToModel(employeeJpaEntity);
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public void delete(Employee employee) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public Employee findByEmployeeId(long theId) {
        return null;
    }
}
