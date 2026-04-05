package minefarts.iptvsmarters.view.adapter;

import a.b.q.j0;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
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
import minefarts.iptvsmarters.view.activity.ViewDetailsActivity;
import minefarts.iptvsmarters.view.activity.ViewDetailsTMDBActivity;
import minefarts.iptvsmarters.view.activity.VodAllDataSingleActivity;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class VodAllDataRightSideAdapter extends RecyclerView.h<RecyclerView.e0> implements Filterable {
    public c.h.a.i.q.k B;
    public c.h.a.i.q.f C;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f28491i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.a f28493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animation f28494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f28495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t f28496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f28497o;
    public String p;
    public SharedPreferences t;
    public c.f.a.c.d.u.d u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f28492j = Boolean.FALSE;
    public String q = BuildConfig.FLAVOR;
    public boolean r = false;
    public int s = -1;
    public String v = BuildConfig.FLAVOR;
    public String w = "0";
    public String x = BuildConfig.FLAVOR;
    public String y = BuildConfig.FLAVOR;
    public String z = BuildConfig.FLAVOR;
    public int A = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<c.h.a.i.f> f28487e = c.h.a.i.p.b().g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f28488f = c.h.a.i.p.b().g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<c.h.a.i.f> f28489g = c.h.a.i.p.b().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f28490h = c.h.a.i.p.b().a();

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
        public ContinueWatchingViewHolder f28498b;

        public ContinueWatchingViewHolder_ViewBinding(ContinueWatchingViewHolder continueWatchingViewHolder, View view) {
            this.f28498b = continueWatchingViewHolder;
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
            ContinueWatchingViewHolder continueWatchingViewHolder = this.f28498b;
            if (continueWatchingViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f28498b = null;
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
        public ViewHolder f28499b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f28499b = viewHolder;
            viewHolder.SeriesName = (TextView) b.c.c.c(view, R.id.tv_series_name, "field 'SeriesName'", TextView.class);
            viewHolder.Movie = (RelativeLayout) b.c.c.c(view, R.id.rl_movie, "field 'Movie'", RelativeLayout.class);
            viewHolder.MovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'MovieImage'", ImageView.class);
            viewHolder.cardView = (CardView) b.c.c.c(view, R.id.card_view, "field 'cardView'", CardView.class);
            viewHolder.tvStreamOptions = (TextView) b.c.c.c(view, R.id.tv_streamOptions, "field 'tvStreamOptions'", TextView.class);
            viewHolder.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
            viewHolder.cv_rating = (CardView) b.c.c.c(view, R.id.cv_rating, "field 'cv_rating'", CardView.class);
            viewHolder.tv_rating = (TextView) b.c.c.c(view, R.id.tv_rating, "field 'tv_rating'", TextView.class);
            viewHolder.llMenu = (LinearLayout) b.c.c.c(view, R.id.ll_menu, "field 'llMenu'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            ViewHolder viewHolder = this.f28499b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f28499b = null;
            viewHolder.SeriesName = null;
            viewHolder.Movie = null;
            viewHolder.MovieImage = null;
            viewHolder.cardView = null;
            viewHolder.tvStreamOptions = null;
            viewHolder.ivFavourite = null;
            viewHolder.cv_rating = null;
            viewHolder.tv_rating = null;
            viewHolder.llMenu = null;
        }
    }

    public class a implements c.k.b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ContinueWatchingViewHolder f28500a;

        /* JADX INFO: renamed from: minefarts.iptvsmarters.view.adapter.VodAllDataRightSideAdapter$a$a, reason: collision with other inner class name */
        public class C0289a implements c.k.b.e {
            public C0289a() {
            }

            @Override // c.k.b.e
            public void a() {
            }

            @Override // c.k.b.e
            public void onSuccess() {
            }
        }

        public a(ContinueWatchingViewHolder continueWatchingViewHolder) {
            this.f28500a = continueWatchingViewHolder;
        }

        @Override // c.k.b.e
        public void a() {
            c.k.b.t.q(VodAllDataRightSideAdapter.this.f28491i).l(String.valueOf(VodAllDataRightSideAdapter.this.f28491i.getResources().getDrawable(R.drawable.rounded_edge_3))).e().a().h(this.f28500a.MovieImage, new C0289a());
            this.f28500a.SeriesName.setVisibility(0);
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class b implements c.k.b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f28503a;

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
            this.f28503a = viewHolder;
        }

        @Override // c.k.b.e
        public void a() {
            c.k.b.t.q(VodAllDataRightSideAdapter.this.f28491i).l(String.valueOf(VodAllDataRightSideAdapter.this.f28491i.getResources().getDrawable(R.drawable.rounded_edge_3))).e().a().h(this.f28503a.MovieImage, new a());
            this.f28503a.SeriesName.setVisibility(0);
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
        public final /* synthetic */ int f28508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28513g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28514h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28515i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28516j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f28517k;

        public e(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3) {
            this.f28508b = i2;
            this.f28509c = str;
            this.f28510d = str2;
            this.f28511e = str3;
            this.f28512f = str4;
            this.f28513g = str5;
            this.f28514h = str6;
            this.f28515i = str7;
            this.f28516j = str8;
            this.f28517k = i3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodAllDataRightSideAdapter.this.N0(this.f28508b, this.f28509c, this.f28510d, this.f28511e, this.f28512f, this.f28513g, this.f28514h, this.f28515i, this.f28516j, this.f28517k);
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28523f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28524g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28525h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28526i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28527j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f28528k;

        public f(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3) {
            this.f28519b = i2;
            this.f28520c = str;
            this.f28521d = str2;
            this.f28522e = str3;
            this.f28523f = str4;
            this.f28524g = str5;
            this.f28525h = str6;
            this.f28526i = str7;
            this.f28527j = str8;
            this.f28528k = i3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodAllDataRightSideAdapter.this.N0(this.f28519b, this.f28520c, this.f28521d, this.f28522e, this.f28523f, this.f28524g, this.f28525h, this.f28526i, this.f28527j, this.f28528k);
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28534f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28535g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28536h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28537i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28538j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f28539k;

        public g(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3) {
            this.f28530b = i2;
            this.f28531c = str;
            this.f28532d = str2;
            this.f28533e = str3;
            this.f28534f = str4;
            this.f28535g = str5;
            this.f28536h = str6;
            this.f28537i = str7;
            this.f28538j = str8;
            this.f28539k = i3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodAllDataRightSideAdapter.this.N0(this.f28530b, this.f28531c, this.f28532d, this.f28533e, this.f28534f, this.f28535g, this.f28536h, this.f28537i, this.f28538j, this.f28539k);
        }
    }

    public class h implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f28542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f28544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f28546g;

        public h(String str, ViewHolder viewHolder, int i2, int i3, String str2, int i4) {
            this.f28541b = str;
            this.f28542c = viewHolder;
            this.f28543d = i2;
            this.f28544e = i3;
            this.f28545f = str2;
            this.f28546g = i4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (c.h.a.i.q.m.f(VodAllDataRightSideAdapter.this.f28491i).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = VodAllDataRightSideAdapter.this.C.U(this.f28541b, c.h.a.i.q.m.z(VodAllDataRightSideAdapter.this.f28491i));
                VodAllDataRightSideAdapter vodAllDataRightSideAdapter = VodAllDataRightSideAdapter.this;
                vodAllDataRightSideAdapter.F0(arrayListU, this.f28542c, this.f28543d, vodAllDataRightSideAdapter.f28488f);
                return true;
            }
            ArrayList<c.h.a.i.b> arrayListL = VodAllDataRightSideAdapter.this.f28493k.l(this.f28544e, this.f28545f, "vod", c.h.a.i.q.m.z(VodAllDataRightSideAdapter.this.f28491i));
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter2 = VodAllDataRightSideAdapter.this;
            vodAllDataRightSideAdapter2.E0(arrayListL, this.f28542c, this.f28543d, vodAllDataRightSideAdapter2.f28488f, VodAllDataRightSideAdapter.this.f28490h, this.f28546g, this.f28542c.Movie);
            return true;
        }
    }

    public class i implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f28549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f28551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28552f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f28553g;

        public i(String str, ViewHolder viewHolder, int i2, int i3, String str2, int i4) {
            this.f28548b = str;
            this.f28549c = viewHolder;
            this.f28550d = i2;
            this.f28551e = i3;
            this.f28552f = str2;
            this.f28553g = i4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (c.h.a.i.q.m.f(VodAllDataRightSideAdapter.this.f28491i).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = VodAllDataRightSideAdapter.this.C.U(this.f28548b, c.h.a.i.q.m.z(VodAllDataRightSideAdapter.this.f28491i));
                VodAllDataRightSideAdapter vodAllDataRightSideAdapter = VodAllDataRightSideAdapter.this;
                vodAllDataRightSideAdapter.F0(arrayListU, this.f28549c, this.f28550d, vodAllDataRightSideAdapter.f28488f);
                return true;
            }
            ArrayList<c.h.a.i.b> arrayListL = VodAllDataRightSideAdapter.this.f28493k.l(this.f28551e, this.f28552f, "vod", c.h.a.i.q.m.z(VodAllDataRightSideAdapter.this.f28491i));
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter2 = VodAllDataRightSideAdapter.this;
            vodAllDataRightSideAdapter2.E0(arrayListL, this.f28549c, this.f28550d, vodAllDataRightSideAdapter2.f28488f, VodAllDataRightSideAdapter.this.f28490h, this.f28553g, this.f28549c.Movie);
            return true;
        }
    }

    public class j implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f28556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f28558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28559f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f28560g;

        public j(String str, ViewHolder viewHolder, int i2, int i3, String str2, int i4) {
            this.f28555b = str;
            this.f28556c = viewHolder;
            this.f28557d = i2;
            this.f28558e = i3;
            this.f28559f = str2;
            this.f28560g = i4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (c.h.a.i.q.m.f(VodAllDataRightSideAdapter.this.f28491i).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = VodAllDataRightSideAdapter.this.C.U(this.f28555b, c.h.a.i.q.m.z(VodAllDataRightSideAdapter.this.f28491i));
                VodAllDataRightSideAdapter vodAllDataRightSideAdapter = VodAllDataRightSideAdapter.this;
                vodAllDataRightSideAdapter.F0(arrayListU, this.f28556c, this.f28557d, vodAllDataRightSideAdapter.f28488f);
                return true;
            }
            ArrayList<c.h.a.i.b> arrayListL = VodAllDataRightSideAdapter.this.f28493k.l(this.f28558e, this.f28559f, "vod", c.h.a.i.q.m.z(VodAllDataRightSideAdapter.this.f28491i));
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter2 = VodAllDataRightSideAdapter.this;
            vodAllDataRightSideAdapter2.E0(arrayListL, this.f28556c, this.f28557d, vodAllDataRightSideAdapter2.f28488f, VodAllDataRightSideAdapter.this.f28490h, this.f28560g, this.f28556c.Movie);
            return true;
        }
    }

    public class k implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f28562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f28566e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                VodAllDataRightSideAdapter.this.w();
            }
        }

        public class b extends Dialog implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Activity f28569b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public TextView f28570c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public TextView f28571d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public TextView f28572e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public LinearLayout f28573f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public LinearLayout f28574g;

            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (VodAllDataRightSideAdapter.this.f28491i instanceof VodAllDataSingleActivity) {
                        ((VodAllDataSingleActivity) VodAllDataRightSideAdapter.this.f28491i).l1();
                    }
                }
            }

            /* JADX INFO: renamed from: minefarts.iptvsmarters.view.adapter.VodAllDataRightSideAdapter$k$b$b, reason: collision with other inner class name */
            public class ViewOnFocusChangeListenerC0290b implements View.OnFocusChangeListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public View f28577b;

                public ViewOnFocusChangeListenerC0290b(View view) {
                    this.f28577b = view;
                }

                @Override // android.view.View.OnFocusChangeListener
                @SuppressLint({"ResourceType"})
                public void onFocusChange(View view, boolean z) {
                    int i2;
                    LinearLayout linearLayout;
                    if (z) {
                        View view2 = this.f28577b;
                        i2 = R.drawable.blue_btn_effect;
                        if (view2 == null || view2.getTag() == null || !this.f28577b.getTag().equals("1")) {
                            View view3 = this.f28577b;
                            if (view3 == null || view3.getTag() == null || !this.f28577b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = b.this.f28574g;
                        }
                        linearLayout = b.this.f28573f;
                    } else {
                        View view4 = this.f28577b;
                        i2 = R.drawable.black_button_dark;
                        if (view4 == null || view4.getTag() == null || !this.f28577b.getTag().equals("1")) {
                            View view5 = this.f28577b;
                            if (view5 == null || view5.getTag() == null || !this.f28577b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = b.this.f28574g;
                        }
                        linearLayout = b.this.f28573f;
                    }
                    linearLayout.setBackgroundResource(i2);
                }
            }

            public b(Activity activity) {
                super(activity);
                this.f28569b = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int id = view.getId();
                if (id == R.id.btn_no) {
                    dismiss();
                } else if (id == R.id.btn_yes) {
                    try {
                        c.h.a.i.q.k kVar = VodAllDataRightSideAdapter.this.B;
                        k kVar2 = k.this;
                        kVar.V(((c.h.a.i.f) kVar2.f28565d.get(kVar2.f28563b)).Y());
                        if (VodAllDataRightSideAdapter.this.f28491i instanceof VodAllDataSingleActivity) {
                            ((VodAllDataSingleActivity) VodAllDataRightSideAdapter.this.f28491i).q1();
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
                setContentView(new c.h.a.k.d.a.a(VodAllDataRightSideAdapter.this.f28491i).A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_alert_layout_tv : R.layout.custom_alert_layout);
                this.f28570c = (TextView) findViewById(R.id.btn_yes);
                this.f28571d = (TextView) findViewById(R.id.btn_no);
                this.f28573f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
                this.f28574g = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
                TextView textView = (TextView) findViewById(R.id.txt_dia);
                this.f28572e = textView;
                textView.setText(VodAllDataRightSideAdapter.this.f28491i.getResources().getString(R.string.you_want_to_remove_this_movie_from_continue_watching));
                this.f28570c.setOnClickListener(this);
                this.f28571d.setOnClickListener(this);
                TextView textView2 = this.f28570c;
                textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0290b(textView2));
                TextView textView3 = this.f28571d;
                textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0290b(textView3));
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                VodAllDataRightSideAdapter.this.w();
            }
        }

        public k(RecyclerView.e0 e0Var, int i2, ArrayList arrayList, ArrayList arrayList2, int i3) {
            this.f28562a = e0Var;
            this.f28563b = i2;
            this.f28564c = arrayList;
            this.f28565d = arrayList2;
            this.f28566e = i3;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.menu_remove_from_continue_watching) {
                new b((VodAllDataSingleActivity) VodAllDataRightSideAdapter.this.f28491i).show();
                return false;
            }
            if (itemId == R.id.nav_add_to_fav) {
                VodAllDataRightSideAdapter.this.C0(this.f28562a, this.f28563b, this.f28564c, this.f28565d, this.f28566e);
                new Handler().postDelayed(new a(), 300L);
                if (!(VodAllDataRightSideAdapter.this.f28491i instanceof VodAllDataSingleActivity)) {
                    return false;
                }
            } else {
                if (itemId != R.id.nav_remove_from_fav) {
                    return false;
                }
                VodAllDataRightSideAdapter.this.K0(this.f28562a, this.f28563b, this.f28564c, this.f28565d, this.f28566e);
                new Handler().postDelayed(new c(), 300L);
                if (!(VodAllDataRightSideAdapter.this.f28491i instanceof VodAllDataSingleActivity)) {
                    return false;
                }
            }
            ((VodAllDataSingleActivity) VodAllDataRightSideAdapter.this.f28491i).l1();
            return false;
        }
    }

    public class l implements c.k.b.e {
        public l() {
        }

        @Override // c.k.b.e
        public void a() {
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class m implements c.k.b.e {
        public m() {
        }

        @Override // c.k.b.e
        public void a() {
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class n implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28586f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28587g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28588h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f28589i;

        public n(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2) {
            this.f28582b = str;
            this.f28583c = str2;
            this.f28584d = str3;
            this.f28585e = str4;
            this.f28586f = str5;
            this.f28587g = str6;
            this.f28588h = str7;
            this.f28589i = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodAllDataRightSideAdapter.this.y = String.valueOf(this.f28582b);
            VodAllDataRightSideAdapter.this.v = this.f28583c;
            VodAllDataRightSideAdapter.this.z = this.f28584d;
            VodAllDataRightSideAdapter.this.q = this.f28585e;
            VodAllDataRightSideAdapter.this.w = this.f28586f;
            VodAllDataRightSideAdapter.this.x = this.f28587g;
            VodAllDataRightSideAdapter.this.A = c.h.a.h.n.e.S(this.f28588h);
            c.h.a.h.n.a.U = this.f28589i;
            VodAllDataRightSideAdapter.this.I0();
        }
    }

    public class o implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28596g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28597h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f28598i;

        public o(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2) {
            this.f28591b = str;
            this.f28592c = str2;
            this.f28593d = str3;
            this.f28594e = str4;
            this.f28595f = str5;
            this.f28596g = str6;
            this.f28597h = str7;
            this.f28598i = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodAllDataRightSideAdapter.this.y = String.valueOf(this.f28591b);
            VodAllDataRightSideAdapter.this.v = this.f28592c;
            VodAllDataRightSideAdapter.this.z = this.f28593d;
            VodAllDataRightSideAdapter.this.q = this.f28594e;
            VodAllDataRightSideAdapter.this.w = this.f28595f;
            VodAllDataRightSideAdapter.this.x = this.f28596g;
            VodAllDataRightSideAdapter.this.A = c.h.a.h.n.e.S(this.f28597h);
            c.h.a.h.n.a.U = this.f28598i;
            VodAllDataRightSideAdapter.this.I0();
        }
    }

    public class p implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28604f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28605g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28606h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f28607i;

        public p(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2) {
            this.f28600b = str;
            this.f28601c = str2;
            this.f28602d = str3;
            this.f28603e = str4;
            this.f28604f = str5;
            this.f28605g = str6;
            this.f28606h = str7;
            this.f28607i = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodAllDataRightSideAdapter.this.y = String.valueOf(this.f28600b);
            VodAllDataRightSideAdapter.this.v = this.f28601c;
            VodAllDataRightSideAdapter.this.z = this.f28602d;
            VodAllDataRightSideAdapter.this.q = this.f28603e;
            VodAllDataRightSideAdapter.this.w = this.f28604f;
            VodAllDataRightSideAdapter.this.x = this.f28605g;
            VodAllDataRightSideAdapter.this.A = c.h.a.h.n.e.S(this.f28606h);
            c.h.a.h.n.a.U = this.f28607i;
            VodAllDataRightSideAdapter.this.I0();
        }
    }

    public class q implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ContinueWatchingViewHolder f28609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28611d;

        public q(ContinueWatchingViewHolder continueWatchingViewHolder, int i2, int i3) {
            this.f28609b = continueWatchingViewHolder;
            this.f28610c = i2;
            this.f28611d = i3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter = VodAllDataRightSideAdapter.this;
            vodAllDataRightSideAdapter.J0(this.f28609b, this.f28610c, vodAllDataRightSideAdapter.f28488f, VodAllDataRightSideAdapter.this.f28490h, this.f28611d);
            return true;
        }
    }

    public class r implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ContinueWatchingViewHolder f28613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28615d;

        public r(ContinueWatchingViewHolder continueWatchingViewHolder, int i2, int i3) {
            this.f28613b = continueWatchingViewHolder;
            this.f28614c = i2;
            this.f28615d = i3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter = VodAllDataRightSideAdapter.this;
            vodAllDataRightSideAdapter.J0(this.f28613b, this.f28614c, vodAllDataRightSideAdapter.f28488f, VodAllDataRightSideAdapter.this.f28490h, this.f28615d);
            return true;
        }
    }

    public class s implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ContinueWatchingViewHolder f28617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28619d;

        public s(ContinueWatchingViewHolder continueWatchingViewHolder, int i2, int i3) {
            this.f28617b = continueWatchingViewHolder;
            this.f28618c = i2;
            this.f28619d = i3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter = VodAllDataRightSideAdapter.this;
            vodAllDataRightSideAdapter.J0(this.f28617b, this.f28618c, vodAllDataRightSideAdapter.f28488f, VodAllDataRightSideAdapter.this.f28490h, this.f28619d);
            return true;
        }
    }

    public class t extends Filter {
        public t() {
        }

        public /* synthetic */ t(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = VodAllDataRightSideAdapter.this.f28487e;
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
                VodAllDataRightSideAdapter.this.f28488f = (ArrayList) filterResults.values;
                if (VodAllDataRightSideAdapter.this.f28488f != null) {
                    VodAllDataRightSideAdapter.this.w();
                    if (VodAllDataRightSideAdapter.this.f28488f == null || VodAllDataRightSideAdapter.this.f28488f.size() != 0) {
                        ((VodAllDataSingleActivity) VodAllDataRightSideAdapter.this.f28491i).z1();
                        ((VodAllDataSingleActivity) VodAllDataRightSideAdapter.this.f28491i).Z0();
                    } else {
                        ((VodAllDataSingleActivity) VodAllDataRightSideAdapter.this.f28491i).e1();
                        ((VodAllDataSingleActivity) VodAllDataRightSideAdapter.this.f28491i).v1(VodAllDataRightSideAdapter.this.f28491i.getResources().getString(R.string.no_movie_found));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class u extends Filter {
        public u() {
        }

        public /* synthetic */ u(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = VodAllDataRightSideAdapter.this.f28489g;
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
                VodAllDataRightSideAdapter.this.f28490h = (ArrayList) filterResults.values;
                if (VodAllDataRightSideAdapter.this.f28490h != null) {
                    VodAllDataRightSideAdapter.this.w();
                    if (VodAllDataRightSideAdapter.this.f28490h.size() == 0) {
                        ((VodAllDataSingleActivity) VodAllDataRightSideAdapter.this.f28491i).e1();
                        ((VodAllDataSingleActivity) VodAllDataRightSideAdapter.this.f28491i).v1(VodAllDataRightSideAdapter.this.f28491i.getResources().getString(R.string.no_movie_found));
                    } else {
                        ((VodAllDataSingleActivity) VodAllDataRightSideAdapter.this.f28491i).z1();
                        ((VodAllDataSingleActivity) VodAllDataRightSideAdapter.this.f28491i).Z0();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class v implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28623b;

        public v(int i2) {
            this.f28623b = 0;
            this.f28623b = i2;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            VodAllDataRightSideAdapter.this.s = z ? this.f28623b : -1;
        }
    }

    public VodAllDataRightSideAdapter(Context context, String str) {
        this.f28495m = BuildConfig.FLAVOR;
        a aVar = null;
        this.f28496n = new t(this, aVar);
        this.f28497o = new u(this, aVar);
        this.p = "mobile";
        this.f28491i = context;
        this.f28493k = new c.h.a.i.q.a(context);
        this.C = new c.h.a.i.q.f(context);
        this.B = new c.h.a.i.q.k(context);
        this.f28494l = AnimationUtils.loadAnimation(context, R.anim.bounce);
        this.f28495m = str;
        if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0)) {
            this.p = "tv";
        } else {
            this.p = "mobile";
        }
        if (this.p.equals("mobile")) {
            try {
                this.u = c.f.a.c.d.u.b.e(context).c().c();
            } catch (Exception unused) {
            }
        }
    }

    public final void C0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList, List<c.h.a.i.f> list, int i3) {
        ImageView imageView;
        if (i3 == 1) {
            ContinueWatchingViewHolder continueWatchingViewHolder = (ContinueWatchingViewHolder) e0Var;
            c.h.a.i.b bVar = new c.h.a.i.b();
            bVar.h(list.get(i2).g());
            bVar.m(c.h.a.h.n.e.S(list.get(i2).Y()));
            bVar.k(list.get(i2).getName());
            bVar.l(list.get(i2).P());
            bVar.o(c.h.a.i.q.m.z(this.f28491i));
            this.f28493k.i(bVar, "vod");
            continueWatchingViewHolder.ivFavourite.startAnimation(this.f28494l);
            imageView = continueWatchingViewHolder.ivFavourite;
        } else {
            ViewHolder viewHolder = (ViewHolder) e0Var;
            c.h.a.i.b bVar2 = new c.h.a.i.b();
            bVar2.h(arrayList.get(i2).g());
            bVar2.m(c.h.a.h.n.e.S(arrayList.get(i2).Y()));
            bVar2.k(arrayList.get(i2).getName());
            bVar2.l(arrayList.get(i2).P());
            bVar2.o(c.h.a.i.q.m.z(this.f28491i));
            this.f28493k.i(bVar2, "vod");
            viewHolder.ivFavourite.startAnimation(this.f28494l);
            imageView = viewHolder.ivFavourite;
        }
        imageView.setVisibility(0);
    }

    public final void D0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList) {
        ViewHolder viewHolder = (ViewHolder) e0Var;
        c.h.a.i.c cVar = new c.h.a.i.c();
        cVar.h(arrayList.get(i2).e0());
        cVar.i(c.h.a.i.q.m.z(this.f28491i));
        cVar.g(arrayList.get(i2).getName());
        cVar.e(arrayList.get(i2).g());
        this.C.Q(cVar);
        viewHolder.ivFavourite.startAnimation(this.f28494l);
        viewHolder.ivFavourite.setVisibility(0);
    }

    public final void E0(ArrayList<c.h.a.i.b> arrayList, RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList2, List<c.h.a.i.f> list, int i3, RelativeLayout relativeLayout) {
        if (arrayList.size() > 0) {
            K0(e0Var, i2, arrayList2, list, i3);
        } else {
            C0(e0Var, i2, arrayList2, list, i3);
        }
        this.r = true;
        Context context = this.f28491i;
        if (context instanceof VodAllDataSingleActivity) {
            ((VodAllDataSingleActivity) context).l1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x03b3 A[Catch: Exception -> 0x0246, TryCatch #7 {Exception -> 0x0246, blocks: (B:5:0x0028, B:7:0x002c, B:9:0x0032, B:11:0x0036, B:13:0x00ad, B:16:0x00bc, B:18:0x00c2, B:20:0x00c8, B:32:0x00fc, B:33:0x0106, B:40:0x018a, B:42:0x01a0, B:44:0x01ac, B:46:0x022b, B:48:0x022f, B:43:0x01a6, B:39:0x015c, B:38:0x0156, B:37:0x0129, B:21:0x00d3, B:14:0x00b3, B:49:0x023c, B:52:0x024d, B:54:0x0251, B:56:0x0257, B:58:0x025b, B:60:0x0275, B:62:0x027e, B:64:0x0284, B:66:0x028a, B:68:0x0290, B:70:0x0299, B:72:0x029f, B:76:0x02ac, B:78:0x02b2, B:80:0x02b9, B:82:0x02bf, B:84:0x02c6, B:86:0x02cc, B:88:0x02d2, B:90:0x02d8, B:92:0x02e0, B:94:0x02f4, B:95:0x02f7, B:97:0x0300, B:99:0x0306, B:101:0x030c, B:102:0x0314, B:104:0x031d, B:111:0x03a5, B:113:0x03b3, B:115:0x03c5, B:116:0x03c8, B:122:0x03ea, B:117:0x03cc, B:118:0x03d0, B:120:0x03e2, B:121:0x03e6, B:110:0x0374, B:109:0x0370, B:108:0x0340, B:103:0x0318, B:96:0x02fb, B:106:0x0323, B:35:0x010c), top: B:152:0x0022, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d0 A[Catch: Exception -> 0x0246, TryCatch #7 {Exception -> 0x0246, blocks: (B:5:0x0028, B:7:0x002c, B:9:0x0032, B:11:0x0036, B:13:0x00ad, B:16:0x00bc, B:18:0x00c2, B:20:0x00c8, B:32:0x00fc, B:33:0x0106, B:40:0x018a, B:42:0x01a0, B:44:0x01ac, B:46:0x022b, B:48:0x022f, B:43:0x01a6, B:39:0x015c, B:38:0x0156, B:37:0x0129, B:21:0x00d3, B:14:0x00b3, B:49:0x023c, B:52:0x024d, B:54:0x0251, B:56:0x0257, B:58:0x025b, B:60:0x0275, B:62:0x027e, B:64:0x0284, B:66:0x028a, B:68:0x0290, B:70:0x0299, B:72:0x029f, B:76:0x02ac, B:78:0x02b2, B:80:0x02b9, B:82:0x02bf, B:84:0x02c6, B:86:0x02cc, B:88:0x02d2, B:90:0x02d8, B:92:0x02e0, B:94:0x02f4, B:95:0x02f7, B:97:0x0300, B:99:0x0306, B:101:0x030c, B:102:0x0314, B:104:0x031d, B:111:0x03a5, B:113:0x03b3, B:115:0x03c5, B:116:0x03c8, B:122:0x03ea, B:117:0x03cc, B:118:0x03d0, B:120:0x03e2, B:121:0x03e6, B:110:0x0374, B:109:0x0370, B:108:0x0340, B:103:0x0318, B:96:0x02fb, B:106:0x0323, B:35:0x010c), top: B:152:0x0022, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04a0 A[Catch: Exception -> 0x04b7, TRY_LEAVE, TryCatch #5 {Exception -> 0x04b7, blocks: (B:124:0x040f, B:126:0x04a0), top: B:148:0x040f }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a0 A[Catch: Exception -> 0x0246, TryCatch #7 {Exception -> 0x0246, blocks: (B:5:0x0028, B:7:0x002c, B:9:0x0032, B:11:0x0036, B:13:0x00ad, B:16:0x00bc, B:18:0x00c2, B:20:0x00c8, B:32:0x00fc, B:33:0x0106, B:40:0x018a, B:42:0x01a0, B:44:0x01ac, B:46:0x022b, B:48:0x022f, B:43:0x01a6, B:39:0x015c, B:38:0x0156, B:37:0x0129, B:21:0x00d3, B:14:0x00b3, B:49:0x023c, B:52:0x024d, B:54:0x0251, B:56:0x0257, B:58:0x025b, B:60:0x0275, B:62:0x027e, B:64:0x0284, B:66:0x028a, B:68:0x0290, B:70:0x0299, B:72:0x029f, B:76:0x02ac, B:78:0x02b2, B:80:0x02b9, B:82:0x02bf, B:84:0x02c6, B:86:0x02cc, B:88:0x02d2, B:90:0x02d8, B:92:0x02e0, B:94:0x02f4, B:95:0x02f7, B:97:0x0300, B:99:0x0306, B:101:0x030c, B:102:0x0314, B:104:0x031d, B:111:0x03a5, B:113:0x03b3, B:115:0x03c5, B:116:0x03c8, B:122:0x03ea, B:117:0x03cc, B:118:0x03d0, B:120:0x03e2, B:121:0x03e6, B:110:0x0374, B:109:0x0370, B:108:0x0340, B:103:0x0318, B:96:0x02fb, B:106:0x0323, B:35:0x010c), top: B:152:0x0022, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a6 A[Catch: Exception -> 0x0246, TryCatch #7 {Exception -> 0x0246, blocks: (B:5:0x0028, B:7:0x002c, B:9:0x0032, B:11:0x0036, B:13:0x00ad, B:16:0x00bc, B:18:0x00c2, B:20:0x00c8, B:32:0x00fc, B:33:0x0106, B:40:0x018a, B:42:0x01a0, B:44:0x01ac, B:46:0x022b, B:48:0x022f, B:43:0x01a6, B:39:0x015c, B:38:0x0156, B:37:0x0129, B:21:0x00d3, B:14:0x00b3, B:49:0x023c, B:52:0x024d, B:54:0x0251, B:56:0x0257, B:58:0x025b, B:60:0x0275, B:62:0x027e, B:64:0x0284, B:66:0x028a, B:68:0x0290, B:70:0x0299, B:72:0x029f, B:76:0x02ac, B:78:0x02b2, B:80:0x02b9, B:82:0x02bf, B:84:0x02c6, B:86:0x02cc, B:88:0x02d2, B:90:0x02d8, B:92:0x02e0, B:94:0x02f4, B:95:0x02f7, B:97:0x0300, B:99:0x0306, B:101:0x030c, B:102:0x0314, B:104:0x031d, B:111:0x03a5, B:113:0x03b3, B:115:0x03c5, B:116:0x03c8, B:122:0x03ea, B:117:0x03cc, B:118:0x03d0, B:120:0x03e2, B:121:0x03e6, B:110:0x0374, B:109:0x0370, B:108:0x0340, B:103:0x0318, B:96:0x02fb, B:106:0x0323, B:35:0x010c), top: B:152:0x0022, inners: #0, #3 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    @android.annotation.SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.e0 r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.VodAllDataRightSideAdapter.F(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    public final void F0(ArrayList<c.h.a.i.c> arrayList, RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList2) {
        if (arrayList.size() > 0) {
            L0(e0Var, i2, arrayList2);
        } else {
            D0(e0Var, i2, arrayList2);
        }
        this.r = true;
        Context context = this.f28491i;
        if (context instanceof VodAllDataSingleActivity) {
            ((VodAllDataSingleActivity) context).l1();
        }
    }

    public boolean G0() {
        return this.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.e0 H(@NotNull ViewGroup viewGroup, int i2) {
        return i2 == 1 ? new ContinueWatchingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.series_all_data_right_adapter_con_wat, viewGroup, false)) : new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.series_all_data_right_adapter, viewGroup, false));
    }

    public int H0() {
        return this.s;
    }

    public final void I0() {
        if (this.p.equals("mobile")) {
            try {
                this.u = c.f.a.c.d.u.b.e(this.f28491i).c().c();
            } catch (Exception unused) {
            }
        }
        c.f.a.c.d.u.d dVar = this.u;
        if (dVar == null || !dVar.c()) {
            c.h.a.h.n.a.Y = true;
            c.h.a.h.n.e.W(this.f28491i, BuildConfig.FLAVOR, c.h.a.h.n.e.S(this.y), "movie", this.q, "0", this.z, BuildConfig.FLAVOR, this.A);
            return;
        }
        String strF = c.h.a.h.n.e.F(this.f28491i, c.h.a.h.n.e.S(this.y), this.q, "movie");
        c.f.a.c.d.u.d dVar2 = this.u;
        if (((dVar2 == null || dVar2.p() == null || this.u.p().j() == null || this.u.p().j().K() == null) ? BuildConfig.FLAVOR : this.u.p().j().K()).equals(strF)) {
            this.f28491i.startActivity(new Intent(this.f28491i, (Class<?>) ExpandedControlsActivity.class));
        } else {
            c.h.a.h.m.a.c(c.h.a.h.n.e.S(this.w), true, c.h.a.h.m.a.a(this.z, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, strF, "videos/mp4", this.v, BuildConfig.FLAVOR, null), this.u, this.f28491i);
        }
    }

    public final void J0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList, ArrayList<c.h.a.i.f> arrayList2, int i3) {
        if (i3 == 1) {
            j0 j0Var = new j0(this.f28491i, ((ContinueWatchingViewHolder) e0Var).cardView);
            j0Var.d(R.menu.menu_continue_watching);
            if (this.f28493k.l(c.h.a.h.n.e.S(arrayList2.get(i2).Y()), arrayList2.get(i2).g(), "vod", c.h.a.i.q.m.z(this.f28491i)).size() > 0) {
                j0Var.b().getItem(0).setVisible(false);
                j0Var.b().getItem(1).setVisible(true);
            } else {
                j0Var.b().getItem(0).setVisible(true);
                j0Var.b().getItem(1).setVisible(false);
            }
            j0Var.f(new k(e0Var, i2, arrayList, arrayList2, i3));
            j0Var.g();
        }
    }

    public final void K0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList, List<c.h.a.i.f> list, int i3) {
        ImageView imageView;
        if (i3 == 1) {
            this.f28493k.o(c.h.a.h.n.e.S(list.get(i2).Y()), list.get(i2).g(), "vod", list.get(i2).getName(), c.h.a.i.q.m.z(this.f28491i));
            imageView = ((ContinueWatchingViewHolder) e0Var).ivFavourite;
        } else {
            this.f28493k.o(c.h.a.h.n.e.S(arrayList.get(i2).Y()), arrayList.get(i2).g(), "vod", arrayList.get(i2).getName(), c.h.a.i.q.m.z(this.f28491i));
            imageView = ((ViewHolder) e0Var).ivFavourite;
        }
        imageView.setVisibility(4);
    }

    public final void L0(RecyclerView.e0 e0Var, int i2, ArrayList<c.h.a.i.f> arrayList) {
        this.C.I0(arrayList.get(i2).e0(), c.h.a.i.q.m.z(this.f28491i));
        ((ViewHolder) e0Var).ivFavourite.setVisibility(4);
    }

    public void M0() {
        this.r = false;
    }

    public final void N0(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3) {
        if (this.f28491i == null) {
            Log.e("Null hai context", ">>>>>>>>>>>True its Null");
            return;
        }
        Intent intent = (c.h.a.h.n.a.f17041e.booleanValue() && c.h.a.i.q.m.f(this.f28491i).equals("m3u")) ? new Intent(this.f28491i, (Class<?>) ViewDetailsTMDBActivity.class) : new Intent(this.f28491i, (Class<?>) ViewDetailsActivity.class);
        intent.putExtra(c.h.a.h.n.a.y, String.valueOf(i2));
        intent.putExtra("movie", str);
        intent.putExtra("movie_icon", str7);
        intent.putExtra("selectedPlayer", str2);
        intent.putExtra("streamType", str3);
        intent.putExtra("containerExtension", str4);
        intent.putExtra("categoryID", str5);
        intent.putExtra("num", str6);
        intent.putExtra("videoURL", str8);
        c.h.a.h.n.a.U = i3;
        this.f28491i.startActivity(intent);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f28495m.equals("continue_watching") ? this.f28497o : this.f28496n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        ArrayList<c.h.a.i.f> arrayList;
        if (this.f28495m.equals("continue_watching")) {
            ArrayList<c.h.a.i.f> arrayList2 = this.f28490h;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                return 0;
            }
            arrayList = this.f28490h;
        } else {
            ArrayList<c.h.a.i.f> arrayList3 = this.f28488f;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return 0;
            }
            arrayList = this.f28488f;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return this.f28495m.equals("continue_watching") ? 1 : 0;
    }
}
