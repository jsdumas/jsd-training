package io.jsd.training.designpatterns.chapitres.chap5.interpreterCompositeVisitor.interpretercompositevisitor;

public class Test {

    public static void main(String[] args) {
        Noeud noeud1, noeud2;

        noeud1 = new NoeudEntier(10);
        noeud2 = new NoeudEntier(15);
        noeud2 = new NoeudAddition(noeud1, noeud2);
        noeud1 = new NoeudEntier(6);
        noeud1 = new NoeudMultiplication(noeud1, noeud2);
        System.out.println("Résulat = "
                + noeud1.accepteVisiteurExpression(new VisiteurExpression()));

    }

}
