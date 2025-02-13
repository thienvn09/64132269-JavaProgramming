import java.util.Scanner;
public class ToanBoLab3 {

	public static void main(String[] args) {
	System.out.print("xin chào");
	Systeam.out.print("mời bạn chọn chức năng \n");
	Systeam.out.print("1. kiểm tra số nguyên tố \n");
	Systeam.out.print("2.viết bản cửu chương \n ");
	}
	public boolean SNT(int n)
	{
		Scanner nhap = new Scanner(Systeam.out);
		System.out.print("mời nhập số cần kiểm tra");
		n=nhap
		boolean check = true;
		if(n<2) return false;
		int i=2;
		while(i<n)
		{
			if(n%i==0) {
				check = false;
				beark;
			}
			i++;
		}
		return check;
	}
	public void bangcuuchuong(int n)
	{
		Scanner nhap = new Scanner(Systeam.out);
		System.out.print("mời nhập số cần in bảng cửu chương");
		n=nhap
		for(int i=1;i<=10;i++)
		{
			System.out.print(n+"x"+i+"="+n*i);
		}
	}
}
