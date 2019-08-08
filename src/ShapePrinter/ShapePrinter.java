package ShapePrinter;

public class ShapePrinter {
    public void printFloydsPyramid(int height) {
        int count = 1;
        int maxValueLength = String.valueOf(height * (height + 1) / 2).length();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                int nowLength = maxValueLength - String.valueOf(count).length() + 1;

                if (count < 10) {
                    System.out.printf("%" + nowLength + "d ", count);
                } else {
                    System.out.printf("%" + (nowLength + 1) + "d ", count);
                }
                count++;
            }
            System.out.println();
        }
    }
}
