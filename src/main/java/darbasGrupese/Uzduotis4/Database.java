package darbasGrupese.Uzduotis4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Database {
   public static Map<String, Account> accountList = new HashMap<>();
   Scanner scanner = new Scanner(System.in);



    static{

        accountList.put("Petras", new Account("Petras", "slaptazodis1", 300));
        accountList.put("Jonas", new Account("Jonas", "slaptazodis2", 400));
        accountList.put("Lukas", new Account("Lukas", "slaptazodis3", 900));

    }

    public void menu() {
        String userInput;
        do {

            System.out.println("Noredami prisijungti spauskite 1");
            System.out.println("Noredami sukurti account spauskite 2");
            userInput = scanner.nextLine();


            switch (userInput) {
                case "1":
                    loginToAccount();
                    break;

                case "2":
                    createNewAccount();
                    break;

                default:
                    System.out.println("Nera tokio pasirinkimo");

            }
        } while (userInput.equals("3"));


    }


    public void loginToAccount() {
        String userLoginName;
        String password;
        System.out.println("Iveskite prisijungimo varda: ");
        userLoginName = scanner.nextLine();
        System.out.println("Iveskite slaptazodi: ");
        password = scanner.nextLine();
        boolean foundAccountName = false;
        for (Map.Entry<String, Account> stringAccountEntry : accountList.entrySet()) {
            if (userLoginName.equals(stringAccountEntry.getKey())) {
                foundAccountName = true;
                if (password.equals(stringAccountEntry.getValue().getPassword())) {
                    System.out.println("Prisijungta." + stringAccountEntry.getValue().getBalance());
                    loggedInUserMenu(stringAccountEntry.getValue());

                } else {
                    System.out.println("Slaptazodis neteisingas. ");
                    menu();
                }
            }
        } if (!foundAccountName)
            System.out.println("Tokio account nera. ");
    }
    private void loggedInUserMenu(Account account) {
        System.out.println("Prisijungti pavyko!" + account.getUsername());
    }
    private void createNewAccount() {
        System.out.println("Iveskite naujo account varda: ");
        String name = scanner.nextLine();
        System.out.println("Iveskite naujo account password: ");
        String password = scanner.nextLine();
        System.out.println("Iveskite naujo account balansa: ");
        int balance = scanner.nextInt();
        accountList.put(name,new Account(name, password, balance));
    }


}
