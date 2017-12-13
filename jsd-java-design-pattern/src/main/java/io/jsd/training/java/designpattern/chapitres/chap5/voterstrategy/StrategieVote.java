package io.jsd.training.java.designpattern.chapitres.chap5.voterstrategy;

public interface StrategieVote {
    void initialiseVotes();

    void ajouteVote(Vote vote);

    boolean getResultat();
}
