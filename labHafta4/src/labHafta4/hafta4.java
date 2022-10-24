package labHafta4;

import java.util.Scanner;

public class hafta4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] soru1= {1,2,3,4};
		int[] soru2= {1,2,3,4};
		int[] soru3= {1,2,3,4};
		int[] soru4= {1,2,3,4};
		int[] soru5= {1,2,3,4};
		int sonuc=0;
		int cevap1=0,cevap2=0,cevap3=0,cevap4=0,cevap5=0;
		
		System.out.println(
				"A harfi 1    -"+
				"B harfi 2    -"+
				"C harfi 3    -"+
				"D harfi 4 e karsilik gelmektedir!");
		
		System.out.println("Soru1- Asagidakilerden hangisi kuresel isinmanin sonuclarinden biri degildir?");
		System.out.println("A) Ortalama deniz seviyesinin yukselmesi");
		System.out.println("B) Tatli su kaynklarinin azalmasi");
		System.out.println("C) Buzullarin artmasi");
		System.out.println("D) Denizlerin sogumasi");
		
		System.out.println("Lutfen 1-2-3-4 sayilarindan birini giriniz: ");
		cevap1=input.nextInt();
		
		if(cevap1==soru1[2]) {
			sonuc++;
			System.out.println("Tebrikler Dogru Cevap");
		}
		else {
			System.out.println("Yanlis Cevap");
		}
		
		System.out.println("Soru2- Asagidakilerden hangisi kuresel isinmanin sonuclarinden biri degildir?");
		System.out.println("A) Ortalama deniz seviyesinin yukselmesi");
		System.out.println("B) Tatli su kaynklarinin azalmasi");
		System.out.println("C) Buzullarin artmasi");
		System.out.println("D) Denizlerin sogumasi");
		
		System.out.println("Lutfen 1-2-3-4 sayilarindan birini giriniz: ");
		cevap2=input.nextInt();
		
		if(cevap2==soru2[2]) {
			sonuc++;
			System.out.println("Tebrikler Dogru Cevap");
		}
		else {
			System.out.println("Yanlis Cevap");
		}
		
		System.out.println("Soru3- Asagidakilerden hangisi kuresel isinmanin sonuclarinden biri degildir?");
		System.out.println("A) Ortalama deniz seviyesinin yukselmesi");
		System.out.println("B) Tatli su kaynklarinin azalmasi");
		System.out.println("C) Buzullarin artmasi");
		System.out.println("D) Denizlerin sogumasi");
		
		System.out.println("Lutfen 1-2-3-4 sayilarindan birini giriniz: ");
		cevap3=input.nextInt();
		
		if(cevap3==soru3[2]) {
			sonuc++;
			System.out.println("Tebrikler Dogru Cevap");
		}
		else {
			System.out.println("Yanlis Cevap");
		}
		
		System.out.println("Soru4- Asagidakilerden hangisi kuresel isinmanin sonuclarinden biri degildir?");
		System.out.println("A) Ortalama deniz seviyesinin yukselmesi");
		System.out.println("B) Tatli su kaynklarinin azalmasi");
		System.out.println("C) Buzullarin artmasi");
		System.out.println("D) Denizlerin sogumasi");
		
		System.out.println("Lutfen 1-2-3-4 sayilarindan birini giriniz: ");
		cevap4=input.nextInt();
		
		if(cevap4==soru4[2]) {
			sonuc++;
			System.out.println("Tebrikler Dogru Cevap");
		}
		else {
			System.out.println("Yanlis Cevap");
		}
		
		System.out.println("Soru5- Asagidakilerden hangisi kuresel isinmanin sonuclarinden biri degildir?");
		System.out.println("A) Ortalama deniz seviyesinin yukselmesi");
		System.out.println("B) Tatli su kaynklarinin azalmasi");
		System.out.println("C) Buzullarin artmasi");
		System.out.println("D) Denizlerin sogumasi");
		
		System.out.println("Lutfen 1-2-3-4 sayilarindan birini giriniz: ");
		cevap5=input.nextInt();
		
		if(cevap5==soru5[2]) {
			sonuc++;
			System.out.println("Tebrikler Dogru Cevap");
		}
		else {
			System.out.println("Yanlis Cevap");
		}
		
		if (sonuc==5) {
			System.out.println("Mukkemmel");
		}
		if (sonuc==4) {
			System.out.println("Cok iyi");
		}
		if (sonuc<=3) {
			System.out.println("Kuresel Isinma Hakkinda Daha Fazla Bilgi Edenmelisiniz");
		}
	}


	}


