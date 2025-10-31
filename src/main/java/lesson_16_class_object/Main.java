package lesson_16_class_object;

import lesson_16_class_object.animals.Breed;
import lesson_16_class_object.animals.Dragon;

import java.util.Scanner;

public class Main {
    static void main() {

        Dragon blaze = new Dragon();
        blaze.setName("Blaze");
        blaze.setAge(8);
        blaze.setWeight(3.5);
        blaze.setBreed(Breed.valueOf("LINDWORM"));

        System.out.println("Дракона звати: " + blaze.getName());
        System.out.println("Вік дракона: " + blaze.getAge());
        System.out.println("Вага дракона: " + blaze.getWeight());
        System.out.println("Порода дракона: " + blaze.getBreed());

        Dragon aurion = new Dragon("Aurion", 16, 4.1, Breed.HYDRA);

        System.out.println("Дракона звати: " + aurion.getName());
        System.out.println("Вік дракона: " + aurion.getAge());
        System.out.println("Вага дракона: " + aurion.getWeight());
        System.out.println("Порода дракона: " + aurion.getBreed());

        System.out.println("Наявні породи драконів: ");
        Breed[] breeds = Breed.values();
        for (Breed breed : breeds) {
            System.out.println(breed);
        }

        blaze.voice();
        blaze.breatheFire();

        aurion.voice();
        aurion.breatheFire();

        System.out.println(blaze.toString());
        System.out.println(aurion.toString());


        try {
            Scanner sc = new Scanner(System.in);

            Dragon[] dragons = new Dragon[3];

            for (int i = 0; i < dragons.length; i++) {
                System.out.println("\nВведіть дані для дракона #" + (i + 1) + ":");

                System.out.print("Ім’я: ");
                String name = sc.nextLine();

                System.out.print("Вік: ");
                int age = sc.nextInt();

                System.out.print("Вага: ");
                double weight = sc.nextDouble();
                sc.nextLine();

                System.out.println("Оберіть породу:");
                for (int j = 0; j < Breed.values().length; j++)
                    System.out.println((j + 1) + ". " + Breed.values()[j]);

                Breed chosenBreed = Breed.values()[sc.nextInt() - 1];
                sc.nextLine();

                dragons[i] = new Dragon(name, age, weight, chosenBreed);
            }

            System.out.println("\n🔥 Інформація про драконів:");
            for (Dragon d : dragons) {
                d.showInfo();
            }

            System.out.println("\n🐲 Дракони підросли!");
            for (Dragon d : dragons) {
                d.growUp();
            }

            if (dragons.length > 0) {
                System.out.println("\nТрюки першого дракона:");
                dragons[0].voice();
                dragons[0].breatheFire();
            }

            System.out.println("\n📈 Останні зміни:");
            for (Dragon d : dragons) {
                d.showInfo();
            }
            sc.close();

        } finally {
        }
    }
}



