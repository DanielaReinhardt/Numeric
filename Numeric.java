public class Numeric{
    static void myMethod1(int x, int y){
       System.out.print("The integer value is ");
            if(x%2==0){
                System.out.println("even.");
            } else{
                System.out.println("odd.");
            }

            System.out.print("The integer value is ");
            if(y%2==0){
                System.out.println("even.");
            } else{
                System.out.println("odd.");
            }
        }

    static void myMethod2(int a, int b){
        System.out.print("The integer value is ");
            if(a%2==0){
                     System.out.println("even.");
             } else{
                     System.out.println("odd.");
                 }
                
                 System.out.print("The integer value is ");
                 if(b%2==0){
                          System.out.println("even.");
                  } else{
                          System.out.println("odd.");
                      }
                         
                  }
                    
             


    static void myMethod3(int z, int a){
        System.out.print("The square of the integer is ");
        System.out.println(z*z);
        System.out.print("The square of the integer is ");
        System.out.println(a*a);
    }

    static void myMethod4(int y, int b){
        System.out.print("The cube of the integer is ");
        System.out.println(y*y*y);
        System.out.print("The cube of the integer is ");
        System.out.println(b*b*b);

    }
    
    public static void main(String[] args) {
    myMethod1(6,3);
    myMethod2(5,4);
    myMethod3(1,2);
    myMethod4(5,9);
   
}
}