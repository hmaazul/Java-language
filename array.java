public class array {
    public static void main(String a[]){

        int num[] = new int[4];

        for(int i=0;i<4;i++){
            num[i] = (int) (Math.random() *10);
        }

        System.out.println("1-D Array");
        for(int i: num){
            System.out.print(i + " ");
        }
        System.out.println();

        // Jagged Array

        int arr[][] = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[2];

        // assigning values in array
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = (int) (Math.random() *10);
            }
        }

        System.out.println("Jagged Array");
        // output
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
