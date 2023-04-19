package oop;

public abstract class AbstractDemo implements PetActions {

    private String absDemoName;//

    public AbstractDemo(String absName){
        absDemoName = absName;
    }

    public AbstractDemo(){

    }

    //abstract method
    public abstract void repeatTheWord();

    //non-abstract method
    public void printHello(/*parameters here*/){
        System.out.println("Hello :)");
    }

    public final void finalMethodInAbstractClass(){
        System.out.println("I am final!!!");
    }
}
