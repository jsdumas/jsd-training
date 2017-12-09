package io.jsd.training.designpatterns.chapitres.chap4.adapterclasseanonyme;

public class MessageImpl implements Message {

    @Override
    public boolean envoie() {
        return true;
    }

    @Override
    public boolean prepare(ContenuMessage contenu) {
        if ((contenu.getDestinataire().length() == 0)
                || (contenu.getDestinataire()
                        .indexOf("@") == -1))
            return false;
        if ((contenu.getEmetteur().length() == 0)
                || (contenu.getEmetteur().indexOf("@") == -1))
            return false;
        return true;
    }

}
