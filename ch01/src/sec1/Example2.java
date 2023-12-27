package sec1;

public class Example2 {
    public static void main(String[] args) {
        boolean a = true;   //논리형 변수 - 1byte
        byte b = 127;   //바이트 변수 : -128~127 - 1byte
        char c = 'k';   //문자 변수 - 2byte
        short d = 32767;    //반정도정수 : -32768~32767 - 2byte
        int e = 785367800;    //단정도정수 : 4byte
        long f = 7853678000L; //배정도정수 : 4byte -> 8byte
        //348670.2478 => + 10의 6승 X 3486702478
        float g = 3.141592f;    //단정도실수 -> 4byte
        double h = 3.141592;    //배정도실수 -> 8byte
        double i = 3.141592000000000000008d;

        int j = 8;
        int k = j + 20;

        System.out.println("a="+a);
        System.out.println("b="+b);

        //표현범위 : - 2의 n-1승 ~ 2의 n-1 승 - 1
        //프리미티브 타입 변수는 표현범위가 있으며, 표현범위를 벗어나면, 오류
        //반드시, 초기화되어야 한다.
    }
}
