import java.util.Scanner;
public class FindSumOfGpSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //a is the first term of series
        double a=sc.nextDouble();
        //n is the number of terms
        int n=sc.nextInt();
        //r is common ratio
        double r=sc.nextDouble();
        double sum=0;
        // initialize temp as a
        double temp=a;
        for(int i=0;i<n;i++){
            sum=sum+temp;
            // increase temp every time by r
            temp=temp*r;
        }
        System.out.println(sum);
        
    }
}
