package com.dypro.hackathon.user.dao;

import com.dypro.hackathon.user.model.UserRegistInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistInfoDao extends JpaRepository<Integer, UserRegistInfo> {
}
