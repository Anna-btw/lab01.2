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

    public void setCity(String city) {
        if (city == null)
        {
            throw new IllegalArgumentException("Ошибка. Город должен быть указан!");
        }
//        else if (city == "Санкт-Петебург")
//        {
//            return "Санкт-Петербург";
//        }
        this.city = city;
    }

    //Конструктор
    public Publisher(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
