package inheritance;

public class Child extends GrandFather{
    public static void main(String[] args) {
        Child child=new Child();
        child.id=3;
        child.name="Farhan Shaikh";
        child.display();
    }
}
