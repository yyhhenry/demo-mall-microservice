package cn.d619.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT) // This annotation marks this exception with a 409
public class RegisterException extends RuntimeException {
    public RegisterException(String message) {
        super(message);
    }
}
