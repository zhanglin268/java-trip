package zhanglin;

/**
 * @author: 张林
 * @Date :Created in 6:50 pm 12/08/2020
 */
public class Duck3 {
    private String name;
    private String age;
    private Duck3 next;

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

    public Duck3 getNext() {
        return next;
    }

    public void setNext(Duck3 next) {
        this.next = next;
    }


    @Override
    public String toString() {
        return "Duck3{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", next=" + next +
                '}';
    }
}
