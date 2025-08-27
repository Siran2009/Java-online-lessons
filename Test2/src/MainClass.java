public class MainClass {
    public static void main(String[] args) {

        int _x = 9;
        System.out.println(_x);

        String firstNameIs = "Hayk";
        System.out.println(firstNameIs);

        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        System.out.println(a+b);
        System.out.println(a*b);

        int x = 7, y = 5;
        System.out.println(x/y);
        System.out.println(x%y);

        double p = 8.0, t = 3.0;
        System.out.println(p/t);

        x = 7;
        x++;
        System.out.println(x);

        x = 4;
        System.out.println(x++);
        System.out.println(x);

        x = 3;
        y = 4;
        c = x++ - --y; // 3 x=4 y=3
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("c = " + c);

        x = 7;
        y = 8;
        c = ++x + y--; // c = 8+8=16 x=8 y=7
        System.out.println(x++); //x=8
        System.out.println(c); //c=16
        System.out.println(x); //x=9
        System.out.println(--y);//y=6
        System.out.println(y);//y=6

        boolean aa = x == 10;
        System.out.println(aa);

        System.out.println(x > 10);
        System.out.println(x <= 5);
        System.out.println(x != 8);

        System.out.println("-----------------------");

        x = 5;
        System.out.println(x % 2 == 0);

        System.out.println(x >= 1 &&  x<= 9);
        System.out.println(x >= 1 || x <= 9);

        boolean q = true;
        System.out.println(!q);

        System.out.println(8&19);
        System.out.println(14|7);







    }
}
