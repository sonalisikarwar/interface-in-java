
package shivaafoundation.javatutorial;

class A1 {
    public interface NestedIF{
        boolean isNotNegative(int x);
        
    }
}
class B implements A1.NestedIF {
   boolean isNotNegative(int x){ 
       return x < 0 ? false: true;
   }
    
}
class NestedIFDemo{
    public static void main(String args[]){
        A1.NestedIF nif = new B();
        if(nif.isNotNegative(10))
            System.out.println("10 is not negative");
                if(nif.isNotNegative(-12))

        System.out.println("This won't be displayed");
    }

}
