package com.nst.iptvsmarterstvbox.vpn.activities;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ProfileActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ProfileActivity f29952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f29953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f29954d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ProfileActivity f29955d;

        public a(ProfileActivity profileActivity) {
            this.f29955d = profileActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f29955d.onclick(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ProfileActivity f29957d;

        public b(ProfileActivity profileActivity) {
            this.f29957d = profileActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f29957d.onclick(view);
        }
    }

    public ProfileActivity_ViewBinding(ProfileActivity profileActivity, View view) {
        this.f29952b = profileActivity;
        View viewB = c.b(view, R.id.ll_add_new_profile, "field 'll_add_new_profile' and method 'onclick'");
        profileActivity.ll_add_new_profile = (LinearLayout) c.a(viewB, R.id.ll_add_new_profile, "field 'll_add_new_profile'", LinearLayout.class);
        this.f29953c = viewB;
        viewB.setOnClickListener(new a(profileActivity));
        View viewB2 = c.b(view, R.id.ll_add_profile, "field 'll_add_profile' and method 'onclick'");
        profileActivity.ll_add_profile = (LinearLayout) c.a(viewB2, R.id.ll_add_profile, "field 'll_add_profile'", LinearLayout.class);
        this.f29954d = viewB2;
        viewB2.setOnClickListener(new b(profileActivity));
        profileActivity.progressBar = (ProgressBar) c.c(view, R.id.progressBar, "field 'progressBar'", ProgressBar.class);
        profileActivity.recyclerView = (RecyclerView) c.c(view, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        profileActivity.rl_bottom_message = (RelativeLayout) c.c(view, R.id.rl_bottom_message, "field 'rl_bottom_message'", RelativeLayout.class);
        profileActivity.tv_no_server_found = (TextView) c.c(view, R.id.tv_no_server_found, "field 'tv_no_server_found'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ProfileActivity profileActivity = this.f29952b;
        if (profileActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29952b = null;
        profileActivity.ll_add_new_profile = null;
        profileActivity.ll_add_profile = null;
        profileActivity.progressBar = null;
        profileActivity.recyclerView = null;
        profileActivity.rl_bottom_message = null;
        profileActivity.tv_no_server_found = null;
        this.f29953c.setOnClickListener(null);
        this.f29953c = null;
        this.f29954d.setOnClickListener(null);
        this.f29954d = null;
    }
}
