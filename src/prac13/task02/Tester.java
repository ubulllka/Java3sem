package prac13.task02;

public class Tester {
    public static void main(String[] args) {
        Person[] arr = new Person[5];
        arr[0]=new Person("Толстой","Лев");
        arr[1]=new Person("Пушкин","Александр","Сергеевич");
        arr[2]=new Person("Гоголь");
        arr[3]=new Person("Ахматова","Анна");
        arr[4]=new Person("Тургенев","Иван", "Сергеевич");

        for (Person author:arr)
            System.out.println(author.fullName());

        System.out.println();

        for (Person author:arr)
            System.out.println(author.shortName());

    }
}
