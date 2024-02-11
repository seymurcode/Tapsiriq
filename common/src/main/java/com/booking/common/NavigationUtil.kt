package com.booking.common

import android.net.Uri
import androidx.navigation.NavController

fun NavController.toDetail(itemId : String) {
    var uri = Uri.parse("az://search_detail/?itemId={$itemId}")
    this.navigate(uri)
}

//az://search_detail/?itemId={itemId}