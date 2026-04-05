package com.nst.iptvsmarterstvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesTabFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SeriesTabFragment f29097b;

    public SeriesTabFragment_ViewBinding(SeriesTabFragment seriesTabFragment, View view) {
        this.f29097b = seriesTabFragment;
        seriesTabFragment.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        seriesTabFragment.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        seriesTabFragment.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        seriesTabFragment.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SeriesTabFragment seriesTabFragment = this.f29097b;
        if (seriesTabFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29097b = null;
        seriesTabFragment.pbLoader = null;
        seriesTabFragment.myRecyclerView = null;
        seriesTabFragment.tvNoStream = null;
        seriesTabFragment.tvNoRecordFound = null;
    }
}
