package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
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
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBTVShowsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesDetailM3UActivity extends a.b.k.c implements View.OnClickListener, c.h.a.k.f.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f26503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f26504e;
    public c.h.a.i.q.f A;
    public c.h.a.i.q.a M;
    public PopupWindow N;
    public Button O;
    public String P;
    public String Q;
    public TextView R;
    public TextView S;
    public TextView T;
    public MenuItem U;
    public Menu V;
    public Button W;
    public c.h.a.j.f Y;
    public String Z;

    @BindView
    public AppBarLayout appbarToolbar;
    public SimpleDateFormat f0;
    public DateFormat g0;
    public Date h0;
    public String i0;

    @BindView
    public ImageView ivFavourite;

    @BindView
    public ImageView ivMovieImage;

    @BindView
    public LinearLayout llCastBox;

    @BindView
    public LinearLayout llCastBoxInfo;

    @BindView
    public LinearLayout llDetailLeftSide;

    @BindView
    public LinearLayout llDetailProgressBar;

    @BindView
    public LinearLayout llDetailRightSide;

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
    public ImageView logo;

    @BindView
    public RatingBar ratingBar;

    @BindView
    public RelativeLayout rlAccountInfo;

    @BindView
    public RelativeLayout rlTransparent;

    @BindView
    public ScrollView scrollView;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvAccountInfo;

    @BindView
    public TextView tvAddToFav;

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
    public TextView tvReadMoreGenre;

    @BindView
    public TextView tvReleaseDate;

    @BindView
    public TextView tvReleaseDateInfo;

    @BindView
    public TextView tvWatchTrailer;

    @BindView
    public TextView tv_genre_info;

    @BindView
    public TextView tvdetailbackbutton;

    @BindView
    public ProgressBar tvdetailprogressbar;
    public ImageView v;
    public Context w;
    public ProgressDialog x;
    public SharedPreferences y;
    public SharedPreferences z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26505f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26506g = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26507h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26508i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26509j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26510k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f26511l = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f26512m = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f26513n = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f26514o = BuildConfig.FLAVOR;
    public String p = BuildConfig.FLAVOR;
    public String q = BuildConfig.FLAVOR;
    public String r = BuildConfig.FLAVOR;
    public String s = BuildConfig.FLAVOR;
    public String t = BuildConfig.FLAVOR;
    public String u = BuildConfig.FLAVOR;
    public c.h.a.i.q.b B = new c.h.a.i.q.b();
    public c.h.a.i.q.b C = new c.h.a.i.q.b();
    public String D = BuildConfig.FLAVOR;
    public String E = BuildConfig.FLAVOR;
    public String F = BuildConfig.FLAVOR;
    public String G = BuildConfig.FLAVOR;
    public String H = BuildConfig.FLAVOR;
    public String I = BuildConfig.FLAVOR;
    public String J = BuildConfig.FLAVOR;
    public int K = -1;
    public String L = BuildConfig.FLAVOR;
    public String X = BuildConfig.FLAVOR;
    public Boolean j0 = Boolean.TRUE;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailM3UActivity.this.N.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailM3UActivity.this.N.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailM3UActivity.this.N.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesDetailM3UActivity.this.N.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(SeriesDetailM3UActivity.this.w);
        }
    }

    public class f extends c.d.a.r.h.g<Bitmap> {
        public f() {
        }

        @Override // c.d.a.r.h.j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, c.d.a.r.g.c cVar) {
            SeriesDetailM3UActivity.this.appbarToolbar.setBackground(new BitmapDrawable(bitmap));
            SeriesDetailM3UActivity seriesDetailM3UActivity = SeriesDetailM3UActivity.this;
            seriesDetailM3UActivity.rlTransparent.setBackgroundColor(seriesDetailM3UActivity.getResources().getColor(R.color.trasparent_black));
            SeriesDetailM3UActivity seriesDetailM3UActivity2 = SeriesDetailM3UActivity.this;
            seriesDetailM3UActivity2.toolbar.setBackgroundColor(seriesDetailM3UActivity2.getResources().getColor(R.color.trasparent_black));
        }
    }

    public class g extends c.d.a.r.h.g<Bitmap> {
        public g() {
        }

        @Override // c.d.a.r.h.j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, c.d.a.r.g.c cVar) {
            SeriesDetailM3UActivity.this.ivMovieImage.setBackground(new BitmapDrawable(bitmap));
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(SeriesDetailM3UActivity.this.w);
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(SeriesDetailM3UActivity.this.w);
        }
    }

    public class k implements DialogInterface.OnClickListener {
        public k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class l implements DialogInterface.OnClickListener {
        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class n implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26528b;

        public n(View view) {
            this.f26528b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26528b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26528b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            int i2;
            if (!z) {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                a(f2);
                b(f2);
                boolean zEquals = this.f26528b.getTag().equals("1");
                i2 = R.drawable.black_button_dark;
                if (!zEquals && !this.f26528b.getTag().equals("2") && !this.f26528b.getTag().equals("3") && !this.f26528b.getTag().equals("5")) {
                    if (this.f26528b.getTag() == null || !this.f26528b.getTag().equals("8")) {
                        return;
                    }
                    SeriesDetailM3UActivity.this.W.setBackgroundResource(i2);
                }
                this.f26528b.setBackgroundResource(i2);
                return;
            }
            f2 = z ? 1.05f : 1.0f;
            Log.e("id is", BuildConfig.FLAVOR + this.f26528b.getTag());
            boolean zEquals2 = this.f26528b.getTag().equals("1");
            i2 = R.drawable.back_btn_effect;
            if (zEquals2) {
                a(f2);
                b(f2);
                this.f26528b.setBackgroundResource(i2);
                return;
            }
            if (this.f26528b.getTag().equals("2")) {
                a(f2);
                b(f2);
                this.f26528b.setBackgroundResource(R.drawable.logout_btn_effect);
                return;
            }
            if (this.f26528b.getTag().equals("3") || this.f26528b.getTag().equals("5")) {
                a(f2);
                b(f2);
                this.f26528b.setBackgroundResource(R.drawable.blue_btn_effect);
                return;
            }
            View view2 = this.f26528b;
            if (view2 == null || view2.getTag() == null || !this.f26528b.getTag().equals("8")) {
                a(1.15f);
                b(1.15f);
            } else {
                a(f2);
                b(f2);
                SeriesDetailM3UActivity.this.W.setBackgroundResource(i2);
            }
        }
    }

    public static long C0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String D0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    public final void A0() {
        c.h.a.i.c cVar = new c.h.a.i.c();
        cVar.h(this.u);
        cVar.i(c.h.a.i.q.m.z(this.w));
        cVar.g(this.f26505f);
        cVar.e(this.f26512m);
        this.A.Q(cVar);
        this.tvAddToFav.setText(getResources().getString(R.string.remove_from_favourite));
        this.ivFavourite.setVisibility(0);
    }

    public final void B0() {
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

    public final void E0() {
        this.w = this;
        this.M = new c.h.a.i.q.a(this.w);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.y = sharedPreferences;
        String string = sharedPreferences.getString("username", BuildConfig.FLAVOR);
        String string2 = this.y.getString("password", BuildConfig.FLAVOR);
        if (string == null || string2 == null || string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else {
            J0(this.w, string, string2);
        }
    }

    public final void F0(SeriesDetailM3UActivity seriesDetailM3UActivity) {
        View viewInflate = ((LayoutInflater) seriesDetailM3UActivity.getSystemService("layout_inflater")).inflate(R.layout.layout_movie_trailer, (RelativeLayout) seriesDetailM3UActivity.findViewById(R.id.rl_password_verification));
        PopupWindow popupWindow = new PopupWindow(seriesDetailM3UActivity);
        this.N = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.N.setWidth(-1);
        this.N.setHeight(-1);
        this.N.setFocusable(true);
        this.N.setBackgroundDrawable(new BitmapDrawable());
        this.N.showAtLocation(viewInflate, 17, 0, 0);
        this.W = (Button) viewInflate.findViewById(R.id.bt_save_password);
        TextView textView = (TextView) viewInflate.findViewById(R.id.et_password);
        this.O = (Button) viewInflate.findViewById(R.id.bt_close);
        textView.setText("Series trailer is not available");
        Button button = this.W;
        if (button != null) {
            button.setOnFocusChangeListener(new n(button));
        }
        Button button2 = this.O;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new n(button2));
        }
        this.O.setOnClickListener(new c());
        this.W.setOnClickListener(new d());
    }

    public final void G0() {
        this.A.I0(this.u, c.h.a.i.q.m.z(this.w));
        this.tvAddToFav.setText(getResources().getString(R.string.add_to_favourite));
        this.ivFavourite.setVisibility(4);
    }

    public final void H0(SeriesDetailM3UActivity seriesDetailM3UActivity) {
        View viewInflate = ((LayoutInflater) seriesDetailM3UActivity.getSystemService("layout_inflater")).inflate(R.layout.layout_cast_details, (RelativeLayout) seriesDetailM3UActivity.findViewById(R.id.rl_password_verification));
        this.R = (TextView) viewInflate.findViewById(R.id.tv_casts_info_popup);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_parental_password);
        this.T = textView;
        textView.setText(getResources().getString(R.string.plot_without_col));
        this.R.setText(this.P);
        PopupWindow popupWindow = new PopupWindow(seriesDetailM3UActivity);
        this.N = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.N.setWidth(-1);
        this.N.setHeight(-1);
        this.N.setFocusable(true);
        this.N.showAtLocation(viewInflate, 17, 0, 0);
        Button button = (Button) viewInflate.findViewById(R.id.bt_close);
        this.O = button;
        if (button != null) {
            button.setOnFocusChangeListener(new n(button));
        }
        this.O.setOnClickListener(new a());
    }

    public final void I0(SeriesDetailM3UActivity seriesDetailM3UActivity) {
        View viewInflate = ((LayoutInflater) seriesDetailM3UActivity.getSystemService("layout_inflater")).inflate(R.layout.layout_genre_details, (RelativeLayout) seriesDetailM3UActivity.findViewById(R.id.rl_password_verification));
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_genre_info_popup);
        this.S = textView;
        textView.setText(this.Q);
        PopupWindow popupWindow = new PopupWindow(seriesDetailM3UActivity);
        this.N = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.N.setWidth(-1);
        this.N.setHeight(-1);
        this.N.setFocusable(true);
        this.N.showAtLocation(viewInflate, 17, 0, 0);
        Button button = (Button) viewInflate.findViewById(R.id.bt_close);
        this.O = button;
        if (button != null) {
            button.setOnFocusChangeListener(new n(button));
        }
        this.O.setOnClickListener(new b());
    }

    public final void J0(Context context, String str, String str2) {
        ImageView imageView;
        TextView textView;
        String str3;
        this.Y = new c.h.a.j.f(this, context);
        int i2 = 0;
        this.scrollView.setVisibility(0);
        Intent intent = getIntent();
        if (intent != null) {
            this.f26505f = intent.getStringExtra("episode_name");
            this.s = intent.getStringExtra("series_name");
            this.t = intent.getStringExtra("series_icon");
            this.u = intent.getStringExtra("episode_url");
            this.J = intent.getStringExtra("series_num");
            this.f26512m = intent.getStringExtra("series_categoryId");
            if (this.A.U(this.u, c.h.a.i.q.m.z(context)).size() > 0) {
                this.tvAddToFav.setText(getResources().getString(R.string.remove_from_favourite));
                imageView = this.ivFavourite;
            } else {
                this.tvAddToFav.setText(getResources().getString(R.string.add_to_favourite));
                imageView = this.ivFavourite;
                i2 = 4;
            }
            imageView.setVisibility(i2);
            if (context != null && (str3 = this.t) != null && !str3.isEmpty()) {
                c.d.a.g.u(context).q(this.t).J().m(new g());
            }
            if (this.F != null && (textView = this.tvMovieName) != null) {
                textView.setText(this.f26505f);
            }
            this.Y.d(this.s);
        }
    }

    @Override // c.h.a.k.f.j
    public void M(SearchTMDBTVShowsCallback searchTMDBTVShowsCallback) {
        TextView textView;
        StringBuilder sb;
        String str;
        if (searchTMDBTVShowsCallback != null && searchTMDBTVShowsCallback.b() != null) {
            if (searchTMDBTVShowsCallback.b().equals(1) && searchTMDBTVShowsCallback.a() != null && searchTMDBTVShowsCallback.a().get(0) != null) {
                int iIntValue = searchTMDBTVShowsCallback.a().get(0).c().intValue();
                this.Y.c(iIntValue);
                this.Y.e(iIntValue);
                String strB = searchTMDBTVShowsCallback.a().get(0).b();
                Double dG = searchTMDBTVShowsCallback.a().get(0).g();
                this.f26506g = searchTMDBTVShowsCallback.a().get(0).f();
                String strA = searchTMDBTVShowsCallback.a().get(0).a();
                if (new c.h.a.k.d.a.a(this.w).A().equals(c.h.a.h.n.a.s0)) {
                    sb = new StringBuilder();
                    str = "https://image.tmdb.org/t/p/w1280/";
                } else {
                    sb = new StringBuilder();
                    str = "https://image.tmdb.org/t/p/w500/";
                }
                sb.append(str);
                sb.append(strA);
                String string = sb.toString();
                if (this.appbarToolbar != null && strA != null) {
                    c.d.a.g.u(getApplicationContext()).q(string).J().m(new f());
                }
                if (this.llReleasedBox == null || this.llReleasedBoxInfo == null || this.tvReleaseDateInfo == null || strB == null || strB.isEmpty() || strB.equals("n/A")) {
                    LinearLayout linearLayout = this.llReleasedBox;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    LinearLayout linearLayout2 = this.llReleasedBoxInfo;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                    TextView textView2 = this.tvReleaseDateInfo;
                    if (textView2 != null) {
                        textView2.setText("N/A");
                    }
                } else {
                    this.llReleasedBox.setVisibility(0);
                    this.llReleasedBoxInfo.setVisibility(0);
                    this.tvReleaseDateInfo.setText(strB);
                }
                if (this.ratingBar != null && dG != null && !dG.equals("n/A")) {
                    this.ratingBar.setVisibility(0);
                    try {
                        this.ratingBar.setRating(Float.parseFloat(String.valueOf(dG)) / 2.0f);
                    } catch (NumberFormatException unused) {
                        this.ratingBar.setRating(0.0f);
                    }
                }
                String str2 = this.f26506g;
                this.P = str2;
                if (this.llCastBox != null && this.llCastBoxInfo != null && this.tvCastInfo != null && str2 != null && !str2.isEmpty()) {
                    this.llCastBox.setVisibility(0);
                    this.llCastBoxInfo.setVisibility(0);
                    boolean z = this.f26506g.length() > 150;
                    TextView textView3 = this.tvCastInfo;
                    if (z) {
                        textView3.setText(this.f26506g);
                        this.tvReadMore.setVisibility(0);
                        return;
                    } else {
                        textView3.setText(this.f26506g);
                        this.tvReadMore.setVisibility(8);
                        return;
                    }
                }
                LinearLayout linearLayout3 = this.llCastBox;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                LinearLayout linearLayout4 = this.llCastBoxInfo;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                TextView textView4 = this.tvReadMore;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                TextView textView5 = this.tvCastInfo;
                if (textView5 != null) {
                    textView5.setText("N/A");
                    return;
                }
                return;
            }
        }
        String str3 = this.f26505f;
        if (str3 != null && (textView = this.tvMovieName) != null) {
            textView.setText(str3);
        }
        TextView textView6 = this.tvMovieDurationInfo;
        if (textView6 != null) {
            textView6.setText("N/A");
        }
        TextView textView7 = this.tvCastInfo;
        if (textView7 != null) {
            textView7.setText("N/A");
        }
        TextView textView8 = this.tvDirectorInfo;
        if (textView8 != null) {
            textView8.setText("N/A");
        }
        TextView textView9 = this.tvReleaseDateInfo;
        if (textView9 != null) {
            textView9.setText("N/A");
        }
        TextView textView10 = this.tvReadMoreGenre;
        if (textView10 != null) {
            textView10.setVisibility(8);
        }
        TextView textView11 = this.tv_genre_info;
        if (textView11 != null) {
            textView11.setText("N/A");
        }
        TextView textView12 = this.tvReadMore;
        if (textView12 != null) {
            textView12.setVisibility(8);
        }
        this.llDetailProgressBar.setVisibility(8);
        this.llDetailRightSide.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0093 A[PHI: r2
  0x0093: PHI (r2v3 android.widget.TextView) = (r2v2 android.widget.TextView), (r2v12 android.widget.TextView) binds: [B:37:0x0091, B:28:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0155 A[PHI: r7
  0x0155: PHI (r7v5 android.widget.TextView) = (r7v4 android.widget.TextView), (r7v14 android.widget.TextView) binds: [B:86:0x0153, B:74:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c.h.a.k.f.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void T(com.nst.iptvsmarterstvbox.model.callback.TMDBTVShowsInfoCallback r7) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesDetailM3UActivity.T(com.nst.iptvsmarterstvbox.model.callback.TMDBTVShowsInfoCallback):void");
    }

    @Override // c.h.a.k.f.b
    public void a() {
    }

    @Override // c.h.a.k.f.j
    public void a0(TMDBTrailerCallback tMDBTrailerCallback) {
        if (tMDBTrailerCallback == null || tMDBTrailerCallback.a() == null || tMDBTrailerCallback.a().size() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < tMDBTrailerCallback.a().size(); i2++) {
            if (tMDBTrailerCallback.a().get(i2).b().equals("Trailer")) {
                this.f26514o = tMDBTrailerCallback.a().get(i2).a();
                TextView textView = this.tvWatchTrailer;
                if (textView != null) {
                    textView.setVisibility(0);
                    return;
                }
                return;
            }
        }
    }

    @Override // c.h.a.k.f.b
    public void b() {
        ProgressDialog progressDialog = this.x;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
        this.llDetailProgressBar.setVisibility(8);
        this.llDetailRightSide.setVisibility(0);
    }

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // c.h.a.k.f.j
    public void f0(TMDBCastsCallback tMDBCastsCallback) {
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
        setContentView(R.layout.activity_series_detail_m3u);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        this.w = this;
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.dashboard_background));
        }
        TextView textView = this.tvPlay;
        if (textView != null) {
            textView.setOnFocusChangeListener(new n(textView));
            this.tvPlay.requestFocus();
            this.tvPlay.setFocusable(true);
        }
        TextView textView2 = this.tvAddToFav;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new n(textView2));
        }
        TextView textView3 = this.tvdetailbackbutton;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new n(textView3));
        }
        TextView textView4 = this.tvReadMore;
        if (textView4 != null) {
            textView4.setOnFocusChangeListener(new n(textView4));
        }
        TextView textView5 = this.tvReadMoreGenre;
        if (textView5 != null) {
            textView5.setOnFocusChangeListener(new n(textView5));
        }
        TextView textView6 = this.tvWatchTrailer;
        if (textView6 != null) {
            textView6.setOnFocusChangeListener(new n(textView6));
        }
        this.Z = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        Locale locale = Locale.US;
        this.f0 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.h0 = new Date();
        this.g0 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        f26503d = getApplicationContext().getPackageName();
        this.i0 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        f26504e = D0(this.w);
        getWindow().setFlags(1024, 1024);
        v0((Toolbar) findViewById(R.id.toolbar));
        B0();
        c.h.a.i.q.m.N("m3u", this.w);
        this.A = new c.h.a.i.q.f(this.w);
        this.logo.setOnClickListener(new e());
        E0();
        SharedPreferences sharedPreferences = this.w.getSharedPreferences("selectedPlayer", 0);
        this.z = sharedPreferences;
        this.G = sharedPreferences.getString("selectedPlayer", BuildConfig.FLAVOR);
        ImageView imageView = this.v;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_text_icon);
        this.V = menu;
        this.U = menu.getItem(1).getSubMenu().findItem(R.id.empty);
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
        Menu menu = this.V;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.U = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout && (context = this.w) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new i()).g(getResources().getString(R.string.no), new h()).n();
        }
        if (itemId == R.id.menu_load_channels_vod) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.w.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.w.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.w.getResources().getString(R.string.yes), new j());
            aVar.g(this.w.getResources().getString(R.string.no), new k());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.w.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.w.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.w.getResources().getString(R.string.yes), new l());
            aVar2.g(this.w.getResources().getString(R.string.no), new m());
            aVar2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        c.h.a.h.n.e.g(this.w);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.y = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.y.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.w != null) {
            b();
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        String str;
        String str2;
        switch (view.getId()) {
            case R.id.tv_add_to_fav /* 2131429285 */:
                if (this.A.U(this.u, c.h.a.i.q.m.z(this.w)).size() <= 0) {
                    A0();
                } else {
                    G0();
                }
                break;
            case R.id.tv_detail_back_btn /* 2131429351 */:
            case R.id.tv_watch_trailer /* 2131429573 */:
                String str3 = this.f26514o;
                if (str3 == null || str3.isEmpty()) {
                    F0(this);
                } else {
                    startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", this.f26514o));
                }
                break;
            case R.id.tv_play /* 2131429490 */:
                SharedPreferences sharedPreferences = this.w.getSharedPreferences("selectedPlayer", 0);
                this.z = sharedPreferences;
                String string = sharedPreferences.getString("selectedPlayer", BuildConfig.FLAVOR);
                SimpleDateFormat simpleDateFormat = this.f0;
                if (C0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.w))), this.g0.format(this.h0)) >= c.h.a.k.d.c.a.d.p() && (str = this.Z) != null && this.i0 != null && (!f26504e.equals(str) || (this.Z != null && (str2 = this.i0) != null && !f26503d.equals(str2)))) {
                    this.j0 = Boolean.FALSE;
                }
                if (this.j0.booleanValue()) {
                    try {
                        c.h.a.h.n.e.V(this.w, string, 0, "series", BuildConfig.FLAVOR, this.J, this.f26505f, null, this.u);
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case R.id.tv_readmore /* 2131429513 */:
                H0(this);
                break;
            case R.id.tv_readmore_genre /* 2131429514 */:
                I0(this);
                break;
        }
    }
}
