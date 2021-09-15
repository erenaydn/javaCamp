package com.etiyaHrms.HrmsDay9.business.abstracts;

import java.util.List;

import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.entities.CoverLetter;

public interface CoverLetterService {
	DataResult<List<CoverLetter>> getAll();

	Result add(CoverLetter coverLetter);
}
