package yazilimOgreniyoruz.business.abstracts;

import java.util.List;

import yazilimOgreniyoruz.entities.concretes.Trainer;

public interface TrainerService {
	
	void add(Trainer trainer);
	
	List<Trainer> getAll();

}
