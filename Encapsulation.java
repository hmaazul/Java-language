class Human {
    private String name;
    private int age;

    // setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    // getter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


}

public class Encapsulation {
    public static void main(String a[]){

        Human h1 = new Human();

        h1.setName("Maaz");
        h1.setAge(23);
        System.out.println(h1.getName());
        System.out.println(h1.getAge());
    }
}
