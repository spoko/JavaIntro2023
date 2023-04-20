package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws NoFriendsException {

        try {
            FileReader.readFile("blah");
        }catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage() + "\nPlease try again");
            //some logic for a logger of the exception itself
        }catch (IOException e){
            System.out.println(e.getMessage() + "\nPlease try again");
            //some logic for a logger of the exception itself
        }finally {
            System.out.println("I am finally so will be executed always!");
        }

        try{
            FileReader.divide(2,0);
        }catch (ArithmeticException e){
            throw new NoFriendsException("You have no friends!");
        }
    }
}
