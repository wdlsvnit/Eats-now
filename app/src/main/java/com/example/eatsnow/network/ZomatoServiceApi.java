package com.example.eatsnow.network;

import com.example.eatsnow.model.categories.CategoryResponse;
import com.example.eatsnow.model.restaurant.RestaurantResponse;
import com.example.eatsnow.model.reviews.ReviewResponse;
import com.example.eatsnow.model.search.SearchResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ZomatoServiceApi {

    @GET("/api/v2.1/categories")
    Observable<CategoryResponse> getCategories();

    @GET("/api/v2.1/search")
    Observable<SearchResponse> getCategorySearch(@Query("lat") String latitude,
                                                 @Query("lon") String longitude,
                                                 @Query("category") String category);

    @GET("/api/v2.1/restaurant")
    Observable<RestaurantResponse> getRestaurantDetails(@Query("res_id") String restaurantId);

    @GET("/api/v2.1/reviews")
    Observable<ReviewResponse> getReviews(@Query("res_id") String restaurantId);

    @GET("/api/v2.1/search")
    Observable<SearchResponse> getsearchResults(@Query("lat") Double latitude,
                                                @Query("lon") Double longitude,
                                                @Query("q") String searchString,
                                                @Query("count") Integer count,
                                                @Query("radius") Integer radiusInMeters);
}
