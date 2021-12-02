package yazilimOgreniyoruz.business.concretes;

import java.util.List;

import yazilimOgreniyoruz.business.abstracts.TrainerService;
import yazilimOgreniyoruz.dataAccess.abstracts.TrainerDao;
import yazilimOgreniyoruz.entities.concretes.Trainer;

public class TrainerManager implements TrainerService {
	TrainerDao trainerDao;

	public TrainerManager(TrainerDao trainerDao) {
		super();
		this.trainerDao = trainerDao;
	}

	@Override
	public void add(Trainer trainer) {
		this.trainerDao.add(trainer);

	}

	@Override
	public List<Trainer> getAll() {
		// TODO Auto-generated method stub
		return this.trainerDao.getAllEntites();
	}

	public void search(String trainer) {
		for (Trainer trainerItem : trainerDao.getAllEntites()) {
			if (trainer == trainerItem.getFirstName()) {
				System.out.println(trainerItem.getFirstName());
			}
		}
	}

}
