package com.kmk.address;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepository extends JpaRepository<Address, Integer>{
	
	// Query overrides NamedQuery 
	
//	@Query("select cus from Customer cus where cus.address = ?1")
//	Address findById(int addressId);
	
    // Method to update street name in Address record into the db
	@Transactional
	@Modifying(clearAutomatically=true, flushAutomatically=true)
	@Query(value = "update address set street_name = ? " + " where address_id = ?", nativeQuery = true)
	public void addressUpdate(String street_name, int address_id);
	
}
