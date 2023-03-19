package com.project.brainweb.dao;

import com.project.brainweb.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<Users, Integer> {
}
