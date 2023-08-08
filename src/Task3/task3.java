package Task3;

public class task3 {
    public static double calculateSquareRoot(double square){
        if(square < 0){
            throw new NegativeSquareRootException("Null<0!");
        }
        return Math.sqrt(square);
    }

    public static void main(String[] args){
        System.out.println(calculateSquareRoot(25));
        System.out.println(calculateSquareRoot(-25));
    }
}
