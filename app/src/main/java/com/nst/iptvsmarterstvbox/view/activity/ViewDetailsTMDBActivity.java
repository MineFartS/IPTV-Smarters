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
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
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
public class ViewDetailsTMDBActivity extends a.b.k.c implements View.OnClickListener, c.h.a.k.f.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f26980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f26981e;
    public c.h.a.i.q.a J;
    public PopupWindow K;
    public c.h.a.j.e N;
    public CastAdapter Q;
    public c.f.a.c.d.u.d S;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SimpleDateFormat f26984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Date f26985i;

    @BindView
    public ImageView ivFavourite;

    @BindView
    public ImageView ivMovieImage;

    @BindView
    public ImageView iv_back_button;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f26986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26987k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DateFormat f26988l;

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
    public String f26989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f26990n;

    @BindView
    public NestedScrollView nestedScrollView;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MenuItem f26991o;
    public Menu p;
    public Button q;

    @BindView
    public RatingBar ratingBar;

    @BindView
    public RelativeLayout rlAccountInfo;

    @BindView
    public RelativeLayout rlTransparent;

    @BindView
    public RecyclerView rvCast;
    public ProgressDialog s;

    @BindView
    public ScrollView scrollView;
    public SharedPreferences t;

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
    public SharedPreferences u;
    public c.h.a.i.q.f v;
    public Context r = this;
    public c.h.a.i.q.b w = new c.h.a.i.q.b();
    public c.h.a.i.q.b x = new c.h.a.i.q.b();
    public String y = BuildConfig.FLAVOR;
    public String z = BuildConfig.FLAVOR;
    public String A = BuildConfig.FLAVOR;
    public String B = BuildConfig.FLAVOR;
    public String C = BuildConfig.FLAVOR;
    public String D = BuildConfig.FLAVOR;
    public String E = BuildConfig.FLAVOR;
    public String F = BuildConfig.FLAVOR;
    public String G = BuildConfig.FLAVOR;
    public int H = -1;
    public String I = BuildConfig.FLAVOR;
    public String L = BuildConfig.FLAVOR;
    public Boolean M = Boolean.TRUE;
    public String O = "mobile";
    public String P = BuildConfig.FLAVOR;
    public String R = BuildConfig.FLAVOR;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
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

    public class d extends c.d.a.r.h.g<Bitmap> {
        public d() {
        }

        @Override // c.d.a.r.h.j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, c.d.a.r.g.c cVar) {
            ViewDetailsTMDBActivity.this.appbarToolbar.setBackground(new BitmapDrawable(bitmap));
            ViewDetailsTMDBActivity viewDetailsTMDBActivity = ViewDetailsTMDBActivity.this;
            viewDetailsTMDBActivity.rlTransparent.setBackgroundColor(viewDetailsTMDBActivity.getResources().getColor(R.color.trasparent_black));
            ViewDetailsTMDBActivity viewDetailsTMDBActivity2 = ViewDetailsTMDBActivity.this;
            viewDetailsTMDBActivity2.toolbar.setBackgroundColor(viewDetailsTMDBActivity2.getResources().getColor(R.color.trasparent_black));
        }
    }

    public class e extends c.d.a.r.h.g<Bitmap> {
        public e() {
        }

        @Override // c.d.a.r.h.j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, c.d.a.r.g.c cVar) {
            ViewDetailsTMDBActivity.this.appbarToolbar.setBackground(new BitmapDrawable(bitmap));
            ViewDetailsTMDBActivity viewDetailsTMDBActivity = ViewDetailsTMDBActivity.this;
            viewDetailsTMDBActivity.rlTransparent.setBackgroundColor(viewDetailsTMDBActivity.getResources().getColor(R.color.trasparent_black));
            ViewDetailsTMDBActivity viewDetailsTMDBActivity2 = ViewDetailsTMDBActivity.this;
            viewDetailsTMDBActivity2.toolbar.setBackgroundColor(viewDetailsTMDBActivity2.getResources().getColor(R.color.trasparent_black));
        }
    }

    public class f implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f26997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f26998b;

        public f(ArrayList arrayList, String str) {
            this.f26997a = arrayList;
            this.f26998b = str;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            ArrayList arrayList;
            try {
                if (ViewDetailsTMDBActivity.this.M.booleanValue() && (arrayList = this.f26997a) != null && arrayList.size() > 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < this.f26997a.size()) {
                            if (menuItem.getItemId() != i2) {
                                i2++;
                            } else if (menuItem.getItemId() == 0) {
                                c.h.a.h.n.e.W(ViewDetailsTMDBActivity.this.r, this.f26998b, ViewDetailsTMDBActivity.this.H, ViewDetailsTMDBActivity.this.D, ViewDetailsTMDBActivity.this.E, ViewDetailsTMDBActivity.this.F, ViewDetailsTMDBActivity.this.A, ViewDetailsTMDBActivity.this.G, 0);
                            } else {
                                Intent intent = new Intent(ViewDetailsTMDBActivity.this.r, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", ViewDetailsTMDBActivity.this.G);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f26997a.get(i2)).a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f26997a.get(i2)).b());
                                ViewDetailsTMDBActivity.this.r.startActivity(intent);
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
            ViewDetailsTMDBActivity.this.K.dismiss();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsTMDBActivity.this.K.dismiss();
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsTMDBActivity.this.K.dismiss();
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(ViewDetailsTMDBActivity.this.r);
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsTMDBActivity.this.onBackPressed();
        }
    }

    public class m implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f27006b;

        public m(Context context) {
            this.f27006b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ViewDetailsTMDBActivity.this.v.U(ViewDetailsTMDBActivity.this.G, c.h.a.i.q.m.z(this.f27006b)).size() > 0) {
                ViewDetailsTMDBActivity.this.R0();
            } else {
                ViewDetailsTMDBActivity.this.K0();
            }
        }
    }

    public class n extends c.d.a.r.h.g<Bitmap> {
        public n() {
        }

        @Override // c.d.a.r.h.j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, c.d.a.r.g.c cVar) {
            ViewDetailsTMDBActivity.this.ivMovieImage.setBackground(new BitmapDrawable(bitmap));
        }
    }

    public class o implements DialogInterface.OnClickListener {
        public o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(ViewDetailsTMDBActivity.this.r);
        }
    }

    public class q implements DialogInterface.OnClickListener {
        public q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(ViewDetailsTMDBActivity.this.r);
        }
    }

    public class r implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27012b;

        public r(View view) {
            this.f27012b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27012b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27012b, "scaleY", f2);
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
                Log.e("id is", BuildConfig.FLAVOR + this.f27012b.getTag());
                View view2 = this.f27012b;
                if (view2 == null || view2.getTag() == null) {
                    return;
                }
                boolean zEquals = this.f27012b.getTag().equals("1");
                i2 = R.drawable.blue_btn_effect;
                if (zEquals) {
                    a(f2);
                    b(f2);
                    linearLayout = ViewDetailsTMDBActivity.this.ll_play_button_main_layout;
                } else if (this.f27012b.getTag().equals("2")) {
                    a(f2);
                    b(f2);
                    this.f27012b.setBackgroundResource(R.drawable.blue_btn_effect);
                    return;
                } else {
                    if (!this.f27012b.getTag().equals("5")) {
                        if (!this.f27012b.getTag().equals("8")) {
                            a(1.15f);
                            b(1.15f);
                            return;
                        } else {
                            a(f2);
                            b(f2);
                            ViewDetailsTMDBActivity.this.q.setBackgroundResource(R.drawable.back_btn_effect);
                            return;
                        }
                    }
                    a(f2);
                    b(f2);
                    linearLayout = ViewDetailsTMDBActivity.this.ll_watch_trailer_button_main_layout;
                }
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                a(f2);
                b(f2);
                View view3 = this.f27012b;
                if (view3 == null || view3.getTag() == null) {
                    return;
                }
                boolean zEquals2 = this.f27012b.getTag().equals("1");
                i2 = R.drawable.rounded_edge_2;
                if (!zEquals2) {
                    if (this.f27012b.getTag().equals("3")) {
                        this.f27012b.setBackgroundResource(R.drawable.black_button_dark);
                        return;
                    }
                    if (!this.f27012b.getTag().equals("5")) {
                        if (this.f27012b.getTag() == null || !this.f27012b.getTag().equals("8")) {
                            return;
                        }
                        ViewDetailsTMDBActivity.this.q.setBackgroundResource(R.drawable.black_button_dark);
                        return;
                    }
                    linearLayout = ViewDetailsTMDBActivity.this.ll_watch_trailer_button_main_layout;
                }
                linearLayout = ViewDetailsTMDBActivity.this.ll_play_button_main_layout;
            }
            linearLayout.setBackgroundResource(i2);
        }
    }

    public static long M0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String N0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // c.h.a.k.f.i
    public void A(TMDBPersonInfoCallback tMDBPersonInfoCallback) {
    }

    public final void K0() {
        c.h.a.i.c cVar = new c.h.a.i.c();
        cVar.h(this.G);
        cVar.i(c.h.a.i.q.m.z(this.r));
        cVar.g(this.A);
        cVar.e(this.I);
        this.v.Q(cVar);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 21) {
            this.ivFavourite.setImageResource(R.drawable.fav_heart_red);
        }
        if (i2 >= 21) {
            this.ivFavourite.setImageDrawable(this.r.getResources().getDrawable(R.drawable.fav_heart_red, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // c.h.a.k.f.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L(minefarts.iptvsmarters.model.callback.SearchTMDBMoviesCallback r14) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ViewDetailsTMDBActivity.L(minefarts.iptvsmarters.model.callback.SearchTMDBMoviesCallback):void");
    }

    public final void L0() {
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
    public void O0() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public final void P0() {
        this.v = new c.h.a.i.q.f(this.r);
        this.J = new c.h.a.i.q.a(this.r);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.t = sharedPreferences;
        String string = sharedPreferences.getString("username", BuildConfig.FLAVOR);
        String string2 = this.t.getString("password", BuildConfig.FLAVOR);
        if (string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        } else {
            T0(this.r, string, string2);
        }
        this.logo.setOnClickListener(new k());
        this.iv_back_button.setOnClickListener(new l());
    }

    public final void Q0(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
        View viewInflate = ((LayoutInflater) viewDetailsTMDBActivity.getSystemService("layout_inflater")).inflate(R.layout.layout_movie_trailer, (RelativeLayout) viewDetailsTMDBActivity.findViewById(R.id.rl_password_verification));
        PopupWindow popupWindow = new PopupWindow(viewDetailsTMDBActivity);
        this.K = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.K.setWidth(-1);
        this.K.setHeight(-1);
        this.K.setFocusable(true);
        this.K.setBackgroundDrawable(new BitmapDrawable());
        this.K.showAtLocation(viewInflate, 17, 0, 0);
        this.q = (Button) viewInflate.findViewById(R.id.bt_save_password);
        this.f26986j = (Button) viewInflate.findViewById(R.id.bt_close);
        Button button = this.q;
        if (button != null) {
            button.setOnFocusChangeListener(new r(button));
        }
        Button button2 = this.f26986j;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new r(button2));
        }
        this.f26986j.setOnClickListener(new h());
        this.q.setOnClickListener(new i());
    }

    public final void R0() {
        this.v.I0(this.G, c.h.a.i.q.m.z(this.r));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 21) {
            this.ivFavourite.setImageResource(R.drawable.fav_heart_white);
        }
        if (i2 >= 21) {
            this.ivFavourite.setImageDrawable(this.r.getResources().getDrawable(R.drawable.fav_heart_white, null));
        }
    }

    public final void S0(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
        View viewInflate = ((LayoutInflater) viewDetailsTMDBActivity.getSystemService("layout_inflater")).inflate(R.layout.layout_cast_details, (RelativeLayout) viewDetailsTMDBActivity.findViewById(R.id.rl_password_verification));
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_casts_info_popup);
        this.f26990n = textView;
        textView.setText(this.f26987k);
        PopupWindow popupWindow = new PopupWindow(viewDetailsTMDBActivity);
        this.K = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.K.setWidth(-1);
        this.K.setHeight(-1);
        this.K.setFocusable(true);
        this.K.showAtLocation(viewInflate, 17, 0, 0);
        Button button = (Button) viewInflate.findViewById(R.id.bt_close);
        this.f26986j = button;
        if (button != null) {
            button.setOnFocusChangeListener(new r(button));
        }
        this.f26986j.setOnClickListener(new j());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3 A[PHI: r2
  0x00a3: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:21:0x00a1, B:16:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T0(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ViewDetailsTMDBActivity.T0(android.content.Context, java.lang.String, java.lang.String):void");
    }

    @Override // c.h.a.k.f.b
    public void a() {
    }

    @Override // c.h.a.k.f.b
    public void b() {
        ProgressDialog progressDialog = this.s;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
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
            android.content.Context r1 = r5.r     // Catch: java.lang.Exception -> L49
            r3 = 1
            java.lang.String r4 = r5.R     // Catch: java.lang.Exception -> L49
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
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ViewDetailsTMDBActivity.j0(minefarts.iptvsmarters.model.callback.TMDBCastsCallback):void");
    }

    @Override // c.h.a.k.f.i
    public void k0(TMDBTrailerCallback tMDBTrailerCallback) {
        LinearLayout linearLayout;
        if (tMDBTrailerCallback == null || tMDBTrailerCallback.a() == null || tMDBTrailerCallback.a().size() <= 0) {
            return;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < tMDBTrailerCallback.a().size(); i3++) {
            if (tMDBTrailerCallback.a().get(i3).b().equals("Trailer")) {
                String strA = tMDBTrailerCallback.a().get(i3).a();
                this.L = strA;
                if (strA == null || strA.isEmpty()) {
                    TextView textView = this.tvWatchTrailer;
                    i2 = 8;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    linearLayout = this.ll_watch_trailer;
                    if (linearLayout == null) {
                        return;
                    }
                } else {
                    TextView textView2 = this.tvWatchTrailer;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    linearLayout = this.ll_watch_trailer;
                    if (linearLayout == null) {
                        return;
                    }
                }
                linearLayout.setVisibility(i2);
                return;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
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
        super.onCreate(bundle);
        O0();
        setContentView(R.layout.activity_view_details);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.dashboard_background));
        }
        this.O = new c.h.a.k.d.a.a(this.r).A().equals(c.h.a.h.n.a.s0) ? "tv" : "mobile";
        L0();
        this.f26985i = new Date();
        TextView textView = this.tvPlay;
        if (textView != null) {
            textView.setOnFocusChangeListener(new r(textView));
            this.tvPlay.requestFocus();
            this.tvPlay.setFocusable(true);
        }
        f26980d = N0(this.r);
        Locale locale = Locale.US;
        this.f26988l = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        TextView textView2 = this.tvReadMore;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new r(textView2));
        }
        this.f26983g = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        f26981e = getApplicationContext().getPackageName();
        TextView textView3 = this.tvWatchTrailer;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new r(textView3));
        }
        this.f26982f = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        this.f26984h = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        getWindow().setFlags(1024, 1024);
        v0((Toolbar) findViewById(R.id.toolbar));
        P0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_text_icon);
        this.p = menu;
        this.f26991o = menu.getItem(1).getSubMenu().findItem(R.id.empty);
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
        Menu menu = this.p;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f26991o = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout && (context = this.r) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new p()).g(getResources().getString(R.string.no), new o()).n();
        }
        if (itemId == R.id.menu_load_channels_vod) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.r.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.r.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.r.getResources().getString(R.string.yes), new q());
            aVar.g(this.r.getResources().getString(R.string.no), new a());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.r.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.r.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.r.getResources().getString(R.string.yes), new b());
            aVar2.g(this.r.getResources().getString(R.string.no), new c());
            aVar2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        O0();
        super.onResume();
        c.h.a.h.n.e.g(this.r);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.t = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.t.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.r != null) {
            b();
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        String str;
        String str2;
        switch (view.getId()) {
            case R.id.iv_movie_image /* 2131428166 */:
            case R.id.tv_play /* 2131429490 */:
                SharedPreferences sharedPreferences = this.r.getSharedPreferences("selectedPlayer", 0);
                this.u = sharedPreferences;
                String strK = BuildConfig.FLAVOR;
                String string = sharedPreferences.getString("selectedPlayer", BuildConfig.FLAVOR);
                SimpleDateFormat simpleDateFormat = this.f26984h;
                if (M0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.r))), this.f26988l.format(this.f26985i)) >= c.h.a.k.d.c.a.d.p() && (str = this.f26982f) != null && this.f26983g != null && (!f26980d.equals(str) || (this.f26982f != null && (str2 = this.f26983g) != null && !f26981e.equals(str2)))) {
                    this.M = Boolean.FALSE;
                }
                if (this.M.booleanValue()) {
                    try {
                        c.f.a.c.d.u.d dVarC = c.f.a.c.d.u.b.e(this.r).c().c();
                        this.S = dVarC;
                        if (dVarC == null || !dVarC.c()) {
                            new ArrayList();
                            ArrayList arrayList = new ArrayList();
                            j0 j0Var = new j0(this, view);
                            j0Var.c().inflate(R.menu.menu_players_hp, j0Var.b());
                            ArrayList<ExternalPlayerModelClass> arrayListL = new c.h.a.i.q.d(this.r).l();
                            if (arrayListL != null) {
                                try {
                                    if (arrayListL.size() > 0) {
                                        j0Var.b().add(0, 0, 0, this.r.getResources().getString(R.string.nav_play));
                                        ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                                        externalPlayerModelClass.e(0);
                                        externalPlayerModelClass.d(this.r.getResources().getString(R.string.play_with));
                                        arrayList.add(externalPlayerModelClass);
                                        int i2 = 0;
                                        while (i2 < arrayListL.size()) {
                                            int i3 = i2 + 1;
                                            j0Var.b().add(0, i3, 0, this.r.getResources().getString(R.string.play_with) + " " + arrayListL.get(i2).a());
                                            arrayList.add(arrayListL.get(i2));
                                            i2 = i3;
                                        }
                                        j0Var.f(new f(arrayList, string));
                                        j0Var.e(new g());
                                        j0Var.g();
                                    }
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            if (this.M.booleanValue()) {
                                c.h.a.h.n.e.W(this.r, string, this.H, this.D, this.E, this.F, this.A, this.G, 0);
                            }
                            break;
                        } else {
                            c.f.a.c.d.u.d dVar = this.S;
                            if (dVar != null && dVar.p() != null && this.S.p().j() != null && this.S.p().j().K() != null) {
                                strK = this.S.p().j().K();
                            }
                            if (!strK.contains(this.G)) {
                                c.h.a.h.m.a.c(0, true, c.h.a.h.m.a.a(this.A, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, this.G, "videos/mp4", this.C, BuildConfig.FLAVOR, null), this.S, this.r);
                            } else {
                                this.r.startActivity(new Intent(this.r, (Class<?>) ExpandedControlsActivity.class));
                            }
                        }
                    } catch (Exception unused2) {
                        if (this.M.booleanValue()) {
                            c.h.a.h.n.e.W(this.r, string, this.H, this.D, this.E, this.F, this.A, this.G, 0);
                        }
                        return;
                    }
                }
                break;
            case R.id.tv_readmore /* 2131429513 */:
                S0(this);
                break;
            case R.id.tv_watch_trailer /* 2131429573 */:
                String str3 = this.L;
                if (str3 == null || str3.isEmpty()) {
                    Q0(this);
                } else {
                    startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", this.L));
                }
                break;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        O0();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[PHI: r3
  0x00ac: PHI (r3v3 android.widget.TextView) = (r3v2 android.widget.TextView), (r3v22 android.widget.TextView) binds: [B:41:0x00aa, B:32:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c.h.a.k.f.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(minefarts.iptvsmarters.model.callback.TMDBGenreCallback r8) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ViewDetailsTMDBActivity.s(minefarts.iptvsmarters.model.callback.TMDBGenreCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0 A[PHI: r1
  0x00e0: PHI (r1v2 android.widget.TextView) = (r1v1 android.widget.TextView), (r1v9 android.widget.TextView), (r1v10 android.widget.TextView) binds: [B:63:0x00de, B:51:0x00c4, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c.h.a.k.f.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(minefarts.iptvsmarters.model.callback.TMDBCastsCallback r9) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ViewDetailsTMDBActivity.x(minefarts.iptvsmarters.model.callback.TMDBCastsCallback):void");
    }
}
