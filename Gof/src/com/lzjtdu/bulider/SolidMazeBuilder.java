package com.lzjtdu.bulider;

public class SolidMazeBuilder implements IMazeBuilder {

	@Override
	public void createRoadBlock() {
		
		System.out.print("█");

	}

	@Override
	public void createWallBlock() {
		
		System.out.print(" ");

	}

	@Override
	public void createTreasureBlock() {
		System.out.print("$");

	}

	@Override
	public void nextRow() {
		System.out.println();

	}

}
