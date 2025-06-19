package br.com.valadares.screenmatch.models;

public class Serie extends Title{
    private final int season;
    private final int episodeForSeason;
    private final int durationForEpisode;
    private boolean active;

    public Serie(String name, int duration, int releaseYear, int season, int episodeForSeason, int durationForEpisode) {
        super(name, duration, releaseYear);
        this.season = season;
        this.episodeForSeason = episodeForSeason;
        this.durationForEpisode = durationForEpisode;
    }

    public int getSeason() {
        return season;
    }
    public int getEpisodeForSeason() {
        return episodeForSeason;
    }
    public boolean isActive() {
        return active;
    }
    public int getDurationForEpisode() {
        return durationForEpisode;
    }

    @Override
    public double getDuration() {
        return season*episodeForSeason*durationForEpisode;

    }

//    @Override
//    public String toString() {
//        return "Serie{" +
//                "season=" + season +
//                ", episodeForSeason=" + episodeForSeason +
//                ", durationForEpisode=" + durationForEpisode +
//                ", active=" + active +
//                '}';
//    }
}







