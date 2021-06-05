package abstraction;

public class FootBall  extends Sport{
    @Override
    public void play() {
        System.out.println(" playing Football");
    }

    public static void main(String[] args) {
        FootBall obj = new FootBall();
        obj.play();
        obj.exercise();
    }
}
