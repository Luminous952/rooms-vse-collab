package commands;

import items.Item;
import player.Player;

// earlier versions of the game used to have extended undo options
// I scrapped this because it didn't serve much purpose
// UndoMovement is used for getting the player out of combat
class UndoDiscardCommand implements Command {
    private final Player player;
    private final Item item;

    public UndoDiscardCommand(Player player, Item item) {
        this.player = player;
        this.item = item;
    }

    @Override
    public void execute() {
        player.pickUpItem(item, player);
        player.getCurrentRoom().getPickedUpItems().remove(item);
        System.out.println("Remaining items in the room: " + player.getCurrentRoom().getAvailableItems());
        System.out.println("Undone discard of " + item.getName() + ".");
    }

    @Override
    public void undo() {
        player.discardItem(item);
    }
}