package com.BlackPearl.web.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.BlackPearl.web.model.User;
import com.BlackPearl.web.util.DBConnection;
	

public class UserService {

	private static Connection connection;

	private PreparedStatement preparedStatement;
	
	
	public void addUser(User user) {

		int uid = User.generateIDs(getUids());
		
		try {
			try {
				connection = DBConnection.getDBConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			preparedStatement = connection.prepareStatement
			("insert into user values (?, ?, ?, ?, ?)");
			connection.setAutoCommit(false);
			
			//Generate fruit IDs
			
			user.setUid(uid);
			preparedStatement.setLong(1, user.getUid());
			preparedStatement.setString(2, user.getName());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getUname());
			preparedStatement.setString(5, user.getPassword());
			
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
	
private ArrayList<Integer> getUids(){
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		try {
			try {
				connection = DBConnection.getDBConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			preparedStatement = connection.prepareStatement("select u.Uid from User as u");
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
