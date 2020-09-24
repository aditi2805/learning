package codes.iteration;

public class Series_2 {
    public void print(){
        int p=0;
        for(int i = 1 ; i<= 20 ; i++){
            System.out.print(i*i + "     " );
        }
    }

    public static void main(String[] args) {
        Series_2 s2 = new Series_2();
        s2.print();
    }
}
