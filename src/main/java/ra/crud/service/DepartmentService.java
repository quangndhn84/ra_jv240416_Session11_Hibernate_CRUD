package ra.crud.service;

import ra.crud.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();

    Department findById(int id);

    boolean create(Department department);

    boolean update(Department department);

    boolean delete(int id);
}