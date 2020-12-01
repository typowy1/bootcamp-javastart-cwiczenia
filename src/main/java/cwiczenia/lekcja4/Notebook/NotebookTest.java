package cwiczenia.lekcja4.Notebook;

public class NotebookTest {

    public static void main(String[] args) {

        Notebook notebook1 = new Notebook("Ide Pad", "Lenovo", 4860, 4000, true);
        Notebook notebook2 = new Notebook("Pavilon", "HP", 3000, true);
        Notebook notebook3 = new Notebook("Smary0011", "Acer", 1280, 3500);

        System.out.println(notebook1.getDescription());
        System.out.println(notebook2.getDescription());
        System.out.println(notebook3.getDescription());
    }
}
