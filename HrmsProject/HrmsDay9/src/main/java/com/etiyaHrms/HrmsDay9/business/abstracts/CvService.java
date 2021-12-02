package com.etiyaHrms.HrmsDay9.business.abstracts;

import java.util.List;

import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.entities.Cv;

public interface CvService {
	DataResult<List<Cv>> getAll();

	Result add(Cv cv);

	DataResult<Cv> getById(int cvId);

}
