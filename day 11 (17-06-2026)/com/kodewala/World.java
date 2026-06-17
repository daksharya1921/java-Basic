package com.kodewala;


class World
{
	
	public static void main(String[] args){
		
		canWalkOnAntertica();
	}
	
	private static void canWalkOnAntertica(){
		System.out.println("Yess Only Scintist can");
	}

}

class WorldWalk{
	void isWalk(){
	World.canWalkOnAntertica();
	}
}