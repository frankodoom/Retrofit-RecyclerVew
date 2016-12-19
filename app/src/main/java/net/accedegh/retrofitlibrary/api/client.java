package net.accedegh.retrofitlibrary.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by frank on 12/16/16.
 */

public class client {

    // Trailing slash is needed
    public static final String BASE_URL = "http://orionadmin.azurewebsites.net/";
    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    //GitHubService service = retrofit.create(GitHubService.class);
}
