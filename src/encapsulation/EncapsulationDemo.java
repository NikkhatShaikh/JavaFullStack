package encapsulation;

public class EncapsulationDemo {

    private int id;
    private String name;
    private int age;

    public void setId(int id){
        if (id==0){
            System.out.println("Your id is 0");
        }else{
            this.id=id; }
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name ;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
     return age;

    }
    public void setAge(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setId(11);
        obj.setName("Shaikh Nikkhat");
        obj.setAge(25);

    }
}