import java.util.Scanner;
public class Bai2_nhapxuat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String Ten;
		int Diem;
		System.out.print(" moi ban nhap ten ");
		Ten = scanner.nextLine();
		System.out.print("moi nhap diem cua ban : ");
		Diem = scanner.nextInt();
		System.out.printf("Diem cua ban la : %d",Diem);
		System.out.printf("Ten ban vua nhap la %s",Ten);
	}

}
