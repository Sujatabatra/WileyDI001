package com.sujata.model.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String> {

	public User findByUserNameAndPassword(String userName,String password);
}
