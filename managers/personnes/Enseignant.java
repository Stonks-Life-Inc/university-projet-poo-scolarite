package managers.personnes;

public class Enseignant extends Personne {
    //La classe enseignant n'a pas vraiment de changement par rapport à la calsse abstraite Personne.
    //Mais, si un jour nous avons besoin de changer les attribus ou ajouter une fonctionnalitée à notre classe enseignant
    //Nous aurons juste à rajouter nos différents attributs et méthodes ici.

    //Constructeur contenant le constructeur de la classe parent
    public Enseignant(String nom, String prénom, String mailUni) {
        super(nom, prénom, mailUni);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
