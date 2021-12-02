package yazilimOgreniyoruz.dataAccess.concretes.hibernate;

import java.util.ArrayList;
import java.util.List;

import yazilimOgreniyoruz.dataAccess.abstracts.TrainerDao;
import yazilimOgreniyoruz.entities.concretes.Trainer;

public class HibernateTrainerDao implements TrainerDao{
	List<Trainer> trainers;
	
	public HibernateTrainerDao() {
		super();
		this.trainers = new ArrayList<Trainer>();
	}

	@Override
	public List<Trainer> getAllEntites() {
		// TODO Auto-generated method stub
		return this.trainers;
	}

	@Override
	public void add(Trainer entity) {
		System.out.println(entity.getFirstName()+ " adli eðitmen eklendi. ");
		this.trainers.add(entity);
		
	}

	@Override
	public void update(Trainer entity) {
		System.out.println(entity.getFirstName()+ " adli eðitmen güncellendi. ");
	}

	@Override
	public void delete(Trainer entity) {
		System.out.println(entity.getFirstName()+ " adli eðitmen silindi. ");
		
	}

}
