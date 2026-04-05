package minefarts.iptvsmarters.view.activity;

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
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.k.b.c0;
import c.k.b.t;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import minefarts.iptvsmarters.model.callback.TMDBPersonInfoCallback;
import minefarts.iptvsmarters.model.callback.TMDBTrailerCallback;
import minefarts.iptvsmarters.model.pojo.ExternalPlayerModelClass;
import minefarts.iptvsmarters.view.adapter.CastAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ViewDetailsActivity extends a.b.k.c implements View.OnClickListener, c.h.a.k.f.m, c.h.a.k.f.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f26909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f26910e;
    public c.h.a.i.q.a A;
    public PopupWindow B;
    public Button C;
    public String D;
    public DateFormat E;
    public String F;
    public TextView G;
    public MenuItem H;
    public Menu I;
    public Button L;
    public c.f.a.c.d.u.d M;
    public c.h.a.j.e O;
    public c.h.a.i.q.k P;
    public CastAdapter Q;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SimpleDateFormat f26913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Date f26914i;

    @BindView
    public ImageView ivFavourite;

    @BindView
    public ImageView ivMovieImage;

    @BindView
    public ImageView iv_back_button;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ProgressDialog f26916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f26917l;

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
    public LinearLayout ll_watch_trailer;

    @BindView
    public LinearLayout ll_watch_trailer_button_main_layout;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SharedPreferences f26918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.i.q.f f26919n;

    @BindView
    public NestedScrollView nestedScrollView;

    @BindView
    public ProgressBar pb_button_recent_watch;

    @BindView
    public RatingBar ratingBar;

    @BindView
    public RelativeLayout rlAccountInfo;

    @BindView
    public RelativeLayout rlTransparent;

    @BindView
    public RecyclerView rvCast;
    public c.h.a.j.j s;

    @BindView
    public ScrollView scrollView;

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
    public TextView tvMovieInfo;

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
    public TextView tvWatchTrailer;

    @BindView
    public TextView tv_genre_info;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f26915j = this;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.h.a.i.q.b f26920o = new c.h.a.i.q.b();
    public c.h.a.i.q.b p = new c.h.a.i.q.b();
    public String q = BuildConfig.FLAVOR;
    public String r = BuildConfig.FLAVOR;
    public String t = BuildConfig.FLAVOR;
    public String u = BuildConfig.FLAVOR;
    public String v = BuildConfig.FLAVOR;
    public String w = BuildConfig.FLAVOR;
    public String x = BuildConfig.FLAVOR;
    public int y = -1;
    public String z = BuildConfig.FLAVOR;
    public String J = BuildConfig.FLAVOR;
    public Boolean K = Boolean.TRUE;
    public String N = BuildConfig.FLAVOR;
    public String R = "mobile";
    public int S = 0;
    public boolean T = false;
    public int U = 0;
    public String V = BuildConfig.FLAVOR;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class c implements c0 {
        public c() {
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
            ViewDetailsActivity.this.appbarToolbar.setBackground(new BitmapDrawable(ViewDetailsActivity.this.f26915j.getResources(), bitmap));
            ViewDetailsActivity viewDetailsActivity = ViewDetailsActivity.this;
            viewDetailsActivity.rlTransparent.setBackgroundColor(viewDetailsActivity.getResources().getColor(R.color.trasparent_black_2));
            ViewDetailsActivity viewDetailsActivity2 = ViewDetailsActivity.this;
            viewDetailsActivity2.toolbar.setBackgroundColor(viewDetailsActivity2.getResources().getColor(R.color.trasparent_black_2));
        }
    }

    public class d implements c.k.b.e {
        public d() {
        }

        @Override // c.k.b.e
        public void a() {
            ViewDetailsActivity.this.ivMovieImage.setBackgroundResource(R.drawable.noposter);
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class e implements c0 {
        public e() {
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
            ViewDetailsActivity.this.appbarToolbar.setBackground(new BitmapDrawable(ViewDetailsActivity.this.f26915j.getResources(), bitmap));
            ViewDetailsActivity viewDetailsActivity = ViewDetailsActivity.this;
            viewDetailsActivity.rlTransparent.setBackgroundColor(viewDetailsActivity.getResources().getColor(R.color.trasparent_black_2));
            ViewDetailsActivity viewDetailsActivity2 = ViewDetailsActivity.this;
            viewDetailsActivity2.toolbar.setBackgroundColor(viewDetailsActivity2.getResources().getColor(R.color.trasparent_black_2));
        }
    }

    public class f implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f26926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f26927b;

        public f(ArrayList arrayList, String str) {
            this.f26926a = arrayList;
            this.f26927b = str;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            ArrayList arrayList;
            try {
                if (ViewDetailsActivity.this.K.booleanValue() && (arrayList = this.f26926a) != null && arrayList.size() > 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < this.f26926a.size()) {
                            if (menuItem.getItemId() != i2) {
                                i2++;
                            } else if (menuItem.getItemId() == 0) {
                                c.h.a.h.n.e.W(ViewDetailsActivity.this.f26915j, this.f26927b, ViewDetailsActivity.this.y, ViewDetailsActivity.this.v, ViewDetailsActivity.this.w, ViewDetailsActivity.this.x, ViewDetailsActivity.this.t, BuildConfig.FLAVOR, ViewDetailsActivity.this.S);
                            } else {
                                String strT = c.h.a.h.n.e.t(c.h.a.h.n.e.F(ViewDetailsActivity.this.f26915j, ViewDetailsActivity.this.y, ViewDetailsActivity.this.w, "movie"));
                                Intent intent = new Intent(ViewDetailsActivity.this.f26915j, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", strT);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f26926a.get(i2)).a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f26926a.get(i2)).b());
                                ViewDetailsActivity.this.f26915j.startActivity(intent);
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
            ViewDetailsActivity.this.B.dismiss();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsActivity.this.B.dismiss();
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsActivity.this.B.dismiss();
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(ViewDetailsActivity.this.f26915j);
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsActivity.this.onBackPressed();
        }
    }

    public class m implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f26935b;

        public m(Context context) {
            this.f26935b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ViewDetailsActivity.this.A.l(ViewDetailsActivity.this.y, ViewDetailsActivity.this.z, "vod", c.h.a.i.q.m.z(this.f26935b)).size() > 0) {
                ViewDetailsActivity.this.S0();
            } else {
                ViewDetailsActivity.this.L0();
            }
        }
    }

    public class n implements DialogInterface.OnClickListener {
        public n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class o implements DialogInterface.OnClickListener {
        public o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(ViewDetailsActivity.this.f26915j);
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(ViewDetailsActivity.this.f26915j);
        }
    }

    public class q implements DialogInterface.OnClickListener {
        public q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class r implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26941b;

        public r(View view) {
            this.f26941b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26941b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26941b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            int i2;
            LinearLayout linearLayout;
            if (z) {
                f2 = z ? 1.05f : 1.0f;
                Log.e("id is", BuildConfig.FLAVOR + this.f26941b.getTag());
                View view2 = this.f26941b;
                if (view2 == null || view2.getTag() == null) {
                    return;
                }
                boolean zEquals = this.f26941b.getTag().equals("1");
                i2 = R.drawable.blue_btn_effect;
                if (zEquals) {
                    a(f2);
                    b(f2);
                    linearLayout = ViewDetailsActivity.this.ll_play_button_main_layout;
                } else if (this.f26941b.getTag().equals("2")) {
                    a(f2);
                    b(f2);
                    this.f26941b.setBackgroundResource(R.drawable.blue_btn_effect);
                    return;
                } else {
                    if (!this.f26941b.getTag().equals("5")) {
                        if (!this.f26941b.getTag().equals("8")) {
                            a(1.15f);
                            b(1.15f);
                            return;
                        } else {
                            a(f2);
                            b(f2);
                            ViewDetailsActivity.this.L.setBackgroundResource(R.drawable.back_btn_effect);
                            return;
                        }
                    }
                    a(f2);
                    b(f2);
                    linearLayout = ViewDetailsActivity.this.ll_watch_trailer_button_main_layout;
                }
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                a(f2);
                b(f2);
                View view3 = this.f26941b;
                if (view3 == null || view3.getTag() == null) {
                    return;
                }
                boolean zEquals2 = this.f26941b.getTag().equals("1");
                i2 = R.drawable.rounded_edge_2;
                if (!zEquals2) {
                    if (this.f26941b.getTag().equals("3")) {
                        this.f26941b.setBackgroundResource(R.drawable.black_button_dark);
                        return;
                    }
                    if (!this.f26941b.getTag().equals("5")) {
                        if (this.f26941b.getTag() == null || !this.f26941b.getTag().equals("8")) {
                            return;
                        }
                        ViewDetailsActivity.this.L.setBackgroundResource(R.drawable.black_button_dark);
                        return;
                    }
                    linearLayout = ViewDetailsActivity.this.ll_watch_trailer_button_main_layout;
                }
                linearLayout = ViewDetailsActivity.this.ll_play_button_main_layout;
            }
            linearLayout.setBackgroundResource(i2);
        }
    }

    public static long N0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String O0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // c.h.a.k.f.i
    public void A(TMDBPersonInfoCallback tMDBPersonInfoCallback) {
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x015f A[Catch: Exception -> 0x01a0, TryCatch #0 {Exception -> 0x01a0, blocks: (B:4:0x0007, B:6:0x000d, B:8:0x001c, B:10:0x0022, B:12:0x002c, B:14:0x0098, B:15:0x00a5, B:17:0x00ba, B:20:0x00c0, B:22:0x00c4, B:23:0x00d6, B:26:0x00dc, B:28:0x00e0, B:31:0x00e6, B:33:0x00ec, B:35:0x00f2, B:45:0x0117, B:48:0x011d, B:50:0x0123, B:51:0x0128, B:53:0x0139, B:54:0x013f, B:57:0x0145, B:59:0x014b, B:61:0x0151, B:62:0x0157, B:64:0x015b, B:36:0x0102, B:38:0x0106, B:39:0x0109, B:41:0x010d, B:42:0x0110, B:44:0x0114, B:16:0x00ac, B:65:0x015f, B:67:0x0163, B:69:0x0167, B:70:0x016a, B:72:0x016e, B:73:0x0171, B:75:0x0175, B:76:0x0178, B:78:0x017c, B:79:0x017f, B:81:0x0183, B:82:0x0186, B:84:0x018a, B:85:0x018d, B:87:0x0191, B:88:0x0194, B:90:0x0198, B:91:0x019b), top: B:96:0x0007, inners: #1 }] */
    @Override // c.h.a.k.f.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L(minefarts.iptvsmarters.model.callback.SearchTMDBMoviesCallback r9) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ViewDetailsActivity.L(minefarts.iptvsmarters.model.callback.SearchTMDBMoviesCallback):void");
    }

    public final void L0() {
        c.h.a.i.b bVar = new c.h.a.i.b();
        bVar.h(this.z);
        bVar.m(this.y);
        bVar.k(this.t);
        bVar.l(this.x);
        bVar.o(c.h.a.i.q.m.z(this.f26915j));
        this.A.i(bVar, "vod");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 21) {
            this.ivFavourite.setImageResource(R.drawable.fav_heart_red);
        }
        if (i2 >= 21) {
            this.ivFavourite.setImageDrawable(this.f26915j.getResources().getDrawable(R.drawable.fav_heart_red, null));
        }
    }

    public final void M0() {
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

    @SuppressLint({"InlinedApi"})
    public void P0() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public final void Q0() {
        this.f26919n = new c.h.a.i.q.f(this.f26915j);
        this.A = new c.h.a.i.q.a(this.f26915j);
        this.P = new c.h.a.i.q.k(this.f26915j);
        this.tvPlay.requestFocus();
        this.tvPlay.setFocusable(true);
        TextView textView = this.tvMovieName;
        if (textView != null) {
            textView.setSelected(true);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f26916k = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.f26916k.setMessage(this.f26915j.getResources().getString(R.string.please_wait));
        this.f26916k.show();
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26917l = sharedPreferences;
        String string = sharedPreferences.getString("username", BuildConfig.FLAVOR);
        String string2 = this.f26917l.getString("password", BuildConfig.FLAVOR);
        if (string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        } else {
            U0(this.f26915j, string, string2);
        }
        this.logo.setOnClickListener(new k());
        this.iv_back_button.setOnClickListener(new l());
    }

    public final void R0(ViewDetailsActivity viewDetailsActivity) {
        View viewInflate = ((LayoutInflater) viewDetailsActivity.getSystemService("layout_inflater")).inflate(R.layout.layout_movie_trailer, (RelativeLayout) viewDetailsActivity.findViewById(R.id.rl_password_verification));
        PopupWindow popupWindow = new PopupWindow(viewDetailsActivity);
        this.B = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.B.setWidth(-1);
        this.B.setHeight(-1);
        this.B.setFocusable(true);
        this.B.setBackgroundDrawable(new BitmapDrawable());
        this.B.showAtLocation(viewInflate, 17, 0, 0);
        this.L = (Button) viewInflate.findViewById(R.id.bt_save_password);
        this.C = (Button) viewInflate.findViewById(R.id.bt_close);
        Button button = this.L;
        if (button != null) {
            button.setOnFocusChangeListener(new r(button));
        }
        Button button2 = this.C;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new r(button2));
        }
        this.C.setOnClickListener(new h());
        this.L.setOnClickListener(new i());
    }

    public final void S0() {
        this.A.o(this.y, this.z, "vod", this.t, c.h.a.i.q.m.z(this.f26915j));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 21) {
            this.ivFavourite.setImageResource(R.drawable.fav_heart_white);
        }
        if (i2 >= 21) {
            this.ivFavourite.setImageDrawable(this.f26915j.getResources().getDrawable(R.drawable.fav_heart_white, null));
        }
    }

    public final void T0(ViewDetailsActivity viewDetailsActivity) {
        View viewInflate = ((LayoutInflater) viewDetailsActivity.getSystemService("layout_inflater")).inflate(R.layout.layout_cast_details, (RelativeLayout) viewDetailsActivity.findViewById(R.id.rl_password_verification));
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_casts_info_popup);
        this.G = textView;
        textView.setText(this.D);
        PopupWindow popupWindow = new PopupWindow(viewDetailsActivity);
        this.B = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.B.setWidth(-1);
        this.B.setHeight(-1);
        this.B.setFocusable(true);
        this.B.showAtLocation(viewInflate, 17, 0, 0);
        Button button = (Button) viewInflate.findViewById(R.id.bt_close);
        this.C = button;
        if (button != null) {
            button.setOnFocusChangeListener(new r(button));
        }
        this.C.setOnClickListener(new j());
    }

    @Override // c.h.a.k.f.m
    public void U(String str) {
        TextView textView;
        try {
            this.D = BuildConfig.FLAVOR;
            this.F = BuildConfig.FLAVOR;
            Context context = this.f26915j;
            String str2 = this.t;
            if (str2 != null && (textView = this.tvMovieName) != null) {
                textView.setText(str2);
            }
            LinearLayout linearLayout = this.llReleasedBox;
            if (linearLayout != null && this.llReleasedBoxInfo != null) {
                TextView textView2 = this.tvReleaseDateInfo;
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.llReleasedBoxInfo;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            TextView textView3 = this.tvReleaseDateInfo;
            if (textView3 != null) {
                textView3.setText("N/A");
            }
            if (this.tvDirectorInfo != null && this.llDirectorBoxInfo != null) {
                LinearLayout linearLayout3 = this.llDirectorBox;
            }
            LinearLayout linearLayout4 = this.llDirectorBox;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(0);
            }
            LinearLayout linearLayout5 = this.llDirectorBoxInfo;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(0);
            }
            TextView textView4 = this.tvDirectorInfo;
            if (textView4 != null) {
                textView4.setText("N/A");
            }
            LinearLayout linearLayout6 = this.llCastBox;
            if (linearLayout6 != null && this.llCastBoxInfo != null) {
                TextView textView5 = this.tvCastInfo;
            }
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
            LinearLayout linearLayout7 = this.llCastBoxInfo;
            if (linearLayout7 != null) {
                linearLayout7.setVisibility(0);
            }
            TextView textView6 = this.tvReadMore;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            TextView textView7 = this.tvCastInfo;
            if (textView7 != null) {
                textView7.setText("N/A");
            }
            RatingBar ratingBar = this.ratingBar;
            TextView textView8 = this.tvMovieInfo;
            if (textView8 != null) {
                textView8.setVisibility(8);
            }
            LinearLayout linearLayout8 = this.llGenreBox;
            if (linearLayout8 != null && this.llGenreBoxInfo != null) {
                TextView textView9 = this.tv_genre_info;
            }
            if (linearLayout8 != null) {
                linearLayout8.setVisibility(0);
            }
            LinearLayout linearLayout9 = this.llGenreBoxInfo;
            if (linearLayout9 != null) {
                linearLayout9.setVisibility(0);
            }
            TextView textView10 = this.tv_genre_info;
            if (textView10 != null) {
                textView10.setText("N/A");
            }
            LinearLayout linearLayout10 = this.llDurationBox;
            if (linearLayout10 == null || this.llDurationBoxInfo == null || this.tvMovieDurationInfo == null) {
                if (linearLayout10 != null) {
                    linearLayout10.setVisibility(0);
                }
                LinearLayout linearLayout11 = this.llDurationBoxInfo;
                if (linearLayout11 != null) {
                    linearLayout11.setVisibility(0);
                }
                TextView textView11 = this.tvMovieDurationInfo;
                if (textView11 != null) {
                    textView11.setText("N/A");
                    return;
                }
                return;
            }
            linearLayout10.setVisibility(0);
            this.llDurationBoxInfo.setVisibility(0);
            float f2 = 0;
            int i2 = (int) (f2 / 3600.0f);
            try {
                int iRound = Math.round((f2 % 3600.0f) / 60.0f);
                if (i2 == 0) {
                    this.tvMovieDurationInfo.setText(iRound + "m");
                } else {
                    this.tvMovieDurationInfo.setText(i2 + "h " + iRound + "m");
                }
            } catch (Exception unused) {
                this.tvMovieDurationInfo.setText(0);
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab A[PHI: r4
  0x00ab: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:21:0x00a9, B:16:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ViewDetailsActivity.U0(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public void V0() {
        ProgressBar progressBar;
        int iRound;
        int iS;
        int iRound2;
        int iS2;
        ArrayList<c.h.a.i.f> arrayListV = this.P.v(this.y);
        if (arrayListV == null || arrayListV.size() <= 0) {
            progressBar = this.pb_button_recent_watch;
            if (progressBar == null) {
                return;
            }
        } else {
            TextView textView = this.tvPlay;
            if (textView == null) {
                return;
            }
            textView.setText(getResources().getString(R.string.resume));
            String strValueOf = String.valueOf(arrayListV.get(0).O());
            String strValueOf2 = String.valueOf(arrayListV.get(0).N());
            if (this.pb_button_recent_watch == null) {
                return;
            }
            try {
                iS2 = c.h.a.h.n.e.S(strValueOf);
                iRound = Math.round(iS2 / 1000.0f);
            } catch (Exception unused) {
                iRound = 0;
            }
            try {
                this.U = iS2;
                iS = c.h.a.h.n.e.S(strValueOf2);
            } catch (Exception unused2) {
                iS = 0;
            }
            try {
                iRound2 = Math.round((iRound / iS) * 100.0f);
            } catch (Exception unused3) {
                iRound2 = 0;
            }
            if (iRound2 != 0) {
                this.pb_button_recent_watch.setProgress(iRound2);
                this.pb_button_recent_watch.setVisibility(0);
                return;
            } else {
                if (this.pb_button_recent_watch.getVisibility() != 0) {
                    return;
                }
                this.pb_button_recent_watch.setProgress(iRound2);
                progressBar = this.pb_button_recent_watch;
            }
        }
        progressBar.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01cb A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0217 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021b A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0222 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0229 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0230 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0275 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0279 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02aa A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ae A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b5 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bc A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0320 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0327 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0181 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0185 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018c A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0193 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c0 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c4 A[Catch: Exception -> 0x037a, TryCatch #1 {Exception -> 0x037a, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:9:0x0016, B:11:0x001c, B:16:0x0074, B:17:0x0079, B:20:0x0087, B:22:0x008d, B:24:0x00a6, B:25:0x00b8, B:27:0x00c4, B:29:0x00d2, B:31:0x00de, B:33:0x00e4, B:35:0x00e8, B:36:0x00eb, B:38:0x00ef, B:51:0x010e, B:54:0x0120, B:56:0x0126, B:58:0x014a, B:60:0x014e, B:62:0x0152, B:63:0x0155, B:66:0x015b, B:68:0x015f, B:71:0x0165, B:73:0x016b, B:75:0x0171, B:85:0x0196, B:87:0x019a, B:89:0x019e, B:92:0x01a4, B:94:0x01aa, B:96:0x01b0, B:106:0x01d5, B:108:0x01da, B:110:0x01de, B:113:0x01e4, B:115:0x01ea, B:120:0x0201, B:134:0x0233, B:137:0x0239, B:139:0x023f, B:141:0x0245, B:142:0x024a, B:144:0x0257, B:145:0x025d, B:148:0x0263, B:150:0x0269, B:152:0x026f, B:156:0x027c, B:158:0x0280, B:160:0x0284, B:163:0x028a, B:165:0x0290, B:169:0x02a4, B:179:0x02bf, B:181:0x02c3, B:183:0x02c7, B:185:0x02cb, B:193:0x0318, B:195:0x0320, B:196:0x0323, B:198:0x0327, B:199:0x032a, B:201:0x032e, B:170:0x02aa, B:172:0x02ae, B:173:0x02b1, B:175:0x02b5, B:176:0x02b8, B:178:0x02bc, B:153:0x0275, B:155:0x0279, B:121:0x020c, B:122:0x0217, B:124:0x021b, B:125:0x021e, B:127:0x0222, B:128:0x0225, B:130:0x0229, B:131:0x022c, B:133:0x0230, B:97:0x01c0, B:99:0x01c4, B:100:0x01c7, B:102:0x01cb, B:103:0x01ce, B:105:0x01d2, B:76:0x0181, B:78:0x0185, B:79:0x0188, B:81:0x018c, B:82:0x018f, B:84:0x0193, B:57:0x0142, B:39:0x00f3, B:41:0x00f7, B:42:0x00fa, B:44:0x00fe, B:45:0x0102, B:47:0x0106, B:48:0x0109, B:202:0x0332, B:204:0x0336, B:206:0x033a, B:207:0x033d, B:209:0x0341, B:210:0x0344, B:212:0x0348, B:213:0x034b, B:215:0x034f, B:216:0x0352, B:218:0x0356, B:219:0x0359, B:221:0x035d, B:222:0x0360, B:224:0x0364, B:225:0x0367, B:227:0x036b, B:228:0x036e, B:230:0x0372, B:231:0x0375, B:187:0x02dd, B:190:0x02e5, B:191:0x02fb), top: B:238:0x0000, inners: #0, #2 }] */
    @Override // c.h.a.k.f.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Y(minefarts.iptvsmarters.model.callback.VodInfoCallback r14) {
        /*
            Method dump skipped, instruction units count: 891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ViewDetailsActivity.Y(minefarts.iptvsmarters.model.callback.VodInfoCallback):void");
    }

    @Override // c.h.a.k.f.b
    public void a() {
    }

    @Override // c.h.a.k.f.b
    public void b() {
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
        try {
            ProgressDialog progressDialog = this.f26916k;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f26916k.dismiss();
            Toast.makeText(this, this.f26915j.getResources().getString(R.string.something_wrong), 1).show();
        } catch (Exception unused) {
        }
    }

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0042 A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #0 {Exception -> 0x0049, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:8:0x0042), top: B:12:0x0002 }] */
    @Override // c.h.a.k.f.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j0(minefarts.iptvsmarters.model.callback.TMDBCastsCallback r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L42
            java.util.List r0 = r6.a()     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L42
            java.util.List r0 = r6.a()     // Catch: java.lang.Exception -> L49
            int r0 = r0.size()     // Catch: java.lang.Exception -> L49
            if (r0 <= 0) goto L42
            androidx.recyclerview.widget.RecyclerView r0 = r5.rvCast     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch: java.lang.Exception -> L49
            r2 = 0
            r1.<init>(r5, r2, r2)     // Catch: java.lang.Exception -> L49
            r0.setLayoutManager(r1)     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.RecyclerView r0 = r5.rvCast     // Catch: java.lang.Exception -> L49
            a.y.e.c r1 = new a.y.e.c     // Catch: java.lang.Exception -> L49
            r1.<init>()     // Catch: java.lang.Exception -> L49
            r0.setItemAnimator(r1)     // Catch: java.lang.Exception -> L49
            minefarts.iptvsmarters.view.adapter.CastAdapter r0 = new minefarts.iptvsmarters.view.adapter.CastAdapter     // Catch: java.lang.Exception -> L49
            java.util.List r6 = r6.a()     // Catch: java.lang.Exception -> L49
            android.content.Context r1 = r5.f26915j     // Catch: java.lang.Exception -> L49
            r3 = 1
            java.lang.String r4 = r5.V     // Catch: java.lang.Exception -> L49
            r0.<init>(r6, r1, r3, r4)     // Catch: java.lang.Exception -> L49
            r5.Q = r0     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.RecyclerView r6 = r5.rvCast     // Catch: java.lang.Exception -> L49
            r6.setAdapter(r0)     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.RecyclerView r6 = r5.rvCast     // Catch: java.lang.Exception -> L49
            r6.setVisibility(r2)     // Catch: java.lang.Exception -> L49
            goto L49
        L42:
            androidx.recyclerview.widget.RecyclerView r6 = r5.rvCast     // Catch: java.lang.Exception -> L49
            r0 = 8
            r6.setVisibility(r0)     // Catch: java.lang.Exception -> L49
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ViewDetailsActivity.j0(minefarts.iptvsmarters.model.callback.TMDBCastsCallback):void");
    }

    @Override // c.h.a.k.f.i
    public void k0(TMDBTrailerCallback tMDBTrailerCallback) {
        if (tMDBTrailerCallback != null) {
            try {
                if (tMDBTrailerCallback.a() == null || tMDBTrailerCallback.a().size() <= 0) {
                    return;
                }
                for (int i2 = 0; i2 < tMDBTrailerCallback.a().size(); i2++) {
                    if (tMDBTrailerCallback.a().get(i2).b().equals("Trailer")) {
                        this.J = tMDBTrailerCallback.a().get(i2).a();
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
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
        this.f26915j = this;
        super.onCreate(bundle);
        P0();
        if (new c.h.a.k.d.a.a(this.f26915j).A().equals(c.h.a.h.n.a.s0)) {
            this.R = "tv";
            i2 = R.layout.activity_view_details_tv;
        } else {
            this.R = "mobile";
            i2 = R.layout.activity_view_details;
        }
        setContentView(i2);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        this.T = true;
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.dashboard_background));
        }
        M0();
        this.f26914i = new Date();
        TextView textView = this.tvPlay;
        if (textView != null) {
            textView.setOnFocusChangeListener(new r(textView));
        }
        f26909d = O0(this.f26915j);
        Locale locale = Locale.US;
        this.E = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        TextView textView2 = this.tvReadMore;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new r(textView2));
        }
        this.f26912g = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        f26910e = getApplicationContext().getPackageName();
        TextView textView3 = this.tvWatchTrailer;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new r(textView3));
        }
        this.f26911f = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        this.f26913h = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        getWindow().setFlags(1024, 1024);
        v0((Toolbar) findViewById(R.id.toolbar));
        Q0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_text_icon);
        this.I = menu;
        this.H = menu.getItem(1).getSubMenu().findItem(R.id.empty);
        if (c.h.a.i.q.m.f(this.f26915j).equals("api")) {
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

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 82) {
            return super.onKeyUp(i2, keyEvent);
        }
        Menu menu = this.I;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.H = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout && (context = this.f26915j) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new o()).g(getResources().getString(R.string.no), new n()).n();
        }
        if (itemId == R.id.menu_load_channels_vod) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f26915j.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f26915j.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f26915j.getResources().getString(R.string.yes), new p());
            aVar.g(this.f26915j.getResources().getString(R.string.no), new q());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f26915j.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f26915j.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f26915j.getResources().getString(R.string.yes), new a());
            aVar2.g(this.f26915j.getResources().getString(R.string.no), new b());
            aVar2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        P0();
        super.onResume();
        c.h.a.h.n.e.g(this.f26915j);
        if (!this.T) {
            V0();
        }
        this.T = false;
        getWindow().setFlags(1024, 1024);
    }

    @OnClick
    public void onViewClicked(View view) {
        String str;
        String str2;
        switch (view.getId()) {
            case R.id.iv_movie_image /* 2131428166 */:
            case R.id.tv_play /* 2131429490 */:
                SharedPreferences sharedPreferences = this.f26915j.getSharedPreferences("selectedPlayer", 0);
                this.f26918m = sharedPreferences;
                String strK = BuildConfig.FLAVOR;
                String string = sharedPreferences.getString("selectedPlayer", BuildConfig.FLAVOR);
                SimpleDateFormat simpleDateFormat = this.f26913h;
                if (N0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.f26915j))), this.E.format(this.f26914i)) >= c.h.a.k.d.c.a.d.p() && (str = this.f26911f) != null && this.f26912g != null && (!f26909d.equals(str) || (this.f26911f != null && (str2 = this.f26912g) != null && !f26910e.equals(str2)))) {
                    this.K = Boolean.FALSE;
                }
                if (this.K.booleanValue()) {
                    try {
                        if (this.R.equals("mobile")) {
                            try {
                                this.M = c.f.a.c.d.u.b.e(this.f26915j).c().c();
                                break;
                            } catch (Exception unused) {
                            }
                        }
                        c.f.a.c.d.u.d dVar = this.M;
                        if (dVar == null || !dVar.c()) {
                            new ArrayList();
                            ArrayList arrayList = new ArrayList();
                            j0 j0Var = new j0(this, view);
                            j0Var.c().inflate(R.menu.menu_players_hp, j0Var.b());
                            ArrayList<ExternalPlayerModelClass> arrayListL = new c.h.a.i.q.d(this.f26915j).l();
                            if (arrayListL != null) {
                                try {
                                    if (arrayListL.size() > 0) {
                                        j0Var.b().add(0, 0, 0, this.f26915j.getResources().getString(R.string.nav_play));
                                        ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                                        externalPlayerModelClass.e(0);
                                        externalPlayerModelClass.d(this.f26915j.getResources().getString(R.string.play_with));
                                        arrayList.add(externalPlayerModelClass);
                                        int i2 = 0;
                                        while (i2 < arrayListL.size()) {
                                            int i3 = i2 + 1;
                                            j0Var.b().add(0, i3, 0, this.f26915j.getResources().getString(R.string.play_with) + " " + arrayListL.get(i2).a());
                                            arrayList.add(arrayListL.get(i2));
                                            i2 = i3;
                                        }
                                        j0Var.f(new f(arrayList, string));
                                        j0Var.e(new g());
                                        j0Var.g();
                                    }
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                            c.h.a.h.n.e.W(this.f26915j, string, this.y, this.v, this.w, this.x, this.t, BuildConfig.FLAVOR, this.S);
                            break;
                        } else {
                            String strT = c.h.a.h.n.e.t(c.h.a.h.n.e.F(this.f26915j, this.y, this.w, "movie"));
                            c.f.a.c.d.u.d dVar2 = this.M;
                            if (dVar2 != null && dVar2.p() != null && this.M.p().j() != null && this.M.p().j().K() != null) {
                                strK = this.M.p().j().K();
                            }
                            if (!strK.equals(strT)) {
                                c.h.a.h.m.a.c(this.U, true, c.h.a.h.m.a.a(this.t, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, strT, "videos/mp4", this.N, BuildConfig.FLAVOR, null), this.M, this.f26915j);
                            } else {
                                this.f26915j.startActivity(new Intent(this.f26915j, (Class<?>) ExpandedControlsActivity.class));
                            }
                        }
                    } catch (Exception unused3) {
                        c.h.a.h.n.e.W(this.f26915j, string, this.y, this.v, this.w, this.x, this.t, BuildConfig.FLAVOR, this.S);
                    }
                }
                break;
            case R.id.tv_readmore /* 2131429513 */:
                T0(this);
                break;
            case R.id.tv_watch_trailer /* 2131429573 */:
                String str3 = this.J;
                if (str3 == null || str3.isEmpty()) {
                    R0(this);
                } else {
                    startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", this.J));
                }
                break;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        P0();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[Catch: Exception -> 0x0156, TryCatch #1 {Exception -> 0x0156, blocks: (B:4:0x0005, B:6:0x000b, B:9:0x0018, B:11:0x0022, B:12:0x004d, B:14:0x005d, B:16:0x0061, B:18:0x0065, B:20:0x006b, B:24:0x0080, B:44:0x00b1, B:70:0x0141, B:72:0x0145, B:73:0x0148, B:75:0x014c, B:76:0x014f, B:78:0x0153, B:25:0x0086, B:27:0x008a, B:28:0x008d, B:30:0x0091, B:31:0x0094, B:33:0x0098, B:34:0x009c, B:36:0x00a0, B:37:0x00a3, B:39:0x00a7, B:40:0x00aa, B:46:0x00b7, B:48:0x00ce, B:50:0x00d2, B:52:0x00d6, B:60:0x0127, B:62:0x012f, B:63:0x0132, B:65:0x0136, B:66:0x0139, B:68:0x013d), top: B:84:0x0005, inners: #2 }] */
    @Override // c.h.a.k.f.i
    @android.annotation.SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(minefarts.iptvsmarters.model.callback.TMDBGenreCallback r8) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ViewDetailsActivity.s(minefarts.iptvsmarters.model.callback.TMDBGenreCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0019, B:11:0x0021, B:13:0x0027, B:14:0x0048, B:16:0x0058, B:18:0x005c, B:20:0x0060, B:22:0x0066, B:27:0x007d, B:66:0x00e6, B:68:0x00ec, B:70:0x00f6, B:73:0x00fd, B:75:0x0103, B:77:0x0115, B:78:0x0120, B:79:0x0123, B:81:0x0127, B:83:0x012b, B:86:0x0131, B:88:0x0137, B:90:0x013f, B:91:0x014f, B:93:0x0153, B:94:0x0156, B:96:0x015a, B:97:0x015d, B:99:0x0161, B:100:0x0165, B:102:0x0169, B:103:0x016c, B:105:0x0170, B:106:0x0173, B:109:0x0178, B:111:0x017c, B:112:0x017f, B:114:0x0183, B:115:0x0186, B:28:0x0088, B:29:0x0093, B:31:0x0097, B:32:0x009a, B:34:0x009e, B:35:0x00a1, B:37:0x00a5, B:38:0x00a8, B:40:0x00ac, B:41:0x00b0, B:43:0x00b4, B:44:0x00b7, B:46:0x00bb, B:47:0x00be, B:49:0x00c2, B:50:0x00c5, B:53:0x00ca, B:55:0x00ce, B:56:0x00d1, B:58:0x00d5, B:59:0x00d8, B:61:0x00dc, B:62:0x00df), top: B:120:0x0009 }] */
    @Override // c.h.a.k.f.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(minefarts.iptvsmarters.model.callback.TMDBCastsCallback r9) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ViewDetailsActivity.x(minefarts.iptvsmarters.model.callback.TMDBCastsCallback):void");
    }
}
