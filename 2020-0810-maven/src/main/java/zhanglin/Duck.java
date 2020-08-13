package zhanglin;

/**
 * @author: 张林
 * @Date :Created in 8:54 pm 10/08/2020
 */
public class Duck {
    private String name;
    private String age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
