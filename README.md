Spring boot application to create rest endpoints as a service. 
This application provides a demo how we can centrally manage exceptions and provide 
custom error responses to the clients. 

```
package com.example.springboot.api.errorhandling.exceptionhandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
@Slf4j
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
// some configuration
}
```

The RestController advice is the advice for all rest endpoints, and deals with all probable exceptions that may occur in the application.
In case any new type of exceptions occur, so this is the place where you may add your own exception handler.

Sample Exception Handler
```
 @ExceptionHandler(javax.validation.ConstraintViolationException.class)
    protected ResponseEntity<Object> handleConstraintViolation(
            javax.validation.ConstraintViolationException ex) {
        ApiError apiError = new ApiError(BAD_REQUEST);
        apiError.setMessage("Validation error");
        apiError.setDebugMessage("See validation errors for details");
        apiError.addValidationErrors(ex.getConstraintViolations());
        return buildResponseEntity(apiError);
    }
```

For more details @see RestExceptionHandler

Create your own execeptions and throw them from controller and handle them specifically into the advice.

Also, you may add ExceptionHandler for Throwable or Exception to handle any type of error generically.

