﻿package io.jsd.training.designpattern.book.chap3.ObjetsGraphiques.objetsgraphiques;public class CommandeFlecheBasFG implements Commande {    protected FormeGraphique recepteur;    public CommandeFlecheBasFG(FormeGraphique r) {        this.recepteur = r;    }    public void lance() {        int y = recepteur.getY();        if (y > 0)            recepteur.setY(y - 1);    }}