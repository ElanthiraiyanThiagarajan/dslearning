package soliddesignpattern.liskov.birdexample;

import functionalAndReactive.functional.section5.Soundcard;

public class Eagle extends Bird{
    @Override
    public void move() {
        System.out.println("Eagle will Fly");
    }
}
