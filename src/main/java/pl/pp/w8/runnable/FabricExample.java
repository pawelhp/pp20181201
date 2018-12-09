package pl.pp.w8.runnable;

public class FabricExample {

    public static String name="ixi";

    public static void main(String[] args) {
        MyRunnabble one = new MyRunnabble();
        one.run();
        MyRunnabble two = new MyRunnabble();
        two.run();





    }


    private  Runnable makeRunnablrWithLambda(){

        return () -> {
            String name="pawel";
            System.out.println("smos: " + this);
        };
    }

    private static Runnable makeNewRunnable(){
        return new Runnable() {
            private String name ="pawel";
            @Override
            public void run() {
                String name ="gaweł";
                System.out.println("my naame: " + this.name);
            }
        };
    }
}

class MyRunnabble implements Runnable{

    private String name ="paweł";
    @Override
    public void run() {
        System.out.println("my name: " + this.name);
    }
}
