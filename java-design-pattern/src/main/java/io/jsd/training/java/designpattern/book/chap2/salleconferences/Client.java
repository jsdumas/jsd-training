package io.jsd.training.java.designpattern.book.chap2.salleconferences;
public class Client {

    public static void main(String[] args) {
        Salle salle = new Salle();
        Ordinateur ordinateur = new Ordinateur();
        VideoProjecteur videoproj = new VideoProjecteur();
        SystemeAudio sysaudio = new SystemeAudio();

        SalleConferencesFacade salleConferences = new SalleConferencesFacade(
                salle, ordinateur, videoproj, sysaudio);

        salleConferences.miseEnMarche();
        salleConferences.arret();

    }

}
