
public class Max {
    public static void main(String[] args) {


       int[] arr = {1, 3, 5, 7, 9};

       int max = arr[0];

       for (int i = 0; i < arr.length; i++) {
           if (max < arr[i]) {
               max = arr[i];
           }
       }
        System.out.println(max);
    }
}