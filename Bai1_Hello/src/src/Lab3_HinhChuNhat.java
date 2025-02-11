package src;
import java.util.Scanner;

public class Lab3_HinhChuNhat {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int Cdai  ,Crong, a;
		double Cv,S;
		System.out.print("moi nhap chieu chieu dai : ");
		Cdai = nhap.nextInt();
		System.out.print("moi nhap chieu rong : ");
		Crong = nhap.nextInt();
		if(Cdai == Crong) {
			do{
				System.out.print(" Chieu dai va chieu rong khong duoc bang nhau ! \n ");
				System.out.print("moi nhap lai chieu chieu dai : ");
				Cdai = nhap.nextInt();
				System.out.print("moi nhap lai chieu rong : ");
				Crong = nhap.nextInt();
			}while(Cdai == Crong);
		}
		Cv = (Cdai + Crong) *2;
		S = (Cdai * Crong);
		a=Math.min(Cdai, Crong);
		System.out.printf("CV : %lf \n ",Cv );
		System.out.printf("CV : %lf \n ", S );
		System.out.printf("CV : %d ",a );
		nhap.close();
	}

}
