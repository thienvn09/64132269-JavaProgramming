import java.util.Scanner;
public class Sanpham {
	private String Tensp;
	private double dongia;
	private double giamgia;
	// 3 tham số 
	public Sanpham(String Tensp,double dongia,double giamgia)
	{
		this.Tensp=Tensp;
		this.dongia=dongia;
		this.giamgia=giamgia;
	}
	// 2 tham số
	public Sanpham(String Tensp,double dongia)
	{
		this("thiện",1000,0);
	}
	public double getThueNhapKhau()
	{
		return this.dongia*0.1;
	}
	// phuong thuc get seter
	
	// Getter: Dùng để lấy giá trị của một thuộc tính.
	//Ví dụ: public String getTenSp() { return tenSp; } giúp lấy giá trị của tenSp.
	public String getTensp()
	{
		return Tensp;
	}
	// Setter: Dùng để gán giá trị mới cho một thuộc tính.
	// Ví dụ: public void setTenSp(String tenSp) { this.tenSp = tenSp; } giúp thay đổi giá trị của tenSp.
	public String setTenSp()
	{
		return this.Tensp;
	}
	public double getDongia()
	{
		return dongia;
	}
	public double setDongia()
	{
		return this.dongia;
	}
	public double getgiamgia()
	{
		return giamgia;
	}
	public double setgiamgia()
	{
		return this.giamgia;
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

