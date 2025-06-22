package mk.ukim.finki.employeepage.v1.repository;

import mk.ukim.finki.employeepage.v1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
}
