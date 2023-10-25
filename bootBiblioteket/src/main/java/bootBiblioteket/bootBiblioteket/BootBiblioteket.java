package bootBiblioteket.bootBiblioteket;

public class BootBiblioteket {
    
    private String name;
    private String author;
    private int noOfPages;
    private int id;

    public BootBiblioteket(String name, String author, int noOfPages, int id) {
        this.name = name;
        this.author = author;
        this.noOfPages = noOfPages;
        this.id = id;
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

    
    
}
