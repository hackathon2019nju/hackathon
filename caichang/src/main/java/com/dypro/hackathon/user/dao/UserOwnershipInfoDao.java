package com.dypro.hackathon.user.dao;

import com.dypro.hackathon.user.model.UserOwnershipInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserOwnershipInfoDao extends JpaRepository<Integer, UserOwnershipInfo> {
}
