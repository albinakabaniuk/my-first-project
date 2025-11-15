package lesson_16_class_object.animals;

import java.util.Objects;

public class Dragon {

    private String name;
    private int age;
    public double weight;
    private Breed breed;

    public Dragon() {
        System.out.println("Створено невідомого дракона");
    }

    public Dragon(String name, int age, double weight, Breed breed) {
        System.out.println("Створено повноцінного дракона");

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Dragon(String name, int age, double weight, Breed[] breed) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public Breed getBreed() {
        return this.breed;
    }


    public void showInfo() {
        System.out.println("Ім’я: " + name + ", Вік: " + age + ", Вага: " + weight + " кг" + ", Порода: " + breed);
    }

    public void growUp() {
        this.age++;
        this.weight += 10;
        System.out.println(name + " підріс! Тепер йому " + age + " років і вага " + weight + " кг 💪");
    }

    public void voice() {
        System.out.println(name + " Будьте обережні зі мною! Я можу спалити ваші оселі 😤 ");
    }

    public void breatheFire() {
        System.out.println(name + " Дихає вогнем!🔥");
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed=" + breed +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Dragon)) {
            return false;
        }

        Dragon otherDragon = (Dragon) obj;

        return this.name.equals(otherDragon.name)
                && this.age == otherDragon.age
                && this.weight == otherDragon.weight
                && this.breed == otherDragon.breed;
    }

    @Override
    public int hashCode() {
        int age = this.age;
        int weight = (int) this.weight;
        int name = Objects.hash(this.name);
        int breed = Objects.hash(this.breed);

        return 31 * (age + weight + name + breed);
    }
}
