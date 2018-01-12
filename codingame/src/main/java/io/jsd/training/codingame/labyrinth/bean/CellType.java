package io.jsd.training.codingame.labyrinth.bean;

public enum CellType {
	
	WALL("#"),
	EMPTY_SPACE("."),
	START_CELL("T"),
	COMMAND_ROOM("C"),
	UNKOWN_CELL("?");
	
	private final String code;
	
	private CellType(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	public static CellType getCellTypeByKey(String key){
	    for(CellType cellType : values()){
	        if( cellType.getCode().equals(key)){
	            return cellType;
	        }
	    }
	    return null;
	}
	
}
