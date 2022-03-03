
public class Numeric{
    static void myMethod1(int x){
       System.out.print("The integer value is ");
            if(x%2==0){
                System.out.println("even.");
            } else{
                System.out.println("odd.");
            }
               
        }

    static void myMethod2(int a){
        System.out.print("The integer value is ");
            if(a%2==0){
                     System.out.println("even.");
             } else{
                     System.out.println("odd.");
                 }
                    
             }


    static void myMethod3(int z){
        System.out.print("The square of the integer is ");
        System.out.println(z*z);
    }

    static void myMethod4(int y){
        System.out.print("The cube of the integer is ");
        System.out.println(y*y*y);

    }
    
    public static void main(String[] args) {
    myMethod3(6);
    myMethod1(5);
   
}
}