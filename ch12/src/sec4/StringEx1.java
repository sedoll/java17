package sec4;

import java.util.Arrays;

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = new String("KimGiTae");
        String str2 = "kimkitae";
        System.out.println("name : "+str1);
        System.out.println("네 번째 글자 : "+str1.charAt(3));
        System.out.println("문자열 비교 : "+str1.equals(str2));

        byte[] bArr = str1.getBytes(); //문자열을 바이트배열로 분리
        System.out.print("byte[] 의 출력 : ");
        //첫 번째 방법 : 별도의 메소드를 호출하여 반복문으로 출력
        printArr(bArr);
        System.out.println();
        //두 번째 방법 : Arrays.toString(배열명);
        char[] cArr = new char[bArr.length];
        for(int i=0;i<bArr.length;i++){
            cArr[i] = (char) bArr[i];
        }
        System.out.println(Arrays.toString(cArr));
        System.out.println("i는 몇 번째? "+(str1.indexOf("i"))); //특정 문자의 인덱스 구하기
        System.out.println("인덱스가 3부터 6전 까지 : "+(str1.substring(3, 6)));
        System.out.println("소문자로 : "+str1.toLowerCase());
        System.out.println("대문자로 : "+str1.toUpperCase());
        String data1 = str1.replace("T", "W");
        System.out.println("T를 W로 변경 : "+data1);
        String str3 = "     My name is GiTae, Kim       ";
        System.out.println("str3의 글자수 : "+(str3.length()));
        System.out.println("공백 제거 전0 : "+str3);
        System.out.println("공백 제거 후1 : "+str3.trim());
        System.out.println("str3의 공백 제거 후 글자수 : "+(str3.trim().length()));

        int k = 1004;
        String t1 = k + "";     //숫자를 문자열로 => 비추천
        String t2 = String.valueOf(k);  //숫자를 문자열로 => 추천
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("t1이 문자열? "+(t1 instanceof String));
        System.out.println("t2이 문자열? "+(t2 instanceof String));
    }
    static void printArr(byte[] arr){
        for(int i=0;i<arr.length;i++){
            char a = (char) arr[i];
            System.out.print(a);
        }
    }
}
