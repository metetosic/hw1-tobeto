package intro;

public class sayiBulma {

	public static void main(String[] args) {

		int [] sayilar = new int []{1,2,5,7,9,0};
		int aranacak = 1;
		boolean varMi=false;
		
		for(int i=0;i<sayilar.length;i++) {
			if(aranacak==sayilar[i]) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Aradığınız sayı dizi içerisinde bulunmaktadır.");
		}else {
			System.out.println("Aradığınız sayı dizi içerisinde bulunmamaktadır.");
		}
	}
}