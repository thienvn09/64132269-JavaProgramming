import java.util.Arrays;
import java.util.Scanner;
public class ToanBoLab3 {

	public static void main(String[] args) {
	Scanner nhap = new Scanner(System.in);
	System.out.print("xin chào");
	System.out.print("mời bạn chọn chức năng \n");
	System.out.print("1. kiểm tra số nguyên tố \n");
	System.out.print("2.viết bản cửu chương \n ");
	}
	public boolean SNT(int n)
	{
		System.out.print("mời nhập số cần kiểm tra");
		boolean check = true;
		if(n<2) return false;
		int i=2;
		while(i<n)
		{
			if(n%i==0) {
				check = false;
				break;
			}
			i++;
		}
		return check;
	}
	public void bangcuuchuong(int n)
	{
		Scanner nhap = new Scanner(System.in);
		System.out.print("mời nhập số cần in bảng cửu chương");
		for(int i=1;i<=10;i++)
		{
			System.out.print(n+"x"+i+"="+n*i);
		}
	}
	public static int[] Nhap ()
	{
		Scanner nhap = new Scanner(System.in);
		System.out.print("Mời bạn nhập số phần tử của mảng : ");
		int n = nhap.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.printf("mời nhâp phần tử thứ %d : ",i+1);
			a[i]=nhap.nextInt();
		}
		return a; // trả về kiểu mảng
		
	}
	public static void Xuat(int a[])
	{
		System.out.print("các phần tử của mảng là : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void SapXep(int a[])
	{
		Arrays.sort(a);
		System.out.print("mảng sau khi sắp xếp là : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void SNN(int a[])
	{
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min) min = a[i];
		}
		System.out.print("số nhỏ nhất trong mảng là : "+min);
	}
	public static int Tb(int a[])
	{
		int sum=0;
		int cout=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%3==0)
			sum+=a[i];
			cout++;
		}
		if(cout == 0) return 0; // tránh trường hợp chia cho 0
		return sum/cout; 
	}
	// ten diem 
	public static String[][] Hs()
	{
		Scanner nhap = new Scanner(System.in);
		System.out.print("moi nhap so hoc sinh : \n");
		int dong = nhap.nextInt();
		String a[][] = new String[2][dong];
		for(int i = 0 ; i < 2;i++ )
		{
			for(int j=0;j<dong;j++)
			{
				System.out.print("moi nhap tên học sinh thứ i [] : ");
				a[i][j]= nhap.next();
			}
			
		}
	}
	
}
