package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        theoretischeAufgaben();

        Account account = new Account("98765432", new BigDecimal("1000"), new Client("Dim Sum", "Tay", 12345));
        System.out.println(account.getBalance());

        account.deposit(new BigDecimal("500"));
        System.out.println(account.getBalance());

        account.withdrawel((new BigDecimal("250")));
        System.out.println(account.getBalance());

        BankService bankService = new BankService();

        String account1 = bankService.openAccount(new Client("Ming", "Tay", 273648));
        System.out.println("Konto1: " + account1);

        System.out.println(bankService);
        String account2 = bankService.openAccount(new Client("Helene", "Tay", 2731234));
        System.out.println("Konto2: " + account2);
        System.out.println(bankService);

        bankService.transfer("12340001", "12340002", new BigDecimal("1500"));
        System.out.println(bankService);






    }

    public static void theoretischeAufgaben() {


        double a = .03;
        double b = .042;

        System.out.println(a - b);

        BigDecimal numberOfPills = BigDecimal.valueOf(391);
        BigDecimal pillsPerBox = BigDecimal.valueOf(20);
        BigDecimal requiredBoxes = calculateNumberOfRequiredBoxes(numberOfPills, pillsPerBox);
        System.out.println(requiredBoxes);
    }

    private static BigDecimal calculateNumberOfRequiredBoxes(BigDecimal numberOfPills, BigDecimal pillsPerBox) {

        return numberOfPills.divide(pillsPerBox, RoundingMode.DOWN);
    }
}