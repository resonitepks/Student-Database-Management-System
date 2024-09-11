package com.jsp.model;

public class Student {
   private int id;
   private String name;
   private String email;
   private String password;
   private String dob;
   private String address;
   private String gender;
   private long mob;
   private String relationshipShipStatus;

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
public String getEmail() {
			return email;
}
public void setEmail(String email) {
			this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getMob() {
	return mob;
}
public void setMob(long mob) {
	this.mob = mob;
}
public String getRelationshipShipStatus() {
	return relationshipShipStatus;
}
public void setRelationshipShipStatus(String relationshipShipStatus) {
	this.relationshipShipStatus = relationshipShipStatus;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", dob=" + dob
			+ ", address=" + address + ", gender=" + gender + ", mob=" + mob + ", relationshipShipStatus="
			+ relationshipShipStatus + ", getId()=" + getId() + ", getName()=" + getName() + ", getEmail()="
			+ getEmail() + ", getPassword()=" + getPassword() + ", getDob()=" + getDob() + ", getAddress()="
			+ getAddress() + ", getGender()=" + getGender() + ", getMob()=" + getMob()
			+ ", getRelationshipShipStatus()=" + getRelationshipShipStatus() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
}

