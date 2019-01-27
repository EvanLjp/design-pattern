package basic.principles.singleresponsibility;

/**
 * @author :liujiapeng01
 * @date :2019-01-27 13:32
 **/
public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.manMoveMode("大雁");
        bird.manMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
flyBird.manMoveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.manMoveMode("鸵鸟");
    }



}
