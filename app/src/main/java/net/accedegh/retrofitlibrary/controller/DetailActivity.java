package net.accedegh.retrofitlibrary.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import net.accedegh.retrofitlibrary.R;

public class DetailActivity extends AppCompatActivity {

    TextView Title,Year ,Plot, Directors, Actors;
    Toolbar mActionBarToolbar;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
       // mActionBarToolbar = (Toolbar) findViewById(R.id.movie_toolbar);
        //setSupportActionBar(mActionBarToolbar);
        //allow return to home
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        imageView = (ImageView) findViewById(R.id.movie_image_header);
        Actors= (TextView) findViewById(R.id.actors);
       // Directors= (TextView) findViewById(R.id.director);
        Plot = (TextView) findViewById(R.id.plot);
        //Year= (TextView) findViewById(R.id.year);

        // Title = (TextView) findViewById(R.id.);

        //Get all Extras from previous activity
        String title = getIntent().getExtras().getString("movie_title");
        String coverUrl =getIntent().getExtras().getString("movie_cover");
        //String year = getIntent().getExtras().getString("movie_year");
        //String director= getIntent().getExtras().getString("movie_director");
        String plot= getIntent().getExtras().getString("movie_plot");
        String actors = getIntent().getExtras().getString("movie_actors");


        //Fill Detail Activity  from Extras
        Actors.setText(actors);
        //Directors.setText(director);
        //Year.setText(year);
        Plot.setText(plot);
        //load header
        Glide.with(this)
                .load(coverUrl)
                .placeholder(R.drawable.load)
                .into(imageView);
        //Title.setText(title);

        //set toolbar title
        getSupportActionBar().setTitle(title);
    }
}
