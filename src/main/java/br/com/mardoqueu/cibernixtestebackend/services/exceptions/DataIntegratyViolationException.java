package br.com.mardoqueu.cibernixtestebackend.services.exceptions;

public class DataIntegratyViolationException extends  RuntimeException{

    public DataIntegratyViolationException(String message){
        super(message);
    }
}
