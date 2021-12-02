package com.etiyaHrms.HrmsDay9.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiyaHrms.HrmsDay9.business.abstracts.ImageService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessDataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessResult;
import com.etiyaHrms.HrmsDay9.dataAccess.abstracts.ImageDao;
import com.etiyaHrms.HrmsDay9.entities.Image;

@Service
public class ImageManager implements ImageService {

	private ImageDao imageDao;

	@Autowired
	public ImageManager(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll());
	}

	@Override
	public Result add(Image image) {
		this.imageDao.save(image);
		return new SuccessResult();

	}

}
