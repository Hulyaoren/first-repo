package practice1;

public class Github_test {
    public static void main(String[] args) {
        //compute a finite sum
        System.out.println("finiteSum(5) = " + finiteSum(5));
    }
    public static int finiteSum(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum = sum+i;
        }
        return sum;
    }
}
