package com.booking.flights.searchlist;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/booking/flights/searchlist/SearchListFragment;", "Lcom/booking/common/base/BaseFragment;", "Lcom/booking/flights/databinding/FragmentSearchListBinding;", "()V", "adapter", "Lcom/booking/flights/searchlist/SearchListAdapter;", "viewModel", "Lcom/booking/flights/searchlist/SearchListViewModel;", "getViewModel", "()Lcom/booking/flights/searchlist/SearchListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addbutton", "", "initRecylerAdapter", "mViewModel", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "flights_debug"})
public final class SearchListFragment extends com.booking.common.base.BaseFragment<com.booking.flights.databinding.FragmentSearchListBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.booking.flights.searchlist.SearchListAdapter adapter;
    
    public SearchListFragment() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.booking.flights.searchlist.SearchListViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.booking.flights.searchlist.SearchListViewModel mViewModel() {
        return null;
    }
    
    public final void addbutton() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecylerAdapter() {
    }
}