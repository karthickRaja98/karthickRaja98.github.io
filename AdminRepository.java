package com.kmk.admin;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
//	Admin getAdminByName(String adminName);
}
