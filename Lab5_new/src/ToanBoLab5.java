import java.util.Scanner;
import java.util.ArrayList;
public class ToanBoLab5 {
    public static void main(String[] args) throws Exception {
        int so,n;
        Scanner nhap = new Scanner(System.in);
        ArrayList<Double> a = new ArrayList<Double>();
        System.out.println("Chương trình của lê hoàng thiện ");
        System.out.print("---------------------------\n");
        System.out.print("1. Nhập và xuất mảng số thực \n");
        System.out.print("2. Mảng chuỗi \n");
        System.out.print("3. Ứng dụng quản lý sản phẩm \n");
        System.out.print("---------------------------\n");
        System.out.print("Mời bạn chọn chức năng : ");
        so = nhap.nextInt();
        do{
            if(so<1 || so>3)
            {
                System.out.print("Nhập sai mời nhập lại : ");
                so = nhap.nextInt();
            }
        }while(so<1 || so>3);
        switch (so){
            case 1:
            System.out.print("mời nhập số lượng phần tử trong mảng : ");
            n= nhap.nextInt();
            Nhap(a,n);
            System.out.print("Xuất ra màng hình : \n");
            Xuat(a,n);
            break;
            case 2:

        }

           

                

       
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
            System.out.printf("a[%d]=%.2f \n",i+1,a.get(i));
        }
    }

}
