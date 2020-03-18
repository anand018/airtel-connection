package com.airtel.connection.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    private int id;
	@Column
    private String name;
	@Column
    private LocalDate dob;
	@Column
    private String address;
	@Column
    private String altNo;
	@Column
    private String email;
	@Column
    private String panNo;
	@Column
    private String nomineeName;
	@Column
    private String nomineeMobile;
    
	
	public Customer() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAltNo() {
		return altNo;
	}
	public void setAltNo(String altNo) {
		this.altNo = altNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public String getNomineeMobile() {
		return nomineeMobile;
	}
	public void setNomineeMobile(String nomineeMobile) {
		this.nomineeMobile = nomineeMobile;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((altNo == null) ? 0 : altNo.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nomineeMobile == null) ? 0 : nomineeMobile.hashCode());
		result = prime * result + ((nomineeName == null) ? 0 : nomineeName.hashCode());
		result = prime * result + ((panNo == null) ? 0 : panNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (altNo == null) {
			if (other.altNo != null)
				return false;
		} else if (!altNo.equals(other.altNo))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nomineeMobile == null) {
			if (other.nomineeMobile != null)
				return false;
		} else if (!nomineeMobile.equals(other.nomineeMobile))
			return false;
		if (nomineeName == null) {
			if (other.nomineeName != null)
				return false;
		} else if (!nomineeName.equals(other.nomineeName))
			return false;
		if (panNo == null) {
			if (other.panNo != null)
				return false;
		} else if (!panNo.equals(other.panNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", altNo=" + altNo
				+ ", email=" + email + ", panNo=" + panNo + ", nomineeName=" + nomineeName + ", nomineeMobile="
				+ nomineeMobile + "]";
	}
}
