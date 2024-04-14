package br.com.springbootcourse.exceptions;
     
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
     
@ResponseStatus(HttpStatus.NOT_FOUND) // Erro 400
public class ResourceNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
     
	public ResourceNotFoundException(String ex) {
		super(ex);
	}
     
}
