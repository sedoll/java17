package sec1;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        //키보드로 학번과 세 과목 점수를 입력받아
        //총점, 평균, 학점, 판정, 등급 등을 계산하여 출력하도록 하시오.
        //tot(총점), avg(평균), hak(학점), pan(판정), grd(등급)
        //총점 = 전산 + PG + OA
        //평균은 세 과목의 점수의 총점을 3으로 나눈 실수
        //학점은 평균이 96이상 A+, 93이상 A0, 90이상 A-
        //86이상 B+, 83이상 B0, 80이상 B-
        //76이상 C+, 73이상 C0, 70이상 C-
        //66이상 D+, 63이상 D0, 70이상 D-
        //나머지는 F
        //판정은 평균이 80이상이면서, 세 과목 모두 70이상이면, "합격", 아니면, "불합격"
        //등급은 평균을 20으로 나눈 값으로 하되, 5이면, 5등급, 4이면, 4등급, 3이면, 3등급,
        //2이면, 2등급, 1이면, 1등급
        //출력형식
        //학번    전산  PG  OA  총점  평균      학점  판정  등급
        //XXX    XXX  XXX  XXX XXX  XX.XX   XX     XX   X등급

        Scanner sc = new Scanner(System.in);

        System.out.println("학번[세자리숫자] : ");
        String bun = sc.nextLine();
        System.out.println("전산 점수 입력[0-100] : ");
        int ed = sc.nextInt();
        System.out.println("프로그래밍 점수 입력[0-100] : ");
        int pg = sc.nextInt();
        System.out.println("사무자동화 점수 입력[0-100] : ");
        int oa = sc.nextInt();

        int tot = ed + pg + oa;
        float avg = tot / 3.0f;
        String hak = "";
        if(avg>=90){
            hak = "A";
        } else if(avg>=80){
            hak = "B";
        } else if(avg>=70){
            hak = "C";
        } else if(avg>=60){
            hak = "D";
        } else {
            hak = "F";
        }

        int na = (int) avg % 10;

        if(avg>=60) {
            if(na>=6) {
                hak+="+";
            } else if(na>=3){
                hak+="0";
            } else {
                hak+="-";
            }
        }

        String pan = "불합격";
        if(avg>=80 && ed>=70 && pg>=70 && oa>=70) pan = "합격";

        int grade = (int) avg / 20;

        System.out.println("학번\t 전산\t PG\t OA\t 총점\t 평균\t 학점\t 판정\t등급");
        System.out.printf("%3s\t%3d\t\t%3d\t%3d\t %3d\t %3.2f\t %3s\t %3s\t%3s\n",
                bun, ed, pg, oa, tot, avg, hak, pan, grade);
    }
}
