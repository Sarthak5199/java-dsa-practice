package ARRAY;

public class array_insertion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40,0};  // last element empty
        int pos = 2;  // insert at index 2
        int newValue = 25;

        for (int i = arr.length - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = newValue;
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }



    }
}
