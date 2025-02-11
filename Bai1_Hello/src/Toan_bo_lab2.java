import java.util.Scanner;
public class Toan_bo_lab2 {
	public static void main(String[] args) {
		double a,b,c,detal , t;
		Scanner nhap = new Scanner(System.in);
		int c1;
		System.out.print("+---------------------------------------------------+\n");
		System.out.print("1. Giải phương trình bậc nhất \n");
		System.out.print("2. Giải phương trình bậc 2\n");
		System.out.print("3. Tính tiền điện\n");
		System.out.print("4. Kết thúc \n");
		System.out.print("+---------------------------------------------------+\n");
		do
		{
			System.out.print("Chọn chức năng (1-4) : ");
			c1=nhap.nextInt();
		}while(c1 <1 || c1 >4);
		
		switch (c1)
		{
			case 1:
				System.out.print("Phương trình bậc 1  \n ");
				t=Ptbac1(); 
			if(t==1) {
				
				System.out.print("Phương trình vô số nghiêm"); 
			} 
			else
			if(t==0) { 
				System.out.print("phương trình vô nghiệm"); 
				} 
			else {
				System.out.printf("nghiem cua phuong trinh : %.1f",t); 
				}
				break;
			case 2:
				System.out.print("Phương trình bậc 2 \n");
				double[] nghiem = PTB2();
				if (nghiem.length == 0) {
		            System.out.println("Phương trình vô nghiệm.");
		        } 
				else if (nghiem.length == 1) {
		            System.out.printf("Phương trình có nghiệm kép: x = %.2f\n", nghiem[0]);
		        }
		        else {
		            System.out.printf("Phương trình có 2 nghiệm phân biệt: x1 = %.2f, x2 = %.2f\n", nghiem[0], nghiem[1]);
		        }
				break;
			case 3:
				System.out.print("tính tiền điện \n ");
				t=Tiendien();
				System.out.printf("Tiền điện : %.2f",t);
				break;
			case 4:
				System.exit(0);
		}
	}
	public static double Ptbac1()
	{
		double a,b,c, t;
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
	public static double[] PTB2()
	{
		double a,b,c,detal , t1,t2;
		Scanner nhap = new Scanner(System.in);
		System.out.print("moi nhap so a : ");
		a = nhap.nextDouble();
		System.out.print("moi nhap so b : ");
		b = nhap.nextDouble();
		System.out.print("moi nhap so c : ");
		c = nhap.nextDouble();
		nhap.close();
		if (a == 0) {
            if (b == 0) {
                return new double[] {}; // Vô nghiệm
            } else {
                return new double[] { -c / b }; // Nghiệm của phương trình bậc nhất
            }
        }
	
		if(a != 0)
		{
			detal = Math.pow(b, 2) - 4 *a *c;
			if(detal < 0 )
			{
				return new double[] {}; // vo nghiem
			}
			else if(detal == 0 )
			{
				System.out.print("Phuong trinh co nghiem ghep \n ");
				t1=-b/(2*a);
				return new double[] {t1};
			}
			else if(detal >0 )
			{
				System.out.print("Phuong trinh co 2 nghiem phan biet \n");
				t1=(-b+Math.sqrt(detal))/(2/a);
				t2=(-b-Math.sqrt(detal))/(2/a);
				return new double[] {t1,t2};
				
			}
		}
		 return null;
	}
	public static float Tiendien()
	{
		Scanner nhap = new Scanner(System.in);
		int d ;
		do
		{
			System.out.print("mời nhập  số kg điện : ");
			d = nhap.nextInt();
		}while(d<=0);
		nhap.close();
		if(d<50 && d>=1)
		{
			return d*1000;
		}
		else 
		{
			return 50*1000+(d-50)*1200;
		}
	}
	
}
