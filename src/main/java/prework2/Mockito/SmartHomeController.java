package prework2.Mockito;

public class SmartHomeController {

    //serce systemu, które sprawdza aktualną wilgotność i uruchamia lub zatrzymuje podlewanie


    private HumiditySensor humiditySensor;
    private WateringController wateringController;

    public SmartHomeController(HumiditySensor humiditySensor, WateringController wateringController) {
        this.humiditySensor = humiditySensor;
        this.wateringController = wateringController;
    }

    public void enableWateringIfNeeded() {
        int humidity = humiditySensor.getHumidity();

        if (humidity < 50) {
            wateringController.enableWatering();
        } else {
            wateringController.disableWatering();
        }

        //Co chcemy przetestować?
        //
        //    czy dla 49% wilgotności zostanie uruchomione nawadnianie
        //    czy dla 50% wilgotności zostanie zatrzymane nawadnianie
    }
}
