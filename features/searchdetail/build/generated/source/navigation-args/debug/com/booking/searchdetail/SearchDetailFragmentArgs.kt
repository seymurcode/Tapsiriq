package com.booking.searchdetail

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SearchDetailFragmentArgs(
  public val itemId: String?,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("itemId", this.itemId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("itemId", this.itemId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SearchDetailFragmentArgs {
      bundle.setClassLoader(SearchDetailFragmentArgs::class.java.classLoader)
      val __itemId : String?
      if (bundle.containsKey("itemId")) {
        __itemId = bundle.getString("itemId")
      } else {
        throw IllegalArgumentException("Required argument \"itemId\" is missing and does not have an android:defaultValue")
      }
      return SearchDetailFragmentArgs(__itemId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): SearchDetailFragmentArgs {
      val __itemId : String?
      if (savedStateHandle.contains("itemId")) {
        __itemId = savedStateHandle["itemId"]
      } else {
        throw IllegalArgumentException("Required argument \"itemId\" is missing and does not have an android:defaultValue")
      }
      return SearchDetailFragmentArgs(__itemId)
    }
  }
}
