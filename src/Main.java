import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fileRead("note.txt");
        ArrayList <Station> list = new ArrayList<>();
        HashMap <String, Integer> map1 = new HashMap<>();
        int xa = 0; // координаты абонента (5 и 5)
        int ya = 0;




    }
    public static void fileRead(String fileName) {
        try {
            Scanner str = new Scanner(new File(fileName));
            int n = Integer.parseInt(str.nextLine());
            System.out.println(n);
            String[] mass = new String[12];
            for (int i = 0; i < mass.length; i++) {
                //mass[i] = str.nextLine().split(" ");
                //int x = Integer.parseInt()
                System.out.println(mass[i] + "  ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("ошибка чтения");
        }
    }
}
class Station1{
   String operator;
   int x;
   int y;
   int r;

    public Station1(String opretor, int x, int y, int r) {
        this.operator = opretor;
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String toString() {
        return operator+ " x = " + x+ "y =  " + y+ " r= "+r;
    }
}
