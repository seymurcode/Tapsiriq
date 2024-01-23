package com.sirketismi.common.flowstate

import android.app.appsearch.SearchResult

sealed class Resource<T>(var data : T? = null,
                         var message : String? = null) {
    // Success, Error, Loading

    class Success<T>(data : T) : Resource<T>(data = data)
    class Error<T>(message: String?) : Resource<T>(message = message)
    class Loading<T>() : Resource<T>()
}

//class ErrorClass(title : String, message : String, errorCode : Int, screenId : String)