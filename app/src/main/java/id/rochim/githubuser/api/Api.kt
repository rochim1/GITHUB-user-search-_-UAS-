package id.rochim.githubuser.api

import id.rochim.githubuser.data.model.DetailUserResponse
import id.rochim.githubuser.data.model.User
import id.rochim.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token ce2de36b52acc61abcdda46e4d9ec74452e5f58d")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token ce2de36b52acc61abcdda46e4d9ec74452e5f58d")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token ce2de36b52acc61abcdda46e4d9ec74452e5f58d")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token ce2de36b52acc61abcdda46e4d9ec74452e5f58d")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}