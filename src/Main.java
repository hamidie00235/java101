import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        int width=10;
//        int length =13;
//        int areas=length*width;
//        int perimeter =2*(length+width);
//        System.out.println("the area of our rectangle is:"+areas );
//        System.out.println("the perimeter  of our rectangle is:"+perimeter);

        // tam sayilari byte,long int and short;
//        byte vByte =100;
//        short vShort =1000;
//        int vInt=10000;
//        long vLong =10000000;
//        System.out.println(vByte);
//        System.out.println(vShort);
//        System.out.println(vInt);
//        System.out.println(vLong);

       // Char ve Boolean Veri Tipleri

//      // char
//        char c1='j';
//        char c2='a';
//        char c3='v';
//        char c4='a';
//        System.out.println(""+c1+c2+c3+c4);
//
//        // boolean
//        boolean vrai=true;
//        boolean  faux=false;
//        System.out.println(vrai);
///// string veri tipi
//        String vStr="java 101 patikasi";
//        System.out.println(vStr);

        // temel operator
       // mantiksal operator
//        int x=2,y=4,z=3;
//        boolean result= x<y && z<x;
//        boolean result1=z<y || z<x;
//        String str = result?"that's correct!":"wrong!";
//        System.out.println(str);
//        int x = 1, y = 2, r=3;
//        r *= x + y;
//        System.out.print(r);
//        // Kullanicidan veri alma
//
//        Scanner enter =new Scanner(System.in);
//        System.out.println("please enter the number :");
//        int in =enter.nextInt();
//        double doub= enter.nextDouble();
//        String str=enter.nextLine();
//        System.out.println(in);
//        System.out.println(doub);
//        System.out.println(str);



//        /// pratik 1
//        not ortlamasina hesaplayan program
//
//        Scanner not = new Scanner(System.in);
//
//        System.out.println("maths notunuzu Giriniz:");
//        double maths = not.nextDouble();
//
//        System.out.println("fizik notunuzu Giriniz:");
//        double fizik = not.nextDouble();
//
//        System.out.println("turkce notunuzu Giriniz:");
//        double turkce = not.nextDouble();
//
//        System.out.println("tarih notunuzu Giriniz:");
//        double tarih = not.nextDouble();
//
//        System.out.println("muzik notunuzu Giriniz:");
//        double muzik = not.nextDouble();
//
//        System.out.println("kimya notunuzu Giriniz:");
//        double kimya = not.nextDouble();
//
//        // Calculate the average of the grades
//        double ortalama = (maths + fizik + turkce + tarih + kimya + muzik) / 6;
//
//        System.out.println("Ortalama: " + ortalama);
//
//        // Use ternary operator to determine pass or fail
//        String result = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfı kaldı";
//
//        // Print the result
//        System.out.println(result);



        /*  pratik 2
        * kdv tutari hesaplayan program  odevi */
//        Scanner fiyat  = new Scanner(System.in);
//
//        System.out.println("fiyatinzi Giriniz:");
//
//        double para= fiyat.nextInt();
//
//        double kdvOrani=(para>0 && para<1000)? (para*18)/100 : (para*8)/100;
//
//        double kdvliToplamFiyat =para+kdvOrani;
//
//        System.out.println("girdiniz  fiyat :"+para);
//
//        System.out.println("kdv orani:"+kdvOrani);
//
//        System.out.println("kdv'li toplam fiyat:"+kdvliToplamFiyat);




//        /* pratik 3
//        *  Dik Üçgende Hipotenüs Bulan Program
//        * */
//
//        // değişkenler
//        int a ,b,c;
//
//        // kullanicidan veri alma
//
//        Scanner input  = new Scanner(System.in);
//
//        System.out.println("1. kenar girin:");
//        a= input.nextInt();
//        System.out.println("2. kenar girin:");
//        b= input.nextInt();
//        System.out.println("3.kenar:");
//        c= input.nextInt();
//        // Yarı çevre hesaplama
//        double u =(a+b+c)/2;
//        System.out.println("Yarı çevresi :"+u);
//
//        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
//        System.out.println("Üçgenin alanı:" + alan);



        /// pratik 4
        /*
        *
        * Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/


//  int km;
//  double total,perKm=2.20 ,startPrice=10;
//
//// enter values from keyboard
//        Scanner input  = new Scanner(System.in);
//        //logical service
//        System.out.print("enter the km:");
//
//        km= input.nextInt();
//
//        total=(km*perKm)+startPrice;
//        total=(total<20)?20 :total;
//        System.out.println("the total price is :" +total);





        /*pratik 5
        *
        *
        * Dairenin Alanını ve Çevresini Hesaplayan Program
         */



        double r,alan ,pi=3.14,alpha;
        Scanner in =new Scanner(System.in);

        System.out.println("Please enter the radius of your areas:");
        r=in.nextDouble();
        System.out.println("please enter the value of alpha:");
         alpha=in.nextDouble();
        alan = Math.PI * r * r * (alpha/ 360);
        System.out.println("your area is :" +alan);


    }


}