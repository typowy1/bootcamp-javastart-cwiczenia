package cwiczenia.lekcja17woddzielnymrepo.lekcja17wcwiczeniachwfolderze.cwiczenie1;

import java.util.Optional;

public class OptionalExercise {

    //  Generalnie rozwiązanie jest w folderze lekcja 17, na tamtym branchu tu tylko przykład

    public Optional createEmptyOptional() {
        return Optional.empty();
    }

    public Optional createOptionalWithValue() {
        return Optional.of("dupa");
    }

    public Optional<String> createOptionalWithValue(String s) {
        return Optional.of(s);
    }

    public String getOptionalValueOrDefault(Optional<String> optional, String defaultValue) {
        return optional.orElse(defaultValue);
    }
}
