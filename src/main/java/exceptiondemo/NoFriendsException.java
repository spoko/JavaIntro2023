package exceptiondemo;

public class NoFriendsException extends Exception {//our custom exception will be checked shall be caught or trown

    public NoFriendsException(String message){
        super(message);
    }
}
