package ARRAY;


public class second_largest_element {
    public static void main(String[] args) {

        int [] arr ={1,5,4,22,9,2,1,7,3,4,15,12};
        int largest=0 ,second_largest=0;


        for (int i=0;i<arr.length;i++){

            if (largest<arr[i]){
                second_largest=largest;
                largest=arr[i];

            }
            else if (arr[i]<largest){
                if (arr[i]>second_largest){
                    second_largest=arr[i];
                }
            }
        }
        System.out.println(second_largest);

         
    }
}
