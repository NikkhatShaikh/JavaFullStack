package abstraction;

public class Cricket extends Sport{
    @Override
    public void play() {
System.out.println("playing cricket");
    }

    public static void main(String[] args) {
        Cricket obj=new Cricket();
        obj.play();
        obj.exercise();
    }
}
