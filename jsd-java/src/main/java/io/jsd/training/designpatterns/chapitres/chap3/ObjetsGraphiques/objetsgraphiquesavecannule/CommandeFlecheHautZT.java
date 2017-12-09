﻿package io.jsd.training.designpatterns.chapitres.chap3.ObjetsGraphiques.objetsgraphiquesavecannule;public class CommandeFlecheHautZT implements Commande {    protected ZoneTexte recepteur;    protected int taille;    public CommandeFlecheHautZT(ZoneTexte r) {        this.recepteur = r;    }    public void lance() {        taille = recepteur.getTaillePolice();        if (taille < ZoneTexte.TAILLEMAX)            recepteur.setTaillePolice(taille + 1);    }    public void annule() {        recepteur.setTaillePolice(taille);    }}