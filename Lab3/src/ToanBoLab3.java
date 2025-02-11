import java.util.Scanner;
public class ToanBoLab3 {

	public static void main(String[] args) {
	System.out.print("xin chào");
	
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
}
