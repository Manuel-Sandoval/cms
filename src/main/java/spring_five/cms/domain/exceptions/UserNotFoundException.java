package spring_five.cms.domain.exceptions;

import lombok.Getter;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 7769396740701443708L;
	
	@Getter
	private final String id;
	
	public UserNotFoundException(String id) {
		this.id = id;
	}
	
}
