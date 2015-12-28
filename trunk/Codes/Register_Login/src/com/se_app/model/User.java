package com.se_app.model;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.se_app.common.Util;


public class User {

	private Entity user ;
	private String _username;
	private String _password;
	private String description;
	
	public Entity getEntity()
	{
		return user;
	}
	
	public User(Entity user)
	{
		this.user = user;
	}

	
	
	
	/*
	 * 
	 */
	public String getUserName() {
		return user.getProperty("username").toString();
	}
	public void setUserName(String _username) {
		user.setProperty("username", _username);
	}
	public String getPassword() {
		return user.getProperty("password").toString();
	}
	public void setPassword(String _password) {
		user.setProperty("password", _password);
	}
	public String getDescription() {
		return user.getProperty("description").toString();
	}
	public void setDescription(String description) {
		user.setProperty("description", description);
	}

	
	
	public static void insertUser(Entity user)
	{
		Util.persistEntity(user);
	}

	public static User getUser(String username) {
		Key key = KeyFactory.createKey("User", username);
		Entity entity =  Util.findEntity(key);
		if (entity != null)
			return new User(entity);
		
		return null;
	}
	
	 public static Iterable<Entity> getAllUsers() {
		  	Iterable<Entity> entities = Util.listEntities("User", null, null);
		  	return entities;
	 }
	
	

}
