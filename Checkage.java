public class Checkage {
    static void CheckAge(int age){
        if(age<18){
            System.out.println("access denied-you are not old enough!");
        }else{
            System.out.println("access granted-you are old enough");
        }
    }
   public static void main(String[] args) {
    CheckAge(20);
   } 
}
