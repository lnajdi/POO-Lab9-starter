package Lab.Map;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
    public static void main(String[] args) {
        // Créer un ArrayDeque pour stocker l'historique des URLs visitées
        /*
         * Historique (historique) : Cette pile stocke les URLs que l'utilisateur a
         * visitées. Lorsque l'utilisateur clique sur le bouton "retour arrière" du
         * navigateur,
         * l'URL actuelle est retirée de cette pile et placée dans la pile des pages
         * suivantes.
         * L'URL précédente devient alors l'URL actuelle.
         */
        Deque<String> historique = new ArrayDeque<>();

        // Créer un ArrayDeque pour stocker les URLs des pages suivantes.
        /*
         * Pages suivantes (pagesSuivantes) : Cette pile stocke les URLs que
         * l'utilisateur peut visiter
         * en cliquant sur le bouton "avance rapide" après avoir utilisé le bouton
         * "retour arrière".
         * Lorsque l'utilisateur clique sur "avance rapide", l'URL du dessus de cette
         * pile est déplacée vers la pile d'historique.
         */
        Deque<String> pagesSuivantes = new ArrayDeque<>();

        // Ajoutez quelques URLs à votre historique.
        historique.push("www.google.com");
        historique.push("www.bing.com");
        historique.push("https://openai.com/chatgpt");

        // Simulez l'action de "retour arrière" en déplaçant l'URL actuelle vers la pile
        // des pages suivantes.
        if (!historique.isEmpty()) {
            pagesSuivantes.push(historique.pop());
            System.out.println("Retour arrière effectué !");
        }

        // Simulez l'action d'"avance rapide" en déplaçant l'URL du dessus de la pile
        // des pages suivantes vers l'historique.
        if (!pagesSuivantes.isEmpty()) {
            historique.push(pagesSuivantes.pop());
            System.out.println("Avance rapide effectuée !");
        }

        // Affichez l'URL actuelle sans la retirer de l'historique.
        String urlActuelle = historique.peek();
        System.out.println("URL actuelle : " + urlActuelle);

        // Ajoutez une nouvelle URL à l'historique et videz la pile des pages suivantes
        // (car après avoir visité une nouvelle page, l'historique des pages suivantes
        // doit être réinitialisé).
        historique.push("https://www.freecodecamp.org/");
        pagesSuivantes.clear();

        // Vérifiez si l'historique et les pages suivantes sont vides.
        boolean historiqueEstVide = historique.isEmpty();
        boolean pagesSuivantesEstVide = pagesSuivantes.isEmpty();
        System.out.println("L'historique est-il vide ? " + historiqueEstVide);
        System.out.println("Les pages suivantes sont-elles vides ? " + pagesSuivantesEstVide);

    }

}
