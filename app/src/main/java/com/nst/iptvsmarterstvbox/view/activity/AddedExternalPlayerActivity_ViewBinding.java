package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class AddedExternalPlayerActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AddedExternalPlayerActivity f25303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f25304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f25305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f25306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f25307f;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AddedExternalPlayerActivity f25308d;

        public a(AddedExternalPlayerActivity addedExternalPlayerActivity) {
            this.f25308d = addedExternalPlayerActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25308d.onclick(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AddedExternalPlayerActivity f25310d;

        public b(AddedExternalPlayerActivity addedExternalPlayerActivity) {
            this.f25310d = addedExternalPlayerActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25310d.onclick(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AddedExternalPlayerActivity f25312d;

        public c(AddedExternalPlayerActivity addedExternalPlayerActivity) {
            this.f25312d = addedExternalPlayerActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25312d.onclick(view);
        }
    }

    public class d extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AddedExternalPlayerActivity f25314d;

        public d(AddedExternalPlayerActivity addedExternalPlayerActivity) {
            this.f25314d = addedExternalPlayerActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25314d.onclick(view);
        }
    }

    public AddedExternalPlayerActivity_ViewBinding(AddedExternalPlayerActivity addedExternalPlayerActivity, View view) {
        this.f25303b = addedExternalPlayerActivity;
        addedExternalPlayerActivity.ll_progressbar = (LinearLayout) b.c.c.c(view, R.id.ll_progressbar, "field 'll_progressbar'", LinearLayout.class);
        View viewB = b.c.c.b(view, R.id.ll_no_data_found, "field 'll_no_data_found' and method 'onclick'");
        addedExternalPlayerActivity.ll_no_data_found = (LinearLayout) b.c.c.a(viewB, R.id.ll_no_data_found, "field 'll_no_data_found'", LinearLayout.class);
        this.f25304c = viewB;
        viewB.setOnClickListener(new a(addedExternalPlayerActivity));
        addedExternalPlayerActivity.recyclerView = (RecyclerView) b.c.c.c(view, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        View viewB2 = b.c.c.b(view, R.id.ll_add_player, "field 'll_add_player' and method 'onclick'");
        addedExternalPlayerActivity.ll_add_player = (LinearLayout) b.c.c.a(viewB2, R.id.ll_add_player, "field 'll_add_player'", LinearLayout.class);
        this.f25305d = viewB2;
        viewB2.setOnClickListener(new b(addedExternalPlayerActivity));
        addedExternalPlayerActivity.logo = (ImageView) b.c.c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        View viewB3 = b.c.c.b(view, R.id.iv_add_player, "method 'onclick'");
        this.f25306e = viewB3;
        viewB3.setOnClickListener(new c(addedExternalPlayerActivity));
        View viewB4 = b.c.c.b(view, R.id.tv_add_player, "method 'onclick'");
        this.f25307f = viewB4;
        viewB4.setOnClickListener(new d(addedExternalPlayerActivity));
    }

    @Override // butterknife.Unbinder
    public void a() {
        AddedExternalPlayerActivity addedExternalPlayerActivity = this.f25303b;
        if (addedExternalPlayerActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25303b = null;
        addedExternalPlayerActivity.ll_progressbar = null;
        addedExternalPlayerActivity.ll_no_data_found = null;
        addedExternalPlayerActivity.recyclerView = null;
        addedExternalPlayerActivity.ll_add_player = null;
        addedExternalPlayerActivity.logo = null;
        this.f25304c.setOnClickListener(null);
        this.f25304c = null;
        this.f25305d.setOnClickListener(null);
        this.f25305d = null;
        this.f25306e.setOnClickListener(null);
        this.f25306e = null;
        this.f25307f.setOnClickListener(null);
        this.f25307f = null;
    }
}
