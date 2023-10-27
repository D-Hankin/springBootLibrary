package bootBiblioteket.bootBiblioteket;

public class BootBiblioteket {
    
    private String name;
    private String author;
    private int noOfPages;
    private int id;
    private boolean rented;

    public BootBiblioteket(String name, String author, int noOfPages, int id, boolean rented) {
        this.name = name;
        this.author = author;
        this.noOfPages = noOfPages;
        this.id = id;
        this.rented = rented;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented() {
        this.rented = !this.rented;
    }

    
    
}
