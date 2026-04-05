package com.nst.iptvsmarterstvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlM3UFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParentalControlM3UFragment f28972b;

    public ParentalControlM3UFragment_ViewBinding(ParentalControlM3UFragment parentalControlM3UFragment, View view) {
        this.f28972b = parentalControlM3UFragment;
        parentalControlM3UFragment.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        parentalControlM3UFragment.emptyView = (TextView) c.c(view, R.id.empty_view, "field 'emptyView'", TextView.class);
        parentalControlM3UFragment.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ParentalControlM3UFragment parentalControlM3UFragment = this.f28972b;
        if (parentalControlM3UFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f28972b = null;
        parentalControlM3UFragment.myRecyclerView = null;
        parentalControlM3UFragment.emptyView = null;
        parentalControlM3UFragment.pbLoader = null;
    }
}
