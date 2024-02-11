package com.booking.hotels;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u001a\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/booking/hotels/HotelListFragment;", "Lcom/booking/common/base/BaseFragment;", "Lcom/booking/hotels/databinding/FragmentHotelListBinding;", "()V", "adapter", "Lcom/booking/hotels/HotelListAdapter;", "viewModel", "Lcom/booking/hotels/HotelListViewModel;", "getViewModel", "()Lcom/booking/hotels/HotelListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initRecylerAdapter", "", "mViewModel", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "hotels_debug"})
public final class HotelListFragment extends com.booking.common.base.BaseFragment<com.booking.hotels.databinding.FragmentHotelListBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.booking.hotels.HotelListAdapter adapter;
    
    public HotelListFragment() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.booking.hotels.HotelListViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.booking.hotels.HotelListViewModel mViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecylerAdapter() {
    }
}