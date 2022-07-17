import java.util.Scanner;
public class Lost {
    protected int[] lostDate = new int[30];//用数字代表日期
    protected String lostLocation;
    protected String name;

    public void lost(String Name, int Time[], String place) {
        name = Name;
        lostLocation = place;
        for (int i = 0; i < 30; i++) {
            lostDate[i] = Time[i];
        }
    }

    public void sortLost() {
        int i, j, tem;
        for (i = 0; i < 29; i++) {

            for (j = 0; j < 29; j++) {
                if (lostDate[j] > lostDate[j + 1]) {
                    tem = lostDate[j];
                    lostDate[j] = lostDate[j + 1];
                    lostDate[j + 1] = tem;

                }
                //冒泡排序
            }
        }

    }

    public int selectByKeywords() {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入丢失日期：\n");
        int date = scan.nextInt();
        int d;
        for (int i = 0; i < 30; i++) {
            if (date == lostDate[i]) {
               d=i;
            }
        System.out.println("丢失物品可能是：");

        }

        return 0;
    }

    public static void main(String[] args) {
      Lost lost=new Lost();


    }
}

