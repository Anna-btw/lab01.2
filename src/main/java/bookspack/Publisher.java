package bookspack;

public class Publisher {
    private String name; // private чтобы атрибутами класса можно оперировать только внутри класса
    private String city; // private чтобы атрибутами класса можно оперировать только внутри класса

    // Переопределяем метод toString(), чтобы вывести строковое представление (поля) объекта класса Publisher
    @Override
    public String toString() {
        return name + ". Город: " + city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        if (name == null)
        {
            throw new IllegalArgumentException("Ошибка. Издательство должно быть указано!");
        }
        this.name = name;
    }

    // NB: тут проверяем, что поле города не пустое
    public void setCity(String city) {
        if (city == null || city.isEmpty())
        {
            throw new IllegalArgumentException("Ошибка. Город должен быть указан!");
        }
    // Исправляем опечатку в названии города. Сравниваем строки И всегда используем методы .equals(), а не через ==
        if ("Санкт-Петебург".equalsIgnoreCase(city)) {
            this.city = "Санкт-Петербург";  // присваиваем значение, return не можем делать, потому что метод возвращает тип void
        }
        else {
            this.city = city;
        }
    }

    //Конструктор
    public Publisher(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
