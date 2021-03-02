package com.kmk.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kmk.address.AddressRepository;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	public AdminRepository adminRepository;
	
	@Override
	public void createAdmin(AdminDTO adminDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Admin> findAll(Pageable page) {
		return adminRepository.findAll(page);
	}

	@Override
	public List<Admin> findAll(Sort sort) {
		return adminRepository.findAll(sort);
	}

}
