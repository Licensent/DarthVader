/**
 * Created by DarthVader on 30.06.2016.
 */
public class Person {
    private Double number;
    private String lastname;
    private String name;
    private String phone;

    Person(Double number, String lastname, String name, String phone) {
        this.number = number;
        this.lastname = lastname;
        this.name = name;
        this.phone = phone;
    }

    public String toString() {
        return "Number " + number + '\\' +
                " Lastname " + lastname + '\\' +
                " Name " + name + '\\' +
                " Phone " + phone;

    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (number != null ? !number.equals(person.number) : person.number != null) return false;
        if (lastname != null ? !lastname.equals(person.lastname) : person.lastname != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return !(phone != null ? !phone.equals(person.phone) : person.phone != null);

    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
