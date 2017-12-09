package io.jsd.training.java.designpatterns.chapitres.chap5.voterstrategy;

public class StrategieMajoritaire implements
        StrategieVote {

    protected int votesPour, nbrVotes;

    public boolean getResultat() {
        return votesPour > nbrVotes / 2;
    }

    public void initialiseVotes() {
        votesPour = 0;
        nbrVotes = 0;
    }

    public void ajouteVote(Vote vote) {
        if (vote != Vote.neutre)
            nbrVotes++;
        if (vote == Vote.pour)
            votesPour++;
    }

}
