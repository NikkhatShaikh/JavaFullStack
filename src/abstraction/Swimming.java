package abstraction;

public class Swimming implements SportInterface,Sport2Interface{
    @Override
    public void play() {
        System.out.println("Playing Swim");
    }


    public static void main(String[] args) {
        Swimming obj = new Swimming();
        obj.play();

    }
}
