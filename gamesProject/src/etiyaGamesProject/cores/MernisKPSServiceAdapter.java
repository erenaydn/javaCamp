package etiyaGamesProject.cores;

import etiyaGamesProject.business.abstracts.UserIdentityValidatorService;
import etiyaGamesProject.entities.concretes.User;

public class MernisKPSServiceAdapter implements UserIdentityValidatorService {

	@Override
	public boolean isValid(User user) {

		MernisKPSService mernisKPSService = new MernisKPSService();

		if (user.getNationalIdentityNumber().length() != 11) {
			System.out.println("Kimlik bilgilerinizi gozden geciriniz...");
			return false;

		} else {
			return mernisKPSService.tcKimlikNoDogrula(Long.parseLong(user.getNationalIdentityNumber()),
					user.getFirstName(), user.getLastName(), user.getDateOfBirtday());

		}

	}

}
