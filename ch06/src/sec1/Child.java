package sec1;

public class Child extends Man {
    //추상화된 클래스를 상속받아 구현하는 경우 추상메소드를 모두 구현내용을 기술할 수
    //있도록 반드시 오버라이딩을 해야한다.
    //Implements : 추상화된 메소드를 상속 받는 것
    @Override
    public void method1() {         System.out.println("자식메소드1");    }

    @Override
    public int method2() {       return 2;    }

    @Override
    public void method3(int no) {        System.out.println("자식메소드3 : "+no);    }

    @Override
    public int method4(int no) {        return no+1;    }
}
