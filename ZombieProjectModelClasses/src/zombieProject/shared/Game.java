package zombieProject.shared;

import java.util.ArrayList;
import java.util.Random;


public class Game {
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
	
	
	
	
	public double getPlayerX(Player p){
		return p.getX();
	}
	public double getPlayerY(Player p){
		return p.getY();
		
	}
	public double getZombieX(Zombie z){
		return z.getX();
	}
	public double getZombieY(Zombie z){
		return z.getY();
	}
	*/
	
	Random generator = new Random();

	
	
	private Player player;
//	private Zombie zombie;
	
	ArrayList<Zombie> zombieList = new ArrayList<Zombie>();


	
	public Game() {
		this.player = new Player(50, 50);
		this.zombieList.add(new Zombie(0, 0));
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Zombie getZombie(int i) {
		return zombieList.get(i);
	}
	
	public void newZombie(){
		int x = generator.nextInt(600);
		int y = generator.nextInt(600);
		this.zombieList.add(new Zombie(x, y));
	}
	
	public int listSize(){
		return zombieList.size();
	}
	
	
}
