package ipeters.resttemplate_demo.persistence;

import ipeters.resttemplate_demo.persistence.EmployeeJpaEntity;
import ipeters.resttemplate_demo.resttemplate.web.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.WARN)
public interface EmployeeJpaDaoMapper {
    EmployeeJpaEntity modelToJpaEntity(Employee employee);

    Employee jpaEntityToModel(EmployeeJpaEntity employeeJpaEntity);
}
