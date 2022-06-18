package com.myapp.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.user.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
}
