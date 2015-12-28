package com.se_app.dao;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.se_app.common.Util;
import com.se_app.model.User;

public class UserDAO {

	/**
	 * Update the user
	 * 
	 * @param name
	 *            : name of the user
	 * @param description
	 *            : description
	 * @return updated product
	 */
	public void insertUser(Entity user) {
		Util.persistEntity(user);
	}

	public Entity getUser(String username) {
		Key key = KeyFactory.createKey("User", username);
		Entity entity = Util.findEntity(key);
		return entity;
	}

	public Iterable<Entity> getAllUsers() {
		Iterable<Entity> entities = Util.listEntities("User", null, null);
		return entities;
	}

}
