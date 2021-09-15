package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.JobSkill;


public interface JobSkillDao extends JpaRepository<JobSkill, Integer>{

}
