package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class MultiUserActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MultiUserActivity f25892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f25893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f25894d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MultiUserActivity f25895d;

        public a(MultiUserActivity multiUserActivity) {
            this.f25895d = multiUserActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25895d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MultiUserActivity f25897d;

        public b(MultiUserActivity multiUserActivity) {
            this.f25897d = multiUserActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25897d.onViewClicked(view);
        }
    }

    public MultiUserActivity_ViewBinding(MultiUserActivity multiUserActivity, View view) {
        this.f25892b = multiUserActivity;
        multiUserActivity.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        multiUserActivity.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        multiUserActivity.emptyView = (TextView) c.c(view, R.id.empty_view, "field 'emptyView'", TextView.class);
        multiUserActivity.frameLayout = (FrameLayout) c.c(view, R.id.fl_frame, "field 'frameLayout'", FrameLayout.class);
        multiUserActivity.ivBTUP = (ImageView) c.c(view, R.id.iv_bt_up, "field 'ivBTUP'", ImageView.class);
        multiUserActivity.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        multiUserActivity.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        multiUserActivity.addmore = (ImageView) c.c(view, R.id.iv_add_more, "field 'addmore'", ImageView.class);
        View viewB = c.b(view, R.id.ll_add_user, "field 'll_add_user' and method 'onViewClicked'");
        multiUserActivity.ll_add_user = (LinearLayout) c.a(viewB, R.id.ll_add_user, "field 'll_add_user'", LinearLayout.class);
        this.f25893c = viewB;
        viewB.setOnClickListener(new a(multiUserActivity));
        View viewB2 = c.b(view, R.id.ll_add_new_user, "field 'll_add_new_user' and method 'onViewClicked'");
        multiUserActivity.ll_add_new_user = (LinearLayout) c.a(viewB2, R.id.ll_add_new_user, "field 'll_add_new_user'", LinearLayout.class);
        this.f25894d = viewB2;
        viewB2.setOnClickListener(new b(multiUserActivity));
        multiUserActivity.tv_list_options = (TextView) c.c(view, R.id.tv_list_options, "field 'tv_list_options'", TextView.class);
        multiUserActivity.tv_link2 = (TextView) c.c(view, R.id.tv_link2, "field 'tv_link2'", TextView.class);
        multiUserActivity.ll_termsandservices = (LinearLayout) c.c(view, R.id.ll_termsandservices, "field 'll_termsandservices'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        MultiUserActivity multiUserActivity = this.f25892b;
        if (multiUserActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25892b = null;
        multiUserActivity.pbLoader = null;
        multiUserActivity.myRecyclerView = null;
        multiUserActivity.emptyView = null;
        multiUserActivity.frameLayout = null;
        multiUserActivity.ivBTUP = null;
        multiUserActivity.tvNoStream = null;
        multiUserActivity.tvNoRecordFound = null;
        multiUserActivity.addmore = null;
        multiUserActivity.ll_add_user = null;
        multiUserActivity.ll_add_new_user = null;
        multiUserActivity.tv_list_options = null;
        multiUserActivity.tv_link2 = null;
        multiUserActivity.ll_termsandservices = null;
        this.f25893c.setOnClickListener(null);
        this.f25893c = null;
        this.f25894d.setOnClickListener(null);
        this.f25894d = null;
    }
}
