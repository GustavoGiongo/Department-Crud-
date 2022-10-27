package com.project.genericspringapp.service;

import com.project.genericspringapp.entity.Department;
import com.project.genericspringapp.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

   public  Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

    public Department fetchDepartmentId(Long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);


}
