package untitled.src.Model;

public class TestCustomer {
    public TestCustomer(){
        testCustomerClass();
    }
    public static void testCustomerClass(){
        System.out.println("Testing Customer Class");
        Customer c1 = new Customer();
        if(c1 != null){
            System.out.println(c1.getPhoneNumber());
            System.out.println(c1.getName());
            System.out.println(c1.getAddress());
        }
        else{
            System.out.println("There was an issue testing customer class");
        }
        c1.setPhoneNumber("678-432-1234");
        c1.setName("John Doe");
        c1.setAddress("156 Atherton Lane");


        //c1.displayCustomer();
        System.out.println(c1.toString());

    }
}