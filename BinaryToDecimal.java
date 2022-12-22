//wap to conveet binary to decimal
package NumberConversion;

public class BinaryToDecimal 
{
	public static void main(String[] args) {
		int n = 1000;
		int power = 0;
		int sum = 0;
		while(n!=0)
		{
			int d = n % 10;
			sum = sum + d * pow(2, power);
			power++;
			n = n/10;
		}
		System.out.println(sum);
	}

	public static int  pow(int n, int p) {
		int res=1;
		for(int i=1; i<=p; i++)
		{
			res = res*n;
		}
		return res;
	}

}

