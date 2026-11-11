
package ma.projet;

import java.util.*;

public class SetComparison {

    public static void main(String[] args) {

        
        Set<String> hashSet = new HashSet<>(
                Arrays.asList("Zèbre", "Ananas", "Banane"));

        Set<String> linkedHashSet = new LinkedHashSet<>(
                Arrays.asList("Zèbre", "Ananas", "Banane"));

       
        Set<String> treeSet = new TreeSet<>(
                Arrays.asList("Zèbre", "Ananas", "Banane"));

        
        System.out.println("HashSet : " + hashSet);

        System.out.println("LinkedHashSet : " + linkedHashSet);

        System.out.println("TreeSet : " + treeSet);
    }
}
