// Exercise 1.7: Change the loop in ImprovedFibonacci so that i counts backward instead of forward.

public class ImprovedFibonacci {
    private static final int MAX = 9;

    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        String mark;

        System.out.println(MAX + ": " + lo);
        for(int i = MAX - 1; i > 0; --i) {
            if(hi % 2 == 0)
                mark = " *";
            else
                mark = "";

            System.out.println(i + ": " + hi + mark);
            hi += lo;
            lo = hi - lo;
        }
    }
}
