package access;

public class Product {
    //can be accessed from anywhere
    public String publicName;
    //can be accessed from the current class, outside class in the same package and subclass(inheritance) in different package
    protected String protectedName;//1
    //can be accessed from the current class, subclass class in the same package
    String defaultName;//1
    //only from the current class
    private String PrivateName;//0
    public final String finalName = "final name";

    //only form the current class
    private void privateMethod(){
        System.out.println("Calling private method...");
    }

    void defaultMethod(){
        System.out.println("Calling default method");
    }

    protected void protectedMethod(){
        System.out.println("Calling protected method");
    }

    public void publicMethod(){
        System.out.println("Calling public method");
    }

    public final void publicFinalMethod(){
        System.out.println("I cannot be changed!");
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.privateMethod();
        product.protectedName = "some";
    }
}
