package com.mapping.MedicalManagement;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Medicine {

	@Id
	private int Mid;
	private String Mname;
	
	@ManyToMany( mappedBy = "")
	private List<Distributor> distributors;

	public int getMid() {
		return Mid;
	}

	public void setMid(int mid) {
		Mid = mid;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}

	public List<Distributor> getDistributors() {
		return distributors;
	}

	public void setDistributors(List<Distributor> distributors) {
		this.distributors = distributors;
	}

	public Medicine(int mid, String mname, List<Distributor> distributors) {
		super();
		Mid = mid;
		Mname = mname;
		this.distributors = distributors;
	}

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
