package zombieProject.shared;

public class Game {
	/*

	
	private Map m; //game map
	public Player p; //player
	public Zombie z; //WILL NEED TO BECOME AN ARRAY EVENTUALLY
	
	/**
	 * game constructor
	 
	public Game(){
		
		m = new Map();
		p = new Player(0, 0);
		z = new Zombie(0, 0);
	}
	
	/**
	 * updates the game state
	 * 
	 * @param game the game object
	 */
	public void updateGame(Game game){
		
		//We are going to need to decide on if we are using a 
		//loop to generate multiple zombies and generate them
		//either randomly or according to a difficulty.
		//Difficulty could depend on the room that the user
		//has just entered. 
		/*for(int i = 0; i < numZombies; i++){//loop to initialize all zombies
			zombiArr[i].setX((i * 10) + 10);
			zombiArr[i].setY(10);
		}
		boolean collision;// use this value later to regulate movement of player
		
		for(Zombie z : zombiArr){
			if((p.getX() + 1 < z.getX() - 1) | (p.getX() - 1 > z.getX() + 1)){
				if((p.getY() + 1 < z.getY() - 1) | (p.getY() - 1 > z.getY() + 1)){
					collision = false;
				}
				else{
					collision = true;
				}
			}
			else{
				collision = true;
			}
		}*/
		
		
	}

	
	/*public static void main(String[] args){

	/*

	/*	

	public static void main(String[] args){


		Map m = new Map();
		//spawns player in center of map
		Player p = new Player(m.getRight()/2, m.getBottom()/2);
		
		//We are going to need to decide on if we are using a 
		//loop to generate multiple zombies and generate them
		//either randomly or according to a difficulty.
		//Difficulty could depend on the room that the user
		//has just entered. 
		
		int numZombies = 2;//temporary value
		Zombie[] zombiArr = new Zombie[numZombies];
		
		for(int i = 0; i < numZombies; i++){//loop to initialize all zombies
			zombiArr[i].setX((i * 10) + 10);
			zombiArr[i].setY(10);
		}
		boolean collision;// use this value later to regulate movement of player
		
		for(Zombie z : zombiArr){
			if((p.getX() + 1 < z.getX() - 1) | (p.getX() - 1 > z.getX() + 1)){
				if((p.getY() + 1 < z.getY() - 1) | (p.getY() - 1 > z.getY() + 1)){
					collision = false;
				}
				else{
					collision = true;
				}
			}
			else{
				collision = true;
			}
		}
		
		
	}
	
	*/
	
	private Player player;
	private Zombie zombie;
	
	public Game(){
		this.player = new Player(50,50);
		this.zombie = new Zombie(0,0);
	}
	
	public Player getPlayer(){
		return player;
	}
	
	public Zombie getZombie(){
		return zombie;
		
	}
}
