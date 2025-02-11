import java.util.Scanner;
public class Lab5_ptbac2 {
	public static void main(String[] args) {
		Double a,b,c,detal , t;
		t=Ptbac1();
		if(t==1) {
			System.out.print("Phương trình vô số nghiêm");
		}
		else if(t==0)
		{
			System.out.print("phương trình vô nghiệm");
		}
		else
		{
			System.out.printf("nghiem cua phuong trinh : %.1f",t);
		}
		
	}
	public static double Ptbac1()
	{
		Double a,b,c,detal , t;
		Scanner nhap = new Scanner(System.in);
		System.out.print("moi nhap so a : ");
		a = nhap.nextDouble();
		System.out.print("moi nhap so b : ");
		b = nhap.nextDouble();
		if(a == 0 )
		{
			if(b== 0 )
			{
				return 1;
			}
			else {
				
				return 0;
			}
		}
		else {
			t=-b/a;
		}
		nhap.close();
		return t;
	}
	public static Double PTB2()
	{
		double a,b,c,detal , t1,t2;
		Scanner nhap = new Scanner(System.in);
		System.out.print("moi nhap so a : ");
		a = nhap.nextDouble();
		System.out.print("moi nhap so b : ");
		b = nhap.nextDouble();
		System.out.print("moi nhap so c : ");
		c = nhap.nextDouble();
		if(a != 0)
		{
			detal = Math.pow(b, 2) - 4 *a *c;
			if(detal <0 )
			{
				return (double) 0;
			}
			else if(detal == 0 )
			{
				System.out.print("Phuong trinh co nghiem ghep");
				return t1=-b/(2*a);
			}
			else if(detal >0 )
			{
				System.out.print("Phuong trinh co 2 nghiem phan biet");
				
			}
		}
	}
	
}
