package spring_five.cms.domain.exceptions;

import lombok.Getter;

public class CategoryNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -192327534084498385L;

	@Getter
	private final String id;
	
	public CategoryNotFoundException(String id) {
		this.id = id;
	}
	
}
