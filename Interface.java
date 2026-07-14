
class A {
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in a show");}
}
class B extends A {
    @Override

    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in b show");
}
} 
public class Interface
{
    public static void main (String a[])
    {B obj=new B();
        obj.showTheDataWhichBelongsToThisClass();
    }

}
