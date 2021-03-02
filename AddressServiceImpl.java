package com.kmk.address;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service("addressService")
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	public AddressRepository addressRepository;
	
	@Override
	public void createAddress(AddressDTO addressDTO) {
		System.out.println("inside create begin in service");
		addressRepository.saveAndFlush(AddressDTO.prepareAddressEntity(addressDTO)); // saves entity and flush changes instantly
																					// JPA repository method
		System.out.println("inside create end in service");
	}

	@Override
	public void deleteAddress(int addressId) {
		System.out.println("inside delete begin in service");
		addressRepository.deleteById(addressId); 								// CRUD repository method
		System.out.println("inside delete end in service");
		
	}

	@Override
	public AddressDTO getAddress(int addressId) {
		System.out.println("inside get begin in service");
		Optional<Address> optionalAddress = addressRepository.findById(addressId); // findBy query method
		Address address = optionalAddress.get();// Converting Optional<Customer> to Customer
		AddressDTO addressDTO = Address.prepareAddressDTO(address);
		System.out.println("inside get end in service");
		return addressDTO;
	}

	@Override
	public Page<Address> findAll(Pageable page) {
		return addressRepository.findAll(page);
	}

	@Override
	public List<Address> findAll(Sort sort) {
		return addressRepository.findAll(sort);
	}

	@Override
	public void updateAddress(String new_street_name, int addressId) {
		addressRepository.addressUpdate(new_street_name, addressId);
		
	}
	
}
