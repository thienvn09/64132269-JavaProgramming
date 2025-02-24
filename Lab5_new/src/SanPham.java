import java.util.ArrayList;
import java.util.Collections;
public class SanPham {
    private String TenSp;
    private double GiaSp;
    public String getTenSp() {
        return TenSp;
    }
    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }
    public double getGiaSp()
    {
        return GiaSp;
    }
    public void setGiaSp(double GiaSp)
    {
        this.GiaSp = GiaSp;
    }
    public static void Nhap(ArrayList<SanPham> a)
    {
        for(int i=0;i<a.size();i++)
        {
            System.out.print("Nhập tên sản phẩm thứ "+(i+1)+": ");
            a.get(i).setGiaSp(i);
            System.out.print("Nhập giá sản phẩm thứ "+(i+1)+": ");
            a.get(i).setGiaSp(i);
        }
    }
    // public static void XuatGiam(ArrayList<SanPham> a)
    // {
    //    Collections.sort(a,(a1,a2));
    // }
    
}
