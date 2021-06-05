package polymorphism;


import package2.C;

/**method overriding - if two classes havong same method name
 * with same parameter/argument
 * dynamicbinding - late binding- runtime polymorphism
 * Advantages - you are changing existing method of parent class
 */

public class Animal {
    public void sound() {
        System.out.println("animal Sound");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("cat sound"); // dynamic dispatch method
    }

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }
}

class Dog extends Animal{

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }
}