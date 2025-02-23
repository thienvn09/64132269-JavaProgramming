import java.util.Scanner;
import java.util.ArrayList;
public class ToanBoLab5 {
    public static void main(String[] args) throws Exception {
        int so,n;
        Scanner nhap = new Scanner(System.in);
        ArrayList<Double> a = new ArrayList<Double>();
        System.out.print("mời nhập số lượng phần tử trong mảng : ");
        n= nhap.nextInt();
        Nhap(a,n);
        System.out.print("Xuất ra màng hình : \n");
        Xuat(a,n);
    }
    public static void Nhap(ArrayList<Double> a,int n)
    {
        Scanner nhap = new Scanner(System.in);
       
        for(int i=0;i<n;i++)
        {
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            a.add(nhap.nextDouble());
        }
    }
    public static void Xuat(ArrayList<Double> a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("%.2f ",a.get(i));
        }
    }
}
