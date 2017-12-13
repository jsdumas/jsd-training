package io.jsd.training.codingame.bender;

public class BenderBuilder {

	private final char[][] map;
	private Case startCase;
	private Case suicideCase;
	private final Teleporter teletransporter;

	public BenderBuilder(int row, int col) {
		map = new char[row][col];
		teletransporter = new Teleporter();
	}

	public BenderBuilder withLine(int idRow, String line) {
		char[] lineToCharArray = line.toCharArray();
		for (int i = 0; i < lineToCharArray.length; i++) {
			if (lineToCharArray[i] == '@') {
				startCase = new Case(idRow, i, CaseType.getCaseTypeForCharacter('@'), Direction.SOUTH, null);
			}
			if (lineToCharArray[i] == '$') {
				suicideCase = new Case(idRow, i, CaseType.getCaseTypeForCharacter('$'), Direction.LOOP, null);
			}
			if (lineToCharArray[i] == 'T') {
				if (teletransporter.getFrom() == null) {
					teletransporter.setFrom(new Case(idRow, i, CaseType.getCaseTypeForCharacter('T'), Direction.LOOP, null));
				} else if (teletransporter.getTo() == null) {
					teletransporter.setTo(new Case(idRow, i, CaseType.getCaseTypeForCharacter('T'), Direction.LOOP, null));
				}
			}
			map[idRow][i] = lineToCharArray[i];
		}
		return this;
	}

	public Bender build() {
		Bender bender = new Bender(new BenderMap(map, startCase, suicideCase, teletransporter));
		bender.walkToSuicideCase();
		return bender;
	}

}
