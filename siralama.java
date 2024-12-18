import java.util.Scanner;
public class siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c; 

        System.out.println("Lütfen 1. Sayıyı Giriniz");
        a = input.nextInt();

        System.out.println("Lütfen 1. Sayıyı Giriniz");
        b = input.nextInt();

        System.out.println("Lütfen 1. Sayıyı Giriniz");
        c = input.nextInt();

        if(a<b && a<c){
            if(b < c){
                System.out.println("Sayıların Küçükten büyüğe sıralanışı +{a} + {b} + {c}");
            }else{
                System.out.println("Sayıların Küçükten büyüğe sıralanışı +{a} + {c} + {b}");
            }
        }else if (b<a && b<c){
            if(a < c){
                System.out.println("Sayıların Küçükten büyüğe sıralanışı +{b} + {a} + {c}");
            }else{
                System.out.println("Sayıların Küçükten büyüğe sıralanışı +{b} + {c} + {a}");
            } 
        }else{
            if(a < b){
                System.out.println("Sayıların Küçükten büyüğe sıralanışı +{c} + {a} + {b}");
            }else{
                System.out.println("Sayıların Küçükten büyüğe sıralanışı +{c} + {b} + {a}");
            }
        }
    }
}
