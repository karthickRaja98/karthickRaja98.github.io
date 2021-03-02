package com.kmk.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity // Address Entity Class
@Table(name="address") // Table
@GenericGenerator(name = "addressIdIncrement", strategy = "increment") // increment type increments maximum id found in the table
//@NamedQuery(name = "Address.findById", query = "select a from address a where a.address_id = ?1")
public class Address {
	
	@Id
	@GeneratedValue(generator = "addressIdIncrement")
	@Column(name="address_id")
	private int addressId;
	@Column(name="street_name")
	private String streetName;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="pincode")
	private int pincode;
	
	public Address() {
		super();
	}

	public Address(int addressId, String streetName, String city, String state, String country, int pincode) {
		super();
		this.addressId = addressId;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public static AddressDTO prepareAddressDTO(Address address) { // Entity object is converted to DTO object
		
		AddressDTO addressDTO = new AddressDTO();
		
		addressDTO.setAddressId(address.getAddressId());
		addressDTO.setStreetName(address.getStreetName());
		addressDTO.setCity(address.getCity());
		addressDTO.setState(address.getState());
		addressDTO.setCountry(address.getCountry());
		addressDTO.setPincode(address.getPincode());
		
		return addressDTO;
	}
	
}
