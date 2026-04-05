package com.nst.iptvsmarterstvbox.view.utility.epg;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import c.f.b.b.d0;
import c.h.a.i.q.m;
import c.k.b.c0;
import c.k.b.t;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDateTime;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class EPG extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f29863b = 3600000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f29864c = 14400000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f29865d = 7200000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f29866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f29867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CookieManager f29868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f29869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f29870i;
    public int A;
    public int A0;
    public final int B;
    public int B0;
    public final int C;
    public int C0;
    public final int D;
    public int D0;
    public final int E;
    public int E0;
    public final int F;
    public int F0;
    public final int G;
    public int G0;
    public final int H;
    public int H0;
    public final int I;
    public boolean I0;
    public final int J;
    public LinearLayout J0;
    public final int K;
    public TextView K0;
    public int L;
    public long L0;
    public final int M;
    public String M0;
    public final int N;
    public int N0;
    public final Bitmap O;
    public int O0;
    public final int P;
    public SharedPreferences P0;
    public final Map<String, Bitmap> Q;
    public boolean Q0;
    public final Map<String, c0> R;
    public Handler R0;
    public c.h.a.k.h.d.a S;
    public Handler S0;
    public int T;
    public SurfaceView T0;
    public int U;
    public int U0;
    public long V;
    public NSTIJKPlayerSmallEPG V0;
    public long W;
    public Activity W0;
    public Boolean X0;
    public int Y0;
    public boolean Z0;
    public int a1;
    public ProgressDialog b1;
    public c.h.a.k.d.a.a c1;
    public Uri d1;
    public boolean e1;
    public long f0;
    public boolean f1;
    public long g0;
    public Boolean g1;
    public boolean h0;
    public Date h1;
    public SharedPreferences i0;
    public DateFormat i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.a f29871j;
    public long j0;
    public SimpleDateFormat j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.f f29872k;
    public c.h.a.k.h.d.b k0;
    public String k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f29873l;
    public c.h.a.k.h.d.c.a l0;
    public String l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SimpleDateFormat f29874m;
    public c.h.a.k.h.d.c.a m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SimpleDateFormat f29875n;
    public c.h.a.k.h.d.c.b n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f29876o;
    public TextView o0;
    public final Rect p;
    public TextView p0;
    public final Rect q;
    public TextView q0;
    public final Rect r;
    public int r0;
    public final Paint s;
    public SharedPreferences s0;
    public final Scroller t;
    public SharedPreferences t0;
    public final GestureDetector u;
    public PopupWindow u0;
    public int v;
    public Context v0;
    public final int w;
    public ProgressBar w0;
    public final int x;
    public int x0;
    public final int y;
    public String y0;
    public int z;
    public String z0;

    public class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29877a;

        public a(String str) {
            this.f29877a = str;
        }

        @Override // c.k.b.c0
        public void a(Drawable drawable) {
            EPG.this.Q.put(this.f29877a, BitmapFactory.decodeResource(EPG.this.getResources(), R.drawable.logo_placeholder_white));
            EPG.this.j0();
            EPG.this.R.remove(this.f29877a);
        }

        @Override // c.k.b.c0
        public void b(Drawable drawable) {
        }

        @Override // c.k.b.c0
        public void c(Bitmap bitmap, t.e eVar) {
            EPG.this.Q.put(this.f29877a, bitmap);
            EPG.this.j0();
            EPG.this.R.remove(this.f29877a);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f29879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f29880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f29881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f29882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f29883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f29884g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f29885h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f29886i;

        public b(String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f29879b = str;
            this.f29880c = i2;
            this.f29881d = str2;
            this.f29882e = str3;
            this.f29883f = str4;
            this.f29884g = str5;
            this.f29885h = str6;
            this.f29886i = str7;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EPG.this.u0.dismiss();
            if (EPG.this.g1.booleanValue()) {
                c.h.a.h.n.e.Y(EPG.this.getContext(), this.f29879b, this.f29880c, "live", this.f29881d, this.f29882e, this.f29883f, this.f29884g, this.f29885h, this.f29886i);
            }
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f29888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f29890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f29891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f29892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f29893g;

        public c(Context context, String str, String str2, String str3, int i2, String str4) {
            this.f29888b = context;
            this.f29889c = str;
            this.f29890d = str2;
            this.f29891e = str3;
            this.f29892f = i2;
            this.f29893g = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m.f(this.f29888b).equals("m3u")) {
                EPG.this.x(this.f29888b, this.f29889c, this.f29890d, this.f29891e);
            } else {
                EPG.this.w(this.f29888b, this.f29889c, this.f29892f, this.f29891e, this.f29893g);
            }
            EPG.this.u0.dismiss();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f29895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f29897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f29898e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f29899f;

        public d(Context context, String str, String str2, String str3, int i2) {
            this.f29895b = context;
            this.f29896c = str;
            this.f29897d = str2;
            this.f29898e = str3;
            this.f29899f = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m.f(this.f29895b).equals("m3u")) {
                EPG.this.l0(this.f29895b, this.f29896c, this.f29897d);
            } else {
                EPG.this.k0(this.f29895b, this.f29898e, this.f29899f, this.f29897d);
            }
            EPG.this.u0.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EPG.this.u0.dismiss();
        }
    }

    public class f extends GestureDetector.SimpleOnGestureListener {
        public f() {
        }

        public /* synthetic */ f(EPG epg, a aVar) {
            this();
        }

        public final void c() {
            if (EPG.this.W0 == null || EPG.this.b1 == null) {
                return;
            }
            EPG.this.b1.dismiss();
        }

        public final void d() {
            if (EPG.this.W0 != null) {
                if (EPG.this.b1 == null || !EPG.this.b1.isShowing()) {
                    EPG.this.b1 = new ProgressDialog(EPG.this.W0);
                    EPG.this.b1.setMessage(EPG.this.W0.getResources().getString(R.string.please_wait));
                    EPG.this.b1.setCanceledOnTouchOutside(false);
                    EPG.this.b1.setCancelable(false);
                    EPG.this.b1.setProgressStyle(0);
                    EPG.this.b1.show();
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            if (!EPG.this.t.isFinished()) {
                EPG.this.t.forceFinished(true);
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            EPG.this.t.fling(EPG.this.getScrollX(), EPG.this.getScrollY(), -((int) f2), -((int) f3), 0, EPG.this.T, 0, EPG.this.U);
            EPG.this.j0();
            if (EPG.this.t.getFinalY() == EPG.this.U && EPG.this.a1 == 1) {
                d();
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            int i2 = (int) f2;
            int i3 = (int) f3;
            int scrollX = EPG.this.getScrollX();
            int scrollY = EPG.this.getScrollY();
            if (scrollX + i2 < 0) {
                i2 = 0 - scrollX;
            }
            if (scrollY + i3 < 0) {
                i3 = 0 - scrollY;
            }
            if (scrollX + i2 > EPG.this.T) {
                i2 = EPG.this.T - scrollX;
            }
            if (scrollY + i3 > EPG.this.U) {
                i3 = EPG.this.U - scrollY;
            }
            EPG.this.scrollBy(i2, i3);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            int iW;
            c.h.a.k.h.d.a aVar;
            c.h.a.k.h.d.c.b bVarA;
            try {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int scrollX = EPG.this.getScrollX() + x;
                int scrollY = EPG.this.getScrollY() + y;
                int iT = EPG.this.T(scrollY);
                if (iT != -1 && EPG.this.S != null) {
                    if (EPG.this.D().contains(scrollX, scrollY)) {
                        EPG.this.S.c();
                    } else if (EPG.this.y().contains(x, y)) {
                        EPG.this.S.c();
                        bVarA = null;
                        Iterator<c.h.a.k.h.d.c.b> it = EPG.this.k0.d(iT).e().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            c.h.a.k.h.d.c.b next = it.next();
                            if (next.h(EPG.this.getTimeShiftMilliSeconds())) {
                                bVarA = next;
                                break;
                            }
                        }
                        if (bVarA != null) {
                            EPG epg = EPG.this;
                            iW = epg.W(iT, epg.X((epg.getScrollX() + x) - EPG.this.C().left));
                            if (iW != -1) {
                                aVar = EPG.this.S;
                                aVar.b(iT, iW, bVarA);
                            }
                        } else {
                            EPG.this.S.a(iT, EPG.this.k0.d(iT));
                        }
                    } else if (EPG.this.C().contains(x, y)) {
                        EPG epg2 = EPG.this;
                        iW = epg2.W(iT, epg2.X((epg2.getScrollX() + x) - EPG.this.C().left));
                        if (iW != -1) {
                            aVar = EPG.this.S;
                            bVarA = EPG.this.k0.a(iT, iW);
                            aVar.b(iT, iW, bVarA);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return true;
        }
    }

    static {
        CookieManager cookieManager = new CookieManager();
        f29868g = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public EPG(Context context, AttributeSet attributeSet) {
        String str;
        String str2;
        this(context, attributeSet, 0);
        this.v0 = context;
        this.R0 = new Handler();
        this.S0 = new Handler();
        this.c1 = new c.h.a.k.d.a.a(context);
        this.P0 = context.getSharedPreferences("loginPrefs", 0);
        this.k1 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        f29869h = context.getApplicationContext().getPackageName();
        f29870i = S(context);
        this.l1 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        Locale locale = Locale.US;
        this.j1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.i1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.h1 = new Date();
        SimpleDateFormat simpleDateFormat = this.j1;
        if (I(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(context))), this.i1.format(this.h1)) < c.h.a.k.d.c.a.d.p() || (str = this.k1) == null || this.l1 == null) {
            return;
        }
        if (f29870i.equals(str) && (this.k1 == null || (str2 = this.l1) == null || f29869h.equals(str2))) {
            return;
        }
        this.g1 = Boolean.FALSE;
    }

    public EPG(Context context, AttributeSet attributeSet, int i2) {
        String str;
        String str2;
        super(context, attributeSet, i2);
        this.f29873l = getClass().getSimpleName();
        this.j0 = 200000L;
        a aVar = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.y0 = BuildConfig.FLAVOR;
        this.A0 = -1;
        this.B0 = 0;
        this.C0 = 1;
        this.D0 = 2;
        this.E0 = 3;
        this.F0 = 4;
        this.G0 = 5;
        this.H0 = 0;
        this.I0 = false;
        this.L0 = 5000L;
        this.N0 = 0;
        this.O0 = 5;
        this.Q0 = false;
        this.U0 = 3;
        Boolean bool = Boolean.FALSE;
        this.X0 = bool;
        this.Y0 = 0;
        this.Z0 = false;
        this.e1 = false;
        this.f1 = false;
        this.g1 = Boolean.TRUE;
        this.v0 = context;
        this.R0 = new Handler();
        this.S0 = new Handler();
        this.c1 = new c.h.a.k.d.a.a(context);
        this.P0 = context.getSharedPreferences("loginPrefs", 0);
        setWillNotDraw(false);
        m0();
        this.v = getResources().getDimensionPixelSize(R.dimen.epg_channel_layout_margin);
        this.A = getResources().getDimensionPixelSize(R.dimen.epg_channel_layout_width);
        this.z = getResources().getDimensionPixelSize(R.dimen.epg_channel_maximum_length);
        this.L = getResources().getDimensionPixelSize(R.dimen.epg_time_bar_text);
        if (this.c1.A().equals(c.h.a.h.n.a.s0)) {
            f29865d = 14400000;
            this.A += 125;
            this.z += 95;
        }
        this.q = new Rect();
        this.p = new Rect();
        this.r = new Rect();
        this.s = new Paint(1);
        this.u = new GestureDetector(context, new f(this, aVar));
        this.Q = d0.e();
        this.R = d0.e();
        this.t = new Scroller(context);
        this.P = getResources().getColor(R.color.epg_background);
        this.w = getResources().getDimensionPixelSize(R.dimen.epg_channel_layout_padding);
        this.x = getResources().getDimensionPixelSize(R.dimen.epg_channel_layout_height);
        this.y = getResources().getDimensionPixelSize(R.dimen.epg_channel_layout_margin_left);
        this.B = getResources().getColor(R.color.epg_event_layout_background);
        this.C = getResources().getColor(R.color.epg_event_layout_background);
        this.D = getResources().getColor(R.color.epg_channel_layout_background);
        this.E = getResources().getColor(R.color.hp_cyan);
        this.F = getResources().getColor(R.color.epg_event_layout_background);
        this.G = getResources().getColor(R.color.epg_event_layout_text);
        this.H = getResources().getDimensionPixelSize(R.dimen.epg_event_layout_text);
        this.K = getResources().getDimensionPixelSize(R.dimen.epg_time_bar_height);
        this.I = getResources().getDimensionPixelSize(R.dimen.epg_time_bar_line_width);
        this.J = getResources().getColor(R.color.hp_cyan);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.epg_reset_button_size);
        this.M = dimensionPixelSize;
        this.N = getResources().getDimensionPixelSize(R.dimen.epg_reset_button_margin);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.outWidth = dimensionPixelSize;
        options.outHeight = dimensionPixelSize;
        this.O = BitmapFactory.decodeResource(getResources(), R.drawable.reset, options);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.outWidth = dimensionPixelSize;
        options2.outHeight = dimensionPixelSize;
        this.k1 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        f29869h = context.getApplicationContext().getPackageName();
        f29870i = S(context);
        this.l1 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        Locale locale = Locale.US;
        this.j1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.i1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.h1 = new Date();
        SimpleDateFormat simpleDateFormat = this.j1;
        if (I(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(context))), this.i1.format(this.h1)) < c.h.a.k.d.c.a.d.p() || (str = this.k1) == null || this.l1 == null) {
            return;
        }
        if (f29870i.equals(str) && (this.k1 == null || (str2 = this.l1) == null || f29869h.equals(str2))) {
            return;
        }
        this.g1 = bool;
    }

    public static long I(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String S(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    private int getChannelAreaWidth() {
        return this.A + this.w + this.v;
    }

    private c.h.a.k.h.d.c.a getFirstChannelData() {
        return this.l0;
    }

    private c.h.a.k.h.d.c.a getFirstLastChannelData() {
        return this.m0;
    }

    private int getFirstVisibleChannelPosition() {
        int scrollY = getScrollY();
        int i2 = this.v;
        int i3 = ((scrollY - i2) - this.K) / (this.x + i2);
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    private int getLastVisibleChannelPosition() {
        int scrollY = getScrollY();
        int iF = this.k0.f();
        int height = scrollY + getHeight();
        int i2 = this.K + height;
        int i3 = this.v;
        int i4 = this.x;
        int i5 = (i2 - i3) / (i3 + i4);
        int i6 = iF - 1;
        if (i5 > i6) {
            i5 = i6;
        }
        return (height <= i4 * i5 || i5 >= i6) ? i5 : i5 + 1;
    }

    private int getProgramAreaWidth() {
        return getWidth() - getChannelAreaWidth();
    }

    private int getXPositionStart() {
        return Z((System.currentTimeMillis() + ((long) getTimeShiftMilliSeconds())) - ((long) (f29865d / 2)));
    }

    public final void A() {
        int iY = Y(this.k0.f() - 1) + this.x;
        this.U = iY < getHeight() ? 0 : iY - getHeight();
    }

    public final long B() {
        return f29865d / ((getResources().getDisplayMetrics().widthPixels - this.A) - this.v);
    }

    public final Rect C() {
        this.r.top = this.K;
        int iF = this.k0.f() * (this.x + this.v);
        Rect rect = this.r;
        if (iF >= getHeight()) {
            iF = getHeight();
        }
        rect.bottom = iF;
        Rect rect2 = this.r;
        rect2.left = this.A;
        rect2.right = getWidth();
        return this.r;
    }

    public final Rect D() {
        this.r.left = ((getScrollX() + getWidth()) - this.M) - this.N;
        Rect rect = this.r;
        int scrollY = getScrollY() + getHeight();
        int i2 = this.M;
        rect.top = (scrollY - i2) - this.N;
        Rect rect2 = this.r;
        rect2.right = rect2.left + i2;
        rect2.bottom = rect2.top + i2;
        return rect2;
    }

    public final long E() {
        SharedPreferences sharedPreferences = this.v0.getSharedPreferences("auto_start", 0);
        this.i0 = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("full_epg", false);
        this.h0 = z;
        f29863b = z ? DateTimeConstants.MILLIS_PER_DAY : DateTimeConstants.MILLIS_PER_HOUR;
        return LocalDateTime.now().toDateTime().minusMillis(f29863b).getMillis();
    }

    public final void F(int i2, long j2) {
        int i3 = i2 - 1;
        if (i3 < 0) {
            super.requestFocus();
            return;
        }
        c.h.a.k.h.d.c.b bVarV = V(i3, j2);
        if (bVarV == null) {
            F(i3, j2);
            return;
        }
        this.n0.f17926i = false;
        this.n0 = bVarV;
        bVarV.f17926i = true;
    }

    public void G() {
        this.Q.clear();
    }

    public void H() {
        if (this.c1.x() == 3) {
            return;
        }
        try {
            NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = this.V0;
            if (nSTIJKPlayerSmallEPG != null) {
                if (nSTIJKPlayerSmallEPG.T()) {
                    this.V0.M();
                } else {
                    this.V0.h0();
                    this.V0.W(true);
                    this.V0.g0();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused) {
        }
    }

    public final void J(Canvas canvas, int i2, Rect rect) {
        Rect rect2;
        Paint paint;
        int i3;
        try {
            rect.left = getScrollX();
            int iY = Y(i2);
            rect.top = iY;
            rect.right = rect.left + this.y;
            rect.bottom = iY + this.x;
            String strF = this.k0.d(i2).f();
            String strG = this.k0.d(i2).g();
            if (i2 == this.Y0) {
                this.s.setColor(this.G);
                int scrollX = getScrollX();
                int i4 = rect.top;
                rect2 = new Rect(scrollX, i4, rect.left + this.A, this.x + i4);
                paint = new Paint();
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                i3 = this.E;
            } else {
                this.s.setColor(this.G);
                int i5 = rect.left;
                int i6 = rect.top;
                rect2 = new Rect(i5, i6, this.A + i5, this.x + i6);
                paint = new Paint();
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                i3 = this.B;
            }
            paint.setColor(i3);
            canvas.drawRect(rect2, paint);
            if (this.Q.containsKey(strF)) {
                Bitmap bitmap = this.Q.get(strF);
                rect = U(rect, bitmap);
                canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
            } else {
                int iMin = Math.min(this.x, this.A);
                if (!this.R.containsKey(strF)) {
                    this.R.put(strF, new a(strF));
                    c.h.a.k.h.d.d.b.d(getContext(), strF, iMin, iMin, this.R.get(strF));
                }
            }
            this.s.setColor(this.G);
            int length = strG.length();
            String strSubstring = strG.substring(0, this.s.breakText(strG, true, this.z, null));
            int length2 = strSubstring.length();
            String str = BuildConfig.FLAVOR;
            if (length2 < length) {
                str = "..";
            }
            canvas.drawText(strSubstring + str, rect.right + 10, rect.centerY() + 10, this.s);
        } catch (Exception unused) {
        }
    }

    public final void K(Canvas canvas, Rect rect) {
        int lastVisibleChannelPosition = getLastVisibleChannelPosition();
        for (int firstVisibleChannelPosition = getFirstVisibleChannelPosition(); firstVisibleChannelPosition <= lastVisibleChannelPosition; firstVisibleChannelPosition++) {
            J(canvas, firstVisibleChannelPosition, rect);
        }
    }

    public final void L(Canvas canvas, int i2, c.h.a.k.h.d.c.b bVar, Rect rect) {
        Paint paint;
        int i3;
        Paint paint2;
        int i4;
        q0(i2, bVar.f(), bVar.c(), rect);
        String strG = bVar.g();
        if (bVar.i()) {
            this.s.setColor(this.E);
            this.Y0 = i2;
        } else {
            if (bVar.h(getTimeShiftMilliSeconds())) {
                paint = this.s;
                i3 = this.D;
            } else if (strG == null || strG.isEmpty() || !strG.equals(getContext().getResources().getString(R.string.no_information))) {
                paint = this.s;
                i3 = this.C;
            } else {
                paint = this.s;
                i3 = this.F;
            }
            paint.setColor(i3);
        }
        canvas.drawRect(rect, this.s);
        int i5 = rect.left;
        int i6 = this.w;
        rect.left = i5 + i6 + 16;
        rect.right -= i6;
        this.s.setColor(this.G);
        if (this.c1.A().equals(c.h.a.h.n.a.s0)) {
            paint2 = this.s;
            i4 = this.H + 6;
        } else {
            paint2 = this.s;
            i4 = this.H;
        }
        paint2.setTextSize(i4);
        this.s.getTextBounds(bVar.g(), 0, bVar.g().length(), this.r);
        int i7 = rect.top;
        rect.top = i7 + ((rect.bottom - i7) / 2) + (this.r.height() / 2);
        canvas.drawText(strG.substring(0, this.s.breakText(strG, true, rect.right - rect.left, null)), rect.left, rect.top, this.s);
    }

    public final void M(Canvas canvas, Rect rect) {
        int lastVisibleChannelPosition = getLastVisibleChannelPosition();
        for (int firstVisibleChannelPosition = getFirstVisibleChannelPosition(); firstVisibleChannelPosition <= lastVisibleChannelPosition; firstVisibleChannelPosition++) {
            this.p.left = getScrollX() + this.A + this.v;
            this.p.top = Y(firstVisibleChannelPosition);
            this.p.right = getScrollX() + getWidth();
            Rect rect2 = this.p;
            rect2.bottom = rect2.top + this.x;
            canvas.save();
            canvas.clipRect(this.p);
            boolean z = false;
            for (c.h.a.k.h.d.c.b bVar : this.k0.b(firstVisibleChannelPosition)) {
                if (!d0(bVar.f(), bVar.c())) {
                    if (z) {
                        break;
                    }
                } else {
                    L(canvas, firstVisibleChannelPosition, bVar, rect);
                    z = true;
                }
            }
            canvas.restore();
        }
    }

    public final void N(Canvas canvas, Rect rect) {
        if (Math.abs(getXPositionStart() - getScrollX()) > getWidth() / 3) {
            Rect rectD = D();
            this.s.setColor(this.J);
            int i2 = rectD.right;
            int i3 = this.M;
            canvas.drawCircle(i2 - (i3 / 2), rectD.bottom - (i3 / 2), Math.min(rectD.width(), rectD.height()) / 2, this.s);
            int i4 = rectD.left;
            int i5 = this.N;
            rectD.left = i4 + i5;
            rectD.right -= i5;
            rectD.top += i5;
            rectD.bottom -= i5;
            canvas.drawBitmap(this.O, (Rect) null, rectD, this.s);
        }
    }

    public final void O(Canvas canvas, Rect rect) {
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) getTimeShiftMilliSeconds());
        if (r0(jCurrentTimeMillis)) {
            rect.left = Z(jCurrentTimeMillis);
            int scrollY = getScrollY();
            rect.top = scrollY;
            rect.right = rect.left + this.I;
            rect.bottom = scrollY + getHeight();
            this.s.setColor(this.J);
            canvas.drawRect(rect, this.s);
            if (this.Z0) {
                return;
            }
            this.Z0 = true;
            scrollTo(this.c1.A().equals(c.h.a.h.n.a.s0) ? ((Z(jCurrentTimeMillis) - this.A) + this.v) - 200 : ((Z(jCurrentTimeMillis) - this.A) + this.v) - 100, 0);
        }
    }

    public final void P(Canvas canvas, Rect rect) {
        rect.left = getScrollX() + this.A + this.v;
        rect.top = getScrollY();
        rect.right = rect.left + getWidth();
        rect.bottom = rect.top + this.K;
        this.p.left = getScrollX() + this.A + this.v;
        this.p.top = getScrollY();
        this.p.right = getScrollX() + getWidth();
        Rect rect2 = this.p;
        rect2.bottom = rect2.top + this.K;
        canvas.save();
        canvas.clipRect(this.p);
        this.s.setColor(this.B);
        canvas.drawRect(rect, this.s);
        this.s.setColor(this.G);
        this.s.setTextSize(this.L);
        for (int i2 = 0; i2 < f29865d / 1800000; i2++) {
            long j2 = (((this.f0 + ((long) (1800000 * i2))) + 900000) / 1800000) * 1800000;
            String strB = c.h.a.k.h.d.d.b.b(this.v0, j2);
            float fZ = Z(j2);
            int i3 = rect.top;
            canvas.drawText(strB, fZ, i3 + ((rect.bottom - i3) / 2) + (this.L / 2), this.s);
        }
        canvas.restore();
        R(canvas, rect);
        Q(canvas, rect);
    }

    public final void Q(Canvas canvas, Rect rect) {
        rect.left = getScrollX();
        rect.top = getScrollY() + this.K;
        rect.right = rect.left + getWidth();
        rect.bottom = rect.top + this.v;
        this.s.setColor(this.P);
        canvas.drawRect(rect, this.s);
    }

    public final void R(Canvas canvas, Rect rect) {
        rect.left = getScrollX();
        int scrollY = getScrollY();
        rect.top = scrollY;
        rect.right = rect.left + this.A;
        rect.bottom = scrollY + this.K;
        this.s.setColor(this.B);
        this.s.setTextAlign(Paint.Align.CENTER);
        canvas.drawRect(rect, this.s);
        this.s.setColor(this.G);
        this.s.setTextSize(this.L);
        String strA = c.h.a.k.h.d.d.b.a(this.f0);
        int i2 = rect.left;
        float f2 = i2 + ((rect.right - i2) / 2);
        int i3 = rect.top;
        canvas.drawText(strA, f2, i3 + ((rect.bottom - i3) / 2) + (this.L / 2), this.s);
        this.s.setTextAlign(Paint.Align.LEFT);
    }

    public final int T(int i2) {
        int i3 = i2 - this.K;
        int i4 = this.v;
        int i5 = (i3 + i4) / (this.x + i4);
        if (this.k0.f() == 0) {
            return -1;
        }
        return i5;
    }

    public final Rect U(Rect rect, Bitmap bitmap) {
        int i2 = rect.left;
        int i3 = this.w;
        rect.left = i2 + i3;
        rect.top += i3;
        rect.right -= i3;
        rect.bottom -= i3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = height / width;
        int i4 = rect.right;
        int i5 = rect.left;
        int i6 = i4 - i5;
        int i7 = rect.bottom;
        int i8 = rect.top;
        int i9 = i7 - i8;
        if (width > height) {
            int i10 = ((int) (i9 - (i6 * f2))) / 2;
            rect.top = i8 + i10;
            rect.bottom = i7 - i10;
        } else if (width <= height) {
            int i11 = ((int) (i6 - (i9 / f2))) / 2;
            rect.left = i5 + i11;
            rect.right = i4 - i11;
        }
        return rect;
    }

    public final c.h.a.k.h.d.c.b V(int i2, long j2) {
        List<c.h.a.k.h.d.c.b> listB = this.k0.b(i2);
        if (listB == null) {
            return null;
        }
        for (int i3 = 0; i3 < listB.size(); i3++) {
            c.h.a.k.h.d.c.b bVar = listB.get(i3);
            if (bVar.f() <= j2 && bVar.c() >= j2) {
                return bVar;
            }
        }
        return null;
    }

    public final int W(int i2, long j2) {
        List<c.h.a.k.h.d.c.b> listB = this.k0.b(i2);
        if (listB == null) {
            return -1;
        }
        for (int i3 = 0; i3 < listB.size(); i3++) {
            c.h.a.k.h.d.c.b bVar = listB.get(i3);
            if (bVar.f() <= j2 && bVar.c() >= j2) {
                return i3;
            }
        }
        return -1;
    }

    public final long X(int i2) {
        return (((long) i2) * this.V) + this.W;
    }

    public final int Y(int i2) {
        int i3 = this.x;
        int i4 = this.v;
        return (i2 * (i3 + i4)) + i4 + this.K;
    }

    public final int Z(long j2) {
        int i2 = (int) ((j2 - this.W) / this.V);
        int i3 = this.v;
        return i2 + i3 + this.A + i3;
    }

    public void a(Context context, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        try {
            this.f29871j = new c.h.a.i.q.a(context);
            this.f29872k = new c.h.a.i.q.f(context);
            View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.epg_popup_layout, (RelativeLayout) findViewById(R.id.rl_epg_layout));
            PopupWindow popupWindow = new PopupWindow(context);
            this.u0 = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.u0.setWidth(-1);
            this.u0.setHeight(-1);
            this.u0.setFocusable(true);
            this.u0.setBackgroundDrawable(new BitmapDrawable());
            this.u0.showAtLocation(viewInflate, 17, 0, 0);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.ll_play);
            RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate.findViewById(R.id.ll_move_to_next_cat);
            RelativeLayout relativeLayout3 = (RelativeLayout) viewInflate.findViewById(R.id.ll_move_to_prev_cat);
            RelativeLayout relativeLayout4 = (RelativeLayout) viewInflate.findViewById(R.id.ll_close);
            if (m.f(context).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListU = this.f29872k.U(str7, m.z(context));
                if (arrayListU == null || arrayListU.size() <= 0) {
                    relativeLayout2.setVisibility(0);
                } else {
                    relativeLayout3.setVisibility(0);
                }
            } else {
                ArrayList<c.h.a.i.b> arrayListL = this.f29871j.l(i2, str8, "live", m.z(context));
                if (arrayListL == null || arrayListL.size() <= 0) {
                    relativeLayout2.setVisibility(0);
                } else {
                    relativeLayout3.setVisibility(0);
                }
            }
            relativeLayout.setOnClickListener(new b(str, i2, str2, str3, str4, str5, str6, str7));
            relativeLayout2.setOnClickListener(new c(context, str8, str7, str3, i2, str2));
            relativeLayout3.setOnClickListener(new d(context, str7, str3, str8, i2));
            relativeLayout4.setOnClickListener(new e());
        } catch (Exception unused) {
        }
    }

    public final void a0(c.h.a.k.h.d.c.b bVar) {
    }

    public final void b0(c.h.a.k.h.d.c.b bVar) {
    }

    public void c0() {
        new f(this, null).c();
    }

    public final boolean d0(long j2, long j3) {
        long j4 = this.f0;
        return (j2 >= j4 && j2 <= this.g0) || (j3 >= j4 && j3 <= this.g0) || (j2 <= j4 && j3 >= this.g0);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public final void e0(c.h.a.k.h.d.c.b bVar) {
        SharedPreferences sharedPreferences = this.v0.getSharedPreferences("timeFormat", 0);
        this.f29876o = sharedPreferences;
        String string = sharedPreferences.getString("timeFormat", c.h.a.h.n.a.m0);
        Locale locale = Locale.US;
        this.f29874m = new SimpleDateFormat(string, locale);
        this.f29875n = new SimpleDateFormat(string, locale);
        this.o0.setText(bVar.g());
        this.q0.setText(this.f29874m.format(Long.valueOf(bVar.f())) + " - " + this.f29875n.format(Long.valueOf(bVar.c())));
        this.p0.setText(bVar.b());
        h0(bVar);
    }

    public final c.h.a.k.h.d.b f0(c.h.a.k.h.d.b bVar, c.h.a.k.h.d.b bVar2) {
        if (bVar == null) {
            try {
                bVar = new c.h.a.k.h.d.d.a(d0.g());
            } catch (Throwable th) {
                throw new RuntimeException("Could not merge EPG data: " + th.getClass().getSimpleName() + " " + th.getMessage(), th);
            }
        }
        if (bVar2 != null) {
            for (int i2 = 0; i2 < bVar2.f(); i2++) {
                c.h.a.k.h.d.c.a aVarD = bVar2.d(i2);
                c.h.a.k.h.d.c.a aVarE = bVar.e(aVarD.g(), aVarD.f(), aVarD.l(), aVarD.i(), aVarD.d(), aVarD.b(), aVarD.m());
                for (int i3 = 0; i3 < aVarD.e().size(); i3++) {
                    aVarE.a(aVarD.e().get(i3));
                }
            }
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a A[PHI: r13 r14 r15 r17
  0x011a: PHI (r13v4 android.widget.Scroller) = (r13v0 android.widget.Scroller), (r13v7 android.widget.Scroller) binds: [B:43:0x0118, B:31:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x011a: PHI (r14v1 int) = (r14v0 int), (r14v4 int) binds: [B:43:0x0118, B:31:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x011a: PHI (r15v1 int) = (r15v0 int), (r15v4 int) binds: [B:43:0x0118, B:31:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x011a: PHI (r17v1 int) = (r17v0 int), (r17v4 int) binds: [B:43:0x0118, B:31:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d A[PHI: r13 r14 r15 r17
  0x011d: PHI (r13v6 android.widget.Scroller) = (r13v0 android.widget.Scroller), (r13v7 android.widget.Scroller) binds: [B:43:0x0118, B:31:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r14v3 int) = (r14v0 int), (r14v4 int) binds: [B:43:0x0118, B:31:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r15v3 int) = (r15v0 int), (r15v4 int) binds: [B:43:0x0118, B:31:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r17v3 int) = (r17v0 int), (r17v4 int) binds: [B:43:0x0118, B:31:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g0(c.h.a.k.h.d.c.b r20, boolean r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.utility.epg.EPG.g0(c.h.a.k.h.d.c.b, boolean, java.lang.String):void");
    }

    public String getExtensionType() {
        return this.z0;
    }

    public int getOpenedStreamID() {
        return this.x0;
    }

    public String getOpenedVideoUrl() {
        return this.y0;
    }

    public c.h.a.k.h.d.c.b getSelectedEvent() {
        return this.n0;
    }

    public int getTimeShiftMilliSeconds() {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("loginPrefs", 0);
        this.t0 = sharedPreferences;
        return c.h.a.h.n.e.w(sharedPreferences.getString("selectedEPGShift", c.h.a.h.n.a.k0));
    }

    public String getVideoPathUrl() {
        return this.M0;
    }

    public final void h0(c.h.a.k.h.d.c.b bVar) {
        int i2;
        NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG;
        NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG2;
        NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG3;
        try {
            if (bVar.a() == null || bVar.a().m() == null || bVar.a().m().equals(BuildConfig.FLAVOR)) {
                if (bVar.a() == null || bVar.a().l() == null) {
                    return;
                }
                try {
                    i2 = Integer.parseInt(bVar.a().l());
                } catch (NumberFormatException unused) {
                    i2 = -1;
                }
                if (getOpenedStreamID() != 0) {
                    return;
                }
                H();
                setOpenedStreamID(i2);
                if (this.c1.x() == 3 || (nSTIJKPlayerSmallEPG = this.V0) == null) {
                    return;
                }
                nSTIJKPlayerSmallEPG.b0(Uri.parse(getVideoPathUrl() + i2 + getExtensionType()), true, BuildConfig.FLAVOR);
                nSTIJKPlayerSmallEPG2 = this.V0;
                nSTIJKPlayerSmallEPG2.L = 0;
            } else {
                if (getOpenedVideoUrl() == null || !getOpenedVideoUrl().equals(BuildConfig.FLAVOR)) {
                    return;
                }
                H();
                setOpenedVideoUrl(bVar.a().m());
                if (this.c1.x() == 3 || (nSTIJKPlayerSmallEPG3 = this.V0) == null) {
                    return;
                }
                nSTIJKPlayerSmallEPG3.b0(Uri.parse(bVar.a().m()), true, BuildConfig.FLAVOR);
                nSTIJKPlayerSmallEPG2 = this.V0;
                nSTIJKPlayerSmallEPG2.L = 0;
            }
            nSTIJKPlayerSmallEPG2.N = false;
            nSTIJKPlayerSmallEPG2.start();
        } catch (Exception unused2) {
        }
    }

    public void i0(c.h.a.k.h.d.c.b bVar, boolean z, RelativeLayout relativeLayout, EPG epg) {
        c.h.a.k.h.d.b bVar2 = this.k0;
        if (bVar2 == null || !bVar2.c()) {
            return;
        }
        m0();
        A();
        z();
        Boolean bool = Boolean.FALSE;
        if (!this.X0.booleanValue()) {
            if (bVar != null) {
                this.X0 = Boolean.TRUE;
            } else {
                int i2 = 0;
                if (W(0, X(getXPositionStart() + (getWidth() / 2))) != -1) {
                    bool = Boolean.TRUE;
                    this.X0 = bool;
                    bVar = this.k0.a(0, W(0, System.currentTimeMillis() + ((long) getTimeShiftMilliSeconds())));
                } else if (this.k0 != null) {
                    while (true) {
                        if (i2 >= this.k0.f()) {
                            break;
                        }
                        List<c.h.a.k.h.d.c.b> listE = this.k0.d(i2).e();
                        if (listE == null || listE.size() == 0) {
                            i2++;
                        } else {
                            bool = Boolean.TRUE;
                            int iC = this.k0.d(i2).c();
                            int iW = W(iC, X(getXPositionStart() + (getWidth() / 2)));
                            if (iW != -1) {
                                this.X0 = bool;
                                bVar = this.k0.a(iC, iW);
                            }
                        }
                    }
                }
            }
            o0(bVar, z);
        }
        if (bool.equals(Boolean.TRUE) && relativeLayout != null) {
            relativeLayout.setFocusable(true);
            relativeLayout.setNextFocusDownId(R.id.epg);
        }
        j0();
    }

    public void j0() {
        invalidate();
        requestLayout();
    }

    public final void k0(Context context, String str, int i2, String str2) {
        c.h.a.i.q.a aVar;
        if (context == null || (aVar = this.f29871j) == null) {
            return;
        }
        aVar.o(i2, str, "live", str2, m.z(context));
        c.h.a.h.n.e.l0(context, str2 + context.getResources().getString(R.string.rem_fav));
    }

    public final void l0(Context context, String str, String str2) {
        c.h.a.i.q.f fVar;
        if (context == null || (fVar = this.f29872k) == null) {
            return;
        }
        fVar.I0(str, m.z(context));
        c.h.a.h.n.e.l0(context, str2 + context.getResources().getString(R.string.rem_fav));
    }

    public final void m0() {
        this.V = B();
        this.W = E();
        this.f0 = X(getWidth());
        this.g0 = X(getWidth());
    }

    public void n0() {
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) getTimeShiftMilliSeconds());
        boolean zEquals = this.c1.A().equals(c.h.a.h.n.a.s0);
        int iZ = (Z(jCurrentTimeMillis) - this.A) + this.v;
        scrollTo(zEquals ? iZ - 200 : iZ - 100, getScrollY());
    }

    public void o0(c.h.a.k.h.d.c.b bVar, boolean z) {
        c.h.a.k.h.d.c.b bVar2 = this.n0;
        if (bVar2 != null) {
            bVar2.f17926i = false;
        }
        bVar.f17926i = true;
        this.n0 = bVar;
        g0(bVar, z, "vertical");
        e0(bVar);
        j0();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        c.h.a.k.h.d.b bVar = this.k0;
        if (bVar == null || !bVar.c()) {
            return;
        }
        this.f0 = X(getScrollX());
        this.g0 = X(getScrollX() + getWidth());
        Rect rect = this.q;
        rect.left = getScrollX();
        rect.top = getScrollY();
        rect.right = rect.left + getWidth();
        rect.bottom = rect.top + getHeight();
        M(canvas, rect);
        K(canvas, rect);
        P(canvas, rect);
        O(canvas, rect);
        N(canvas, rect);
        if (this.t.computeScrollOffset()) {
            scrollTo(this.t.getCurrX(), this.t.getCurrY());
            if (this.Z0) {
                return;
            }
            this.Z0 = true;
            long jCurrentTimeMillis = System.currentTimeMillis() + ((long) getTimeShiftMilliSeconds());
            scrollTo(this.c1.A().equals(c.h.a.h.n.a.s0) ? ((Z(jCurrentTimeMillis) - this.A) + this.v) - 200 : ((Z(jCurrentTimeMillis) - this.A) + this.v) - 100, 0);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        int i3;
        c.h.a.k.h.d.c.b bVarV;
        this.f0 = X(getScrollX());
        this.g0 = X(getScrollX() + getWidth());
        if (keyEvent.getKeyCode() != 4 && this.n0 != null) {
            String str = "horizontal";
            if (keyEvent.getKeyCode() == 22) {
                if (this.n0.d() != null) {
                    c.h.a.k.h.d.c.b bVar = this.n0;
                    bVar.f17926i = false;
                    bVarV = bVar.d();
                    this.n0 = bVarV;
                    bVarV.f17926i = true;
                    g0(bVarV, true, str);
                }
            } else if (keyEvent.getKeyCode() != 21) {
                str = "vertical";
                if (keyEvent.getKeyCode() == 19) {
                    if (this.n0.a().k() == null || this.n0.a().k().c() == this.m0.c()) {
                        super.requestFocus();
                        super.requestFocusFromTouch();
                    } else {
                        long jMax = (Math.max(this.f0, this.n0.f()) + Math.min(this.g0, this.n0.c())) / 2;
                        c.h.a.k.h.d.c.b bVarV2 = V(this.n0.a().k().c(), jMax);
                        if (bVarV2 != null) {
                            this.n0.f17926i = false;
                            this.n0 = bVarV2;
                            bVarV2.f17926i = true;
                        } else {
                            F(this.n0.a().k().c(), jMax);
                        }
                        bVarV = this.n0;
                        g0(bVarV, true, str);
                    }
                } else if (keyEvent.getKeyCode() == 20) {
                    if (this.n0.a().h() != null) {
                        bVarV = V(this.n0.a().h().c(), (Math.max(this.f0, this.n0.f()) + Math.min(this.g0, this.n0.c())) / 2);
                        if (bVarV == null) {
                            if (this.a1 == 1) {
                                new f(this, null).d();
                            }
                            return true;
                        }
                        this.n0.f17926i = false;
                        this.n0 = bVarV;
                        bVarV.f17926i = true;
                        g0(bVarV, true, str);
                    }
                } else if (keyEvent.getKeyCode() == 103 || keyEvent.getKeyCode() == 90) {
                    a0(this.n0);
                } else if (keyEvent.getKeyCode() == 102 || keyEvent.getKeyCode() == 89) {
                    b0(this.n0);
                } else if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 23) {
                    Context context = getContext();
                    getContext();
                    SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
                    this.s0 = sharedPreferences;
                    String string = sharedPreferences.getString("selectedPlayer", BuildConfig.FLAVOR);
                    String strJ = this.n0.a().j();
                    String strB = this.n0.a().b();
                    try {
                        i3 = Integer.parseInt(this.n0.a().l());
                    } catch (NumberFormatException unused) {
                        i3 = -1;
                    }
                    a(getContext(), string, i3, this.n0.a().i(), this.n0.a().g(), this.n0.a().d(), this.n0.a().f(), strJ, this.n0.a().m(), strB);
                }
            } else if (this.n0.e() != null) {
                c.h.a.k.h.d.c.b bVar2 = this.n0;
                bVar2.f17926i = false;
                bVarV = bVar2.e();
                this.n0 = bVarV;
                bVarV.f17926i = true;
                g0(bVarV, true, str);
            }
            e0(this.n0);
            j0();
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c.h.a.k.h.d.c.c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c.h.a.k.h.d.c.c cVar = (c.h.a.k.h.d.c.c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.n0 = cVar.b();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c.h.a.k.h.d.c.c cVar = new c.h.a.k.h.d.c.c(super.onSaveInstanceState());
        cVar.c(this.n0);
        return cVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        i0(this.n0, false, null, null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.u.onTouchEvent(motionEvent);
    }

    public void p0(Activity activity, NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
        this.W0 = activity;
        this.V0 = nSTIJKPlayerSmallEPG;
    }

    public final void q0(int i2, long j2, long j3, Rect rect) {
        rect.left = Z(j2);
        rect.top = Y(i2);
        rect.right = Z(j3) - this.v;
        rect.bottom = rect.top + this.x;
    }

    public final boolean r0(long j2) {
        return j2 >= this.f0 && j2 < this.g0;
    }

    public void setActivity(Activity activity) {
        this.W0 = activity;
    }

    public void setCurrentEventDescriptionTextView(TextView textView) {
        this.p0 = textView;
    }

    public void setCurrentEventTextView(TextView textView) {
        this.o0 = textView;
    }

    public void setCurrentEventTimeTextView(TextView textView) {
        this.q0 = textView;
    }

    public void setEPGClickListener(c.h.a.k.h.d.a aVar) {
        this.S = aVar;
    }

    public void setEPGData(c.h.a.k.h.d.b bVar) {
        try {
            c.h.a.k.h.d.b bVarF0 = f0(this.k0, bVar);
            this.k0 = bVarF0;
            if (bVarF0 == null || bVarF0.f() <= 0) {
                return;
            }
            this.l0 = this.k0.d(0);
            this.m0 = this.k0.d(r2.f() - 1);
        } catch (Exception unused) {
        }
    }

    public void setExtensionType(String str) {
        this.z0 = str;
    }

    public void setLoader(ProgressBar progressBar) {
        this.w0 = progressBar;
    }

    public void setOpenedStreamID(int i2) {
        this.x0 = i2;
    }

    public void setOpenedVideoUrl(String str) {
        this.y0 = str;
    }

    public void setOrientation(int i2) {
        this.r0 = i2;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        f29866e = displayMetrics.widthPixels;
        f29867f = displayMetrics.heightPixels;
    }

    public void setVideoPathUrl(String str) {
        this.M0 = str;
    }

    public void setVideoStatus(LinearLayout linearLayout) {
        this.J0 = linearLayout;
    }

    public void setVideoStatusText(TextView textView) {
        this.K0 = textView;
    }

    public void setVideoView(SurfaceView surfaceView) {
        this.T0 = surfaceView;
    }

    public void w(Context context, String str, int i2, String str2, String str3) {
        if (context == null || this.f29871j == null) {
            return;
        }
        c.h.a.i.b bVar = new c.h.a.i.b();
        bVar.h(str);
        bVar.m(i2);
        bVar.l(str3);
        bVar.k(str2);
        bVar.o(m.z(context));
        this.f29871j.i(bVar, "live");
        c.h.a.h.n.e.l0(context, str2 + context.getResources().getString(R.string.add_fav));
    }

    public final void x(Context context, String str, String str2, String str3) {
        if (context == null || this.f29872k == null) {
            return;
        }
        c.h.a.i.c cVar = new c.h.a.i.c();
        cVar.h(str2);
        cVar.i(m.z(context));
        cVar.g(str3);
        cVar.e(str);
        this.f29872k.Q(cVar);
        c.h.a.h.n.e.l0(context, str3 + context.getResources().getString(R.string.add_fav));
    }

    public final Rect y() {
        this.r.top = this.K;
        int iF = this.k0.f() * (this.x + this.v);
        Rect rect = this.r;
        if (iF >= getHeight()) {
            iF = getHeight();
        }
        rect.bottom = iF;
        Rect rect2 = this.r;
        rect2.left = 0;
        rect2.right = this.A;
        return rect2;
    }

    public final void z() {
        int i2;
        SharedPreferences sharedPreferences = this.v0.getSharedPreferences("auto_start", 0);
        this.i0 = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("full_epg", false);
        this.h0 = z;
        if (z) {
            i2 = DateTimeConstants.MILLIS_PER_DAY;
            f29864c = DateTimeConstants.MILLIS_PER_DAY;
        } else {
            f29864c = 14400000;
            i2 = DateTimeConstants.MILLIS_PER_HOUR;
        }
        f29863b = i2;
        this.T = (int) (((long) ((f29863b + f29864c) - f29865d)) / this.V);
    }
}
