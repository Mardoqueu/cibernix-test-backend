package br.com.mardoqueu.cibernixtestebackend.services.exceptions;

public class ObjectNotFoundException extends  RuntimeException{

    public ObjectNotFoundException(String message){
        super(message);
    }
}
