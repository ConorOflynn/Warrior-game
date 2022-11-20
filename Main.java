//package edu.arapahoe.csc160;

public class Main {
	public static int generateRandom() {
		return (int) (Math.floor(Math.random() * 10) + 1);
	}
	public static void main(String[] args) {

		var randomNum = generateRandom();

		String[] warriorarray = {"Archer","Mage","Healer","Tank","Rogue"};

		WarriorFred doug = new WarriorFred();
		//Reset
		doug.reSpawn();
		System.out.println("*** BATTLE *** All Warriors start with 10 units of health for 10 rounds");
		//Main loop
		var arrayLength = warriorarray.length;
		for (var i = 0; i < arrayLength; i++) {
			//System.out.println(warriorarray[i]);

		//System.out.println( warriorarray[i] + "is alive:" + doug.isAlive());
		System.out.println("Warrior "+warriorarray[i]+" Status "+"(health ="+doug.getLifeForce() + ", damage="+doug.getDamage());
		doug.takeDamage(5);
		System.out.println("Warrior "+warriorarray[i]+" is attacked and takes "+doug.getDamage()+" damage");
		doug.reaction();
		
		doug.takeDamage(randomNum);
				
		doug.reaction();
		
		doug.takeDamage(randomNum);
				
		doug.reaction();

		//System.out.println(warriorarray[i] + "is alive:" + doug.isAlive());


	}
		// End of game check
		System.out.println("How did the Warriors Fare?");
		for (var i = 0; i < arrayLength; i++) {
			System.out.println("Warrior "+warriorarray[i]+" Status "+"(health ="+doug.getLifeForce() + ", damage="+doug.getDamage());
			if (doug.isAlive()==true){
				System.out.println("Warrior "+warriorarray[i]+" is Alive");
			}
			else{
				System.out.println("Warrior"+warriorarray[i]+" is Dead");
			};

		}
		// all warrior info printed
		for (var i = 0; i < arrayLength; i++) {
			System.out.println(warriorarray[i]);
			doug.setNickname(warriorarray[i]);
			doug.printInfo();
		}
}
	}
