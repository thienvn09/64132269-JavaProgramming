
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
	void MoTaSp()
	{
		System.out.println(Tensp + "-" + dongia + "-" + giamgia);
		
	}
}
