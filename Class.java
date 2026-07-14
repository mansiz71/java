class Calculator {
    int a;
    public int add(int num1,int num2){
        int r=num1+num2;
        return r;

    }

    
}
public class Class {
    public static void main(String[] args) {
        int n1=4;
        int n2=4;
        Calculator calc= new Calculator();
        int result=calc.add(n1,n2);
        System.out.println(result);
    }
}
