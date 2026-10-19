package commands;

import player.Player;

public class ShowItemsCommand implements Command {
    private final Player player;

    public ShowItemsCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.showItemsInRoom();
    }

    @Override
    public void undo() {
        // UNDO is not implemented
    }
}
