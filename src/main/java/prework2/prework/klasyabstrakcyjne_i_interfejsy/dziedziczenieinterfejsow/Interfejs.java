package prework2.prework.klasyabstrakcyjne_i_interfejsy.dziedziczenieinterfejsow;

public class Interfejs {
    //    zabezpiecza nas przed zapisem new Klasa()
    //definiujemy wtedy jak w klasie nadzednej nie mamy zadny pól, stanów, tylko np atałe, metody itd, po interfejsie
    // nie dziedziczymy a go implementujemy, nie można w nim deklarować pól poza stałymi, domyślnie wszystkie metody są
    // publiczne i abstrakcyjne
    // wiele interfejsów
    // nie możemy napisać new Shape()
    //interfejsy mają problem z dziedziczeniem, rozwiazaniem jest nadpisywanie metod w klasach dziedziczących, możemy też
    // odwołać sie do metod interfejsow po ktorych implementujemy przez słowo super
    // od javy 9 można do nich dodawać metody prywatne, nie są to metody domyślne

//    Kiedy stosować interfejsy:
//    nie moze być stanu czyli standardowych pol klasy, stosujemy tylko wtedy kiedy mamy zdefiniowane zachowanie,
//    brak cech wspólnych dla róznych kształtów
}
