package basic.principles.openclose;

/**
 * @author :liujiapeng01
 * @date :2019-01-27 11:50
 **/
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }


}
