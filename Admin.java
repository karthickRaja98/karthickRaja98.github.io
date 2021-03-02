package com.kmk.admin;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity // Address Entity Class
@Table(name="admins") // Table 
@GenericGenerator(name = "adminIdIncrement", strategy = "increment") // increment type increments maximum id found in the table
//@NamedQuery(name = "Admin.findByAddress", query = "select a from Admin a where a.admin_name = ?1")
public class Admin {
	
	@Id
	@GeneratedValue(generator = "adminIdIncrement")
	@Column(name="admin_id")
	private int adminId;
	@Column(name="admin_name")
	private String adminName;
	@Column(name="admin_email")
	private String adminEmail;
	@Column(name="admin_age")
	private int adminAge;
	@Column(name="admin_dob")
	private Date adminDOB;
	@Column(name="admin_gender")
	private String adminGender;
	@Column(name="admin_address_id")
	private int adminAddressId;
	@Column(name="phone_number")
	private int phoneNo;
	@Column(name="date_of_joining")
	private Date dateOfJoining;
	@Column(name="property_id")
	private int propertyId;
	
	public Admin() {
		super();
	}

	public Admin(int adminId, String adminName, String adminEmail, int adminAge, Date adminDOB, String adminGender,
			int adminAddressId, int phoneNo, Date dateOfJoining, int propertyId) {
		super();
		this.adminId = adminId;
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
	
	public static AdminDTO prepareAdminDTO(Admin admin) {
		
		AdminDTO adminDTO = new AdminDTO();
		
		adminDTO.setAdminId(admin.getAdminId());
		adminDTO.setAdminName(admin.getAdminEmail());
		adminDTO.setAdminEmail(admin.getAdminEmail());
		adminDTO.setAdminAge(admin.getAdminAge());
		adminDTO.setAdminDOB(admin.getAdminDOB());
		adminDTO.setAdminGender(admin.getAdminGender());
		adminDTO.setAdminAddressId(admin.getAdminAddressId());
		adminDTO.setPhoneNo(admin.getPhoneNo());
		adminDTO.setDateOfJoining(admin.getDateOfJoining());
		adminDTO.setPropertyId(admin.getPropertyId());
		
		return adminDTO;
		
	}
	
	
}
