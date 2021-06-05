package abstraction;

public class Tennis extends Cricket {
    @Override
    public void play() {
        super.play();
    }
    public void add(){
        System.out.println("It is additional method by me for more understanding");
    }


    public static void main(String[] args) {
        Tennis obj = new Tennis();
        obj.play();
        obj.exercise();
        obj.add();
    }
}
