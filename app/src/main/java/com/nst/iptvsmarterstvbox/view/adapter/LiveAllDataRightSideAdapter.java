package minefarts.iptvsmarters.view.adapter;

import a.b.q.j0;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.i.p;
import c.k.b.t;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import minefarts.iptvsmarters.view.activity.LiveAllDataSingleActivity;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class LiveAllDataRightSideAdapter extends RecyclerView.h<RecyclerView.e0> implements Filterable {
    public String B;
    public String C;
    public Handler E;
    public c.h.a.i.q.f F;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f27337i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.a f27339k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animation f27340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f27341m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f27342n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f27343o;
    public String p;
    public SharedPreferences t;
    public c.f.a.c.d.u.d u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f27338j = Boolean.FALSE;
    public String q = BuildConfig.FLAVOR;
    public boolean r = false;
    public int s = -1;
    public String v = BuildConfig.FLAVOR;
    public String w = "0";
    public String x = BuildConfig.FLAVOR;
    public String y = BuildConfig.FLAVOR;
    public String z = BuildConfig.FLAVOR;
    public int A = 0;
    public String D = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f27333e = p.b().d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f27334f = p.b().d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<c.h.a.i.f> f27335g = p.b().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f27336h = p.b().a();

    public static class ContinueWatchingViewHolder extends RecyclerView.e0 {
    }

    public class ContinueWatchingViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ContinueWatchingViewHolder f27344b;

        public ContinueWatchingViewHolder_ViewBinding(ContinueWatchingViewHolder continueWatchingViewHolder, View view) {
            throw null;
        }

        @Override // butterknife.Unbinder
        public void a() {
            if (this.f27344b != null) {
                throw null;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public static class ViewHolder extends RecyclerView.e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView SeriesName;

        @BindView
        public CardView cardView;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public TextView tvStreamOptions;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewHolder f27345b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f27345b = viewHolder;
            viewHolder.SeriesName = (TextView) b.c.c.c(view, R.id.tv_series_name, "field 'SeriesName'", TextView.class);
            viewHolder.Movie = (RelativeLayout) b.c.c.c(view, R.id.rl_movie, "field 'Movie'", RelativeLayout.class);
            viewHolder.MovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'MovieImage'", ImageView.class);
            viewHolder.cardView = (CardView) b.c.c.c(view, R.id.card_view, "field 'cardView'", CardView.class);
            viewHolder.tvStreamOptions = (TextView) b.c.c.c(view, R.id.tv_streamOptions, "field 'tvStreamOptions'", TextView.class);
            viewHolder.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
            viewHolder.llMenu = (LinearLayout) b.c.c.c(view, R.id.ll_menu, "field 'llMenu'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            ViewHolder viewHolder = this.f27345b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27345b = null;
            viewHolder.SeriesName = null;
            viewHolder.Movie = null;
            viewHolder.MovieImage = null;
            viewHolder.cardView = null;
            viewHolder.tvStreamOptions = null;
            viewHolder.ivFavourite = null;
            viewHolder.llMenu = null;
        }
    }

    public class a implements c.k.b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27346a;

        /* JADX INFO: renamed from: minefarts.iptvsmarters.view.adapter.LiveAllDataRightSideAdapter$a$a, reason: collision with other inner class name */
        public class C0281a implements c.k.b.e {
            public C0281a() {
            }

            @Override // c.k.b.e
            public void a() {
            }

            @Override // c.k.b.e
            public void onSuccess() {
            }
        }

        public a(ViewHolder viewHolder) {
            this.f27346a = viewHolder;
        }

        @Override // c.k.b.e
        public void a() {
            t.q(LiveAllDataRightSideAdapter.this.f27337i).l(String.valueOf(LiveAllDataRightSideAdapter.this.f27337i.getResources().getDrawable(R.drawable.rounded_edge_3))).e().b().h(this.f27346a.MovieImage, new C0281a());
            this.f27346a.SeriesName.setVisibility(0);
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class b implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27353e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                LiveAllDataRightSideAdapter.this.w();
            }
        }

        /* JADX INFO: renamed from: minefarts.iptvsmarters.view.adapter.LiveAllDataRightSideAdapter$b$b, reason: collision with other inner class name */
        public class DialogC0282b extends Dialog implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Activity f27356b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public TextView f27357c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public TextView f27358d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public TextView f27359e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public LinearLayout f27360f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public LinearLayout f27361g;

            /* JADX INFO: renamed from: minefarts.iptvsmarters.view.adapter.LiveAllDataRightSideAdapter$b$b$a */
            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (LiveAllDataRightSideAdapter.this.f27337i instanceof LiveAllDataSingleActivity) {
                        ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).l1();
                    }
                }
            }

            /* JADX INFO: renamed from: minefarts.iptvsmarters.view.adapter.LiveAllDataRightSideAdapter$b$b$b, reason: collision with other inner class name */
            public class ViewOnFocusChangeListenerC0283b implements View.OnFocusChangeListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public View f27364b;

                public ViewOnFocusChangeListenerC0283b(View view) {
                    this.f27364b = view;
                }

                @Override // android.view.View.OnFocusChangeListener
                @SuppressLint({"ResourceType"})
                public void onFocusChange(View view, boolean z) {
                    int i2;
                    LinearLayout linearLayout;
                    if (z) {
                        View view2 = this.f27364b;
                        i2 = R.drawable.blue_btn_effect;
                        if (view2 == null || view2.getTag() == null || !this.f27364b.getTag().equals("1")) {
                            View view3 = this.f27364b;
                            if (view3 == null || view3.getTag() == null || !this.f27364b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = DialogC0282b.this.f27361g;
                        }
                        linearLayout = DialogC0282b.this.f27360f;
                    } else {
                        View view4 = this.f27364b;
                        i2 = R.drawable.black_button_dark;
                        if (view4 == null || view4.getTag() == null || !this.f27364b.getTag().equals("1")) {
                            View view5 = this.f27364b;
                            if (view5 == null || view5.getTag() == null || !this.f27364b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = DialogC0282b.this.f27361g;
                        }
                        linearLayout = DialogC0282b.this.f27360f;
                    }
                    linearLayout.setBackgroundResource(i2);
                }
            }

            public DialogC0282b(Activity activity) {
                super(activity);
                this.f27356b = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int id = view.getId();
                if (id == R.id.btn_no) {
                    dismiss();
                } else if (id == R.id.btn_yes) {
                    try {
                        LiveAllDataRightSideAdapter.this.F.L0(String.valueOf(b.this.f27353e));
                        if (LiveAllDataRightSideAdapter.this.f27337i instanceof LiveAllDataSingleActivity) {
                            ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).r1();
                        }
                        new Handler().postDelayed(new a(), 100L);
                    } catch (Exception unused) {
                    }
                }
                dismiss();
            }

            @Override // android.app.Dialog
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                setContentView(new c.h.a.k.d.a.a(LiveAllDataRightSideAdapter.this.f27337i).A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_alert_layout_tv : R.layout.custom_alert_layout);
                this.f27357c = (TextView) findViewById(R.id.btn_yes);
                this.f27358d = (TextView) findViewById(R.id.btn_no);
                this.f27360f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
                this.f27361g = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
                TextView textView = (TextView) findViewById(R.id.txt_dia);
                this.f27359e = textView;
                textView.setText(LiveAllDataRightSideAdapter.this.f27337i.getResources().getString(R.string.you_want_to_remove_this_channel_from_recently_watched));
                this.f27357c.setOnClickListener(this);
                this.f27358d.setOnClickListener(this);
                TextView textView2 = this.f27357c;
                textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0283b(textView2));
                TextView textView3 = this.f27358d;
                textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0283b(textView3));
            }
        }

        public b(ArrayList arrayList, ViewHolder viewHolder, int i2, ArrayList arrayList2, String str) {
            this.f27349a = arrayList;
            this.f27350b = viewHolder;
            this.f27351c = i2;
            this.f27352d = arrayList2;
            this.f27353e = str;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.menu_remove_from_recently_watched) {
                new DialogC0282b((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).show();
                return false;
            }
            if (itemId != R.id.nav_add_to_fav && itemId != R.id.nav_remove_from_fav) {
                return false;
            }
            LiveAllDataRightSideAdapter.this.z0(this.f27349a, this.f27350b, this.f27351c, this.f27352d);
            new Handler().postDelayed(new a(), 300L);
            if (!(LiveAllDataRightSideAdapter.this.f27337i instanceof LiveAllDataSingleActivity)) {
                return false;
            }
            ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).l1();
            return false;
        }
    }

    public class c implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27370e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                LiveAllDataRightSideAdapter.this.w();
            }
        }

        public class b extends Dialog implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Activity f27373b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public TextView f27374c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public TextView f27375d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public TextView f27376e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public LinearLayout f27377f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public LinearLayout f27378g;

            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (LiveAllDataRightSideAdapter.this.f27337i instanceof LiveAllDataSingleActivity) {
                        ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).l1();
                    }
                }
            }

            /* JADX INFO: renamed from: minefarts.iptvsmarters.view.adapter.LiveAllDataRightSideAdapter$c$b$b, reason: collision with other inner class name */
            public class ViewOnFocusChangeListenerC0284b implements View.OnFocusChangeListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public View f27381b;

                public ViewOnFocusChangeListenerC0284b(View view) {
                    this.f27381b = view;
                }

                @Override // android.view.View.OnFocusChangeListener
                @SuppressLint({"ResourceType"})
                public void onFocusChange(View view, boolean z) {
                    int i2;
                    LinearLayout linearLayout;
                    if (z) {
                        View view2 = this.f27381b;
                        i2 = R.drawable.blue_btn_effect;
                        if (view2 == null || view2.getTag() == null || !this.f27381b.getTag().equals("1")) {
                            View view3 = this.f27381b;
                            if (view3 == null || view3.getTag() == null || !this.f27381b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = b.this.f27378g;
                        }
                        linearLayout = b.this.f27377f;
                    } else {
                        View view4 = this.f27381b;
                        i2 = R.drawable.black_button_dark;
                        if (view4 == null || view4.getTag() == null || !this.f27381b.getTag().equals("1")) {
                            View view5 = this.f27381b;
                            if (view5 == null || view5.getTag() == null || !this.f27381b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = b.this.f27378g;
                        }
                        linearLayout = b.this.f27377f;
                    }
                    linearLayout.setBackgroundResource(i2);
                }
            }

            public b(Activity activity) {
                super(activity);
                this.f27373b = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int id = view.getId();
                if (id == R.id.btn_no) {
                    dismiss();
                } else if (id == R.id.btn_yes) {
                    try {
                        LiveAllDataRightSideAdapter.this.F.L0(String.valueOf(c.this.f27370e));
                        if (LiveAllDataRightSideAdapter.this.f27337i instanceof LiveAllDataSingleActivity) {
                            ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).r1();
                        }
                        new Handler().postDelayed(new a(), 100L);
                    } catch (Exception unused) {
                    }
                }
                dismiss();
            }

            @Override // android.app.Dialog
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                setContentView(new c.h.a.k.d.a.a(LiveAllDataRightSideAdapter.this.f27337i).A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_alert_layout_tv : R.layout.custom_alert_layout);
                this.f27374c = (TextView) findViewById(R.id.btn_yes);
                this.f27375d = (TextView) findViewById(R.id.btn_no);
                this.f27377f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
                this.f27378g = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
                TextView textView = (TextView) findViewById(R.id.txt_dia);
                this.f27376e = textView;
                textView.setText(LiveAllDataRightSideAdapter.this.f27337i.getResources().getString(R.string.you_want_to_remove_this_channel_from_recently_watched));
                this.f27374c.setOnClickListener(this);
                this.f27375d.setOnClickListener(this);
                TextView textView2 = this.f27374c;
                textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0284b(textView2));
                TextView textView3 = this.f27375d;
                textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0284b(textView3));
            }
        }

        public c(ArrayList arrayList, ViewHolder viewHolder, int i2, ArrayList arrayList2, int i3) {
            this.f27366a = arrayList;
            this.f27367b = viewHolder;
            this.f27368c = i2;
            this.f27369d = arrayList2;
            this.f27370e = i3;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.menu_remove_from_recently_watched) {
                new b((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).show();
                return false;
            }
            if (itemId != R.id.nav_add_to_fav && itemId != R.id.nav_remove_from_fav) {
                return false;
            }
            LiveAllDataRightSideAdapter.this.y0(this.f27366a, this.f27367b, this.f27368c, this.f27369d);
            new Handler().postDelayed(new a(), 300L);
            if (!(LiveAllDataRightSideAdapter.this.f27337i instanceof LiveAllDataSingleActivity)) {
                return false;
            }
            ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).l1();
            return false;
        }
    }

    public class d implements c.k.b.e {
        public d() {
        }

        @Override // c.k.b.e
        public void a() {
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class e implements c.k.b.e {
        public e() {
        }

        @Override // c.k.b.e
        public void a() {
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27389f;

        public f(String str, int i2, String str2, String str3, String str4) {
            this.f27385b = str;
            this.f27386c = i2;
            this.f27387d = str2;
            this.f27388e = str3;
            this.f27389f = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iC0 = c.h.a.i.q.m.f(LiveAllDataRightSideAdapter.this.f27337i).equals("m3u") ? LiveAllDataRightSideAdapter.this.C0(this.f27385b, "m3u") : LiveAllDataRightSideAdapter.this.C0(String.valueOf(this.f27386c), "api");
            try {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter.u = c.f.a.c.d.u.b.e(liveAllDataRightSideAdapter.f27337i).c().c();
            } catch (Exception unused) {
            }
            if (LiveAllDataRightSideAdapter.this.u == null || !LiveAllDataRightSideAdapter.this.u.c()) {
                c.h.a.h.n.e.X(LiveAllDataRightSideAdapter.this.f27337i, "Built-in Player ( Default )", this.f27386c, this.f27389f, iC0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, LiveAllDataRightSideAdapter.this.C, BuildConfig.FLAVOR, LiveAllDataRightSideAdapter.this.B);
                return;
            }
            if (LiveAllDataRightSideAdapter.this.u != null && LiveAllDataRightSideAdapter.this.u.p() != null && LiveAllDataRightSideAdapter.this.u.p().j() != null && LiveAllDataRightSideAdapter.this.u.p().j().K() != null) {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter2.D = liveAllDataRightSideAdapter2.u.p().j().K();
            }
            String strF = c.h.a.i.q.m.f(LiveAllDataRightSideAdapter.this.f27337i).equals("m3u") ? this.f27385b : c.h.a.h.n.e.F(LiveAllDataRightSideAdapter.this.f27337i, this.f27386c, "m3u8", "live");
            if (LiveAllDataRightSideAdapter.this.D.contains(String.valueOf(strF))) {
                LiveAllDataRightSideAdapter.this.f27337i.startActivity(new Intent(LiveAllDataRightSideAdapter.this.f27337i, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            c.f.a.c.d.l lVar = new c.f.a.c.d.l(1);
            lVar.N("com.google.android.gms.cast.metadata.TITLE", this.f27387d);
            lVar.b(new c.f.a.c.f.p.a(Uri.parse(this.f27388e)));
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter3 = LiveAllDataRightSideAdapter.this;
            c.h.a.h.m.a.b(liveAllDataRightSideAdapter3.E, liveAllDataRightSideAdapter3.u.p(), strF, lVar, LiveAllDataRightSideAdapter.this.f27337i);
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27395f;

        public g(String str, int i2, String str2, String str3, String str4) {
            this.f27391b = str;
            this.f27392c = i2;
            this.f27393d = str2;
            this.f27394e = str3;
            this.f27395f = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iC0 = c.h.a.i.q.m.f(LiveAllDataRightSideAdapter.this.f27337i).equals("m3u") ? LiveAllDataRightSideAdapter.this.C0(this.f27391b, "m3u") : LiveAllDataRightSideAdapter.this.C0(String.valueOf(this.f27392c), "api");
            try {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter.u = c.f.a.c.d.u.b.e(liveAllDataRightSideAdapter.f27337i).c().c();
            } catch (Exception unused) {
            }
            if (LiveAllDataRightSideAdapter.this.u == null || !LiveAllDataRightSideAdapter.this.u.c()) {
                c.h.a.h.n.e.X(LiveAllDataRightSideAdapter.this.f27337i, "Built-in Player ( Default )", this.f27392c, this.f27395f, iC0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, LiveAllDataRightSideAdapter.this.C, BuildConfig.FLAVOR, LiveAllDataRightSideAdapter.this.B);
                return;
            }
            if (LiveAllDataRightSideAdapter.this.u != null && LiveAllDataRightSideAdapter.this.u.p() != null && LiveAllDataRightSideAdapter.this.u.p().j() != null && LiveAllDataRightSideAdapter.this.u.p().j().K() != null) {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter2.D = liveAllDataRightSideAdapter2.u.p().j().K();
            }
            String strF = c.h.a.i.q.m.f(LiveAllDataRightSideAdapter.this.f27337i).equals("m3u") ? this.f27391b : c.h.a.h.n.e.F(LiveAllDataRightSideAdapter.this.f27337i, this.f27392c, "m3u8", "live");
            if (LiveAllDataRightSideAdapter.this.D.contains(String.valueOf(this.f27392c))) {
                LiveAllDataRightSideAdapter.this.f27337i.startActivity(new Intent(LiveAllDataRightSideAdapter.this.f27337i, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            c.f.a.c.d.l lVar = new c.f.a.c.d.l(1);
            lVar.N("com.google.android.gms.cast.metadata.TITLE", this.f27393d);
            lVar.b(new c.f.a.c.f.p.a(Uri.parse(this.f27394e)));
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter3 = LiveAllDataRightSideAdapter.this;
            c.h.a.h.m.a.b(liveAllDataRightSideAdapter3.E, liveAllDataRightSideAdapter3.u.p(), strF, lVar, LiveAllDataRightSideAdapter.this.f27337i);
        }
    }

    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27400e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27401f;

        public h(String str, int i2, String str2, String str3, String str4) {
            this.f27397b = str;
            this.f27398c = i2;
            this.f27399d = str2;
            this.f27400e = str3;
            this.f27401f = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iC0 = c.h.a.i.q.m.f(LiveAllDataRightSideAdapter.this.f27337i).equals("m3u") ? LiveAllDataRightSideAdapter.this.C0(this.f27397b, "m3u") : LiveAllDataRightSideAdapter.this.C0(String.valueOf(this.f27398c), "api");
            try {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter.u = c.f.a.c.d.u.b.e(liveAllDataRightSideAdapter.f27337i).c().c();
            } catch (Exception unused) {
            }
            if (LiveAllDataRightSideAdapter.this.u == null || !LiveAllDataRightSideAdapter.this.u.c()) {
                c.h.a.h.n.e.X(LiveAllDataRightSideAdapter.this.f27337i, "Built-in Player ( Default )", this.f27398c, this.f27401f, iC0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, LiveAllDataRightSideAdapter.this.C, BuildConfig.FLAVOR, LiveAllDataRightSideAdapter.this.B);
                return;
            }
            if (LiveAllDataRightSideAdapter.this.u != null && LiveAllDataRightSideAdapter.this.u.p() != null && LiveAllDataRightSideAdapter.this.u.p().j() != null && LiveAllDataRightSideAdapter.this.u.p().j().K() != null) {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter2.D = liveAllDataRightSideAdapter2.u.p().j().K();
            }
            String strF = c.h.a.i.q.m.f(LiveAllDataRightSideAdapter.this.f27337i).equals("m3u") ? this.f27397b : c.h.a.h.n.e.F(LiveAllDataRightSideAdapter.this.f27337i, this.f27398c, "m3u8", "live");
            if (LiveAllDataRightSideAdapter.this.D.contains(String.valueOf(this.f27398c))) {
                LiveAllDataRightSideAdapter.this.f27337i.startActivity(new Intent(LiveAllDataRightSideAdapter.this.f27337i, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            c.f.a.c.d.l lVar = new c.f.a.c.d.l(1);
            lVar.N("com.google.android.gms.cast.metadata.TITLE", this.f27399d);
            lVar.b(new c.f.a.c.f.p.a(Uri.parse(this.f27400e)));
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter3 = LiveAllDataRightSideAdapter.this;
            c.h.a.h.m.a.b(liveAllDataRightSideAdapter3.E, liveAllDataRightSideAdapter3.u.p(), strF, lVar, LiveAllDataRightSideAdapter.this.f27337i);
        }
    }

    public class i implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27408g;

        public i(ViewHolder viewHolder, int i2, String str, int i3, String str2, String str3) {
            this.f27403b = viewHolder;
            this.f27404c = i2;
            this.f27405d = str;
            this.f27406e = i3;
            this.f27407f = str2;
            this.f27408g = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (LiveAllDataRightSideAdapter.this.C.equals("-6")) {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter.D0(this.f27403b, this.f27404c, liveAllDataRightSideAdapter.f27334f);
                return true;
            }
            if (c.h.a.i.q.m.f(LiveAllDataRightSideAdapter.this.f27337i).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = LiveAllDataRightSideAdapter.this.F.U(this.f27405d, c.h.a.i.q.m.z(LiveAllDataRightSideAdapter.this.f27337i));
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter2.z0(arrayListU, this.f27403b, this.f27404c, liveAllDataRightSideAdapter2.f27334f);
            } else {
                ArrayList<c.h.a.i.b> arrayListL = LiveAllDataRightSideAdapter.this.f27339k.l(this.f27406e, this.f27407f, this.f27408g, c.h.a.i.q.m.z(LiveAllDataRightSideAdapter.this.f27337i));
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter3 = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter3.y0(arrayListL, this.f27403b, this.f27404c, liveAllDataRightSideAdapter3.f27334f);
            }
            return true;
        }
    }

    public class j implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27414f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27415g;

        public j(ViewHolder viewHolder, int i2, String str, int i3, String str2, String str3) {
            this.f27410b = viewHolder;
            this.f27411c = i2;
            this.f27412d = str;
            this.f27413e = i3;
            this.f27414f = str2;
            this.f27415g = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (LiveAllDataRightSideAdapter.this.C.equals("-6")) {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter.D0(this.f27410b, this.f27411c, liveAllDataRightSideAdapter.f27334f);
                return true;
            }
            if (c.h.a.i.q.m.f(LiveAllDataRightSideAdapter.this.f27337i).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = LiveAllDataRightSideAdapter.this.F.U(this.f27412d, c.h.a.i.q.m.z(LiveAllDataRightSideAdapter.this.f27337i));
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter2.z0(arrayListU, this.f27410b, this.f27411c, liveAllDataRightSideAdapter2.f27334f);
            } else {
                ArrayList<c.h.a.i.b> arrayListL = LiveAllDataRightSideAdapter.this.f27339k.l(this.f27413e, this.f27414f, this.f27415g, c.h.a.i.q.m.z(LiveAllDataRightSideAdapter.this.f27337i));
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter3 = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter3.y0(arrayListL, this.f27410b, this.f27411c, liveAllDataRightSideAdapter3.f27334f);
            }
            return true;
        }
    }

    public class k implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27422g;

        public k(ViewHolder viewHolder, int i2, String str, int i3, String str2, String str3) {
            this.f27417b = viewHolder;
            this.f27418c = i2;
            this.f27419d = str;
            this.f27420e = i3;
            this.f27421f = str2;
            this.f27422g = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (LiveAllDataRightSideAdapter.this.C.equals("-6")) {
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter.D0(this.f27417b, this.f27418c, liveAllDataRightSideAdapter.f27334f);
                return true;
            }
            if (c.h.a.i.q.m.f(LiveAllDataRightSideAdapter.this.f27337i).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = LiveAllDataRightSideAdapter.this.F.U(this.f27419d, c.h.a.i.q.m.z(LiveAllDataRightSideAdapter.this.f27337i));
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter2.z0(arrayListU, this.f27417b, this.f27418c, liveAllDataRightSideAdapter2.f27334f);
            } else {
                ArrayList<c.h.a.i.b> arrayListL = LiveAllDataRightSideAdapter.this.f27339k.l(this.f27420e, this.f27421f, this.f27422g, c.h.a.i.q.m.z(LiveAllDataRightSideAdapter.this.f27337i));
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter3 = LiveAllDataRightSideAdapter.this;
                liveAllDataRightSideAdapter3.y0(arrayListL, this.f27417b, this.f27418c, liveAllDataRightSideAdapter3.f27334f);
            }
            return true;
        }
    }

    public class l extends Filter {
        public l() {
        }

        public /* synthetic */ l(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = LiveAllDataRightSideAdapter.this.f27333e;
            if (arrayList == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                c.h.a.i.f fVar = (c.h.a.i.f) arrayList.get(i2);
                if (fVar.getName().toLowerCase().contains(lowerCase) || fVar.getName().contains(lowerCase)) {
                    arrayList2.add(fVar);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                LiveAllDataRightSideAdapter.this.f27334f = (ArrayList) filterResults.values;
                if (LiveAllDataRightSideAdapter.this.f27334f != null) {
                    LiveAllDataRightSideAdapter.this.w();
                    if (LiveAllDataRightSideAdapter.this.f27334f == null || LiveAllDataRightSideAdapter.this.f27334f.size() != 0) {
                        ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).w1();
                        ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).Z0();
                    } else {
                        ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).X0();
                        ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).x1(LiveAllDataRightSideAdapter.this.f27337i.getResources().getString(R.string.no_channel_found));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class m extends Filter {
        public m() {
        }

        public /* synthetic */ m(LiveAllDataRightSideAdapter liveAllDataRightSideAdapter, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = LiveAllDataRightSideAdapter.this.f27335g;
            if (arrayList == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                c.h.a.i.f fVar = (c.h.a.i.f) arrayList.get(i2);
                if (fVar.getName().toLowerCase().contains(lowerCase) || fVar.getName().contains(lowerCase)) {
                    arrayList2.add(fVar);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                LiveAllDataRightSideAdapter.this.f27336h = (ArrayList) filterResults.values;
                if (LiveAllDataRightSideAdapter.this.f27336h != null) {
                    LiveAllDataRightSideAdapter.this.w();
                    if (LiveAllDataRightSideAdapter.this.f27336h.size() == 0) {
                        ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).X0();
                        ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).x1(LiveAllDataRightSideAdapter.this.f27337i.getResources().getString(R.string.no_channel_found));
                    } else {
                        ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).w1();
                        ((LiveAllDataSingleActivity) LiveAllDataRightSideAdapter.this.f27337i).Z0();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class n implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27426b;

        public n(int i2) {
            this.f27426b = 0;
            this.f27426b = i2;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            LiveAllDataRightSideAdapter.this.s = z ? this.f27426b : -1;
        }
    }

    public LiveAllDataRightSideAdapter(Context context, String str, String str2, String str3) {
        this.f27341m = BuildConfig.FLAVOR;
        a aVar = null;
        this.f27342n = new l(this, aVar);
        this.f27343o = new m(this, aVar);
        this.p = "mobile";
        this.B = BuildConfig.FLAVOR;
        this.C = "0";
        this.f27337i = context;
        this.f27339k = new c.h.a.i.q.a(context);
        this.F = new c.h.a.i.q.f(context);
        this.f27340l = AnimationUtils.loadAnimation(context, R.anim.bounce);
        this.f27341m = str;
        this.B = str2;
        this.C = str3;
        if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0)) {
            this.p = "tv";
        } else {
            this.p = "mobile";
        }
        this.E = new Handler(Looper.getMainLooper());
        if (this.p.equals("mobile")) {
            try {
                this.u = c.f.a.c.d.u.b.e(context).c().c();
            } catch (Exception unused) {
            }
        }
    }

    public boolean A0() {
        return this.r;
    }

    public int B0() {
        return this.s;
    }

    public int C0(String str, String str2) {
        try {
            ArrayList<c.h.a.i.f> arrayList = this.f27333e;
            if (arrayList != null && arrayList.size() > 0) {
                if (str2.equals("m3u")) {
                    for (int i2 = 0; i2 < this.f27333e.size(); i2++) {
                        if (this.f27333e.get(i2).e0().equals(str)) {
                            return i2;
                        }
                    }
                } else {
                    for (int i3 = 0; i3 < this.f27333e.size(); i3++) {
                        if (this.f27333e.get(i3).Y().equals(str)) {
                            return i3;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public final void D0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList) {
        j0 j0Var;
        int i3;
        j0.d cVar;
        try {
            if (c.h.a.i.q.m.f(this.f27337i).equals("m3u")) {
                if (arrayList == null || arrayList.size() <= 0) {
                    return;
                }
                ViewHolder viewHolder = (ViewHolder) e0Var;
                j0Var = new j0(this.f27337i, viewHolder.cardView);
                j0Var.d(R.menu.menu_recently_watched);
                String strE0 = arrayList.get(i2).e0();
                ArrayList<c.h.a.i.c> arrayListU = this.F.U(strE0, c.h.a.i.q.m.z(this.f27337i));
                if (arrayListU.size() > 0) {
                    j0Var.b().getItem(0).setVisible(false);
                    j0Var.b().getItem(1).setVisible(true);
                } else {
                    j0Var.b().getItem(0).setVisible(true);
                    j0Var.b().getItem(1).setVisible(false);
                }
                cVar = new b(arrayListU, viewHolder, i2, arrayList, strE0);
            } else {
                if (arrayList == null || arrayList.size() <= 0) {
                    return;
                }
                ViewHolder viewHolder2 = (ViewHolder) e0Var;
                j0Var = new j0(this.f27337i, viewHolder2.cardView);
                j0Var.d(R.menu.menu_recently_watched);
                c.h.a.i.f fVar = arrayList.get(i2);
                if (fVar.Y() != null) {
                    try {
                        i3 = Integer.parseInt(fVar.Y());
                    } catch (NumberFormatException unused) {
                        i3 = 0;
                    }
                } else {
                    i3 = -1;
                }
                ArrayList<c.h.a.i.b> arrayListL = this.f27339k.l(i3, fVar.g(), fVar.Z(), c.h.a.i.q.m.z(this.f27337i));
                if (arrayListL.size() > 0) {
                    j0Var.b().getItem(0).setVisible(false);
                    j0Var.b().getItem(1).setVisible(true);
                } else {
                    j0Var.b().getItem(0).setVisible(true);
                    j0Var.b().getItem(1).setVisible(false);
                }
                cVar = new c(arrayListL, viewHolder2, i2, arrayList, i3);
            }
            j0Var.f(cVar);
            j0Var.g();
        } catch (Exception unused2) {
        }
    }

    public final void E0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList) {
        this.f27339k.o(c.h.a.h.n.e.S(arrayList.get(i2).Y()), arrayList.get(i2).g(), arrayList.get(i2).Z(), arrayList.get(i2).getName(), c.h.a.i.q.m.z(this.f27337i));
        ((ViewHolder) e0Var).ivFavourite.setVisibility(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x014e A[Catch: Exception -> 0x021b, TryCatch #1 {Exception -> 0x021b, blocks: (B:3:0x001f, B:5:0x0023, B:7:0x0029, B:9:0x002d, B:11:0x0045, B:12:0x0048, B:14:0x004e, B:16:0x0054, B:18:0x005a, B:20:0x0061, B:22:0x0067, B:26:0x0074, B:28:0x007a, B:30:0x0081, B:32:0x0087, B:34:0x008e, B:36:0x0094, B:38:0x009b, B:40:0x00b1, B:42:0x00be, B:50:0x013f, B:52:0x014e, B:54:0x0160, B:59:0x017f, B:61:0x0200, B:63:0x0204, B:55:0x0166, B:56:0x016c, B:49:0x0114, B:48:0x010e, B:47:0x00e4, B:41:0x00b7, B:64:0x0211, B:45:0x00c7), top: B:69:0x001f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c A[Catch: Exception -> 0x021b, TryCatch #1 {Exception -> 0x021b, blocks: (B:3:0x001f, B:5:0x0023, B:7:0x0029, B:9:0x002d, B:11:0x0045, B:12:0x0048, B:14:0x004e, B:16:0x0054, B:18:0x005a, B:20:0x0061, B:22:0x0067, B:26:0x0074, B:28:0x007a, B:30:0x0081, B:32:0x0087, B:34:0x008e, B:36:0x0094, B:38:0x009b, B:40:0x00b1, B:42:0x00be, B:50:0x013f, B:52:0x014e, B:54:0x0160, B:59:0x017f, B:61:0x0200, B:63:0x0204, B:55:0x0166, B:56:0x016c, B:49:0x0114, B:48:0x010e, B:47:0x00e4, B:41:0x00b7, B:64:0x0211, B:45:0x00c7), top: B:69:0x001f, inners: #2 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    @android.annotation.SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.e0 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.LiveAllDataRightSideAdapter.F(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    public final void F0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList) {
        this.F.I0(arrayList.get(i2).e0(), c.h.a.i.q.m.z(this.f27337i));
        ((ViewHolder) e0Var).ivFavourite.setVisibility(4);
    }

    public void G0() {
        this.r = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.e0 H(@NotNull ViewGroup viewGroup, int i2) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.live_all_data_right_adapter, viewGroup, false));
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f27341m.equals("continue_watching") ? this.f27343o : this.f27342n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        ArrayList<c.h.a.i.f> arrayList;
        if (this.f27341m.equals("continue_watching")) {
            ArrayList<c.h.a.i.f> arrayList2 = this.f27336h;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                return 0;
            }
            arrayList = this.f27336h;
        } else {
            ArrayList<c.h.a.i.f> arrayList3 = this.f27334f;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return 0;
            }
            arrayList = this.f27334f;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return 0;
    }

    public final void w0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList) {
        ViewHolder viewHolder = (ViewHolder) e0Var;
        c.h.a.i.b bVar = new c.h.a.i.b();
        bVar.h(arrayList.get(i2).g());
        bVar.m(c.h.a.h.n.e.S(arrayList.get(i2).Y()));
        bVar.k(arrayList.get(i2).getName());
        bVar.l(arrayList.get(i2).P());
        bVar.o(c.h.a.i.q.m.z(this.f27337i));
        this.f27339k.i(bVar, arrayList.get(i2).Z());
        viewHolder.ivFavourite.startAnimation(this.f27340l);
        viewHolder.ivFavourite.setVisibility(0);
    }

    public final void x0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList) {
        ViewHolder viewHolder = (ViewHolder) e0Var;
        c.h.a.i.c cVar = new c.h.a.i.c();
        cVar.h(arrayList.get(i2).e0());
        cVar.i(c.h.a.i.q.m.z(this.f27337i));
        cVar.g(arrayList.get(i2).getName());
        cVar.e(arrayList.get(i2).g());
        this.F.Q(cVar);
        viewHolder.ivFavourite.startAnimation(this.f27340l);
        viewHolder.ivFavourite.setVisibility(0);
    }

    public final void y0(ArrayList<c.h.a.i.b> arrayList, RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList2) {
        if (arrayList.size() > 0) {
            E0(e0Var, i2, arrayList2);
        } else {
            w0(e0Var, i2, arrayList2);
        }
        this.r = true;
        Context context = this.f27337i;
        if (context instanceof LiveAllDataSingleActivity) {
            ((LiveAllDataSingleActivity) context).l1();
        }
    }

    public final void z0(ArrayList<c.h.a.i.c> arrayList, RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList2) {
        if (arrayList.size() > 0) {
            F0(e0Var, i2, arrayList2);
        } else {
            x0(e0Var, i2, arrayList2);
        }
        this.r = true;
        Context context = this.f27337i;
        if (context instanceof LiveAllDataSingleActivity) {
            ((LiveAllDataSingleActivity) context).l1();
        }
    }
}
