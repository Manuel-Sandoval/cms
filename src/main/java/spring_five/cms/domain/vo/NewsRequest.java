package spring_five.cms.domain.vo;

import java.util.Set;

import lombok.Data;
import spring_five.cms.domain.models.Category;
import spring_five.cms.domain.models.Tag;

@Data
public class NewsRequest {

	private String title;
	private String content;
	private Set<Category> categories;
	private Set<Tag> tags;
	
}
