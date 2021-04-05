public class test.java {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);

        while (i<10) {
            if (i%2 + 1 > 2) {
                System.out.println("flag");
            }
        }
    }

    public static double average(int num1, int num2) {
        return (num1 + num2)/2;
    }
}

