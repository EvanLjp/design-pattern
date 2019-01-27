package basic.principles.demeter;

/**
 * @author :liujiapeng01
 * @date :2019-01-27 14:11
 **/
public class Test {
    public static void main(String[] args) {
        Boss boss=new Boss();
        TeamLeader teamLeader=new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }

}
