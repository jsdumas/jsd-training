package io.jsd.training.binary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReading {
	
	private static int getByte(byte byteValue) {
		return byteValue & 0xff;
	}
	
	public static int getNumeroTrain(byte[] byteArray) {
		return ((getByte(byteArray[17]) & 0x3) << 8) | getByte(byteArray[18]);
	}

	public static void main(String[] args) throws IOException {
		String nomFichier = "src/MiniDamSacem_2013-08-26";
		File fichier = new File(nomFichier);
		// tab de byte qui contiendra ici tout ton fichier
		byte[] tableau = new byte[(int) fichier.length()];

		// creation du fis
		FileInputStream fis = new FileInputStream(fichier);
		/*
		 * lecture dans ton fichier le 1er parametre correspond a la destination le 2nd
		 * parametre a l'octet de d�part et le 3eme parametre combien d'octet tu va lire
		 */
		System.out.println(fichier.length());
		System.out.println(fis.read(tableau, 0, (int) fichier.length()));
		System.out.println(getNumeroTrain(tableau));
	}

}
