package io.jsd.training.binary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReading {
	
	private static final String FICHIER_PATH = "src/main/resources/MiniDamSacem_2013-08-26";
	
	public static void main(String[] args) throws IOException {
		File fichier = new File(FICHIER_PATH);
		// tab de byte qui contiendra ici tout ton fichier
		byte[] trame = new byte[(int) fichier.length()];
		MiniDamBaseConverter miniDamBaseConverter = new MiniDamBaseConverter(trame);
		// creation du fis
		FileInputStream fis = new FileInputStream(fichier);
		/*
		 * lecture dans ton fichier le 1er parametre correspond a la destination le 2nd
		 * parametre a l'octet de d�part et le 3eme parametre combien d'octet tu va lire
		 */
		System.out.println(fichier.length());
		System.out.println(fis.read(trame, 0, (int) fichier.length()));
//		System.out.println("Numéro du train " + miniDamBaseConverter.getNumeroTrain());
//		System.out.println("Code du message "+miniDamBaseConverter.getCodeMessage(0));
//		System.out.println(trame[0]);
		System.out.println("Code mission " + miniDamBaseConverter.getCodeMission(7));
//		System.out.println("Sens de circulation "+miniDamBaseConverter.getSensCirculation(0));
		
		FrameReader frameReader = new FrameReader(trame);
		
		System.out.println("************FRAME***************");
//		System.out.println("Code du message "+frameReader.fieldTranslator(MiniDamBase.CODE_MESSAGE_BLOC_0));
//		System.out.println("Sens de circulation "+frameReader.fieldTranslator(MiniDamBase.SENS_CIRCULATION_BLOC_0));
		System.out.println("Code mission "+frameReader.fieldTranslator(MiniDamBase.CODE_MISSION_BLOC_7));
		
	}

}
