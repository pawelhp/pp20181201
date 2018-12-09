package pl.pp.w8.anonymous_classes;

public class SuperHeroProcessor {
    public void trainHero(Moveable hero){
        for(int i = 0; i < 1000; i++){
            hero.run();
            hero.ply();
        }
    }
}
