package com.java.Crime.main;


import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

import com.java.Crime.dao.IncidentsDaoImpl;
import com.java.Crime.dao.IncidentsDao;
import com.java.Crime.model.Incidents;

public class CreateIncidentMain {
	

	public static void main(String[] args) {
		
		Incidents incident=new Incidents();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter IncidentID");
		incident.setIncidentID(Integer.parseInt(sc.nextLine()));
		
		System.out.println("enter IncidentType");
		incident.setIncidentType(sc.nextLine());
		System.out.print("Enter date (yyyy-MM-dd): ");
		String DateString=sc.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
			java.util.Date date = dateFormat.parse(DateString);
			 java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			  incident.setIncidentDate(sqlDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("enter Latitude");
		incident.setLatitude(Double.parseDouble(sc.nextLine()));
		
		System.out.println("enter Longitude");

		incident.setLongitude(Double.parseDouble(sc.nextLine()));
		System.out.println("enter status");
		incident.setStatus(sc.next());
		System.out.println("enter victimID");
		incident.setVictimID(Integer.parseInt(sc.nextLine()));
		System.out.println("enter SuspectID");
		incident.setSuspectID(Integer.parseInt(sc.nextLine()));
		
		
		System.out.println("enter Description");
		sc.nextLine();
		
		incident.setDescription(sc.nextLine());
		
	    IncidentsDao dao=new IncidentsDaoImpl();
		try {
			Boolean Success=dao.CreateIncident(incident);
			if(Success==true) {
				System.out.println("**data inserted succesfully**");
			}
			else {
				System.out.println("**data not inserted**");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
	
           sc.close();

	        
	}

}
}
