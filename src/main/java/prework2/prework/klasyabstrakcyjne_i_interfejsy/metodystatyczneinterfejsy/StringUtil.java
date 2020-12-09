package prework2.prework.klasyabstrakcyjne_i_interfejsy.metodystatyczneinterfejsy;

public class StringUtil {

    //    Java 8 wprowadziła jeszcze jedną nowość. Od teraz interfejsy mogą posiadać także metody statyczne. Zachowują się one
//    dokładnie tak samo jak w przypadku tradycyjnych metod statycznych w klasach i najczęściej będą przydatne w przypadku
//    definiowania prostych metod użytkowych. Metody statyczne w interfejsach są domyślnie publiczne.
    static String revert(String original) {
        return new StringBuilder(original).reverse().toString();
    }
}
