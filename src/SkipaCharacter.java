public class SkipaCharacter {
    public static void main(String[] args) {
        skip("","baccdah");
        System.out.println(skipp("baccdah"));
    }

    static void skip(String p, String up){
        // base condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch=='a'){
            skip(p , up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }

    //using return type as string

    static String skipp(String up){
        //base condition
        if(up.isEmpty()){
            return " ";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skipp(up.substring(1));
        }else{
            return ch + skipp(up.substring(1));
        }
    }




}
