package com.BlackPearl.web.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.BlackPearl.web.model.Photographer;
import com.BlackPearl.web.util.DBConnection;

public class PhotographyInsertService {

	private static Connection connection;

	private PreparedStatement preparedStatement;
	
	
	public void addPhotography(Photographer photography) {

		int did = Photographer.generateIDs(getDids());
		
		try {
			try {
				connection = DBConnection.getDBConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			preparedStatement = connection.prepareStatement
			("insert into photographer values (?, ?, ?, ?, ?, ?)");
			connection.setAutoCommit(false);
			
			//Generate fruit IDs
			
			photography.setPid(did);
			preparedStatement.setInt(1, photography.getPid());
			preparedStatement.setString(2, photography.getPname());
			preparedStatement.setString(3, photography.getPpId());
			preparedStatement.setString(4, photography.getType());
			preparedStatement.setDouble(5, photography.getPrice());
			preparedStatement.setBlob(6, photography.getImage());
			
			
			
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
			preparedStatement = connection.prepareStatement("select i.iId from invitation as i");
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
