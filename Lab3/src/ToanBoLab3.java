import java.util.Arrays;
import java.util.Scanner;
public class ToanBoLab3 {

	public static void main(String[] args) {
	Scanner nhap = new Scanner(System.in);
	int hehe;
	System.out.print("xin chào\n");
	System.out.print("+---------------------------------------------------+\n");
	System.out.print("mời bạn chọn chức năng \n");
	System.out.print("1. kiểm tra số nguyên tố \n");
	System.out.print("2. viết bản cửu chương \n ");
	System.out.print("3. Mảng số nguyên và sắp xếp \n");
	System.out.print("4. Họ tên và năng lực của học sinh\n");
	System.out.print("+---------------------------------------------------+\n");
	do {
		System.out.print("mời chọn chức năng : ");
		hehe = nhap.nextInt();
	}while(hehe <1 || hehe >4);
	switch(hehe) 
	{
	case 1:
		System.out.print("mời nhập số cần kiểm tra");
		int n=nhap.nextInt();
		boolean tam=SNT(n);
		if(tam == true) System.out.printf("số %d là số nguyên tố ",n);
		else System.out.printf("Số %d không phải là số nguyên tố ", n);
		break;
	case 2:
		System.out.print("mời nhập bảng cửu chương cần in : \n");
		int ok = nhap.nextInt();
		Bangcuuchuong(ok);
		break;
	case 4:
		String[][] danhSach = Hs();
		System.out.print("\n Danh sách học sinh : \n");
		 for (String[] hs : danhSach) {
	            System.out.printf("Tên: %s - Điểm: %s - Xếp loại: %s\n", hs[0], hs[1], hs[2]);
	        }
		break;
	}
	
}
		
	public static boolean SNT(int n)
	{
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
	public static void Bangcuuchuong(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(n+"x"+i+"="+n*i);
		}
	}
	public static double[] Nhap ()
	{
		Scanner nhap = new Scanner(System.in);
		System.out.print("mời nhập số lượng phần từ của mảng : ");
		int n = nhap.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			do {
				System.out.printf("mời nhập phần tử thứ %d",i+1);
			}while();
		}
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
		//a[tên][diem][nangluc] 
		Scanner nhap = new Scanner(System.in);
		System.out.print("moi nhap so hoc sinh : ");
		int dong = nhap.nextInt();
		String a[][] = new String[dong][3];
			for(int i=0;i<dong;i++)
			{
				String ten;
				double diem1;
				do {
					System.out.printf("moi nhap tên học sinh thứ %d : ",i+1);
					ten= nhap.next(); // tên
					
					if(!ten.matches("[a-zA-ZÀ-Ỹà-ỹ ]+")) {
						System.out.println(" Lỗi: Tên không được chứa số hoặc ký tự đặc biệt. Vui lòng nhập lại!");
					}
					
				}while (!ten.matches("[a-zA-ZÀ-Ỹà-ỹ ]+")); /* Lặp lại nếu tên không hợp lệ */
				a[i][0]=ten;
				
				do {
					System.out.printf("mời nhập điểm của học sinh thứ %d : ",i+1);
					while (!nhap.hasNextDouble()) {  // Kiểm tra nếu không phải số
	                    System.out.println("Lỗi: Điểm phải là số từ 0 đến 10. Vui lòng nhập lại!");
	                    nhap.next();
	                }
					diem1 = nhap.nextDouble();
					
					if(diem1 <= 0 || diem1 >=10) {
						System.out.println("điểm phải từ 0 tới 10");
					}
				}while(diem1 <= 0 || diem1 >=10 );
				a[i][1]=String.valueOf(diem1);
				nhap.nextLine();
				
				if(diem1 >9 )
				{
					a[i][2]="Xuất sắc";
				}
				else if(diem1 >= 7.5 && diem1 <9)
				{
					a[i][2] = "Giỏi";
				}
				else if(diem1 >= 6.5 && diem1 <7.5)
				{
					a[i][2]="khá";
				}
				else if(diem1 >= 5 && diem1 <6.5)
				{
					a[i][2]="trung bình";
				}
				else
				{
					a[i][2]="yếu";
				}
			}
			nhap.close();
			return a;
			
	}
	
}
