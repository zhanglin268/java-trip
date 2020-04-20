/**
 * @program:20200420
 * @description
 * @author: 张林
 * @creat:2020-04-20 14:22
 **/
public class TestDemo {
    //创建一个原始的二维数组11*11；
    //0表示没有棋子，1表示黑子，2表示篮子
    public static void main(String[] args) {
        int [][] chessArr1 = new int [11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[5][6] = 2;
        //输出二维数组
        System.out.println("原始的二维数组");
        for(int [] row:chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        //将二维数组转化为洗漱数组的思想
        //1.先遍历二维数组得到非零的个数
        int sum = 0;
        for(int i = 0;i < 11 ;i++) {
            for(int j = 0;j < 11;j++) {
                if(chessArr1[i][j] != 0) {
                    sum++;
                }
            }

        }
        //2.创建对应的稀疏数组
        int sparseArr[][] = new int [sum+1][3];
        //给数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        //遍历二维数组，将非零的值存放到sparsearr中
        int count = 0;
        for(int i = 0;i < 11 ;i++) {
            for(int j = 0;j < 11;j++) {
                if(chessArr1[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }

        }
        //输出稀疏数组
        System.out.println();
        System.out.println("稀疏数组");
        for(int i= 0;i < sparseArr.length;i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }
        System.out.println();
        //将稀疏数组回复成二维数组
        //1.先读取稀疏数组的第一行，根据第一行的数据创建原始的二维数组，
        //2,读取稀疏数组后几行，并赋给原始的二维数组即可



        //先读取稀疏的第一行根据第一行的数据，创建原始的第二行数组
        int[][] chessArr2 = new int[sparseArr[0][0]][sparseArr[0][1]];
        //输出回复后的二维数组
        //2.在读取稀疏数组的后几行的数据，从第二行开始，并赋给原始的二维数组即可
        for(int i = 1;i < sparseArr.length;i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        System.out.println();
        System.out.println("回复后的二维数组");
        for(int [] row:chessArr2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }


        System.out.println();







    }



}
