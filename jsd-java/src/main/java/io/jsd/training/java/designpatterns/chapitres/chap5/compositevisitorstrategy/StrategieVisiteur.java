package io.jsd.training.java.designpatterns.chapitres.chap5.compositevisitorstrategy;

public interface StrategieVisiteur<T> {
    T getResultat();

    void gere(Fichier fichier);

    void gere(Repertoire repertoire);
}
