package Sesion13;

public class UserException extends Exception{
    public UserException(String message){
        super(" UserException : " + message);
    }
}
