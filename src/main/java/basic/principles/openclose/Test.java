package basic.principles.openclose;

/**
 * @author :liujiapeng01
 * @date :2019-01-27 11:45
 **/
public class Test {

    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(10, "java course", 100d);
        System.out.println("course id:" + javaCourse.getId()
                + "course name:" + javaCourse.getName()
                + "course price:" + javaCourse.getPrice());

        ICourse javaDiscountCourse = new JavaDiscountCourse(10, "java course", 100d);

        JavaDiscountCourse discountCourse = (JavaDiscountCourse) javaDiscountCourse;
        System.out.println("course id:" + discountCourse.getId()+"  "
                + "course name:" + discountCourse.getName()+"  "
                + "course origin price" + discountCourse.getPrice()+"  "
                + "discount course price:" + discountCourse.getDiscountPrice());

    }
}
