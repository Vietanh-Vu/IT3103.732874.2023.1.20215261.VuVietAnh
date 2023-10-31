package Lab02;

public class DigitalVideoDisc {
    // Private instance variables to store information about the DVD
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor to create a DVD with a given title
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    // Constructor to create a DVD with a title, category, and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this(title); // Call the previous constructor to set the title
        this.category = category;
        this.cost = cost;
    }

    // Constructor to create a DVD with a title, category, director, and cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, cost); // Call the previous constructor to set title, category, and cost
        this.director = director;
    }

    // Constructor to create a DVD with a title, category, director, length, and cost
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director, cost); // Call the previous constructor to set title, category, and director
        this.length = length;
    }

    // Getter method to retrieve the title of the DVD
    public String getTitle() {
        return title;
    }

    // Setter method to set the title of the DVD
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method to retrieve the category of the DVD
    public String getCategory() {
        return category;
    }

    // Setter method to set the category of the DVD
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter method to retrieve the director of the DVD
    public String getDirector() {
        return director;
    }

    // Setter method to set the director of the DVD
    public void setDirector(String director) {
        this.director = director;
    }

    // Getter method to retrieve the length of the DVD
    public int getLength() {
        return length;
    }

    // Setter method to set the length of the DVD
    public void setLength(int length) {
        this.length = length;
    }

    // Getter method to retrieve the cost of the DVD
    public float getCost() {
        return cost;
    }

    // Setter method to set the cost of the DVD
    public void setCost(float cost) {
        this.cost = cost;
    }
}
