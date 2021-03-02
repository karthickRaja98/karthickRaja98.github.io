package com.kmk.admin;

import java.util.Date;

public class AdminDTO {
	
	private int adminId;
	private String adminName;
	private String adminEmail;
	private int adminAge;
	private Date adminDOB;
	private String adminGender;
	private int adminAddressId;
	private int phoneNo;
	private Date dateOfJoining;
	private int propertyId;
	
	public AdminDTO() {
		super();
	}

	public AdminDTO(String adminName, String adminEmail, int adminAge, Date adminDOB, String adminGender,
			int adminAddressId, int phoneNo, Date dateOfJoining, int propertyId) {
		super();
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminAge = adminAge;
		this.adminDOB = adminDOB;
		this.adminGender = adminGender;
		this.adminAddressId = adminAddressId;
		this.phoneNo = phoneNo;
		this.dateOfJoining = dateOfJoining;
		this.propertyId = propertyId;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public int getAdminAge() {
		return adminAge;
	}

	public void setAdminAge(int adminAge) {
		this.adminAge = adminAge;
	}

	public Date getAdminDOB() {
		return adminDOB;
	}

	public void setAdminDOB(Date adminDOB) {
		this.adminDOB = adminDOB;
	}

	public String getAdminGender() {
		return adminGender;
	}

	public void setAdminGender(String adminGender) {
		this.adminGender = adminGender;
	}

	public int getAdminAddressId() {
		return adminAddressId;
	}

	public void setAdminAddressId(int adminAddressId) {
		this.adminAddressId = adminAddressId;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	
	public static Admin prepareAdmin(AdminDTO adminDTO) {
		
		Admin admin = new Admin();
		
//		admin.setAdminId(adminDTO.getAdminId());
		admin.setAdminName(adminDTO.getAdminEmail());
		admin.setAdminEmail(adminDTO.getAdminEmail());
		admin.setAdminAge(adminDTO.getAdminAge());
		admin.setAdminDOB(adminDTO.getAdminDOB());
		admin.setAdminGender(adminDTO.getAdminGender());
		admin.setAdminAddressId(adminDTO.getAdminAddressId());
		admin.setPhoneNo(adminDTO.getPhoneNo());
		admin.setDateOfJoining(adminDTO.getDateOfJoining());
		admin.setPropertyId(adminDTO.getPropertyId());
		
		return admin;
		
		
	}
	
	
}
