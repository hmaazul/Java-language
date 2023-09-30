class Cal {
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }

    public double add(double n1, int n2){
        return n1+n2;
    }
}

public class methods {
    public static void main(String a[]){
        

        Cal obj = new Cal();
        int r1 = obj.add(3, 4, 5);
        System.out.println(r1);

        int r2 = obj.add(3, 8);
        System.out.println(r2);
    }
}
