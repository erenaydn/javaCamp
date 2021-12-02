package etiyaGamesProject.business.abstracts;

import etiyaGamesProject.entities.concretes.User;

public interface UserIdentityValidatorService {

	boolean isValid(User user);
}
