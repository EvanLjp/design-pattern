package basic.principles.interfacesegregation;

/**
 * @author :liujiapeng01
 * @date :2019-01-27 13:51
 **/
public class Dog implements ISwimAnimalAction, IEatAnimalAction {
    public void eat() {
        System.out.println("eat");
    }

    public void swim() {
        System.out.println("swim");
    }
}
