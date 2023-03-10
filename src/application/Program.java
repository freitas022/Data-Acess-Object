package application;

import java.util.List;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		
		System.out.println("=== TESTE 01: SELLER FINDBY ID ===");		
		Seller seller = sellerDAO.findById(3);		
		System.out.println(seller);
		// -------------------------------------------------------------------
		System.out.println("\n=== TESTE 02: SELLER FINDBY DEPARTMENT ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		//-------------------------------------------------------------------
		System.out.println("\n=== TESTE 03: SELLER FINDALL() ===");
		list = sellerDAO.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}
}
