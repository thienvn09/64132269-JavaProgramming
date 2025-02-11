import java.util.Scanner;
public class Lab1_khoiLapPhuong {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		double a,b; 
		System.out.print("moi nhap canh cua khoi lap phuong : ");
		a = nhap.nextDouble();
		b=Math.pow(a, 3);
		System.out.printf("The tich : %.1f",b);

	}

}
