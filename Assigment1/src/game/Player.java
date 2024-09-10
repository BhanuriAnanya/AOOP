package game;

public class Player {
    private String position;
    private int health;

    public Player() {
        this.position = "start";
        this.health = 100;
    }

    public void move(String direction) {
        this.position = direction;
    }

    public String getPosition() {
        return this.position;
    }

    public void attack(int damage) {
        this.health -= damage;
    }

    public int getHealth() {
        return this.health;
    }

    public void defend() {
        // Defend can reduce incoming damage (logic can be added later)
        System.out.println("Defending!");
    }
}
