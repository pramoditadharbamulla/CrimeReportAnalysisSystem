package com.java.Crime.model;

import java.sql.Date;

public class Incidents {
	
	     private int IncidentID ;
	     private String IncidentType ;
	     private Date  IncidentDate;
	     private double Latitude; 
	     private double Longitude ;
	     private String Description; 
	     private String Status; 
	     private int VictimID ; 
	     private int SuspectID; 
	   
		public int getIncidentID() {
			return IncidentID;
		}
		public void setIncidentID(int incidentID) {
			IncidentID = incidentID;
		}
		public String getIncidentType() {
			return IncidentType;
		}
		public void setIncidentType(String incidentType) {
			IncidentType = incidentType;
		}
		public Date getIncidentDate() {
			return IncidentDate;
		}
		public void setIncidentDate(Date string) {
			IncidentDate = string;
		}
		public double getLatitude() {
			return Latitude;
		}
		public void setLatitude(double latitude) {
			Latitude = latitude;
		}
		public double getLongitude() {
			return Longitude;
		}
		public void setLongitude(double longitude) {
			Longitude = longitude;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		public int getVictimID() {
			return VictimID;
		}
		public void setVictimID(int victimID) {
			VictimID = victimID;
		}
		public int getSuspectID() {
			return SuspectID;
		}
		public void setSuspectID(int suspectID) {
			SuspectID = suspectID;
		}
		@Override
		public String toString() {
			return "Incidents [IncidentID=" + IncidentID + ", IncidentType=" + IncidentType + ", IncidentDate="
					+ IncidentDate + ", Latitude=" + Latitude + ", Longitude=" + Longitude + ", Description="
					+ Description + ", Status=" + Status + ", VictimID=" + VictimID + ", SuspectID=" + SuspectID + "]";
		}
		public Incidents(int incidentID, String incidentType, Date incidentDate, double latitude, double longitude,
				String description, String status, int victimID, int suspectID) {
			super();
			IncidentID = incidentID;
			IncidentType = incidentType;
			IncidentDate = incidentDate;
			Latitude = latitude;
			Longitude = longitude;
			Description = description;
			Status = status;
			VictimID = victimID;
			SuspectID = suspectID;
		}
		public Incidents() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		

}
