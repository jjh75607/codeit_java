package scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean menu = true;
        Scanner scanner = new Scanner(System.in);

        while (menu) {
            System.out.println("(I)ntro (C)ourses (E)xit");

            String inputValue = scanner.next();

            switch (inputValue) {
                case "E":
                case "e":
                    System.out.println("안녕히 가세요.");
                    menu = false;
                    break;

                case "I":
                case "i":
                    System.out.println("안녕하세요! 우리는 코드잇입니다.\n함께 공부합시다!");
                    break;

                case "C":
                case "c":
                    boolean classMenu = true;

                    while (classMenu) {
                        System.out.println("코드잇 수업을 소개합니다.\n(P)ython (J)ava (i)OS (B)ack");
                        String studyClass = scanner.next();

                        switch (studyClass) {
                            case "p":
                            case "P":
                                System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\n" +
                                        "강사: 강영훈\n" +
                                        "추천 선수과목: 없음");
                                break;

                            case "J":
                            case "j":
                                System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\n" +
                                        "강사: 김신의\n" +
                                        "추천 선수과목: Python");
                                break;

                            case "I":
                            case "i":
                                System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\n" +
                                        "강사: 성태호\n" +
                                        "추천 선수과목: Python, Java");
                                break;
                            case "b":
                            case "B":
                                classMenu = false;
                                break;
                        }
                    }
            }
        }
    }
}
