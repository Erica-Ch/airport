package za.ac.cput.airport;

/**
 * Ngonidzaishe Erica Chipato
 * 218327315
 * TDD Revision Week 1
 * 11/02/22
 * update frequently
*/

public class Airline {

    private String id,name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void airline() {
    }
}
