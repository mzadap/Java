package Bootcamp.project.vendingmachine;

public class Machine {

    private Item[][] item;


    public Machine(Item[][] item) {

        this.item = new Item[item.length][item[0].length];
        for (int i = 0; i < item.length; i++) {
            for (int j = 0; j < item[i].length; j++) {
                this.item[i][j] = new Item(item[i][j]);
            }
        }
    }


    public Item getItem(int row, int spot) {
        return new Item(this.item[row][spot]);

    }

    public void setItem(Item item, int row, int spot) {
        this.item[row][spot] = new Item(item);
    }

    public boolean dispense(int row, int spot) {
      if (this.item[row][spot].getQuantity() > 0) {
          this.item[row][spot].setQuantity(this.item[row][spot].getQuantity() - 1);
          return true;
      }
      return false;
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.item.length; i++) {
            temp += "\t";
            for (int j = 0; j < this.item[i].length; j++) {
                temp += this.item[i][j].toString();
            }
            temp += "\n\n";
        }
        return temp;
    }
}

