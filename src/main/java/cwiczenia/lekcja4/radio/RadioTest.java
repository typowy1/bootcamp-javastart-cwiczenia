package cwiczenia.lekcja4.radio;

public class RadioTest {
    public static void main(String[] args) {
        Radio radio = new Radio(50, 100, "AM");
        radio.showRadioInfo();
        radio.increaseVolume(2);
        radio.increaseFrequencyByOne();
        radio.increaseFrequencyByOne();
        radio.turnOnAMOrFM("FM");
        radio.showRadioInfo();

        radio.turnOnAMOrFM("AM");
        radio.decreaseVolume(3);
        radio.decreaseFrequencyByOne();
        radio.showRadioInfo();

        radio.enableFM();
        radio.showRadioInfo();
    }
}
