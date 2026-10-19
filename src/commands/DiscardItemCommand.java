package commands;

import items.Item;
import player.Player;

public class DiscardItemCommand implements Command {
    private final Player player;
    private final Item item;

    public DiscardItemCommand(Player player, Item item) {
        this.player = player;
        this.item = item;
    }

    @Override
    public void execute() {
        player.discardItem(item);
    }

    @Override
    public void undo() {
    }
}