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
	public void Nhap(int a[],int n) 
	{
		Scanner nhap = new Scanner(System.in);
		System.out.print("Moi nhap so luong phan tu cua mang ");
		 n = nhap.nextInt();
		nhap.close();
		int[] a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.printf("moi nhap phan tu thu %d : ",i+1);
			a[i] = nhap.nextInt();
		}
		
	}
}
