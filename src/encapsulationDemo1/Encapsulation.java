package encapsulationDemo1;

public class Encapsulation {

    private int id;
    private  String name;
    private int age;

    public void setId(int id){
        if(id==0){
            System.out.println(" your id is 0");
        }else {
            this.id = id;
        }
    }

    public int getId(){
        return id;

    }

    public void setName( String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }


    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setId(1);  // if id =0 get msg ur id 0
        obj.setName("Nikkhat");
        obj.setAge(25);
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}

