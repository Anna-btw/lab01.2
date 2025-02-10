package bookspack;

public class Book {
    private String name; // private чтобы атрибутами класса можно оперировать только внутри класса
    private Publisher publisher; // ссылаемся на экземпляр другого класса
    private int year;
    private String [] authors; // массив строк

    // Конструктор_1 со значениями: название, год издания, издательство (для случая, если авторов нет). Принимает значения всех атрибутов, через setter
    public Book(String name, Publisher publisher, int year)  {
        setName(name);
        setPublisher(publisher);
        setYear(year);
    }

    // Конструктор_2 со значениями: название, автор, год издания, издательство
    public Book(String name, Publisher publisher, int year, String author) {
        setName(name);
        setPublisher(publisher);
        setYear(year);
        this.authors = new String[]{author}; // Инициализируем массив с одним автором
    }

    // Конструктор_3 со значениями: название, список (массив) авторов, год издания, издательство
    public Book(String name, Publisher publisher, int year, String[] authors) {
        setName(name);
        setPublisher(publisher);
        setYear(year);
        setAuthors(authors);
    }

    // get-методы
    public String getName() {
        return name;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public String[] getAuthors() {
        return authors;
    }

    // Получаем кол-во авторов
    public int getAmountAuthors() {
        if (authors == null) {
            return 0;
        }
        return authors.length;
    }

    // Получаем автора по индексу
    public String getAuthor(int index) {
        if (authors == null || index < 0 || index >= authors.length) {
            throw new IndexOutOfBoundsException("Ошибка. Некорректный индекс для получения автора!");
        }
        return authors[index];   // Возвращаем автора по индексу
    }

    // set-методы
    public void setName(String name) {
        if (name == null || name.isEmpty()) {   // название не должно быть пустой ссылкой
            throw new IllegalArgumentException("Ошибка. Название должно быть указано!");
        }
        this.name = name;
    }

    public void setPublisher(Publisher publisher) {
        if (publisher == null || publisher.getName() == null ||  publisher.getName().isEmpty()||
                publisher.getCity() == null || publisher.getCity().isEmpty()
        ){   // оба атрибута издательства не должны быть пустой ссылкой
            throw new IllegalArgumentException("Ошибка. Издательство и город должны быть указаны!");
        }
        this.publisher = publisher;
    }

    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Ошибка. Год должен быть > 0");
        }
        this.year = year;
    }

    public void setAuthors(String[] authors) {
        // Проверяем, что массив не равен null
        if (authors == null) {
            throw new IllegalArgumentException("Ошибка. Авторы должны быть указаны!");
        }
        // Проверяем каждый элемент массива
        for (String author : authors) {
            if (author == null || author.isEmpty()) {
                throw new IllegalArgumentException("Ошибка. Авторы должны быть указаны!");
            }
        }
        this.authors = authors;
    }


    public void print() {
        System.out.print("Название: " + name);
        if (authors != null && authors.length > 0) {
            System.out.print(". Авторы: ");
            System.out.print(String.join(", ", authors)); // Объединяем авторов в строку, чтобы не выводился хеш-код массива аторов
        } else {
            System.out.print("");
        }
        System.out.print(". Издательство: " + publisher);
        System.out.println(". Год издания: " + year);
    }

    public static void printAll(Book[] books) {
        for (Book country : books) {
            country.print(); // Вызываем метод print для каждого объекта Book
        }
    }
}
