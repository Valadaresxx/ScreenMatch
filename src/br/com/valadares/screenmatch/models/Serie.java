package br.com.valadares.screenmatch.models;

public class Serie extends Title{
    private int season;
    private int episodeForSeason;
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
}
