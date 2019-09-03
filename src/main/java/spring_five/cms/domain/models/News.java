package spring_five.cms.domain.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "news")
public class News {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id;
	private String title;
	private String content;
	
	@ManyToOne
	private User author;
	
	@OneToMany
	private Set<User> mandatoryReviewers = new HashSet<>();
	
	@ElementCollection
	private Set<Review> reviewers = new HashSet<>();
	
	@OneToMany
	private Set<Category> categories = new HashSet<>();
	
	@ElementCollection
	private Set<Tag> tags = new HashSet<>();
	
	public Boolean revised() {
		return this.mandatoryReviewers.stream()
				   .allMatch(reviewer -> this.reviewers.stream()
						   			  .anyMatch(review -> reviewer.getId().equals(review.getUserId())
						   					  && review.getStatus().equals("approved")));
	}
	
	public Review review(String userId, String status) {
		
		final Review review = new Review(userId, status);
		this.reviewers.add(review);
		return review;
		
	}
	
}
