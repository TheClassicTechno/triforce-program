import java.util.Scanner;
public class triforce {
	public static double mathPattern(long b,double areaT) {
		
		if (b>209) { //as b gets bigger the reducing factor gets smaller eventually area reaches 0 b>100 would be better ans bc 10^100 gets error
			b=0;
			areaT=0;
			return areaT;
		}
		double reduceFac=Math.pow(3,b)/Math.pow(4, b);
		areaT*=reduceFac;
		return areaT;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long a=0,b=0,c=0;
		double[]ans=new double[(int)n];
		double areaT=0;
		double p =0;
		for (int i = 0;i<n; i++) {
			a=in.nextLong();
			b=in.nextLong();
			c=in.nextLong();
			areaT=0.5*a*(a*0.5*Math.sqrt(3));
			/*
			if (b==0)
				areaT=0.5*a*(a*0.5*Math.sqrt(3));
			if (b==1) {
				areaT=0.5*a*(a*0.5*Math.sqrt(3));
				areaT=areaT-(areaT/(double)4);
			}
			*/
		//	System.out.println("area "+areaT);
			areaT=mathPattern(b,areaT);
		//	System.out.println("a "+a);
		//	System.out.println("b "+b);
		//	System.out.println("c "+c);
		//	System.out.println("area "+areaT);
			p=c*areaT;
		//	System.out.println("p "+p);
			ans[i]=p;
			
			
			//System.out.println("Triforce #"+(i+1) + ": " + p);
		}
		
		for (int i = 0;i<n; i++) {
			if (ans[i]<Integer.MIN_VALUE)
				ans[i]=0;
			System.out.format("Triforce #"+(i+1) + ": " + "%.2f%n", ans[i]);
		}
		
	}
}