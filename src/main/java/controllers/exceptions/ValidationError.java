package br.com.client.controllers.exceptions;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends br.com.client.controllers.exceptions.StandardError {

    private List<br.com.client.controllers.exceptions.FieldMessage> errors = new ArrayList<>();

    public ValidationError(Instant timestamp, Integer status, String error, String message, String path) {
        super(timestamp, status, error, message, path);
    }

    public List<br.com.client.controllers.exceptions.FieldMessage> getErrors() { return errors; }

    public void addError(String fieldName, String message) {
        errors.add(new br.com.client.controllers.exceptions.FieldMessage(fieldName, message));
    }
}