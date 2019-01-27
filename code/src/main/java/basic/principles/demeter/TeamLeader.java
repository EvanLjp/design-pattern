package basic.principles.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :liujiapeng01
 * @date :2019-01-27 14:03
 **/
public class TeamLeader {

    public void checkNumberOfCourse(){
        List<Course> courseList=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            courseList.add(new Course());
        }
        System.out.println("course number:"+courseList.size());
    }
}
