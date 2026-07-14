// write the java code pratice of operators
public class Demo {
    public static void main(String[] args) {
        //AND OR NOT logicval operators
        int x=7;
        int y=5;
        int a=5;
        int b=9;
        boolean result=  a>b  && x>y;
        boolean result1= a<b && x<y;
        boolean result2= a>b && x<y;
        boolean result4= a<b && x>y;
        boolean result5=  a>b  || x>y;
        boolean result6= a<b || x<y;
        boolean result7= a>b || x<y;
        boolean result8= a<b || x>y;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        //arthimatic operators
        int num1=15;
        int num2=4;
        int sum=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int module=num1%num2;
        System.out.println("sum"+sum);
        System.out.println("sub"+sub);
        System.out.println("mul"+mul);
        System.out.println("div"+div);
        System.out.println("module"+module);
        int num=7;
        num= num+1;
        System.out.println(num);
        num+=1;
        System.out.println(num);
         int num3=8;
         num3++;  //post increment fetch the value then incerment 
        System.out.println(num3);
        int num4=9;
        ++num4;//pre increment increment the number then fetch the value 
        System.out.println(num4);
        int num5=67;
        num5--;//post decrement
        System.out.println(num5);
        int num6 =89;
        --num6;//pre decrement
        System.out.println(num6);
        //compeare 
        //assignment operator =
        //<,>,==,!=,<=,>= compare 
        int c=6;
        int d=5;
        int e=6;
        boolean less=c<d;
        boolean great=c>d;
        boolean equal= c==d;
        boolean equal1= c==e;
        boolean lessthan=c<=d;
        boolean greatthan=c>=d;
        boolean notequal= c!=d;
        System.out.println(less);
        System.out.println(great);
        System.out.println(equal);
        System.out.println(equal1);
        System.out.println(lessthan);
        System.out.println(greatthan);
        System.out.println(notequal);
        }
}
