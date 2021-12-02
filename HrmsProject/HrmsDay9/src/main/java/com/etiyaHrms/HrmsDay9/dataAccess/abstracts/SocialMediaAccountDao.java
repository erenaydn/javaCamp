package com.etiyaHrms.HrmsDay9.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiyaHrms.HrmsDay9.entities.SocialMediaAccount;

public interface SocialMediaAccountDao extends JpaRepository<SocialMediaAccount, Integer> {

}
