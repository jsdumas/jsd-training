package io.jsd.training.designpatterns.chapitres.chap5.voterstrategy;

public interface StrategieVote {
    void initialiseVotes();

    void ajouteVote(Vote vote);

    boolean getResultat();
}
