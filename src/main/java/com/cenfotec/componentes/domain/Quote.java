package com.cenfotec.componentes.domain;

import com.google.cloud.firestore.annotation.DocumentId;
import java.util.Date;

import org.springframework.cloud.gcp.data.firestore.Document;

@Document(collectionName = "quote")
public class Quote {

    @DocumentId
    private String id;
    private String pet;
    private String owner;
    private String email;
    private Date date;
    private String hour;
    private String symptom;
    
    Quote() {
    }
    
	public Quote(String id, String pet, String owner, String email, Date date, String hour, String symptom) {
		this.id = id;
		this.pet = pet;
		this.owner = owner;
		this.email = email;
		this.date = date;
		this.hour = hour;
		this.symptom = symptom;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPet() {
		return pet;
	}

	public void setPet(String pet) {
		this.pet = pet;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	@Override
	public String toString() {
		return  pet +
				"," + owner +
				"," + email +
				"," + date +
				"," + hour +
				"," + symptom;
	}
}
