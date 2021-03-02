package com.kmk.property;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Property {
	@Id
	@Column(name = "property_id")
	private int propertyId;
	@Column(name = "property_type")
	private String propertyType;
	@Column(name = "property_address_id")
	private int addressId;
	
	public Property() {
		super();
	}

	public Property(int propertyId, String propertyType, int addressId) {
		super();
		this.propertyId = propertyId;
		this.propertyType = propertyType;
		this.addressId = addressId;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	} 
	
	
}
