package com.example.arkeyboardlite

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    // Update APK
    @GET("V4/Others/Kurt/LatestVersionAPK/ARKeyboardLite/output-metadata.json")
    fun getAppUpdateDetails(): Call<AppUpdateResponse>

}