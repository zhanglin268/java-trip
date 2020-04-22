/**
 * @program:20200422
 * @description
 * @author: 张林
 * @creat:2020-04-22 09:51
 **/
public class TestDemo {
    public static void main(String[] args) {
        ArrayListA ArrayListA1 = new ArrayListA();
        for(int i = 0;i < 8;i++) {
            ArrayListA1.addList(i,i);
        }
        ArrayListA1.diaplay();
        ArrayListA1.addList(7,11);
        System.out.println();
        System.out.println("############");
        ArrayListA1.diaplay();
        System.out.println();
        System.out.println(ArrayListA1.toFind(11));
        System.out.println();
        System.out.println( ArrayListA1.search(11));
        ArrayListA1.diaplay();
        System.out.println();
       // ArrayListA1.getPos(3);

        System.out.println( ArrayListA1.getPos(3));
        ArrayListA1.remove(4);
        ArrayListA1.diaplay();
        System.out.println("#########");
        ArrayListA1.clear();
        System.out.println();
    }
}
