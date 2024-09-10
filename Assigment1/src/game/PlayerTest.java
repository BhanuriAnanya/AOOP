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
    @Test
    public void testPlayerAttack() {
        Player player = new Player();
        Command attackCommand = new AttackCommand(player, 20);

        attackCommand.execute();
        assertEquals(80, player.getHealth()); // 100 - 20 = 80

        attackCommand.undo();
        assertEquals(100, player.getHealth());

        attackCommand.redo();
        assertEquals(80, player.getHealth());
    }

}

