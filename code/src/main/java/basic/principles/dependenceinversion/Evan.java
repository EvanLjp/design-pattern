package basic.principles.dependenceinversion;

/**
 * @author :liujiapeng01
 * @date :2019-01-27 12:07
 **/
public class Evan {


    private ICourse iCourse;
    public void studyJavaCourse(){
        System.out.println("evan study java");
    }

    public void studyFeCourse(){
        System.out.println("evan study FE");


    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
       iCourse.studyCourse();
    }
}
