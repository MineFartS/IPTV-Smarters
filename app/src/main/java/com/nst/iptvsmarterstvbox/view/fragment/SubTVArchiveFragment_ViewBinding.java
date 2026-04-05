package com.nst.iptvsmarterstvbox.view.fragment;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class SubTVArchiveFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SubTVArchiveFragment f29113b;

    public SubTVArchiveFragment_ViewBinding(SubTVArchiveFragment subTVArchiveFragment, View view) {
        this.f29113b = subTVArchiveFragment;
        subTVArchiveFragment.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        subTVArchiveFragment.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        subTVArchiveFragment.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SubTVArchiveFragment subTVArchiveFragment = this.f29113b;
        if (subTVArchiveFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29113b = null;
        subTVArchiveFragment.myRecyclerView = null;
        subTVArchiveFragment.tvNoStream = null;
        subTVArchiveFragment.tvNoRecordFound = null;
    }
}
