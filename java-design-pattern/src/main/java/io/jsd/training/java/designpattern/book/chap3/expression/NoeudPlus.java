﻿package io.jsd.training.java.designpattern.book.chap3.expression;public class NoeudPlus extends NoeudOperateur {    public void accepteVisiteur(VisiteurExpression v) {        v.visite(this);    }}