package basic.principles.openclose;

/**
 * @author :liujiapeng01
 * @date :2019-01-27 11:44
 **/
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;

    private Double price;



    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
