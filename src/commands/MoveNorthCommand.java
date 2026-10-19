package commands;

import player.Player;

public class MoveNorthCommand implements Command {
    private final Player player;

    public MoveNorthCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveNorth(player);
    }

    @Override
    public void undo() {
        player.moveSouth(player);
    }
}