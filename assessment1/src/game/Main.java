package game;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        CommandHistory history = new CommandHistory();

        // Move player
        Command moveCommand = new MoveCommand(player, "north");
        history.executeCommand(moveCommand);
        System.out.println("Player position: " + player.getPosition());

        // Random attack
        int randomDamage = RandomUtils.getRandomNumber(10, 30);
        Command attackCommand = new AttackCommand(player, randomDamage);
        history.executeCommand(attackCommand);
        System.out.println("Player health after attack: " + player.getHealth());

        // Undo and Redo
        history.undo();
        System.out.println("Player health after undo: " + player.getHealth());

        history.redo();
        System.out.println("Player health after redo: " + player.getHealth());
    }
}

