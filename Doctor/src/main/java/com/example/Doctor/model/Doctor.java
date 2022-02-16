package com.example.Doctor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class Doctor {
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String phonenumber;
	public Doctor()
	{
		
	}
    public Doctor(String string, String string2, String string3) {
        id=string;
		name = string2;
        phonenumber=string3;
    }
    

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    

}