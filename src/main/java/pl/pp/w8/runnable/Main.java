package pl.pp.w8.runnable;

class MyClass implements Runnable{

    @Override
    public void run() {
        System.out.println("cos tam z myclass punkt 1");
    }
}

public class Main {

    public static void main(String[] args) {
        // 1 - zwykła klasa implementująca runnable
        // 2  klasa anonimowa - z zachowaniem referencji
        // 3 klasa anonimowa - przekazana jako parametr
        // lambda
        MyClass myClass1 = new MyClass();
        processRunnable(myClass1);

        // tu tworzymy nową klasę ( ale anonimową )
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println(" cos tam punkt 2");
            }
        };
        processRunnable(runnable);

        processRunnable(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("cos tam punkt 3");
                    }
                }
        );


        Runnable r = () -> System.out.println("cos tam punkt 4");
        processRunnable(r);
        processRunnable(() -> System.out.println("cos tam punkt 5"));


    }

    private static void processRunnable(Runnable runnable){

        System.out.println("inside processRunnable");
        runnable.run();
        System.out.println("after run()");
    }
}
