package kimsin;

import java.util.ArrayList;

public class Main {
    public static int getSurvivingIndex(int n, int k) {
        ArrayList<Integer> peoples = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            peoples.add(i);
        }

        while (peoples.size() != 1) {
        }


        return 1;
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(8, 3) + "번 자리에 서있으면 됩니다.");
    }
}