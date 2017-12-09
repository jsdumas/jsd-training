package io.jsd.training.java.designpatterns.chapitres.chap5.voterstrategy;

public class StrategieUnanimite implements StrategieVote {

    protected boolean voteOK;

    public boolean getResultat() {
        return voteOK;
    }

    public void initialiseVotes() {
        voteOK = true;
    }

    public void ajouteVote(Vote vote) {
        voteOK = voteOK && (vote != Vote.contre);
    }

}
