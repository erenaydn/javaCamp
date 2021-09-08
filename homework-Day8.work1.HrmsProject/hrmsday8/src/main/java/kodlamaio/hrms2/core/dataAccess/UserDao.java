package kodlamaio.hrms2.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms2.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	boolean existsUserByEmail(String email);
}
