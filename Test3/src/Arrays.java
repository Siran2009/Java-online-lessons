public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println(a[4]);
        a[0] = 5;
        a[2] = 6;
        a[4] = 7;
        System.out.println(a[0] + a[4]);
        System.out.println(a.length);
        System.out.println(a[0] + a[a.length - 1]);

        int[] array = {1, 5, 6};
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);

        int xx = 1;

        while (xx < 21) {
        System.out.print(xx++ + " "); }



    }
}

