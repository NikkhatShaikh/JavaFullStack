package abstraction;

public class Football extends Sport {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }

    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();
        obj.exercise();
    }
}
