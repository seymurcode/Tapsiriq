package com.booking.account.register

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.booking.account.R
import com.booking.account.repository.FirebaseAuthRepository
import com.booking.account.repository.FirebaseRepository
import com.booking.account.repository.NotesRepository
import com.booking.account.util.showMessage
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    val repository: NotesRepository,
    val firebaseRepository: FirebaseRepository, val firebaseAuthRepository: FirebaseAuthRepository,
    @ApplicationContext val appContext: Context
) : ViewModel() {


    var email = MutableLiveData<String>()
    var password = MutableLiveData<String>()


    var onSuccessRegister = MutableLiveData<Boolean>(false)
    var onErrorRegister = MutableLiveData<Exception>()
    var onErrorEnteredData = MutableLiveData<String>()

    private fun isValid() : Boolean {
        return !(email.value.isNullOrEmpty() || password.value.isNullOrEmpty())
    }
    fun onRegisterButtonClick() {
        println("onRegisterButtonClick")

        if(isValid()) {

            firebaseAuthRepository.register(email.value.toString(),
                password.value.toString(),{
                    onSuccessRegister.postValue(true)
                },
                {
                    onErrorRegister.postValue(it)
                })
        }
        else{
            onErrorEnteredData.postValue(appContext.getString(R.string.error_login_detail))
        }
    }

}