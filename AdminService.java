package com.kmk.admin;

import com.kmk.address.AddressDTO;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface AdminService {
	
	public void createAdmin(AdminDTO adminDTO);
	
	Page<Admin> findAll(Pageable page);
	
	List<Admin> findAll(Sort sort);
	
//	public void deleteAdmin(int adminId);
//	
//	public AdminDTO getAdminById(int adminId); // query by method name
//	
//	public AdminDTO getAdminByName(String adminName); // query by named query
//	
//	public void updateAdmin(int adminId);
//	
//	public void updateAdminAddress(int adminId, AddressDTO addressDTO);
//	
////	public Iterable<Customer> getCustomers(); // query by method name
//	
////	public Iterable<Seller> getSellers();
	
	
}
