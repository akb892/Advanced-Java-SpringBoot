package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.bean.Employee;


@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
	List<Employee> findByDepartment(String department);
	Employee findByEmpId(int empId);
	@Query("select e from Employee e where e.name like :n" + "%")
	List<Employee> startsWithName(String n);
}
