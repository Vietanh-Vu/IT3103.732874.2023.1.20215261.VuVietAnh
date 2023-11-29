package hust.soict.itep.aims.media;

public abstract class Media {
    // Attributes
    private int id;           // Unique identifier for the media
    private String title;     // Title of the media
    private String category;  // Category of the media
    private float cost;       // Cost of the media

    // Constructors
    public Media(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Method to print details of the media
    public void print() {
        // Implementation specific to each subclass
    }

    // Method to check if the title matches the media
    public boolean isMatch(String title) {
        return title.equals(this.title);
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
