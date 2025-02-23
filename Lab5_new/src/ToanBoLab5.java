import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
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
            ArrayList<String> b = new ArrayList<String>();
            NhapChuoi(b);
            System.out.print("Xuất ra màng hình : \n");
            XuatChuoi(b);
            System.out.print("Xuất ngẫu nhiên : \n");
            XuatNgauNhien(b);
            break;
        }

           

                

       nhap.close();
    }
    public static void Nhap(ArrayList<Double> a,int n)
    {
        Scanner nhap = new Scanner(System.in);
       
        for(int i=0;i<n;i++)
        {
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            a.add(nhap.nextDouble());
        }
        nhap.close();
    }
    public static void Xuat(ArrayList<Double> a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d]=%.2f \n",i+1,a.get(i));
        }
    }
    public static void NhapChuoi(ArrayList<String> a)
    {
        int i=0;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Mời nhập chuỗi (nhập exit để thoát nhập ) \n");
        while(true)
        {
            System.out.printf("Nhập Chuỗi thứ %d : ",i+1);
            String input = nhap.nextLine();
            if(input.equalsIgnoreCase("exit"))
            {
                break;
            }
            a.add(input);
            i++;
        }
        nhap.close();
    }
    public static void XuatChuoi(ArrayList<String> a)
    {
        for(int i=0;i<a.size();i++)
        {
            System.out.printf("a[%d]=%s \n",i+1,a.get(i));
        }
    }
    public static void XuatNgauNhien(ArrayList<String> a)
    {
        Random  rd = new Random();
        int i=1;
        for(String str : a)
        {
            str = a.get(rd.nextInt(a.size()));
            System.out.printf("a[%d] = %s \n",i,str);
            i++;
        }
    }
    public static void Giamdan(ArrayList<String> a)
    {
        for(int i=0;i<a.size();i++)
        {
            Collection.sort(a.get(i),Collections.reverseOrder());
        }
    }
}
