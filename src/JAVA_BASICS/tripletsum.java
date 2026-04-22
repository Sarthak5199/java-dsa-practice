package JAVA_BASICS;

public class tripletsum {

    public static void main(String[] args) {
        int []arr ={-1, 0, 1, 2, -1, -4};

        for (int i=0;i<= arr.length-3;i++){

            // first loop
            for (int j=i+1;j<= arr.length-2;j++){
                // second loop
                for (int k=j+1;k<= arr.length-1;k++){
                    if (arr[i]+arr[j]+arr[k]==0){
                        if (arr[i]!=arr[j]&&arr[i]!=arr[k]&&arr[j]!=arr[k]){
                            System.out.println("found  "+arr[i]+"  "+arr[j]+"  "+arr[k]);
                        }
                    }
                }
            }
        }
    }
}
