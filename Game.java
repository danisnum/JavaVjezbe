package vjezbe3;

class Player {
	private int pozicija_x;
	private int pozicija_y;
	private int height;
	private int width;
	private int health;
	
	public Player (int pozicija_x, int pozicija_y, int height, int width, int health) {
		this.pozicija_x = pozicija_x;
		this.pozicija_y = pozicija_y;
		this.height = height;
		this.width = width;
		this.health = health;
	}

	public int getPozicija_x() {
		return pozicija_x;
	}

	public void setPozicija_x(int pozicija_x) {
		this.pozicija_x = pozicija_x;
	}

	public int getPozicija_y() {
		return pozicija_y;
	}

	public void setPozicija_y(int pozicija_y) {
		this.pozicija_y = pozicija_y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health < 0) this.health = 0;
		else if(health > 100) this.health = 100;
		else this.health = health;
	}
}

class Enemy {
	private int pozicija_x;
	private int pozicija_y;
	private int height;
	private int width;
	private int damage;
	
	public int getPozicija_x() {
		return pozicija_x;
	}

	public void setPozicija_x(int pozicija_x) {
		this.pozicija_x = pozicija_x;
	}

	public int getPozicija_y() {
		return pozicija_y;
	}

	public void setPozicija_y(int pozicija_y) {
		this.pozicija_y = pozicija_y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if (damage < 0) this.damage = 0;
		else if (damage > 100) this.damage = 100;
		else this.damage = damage;
	}

	public Enemy (int pozicija_x, int pozicija_y, int height, int width, int damage) {
		this.pozicija_x = pozicija_x;
		this.pozicija_y = pozicija_y;
		this.height = height;
		this.width = width;
		this.damage = damage;
	}
}





public class Game {

	public static void main(String[] args) {
	    Player igrac = new Player(10, 10, 20, 20, 100);
	    Enemy neprijatelj = new Enemy(15, 15, 20, 20, 30);

	    decreaseHealth(igrac, neprijatelj);
	}

	
	
	
	public static boolean checkCollision(Player p, Enemy e) {
		    return (p.getPozicija_x() < e.getPozicija_x() + e.getWidth() &&
		            p.getPozicija_x() + p.getWidth() > e.getPozicija_x() &&
		            p.getPozicija_y() < e.getPozicija_y() + e.getHeight() &&
		            p.getPozicija_y() + p.getHeight() > e.getPozicija_y());
		       
		}
	
	
		public static void decreaseHealth(Player p, Enemy e) {
		    if (checkCollision(p, e)) {
		        int novoHealth = p.getHealth() - e.getDamage();
		        if (novoHealth < 0) novoHealth = 0;
		        p.setHealth(novoHealth);
		        System.out.println(" Kolizija! Health smanjen na: " + p.getHealth());
		    } else {
		        System.out.println(" Nema kolizije.");
		    }
		
	}
}
