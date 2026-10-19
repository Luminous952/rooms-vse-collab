package commands;

import player.Player;

public class MoveSouthCommand implements Command {
    private final Player player;

    public MoveSouthCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveSouth(player);
    }

    @Override
    public void undo() {
        player.moveNorth(player);
    }
}