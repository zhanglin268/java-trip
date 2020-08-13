package zhanglin;
import  java.util.List;
/**
 * @author: 张林
 * @Date :Created in 7:17 pm 12/08/2020
 */
public class DuckShop {
    private List<Duck> ducks;

    @Override
    public String toString() {
        return "DuckShop{" +
                "ducks=" + ducks +
                '}';
    }

    public List<Duck> getDucks() {
        return ducks;
    }

    public void setDucks(List<Duck> ducks) {
        this.ducks = ducks;
    }
}
