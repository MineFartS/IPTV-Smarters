package minefarts.iptvsmarters.view.adapter;

import a.b.q.j0;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
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
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.SeriesDBModel;
import minefarts.iptvsmarters.view.activity.SeriesDetailActivity;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f27751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<SeriesDBModel> f27752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f27753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<SeriesDBModel> f27754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<SeriesDBModel> f27755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.a f27756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SharedPreferences f27757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences.Editor f27758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f27759m = Boolean.FALSE;

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
        public TextView tvStreamOptions;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f27760b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f27760b = myViewHolder;
            myViewHolder.MovieName = (TextView) b.c.c.c(view, R.id.tv_movie_name, "field 'MovieName'", TextView.class);
            myViewHolder.Movie = (RelativeLayout) b.c.c.c(view, R.id.rl_movie, "field 'Movie'", RelativeLayout.class);
            myViewHolder.MovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'MovieImage'", ImageView.class);
            myViewHolder.cardView = (CardView) b.c.c.c(view, R.id.card_view, "field 'cardView'", CardView.class);
            myViewHolder.tvStreamOptions = (TextView) b.c.c.c(view, R.id.tv_streamOptions, "field 'tvStreamOptions'", TextView.class);
            myViewHolder.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
            myViewHolder.llMenu = (LinearLayout) b.c.c.c(view, R.id.ll_menu, "field 'llMenu'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f27760b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27760b = null;
            myViewHolder.MovieName = null;
            myViewHolder.Movie = null;
            myViewHolder.MovieImage = null;
            myViewHolder.cardView = null;
            myViewHolder.tvStreamOptions = null;
            myViewHolder.ivFavourite = null;
            myViewHolder.llMenu = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27766g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27767h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27768i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27769j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f27770k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f27771l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f27772m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f27773n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f27774o;
        public final /* synthetic */ String p;
        public final /* synthetic */ String q;
        public final /* synthetic */ String r;

        public a(String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.f27761b = str;
            this.f27762c = str2;
            this.f27763d = str3;
            this.f27764e = i2;
            this.f27765f = str4;
            this.f27766g = str5;
            this.f27767h = str6;
            this.f27768i = str7;
            this.f27769j = str8;
            this.f27770k = str9;
            this.f27771l = str10;
            this.f27772m = str11;
            this.f27773n = str12;
            this.f27774o = str13;
            this.p = str14;
            this.q = str15;
            this.r = str16;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesAdapter.this.i0(this.f27761b, this.f27762c, this.f27763d, this.f27764e, this.f27765f, this.f27766g, this.f27767h, this.f27768i, this.f27769j, this.f27770k, this.f27771l, this.f27772m, this.f27773n, this.f27774o, this.p, this.q, this.r);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27778e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27779f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27780g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27781h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27782i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27783j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f27784k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f27785l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f27786m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f27787n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f27788o;
        public final /* synthetic */ String p;
        public final /* synthetic */ String q;
        public final /* synthetic */ String r;

        public b(String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.f27775b = str;
            this.f27776c = str2;
            this.f27777d = str3;
            this.f27778e = i2;
            this.f27779f = str4;
            this.f27780g = str5;
            this.f27781h = str6;
            this.f27782i = str7;
            this.f27783j = str8;
            this.f27784k = str9;
            this.f27785l = str10;
            this.f27786m = str11;
            this.f27787n = str12;
            this.f27788o = str13;
            this.p = str14;
            this.q = str15;
            this.r = str16;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesAdapter.this.i0(this.f27775b, this.f27776c, this.f27777d, this.f27778e, this.f27779f, this.f27780g, this.f27781h, this.f27782i, this.f27783j, this.f27784k, this.f27785l, this.f27786m, this.f27787n, this.f27788o, this.p, this.q, this.r);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27794g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27795h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27796i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27797j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f27798k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f27799l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f27800m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f27801n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f27802o;
        public final /* synthetic */ String p;
        public final /* synthetic */ String q;
        public final /* synthetic */ String r;

        public c(String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.f27789b = str;
            this.f27790c = str2;
            this.f27791d = str3;
            this.f27792e = i2;
            this.f27793f = str4;
            this.f27794g = str5;
            this.f27795h = str6;
            this.f27796i = str7;
            this.f27797j = str8;
            this.f27798k = str9;
            this.f27799l = str10;
            this.f27800m = str11;
            this.f27801n = str12;
            this.f27802o = str13;
            this.p = str14;
            this.q = str15;
            this.r = str16;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesAdapter.this.i0(this.f27789b, this.f27790c, this.f27791d, this.f27792e, this.f27793f, this.f27794g, this.f27795h, this.f27796i, this.f27797j, this.f27798k, this.f27799l, this.f27800m, this.f27801n, this.f27802o, this.p, this.q, this.r);
        }
    }

    public class d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27805d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27808g;

        public d(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4) {
            this.f27803b = myViewHolder;
            this.f27804c = i2;
            this.f27805d = str;
            this.f27806e = str2;
            this.f27807f = str3;
            this.f27808g = str4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesAdapter.this.h0(this.f27803b, this.f27804c, this.f27805d, this.f27806e, this.f27807f, this.f27808g);
            return true;
        }
    }

    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27815g;

        public e(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4) {
            this.f27810b = myViewHolder;
            this.f27811c = i2;
            this.f27812d = str;
            this.f27813e = str2;
            this.f27814f = str3;
            this.f27815g = str4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesAdapter.this.h0(this.f27810b, this.f27811c, this.f27812d, this.f27813e, this.f27814f, this.f27815g);
            return true;
        }
    }

    public class f implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27822g;

        public f(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4) {
            this.f27817b = myViewHolder;
            this.f27818c = i2;
            this.f27819d = str;
            this.f27820e = str2;
            this.f27821f = str3;
            this.f27822g = str4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesAdapter.this.h0(this.f27817b, this.f27818c, this.f27819d, this.f27820e, this.f27821f, this.f27822g);
            return true;
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27829g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f27830h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27831i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27832j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f27833k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f27834l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f27835m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f27836n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f27837o;
        public final /* synthetic */ String p;
        public final /* synthetic */ String q;
        public final /* synthetic */ String r;

        public g(String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.f27824b = str;
            this.f27825c = str2;
            this.f27826d = str3;
            this.f27827e = i2;
            this.f27828f = str4;
            this.f27829g = str5;
            this.f27830h = str6;
            this.f27831i = str7;
            this.f27832j = str8;
            this.f27833k = str9;
            this.f27834l = str10;
            this.f27835m = str11;
            this.f27836n = str12;
            this.f27837o = str13;
            this.p = str14;
            this.q = str15;
            this.r = str16;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesAdapter.this.i0(this.f27824b, this.f27825c, this.f27826d, this.f27827e, this.f27828f, this.f27829g, this.f27830h, this.f27831i, this.f27832j, this.f27833k, this.f27834l, this.f27835m, this.f27836n, this.f27837o, this.p, this.q, this.r);
        }
    }

    public class h implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27842e;

        public h(MyViewHolder myViewHolder, String str, int i2, String str2, String str3) {
            this.f27838a = myViewHolder;
            this.f27839b = str;
            this.f27840c = i2;
            this.f27841d = str2;
            this.f27842e = str3;
        }

        public final void a() {
            this.f27838a.cardView.performClick();
        }

        public final void b() {
            c.h.a.i.b bVar = new c.h.a.i.b();
            bVar.h(this.f27839b);
            bVar.m(this.f27840c);
            bVar.k(this.f27841d);
            bVar.l(this.f27842e);
            bVar.o(m.z(SeriesAdapter.this.f27751e));
            SeriesAdapter.this.f27756j.i(bVar, "series");
            this.f27838a.ivFavourite.setVisibility(0);
        }

        public final void c() {
            SeriesAdapter seriesAdapter = SeriesAdapter.this;
            seriesAdapter.f27756j.o(this.f27840c, this.f27839b, "series", this.f27841d, m.z(seriesAdapter.f27751e));
            this.f27838a.ivFavourite.setVisibility(4);
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

    public class i implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27844b;

        public i(View view) {
            this.f27844b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27844b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27844b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27844b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            if (z) {
                b(z ? 1.1f : 1.0f);
                Log.e("id is", BuildConfig.FLAVOR + this.f27844b.getTag());
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

    public SeriesAdapter(List<SeriesDBModel> list, Context context) {
        this.f27752f = list;
        this.f27751e = context;
        ArrayList arrayList = new ArrayList();
        this.f27754h = arrayList;
        arrayList.addAll(list);
        this.f27755i = list;
        this.f27756j = new c.h.a.i.q.a(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, int i2) {
        String strD;
        String str;
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
        String str12;
        String str13;
        String str14;
        String strC;
        int i3;
        if (this.f27751e != null) {
            List<SeriesDBModel> list = this.f27752f;
            if (list == null || list.size() <= 0) {
                strD = BuildConfig.FLAVOR;
                str = strD;
                str2 = str;
                str3 = str2;
                str4 = str3;
                str5 = str4;
                str6 = str5;
                str7 = str6;
                str8 = str7;
                str9 = str8;
                str10 = str9;
                str11 = str10;
                str12 = str11;
                str13 = str12;
                str14 = str13;
                strC = str14;
                i3 = -1;
            } else {
                SeriesDBModel seriesDBModel = this.f27752f.get(i2);
                String strE = seriesDBModel.e() != null ? seriesDBModel.e() : BuildConfig.FLAVOR;
                strD = seriesDBModel.d() != null ? seriesDBModel.d() : BuildConfig.FLAVOR;
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
                String strB = seriesDBModel.b() != null ? seriesDBModel.b() : BuildConfig.FLAVOR;
                String strI = seriesDBModel.i() != null ? seriesDBModel.i() : BuildConfig.FLAVOR;
                String strA = seriesDBModel.a() != null ? seriesDBModel.a() : BuildConfig.FLAVOR;
                String strF = seriesDBModel.f() != null ? seriesDBModel.f() : BuildConfig.FLAVOR;
                strC = seriesDBModel.c() != null ? seriesDBModel.c() : BuildConfig.FLAVOR;
                str5 = strO;
                str6 = strJ;
                str7 = strL;
                str8 = strM;
                str9 = strQ;
                str10 = strN;
                str11 = strP;
                str = strB;
                str12 = strI;
                str13 = strA;
                str14 = strF;
                i3 = iR;
                str3 = strE;
                str4 = strG;
                str2 = strK;
            }
            SharedPreferences sharedPreferences = this.f27751e.getSharedPreferences("selectedPlayer", 0);
            this.f27753g = sharedPreferences;
            sharedPreferences.getString("selectedPlayer", BuildConfig.FLAVOR);
            if (i2 == 0 && myViewHolder.Movie != null && !this.f27759m.booleanValue()) {
                this.f27759m = Boolean.TRUE;
                myViewHolder.Movie.requestFocus();
            }
            SharedPreferences sharedPreferences2 = this.f27751e.getSharedPreferences("listgridview", 0);
            this.f27757k = sharedPreferences2;
            this.f27758l = sharedPreferences2.edit();
            c.h.a.h.n.a.w = this.f27757k.getInt("series", 0);
            myViewHolder.MovieName.setText(this.f27752f.get(i2).d());
            myViewHolder.MovieImage.setImageDrawable(null);
            if (str2 != null && !str2.equals(BuildConfig.FLAVOR)) {
                t.q(this.f27751e).l(str2).j(R.drawable.noposter).g(myViewHolder.MovieImage);
            } else if (Build.VERSION.SDK_INT >= 21) {
                myViewHolder.MovieImage.setImageDrawable(this.f27751e.getResources().getDrawable(R.drawable.noposter, null));
            } else {
                myViewHolder.MovieImage.setImageDrawable(a.i.i.b.f(this.f27751e, R.drawable.noposter));
            }
            String strReplace = strD.trim().replace("'", " ");
            if (this.f27756j.l(i3, str, "series", m.z(this.f27751e)).size() > 0) {
                myViewHolder.ivFavourite.setVisibility(0);
            } else {
                myViewHolder.ivFavourite.setVisibility(4);
            }
            String str15 = str3;
            String str16 = str4;
            String str17 = str2;
            String str18 = str5;
            String str19 = str6;
            String str20 = str7;
            String str21 = str8;
            String str22 = str;
            String str23 = str9;
            String str24 = str2;
            String str25 = str10;
            int i4 = i3;
            String str26 = str13;
            String str27 = str14;
            String str28 = strC;
            myViewHolder.cardView.setOnClickListener(new a(str15, strReplace, str16, i3, str17, str18, str19, str20, str21, str23, str25, str11, str22, str12, str26, str27, str28));
            myViewHolder.MovieImage.setOnClickListener(new b(str15, strReplace, str16, i4, str24, str18, str19, str20, str21, str23, str25, str11, str22, str12, str26, str27, str28));
            myViewHolder.Movie.setOnClickListener(new c(str15, strReplace, str16, i4, str24, str18, str19, str20, str21, str23, str25, str11, str22, str12, str26, str27, str28));
            RelativeLayout relativeLayout = myViewHolder.Movie;
            relativeLayout.setOnFocusChangeListener(new i(relativeLayout));
            String str29 = str3;
            String str30 = strC;
            myViewHolder.Movie.setOnLongClickListener(new d(myViewHolder, i4, str22, strReplace, str29, str30));
            myViewHolder.MovieImage.setOnLongClickListener(new e(myViewHolder, i4, str22, strReplace, str29, str30));
            myViewHolder.cardView.setOnLongClickListener(new f(myViewHolder, i4, str22, strReplace, str29, str30));
            myViewHolder.llMenu.setOnClickListener(new g(str3, strReplace, str4, i4, str24, str5, str6, str7, str8, str23, str25, str11, str22, str12, str26, str27, str28));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        SharedPreferences sharedPreferences = this.f27751e.getSharedPreferences("listgridview", 0);
        this.f27757k = sharedPreferences;
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

    public final void h0(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4) {
        Menu menuB;
        int i3;
        j0 j0Var = new j0(this.f27751e, myViewHolder.tvStreamOptions);
        j0Var.d(R.menu.menu_card_series_streams);
        if (this.f27756j.l(i2, str, "series", m.z(this.f27751e)).size() > 0) {
            menuB = j0Var.b();
            i3 = 1;
        } else {
            menuB = j0Var.b();
            i3 = 2;
        }
        menuB.getItem(i3).setVisible(false);
        j0Var.f(new h(myViewHolder, str, i2, str2, str3));
        j0Var.g();
    }

    public final void i0(String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        if (this.f27751e != null) {
            Intent intent = new Intent(this.f27751e, (Class<?>) SeriesDetailActivity.class);
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
            this.f27751e.startActivity(intent);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27752f.size();
    }
}
