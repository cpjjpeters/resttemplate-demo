package ipeters.resttemplate_demo.resttemplate.web.model;

/* carlpeters created on 17/12/2024 inside the package - ipeters.resttemplate_demo.resttemplate.web.model */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

    private String id;
    private String name;
    private String address;



//
//    @Override public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(id, employee.id);
//    }
//
//    @Override public int hashCode() {
//
//        return Objects.hash(id);
//    }
}
