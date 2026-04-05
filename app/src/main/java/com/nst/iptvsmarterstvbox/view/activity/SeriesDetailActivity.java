package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
import a.b.q.j0;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.k.b.c0;
import c.k.b.t;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.SeasonsDetailCallback;
import com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTVShowsInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.view.adapter.CastAdapter;
import com.nst.iptvsmarterstvbox.view.adapter.EpisodeDetailAdapter;
import com.nst.iptvsmarterstvbox.view.adapter.SeasonsButtonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesDetailActivity extends a.b.k.c implements View.OnClickListener, c.h.a.k.f.j, c.h.a.k.f.k {
    public c.h.a.i.q.a G;
    public PopupWindow H;
    public Button I;
    public String J;
    public String K;
    public TextView L;
    public TextView M;
    public MenuItem N;
    public Menu O;
    public Button P;
    public c.h.a.j.f R;
    public c.h.a.j.g S;
    public SharedPreferences W;
    public SharedPreferences.Editor X;
    public EpisodeDetailAdapter Z;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public TextView cast_tab;

    @BindView
    public TextView episode_tab;
    public SeasonsButtonAdapter f0;
    public JSONArray h0;

    @BindView
    public ImageView ivFavourite;

    @BindView
    public ImageView ivMovieImage;

    @BindView
    public ImageView iv_back_button;
    public PopupWindow j0;
    public c.h.a.i.q.l l0;

    @BindView
    public LinearLayout llCastBox;

    @BindView
    public LinearLayout llCastBoxInfo;

    @BindView
    public LinearLayout llDirectorBox;

    @BindView
    public LinearLayout llDirectorBoxInfo;

    @BindView
    public LinearLayout llDurationBox;

    @BindView
    public LinearLayout llDurationBoxInfo;

    @BindView
    public LinearLayout llGenreBox;

    @BindView
    public LinearLayout llGenreBoxInfo;

    @BindView
    public LinearLayout llMovieInfoBox;

    @BindView
    public LinearLayout llReleasedBox;

    @BindView
    public LinearLayout llReleasedBoxInfo;

    @BindView
    public LinearLayout ll_play_button_main_layout;

    @BindView
    public LinearLayout ll_season_button_main_layout;

    @BindView
    public LinearLayout ll_watch_trailer;

    @BindView
    public LinearLayout ll_watch_trailer_button_main_layout;

    @BindView
    public ImageView logo;
    public int m0;

    @BindView
    public RecyclerView myRecyclerView;

    @BindView
    public NestedScrollView nestedScrollView;
    public c.f.a.c.d.u.d o0;
    public int p;

    @BindView
    public ProgressBar pb_button_recent_watch;
    public ImageView q;
    public CastAdapter r;

    @BindView
    public RatingBar ratingBar;

    @BindView
    public RelativeLayout rlAccountInfo;

    @BindView
    public RelativeLayout rlTransparent;

    @BindView
    public RecyclerView rvCast;
    public Context s;

    @BindView
    public ScrollView scrollView;
    public ProgressDialog t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvCast;

    @BindView
    public TextView tvCastInfo;

    @BindView
    public TextView tvDirector;

    @BindView
    public TextView tvDirectorInfo;

    @BindView
    public TextView tvMovieDuration;

    @BindView
    public TextView tvMovieDurationInfo;

    @BindView
    public TextView tvMovieGenere;

    @BindView
    public TextView tvMovieName;

    @BindView
    public TextView tvPlay;

    @BindView
    public TextView tvReadMore;

    @BindView
    public TextView tvReleaseDate;

    @BindView
    public TextView tvReleaseDateInfo;

    @BindView
    public TextView tvSeasonButton;

    @BindView
    public TextView tvWatchTrailer;

    @BindView
    public TextView tv_genre_info;
    public SharedPreferences u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26453d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26454e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26455f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26456g = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26457h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26458i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26459j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26460k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f26461l = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f26462m = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f26463n = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f26464o = BuildConfig.FLAVOR;
    public c.h.a.i.q.b v = new c.h.a.i.q.b();
    public c.h.a.i.q.b w = new c.h.a.i.q.b();
    public String x = BuildConfig.FLAVOR;
    public String y = BuildConfig.FLAVOR;
    public String z = BuildConfig.FLAVOR;
    public String A = BuildConfig.FLAVOR;
    public String B = BuildConfig.FLAVOR;
    public String C = BuildConfig.FLAVOR;
    public String D = BuildConfig.FLAVOR;
    public int E = -1;
    public String F = BuildConfig.FLAVOR;
    public String Q = BuildConfig.FLAVOR;
    public ArrayList<GetEpisdoeDetailsCallback> T = new ArrayList<>();
    public ArrayList<SeasonsDetailCallback> U = new ArrayList<>();
    public String V = BuildConfig.FLAVOR;
    public ArrayList<GetEpisdoeDetailsCallback> Y = new ArrayList<>();
    public List<SeriesDBModel> g0 = new ArrayList();
    public ArrayList<GetEpisdoeDetailsCallback> i0 = new ArrayList<>();
    public ArrayList<Integer> k0 = new ArrayList<>();
    public boolean n0 = false;
    public int p0 = 0;
    public String q0 = BuildConfig.FLAVOR;
    public String r0 = BuildConfig.FLAVOR;
    public String s0 = BuildConfig.FLAVOR;
    public int t0 = 0;
    public int u0 = 0;
    public String v0 = "mobile";

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(SeriesDetailActivity.this.s);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(SeriesDetailActivity.this.s);
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class f implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f26470a;

        public f(ArrayList arrayList) {
            this.f26470a = arrayList;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f26470a;
                if (arrayList != null && arrayList.size() > 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < this.f26470a.size()) {
                            if (menuItem.getItemId() != i2) {
                                i2++;
                            } else if (menuItem.getItemId() == 0) {
                                c.h.a.h.n.e.V(SeriesDetailActivity.this.s, BuildConfig.FLAVOR, SeriesDetailActivity.this.p0, "series", SeriesDetailActivity.this.q0, "0", SeriesDetailActivity.this.r0, null, BuildConfig.FLAVOR);
                            } else {
                                String strT = c.h.a.h.n.e.t(c.h.a.h.n.e.F(SeriesDetailActivity.this.s, SeriesDetailActivity.this.p0, SeriesDetailActivity.this.q0, "series"));
                                Intent intent = new Intent(SeriesDetailActivity.this.s, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", strT);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f26470a.get(i2)).a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f26470a.get(i2)).b());
                                SeriesDetailActivity.this.s.startActivity(intent);
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

    public class g implements j0.c {
        public g() {
        }

        @Override // a.b.q.j0.c
        public void a(j0 j0Var) {
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.j0.dismiss();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.H.dismiss();
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.episode_tab.setBackgroundResource(R.drawable.episode_cast_tab_background_hover_clicked);
            SeriesDetailActivity.this.cast_tab.setBackgroundResource(R.drawable.episode_cast_tab_background);
            RecyclerView recyclerView = SeriesDetailActivity.this.rvCast;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            RecyclerView recyclerView2 = SeriesDetailActivity.this.myRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
            }
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.H.dismiss();
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.H.dismiss();
        }
    }

    public class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.cast_tab.setBackgroundResource(R.drawable.episode_cast_tab_background_hover_clicked);
            SeriesDetailActivity.this.episode_tab.setBackgroundResource(R.drawable.episode_cast_tab_background);
            RecyclerView recyclerView = SeriesDetailActivity.this.myRecyclerView;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            RecyclerView recyclerView2 = SeriesDetailActivity.this.rvCast;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
            }
        }
    }

    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(SeriesDetailActivity.this.s);
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.onBackPressed();
        }
    }

    public class p implements c0 {
        public p() {
        }

        @Override // c.k.b.c0
        public void a(Drawable drawable) {
            Log.d("TAG", "FAILED");
        }

        @Override // c.k.b.c0
        public void b(Drawable drawable) {
            Log.d("TAG", "Prepare Load");
        }

        @Override // c.k.b.c0
        public void c(Bitmap bitmap, t.e eVar) {
            SeriesDetailActivity.this.appbarToolbar.setBackground(new BitmapDrawable(SeriesDetailActivity.this.s.getResources(), bitmap));
            SeriesDetailActivity seriesDetailActivity = SeriesDetailActivity.this;
            seriesDetailActivity.rlTransparent.setBackgroundColor(seriesDetailActivity.getResources().getColor(R.color.trasparent_black_2));
            SeriesDetailActivity seriesDetailActivity2 = SeriesDetailActivity.this;
            seriesDetailActivity2.toolbar.setBackgroundColor(seriesDetailActivity2.getResources().getColor(R.color.trasparent_black_2));
        }
    }

    public class q implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f26482b;

        public q(Context context) {
            this.f26482b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                c.h.a.i.q.a aVar = SeriesDetailActivity.this.G;
                SeriesDetailActivity seriesDetailActivity = SeriesDetailActivity.this;
                if (aVar.l(seriesDetailActivity.p, seriesDetailActivity.f26460k, "series", c.h.a.i.q.m.z(this.f26482b)).size() > 0) {
                    SeriesDetailActivity.this.V0();
                } else {
                    SeriesDetailActivity.this.O0();
                }
            } catch (Exception unused) {
            }
        }
    }

    public class r implements c.k.b.e {
        public r() {
        }

        @Override // c.k.b.e
        public void a() {
            SeriesDetailActivity.this.ivMovieImage.setBackgroundResource(R.drawable.noposter);
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailActivity.this.U0(view);
        }
    }

    public class t implements DialogInterface.OnClickListener {
        public t() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class u extends AsyncTask<String, Void, List<String>> {
        public u() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> doInBackground(String... strArr) {
            try {
                return SeriesDetailActivity.this.e1();
            } catch (Exception e2) {
                Log.e("honeya", "doInBackground: " + e2.getMessage());
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<String> list) {
            TextView textView;
            super.onPostExecute(list);
            if (list != null) {
                try {
                    if (list.get(0) != null && !list.get(0).equals(BuildConfig.FLAVOR) && (textView = SeriesDetailActivity.this.tvPlay) != null) {
                        textView.setText(list.get(0));
                    }
                    if (list.get(1) != null && !list.get(1).equals(BuildConfig.FLAVOR) && SeriesDetailActivity.this.pb_button_recent_watch != null) {
                        if (list.get(1).equals("gone")) {
                            SeriesDetailActivity.this.pb_button_recent_watch.setVisibility(8);
                        }
                        if (list.get(1).equals("visible")) {
                            SeriesDetailActivity.this.pb_button_recent_watch.setVisibility(0);
                        }
                    }
                    if (list.get(2) != null && !list.get(2).equals(BuildConfig.FLAVOR) && SeriesDetailActivity.this.pb_button_recent_watch != null) {
                        if (!list.get(2).equals("0")) {
                            SeriesDetailActivity.this.pb_button_recent_watch.setProgress(c.h.a.h.n.e.S(list.get(2)));
                            SeriesDetailActivity.this.pb_button_recent_watch.setVisibility(0);
                        } else if (SeriesDetailActivity.this.pb_button_recent_watch.getVisibility() == 0) {
                            SeriesDetailActivity.this.pb_button_recent_watch.setProgress(c.h.a.h.n.e.S(list.get(2)));
                            SeriesDetailActivity.this.pb_button_recent_watch.setVisibility(8);
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            if (SeriesDetailActivity.this.Z != null) {
                SeriesDetailActivity.this.Z.w();
            } else {
                SeriesDetailActivity seriesDetailActivity = SeriesDetailActivity.this;
                if (seriesDetailActivity.myRecyclerView != null) {
                    seriesDetailActivity.Z = new EpisodeDetailAdapter(seriesDetailActivity.s, SeriesDetailActivity.this.f26458i, null, SeriesDetailActivity.this.g0, BuildConfig.FLAVOR, SeriesDetailActivity.this.v0);
                    SeriesDetailActivity seriesDetailActivity2 = SeriesDetailActivity.this;
                    seriesDetailActivity2.myRecyclerView.setAdapter(seriesDetailActivity2.Z);
                }
            }
            if (SeriesDetailActivity.this.t == null || !SeriesDetailActivity.this.t.isShowing()) {
                return;
            }
            SeriesDetailActivity.this.t.dismiss();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (SeriesDetailActivity.this.t == null || SeriesDetailActivity.this.t.isShowing()) {
                return;
            }
            SeriesDetailActivity.this.t.show();
        }
    }

    public class v implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26488b;

        public v(View view) {
            this.f26488b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26488b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26488b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        /* JADX WARN: Code restructure failed: missing block: B:104:0x01f4, code lost:
        
            if (r9.getVisibility() == 0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x01f6, code lost:
        
            r9 = r8.f26489c.cast_tab;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
        
            if (r9.getVisibility() == 0) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00eb, code lost:
        
            if (r9.getVisibility() == 0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x01bd, code lost:
        
            if (r9.getVisibility() == 0) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x01bf, code lost:
        
            r9 = r8.f26489c.episode_tab;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x01c3, code lost:
        
            r9.setBackgroundResource(r1);
         */
        @Override // android.view.View.OnFocusChangeListener
        @android.annotation.SuppressLint({"ResourceType"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onFocusChange(android.view.View r9, boolean r10) {
            /*
                Method dump skipped, instruction units count: 513
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.v.onFocusChange(android.view.View, boolean):void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    @Override // c.h.a.k.f.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void M(com.nst.iptvsmarterstvbox.model.callback.SearchTMDBTVShowsCallback r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L43
            java.lang.Integer r2 = r6.b()     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L43
            java.lang.Integer r2 = r6.b()     // Catch: java.lang.Exception -> L41
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L41
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L43
            java.util.List r2 = r6.a()     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L43
            java.util.List r2 = r6.a()     // Catch: java.lang.Exception -> L41
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L43
            java.util.List r6 = r6.a()     // Catch: java.lang.Exception -> L41
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Exception -> L41
            com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo r6 = (com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo) r6     // Catch: java.lang.Exception -> L41
            java.lang.Integer r6 = r6.c()     // Catch: java.lang.Exception -> L41
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L41
            c.h.a.j.f r2 = r5.R     // Catch: java.lang.Exception -> L41
            r2.b(r6)     // Catch: java.lang.Exception -> L41
            goto Laf
        L41:
            goto Lb0
        L43:
            if (r6 == 0) goto Lae
            java.lang.Integer r2 = r6.b()     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto Lae
            java.lang.Integer r2 = r6.b()     // Catch: java.lang.Exception -> L41
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L41
            if (r2 <= r1) goto Lae
            java.util.List r2 = r6.a()     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto Lae
            r2 = 0
        L5c:
            java.util.List r3 = r6.a()     // Catch: java.lang.Exception -> L41
            int r3 = r3.size()     // Catch: java.lang.Exception -> L41
            if (r2 >= r3) goto Lae
            java.util.List r3 = r6.a()     // Catch: java.lang.Exception -> L41
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Exception -> L41
            com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo r3 = (com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo) r3     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = r3.d()     // Catch: java.lang.Exception -> L41
            java.lang.String r4 = r5.f26453d     // Catch: java.lang.Exception -> L41
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L41
            if (r3 != 0) goto L96
            java.util.List r3 = r6.a()     // Catch: java.lang.Exception -> L41
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Exception -> L41
            com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo r3 = (com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo) r3     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = r3.e()     // Catch: java.lang.Exception -> L41
            java.lang.String r4 = r5.f26453d     // Catch: java.lang.Exception -> L41
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L41
            if (r3 == 0) goto L93
            goto L96
        L93:
            int r2 = r2 + 1
            goto L5c
        L96:
            c.h.a.j.f r3 = r5.R     // Catch: java.lang.Exception -> L41
            java.util.List r6 = r6.a()     // Catch: java.lang.Exception -> L41
            java.lang.Object r6 = r6.get(r2)     // Catch: java.lang.Exception -> L41
            com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo r6 = (com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBTVShowsResultPojo) r6     // Catch: java.lang.Exception -> L41
            java.lang.Integer r6 = r6.c()     // Catch: java.lang.Exception -> L41
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L41
            r3.b(r6)     // Catch: java.lang.Exception -> L41
            goto Laf
        Lae:
            r0 = 1
        Laf:
            r1 = r0
        Lb0:
            if (r1 == 0) goto Lbb
            android.widget.TextView r6 = r5.cast_tab
            if (r6 == 0) goto Lbb
            r0 = 8
            r6.setVisibility(r0)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.M(com.nst.iptvsmarterstvbox.model.callback.SearchTMDBTVShowsCallback):void");
    }

    public final void O0() {
        try {
            c.h.a.i.b bVar = new c.h.a.i.b();
            bVar.h(this.f26460k);
            bVar.m(this.p);
            bVar.k(this.f26453d);
            bVar.l(this.D);
            bVar.o(c.h.a.i.q.m.z(this.s));
            this.G.i(bVar, "series");
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 21) {
                this.ivFavourite.setImageResource(R.drawable.fav_heart_red);
            }
            if (i2 >= 21) {
                this.ivFavourite.setImageDrawable(this.s.getResources().getDrawable(R.drawable.fav_heart_red, null));
            }
        } catch (Exception unused) {
        }
    }

    public final void P0() {
        Window window = getWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            window.clearFlags(67108864);
        }
        if (i2 >= 21) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (i2 >= 21) {
            window.setStatusBarColor(a.i.i.b.d(this, R.color.colorPrimaryDark));
        }
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
    public void Q0(org.json.JSONArray r22, int r23) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.Q0(org.json.JSONArray, int):void");
    }

    @SuppressLint({"InlinedApi"})
    public void R0() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public final void S0() {
        TextView textView = this.tvMovieName;
        if (textView != null) {
            textView.setSelected(true);
        }
        if (this.v0.equals("mobile")) {
            try {
                this.o0 = c.f.a.c.d.u.b.e(this.s).c().c();
            } catch (Exception unused) {
            }
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.t = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.t.setMessage(this.s.getResources().getString(R.string.please_wait));
        this.t.show();
        this.l0 = new c.h.a.i.q.l(this.s);
        SharedPreferences sharedPreferences = getSharedPreferences("sort_episodes", 0);
        this.W = sharedPreferences;
        this.X = sharedPreferences.edit();
        if (this.W.getString("sort", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.X.putString("sort", "0");
            this.X.apply();
        }
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.myRecyclerView.setItemAnimator(new a.y.e.c());
        }
        this.G = new c.h.a.i.q.a(this.s);
        this.tvPlay.requestFocus();
        this.tvPlay.setFocusable(true);
        SharedPreferences sharedPreferences2 = getSharedPreferences("loginPrefs", 0);
        this.u = sharedPreferences2;
        String string = sharedPreferences2.getString("username", BuildConfig.FLAVOR);
        String string2 = this.u.getString("password", BuildConfig.FLAVOR);
        if (string == null || string2 == null || string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else {
            d1(this.s, string, string2);
        }
    }

    @Override // c.h.a.k.f.j
    public void T(TMDBTVShowsInfoCallback tMDBTVShowsInfoCallback) {
    }

    public final void T0(SeriesDetailActivity seriesDetailActivity) {
        View viewInflate = ((LayoutInflater) seriesDetailActivity.getSystemService("layout_inflater")).inflate(R.layout.layout_movie_trailer, (RelativeLayout) seriesDetailActivity.findViewById(R.id.rl_password_verification));
        PopupWindow popupWindow = new PopupWindow(seriesDetailActivity);
        this.H = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.H.setWidth(-1);
        this.H.setHeight(-1);
        this.H.setFocusable(true);
        this.H.setBackgroundDrawable(new BitmapDrawable());
        this.H.showAtLocation(viewInflate, 17, 0, 0);
        this.P = (Button) viewInflate.findViewById(R.id.bt_save_password);
        TextView textView = (TextView) viewInflate.findViewById(R.id.et_password);
        this.I = (Button) viewInflate.findViewById(R.id.bt_close);
        textView.setText("Series trailer is not available");
        Button button = this.P;
        if (button != null) {
            button.setOnFocusChangeListener(new v(button));
        }
        Button button2 = this.I;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new v(button2));
        }
        this.I.setOnClickListener(new k());
        this.P.setOnClickListener(new l());
    }

    public final void U0(View view) {
        if (this.v0.equals("mobile")) {
            try {
                this.o0 = c.f.a.c.d.u.b.e(this.s).c().c();
            } catch (Exception unused) {
            }
        }
        try {
            c.f.a.c.d.u.d dVar = this.o0;
            if (dVar != null && dVar.c()) {
                String str = this.s.getResources().getString(R.string.season_number) + " - " + this.t0;
                String strT = c.h.a.h.n.e.t(c.h.a.h.n.e.F(this.s, this.p0, this.q0, "series"));
                String strK = BuildConfig.FLAVOR;
                c.f.a.c.d.u.d dVar2 = this.o0;
                if (dVar2 != null && dVar2.p() != null && this.o0.p().j() != null && this.o0.p().j().K() != null) {
                    strK = this.o0.p().j().K();
                }
                if (strK.equals(strT)) {
                    this.s.startActivity(new Intent(this.s, (Class<?>) ExpandedControlsActivity.class));
                    return;
                } else {
                    c.h.a.h.m.a.c(this.u0, true, c.h.a.h.m.a.a(this.r0, str, BuildConfig.FLAVOR, 0, strT, "videos/mp4", this.s0, BuildConfig.FLAVOR, null), this.o0, this.s);
                    return;
                }
            }
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            j0 j0Var = new j0(this, view);
            j0Var.c().inflate(R.menu.menu_players_hp, j0Var.b());
            ArrayList<ExternalPlayerModelClass> arrayListL = new c.h.a.i.q.d(this.s).l();
            if (arrayListL == null || arrayListL.size() <= 0) {
                c.h.a.h.n.e.V(this.s, BuildConfig.FLAVOR, this.p0, "series", this.q0, "0", this.r0, null, BuildConfig.FLAVOR);
                return;
            }
            j0Var.b().add(0, 0, 0, this.s.getResources().getString(R.string.nav_play));
            ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
            externalPlayerModelClass.e(0);
            externalPlayerModelClass.d(this.s.getResources().getString(R.string.play_with));
            arrayList.add(externalPlayerModelClass);
            int i2 = 0;
            while (i2 < arrayListL.size()) {
                int i3 = i2 + 1;
                j0Var.b().add(0, i3, 0, this.s.getResources().getString(R.string.play_with) + " " + arrayListL.get(i2).a());
                arrayList.add(arrayListL.get(i2));
                i2 = i3;
            }
            j0Var.f(new f(arrayList));
            j0Var.e(new g());
            j0Var.g();
        } catch (Exception unused2) {
        }
    }

    public final void V0() {
        try {
            this.G.o(this.p, this.f26460k, "series", this.f26453d, c.h.a.i.q.m.z(this.s));
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 21) {
                this.ivFavourite.setImageResource(R.drawable.fav_heart_white);
            }
            if (i2 >= 21) {
                this.ivFavourite.setImageDrawable(this.s.getResources().getDrawable(R.drawable.fav_heart_white, null));
            }
        } catch (Exception unused) {
        }
    }

    public void W0() {
        new u().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:53:0x00e4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void X0(org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.X0(org.json.JSONObject):void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.Y0(org.json.JSONObject, java.lang.String):void");
    }

    @SuppressLint({"ResourceType"})
    public final void Z0(Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.v0.equals("mobile") ? R.layout.season_selector_popup : R.layout.season_selector_popup_tv, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(context);
        this.j0 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.j0.setWidth(-1);
        this.j0.setHeight(-1);
        this.j0.setFocusable(true);
        this.j0.showAtLocation(viewInflate, 0, 0, 0);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.season_button_recycler_view);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_close);
        if (textView != null) {
            textView.setOnClickListener(new h());
        }
        if (recyclerView != null) {
            try {
                recyclerView.setLayoutManager(new GridLayoutManager((Context) this, 4, 1, false));
                recyclerView.setItemAnimator(new a.y.e.c());
                ArrayList<Integer> arrayList = this.k0;
                if (arrayList == null || arrayList.size() <= 0) {
                    return;
                }
                SeasonsButtonAdapter seasonsButtonAdapter = new SeasonsButtonAdapter(context, this.k0, this.j0, this.m0);
                this.f0 = seasonsButtonAdapter;
                recyclerView.setAdapter(seasonsButtonAdapter);
            } catch (Exception unused) {
            }
        }
    }

    @Override // c.h.a.k.f.b
    public void a() {
    }

    @Override // c.h.a.k.f.j
    public void a0(TMDBTrailerCallback tMDBTrailerCallback) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:165|69|(2:146|70)|(4:142|71|(2:137|73)(1:75)|74)|80|150|81|84) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02a8, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c9 A[Catch: Exception -> 0x03de, TryCatch #3 {Exception -> 0x03de, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x000d, B:8:0x0013, B:11:0x004c, B:24:0x00aa, B:25:0x00b3, B:28:0x00c1, B:30:0x00dd, B:32:0x00f3, B:33:0x0112, B:35:0x0116, B:37:0x015e, B:38:0x019a, B:54:0x01ef, B:55:0x01fa, B:57:0x0202, B:58:0x020c, B:60:0x0211, B:62:0x0219, B:64:0x0231, B:65:0x023a, B:67:0x0240, B:69:0x025c, B:84:0x02a9, B:85:0x02ad, B:86:0x02b0, B:87:0x02b5, B:89:0x02c9, B:90:0x02da, B:91:0x02de, B:93:0x02e2, B:95:0x02e6, B:97:0x02ec, B:99:0x031d, B:101:0x0321, B:104:0x0339, B:105:0x0387, B:107:0x0394, B:109:0x039a, B:110:0x03a3, B:115:0x03cc, B:14:0x0054, B:16:0x0058, B:17:0x0077, B:19:0x007b, B:20:0x00a2, B:22:0x00a6, B:116:0x03cf, B:118:0x03d3, B:120:0x03d9), top: B:135:0x0000 }] */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a1() {
        /*
            Method dump skipped, instruction units count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.a1():void");
    }

    @Override // c.h.a.k.f.b
    public void b() {
    }

    @Override // c.h.a.k.f.k
    public void b0(c.f.d.j jVar) {
        JSONArray jSONArray;
        if (jVar != null) {
            try {
                JSONObject jSONObject = new JSONObject(jVar.toString());
                String string = jSONObject.getString("seasons");
                String string2 = jSONObject.getString("episodes");
                try {
                    if (jSONObject.getJSONObject("info").getJSONArray("backdrop_path") != null) {
                        this.h0 = jSONObject.getJSONObject("info").getJSONArray("backdrop_path");
                    }
                    if (this.appbarToolbar != null && (jSONArray = this.h0) != null && jSONArray.length() > 0) {
                        this.f26464o = this.h0.get(new Random().nextInt(this.h0.length())).toString();
                        Context context = this.s;
                        if (context != null) {
                            c.k.b.t.q(context).l(this.f26464o).i(new p());
                        }
                    }
                } catch (Exception unused) {
                }
                if (!string.equals("[]")) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("seasons");
                        int length = jSONArray2.length();
                        this.U.clear();
                        for (int i2 = 0; i2 < length; i2++) {
                            if (jSONArray2.get(i2) instanceof JSONObject) {
                                X0((JSONObject) jSONArray2.get(i2));
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("seasons");
                        Iterator<String> itKeys = jSONObject2.keys();
                        this.U.clear();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (jSONObject2.get(next) instanceof JSONObject) {
                                Y0(jSONObject2, next);
                            }
                        }
                    } catch (Exception unused3) {
                    }
                }
                if (!string2.equals("[]")) {
                    try {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("episodes");
                        int length2 = jSONArray3.length();
                        this.T.clear();
                        for (int i3 = 0; i3 < length2; i3++) {
                            if (jSONArray3.get(i3) instanceof JSONArray) {
                                JSONArray jSONArray4 = new JSONArray(jSONArray3.get(i3).toString());
                                Q0(jSONArray4, jSONArray4.length());
                            }
                        }
                    } catch (Exception unused4) {
                    }
                    JSONObject jSONObject3 = jSONObject.getJSONObject("episodes");
                    this.T.clear();
                    Iterator<String> itKeys2 = jSONObject3.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        if (jSONObject3.get(next2) instanceof JSONArray) {
                            JSONArray jSONArray5 = new JSONArray(jSONObject3.get(next2).toString());
                            Q0(jSONArray5, jSONArray5.length());
                        }
                    }
                }
            } catch (Exception unused5) {
            }
        }
        a1();
        this.R.d(this.f26453d);
    }

    public final void b1(SeriesDetailActivity seriesDetailActivity) {
        View viewInflate = ((LayoutInflater) seriesDetailActivity.getSystemService("layout_inflater")).inflate(R.layout.layout_cast_details, (RelativeLayout) seriesDetailActivity.findViewById(R.id.rl_password_verification));
        this.L = (TextView) viewInflate.findViewById(R.id.tv_casts_info_popup);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_parental_password);
        this.M = textView;
        textView.setText(getResources().getString(R.string.plot_without_col));
        this.L.setText(this.J);
        PopupWindow popupWindow = new PopupWindow(seriesDetailActivity);
        this.H = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.H.setWidth(-1);
        this.H.setHeight(-1);
        this.H.setFocusable(true);
        this.H.showAtLocation(viewInflate, 17, 0, 0);
        Button button = (Button) viewInflate.findViewById(R.id.bt_close);
        this.I = button;
        if (button != null) {
            button.setOnFocusChangeListener(new v(button));
        }
        this.I.setOnClickListener(new i());
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
        try {
            ProgressDialog progressDialog = this.t;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.t.dismiss();
            Toast.makeText(this, this.s.getResources().getString(R.string.something_wrong), 1).show();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0154 A[PHI: r3
  0x0154: PHI (r3v2 int) = (r3v1 int), (r3v5 int) binds: [B:51:0x0152, B:46:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d1(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity.d1(android.content.Context, java.lang.String, java.lang.String):void");
    }

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint({"SetTextI18n"})
    public List<String> e1() {
        String str;
        boolean z;
        String str2;
        int iRound;
        int iS;
        int iRound2;
        String strF;
        int iS2;
        int iRound3;
        int iRound4;
        String strValueOf;
        ArrayList arrayList = new ArrayList();
        ArrayList<GetEpisdoeDetailsCallback> arrayListT = this.l0.t(this.f26461l);
        String str3 = BuildConfig.FLAVOR;
        int i2 = 0;
        if (arrayListT == null || arrayListT.size() <= 0) {
            if (this.tvPlay != null) {
                str = getResources().getString(R.string.small_play) + " - S" + this.m0 + ":E1";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.pb_button_recent_watch != null) {
                str3 = str;
                z = false;
                str2 = "gone";
            } else {
                z = false;
                String str4 = str;
                str2 = BuildConfig.FLAVOR;
                str3 = str4;
            }
        } else {
            str2 = BuildConfig.FLAVOR;
            z = true;
        }
        ArrayList<GetEpisdoeDetailsCallback> arrayList2 = this.Y;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return null;
        }
        this.i0.clear();
        EpisodeDetailAdapter episodeDetailAdapter = this.Z;
        if (episodeDetailAdapter != null) {
            episodeDetailAdapter.x0();
        }
        ArrayList<GetEpisdoeDetailsCallback> arrayListR = this.l0.r("getalldata");
        String str5 = "0";
        int i3 = 0;
        while (i3 < this.Y.size()) {
            if (z && this.Y.get(i3).j().equals(arrayListT.get(i2).j())) {
                if (this.tvPlay != null) {
                    str3 = getResources().getString(R.string.small_resume) + " - S" + this.Y.get(i3).p() + ":E" + this.Y.get(i3).h();
                    try {
                        this.p0 = c.h.a.h.n.e.S(this.Y.get(i3).j());
                    } catch (Exception unused) {
                    }
                    this.q0 = this.Y.get(i3).c();
                    this.r0 = this.Y.get(i3).u();
                    this.s0 = this.Y.get(i3).n();
                    this.t0 = this.Y.get(i3).p().intValue();
                }
                if (this.pb_button_recent_watch != null) {
                    try {
                        int iS3 = c.h.a.h.n.e.S(arrayListT.get(i2).g());
                        iRound3 = Math.round(iS3 / 1000.0f);
                        try {
                            this.u0 = iS3;
                            iS2 = c.h.a.h.n.e.S(this.Y.get(i3).f());
                            if (iS2 == 0) {
                                try {
                                    iS2 = c.h.a.h.n.e.S(arrayListT.get(i2).f());
                                } catch (Exception unused2) {
                                }
                            } else {
                                iS2 = c.h.a.h.n.e.S(this.Y.get(i3).f());
                            }
                        } catch (Exception unused3) {
                            iS2 = 0;
                        }
                    } catch (Exception unused4) {
                        iS2 = 0;
                        iRound3 = 0;
                    }
                    try {
                        iRound4 = Math.round((iRound3 / iS2) * 100.0f);
                    } catch (Exception unused5) {
                        iRound4 = 0;
                    }
                    if (iRound4 != 0) {
                        strValueOf = String.valueOf(iRound4);
                        str2 = "visible";
                    } else if (this.pb_button_recent_watch.getVisibility() == 0) {
                        strValueOf = String.valueOf(iRound4);
                        str2 = "gone";
                    }
                    str5 = strValueOf;
                }
            }
            if (this.Y.get(i3).p().equals(Integer.valueOf(this.m0))) {
                GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = this.Y.get(i3);
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayListR.size()) {
                        break;
                    }
                    if (this.Y.get(i3).j().equals(arrayListR.get(i4).j())) {
                        getEpisdoeDetailsCallback.D(arrayListR.get(i4).g());
                        try {
                            iRound = Math.round(c.h.a.h.n.e.S(arrayListR.get(i4).g()) / 1000.0f);
                        } catch (Exception unused6) {
                            iRound = 0;
                        }
                        try {
                            iS = c.h.a.h.n.e.S(getEpisdoeDetailsCallback.f());
                            if (iS == 0) {
                                try {
                                    strF = arrayListR.get(i4).f();
                                } catch (Exception unused7) {
                                }
                            } else {
                                strF = getEpisdoeDetailsCallback.f();
                            }
                            iS = c.h.a.h.n.e.S(strF);
                        } catch (Exception unused8) {
                            iS = 0;
                        }
                        try {
                            iRound2 = Math.round((iRound / iS) * 100.0f);
                        } catch (Exception unused9) {
                            iRound2 = 0;
                        }
                        getEpisdoeDetailsCallback.F(iRound2);
                    } else {
                        i4++;
                    }
                }
                this.i0.add(getEpisdoeDetailsCallback);
            }
            i3++;
            i2 = 0;
        }
        ArrayList<GetEpisdoeDetailsCallback> arrayList3 = this.i0;
        if (arrayList3 == null || arrayList3.size() <= 0 || this.myRecyclerView == null) {
            return null;
        }
        if (!z) {
            try {
                this.p0 = c.h.a.h.n.e.S(this.i0.get(0).j());
            } catch (Exception unused10) {
            }
            this.q0 = this.i0.get(0).c();
            this.r0 = this.i0.get(0).u();
            this.u0 = c.h.a.h.n.e.S(this.i0.get(0).g());
            this.s0 = this.i0.get(0).n();
            this.t0 = this.i0.get(0).p().intValue();
        }
        c.h.a.i.a.c().f(this.Y);
        c.h.a.i.a.c().e(this.i0);
        arrayList.add(str3);
        arrayList.add(str2);
        arrayList.add(str5);
        return arrayList;
    }

    @Override // c.h.a.k.f.j
    public void f0(TMDBCastsCallback tMDBCastsCallback) {
        if (tMDBCastsCallback != null) {
            try {
                if (tMDBCastsCallback.a() == null || tMDBCastsCallback.a().size() <= 0) {
                    return;
                }
                this.rvCast.setLayoutManager(new LinearLayoutManager(this, 0, false));
                this.rvCast.setItemAnimator(null);
                CastAdapter castAdapter = new CastAdapter(tMDBCastsCallback.a(), this.s, true, this.f26464o);
                this.r = castAdapter;
                this.rvCast.setAdapter(castAdapter);
            } catch (Exception unused) {
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    public void f1(int i2) {
        boolean z;
        ArrayList<GetEpisdoeDetailsCallback> arrayList;
        ArrayList<GetEpisdoeDetailsCallback> arrayList2;
        int iRound;
        int iS;
        int iS2;
        int iRound2;
        String strF;
        int iS3;
        int iRound3;
        int iRound4;
        GetEpisdoeDetailsCallback getEpisdoeDetailsCallback;
        this.m0 = i2;
        TextView textView = this.tvSeasonButton;
        if (textView != null) {
            textView.setText(getResources().getString(R.string.season_number) + " - " + i2);
        }
        ArrayList<GetEpisdoeDetailsCallback> arrayList3 = this.i0;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        ArrayList<GetEpisdoeDetailsCallback> arrayListT = this.l0.t(this.f26461l);
        if (arrayListT == null || arrayListT.size() <= 0) {
            TextView textView2 = this.tvPlay;
            if (textView2 != null) {
                textView2.setText(getResources().getString(R.string.small_play) + " - S" + i2 + ":E1");
            }
            ProgressBar progressBar = this.pb_button_recent_watch;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            z = false;
        } else {
            z = true;
        }
        if (this.Y != null) {
            ArrayList<GetEpisdoeDetailsCallback> arrayListR = this.l0.r("getalldata");
            for (int i3 = 0; i3 < this.Y.size(); i3++) {
                if (z && this.Y.get(i3).j().equals(arrayListT.get(0).j())) {
                    TextView textView3 = this.tvPlay;
                    if (textView3 != null) {
                        textView3.setText(getResources().getString(R.string.small_resume) + " - S" + this.Y.get(i3).p() + ":E" + this.Y.get(i3).h());
                        try {
                            this.p0 = c.h.a.h.n.e.S(this.Y.get(i3).j());
                        } catch (Exception unused) {
                        }
                        this.q0 = this.Y.get(i3).c();
                        this.r0 = this.Y.get(i3).u();
                        this.s0 = this.Y.get(i3).n();
                        this.t0 = this.Y.get(i3).p().intValue();
                    }
                    if (this.pb_button_recent_watch != null) {
                        try {
                            int iS4 = c.h.a.h.n.e.S(arrayListT.get(0).g());
                            iRound3 = Math.round(iS4 / 1000.0f);
                            try {
                                this.u0 = iS4;
                                iS3 = c.h.a.h.n.e.S(this.Y.get(i3).f());
                                if (iS3 == 0) {
                                    try {
                                        getEpisdoeDetailsCallback = arrayListT.get(0);
                                    } catch (Exception unused2) {
                                    }
                                } else {
                                    getEpisdoeDetailsCallback = this.Y.get(i3);
                                }
                                iS3 = c.h.a.h.n.e.S(getEpisdoeDetailsCallback.f());
                            } catch (Exception unused3) {
                                iS3 = 0;
                            }
                        } catch (Exception unused4) {
                            iS3 = 0;
                            iRound3 = 0;
                        }
                        try {
                            iRound4 = Math.round((iRound3 / iS3) * 100.0f);
                        } catch (Exception unused5) {
                            iRound4 = 0;
                        }
                        ProgressBar progressBar2 = this.pb_button_recent_watch;
                        if (iRound4 != 0) {
                            progressBar2.setProgress(iRound4);
                            this.pb_button_recent_watch.setVisibility(0);
                        } else if (progressBar2.getVisibility() == 0) {
                            this.pb_button_recent_watch.setProgress(iRound4);
                            this.pb_button_recent_watch.setVisibility(8);
                        }
                    }
                }
                if (this.Y.get(i3).p().equals(Integer.valueOf(i2))) {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback2 = this.Y.get(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayListR.size()) {
                            break;
                        }
                        if (this.Y.get(i3).j().equals(arrayListR.get(i4).j())) {
                            getEpisdoeDetailsCallback2.D(arrayListR.get(i4).g());
                            try {
                                iRound = Math.round(c.h.a.h.n.e.S(arrayListR.get(i4).g()) / 1000.0f);
                                try {
                                    iS = c.h.a.h.n.e.S(getEpisdoeDetailsCallback2.f());
                                    if (iS == 0) {
                                        try {
                                            strF = arrayListR.get(i4).f();
                                        } catch (Exception unused6) {
                                            iS2 = iS;
                                        }
                                    } else {
                                        strF = getEpisdoeDetailsCallback2.f();
                                    }
                                    iS2 = c.h.a.h.n.e.S(strF);
                                } catch (Exception unused7) {
                                    iS = 0;
                                    iS2 = iS;
                                    iRound2 = Math.round((iRound / iS2) * 100.0f);
                                    getEpisdoeDetailsCallback2.F(iRound2);
                                    this.i0.add(getEpisdoeDetailsCallback2);
                                }
                            } catch (Exception unused8) {
                                iRound = 0;
                            }
                            try {
                                iRound2 = Math.round((iRound / iS2) * 100.0f);
                            } catch (Exception unused9) {
                                iRound2 = 0;
                            }
                            getEpisdoeDetailsCallback2.F(iRound2);
                        } else {
                            i4++;
                        }
                    }
                    this.i0.add(getEpisdoeDetailsCallback2);
                }
            }
            if (this.episode_tab != null && (arrayList2 = this.i0) != null && arrayList2.size() > 0) {
                this.episode_tab.setText(getResources().getString(R.string.episodes) + " (" + this.i0.size() + ")");
            }
            if (!z && (arrayList = this.i0) != null && arrayList.size() > 0) {
                try {
                    this.p0 = c.h.a.h.n.e.S(this.i0.get(0).j());
                } catch (Exception unused10) {
                }
                this.q0 = this.i0.get(0).c();
                this.r0 = this.i0.get(0).u();
                this.u0 = c.h.a.h.n.e.S(this.i0.get(0).g());
                this.s0 = this.i0.get(0).n();
                this.t0 = this.i0.get(0).p().intValue();
            }
            c.h.a.i.a.c().f(this.Y);
            c.h.a.i.a.c().e(this.i0);
            EpisodeDetailAdapter episodeDetailAdapter = this.Z;
            if (episodeDetailAdapter != null) {
                episodeDetailAdapter.w();
            } else {
                EpisodeDetailAdapter episodeDetailAdapter2 = new EpisodeDetailAdapter(this.s, this.f26458i, null, this.g0, BuildConfig.FLAVOR, this.v0);
                this.Z = episodeDetailAdapter2;
                this.myRecyclerView.setAdapter(episodeDetailAdapter2);
            }
        }
        TextView textView4 = this.episode_tab;
        if (textView4 != null) {
            textView4.setBackgroundResource(R.drawable.episode_cast_tab_background_hover_clicked);
        }
        TextView textView5 = this.cast_tab;
        if (textView5 != null) {
            textView5.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
        RecyclerView recyclerView = this.rvCast;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        RecyclerView recyclerView2 = this.myRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
    }

    @Override // c.h.a.k.f.k
    public void m(String str) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        PopupWindow popupWindow = this.j0;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.j0.dismiss();
            return;
        }
        EpisodeDetailAdapter episodeDetailAdapter = this.Z;
        if (episodeDetailAdapter != null) {
            episodeDetailAdapter.x0();
        }
        c.h.a.h.n.a.V = true;
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.tv_header_title) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i2;
        this.s = this;
        super.onCreate(bundle);
        R0();
        if (new c.h.a.k.d.a.a(this.s).A().equals(c.h.a.h.n.a.s0)) {
            this.v0 = "tv";
            i2 = R.layout.activity_series_detail_tv;
        } else {
            this.v0 = "mobile";
            i2 = R.layout.activity_series_detail;
        }
        setContentView(i2);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.dashboard_background));
        }
        TextView textView = this.tvPlay;
        if (textView != null) {
            textView.setOnFocusChangeListener(new v(textView));
        }
        TextView textView2 = this.tvSeasonButton;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new v(textView2));
        }
        TextView textView3 = this.tvReadMore;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new v(textView3));
        }
        TextView textView4 = this.tvWatchTrailer;
        if (textView4 != null) {
            textView4.setOnFocusChangeListener(new v(textView4));
        }
        this.n0 = true;
        this.Y.clear();
        TextView textView5 = this.episode_tab;
        if (textView5 != null) {
            textView5.setOnClickListener(new j());
            TextView textView6 = this.episode_tab;
            textView6.setOnFocusChangeListener(new v(textView6));
        }
        TextView textView7 = this.cast_tab;
        if (textView7 != null) {
            textView7.setOnFocusChangeListener(new v(textView7));
            this.cast_tab.setOnClickListener(new m());
        }
        getWindow().setFlags(1024, 1024);
        v0((Toolbar) findViewById(R.id.toolbar));
        P0();
        S0();
        this.logo.setOnClickListener(new n());
        this.iv_back_button.setOnClickListener(new o());
        ImageView imageView = this.q;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_text_icon);
        this.O = menu;
        this.N = menu.getItem(1).getSubMenu().findItem(R.id.empty);
        if (c.h.a.i.q.m.f(this.s).equals("api")) {
            menu.getItem(1).getSubMenu().findItem(R.id.menu_load_channels_vod).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.toolbar.getChildCount(); i2++) {
            if (this.toolbar.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.toolbar.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
        return true;
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        c.f.a.c.d.u.u.i iVarP;
        super.onDestroy();
        try {
            EpisodeDetailAdapter episodeDetailAdapter = this.Z;
            if (episodeDetailAdapter != null) {
                episodeDetailAdapter.x0();
            }
            c.f.a.c.d.u.d dVar = this.o0;
            if (dVar == null || this.Z == null || (iVarP = dVar.p()) == null) {
                return;
            }
            iVarP.X(this.Z.N);
        } catch (Exception unused) {
        }
    }

    @Override // a.b.k.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 20) {
            if (i2 != 19) {
                return super.onKeyDown(i2, keyEvent);
            }
            View currentFocus = getCurrentFocus();
            if ((currentFocus != null && currentFocus.getTag() != null && currentFocus.getTag().equals("11")) || (currentFocus != null && currentFocus.getTag() != null && currentFocus.getTag().equals("10"))) {
                this.scrollView.setVisibility(0);
            }
            return false;
        }
        View currentFocus2 = getCurrentFocus();
        if ((currentFocus2 != null && currentFocus2.getTag() != null && currentFocus2.getTag().equals("11")) || (currentFocus2 != null && currentFocus2.getTag() != null && currentFocus2.getTag().equals("10"))) {
            this.scrollView.setVisibility(8);
            RecyclerView recyclerView = this.myRecyclerView;
            if (recyclerView != null && recyclerView.getVisibility() == 0) {
                c.h.a.h.n.a.X = true;
                c.h.a.h.n.a.W = 0;
                EpisodeDetailAdapter episodeDetailAdapter = this.Z;
                if (episodeDetailAdapter != null) {
                    episodeDetailAdapter.w();
                }
            }
            RecyclerView recyclerView2 = this.rvCast;
            if (recyclerView2 != null && recyclerView2.getVisibility() == 0) {
                this.rvCast.requestFocus();
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 82) {
            return super.onKeyUp(i2, keyEvent);
        }
        Menu menu = this.O;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.N = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout && (context = this.s) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new a()).g(getResources().getString(R.string.no), new t()).n();
        }
        if (itemId == R.id.menu_load_channels_vod) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.s.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.s.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.s.getResources().getString(R.string.yes), new b());
            aVar.g(this.s.getResources().getString(R.string.no), new c());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.s.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.s.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.s.getResources().getString(R.string.yes), new d());
            aVar2.g(this.s.getResources().getString(R.string.no), new e());
            aVar2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        R0();
        super.onResume();
        c.h.a.h.n.e.g(this.s);
        if (this.v0.equals("mobile")) {
            try {
                this.o0 = c.f.a.c.d.u.b.e(this.s).c().c();
            } catch (Exception unused) {
            }
        }
        if (!this.n0) {
            W0();
        }
        this.n0 = false;
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        c.f.a.c.d.u.u.i iVarP;
        super.onStop();
        try {
            EpisodeDetailAdapter episodeDetailAdapter = this.Z;
            if (episodeDetailAdapter != null) {
                episodeDetailAdapter.x0();
            }
            c.f.a.c.d.u.d dVar = this.o0;
            if (dVar == null || this.Z == null || (iVarP = dVar.p()) == null) {
                return;
            }
            iVarP.X(this.Z.N);
        } catch (Exception unused) {
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_play /* 2131429490 */:
                U0(view);
                break;
            case R.id.tv_readmore /* 2131429513 */:
                b1(this);
                break;
            case R.id.tv_season_button /* 2131429526 */:
                Z0(this.s);
                break;
            case R.id.tv_watch_trailer /* 2131429573 */:
                String str = this.f26462m;
                if (str == null || str.isEmpty()) {
                    T0(this);
                } else {
                    startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", this.f26462m));
                }
                break;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        R0();
    }
}
