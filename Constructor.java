class Human{
    private String name;
    private int age;
    
    // constructor -- for default values
    public Human(){
        name = "Maaz";
        age = 22;
    }

    // parameterized constr.
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

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

public class Constructor {

    public static void main(String a[]){
        Human h1 = new Human(); //from here default constr. is called when new human is being executed

        System.out.println(h1.getName() + " : " + h1.getAge());

        

        Human h2 = new Human("Maazul Haque", 23);
        System.out.println(h2.getName()+" : "+ h2.getAge() );

    }
}
