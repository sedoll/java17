package sec2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsEx4 {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        List<String> linkList = new LinkedList<>();

        //소요시간 측정
        long start, end;

        start = System.nanoTime();
        for(int i=0;i<20000;i++){
            arrList.add(0, String.valueOf(i));
        }
        end = System.nanoTime();
        System.out.println("ArrayList 삽입 소요시간 : "+(end - start)+"나노초");

        start = System.nanoTime();
        for(int i=0;i<20000;i++){
            linkList.add(0, String.valueOf(i));
        }
        end = System.nanoTime();
        System.out.println("LinkedList 삽입 소요시간 : "+(end - start)+"나노초");
    }
}
