package io.jsd.training.designpattern.book.chap4.adapterclasseanonyme;

public class MessageImpl implements Message {

    public boolean envoie() {
        return true;
    }

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
