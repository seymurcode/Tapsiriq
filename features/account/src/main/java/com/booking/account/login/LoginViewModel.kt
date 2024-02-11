package com.booking.account.login

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    val repository: NotesRepository,
    val firebaseRepository: FirebaseRepository, val firebaseAuthRepository: FirebaseAuthRepository,
    @ApplicationContext val appContext: Context
) : ViewModel() {


    var email = MutableLiveData<String>()
    var password = MutableLiveData<String>()


    var onSuccessLogin = MutableLiveData<Boolean>(false)
    var onErrorLogin = MutableLiveData<Exception>()
    var onErrorEnteredData = MutableLiveData<String>()
    var onRegisterClick = MutableLiveData<Boolean>(false)

    private fun isValid() : Boolean {
        return !(email.value.isNullOrEmpty() || password.value.isNullOrEmpty())
    }
    fun onLoginButtonClick() {
        println("onLoginButtonClick")

        if(isValid()) {

            firebaseAuthRepository.login(email.value.toString(),
                password.value.toString(),{
                    onSuccessLogin.postValue(true)
                },
                {
                    onErrorLogin.postValue(it)
                })
        }
        else{
            onErrorEnteredData.postValue(appContext.getString(R.string.error_login_detail))
        }
    }

    fun onRegisterButtonClick(){
        println("onRegisterButtonClick")
        onRegisterClick.postValue(true)
    }
}