package io.jsd.training.codingame.bender;

public enum CaseType {
	
	START('@'),
	EMPTY(' '),
	CHARP_OBSTACLE('#'),
	X_OBSTACLE('X'),
	S_MODIFIER('S'),
	E_MODIFIER('E'),
	N_MODIFIER('N'),
	W_MODIFIER('W'),
	INVERSOR('I'),
	BIER('B'),
	TELEPORTER('T'),
	SUICIDE('$');
	
	private char character;
	
	private CaseType(char character) {
		this.character=character;
	}

	public char getChar() {
		return character;
	}
	
	
	 public static CaseType getCaseTypeForCharacter(final char character)   {
	        for (CaseType caseType : CaseType.values())
	            if (caseType.character == character)
	                return caseType;
	        return null;
    }

}
