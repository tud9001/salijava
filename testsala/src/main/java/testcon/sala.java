package testcon;

public class sala {
    private Integer id;
    private String nume;
    public sala(String n){
        id++;
        nume=n;
    }

    public Integer getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
