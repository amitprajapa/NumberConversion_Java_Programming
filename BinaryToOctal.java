package NumberConversion;

public class BinaryToOctal {
public static void main(String[] args) {
	int n = 1100;
	int power = 0;
	int sum = 0;
	while(n!=0)
	{
		int d = n % 10;
		sum = sum + d * pow(2, power);
		power++;
		n = n/10;
	}
	//System.out.println(sum);
	String res = "";
	while(sum!=0)
	{
		int r = sum % 8;
		res = r + res;
		sum = sum / 8;
	}
	System.out.println(res);
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

