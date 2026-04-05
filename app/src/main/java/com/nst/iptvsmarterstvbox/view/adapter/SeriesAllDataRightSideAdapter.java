package minefarts.iptvsmarters.view.adapter;

import a.b.q.j0;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
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
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import minefarts.iptvsmarters.model.callback.GetEpisdoeDetailsCallback;
import minefarts.iptvsmarters.model.callback.SeasonsDetailCallback;
import minefarts.iptvsmarters.model.callback.SeriesDBModel;
import minefarts.iptvsmarters.model.pojo.ExternalPlayerModelClass;
import minefarts.iptvsmarters.view.activity.PlayExternalPlayerActivity;
import minefarts.iptvsmarters.view.activity.SeriesAllDataSingleActivity;
import minefarts.iptvsmarters.view.activity.SeriesDetailActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesAllDataRightSideAdapter extends RecyclerView.h<RecyclerView.e0> implements Filterable, c.h.a.k.f.k {
    public ProgressDialog H;
    public c.h.a.k.a.m I;
    public c.h.a.i.q.f M;
    public View N;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f27953i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.a f27955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animation f27956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f27957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x f27958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y f27959o;
    public c.f.a.c.d.u.d p;
    public String q;
    public SharedPreferences r;
    public c.h.a.j.g s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f27954j = Boolean.FALSE;
    public ArrayList<GetEpisdoeDetailsCallback> t = new ArrayList<>();
    public ArrayList<SeasonsDetailCallback> u = new ArrayList<>();
    public String v = BuildConfig.FLAVOR;
    public String w = BuildConfig.FLAVOR;
    public String x = BuildConfig.FLAVOR;
    public String y = BuildConfig.FLAVOR;
    public String z = BuildConfig.FLAVOR;
    public String A = BuildConfig.FLAVOR;
    public String B = BuildConfig.FLAVOR;
    public String C = BuildConfig.FLAVOR;
    public String D = "0";
    public int E = 0;
    public String F = BuildConfig.FLAVOR;
    public String G = "0";
    public boolean J = false;
    public int K = -1;
    public ArrayList<GetEpisdoeDetailsCallback> L = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<SeriesDBModel> f27949e = c.h.a.i.m.b().d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<SeriesDBModel> f27950f = c.h.a.i.m.b().d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<GetEpisdoeDetailsCallback> f27951g = c.h.a.i.m.b().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<GetEpisdoeDetailsCallback> f27952h = c.h.a.i.m.b().a();

    public static class ContinueWatchingViewHolder extends RecyclerView.e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView SeriesAndEpisode;

        @BindView
        public TextView SeriesName;

        @BindView
        public CardView cardView;

        @BindView
        public CardView cv_rating;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout ll_pb_recent_watch;

        @BindView
        public ProgressBar pb_recent_watch;

        @BindView
        public TextView tv_rating;

        public ContinueWatchingViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
        }
    }

    public class ContinueWatchingViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ContinueWatchingViewHolder f27960b;

        public ContinueWatchingViewHolder_ViewBinding(ContinueWatchingViewHolder continueWatchingViewHolder, View view) {
            this.f27960b = continueWatchingViewHolder;
            continueWatchingViewHolder.SeriesName = (TextView) b.c.c.c(view, R.id.tv_series_name, "field 'SeriesName'", TextView.class);
            continueWatchingViewHolder.SeriesAndEpisode = (TextView) b.c.c.c(view, R.id.tv_season_and_episode, "field 'SeriesAndEpisode'", TextView.class);
            continueWatchingViewHolder.Movie = (RelativeLayout) b.c.c.c(view, R.id.rl_movie, "field 'Movie'", RelativeLayout.class);
            continueWatchingViewHolder.MovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'MovieImage'", ImageView.class);
            continueWatchingViewHolder.cardView = (CardView) b.c.c.c(view, R.id.card_view, "field 'cardView'", CardView.class);
            continueWatchingViewHolder.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
            continueWatchingViewHolder.ll_pb_recent_watch = (LinearLayout) b.c.c.c(view, R.id.ll_pb_recent_watch, "field 'll_pb_recent_watch'", LinearLayout.class);
            continueWatchingViewHolder.pb_recent_watch = (ProgressBar) b.c.c.c(view, R.id.pb_recent_watch, "field 'pb_recent_watch'", ProgressBar.class);
            continueWatchingViewHolder.cv_rating = (CardView) b.c.c.c(view, R.id.cv_rating, "field 'cv_rating'", CardView.class);
            continueWatchingViewHolder.tv_rating = (TextView) b.c.c.c(view, R.id.tv_rating, "field 'tv_rating'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            ContinueWatchingViewHolder continueWatchingViewHolder = this.f27960b;
            if (continueWatchingViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27960b = null;
            continueWatchingViewHolder.SeriesName = null;
            continueWatchingViewHolder.SeriesAndEpisode = null;
            continueWatchingViewHolder.Movie = null;
            continueWatchingViewHolder.MovieImage = null;
            continueWatchingViewHolder.cardView = null;
            continueWatchingViewHolder.ivFavourite = null;
            continueWatchingViewHolder.ll_pb_recent_watch = null;
            continueWatchingViewHolder.pb_recent_watch = null;
            continueWatchingViewHolder.cv_rating = null;
            continueWatchingViewHolder.tv_rating = null;
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
        public CardView cv_rating;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public TextView tvStreamOptions;

        @BindView
        public TextView tv_rating;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewHolder f27961b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f27961b = viewHolder;
            viewHolder.SeriesName = (TextView) b.c.c.c(view, R.id.tv_series_name, "field 'SeriesName'", TextView.class);
            viewHolder.Movie = (RelativeLayout) b.c.c.c(view, R.id.rl_movie, "field 'Movie'", RelativeLayout.class);
            viewHolder.MovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'MovieImage'", ImageView.class);
            viewHolder.cardView = (CardView) b.c.c.c(view, R.id.card_view, "field 'cardView'", CardView.class);
            viewHolder.tvStreamOptions = (TextView) b.c.c.c(view, R.id.tv_streamOptions, "field 'tvStreamOptions'", TextView.class);
            viewHolder.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
            viewHolder.llMenu = (LinearLayout) b.c.c.c(view, R.id.ll_menu, "field 'llMenu'", LinearLayout.class);
            viewHolder.cv_rating = (CardView) b.c.c.c(view, R.id.cv_rating, "field 'cv_rating'", CardView.class);
            viewHolder.tv_rating = (TextView) b.c.c.c(view, R.id.tv_rating, "field 'tv_rating'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            ViewHolder viewHolder = this.f27961b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27961b = null;
            viewHolder.SeriesName = null;
            viewHolder.Movie = null;
            viewHolder.MovieImage = null;
            viewHolder.cardView = null;
            viewHolder.tvStreamOptions = null;
            viewHolder.ivFavourite = null;
            viewHolder.llMenu = null;
            viewHolder.cv_rating = null;
            viewHolder.tv_rating = null;
        }
    }

    public class a implements c.k.b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ContinueWatchingViewHolder f27962a;

        /* JADX INFO: renamed from: minefarts.iptvsmarters.view.adapter.SeriesAllDataRightSideAdapter$a$a, reason: collision with other inner class name */
        public class C0286a implements c.k.b.e {
            public C0286a() {
            }

            @Override // c.k.b.e
            public void a() {
            }

            @Override // c.k.b.e
            public void onSuccess() {
            }
        }

        public a(ContinueWatchingViewHolder continueWatchingViewHolder) {
            this.f27962a = continueWatchingViewHolder;
        }

        @Override // c.k.b.e
        public void a() {
            c.k.b.t.q(SeriesAllDataRightSideAdapter.this.f27953i).l(String.valueOf(SeriesAllDataRightSideAdapter.this.f27953i.getResources().getDrawable(R.drawable.rounded_edge_3))).e().a().h(this.f27962a.MovieImage, new C0286a());
            this.f27962a.SeriesName.setVisibility(0);
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class b implements c.k.b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27965a;

        public class a implements c.k.b.e {
            public a() {
            }

            @Override // c.k.b.e
            public void a() {
            }

            @Override // c.k.b.e
            public void onSuccess() {
            }
        }

        public b(ViewHolder viewHolder) {
            this.f27965a = viewHolder;
        }

        @Override // c.k.b.e
        public void a() {
            c.k.b.t.q(SeriesAllDataRightSideAdapter.this.f27953i).l(String.valueOf(SeriesAllDataRightSideAdapter.this.f27953i.getResources().getDrawable(R.drawable.rounded_edge_3))).e().a().h(this.f27965a.MovieImage, new a());
            this.f27965a.SeriesName.setVisibility(0);
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

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27974f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f27975g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27976h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27977i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27978j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f27979k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f27980l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f27981m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f27982n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f27983o;
        public final /* synthetic */ String p;
        public final /* synthetic */ String q;
        public final /* synthetic */ String r;
        public final /* synthetic */ String s;
        public final /* synthetic */ int t;

        public e(String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i3) {
            this.f27970b = str;
            this.f27971c = str2;
            this.f27972d = str3;
            this.f27973e = str4;
            this.f27974f = str5;
            this.f27975g = i2;
            this.f27976h = str6;
            this.f27977i = str7;
            this.f27978j = str8;
            this.f27979k = str9;
            this.f27980l = str10;
            this.f27981m = str11;
            this.f27982n = str12;
            this.f27983o = str13;
            this.p = str14;
            this.q = str15;
            this.r = str16;
            this.s = str17;
            this.t = i3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.h.a.i.q.m.f(SeriesAllDataRightSideAdapter.this.f27953i).equals("m3u")) {
                SeriesAllDataRightSideAdapter.this.T0(this.f27970b, this.f27971c, this.f27972d, view);
            } else {
                SeriesAllDataRightSideAdapter.this.a1(this.f27973e, this.f27971c, this.f27974f, this.f27975g, this.f27972d, this.f27976h, this.f27977i, this.f27978j, this.f27979k, this.f27980l, this.f27981m, this.f27982n, this.f27983o, this.p, this.q, this.r, this.s, this.t);
            }
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f27989g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27990h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27991i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27992j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f27993k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f27994l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f27995m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f27996n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f27997o;
        public final /* synthetic */ String p;
        public final /* synthetic */ String q;
        public final /* synthetic */ String r;
        public final /* synthetic */ String s;
        public final /* synthetic */ int t;

        public f(String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i3) {
            this.f27984b = str;
            this.f27985c = str2;
            this.f27986d = str3;
            this.f27987e = str4;
            this.f27988f = str5;
            this.f27989g = i2;
            this.f27990h = str6;
            this.f27991i = str7;
            this.f27992j = str8;
            this.f27993k = str9;
            this.f27994l = str10;
            this.f27995m = str11;
            this.f27996n = str12;
            this.f27997o = str13;
            this.p = str14;
            this.q = str15;
            this.r = str16;
            this.s = str17;
            this.t = i3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.h.a.i.q.m.f(SeriesAllDataRightSideAdapter.this.f27953i).equals("m3u")) {
                SeriesAllDataRightSideAdapter.this.T0(this.f27984b, this.f27985c, this.f27986d, view);
            } else {
                SeriesAllDataRightSideAdapter.this.a1(this.f27987e, this.f27985c, this.f27988f, this.f27989g, this.f27986d, this.f27990h, this.f27991i, this.f27992j, this.f27993k, this.f27994l, this.f27995m, this.f27996n, this.f27997o, this.p, this.q, this.r, this.s, this.t);
            }
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28002f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f28003g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28004h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28005i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28006j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f28007k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f28008l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f28009m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f28010n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f28011o;
        public final /* synthetic */ String p;
        public final /* synthetic */ String q;
        public final /* synthetic */ String r;
        public final /* synthetic */ String s;
        public final /* synthetic */ int t;

        public g(String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i3) {
            this.f27998b = str;
            this.f27999c = str2;
            this.f28000d = str3;
            this.f28001e = str4;
            this.f28002f = str5;
            this.f28003g = i2;
            this.f28004h = str6;
            this.f28005i = str7;
            this.f28006j = str8;
            this.f28007k = str9;
            this.f28008l = str10;
            this.f28009m = str11;
            this.f28010n = str12;
            this.f28011o = str13;
            this.p = str14;
            this.q = str15;
            this.r = str16;
            this.s = str17;
            this.t = i3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.h.a.i.q.m.f(SeriesAllDataRightSideAdapter.this.f27953i).equals("m3u")) {
                SeriesAllDataRightSideAdapter.this.T0(this.f27998b, this.f27999c, this.f28000d, view);
            } else {
                SeriesAllDataRightSideAdapter.this.a1(this.f28001e, this.f27999c, this.f28002f, this.f28003g, this.f28000d, this.f28004h, this.f28005i, this.f28006j, this.f28007k, this.f28008l, this.f28009m, this.f28010n, this.f28011o, this.p, this.q, this.r, this.s, this.t);
            }
        }
    }

    public class h implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f28013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f28015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28016f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f28017g;

        public h(String str, ViewHolder viewHolder, int i2, int i3, String str2, int i4) {
            this.f28012b = str;
            this.f28013c = viewHolder;
            this.f28014d = i2;
            this.f28015e = i3;
            this.f28016f = str2;
            this.f28017g = i4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (c.h.a.i.q.m.f(SeriesAllDataRightSideAdapter.this.f27953i).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = SeriesAllDataRightSideAdapter.this.M.U(this.f28012b, c.h.a.i.q.m.z(SeriesAllDataRightSideAdapter.this.f27953i));
                SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = SeriesAllDataRightSideAdapter.this;
                seriesAllDataRightSideAdapter.N0(arrayListU, this.f28013c, this.f28014d, seriesAllDataRightSideAdapter.f27950f);
                return true;
            }
            ArrayList<c.h.a.i.b> arrayListL = SeriesAllDataRightSideAdapter.this.f27955k.l(this.f28015e, this.f28016f, "series", c.h.a.i.q.m.z(SeriesAllDataRightSideAdapter.this.f27953i));
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter2 = SeriesAllDataRightSideAdapter.this;
            seriesAllDataRightSideAdapter2.M0(arrayListL, this.f28013c, this.f28014d, seriesAllDataRightSideAdapter2.f27950f, SeriesAllDataRightSideAdapter.this.f27952h, this.f28017g, this.f28013c.Movie);
            return true;
        }
    }

    public class i implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f28020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f28022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28023f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f28024g;

        public i(String str, ViewHolder viewHolder, int i2, int i3, String str2, int i4) {
            this.f28019b = str;
            this.f28020c = viewHolder;
            this.f28021d = i2;
            this.f28022e = i3;
            this.f28023f = str2;
            this.f28024g = i4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (c.h.a.i.q.m.f(SeriesAllDataRightSideAdapter.this.f27953i).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = SeriesAllDataRightSideAdapter.this.M.U(this.f28019b, c.h.a.i.q.m.z(SeriesAllDataRightSideAdapter.this.f27953i));
                SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = SeriesAllDataRightSideAdapter.this;
                seriesAllDataRightSideAdapter.N0(arrayListU, this.f28020c, this.f28021d, seriesAllDataRightSideAdapter.f27950f);
                return true;
            }
            ArrayList<c.h.a.i.b> arrayListL = SeriesAllDataRightSideAdapter.this.f27955k.l(this.f28022e, this.f28023f, "series", c.h.a.i.q.m.z(SeriesAllDataRightSideAdapter.this.f27953i));
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter2 = SeriesAllDataRightSideAdapter.this;
            seriesAllDataRightSideAdapter2.M0(arrayListL, this.f28020c, this.f28021d, seriesAllDataRightSideAdapter2.f27950f, SeriesAllDataRightSideAdapter.this.f27952h, this.f28024g, this.f28020c.Movie);
            return true;
        }
    }

    public class j implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f28027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f28029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f28031g;

        public j(String str, ViewHolder viewHolder, int i2, int i3, String str2, int i4) {
            this.f28026b = str;
            this.f28027c = viewHolder;
            this.f28028d = i2;
            this.f28029e = i3;
            this.f28030f = str2;
            this.f28031g = i4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (c.h.a.i.q.m.f(SeriesAllDataRightSideAdapter.this.f27953i).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = SeriesAllDataRightSideAdapter.this.M.U(this.f28026b, c.h.a.i.q.m.z(SeriesAllDataRightSideAdapter.this.f27953i));
                SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = SeriesAllDataRightSideAdapter.this;
                seriesAllDataRightSideAdapter.N0(arrayListU, this.f28027c, this.f28028d, seriesAllDataRightSideAdapter.f27950f);
                return true;
            }
            ArrayList<c.h.a.i.b> arrayListL = SeriesAllDataRightSideAdapter.this.f27955k.l(this.f28029e, this.f28030f, "series", c.h.a.i.q.m.z(SeriesAllDataRightSideAdapter.this.f27953i));
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter2 = SeriesAllDataRightSideAdapter.this;
            seriesAllDataRightSideAdapter2.M0(arrayListL, this.f28027c, this.f28028d, seriesAllDataRightSideAdapter2.f27950f, SeriesAllDataRightSideAdapter.this.f27952h, this.f28031g, this.f28027c.Movie);
            return true;
        }
    }

    public class k implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28034b;

        public k(ArrayList arrayList, String str) {
            this.f28033a = arrayList;
            this.f28034b = str;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f28033a;
                if (arrayList != null && arrayList.size() > 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < this.f28033a.size()) {
                            if (menuItem.getItemId() != i2) {
                                i2++;
                            } else if (menuItem.getItemId() == 0) {
                                c.h.a.h.n.e.V(SeriesAllDataRightSideAdapter.this.f27953i, BuildConfig.FLAVOR, 0, "series", SeriesAllDataRightSideAdapter.this.B, "0", SeriesAllDataRightSideAdapter.this.C, null, this.f28034b);
                            } else {
                                Intent intent = new Intent(SeriesAllDataRightSideAdapter.this.f27953i, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", this.f28034b);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f28033a.get(i2)).a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f28033a.get(i2)).b());
                                SeriesAllDataRightSideAdapter.this.f27953i.startActivity(intent);
                            }
                        }
                    }
                }
                break;
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public class l implements j0.c {
        public l() {
        }

        @Override // a.b.q.j0.c
        public void a(j0 j0Var) {
        }
    }

    public class m implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f28037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f28040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f28041e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SeriesAllDataRightSideAdapter.this.w();
            }
        }

        public class b extends Dialog implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Activity f28044b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public TextView f28045c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public TextView f28046d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public TextView f28047e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public LinearLayout f28048f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public LinearLayout f28049g;

            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (SeriesAllDataRightSideAdapter.this.f27953i instanceof SeriesAllDataSingleActivity) {
                        ((SeriesAllDataSingleActivity) SeriesAllDataRightSideAdapter.this.f27953i).l1();
                    }
                }
            }

            /* JADX INFO: renamed from: minefarts.iptvsmarters.view.adapter.SeriesAllDataRightSideAdapter$m$b$b, reason: collision with other inner class name */
            public class ViewOnFocusChangeListenerC0287b implements View.OnFocusChangeListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public View f28052b;

                public ViewOnFocusChangeListenerC0287b(View view) {
                    this.f28052b = view;
                }

                @Override // android.view.View.OnFocusChangeListener
                @SuppressLint({"ResourceType"})
                public void onFocusChange(View view, boolean z) {
                    int i2;
                    LinearLayout linearLayout;
                    if (z) {
                        View view2 = this.f28052b;
                        i2 = R.drawable.blue_btn_effect;
                        if (view2 == null || view2.getTag() == null || !this.f28052b.getTag().equals("1")) {
                            View view3 = this.f28052b;
                            if (view3 == null || view3.getTag() == null || !this.f28052b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = b.this.f28049g;
                        }
                        linearLayout = b.this.f28048f;
                    } else {
                        View view4 = this.f28052b;
                        i2 = R.drawable.black_button_dark;
                        if (view4 == null || view4.getTag() == null || !this.f28052b.getTag().equals("1")) {
                            View view5 = this.f28052b;
                            if (view5 == null || view5.getTag() == null || !this.f28052b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = b.this.f28049g;
                        }
                        linearLayout = b.this.f28048f;
                    }
                    linearLayout.setBackgroundResource(i2);
                }
            }

            public b(Activity activity) {
                super(activity);
                this.f28044b = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int id = view.getId();
                if (id == R.id.btn_no) {
                    dismiss();
                } else if (id == R.id.btn_yes) {
                    try {
                        SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = SeriesAllDataRightSideAdapter.this;
                        c.h.a.k.a.m mVar = seriesAllDataRightSideAdapter.I;
                        Context context = seriesAllDataRightSideAdapter.f27953i;
                        m mVar2 = m.this;
                        mVar.i(context, ((GetEpisdoeDetailsCallback) mVar2.f28040d.get(mVar2.f28038b)).r());
                        if (SeriesAllDataRightSideAdapter.this.f27953i instanceof SeriesAllDataSingleActivity) {
                            ((SeriesAllDataSingleActivity) SeriesAllDataRightSideAdapter.this.f27953i).q1();
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
                setContentView(new c.h.a.k.d.a.a(SeriesAllDataRightSideAdapter.this.f27953i).A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_alert_layout_tv : R.layout.custom_alert_layout);
                this.f28045c = (TextView) findViewById(R.id.btn_yes);
                this.f28046d = (TextView) findViewById(R.id.btn_no);
                this.f28048f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
                this.f28049g = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
                TextView textView = (TextView) findViewById(R.id.txt_dia);
                this.f28047e = textView;
                textView.setText(SeriesAllDataRightSideAdapter.this.f27953i.getResources().getString(R.string.you_want_to_remove_this_series_from_continue_watching));
                this.f28045c.setOnClickListener(this);
                this.f28046d.setOnClickListener(this);
                TextView textView2 = this.f28045c;
                textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0287b(textView2));
                TextView textView3 = this.f28046d;
                textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0287b(textView3));
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SeriesAllDataRightSideAdapter.this.w();
            }
        }

        public m(RecyclerView.e0 e0Var, int i2, ArrayList arrayList, List list, int i3) {
            this.f28037a = e0Var;
            this.f28038b = i2;
            this.f28039c = arrayList;
            this.f28040d = list;
            this.f28041e = i3;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.menu_remove_from_continue_watching) {
                new b((SeriesAllDataSingleActivity) SeriesAllDataRightSideAdapter.this.f27953i).show();
                return false;
            }
            if (itemId == R.id.nav_add_to_fav) {
                SeriesAllDataRightSideAdapter.this.K0(this.f28037a, this.f28038b, this.f28039c, this.f28040d, this.f28041e);
                new Handler().postDelayed(new a(), 300L);
                if (!(SeriesAllDataRightSideAdapter.this.f27953i instanceof SeriesAllDataSingleActivity)) {
                    return false;
                }
            } else {
                if (itemId != R.id.nav_remove_from_fav) {
                    return false;
                }
                SeriesAllDataRightSideAdapter.this.V0(this.f28037a, this.f28038b, this.f28039c, this.f28040d, this.f28041e);
                new Handler().postDelayed(new c(), 300L);
                if (!(SeriesAllDataRightSideAdapter.this.f27953i instanceof SeriesAllDataSingleActivity)) {
                    return false;
                }
            }
            ((SeriesAllDataSingleActivity) SeriesAllDataRightSideAdapter.this.f27953i).l1();
            return false;
        }
    }

    public class n implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28055a;

        public n(ArrayList arrayList) {
            this.f28055a = arrayList;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f28055a;
                if (arrayList != null && arrayList.size() > 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < this.f28055a.size()) {
                            if (menuItem.getItemId() != i2) {
                                i2++;
                            } else if (menuItem.getItemId() == 0) {
                                c.h.a.h.n.e.V(SeriesAllDataRightSideAdapter.this.f27953i, BuildConfig.FLAVOR, c.h.a.h.n.e.S(SeriesAllDataRightSideAdapter.this.D), "series", SeriesAllDataRightSideAdapter.this.B, "0", SeriesAllDataRightSideAdapter.this.C, null, BuildConfig.FLAVOR);
                            } else {
                                String strF = c.h.a.h.n.e.F(SeriesAllDataRightSideAdapter.this.f27953i, c.h.a.h.n.e.S(SeriesAllDataRightSideAdapter.this.D), SeriesAllDataRightSideAdapter.this.B, "series");
                                Intent intent = new Intent(SeriesAllDataRightSideAdapter.this.f27953i, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", strF);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f28055a.get(i2)).a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f28055a.get(i2)).b());
                                SeriesAllDataRightSideAdapter.this.f27953i.startActivity(intent);
                            }
                        }
                    }
                }
                break;
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public class o implements j0.c {
        public o() {
        }

        @Override // a.b.q.j0.c
        public void a(j0 j0Var) {
        }
    }

    public class p implements c.k.b.e {
        public p() {
        }

        @Override // c.k.b.e
        public void a() {
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class q implements c.k.b.e {
        public q() {
        }

        @Override // c.k.b.e
        public void a() {
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class r implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28065g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28066h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f28067i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28068j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f28069k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f28070l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f28071m;

        public r(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10, int i3) {
            this.f28060b = str;
            this.f28061c = str2;
            this.f28062d = str3;
            this.f28063e = str4;
            this.f28064f = str5;
            this.f28065g = str6;
            this.f28066h = str7;
            this.f28067i = i2;
            this.f28068j = str8;
            this.f28069k = str9;
            this.f28070l = str10;
            this.f28071m = i3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesAllDataRightSideAdapter.this.A = String.valueOf(this.f28060b);
            SeriesAllDataRightSideAdapter.this.z = this.f28061c;
            SeriesAllDataRightSideAdapter.this.y = this.f28062d;
            SeriesAllDataRightSideAdapter.this.w = this.f28063e;
            SeriesAllDataRightSideAdapter.this.D = this.f28064f;
            SeriesAllDataRightSideAdapter.this.C = this.f28065g;
            SeriesAllDataRightSideAdapter.this.B = this.f28066h;
            SeriesAllDataRightSideAdapter.this.E = this.f28067i;
            SeriesAllDataRightSideAdapter.this.F = this.f28068j;
            SeriesAllDataRightSideAdapter.this.G = this.f28069k;
            SeriesAllDataRightSideAdapter.this.x = this.f28070l;
            c.h.a.h.n.a.U = this.f28071m;
            SeriesAllDataRightSideAdapter.this.N = view;
            SeriesAllDataRightSideAdapter.this.S0();
        }
    }

    public class s implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28079h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f28080i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28081j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f28082k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f28083l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f28084m;

        public s(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10, int i3) {
            this.f28073b = str;
            this.f28074c = str2;
            this.f28075d = str3;
            this.f28076e = str4;
            this.f28077f = str5;
            this.f28078g = str6;
            this.f28079h = str7;
            this.f28080i = i2;
            this.f28081j = str8;
            this.f28082k = str9;
            this.f28083l = str10;
            this.f28084m = i3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesAllDataRightSideAdapter.this.A = String.valueOf(this.f28073b);
            SeriesAllDataRightSideAdapter.this.z = this.f28074c;
            SeriesAllDataRightSideAdapter.this.y = this.f28075d;
            SeriesAllDataRightSideAdapter.this.w = this.f28076e;
            SeriesAllDataRightSideAdapter.this.D = this.f28077f;
            SeriesAllDataRightSideAdapter.this.C = this.f28078g;
            SeriesAllDataRightSideAdapter.this.B = this.f28079h;
            SeriesAllDataRightSideAdapter.this.E = this.f28080i;
            SeriesAllDataRightSideAdapter.this.F = this.f28081j;
            SeriesAllDataRightSideAdapter.this.G = this.f28082k;
            SeriesAllDataRightSideAdapter.this.x = this.f28083l;
            c.h.a.h.n.a.U = this.f28084m;
            SeriesAllDataRightSideAdapter.this.N = view;
            SeriesAllDataRightSideAdapter.this.S0();
        }
    }

    public class t implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28092h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f28093i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28094j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f28095k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f28096l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f28097m;

        public t(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10, int i3) {
            this.f28086b = str;
            this.f28087c = str2;
            this.f28088d = str3;
            this.f28089e = str4;
            this.f28090f = str5;
            this.f28091g = str6;
            this.f28092h = str7;
            this.f28093i = i2;
            this.f28094j = str8;
            this.f28095k = str9;
            this.f28096l = str10;
            this.f28097m = i3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesAllDataRightSideAdapter.this.A = String.valueOf(this.f28086b);
            SeriesAllDataRightSideAdapter.this.z = this.f28087c;
            SeriesAllDataRightSideAdapter.this.y = this.f28088d;
            SeriesAllDataRightSideAdapter.this.w = this.f28089e;
            SeriesAllDataRightSideAdapter.this.D = this.f28090f;
            SeriesAllDataRightSideAdapter.this.C = this.f28091g;
            SeriesAllDataRightSideAdapter.this.B = this.f28092h;
            SeriesAllDataRightSideAdapter.this.E = this.f28093i;
            SeriesAllDataRightSideAdapter.this.F = this.f28094j;
            SeriesAllDataRightSideAdapter.this.G = this.f28095k;
            SeriesAllDataRightSideAdapter.this.x = this.f28096l;
            c.h.a.h.n.a.U = this.f28097m;
            SeriesAllDataRightSideAdapter.this.N = view;
            SeriesAllDataRightSideAdapter.this.S0();
        }
    }

    public class u implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ContinueWatchingViewHolder f28099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28101d;

        public u(ContinueWatchingViewHolder continueWatchingViewHolder, int i2, int i3) {
            this.f28099b = continueWatchingViewHolder;
            this.f28100c = i2;
            this.f28101d = i3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = SeriesAllDataRightSideAdapter.this;
            seriesAllDataRightSideAdapter.U0(this.f28099b, this.f28100c, seriesAllDataRightSideAdapter.f27950f, SeriesAllDataRightSideAdapter.this.f27952h, this.f28101d);
            return true;
        }
    }

    public class v implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ContinueWatchingViewHolder f28103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28105d;

        public v(ContinueWatchingViewHolder continueWatchingViewHolder, int i2, int i3) {
            this.f28103b = continueWatchingViewHolder;
            this.f28104c = i2;
            this.f28105d = i3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = SeriesAllDataRightSideAdapter.this;
            seriesAllDataRightSideAdapter.U0(this.f28103b, this.f28104c, seriesAllDataRightSideAdapter.f27950f, SeriesAllDataRightSideAdapter.this.f27952h, this.f28105d);
            return true;
        }
    }

    public class w implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ContinueWatchingViewHolder f28107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28109d;

        public w(ContinueWatchingViewHolder continueWatchingViewHolder, int i2, int i3) {
            this.f28107b = continueWatchingViewHolder;
            this.f28108c = i2;
            this.f28109d = i3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = SeriesAllDataRightSideAdapter.this;
            seriesAllDataRightSideAdapter.U0(this.f28107b, this.f28108c, seriesAllDataRightSideAdapter.f27950f, SeriesAllDataRightSideAdapter.this.f27952h, this.f28109d);
            return true;
        }
    }

    public class x extends Filter {
        public x() {
        }

        public /* synthetic */ x(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = SeriesAllDataRightSideAdapter.this.f27949e;
            if (arrayList == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                SeriesDBModel seriesDBModel = (SeriesDBModel) arrayList.get(i2);
                if (seriesDBModel.d().toLowerCase().contains(lowerCase) || seriesDBModel.d().contains(lowerCase)) {
                    arrayList2.add(seriesDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                SeriesAllDataRightSideAdapter.this.f27950f = (ArrayList) filterResults.values;
                if (SeriesAllDataRightSideAdapter.this.f27950f != null) {
                    SeriesAllDataRightSideAdapter.this.w();
                    if (SeriesAllDataRightSideAdapter.this.f27950f == null || SeriesAllDataRightSideAdapter.this.f27950f.size() != 0) {
                        ((SeriesAllDataSingleActivity) SeriesAllDataRightSideAdapter.this.f27953i).y1();
                        ((SeriesAllDataSingleActivity) SeriesAllDataRightSideAdapter.this.f27953i).Z0();
                    } else {
                        ((SeriesAllDataSingleActivity) SeriesAllDataRightSideAdapter.this.f27953i).b1();
                        ((SeriesAllDataSingleActivity) SeriesAllDataRightSideAdapter.this.f27953i).w1(SeriesAllDataRightSideAdapter.this.f27953i.getResources().getString(R.string.no_series_found));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class y extends Filter {
        public y() {
        }

        public /* synthetic */ y(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            List list = SeriesAllDataRightSideAdapter.this.f27951g;
            if (list == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = (GetEpisdoeDetailsCallback) list.get(i2);
                if (getEpisdoeDetailsCallback.s().toLowerCase().contains(lowerCase) || getEpisdoeDetailsCallback.s().contains(lowerCase)) {
                    arrayList.add(getEpisdoeDetailsCallback);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                SeriesAllDataRightSideAdapter.this.f27952h = (List) filterResults.values;
                if (SeriesAllDataRightSideAdapter.this.f27952h != null) {
                    SeriesAllDataRightSideAdapter.this.w();
                    if (SeriesAllDataRightSideAdapter.this.f27952h.size() == 0) {
                        ((SeriesAllDataSingleActivity) SeriesAllDataRightSideAdapter.this.f27953i).b1();
                        ((SeriesAllDataSingleActivity) SeriesAllDataRightSideAdapter.this.f27953i).w1(SeriesAllDataRightSideAdapter.this.f27953i.getResources().getString(R.string.no_series_found));
                    } else {
                        ((SeriesAllDataSingleActivity) SeriesAllDataRightSideAdapter.this.f27953i).y1();
                        ((SeriesAllDataSingleActivity) SeriesAllDataRightSideAdapter.this.f27953i).Z0();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class z implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28113b;

        public z(int i2) {
            this.f28113b = 0;
            this.f28113b = i2;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            SeriesAllDataRightSideAdapter.this.K = z ? this.f28113b : -1;
        }
    }

    public SeriesAllDataRightSideAdapter(Context context, String str) {
        this.f27957m = BuildConfig.FLAVOR;
        a aVar = null;
        this.f27958n = new x(this, aVar);
        this.f27959o = new y(this, aVar);
        this.q = "mobile";
        this.f27953i = context;
        this.f27955k = new c.h.a.i.q.a(context);
        this.M = new c.h.a.i.q.f(context);
        this.f27956l = AnimationUtils.loadAnimation(context, R.anim.bounce);
        this.f27957m = str;
        this.r = context.getSharedPreferences("loginPrefs", 0);
        this.s = new c.h.a.j.g(context, this);
        this.I = new c.h.a.k.a.m(context);
        if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0)) {
            this.q = "tv";
        } else {
            this.q = "mobile";
        }
        if (this.q.equals("mobile")) {
            try {
                this.p = c.f.a.c.d.u.b.e(context).c().c();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x04b0 A[Catch: Exception -> 0x02b5, TryCatch #7 {Exception -> 0x02b5, blocks: (B:5:0x0024, B:7:0x0028, B:9:0x002e, B:11:0x0032, B:13:0x0103, B:14:0x0106, B:27:0x0131, B:28:0x013c, B:35:0x01c3, B:37:0x01d9, B:39:0x01e7, B:43:0x0277, B:45:0x0295, B:47:0x0299, B:50:0x02ab, B:38:0x01e0, B:34:0x0193, B:33:0x018e, B:32:0x015f, B:15:0x010a, B:53:0x02be, B:55:0x02c2, B:57:0x02c8, B:59:0x02cc, B:61:0x02da, B:63:0x02e3, B:65:0x02e9, B:67:0x02ef, B:69:0x02f5, B:71:0x02fe, B:73:0x0305, B:75:0x030c, B:77:0x0312, B:79:0x0319, B:81:0x031f, B:83:0x0328, B:85:0x032e, B:87:0x0337, B:89:0x033d, B:91:0x0346, B:93:0x034c, B:95:0x0355, B:97:0x035b, B:99:0x0364, B:101:0x036a, B:103:0x0373, B:105:0x0379, B:107:0x037f, B:109:0x0385, B:111:0x038e, B:113:0x0394, B:115:0x039d, B:117:0x03a3, B:119:0x03ac, B:121:0x03b2, B:123:0x03bb, B:125:0x03c1, B:127:0x03ca, B:129:0x03d0, B:131:0x03d6, B:133:0x03e5, B:134:0x03e8, B:137:0x03f3, B:139:0x03f9, B:141:0x0401, B:142:0x0409, B:144:0x0412, B:151:0x049a, B:153:0x04b0, B:155:0x04c2, B:156:0x04c5, B:163:0x04f3, B:157:0x04c9, B:159:0x04d1, B:161:0x04e5, B:162:0x04ec, B:150:0x0469, B:149:0x0465, B:148:0x0435, B:143:0x040d, B:135:0x03ec, B:30:0x0142, B:146:0x0418), top: B:193:0x001e, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04d1 A[Catch: Exception -> 0x02b5, TryCatch #7 {Exception -> 0x02b5, blocks: (B:5:0x0024, B:7:0x0028, B:9:0x002e, B:11:0x0032, B:13:0x0103, B:14:0x0106, B:27:0x0131, B:28:0x013c, B:35:0x01c3, B:37:0x01d9, B:39:0x01e7, B:43:0x0277, B:45:0x0295, B:47:0x0299, B:50:0x02ab, B:38:0x01e0, B:34:0x0193, B:33:0x018e, B:32:0x015f, B:15:0x010a, B:53:0x02be, B:55:0x02c2, B:57:0x02c8, B:59:0x02cc, B:61:0x02da, B:63:0x02e3, B:65:0x02e9, B:67:0x02ef, B:69:0x02f5, B:71:0x02fe, B:73:0x0305, B:75:0x030c, B:77:0x0312, B:79:0x0319, B:81:0x031f, B:83:0x0328, B:85:0x032e, B:87:0x0337, B:89:0x033d, B:91:0x0346, B:93:0x034c, B:95:0x0355, B:97:0x035b, B:99:0x0364, B:101:0x036a, B:103:0x0373, B:105:0x0379, B:107:0x037f, B:109:0x0385, B:111:0x038e, B:113:0x0394, B:115:0x039d, B:117:0x03a3, B:119:0x03ac, B:121:0x03b2, B:123:0x03bb, B:125:0x03c1, B:127:0x03ca, B:129:0x03d0, B:131:0x03d6, B:133:0x03e5, B:134:0x03e8, B:137:0x03f3, B:139:0x03f9, B:141:0x0401, B:142:0x0409, B:144:0x0412, B:151:0x049a, B:153:0x04b0, B:155:0x04c2, B:156:0x04c5, B:163:0x04f3, B:157:0x04c9, B:159:0x04d1, B:161:0x04e5, B:162:0x04ec, B:150:0x0469, B:149:0x0465, B:148:0x0435, B:143:0x040d, B:135:0x03ec, B:30:0x0142, B:146:0x0418), top: B:193:0x001e, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x060a A[Catch: Exception -> 0x0620, TRY_LEAVE, TryCatch #1 {Exception -> 0x0620, blocks: (B:165:0x0532, B:167:0x060a), top: B:181:0x0532 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d9 A[Catch: Exception -> 0x02b5, TryCatch #7 {Exception -> 0x02b5, blocks: (B:5:0x0024, B:7:0x0028, B:9:0x002e, B:11:0x0032, B:13:0x0103, B:14:0x0106, B:27:0x0131, B:28:0x013c, B:35:0x01c3, B:37:0x01d9, B:39:0x01e7, B:43:0x0277, B:45:0x0295, B:47:0x0299, B:50:0x02ab, B:38:0x01e0, B:34:0x0193, B:33:0x018e, B:32:0x015f, B:15:0x010a, B:53:0x02be, B:55:0x02c2, B:57:0x02c8, B:59:0x02cc, B:61:0x02da, B:63:0x02e3, B:65:0x02e9, B:67:0x02ef, B:69:0x02f5, B:71:0x02fe, B:73:0x0305, B:75:0x030c, B:77:0x0312, B:79:0x0319, B:81:0x031f, B:83:0x0328, B:85:0x032e, B:87:0x0337, B:89:0x033d, B:91:0x0346, B:93:0x034c, B:95:0x0355, B:97:0x035b, B:99:0x0364, B:101:0x036a, B:103:0x0373, B:105:0x0379, B:107:0x037f, B:109:0x0385, B:111:0x038e, B:113:0x0394, B:115:0x039d, B:117:0x03a3, B:119:0x03ac, B:121:0x03b2, B:123:0x03bb, B:125:0x03c1, B:127:0x03ca, B:129:0x03d0, B:131:0x03d6, B:133:0x03e5, B:134:0x03e8, B:137:0x03f3, B:139:0x03f9, B:141:0x0401, B:142:0x0409, B:144:0x0412, B:151:0x049a, B:153:0x04b0, B:155:0x04c2, B:156:0x04c5, B:163:0x04f3, B:157:0x04c9, B:159:0x04d1, B:161:0x04e5, B:162:0x04ec, B:150:0x0469, B:149:0x0465, B:148:0x0435, B:143:0x040d, B:135:0x03ec, B:30:0x0142, B:146:0x0418), top: B:193:0x001e, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e0 A[Catch: Exception -> 0x02b5, TryCatch #7 {Exception -> 0x02b5, blocks: (B:5:0x0024, B:7:0x0028, B:9:0x002e, B:11:0x0032, B:13:0x0103, B:14:0x0106, B:27:0x0131, B:28:0x013c, B:35:0x01c3, B:37:0x01d9, B:39:0x01e7, B:43:0x0277, B:45:0x0295, B:47:0x0299, B:50:0x02ab, B:38:0x01e0, B:34:0x0193, B:33:0x018e, B:32:0x015f, B:15:0x010a, B:53:0x02be, B:55:0x02c2, B:57:0x02c8, B:59:0x02cc, B:61:0x02da, B:63:0x02e3, B:65:0x02e9, B:67:0x02ef, B:69:0x02f5, B:71:0x02fe, B:73:0x0305, B:75:0x030c, B:77:0x0312, B:79:0x0319, B:81:0x031f, B:83:0x0328, B:85:0x032e, B:87:0x0337, B:89:0x033d, B:91:0x0346, B:93:0x034c, B:95:0x0355, B:97:0x035b, B:99:0x0364, B:101:0x036a, B:103:0x0373, B:105:0x0379, B:107:0x037f, B:109:0x0385, B:111:0x038e, B:113:0x0394, B:115:0x039d, B:117:0x03a3, B:119:0x03ac, B:121:0x03b2, B:123:0x03bb, B:125:0x03c1, B:127:0x03ca, B:129:0x03d0, B:131:0x03d6, B:133:0x03e5, B:134:0x03e8, B:137:0x03f3, B:139:0x03f9, B:141:0x0401, B:142:0x0409, B:144:0x0412, B:151:0x049a, B:153:0x04b0, B:155:0x04c2, B:156:0x04c5, B:163:0x04f3, B:157:0x04c9, B:159:0x04d1, B:161:0x04e5, B:162:0x04ec, B:150:0x0469, B:149:0x0465, B:148:0x0435, B:143:0x040d, B:135:0x03ec, B:30:0x0142, B:146:0x0418), top: B:193:0x001e, inners: #3, #6 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    @android.annotation.SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.e0 r51, int r52) {
        /*
            Method dump skipped, instruction units count: 1585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.SeriesAllDataRightSideAdapter.F(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.e0 H(@NotNull ViewGroup viewGroup, int i2) {
        return i2 == 1 ? new ContinueWatchingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.series_all_data_right_adapter_con_wat, viewGroup, false)) : new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.series_all_data_right_adapter, viewGroup, false));
    }

    public final void K0(RecyclerView.e0 e0Var, int i2, ArrayList<SeriesDBModel> arrayList, List<GetEpisdoeDetailsCallback> list, int i3) {
        ImageView imageView;
        if (i3 == 1) {
            ContinueWatchingViewHolder continueWatchingViewHolder = (ContinueWatchingViewHolder) e0Var;
            c.h.a.i.b bVar = new c.h.a.i.b();
            bVar.h(list.get(i2).b());
            bVar.m(c.h.a.h.n.e.S(list.get(i2).r()));
            bVar.k(list.get(i2).u());
            bVar.l(list.get(i2).t());
            bVar.o(c.h.a.i.q.m.z(this.f27953i));
            this.f27955k.i(bVar, "series");
            continueWatchingViewHolder.ivFavourite.startAnimation(this.f27956l);
            imageView = continueWatchingViewHolder.ivFavourite;
        } else {
            ViewHolder viewHolder = (ViewHolder) e0Var;
            c.h.a.i.b bVar2 = new c.h.a.i.b();
            bVar2.h(arrayList.get(i2).b());
            bVar2.m(arrayList.get(i2).r());
            bVar2.k(arrayList.get(i2).d());
            bVar2.l(arrayList.get(i2).e());
            bVar2.o(c.h.a.i.q.m.z(this.f27953i));
            this.f27955k.i(bVar2, "series");
            viewHolder.ivFavourite.startAnimation(this.f27956l);
            imageView = viewHolder.ivFavourite;
        }
        imageView.setVisibility(0);
    }

    public final void L0(RecyclerView.e0 e0Var, int i2, ArrayList<SeriesDBModel> arrayList) {
        ViewHolder viewHolder = (ViewHolder) e0Var;
        c.h.a.i.c cVar = new c.h.a.i.c();
        cVar.h(arrayList.get(i2).h());
        cVar.i(c.h.a.i.q.m.z(this.f27953i));
        cVar.g(arrayList.get(i2).d());
        cVar.e(arrayList.get(i2).b());
        this.M.Q(cVar);
        viewHolder.ivFavourite.startAnimation(this.f27956l);
        viewHolder.ivFavourite.setVisibility(0);
    }

    public final void M0(ArrayList<c.h.a.i.b> arrayList, RecyclerView.e0 e0Var, int i2, ArrayList<SeriesDBModel> arrayList2, List<GetEpisdoeDetailsCallback> list, int i3, RelativeLayout relativeLayout) {
        if (arrayList.size() > 0) {
            V0(e0Var, i2, arrayList2, list, i3);
        } else {
            K0(e0Var, i2, arrayList2, list, i3);
        }
        this.J = true;
        Context context = this.f27953i;
        if (context instanceof SeriesAllDataSingleActivity) {
            ((SeriesAllDataSingleActivity) context).l1();
        }
    }

    public final void N0(ArrayList<c.h.a.i.c> arrayList, RecyclerView.e0 e0Var, int i2, ArrayList<SeriesDBModel> arrayList2) {
        if (arrayList.size() > 0) {
            W0(e0Var, i2, arrayList2);
        } else {
            L0(e0Var, i2, arrayList2);
        }
        this.J = true;
        Context context = this.f27953i;
        if (context instanceof SeriesAllDataSingleActivity) {
            ((SeriesAllDataSingleActivity) context).l1();
        }
    }

    public boolean O0() {
        return this.J;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:4|130|5|6|(1:11)(1:10)|12|(1:14)(1:16)|15|17|(1:22)(1:21)|23|(1:28)(1:27)|29|(1:34)(1:33)|35|(1:40)(1:39)|41|(1:46)(1:45)|47|(1:53)(1:51)|52|54|(1:56)|(3:116|57|(1:62)(1:61))|132|65|(1:70)(1:69)|(2:124|73)|(15:75|76|118|77|(1:79)|126|85|(11:87|88|120|89|(1:91)|128|97|(7:99|100|122|101|(1:103)|109|110)(1:104)|105|109|110)(1:92)|93|128|97|(0)(0)|105|109|110)(1:80)|81|126|85|(0)(0)|93|128|97|(0)(0)|105|109|110) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e5, code lost:
    
        r17 = r4;
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b6, code lost:
    
        r18 = r4;
        r4 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0194 A[Catch: Exception -> 0x01b6, TRY_LEAVE, TryCatch #5 {Exception -> 0x01b6, blocks: (B:85:0x018e, B:87:0x0194), top: B:126:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c3 A[Catch: Exception -> 0x01e5, TRY_LEAVE, TryCatch #6 {Exception -> 0x01e5, blocks: (B:97:0x01bd, B:99:0x01c3), top: B:128:0x01bd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void P0(org.json.JSONArray r22, int r23) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.SeriesAllDataRightSideAdapter.P0(org.json.JSONArray, int):void");
    }

    public int Q0() {
        return this.K;
    }

    public final void R0() {
        try {
            ProgressDialog progressDialog = this.H;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.H.dismiss();
        } catch (Exception unused) {
        }
    }

    public final void S0() {
        String string = this.r.getString("username", BuildConfig.FLAVOR);
        String string2 = this.r.getString("password", BuildConfig.FLAVOR);
        if (string == null || string2 == null || string.isEmpty() || string2.isEmpty()) {
            return;
        }
        Z0();
        this.s.b(string, string2, String.valueOf(this.A));
    }

    public final void T0(String str, String str2, String str3, View view) {
        this.C = str2;
        this.F = str3;
        if (this.q.equals("mobile")) {
            try {
                this.p = c.f.a.c.d.u.b.e(this.f27953i).c().c();
            } catch (Exception unused) {
            }
        }
        c.f.a.c.d.u.d dVar = this.p;
        if (dVar != null && dVar.c()) {
            c.f.a.c.d.u.d dVar2 = this.p;
            if (((dVar2 == null || dVar2.p() == null || this.p.p().j() == null || this.p.p().j().K() == null) ? BuildConfig.FLAVOR : this.p.p().j().K()).contains(str)) {
                this.f27953i.startActivity(new Intent(this.f27953i, (Class<?>) ExpandedControlsActivity.class));
                return;
            } else {
                c.h.a.h.m.a.c(0, true, c.h.a.h.m.a.a(this.C, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, str, "videos/mp4", this.F, BuildConfig.FLAVOR, null), this.p, this.f27953i);
                return;
            }
        }
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        j0 j0Var = new j0(this.f27953i, view);
        j0Var.c().inflate(R.menu.menu_players_hp, j0Var.b());
        ArrayList<ExternalPlayerModelClass> arrayListL = new c.h.a.i.q.d(this.f27953i).l();
        if (arrayListL != null) {
            try {
                if (arrayListL.size() > 0) {
                    j0Var.b().add(0, 0, 0, this.f27953i.getResources().getString(R.string.nav_play));
                    ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                    externalPlayerModelClass.e(0);
                    externalPlayerModelClass.d(this.f27953i.getResources().getString(R.string.play_with));
                    arrayList.add(externalPlayerModelClass);
                    int i2 = 0;
                    while (i2 < arrayListL.size()) {
                        int i3 = i2 + 1;
                        j0Var.b().add(0, i3, 0, this.f27953i.getResources().getString(R.string.play_with) + " " + arrayListL.get(i2).a());
                        arrayList.add(arrayListL.get(i2));
                        i2 = i3;
                    }
                    j0Var.f(new k(arrayList, str));
                    j0Var.e(new l());
                    j0Var.g();
                    return;
                }
            } catch (Exception unused2) {
                return;
            }
        }
        c.h.a.h.n.e.V(this.f27953i, BuildConfig.FLAVOR, 0, "series", this.B, "0", this.C, null, str);
    }

    public final void U0(RecyclerView.e0 e0Var, int i2, ArrayList<SeriesDBModel> arrayList, List<GetEpisdoeDetailsCallback> list, int i3) {
        if (i3 == 1) {
            j0 j0Var = new j0(this.f27953i, ((ContinueWatchingViewHolder) e0Var).cardView);
            j0Var.d(R.menu.menu_continue_watching);
            if (this.f27955k.l(c.h.a.h.n.e.S(list.get(i2).r()), list.get(i2).b(), "series", c.h.a.i.q.m.z(this.f27953i)).size() > 0) {
                j0Var.b().getItem(0).setVisible(false);
                j0Var.b().getItem(1).setVisible(true);
            } else {
                j0Var.b().getItem(0).setVisible(true);
                j0Var.b().getItem(1).setVisible(false);
            }
            j0Var.f(new m(e0Var, i2, arrayList, list, i3));
            j0Var.g();
        }
    }

    public final void V0(RecyclerView.e0 e0Var, int i2, ArrayList<SeriesDBModel> arrayList, List<GetEpisdoeDetailsCallback> list, int i3) {
        ImageView imageView;
        if (i3 == 1) {
            this.f27955k.o(c.h.a.h.n.e.S(list.get(i2).r()), list.get(i2).b(), "series", list.get(i2).s(), c.h.a.i.q.m.z(this.f27953i));
            imageView = ((ContinueWatchingViewHolder) e0Var).ivFavourite;
        } else {
            this.f27955k.o(arrayList.get(i2).r(), arrayList.get(i2).b(), "series", arrayList.get(i2).d(), c.h.a.i.q.m.z(this.f27953i));
            imageView = ((ViewHolder) e0Var).ivFavourite;
        }
        imageView.setVisibility(4);
    }

    public final void W0(RecyclerView.e0 e0Var, int i2, ArrayList<SeriesDBModel> arrayList) {
        this.M.I0(arrayList.get(i2).h(), c.h.a.i.q.m.z(this.f27953i));
        ((ViewHolder) e0Var).ivFavourite.setVisibility(4);
    }

    public void X0() {
        this.J = false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x01b8
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void Y0(org.json.JSONObject r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.SeriesAllDataRightSideAdapter.Y0(org.json.JSONObject, java.lang.String):void");
    }

    public final void Z0() {
        ProgressDialog progressDialog = new ProgressDialog(this.f27953i);
        this.H = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.H.setMessage(this.f27953i.getResources().getString(R.string.please_wait));
        this.H.show();
    }

    public final void a1(String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i3) {
        if (this.f27953i != null) {
            Intent intent = new Intent(this.f27953i, (Class<?>) SeriesDetailActivity.class);
            intent.putExtra("series_num", str);
            intent.putExtra("series_name", str2);
            intent.putExtra("series_streamType", str3);
            intent.putExtra("series_seriesID", String.valueOf(i2));
            intent.putExtra("series_cover", str4);
            intent.putExtra("series_plot", str5);
            intent.putExtra("series_cast", str6);
            intent.putExtra("series_director", str7);
            intent.putExtra("series_genre", str8);
            intent.putExtra("series_releaseDate", str9);
            intent.putExtra("series_last_modified", str10);
            intent.putExtra("series_rating", str11);
            intent.putExtra("series_categoryId", str12);
            intent.putExtra("series_youtube_trailer", str13);
            intent.putExtra("series_backdrop", str14);
            c.h.a.h.n.a.U = i3;
            this.f27953i.startActivity(intent);
        }
    }

    @Override // c.h.a.k.f.b
    public void b() {
        R0();
    }

    @Override // c.h.a.k.f.k
    public void b0(c.f.d.j jVar) {
        if (jVar != null) {
            try {
                JSONObject jSONObject = new JSONObject(jVar.toString());
                String string = jSONObject.getString("seasons");
                String string2 = jSONObject.getString("episodes");
                if (!string.equals("[]")) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("seasons");
                        int length = jSONArray.length();
                        this.t.clear();
                        for (int i2 = 0; i2 < length; i2++) {
                            if (jSONArray.get(i2) instanceof JSONObject) {
                                Y0((JSONObject) jSONArray.get(i2), String.valueOf(i2));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("seasons");
                        Iterator<String> itKeys = jSONObject2.keys();
                        this.u.clear();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (jSONObject2.get(next) instanceof JSONObject) {
                                Y0(jSONObject2, next);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (!string2.equals("[]")) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("episodes");
                        int length2 = jSONArray2.length();
                        this.t.clear();
                        for (int i3 = 0; i3 < length2; i3++) {
                            if (jSONArray2.get(i3) instanceof JSONArray) {
                                JSONArray jSONArray3 = new JSONArray(jSONArray2.get(i3).toString());
                                P0(jSONArray3, jSONArray3.length());
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    JSONObject jSONObject3 = jSONObject.getJSONObject("episodes");
                    this.t.clear();
                    Iterator<String> itKeys2 = jSONObject3.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        if (jSONObject3.get(next2) instanceof JSONArray) {
                            JSONArray jSONArray4 = new JSONArray(jSONObject3.get(next2).toString());
                            P0(jSONArray4, jSONArray4.length());
                        }
                    }
                }
            } catch (Exception unused4) {
            }
        }
        ArrayList<GetEpisdoeDetailsCallback> arrayList = this.t;
        if (arrayList != null && arrayList.size() != 0) {
            c.h.a.i.a.c().f(this.t);
            this.L.clear();
            for (int i4 = 0; i4 < this.t.size(); i4++) {
                if (this.t.get(i4).p().equals(Integer.valueOf(this.E))) {
                    this.L.add(this.t.get(i4));
                }
            }
            ArrayList<GetEpisdoeDetailsCallback> arrayList2 = this.L;
            if (arrayList2 != null && arrayList2.size() > 0) {
                c.h.a.i.a.c().e(this.L);
            }
        }
        R0();
        if (this.q.equals("mobile")) {
            try {
                this.p = c.f.a.c.d.u.b.e(this.f27953i).c().c();
            } catch (Exception unused5) {
            }
        }
        c.f.a.c.d.u.d dVar = this.p;
        if (dVar != null && dVar.c()) {
            String str = this.f27953i.getResources().getString(R.string.season_number) + " - " + this.E;
            String strF = c.h.a.h.n.e.F(this.f27953i, c.h.a.h.n.e.S(this.D), this.B, "series");
            c.f.a.c.d.u.d dVar2 = this.p;
            if (((dVar2 == null || dVar2.p() == null || this.p.p().j() == null || this.p.p().j().K() == null) ? BuildConfig.FLAVOR : this.p.p().j().K()).equals(strF)) {
                this.f27953i.startActivity(new Intent(this.f27953i, (Class<?>) ExpandedControlsActivity.class));
                return;
            } else {
                c.h.a.h.m.a.c(c.h.a.h.n.e.S(this.G), true, c.h.a.h.m.a.a(this.C, str, BuildConfig.FLAVOR, 0, strF, "videos/mp4", this.F, BuildConfig.FLAVOR, null), this.p, this.f27953i);
                return;
            }
        }
        new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        j0 j0Var = new j0(this.f27953i, this.N);
        j0Var.c().inflate(R.menu.menu_players_hp, j0Var.b());
        ArrayList<ExternalPlayerModelClass> arrayListL = new c.h.a.i.q.d(this.f27953i).l();
        if (arrayListL != null) {
            try {
                if (arrayListL.size() > 0) {
                    j0Var.b().add(0, 0, 0, this.f27953i.getResources().getString(R.string.nav_play));
                    ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                    externalPlayerModelClass.e(0);
                    externalPlayerModelClass.d(this.f27953i.getResources().getString(R.string.play_with));
                    arrayList3.add(externalPlayerModelClass);
                    int i5 = 0;
                    while (i5 < arrayListL.size()) {
                        int i6 = i5 + 1;
                        j0Var.b().add(0, i6, 0, this.f27953i.getResources().getString(R.string.play_with) + " " + arrayListL.get(i5).a());
                        arrayList3.add(arrayListL.get(i5));
                        i5 = i6;
                    }
                    j0Var.f(new n(arrayList3));
                    j0Var.e(new o());
                    j0Var.g();
                    return;
                }
            } catch (Exception unused6) {
                return;
            }
        }
        c.h.a.h.n.e.V(this.f27953i, BuildConfig.FLAVOR, c.h.a.h.n.e.S(this.D), "series", this.B, "0", this.C, null, BuildConfig.FLAVOR);
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f27957m.equals("continue_watching") ? this.f27959o : this.f27958n;
    }

    @Override // c.h.a.k.f.k
    public void m(String str) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        if (this.f27957m.equals("continue_watching")) {
            List<GetEpisdoeDetailsCallback> list = this.f27952h;
            if (list == null || list.size() <= 0) {
                return 0;
            }
            return this.f27952h.size();
        }
        ArrayList<SeriesDBModel> arrayList = this.f27950f;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f27950f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return this.f27957m.equals("continue_watching") ? 1 : 0;
    }
}
