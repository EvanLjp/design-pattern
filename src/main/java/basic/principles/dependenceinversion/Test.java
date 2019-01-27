package basic.principles.dependenceinversion;

/**
 * @author :liujiapeng01
 * @date :2019-01-27 12:08
 **/
public class Test {
    public static void main(String[] args) {
        Evan evan=new Evan();
        evan.studyJavaCourse();
        evan.studyFeCourse();


        evan.setiCourse(new JavaCourse());
        evan.studyCourse();
        evan.setiCourse(new FECourse());
        evan.studyCourse();
    }
}
