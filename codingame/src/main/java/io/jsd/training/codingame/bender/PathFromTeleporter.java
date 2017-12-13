package io.jsd.training.codingame.bender;

public class PathFromTeleporter implements PathFinder {

	private final boolean isInverted;
	private final boolean isXBreaker;
	private final CaseArea area;

	public PathFromTeleporter(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.area = area;
		this.isInverted = isInverted;
		this.isXBreaker = isXBreaker;
	}

	@Override
	public Case getNextCase() {
		Teleporter teleporter = area.getTeletransporter();
		CaseArea areaToGet;
		if (area.getCurrentCase().getIdRow() == teleporter.getFrom().getIdRow() && area.getCurrentCase().getIdCol() == teleporter.getFrom()
				.getIdCol()) {
			areaToGet = new CaseArea(teleporter.getTo(), area.getMap(), area.getTeletransporter(), area.getDirection());
		} else {
			areaToGet = new CaseArea(teleporter.getFrom(), area.getMap(), area.getTeletransporter(), area.getDirection());
		}
		NextCase nextCase = new NextCase(areaToGet, isInverted, isXBreaker);
		return nextCase.getCase();
	}

}
