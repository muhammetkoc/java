import java.util.Scanner;

public class kmHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe, yas=0, yolculuk=0;
        double indirim = 0, toplamTutar, indirimliTutar; 

        System.out.println("Lütfen Gideceğiniz Mesafeyi KM olarak giriniz");
        mesafe = input.nextInt();
        if(mesafe<0){
                System.out.println("Hatalı Veri Girdiniz");  
        }else{
            System.out.println("Lütfen Yaşınızı Giriniz");
            yas = input.nextInt();
            if(yas<0){
                    System.out.println("Hatalı Veri Girdiniz");  
            }else{
                System.out.println("Yolculuk Türünüzü Seçin: \n 1- Tek Yön \n 2- Çift Yön");
                yolculuk = input.nextInt();
                if(yolculuk<0){
                        System.out.println("Hatalı Veri Girdiniz");  
                }else{
                    toplamTutar = mesafe * 0.10;
                    if(yas < 12){
                        indirim += toplamTutar * 0.50;
                        indirimliTutar= toplamTutar- indirim;
                    }else if(yas >= 12 && yas <24){
                        indirim += toplamTutar * 0.10;
                        indirimliTutar= toplamTutar- indirim;
                    }else{
                        indirim += toplamTutar * 0.30;
                        indirimliTutar= toplamTutar- indirim;
                    }

                    if(yolculuk == 2){
                        System.out.println(indirim);
                        indirim += (toplamTutar-indirim) * 0.20;
                        System.out.println(indirim);
                        indirimliTutar = (toplamTutar- indirim)* 2 ;
                    }

                    System.out.println("İndirimsiz Yolculuk Tutarınız: "+ toplamTutar +"\n Kazandığınız İndirimler : "+ indirim + "\n indirimden Sonraki "+ yolculuk + " Yönlü Yolculuğunuz için Toplam Tutarınız: " +(indirimliTutar) );
            
                }
            }
        }
     }
}
