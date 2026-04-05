package minefarts.iptvsmarters.view.adapter;

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
import c.h.a.i.q.k;
import c.h.a.i.q.m;
import c.k.b.t;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.pojo.ExternalPlayerModelClass;
import minefarts.iptvsmarters.view.activity.SeriesActivityNewFlowSubCategoriesM3U;
import minefarts.iptvsmarters.view.activity.SeriesDetailM3UActivity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesAdapterM3U extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f27846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f27847f;
    public ArrayList<ExternalPlayerModelClass> A;
    public SeriesActivityNewFlowSubCategoriesM3U B;
    public String C;
    public boolean D;
    public c.h.a.i.q.f E;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f27848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<c.h.a.i.f> f27849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f27850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<c.h.a.i.f> f27851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<c.h.a.i.f> f27853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.a f27854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f27855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f27856o;
    public SimpleDateFormat p;
    public SharedPreferences q;
    public int r;
    public int s;
    public Boolean t;
    public Date u;
    public Handler v;
    public int w = 0;
    public DateFormat x;
    public String y;
    public Boolean z;

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public CardView cardView;

        @BindView
        public TextView episodeName;

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
        public MyViewHolder f27857b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f27857b = myViewHolder;
            myViewHolder.episodeName = (TextView) b.c.c.c(view, R.id.tv_movie_name, "field 'episodeName'", TextView.class);
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
            MyViewHolder myViewHolder = this.f27857b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27857b = null;
            myViewHolder.episodeName = null;
            myViewHolder.Movie = null;
            myViewHolder.MovieImage = null;
            myViewHolder.cardView = null;
            myViewHolder.tvStreamOptions = null;
            myViewHolder.ivFavourite = null;
            myViewHolder.llMenu = null;
            myViewHolder.recentWatchIV = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27863g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27864h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27865i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27866j;

        public a(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f27858b = i2;
            this.f27859c = str;
            this.f27860d = str2;
            this.f27861e = str3;
            this.f27862f = str4;
            this.f27863g = str5;
            this.f27864h = str6;
            this.f27865i = str7;
            this.f27866j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesAdapterM3U.this.x0(this.f27858b, this.f27859c, this.f27860d, this.f27861e, this.f27862f, this.f27863g, this.f27864h, this.f27865i, this.f27866j);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27873g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27874h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27875i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27876j;

        public b(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f27868b = i2;
            this.f27869c = str;
            this.f27870d = str2;
            this.f27871e = str3;
            this.f27872f = str4;
            this.f27873g = str5;
            this.f27874h = str6;
            this.f27875i = str7;
            this.f27876j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesAdapterM3U.this.x0(this.f27868b, this.f27869c, this.f27870d, this.f27871e, this.f27872f, this.f27873g, this.f27874h, this.f27875i, this.f27876j);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27881e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27882f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27883g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27884h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27885i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27886j;

        public c(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f27878b = i2;
            this.f27879c = str;
            this.f27880d = str2;
            this.f27881e = str3;
            this.f27882f = str4;
            this.f27883g = str5;
            this.f27884h = str6;
            this.f27885i = str7;
            this.f27886j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesAdapterM3U.this.x0(this.f27878b, this.f27879c, this.f27880d, this.f27881e, this.f27882f, this.f27883g, this.f27884h, this.f27885i, this.f27886j);
        }
    }

    public class d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27894h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27895i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27896j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f27897k;

        public d(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f27888b = myViewHolder;
            this.f27889c = i2;
            this.f27890d = str;
            this.f27891e = str2;
            this.f27892f = str3;
            this.f27893g = str4;
            this.f27894h = str5;
            this.f27895i = str6;
            this.f27896j = str7;
            this.f27897k = str8;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesAdapterM3U.this.w0(this.f27888b, this.f27889c, this.f27890d, this.f27891e, this.f27892f, this.f27893g, this.f27894h, this.f27895i, this.f27896j, this.f27897k);
            return true;
        }
    }

    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27903f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27904g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27905h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27906i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27907j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f27908k;

        public e(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f27899b = myViewHolder;
            this.f27900c = i2;
            this.f27901d = str;
            this.f27902e = str2;
            this.f27903f = str3;
            this.f27904g = str4;
            this.f27905h = str5;
            this.f27906i = str6;
            this.f27907j = str7;
            this.f27908k = str8;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesAdapterM3U.this.w0(this.f27899b, this.f27900c, this.f27901d, this.f27902e, this.f27903f, this.f27904g, this.f27905h, this.f27906i, this.f27907j, this.f27908k);
            return true;
        }
    }

    public class f implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27914f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27915g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27916h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27917i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27918j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f27919k;

        public f(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f27910b = myViewHolder;
            this.f27911c = i2;
            this.f27912d = str;
            this.f27913e = str2;
            this.f27914f = str3;
            this.f27915g = str4;
            this.f27916h = str5;
            this.f27917i = str6;
            this.f27918j = str7;
            this.f27919k = str8;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesAdapterM3U.this.w0(this.f27910b, this.f27911c, this.f27912d, this.f27913e, this.f27914f, this.f27915g, this.f27916h, this.f27917i, this.f27918j, this.f27919k);
            return true;
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27925f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27926g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27927h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27928i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27929j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f27930k;

        public g(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f27921b = myViewHolder;
            this.f27922c = i2;
            this.f27923d = str;
            this.f27924e = str2;
            this.f27925f = str3;
            this.f27926g = str4;
            this.f27927h = str5;
            this.f27928i = str6;
            this.f27929j = str7;
            this.f27930k = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesAdapterM3U.this.w0(this.f27921b, this.f27922c, this.f27923d, this.f27924e, this.f27925f, this.f27926g, this.f27927h, this.f27928i, this.f27929j, this.f27930k);
        }
    }

    public class h implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f27932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27938g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27939h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27940i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27941j;

        public h(String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, MyViewHolder myViewHolder) {
            this.f27932a = str;
            this.f27933b = i2;
            this.f27934c = str2;
            this.f27935d = str3;
            this.f27936e = str4;
            this.f27937f = str5;
            this.f27938g = str6;
            this.f27939h = str7;
            this.f27940i = str8;
            this.f27941j = myViewHolder;
        }

        public final void a() {
            c.h.a.i.c cVar = new c.h.a.i.c();
            cVar.h(this.f27932a);
            cVar.i(m.z(SeriesAdapterM3U.this.f27848g));
            cVar.g(this.f27934c);
            cVar.e(this.f27938g);
            SeriesAdapterM3U.this.E.Q(cVar);
            this.f27941j.ivFavourite.setVisibility(0);
        }

        public final void b() {
            c.h.a.h.n.e.W(SeriesAdapterM3U.this.f27848g, this.f27935d, this.f27933b, this.f27936e, this.f27937f, this.f27939h, this.f27934c, this.f27932a, 0);
        }

        public final void c() {
            SeriesAdapterM3U seriesAdapterM3U = SeriesAdapterM3U.this;
            seriesAdapterM3U.E.I0(this.f27932a, m.z(seriesAdapterM3U.f27848g));
            this.f27941j.ivFavourite.setVisibility(4);
        }

        public final void d(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            if (SeriesAdapterM3U.this.f27848g == null) {
                Log.e("Null hai context", ">>>>>>>>>>>True its Null");
                return;
            }
            Intent intent = new Intent(SeriesAdapterM3U.this.f27848g, (Class<?>) SeriesDetailM3UActivity.class);
            intent.putExtra("series_num", str6);
            intent.putExtra("episode_name", str);
            intent.putExtra("series_name", SeriesAdapterM3U.this.y);
            intent.putExtra("series_icon", str7);
            intent.putExtra("episode_url", str8);
            intent.putExtra("series_categoryId", str5);
            SeriesAdapterM3U.this.f27848g.startActivity(intent);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            r1 = new android.content.Intent(r11.f27942k.f27848g, (java.lang.Class<?>) minefarts.iptvsmarters.view.activity.PlayExternalPlayerActivity.class);
            r1.putExtra("url", r11.f27932a);
            r1.putExtra("app_name", ((minefarts.iptvsmarters.model.pojo.ExternalPlayerModelClass) r11.f27942k.A.get(r0)).a());
            r1.putExtra("packagename", ((minefarts.iptvsmarters.model.pojo.ExternalPlayerModelClass) r11.f27942k.A.get(r0)).b());
            r11.f27942k.f27848g.startActivity(r1);
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
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.h.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f27944c;

        public class a implements Runnable {
            public a() {
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
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U$i r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.i.this
                    java.lang.String r0 = r0.f27943b
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L16
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U$i r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.i.this
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                    java.util.List r1 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.q0(r0)
                L12:
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.e0(r0, r1)
                    goto L3b
                L16:
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U$i r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.i.this
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                    java.util.List r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.o0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L32
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U$i r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.i.this
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                    java.util.List r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.o0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L3b
                L32:
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U$i r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.i.this
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                    java.util.List r1 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.o0(r0)
                    goto L12
                L3b:
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U$i r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.i.this
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                    java.util.List r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.c0(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L51
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U$i r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.i.this
                    android.widget.TextView r0 = r0.f27944c
                    r1 = 0
                    r0.setVisibility(r1)
                L51:
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U$i r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.i.this
                    minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                    int r1 = r0.s
                    r0.r = r1
                    r0.w()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.i.a.run():void");
            }
        }

        public i(String str, TextView textView) {
            this.f27943b = str;
            this.f27944c = textView;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.p0(r0, r1)
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                java.lang.String r1 = r4.f27943b
                int r1 = r1.length()
                r0.s = r1
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.o0(r0)
                if (r0 == 0) goto L25
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.o0(r0)
                r0.clear()
            L25:
                java.lang.String r0 = r4.f27943b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L3d
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.o0(r0)
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r1 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                java.util.List r1 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.q0(r1)
                r0.addAll(r1)
                goto L94
            L3d:
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.c0(r0)
                int r0 = r0.size()
                if (r0 == 0) goto L51
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                int r1 = r0.r
                int r0 = r0.s
                if (r1 <= r0) goto L5a
            L51:
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                java.util.List r1 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.q0(r0)
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.e0(r0, r1)
            L5a:
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.c0(r0)
                java.util.Iterator r0 = r0.iterator()
            L64:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L94
                java.lang.Object r1 = r0.next()
                c.h.a.i.f r1 = (c.h.a.i.f) r1
                java.lang.String r2 = r1.getName()
                if (r2 == 0) goto L64
                java.lang.String r2 = r1.getName()
                java.lang.String r2 = r2.toLowerCase()
                java.lang.String r3 = r4.f27943b
                java.lang.String r3 = r3.toLowerCase()
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto L64
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r2 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                java.util.List r2 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.o0(r2)
                r2.add(r1)
                goto L64
            L94:
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.this
                android.content.Context r0 = minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.i0(r0)
                android.app.Activity r0 = (android.app.Activity) r0
                minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U$i$a r1 = new minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U$i$a
                r1.<init>()
                r0.runOnUiThread(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.SeriesAdapterM3U.i.run():void");
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27947b;

        public j(View view) {
            this.f27947b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27947b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27947b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27947b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            if (z) {
                b(z ? 1.1f : 1.0f);
                Log.e("id is", BuildConfig.FLAVOR + this.f27947b.getTag());
                return;
            }
            if (z) {
                return;
            }
            float f2 = z ? 1.09f : 1.0f;
            b(f2);
            c(f2);
            a(z);
        }
    }

    public SeriesAdapterM3U(List<c.h.a.i.f> list, Context context, boolean z, SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U, String str) {
        String str2;
        String str3;
        this.t = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        this.z = bool;
        this.C = BuildConfig.FLAVOR;
        this.D = true;
        this.f27849h = list;
        this.y = str;
        this.f27848g = context;
        this.f27852k = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        ArrayList arrayList = new ArrayList();
        this.f27851j = arrayList;
        arrayList.addAll(list);
        f27847f = context.getApplicationContext().getPackageName();
        this.f27853l = list;
        f27846e = t0(context);
        this.f27854m = new c.h.a.i.q.a(context);
        this.f27855n = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        Locale locale = Locale.US;
        this.p = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f27856o = new k(context);
        this.x = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.v = new Handler();
        this.u = new Date();
        this.D = z;
        SimpleDateFormat simpleDateFormat = this.p;
        if (r0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(context))), this.x.format(this.u)) >= c.h.a.k.d.c.a.d.p() && (str2 = this.f27852k) != null && this.f27855n != null && (!f27846e.equals(str2) || (this.f27852k != null && (str3 = this.f27855n) != null && !f27847f.equals(str3)))) {
            this.t = bool;
        }
        this.B = seriesActivityNewFlowSubCategoriesM3U;
        this.E = new c.h.a.i.q.f(context);
    }

    public SeriesAdapterM3U(List<c.h.a.i.f> list, Context context, boolean z, String str) {
        String str2;
        String str3;
        this.t = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        this.z = bool;
        this.C = BuildConfig.FLAVOR;
        this.D = true;
        this.f27849h = list;
        this.y = str;
        this.f27848g = context;
        this.f27852k = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        f27847f = context.getApplicationContext().getPackageName();
        this.f27851j = new ArrayList();
        f27846e = t0(context);
        this.f27855n = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        this.f27851j.addAll(list);
        Locale locale = Locale.US;
        this.p = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f27853l = list;
        this.x = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f27854m = new c.h.a.i.q.a(context);
        this.u = new Date();
        this.f27856o = new k(context);
        SimpleDateFormat simpleDateFormat = this.p;
        if (r0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(context))), this.x.format(this.u)) >= c.h.a.k.d.c.a.d.p() && (str2 = this.f27852k) != null && this.f27855n != null && (!f27846e.equals(str2) || (this.f27852k != null && (str3 = this.f27855n) != null && !f27847f.equals(str3)))) {
            this.t = bool;
        }
        this.v = new Handler();
        this.D = z;
        this.E = new c.h.a.i.q.f(context);
    }

    public static long r0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String t0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27849h.size();
    }

    public void s0(String str, TextView textView) {
        new Thread(new i(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, @SuppressLint({"RecyclerView"}) int i2) {
        int i3;
        ImageView imageView;
        Drawable drawableF;
        Context context = this.f27848g;
        if (context != null) {
            this.w = i2;
            SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
            this.f27850i = sharedPreferences;
            String string = sharedPreferences.getString("selectedPlayer", BuildConfig.FLAVOR);
            if (i2 == 0 && myViewHolder.Movie != null && !this.z.booleanValue()) {
                this.z = Boolean.TRUE;
                myViewHolder.Movie.requestFocus();
            }
            if (this.f27849h.get(i2).Y() != null) {
                try {
                    i3 = Integer.parseInt(this.f27849h.get(i2).Y());
                } catch (NumberFormatException unused) {
                    i3 = 0;
                }
            } else {
                i3 = 0;
            }
            String strG = this.f27849h.get(i2).g();
            String strC = this.f27849h.get(i2).C();
            String strZ = this.f27849h.get(i2).Z();
            String strP = this.f27849h.get(i2).P();
            myViewHolder.episodeName.setText(this.f27849h.get(i2).getName());
            String strX = this.f27849h.get(i2).X();
            String name = this.f27849h.get(i2).getName();
            String strE0 = this.f27849h.get(i2).e0();
            if (!this.D) {
                myViewHolder.recentWatchIV.setVisibility(0);
            }
            myViewHolder.MovieImage.setImageDrawable(null);
            if (strX == null || strX.equals(BuildConfig.FLAVOR)) {
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView = myViewHolder.MovieImage;
                    drawableF = this.f27848g.getResources().getDrawable(R.drawable.noposter, null);
                } else {
                    imageView = myViewHolder.MovieImage;
                    drawableF = a.i.i.b.f(this.f27848g, R.drawable.noposter);
                }
                imageView.setImageDrawable(drawableF);
            } else {
                t.q(this.f27848g).l(this.f27849h.get(i2).X()).d(R.drawable.noposter).j(R.drawable.noposter).g(myViewHolder.MovieImage);
            }
            if (this.E.U(strE0, m.z(this.f27848g)).size() > 0) {
                myViewHolder.ivFavourite.setVisibility(0);
            } else {
                myViewHolder.ivFavourite.setVisibility(4);
            }
            int i4 = i3;
            myViewHolder.cardView.setOnClickListener(new a(i4, name, string, strZ, strC, strG, strP, strX, strE0));
            myViewHolder.MovieImage.setOnClickListener(new b(i4, name, string, strZ, strC, strG, strP, strX, strE0));
            myViewHolder.Movie.setOnClickListener(new c(i4, name, string, strZ, strC, strG, strP, strX, strE0));
            RelativeLayout relativeLayout = myViewHolder.Movie;
            relativeLayout.setOnFocusChangeListener(new j(relativeLayout));
            int i5 = i3;
            myViewHolder.Movie.setOnLongClickListener(new d(myViewHolder, i5, strG, name, string, strZ, strC, strP, strE0, strX));
            myViewHolder.MovieImage.setOnLongClickListener(new e(myViewHolder, i5, strG, name, string, strZ, strC, strP, strE0, strX));
            myViewHolder.cardView.setOnLongClickListener(new f(myViewHolder, i5, strG, name, string, strZ, strC, strP, strE0, strX));
            myViewHolder.llMenu.setOnClickListener(new g(myViewHolder, i5, strG, name, string, strZ, strC, strP, strE0, strX));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        SharedPreferences sharedPreferences = this.f27848g.getSharedPreferences("listgridview", 0);
        this.q = sharedPreferences;
        int i4 = sharedPreferences.getInt("series", 0);
        c.h.a.h.n.a.w = i4;
        if (i4 == 1) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.vod_linear_layout;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.vod_grid_layout;
        }
        return new MyViewHolder(layoutInflaterFrom.inflate(i3, viewGroup, false));
    }

    public final void w0(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Menu menuB;
        int i3;
        Context context = this.f27848g;
        if (context != null) {
            j0 j0Var = new j0(context, myViewHolder.tvStreamOptions);
            j0Var.d(R.menu.menu_card_episodes_m3u);
            ArrayList<c.h.a.i.c> arrayListU = this.E.U(str7, m.z(this.f27848g));
            if (arrayListU == null || arrayListU.size() <= 0) {
                menuB = j0Var.b();
                i3 = 3;
            } else {
                menuB = j0Var.b();
                i3 = 4;
            }
            menuB.getItem(i3).setVisible(true);
            if (this.D) {
                j0Var.b().getItem(5).setVisible(false);
            } else {
                j0Var.b().getItem(5).setVisible(true);
            }
            try {
                if (this.t.booleanValue()) {
                    this.A = new ArrayList<>();
                    ArrayList<ExternalPlayerModelClass> arrayListL = new c.h.a.i.q.d(this.f27848g).l();
                    this.A = arrayListL;
                    if (arrayListL != null && arrayListL.size() > 0) {
                        for (int i4 = 0; i4 < this.A.size(); i4++) {
                            j0Var.b().add(0, i4, i4, this.A.get(i4).a());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            j0Var.f(new h(str7, i2, str2, str3, str4, str5, str, str6, str8, myViewHolder));
            j0Var.g();
        }
    }

    public final void x0(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (this.f27848g == null) {
            Log.e("Null hai context", ">>>>>>>>>>>True its Null");
            return;
        }
        Intent intent = new Intent(this.f27848g, (Class<?>) SeriesDetailM3UActivity.class);
        intent.putExtra("series_num", str6);
        intent.putExtra("episode_name", str);
        intent.putExtra("series_name", this.y);
        intent.putExtra("series_icon", str7);
        intent.putExtra("episode_url", str8);
        intent.putExtra("series_categoryId", str5);
        this.f27848g.startActivity(intent);
    }
}
