package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		/**
		 * Print list of Department
		 */
		List<Department> listDep = departmentDao.findAll();
		listDep.forEach(System.out::println);
		System.out.println();
		
	}

}
