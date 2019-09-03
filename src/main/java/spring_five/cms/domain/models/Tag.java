package spring_five.cms.domain.models;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Tag {

	private String value;
	
}
