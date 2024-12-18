import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, secim;
        

        System.out.println("Lütfen 1. Sayısı Giriniz");
        n1 = input.nextInt();
        System.out.println("Lütfen 2. Sayısı Giriniz");
        n2 = input.nextInt();
        System.out.println("Toplama 1\n Çıkartma 2 \n Bölme 3 \n Çarpma 4");
        secim = input.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Toplama Sonucu: " + (n1+n2));
                break;
            case 2:
                System.out.println("Çikartma Sonucu: " + (n1-n2));
                break;   
            case 3:
                System.out.println("Bölme Sonucu: " + (n1/n2));
                break; 
            case 4:
                System.out.println("Çarpma Sonucu: " + (n1*n2));
                break;  
            default:
                System.out.println("Program Hatası");
        }
    }
}
