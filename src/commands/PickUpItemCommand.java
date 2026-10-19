package commands;

import items.Item;
import player.Player;

public class PickUpItemCommand implements Command {
    private final Player player;
    private final Item item;

    public PickUpItemCommand(Player player, Item item) {
        this.player = player;
        this.item = item;
    }

    @Override
    public void execute() {
        player.pickUpItem(item, player);
        player.getCurrentRoom().getPickedUpItems().add(item);
    }

    @Override
    public void undo() {
    }
}