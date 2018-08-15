package io.jsd.training.binary;

public enum MiniDamBase implements FieldParams {
	
	/*
	 * BLOC 0 : byte 0 à 7
	 */
	CODE_MESSAGE_BLOC_0(0, 0, 2),
	CODE_MISSION_BLOC_0(0, 2, 10),
	SENS_CIRCULATION_BLOC_0(1, 4, 2),
	NOMBRE_FU_CONDUITE_BLOC_0(1, 6, 3),
	NOMBRE_FU_VARIANT_INVALIDE_BLOC_0(2, 1, 3),
	INDICATION_VARIANT_INVALIDE_SECTEUR_BLOC_0(2, 4, 12),
	LOCALISATION_CORRECTE_SECTEUR_BLOC_0(4, 0, 12),
	ACTIVATION_CORRECTE_SECTEUR_BLOC_0(5, 4, 12),
	NOMBRE_DEFAUT_BALISE_BLOC_0(7, 0, 2),
	NOMBRE_DEFAUT_INVARIANT_BLOC_0(7, 2, 2),
	NOMBRE_DEFAUT_VARIANT_BLOC_0(7, 4, 2),
	NOMBRE_BALISE_RATEE_BLOC_0(7, 6, 2),
	/*
	 * BLOC 1 : byte 8 à 15
	 */
	CODE_MESSAGE_BLOC_1(8, 0, 2),
	CODE_MISSION_BLOC_1(8, 2, 10),
	SENS_CIRCULATION_BLOC_1(9, 4, 2),
	ETAT_CONTROLE_VITESSE_BLOC_1(9, 7, 1),
	ETAT_CAB_SIGNAL_BLOC_1(10, 0, 1),
	DEFAUT_ETALONNAGE_BLOC_1(10, 1, 1),
	NOMBRE_DEFAUT_ROUE_PHONIQUE_INTERNE_BLOC_1(10, 2, 2),
	NOMBRE_DEFAUT_ROUE_PHONIQUE_ENRAYAGE_BLOC_1(10, 4, 2),
	NOMBRE_DEFAUT_ROUE_PHONIQUE_QVA_BLOC_1(10, 6, 2),
	NUMERO_VERSION_LOGICIEL_BORD_BLOC_1(11, 0, 8),
	INDICATION_NON_ANNULATION_SECTEUR_BLOC_1(12, 0, 12),
	NOMBRE_SIGNAUX_FRANCHIS_NON_ANNULES_BLOC_1(13, 4, 4),
	NUMERO_BRANCHE_PREMIERE_BALISE_RATEE_BLOC_1(14, 0, 16),
	/*
	 * BLOC 2 : byte 16 à 23
	 */
	CODE_MESSAGE_BLOC_2(16, 0, 2),
	CODE_MISSION_BLOC_2(16, 2, 10),
	SENS_CIRCULATION_BLOC_2(17, 4, 2),
	NUMERO_TRAIN_BLOC_2(17, 6, 10),
	NOMBRE_FU_CADRE_VERT_7_BLOC_2(19, 0, 2),
	NOMBRE_FU_CADRE_VERT_2_BLOC_2(19, 2, 2),
	NOMBRE_FU_AVEC_CADRE_JAUNE_7_BLOC_2(19, 4, 2),
	NOMBRE_FU_AVEC_CADRE_JAUNE_2_BLOC_2(19, 6, 2),
	BRANCHE_DERNIER_FU_CADRE_VERT_BLOC_2(20, 0, 16),
	BRANCHE_DERNIER_FU_CADRE_JAUNE_BLOC_2(22, 0, 16),
	/*
	 * BLOC 3 : byte 24 à 31
	 */
	CODE_MESSAGE_BLOC_3(24, 0, 2),
	CODE_MISSION_BLOC_3(24, 2, 10),
	SENS_CIRCULATION_BLOC_3(25, 4, 2),
	/*
	 * BLOC 4 : byte 32 à 39
	 */
	CODE_MESSAGE_BLOC_4(32, 0, 2),
	CODE_MISSION_BLOC_4(32, 2, 10),
	SENS_CIRCULATION_BLOC_4(33, 4, 2),
	/*
	 * BLOC 5 : byte 40 à 47
	 */
	CODE_MESSAGE_BLOC_5(40, 0, 2),
	CODE_MISSION_BLOC_5(40, 2, 10),
	SENS_CIRCULATION_BLOC_5(41, 4, 2),
	/*
	 * BLOC 6 : byte 48 à 55
	 */
	CODE_MESSAGE_BLOC_6(48, 0, 2),
	CODE_MISSION_BLOC_6(48, 2, 10),
	SENS_CIRCULATION_BLOC_6(49, 4, 2),
	/*
	 * BLOC 7 : byte 56 à 63
	 */
	CODE_MESSAGE_BLOC_7(56, 0, 2),
	CODE_MISSION_BLOC_7(56, 2, 10),
	SENS_CIRCULATION_BLOC_7(57, 4, 2),
	;
	
	
	private final int bytePosition;
	private final int bitPosition;
	private final int bitNumber;
	
	private MiniDamBase(int bytePosition, int bitPosition, int bitNumber) {
		this.bytePosition=bytePosition;
		this.bitPosition=bitPosition;
		this.bitNumber=bitNumber;
	}

	@Override
	public int getBytePosition() {
		return this.bytePosition;
	}
	
	@Override
	public int getBitPosition() {
		return this.bitPosition;
	}
	
	@Override
	public int getBitNumber() {
		return this.bitNumber;
	}


}
