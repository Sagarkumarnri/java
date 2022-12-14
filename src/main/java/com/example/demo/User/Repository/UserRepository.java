package com.example.demo.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Users;

public interface UserRepository extends JpaRepository<Users,Integer> {

	public Users findByEmailAndPassword(String email,String password);
}
