package NumberConversion;

public class OctalToHexaDecimal {
	public static void main(String[] args) {
		int n=12;
		int power=0;
		int sum=0;
		while(n!=0)
		{
			int d= n % 10;
			sum = sum + d * pow(8, power);
			power++;
			n = n/10;
		}
	
		String s  = "";
		while (sum!=0)
		{
			int r = sum % 16;
			if(r==10)
			{
				s = "a"+s;
			}else if(r==11) {
				s = "b"+s;
			}
			else if(r==12)
			{
				s = "c"+s;
			}
			else if(r==13)
			{
				s = "d"+s;
			}else if(r==14)
			{
				s = "e"+s;
			}else if(r==15)
			{
				s = "f"+s;
			}
			else
			{
				s = r + s;
			}
			sum = sum/ 16;
		}
		System.out.println(s);
		
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
