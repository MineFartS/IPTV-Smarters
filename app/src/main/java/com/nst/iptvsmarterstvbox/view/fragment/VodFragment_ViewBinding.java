package com.nst.iptvsmarterstvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class VodFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VodFragment f29166b;

    public VodFragment_ViewBinding(VodFragment vodFragment, View view) {
        this.f29166b = vodFragment;
        vodFragment.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        vodFragment.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        vodFragment.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        vodFragment.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        vodFragment.tvViewProvider = (TextView) c.c(view, R.id.tv_view_provider, "field 'tvViewProvider'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        VodFragment vodFragment = this.f29166b;
        if (vodFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29166b = null;
        vodFragment.pbLoader = null;
        vodFragment.myRecyclerView = null;
        vodFragment.tvNoStream = null;
        vodFragment.tvNoRecordFound = null;
        vodFragment.tvViewProvider = null;
    }
}
