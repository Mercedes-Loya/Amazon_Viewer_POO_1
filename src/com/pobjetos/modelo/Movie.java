package com.pobjetos.modelo;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Movie {

    private int id;
    private String title;
    private String genre;
    private String creador;
    private int duration;
    private short year;
    private boolean viewed;
    private int timeViewed;

    public Movie() {
    }

    public Movie( String title, String genre, String creador, int duration, short year) {
       
        this.title = title;
        this.genre = genre;
        this.creador = creador;
        this.duration = duration;
        this.year = year;
       
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the creador
     */
    public String getCreador() {
        return creador;
    }

    /**
     * @param creador the creador to set
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the year
     */
    public short getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(short year) {
        this.year = year;
    }

    /**
     * @return the viewed
     */
    public boolean getIsViewed() {
        return viewed;
    }

    /**
     * @param viewed the viewed to set
     */
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    /**
     * @return the timeViewed
     */
    public int getTimeViewed() {
        return timeViewed;
    }

    /**
     * @param timeViewed the timeViewed to set
     */
    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }
    
    
    
}


