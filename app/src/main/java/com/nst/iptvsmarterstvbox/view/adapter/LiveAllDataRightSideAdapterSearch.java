package minefarts.iptvsmarters.view.adapter;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
import c.h.a.i.q.m;
import c.k.b.t;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import minefarts.iptvsmarters.view.activity.LiveAllDataSingleActivity;
import minefarts.iptvsmarters.view.demo.NSTEXOPlayerSkyTvActivity;
import minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class LiveAllDataRightSideAdapterSearch extends RecyclerView.h<RecyclerView.e0> {
    public SharedPreferences.Editor C;
    public SharedPreferences D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f27428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f27429f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.q.a f27431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Animation f27432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27433j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ProgressDialog f27435l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f27438o;
    public c.f.a.c.d.u.d p;
    public Handler r;
    public c.h.a.i.q.f t;
    public ArrayList<c.h.a.i.f> x;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f27430g = Boolean.FALSE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27434k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f27436m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27437n = -1;
    public String q = BuildConfig.FLAVOR;
    public int u = -1;
    public ArrayList<String> v = new ArrayList<>();
    public String y = BuildConfig.FLAVOR;
    public String z = BuildConfig.FLAVOR;
    public int A = 0;
    public String B = BuildConfig.FLAVOR;
    public ArrayList<c.h.a.i.e> s = new ArrayList<>();
    public ArrayList<c.h.a.i.e> w = new ArrayList<>();

    public static class ContinueWatchingViewHolder extends RecyclerView.e0 {
    }

    public class ContinueWatchingViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ContinueWatchingViewHolder f27439b;

        public ContinueWatchingViewHolder_ViewBinding(ContinueWatchingViewHolder continueWatchingViewHolder, View view) {
            throw null;
        }

        @Override // butterknife.Unbinder
        public void a() {
            if (this.f27439b != null) {
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
        public ViewHolder f27440b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f27440b = viewHolder;
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
            ViewHolder viewHolder = this.f27440b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27440b = null;
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
        public final /* synthetic */ ViewHolder f27441a;

        /* JADX INFO: renamed from: minefarts.iptvsmarters.view.adapter.LiveAllDataRightSideAdapterSearch$a$a, reason: collision with other inner class name */
        public class C0285a implements c.k.b.e {
            public C0285a() {
            }

            @Override // c.k.b.e
            public void a() {
            }

            @Override // c.k.b.e
            public void onSuccess() {
            }
        }

        public a(ViewHolder viewHolder) {
            this.f27441a = viewHolder;
        }

        @Override // c.k.b.e
        public void a() {
            t.q(LiveAllDataRightSideAdapterSearch.this.f27429f).l(String.valueOf(LiveAllDataRightSideAdapterSearch.this.f27429f.getResources().getDrawable(R.drawable.rounded_edge_3))).e().b().h(this.f27441a.MovieImage, new C0285a());
            this.f27441a.SeriesName.setVisibility(0);
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class b implements c.k.b.e {
        public b() {
        }

        @Override // c.k.b.e
        public void a() {
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class c implements c.k.b.e {
        public c() {
        }

        @Override // c.k.b.e
        public void a() {
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27450f;

        public d(String str, int i2, String str2, String str3, String str4) {
            this.f27446b = str;
            this.f27447c = i2;
            this.f27448d = str2;
            this.f27449e = str3;
            this.f27450f = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = LiveAllDataRightSideAdapterSearch.this;
                liveAllDataRightSideAdapterSearch.p = c.f.a.c.d.u.b.e(liveAllDataRightSideAdapterSearch.f27429f).c().c();
            } catch (Exception unused) {
            }
            if (LiveAllDataRightSideAdapterSearch.this.p == null || !LiveAllDataRightSideAdapterSearch.this.p.c()) {
                LiveAllDataRightSideAdapterSearch.this.D0(this.f27447c, this.f27450f, this.f27446b);
                return;
            }
            if (LiveAllDataRightSideAdapterSearch.this.p != null && LiveAllDataRightSideAdapterSearch.this.p.p() != null && LiveAllDataRightSideAdapterSearch.this.p.p().j() != null && LiveAllDataRightSideAdapterSearch.this.p.p().j().K() != null) {
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch2 = LiveAllDataRightSideAdapterSearch.this;
                liveAllDataRightSideAdapterSearch2.q = liveAllDataRightSideAdapterSearch2.p.p().j().K();
            }
            String strF = m.f(LiveAllDataRightSideAdapterSearch.this.f27429f).equals("m3u") ? this.f27446b : c.h.a.h.n.e.F(LiveAllDataRightSideAdapterSearch.this.f27429f, this.f27447c, "m3u8", "live");
            if (LiveAllDataRightSideAdapterSearch.this.q.contains(String.valueOf(strF))) {
                LiveAllDataRightSideAdapterSearch.this.f27429f.startActivity(new Intent(LiveAllDataRightSideAdapterSearch.this.f27429f, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            c.f.a.c.d.l lVar = new c.f.a.c.d.l(1);
            lVar.N("com.google.android.gms.cast.metadata.TITLE", this.f27448d);
            lVar.b(new c.f.a.c.f.p.a(Uri.parse(this.f27449e)));
            LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch3 = LiveAllDataRightSideAdapterSearch.this;
            c.h.a.h.m.a.b(liveAllDataRightSideAdapterSearch3.r, liveAllDataRightSideAdapterSearch3.p.p(), strF, lVar, LiveAllDataRightSideAdapterSearch.this.f27429f);
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27456f;

        public e(String str, int i2, String str2, String str3, String str4) {
            this.f27452b = str;
            this.f27453c = i2;
            this.f27454d = str2;
            this.f27455e = str3;
            this.f27456f = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = LiveAllDataRightSideAdapterSearch.this;
                liveAllDataRightSideAdapterSearch.p = c.f.a.c.d.u.b.e(liveAllDataRightSideAdapterSearch.f27429f).c().c();
            } catch (Exception unused) {
            }
            if (LiveAllDataRightSideAdapterSearch.this.p == null || !LiveAllDataRightSideAdapterSearch.this.p.c()) {
                LiveAllDataRightSideAdapterSearch.this.D0(this.f27453c, this.f27456f, this.f27452b);
                return;
            }
            if (LiveAllDataRightSideAdapterSearch.this.p != null && LiveAllDataRightSideAdapterSearch.this.p.p() != null && LiveAllDataRightSideAdapterSearch.this.p.p().j() != null && LiveAllDataRightSideAdapterSearch.this.p.p().j().K() != null) {
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch2 = LiveAllDataRightSideAdapterSearch.this;
                liveAllDataRightSideAdapterSearch2.q = liveAllDataRightSideAdapterSearch2.p.p().j().K();
            }
            String strF = m.f(LiveAllDataRightSideAdapterSearch.this.f27429f).equals("m3u") ? this.f27452b : c.h.a.h.n.e.F(LiveAllDataRightSideAdapterSearch.this.f27429f, this.f27453c, "m3u8", "live");
            if (LiveAllDataRightSideAdapterSearch.this.q.contains(String.valueOf(strF))) {
                LiveAllDataRightSideAdapterSearch.this.f27429f.startActivity(new Intent(LiveAllDataRightSideAdapterSearch.this.f27429f, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            c.f.a.c.d.l lVar = new c.f.a.c.d.l(1);
            lVar.N("com.google.android.gms.cast.metadata.TITLE", this.f27454d);
            lVar.b(new c.f.a.c.f.p.a(Uri.parse(this.f27455e)));
            LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch3 = LiveAllDataRightSideAdapterSearch.this;
            c.h.a.h.m.a.b(liveAllDataRightSideAdapterSearch3.r, liveAllDataRightSideAdapterSearch3.p.p(), strF, lVar, LiveAllDataRightSideAdapterSearch.this.f27429f);
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27462f;

        public f(String str, int i2, String str2, String str3, String str4) {
            this.f27458b = str;
            this.f27459c = i2;
            this.f27460d = str2;
            this.f27461e = str3;
            this.f27462f = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = LiveAllDataRightSideAdapterSearch.this;
                liveAllDataRightSideAdapterSearch.p = c.f.a.c.d.u.b.e(liveAllDataRightSideAdapterSearch.f27429f).c().c();
            } catch (Exception unused) {
            }
            if (LiveAllDataRightSideAdapterSearch.this.p == null || !LiveAllDataRightSideAdapterSearch.this.p.c()) {
                LiveAllDataRightSideAdapterSearch.this.D0(this.f27459c, this.f27462f, this.f27458b);
                return;
            }
            if (LiveAllDataRightSideAdapterSearch.this.p != null && LiveAllDataRightSideAdapterSearch.this.p.p() != null && LiveAllDataRightSideAdapterSearch.this.p.p().j() != null && LiveAllDataRightSideAdapterSearch.this.p.p().j().K() != null) {
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch2 = LiveAllDataRightSideAdapterSearch.this;
                liveAllDataRightSideAdapterSearch2.q = liveAllDataRightSideAdapterSearch2.p.p().j().K();
            }
            String strF = m.f(LiveAllDataRightSideAdapterSearch.this.f27429f).equals("m3u") ? this.f27458b : c.h.a.h.n.e.F(LiveAllDataRightSideAdapterSearch.this.f27429f, this.f27459c, "m3u8", "live");
            if (LiveAllDataRightSideAdapterSearch.this.q.contains(String.valueOf(strF))) {
                LiveAllDataRightSideAdapterSearch.this.f27429f.startActivity(new Intent(LiveAllDataRightSideAdapterSearch.this.f27429f, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            c.f.a.c.d.l lVar = new c.f.a.c.d.l(1);
            lVar.N("com.google.android.gms.cast.metadata.TITLE", this.f27460d);
            lVar.b(new c.f.a.c.f.p.a(Uri.parse(this.f27461e)));
            LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch3 = LiveAllDataRightSideAdapterSearch.this;
            c.h.a.h.m.a.b(liveAllDataRightSideAdapterSearch3.r, liveAllDataRightSideAdapterSearch3.p.p(), strF, lVar, LiveAllDataRightSideAdapterSearch.this.f27429f);
        }
    }

    public class g implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f27466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f27469g;

        public g(String str, ViewHolder viewHolder, int i2, int i3, String str2, int i4) {
            this.f27464b = str;
            this.f27465c = viewHolder;
            this.f27466d = i2;
            this.f27467e = i3;
            this.f27468f = str2;
            this.f27469g = i4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (m.f(LiveAllDataRightSideAdapterSearch.this.f27429f).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = LiveAllDataRightSideAdapterSearch.this.t.U(this.f27464b, m.z(LiveAllDataRightSideAdapterSearch.this.f27429f));
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = LiveAllDataRightSideAdapterSearch.this;
                liveAllDataRightSideAdapterSearch.x0(arrayListU, this.f27465c, this.f27466d, liveAllDataRightSideAdapterSearch.f27428e);
                return true;
            }
            ArrayList<c.h.a.i.b> arrayListL = LiveAllDataRightSideAdapterSearch.this.f27431h.l(this.f27467e, this.f27468f, "live", m.z(LiveAllDataRightSideAdapterSearch.this.f27429f));
            LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch2 = LiveAllDataRightSideAdapterSearch.this;
            liveAllDataRightSideAdapterSearch2.w0(arrayListL, this.f27465c, this.f27466d, liveAllDataRightSideAdapterSearch2.f27428e, this.f27469g, this.f27465c.Movie);
            return true;
        }
    }

    public class h implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f27473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f27476g;

        public h(String str, ViewHolder viewHolder, int i2, int i3, String str2, int i4) {
            this.f27471b = str;
            this.f27472c = viewHolder;
            this.f27473d = i2;
            this.f27474e = i3;
            this.f27475f = str2;
            this.f27476g = i4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (m.f(LiveAllDataRightSideAdapterSearch.this.f27429f).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = LiveAllDataRightSideAdapterSearch.this.t.U(this.f27471b, m.z(LiveAllDataRightSideAdapterSearch.this.f27429f));
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = LiveAllDataRightSideAdapterSearch.this;
                liveAllDataRightSideAdapterSearch.x0(arrayListU, this.f27472c, this.f27473d, liveAllDataRightSideAdapterSearch.f27428e);
                return true;
            }
            ArrayList<c.h.a.i.b> arrayListL = LiveAllDataRightSideAdapterSearch.this.f27431h.l(this.f27474e, this.f27475f, "live", m.z(LiveAllDataRightSideAdapterSearch.this.f27429f));
            LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch2 = LiveAllDataRightSideAdapterSearch.this;
            liveAllDataRightSideAdapterSearch2.w0(arrayListL, this.f27472c, this.f27473d, liveAllDataRightSideAdapterSearch2.f27428e, this.f27476g, this.f27472c.Movie);
            return true;
        }
    }

    public class i implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f27480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f27483g;

        public i(String str, ViewHolder viewHolder, int i2, int i3, String str2, int i4) {
            this.f27478b = str;
            this.f27479c = viewHolder;
            this.f27480d = i2;
            this.f27481e = i3;
            this.f27482f = str2;
            this.f27483g = i4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (m.f(LiveAllDataRightSideAdapterSearch.this.f27429f).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = LiveAllDataRightSideAdapterSearch.this.t.U(this.f27478b, m.z(LiveAllDataRightSideAdapterSearch.this.f27429f));
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = LiveAllDataRightSideAdapterSearch.this;
                liveAllDataRightSideAdapterSearch.x0(arrayListU, this.f27479c, this.f27480d, liveAllDataRightSideAdapterSearch.f27428e);
                return true;
            }
            ArrayList<c.h.a.i.b> arrayListL = LiveAllDataRightSideAdapterSearch.this.f27431h.l(this.f27481e, this.f27482f, "live", m.z(LiveAllDataRightSideAdapterSearch.this.f27429f));
            LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch2 = LiveAllDataRightSideAdapterSearch.this;
            liveAllDataRightSideAdapterSearch2.w0(arrayListL, this.f27479c, this.f27480d, liveAllDataRightSideAdapterSearch2.f27428e, this.f27483g, this.f27479c.Movie);
            return true;
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class j extends AsyncTask<String, Void, String> {
        public j() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return LiveAllDataRightSideAdapterSearch.this.y0(strArr[1]);
            } catch (Exception unused) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            LiveAllDataRightSideAdapterSearch.this.A0();
            LiveAllDataRightSideAdapterSearch.this.W();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27486b;

        public k(int i2) {
            this.f27486b = 0;
            this.f27486b = i2;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            LiveAllDataRightSideAdapterSearch.this.f27437n = z ? this.f27486b : -1;
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class l extends AsyncTask<String, Void, Boolean> {
        public l() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return LiveAllDataRightSideAdapterSearch.this.B0();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            LiveAllDataRightSideAdapterSearch.this.G0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            LiveAllDataRightSideAdapterSearch.this.H0();
            super.onPreExecute();
        }
    }

    public LiveAllDataRightSideAdapterSearch(Context context, ArrayList<c.h.a.i.f> arrayList) {
        this.f27433j = "mobile";
        this.f27429f = context;
        this.f27428e = arrayList;
        this.f27431h = new c.h.a.i.q.a(context);
        this.f27432i = AnimationUtils.loadAnimation(context, R.anim.bounce);
        this.t = new c.h.a.i.q.f(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("currentlyPlayingVideo", 0);
        this.D = sharedPreferences;
        this.C = sharedPreferences.edit();
        if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0)) {
            this.f27433j = "tv";
        } else {
            this.f27433j = "mobile";
        }
        this.r = new Handler(Looper.getMainLooper());
        if (this.f27433j.equals("mobile")) {
            try {
                this.p = c.f.a.c.d.u.b.e(context).c().c();
            } catch (Exception unused) {
            }
        }
    }

    public final void A0() {
        ProgressDialog progressDialog = this.f27435l;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f27435l.dismiss();
    }

    public final Boolean B0() {
        try {
            if (this.f27429f != null) {
                ArrayList<c.h.a.i.e> arrayList = this.s;
                if (arrayList != null) {
                    arrayList.clear();
                }
                this.s = this.t.o1();
                c.h.a.i.e eVar = new c.h.a.i.e();
                c.h.a.i.e eVar2 = new c.h.a.i.e();
                c.h.a.i.e eVar3 = new c.h.a.i.e();
                int iQ1 = this.t.Q1("live");
                eVar.g("0");
                eVar.h(this.f27429f.getResources().getString(R.string.all));
                eVar.i(iQ1);
                eVar2.g("-1");
                eVar2.h(this.f27429f.getResources().getString(R.string.favourites));
                int iT1 = this.t.T1("-2", "live");
                this.u = iT1;
                if (iT1 != 0 && iT1 > 0) {
                    eVar3.g("-2");
                    eVar3.h(this.f27429f.getResources().getString(R.string.uncategories));
                    eVar3.i(this.u);
                    ArrayList<c.h.a.i.e> arrayList2 = this.s;
                    arrayList2.add(arrayList2.size(), eVar3);
                }
                this.s.add(0, eVar);
                this.s.add(1, eVar2);
            }
            return Boolean.TRUE;
        } catch (NullPointerException unused) {
            return Boolean.FALSE;
        } catch (Exception unused2) {
            return Boolean.FALSE;
        }
    }

    public final void C0() {
        new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public final void D0(int i2, String str, String str2) {
        this.y = str;
        this.A = i2;
        this.B = str2;
        C0();
    }

    public final void E0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList, int i3) {
        this.f27431h.o(c.h.a.h.n.e.S(arrayList.get(i2).Y()), arrayList.get(i2).g(), "live", arrayList.get(i2).getName(), m.z(this.f27429f));
        ((ViewHolder) e0Var).ivFavourite.setVisibility(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x014b A[Catch: Exception -> 0x021b, TryCatch #0 {Exception -> 0x021b, blocks: (B:3:0x0020, B:5:0x0024, B:7:0x002a, B:9:0x002e, B:11:0x0046, B:12:0x0049, B:14:0x004f, B:16:0x0055, B:18:0x005b, B:19:0x005e, B:21:0x0064, B:25:0x0071, B:27:0x0077, B:29:0x007e, B:31:0x0084, B:33:0x008b, B:35:0x0091, B:37:0x0098, B:39:0x00ae, B:41:0x00bb, B:49:0x013c, B:51:0x014b, B:53:0x015d, B:58:0x017e, B:60:0x0200, B:62:0x0204, B:54:0x0163, B:55:0x0169, B:48:0x0111, B:47:0x010b, B:46:0x00e1, B:40:0x00b4, B:63:0x0211, B:44:0x00c4), top: B:66:0x0020, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169 A[Catch: Exception -> 0x021b, TryCatch #0 {Exception -> 0x021b, blocks: (B:3:0x0020, B:5:0x0024, B:7:0x002a, B:9:0x002e, B:11:0x0046, B:12:0x0049, B:14:0x004f, B:16:0x0055, B:18:0x005b, B:19:0x005e, B:21:0x0064, B:25:0x0071, B:27:0x0077, B:29:0x007e, B:31:0x0084, B:33:0x008b, B:35:0x0091, B:37:0x0098, B:39:0x00ae, B:41:0x00bb, B:49:0x013c, B:51:0x014b, B:53:0x015d, B:58:0x017e, B:60:0x0200, B:62:0x0204, B:54:0x0163, B:55:0x0169, B:48:0x0111, B:47:0x010b, B:46:0x00e1, B:40:0x00b4, B:63:0x0211, B:44:0x00c4), top: B:66:0x0020, inners: #2 }] */
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
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.LiveAllDataRightSideAdapterSearch.F(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    public final void F0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList) {
        this.t.I0(arrayList.get(i2).e0(), m.z(this.f27429f));
        ((ViewHolder) e0Var).ivFavourite.setVisibility(4);
    }

    public final void G0() {
        ArrayList<c.h.a.i.e> arrayList = this.s;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList<c.h.a.i.e> arrayList2 = this.w;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<c.h.a.i.e> arrayList3 = new ArrayList<>();
        this.w = arrayList3;
        arrayList3.addAll(this.s);
        int i2 = 0;
        while (true) {
            if (i2 >= this.s.size()) {
                break;
            }
            if (this.y.equals(String.valueOf(this.s.get(i2).b()))) {
                this.z = this.s.get(i2).c();
                break;
            }
            i2++;
        }
        ArrayList<c.h.a.i.e> arrayList4 = this.w;
        if (arrayList4 == null || arrayList4.size() <= 0) {
            return;
        }
        p.b().i(this.w);
        c.h.a.h.n.e.f17065g = new j().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", this.y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.e0 H(@NotNull ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        if (this.f27433j.equals("tv")) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.live_all_data_right_adapter_tv;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.live_all_data_right_adapter;
        }
        return new ViewHolder(layoutInflaterFrom.inflate(i3, viewGroup, false));
    }

    public final void H0() {
        ProgressDialog progressDialog = new ProgressDialog(this.f27429f);
        this.f27435l = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.f27435l.setMessage(this.f27429f.getResources().getString(R.string.please_wait));
        this.f27435l.show();
    }

    public void W() {
        try {
            int iZ0 = m.f(this.f27429f).equals("m3u") ? z0(this.B, "m3u") : z0(String.valueOf(this.A), "api");
            if (!this.f27433j.equals("tv")) {
                ArrayList<c.h.a.i.f> arrayList = this.x;
                if (arrayList == null || arrayList.size() <= 0) {
                    p.b().j(null);
                    return;
                } else {
                    p.b().j(this.x);
                    c.h.a.h.n.e.X(this.f27429f, "Built-in Player ( Default )", this.A, "live", iZ0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, this.y, this.B, this.z);
                    return;
                }
            }
            String strL = m.l(this.f27429f);
            Intent intent = (strL == null || !strL.equalsIgnoreCase("default_native")) ? new Intent(this.f27429f, (Class<?>) NSTIJKPlayerSkyTvActivity.class) : new Intent(this.f27429f, (Class<?>) NSTEXOPlayerSkyTvActivity.class);
            intent.putExtra("OPENED_STREAM_ID", this.A);
            intent.putExtra("VIDEO_NUM", iZ0);
            intent.putExtra("OPENED_CAT_ID", this.y);
            intent.putExtra("VIDEO_URL", this.B);
            intent.putExtra("OPENED_CAT_NAME", this.z);
            intent.putExtra("FROM_SEARCH", "true");
            this.f27429f.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        ArrayList<c.h.a.i.f> arrayList = this.f27428e;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f27428e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return 0;
    }

    public final void u0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList, int i3) {
        ViewHolder viewHolder = (ViewHolder) e0Var;
        c.h.a.i.b bVar = new c.h.a.i.b();
        bVar.h(arrayList.get(i2).g());
        bVar.m(c.h.a.h.n.e.S(arrayList.get(i2).Y()));
        bVar.k(arrayList.get(i2).getName());
        bVar.l(arrayList.get(i2).P());
        bVar.o(m.z(this.f27429f));
        this.f27431h.i(bVar, "live");
        viewHolder.ivFavourite.startAnimation(this.f27432i);
        viewHolder.ivFavourite.setVisibility(0);
    }

    public final void v0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList) {
        ViewHolder viewHolder = (ViewHolder) e0Var;
        c.h.a.i.c cVar = new c.h.a.i.c();
        cVar.h(arrayList.get(i2).e0());
        cVar.i(m.z(this.f27429f));
        cVar.g(arrayList.get(i2).getName());
        cVar.e(arrayList.get(i2).g());
        this.t.Q(cVar);
        viewHolder.ivFavourite.startAnimation(this.f27432i);
        viewHolder.ivFavourite.setVisibility(0);
    }

    public final void w0(ArrayList<c.h.a.i.b> arrayList, RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList2, int i3, RelativeLayout relativeLayout) {
        if (arrayList.size() > 0) {
            E0(e0Var, i2, arrayList2, i3);
        } else {
            u0(e0Var, i2, arrayList2, i3);
        }
        this.f27436m = true;
        Context context = this.f27429f;
        if (context instanceof LiveAllDataSingleActivity) {
            ((LiveAllDataSingleActivity) context).l1();
        }
    }

    public final void x0(ArrayList<c.h.a.i.c> arrayList, RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList2) {
        if (arrayList.size() > 0) {
            F0(e0Var, i2, arrayList2);
        } else {
            v0(e0Var, i2, arrayList2);
        }
        this.f27436m = true;
        Context context = this.f27429f;
        if (context instanceof LiveAllDataSingleActivity) {
            ((LiveAllDataSingleActivity) context).l1();
        }
    }

    public String y0(String str) {
        try {
            this.x = this.t.W0(str, "live");
            return "get_all";
        } catch (Exception unused) {
            return "get_all";
        }
    }

    public int z0(String str, String str2) {
        ArrayList<c.h.a.i.f> arrayList = this.x;
        if (arrayList != null && arrayList.size() > 0) {
            if (str2.equals("m3u")) {
                for (int i2 = 0; i2 < this.x.size(); i2++) {
                    if (this.x.get(i2).e0().equals(str)) {
                        return i2;
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.x.size(); i3++) {
                    if (this.x.get(i3).Y().equals(str)) {
                        return i3;
                    }
                }
            }
        }
        return 0;
    }
}
