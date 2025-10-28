package lesson_16_class_object.animals;

public class Dragon {

    private String name;
    private int age;
    public double weight;

    public Dragon() {
        System.out.println("Створено невідомого дракона");
    }

    public Dragon(String name, int age, double weight) {
        System.out.println("Створено повноцінного дракона");

        this.name = name;
        this.age = age;
        this.weight = weight;
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


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

        @Override
        public String toString() {
            return "Dragon{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }

    public void showInfo() {
        System.out.println("Ім’я: " + name + ", Вік: " + age + ", Вага: " + weight + " кг");
    }

    public void growUp() {
        this.age++;
        this.weight += 10;
        System.out.println(name + " підріс! Тепер йому " + age + " років і вага " + weight + " кг 💪");
    }
}
