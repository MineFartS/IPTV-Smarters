package minefarts.iptvsmarters.view.adapter;

import a.b.q.j0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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
import c.h.a.i.q.m;
import c.k.b.t;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.SeriesDBModel;
import minefarts.iptvsmarters.view.activity.SeriesDetailActivity;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesStreamsAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f28115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<SeriesDBModel> f28116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f28117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<SeriesDBModel> f28118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<SeriesDBModel> f28119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.a f28120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.f f28121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MyViewHolder f28122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SharedPreferences f28123m;

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public CardView cardView;

        @BindView
        public ImageView ivChannelLogo;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public ProgressBar progressBar;

        @BindView
        public RelativeLayout rlChannelBottom;

        @BindView
        public RelativeLayout rlMovieImage;

        @BindView
        public RelativeLayout rlStreamsLayout;

        @BindView
        public TextView tvChannelName;

        @BindView
        public TextView tvCurrentLive;

        @BindView
        public TextView tvStreamOptions;

        @BindView
        public TextView tvTime;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f28124b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f28124b = myViewHolder;
            myViewHolder.ivChannelLogo = (ImageView) b.c.c.c(view, R.id.iv_channel_logo, "field 'ivChannelLogo'", ImageView.class);
            myViewHolder.tvChannelName = (TextView) b.c.c.c(view, R.id.tv_movie_name, "field 'tvChannelName'", TextView.class);
            myViewHolder.cardView = (CardView) b.c.c.c(view, R.id.card_view, "field 'cardView'", CardView.class);
            myViewHolder.tvStreamOptions = (TextView) b.c.c.c(view, R.id.tv_streamOptions, "field 'tvStreamOptions'", TextView.class);
            myViewHolder.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
            myViewHolder.rlStreamsLayout = (RelativeLayout) b.c.c.c(view, R.id.rl_streams_layout, "field 'rlStreamsLayout'", RelativeLayout.class);
            myViewHolder.rlChannelBottom = (RelativeLayout) b.c.c.c(view, R.id.rl_channel_bottom, "field 'rlChannelBottom'", RelativeLayout.class);
            myViewHolder.llMenu = (LinearLayout) b.c.c.c(view, R.id.ll_menu, "field 'llMenu'", LinearLayout.class);
            myViewHolder.progressBar = (ProgressBar) b.c.c.c(view, R.id.progressBar, "field 'progressBar'", ProgressBar.class);
            myViewHolder.tvCurrentLive = (TextView) b.c.c.c(view, R.id.tv_current_live, "field 'tvCurrentLive'", TextView.class);
            myViewHolder.tvTime = (TextView) b.c.c.c(view, R.id.tv_time, "field 'tvTime'", TextView.class);
            myViewHolder.rlMovieImage = (RelativeLayout) b.c.c.c(view, R.id.rl_movie_image, "field 'rlMovieImage'", RelativeLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f28124b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f28124b = null;
            myViewHolder.ivChannelLogo = null;
            myViewHolder.tvChannelName = null;
            myViewHolder.cardView = null;
            myViewHolder.tvStreamOptions = null;
            myViewHolder.ivFavourite = null;
            myViewHolder.rlStreamsLayout = null;
            myViewHolder.rlChannelBottom = null;
            myViewHolder.llMenu = null;
            myViewHolder.progressBar = null;
            myViewHolder.tvCurrentLive = null;
            myViewHolder.tvTime = null;
            myViewHolder.rlMovieImage = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f28128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28131h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28132i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28133j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f28134k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f28135l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f28136m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f28137n;

        public a(String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.f28125b = str;
            this.f28126c = str2;
            this.f28127d = str3;
            this.f28128e = i2;
            this.f28129f = str4;
            this.f28130g = str5;
            this.f28131h = str6;
            this.f28132i = str7;
            this.f28133j = str8;
            this.f28134k = str9;
            this.f28135l = str10;
            this.f28136m = str11;
            this.f28137n = str12;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesStreamsAdapter.this.l0(this.f28125b, this.f28126c, this.f28127d, this.f28128e, this.f28129f, this.f28130g, this.f28131h, this.f28132i, this.f28133j, this.f28134k, this.f28135l, this.f28136m, this.f28137n);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f28142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28143f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28144g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28145h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28146i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28147j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f28148k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f28149l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f28150m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f28151n;

        public b(String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.f28139b = str;
            this.f28140c = str2;
            this.f28141d = str3;
            this.f28142e = i2;
            this.f28143f = str4;
            this.f28144g = str5;
            this.f28145h = str6;
            this.f28146i = str7;
            this.f28147j = str8;
            this.f28148k = str9;
            this.f28149l = str10;
            this.f28150m = str11;
            this.f28151n = str12;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesStreamsAdapter.this.l0(this.f28139b, this.f28140c, this.f28141d, this.f28142e, this.f28143f, this.f28144g, this.f28145h, this.f28146i, this.f28147j, this.f28148k, this.f28149l, this.f28150m, this.f28151n);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f28156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28157f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28158g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28159h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28160i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28161j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f28162k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f28163l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f28164m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f28165n;

        public c(String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.f28153b = str;
            this.f28154c = str2;
            this.f28155d = str3;
            this.f28156e = i2;
            this.f28157f = str4;
            this.f28158g = str5;
            this.f28159h = str6;
            this.f28160i = str7;
            this.f28161j = str8;
            this.f28162k = str9;
            this.f28163l = str10;
            this.f28164m = str11;
            this.f28165n = str12;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesStreamsAdapter.this.l0(this.f28153b, this.f28154c, this.f28155d, this.f28156e, this.f28157f, this.f28158g, this.f28159h, this.f28160i, this.f28161j, this.f28162k, this.f28163l, this.f28164m, this.f28165n);
        }
    }

    public class d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28171f;

        public d(MyViewHolder myViewHolder, int i2, String str, String str2, String str3) {
            this.f28167b = myViewHolder;
            this.f28168c = i2;
            this.f28169d = str;
            this.f28170e = str2;
            this.f28171f = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesStreamsAdapter.this.i0(this.f28167b, this.f28168c, this.f28169d, this.f28170e, this.f28171f);
            return true;
        }
    }

    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28177f;

        public e(MyViewHolder myViewHolder, int i2, String str, String str2, String str3) {
            this.f28173b = myViewHolder;
            this.f28174c = i2;
            this.f28175d = str;
            this.f28176e = str2;
            this.f28177f = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesStreamsAdapter.this.i0(this.f28173b, this.f28174c, this.f28175d, this.f28176e, this.f28177f);
            return true;
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28183f;

        public f(MyViewHolder myViewHolder, int i2, String str, String str2, String str3) {
            this.f28179b = myViewHolder;
            this.f28180c = i2;
            this.f28181d = str;
            this.f28182e = str2;
            this.f28183f = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesStreamsAdapter.this.i0(this.f28179b, this.f28180c, this.f28181d, this.f28182e, this.f28183f);
        }
    }

    public class g implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28189e;

        public g(MyViewHolder myViewHolder, String str, int i2, String str2, String str3) {
            this.f28185a = myViewHolder;
            this.f28186b = str;
            this.f28187c = i2;
            this.f28188d = str2;
            this.f28189e = str3;
        }

        public final void a() {
            this.f28185a.cardView.performClick();
        }

        public final void b() {
            c.h.a.i.b bVar = new c.h.a.i.b();
            bVar.h(this.f28186b);
            bVar.m(this.f28187c);
            bVar.k(this.f28188d);
            bVar.l(this.f28189e);
            bVar.o(m.z(SeriesStreamsAdapter.this.f28115e));
            SeriesStreamsAdapter.this.f28120j.i(bVar, "series");
            this.f28185a.ivFavourite.setVisibility(0);
        }

        public final void c() {
            SeriesStreamsAdapter.this.f28120j.o(this.f28187c, this.f28186b, "series", this.f28188d, m.z(SeriesStreamsAdapter.this.f28115e));
            this.f28185a.ivFavourite.setVisibility(4);
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.menu_series_details) {
                a();
                return false;
            }
            if (itemId == R.id.nav_add_to_fav) {
                b();
                return false;
            }
            if (itemId != R.id.nav_remove_from_fav) {
                return false;
            }
            c();
            return false;
        }
    }

    public SeriesStreamsAdapter(List<SeriesDBModel> list, Context context) {
        this.f28116f = list;
        this.f28115e = context;
        ArrayList arrayList = new ArrayList();
        this.f28118h = arrayList;
        arrayList.addAll(list);
        this.f28119i = list;
        this.f28120j = new c.h.a.i.q.a(context);
        this.f28121k = new c.h.a.i.q.f(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, int i2) {
        String str;
        String strB;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        int i3;
        MyViewHolder myViewHolder2;
        ImageView imageView;
        int i4;
        if (this.f28115e != null) {
            List<SeriesDBModel> list = this.f28116f;
            if (list != null) {
                SeriesDBModel seriesDBModel = list.get(i2);
                String strE = seriesDBModel.e() != null ? seriesDBModel.e() : BuildConfig.FLAVOR;
                String strD = seriesDBModel.d() != null ? seriesDBModel.d() : BuildConfig.FLAVOR;
                String strG = seriesDBModel.g() != null ? seriesDBModel.g() : BuildConfig.FLAVOR;
                int iR = seriesDBModel.r() != -1 ? seriesDBModel.r() : -1;
                String strK = seriesDBModel.k() != null ? seriesDBModel.k() : BuildConfig.FLAVOR;
                String strO = seriesDBModel.o() != null ? seriesDBModel.o() : BuildConfig.FLAVOR;
                String strJ = seriesDBModel.j() != null ? seriesDBModel.j() : BuildConfig.FLAVOR;
                String strL = seriesDBModel.l() != null ? seriesDBModel.l() : BuildConfig.FLAVOR;
                String strM = seriesDBModel.m() != null ? seriesDBModel.m() : BuildConfig.FLAVOR;
                String strQ = seriesDBModel.q() != null ? seriesDBModel.q() : BuildConfig.FLAVOR;
                String strN = seriesDBModel.n() != null ? seriesDBModel.n() : BuildConfig.FLAVOR;
                String strP = seriesDBModel.p() != null ? seriesDBModel.p() : BuildConfig.FLAVOR;
                if (seriesDBModel.b() != null) {
                    str4 = strE;
                    str3 = strD;
                    str5 = strO;
                    str6 = strJ;
                    str7 = strL;
                    str8 = strM;
                    str9 = strQ;
                    str10 = strN;
                    str11 = strP;
                    strB = seriesDBModel.b();
                    i3 = iR;
                } else {
                    str4 = strE;
                    str3 = strD;
                    str5 = strO;
                    str6 = strJ;
                    str7 = strL;
                    str8 = strM;
                    str9 = strQ;
                    str10 = strN;
                    str11 = strP;
                    i3 = iR;
                    strB = BuildConfig.FLAVOR;
                }
                str2 = strG;
                str = strK;
            } else {
                str = BuildConfig.FLAVOR;
                strB = str;
                str2 = strB;
                str3 = str2;
                str4 = str3;
                str5 = str4;
                str6 = str5;
                str7 = str6;
                str8 = str7;
                str9 = str8;
                str10 = str9;
                str11 = str10;
                i3 = -1;
            }
            this.f28117g = this.f28115e.getSharedPreferences("selectedPlayer", 0);
            myViewHolder.tvTime.setText(BuildConfig.FLAVOR);
            myViewHolder.progressBar.setVisibility(8);
            myViewHolder.tvCurrentLive.setText(BuildConfig.FLAVOR);
            myViewHolder.tvChannelName.setText(this.f28116f.get(i2).d());
            myViewHolder.ivChannelLogo.setImageDrawable(null);
            if (str != null && !str.equals(BuildConfig.FLAVOR)) {
                t.q(this.f28115e).l(str).j(R.drawable.noposter).g(myViewHolder.ivChannelLogo);
            } else if (Build.VERSION.SDK_INT >= 21) {
                myViewHolder.ivChannelLogo.setImageDrawable(this.f28115e.getResources().getDrawable(R.drawable.noposter, null));
            } else {
                myViewHolder.ivChannelLogo.setImageDrawable(a.i.i.b.f(this.f28115e, R.drawable.noposter));
            }
            String str12 = str4;
            String str13 = str3;
            String str14 = str2;
            String str15 = str;
            String str16 = str5;
            String str17 = str6;
            String str18 = str7;
            String str19 = str8;
            String str20 = str;
            String str21 = str9;
            String str22 = strB;
            String str23 = str10;
            int i5 = i3;
            myViewHolder.cardView.setOnClickListener(new a(str12, str13, str14, i3, str15, str16, str17, str18, str19, str21, str23, str11, str22));
            myViewHolder.rlMovieImage.setOnClickListener(new b(str12, str13, str14, i5, str20, str16, str17, str18, str19, str21, str23, str11, str22));
            myViewHolder.rlStreamsLayout.setOnClickListener(new c(str12, str13, str14, i5, str20, str16, str17, str18, str19, str21, str23, str11, str22));
            ArrayList<c.h.a.i.b> arrayListL = this.f28120j.l(i5, str22, "series", m.z(this.f28115e));
            if (arrayListL == null || arrayListL.size() <= 0) {
                myViewHolder2 = myViewHolder;
                imageView = myViewHolder2.ivFavourite;
                i4 = 4;
            } else {
                myViewHolder2 = myViewHolder;
                imageView = myViewHolder2.ivFavourite;
                i4 = 0;
            }
            imageView.setVisibility(i4);
            String str24 = str3;
            String str25 = str4;
            myViewHolder2.rlStreamsLayout.setOnLongClickListener(new d(myViewHolder, i5, str22, str24, str25));
            myViewHolder2.rlMovieImage.setOnLongClickListener(new e(myViewHolder, i5, str22, str24, str25));
            myViewHolder2.llMenu.setOnClickListener(new f(myViewHolder, i5, str22, str24, str25));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        SharedPreferences sharedPreferences = this.f28115e.getSharedPreferences("listgridview", 0);
        this.f28123m = sharedPreferences;
        int i3 = sharedPreferences.getInt("livestream", 0);
        c.h.a.h.n.a.u = i3;
        MyViewHolder myViewHolder = i3 == 1 ? new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.live_streams_layout, viewGroup, false)) : new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.live_streams_linear_layout, viewGroup, false));
        this.f28122l = myViewHolder;
        return myViewHolder;
    }

    public final void i0(MyViewHolder myViewHolder, int i2, String str, String str2, String str3) {
        Menu menuB;
        int i3;
        j0 j0Var = new j0(this.f28115e, myViewHolder.tvStreamOptions);
        j0Var.d(R.menu.menu_card_series_streams);
        if (this.f28120j.l(i2, str, "series", m.z(this.f28115e)).size() > 0) {
            menuB = j0Var.b();
            i3 = 2;
        } else {
            menuB = j0Var.b();
            i3 = 1;
        }
        menuB.getItem(i3).setVisible(false);
        j0Var.f(new g(myViewHolder, str, i2, str2, str3));
        j0Var.g();
    }

    public final void l0(String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        if (this.f28115e != null) {
            Intent intent = new Intent(this.f28115e, (Class<?>) SeriesDetailActivity.class);
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
            this.f28115e.startActivity(intent);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f28116f.size();
    }
}
