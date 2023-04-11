package access;

public class Test extends Product {
    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println(product1.publicName);
        System.out.println(product1.defaultName);
        System.out.println(product1.protectedName);

        product1.defaultMethod();
        product1.protectedMethod();
        product1.publicMethod();
        //we cannot change the value of a final instance variable
        //product1.finalName = "new name";
    }
    //we cannot override final method as well
//    public void publicFinalMethod(){
//
//    }
}
