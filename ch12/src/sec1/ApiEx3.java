package sec1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class ApiEx3 {
    public static void main(String[] args) {
        //Math.random() : 0~1 의 실수
        //int su = (int) (Math.random()*44+1); //1~45
        //System.out.println("임의의 수 :"+su);
        //로또 추첨기 - 7, 12, 22, 28, 35, 41
        Integer[] lotto = new Integer[6];
        for(int i=0;i<6;i++){
            lotto[i] = (int) (Math.random()*44+1);
        }

        //중복성 해결을 위하여 배열을 Set으로 변환
        Set<Integer> gen = new HashSet<>(Arrays.asList(lotto));

        //중복된 번호가 있으면, 개수가 6개 미만이므로 6개 미만인 경우
        //중복 없이 요소가 6개가 될 때 까지 반복
        while(gen.size()<6){
            gen.add((int) (Math.random()*44+1));
        }

        //Set을 Array(배열)로 변환
        lotto = gen.toArray(new Integer[6]);
        Arrays.sort(lotto); //오름차순 정렬하기
        //Arrays.sort(lotto, Collections.reverseOrder()); //내림차순 정렬하기
        System.out.println(Arrays.toString(lotto));
    }
}
