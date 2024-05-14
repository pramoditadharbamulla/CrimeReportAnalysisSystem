package com.java.Crime.model;

public class Officers {
	   private int OfficerID;
	   private String FirstName ;
	   private String  LastName; 
	   private String BadgeNumber;
	   private String Ranking ;
	   private String PhoneNumber ;
	   private String Address ;
	   private int AgencyID ;
	public int getOfficerID() {
		return OfficerID;
	}
	public void setOfficerID(int officerID) {
		OfficerID = officerID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getBadgeNumber() {
		return BadgeNumber;
	}
	public void setBadgeNumber(String badgeNumber) {
		BadgeNumber = badgeNumber;
	}
	public String getRanking() {
		return Ranking;
	}
	public void setRanking(String ranking) {
		Ranking = ranking;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAgencyID() {
		return AgencyID;
	}
	public void setAgencyID(int agencyID) {
		AgencyID = agencyID;
	}
	@Override
	public String toString() {
		return "Officers [OfficerID=" + OfficerID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", BadgeNumber=" + BadgeNumber + ", Ranking=" + Ranking + ", PhoneNumber=" + PhoneNumber
				+ ", Address=" + Address + ", AgencyID=" + AgencyID + "]";
	}
	public Officers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Officers(int officerID, String firstName, String lastName, String badgeNumber, String ranking,
			String phoneNumber, String address, int agencyID) {
		super();
		OfficerID = officerID;
		FirstName = firstName;
		LastName = lastName;
		BadgeNumber = badgeNumber;
		Ranking = ranking;
		PhoneNumber = phoneNumber;
		Address = address;
		AgencyID = agencyID;
	}
	   
	    
}
