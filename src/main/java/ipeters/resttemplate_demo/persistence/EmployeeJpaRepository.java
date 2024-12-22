package ipeters.resttemplate_demo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

/* carlpeters created on 22/12/2024 inside the package - ipeters.resttemplate_demo.persistence */
public interface EmployeeJpaRepository extends JpaRepository<EmployeeJpaEntity, Long> {
}
