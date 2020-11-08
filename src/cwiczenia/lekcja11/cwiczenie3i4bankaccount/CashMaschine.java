package cwiczenia.lekcja11.cwiczenie3i4bankaccount;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CashMaschine {

    private static final int DEPOSIT = 0;
    private static final int WITHDRAW = 1;
    private static final int CHECK_ACCOUNT = 2;
    private static final int EXIT = 3;

    private final BankAccount bankAccount;
    private final Scanner scanner;

    public CashMaschine() {
        Person person = new Person("Jan", "Kowalski", "55566788");
        bankAccount = new BankAccount(person, 3000);
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {

        CashMaschine cashMaschine = new CashMaschine();
        cashMaschine.start();


//        w życiowej sytuacji zabezpieczymy sie tak
//        if(person !=null) to wtedy  tworzymy konto bankowe

//       try {
//           BankAccount bankAccount = new BankAccount(null, 3000);
//       }catch (NullPointerException ex){
//           System.err.println(ex.getMessage());
//       }


//        boolean end = false;
//        Scanner scanner = new Scanner(System.in);
//
//        while (!end) {
//            printMenu();
//
//            int selectedOption = 0;
//            try {
//                selectedOption = scanner.nextInt();
//            }catch (Exception e){
//                // ignore
//            }
//            scanner.nextLine();
//
//            switch (selectedOption) {
//                case DEPOSIT:
//                    deposit();
//                    break;
//                case WITHDRAW:
//                    withdraw();
//                    break;
//                case CHECK_ACCOUNT:
//                    checkAccount();
//                    break;
//                case EXIT:
//                    end = true;
//                    break;
//                default:
//                    System.out.println("Nieprawidłowa opcja");
//            }
//
//        }

//        Person person = new Person("Jan", "Kowalski", "55566788");
//        try {
//            BankAccount bankAccount = new BankAccount(person, 3000);
//            bankAccount.deposit(1000);
//            bankAccount.withdraw(2000);
//        } catch (NullPointerException | NotEnoughMoneyException | MaximumWithdrawalExceededException ex) {
//            System.err.println(ex.getMessage());
//        }

    }

    private void start() {
        boolean end = false;

        while (!end) {
            printMenu();

            int selectedOption = 0;
            try {
                selectedOption = scanner.nextInt();
            } catch (Exception e) {
                // ignore
            }
            scanner.nextLine();

            switch (selectedOption) {
                case DEPOSIT:
                    deposit();
                    break;
                case WITHDRAW:
                    withdraw();
                    break;
                case CHECK_ACCOUNT:
                    checkAccount();
                    break;
                case EXIT:
                    end = true;
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja");
            }

        }

    }

    private void checkAccount() {
        double money = bankAccount.getAccountValue();
        System.out.println("Na koncie masz aktualnie: " + money + "zł");
    }

    private void withdraw() {
        System.out.println("Ile chcesz wypłacić");

        try {
            double value = scanner.nextDouble();
            scanner.nextLine();
            System.out.printf("Próba wypłaty %fzł\n", value);
            bankAccount.withdraw(value);
            System.out.println("");
        } catch (InputMismatchException e) {
            System.out.println("Nieprawidłowa wartość");
        } catch (NullPointerException | NotEnoughMoneyException | MaximumWithdrawalExceededException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private void deposit() {
        System.out.println("Ile chcesz wpłacić");

        try {
            double value = scanner.nextDouble();
            scanner.nextLine();
            bankAccount.deposit(value);
            System.out.println("Zasilono konto kwotą: " + value + "zł");
        } catch (InputMismatchException e) {
            System.out.println("Nieprawidłowa wartość");
        }
    }

    private void printMenu() {
        System.out.println("Co chcesz zrobić");
        System.out.println(DEPOSIT + " - Wpłata pieniędzy");
        System.out.println(WITHDRAW + " - Wypłata pieniędzy");
        System.out.println(CHECK_ACCOUNT + " - Sprawdzenie stanu konta");
        System.out.println(EXIT + " - Wyjście");
    }
/*Przerób klasę z kontem bankowym w taki sposób, żeby metoda withdraw() nie rzucała już wyjątku IllegalArgumentException,
tylko wyjątek zdefiniowanego przez Ciebie typu.

Dodaj też dodatkowe zabezpieczenie, które narzuca ograniczenie co do maksymalnej kwoty możliwej do wypłaty, jednorazowo
nie można wypłacić więcej niż 1000zł. Zdefiniuj w tym celu dodatkową klasę wyjątku, a obiekt tego typu rzuć, gdy ktoś
spróbuje wypłacić kwotę wyższą niż wskazany limit.

Wprowadzone zmiany uwzględnij w klasie CashMachine, przechwytując nowe wyjątki w bloku / blokach catch.

Dodatkowe:
Dodaj do programu pętlę z opcjami wyboru, które pozwolą wpłacać lub wypłacać środki ze wskazanego konta. Zasymuluj w ten
sposób próbę wpłat/wypłat pieniędzy z bankomatu przez pewną osobę.*/
}
