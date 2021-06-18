package polymorphism1;

public class Animal {

    // method overriding = if two classes have same method name with same parameter
    // advantages -> you are changing existing method of parent class.
    // Dynamic Binding  -> late binding -> run time polymorphism

    public void sound(){
        System.out.println(" Animal Sound");
    }
}

class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("cat sound");
    }
}

class Donkey {
    public void sound() {
        System.out.println(" Donkey Sound");

    }

}
class Dog extends Cat
{
   @Override
    public void sound() {
       System.out.println(" Dog sound");
    }

    public static void main(String[] args) {
       Dog dog=new Dog();
       dog.sound();

       Donkey donkey=new Donkey();
       donkey.sound();

    }
}
