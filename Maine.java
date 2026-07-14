public class Maine {
    static int plusMethodInt(int x,int y)
{
    return x+y;
}    
static double plusMethodIntDouble(double x, double y)
{
    return x+y;
}
public static void main(String[] args) {
    int mynum1=plusMethodInt(8, 10);
    double mynum2=plusMethodIntDouble(5.7,4.7);
    System.out.println("int:"+mynum1);
    System.out.println("double"+mynum2);
}
}
