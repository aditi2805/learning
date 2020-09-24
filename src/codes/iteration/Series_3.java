package codes.iteration;

public class Series_3 {
    public void print(){
        int term = 1;
        for(int i  = 1 ; i <= 20 ; i++){
            System.out.print(term + "   ");
            term +=4 ;
        }
    }

    public static void main(String[] args) {
        Series_3 s3 = new Series_3();
        s3.print();
    }
}
