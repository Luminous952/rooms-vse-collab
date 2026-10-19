package commands;

import player.Player;

public class MoveEastCommand implements Command {
    private final Player player;

    public MoveEastCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveEast(player);
    }

    @Override
    public void undo() {
        player.moveWest(player);
    }
}