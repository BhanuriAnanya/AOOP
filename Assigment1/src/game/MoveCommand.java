package game;

public class MoveCommand implements Command {
    private Player player;
    private String direction;
    private String previousPosition;

    public MoveCommand(Player player, String direction) {
        this.player = player;
        this.direction = direction;
    }

    @Override
    public void execute() {
        previousPosition = player.getPosition();
        player.move(direction);
    }

    @Override
    public void undo() {
        player.move(previousPosition);
    }

    @Override
    public void redo() {
        execute();
    }
}
