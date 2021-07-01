package multithreading;

import org.jetbrains.annotations.NotNull;

public class AnonymousInnerClass {

    public static void main(String[] args) {

        //AnonymousInnerClass obj = new AnonymousInnerClass(); - we can create obj of class
                                         // but we can not create obj of interface
        // directly we define the method instead of creating constructor

        MyInterface myInterface = new MyInterface() {

            @Override
            public Integer add(int i, int j) {
                return i+j;
            }
        };
        System.out.println(myInterface.add(10,20));

    }
}

interface MyInterface {
    Integer add(int i , int j);
}