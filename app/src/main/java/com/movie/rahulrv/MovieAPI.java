package com.movie.rahulrv;

import com.movie.rahulrv.model.MovieWrapper;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Interface to define movie APIs
 */

public interface MovieAPI {

    @GET("/3/movie/now_playing")
    Observable<MovieWrapper> nowPlaying(@Query("page") int page);
}