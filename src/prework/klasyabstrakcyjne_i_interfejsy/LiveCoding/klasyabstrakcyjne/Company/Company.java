package prework.klasyabstrakcyjne_i_interfejsy.LiveCoding.klasyabstrakcyjne.Company;

public class Company {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("Jan", "Kowalski", "1234",
                5000);
        Employee contractEmployee = new ContractEmployee("Maria", "Nowak", "1234",
                90, 160);

        Employee[] employees = {fullTimeEmployee, contractEmployee};

//        for (Employee employee : employees) {
//            System.out.println(employee.getPaymentAmount());
////            employee.getPaymentAmount();
//        }

//        twożymy tablice typu interfejsu Payable do której możemy przypisać pracowników jak i fakture ponieważ
//        implementują ten interface

        Payable[] payments = new Payable[3];
        payments[0] = fullTimeEmployee;
        payments[1] = contractEmployee;
        payments[2] = new Invoice("Monitor", 4, 1000, 2015);

        double paymentTotal = 0; //sumowanie wszystkich wydatków firmy
        for (Payable payment : payments) {
            paymentTotal += payment.getPaymentAmount();
            System.out.println(paymentTotal);
        }

        //tworzymy tablice z dokumentami
        Document[] documents = new Document[2];
//        documents[0] = payments[2] nie możemy tak zapisać dlatego ze między documenti payable nie ma zadnej relacji
//        documents[0] = (Document)payments[2]; //jeżeli jestśmy pewni jeżeli jesteśmy pewni ze payments[2] reprezentuje
        // obiekt który jest zarówno payable i jest document to możemy tak zapisać
//        lub tak:
        documents[0] = new Invoice("Monitor", 4, 1000, 2015);// tak tez jest ok
        documents[1] = new Contract(12334, "Umowa o pracę", 2018);// tak tez jest ok


        for (Document document : documents) {
            document.print1();
            document.destroy();
        }
    }
}
