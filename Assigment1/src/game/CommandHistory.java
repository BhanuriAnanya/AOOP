package game;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private List<Command> history = new ArrayList<>();
    private int currentPosition = -1;

    public void executeCommand(Command command) {
        if (currentPosition != history.size() - 1) {
            history.subList(currentPosition + 1, history.size()).clear(); // Clear redo history
        }
        command.execute();
        history.add(command);
        currentPosition++;
    }

    public void undo() {
        if (currentPosition >= 0) {
            history.get(currentPosition).undo();
            currentPosition--;
        }
    }

    public void redo() {
        if (currentPosition < history.size() - 1) {
            currentPosition++;
            history.get(currentPosition).redo();
        }
    }
}
