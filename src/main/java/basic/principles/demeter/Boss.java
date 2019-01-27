package basic.principles.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :liujiapeng01
 * @date :2019-01-27 14:02
 **/
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){

        teamLeader.checkNumberOfCourse();
    }
}
