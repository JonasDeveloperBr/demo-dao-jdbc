package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

//		Department obj = new Department(1, "Books");
//		
//		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
//
//		SellerDao sellerDao = DaoFactory.createSellerDao();
//
//		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, "Eletronics");
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}
		
		System.out.println("=== TEST 3: seller findAll ===");
		List<Seller> listSeller = sellerDao.findAll();
		for (Seller x : listSeller) {
			System.out.println(x);
		}
		System.out.println();
		
		System.out.println("=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Jonas", "jhn@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println(newSeller);
		System.out.println();
		
		System.out.println("=== TEST 5: seller update ===");
		System.out.println("Before:");
		System.out.println(newSeller);
		Department newDep = new Department(1, "Computer");
		newSeller.setName("Greg Pit");
		newSeller.setEmail("greg.pit@gmail.com");
		newSeller.setDepartment(newDep);
		sellerDao.update(newSeller);
		System.out.println("After:");
		for (Seller x : sellerDao.findAll()) {
			System.out.println(x);
		}
		System.out.println();
		
		System.out.println("=== TEST 6: seller delete ===");
		Seller newSeller2 = sellerDao.findById(14);
		System.out.println(newSeller2);
		sellerDao.delete(newSeller2.getId());
		System.out.println("Deleted!");
		newSeller2 = sellerDao.findById(14);
		System.out.println(newSeller2);
	}

}
