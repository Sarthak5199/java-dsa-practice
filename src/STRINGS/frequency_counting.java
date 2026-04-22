package STRINGS;

public class frequency_counting {

    public static void main(String[] args) {
/*
        //intput= aaaaabbbgggkkk
        // output=a5b3g3k3
        String in="aaaaabbbgggkkkaabb";
        String out="";
        int count=1;
        for (int i=1;i<in.length();i++){


            if (in.charAt(i)==in.charAt(i-1)){
                count++;
            }

            else {
                out = out + in.charAt(i-1) + count;
                count=1;
            }


        }
        out = out + in.charAt(in.length()-1) + count;

        System.out.println(out);
    }
}
*/

        String input = "aaaaaaaabbcddddd";
        String  output="";
        int count=1;

        for (int i=1;i<input.length()-1;i++){
            if (input.charAt(i)==input.charAt(i-1)){
                count++;
            }
            else {
                output = output+input.charAt(i-1)+count;
                count=1;
            }
        }
        output=output+input.charAt(input.length()-1)+(count+1);
        System.out.println(output);

    }
}
