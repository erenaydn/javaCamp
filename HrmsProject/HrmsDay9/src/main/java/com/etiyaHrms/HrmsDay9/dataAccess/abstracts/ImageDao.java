package com.etiyaHrms.HrmsDay9.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiyaHrms.HrmsDay9.entities.Image;

public interface ImageDao extends JpaRepository<Image, Integer> {

}