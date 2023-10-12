class Mobile {
    String brand;
    int price;
    static String name;
    static{
        name= "phone";
    }
}

public class Static_keyword {
    
    public static void main(String a[]){
        Mobile m1 = new Mobile();

        Mobile m2 = new Mobile();

        m1.brand = "Nokia";
        m1.price = 10000;
        // m1.name = "Phone";

        m2.brand = "Apple";
        m2.price = 20000;
        // m2.name = "Cell";

        System.out.println(m1.brand +" : "+ m1.price+" : "+m1.name);
        System.out.println(m2.brand +" : "+ m2.price+" : "+m2.name);

    }
}
