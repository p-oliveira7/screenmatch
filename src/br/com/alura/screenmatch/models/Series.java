package br.com.alura.screenmatch.models;

public class Series extends Title{
    private int seasons;
    private boolean active;
    private int epsPerSeason;
    private int minutesPerEp;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpsPerSeason() {
        return epsPerSeason;
    }

    public void setEpsPerSeason(int epsPerSeason) {
        this.epsPerSeason = epsPerSeason;
    }

    public int getMinutesPerEp() {
        return minutesPerEp;
    }

    public void setMinutesPerEp(int minutesPerEp) {
        this.minutesPerEp = minutesPerEp;
    }

    @Override
    public int getMinutes() {
        return seasons * epsPerSeason * minutesPerEp;
    }
}
