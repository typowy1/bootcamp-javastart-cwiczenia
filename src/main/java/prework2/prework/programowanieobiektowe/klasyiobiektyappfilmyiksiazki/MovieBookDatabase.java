package prework2.prework.programowanieobiektowe.klasyiobiektyappfilmyiksiazki;

public class MovieBookDatabase {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.title = "Forest Gump";
        movie1.year = 1994;
        movie1.oscars = true;
        movie1.director = new PersonFromMovieAndBookApp(); // po director będziemy mogli wejsć do pól z person
        movie1.director.firstName = "Robert";
        movie1.director.lastName = "Zemeckis";
        movie1.director.birthYear = 1951;

        System.out.println("Movie:");
        System.out.println(movie1.title + " " + movie1.year + ".r " + movie1.oscars);
        System.out.println(movie1.director.firstName + " " + movie1.director.lastName + " " + movie1.director.birthYear + "r.");

        Book book1 = new Book();
        book1.title = "Ojciec Chrzestny";
        book1.pages = 300;
        book1.author = new PersonFromMovieAndBookApp();
        book1.author.firstName = "Tomasz";
        book1.author.lastName = "Kowalski";
        book1.author.birthYear = 1564;

        System.out.println();
        System.out.println("Book:");
        System.out.println(book1.title + " " + book1.pages + " str.");
        System.out.println(book1.author.firstName + " " + book1.author.lastName + " " + book1.author.birthYear + "r.");

//        Srednia z roku urodzenia rezysera i autora
        int yearSum = movie1.director.birthYear + book1.author.birthYear;
        int yearAvg = yearSum / 2;
        System.out.println("Srednia = " + yearAvg);

    }
}
