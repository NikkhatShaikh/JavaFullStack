package finalKeywordDemo;

public class FinalKeywordDemo {  // Class Not inherit

    final  int i = 10;           // Constant variable => can not change the value


    public static void main(String args[]){
        FinalKeywordDemo obj = new FinalKeywordDemo();
    }

    public void show(){ //  method can not override

        int i = 5;
        System.out.println(i);
    }
}

class Final2KeywordDemo extends FinalKeywordDemo{
    @Override
    public void show() {
        System.out.println(" in final 2 show");
    }
}