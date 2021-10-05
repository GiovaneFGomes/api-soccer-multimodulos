package exceptions.handler;

import exceptions.details.ExceptionDetails;
import exceptions.details.MethodNotValidDetails;
import exceptions.notfound.NotFoundException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import java.time.Instant;
import java.util.*;

import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    public ExceptionDetails handlerNotFoundException(NotFoundException e){
        ExceptionDetails exceptionDetails;
        exceptionDetails = ExceptionDetails.builder()
                .status(NOT_FOUND.value())
                .title("Not found")
                .timestamp(Instant.now())
                .details(e.getMessage())
                .developerMessage("Include a valid ID. Make sure it exists.")
                .build();
        return exceptionDetails;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(BAD_REQUEST)
    public MethodNotValidDetails handlerMethodNotValid(MethodArgumentNotValidException e){
        Map<String, String> error = new HashMap<>();
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        fieldErrors.forEach(p -> error.put(p.getField(), p.getDefaultMessage()));

        MethodNotValidDetails methodNotValidDetails;
        methodNotValidDetails = MethodNotValidDetails.builder()
                .status(BAD_REQUEST.value())
                .title("Body contains invalid JSON")
                .timestamp(Instant.now())
                .details(error)
                .developerMessage("Error! Check the body constraints.")
                .build();
        return methodNotValidDetails;
    }


    @ExceptionHandler(Exception.class)
    @ResponseStatus(BAD_REQUEST)
    public ExceptionDetails handlerBadRequest(Exception e){
        ExceptionDetails exceptionDetails;
        exceptionDetails = ExceptionDetails.builder()
                .status(BAD_REQUEST.value())
                .title("Bad request")
                .timestamp(Instant.now())
                .details("You sent a request that this server didn't understand")
                .developerMessage("Check the request")
                .build();
        return exceptionDetails;
    }

}
