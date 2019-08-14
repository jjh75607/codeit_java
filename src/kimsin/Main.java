package kimsin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int getSurvivingIndex(int n, int k) {
        ArrayList<Integer> soldiers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            soldiers.add(i);
        }

        int killIdx = 0;
        while (soldiers.size() > 1) {
            killIdx = (killIdx + k - 1) % soldiers.size();

            System.out.println(soldiers.remove(killIdx) + "번 군사가 죽었습니다.");
        }

        return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(8, 3) + "번 자리에 서있으면 됩니다.");
    }
}