package com.nst.iptvsmarterstvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class TVArchiveFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TVArchiveFragment f29139b;

    public TVArchiveFragment_ViewBinding(TVArchiveFragment tVArchiveFragment, View view) {
        this.f29139b = tVArchiveFragment;
        tVArchiveFragment.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        tVArchiveFragment.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        tVArchiveFragment.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        tVArchiveFragment.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        tVArchiveFragment.tvEgpRequired = (TextView) c.c(view, R.id.tv_egp_required, "field 'tvEgpRequired'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        TVArchiveFragment tVArchiveFragment = this.f29139b;
        if (tVArchiveFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29139b = null;
        tVArchiveFragment.pbLoader = null;
        tVArchiveFragment.myRecyclerView = null;
        tVArchiveFragment.tvNoStream = null;
        tVArchiveFragment.tvNoRecordFound = null;
        tVArchiveFragment.tvEgpRequired = null;
    }
}
