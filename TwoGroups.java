import java.util.Scanner;
public class TwoGroups{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long x=sc.nextInt();
		while(x-->0){
		    long z=sc.nextInt();
		    long sum=0;
		    for(long i=0;i<z;i++){
		        sum+=sc.nextInt();
		    }
		    System.out.println(Math.abs(sum));
		}
	}
}
 