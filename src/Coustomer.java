import java.time.LocalDate;
import java.util.Arrays;

public class Coustomer {
    private Long id;
    private String firstName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;

    public Coustomer() {
    }

    public Coustomer(Long id, String firstName, String email, LocalDate dateOfBirth, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Coustomer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    private Coustomer[] coustomers = new Coustomer[0];

    public void createCustomer(Coustomer newCaustomer) {
        coustomers = Arrays.copyOf(coustomers, coustomers.length + 1);
        coustomers[coustomers.length - 1] = newCaustomer;
        System.out.println("Costumes aidi koshuldu");

    }

    public void getAllCoustomers() {
        System.out.println(Arrays.toString(coustomers));
        for (int i = 0; i < coustomers.length; i++) {
            System.out.println(coustomers[i]);
        }
    }
    public Coustomer getsCoustomerByid(Long carId) {
        boolean islaik = false;
        for (int i = 0; i < coustomers.length; i++) {
            if (coustomers[i].getId().equals(carId)) {
                islaik = true;
                return coustomers[i];
            }
        }
        if (!islaik) {
            System.out.println("Coustomers with id :" + carId + "not found ");
        }
        return null;
    }

    public void updateCoustomerByid(Long carsId, Coustomer newCar) {
        boolean islaik = false;
        for (int i = 0; i < coustomers.length; i++) {
            if (coustomers[i].getId().equals(carsId)) {
                islaik = true;
                coustomers[i] = newCar;
            }
        }
        if (!islaik) {
            System.out.println("Coustomer with id :" + carsId + "not found!");

        }
    }
    public void deleteById(Long id) {
        boolean isblock = false;
        int counter = 0;
        for (int i = 0; i < coustomers.length; i++) {
            if (coustomers[i].getId() == id) {
                coustomers[i] = null;
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("myndai Coustomer jok");
        }
    }

}


