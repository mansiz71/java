public class palindrome {
    public static void main(String[] args) {
        String name ="nitin";
        String rev=" ";
        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        if (name.equalsIgnoreCase(rev)){
            System.out.println("Its palindrome");
        }else{
            System.out.println("not palindrome");
        }
        System.out.println();
    }
}
