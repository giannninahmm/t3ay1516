package macavinta.gianninah.ex5revised;

/**
 * Created by IE on 8/1/2016.
 */
public class Item {
    private int id;
    private String itemDesc;
    private String itemType;
    private float price;

    public Item() {
        this.id = 9999;
        this.itemDesc = "Item Description";
        this.itemType = "Item Type";
        this.price = 300.00f;
    }

    public Item(int id, String itemDesc, String itemType, float price) {
        this.id = id;
        this.itemDesc = itemDesc;
        this.itemType = itemType;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDescription(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
