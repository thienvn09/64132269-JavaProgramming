import java.util.ArrayList;
import java.util.Scanner;
public class Toanbolab5 {
    public static void main(String[] args) {
        string a[];
        int n;
        a = new String[n];
        Nhap(a, n);
        Xuat(a, n);
    }
    public static void Nhap(String a[], int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + i + ": ");
            a[i] = sc.nextLine();
        }
    }
    public static void Xuat(String a[], int n){
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
