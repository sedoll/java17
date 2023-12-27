package sec1;

public class Example1 {
    public static void main(String[] args) {

        int no1 = 100;
        int no2 = 0;
        int res = 0;

        try {
            res = no1 / no2;
        } catch(ArithmeticException e){
            System.out.println("divide 0");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("connected end");
            System.out.println("closing");
        }
        System.out.println("print complete");
    }
}
