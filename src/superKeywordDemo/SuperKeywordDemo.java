package superKeywordDemo;


 class A { // parent , superclass
    int i = 10;

    public void display (){
        System.out.println(" In Display ");
    }

    public A(){
        super();
        System.out.println(" in Constructor A");
    }
    public A(int i){
        System.out.println("parametrized constructor");
    }
}


class B extends A{  // sub , childclass

    int i =6;

    public void show (){
        super.display();
        System.out.println(super.i);
    }

    public B(){
        System.out.println("in B constructor");
    }
}


class C extends B {

    public C(){
        super();
        System.out.println("in C Constructor ");
    }

}
public class SuperKeywordDemo{
    public static void main(String args[]){
        C obj = new C();

    }
}
