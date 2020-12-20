
package shivaafoundation.javatutorial;


interface A2 {
    void meth1();
    void meth();
    
}
interface B1 extends A2{
    void meth3();
}
class Myclass implements B1{
    public void meth1(){
        System.out.println("Implement meth1().");
        
    }
    public void meth2(){
        System.out.println("Implement meth2().");
}
    public void meth3(){
        System.out.println("Implement meth3().");
    }
    class IFExtend{
        public static void main(String args[]){
            Myclass ob = new MyClass();
            ob.meth1();
            ob.meth2();
            ob.meth1();
        }
    }
}