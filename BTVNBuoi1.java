
import static java.lang.Math.*;
import java.util.Scanner;
public class BTVNBuoi1 {
    
    public static void main(String[] args){
        
        //In ra man hinh sao hinh chu nhat
//        Scanner sc = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);
            
            
            
            int cd;
            int cr;
            System.out.println("Nhap chieu dai va chieu rong");
            cd = sc.nextInt();
            cr = sc.nextInt();
//        System.out.println(cd);
//        System.out.println(cr);
        System.out.println("In ra hcn rong");
        for ( int i = 0 ; i  < cd  ; i++){
            for ( int j = 0; j < cr ; j++){
                if( i == 0 || i == cd -1 || j == 0 || j == cr -1 ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
            System.out.println("Nhap so n tinh fib");
            int fib = sc.nextInt();
            System.out.println("ket qua fib bai 8 =" + bai8(fib));
            
            System.out.println("Nhap so n tinh giai thua");
            int gt = sc.nextInt();
            System.out.println(bai9(gt));
        
            System.out.println("nhap so n kt hh");
            int x= sc.nextInt();
            boolean kthh = bai10(x);
            if(kthh){
                System.out.println(x +"la so hh");
            }
            else{
                System.out.println(x +" kh p so hh");
            }
        
        
//            System.out.println("Nhap so n tinh giai thua");
//            float soN = sc.nextInt();
//            System.out.println(bai11(soN));
//            
//            System.out.println(bai10());
            
            
            
// nhap tiep du lieu vo method bai2
       
        
        bai2();
        }
        
    
    
    public static void bai2(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong in ra tam giac vuong");
        n = sc.nextInt();
//        System.out.println(n);
        System.out.println("In ra tam giac vuong voi so dong n nhap vao");
        for( int m = 0; m < n; m++ ){
            for ( int x = 0; x <= m; x ++){
                System.out.print("* ");
            }
            System.out.println();
          //  System.out.println();
            
         }
        bai3();
        sc.close();
        
    }
    
    public static void bai3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao thao:");
        
        int ccao = sc.nextInt();
        for (int i = 1; i <= ccao; i++) {
            // In khoảng trống
            for (int ktrang = 1; ktrang <= ccao - i; ++ktrang) {
                System.out.print("  ");
            }
            // In dấu sao
            for (int k = 0; k != 2 * i - 1; ++k) {
                System.out.print("* ");
            }
            // Xuống dòng sau khi in xong một hàng
            System.out.println();
        }
        bai4();
        sc.close();
    }
    
    public static void bai4(){
        int snt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen to");
        snt = sc.nextInt();
        boolean isSNT = ktSNT(snt);
        if(isSNT){
            System.out.println(snt +" la snt");
        }
        else{
            System.out.println(snt +"khong la snt");
        }
        bai5();
        sc.close();
    }
    
    public static boolean ktSNT(int snt){
        if(snt <= 1){
            return false;
        }
        for( int x = 2; x <= Math.sqrt(snt); x++){
            if(snt % x == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void bai5(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n so nguyen");
        n = sc.nextInt();
        System.out.println("cac so nguyen to la");
        for( int i = 1; i <=n ; i++ ){
            if(ktSNT(i)){
                System.out.println(i);
            }
//            else{
//                System.out.println( i + " khong phai la snt");
//           }
//            
//        }
        
        
            }
        bai6();
        sc.close();
        }
        
    
   
    public static void bai6(){
        int n,ketqua; 
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap so n can in bang cu chuong");
            n = sc.nextInt();
            System.out.println("Bang cuu chuong cua so" + n);
            for( int i = 1; i <= 10; i ++ ){
                ketqua = n * i ;
                System.out.println(ketqua); 
            }
            bai7();
        }
    }
    public static void bai7(){
        int n,ketqua = 0; 
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap so n can dao");
            n = sc.nextInt();
            while( n > 0 ){
                ketqua = ketqua * 10 + n % 10;
                
                n /= 10;
                
            }
            System.out.println(ketqua);
        sc.close();
       }
    }
//    public static void tinhfib( Scanner sc){
//        Scanner sc = new Scanner(System.in);
//        tinhfib(sc);
//        System.out.println("Nhap so n tinh fib");
//        int fib = sc.nextInt();
//        System.out.println(bai7(fib));
//        
//    }  
    
    public static int bai8(int fib){
        if( fib <=1 ){
            return fib;
        }
        return bai8(fib -1) + bai8(fib -2);
    }
    
    public static long bai9(int gt){
//        long gt = 1;
        for(int i =1 ; i < gt; i++){
            gt *= i;
        }
        return gt; 
    }
    
    public static boolean bai10(int x){
       
        int tong =0;
        
        for( int i = 1 ; i <= x; i++){
            if( x % i == 0 ){
                tong += i;
            }
        }
        if( tong - x == x){
            return true;
        }
        else{
             return false;
            }
    }
    
//     public static float bai11(float soN){
//        float ketqua = (float) 1.0;
//        for(float i = (float) 2; i <= soN ; i++){
//             ketqua += 1.0 /  Math.pow(i, 3);
//            }
//        return ketqua;
//    }

    
    
}
    

   




    

    
    
       
    


    
    
    
    
    
    
    
    

