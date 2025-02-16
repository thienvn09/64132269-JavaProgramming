import java.util.Scanner;
public class Sanpham {
	String Tensp;
	double dongia;
	double giamgia;
	public Sanpham(String Tensp,double dongia,double giamgia)
	{
		this.Tensp=Tensp;
		this.dongia=dongia;
		this.giamgia=giamgia;
	}
	public double getThueNhapKhau()
	{
		return this.dongia*0.1;
	}
	public void Nhap()
	{
		Scanner nhap = new Scanner(System.in);
		System.out.print("moi nhap ten san pham : ");
		Tensp = nhap.next();
		System.out.print("moi nhap gia san pham : ");
		dongia=nhap.nextDouble();
		System.out.print("moi nhap giam gia : ");
		giamgia=nhap.nextDouble();
	}
	public void MoTaSp()
	{
		System.out.println("Tên sản phẩm: " + Tensp);
        System.out.println("Đơn giá: " + dongia);
        System.out.println("Giảm giá: " + giamgia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
		
	}
}
