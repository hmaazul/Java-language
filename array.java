public class array {
    public static void main(String a[]){

        int num[] = new int[4];

        for(int i=0;i<4;i++){
            num[i] = (int) (Math.random() *10);
        }

        for(int i: num){
            System.out.print(i + " ");
        }
    }
}
