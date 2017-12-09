package io.jsd.training.designpatterns.chapitres.chap2.salleconferences;
public class SalleConferencesFacade implements
        SalleConferences {
    protected Salle salle;
    protected Ordinateur ordinateur;
    protected VideoProjecteur videoproj;
    protected SystemeAudio sysaudio;

    public SalleConferencesFacade(Salle salle,
            Ordinateur ordinateur,
            VideoProjecteur videoproj,
            SystemeAudio sysaudio) {
        this.salle = salle;
        this.ordinateur = ordinateur;
        this.videoproj = videoproj;
        this.sysaudio = sysaudio;
    }

    public void miseEnMarche() {
        salle.allumeLumiere();
        ordinateur.allume();
        videoproj.allume();
        videoproj.setModePleinEcran();
        sysaudio.allume();
        sysaudio.setVolumeSon(10);
    }

    public void arret() {
        sysaudio.eteint();
        videoproj.eteint();
        ordinateur.eteint();
        salle.eteintLumiere();
    }
}
