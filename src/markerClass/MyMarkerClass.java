package markerClass;

interface MarkerInterface {
}
public class MyMarkerClass implements MarkerInterface {

    public void show(){
        System.out.println("In Show ");
    }

    public static void main(String[] args) {
        MyMarkerClass obj = new MyMarkerClass();


        if(obj instanceof MarkerInterface){
            obj.show();
        }
    }
}