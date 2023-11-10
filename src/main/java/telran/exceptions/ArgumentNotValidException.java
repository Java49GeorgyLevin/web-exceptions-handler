package telran.exceptions;

import org.springframework.core.MethodParameter;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;

public class ArgumentNotValidException extends MethodArgumentNotValidException {
	private static final long serialVersionUID = 1L;

	public ArgumentNotValidException(MethodParameter parameter, BindingResult bindingResult) {
		super(parameter, bindingResult);
	}


}
