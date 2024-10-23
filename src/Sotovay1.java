import java.io.File;
import java.util.*;

public class Sotovay1 {
    public static void main(String[] args) {

        ArrayList<Station> list = new ArrayList<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        // HashMap<String, Integer> map1 = new LinkedHashMap<>();// вывести в нужном порядке выводит в том порядке в ктором были добавленны даные
        int xa = 0;
        int ya = 0;
        try {
            Scanner sc = new Scanner(new File("note.txt"));
            int len = Integer.parseInt(sc.nextLine());
            System.out.println("len = " + len);
            for (int i = 0; i < len; i++) {
                String operator = sc.nextLine().trim();
                String[] stationData = sc.nextLine().split(" ");
                int x = Integer.parseInt(stationData[0]);
                int y = Integer.parseInt(stationData[1]);
                int r = Integer.parseInt(stationData[2]);
                list.add(new Station(operator, x, y, r));
            }
            System.out.println(list);
            xa = sc.nextInt();
            ya = sc.nextInt();
            System.out.println(xa);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("me have error!!");
        }
        for (int i = 0; i < list.size(); i++) {

            //System.out.println(map1);
            if (isAbonentNear(list.get(i).x, list.get(i).y, list.get(i).r, xa, ya)) {
                map1.put(list.get(i).operator, 1); //тру

            } else {
                map1.put(list.get(i).operator, 0); // фолс


            }

        }
        System.out.println(map1);

    }

    public static boolean isAbonentNear(int x, int y, int r, int xa, int ya) {
        double d = Math.sqrt(Math.pow(x - xa, 2) + Math.pow(y - ya, 2));
        return d < r ? true : false;
    }


}


class Station {
    String operator;
    int x;
    int y;
    int r;

    public Station(String operator, int x, int y, int r) {
        this.operator = operator;
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String toString() {
        return operator + " x= " + x + " y= " + y + " r= " + r;
    }
}




