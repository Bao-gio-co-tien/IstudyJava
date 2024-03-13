public class MP3 extends Item{
    int duration;
    @Override
    public void showInfo() {
        System.out.println("Here are some details about this MP3: ");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("Duration: " + duration + "s");
        System.out.println("Price: " + price + "$");
    }

    public void anMP3(String name,
                      String description,
                      String ID,
                      float price,
                      int duration) {
        super.anItem(name, description, ID, price);
        this.duration = duration;
    }
}
