package pl.pp.w8.anonymous_classes;

public class MAin {

    public static void main(String[] args) {
        Animal monkey = new Monkey();

        /* klasa anonimowa - w miejscu tworzsymy klase co dziedziczy po animalu ale nie dajemy nazy dla tej nowej klasy*/
        Animal parrot = new Animal() {
            @Override
            public void printAnimal() {
                System.out.println("Parrot!");
            }
        };

        Animal duck = new Animal() {
            @Override
            public void printAnimal() {
                System.out.println("Dag!");
            }
        };

        AnimalProcessor processor = new AnimalProcessor();
        processor.processAnimal(monkey);
        processor.processAnimal(parrot);
        processor.processAnimal(duck);
        processor.processAnimal(new Animal() {
            @Override
            public void printAnimal() {
                System.out.println("Buba!");
            }
        });

        Monkey monkey2 = new Monkey(){
            @Override
            public void printAnimal(){
                System.out.println("mankey 2");
            }

        };

        ShowSecret secret = new ShowSecret() {
            @Override
            public void printSecret() {
                System.out.println("secret !!!!!");
            }
        };

        SecretProcessor secretProcessor = new SecretProcessor();
        secretProcessor.processSecret(secret);

        Moveable moveable1 = new Moveable() {
            @Override
            public void run() {
                System.out.println("buba1 - run");
            }

            @Override
            public void ply() {
                System.out.println("buba1 - fly");
            }
        };

        testMoveable(moveable1);

        testMoveable(new Moveable() {
            @Override
            public void run() {
                System.out.println("buba2 - run");
            }

            @Override
            public void ply() {
                System.out.println("buba2 - fly");
            }
        });


        Huaman huaman = new Huaman() {
            @Override
            public void method1() {
                System.out.println("H method 1 - a");
            }

            @Override
            public void method2() {
                System.out.println("H method 2 - a");
            }

            @Override
            public void method3() {
                System.out.println("H method 3 - a");
            }
        };

        testHuaMan(huaman);

        testHuaMan(new Huaman() {
            @Override
            public void method1() {
                System.out.println("H method 1 - b");
            }

            @Override
            public void method2() {
                System.out.println("H method 2 - b");
            }

            @Override
            public void method3() {
                System.out.println("H method 3 - c");
            }
        });


        SuperHeroProcessor gym = new SuperHeroProcessor();

    }

    public static  void testMoveable(Moveable moveable){
        moveable.run();
        moveable.ply();
    }

    public static void testHuaMan(Huaman huaman){
        huaman.method1();
        huaman.method2();
        huaman.method3();
    }
}
