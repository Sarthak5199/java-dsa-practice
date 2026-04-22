package STRINGS;

public class hash_movement {

    public static void main(String[] args) {
        // input ###move##thehash##to##forward
        // output #########movethehashforward
        String in="###move##thehash##to##forward";
        String out="";
        int count =0;
        for (int i=0;i<in.length();i++){
            if (in.charAt(i) == '#') {

                count++;
            }
        }
        for (int i=0;i<count;i++){
            out = out +"#";

        }
        for (int i=0;i<in.length();i++){
            if (in.charAt(i)!='#'){
                out= out+in.charAt(i);
            }
        }
        System.out.println(out);
    }
}
