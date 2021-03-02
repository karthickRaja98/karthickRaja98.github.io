package com.kmk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;

import com.kmk.address.Address;
import com.kmk.address.AddressDTO;
import com.kmk.address.AddressRepository;
import com.kmk.address.AddressService;

@SpringBootApplication
public class KMKApplication implements CommandLineRunner{
	
//	static Logger logger = Logger.getLogger(KMKApplication.class);
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	AddressService service;
	
	@Autowired
	AddressRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(KMKApplication.class, args);
		System.out.println("In main");
	}
	
	@Override
	public void run(String... args) throws Exception {
		
//		System.out.println("In main run");
		AddressDTO address1 = new AddressDTO("KMK Street", "Chennai", "Tamil Nadu", "India", 625017);
//		
		service.createAddress(address1);                             // address created
		
		System.out.println(service.getAddress(401).getStreetName());
		
		service.updateAddress("DMK Street", 401);
		
		System.out.println(service.getAddress(401).getStreetName());       // get address by id
		
//		service.deleteAddress(410);                                  // delete address
		
//		 int k=(int) (repository.count()/3);                         // display 3 records in a page
//	        for(int i=0;i<=k;i++){
//	        Pageable pageable = PageRequest.of(i,3);
//	        
//	        System.out.println("Records are: ");
//	        Iterable<Address> add = service.findAll(pageable);       // find all method use pagination
//	        
//	        for(Address alist3 : add){
//	             System.out.println(alist3.getCity());
//	        }
//	        }
//	        System.out.println("Sorted records..");
		        
//	       Iterable<Address> add2 = service.findAll(Sort.by(Sort.Direction.DESC,"street_name"));
//	        for(Address alist4 : add2){
//	        	System.out.println(alist4);
//	        }     
	}
}
