package javatechie.completableFuture;

public class Emloyee {
    private int id;
    private String first_name;
    public Emloyee(int id, String first_name) {
        this.id = id;
        this.first_name = first_name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    @Override
    public String toString() {
        return "Emloyee [id=" + id + ", first_name=" + first_name + "]";
    }
    
    
}
