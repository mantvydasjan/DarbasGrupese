//package darbasGrupese.Uzduotis3;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class ZodynasMain {
//    //public static void prinp(Map<String, String> map) {
//
//    }
//
//    public static void main(String[] args) {
//
//        Map<String, String> zodynas = new HashMap<>();
//        zodynas.put("suo", "loja");
//        zodynas.put("masina", "vaziuoja");
//        zodynas.put("kate", "murkia");
//
//     //   printMap(zodynas);
//
//
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
//
//        boolean a = false;
//        for (Map.Entry<String, String> irasas : zodynas.entrySet()) {
//            if (userInput.equals(irasas.getKey())) {me
//                System.out.println(irasas.getValue());
//                a = true;
//                break;
//            }
//
//        }
//        if (a == false) {
//            System.out.println("Nera tokio zodzio");
//            System.out.println("Pridekite kita zodi: ");
//            String key = scanner.nextLine();
//            String value = scanner.nextLine();
//            zodynas.put(key, value);
//            printMap(zodynas);
//        }
//
//    }
//}
//
//
