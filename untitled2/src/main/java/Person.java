/**
 * Created by DarthVader on 30.06.2016.
 */
public class Person {
    private Double number;
    private String lastname;
    private String name;
    private String phone;

    private Person(Double number, String lastname, String name, String phone) {
        this.number = number;
        this.lastname = lastname;
        this.name = name;
        this.phone = phone;
    }

    public Double getNumber() {
        return number;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "number=" + number +
                ", lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private Double number;
        private String lastname;
        private String name;
        private String phone;

        public PersonBuilder() {
        }

        public PersonBuilder(Person person) {
            this.number = person.number;
            this.lastname = person.lastname;
            this.name = person.name;
            this.phone = person.phone;
        }

        public void setNumber(Double number) {
            this.number = number;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Person build() {
            return new Person(number, lastname, name, phone);
        }
    }
}
