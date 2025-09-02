package fr.umontpellier.iut.commande;

import fr.umontpellier.iut.document.Document;

public class CommandeMajuscules extends CommandeDocument {


    public CommandeMajuscules (Document document, String[] parametres) {
        super(document, parametres);
    }
    @Override
    public void executer() {
        if(parametres.length < 3) {
            System.err.println("Format attendu : majuscules;debut;fin");
            return;
        }
        int debut = Integer.parseInt(parametres[1]);
        int  fin = Integer.parseInt(parametres[2]);     
        this.document.majuscules(debut,fin);
        super.executer();
    }
}
