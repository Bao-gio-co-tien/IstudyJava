public abstract class Item {
    public String name;
    private String description;
    protected String ID;
    float price;

    public abstract void showInfo();
    public void anItem(String name,
                       String description,
                       String ID,
                       float price) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
