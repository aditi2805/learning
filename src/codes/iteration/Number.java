package codes.iteration;

public class Number {
    public static void main(String[] args) {
        int i=0;
        int n = 100000000;
        long sum = 0;
        long startTime = System.nanoTime();
        for(i=1 ; i<=n ; i++){
            sum+=i;
        }
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
        System.out.println(sum);

        System.out.println("----------------------------");
        // startTime = System.currentTimeMillis();
        startTime = System.nanoTime();
        sum = 1L*n*(n+1)/2;
        endTime = System.nanoTime();
        System.out.println(endTime-startTime);
        System.out.println(sum);
    }
}
