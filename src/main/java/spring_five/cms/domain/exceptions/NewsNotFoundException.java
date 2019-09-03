package spring_five.cms.domain.exceptions;

import lombok.Getter;

public class NewsNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -8742910247769634953L;
	
	@Getter
	private final String id;
	
	public NewsNotFoundException(String id) {
		this.id = id;
	}
	
}
