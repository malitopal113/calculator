package Calculator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("HESAP MAKİNESİ");
		int ilkSayi, ikinciSayi, select; 
Scanner inp = new Scanner(System.in);
		
		System.out.print("Birinci Sayıyı Girin: ");
		ilkSayi = inp.nextInt();
		
		System.out.print("İkinci Sayıyı Girin: ");
		ikinciSayi = inp.nextInt();
		
		System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
		System.out.print("Yapmak istediğiniz işlem no: ");
		
		select = inp.nextInt();
		
		switch (select) {
			case 1:
				System.out.println("Toplam: " + ( ilkSayi + ikinciSayi ));
				break;
			case 2:
				System.out.println("Çıkarma: " + ( ilkSayi - ikinciSayi ));
				break;
			case 3:
				System.out.println("Çarpma: " + ( ilkSayi * ikinciSayi ));
				break;
			case 4:
				if (ikinciSayi == 0) {
					System.out.println("Bir sayı 0'a bölünemez!!!");
					break;
				};
				System.out.println("Bölme: " + ( ilkSayi / ikinciSayi ));
				break;
		}
		
	}

}
