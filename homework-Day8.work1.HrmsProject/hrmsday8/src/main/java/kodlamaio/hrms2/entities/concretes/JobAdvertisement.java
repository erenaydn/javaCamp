package kodlamaio.hrms2.entities.concretes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Job_advertisements")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JobAdvertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int advertisementId;

    @Column(nullable = false)
    private String jobDescription;

    @Column(nullable = false)
    private String city;

    @Column
    private int minSalary;

    @Column
    private int maxSalary;

    @Column(nullable = false)
    private int numberOfOpenPosition;

    @Temporal(TemporalType.DATE)
    private Date applicationDeadline;

    @Column(name = "job_status")
    @Value("${some.key:true}")
    private boolean jobStatus;

    @Temporal(TemporalType.DATE)
    @Column(name = "realese_date")
    private Date realeseDate;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;
}
