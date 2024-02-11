package com.booking.account.register;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010%\u001a\u00020\u001eH\u0002J\u0006\u0010&\u001a\u00020\'R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R \u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b$\u0010\u0013\u00a8\u0006("}, d2 = {"Lcom/booking/account/register/RegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "error/NonExistentClass", "firebaseRepository", "firebaseAuthRepository", "appContext", "Landroid/content/Context;", "(Lerror/NonExistentClass;Lerror/NonExistentClass;Lerror/NonExistentClass;Landroid/content/Context;)V", "getAppContext", "()Landroid/content/Context;", "email", "Landroidx/lifecycle/MutableLiveData;", "", "getEmail", "()Landroidx/lifecycle/MutableLiveData;", "setEmail", "(Landroidx/lifecycle/MutableLiveData;)V", "getFirebaseAuthRepository", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "getFirebaseRepository", "onErrorEnteredData", "getOnErrorEnteredData", "setOnErrorEnteredData", "onErrorRegister", "Ljava/lang/Exception;", "getOnErrorRegister", "setOnErrorRegister", "onSuccessRegister", "", "getOnSuccessRegister", "setOnSuccessRegister", "password", "getPassword", "setPassword", "getRepository", "isValid", "onRegisterButtonClick", "", "account_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class RegisterViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final error.NonExistentClass repository = null;
    @org.jetbrains.annotations.NotNull
    private final error.NonExistentClass firebaseRepository = null;
    @org.jetbrains.annotations.NotNull
    private final error.NonExistentClass firebaseAuthRepository = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context appContext = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> email;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> password;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> onSuccessRegister;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Exception> onErrorRegister;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> onErrorEnteredData;
    
    @javax.inject.Inject
    public RegisterViewModel(@org.jetbrains.annotations.NotNull
    error.NonExistentClass repository, @org.jetbrains.annotations.NotNull
    error.NonExistentClass firebaseRepository, @org.jetbrains.annotations.NotNull
    error.NonExistentClass firebaseAuthRepository, @dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context appContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final error.NonExistentClass getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final error.NonExistentClass getFirebaseRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final error.NonExistentClass getFirebaseAuthRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getAppContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOnSuccessRegister() {
        return null;
    }
    
    public final void setOnSuccessRegister(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Exception> getOnErrorRegister() {
        return null;
    }
    
    public final void setOnErrorRegister(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Exception> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOnErrorEnteredData() {
        return null;
    }
    
    public final void setOnErrorEnteredData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    private final boolean isValid() {
        return false;
    }
    
    public final void onRegisterButtonClick() {
    }
}