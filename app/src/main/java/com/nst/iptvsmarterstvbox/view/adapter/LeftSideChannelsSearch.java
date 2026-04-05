package minefarts.iptvsmarters.view.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
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
import c.h.a.i.q.m;
import c.k.b.t;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.pojo.XMLTVProgrammePojo;
import minefarts.iptvsmarters.view.activity.SearchActivity;
import minefarts.iptvsmarters.view.activity.SearchActivityLowerSDK;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class LeftSideChannelsSearch extends RecyclerView.h<RecyclerView.e0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<XMLTVProgrammePojo> f27300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f27301f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.q.a f27303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Animation f27304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27305j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences f27309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.f.a.c.d.u.d f27310o;
    public Handler q;
    public c.h.a.i.q.f s;
    public int y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f27302g = Boolean.FALSE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27306k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27307l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27308m = -1;
    public String p = BuildConfig.FLAVOR;
    public int t = -1;
    public String v = BuildConfig.FLAVOR;
    public String w = BuildConfig.FLAVOR;
    public int x = 0;
    public ArrayList<c.h.a.i.e> r = new ArrayList<>();
    public ArrayList<c.h.a.i.e> u = new ArrayList<>();

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
        public ViewHolder f27311b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f27311b = viewHolder;
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
            ViewHolder viewHolder = this.f27311b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27311b = null;
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
        public final /* synthetic */ ViewHolder f27312a;

        /* JADX INFO: renamed from: minefarts.iptvsmarters.view.adapter.LeftSideChannelsSearch$a$a, reason: collision with other inner class name */
        public class C0280a implements c.k.b.e {
            public C0280a() {
            }

            @Override // c.k.b.e
            public void a() {
            }

            @Override // c.k.b.e
            public void onSuccess() {
            }
        }

        public a(ViewHolder viewHolder) {
            this.f27312a = viewHolder;
        }

        @Override // c.k.b.e
        public void a() {
            t.q(LeftSideChannelsSearch.this.f27301f).l(String.valueOf(LeftSideChannelsSearch.this.f27301f.getResources().getDrawable(R.drawable.rounded_edge_3))).e().b().h(this.f27312a.MovieImage, new C0280a());
            this.f27312a.SeriesName.setVisibility(0);
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
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27321e;

        public e(int i2, ViewHolder viewHolder, String str, int i3) {
            this.f27318b = i2;
            this.f27319c = viewHolder;
            this.f27320d = str;
            this.f27321e = i3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchActivityLowerSDK searchActivityLowerSDK;
            String strValueOf;
            SearchActivity searchActivity;
            String strValueOf2;
            LeftSideChannelsSearch.this.y = this.f27318b;
            this.f27319c.MovieImage.setBackground(LeftSideChannelsSearch.this.f27301f.getResources().getDrawable(R.drawable.shape_live_layout_focused_search));
            if (m.f(LeftSideChannelsSearch.this.f27301f).equals("m3u")) {
                if (Build.VERSION.SDK_INT >= 23) {
                    searchActivity = (SearchActivity) LeftSideChannelsSearch.this.f27301f;
                    strValueOf2 = String.valueOf(this.f27320d);
                    searchActivity.Z0(strValueOf2);
                } else {
                    searchActivityLowerSDK = (SearchActivityLowerSDK) LeftSideChannelsSearch.this.f27301f;
                    strValueOf = String.valueOf(this.f27320d);
                    searchActivityLowerSDK.M(strValueOf);
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                searchActivity = (SearchActivity) LeftSideChannelsSearch.this.f27301f;
                strValueOf2 = String.valueOf(this.f27321e);
                searchActivity.Z0(strValueOf2);
            } else {
                searchActivityLowerSDK = (SearchActivityLowerSDK) LeftSideChannelsSearch.this.f27301f;
                strValueOf = String.valueOf(this.f27321e);
                searchActivityLowerSDK.M(strValueOf);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                ((SearchActivity) LeftSideChannelsSearch.this.f27301f).m0(LeftSideChannelsSearch.this.y);
            } else {
                ((SearchActivityLowerSDK) LeftSideChannelsSearch.this.f27301f).a(LeftSideChannelsSearch.this.y);
            }
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27326e;

        public f(int i2, ViewHolder viewHolder, String str, int i3) {
            this.f27323b = i2;
            this.f27324c = viewHolder;
            this.f27325d = str;
            this.f27326e = i3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchActivity searchActivity;
            String strValueOf;
            LeftSideChannelsSearch.this.y = this.f27323b;
            this.f27324c.MovieImage.setBackground(LeftSideChannelsSearch.this.f27301f.getResources().getDrawable(R.drawable.shape_live_layout_focused_search));
            if (m.f(LeftSideChannelsSearch.this.f27301f).equals("m3u")) {
                if (Build.VERSION.SDK_INT >= 23) {
                    searchActivity = (SearchActivity) LeftSideChannelsSearch.this.f27301f;
                    strValueOf = String.valueOf(this.f27325d);
                    searchActivity.Z0(strValueOf);
                }
                ((SearchActivityLowerSDK) LeftSideChannelsSearch.this.f27301f).M(String.valueOf(this.f27325d));
            } else {
                if (Build.VERSION.SDK_INT >= 23) {
                    searchActivity = (SearchActivity) LeftSideChannelsSearch.this.f27301f;
                    strValueOf = String.valueOf(this.f27326e);
                    searchActivity.Z0(strValueOf);
                }
                ((SearchActivityLowerSDK) LeftSideChannelsSearch.this.f27301f).M(String.valueOf(this.f27325d));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                ((SearchActivity) LeftSideChannelsSearch.this.f27301f).m0(LeftSideChannelsSearch.this.y);
            } else {
                ((SearchActivityLowerSDK) LeftSideChannelsSearch.this.f27301f).M(String.valueOf(this.f27325d));
            }
        }
    }

    public class g implements View.OnLongClickListener {
        public g() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    public class h implements View.OnLongClickListener {
        public h() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    public class i implements View.OnLongClickListener {
        public i() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27331b;

        public j(int i2) {
            this.f27331b = 0;
            this.f27331b = i2;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            LeftSideChannelsSearch.this.f27308m = z ? this.f27331b : -1;
        }
    }

    public LeftSideChannelsSearch(Context context, ArrayList<XMLTVProgrammePojo> arrayList, int i2) {
        this.f27305j = "mobile";
        this.y = 0;
        this.f27301f = context;
        this.f27300e = arrayList;
        this.f27303h = new c.h.a.i.q.a(context);
        this.f27304i = AnimationUtils.loadAnimation(context, R.anim.bounce);
        this.s = new c.h.a.i.q.f(context);
        this.y = i2;
        if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0)) {
            this.f27305j = "tv";
        } else {
            this.f27305j = "mobile";
        }
        this.q = new Handler(Looper.getMainLooper());
        if (this.f27305j.equals("mobile")) {
            try {
                this.f27310o = c.f.a.c.d.u.b.e(context).c().c();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0123 A[Catch: Exception -> 0x0210, TryCatch #0 {Exception -> 0x0210, blocks: (B:3:0x000b, B:5:0x000f, B:7:0x0015, B:9:0x0019, B:11:0x0032, B:12:0x0035, B:14:0x003b, B:16:0x0041, B:18:0x0047, B:21:0x0051, B:23:0x0057, B:24:0x005a, B:26:0x0060, B:28:0x0066, B:30:0x006c, B:32:0x0073, B:34:0x0079, B:36:0x007f, B:44:0x0116, B:46:0x0123, B:48:0x0135, B:53:0x0156, B:55:0x0184, B:57:0x01a4, B:59:0x01a8, B:60:0x01b0, B:68:0x01e8, B:61:0x01b4, B:62:0x01bc, B:63:0x01c0, B:65:0x01c4, B:66:0x01cd, B:67:0x01d6, B:49:0x013b, B:50:0x0141, B:43:0x00eb, B:42:0x00e5, B:41:0x00bb, B:69:0x0206, B:39:0x009e), top: B:72:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141 A[Catch: Exception -> 0x0210, TryCatch #0 {Exception -> 0x0210, blocks: (B:3:0x000b, B:5:0x000f, B:7:0x0015, B:9:0x0019, B:11:0x0032, B:12:0x0035, B:14:0x003b, B:16:0x0041, B:18:0x0047, B:21:0x0051, B:23:0x0057, B:24:0x005a, B:26:0x0060, B:28:0x0066, B:30:0x006c, B:32:0x0073, B:34:0x0079, B:36:0x007f, B:44:0x0116, B:46:0x0123, B:48:0x0135, B:53:0x0156, B:55:0x0184, B:57:0x01a4, B:59:0x01a8, B:60:0x01b0, B:68:0x01e8, B:61:0x01b4, B:62:0x01bc, B:63:0x01c0, B:65:0x01c4, B:66:0x01cd, B:67:0x01d6, B:49:0x013b, B:50:0x0141, B:43:0x00eb, B:42:0x00e5, B:41:0x00bb, B:69:0x0206, B:39:0x009e), top: B:72:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184 A[Catch: Exception -> 0x0210, TryCatch #0 {Exception -> 0x0210, blocks: (B:3:0x000b, B:5:0x000f, B:7:0x0015, B:9:0x0019, B:11:0x0032, B:12:0x0035, B:14:0x003b, B:16:0x0041, B:18:0x0047, B:21:0x0051, B:23:0x0057, B:24:0x005a, B:26:0x0060, B:28:0x0066, B:30:0x006c, B:32:0x0073, B:34:0x0079, B:36:0x007f, B:44:0x0116, B:46:0x0123, B:48:0x0135, B:53:0x0156, B:55:0x0184, B:57:0x01a4, B:59:0x01a8, B:60:0x01b0, B:68:0x01e8, B:61:0x01b4, B:62:0x01bc, B:63:0x01c0, B:65:0x01c4, B:66:0x01cd, B:67:0x01d6, B:49:0x013b, B:50:0x0141, B:43:0x00eb, B:42:0x00e5, B:41:0x00bb, B:69:0x0206, B:39:0x009e), top: B:72:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6 A[Catch: Exception -> 0x0210, TryCatch #0 {Exception -> 0x0210, blocks: (B:3:0x000b, B:5:0x000f, B:7:0x0015, B:9:0x0019, B:11:0x0032, B:12:0x0035, B:14:0x003b, B:16:0x0041, B:18:0x0047, B:21:0x0051, B:23:0x0057, B:24:0x005a, B:26:0x0060, B:28:0x0066, B:30:0x006c, B:32:0x0073, B:34:0x0079, B:36:0x007f, B:44:0x0116, B:46:0x0123, B:48:0x0135, B:53:0x0156, B:55:0x0184, B:57:0x01a4, B:59:0x01a8, B:60:0x01b0, B:68:0x01e8, B:61:0x01b4, B:62:0x01bc, B:63:0x01c0, B:65:0x01c4, B:66:0x01cd, B:67:0x01d6, B:49:0x013b, B:50:0x0141, B:43:0x00eb, B:42:0x00e5, B:41:0x00bb, B:69:0x0206, B:39:0x009e), top: B:72:0x000b, inners: #1 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    @android.annotation.SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.e0 r12, int r13) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.LeftSideChannelsSearch.F(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.e0 H(@NotNull ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        if (this.f27305j.equals("tv")) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.live_all_data_channels_search_adapter_tv;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.live_all_data_channels_search_adapter;
        }
        return new ViewHolder(layoutInflaterFrom.inflate(i3, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        ArrayList<XMLTVProgrammePojo> arrayList = this.f27300e;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f27300e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return 0;
    }
}
