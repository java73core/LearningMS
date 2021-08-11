package LogComp;

public abstract class PassTransport extends Transport {
    private String name;
    private String surname;

    public PassTransport(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract void getOnPassenges(int count);
    public abstract void getOffPassengers(int count);

}
