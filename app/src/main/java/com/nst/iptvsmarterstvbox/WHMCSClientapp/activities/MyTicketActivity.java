package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a.b.k.c;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.e.e.h;
import com.github.ybq.android.spinkit.SpinKitView;
import com.nst.iptvsmarterstvbox.R;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import o.d;
import o.l;

/* JADX INFO: loaded from: classes2.dex */
public class MyTicketActivity extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f24785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24786e = false;

    @BindView
    public ImageView iv_fab;

    @BindView
    public LinearLayout llFloatingButton;

    @BindView
    public LinearLayout llRecycleview;

    @BindView
    public SpinKitView progress;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public TextView tvNoSupportTicket;

    public class a implements d<h> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<h> bVar, Throwable th) {
            Toast.makeText(MyTicketActivity.this, "Network error occured! Please try again", 0).show();
            MyTicketActivity.this.z0(Boolean.FALSE);
        }

        @Override // o.d
        public void b(o.b<h> bVar, l<h> lVar) {
            if (lVar.a() != null && lVar.d() && lVar.a() != null && lVar.a().a().equalsIgnoreCase("success")) {
                MyTicketActivity.this.z0(Boolean.TRUE);
                if (lVar.a().b() != null) {
                    lVar.a().b();
                    throw null;
                }
            }
            MyTicketActivity.this.z0(Boolean.FALSE);
        }
    }

    public class b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f24788b;

        public b(View view) {
            this.f24788b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24788b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24788b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24788b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            if (!z) {
                if (z || !this.f24788b.getTag().equals("7")) {
                    return;
                }
                f2 = z ? 1.25f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                return;
            }
            Log.e("id is", BuildConfig.FLAVOR + this.f24788b.getTag());
            if (this.f24788b.getTag().equals("7")) {
                f2 = z ? 1.25f : 1.0f;
                b(f2);
                c(f2);
            }
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_my_ticket);
        ButterKnife.a(this);
        this.f24785d = this;
        ImageView imageView = this.iv_fab;
        imageView.setOnFocusChangeListener(new b(imageView));
        String action = getIntent().getAction();
        if (action == null || !action.equalsIgnoreCase("updateticket") || this.f24786e) {
            return;
        }
        y0();
        this.f24786e = true;
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f24786e) {
            return;
        }
        y0();
        this.f24786e = true;
    }

    @OnClick
    public void onViewClicked() {
        startActivity(new Intent(this, (Class<?>) OpenTicketActivity.class));
    }

    public final void y0() {
        ((c.h.a.e.d.a) c.h.a.e.d.b.a().d(c.h.a.e.d.a.class)).b("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetTickets", "no", c.h.a.e.b.a.a(this.f24785d)).x(new a());
    }

    public void z0(Boolean bool) {
        if (bool.booleanValue()) {
            this.recyclerView.setVisibility(0);
        } else {
            this.tvNoSupportTicket.setVisibility(0);
        }
        this.progress.setVisibility(8);
    }
}
