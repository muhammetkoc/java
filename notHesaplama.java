import java.util.Scanner;
public class notHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik, toplam = 0 ;
        double  ort ;

        System.out.println("Lütfen Matematik Notunuzu Girin");
        mat = input.nextInt();
        if (0<=mat && mat<=100) toplam += mat;

        System.out.println("Lütfen Matematik Notunuzu Girin");
        fizik = input.nextInt();
        if (0<=fizik && fizik<=100) toplam += fizik;

        System.out.println("Lütfen Matematik Notunuzu Girin");
        turkce = input.nextInt();
        if (0<=turkce && turkce<=100) toplam += turkce;

        System.out.println("Lütfen Matematik Notunuzu Girin");
        kimya = input.nextInt();
        if (0<=kimya && kimya<=100) toplam += kimya;

        System.out.println("Lütfen Matematik Notunuzu Girin");
        muzik = input.nextInt();
        if (0<=muzik && muzik<=100) toplam += muzik;

        ort = toplam / 5;
        if(ort < 55) {
                System.out.println("Maalesef Sınıfta Kaldınız");
        }else{
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }
        System.out.println("Not Ortalamanız: "+ ort);
    }
}
