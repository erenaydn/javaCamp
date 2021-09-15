package kodlamaio.Hrms.entities.dtos;

import java.util.List;

import kodlamaio.Hrms.entities.concretes.CoverLetter;
import kodlamaio.Hrms.entities.concretes.Image;
import kodlamaio.Hrms.entities.concretes.JobExperience;
import kodlamaio.Hrms.entities.concretes.Language;
import kodlamaio.Hrms.entities.concretes.School;
import kodlamaio.Hrms.entities.concretes.SocialMediaAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvDto {
	
	int candidateId;
	String email;
	String telephone;
	String nationalIdentity;
	String coverLetter;
	List<Image> images;
	List<School> schools;
	List<JobExperience> jobExperiences;
	List<Language> languages;
	List<SocialMediaAccount> socialMediaAccounts;
	List<CoverLetter> coverLetters;

}
