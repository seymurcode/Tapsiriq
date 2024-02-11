package com.booking.account.login;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\rH\u0002\u00a2\u0006\u0002\u0010\u0013J\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020!J\u0006\u0010%\u001a\u00020!J\u0012\u0010&\u001a\u00020!2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010/\u001a\u00020!H\u0016J\b\u00100\u001a\u00020!H\u0016J\u0006\u00101\u001a\u00020!J\u0006\u00102\u001a\u00020!J\u0006\u00103\u001a\u00020!R5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\rX\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00170\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\rX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u0019\u001a\u00020\rX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00064"}, d2 = {"Lcom/booking/account/login/LoginFragment;", "Landroidx/fragment/app/Fragment;", "()V", "PERMISSIONS", "", "", "kotlin.jvm.PlatformType", "", "getPERMISSIONS", "()Ljava/util/List;", "REQ_ONE_TAP", "", "auth", "error/NonExistentClass", "Lerror/NonExistentClass;", "binding", "getBinding", "()Lerror/NonExistentClass;", "setBinding", "(Lerror/NonExistentClass;)V", "callbackManager", "googleLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "mGoogleSignInClient", "signInRequest", "viewModel", "Lcom/booking/account/login/LoginViewModel;", "getViewModel", "()Lcom/booking/account/login/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "handleFacebookAccessToken", "", "token", "loginFacebook", "loginGoogle", "observeAll", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPause", "onResume", "openApp", "openRegisterPage", "removeAllObservers", "account_debug"})
public final class LoginFragment extends androidx.fragment.app.Fragment {
    public error.NonExistentClass binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private error.NonExistentClass callbackManager;
    private error.NonExistentClass auth;
    private error.NonExistentClass signInRequest;
    private final int REQ_ONE_TAP = 2;
    private error.NonExistentClass mGoogleSignInClient;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> googleLauncher = null;
    private final java.util.List<java.lang.String> PERMISSIONS = null;
    
    public LoginFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final error.NonExistentClass getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    error.NonExistentClass p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.booking.account.login.LoginViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void openApp() {
    }
    
    public final void openRegisterPage() {
    }
    
    public final void observeAll() {
    }
    
    public final void removeAllObservers() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    public final void loginGoogle() {
    }
    
    public final void loginFacebook() {
    }
    
    public final java.util.List<java.lang.String> getPERMISSIONS() {
        return null;
    }
    
    private final void handleFacebookAccessToken(error.NonExistentClass token) {
    }
}