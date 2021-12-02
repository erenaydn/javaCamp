package com.etiyaHrms.HrmsDay9.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiyaHrms.HrmsDay9.business.abstracts.CityService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessDataResult;
import com.etiyaHrms.HrmsDay9.dataAccess.abstracts.CityDao;
import com.etiyaHrms.HrmsDay9.entities.City;

@Service
public class CityManager implements CityService {

	private CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll());
	}

}
