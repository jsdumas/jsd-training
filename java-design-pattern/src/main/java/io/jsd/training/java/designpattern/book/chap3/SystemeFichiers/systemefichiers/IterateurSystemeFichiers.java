package io.jsd.training.java.designpattern.book.chap3.SystemeFichiers.systemefichiers;
import java.util.Iterator;

public class IterateurSystemeFichiers implements
        Iterator<Dossier> {
    protected Dossier[] dossiers;
    protected int position = 0;

    public IterateurSystemeFichiers(Dossier[] dossiers) {
        this.dossiers = dossiers;
    }

    public Dossier next() {
        Dossier dossier = dossiers[position];
        position++;
        return dossier;
    }

    public boolean hasNext() {
        if (position < dossiers.length
                && dossiers[position] != null) {
            return true;
        } else {
            return false;
        }

    }

    public void remove() {

    }

}
