package com.kmk.address;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface AddressService {
	
	public void createAddress(AddressDTO addressDTO);			// create address method
	
	public void deleteAddress(int addressId);					// delete address method
	
	public AddressDTO getAddress(int addressId); 				// query by method name
	
	Page<Address> findAll(Pageable page); 						// paging operation
	
	List<Address> findAll(Sort sort); 							// sorting operation
	
	public void updateAddress(String new_street_name, int addressId);	// update street name in address - use transaction, @Query
}
