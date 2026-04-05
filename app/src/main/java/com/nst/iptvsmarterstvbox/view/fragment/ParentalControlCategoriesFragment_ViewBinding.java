package minefarts.iptvsmarters.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlCategoriesFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParentalControlCategoriesFragment f28952b;

    public ParentalControlCategoriesFragment_ViewBinding(ParentalControlCategoriesFragment parentalControlCategoriesFragment, View view) {
        this.f28952b = parentalControlCategoriesFragment;
        parentalControlCategoriesFragment.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        parentalControlCategoriesFragment.emptyView = (TextView) c.c(view, R.id.empty_view, "field 'emptyView'", TextView.class);
        parentalControlCategoriesFragment.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ParentalControlCategoriesFragment parentalControlCategoriesFragment = this.f28952b;
        if (parentalControlCategoriesFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f28952b = null;
        parentalControlCategoriesFragment.myRecyclerView = null;
        parentalControlCategoriesFragment.emptyView = null;
        parentalControlCategoriesFragment.pbLoader = null;
    }
}
