package cwiczenia.lekcja4.radio;

public class Radio {
    int volume;
    double frequency;
    String amFm;

    public Radio(int volume, double frequency, String amFm) {
        this.volume = volume;
        this.frequency = frequency;
        this.amFm = amFm;
    }

    void increaseVolume(int addVolume) {
        volume += addVolume;
    }

    void decreaseVolume(int minusVolume) {
        volume -= minusVolume;
    }

    void increaseFrequencyByOne() {// zwiększenie o 1
//       lub frequency += 1;
        frequency++;
    }

    void decreaseFrequencyByOne() {
        frequency -= 1;
//        // lub frequency--;
    }

    void turnOnAMOrFM(String amOrFM) {
        amFm = amOrFM;
    }

    // lub
    void enableFM() {
        amFm = "FM";
    }

    void enableAM() {
        amFm = "AM";
    }

    void showRadioInfo() {
        System.out.println("Volume: " + volume + ", frequency: " + frequency + "Hz" + ", Am or FM: " + amFm);
        System.out.println();
    }
}
