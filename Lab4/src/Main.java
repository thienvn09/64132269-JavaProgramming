
public class Main {

	public static void main(String[] args) {
		Sanpham sp1 = new Sanpham(null,0,0);
        Sanphan sp2 = new Sanpham(null,0,0);
    
		sp1.Nhap();
        sp2.Nhap();
        sp2.getThueNhapKhau();
		sp1.getThueNhapKhau();
		sp1.MoTaSp();
        sp2.MotaSp();
     
	}

}
