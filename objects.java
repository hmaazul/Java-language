class Calculator {
    public int add(int num1,int num2){
        return num1+num2;
    }
}

class objects {
    public static void main(String a[]){
        // System.out.println("Hello World");

        int n1=3, n2=5;
        Calculator obj = new Calculator();
        int result = obj.add(n1,n2);
        System.out.println(result);
    }
} 