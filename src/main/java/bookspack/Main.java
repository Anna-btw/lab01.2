package bookspack;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты класса Publisher с аргументами, передаваемыми в конструктор класса
        Publisher publisher1 = new Publisher("Проспект", "Москва");
        Publisher publisher2 = new Publisher("Питер", "Санкт-Петербург");
        Publisher publisher3 = new Publisher("БХВ", "Санкт-Петебург");
        Publisher publisher4 = new Publisher("Диалектика", "Киев");

        // Создаем массив из книг без ограничения по кол-ву
        Book[] books = {
                new Book("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", publisher2, 2018, new String[]{"Седжвик Роберт, Уэйн Кевин"}),
                new Book("Разработка требований к программному обеспечению. 3-е издание, дополненное;", publisher3, 2019, new String[]{"Вигерс Карл"}),
                new Book("Java. Полное руководство, 10-е издание", publisher4, 2018, new String[]{"Шилдт Герберт"}),
                new Book("C/C++. Процедурное программирование", publisher3, 2017, new String[]{"Полубенцева М.И."}),
                new Book("Конституция РФ", publisher1, 2020),
        };

        // Вывод информации о каждой стране
        for (Book boo : books) {
            boo.print();
        }

        // Исправляем опечатку в городе издательства БХВ
        publisher3.setCity("Санкт-Петербург");

        // Вызов статического метода для печати информации о всех книгах
        Book.printAll(books);

        // Изменился вывод для книг из издательства БХВ, т.к. мы изменили значение города в объекте Publisher

    }
}
