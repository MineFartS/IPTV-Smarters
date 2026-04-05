package com.nst.iptvsmarterstvbox.view.adapter;

import a.b.q.j0;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.i.q.m;
import c.k.b.t;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.view.activity.ViewDetailsActivity;
import com.nst.iptvsmarterstvbox.view.activity.ViewDetailsTMDBActivity;
import com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class VodAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f28345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f28346f;
    public int A = 0;
    public DateFormat B;
    public Boolean C;
    public ArrayList<ExternalPlayerModelClass> D;
    public VodActivityNewFlowSubCategories E;
    public String F;
    public boolean G;
    public c.f.a.c.d.u.d H;
    public int I;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f28347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<c.h.a.i.f> f28348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f28349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<c.h.a.i.f> f28350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f28351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<c.h.a.i.f> f28352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.a f28353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.i.q.f f28354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f28355o;
    public c.h.a.i.q.k p;
    public SimpleDateFormat q;
    public SharedPreferences r;
    public SharedPreferences.Editor s;
    public SharedPreferences t;
    public SharedPreferences.Editor u;
    public int v;
    public int w;
    public Boolean x;
    public Date y;
    public Handler z;

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView MovieName;

        @BindView
        public CardView cardView;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public ImageView recentWatchIV;

        @BindView
        public TextView tvStreamOptions;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f28356b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f28356b = myViewHolder;
            myViewHolder.MovieName = (TextView) b.c.c.c(view, R.id.tv_series_name, "field 'MovieName'", TextView.class);
            myViewHolder.Movie = (RelativeLayout) b.c.c.c(view, R.id.rl_movie, "field 'Movie'", RelativeLayout.class);
            myViewHolder.MovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'MovieImage'", ImageView.class);
            myViewHolder.cardView = (CardView) b.c.c.c(view, R.id.card_view, "field 'cardView'", CardView.class);
            myViewHolder.tvStreamOptions = (TextView) b.c.c.c(view, R.id.tv_streamOptions, "field 'tvStreamOptions'", TextView.class);
            myViewHolder.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
            myViewHolder.llMenu = (LinearLayout) b.c.c.c(view, R.id.ll_menu, "field 'llMenu'", LinearLayout.class);
            myViewHolder.recentWatchIV = (ImageView) b.c.c.c(view, R.id.iv_recent_watch, "field 'recentWatchIV'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f28356b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f28356b = null;
            myViewHolder.MovieName = null;
            myViewHolder.Movie = null;
            myViewHolder.MovieImage = null;
            myViewHolder.cardView = null;
            myViewHolder.tvStreamOptions = null;
            myViewHolder.ivFavourite = null;
            myViewHolder.llMenu = null;
            myViewHolder.recentWatchIV = null;
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f28358c;

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.adapter.VodAdapter$a$a, reason: collision with other inner class name */
        public class RunnableC0288a implements Runnable {
            public RunnableC0288a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r2 = this;
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter$a r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.a.this
                    java.lang.String r0 = r0.f28357b
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L16
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter$a r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.a.this
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this
                    java.util.List r1 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.c0(r0)
                L12:
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.g0(r0, r1)
                    goto L3b
                L16:
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter$a r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.a.this
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this
                    java.util.List r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.q0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L32
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter$a r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.a.this
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this
                    java.util.List r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.q0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L3b
                L32:
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter$a r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.a.this
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this
                    java.util.List r1 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.q0(r0)
                    goto L12
                L3b:
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter$a r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.a.this
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this
                    java.util.List r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.e0(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L51
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter$a r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.a.this
                    android.widget.TextView r0 = r0.f28358c
                    r1 = 0
                    r0.setVisibility(r1)
                L51:
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter$a r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.a.this
                    com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this
                    int r1 = r0.w
                    r0.v = r1
                    r0.w()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.a.RunnableC0288a.run():void");
            }
        }

        public a(String str, TextView textView) {
            this.f28357b = str;
            this.f28358c = textView;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:2:0x0000, B:4:0x001c, B:5:0x0025, B:7:0x002d, B:21:0x0094, B:8:0x003d, B:10:0x0049, B:13:0x005a, B:14:0x0064, B:16:0x006a, B:18:0x0076, B:20:0x008a, B:12:0x0051), top: B:24:0x0000 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this     // Catch: java.lang.Exception -> La4
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> La4
                r1.<init>()     // Catch: java.lang.Exception -> La4
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.r0(r0, r1)     // Catch: java.lang.Exception -> La4
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this     // Catch: java.lang.Exception -> La4
                java.lang.String r1 = r4.f28357b     // Catch: java.lang.Exception -> La4
                int r1 = r1.length()     // Catch: java.lang.Exception -> La4
                r0.w = r1     // Catch: java.lang.Exception -> La4
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this     // Catch: java.lang.Exception -> La4
                java.util.List r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.q0(r0)     // Catch: java.lang.Exception -> La4
                if (r0 == 0) goto L25
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this     // Catch: java.lang.Exception -> La4
                java.util.List r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.q0(r0)     // Catch: java.lang.Exception -> La4
                r0.clear()     // Catch: java.lang.Exception -> La4
            L25:
                java.lang.String r0 = r4.f28357b     // Catch: java.lang.Exception -> La4
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> La4
                if (r0 == 0) goto L3d
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this     // Catch: java.lang.Exception -> La4
                java.util.List r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.q0(r0)     // Catch: java.lang.Exception -> La4
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r1 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this     // Catch: java.lang.Exception -> La4
                java.util.List r1 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.c0(r1)     // Catch: java.lang.Exception -> La4
                r0.addAll(r1)     // Catch: java.lang.Exception -> La4
                goto L94
            L3d:
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this     // Catch: java.lang.Exception -> La4
                java.util.List r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.e0(r0)     // Catch: java.lang.Exception -> La4
                int r0 = r0.size()     // Catch: java.lang.Exception -> La4
                if (r0 == 0) goto L51
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this     // Catch: java.lang.Exception -> La4
                int r1 = r0.v     // Catch: java.lang.Exception -> La4
                int r0 = r0.w     // Catch: java.lang.Exception -> La4
                if (r1 <= r0) goto L5a
            L51:
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this     // Catch: java.lang.Exception -> La4
                java.util.List r1 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.c0(r0)     // Catch: java.lang.Exception -> La4
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.g0(r0, r1)     // Catch: java.lang.Exception -> La4
            L5a:
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this     // Catch: java.lang.Exception -> La4
                java.util.List r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.e0(r0)     // Catch: java.lang.Exception -> La4
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> La4
            L64:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> La4
                if (r1 == 0) goto L94
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> La4
                c.h.a.i.f r1 = (c.h.a.i.f) r1     // Catch: java.lang.Exception -> La4
                java.lang.String r2 = r1.getName()     // Catch: java.lang.Exception -> La4
                if (r2 == 0) goto L64
                java.lang.String r2 = r1.getName()     // Catch: java.lang.Exception -> La4
                java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Exception -> La4
                java.lang.String r3 = r4.f28357b     // Catch: java.lang.Exception -> La4
                java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> La4
                boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> La4
                if (r2 == 0) goto L64
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r2 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this     // Catch: java.lang.Exception -> La4
                java.util.List r2 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.q0(r2)     // Catch: java.lang.Exception -> La4
                r2.add(r1)     // Catch: java.lang.Exception -> La4
                goto L64
            L94:
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.this     // Catch: java.lang.Exception -> La4
                android.content.Context r0 = com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.Z(r0)     // Catch: java.lang.Exception -> La4
                android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Exception -> La4
                com.nst.iptvsmarterstvbox.view.adapter.VodAdapter$a$a r1 = new com.nst.iptvsmarterstvbox.view.adapter.VodAdapter$a$a     // Catch: java.lang.Exception -> La4
                r1.<init>()     // Catch: java.lang.Exception -> La4
                r0.runOnUiThread(r1)     // Catch: java.lang.Exception -> La4
            La4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.a.run():void");
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28365f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28366g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28367h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28368i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28369j;

        public b(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f28361b = i2;
            this.f28362c = str;
            this.f28363d = str2;
            this.f28364e = str3;
            this.f28365f = str4;
            this.f28366g = str5;
            this.f28367h = str6;
            this.f28368i = str7;
            this.f28369j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodAdapter.this.z0(this.f28361b, this.f28362c, this.f28363d, this.f28364e, this.f28365f, this.f28366g, this.f28367h, this.f28368i, this.f28369j);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28375f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28376g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28377h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28378i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28379j;

        public c(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f28371b = i2;
            this.f28372c = str;
            this.f28373d = str2;
            this.f28374e = str3;
            this.f28375f = str4;
            this.f28376g = str5;
            this.f28377h = str6;
            this.f28378i = str7;
            this.f28379j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodAdapter.this.z0(this.f28371b, this.f28372c, this.f28373d, this.f28374e, this.f28375f, this.f28376g, this.f28377h, this.f28378i, this.f28379j);
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28386g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28387h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28388i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28389j;

        public d(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f28381b = i2;
            this.f28382c = str;
            this.f28383d = str2;
            this.f28384e = str3;
            this.f28385f = str4;
            this.f28386g = str5;
            this.f28387h = str6;
            this.f28388i = str7;
            this.f28389j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodAdapter.this.z0(this.f28381b, this.f28382c, this.f28383d, this.f28384e, this.f28385f, this.f28386g, this.f28387h, this.f28388i, this.f28389j);
        }
    }

    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28396g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28397h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28398i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28399j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f28400k;

        public e(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f28391b = myViewHolder;
            this.f28392c = i2;
            this.f28393d = str;
            this.f28394e = str2;
            this.f28395f = str3;
            this.f28396g = str4;
            this.f28397h = str5;
            this.f28398i = str6;
            this.f28399j = str7;
            this.f28400k = str8;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (m.f(VodAdapter.this.f28347g).equals("m3u")) {
                VodAdapter.this.y0(this.f28391b, this.f28392c, this.f28393d, this.f28394e, this.f28395f, this.f28396g, this.f28397h, this.f28398i, this.f28399j, this.f28400k);
                return true;
            }
            VodAdapter.this.x0(this.f28391b, this.f28392c, this.f28393d, this.f28394e, this.f28395f, this.f28396g, this.f28397h, this.f28398i, this.f28399j);
            return true;
        }
    }

    public class f implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28407g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28408h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28409i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28410j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f28411k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f28412l;

        public f(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3) {
            this.f28402b = myViewHolder;
            this.f28403c = i2;
            this.f28404d = str;
            this.f28405e = str2;
            this.f28406f = str3;
            this.f28407g = str4;
            this.f28408h = str5;
            this.f28409i = str6;
            this.f28410j = str7;
            this.f28411k = str8;
            this.f28412l = i3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (m.f(VodAdapter.this.f28347g).equals("m3u")) {
                VodAdapter.this.y0(this.f28402b, this.f28403c, this.f28404d, this.f28405e, this.f28406f, this.f28407g, this.f28408h, this.f28409i, this.f28410j, this.f28411k);
                return true;
            }
            VodAdapter.this.x0(this.f28402b, this.f28412l, this.f28404d, this.f28405e, this.f28406f, this.f28407g, this.f28408h, this.f28409i, this.f28410j);
            return true;
        }
    }

    public class g implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28419g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28420h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28421i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28422j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f28423k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f28424l;

        public g(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3) {
            this.f28414b = myViewHolder;
            this.f28415c = i2;
            this.f28416d = str;
            this.f28417e = str2;
            this.f28418f = str3;
            this.f28419g = str4;
            this.f28420h = str5;
            this.f28421i = str6;
            this.f28422j = str7;
            this.f28423k = str8;
            this.f28424l = i3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (m.f(VodAdapter.this.f28347g).equals("m3u")) {
                VodAdapter.this.y0(this.f28414b, this.f28415c, this.f28416d, this.f28417e, this.f28418f, this.f28419g, this.f28420h, this.f28421i, this.f28422j, this.f28423k);
                return true;
            }
            VodAdapter.this.x0(this.f28414b, this.f28424l, this.f28416d, this.f28417e, this.f28418f, this.f28419g, this.f28420h, this.f28421i, this.f28422j);
            return true;
        }
    }

    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28430f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28431g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28432h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28433i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28434j;

        public h(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f28426b = myViewHolder;
            this.f28427c = i2;
            this.f28428d = str;
            this.f28429e = str2;
            this.f28430f = str3;
            this.f28431g = str4;
            this.f28432h = str5;
            this.f28433i = str6;
            this.f28434j = str7;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodAdapter.this.x0(this.f28426b, this.f28427c, this.f28428d, this.f28429e, this.f28430f, this.f28431g, this.f28432h, this.f28433i, this.f28434j);
        }
    }

    public class i implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28442g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28443h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28444i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28445j;

        public i(String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, MyViewHolder myViewHolder) {
            this.f28436a = str;
            this.f28437b = i2;
            this.f28438c = str2;
            this.f28439d = str3;
            this.f28440e = str4;
            this.f28441f = str5;
            this.f28442g = str6;
            this.f28443h = str7;
            this.f28444i = str8;
            this.f28445j = myViewHolder;
        }

        public final void a() {
            c.h.a.i.c cVar = new c.h.a.i.c();
            cVar.h(this.f28436a);
            cVar.i(m.z(VodAdapter.this.f28347g));
            cVar.g(this.f28438c);
            cVar.e(this.f28442g);
            VodAdapter.this.f28354n.Q(cVar);
            this.f28445j.ivFavourite.setVisibility(0);
        }

        public final void b() {
            c.h.a.h.n.e.W(VodAdapter.this.f28347g, this.f28439d, this.f28437b, this.f28440e, this.f28441f, this.f28443h, this.f28438c, this.f28436a, 0);
        }

        public final void c() {
            VodAdapter vodAdapter = VodAdapter.this;
            vodAdapter.f28354n.I0(this.f28436a, m.z(vodAdapter.f28347g));
            this.f28445j.ivFavourite.setVisibility(4);
        }

        public final void d(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            if (VodAdapter.this.f28347g == null) {
                Log.e("Null hai context", ">>>>>>>>>>>True its Null");
                return;
            }
            Intent intent = new Intent(VodAdapter.this.f28347g, (Class<?>) ViewDetailsTMDBActivity.class);
            intent.putExtra(c.h.a.h.n.a.y, String.valueOf(i2));
            intent.putExtra("movie", str);
            intent.putExtra("movie_icon", str7);
            intent.putExtra("selectedPlayer", str2);
            intent.putExtra("streamType", str3);
            intent.putExtra("containerExtension", str4);
            intent.putExtra("categoryID", str5);
            intent.putExtra("num", str6);
            intent.putExtra("videoURL", str8);
            VodAdapter.this.f28347g.startActivity(intent);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            r1 = new android.content.Intent(r11.f28446k.f28347g, (java.lang.Class<?>) com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity.class);
            r1.putExtra("url", r11.f28436a);
            r1.putExtra("app_name", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r11.f28446k.D.get(r0)).a());
            r1.putExtra("packagename", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r11.f28446k.D.get(r0)).b());
            r11.f28446k.f28347g.startActivity(r1);
         */
        @Override // a.b.q.j0.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onMenuItemClick(android.view.MenuItem r12) {
            /*
                Method dump skipped, instruction units count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.i.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    public class j implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f28447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28453g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28454h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28455i;

        public j(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, MyViewHolder myViewHolder) {
            this.f28447a = i2;
            this.f28448b = str;
            this.f28449c = str2;
            this.f28450d = str3;
            this.f28451e = str4;
            this.f28452f = str5;
            this.f28453g = str6;
            this.f28454h = str7;
            this.f28455i = myViewHolder;
        }

        public final void a() {
            c.h.a.i.b bVar = new c.h.a.i.b();
            bVar.h(this.f28452f);
            bVar.m(this.f28447a);
            bVar.k(this.f28449c);
            bVar.l(this.f28453g);
            bVar.o(m.z(VodAdapter.this.f28347g));
            VodAdapter.this.f28353m.i(bVar, "vod");
            this.f28455i.ivFavourite.setVisibility(0);
        }

        public final void b() {
            c.h.a.h.n.e.W(VodAdapter.this.f28347g, this.f28450d, this.f28447a, this.f28451e, this.f28448b, this.f28453g, this.f28449c, BuildConfig.FLAVOR, 0);
        }

        public final void c() {
            VodAdapter vodAdapter = VodAdapter.this;
            vodAdapter.f28353m.o(this.f28447a, this.f28452f, "vod", this.f28449c, m.z(vodAdapter.f28347g));
            this.f28455i.ivFavourite.setVisibility(4);
        }

        public final void d(int i2, String str, String str2, String str3, String str4, String str5, String str6) {
            if (VodAdapter.this.f28347g != null) {
                Intent intent = new Intent(VodAdapter.this.f28347g, (Class<?>) ViewDetailsActivity.class);
                intent.putExtra(c.h.a.h.n.a.y, String.valueOf(i2));
                intent.putExtra("movie", str);
                intent.putExtra("selectedPlayer", str2);
                intent.putExtra("streamType", str3);
                intent.putExtra("containerExtension", str4);
                intent.putExtra("categoryID", str5);
                intent.putExtra("num", str6);
                VodAdapter.this.f28347g.startActivity(intent);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            r3 = c.h.a.h.n.e.F(r13.f28456j.f28347g, r13.f28447a, r13.f28448b, "movie");
            r4 = new android.content.Intent(r13.f28456j.f28347g, (java.lang.Class<?>) com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity.class);
            r4.putExtra("url", r3);
            r4.putExtra("app_name", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r13.f28456j.D.get(r2)).a());
            r4.putExtra("packagename", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r13.f28456j.D.get(r2)).b());
            r13.f28456j.f28347g.startActivity(r4);
         */
        @Override // a.b.q.j0.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onMenuItemClick(android.view.MenuItem r14) {
            /*
                Method dump skipped, instruction units count: 380
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.adapter.VodAdapter.j.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f28457b;

        public k(View view) {
            this.f28457b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28457b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28457b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28457b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            int i2;
            if (!z) {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                a(z);
                if ((this.f28457b.getTag() == null || !this.f28457b.getTag().equals("1")) && (this.f28457b.getTag() == null || !this.f28457b.getTag().equals("2"))) {
                    b(f2);
                    c(f2);
                    return;
                } else {
                    b(f2);
                    c(f2);
                    this.f28457b.setBackgroundResource(R.drawable.black_button_dark);
                    return;
                }
            }
            f2 = z ? 1.1f : 1.0f;
            Log.e("id is", BuildConfig.FLAVOR + this.f28457b.getTag());
            if (this.f28457b.getTag() != null && this.f28457b.getTag().equals("1")) {
                b(f2);
                view2 = this.f28457b;
                i2 = R.drawable.back_btn_effect;
            } else if (this.f28457b.getTag() == null || !this.f28457b.getTag().equals("2")) {
                b(f2);
                return;
            } else {
                b(f2);
                view2 = this.f28457b;
                i2 = R.drawable.logout_btn_effect;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public VodAdapter(List<c.h.a.i.f> list, Context context, boolean z) {
        String str;
        String str2;
        this.x = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        this.C = bool;
        this.F = BuildConfig.FLAVOR;
        this.G = true;
        this.I = 0;
        this.f28348h = list;
        this.f28347g = context;
        this.f28351k = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        f28346f = context.getApplicationContext().getPackageName();
        this.f28350j = new ArrayList();
        f28345e = u0(context);
        this.f28355o = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        this.f28350j.addAll(list);
        Locale locale = Locale.US;
        this.q = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f28352l = list;
        this.B = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f28353m = new c.h.a.i.q.a(context);
        this.f28354n = new c.h.a.i.q.f(context);
        this.y = new Date();
        this.p = new c.h.a.i.q.k(context);
        SimpleDateFormat simpleDateFormat = this.q;
        if (s0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(context))), this.B.format(this.y)) >= c.h.a.k.d.c.a.d.p() && (str = this.f28351k) != null && this.f28355o != null && (!f28345e.equals(str) || (this.f28351k != null && (str2 = this.f28355o) != null && !f28346f.equals(str2)))) {
            this.x = bool;
        }
        this.z = new Handler();
        this.G = z;
    }

    public VodAdapter(List<c.h.a.i.f> list, Context context, boolean z, VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
        String str;
        String str2;
        this.x = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        this.C = bool;
        this.F = BuildConfig.FLAVOR;
        this.G = true;
        this.I = 0;
        this.f28348h = list;
        this.f28347g = context;
        this.f28351k = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        ArrayList arrayList = new ArrayList();
        this.f28350j = arrayList;
        arrayList.addAll(list);
        f28346f = context.getApplicationContext().getPackageName();
        this.f28352l = list;
        f28345e = u0(context);
        this.f28353m = new c.h.a.i.q.a(context);
        this.f28354n = new c.h.a.i.q.f(context);
        this.f28355o = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        Locale locale = Locale.US;
        this.q = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.p = new c.h.a.i.q.k(context);
        this.B = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.z = new Handler();
        this.y = new Date();
        this.G = z;
        SimpleDateFormat simpleDateFormat = this.q;
        if (s0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(context))), this.B.format(this.y)) >= c.h.a.k.d.c.a.d.p() && (str = this.f28351k) != null && this.f28355o != null && (!f28345e.equals(str) || (this.f28351k != null && (str2 = this.f28355o) != null && !f28346f.equals(str2)))) {
            this.x = bool;
        }
        this.E = vodActivityNewFlowSubCategories;
    }

    public static long s0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String u0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f28348h.size();
    }

    public void t0(String str, TextView textView) {
        new Thread(new a(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, @SuppressLint({"RecyclerView"}) int i2) {
        int i3;
        ImageView imageView;
        Drawable drawableF;
        Context context = this.f28347g;
        if (context != null) {
            this.A = i2;
            SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
            this.f28349i = sharedPreferences;
            String string = sharedPreferences.getString("selectedPlayer", BuildConfig.FLAVOR);
            if (i2 == 0 && myViewHolder.Movie != null && !this.C.booleanValue()) {
                this.C = Boolean.TRUE;
                myViewHolder.Movie.requestFocus();
            }
            if (this.f28348h.get(i2).Y() != null) {
                try {
                    i3 = Integer.parseInt(this.f28348h.get(i2).Y());
                } catch (NumberFormatException unused) {
                    i3 = 0;
                }
            } else {
                i3 = 0;
            }
            String strG = this.f28348h.get(i2).g();
            String strC = this.f28348h.get(i2).C();
            String strZ = this.f28348h.get(i2).Z();
            String strP = this.f28348h.get(i2).P();
            myViewHolder.MovieName.setText(this.f28348h.get(i2).getName());
            if (this.I == 1) {
                myViewHolder.MovieName.setVisibility(0);
            } else {
                myViewHolder.MovieName.setVisibility(8);
            }
            String strX = this.f28348h.get(i2).X();
            String name = this.f28348h.get(i2).getName();
            String strE0 = this.f28348h.get(i2).e0();
            if (!this.G) {
                myViewHolder.recentWatchIV.setVisibility(0);
            }
            myViewHolder.MovieImage.setImageDrawable(null);
            if (strX == null || strX.equals(BuildConfig.FLAVOR)) {
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView = myViewHolder.MovieImage;
                    drawableF = this.f28347g.getResources().getDrawable(R.drawable.noposter, null);
                } else {
                    imageView = myViewHolder.MovieImage;
                    drawableF = a.i.i.b.f(this.f28347g, R.drawable.noposter);
                }
                imageView.setImageDrawable(drawableF);
            } else {
                t.q(this.f28347g).l(this.f28348h.get(i2).X()).d(R.drawable.noposter).j(R.drawable.noposter).g(myViewHolder.MovieImage);
            }
            if (!m.f(this.f28347g).equals("m3u") ? this.f28353m.l(i3, strG, "vod", m.z(this.f28347g)).size() > 0 : this.f28354n.U(strE0, m.z(this.f28347g)).size() > 0) {
                myViewHolder.ivFavourite.setVisibility(4);
            } else {
                myViewHolder.ivFavourite.setVisibility(0);
            }
            int i4 = i3;
            myViewHolder.cardView.setOnClickListener(new b(i4, name, string, strZ, strC, strG, strP, strX, strE0));
            myViewHolder.MovieImage.setOnClickListener(new c(i4, name, string, strZ, strC, strG, strP, strX, strE0));
            myViewHolder.Movie.setOnClickListener(new d(i4, name, string, strZ, strC, strG, strP, strX, strE0));
            RelativeLayout relativeLayout = myViewHolder.Movie;
            relativeLayout.setOnFocusChangeListener(new k(relativeLayout));
            int i5 = i3;
            myViewHolder.Movie.setOnLongClickListener(new e(myViewHolder, i5, strG, name, string, strZ, strC, strP, strX, strE0));
            int i6 = i3;
            myViewHolder.MovieImage.setOnLongClickListener(new f(myViewHolder, i5, strG, name, string, strZ, strC, strP, strX, strE0, i3));
            myViewHolder.cardView.setOnLongClickListener(new g(myViewHolder, i6, strG, name, string, strZ, strC, strP, strX, strE0, i3));
            myViewHolder.llMenu.setOnClickListener(new h(myViewHolder, i6, strG, name, string, strZ, strC, strP, strX));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        SharedPreferences sharedPreferences = this.f28347g.getSharedPreferences("showhidemoviename", 0);
        this.r = sharedPreferences;
        this.I = sharedPreferences.getInt("vod", 1);
        this.s = this.r.edit();
        SharedPreferences sharedPreferences2 = this.f28347g.getSharedPreferences("listgridview", 0);
        this.t = sharedPreferences2;
        this.u = sharedPreferences2.edit();
        int i4 = this.t.getInt("vod", 0);
        c.h.a.h.n.a.v = i4;
        if (i4 == 1) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.vod_linear_layout;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.series_all_data_right_adapter;
        }
        return new MyViewHolder(layoutInflaterFrom.inflate(i3, viewGroup, false));
    }

    public final void x0(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Menu menuB;
        int i3;
        Context context = this.f28347g;
        if (context != null) {
            j0 j0Var = new j0(context, myViewHolder.tvStreamOptions);
            j0Var.d(R.menu.menu_card_vod);
            ArrayList<c.h.a.i.b> arrayListL = this.f28353m.l(i2, str, "vod", m.z(this.f28347g));
            if (arrayListL == null || arrayListL.size() <= 0) {
                menuB = j0Var.b();
                i3 = 3;
            } else {
                menuB = j0Var.b();
                i3 = 4;
            }
            menuB.getItem(i3).setVisible(true);
            if (this.G) {
                j0Var.b().getItem(5).setVisible(false);
            } else {
                j0Var.b().getItem(5).setVisible(true);
            }
            try {
                c.f.a.c.d.u.d dVarC = c.f.a.c.d.u.b.e(this.f28347g).c().c();
                this.H = dVarC;
                if (dVarC == null || !dVarC.c()) {
                    j0Var.b().getItem(7).setVisible(false);
                } else {
                    j0Var.b().getItem(7).setVisible(true);
                }
            } catch (Exception e2) {
                Log.e("sdng", BuildConfig.FLAVOR + e2);
            }
            try {
                if (this.x.booleanValue()) {
                    this.D = new ArrayList<>();
                    ArrayList<ExternalPlayerModelClass> arrayListL2 = new c.h.a.i.q.d(this.f28347g).l();
                    this.D = arrayListL2;
                    if (arrayListL2 != null && arrayListL2.size() > 0) {
                        for (int i4 = 0; i4 < this.D.size(); i4++) {
                            j0Var.b().add(0, i4, i4, this.D.get(i4).a());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            j0Var.f(new j(i2, str5, str2, str3, str4, str, str6, str7, myViewHolder));
            j0Var.g();
        }
    }

    public final void y0(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Menu menuB;
        int i3;
        Context context = this.f28347g;
        if (context != null) {
            j0 j0Var = new j0(context, myViewHolder.tvStreamOptions);
            j0Var.d(R.menu.menu_card_vod);
            ArrayList<c.h.a.i.c> arrayListU = this.f28354n.U(str8, m.z(this.f28347g));
            if (arrayListU == null || arrayListU.size() <= 0) {
                menuB = j0Var.b();
                i3 = 3;
            } else {
                menuB = j0Var.b();
                i3 = 4;
            }
            menuB.getItem(i3).setVisible(true);
            if (this.G) {
                j0Var.b().getItem(5).setVisible(false);
            } else {
                j0Var.b().getItem(5).setVisible(true);
            }
            try {
                c.f.a.c.d.u.d dVarC = c.f.a.c.d.u.b.e(this.f28347g).c().c();
                this.H = dVarC;
                if (dVarC == null || !dVarC.c()) {
                    j0Var.b().getItem(7).setVisible(false);
                } else {
                    j0Var.b().getItem(7).setVisible(true);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.D = new ArrayList<>();
            ArrayList<ExternalPlayerModelClass> arrayListL = new c.h.a.i.q.d(this.f28347g).l();
            this.D = arrayListL;
            if (arrayListL != null && arrayListL.size() > 0) {
                for (int i4 = 0; i4 < this.D.size(); i4++) {
                    j0Var.b().add(0, i4, i4, this.D.get(i4).a());
                }
            }
            j0Var.f(new i(str8, i2, str2, str3, str4, str5, str, str6, str7, myViewHolder));
            j0Var.g();
        }
    }

    public final void z0(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (this.f28347g == null) {
            Log.e("Null hai context", ">>>>>>>>>>>True its Null");
            return;
        }
        Intent intent = (c.h.a.h.n.a.f17041e.booleanValue() && m.f(this.f28347g).equals("m3u")) ? new Intent(this.f28347g, (Class<?>) ViewDetailsTMDBActivity.class) : new Intent(this.f28347g, (Class<?>) ViewDetailsActivity.class);
        intent.putExtra(c.h.a.h.n.a.y, String.valueOf(i2));
        intent.putExtra("movie", str);
        intent.putExtra("movie_icon", str7);
        intent.putExtra("selectedPlayer", str2);
        intent.putExtra("streamType", str3);
        intent.putExtra("containerExtension", str4);
        intent.putExtra("categoryID", str5);
        intent.putExtra("num", str6);
        intent.putExtra("videoURL", str8);
        this.f28347g.startActivity(intent);
    }
}
