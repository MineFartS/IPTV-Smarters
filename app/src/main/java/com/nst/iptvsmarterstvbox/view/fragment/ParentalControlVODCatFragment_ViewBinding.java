package minefarts.iptvsmarters.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlVODCatFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParentalControlVODCatFragment f29045b;

    public ParentalControlVODCatFragment_ViewBinding(ParentalControlVODCatFragment parentalControlVODCatFragment, View view) {
        this.f29045b = parentalControlVODCatFragment;
        parentalControlVODCatFragment.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        parentalControlVODCatFragment.emptyView = (TextView) c.c(view, R.id.empty_view, "field 'emptyView'", TextView.class);
        parentalControlVODCatFragment.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ParentalControlVODCatFragment parentalControlVODCatFragment = this.f29045b;
        if (parentalControlVODCatFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29045b = null;
        parentalControlVODCatFragment.myRecyclerView = null;
        parentalControlVODCatFragment.emptyView = null;
        parentalControlVODCatFragment.pbLoader = null;
    }
}
