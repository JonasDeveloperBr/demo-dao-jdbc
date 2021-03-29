package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		/**
		 * Find and Print all Departments
		 */
		List<Department> listDep = departmentDao.findAll();
		listDep.forEach(System.out::println);
		System.out.println();

		/**
		 * Find by Id an specific Department
		 */
		System.out.println(departmentDao.findById(3));
		System.out.println();
		
		/**
		 * Delete an specific Department by Id
		 */
		departmentDao.deleteById(6);
		System.out.println("After delete!");
		System.out.println(departmentDao.findById(6));
		System.out.println();
		
		
	}

}
