package codes.iteration;

public class Series_1 {

    public void printSeries(){
        for(int i = 2 ; i <= 52 ; i+=2){
            System.out.println("1/" + i );
        }
    }

    public static void main(String[] args) {
        Series_1  s1 = new Series_1();
        s1.printSeries();
    }
}
