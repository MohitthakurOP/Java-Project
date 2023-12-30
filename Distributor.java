package com.mapping.MedicalManagement;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Distributor {
	
	@Id
	private int Did;
	private String Dname;
	
	@ManyToMany
	private List<Medicine> medicines;

	public int getDid() {
		return Did;
	}

	public void setDid(int did) {
		Did = did;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public List<Medicine> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<Medicine> medicines) {
		this.medicines = medicines;
	}

	public Distributor(int did, String dname, List<Medicine> medicines) {
		super();
		Did = did;
		Dname = dname;
		this.medicines = medicines;
	}

	public Distributor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
