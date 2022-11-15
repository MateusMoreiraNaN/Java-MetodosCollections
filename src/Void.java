public class Void {
    public static void main(String[] args) {
        /*
        int n1 = 5;
        int n2 = 7;
        System.out.println(n1 + n2);

        int n3 = 11;
        int n4 = 4;
        System.out.println(n3 + n4);

        int n5 = 67;
        int n6 = 10;
        System.out.println(n5 + n6);

        int n7 = 58;
        int n8 = 16;
        System.out.println(n7 + n8);
        */

        Somar somar = new Somar(5, 5);

        System.out.println(somar.s(somar.a, somar.b));

        somar(10, 10);
        somar(100, 10);
        somar(100, 10);
        somar(100, 10);
    }


    static void somar(int a, int b){
        System.out.println(a + b);
    }


}
