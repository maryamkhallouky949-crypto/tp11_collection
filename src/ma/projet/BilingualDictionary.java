
package ma.projet;

import java.util.HashMap;
import java.util.Map;

public class BilingualDictionary {

    public static void main(String[] args) {

       
        Map<String, String> dictionary = new HashMap<>();

        
        dictionary.put("cat", "chat");
        dictionary.put("dog", "chien");
        dictionary.put("bird", "oiseau");
        dictionary.put("book", "livre");
        dictionary.put("house", "maison");

     
        System.out.println("Traduction de dog : "
                + dictionary.get("dog"));

        System.out.println(" MOTS ANGLAIS");

        for (String key : dictionary.keySet()) {
            System.out.println(key);
        }

     
        System.out.println("TRADUCTIONS FRANCAISES");

        for (String value : dictionary.values()) {
            System.out.println(value);
        }

 
        System.out.println(" DICTIONNAIRE COMPLET ");

        for (Map.Entry<String, String> entry
                : dictionary.entrySet()) {

            System.out.println(entry.getKey()
                    + " -> " + entry.getValue());
        }

        
        System.out.println("\nContient cat ? "
                + dictionary.containsKey("cat"));

       
        System.out.println("Nombre de mots : "
                + dictionary.size());
    }
}
