package game;

public class AttackCommand implements Command {
    private Player player;
    private int damage;
    private int previousHealth;

    public AttackCommand(Player player, int damage) {
        this.player = player;
        this.damage = damage;
    }

    @Override
    public void execute() {
        previousHealth = player.getHealth();
        player.attack(damage);
    }

    @Override
    public void undo() {
        player.attack(previousHealth - player.getHealth()); // Undo the damage
    }

    @Override
    public void redo() {
        execute();
    }
}
