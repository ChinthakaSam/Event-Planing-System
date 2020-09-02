package com.BlackPearl.web.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.BlackPearl.web.model.Entertainment;
import com.BlackPearl.web.util.DBConnection;

public class EntertainmentInsertService {

	private static Connection connection;

	private PreparedStatement preparedStatement;
	
	
	public void addEntertainment(Entertainment entertainment) {

		int did = Entertainment.generateIDs(getDids());
		
		try {
			try {
				connection = DBConnection.getDBConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			preparedStatement = connection.prepareStatement
			("insert into entertainment values (?, ?, ?, ?, ?, ?)");
			connection.setAutoCommit(false);
			
			//Generate fruit IDs
			
			entertainment.setEntId(did);
			preparedStatement.setInt(1, entertainment.getEntId());
			preparedStatement.setString(2, entertainment.getEntName());
			preparedStatement.setString(3, entertainment.getEntPackage());
			preparedStatement.setString(4, entertainment.getType());
			preparedStatement.setDouble(5, entertainment.getPrice());
			preparedStatement.setBlob(6, entertainment.getImage());
			
			
			
			// Add fruit
			preparedStatement.execute();
			connection.commit();

		} catch (SQLException e) {
			System.out.println("Server Exception "+e.getMessage());
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
	
private ArrayList<Integer> getDids(){
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		try {
			try {
				connection = DBConnection.getDBConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			preparedStatement = connection.prepareStatement("select e.entId from entertainment as e");
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
