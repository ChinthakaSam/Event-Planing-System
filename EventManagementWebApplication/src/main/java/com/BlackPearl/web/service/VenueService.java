package com.BlackPearl.web.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.BlackPearl.web.model.Venue;
import com.BlackPearl.web.util.DBConnection;

public class VenueService {

	private static Connection connection;

	private PreparedStatement preparedStatement;
	
	
	public void addVenue(Venue venue) {

		int vid = Venue.generateIDs(getVids());
		
		try {
			try {
				connection = DBConnection.getDBConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			preparedStatement = connection.prepareStatement
			("insert into venue values (?, ?, ?, ?, ?, ?, ?, ?)");
			connection.setAutoCommit(false);
			
			//Generate fruit IDs
			
			venue.setVid(vid);
			preparedStatement.setInt(1, venue.getVid());
			preparedStatement.setString(2, venue.getVname());
			preparedStatement.setString(3, venue.getAdress());
			preparedStatement.setString(4, venue.getHallno());
			preparedStatement.setString(5, venue.getType());
			preparedStatement.setInt(6, venue.getNumberOfguests());
			preparedStatement.setDouble(7, venue.getPrice());
			preparedStatement.setBlob(8, venue.getImage());
			
			
			
			// Add fruit
			preparedStatement.execute();
			connection.commit();

		} catch (SQLException e) {
			System.out.println("Severe Exception "+e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("Severe SQL error"+ e.getMessage());
			}
		}
	}
	
private ArrayList<Integer> getVids(){
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		try {
			try {
				connection = DBConnection.getDBConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			preparedStatement = connection.prepareStatement("select v.Vid from Venue as v");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getInt(1));
			}
		} catch (SQLException e) {
			System.out.println("Severe Exception "+e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("Severe DB Error");
			}
		}
		return arrayList;
	}

}
