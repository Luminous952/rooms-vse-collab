package commands;

import player.Player;

public class MoveWestCommand implements Command {
    private Player player;

    public MoveWestCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveWest(player);
    }

    @Override
    public void undo() {
        player.moveEast(player);
    }
}