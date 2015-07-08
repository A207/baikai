package day3;
public class text {

	 public static void main(String[] args) {
	 Army a = new Army(3);
	 a.addWeapon(new Tank());
	 a.addWeapon(new Flighter());
	 a.addWeapon(new WarShip());
	 // a.addWeapon(new WarShip());
	 a.attacAll();
	 a.moveAll();
	 }

	}

	interface Assaultable {
	 abstract public void attack();
	}

	interface Mobile {
	 abstract public void move();
	}

	abstract class Weapon implements Assaultable, Mobile {
	}

	class Tank extends Weapon {
	 public void attack() {
	 System.out.println("Tank attacks");
	 }

	 public void move() {
	 System.out.println("Tank moves");
	 }
	}

	class Flighter extends Weapon {

	 public void attack() {
	 System.out.println("Flighter attacks");
	 }

	 public void move() {
	 System.out.println("Flighter moves");
	 }

	}

	class WarShip extends Weapon {

	 public void attack() {
	 System.out.println("WarShip attacks");
	 }

	 public void move() {
	 System.out.println("WarShip moves");
	 }

	}

	class Army {
	 private Weapon[] w = null;

	 private int size = 0;

	 private Army() {
	 }

	 public Army(int i) {
	 w = new Weapon[i];
	 }

	 public void addWeapon(Weapon weapon) {
	 if (size >= w.length) {
	 System.out.println("军队装备足够了!");
	 return;
	 } else {
	 w[size] = weapon;
	 size++;
	 }
	 }

	 public void attacAll() {
	 for (Weapon wea : w) {
	 if (wea != null) {
	 wea.attack();
	 }
	 }
	 }

	 public void moveAll() {
	 for (Weapon wea : w) {
	 if (wea != null) {
	 wea.move();
	 }
	 }
	 }



		}


