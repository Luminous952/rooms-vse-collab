package commands;

import items.Item;
import player.Player;

class UndoPickUpCommand implements Command {
    private final Player player;
    private final Item item;

    public UndoPickUpCommand(Player player, Item item) {
        this.player = player;
        this.item = item;
    }

    @Override
    public void execute() {
        player.discardItem(item);
        System.out.println("Undone pick up of " + item.getName() + ".");
    }

    @Override
    public void undo() {
        player.pickUpItem(item, player);
        player.getCurrentRoom().getPickedUpItems().add(item);
        System.out.println("Remaining items in the room: " + player.getCurrentRoom().getAvailableItems());
    }
}