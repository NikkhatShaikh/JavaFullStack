package abstraction;

public class Swimming implements SportInterface,Sport2Interface {

    @Override
    public void play() {
        System.out.println("Playying Swim");
    }

    public static void main(String[] args) {
        Swimming obj = new Swimming();
        obj.play();

    }
}
