package io.jsd.training.designpattern.book.chap5.voterstrategy;

public interface StrategieVote {
    void initialiseVotes();

    void ajouteVote(Vote vote);

    boolean getResultat();
}
