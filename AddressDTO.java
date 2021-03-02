package com.kmk.address;

public class AddressDTO { // Address DTO Class
	
	private int addressId;
	private String streetName;
	private String city;
	private String state;
	private String country;
	private int pincode;
	
	public AddressDTO() {
		super();
	}

	public AddressDTO(String streetName, String city, String state, String country, int pincode) {
		super();
//		this.addressId = addressId;
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
	
	
	public static Address prepareAddressEntity(AddressDTO addressDTO) { // DTO object is converted to Entity object
		
		Address addressEntity = new Address();
		
//		addressEntity.setAddressId(addressDTO.getAddressId());
		addressEntity.setStreetName(addressDTO.getStreetName());
		addressEntity.setCity(addressDTO.getCity());
		addressEntity.setState(addressDTO.getState());
		addressEntity.setCountry(addressDTO.getCountry());
		addressEntity.setPincode(addressDTO.getPincode());
		
		return addressEntity;
	}
}
