package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		/**
		 * Find and Print all Departments
		 */
		departmentDao.findAll().forEach(System.out::println);
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
		System.out.println();
		
		/**
		 * Update department by id
		 */
		Department updateDepartment = departmentDao.findById(2);
		System.out.println("Before update:\n" + updateDepartment);
		updateDepartment.setName("Games");
		departmentDao.update(updateDepartment);
		System.out.println("After update:\n" + departmentDao.findById(2) + "\n");
		
		/**
		 * Insert department
		 */
		Department newDep = new Department();
		newDep.setName("Sports");
		System.out.println(newDep);
		departmentDao.insert(newDep);
		System.out.println(newDep);
		
	}

}
