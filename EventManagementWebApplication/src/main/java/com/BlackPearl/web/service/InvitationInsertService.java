package com.BlackPearl.web.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.BlackPearl.web.model.Invitation;
import com.BlackPearl.web.util.DBConnection;

public class InvitationInsertService {

	private static Connection connection;

	private PreparedStatement preparedStatement;
	
	
	public void addInvitation(Invitation invitation) {

		int did = Invitation.generateIDs(getDids());
		
		try {
			try {
				connection = DBConnection.getDBConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			preparedStatement = connection.prepareStatement
			("insert into invitation values (?, ?, ?, ?, ?, ?)");
			connection.setAutoCommit(false);
			
			//Generate fruit IDs
			
			invitation.setiId(did);
			preparedStatement.setInt(1, invitation.getiId());
			preparedStatement.setString(2, invitation.getIname());
			preparedStatement.setString(3, invitation.getIpackage());
			preparedStatement.setString(4, invitation.getType());
			preparedStatement.setDouble(5, invitation.getPrice());
			preparedStatement.setBlob(6, invitation.getImage());
			
			
			
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
