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


//        double r,alan ,pi=3.14,alpha;
//        Scanner in =new Scanner(System.in);
//
//        System.out.println("Please enter the radius of your areas:");
//        r=in.nextDouble();
//        System.out.println("please enter the value of alpha:");
//         alpha=in.nextDouble();
//        alan = Math.PI * r * r * (alpha/ 360);
//        System.out.println("your area is :" +alan);





        /* pratik 6
        *
//        * Vücut Kitle İndeksi Hesaplama*/
//
//        double kilo,boy;
//        Scanner giris=new Scanner(System.in);
//        System.out.println(" Please !enter your weight:");
//        kilo=giris.nextDouble();
//        System.out.println("Please! enter your size:");
//        boy= giris.nextDouble();
//
//        double KTI=kilo/(boy*boy);
//        System.out.println("Vücut Kitle İndeksiniz:" +KTI);


//        //pratik 7
//        double armutFiyati = 2.14;
//        double elmaFiyati = 3.67;
//        double domatesFiyati = 1.11;
//        double muzFiyati = 0.95;
//        double patlicanFiyati = 5.00;
//
//        Scanner input =new Scanner(System.in);
//        System.out.println("enter armut kilogram ");
//        double armutKilo=input.nextDouble();
//        System.out.println("enter elma kilogram ");
//        double elmaKilo=input.nextDouble();
//        System.out.println("enter armut kilogram ");
//        double tomatesKilo=input.nextDouble();
//        System.out.println("enter muz kilogram ");
//        double muzKilo=input.nextDouble();
//        System.out.println("enter patlican Kilo");
//         double patlicanKilo= input.nextDouble();
//       double totalTutar=(armutFiyati * armutKilo) + (elmaFiyati * elmaKilo)
//               + (domatesFiyati * tomatesKilo) + (muzFiyati * muzKilo)
//               + (patlicanFiyati * patlicanKilo);
//        System.out.println("your total cost is:"+totalTutar+"TL");


//        /* pratik8
//
//        / If ve Else Blokları
//         */
//     int a=3,b=29,c=8;
//
//     if((a<b) && (a<c))
//     {
//         System.out.println("a is the smallest one");
//
//
//     }
//     else if((a>b) && (a>c))
//     {
//         System.out.println("a is the greatest one");
//     }
//else if((a<b)||(a>c) )
//     {
//         if(a<c){
//             System.out.println("a is bigger than them");
//         }
//         System.out.println("b is the biggest one ");
//     }
//    else{
//         System.out.println("c is the smallest number");
//     }


        /*pratik 9

        Switch-Case Yapısı/
         */


//






        /* pratik 10
        calculator with if-else conditions
        /
         */
//        int n1,n2,select;
//
//        Scanner input =new Scanner(System.in);
//
//        System.out.print("Enter the first number:");
//        n1= input.nextInt();
//        System.out.print("Enter the second  number:");
//        n2= input.nextInt();
//        System.out.println("1-addition\n2-substraction\n3-multiplication\n4-division");
//        System.out.println("Please enter your choix");
//        select= input.nextInt();
//        if(select==1){
//            System.out.println(+(n1+n2));
//        } else if (select==2) {
//            System.out.println(+(n1-n2));
//        }
//        else if (select==3) {
//            System.out.println(+(n1*n2));
//        }
//        else if (select==4) {
//            if(n2!=0){
//            System.out.println(+(n1/n2));}
//            else{
//                    System.out.println("You cannot divide by zero!");
//                }
//
//            }
//        else {
//            System.out.println("you may choose an wrong choix,Please try again !");
//
////    }
//
//        int n1,n2,select;
//        Scanner it =new Scanner(System.in);
//
//
//        System.out.println("Enter your first number:");
//        n1= it.nextInt();
//        System.out.println("Enter your second number:");
//        n2= it.nextInt();
//        System.out.println("1-addition\n2-substraction\n3-multiplication\n4-division");
//        System.out.println("Please enter your choix");
//        select= it.nextInt();
//
//
//        // Switch case for selected operation
//        switch (select) {
//            case 1:
//                System.out.println("Result: " + (n1 + n2));
//                break;
//            case 2:
//                System.out.println("Result: " + (n1 - n2));
//                break;
//            case 3:
//                System.out.println("Result: " + (n1 * n2));
//                break;
//            case 4:
//                if (n2 != 0) {
//                    System.out.println("Result: " + (n1 / n2));
//                } else {
//                    System.out.println("You cannot divide by zero!");
//                }
//                break;
//            default:
//                System.out.println("You may have chosen a wrong option. Please try again!");
//        }






        /*pratik 11
        Kullanıcı Girişi
        /
         */
//
//        String userName,password;
//        Scanner inp=new Scanner(System.in);
//        System.out.println("enter your userName:");
//        userName=inp.nextLine();
//        System.out.println("enter your password:");
//        password=inp.nextLine();
//
//        if(userName.equals("Patika") && password.equals("java1234")){
//
//            System.out.println("you are successfully connected !");
//
//        }
//        else{
//            System.out.println("you entered the wrong informations !");
//
//    }





        /*pratik12
        Ödev:
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
         eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
          şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
           sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
        /
         */

//
//        Scanner input = new Scanner(System.in);
//
//        String correctPassword = "212879";
//
//        System.out.println("Enter your password:");
//        String password = input.nextLine();
//
//        if (!password.equals(correctPassword)) {
//            System.out.println("You may have entered a wrong password!");
//
//            System.out.println("Do you want to reinitialize? (yes/no):");
//            String resetPassword = input.nextLine();
//
//            if (resetPassword.equalsIgnoreCase("yes")) {
//                System.out.println("Enter your new password:");
//                String newPassword = input.nextLine();
//
//                if (newPassword.equals(correctPassword)) {
//                    System.out.println("The password is not created! Please choose a different password.");
//                } else {
//                    System.out.println("The password is created!");
//                }
//            } else {
//                System.out.println("Password reset is canceled!");
//            }
//
//        } else {
//            System.out.println("Successfully connected!");
//        }
//
//        input.close();



        /*pratik13/

        Sınıfı Geçme Durumu
         */

//        double maths, physics, turkish, chemistry, music;
//        double passMark = 55;
//        double total = 0;
//        int coursNumber = 0;
//
//        Scanner input = new Scanner(System.in);
//
//        // Math score
//        System.out.println("Enter your Maths mark:");
//        maths = input.nextDouble();
//        if (maths >= 0 && maths <= 100) {
//            total += maths;
//            coursNumber++;
//        }
//
//        // Physics score
//        System.out.println("Enter your Physics mark:");
//        physics = input.nextDouble();
//        if (physics >= 0 && physics <= 100) {
//            total += physics;
//            coursNumber++;
//        }
//
//        // Turkish score
//        System.out.println("Enter your Turkish mark:");
//        turkish = input.nextDouble();
//        if (turkish >= 0 && turkish <= 100) {
//            total += turkish;
//            coursNumber++;
//        }
//
//        // Chemistry score
//        System.out.println("Enter your Chemistry mark:");
//        chemistry = input.nextDouble();
//        if (chemistry >= 0 && chemistry <= 100) {
//            total += chemistry;
//            coursNumber++;
//        }
//
//        // Music score
//        System.out.println("Enter your Music mark:");
//        music = input.nextDouble();
//        if (music >= 0 && music <= 100) {
//            total += music;
//            coursNumber++;
//        }
//
//        // Calculate average only with valid scores
//        double average = (coursNumber > 0) ? total / coursNumber : 0;
//
//        // Check if the student passes
//        if (average >= passMark) {
//            System.out.println("Congratulations! You are an honor student.");
//        } else {
//            System.out.println("Sorry, you failed. We hope to see you next year with more determination.");
//        }
//
//        System.out.println("Your Average is: " + average);
//
//        input.close();



        /*pratik 14
        Hava Sıcaklığına Göre Etkinlik Önerme/
        Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */

//        int heat;
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter the value of heat:");
//        heat= input.nextInt();
//        if(heat<=5){
//            System.out.println("kayak yapabilirsiniz");
//        }
//        else if(heat<=15){
//            System.out.println("Sinemaya gidebilirsiniz");
//        }
//      else if(heat<=25){
//            System.out.println("piknik yapabilirsiniz");
//        }
//        else{
//            System.out.println("yuzume gidebilirsiniz");
//        }
//






        /*pratik15
        / Sayıları Büyükten Küçüğe Sıralama
         */
//        int a,b,c;
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter the value of a:");
//        a= input.nextInt();
//        System.out.println("Enter the value of b:");
//        b= input.nextInt();
//        System.out.println("Enter the value of c:");
//        c= input.nextInt();
//
//        if(a<b && a<c){
//            if(b<c){
//                System.out.println("a<b<c");
//            }
//            else {
//                System.out.println("a<c<b");
//            }
//        } else if (b<a && b<c) {
//            if(a<c){
//                System.out.println("b<a<c");
//            }
//            else {
//                System.out.println("b<c<a");
//            }
//
//        } else if (c<b && c<a) {
//            if(a<b){
//                System.out.println("c<a<b");
//            }
//            else {
//                System.out.println("c<b<a");
//            }
//
//        }



        /*pratik16

        Burç Bulan Program
             Aries Horoscope : March 21 - April 20

Taurus Horoscope : April 21 - May 21

Gemini Horoscope : May 22 - June 22

Cancer Horoscope : June 23 - July 22

Leo Horoscope : July 23 - August 22

Virgo Horoscope : August 23 - September 22

Libra Horoscope : September 23 - October 22

Scorpio Horoscope : October 23 - November 21

Sagittarius Horoscope : November 22 - December 21

Capricorn : December 22 - January 21

Aquarius Horoscope : January 22 - February 19

Pisces Horoscope : February 20 - March 20


        * */


//        int month, day;
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the month: ");
//        month = input.nextInt();
//
//        System.out.print("Enter the day: ");
//        day = input.nextInt();
//
//        String horoscope = "";
//        boolean isError = false;
//
//        if (month == 1) {
//            if (day >= 1 && day <= 31) {
//                if (day >= 20) {
//                    horoscope = "Aquarius";
//                } else {
//                    horoscope = "Capricorn";
//                }
//            } else {
//                isError = true;
//            }
//        } else if (month == 2) {
//            if (day >= 1 && day <= 29) {
//                if (day >= 20) {
//                    horoscope = "Pisces";
//                } else {
//                    horoscope = "Aquarius";
//                }
//            } else {
//                isError = true;
//            }
//        } else if (month == 3) {
//            if (day >= 1 && day <= 31) {
//                if (day >= 21) {
//                    horoscope = "Aries";
//                } else {
//                    horoscope = "Pisces";
//                }
//            } else {
//                isError = true;
//            }
//        } else if (month == 4) {
//            if (day >= 1 && day <= 30) {
//                if (day >= 21) {
//                    horoscope = "Taurus";
//                } else {
//                    horoscope = "Aries";
//                }
//            } else {
//                isError = true;
//            }
//        } else if (month == 5) {
//            if (day >= 1 && day <= 31) {
//                if (day >= 21) {
//                    horoscope = "Gemini";
//                } else {
//                    horoscope = "Taurus";
//                }
//            } else {
//                isError = true;
//            }
//        } else if (month == 6) {
//            if (day >= 1 && day <= 30) {
//                if (day >= 22) {
//                    horoscope = "Cancer";
//                } else {
//                    horoscope = "Gemini";
//                }
//            } else {
//                isError = true;
//            }
//        } else if (month == 7) {
//            if (day >= 1 && day <= 31) {
//                if (day >= 23) {
//                    horoscope = "Leo";
//                } else {
//                    horoscope = "Cancer";
//                }
//            } else {
//                isError = true;
//            }
//        } else if (month == 8) {
//            if (day >= 1 && day <= 31) {
//                if (day >= 23) {
//                    horoscope = "Virgo";
//                } else {
//                    horoscope = "Leo";
//                }
//            } else {
//                isError = true;
//            }
//        } else if (month == 9) {
//            if (day >= 1 && day <= 30) {
//                if (day >= 23) {
//                    horoscope = "Libra";
//                } else {
//                    horoscope = "Virgo";
//                }
//            } else {
//                isError = true;
//            }
//        } else if (month == 10) {
//            if (day >= 1 && day <= 31) {
//                if (day >= 23) {
//                    horoscope = "Scorpio";
//                } else {
//                    horoscope = "Libra";
//                }
//            } else {
//                isError = true;
//            }
//        } else if (month == 11) {
//            if (day >= 1 && day <= 30) {
//                if (day >= 22) {
//                    horoscope = "Sagittarius";
//                } else {
//                    horoscope = "Scorpio";
//                }
//            } else {
//                isError = true;
//            }
//        } else if (month == 12) {
//            if (day >= 1 && day <= 31) {
//                if (day >= 22) {
//                    horoscope = "Capricorn";
//                } else {
//                    horoscope = "Sagittarius";
//                }
//            } else {
//                isError = true;
//            }
//        } else {
//            isError = true;
//        }
//
//        if (isError) {
//            System.out.println("You entered invalid information!");
//        } else {
//            System.out.println("Your horoscope: " + horoscope);
//        }


//        /*pratik 17
//
//         Uçak Bileti Fiyatı Hesaplama/
//         */
//
//        int km,age;
//       int  tripType ;
//       double perKm=0.1;
//
//        double totalPrice;
//        Scanner input =new Scanner(System.in);
//        System.out.print("Enter the km:");
//        km= input.nextInt();
//        System.out.print("enter your age:");
//        age= input.nextInt();
//        System.out.println("enter the trip type:");
//        tripType= input.nextInt();
//        if (km >= 0 && age >= 0 && (tripType == 1 || tripType == 2)) {
//             totalPrice= km * perKm;
//
//            if(age<12) {
//                totalPrice=km * perKm*0.5;
//            }
//            else if (age >= 12 && age <= 24) {
//                totalPrice=km * perKm*0.9;
//
//            } else if (age>65) {
//                totalPrice=km * perKm*0.7;
//
//            }
//            if(tripType==2){
//                totalPrice*=0.8;
//                totalPrice*=2;
//
//        }
//            System.out.println("The total price is: " + totalPrice+ " TL");
//
//
//        }
//        else {
//
//            System.out.println("You entered the wrong data");
//        }






        /*pratik18
        /


         */
//        int year;
//        String horoscope = "";
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your birth year: ");
//        year = input.nextInt();
//
//        int remainder = year % 12;
//
//        if (remainder == 0) {
//            horoscope = "Monkey";
//        } else if (remainder == 1) {
//            horoscope = "Rooster";
//        } else if (remainder == 2) {
//            horoscope = "Dog";
//        } else if (remainder == 3) {
//            horoscope = "Pig";
//        } else if (remainder == 4) {
//            horoscope = "Rat";
//        } else if (remainder == 5) {
//            horoscope = "Ox";
//        } else if (remainder == 6) {
//            horoscope = "Tiger";
//        } else if (remainder == 7) {
//            horoscope = "Rabbit";
//        } else if (remainder == 8) {
//            horoscope = "Dragon";
//        } else if (remainder == 9) {
//            horoscope = "Snake";
//        } else if (remainder == 10) {
//            horoscope = "Horse";
//        } else if (remainder == 11) {
//            horoscope = "Sheep";
//        }
//
//        System.out.println("Your Chinese Zodiac Sign: " + horoscope);














        /*pratik 18
        Ödev - Artık Yıl Hesaplama

        /
         */

//        int year;
//        Scanner input =new Scanner(System.in);
//        System.out.print("Enter the year:");
//        year= input.nextInt();
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                // L'année est divisible par 100, il faut vérifier si elle est divisible par 400
//                if (year % 400 == 0) {
//                    System.out.println(year + " is a leap year.");
//                } else {
//                    System.out.println(year + " is not a leap year.");
//                }
//            } else {
//                // L'année est divisible par 4 mais pas par 100, donc elle est bissextile
//                System.out.println(year + " is a leap year.");
//            }
//        } else {
//            // L'année n'est pas divisible par 4, donc elle n'est pas bissextile
//            System.out.println(year + " is not a leap year.");
//        }






        /*pratik 19

         * */

//        int n;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        n = input.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }








        /*pratik 20
        Ödev
Java döngüler ile 0'dan girilen sayıya
 kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
 ortalamasını hesaplayan programı yazınız.
        /
         */
//        int n = 0;
//        double total = 0;
//        int count = 0;  // To keep track of the count of divisible numbers
//        Scanner input = new Scanner(System.in);
//
//        // Prompt the user to enter a number
//        System.out.println("Enter the number:");
//        n = input.nextInt();
//
//        // Iterate from 0 to the entered number
//        for (int i = 0; i <= n; i++) {
//            // Check if i is divisible by both 3 and 4
//            if (i % 3 == 0 && i % 4 == 0) {
//                total += i;   // Add the number to total
//                count++;       // Increment the count
//            }
//        }
//
//        // Check if any number divisible by both 3 and 4 was found
//        if (count > 0) {
//            double average = total / count;  // Calculate the average
//            System.out.println("Average: " + average);
//        } else {
//            System.out.println("No numbers divisible by 3 and 4.");
//        }








        /*pratik 21


        /
         */


//                int n;
//                int total = 0;
//                Scanner input = new Scanner(System.in); // Créez le Scanner en dehors de la boucle
//
//                do {
//                    System.out.println("Enter a number:");
//                    n = input.nextInt(); // Demande de l'entrée utilisateur
//
//                    if (n % 2 != 0) { // Si le nombre est impair
//                        total += n;
//                    }
//
//                } while (n > 0); // Continue tant que le nombre est positif
//
//                System.out.println("Total of odd numbers: " + total); // Affiche le total
//                input.close(); // Fermez le Scanner après utilisation


        // pratik 22
//        int n;
//        double total = 0;
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter the number (odd number to stop):");
//        n = scan.nextInt();
//
//        while (n % 2 == 0) { // Tek sayı girilene kadar çalışır
//            if (n % 4 == 0) { // Hem çift hem de 4'ün katı kontrolü
//                total += n;
//            }
//            System.out.println("Enter the number (odd number to stop):");
//            n = scan.nextInt(); // Kullanıcıdan yeni giriş alınır
//        }
//
//        System.out.println("The total of numbers divisible by 4: " + total);


        // pratik 23


//        int n;
//        Scanner scan =new Scanner(System.in);
//        System.out.println("Enter a number :");
//        n= scan.nextInt();
//
//        System.out.println("Powers of 4 up to " + n + ":");
//        for (int i = 1; i <= n; i *= 4) { // 4'ün kuvvetleri
//            System.out.println(i);
//        }
//
//        System.out.println("Powers of 5 up to " + n + ":");
//        for (int j = 1; j <= n; j *= 5) { // 5'in kuvvetleri
//            System.out.println(j);
//        }


        //pratik 24  C(n,r) = n! / (r! * (n-r)!)


//        int n,r=1;
//
//        Scanner  input =new Scanner(System.in);
//        System.out.println("Enter the value of n:");
//
//        n= input.nextInt();
//
//        System.out.println("Enter the value of r:");
//        r= input.nextInt();
//        if(r>n){
//            System.out.println("Error:r cannot be greater than n.");
//        }
//        else{
//            // let's calculate factorials:
//            int nfac=1, rfac=1,nMinusrFac=1;
//
//            for(int i=1;i<=n;i++){
//                nfac*=i;
//            }
//            for(int i =1;i<=r;i++){
//                rfac*=i;
//            }
//            for(int i=1;i<(n-r);i++){
//                nMinusrFac*=i;
//            }
//          // let's find combination
//            double c =(double) nfac/(rfac*nfac);
//            System.out.println("C(" + n + "," + r + ") = " + c);
//        }


        // pratik 26
//
//        int n,k;
//        int total=1;
//
//        Scanner inp =new Scanner(System.in) ;
//        System.out.println("Enter the base number:");
//        n= inp.nextInt();
//        System.out.println("Enter the number exponent:");
//        k= inp.nextInt();
//
//        for(int i=1;i<=k;i++){
//            total*=n;
//            System.out.println("Answer:"+total);
//        }


        // pratik 27
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int number = input.nextInt(); // Kullanıcıdan giriş al
//
//        int sum = 0;  // Basamak toplamını tutacak değişken
//        int tempNumber = Math.abs(number); // Negatif sayı için mutlak değer alınır
//
//        // Basamakları toplama
//        while (tempNumber != 0) {
//            sum += tempNumber % 10; // Son basamağı al ve toplama ekle
//            tempNumber /= 10; // Son basamağı kaldır
//        }
//
//        // Sonucu yazdır
//        System.out.println("The sum of the digits of " + number + " is: " + sum);


//        // pratik 28
//
//        Scanner scan =new Scanner(System.in);
//        System.out.print("Enter the number N:");
//        int n= scan.nextInt();
//        double result=0;
//        for(double  i =1;i<=n;i++){
//            result+=(1/i);
//
//
//        }
//        System.out.println("the result is :"+result);


//        //pratik 29
//
//
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter N:");
//        int n= input.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int k=1;k<=(n-i);k++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=(2*i)-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // pratik 30 odev elmas


//                Scanner scanner = new Scanner(System.in);
//
//                // Kullanıcıdan elmasın yüksekliğini alın (bir yarısı için)
//                System.out.print("Elmasın yüksekliğini girin (pozitif bir sayı): ");
//                int height = scanner.nextInt();
//
//                // Üst üçgen (elmasın üst kısmı)
//                for (int i = 1; i <= height; i++) {
//                    // Boşluklar
//                    for (int j = 1; j <= height - i; j++) {
//                        System.out.print(" ");
//                    }
//
//                    // Yıldızlar
//                    for (int j = 1; j <= 2 * i - 1; j++) {
//                        System.out.print("*");
//                    }
//
//                    System.out.println();
//                }
//
//                // Alt üçgen (elmasın alt kısmı)
//                for (int i = height - 1; i >= 1; i--) {
//                    // Boşluklar
//                    for (int j = 1; j <= height - i; j++) {
//                        System.out.print(" ");
//                    }
//
//                    // Yıldızlar
//                    for (int j = 1; j <= 2 * i - 1; j++) {
//                        System.out.print("*");
//                    }
//
//                    System.out.println();
//                }


        // pratik 31

//        String userName, password;
//        Scanner input = new Scanner(System.in);
//
//        int right = 3;
//        int balance = 1500;
//        int select = 0;
//
//        while (right > 0) {
//            System.out.print("Your username: ");
//            userName = input.nextLine();
//            System.out.print("Your password: ");
//            password = input.nextLine();
//
//            if (userName.equals("patika") && password.equals("dev123")) {
//                System.out.println("Welcome to your ZZZ Bank!");
//                do {
//                    System.out.println("\n1- Deposit Money\n" +
//                            "2- Withdraw Money\n" +
//                            "3- Check Balance\n" +
//                            "4- Exit");
//                    System.out.print("Select an option: ");
//
//                    // Validate input to prevent crashes
//                    if (!input.hasNextInt()) {
//                        System.out.println("Invalid input. Please enter a number between 1 and 4.");
//                        input.next(); // Clear invalid input
//                        continue;
//                    }
//
//                    select = input.nextInt();
//
//                    switch (select) {
//                        case 1:
//                            System.out.print("Enter deposit amount: ");
//                            if (input.hasNextInt()) {
//                                int deposit = input.nextInt();
//                                if (deposit > 0) {
//                                    balance += deposit;
//                                    System.out.println("Successfully deposited. New balance: " + balance);
//                                } else {
//                                    System.out.println("Invalid amount. Please enter a positive value.");
//                                }
//                            } else {
//                                System.out.println("Invalid input. Transaction cancelled.");
//                                input.next(); // Clear invalid input
//                            }
//                            break;
//
//                        case 2:
//                            System.out.print("Enter withdrawal amount: ");
//                            if (input.hasNextInt()) {
//                                int withdrawal = input.nextInt();
//                                if (withdrawal > balance) {
//                                    System.out.println("Insufficient balance.");
//                                } else if (withdrawal > 0) {
//                                    balance -= withdrawal;
//                                    System.out.println("Successfully withdrawn. New balance: " + balance);
//                                } else {
//                                    System.out.println("Invalid amount. Please enter a positive value.");
//                                }
//                            } else {
//                                System.out.println("Invalid input. Transaction cancelled.");
//                                input.next(); // Clear invalid input
//                            }
//                            break;
//
//                        case 3:
//                            System.out.println("Your balance: " + balance);
//                            break;
//
//                        case 4:
//                            System.out.println("Exiting... See you again!");
//                            break;
//
//                        default:
//                            System.out.println("Invalid selection. Please choose a valid option.");
//                            break;
//                    }
//                } while (select!= 4);
//                break;
//
//            } else {
//                right--;
//                System.out.println("Wrong username or password. Please try again.");
//                if (right == 0) {
//                    System.out.println("Your account is blocked. Please contact your bank.");
//                } else {
//                    System.out.println("Remaining attempts: " + right);
//                }
//            }
//        }


//        // pratik 32
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter the number N1:");
//        int n1= input.nextInt();
//        System.out.println("Enter the number N2:");
//        int n2= input.nextInt();
//        int i=1;
//        int ebob=1;
//        while (n2>=n1){
//            if(n1%i==0 && n2%i==0){
//                ebob=i;
//
//                System.out.println("the ebob is :"+ebob);
//
//
//            }
//            i++;
//break;
//        }
//
//// ekok


        // pratik 33


//        Scanner input = new Scanner(System.in);
//
//        System.out.print("How many numbers will you enter? ");
//        int n = input.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Please enter a positive number.");
//        } else {
//            System.out.print("Enter number 1: ");
//            int firstNumber = input.nextInt();
//            int max = firstNumber;
//            int min = firstNumber;
//
//            for (int i = 2; i <= n; i++) {
//                System.out.print("Enter number " + i + ": ");
//                int num = input.nextInt();
//
//                if (num > max) {
//                    max = num;
//                }
//                if (num < min) {
//                    min = num;
//                }
//            }
//
//            System.out.println("The largest number is: " + max);
//            System.out.println("The smallest number is: " + min);
//        }



//        //pratik 34
//
//        Scanner input =new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int number = input.nextInt();
//        int sum = 0;
//
//        // Proper divisors are calculated
//        for (int i = 1; i < number; i++) {
//            if (number % i == 0) {
//                sum += i;
//            }
//        }
//
//
//        if(sum==number && number>0){
//            System.out.println(number+ "the entered number is a perfect number");
//        }
//        else {
//            System.out.println(number+ "the entered number is not  a perfect number");
//        }


       /*pratik 35
       * Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
       *  yıldızlar(*) ile ekrana ters üçgen çizen programı yazın
       * */

//        Scanner scanner =new Scanner(System.in);
//
//        System.out.print("Enter a integer:");
//        int n= scanner.nextInt();
//
//        for(int i=n; i>0; i--){
//            for(int k=0;k<(n-i);k++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<(2*i-1);j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //pratik 36

//        System.out.println("Prime numbers between 1 and 100:");
//
//        for (int number = 2; number <= 100; number++) {
//            boolean isPrime = true;
//
//            for (int divisor = 2; divisor < number; divisor++) {
//                if (number % divisor == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.print(number + " ");
//            }
//        }



        //pratik 38

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of Fibonacci series elements: ");
//        int n = scanner.nextInt();
//
//        int first = 0, second = 1;
//
//        System.out.print("Fibonacci Series: " + first + " " + second);
//
//        for (int i = 2; i < n; i++) {
//            int next = first + second;
//            System.out.print(" " + next);
//            first = second;
//            second = next;
//        }



        // pratik 39

//        System.out.println(isPaliandrome(458));
//    }
//
//    static  boolean isPaliandrome(int number){
//        int temp=number,reverseNumber=0,lastNumber;
//
//        while(temp!=0){
//            lastNumber=temp%10;
//            reverseNumber=(reverseNumber*10) +lastNumber;
//            temp/=10;
//        }
//        if(number==reverseNumber){
//            return true;
//
//        }
//        else {
//            return false;
//        }


        //pratik 40

//
//        System.out.println(fibonacci(6));
//    }
//    static  int fibonacci(int n){
//     if(n==1||n==2) {
//         return 1;
//     }
//     return fibonacci(n-1)+fibonacci(n-2);




        //pratik 41






//        Scanner input =new Scanner(System.in);
//        int select;
//        String menu="1-addition operation\n "
//                +"2-subtraction\n"
//                +"3-multiplication\n"
//                +"4-division\n"
//                +"5-power\n"
//                +"6-mod\n"
//                +"7-Calculation area and perimeter\n"
//                +"0-exit";
//        System.out.println(menu);
//        while(true){
//
//            System.out.println("select an operation:");
//            select= input.nextInt();
//            if(select==0){
//                break;
//            }
//            System.out.print("Enter the first number:");
//            int a= input.nextInt();
//            System.out.print("Enter the second number:");
//            int b= input.nextInt();
//            switch (select){
//                case 1:
//                    sum(a,b);
//                    break;
//                case 2:
//                    subtraction(a,b);
//                    break;
//                case 3:
//                    multiplication(a,b);
//                    break;
//                case 4:
//                  division(a,b);
//                    break;
//                case 5:
//                    power(a,b);
//                    break;
//                case 6:
//                    System.out.println("mod operation"+mod(a,b));
//                    break;
//                case 7:
//                 calculate(a,b);
//                    break;
//                default:
//                    System.out.println("you entered a wrong operation, try again:");
//            }
//        }
//
//
//
//
//    }
//
//    static int sum(int a,int b){
//        int result =a+b;
//        System.out.println("addition:"+result);
//        return result;
//    }
//    static int subtraction(int a,int b){
//        int result =a-b;
//        System.out.println("subtraction:"+result);
//        return result;
//    }
//    static int multiplication(int a,int b){
//        int result =a*b;
//        System.out.println("multiplication:"+result);
//        return result;
//    }
//    static int division(int a,int b){
//        if(b==0){
//            System.out.println("the second number should be greater than zero");
//            return 0;
//        }
//        int result =a/b;
//        System.out.println("division:"+result);
//        return result;
//    }
//    static int power(int a,int b){
//        int result =1;
//       for(int i=1;i<b;i++){
//           result*=a;
//       }
//        return result;
//    }
//    static int mod(int a,int b){
//
//        return a%b;
//    }
//    static void calculate(int a,int b){
//
//        System.out.println("perimeter of rectangle:"+(2*(a+b)));
//        System.out.println("Area:" +(a*b));



//

        //pratik 43

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = input.nextInt();


        // Asallık kontrolü
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    // Asal sayı kontrolü yapan metot
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // 2'den küçük sayılar asal değildir
        }
        for (int i = 2; i * i <= n; i++){ // Yalnızca kareköküne kadar kontrol et
            if (n % i == 0) {
                return false; // Bölen bulundu, asal değil
            }
        }
        return true; // Bölen bulunmadı, asal
    }
}







