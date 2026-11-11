
package ma.projet;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    public static void main(String[] args) {

        
        List<Task> tasks = new ArrayList<>();

       
        tasks.add(new Task("Apprendre Java Collections"));
        tasks.add(new Task("Faire les courses"));
        tasks.add(new Task("Réviser les examens"));
        tasks.add(new Task("Faire les exercices"));

        tasks.get(0).setCompleted(true);
        tasks.get(2).setCompleted(true);

        System.out.println(" TOUTES LES TACHES ");

        for (Task t : tasks) {
            System.out.println(t);
        }

        
        System.out.println("TACHES NON TERMINEES ");

        for (Task t : tasks) {
            if (!t.isCompleted()) {
                System.out.println(t);
            }
        }

        
        System.out.println("Nombre total : " + tasks.size());
    }
}
