package game;

public class DefendCommand implements Command {
    private Player player;

    public DefendCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.defend();
    }

    @Override
    public void undo() {
        // No state change, nothing to undo
    }

    @Override
    public void redo() {
        execute();
    }
}
