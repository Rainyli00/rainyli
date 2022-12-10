package develop;
import java.util.*;
public class siralamamain {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int [] a = new int[10];
	    int n;
	    int liste;
		System.out.println("Lütfen Dizinin elemanlarını giriniz.");
		for(int i=0;i<a.length;i++) {
			a[i]=klavye.nextInt();
		}
		do {
		System.out.println("Lütfen Bir Seçenek Seçiniz");
		System.out.println("1-Yeni Dizi\n2-Seçerek Sıralama\n3-Kabarcık Sıralama\n4-Birleştirme Sıralaması\n5-Tüm Sıralamalar(hepsi)\n0-Çıkış");
		n=klavye.nextInt();
		switch(n) {
		case 0:
			System.out.println("Çıkış Yaptınız..");
			System.exit(0);
			
		case 1: 
			System.out.print("Yeni Dizi Elemanlarını Giriniz.\n");
			for(int i=0;i<a.length;i++) {	
			a[i]=klavye.nextInt();
		}
			System.out.println("Yeni dizi oluşturuldu\n");
			break;
			
		case 2:
			System.out.println("Seçerek Sıralamanız:\n");
			 siralama secerekx = new siralama();
			 secerekx.secerek(a);
			 for(int i=0;i<10;i++) {
				 System.out.println(a[i]);
				  }
			break;
			
		case 3:
		System.out.println("Kabarcık Sıralamanız:\n");
		 siralama kabarciks = new siralama();
		 kabarciks.kabarcik(a);
		 for(int i=0;i<10;i++) {
			 System.out.println(a[i]);
			 
		 }
			
			break;
		case 4:
			System.out.println("Birleştirme Sıralaması:\n");
			 siralama siralamas = new siralama();
			 siralamas.merge(a,a,a,5,5);
			 for(int i=0;i<10;i++) {
				 System.out.println(a[i]); }
break;
			 
		case 5:
			System.out.println("Kabarcık:\n");
			 siralama kabarcika = new siralama();
			 kabarcika.kabarcik(a);
			 for(int i=0;i<10;i++) {
				 System.out.println(a[i]);
				 
				 
				 System.out.println("Seçerek:\n");
				 siralama secerekb = new siralama();
				 secerekb.secerek(a);
				 for(i=0;i<10;i++) {
					 System.out.println(a[i]);
					 
					 }
				break;
				 
			 }
		
		default: System.out.println("Verilen Seçeneklerden başka bir seçenek seçtiniz lütfen tekrar deneyin");
			break;
		}
		}while(n != 0);
	}

}
