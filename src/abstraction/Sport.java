package abstraction;

// abstracttion -- hiding details


public  abstract class Sport {      // class is declared by abstract keyword

    Sport(){
        System.out.println(" in count ");
    }
     public abstract void play(); // declaring method accessed in another class
    public void exercise(){           // defining method
        System.out.println("Do exercise");

    }

    public static void main(String[] args) {
        Sport obj = new Sport() {
            @Override
            public void play() {
System.out.println("Playing game");
            }
        };
    }
}

