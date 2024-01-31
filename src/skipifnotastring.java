public class skipifnotastring {
    public static void main(String[] args) {
        System.out.println(skip("bssappledah"));
        System.out.println(skip(("bccapphdfj")));
    }
    static String skip(String up){
        //base condition
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skip(up.substring(3));
        }
        else return up.charAt(0)+ skip(up.substring(1));
    }
}
