package net.accedegh.retrofitlibrary.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by frank on 12/13/16.
 */

public class Movie {
    public String imagePath = "https://carhubstorage.blob.core.windows.net/cloud991/";

    @SerializedName("MovieId")
    @Expose
    private Integer movieId;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Year")
    @Expose
    private String year;
    @SerializedName("Actors")
    @Expose
    private String actors;
    @SerializedName("Plot")
    @Expose
    private String plot;
    @SerializedName("Director")
    @Expose
    private String director;
    @SerializedName("Cover")
    @Expose
    private String cover;

    /**
     * No args constructor for use in serialization
     *
     */
    public Movie() {
    }

    /**
     *
     * @param cover
     * @param title
     * @param movieId
     * @param actors
     * @param year
     * @param director
     * @param plot
     */
    public Movie(Integer movieId, String title, String year, String actors, String plot, String director, String cover) {
        super();
        this.movieId = movieId;
        this.title = title;
        this.year = year;
        this.actors = actors;
        this.plot = plot;
        this.director = director;
        this.cover = cover;
    }

    /**
     *
     * @return
     * The movieId
     */
    public Integer getMovieId() {
        return movieId;
    }

    /**
     *
     * @param movieId
     * The MovieId
     */
    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The Title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The year
     */
    public String getYear() {
        return year;
    }

    /**
     *
     * @param year
     * The Year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     *
     * @return
     * The actors
     */
    public String getActors() {
        return actors;
    }

    /**
     *
     * @param actors
     * The Actors
     */
    public void setActors(String actors) {
        this.actors = actors;
    }

    /**
     *
     * @return
     * The plot
     */
    public String getPlot() {
        return plot;
    }

    /**
     *
     * @param plot
     * The Plot
     */
    public void setPlot(String plot) {
        this.plot = plot;
    }

    /**
     *
     * @return
     * The director
     */
    public String getDirector() {
        return director;
    }

    /**
     *
     * @param director
     * The Director
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     *
     * @return
     * The cover
     */
    public String getCover() {
        return imagePath + cover;
        // return "https://carhubstorage.blob.core.windows.net/cloud991/cobra.jpg";
    }

    /**
     *
     * @param cover
     * The Cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }
}

