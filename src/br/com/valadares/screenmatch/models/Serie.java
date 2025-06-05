package br.com.valadares.screenmatch.models;

public class Serie extends Title{
    private int season;
    private int episodeForSeason;
    private int durationForEpisode;
    private boolean active;

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodeForSeason() {
        return episodeForSeason;
    }

    public void setEpisodeForSeason(int episodeForSeason) {
        this.episodeForSeason = episodeForSeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getDurationForEpisode() {
        return durationForEpisode;
    }

    public void setDurationForEpisode(int durationForEpisode) {
        this.durationForEpisode = durationForEpisode;
    }

    @Override
    public double getDuration() {
        return season*episodeForSeason*durationForEpisode;

    }
}







