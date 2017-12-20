package io.jsd.training.designpattern.book.chap5.compositevisitorgraphe;

import java.util.List;

public interface NoeudIntf {

    void ajouteEnfant(Noeud enfant);

    List<Noeud> getEnfants();

    void afficheNom();

    String getNom();

    void setNom(String nom);

    <T> void accepte(VisiteurGraphe<T> visiteur);
}