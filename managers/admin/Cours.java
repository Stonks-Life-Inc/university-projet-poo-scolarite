package managers.admin;

import managers.GestionGlobal;
import managers.personnes.Enseignant;

import java.util.ArrayList;

public class Cours extends GestionGlobal {
    private Enseignant enseignantRef;
    ArrayList<Etudiant> lesEtudiants = new ArrayList<Etudiant>();
    ArrayList<Examen> lesExamens = new ArrayList<Examen>();

    public Cours(int id, String nom, FileManager fm, ArrayList<GestionGlobal> gestions, Enseignant enseignantRef) {
        super(id, nom, fm, gestions);
        this.enseignantRef = enseignantRef;
    }

    public Enseignant getEnseignantRef() {
        return enseignantRef;
    }

    public void setEnseignantRef(Enseignant enseignantRef) {
        this.enseignantRef = enseignantRef;
    }

    @Override
    public String toString() {
        return "Cours{" + super.toString() +
                "enseignantRef=" + enseignantRef +
                '}';
    }
}
