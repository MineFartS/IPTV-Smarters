package com.nst.iptvsmarterstvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlRadioCategoriesFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParentalControlRadioCategoriesFragment f28992b;

    public ParentalControlRadioCategoriesFragment_ViewBinding(ParentalControlRadioCategoriesFragment parentalControlRadioCategoriesFragment, View view) {
        this.f28992b = parentalControlRadioCategoriesFragment;
        parentalControlRadioCategoriesFragment.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        parentalControlRadioCategoriesFragment.emptyView = (TextView) c.c(view, R.id.empty_view, "field 'emptyView'", TextView.class);
        parentalControlRadioCategoriesFragment.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ParentalControlRadioCategoriesFragment parentalControlRadioCategoriesFragment = this.f28992b;
        if (parentalControlRadioCategoriesFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f28992b = null;
        parentalControlRadioCategoriesFragment.myRecyclerView = null;
        parentalControlRadioCategoriesFragment.emptyView = null;
        parentalControlRadioCategoriesFragment.pbLoader = null;
    }
}
