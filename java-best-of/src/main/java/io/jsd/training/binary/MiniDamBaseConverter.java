package io.jsd.training.binary;

public class MiniDamBaseConverter {
	
	private final byte[] trame;
	
	public MiniDamBaseConverter(byte[] trame) {
		this.trame=trame;
	}
	
	private int getUnsignedByte(int id) {
		return trame[id] & 0xff;
	}
	
	/*
	 * TOUS LES BLOCS
	 */
	public int getCodeMessage(int numeroBloc) {
		return ((getUnsignedByte(numeroBloc*8) & 0xC0) >> 6) ;
	}
	
	public String getCodeMission(int numeroBloc) {
		int codeDecimal = ((getUnsignedByte(numeroBloc*8) & 0x3F) << 4) | ((getUnsignedByte((numeroBloc*8)+1) & 0xF0) >> 4);
		byte[] codeByte = new byte[2];
		codeByte[0] = (byte) (((codeDecimal & 0xFFE0) >> 5) | 0x40);
		codeByte[1] = (byte) ((codeDecimal & 0x1F) | 0x40);
		return new String(codeByte);
	}
	
	public int getSensCirculation(int numeroBloc) {
		return ((getUnsignedByte((numeroBloc*8)+1) & 0xC) >> 2) ;
	}
	
	/*
	 * BLOC 0 : byte 0 à 7
	 */
	//bloc 0 : Nombre de FU de conduite (FU5, 7 et 2 avec variant valide)
	public int getFuCondui() {
		return ((getUnsignedByte(1) & 0x3) << 1) | ((getUnsignedByte(2) & 0x80) >> 7);
	}
	
	//bloc 0 : Activation correcte par secteur 1 bit par secteur
	public int getActivationParSecteur() {
		return ((getUnsignedByte(5) & 0xF) << 8) | getUnsignedByte(6);
	}
	
	// bloc 0 : Nombre de défauts de balises (9,10,11,12,15,17)
	public int getDefautLocBalise() {
		return (getUnsignedByte(7) & 0xC0) >> 6;
	}
	
	/*
	 * BLOC 1 : byte 8 à 15
	 */
	
	/*
	 * BLOC 2 : byte 16 à 23
	 */
	//bloc 2 : Numéro de train
	public int getNumeroTrain() {
		// byteArray[17] : on prend le 18e octet
		// & 0x3 (masque binaire) : on sélection les deux bits de poids faible de l'octet : 00000011
		// << 8 : on décale les deux bits sélectionnés de 8 positions vers la gauche : 1100000000
		// | getByte(byteArray[18] : on fait un OU logique entre 1100000000 et la 19e octet du tableau
		return ((getUnsignedByte(17) & 0x3) << 8) | getUnsignedByte(18);
	}
	
	//bloc 2 : Nombre de FU avec cadre vert 7
	public int getFu7CadreVert() {
		return (getUnsignedByte(19) & 0xC0) >> 6;
	}
	
	
	//bloc 2 : Nombre de FU avec cadre vert 2
	public int getFu2CadreVert() {
		return (getUnsignedByte(19) & 0x30) >> 4;
	}
	
	//bloc 2 : Nombre de FU avec cadre jaune 7
	public int getFu7CadreJaune() {
		return (getUnsignedByte(19) & 0xC) >> 2;
	}
	
	//bloc 2 : Nombre de FU avec cadre jaune 2
	public int getFu2CadreJaune() {
		return getUnsignedByte(19) & 0x3;
	}
	
	
	/*
	 * BLOC 3 : byte 24 à 31
	 */
	//bloc 3 : Type de train
	public int getTypeTrain() {
		return getUnsignedByte(25) & 0x3;
	}
	
	//bloc 3 : Nombre de FU pour dépassement de vitesse autorisée 6
	
	//bloc 3 : Nombre de FU pour décélération avec voyant jaune 7
	public int getFu7DecelerationVoyantJaune() {
		return (getUnsignedByte(27) & 0xC0) >> 6;
	}
	
	//bloc 3 : Nombre de FU vitesse supérieure à 30km/h avec voyant jaune 7
	public int getFu7VitSup30() {
		return (getUnsignedByte(27) & 0x30) >> 4;
	}
	
	//bloc 3 : Nombre de FU avec voyant jaune 2
	public int getFu2VoyantJaune() {
		return (getUnsignedByte(27) & 0xC) >> 2;
	}
	
	//bloc 3 : Nombre de FU avec voyant rouge
	public int getFuVoyantRouge() {
		return getUnsignedByte(27) & 0x3;
	}
	

	/*
	 * BLOC 4 : byte 32 à 39
	 */
	//bloc 4 : Nombre de FU avec voyant rouge clignotant
	public int getFuVoyantRougeClignotant() {
		return (getUnsignedByte(35) & 0xC) >> 2;
	}
	
	/*
	 * BLOC 5 : byte 40 à 47
	 */
	//bloc 5 : Nombre de FU avec variant valide et réduction du point but 
	public int getFuVariantValideReductionPtBut() {
		return (getUnsignedByte(42) & 0xC) >> 2;
	}
	
	/*
	 * BLOC 6 : byte 48 à 55
	 */
	//bloc 5 :
	public int getDefLoc1PerteArret() {
		return getUnsignedByte(49) & 0x3;
	}

	/*
	 * BLOC 7 : byte 56 à 63
	 */
	// bloc 7 : Nombre de FU 5 (recul)
	public int getFu5Recul() {
		return getUnsignedByte(62) & 0x3;
	}
	
	//bloc 7 : Nombre de défauts roue 7 enrayage en vitesse
	public int getDefRoue7() {
		return (getUnsignedByte(59) & 0x30) >> 4;
	}

	//bloc 7 : Nombre de défauts roue 9	défaut QVA
	public int getDefRoue9() {
		return getUnsignedByte(59) & 0x3;
	}
	

	

	

	


//	public int getFuBranche() {
//		return ((getUnsignedByte(1) & 0x3) << 2) | ((getUnsignedByte(2) & 0xC0) >> 6);
//	}
	
	

}
