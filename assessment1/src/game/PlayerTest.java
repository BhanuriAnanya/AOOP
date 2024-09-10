package game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerMove() {
        Player player = new Player();
        Command moveCommand = new MoveCommand(player, "north");
        moveCommand.execute();

        assertEquals("north", player.getPosition());
    }

    @Test
    public void testUndoMove() {
        Player player = new Player();
        Command moveCommand = new MoveCommand(player, "north");

        moveCommand.execute();
        moveCommand.undo();

        assertEquals("start", player.getPosition()); // Original position is "start"
    }

    @Test
    public void testRedoMove() {
        Player player = new Player();
        Command moveCommand = new MoveCommand(player, "north");

        moveCommand.execute();
        moveCommand.undo();
        moveCommand.redo();

        assertEquals("north", player.getPosition());
    }
}
