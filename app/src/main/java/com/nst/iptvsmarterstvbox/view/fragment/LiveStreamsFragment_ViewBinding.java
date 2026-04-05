package minefarts.iptvsmarters.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class LiveStreamsFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LiveStreamsFragment f28895b;

    public LiveStreamsFragment_ViewBinding(LiveStreamsFragment liveStreamsFragment, View view) {
        this.f28895b = liveStreamsFragment;
        liveStreamsFragment.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        liveStreamsFragment.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        liveStreamsFragment.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        liveStreamsFragment.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        LiveStreamsFragment liveStreamsFragment = this.f28895b;
        if (liveStreamsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f28895b = null;
        liveStreamsFragment.pbLoader = null;
        liveStreamsFragment.myRecyclerView = null;
        liveStreamsFragment.tvNoStream = null;
        liveStreamsFragment.tvNoRecordFound = null;
    }
}
