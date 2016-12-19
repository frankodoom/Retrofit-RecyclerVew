package net.accedegh.retrofitlibrary.api;

import net.accedegh.retrofitlibrary.MovieResult;
import net.accedegh.retrofitlibrary.model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

import static android.R.id.list;

/**
 * Created by frank on 12/16/16.
 */

public interface apiService {
    @GET("/api/movies")
    Call<List<Movie>> getMovies();
    //Call<List<Movie> listRepos(@Path("user") String user);
}


