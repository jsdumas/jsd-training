﻿package io.jsd.training.java.designpattern.book.chap3.expression;import java.util.*;abstract public class NoeudOperateur implements Noeud {    protected List<Noeud> enfants = new ArrayList<Noeud>();    public void ajouteNoeud(Noeud noeud) {        enfants.add(noeud);    }    public List<Noeud> getEnfants() {        return enfants;    }}