package io.jsd.training.java.designpattern.chapitres.chap5.compositevisitorstrategy;

public interface StrategieVisiteur<T> {
    T getResultat();

    void gere(Fichier fichier);

    void gere(Repertoire repertoire);
}
