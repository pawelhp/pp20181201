package pl.pp.w8.anonymous_classes.sub_pack;

public class Gardener {

    public void processPannt(Plant plant){
        plant.grow();
        plant.smell();
        plant.wilt();
    }


    public static void main(String[] args) {
        Gardener gardener = new Gardener();

        Plant plant1 = new Plant(){
            @Override
            public void grow() {
                System.out.println("grow 1");
            }

            @Override
            public void smell() {
                System.out.println("smell 1");
            }

            @Override
            public void wilt() {
                System.out.println("wilt 1");
            }
        };


        Plant plant2 = new Plant(){
            @Override
            public void grow() {
                System.out.println("grow 2");
            }

            @Override
            public void smell() {
                System.out.println("smell 2");
            }

            @Override
            public void wilt() {
                System.out.println("wilt 2");
            }
        };



        gardener.processPannt(plant1);
        gardener.processPannt(plant2);
        gardener.processPannt(new Plant() {

            @Override
            public void grow() {
                System.out.println("grow 3");
            }

            @Override
            public void smell() {
                System.out.println("smell 3");
            }

            @Override
            public void wilt() {
                System.out.println("wilt 3");
            }
        });

        gardener.processPannt(new Plant() {

            @Override
            public void grow() {
                System.out.println("grow 4");
            }

            @Override
            public void smell() {
                System.out.println("smell 4");
            }

            @Override
            public void wilt() {
                System.out.println("wilt 4");
            }
        });
    }
}
