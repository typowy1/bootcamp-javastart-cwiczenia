package prework2.Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)// pochodzi junita
public class SmartHomeControllerTest {
//https://javastart.pl/kurs/testowanie-jednostkowe/mockowanie/lekcja/mockowanie-wstep
    //https://javastart.pl/kurs/testowanie-jednostkowe/mockowanie/lekcja/tj-tworzenie-mockow
    //Co chcemy przetestować?
    //
    //    czy dla 49% wilgotności zostanie uruchomione nawadnianie
    //    czy dla 50% wilgotności zostanie zatrzymane nawadnianie

//    @Test
//    void shouldDisableWatering(){
//        //given
//        HumiditySensor humiditySensorMock = Mockito.mock(HumiditySensor.class);
//        Mockito.when(humiditySensorMock.getHumidity()).thenReturn(50);//nadajemy zachowanie, będzie zwracał 50
////        kiedy zostanie uruchomiona ta metoda zawsze wracaj 50
//
//        WateringController wateringController = Mockito.mock(WateringController.class);
//
//        SmartHomeController smartHomeController = new SmartHomeController(humiditySensorMock, wateringController);
//
//        // when
//        smartHomeController.enableWateringIfNeeded();
//
//        //than
//        Mockito.verify(wateringController).disableWatering();
//        //sprwadzemy czy na obiekcie klas wateringController została wywołana metoda disableWatering
//    }

//    Przyjrzyjmy się bliżej kolejnym częściom.
//
//HumiditySensor humiditySensorMock = Mockito.mock(HumiditySensor.class);
//Mockito.when(humiditySensorMock.getHumidity()).thenReturn(50);

//
//Pierwszym etapem jest stworzenie HumiditySensor. Robimy to korzystając z metody Mockito.mock(), jako argument podając jaką klasę chcemy mockować. Mockito stworzy klasę która implementuje interfejs HumiditySensor, a następnie obiekt tej klasy.
//
//Kolejnym krokiem jest nadanie temu obiektowi zachowania. Definiujemy, że jeśli zostanie wywołana metoda getHumidity() to zwrócona powinna zostać wartość 50.
//
//WateringController wateringControllerMock = Mockito.mock(WateringController.class);

//
//Tutaj tworzymy mock dla klasy WateringController.
//
//Teraz możemy stworzyć instancję klasy SmartHomeController podając jako argumenty stworzone wcześniej mocki. Zauważ, że mock ma taki sam typ jak klasa którą reprezentuje.
//
//SmartHomeController smartHomeController = new SmartHomeController(humiditySensorMock, wateringControllerMock);

//
//Przygotowaliśmy wszystkie elementy potrzebne do przeprowadzenia testu. Teraz wywołujemy metodę którą chcemy przetestować:
//
//smartHomeController.enableWateringIfNeeded();

//
//Pozostało sprawdzić czy wszystko poszło zgodnie z planem i czy metoda disableWatering() w klasie WateringController została wywołana. Możemy to zrobić za pomocą metody Mockito.verify():
//
//Mockito.verify(wateringControllerMock).disableWatering();


    //W ten sposób sprawdziliśmy, że SmartHomeController wywołał odpowiednią metodę. W przypadku gdyby zmienić test specjalnie tak, żeby nie przechodził:
    //
    //class SmartHomeControllerTest {
    //
    //    @Test
    //    void shouldDisableWatering() {
    //        HumiditySensor humiditySensorMock = Mockito.mock(HumiditySensor.class);
    //        Mockito.when(humiditySensorMock.getHumidity()).thenReturn(49); // <--- tutaj zmiana na 49 zamiast 50
    //
    //        WateringController wateringControllerMock = Mockito.mock(WateringController.class);
    //
    //        SmartHomeController smartHomeController = new SmartHomeController(humiditySensorMock, wateringControllerMock);
    //
    //        // when
    //        smartHomeController.enableWateringIfNeeded();
    //
    //        // then
    //        Mockito.verify(wateringControllerMock).disableWatering();
    //    }
    //
    //}

    //
    //W wyniku otrzymamy następującą informację:
    //
    //Wanted but not invoked:
    //wateringController.disableWatering();

    //
    //Mam nadzieję, że ten prosty przykład pozwolił Ci wstępnie zrozumieć istotę mockowania. Użyliśmy go do dwóch celów:
    //
    //    nadania zachowania
    //    sprawdzenia wywołania metody


    //    //Tworzenie mocków można jeszcze bardziej skrócić. Mockito oferuje specjalne adnotacje do tego celu. Pierwsza
    //    z nich to @Mock. Oznaczamy nią pole które ma być mockiem. Sama adnotacja jednak nie zadziałała.
    //    Musimy w jakiś sposób wymusić na Mockito, żeby przejrzał czy są jakieś mocki do stworzenia.
    //    Służy do tego polecenie MockitoAnnotations.openMocks(this).
    //    Jeśli korzystasz ze starszej wersji Mockito to jej poprzednia nazwa to MockitoAnnotations.initMocks(this).


//    @Mock private HumiditySensor humiditySensorMock;
//    @Mock private WateringController wateringControllerMock;
//
//    // dzięki @Mock unikamy linijek z tworzeniem mocków
//
//    @BeforeEach
//    void init() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void shouldDisableWatering() {
//        // given
//        Mockito.when(humiditySensorMock.getHumidity()).thenReturn(50);
//        SmartHomeController smartHomeController = new SmartHomeController(humiditySensorMock, wateringControllerMock);
//
//        // when
//        smartHomeController.enableWateringIfNeeded();
//
//        // then
//        verify(wateringControllerMock).disableWatering();
//    }

    //Zamiast MockitoAnnotations.openMocks(this) istnieje możliwość wykorzystania mechanizmu JUnit 5 do rozszerzania testów. Mockito dostarcza takie rozszerzenie w ramach osobnej zależności. (plik pom.xml, sekcja dependencies)
    //
//    nad klasą dajemy
    //@ExtendWith(MockitoExtension.class)

    //<dependency>
    //    <groupId>org.mockito</groupId>
    //    <artifactId>mockito-junit-jupiter</artifactId>
    //    <version>3.3.3</version>
    //    <scope>test</scope>
    //</dependency>
    //
    //Do klasy testowej możemy teraz dodać @ExtendWith(MockitoExtension.class)

//    @Mock private HumiditySensor humiditySensorMock;
//    @Mock private WateringController wateringControllerMock;
//
//    @Test
//    void shouldDisableWatering() {
//        // given
//        Mockito.when(humiditySensorMock.getHumidity()).thenReturn(50);
//        SmartHomeController smartHomeController = new SmartHomeController(humiditySensorMock, wateringControllerMock);
//
//        // when
//        smartHomeController.enableWateringIfNeeded();
//
//        // then
//        verify(wateringControllerMock).disableWatering();
    //   }
//Ostatnim elementem który warto znać to adnotacja @InjectMocks. Pozwala ona na automatyczne wstrzyknięcie mocków do konstruktora klasy. W przykładzie powyżej samemu tworzymy instancję klasy SmartHomeController. Możemy to zastąpić takim polem:
    //@InjectMocks private SmartHomeController smartHomeController;

//    Mockito automatycznie wykryje jakie argumenty konstruktora są wymagane i wstrzyknie stworzone mocki


    //lepiej stosój poprzednią wersje
    @Mock
    private HumiditySensor humiditySensorMock;
    @Mock
    private WateringController wateringControllerMock;
    @InjectMocks
    private SmartHomeController smartHomeController;

    @Test
    void shouldDisableWatering() {
        // given
        when(humiditySensorMock.getHumidity()).thenReturn(50);

        // when
        smartHomeController.enableWateringIfNeeded();

        // then
        verify(wateringControllerMock).disableWatering();
    }

    //Jeśli mock nie zostanie odnaleziony to w miejsce parametru konstruktora z jego typem zostanie podstawiony null, np:
    //
    //new SmartHomeController(humiditySensorMock, null);
    //1
    //file_copy
    //
    //Jest to więc rozwiązanie bardziej podatne na NullPointeryException. W przypadku gdyby konstruktor SmartHomeController został zmieniony i przykładowo zostanie tam dodany kolejny parametr to test nadal będzie się kompilował w przeciwieństwie do poprzedniego rozwiązania gdzie samemu wywoływaliśmy konstruktor.

}
