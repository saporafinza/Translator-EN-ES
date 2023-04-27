package com.saporafinza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {
	
	private static final Map<String, String> EN_TO_ES = new HashMap<>();
	private static final Map<String, String> ES_TO_EN = new HashMap<>();
	
	static {
		EN_TO_ES.put("hello", "hola");
		EN_TO_ES.put("goodbye", "adios");
		EN_TO_ES.put("thank you", "gracias");
		
		Map<String, String> tempMap = new HashMap<>();
		
		for (Map.Entry<String, String> entry : EN_TO_ES.entrySet()) {
		    tempMap.put(entry.getValue(), entry.getKey());
		}
		
		ES_TO_EN.putAll(tempMap);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("İngilizce için '1', İspanyolca için '2' tuşuna basınız.");
		int direction = scanner.nextInt();
		
		if(direction == 1) {
			System.out.println("İngilizce'den İspanyolca'ya çevirmek istediğiniz kelimeyi giriniz.");
			String emglishText = scanner.next();
			String spanishTranslation = EN_TO_ES.get(emglishText.toLowerCase());
			
			if(spanishTranslation != null) {
				System.out.println("Çeviri: " + spanishTranslation);
			} else {
				System.out.println("Çeviri bulunamadı...");
			}
		} else if(direction == 2) {
			System.out.println("İspanyolca'dan İngilizce'ye çevirmek istediğiniz kelimeyi giriniz.");
			String spanishText = scanner.next();
			String englishTranslation = ES_TO_EN.get(spanishText.toLowerCase());
			
			if(englishTranslation != null) {
				System.out.println("Çeviri: " + englishTranslation);
			} else {
				System.out.println("Çeviri bulunamadı...");
			}
		} else {
			System.out.println("Geçersiz veri. Uygulama sonlandırılıyor...");
			System.exit(0);
		}
		
	}

}
