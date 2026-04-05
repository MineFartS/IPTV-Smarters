package minefarts.iptvsmarters.view.adapter;

import a.b.q.j0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.i.q.m;
import c.k.b.t;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.activity.ViewDetailsActivity;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SubCategoriesChildAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f28191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<c.h.a.i.f> f28192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f28193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<c.h.a.i.f> f28194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<c.h.a.i.f> f28195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.a f28196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.f f28197k;

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView MovieName;

        @BindView
        public RelativeLayout cardView;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public TextView movieNameTV;

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
        public MyViewHolder f28198b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f28198b = myViewHolder;
            myViewHolder.MovieName = (TextView) b.c.c.c(view, R.id.tv_movie_name, "field 'MovieName'", TextView.class);
            myViewHolder.Movie = (RelativeLayout) b.c.c.c(view, R.id.rl_movie, "field 'Movie'", RelativeLayout.class);
            myViewHolder.movieNameTV = (TextView) b.c.c.c(view, R.id.tv_movie_name1, "field 'movieNameTV'", TextView.class);
            myViewHolder.MovieImage = (ImageView) b.c.c.c(view, R.id.iv_movie_image, "field 'MovieImage'", ImageView.class);
            myViewHolder.cardView = (RelativeLayout) b.c.c.c(view, R.id.card_view, "field 'cardView'", RelativeLayout.class);
            myViewHolder.tvStreamOptions = (TextView) b.c.c.c(view, R.id.tv_streamOptions, "field 'tvStreamOptions'", TextView.class);
            myViewHolder.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
            myViewHolder.llMenu = (LinearLayout) b.c.c.c(view, R.id.ll_menu, "field 'llMenu'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f28198b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f28198b = null;
            myViewHolder.MovieName = null;
            myViewHolder.Movie = null;
            myViewHolder.movieNameTV = null;
            myViewHolder.MovieImage = null;
            myViewHolder.cardView = null;
            myViewHolder.tvStreamOptions = null;
            myViewHolder.ivFavourite = null;
            myViewHolder.llMenu = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28203f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28204g;

        public a(String str, int i2, String str2, String str3, String str4, String str5) {
            this.f28199b = str;
            this.f28200c = i2;
            this.f28201d = str2;
            this.f28202e = str3;
            this.f28203f = str4;
            this.f28204g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.W(SubCategoriesChildAdapter.this.f28191e, this.f28199b, this.f28200c, this.f28201d, this.f28202e, this.f28203f, this.f28204g, BuildConfig.FLAVOR, 0);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28212h;

        public b(int i2, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f28206b = i2;
            this.f28207c = str;
            this.f28208d = str2;
            this.f28209e = str3;
            this.f28210f = str4;
            this.f28211g = str5;
            this.f28212h = str6;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SubCategoriesChildAdapter.this.l0(this.f28206b, this.f28207c, this.f28208d, this.f28209e, this.f28210f, this.f28211g, this.f28212h);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28219g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28220h;

        public c(int i2, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f28214b = i2;
            this.f28215c = str;
            this.f28216d = str2;
            this.f28217e = str3;
            this.f28218f = str4;
            this.f28219g = str5;
            this.f28220h = str6;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SubCategoriesChildAdapter.this.l0(this.f28214b, this.f28215c, this.f28216d, this.f28217e, this.f28218f, this.f28219g, this.f28220h);
        }
    }

    public class d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28228h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28229i;

        public d(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f28222b = myViewHolder;
            this.f28223c = i2;
            this.f28224d = str;
            this.f28225e = str2;
            this.f28226f = str3;
            this.f28227g = str4;
            this.f28228h = str5;
            this.f28229i = str6;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SubCategoriesChildAdapter.this.i0(this.f28222b, this.f28223c, this.f28224d, this.f28225e, this.f28226f, this.f28227g, this.f28228h, this.f28229i);
            return true;
        }
    }

    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28233d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28235f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28236g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28237h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28238i;

        public e(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f28231b = myViewHolder;
            this.f28232c = i2;
            this.f28233d = str;
            this.f28234e = str2;
            this.f28235f = str3;
            this.f28236g = str4;
            this.f28237h = str5;
            this.f28238i = str6;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SubCategoriesChildAdapter.this.i0(this.f28231b, this.f28232c, this.f28233d, this.f28234e, this.f28235f, this.f28236g, this.f28237h, this.f28238i);
            return true;
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28245g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28246h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28247i;

        public f(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f28240b = myViewHolder;
            this.f28241c = i2;
            this.f28242d = str;
            this.f28243e = str2;
            this.f28244f = str3;
            this.f28245g = str4;
            this.f28246h = str5;
            this.f28247i = str6;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SubCategoriesChildAdapter.this.i0(this.f28240b, this.f28241c, this.f28242d, this.f28243e, this.f28244f, this.f28245g, this.f28246h, this.f28247i);
        }
    }

    public class g implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f28249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28256h;

        public g(int i2, String str, String str2, String str3, String str4, String str5, String str6, MyViewHolder myViewHolder) {
            this.f28249a = i2;
            this.f28250b = str;
            this.f28251c = str2;
            this.f28252d = str3;
            this.f28253e = str4;
            this.f28254f = str5;
            this.f28255g = str6;
            this.f28256h = myViewHolder;
        }

        public final void a() {
            c.h.a.i.b bVar = new c.h.a.i.b();
            bVar.h(this.f28254f);
            bVar.m(this.f28249a);
            SubCategoriesChildAdapter.this.f28197k.t0(this.f28250b);
            SubCategoriesChildAdapter.this.f28197k.u0(this.f28255g);
            bVar.o(m.z(SubCategoriesChildAdapter.this.f28191e));
            SubCategoriesChildAdapter.this.f28196j.i(bVar, "vod");
            this.f28256h.ivFavourite.setVisibility(0);
        }

        public final void b() {
            this.f28256h.cardView.performClick();
        }

        public final void c() {
            SubCategoriesChildAdapter subCategoriesChildAdapter = SubCategoriesChildAdapter.this;
            subCategoriesChildAdapter.f28196j.o(this.f28249a, this.f28254f, "vod", this.f28250b, m.z(subCategoriesChildAdapter.f28191e));
            this.f28256h.ivFavourite.setVisibility(4);
        }

        public final void d(int i2, String str, String str2, String str3, String str4, String str5, String str6) {
            if (SubCategoriesChildAdapter.this.f28191e != null) {
                Intent intent = new Intent(SubCategoriesChildAdapter.this.f28191e, (Class<?>) ViewDetailsActivity.class);
                intent.putExtra(c.h.a.h.n.a.y, String.valueOf(i2));
                intent.putExtra("movie", str);
                intent.putExtra("selectedPlayer", str2);
                intent.putExtra("streamType", str3);
                intent.putExtra("containerExtension", str4);
                intent.putExtra("categoryID", str5);
                intent.putExtra("num", str6);
                SubCategoriesChildAdapter.this.f28191e.startActivity(intent);
            }
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.menu_view_details /* 2131428611 */:
                    d(this.f28249a, this.f28250b, this.f28251c, this.f28252d, this.f28253e, this.f28254f, this.f28255g);
                    break;
                case R.id.nav_add_to_fav /* 2131428707 */:
                    a();
                    break;
                case R.id.nav_play /* 2131428721 */:
                    b();
                    break;
                case R.id.nav_remove_from_fav /* 2131428728 */:
                    c();
                    break;
            }
            return false;
        }
    }

    public SubCategoriesChildAdapter(List<c.h.a.i.f> list, Context context) {
        this.f28192f = list;
        this.f28191e = context;
        ArrayList arrayList = new ArrayList();
        this.f28194h = arrayList;
        arrayList.addAll(list);
        this.f28195i = list;
        this.f28196j = new c.h.a.i.q.a(context);
        this.f28197k = this.f28197k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, int i2) {
        int i3;
        ImageView imageView;
        Drawable drawableF;
        Context context = this.f28191e;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
            this.f28193g = sharedPreferences;
            String string = sharedPreferences.getString("selectedPlayer", BuildConfig.FLAVOR);
            try {
                i3 = Integer.parseInt(this.f28192f.get(i2).Y());
            } catch (NumberFormatException unused) {
                i3 = -1;
            }
            String strG = this.f28192f.get(i2).g();
            String strC = this.f28192f.get(i2).C();
            String strZ = this.f28192f.get(i2).Z();
            String strP = this.f28192f.get(i2).P();
            myViewHolder.MovieName.setText(this.f28192f.get(i2).getName());
            myViewHolder.movieNameTV.setText(this.f28192f.get(i2).getName());
            String strX = this.f28192f.get(i2).X();
            String name = this.f28192f.get(i2).getName();
            myViewHolder.MovieImage.setImageDrawable(null);
            if (strX == null || strX.equals(BuildConfig.FLAVOR)) {
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView = myViewHolder.MovieImage;
                    drawableF = this.f28191e.getResources().getDrawable(R.drawable.noposter, null);
                } else {
                    imageView = myViewHolder.MovieImage;
                    drawableF = a.i.i.b.f(this.f28191e, R.drawable.noposter);
                }
                imageView.setImageDrawable(drawableF);
            } else {
                t.q(this.f28191e).l(this.f28192f.get(i2).X()).j(R.drawable.noposter).g(myViewHolder.MovieImage);
            }
            if (this.f28196j.l(i3, strG, "vod", m.z(this.f28191e)).size() > 0) {
                myViewHolder.ivFavourite.setVisibility(0);
            } else {
                myViewHolder.ivFavourite.setVisibility(4);
            }
            myViewHolder.cardView.setOnClickListener(new a(string, i3, strZ, strC, strP, name));
            int i4 = i3;
            myViewHolder.MovieImage.setOnClickListener(new b(i4, name, string, strZ, strC, strG, strP));
            myViewHolder.Movie.setOnClickListener(new c(i4, name, string, strZ, strC, strG, strP));
            int i5 = i3;
            myViewHolder.Movie.setOnLongClickListener(new d(myViewHolder, i5, strG, name, string, strZ, strC, strP));
            myViewHolder.MovieImage.setOnLongClickListener(new e(myViewHolder, i5, strG, name, string, strZ, strC, strP));
            myViewHolder.llMenu.setOnClickListener(new f(myViewHolder, i5, strG, name, string, strZ, strC, strP));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_subcateories_cihild_list_item, viewGroup, false));
    }

    public final void i0(MyViewHolder myViewHolder, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        Menu menuB;
        int i3;
        j0 j0Var = new j0(this.f28191e, myViewHolder.tvStreamOptions);
        j0Var.d(R.menu.menu_card_vod);
        if (this.f28196j.l(i2, str, "vod", m.z(this.f28191e)).size() > 0) {
            menuB = j0Var.b();
            i3 = 4;
        } else {
            menuB = j0Var.b();
            i3 = 3;
        }
        menuB.getItem(i3).setVisible(true);
        j0Var.f(new g(i2, str2, str3, str4, str5, str, str6, myViewHolder));
        j0Var.g();
    }

    public final void l0(int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.f28191e != null) {
            Intent intent = new Intent(this.f28191e, (Class<?>) ViewDetailsActivity.class);
            intent.putExtra(c.h.a.h.n.a.y, String.valueOf(i2));
            intent.putExtra("movie", str);
            intent.putExtra("selectedPlayer", str2);
            intent.putExtra("streamType", str3);
            intent.putExtra("containerExtension", str4);
            intent.putExtra("categoryID", str5);
            intent.putExtra("num", str6);
            this.f28191e.startActivity(intent);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f28192f.size();
    }
}
