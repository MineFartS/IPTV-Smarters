package minefarts.iptvsmarters.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlSeriesCatFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParentalControlSeriesCatFragment f29012b;

    public ParentalControlSeriesCatFragment_ViewBinding(ParentalControlSeriesCatFragment parentalControlSeriesCatFragment, View view) {
        this.f29012b = parentalControlSeriesCatFragment;
        parentalControlSeriesCatFragment.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        parentalControlSeriesCatFragment.emptyView = (TextView) c.c(view, R.id.empty_view, "field 'emptyView'", TextView.class);
        parentalControlSeriesCatFragment.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ParentalControlSeriesCatFragment parentalControlSeriesCatFragment = this.f29012b;
        if (parentalControlSeriesCatFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29012b = null;
        parentalControlSeriesCatFragment.myRecyclerView = null;
        parentalControlSeriesCatFragment.emptyView = null;
        parentalControlSeriesCatFragment.pbLoader = null;
    }
}
