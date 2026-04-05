package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class ViewTicketActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTicketActivity f24908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f24909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f24910d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ViewTicketActivity f24911d;

        public a(ViewTicketActivity viewTicketActivity) {
            this.f24911d = viewTicketActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24911d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ViewTicketActivity f24913d;

        public b(ViewTicketActivity viewTicketActivity) {
            this.f24913d = viewTicketActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24913d.onViewClicked(view);
        }
    }

    public ViewTicketActivity_ViewBinding(ViewTicketActivity viewTicketActivity, View view) {
        this.f24908b = viewTicketActivity;
        viewTicketActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        viewTicketActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        viewTicketActivity.recyclerView = (RecyclerView) c.c(view, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        viewTicketActivity.textNotFound = (TextView) c.c(view, R.id.text_not_found, "field 'textNotFound'", TextView.class);
        View viewB = c.b(view, R.id.bt_reply, "field 'btReply' and method 'onViewClicked'");
        viewTicketActivity.btReply = (Button) c.a(viewB, R.id.bt_reply, "field 'btReply'", Button.class);
        this.f24909c = viewB;
        viewB.setOnClickListener(new a(viewTicketActivity));
        View viewB2 = c.b(view, R.id.bt_cancel_reply, "field 'bt_cancel_reply' and method 'onViewClicked'");
        viewTicketActivity.bt_cancel_reply = (Button) c.a(viewB2, R.id.bt_cancel_reply, "field 'bt_cancel_reply'", Button.class);
        this.f24910d = viewB2;
        viewB2.setOnClickListener(new b(viewTicketActivity));
        viewTicketActivity.progress = (SpinKitView) c.c(view, R.id.progress, "field 'progress'", SpinKitView.class);
        viewTicketActivity.tv_title = (TextView) c.c(view, R.id.tv_title, "field 'tv_title'", TextView.class);
        viewTicketActivity.ll_replay = (LinearLayout) c.c(view, R.id.ll_replay, "field 'll_replay'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ViewTicketActivity viewTicketActivity = this.f24908b;
        if (viewTicketActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24908b = null;
        viewTicketActivity.time = null;
        viewTicketActivity.date = null;
        viewTicketActivity.recyclerView = null;
        viewTicketActivity.textNotFound = null;
        viewTicketActivity.btReply = null;
        viewTicketActivity.bt_cancel_reply = null;
        viewTicketActivity.progress = null;
        viewTicketActivity.tv_title = null;
        viewTicketActivity.ll_replay = null;
        this.f24909c.setOnClickListener(null);
        this.f24909c = null;
        this.f24910d.setOnClickListener(null);
        this.f24910d = null;
    }
}
