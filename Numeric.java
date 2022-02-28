
public class Numeric{
    static void myMethod(int x){
       System.out.print("The integer value is ");
            if(x%2==0){
                System.out.println("even.");
            } else{
                System.out.println("odd.");
            }
            System.out.print("The square of the integer is ");
            System.out.println(x*x);
            System.out.print("The cube of the integer is ");
            System.out.println(x*x*x);
           
        }
    public static void main(String[] args) {
    myMethod(6);
    myMethod(5);
   
}
}