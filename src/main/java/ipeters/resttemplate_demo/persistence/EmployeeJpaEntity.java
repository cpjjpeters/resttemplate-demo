package ipeters.resttemplate_demo.persistence;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* carlpeters created on 22/12/2024 inside the package - ipeters.resttemplate_demo.persistence */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "EMPLOYEE")
public class EmployeeJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;


}
