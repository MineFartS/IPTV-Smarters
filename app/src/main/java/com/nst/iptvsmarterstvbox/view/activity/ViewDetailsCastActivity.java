package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.i.q.m;
import c.k.b.c0;
import c.k.b.t;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBMoviesCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBGenreCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBPersonInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import com.nst.iptvsmarterstvbox.view.adapter.PersonImagesAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ViewDetailsCastActivity extends a.b.k.c implements View.OnClickListener, c.h.a.k.f.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f26956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f26957e;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SimpleDateFormat f26960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Date f26961i;

    @BindView
    public ImageView ivMovieImage;

    @BindView
    public ImageView iv_back_button;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ProgressDialog f26963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f26964l;

    @BindView
    public LinearLayout llDODBoxInfo;

    @BindView
    public LinearLayout llDetailLeftSide;

    @BindView
    public LinearLayout llDetailProgressBar;

    @BindView
    public LinearLayout llDetailRightSide;

    @BindView
    public LinearLayout llDobBox;

    @BindView
    public LinearLayout llDobBoxInfo;

    @BindView
    public LinearLayout llDodBox;

    @BindView
    public LinearLayout llGenderBox;

    @BindView
    public LinearLayout llGenderBoxInfo;

    @BindView
    public LinearLayout llKnownForBox;

    @BindView
    public LinearLayout llKnownForBoxInfo;

    @BindView
    public LinearLayout llPersonInfoBox;

    @BindView
    public LinearLayout llPobBox;

    @BindView
    public LinearLayout llPobBoxInfo;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DateFormat f26967o;
    public MenuItem p;
    public Menu q;

    @BindView
    public RelativeLayout rlAccountInfo;

    @BindView
    public RelativeLayout rlTransparent;

    @BindView
    public RecyclerView rvCast;
    public c.h.a.j.e s;

    @BindView
    public ScrollView scrollView;
    public PersonImagesAdapter t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvCastDesc;

    @BindView
    public TextView tvCastName;

    @BindView
    public TextView tvDODInfo;

    @BindView
    public TextView tvDateOfBirth;

    @BindView
    public TextView tvGender;

    @BindView
    public TextView tvKnownFor;

    @BindView
    public TextView tvPlaceOfBirth;

    @BindView
    public ProgressBar tvdetailprogressbar;
    public String u;
    public String v;
    public String w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f26962j = this;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f26965m = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f26966n = BuildConfig.FLAVOR;
    public Boolean r = Boolean.TRUE;
    public String x = BuildConfig.FLAVOR;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(ViewDetailsCastActivity.this.f26962j);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewDetailsCastActivity.this.onBackPressed();
        }
    }

    public class d implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f26971a;

        public d(Context context) {
            this.f26971a = context;
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
            ViewDetailsCastActivity.this.appbarToolbar.setBackground(new BitmapDrawable(this.f26971a.getResources(), bitmap));
            ViewDetailsCastActivity viewDetailsCastActivity = ViewDetailsCastActivity.this;
            viewDetailsCastActivity.rlTransparent.setBackgroundColor(viewDetailsCastActivity.getResources().getColor(R.color.trasparent_black_2));
            ViewDetailsCastActivity viewDetailsCastActivity2 = ViewDetailsCastActivity.this;
            viewDetailsCastActivity2.toolbar.setBackgroundColor(viewDetailsCastActivity2.getResources().getColor(R.color.trasparent_black_2));
        }
    }

    public class e extends c.d.a.r.h.g<Bitmap> {
        public e() {
        }

        @Override // c.d.a.r.h.j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, c.d.a.r.g.c cVar) {
            ViewDetailsCastActivity.this.ivMovieImage.setBackground(new BitmapDrawable(bitmap));
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(ViewDetailsCastActivity.this.f26962j);
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(ViewDetailsCastActivity.this.f26962j);
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public static String A0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // c.h.a.k.f.i
    public void A(TMDBPersonInfoCallback tMDBPersonInfoCallback) {
        TextView textView;
        TextView textView2;
        String str;
        this.tvdetailprogressbar.setVisibility(8);
        if (tMDBPersonInfoCallback != null) {
            String strG = tMDBPersonInfoCallback.g() != null ? tMDBPersonInfoCallback.g() : "N/A";
            if (tMDBPersonInfoCallback.i() != null) {
                tMDBPersonInfoCallback.i();
            }
            String strB = tMDBPersonInfoCallback.b() != null ? tMDBPersonInfoCallback.b() : "N/A";
            String strH = tMDBPersonInfoCallback.h() != null ? tMDBPersonInfoCallback.h() : "N/A";
            String strC = tMDBPersonInfoCallback.c() != null ? tMDBPersonInfoCallback.c() : "N/A";
            int iIntValue = tMDBPersonInfoCallback.d() != null ? tMDBPersonInfoCallback.d().intValue() : 5;
            String strF = tMDBPersonInfoCallback.f() != null ? tMDBPersonInfoCallback.f() : "N/A";
            String strA = tMDBPersonInfoCallback.a() != null ? tMDBPersonInfoCallback.a() : "N/A";
            if (tMDBPersonInfoCallback.e() != null && tMDBPersonInfoCallback.e().a() != null && tMDBPersonInfoCallback.e().a().size() > 0) {
                this.rvCast.setLayoutManager(new LinearLayoutManager(this, 0, false));
                this.rvCast.setItemAnimator(new a.y.e.c());
                PersonImagesAdapter personImagesAdapter = new PersonImagesAdapter(tMDBPersonInfoCallback.e().a(), this.f26962j, true);
                this.t = personImagesAdapter;
                this.rvCast.setAdapter(personImagesAdapter);
            }
            TextView textView3 = this.tvCastName;
            if (textView3 != null) {
                textView3.setText(strG);
            }
            if (this.llPobBox == null || this.llPobBoxInfo == null || this.tvPlaceOfBirth == null || strH == null || strH.isEmpty() || strH.equals("N/A")) {
                LinearLayout linearLayout = this.llPobBox;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.llPobBoxInfo;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                TextView textView4 = this.tvPlaceOfBirth;
                if (textView4 != null) {
                    textView4.setText("N/A");
                }
            } else {
                this.llPobBox.setVisibility(0);
                this.llPobBoxInfo.setVisibility(0);
                this.tvPlaceOfBirth.setText(strH);
            }
            if (this.tvDateOfBirth == null || this.llDobBoxInfo == null || this.llDobBox == null || strB == null || strB.isEmpty() || strB.equals("N/A")) {
                LinearLayout linearLayout3 = this.llDobBox;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                LinearLayout linearLayout4 = this.llDobBoxInfo;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                TextView textView5 = this.tvDateOfBirth;
                if (textView5 != null) {
                    textView5.setText("N/A");
                }
            } else {
                this.llDobBox.setVisibility(0);
                this.llDobBoxInfo.setVisibility(0);
                this.tvDateOfBirth.setText(strB);
            }
            LinearLayout linearLayout5 = this.llGenderBox;
            if (linearLayout5 == null || this.llGenderBoxInfo == null || this.tvGender == null || iIntValue == 5) {
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(0);
                }
                LinearLayout linearLayout6 = this.llGenderBoxInfo;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
                textView = this.tvGender;
                if (textView != null) {
                    textView.setText("N/A");
                }
            } else {
                linearLayout5.setVisibility(0);
                this.llGenderBoxInfo.setVisibility(0);
                if (iIntValue == 1) {
                    textView2 = this.tvGender;
                    str = "Female";
                } else if (iIntValue == 2) {
                    textView2 = this.tvGender;
                    str = "Male";
                } else {
                    textView = this.tvGender;
                    textView.setText("N/A");
                }
                textView2.setText(str);
            }
            LinearLayout linearLayout7 = this.llKnownForBox;
            if (linearLayout7 == null || this.llKnownForBoxInfo == null || this.tvKnownFor == null) {
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(0);
                }
                LinearLayout linearLayout8 = this.llKnownForBoxInfo;
                if (linearLayout8 != null) {
                    linearLayout8.setVisibility(0);
                }
                TextView textView6 = this.tvKnownFor;
                if (textView6 != null) {
                    textView6.setText("N/A");
                }
            } else {
                linearLayout7.setVisibility(0);
                this.llKnownForBoxInfo.setVisibility(0);
                TextView textView7 = this.tvKnownFor;
                if (textView7 != null) {
                    textView7.setText(strF);
                }
            }
            if (this.tvCastDesc == null || strA == null || strA.isEmpty() || strA.equals("N/A")) {
                TextView textView8 = this.tvCastDesc;
                if (textView8 != null) {
                    textView8.setVisibility(8);
                }
            } else {
                this.tvCastDesc.setText(strA);
            }
            if (this.llDodBox != null && this.llDODBoxInfo != null && this.tvDODInfo != null && strC != null && !strC.equals("N/A") && !strC.isEmpty()) {
                this.llDodBox.setVisibility(0);
                this.llDODBoxInfo.setVisibility(0);
                this.tvDODInfo.setText(strC);
                return;
            }
            LinearLayout linearLayout9 = this.llDodBox;
            if (linearLayout9 != null) {
                linearLayout9.setVisibility(8);
            }
            LinearLayout linearLayout10 = this.llDODBoxInfo;
            if (linearLayout10 != null) {
                linearLayout10.setVisibility(8);
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    public void B0() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public final void C0() {
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26964l = sharedPreferences;
        String string = sharedPreferences.getString("username", BuildConfig.FLAVOR);
        String string2 = this.f26964l.getString("password", BuildConfig.FLAVOR);
        if (string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        } else {
            D0(this.f26962j, string, string2);
        }
        this.logo.setOnClickListener(new b());
        this.iv_back_button.setOnClickListener(new c());
    }

    public final void D0(Context context, String str, String str2) {
        String str3;
        this.s = new c.h.a.j.e(this, context);
        Intent intent = getIntent();
        if (intent != null) {
            this.u = intent.getStringExtra("castID");
            this.v = intent.getStringExtra("castName");
            this.w = intent.getStringExtra("profilePath");
            String stringExtra = intent.getStringExtra("streamBackdrop");
            this.x = stringExtra;
            if (stringExtra != null && !stringExtra.equals(BuildConfig.FLAVOR) && context != null) {
                t.q(context).l(this.x).i(new d(context));
            }
            String str4 = this.u;
            if (str4 == null || str4.equals("0")) {
                return;
            }
            TextView textView = this.tvCastName;
            if (textView != null) {
                textView.setText(this.v);
            }
            if (context != null) {
                try {
                    if (this.ivMovieImage != null && (str3 = this.w) != null && !str3.isEmpty()) {
                        c.d.a.g.u(getApplicationContext()).q("https://image.tmdb.org/t/p/w500/" + this.w).J().m(new e());
                    }
                } catch (Exception unused) {
                }
            }
            this.s.f(this.u);
        }
    }

    @Override // c.h.a.k.f.i
    public void L(SearchTMDBMoviesCallback searchTMDBMoviesCallback) {
    }

    @Override // c.h.a.k.f.b
    public void a() {
    }

    @Override // c.h.a.k.f.b
    public void b() {
        ProgressDialog progressDialog = this.f26963k;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
        this.tvdetailprogressbar.setVisibility(8);
    }

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // c.h.a.k.f.i
    public void j0(TMDBCastsCallback tMDBCastsCallback) {
    }

    @Override // c.h.a.k.f.i
    public void k0(TMDBTrailerCallback tMDBTrailerCallback) {
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
        this.f26962j = this;
        super.onCreate(bundle);
        B0();
        setContentView(new c.h.a.k.d.a.a(this.f26962j).A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_view_cast_details_tv : R.layout.activity_view_cast_details);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        z0();
        this.f26961i = new Date();
        f26956d = A0(this.f26962j);
        Locale locale = Locale.US;
        this.f26967o = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f26959g = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        f26957e = getApplicationContext().getPackageName();
        this.f26958f = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        this.f26960h = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        getWindow().setFlags(1024, 1024);
        v0((Toolbar) findViewById(R.id.toolbar));
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.dashboard_background));
        }
        C0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_text_icon);
        this.q = menu;
        this.p = menu.getItem(1).getSubMenu().findItem(R.id.empty);
        if (m.f(this.f26962j).equals("api")) {
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
        Menu menu = this.q;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.p = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout && (context = this.f26962j) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new g()).g(getResources().getString(R.string.no), new f()).n();
        }
        if (itemId == R.id.menu_load_channels_vod) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f26962j.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f26962j.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f26962j.getResources().getString(R.string.yes), new h());
            aVar.g(this.f26962j.getResources().getString(R.string.no), new i());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f26962j.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f26962j.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f26962j.getResources().getString(R.string.yes), new j());
            aVar2.g(this.f26962j.getResources().getString(R.string.no), new a());
            aVar2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        c.h.a.h.n.e.g(this.f26962j);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26964l = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26964l.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f26962j != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        B0();
    }

    @Override // c.h.a.k.f.i
    public void s(TMDBGenreCallback tMDBGenreCallback) {
    }

    @Override // c.h.a.k.f.i
    public void x(TMDBCastsCallback tMDBCastsCallback) {
    }

    public final void z0() {
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
}
