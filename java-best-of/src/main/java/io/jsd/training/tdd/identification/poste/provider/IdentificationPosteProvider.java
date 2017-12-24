package io.jsd.training.tdd.identification.poste.provider;

public class IdentificationPosteProvider {

	private String userDomain;
	private String computerName;
	private final String codePoste;

	public IdentificationPosteProvider(String codePoste) {
		this.codePoste = codePoste;
		if (isIdentifiable()) {
			split();
		}
	}

	private void split() {
		String[] codeSplitted = codePoste.split("\\.", 2);
		computerName = codeSplitted[0];
		userDomain = codeSplitted[1];
	}

	public boolean isIdentifiable() {
		return codePoste != null && codePoste.contains(".");
	}

	public String getUserDomain() {
		return userDomain;
	}

	public String getComputerName() {
		return computerName;
	}

	public String getCodePoste() {
		return codePoste;
	}

}
