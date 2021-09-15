package com.etiyaHrms.HrmsDay9.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiyaHrms.HrmsDay9.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

	boolean existsUserByEmail(String email);

}