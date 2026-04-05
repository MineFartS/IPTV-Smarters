package com.nst.iptvsmarterstvbox.view.demo;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ActionMenuView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.f.a.b.a2;
import c.f.a.b.a3.t;
import c.f.a.b.a3.v;
import c.f.a.b.b2;
import c.f.a.b.c2;
import c.f.a.b.e3.a1;
import c.f.a.b.g3.f;
import c.f.a.b.g3.j;
import c.f.a.b.i3.p;
import c.f.a.b.l2;
import c.f.a.b.n2;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.q1;
import c.f.a.b.x1;
import c.f.a.b.z1;
import c.h.a.h.n.e;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes2.dex */
public class NSTEXOPlayerSkyTvActivity extends a.b.k.c implements SurfaceHolder.Callback, View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static SharedPreferences f28724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SharedPreferences f28725e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f28727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f28728h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ProgressBar f28730j;
    public LinearLayout A;
    public ArrayList<c.h.a.i.f> A0;
    public int A2;
    public int A3;
    public ProgressBar B;
    public ArrayList<c.h.a.i.f> B0;
    public c.h.a.i.q.a B1;
    public SharedPreferences B2;
    public int B3;
    public LinearLayout C;
    public ArrayList<c.h.a.i.f> C0;
    public SharedPreferences.Editor C1;
    public SharedPreferences.Editor C2;
    public boolean C3;
    public LinearLayout D;
    public SharedPreferences.Editor D1;
    public Boolean D2;
    public boolean D3;
    public ArrayList<c.h.a.i.e> E0;
    public TextView E1;
    public Boolean E2;
    public boolean E3;
    public ArrayList<c.h.a.i.q.i> F0;
    public String F1;
    public Boolean F2;
    public SharedPreferences F3;
    public SharedPreferences G0;
    public TextView G1;
    public Boolean G2;
    public SharedPreferences.Editor H0;
    public Handler H1;
    public Boolean H2;
    public int I;
    public ArrayList<c.h.a.i.b> I0;
    public Handler I1;
    public Boolean I2;
    public String J;
    public ArrayList<c.h.a.i.c> J0;
    public Handler J1;
    public c.h.a.k.d.a.a J2;
    public String K;
    public RecyclerView K0;
    public Handler K1;
    public Handler K2;
    public String L;
    public ProgressBar L0;
    public Handler L1;
    public Handler L2;
    public RelativeLayout M;
    public Toolbar M0;
    public Handler M1;
    public ArrayList<ExternalPlayerModelClass> M2;
    public ListView N;
    public SearchView N0;
    public SharedPreferences.Editor N1;
    public int N2;
    public ListView O;
    public TextView O0;
    public SharedPreferences.Editor O1;
    public String O2;
    public ArrayList<c.h.a.i.f> P;
    public LinearLayout P0;
    public SharedPreferences.Editor P1;
    public String P2;
    public LinearLayout Q0;
    public TextView Q1;
    public Boolean Q2;
    public AppBarLayout R0;
    public Animation R2;
    public String S;
    public Animation S2;
    public LinearLayout T1;
    public Animation T2;
    public c.h.a.i.q.f U;
    public TextView U1;
    public Animation U2;
    public SharedPreferences V;
    public String V0;
    public Animation V2;
    public SharedPreferences W;
    public Boolean W1;
    public Animation W2;
    public SharedPreferences X;
    public RelativeLayout X0;
    public Boolean X1;
    public Animation X2;
    public SharedPreferences Y;
    public LinearLayout Y0;
    public Menu Y1;
    public Animation Y2;
    public SharedPreferences Z;
    public RelativeLayout Z0;
    public MenuItem Z1;
    public Animation Z2;
    public RelativeLayout a1;
    public DateFormat a2;
    public String a3;
    public RelativeLayout b1;
    public String b2;
    public c.h.a.k.b.r b3;
    public String c2;
    public c.h.a.k.b.r c3;
    public String d2;
    public c.h.a.k.b.s d3;
    public TextView e1;
    public SimpleDateFormat e2;
    public c.h.a.k.b.t e3;

    @BindView
    public EditText et_search_left_side;
    public SharedPreferences f0;
    public TextView f1;
    public PlayerView f2;
    public LinearLayoutManager f3;
    public SharedPreferences g0;
    public TextView g1;
    public Date g2;
    public LinearLayoutManager g3;
    public SharedPreferences h0;
    public TextView h1;
    public String h2;
    public int h3;

    @BindView
    public TextView header_page_title;
    public SharedPreferences i0;
    public String i1;
    public Boolean i2;
    public Animation i3;

    @BindView
    public ImageView iv_audio_subtitle_track;

    @BindView
    public ImageView iv_back;

    @BindView
    public ImageView iv_back_episodes;

    @BindView
    public ImageView iv_back_settings;

    @BindView
    public ImageView iv_pause;

    @BindView
    public ImageView iv_play;

    @BindView
    public ImageView iv_radio;
    public SimpleDateFormat j0;
    public TextView j1;
    public a.b.k.b j2;
    public Animation j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f28731k;
    public String k0;
    public TextView k1;
    public String k2;
    public String k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f28732l;
    public RelativeLayout l0;
    public TextView l1;
    public Boolean l2;
    public String l3;

    @BindView
    public LinearLayout ll_audio_subtitle_settings;

    @BindView
    public LinearLayout ll_audio_subtitle_settings_click;

    @BindView
    public LinearLayout ll_back;

    @BindView
    public LinearLayout ll_back_click;

    @BindView
    public LinearLayout ll_bottom_footer_icons;

    @BindView
    public LinearLayout ll_brightness;

    @BindView
    public LinearLayout ll_channels_list;

    @BindView
    public LinearLayout ll_click_to_play;

    @BindView
    public LinearLayout ll_crop;

    @BindView
    public LinearLayout ll_multi_screen;

    @BindView
    public LinearLayout ll_next_channel;

    @BindView
    public LinearLayout ll_no_cat_found;

    @BindView
    public LinearLayout ll_no_cat_found_player;

    @BindView
    public LinearLayout ll_pause_play;

    @BindView
    public LinearLayout ll_player_header_footer;

    @BindView
    public LinearLayout ll_previous_channel;

    @BindView
    public LinearLayout ll_toolbar;

    @BindView
    public LinearLayout ll_top_left_back;

    @BindView
    public LinearLayout ll_top_right_setting;

    @BindView
    public LinearLayout ll_volume;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f28733m;
    public TextView m1;
    public c.h.a.k.h.d.c.b m2;
    public String m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f28734n;
    public TextView n0;
    public TextView n1;
    public String n2;
    public String n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f28735o;
    public ArrayList<c.h.a.i.e> o0;
    public TextView o1;
    public int o2;
    public int o3;
    public String p;
    public ArrayList<c.h.a.i.e> p0;
    public TextView p1;
    public int p2;
    public boolean p3;
    public View q;
    public ArrayList<c.h.a.i.e> q0;
    public TextView q1;
    public String q2;
    public boolean q3;
    public View r;
    public ArrayList<c.h.a.i.e> r0;
    public LinearLayout r1;
    public Boolean r2;
    public c.h.a.i.q.g r3;

    @BindView
    public RecyclerView recycler_view_left_sidebar;

    @BindView
    public RecyclerView recycler_view_left_sidebar_player;

    @BindView
    public RelativeLayout rl_episodes_box;

    @BindView
    public RelativeLayout rl_episodes_box_player;

    @BindView
    public RelativeLayout rl_search_cat;

    @BindView
    public RelativeLayout rl_settings_box;
    public ArrayList<c.h.a.i.e> s0;
    public String s1;
    public AsyncTask s2;
    public Thread s3;

    @BindView
    public SeekBar sb_brightness;

    @BindView
    public SeekBar sb_volume;
    public LinearLayout t;
    public ArrayList<c.h.a.i.f> t0;
    public LinearLayout t1;
    public AsyncTask t2;
    public Boolean t3;

    @BindView
    public TextView tv_brightness;

    @BindView
    public TextView tv_episode_name;

    @BindView
    public TextView tv_volume;
    public TextView u;
    public ArrayList<c.h.a.i.f> u0;
    public LinearLayout u1;
    public AsyncTask u2;
    public boolean u3;
    public ImageView v;
    public ArrayList<c.h.a.i.f> v0;
    public LinearLayout v1;
    public ProgressDialog v2;
    public n2 v3;
    public TextView w;
    public ArrayList<c.h.a.i.f> w0;
    public LinearLayout w1;
    public boolean w2;
    public p.a w3;
    public TextView x;
    public ArrayList<c.h.a.i.f> x0;
    public LinearLayout x1;
    public int x2;
    public c.f.a.b.g3.f x3;
    public TextView y;
    public ArrayList<c.h.a.i.f> y0;
    public String y1;
    public boolean y2;
    public f.d y3;
    public TextView z;
    public ArrayList<c.h.a.i.f> z0;
    public int z1;
    public int z2;
    public Uri z3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f28726f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f28729i = {0, 1, 2, 3, 4, 5};
    public boolean s = false;
    public boolean E = true;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean Q = true;
    public long R = 2500;
    public boolean T = true;
    public int m0 = 0;
    public ArrayList<String> D0 = new ArrayList<>();
    public boolean S0 = true;
    public boolean T0 = false;
    public boolean U0 = false;
    public boolean W0 = true;
    public String c1 = BuildConfig.FLAVOR;
    public String d1 = BuildConfig.FLAVOR;
    public String A1 = BuildConfig.FLAVOR;
    public int R1 = 0;
    public StringBuilder S1 = new StringBuilder();
    public int V1 = -1;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.b3(BuildConfig.FLAVOR, false);
            NSTEXOPlayerSkyTvActivity.this.t3 = Boolean.TRUE;
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class a0 extends AsyncTask<String, String, String> {
        public a0() {
        }

        public String a() {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            c.h.a.i.q.f fVar;
            String str;
            try {
                NSTEXOPlayerSkyTvActivity.this.x2 = 0;
                if (NSTEXOPlayerSkyTvActivity.this.v0 != null && NSTEXOPlayerSkyTvActivity.this.t0 != null) {
                    NSTEXOPlayerSkyTvActivity.this.v0.clear();
                    NSTEXOPlayerSkyTvActivity.this.t0.clear();
                }
                if (NSTEXOPlayerSkyTvActivity.this.m3.equals("true")) {
                    nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    fVar = nSTEXOPlayerSkyTvActivity.U;
                    str = "radio_streams";
                } else {
                    nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    fVar = nSTEXOPlayerSkyTvActivity.U;
                    str = "live";
                }
                nSTEXOPlayerSkyTvActivity.v0 = fVar.W0("0", str);
                if (NSTEXOPlayerSkyTvActivity.this.w0 != null) {
                    NSTEXOPlayerSkyTvActivity.this.w0.clear();
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(NSTEXOPlayerSkyTvActivity.this.J2.C()));
                String str2 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(NSTEXOPlayerSkyTvActivity.this.f28731k)));
                boolean zB = NSTEXOPlayerSkyTvActivity.this.J2.B();
                ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? NSTEXOPlayerSkyTvActivity.this.U.z1(null, str2) : null;
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity2.f0 = nSTEXOPlayerSkyTvActivity2.getSharedPreferences("currentlyPlayingVideo", 0);
                String string = c.h.a.i.q.m.f(NSTEXOPlayerSkyTvActivity.this.f28731k).equals("m3u") ? NSTEXOPlayerSkyTvActivity.this.Z.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : NSTEXOPlayerSkyTvActivity.this.Z.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
                if (NSTEXOPlayerSkyTvActivity.this.v0 == null || NSTEXOPlayerSkyTvActivity.this.v0.size() <= 0) {
                    return "all_channels";
                }
                for (int i2 = 0; i2 < NSTEXOPlayerSkyTvActivity.this.v0.size(); i2++) {
                    if (NSTEXOPlayerSkyTvActivity.this.s2 != null && NSTEXOPlayerSkyTvActivity.this.s2.isCancelled()) {
                        return "all_channels";
                    }
                    if (c.h.a.i.q.m.f(NSTEXOPlayerSkyTvActivity.this.f28731k).equals("m3u")) {
                        if (((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).e0().equals(string)) {
                            NSTEXOPlayerSkyTvActivity.this.x2 = i2;
                        }
                    } else if (((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).Y().equals(string)) {
                        NSTEXOPlayerSkyTvActivity.this.x2 = i2;
                    }
                    c.h.a.i.f fVar2 = new c.h.a.i.f();
                    fVar2.u0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).P());
                    fVar2.t0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).getName());
                    fVar2.C0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).Z());
                    fVar2.B0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).Y());
                    fVar2.A0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).X());
                    fVar2.l0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).I());
                    fVar2.f0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).f());
                    fVar2.g0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).g());
                    fVar2.j0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).D());
                    fVar2.D0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).a0());
                    fVar2.k0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).F());
                    fVar2.E0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).b0());
                    fVar2.F0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).d0());
                    fVar2.h0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).B());
                    fVar2.z0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).W());
                    fVar2.p0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).M());
                    fVar2.i0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).C());
                    fVar2.G0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).e0());
                    if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayListZ1.size() || (NSTEXOPlayerSkyTvActivity.this.s2 != null && NSTEXOPlayerSkyTvActivity.this.s2.isCancelled())) {
                                break;
                            }
                            if (((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).I().equals(arrayListZ1.get(i3).a())) {
                                int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), NSTEXOPlayerSkyTvActivity.this.f28731k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), NSTEXOPlayerSkyTvActivity.this.f28731k)).longValue(), NSTEXOPlayerSkyTvActivity.this.f28731k);
                                if (iZ != 0) {
                                    iZ = 100 - iZ;
                                }
                                fVar2.m0(iZ);
                                fVar2.v0(arrayListZ1.get(i3).m());
                            } else {
                                i3++;
                            }
                        }
                    }
                    NSTEXOPlayerSkyTvActivity.this.w0.add(fVar2);
                }
                return "all_channels";
            } catch (Exception unused) {
                return "all_channels";
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                r0 = 0
                r7 = r7[r0]     // Catch: java.lang.Exception -> L5b
                r1 = -1
                int r2 = r7.hashCode()     // Catch: java.lang.Exception -> L5b
                r3 = 3
                r4 = 2
                r5 = 1
                switch(r2) {
                    case -74797390: goto L2c;
                    case 47612238: goto L22;
                    case 301138327: goto L18;
                    case 613425326: goto Lf;
                    default: goto Le;
                }     // Catch: java.lang.Exception -> L5b
            Le:
                goto L36
            Lf:
                java.lang.String r2 = "all_channels"
                boolean r7 = r7.equals(r2)     // Catch: java.lang.Exception -> L5b
                if (r7 == 0) goto L36
                goto L37
            L18:
                java.lang.String r0 = "recently_watched"
                boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L5b
                if (r7 == 0) goto L36
                r0 = 3
                goto L37
            L22:
                java.lang.String r0 = "all_channels_with_cat"
                boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L5b
                if (r7 == 0) goto L36
                r0 = 1
                goto L37
            L2c:
                java.lang.String r0 = "get_fav"
                boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L5b
                if (r7 == 0) goto L36
                r0 = 2
                goto L37
            L36:
                r0 = -1
            L37:
                if (r0 == 0) goto L56
                if (r0 == r5) goto L4f
                if (r0 == r4) goto L48
                if (r0 == r3) goto L41
                r7 = 0
                return r7
            L41:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r7 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L5b
                java.lang.String r7 = r7.a2()     // Catch: java.lang.Exception -> L5b
                return r7
            L48:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r7 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L5b
                java.lang.String r7 = r7.q2()     // Catch: java.lang.Exception -> L5b
                return r7
            L4f:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r7 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L5b
                java.lang.String r7 = r7.W1()     // Catch: java.lang.Exception -> L5b
                return r7
            L56:
                java.lang.String r7 = r6.a()     // Catch: java.lang.Exception -> L5b
                return r7
            L5b:
                java.lang.String r7 = "error"
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.a0.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTEXOPlayerSkyTvActivity.this.w0 != null) {
                    if (!NSTEXOPlayerSkyTvActivity.this.X1.booleanValue()) {
                        NSTEXOPlayerSkyTvActivity.this.X1 = Boolean.TRUE;
                        if (NSTEXOPlayerSkyTvActivity.this.w0.size() == 0) {
                            c.h.a.h.n.a.G = Boolean.FALSE;
                            NSTEXOPlayerSkyTvActivity.this.O2();
                            NSTEXOPlayerSkyTvActivity.this.f2.setVisibility(8);
                            NSTEXOPlayerSkyTvActivity.this.t.setVisibility(0);
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity.u.setText(nSTEXOPlayerSkyTvActivity.getResources().getString(R.string.no_channel_found));
                        } else if (NSTEXOPlayerSkyTvActivity.this.z0 != null) {
                            NSTEXOPlayerSkyTvActivity.this.z0.clear();
                            NSTEXOPlayerSkyTvActivity.this.z0.addAll(NSTEXOPlayerSkyTvActivity.this.w0);
                        }
                    }
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                    if (nSTEXOPlayerSkyTvActivity2.T0 && nSTEXOPlayerSkyTvActivity2.U0 && !nSTEXOPlayerSkyTvActivity2.V0.equals(BuildConfig.FLAVOR)) {
                        NSTEXOPlayerSkyTvActivity.this.x2 = 0;
                        try {
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity3.x2 = nSTEXOPlayerSkyTvActivity3.s2(nSTEXOPlayerSkyTvActivity3.w0, c.h.a.h.n.e.S(NSTEXOPlayerSkyTvActivity.this.V0));
                        } catch (NumberFormatException | Exception unused) {
                        }
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity4.T0 = false;
                        nSTEXOPlayerSkyTvActivity4.U0 = false;
                    }
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity5.Z2(nSTEXOPlayerSkyTvActivity5.w0);
                }
            } catch (Exception unused2) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                TextView textView = NSTEXOPlayerSkyTvActivity.this.O0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                TextView textView2 = nSTEXOPlayerSkyTvActivity.n0;
                if (textView2 != null) {
                    textView2.setText(nSTEXOPlayerSkyTvActivity.d1);
                    NSTEXOPlayerSkyTvActivity.this.n0.setSelected(true);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28739c;

        public b(String str, int i2) {
            this.f28738b = str;
            this.f28739c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            String str;
            if (NSTEXOPlayerSkyTvActivity.this.c2.equals("m3u")) {
                nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                str = this.f28738b;
            } else {
                nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                str = NSTEXOPlayerSkyTvActivity.this.f28732l + c.h.a.h.n.e.R(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.z0.get(this.f28739c)).Y()) + NSTEXOPlayerSkyTvActivity.this.k0;
            }
            nSTEXOPlayerSkyTvActivity.z3 = Uri.parse(str);
            NSTEXOPlayerSkyTvActivity.this.f2.t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f28726f));
            NSTEXOPlayerSkyTvActivity.this.E2();
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
            nSTEXOPlayerSkyTvActivity2.A3 = 0;
            nSTEXOPlayerSkyTvActivity2.C3 = false;
            nSTEXOPlayerSkyTvActivity2.K1.removeCallbacksAndMessages(null);
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
            nSTEXOPlayerSkyTvActivity3.K = ((c.h.a.i.f) nSTEXOPlayerSkyTvActivity3.z0.get(this.f28739c)).I();
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = NSTEXOPlayerSkyTvActivity.this;
            nSTEXOPlayerSkyTvActivity4.L = ((c.h.a.i.f) nSTEXOPlayerSkyTvActivity4.z0.get(this.f28739c)).X();
            NSTEXOPlayerSkyTvActivity.this.f2.setCurrentEpgChannelID(NSTEXOPlayerSkyTvActivity.this.K);
            NSTEXOPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTEXOPlayerSkyTvActivity.this.L);
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = NSTEXOPlayerSkyTvActivity.this;
            nSTEXOPlayerSkyTvActivity5.n3(nSTEXOPlayerSkyTvActivity5.L);
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity6 = NSTEXOPlayerSkyTvActivity.this;
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity7 = NSTEXOPlayerSkyTvActivity.this;
            nSTEXOPlayerSkyTvActivity6.u2 = new f0(nSTEXOPlayerSkyTvActivity7, nSTEXOPlayerSkyTvActivity7.K, null).execute(new String[0]);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class b0 extends AsyncTask<String, String, String> {
        public b0() {
        }

        public String a() {
            c.h.a.i.q.f fVar;
            String str;
            String str2;
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            try {
                NSTEXOPlayerSkyTvActivity.this.h3 = 0;
                if (NSTEXOPlayerSkyTvActivity.this.x0 != null) {
                    NSTEXOPlayerSkyTvActivity.this.x0.clear();
                }
                if (NSTEXOPlayerSkyTvActivity.this.m3.equals("true")) {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                    fVar = nSTEXOPlayerSkyTvActivity2.U;
                    str = nSTEXOPlayerSkyTvActivity2.P2;
                    str2 = "radio_streams";
                } else {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
                    fVar = nSTEXOPlayerSkyTvActivity3.U;
                    str = nSTEXOPlayerSkyTvActivity3.P2;
                    str2 = "live";
                }
                NSTEXOPlayerSkyTvActivity.this.x0 = fVar.W0(str, str2);
                if (NSTEXOPlayerSkyTvActivity.this.y0 != null) {
                    NSTEXOPlayerSkyTvActivity.this.y0.clear();
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(NSTEXOPlayerSkyTvActivity.this.J2.C()));
                String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(NSTEXOPlayerSkyTvActivity.this.f28731k)));
                boolean zB = NSTEXOPlayerSkyTvActivity.this.J2.B();
                ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? NSTEXOPlayerSkyTvActivity.this.U.z1(null, str3) : null;
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity4.f0 = nSTEXOPlayerSkyTvActivity4.getSharedPreferences("currentlyPlayingVideo", 0);
                String string = c.h.a.i.q.m.f(NSTEXOPlayerSkyTvActivity.this.f28731k).equals("m3u") ? NSTEXOPlayerSkyTvActivity.this.Z.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : NSTEXOPlayerSkyTvActivity.this.Z.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
                if (NSTEXOPlayerSkyTvActivity.this.x0 != null && NSTEXOPlayerSkyTvActivity.this.x0.size() > 0) {
                    for (int i2 = 0; i2 < NSTEXOPlayerSkyTvActivity.this.x0.size() && (NSTEXOPlayerSkyTvActivity.this.s2 == null || !NSTEXOPlayerSkyTvActivity.this.s2.isCancelled()); i2++) {
                        if (c.h.a.i.q.m.f(NSTEXOPlayerSkyTvActivity.this.f28731k).equals("m3u")) {
                            if (((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).e0().equals(string)) {
                                NSTEXOPlayerSkyTvActivity.this.h3 = i2;
                                nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                                nSTEXOPlayerSkyTvActivity.R1 = nSTEXOPlayerSkyTvActivity.h3;
                            }
                        } else if (((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).Y().equals(string)) {
                            NSTEXOPlayerSkyTvActivity.this.h3 = i2;
                            nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity.R1 = nSTEXOPlayerSkyTvActivity.h3;
                        }
                        c.h.a.i.f fVar2 = new c.h.a.i.f();
                        fVar2.u0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).P());
                        fVar2.t0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).getName());
                        fVar2.C0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).Z());
                        fVar2.B0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).Y());
                        fVar2.A0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).X());
                        fVar2.l0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).I());
                        fVar2.f0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).f());
                        fVar2.g0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).g());
                        fVar2.j0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).D());
                        fVar2.D0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).a0());
                        fVar2.k0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).F());
                        fVar2.E0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).b0());
                        fVar2.F0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).d0());
                        fVar2.h0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).B());
                        fVar2.z0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).W());
                        fVar2.p0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).M());
                        fVar2.i0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).C());
                        fVar2.G0(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).e0());
                        if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                            int i3 = 0;
                            while (true) {
                                if (i3 < arrayListZ1.size() && (NSTEXOPlayerSkyTvActivity.this.s2 == null || !NSTEXOPlayerSkyTvActivity.this.s2.isCancelled())) {
                                    if (((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).I().equals(arrayListZ1.get(i3).a())) {
                                        int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), NSTEXOPlayerSkyTvActivity.this.f28731k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), NSTEXOPlayerSkyTvActivity.this.f28731k)).longValue(), NSTEXOPlayerSkyTvActivity.this.f28731k);
                                        if (iZ != 0) {
                                            iZ = 100 - iZ;
                                        }
                                        fVar2.m0(iZ);
                                        fVar2.v0(arrayListZ1.get(i3).m());
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        NSTEXOPlayerSkyTvActivity.this.y0.add(fVar2);
                    }
                }
                NSTEXOPlayerSkyTvActivity.this.x0.clear();
                NSTEXOPlayerSkyTvActivity.this.x0.addAll(NSTEXOPlayerSkyTvActivity.this.y0);
                return "all_channels_with_cat";
            } catch (Exception unused) {
                return "all_channels_with_cat";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return NSTEXOPlayerSkyTvActivity.this.P2.equals("-1") ? c.h.a.i.q.m.f(NSTEXOPlayerSkyTvActivity.this.f28731k).equals("m3u") ? NSTEXOPlayerSkyTvActivity.this.q2() : NSTEXOPlayerSkyTvActivity.this.r2() : NSTEXOPlayerSkyTvActivity.this.P2.equals("-6") ? NSTEXOPlayerSkyTvActivity.this.a2() : a();
            } catch (Exception unused) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTEXOPlayerSkyTvActivity.this.x0 != null) {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity.a3(nSTEXOPlayerSkyTvActivity.x0);
                    if (!NSTEXOPlayerSkyTvActivity.this.X1.booleanValue()) {
                        NSTEXOPlayerSkyTvActivity.this.X1 = Boolean.TRUE;
                        if (NSTEXOPlayerSkyTvActivity.this.x0 == null || NSTEXOPlayerSkyTvActivity.this.x0.size() == 0) {
                            c.h.a.h.n.a.G = Boolean.FALSE;
                            NSTEXOPlayerSkyTvActivity.this.O2();
                        } else if (NSTEXOPlayerSkyTvActivity.this.l3.equals("true") || NSTEXOPlayerSkyTvActivity.this.J2.i()) {
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity2.T2(nSTEXOPlayerSkyTvActivity2.x0);
                        } else {
                            LinearLayout linearLayout = NSTEXOPlayerSkyTvActivity.this.ll_click_to_play;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(0);
                            }
                        }
                    }
                }
                NSTEXOPlayerSkyTvActivity.this.C2();
                NSTEXOPlayerSkyTvActivity.this.A2();
                NSTEXOPlayerSkyTvActivity.this.i2();
                NSTEXOPlayerSkyTvActivity.this.h2();
            } catch (Exception unused) {
                NSTEXOPlayerSkyTvActivity.this.C2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            LinearLayout linearLayout;
            super.onPreExecute();
            try {
                RelativeLayout relativeLayout = NSTEXOPlayerSkyTvActivity.this.rl_episodes_box_player;
                if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                    NSTEXOPlayerSkyTvActivity.this.k3 = BuildConfig.FLAVOR;
                } else {
                    NSTEXOPlayerSkyTvActivity.this.k3 = "player";
                }
            } catch (Exception unused) {
            }
            NSTEXOPlayerSkyTvActivity.this.g3();
            if (NSTEXOPlayerSkyTvActivity.this.k3.equals("player")) {
                if (NSTEXOPlayerSkyTvActivity.this.O != null) {
                    NSTEXOPlayerSkyTvActivity.this.O.setVisibility(8);
                }
                linearLayout = NSTEXOPlayerSkyTvActivity.this.Q0;
                if (linearLayout == null) {
                    return;
                }
            } else {
                if (NSTEXOPlayerSkyTvActivity.this.N != null) {
                    NSTEXOPlayerSkyTvActivity.this.N.setVisibility(8);
                }
                linearLayout = NSTEXOPlayerSkyTvActivity.this.P0;
                if (linearLayout == null) {
                    return;
                }
            }
            linearLayout.setVisibility(8);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.b3(BuildConfig.FLAVOR, false);
            NSTEXOPlayerSkyTvActivity.this.t3 = Boolean.TRUE;
        }
    }

    public class c0 implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f28743b;

        public c0(View view) {
            this.f28743b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28743b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28743b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28743b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            View view2;
            View view3;
            View view4;
            View view5;
            Resources resources;
            int i2;
            LinearLayout linearLayout;
            int i3;
            Drawable drawable;
            View view6;
            View view7;
            View view8;
            View view9;
            if (z) {
                float f2 = z ? 1.08f : 1.0f;
                View view10 = this.f28743b;
                if (view10 == null || view10.getTag() == null || !this.f28743b.getTag().equals("1")) {
                    View view11 = this.f28743b;
                    if (view11 == null || view11.getTag() == null || !this.f28743b.getTag().equals("2")) {
                        View view12 = this.f28743b;
                        if (view12 == null || view12.getTag() == null || !this.f28743b.getTag().equals("3")) {
                            View view13 = this.f28743b;
                            if ((view13 == null || view13.getTag() == null || !this.f28743b.getTag().equals("4")) && (((view6 = this.f28743b) == null || view6.getTag() == null || !this.f28743b.getTag().equals("5")) && (((view7 = this.f28743b) == null || view7.getTag() == null || !this.f28743b.getTag().equals("6")) && ((view8 = this.f28743b) == null || view8.getTag() == null || !this.f28743b.getTag().equals("7"))))) {
                                View view14 = this.f28743b;
                                if (view14 != null && view14.getTag() != null && this.f28743b.getTag().equals("8")) {
                                    return;
                                }
                                View view15 = this.f28743b;
                                if (view15 == null || view15.getTag() == null || !this.f28743b.getTag().equals("9")) {
                                    View view16 = this.f28743b;
                                    if (view16 != null && view16.getTag() != null && this.f28743b.getTag().equals("10")) {
                                        return;
                                    }
                                    View view17 = this.f28743b;
                                    if (view17 == null || view17.getTag() == null || !this.f28743b.getTag().equals("11")) {
                                        View view18 = this.f28743b;
                                        if (view18 == null || view18.getTag() == null || !this.f28743b.getTag().equals("12")) {
                                            View view19 = this.f28743b;
                                            if ((view19 == null || view19.getTag() == null || !this.f28743b.getTag().equals("13")) && ((view9 = this.f28743b) == null || view9.getTag() == null || !this.f28743b.getTag().equals("14"))) {
                                                return;
                                            }
                                        } else {
                                            resources = NSTEXOPlayerSkyTvActivity.this.getResources();
                                            i2 = R.drawable.blue_btn_effect;
                                        }
                                    } else {
                                        resources = NSTEXOPlayerSkyTvActivity.this.getResources();
                                        i2 = R.color.hp_cyan_dark;
                                    }
                                    drawable = resources.getDrawable(i2);
                                }
                            }
                            drawable = NSTEXOPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow_light);
                        }
                        view.setBackground(NSTEXOPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                        b(f2);
                        c(f2);
                        return;
                    }
                    view.setBackground(NSTEXOPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                    b(f2);
                    c(f2);
                    linearLayout = NSTEXOPlayerSkyTvActivity.this.ll_audio_subtitle_settings;
                } else {
                    view.setBackground(NSTEXOPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                    b(f2);
                    c(f2);
                    linearLayout = NSTEXOPlayerSkyTvActivity.this.ll_back;
                }
                i3 = 0;
                linearLayout.setVisibility(i3);
                return;
            }
            if (z) {
                return;
            }
            float f3 = z ? 1.08f : 1.0f;
            View view20 = this.f28743b;
            if (view20 == null || view20.getTag() == null || !this.f28743b.getTag().equals("1")) {
                View view21 = this.f28743b;
                if (view21 == null || view21.getTag() == null || !this.f28743b.getTag().equals("2")) {
                    View view22 = this.f28743b;
                    if (view22 == null || view22.getTag() == null || !this.f28743b.getTag().equals("3")) {
                        View view23 = this.f28743b;
                        if ((view23 == null || view23.getTag() == null || !this.f28743b.getTag().equals("4")) && (((view2 = this.f28743b) == null || view2.getTag() == null || !this.f28743b.getTag().equals("5")) && (((view3 = this.f28743b) == null || view3.getTag() == null || !this.f28743b.getTag().equals("6")) && ((view4 = this.f28743b) == null || view4.getTag() == null || !this.f28743b.getTag().equals("7"))))) {
                            View view24 = this.f28743b;
                            if (view24 != null && view24.getTag() != null && this.f28743b.getTag().equals("8")) {
                                return;
                            }
                            View view25 = this.f28743b;
                            if (view25 == null || view25.getTag() == null || !this.f28743b.getTag().equals("9")) {
                                View view26 = this.f28743b;
                                if (view26 != null && view26.getTag() != null && this.f28743b.getTag().equals("10")) {
                                    return;
                                }
                                View view27 = this.f28743b;
                                if (view27 == null || view27.getTag() == null || !this.f28743b.getTag().equals("11")) {
                                    View view28 = this.f28743b;
                                    if (view28 == null || view28.getTag() == null || !this.f28743b.getTag().equals("12")) {
                                        View view29 = this.f28743b;
                                        if ((view29 == null || view29.getTag() == null || !this.f28743b.getTag().equals("13")) && ((view5 = this.f28743b) == null || view5.getTag() == null || !this.f28743b.getTag().equals("14"))) {
                                            return;
                                        }
                                    } else {
                                        resources = NSTEXOPlayerSkyTvActivity.this.getResources();
                                        i2 = R.drawable.black_button_dark;
                                    }
                                } else {
                                    resources = NSTEXOPlayerSkyTvActivity.this.getResources();
                                    i2 = R.color.cat_search_background_live;
                                }
                                drawable = resources.getDrawable(i2);
                            }
                        }
                        view.setBackground(null);
                        return;
                    }
                    view.setBackground(NSTEXOPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                    b(f3);
                    c(f3);
                    a(z);
                    return;
                }
                view.setBackground(NSTEXOPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                b(f3);
                c(f3);
                a(z);
                linearLayout = NSTEXOPlayerSkyTvActivity.this.ll_audio_subtitle_settings;
            } else {
                view.setBackground(NSTEXOPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                b(f3);
                c(f3);
                a(z);
                linearLayout = NSTEXOPlayerSkyTvActivity.this.ll_back;
            }
            i3 = 8;
            linearLayout.setVisibility(i3);
            return;
            view.setBackground(drawable);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28746c;

        public d(String str, int i2) {
            this.f28745b = str;
            this.f28746c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            String str;
            if (NSTEXOPlayerSkyTvActivity.this.c2.equals("m3u")) {
                nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                str = this.f28745b;
            } else {
                nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                str = NSTEXOPlayerSkyTvActivity.this.f28732l + c.h.a.h.n.e.R(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.z0.get(this.f28746c)).Y()) + NSTEXOPlayerSkyTvActivity.this.k0;
            }
            nSTEXOPlayerSkyTvActivity.z3 = Uri.parse(str);
            NSTEXOPlayerSkyTvActivity.this.f2.t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f28726f));
            NSTEXOPlayerSkyTvActivity.this.E2();
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
            nSTEXOPlayerSkyTvActivity2.A3 = 0;
            nSTEXOPlayerSkyTvActivity2.C3 = false;
            nSTEXOPlayerSkyTvActivity2.K1.removeCallbacksAndMessages(null);
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
            nSTEXOPlayerSkyTvActivity3.K = ((c.h.a.i.f) nSTEXOPlayerSkyTvActivity3.z0.get(this.f28746c)).I();
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = NSTEXOPlayerSkyTvActivity.this;
            nSTEXOPlayerSkyTvActivity4.L = ((c.h.a.i.f) nSTEXOPlayerSkyTvActivity4.z0.get(this.f28746c)).X();
            NSTEXOPlayerSkyTvActivity.this.f2.setCurrentEpgChannelID(NSTEXOPlayerSkyTvActivity.this.K);
            NSTEXOPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTEXOPlayerSkyTvActivity.this.L);
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = NSTEXOPlayerSkyTvActivity.this;
            nSTEXOPlayerSkyTvActivity5.n3(nSTEXOPlayerSkyTvActivity5.L);
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity6 = NSTEXOPlayerSkyTvActivity.this;
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity7 = NSTEXOPlayerSkyTvActivity.this;
            nSTEXOPlayerSkyTvActivity6.u2 = new f0(nSTEXOPlayerSkyTvActivity7, nSTEXOPlayerSkyTvActivity7.K, null).execute(new String[0]);
        }
    }

    public class d0 implements c.f.a.b.j3.q<x1> {
        public d0() {
        }

        public /* synthetic */ d0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, k kVar) {
            this();
        }

        @Override // c.f.a.b.j3.q
        @SuppressLint({"StringFormatInvalid"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> a(x1 x1Var) {
            String string = NSTEXOPlayerSkyTvActivity.this.getString(R.string.error_generic);
            Throwable cause = x1Var.getCause();
            if (cause instanceof t.a) {
                t.a aVar = (t.a) cause;
                c.f.a.b.a3.s sVar = aVar.f6494d;
                string = sVar == null ? aVar.getCause() instanceof v.c ? NSTEXOPlayerSkyTvActivity.this.getString(R.string.error_querying_decoders) : aVar.f6493c ? NSTEXOPlayerSkyTvActivity.this.getString(R.string.error_no_secure_decoder, new Object[]{aVar.f6492b}) : NSTEXOPlayerSkyTvActivity.this.getString(R.string.error_no_decoder, new Object[]{aVar.f6492b}) : NSTEXOPlayerSkyTvActivity.this.getString(R.string.error_instantiating_decoder, new Object[]{sVar.f6479a});
            }
            return Pair.create(0, string);
        }
    }

    public class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            boolean z;
            if (charSequence == null || charSequence.toString().length() <= 0) {
                nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                z = false;
            } else {
                nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                z = true;
            }
            nSTEXOPlayerSkyTvActivity.u3 = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x000c A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:3:0x0002, B:7:0x0014, B:9:0x001c, B:5:0x000c), top: B:12:0x0002 }] */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            /*
                r0 = this;
                if (r1 == 0) goto Lc
                java.lang.String r2 = r1.toString()     // Catch: java.lang.Exception -> L34
                int r2 = r2.length()     // Catch: java.lang.Exception -> L34
                if (r2 > 0) goto L14
            Lc:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L34
                boolean r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.J1(r2)     // Catch: java.lang.Exception -> L34
                if (r2 == 0) goto L34
            L14:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L34
                c.h.a.k.b.r r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.E1(r2)     // Catch: java.lang.Exception -> L34
                if (r2 == 0) goto L34
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L34
                c.h.a.k.b.r r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.E1(r2)     // Catch: java.lang.Exception -> L34
                android.widget.Filter r2 = r2.getFilter()     // Catch: java.lang.Exception -> L34
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L34
                r2.filter(r1)     // Catch: java.lang.Exception -> L34
                java.lang.String r1 = "honey"
                java.lang.String r2 = "onTextChanged: notify"
                android.util.Log.e(r1, r2)     // Catch: java.lang.Exception -> L34
            L34:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.e.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public class e0 implements a2.e {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity.D3) {
                    return;
                }
                nSTEXOPlayerSkyTvActivity.A3++;
                c.h.a.h.n.e.l0(nSTEXOPlayerSkyTvActivity.f28731k, NSTEXOPlayerSkyTvActivity.this.f28731k.getResources().getString(R.string.play_back_error) + " (" + NSTEXOPlayerSkyTvActivity.this.A3 + "/" + NSTEXOPlayerSkyTvActivity.this.B3 + ")");
                NSTEXOPlayerSkyTvActivity.this.V2();
                NSTEXOPlayerSkyTvActivity.this.E2();
            }
        }

        public e0() {
        }

        public /* synthetic */ e0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, k kVar) {
            this();
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void C(boolean z) {
            c2.u(this, z);
        }

        @Override // c.f.a.b.b3.f
        public /* synthetic */ void D(c.f.a.b.b3.a aVar) {
            c2.k(this, aVar);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void E(a2 a2Var, a2.d dVar) {
            c2.f(this, a2Var, dVar);
        }

        @Override // c.f.a.b.w2.c
        public /* synthetic */ void G(int i2, boolean z) {
            c2.e(this, i2, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void H(boolean z, int i2) {
            b2.k(this, z, i2);
        }

        @Override // c.f.a.b.t2.r
        public /* synthetic */ void J(c.f.a.b.t2.p pVar) {
            c2.a(this, pVar);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void L(int i2, int i3, int i4, float f2) {
            c.f.a.b.k3.a0.a(this, i2, i3, i4, f2);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void N() {
            c2.s(this);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void O(p1 p1Var, int i2) {
            c2.i(this, p1Var, i2);
        }

        @Override // c.f.a.b.f3.l
        public /* synthetic */ void Q(List list) {
            c2.c(this, list);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void Z(boolean z, int i2) {
            c2.l(this, z, i2);
        }

        @Override // c.f.a.b.t2.r
        public /* synthetic */ void a(boolean z) {
            c2.v(this, z);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void b(c.f.a.b.k3.e0 e0Var) {
            c2.z(this, e0Var);
        }

        @Override // c.f.a.b.a2.c
        public void b0(a1 a1Var, c.f.a.b.g3.l lVar) {
            try {
                j.a aVarG = NSTEXOPlayerSkyTvActivity.this.x3.g();
                if (aVarG != null) {
                    aVarG.i(2);
                    aVarG.i(1);
                }
            } catch (Exception unused) {
            }
        }

        public final void c() {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
            if (nSTEXOPlayerSkyTvActivity.A3 >= nSTEXOPlayerSkyTvActivity.B3) {
                e(NSTEXOPlayerSkyTvActivity.this.f28731k.getResources().getString(R.string.small_problem));
                NSTEXOPlayerSkyTvActivity.this.V2();
                NSTEXOPlayerSkyTvActivity.this.C3 = false;
                NSTEXOPlayerSkyTvActivity.f28730j.setVisibility(8);
                return;
            }
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
            if (nSTEXOPlayerSkyTvActivity2.D3) {
                return;
            }
            nSTEXOPlayerSkyTvActivity2.C3 = true;
            nSTEXOPlayerSkyTvActivity2.H1.postDelayed(new a(), 3000L);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void d(z1 z1Var) {
            c2.m(this, z1Var);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void d0(int i2, int i3) {
            c2.w(this, i2, i3);
        }

        public final void e(String str) {
            NSTEXOPlayerSkyTvActivity.this.t.setVisibility(0);
            NSTEXOPlayerSkyTvActivity.this.u.setText(str);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void f(a2.f fVar, a2.f fVar2, int i2) {
            c2.r(this, fVar, fVar2, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void g(int i2) {
            c2.o(this, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void h(boolean z) {
            b2.d(this, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void h0(x1 x1Var) {
            c2.q(this, x1Var);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void i(int i2) {
            b2.l(this, i2);
        }

        @Override // c.f.a.b.w2.c
        public /* synthetic */ void k0(c.f.a.b.w2.b bVar) {
            c2.d(this, bVar);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void l(List list) {
            b2.q(this, list);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void m0(boolean z) {
            c2.h(this, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void onRepeatModeChanged(int i2) {
            c2.t(this, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void p(boolean z) {
            c2.g(this, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void r() {
            b2.o(this);
        }

        @Override // c.f.a.b.a2.c
        public void s(x1 x1Var) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
            if (nSTEXOPlayerSkyTvActivity.D3) {
                return;
            }
            if (x1Var.f10319c == 1002) {
                nSTEXOPlayerSkyTvActivity.E2();
            } else if (!x1Var.toString().contains("com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException")) {
                c();
            } else {
                c.h.a.h.n.e.l0(NSTEXOPlayerSkyTvActivity.this.f28731k, "Audio track issue found. Please change the audio track to none.");
                NSTEXOPlayerSkyTvActivity.this.E2();
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void t(a2.b bVar) {
            c2.b(this, bVar);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void v(p2 p2Var, int i2) {
            c2.x(this, p2Var, i2);
        }

        @Override // c.f.a.b.a2.c
        public void x(int i2) {
            if (i2 == 2) {
                if (NSTEXOPlayerSkyTvActivity.g2()) {
                    return;
                }
                LinearLayout linearLayout = NSTEXOPlayerSkyTvActivity.this.ll_pause_play;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    NSTEXOPlayerSkyTvActivity.this.ll_pause_play.setVisibility(8);
                }
                NSTEXOPlayerSkyTvActivity.f28730j.setVisibility(0);
                return;
            }
            if (i2 == 4) {
                c();
                return;
            }
            if (i2 == 3) {
                if (NSTEXOPlayerSkyTvActivity.this.ll_player_header_footer.getVisibility() == 0) {
                    NSTEXOPlayerSkyTvActivity.this.ll_pause_play.setVisibility(0);
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity.A3 = 0;
                nSTEXOPlayerSkyTvActivity.f28733m.setVisibility(8);
                NSTEXOPlayerSkyTvActivity.this.f28734n.setVisibility(0);
                if (NSTEXOPlayerSkyTvActivity.f28726f) {
                    NSTEXOPlayerSkyTvActivity.this.f28734n.requestFocus();
                }
                NSTEXOPlayerSkyTvActivity.f28730j.setVisibility(8);
                c.h.a.i.q.f fVar = NSTEXOPlayerSkyTvActivity.this.U;
                if (fVar != null) {
                    fVar.L0(c.h.a.k.e.a.f().h());
                    NSTEXOPlayerSkyTvActivity.this.U.t(c.h.a.k.e.a.f().h());
                    NSTEXOPlayerSkyTvActivity.this.U.G0();
                }
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void z(q1 q1Var) {
            c2.j(this, q1Var);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.z2();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class f0 extends AsyncTask<String, Void, HashMap<String, ArrayList<String>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28753a;

        public f0(String str) {
            this.f28753a = str;
        }

        public /* synthetic */ f0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, String str, k kVar) {
            this(str);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap<String, ArrayList<String>> doInBackground(String... strArr) {
            try {
                return NSTEXOPlayerSkyTvActivity.this.d3(this.f28753a);
            } catch (Exception unused) {
                return new HashMap<>();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:55:0x0135
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r12) {
            /*
                Method dump skipped, instruction units count: 949
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.f0.onPostExecute(java.util.HashMap):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                NSTEXOPlayerSkyTvActivity.this.L2();
                LinearLayout linearLayout = NSTEXOPlayerSkyTvActivity.this.r1;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = NSTEXOPlayerSkyTvActivity.this.t1;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                LinearLayout linearLayout3 = NSTEXOPlayerSkyTvActivity.this.u1;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = NSTEXOPlayerSkyTvActivity.this.v1;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                LinearLayout linearLayout5 = NSTEXOPlayerSkyTvActivity.this.w1;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                LinearLayout linearLayout6 = NSTEXOPlayerSkyTvActivity.this.x1;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity.this.y2();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class g0 extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f28758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f28759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f28760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f28761f;

        public g0(String str, int i2, String str2, String str3, String str4, int i3) {
            this.f28756a = str;
            this.f28757b = i2;
            this.f28758c = str2;
            this.f28759d = str3;
            this.f28760e = str4;
            this.f28761f = i3;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity.f28731k == null || nSTEXOPlayerSkyTvActivity.d3 == null || NSTEXOPlayerSkyTvActivity.this.B1 == null || NSTEXOPlayerSkyTvActivity.this.b3 == null || NSTEXOPlayerSkyTvActivity.this.N == null) {
                    return null;
                }
                c.h.a.i.b bVar = new c.h.a.i.b();
                bVar.h(this.f28756a);
                bVar.m(this.f28757b);
                bVar.l(this.f28759d);
                bVar.k(this.f28758c);
                bVar.o(c.h.a.i.q.m.z(NSTEXOPlayerSkyTvActivity.this.f28731k));
                NSTEXOPlayerSkyTvActivity.this.B1.i(bVar, this.f28760e);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r3) {
            super.onPostExecute(r3);
            try {
                View childAt = NSTEXOPlayerSkyTvActivity.this.N.getChildAt(this.f28761f - NSTEXOPlayerSkyTvActivity.this.N.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(R.id.iv_favourite)).setVisibility(0);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                NSTEXOPlayerSkyTvActivity.this.b3.y(1);
                NSTEXOPlayerSkyTvActivity.this.C2();
            } catch (Exception unused) {
                NSTEXOPlayerSkyTvActivity.this.C2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTEXOPlayerSkyTvActivity.this.v2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity.v2 = NSTEXOPlayerSkyTvActivity.j2(nSTEXOPlayerSkyTvActivity.f28731k);
                if (NSTEXOPlayerSkyTvActivity.this.v2 == null) {
                    return;
                }
            } else if (NSTEXOPlayerSkyTvActivity.this.v2.isShowing()) {
                return;
            }
            NSTEXOPlayerSkyTvActivity.this.v2.show();
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

    @SuppressLint({"StaticFieldLeak"})
    public class h0 extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f28765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f28766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f28767d;

        public h0(String str, String str2, String str3, int i2) {
            this.f28764a = str;
            this.f28765b = str2;
            this.f28766c = str3;
            this.f28767d = i2;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity.f28731k == null || nSTEXOPlayerSkyTvActivity.d3 == null) {
                    return null;
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity2.U == null || nSTEXOPlayerSkyTvActivity2.b3 == null || NSTEXOPlayerSkyTvActivity.this.N == null) {
                    return null;
                }
                c.h.a.i.c cVar = new c.h.a.i.c();
                cVar.h(this.f28765b);
                cVar.i(c.h.a.i.q.m.z(NSTEXOPlayerSkyTvActivity.this.f28731k));
                cVar.g(this.f28766c);
                cVar.e(this.f28764a);
                NSTEXOPlayerSkyTvActivity.this.U.Q(cVar);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r3) {
            super.onPostExecute(r3);
            try {
                View childAt = NSTEXOPlayerSkyTvActivity.this.N.getChildAt(this.f28767d - NSTEXOPlayerSkyTvActivity.this.N.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(R.id.iv_favourite)).setVisibility(0);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                NSTEXOPlayerSkyTvActivity.this.b3.y(1);
                NSTEXOPlayerSkyTvActivity.this.C2();
            } catch (Exception unused) {
                NSTEXOPlayerSkyTvActivity.this.C2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTEXOPlayerSkyTvActivity.this.v2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity.v2 = NSTEXOPlayerSkyTvActivity.j2(nSTEXOPlayerSkyTvActivity.f28731k);
                if (NSTEXOPlayerSkyTvActivity.this.v2 == null) {
                    return;
                }
            } else if (NSTEXOPlayerSkyTvActivity.this.v2.isShowing()) {
                return;
            }
            NSTEXOPlayerSkyTvActivity.this.v2.show();
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(NSTEXOPlayerSkyTvActivity.this.f28731k);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class i0 extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f28772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f28773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f28774e;

        public i0(String str, int i2, String str2, String str3, int i3) {
            this.f28770a = str;
            this.f28771b = i2;
            this.f28772c = str2;
            this.f28773d = str3;
            this.f28774e = i3;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity.f28731k == null || nSTEXOPlayerSkyTvActivity.d3 == null || NSTEXOPlayerSkyTvActivity.this.B1 == null || NSTEXOPlayerSkyTvActivity.this.b3 == null || NSTEXOPlayerSkyTvActivity.this.N == null) {
                    return null;
                }
                NSTEXOPlayerSkyTvActivity.this.B1.o(this.f28771b, this.f28770a, this.f28773d, this.f28772c, c.h.a.i.q.m.z(NSTEXOPlayerSkyTvActivity.this.f28731k));
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r3) {
            super.onPostExecute(r3);
            try {
                View childAt = NSTEXOPlayerSkyTvActivity.this.N.getChildAt(this.f28774e - NSTEXOPlayerSkyTvActivity.this.N.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(R.id.iv_favourite)).setVisibility(4);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                NSTEXOPlayerSkyTvActivity.this.b3.y(1);
                NSTEXOPlayerSkyTvActivity.this.C2();
            } catch (Exception unused) {
                NSTEXOPlayerSkyTvActivity.this.C2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTEXOPlayerSkyTvActivity.this.v2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity.v2 = NSTEXOPlayerSkyTvActivity.j2(nSTEXOPlayerSkyTvActivity.f28731k);
                if (NSTEXOPlayerSkyTvActivity.this.v2 == null) {
                    return;
                }
            } else if (NSTEXOPlayerSkyTvActivity.this.v2.isShowing()) {
                return;
            }
            NSTEXOPlayerSkyTvActivity.this.v2.show();
        }
    }

    public class j implements SearchView.l {
        public j() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            if (NSTEXOPlayerSkyTvActivity.this.d3 == null) {
                return false;
            }
            NSTEXOPlayerSkyTvActivity.this.d3.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class j0 extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28778b;

        public j0(String str, int i2) {
            this.f28777a = str;
            this.f28778b = i2;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity.f28731k == null || nSTEXOPlayerSkyTvActivity.d3 == null) {
                    return null;
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity2.U == null || nSTEXOPlayerSkyTvActivity2.b3 == null || NSTEXOPlayerSkyTvActivity.this.N == null) {
                    return null;
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity3.U.I0(this.f28777a, c.h.a.i.q.m.z(nSTEXOPlayerSkyTvActivity3.f28731k));
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r3) {
            super.onPostExecute(r3);
            try {
                View childAt = NSTEXOPlayerSkyTvActivity.this.N.getChildAt(this.f28778b - NSTEXOPlayerSkyTvActivity.this.N.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(R.id.iv_favourite)).setVisibility(4);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                NSTEXOPlayerSkyTvActivity.this.b3.y(1);
                NSTEXOPlayerSkyTvActivity.this.C2();
            } catch (Exception unused) {
                NSTEXOPlayerSkyTvActivity.this.C2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTEXOPlayerSkyTvActivity.this.v2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity.v2 = NSTEXOPlayerSkyTvActivity.j2(nSTEXOPlayerSkyTvActivity.f28731k);
                if (NSTEXOPlayerSkyTvActivity.this.v2 == null) {
                    return;
                }
            } else if (NSTEXOPlayerSkyTvActivity.this.v2.isShowing()) {
                return;
            }
            NSTEXOPlayerSkyTvActivity.this.v2.show();
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTEXOPlayerSkyTvActivity.this.n2();
        }
    }

    public class l extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f28781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f28782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f28783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f28784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f28785f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f28786g;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f28788b;

            public a(View view) {
                this.f28788b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f28788b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f28788b.getTag().equals("1")) {
                        View view3 = this.f28788b;
                        if (view3 == null || view3.getTag() == null || !this.f28788b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = l.this.f28786g;
                    }
                    linearLayout = l.this.f28785f;
                } else {
                    View view4 = this.f28788b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f28788b.getTag().equals("1")) {
                        View view5 = this.f28788b;
                        if (view5 == null || view5.getTag() == null || !this.f28788b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = l.this.f28786g;
                    }
                    linearLayout = l.this.f28785f;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public l(Activity activity) {
            super(activity);
            this.f28781b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
            } else if (id == R.id.btn_yes) {
                try {
                    if (NSTEXOPlayerSkyTvActivity.this.v2 == null) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity2.v2 = NSTEXOPlayerSkyTvActivity.j2(nSTEXOPlayerSkyTvActivity2.f28731k);
                        if (NSTEXOPlayerSkyTvActivity.this.v2 != null) {
                            nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity.v2.show();
                        }
                        NSTEXOPlayerSkyTvActivity.this.U.A0();
                        NSTEXOPlayerSkyTvActivity.this.K2("-6");
                        NSTEXOPlayerSkyTvActivity.this.b3.w();
                        NSTEXOPlayerSkyTvActivity.this.C2();
                    } else {
                        if (!NSTEXOPlayerSkyTvActivity.this.v2.isShowing()) {
                            nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity.v2.show();
                        }
                        NSTEXOPlayerSkyTvActivity.this.U.A0();
                        NSTEXOPlayerSkyTvActivity.this.K2("-6");
                        NSTEXOPlayerSkyTvActivity.this.b3.w();
                        NSTEXOPlayerSkyTvActivity.this.C2();
                    }
                } catch (Exception unused) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            try {
                super.onCreate(bundle);
                if (NSTEXOPlayerSkyTvActivity.this.J2.A().equals(c.h.a.h.n.a.s0)) {
                    setContentView(R.layout.custom_alert_layout_tv);
                } else {
                    setContentView(R.layout.custom_alert_layout);
                }
                this.f28782c = (TextView) findViewById(R.id.btn_yes);
                this.f28783d = (TextView) findViewById(R.id.btn_no);
                this.f28785f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
                this.f28786g = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
                TextView textView = (TextView) findViewById(R.id.txt_dia);
                this.f28784e = textView;
                textView.setText(NSTEXOPlayerSkyTvActivity.this.getResources().getString(R.string.you_want_to_remove_all_channels_from_recently_watched));
                this.f28782c.setOnClickListener(this);
                this.f28783d.setOnClickListener(this);
                TextView textView2 = this.f28782c;
                textView2.setOnFocusChangeListener(new a(textView2));
                TextView textView3 = this.f28783d;
                textView3.setOnFocusChangeListener(new a(textView3));
            } catch (Exception unused) {
            }
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            NSTEXOPlayerSkyTvActivity.this.V2();
            c.h.a.h.n.e.N(NSTEXOPlayerSkyTvActivity.this.f28731k);
        }
    }

    public class n implements DialogInterface.OnClickListener {
        public n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f28792b;

        public o(LinearLayout linearLayout) {
            this.f28792b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            this.f28792b.setVisibility(8);
            if (NSTEXOPlayerSkyTvActivity.this.ll_player_header_footer.getVisibility() != 0 || (linearLayout = NSTEXOPlayerSkyTvActivity.this.ll_pause_play) == null) {
                return;
            }
            linearLayout.setVisibility(0);
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                NSTEXOPlayerSkyTvActivity.this.i2 = Boolean.TRUE;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", NSTEXOPlayerSkyTvActivity.this.getPackageName(), null));
                NSTEXOPlayerSkyTvActivity.this.startActivityForResult(intent, 101);
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                Toast.makeText(nSTEXOPlayerSkyTvActivity, nSTEXOPlayerSkyTvActivity.f28731k.getResources().getString(R.string.grant_the_permission), 1).show();
            } catch (Exception unused) {
            }
            NSTEXOPlayerSkyTvActivity.this.j2.dismiss();
        }
    }

    public class q extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f28795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f28796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f28797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f28798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f28799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f28800g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f28801h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f28803b;

            public a(View view) {
                this.f28803b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f28803b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f28803b.getTag().equals("1")) {
                        View view3 = this.f28803b;
                        if (view3 == null || view3.getTag() == null || !this.f28803b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = q.this.f28799f;
                    }
                    linearLayout = q.this.f28798e;
                } else {
                    View view4 = this.f28803b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f28803b.getTag().equals("1")) {
                        View view5 = this.f28803b;
                        if (view5 == null || view5.getTag() == null || !this.f28803b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = q.this.f28799f;
                    }
                    linearLayout = q.this.f28798e;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Activity activity, Activity activity2) {
            super(activity);
            this.f28801h = activity2;
            this.f28795b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
            } else if (id == R.id.btn_yes) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f28800g.getCheckedRadioButtonId());
                    c.h.a.i.q.m.T(radioButton.getText().toString().equals(this.f28801h.getResources().getString(R.string.sort_last_added)) ? "1" : radioButton.getText().toString().equals(this.f28801h.getResources().getString(R.string.sort_atoz)) ? "2" : radioButton.getText().toString().equals(this.f28801h.getResources().getString(R.string.sort_ztoa)) ? "3" : radioButton.getText().toString().equals(this.f28801h.getResources().getString(R.string.sort_channel_number_asc)) ? "4" : radioButton.getText().toString().equals(this.f28801h.getResources().getString(R.string.sort_channel_number_decs)) ? "5" : "0", this.f28801h);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity.K2(nSTEXOPlayerSkyTvActivity.P2);
                    dismiss();
                } catch (Exception unused) {
                }
            }
            dismiss();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
        @Override // android.app.Dialog
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCreate(android.os.Bundle r14) {
            /*
                Method dump skipped, instruction units count: 294
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.q.onCreate(android.os.Bundle):void");
        }
    }

    public class r implements View.OnClickListener {
        public r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTEXOPlayerSkyTvActivity.this.j2.dismiss();
        }
    }

    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(NSTEXOPlayerSkyTvActivity.this.f28731k);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = NSTEXOPlayerSkyTvActivity.this.G1;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = NSTEXOPlayerSkyTvActivity.this.E1;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class t implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28807b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity.this.y2();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity.this.b3(BuildConfig.FLAVOR, false);
                NSTEXOPlayerSkyTvActivity.this.t3 = Boolean.TRUE;
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity.this.b3(BuildConfig.FLAVOR, false);
                NSTEXOPlayerSkyTvActivity.this.t3 = Boolean.TRUE;
            }
        }

        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity.this.b3(BuildConfig.FLAVOR, false);
                NSTEXOPlayerSkyTvActivity.this.t3 = Boolean.TRUE;
            }
        }

        public class e implements Runnable {
            public e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity.this.b3(BuildConfig.FLAVOR, false);
                NSTEXOPlayerSkyTvActivity.this.t3 = Boolean.TRUE;
            }
        }

        public t(ArrayList arrayList) {
            this.f28807b = arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:157:0x0a90  */
        @Override // android.widget.AdapterView.OnItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemClick(android.widget.AdapterView<?> r18, android.view.View r19, int r20, long r21) {
            /*
                Method dump skipped, instruction units count: 2842
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.t.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    public class u implements AdapterView.OnItemSelectedListener {
        public u() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            AsyncTask<String, Void, HashMap<String, ArrayList<String>>> asyncTaskExecute;
            try {
                if (NSTEXOPlayerSkyTvActivity.this.u2 != null && NSTEXOPlayerSkyTvActivity.this.u2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    NSTEXOPlayerSkyTvActivity.this.u2.cancel(true);
                }
                ArrayList<c.h.a.i.f> arrayListG = NSTEXOPlayerSkyTvActivity.this.d3.g();
                k kVar = null;
                if (arrayListG != null && arrayListG.size() > 0) {
                    String strI = arrayListG.get(i2).I();
                    NSTEXOPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                    nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    asyncTaskExecute = new f0(NSTEXOPlayerSkyTvActivity.this, strI, kVar).execute(new String[0]);
                } else {
                    if (NSTEXOPlayerSkyTvActivity.this.x0 == null || NSTEXOPlayerSkyTvActivity.this.x0.size() <= 0) {
                        return;
                    }
                    String strI2 = ((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).I();
                    NSTEXOPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                    nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    asyncTaskExecute = new f0(NSTEXOPlayerSkyTvActivity.this, strI2, kVar).execute(new String[0]);
                }
                nSTEXOPlayerSkyTvActivity.u2 = asyncTaskExecute;
            } catch (Exception unused) {
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class v implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28815b;

        public v(ArrayList arrayList) {
            this.f28815b = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            LinearLayout linearLayout = NSTEXOPlayerSkyTvActivity.this.ll_click_to_play;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            try {
                if (NSTEXOPlayerSkyTvActivity.this.u2 != null && NSTEXOPlayerSkyTvActivity.this.u2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    NSTEXOPlayerSkyTvActivity.this.u2.cancel(true);
                }
                c.h.a.h.n.a.G = Boolean.TRUE;
                ArrayList<c.h.a.i.f> arrayListG = NSTEXOPlayerSkyTvActivity.this.d3.g();
                if (arrayListG == null || arrayListG.size() <= 0) {
                    if (NSTEXOPlayerSkyTvActivity.this.x0 == null || NSTEXOPlayerSkyTvActivity.this.x0.size() <= 0) {
                        return;
                    }
                    c.h.a.h.n.e.S(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).P());
                    String strI = ((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).I();
                    String strX = ((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).X();
                    String strE0 = ((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).e0();
                    if (NSTEXOPlayerSkyTvActivity.this.c2.equals("m3u")) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                        if (!nSTEXOPlayerSkyTvActivity2.A1.equals(((c.h.a.i.f) nSTEXOPlayerSkyTvActivity2.x0.get(i2)).e0())) {
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity3.c1 = nSTEXOPlayerSkyTvActivity3.P2;
                            NSTEXOPlayerSkyTvActivity.this.f2.setCurrentWindowIndex(i2);
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity4.N2 = c.h.a.h.n.e.S(((c.h.a.i.f) nSTEXOPlayerSkyTvActivity4.x0.get(i2)).P());
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity5.O2 = ((c.h.a.i.f) nSTEXOPlayerSkyTvActivity5.x0.get(i2)).g();
                            if (NSTEXOPlayerSkyTvActivity.this.z0 != null) {
                                NSTEXOPlayerSkyTvActivity.this.z0.clear();
                                NSTEXOPlayerSkyTvActivity.this.z0.addAll(this.f28815b);
                            }
                            NSTEXOPlayerSkyTvActivity.this.f2.setTitle(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).P() + " - " + ((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).getName());
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity6 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity6.A1 = ((c.h.a.i.f) nSTEXOPlayerSkyTvActivity6.x0.get(i2)).e0();
                            c.h.a.k.e.a.f().q(NSTEXOPlayerSkyTvActivity.this.A1);
                            if (!NSTEXOPlayerSkyTvActivity.this.c1.equals("-1") && !NSTEXOPlayerSkyTvActivity.this.c1.equals("0") && !NSTEXOPlayerSkyTvActivity.this.c1.equals("-6")) {
                                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity7 = NSTEXOPlayerSkyTvActivity.this;
                                nSTEXOPlayerSkyTvActivity7.c1 = ((c.h.a.i.f) nSTEXOPlayerSkyTvActivity7.x0.get(i2)).g();
                                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity8 = NSTEXOPlayerSkyTvActivity.this;
                                nSTEXOPlayerSkyTvActivity8.d1 = ((c.h.a.i.f) nSTEXOPlayerSkyTvActivity8.x0.get(i2)).B();
                                if (NSTEXOPlayerSkyTvActivity.this.d1.isEmpty()) {
                                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity9 = NSTEXOPlayerSkyTvActivity.this;
                                    nSTEXOPlayerSkyTvActivity9.d1 = nSTEXOPlayerSkyTvActivity9.d2(nSTEXOPlayerSkyTvActivity9.c1);
                                }
                            }
                            NSTEXOPlayerSkyTvActivity.this.R1 = i2;
                            NSTEXOPlayerSkyTvActivity.this.f2.B();
                            if (NSTEXOPlayerSkyTvActivity.this.l2.booleanValue()) {
                                NSTEXOPlayerSkyTvActivity.this.z3 = Uri.parse(strE0);
                                NSTEXOPlayerSkyTvActivity.this.f2.t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f28726f));
                                NSTEXOPlayerSkyTvActivity.this.E2();
                                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity10 = NSTEXOPlayerSkyTvActivity.this;
                                nSTEXOPlayerSkyTvActivity10.A3 = 0;
                                nSTEXOPlayerSkyTvActivity10.C3 = false;
                            }
                            NSTEXOPlayerSkyTvActivity.this.K1.removeCallbacksAndMessages(null);
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity11 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity11.K = strI;
                            nSTEXOPlayerSkyTvActivity11.L = strX;
                            nSTEXOPlayerSkyTvActivity11.f2.setCurrentEpgChannelID(NSTEXOPlayerSkyTvActivity.this.K);
                            NSTEXOPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTEXOPlayerSkyTvActivity.this.L);
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity12 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity12.n3(nSTEXOPlayerSkyTvActivity12.L);
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity13 = NSTEXOPlayerSkyTvActivity.this;
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity14 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity13.u2 = new f0(nSTEXOPlayerSkyTvActivity14, nSTEXOPlayerSkyTvActivity14.K, null).execute(new String[0]);
                            NSTEXOPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                            if (NSTEXOPlayerSkyTvActivity.this.C1 != null) {
                                NSTEXOPlayerSkyTvActivity.this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).e0()));
                                NSTEXOPlayerSkyTvActivity.this.C1.apply();
                            }
                            if (NSTEXOPlayerSkyTvActivity.this.D1 != null) {
                                NSTEXOPlayerSkyTvActivity.this.D1.putInt("currentlyPlayingVideoPosition", i2);
                                NSTEXOPlayerSkyTvActivity.this.D1.apply();
                            }
                            nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity.d3.notifyDataSetChanged();
                            return;
                        }
                        NSTEXOPlayerSkyTvActivity.this.n2();
                    }
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity15 = NSTEXOPlayerSkyTvActivity.this;
                    if (nSTEXOPlayerSkyTvActivity15.z1 != c.h.a.h.n.e.R(((c.h.a.i.f) nSTEXOPlayerSkyTvActivity15.x0.get(i2)).Y())) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity16 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity16.c1 = nSTEXOPlayerSkyTvActivity16.P2;
                        NSTEXOPlayerSkyTvActivity.this.f2.setCurrentWindowIndex(i2);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity17 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity17.N2 = c.h.a.h.n.e.S(((c.h.a.i.f) nSTEXOPlayerSkyTvActivity17.x0.get(i2)).P());
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity18 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity18.O2 = ((c.h.a.i.f) nSTEXOPlayerSkyTvActivity18.x0.get(i2)).g();
                        if (NSTEXOPlayerSkyTvActivity.this.z0 != null) {
                            NSTEXOPlayerSkyTvActivity.this.z0.clear();
                            NSTEXOPlayerSkyTvActivity.this.z0.addAll(this.f28815b);
                        }
                        NSTEXOPlayerSkyTvActivity.this.f2.setTitle(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).P() + " - " + ((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).getName());
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity19 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity19.z1 = c.h.a.h.n.e.R(((c.h.a.i.f) nSTEXOPlayerSkyTvActivity19.x0.get(i2)).Y());
                        c.h.a.k.e.a.f().q(String.valueOf(NSTEXOPlayerSkyTvActivity.this.z1));
                        if (!NSTEXOPlayerSkyTvActivity.this.c1.equals("-1") && !NSTEXOPlayerSkyTvActivity.this.c1.equals("0") && !NSTEXOPlayerSkyTvActivity.this.c1.equals("-6")) {
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity20 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity20.c1 = ((c.h.a.i.f) nSTEXOPlayerSkyTvActivity20.x0.get(i2)).g();
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity21 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity21.d1 = ((c.h.a.i.f) nSTEXOPlayerSkyTvActivity21.x0.get(i2)).B();
                            if (NSTEXOPlayerSkyTvActivity.this.d1.isEmpty()) {
                                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity22 = NSTEXOPlayerSkyTvActivity.this;
                                nSTEXOPlayerSkyTvActivity22.d1 = nSTEXOPlayerSkyTvActivity22.d2(nSTEXOPlayerSkyTvActivity22.c1);
                            }
                        }
                        NSTEXOPlayerSkyTvActivity.this.R1 = i2;
                        NSTEXOPlayerSkyTvActivity.this.f2.B();
                        if (NSTEXOPlayerSkyTvActivity.this.l2.booleanValue()) {
                            NSTEXOPlayerSkyTvActivity.this.z3 = Uri.parse(NSTEXOPlayerSkyTvActivity.this.f28732l + c.h.a.h.n.e.R(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).Y()) + NSTEXOPlayerSkyTvActivity.this.k0);
                            NSTEXOPlayerSkyTvActivity.this.f2.t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f28726f));
                            NSTEXOPlayerSkyTvActivity.this.E2();
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity23 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity23.A3 = 0;
                            nSTEXOPlayerSkyTvActivity23.C3 = false;
                        }
                        NSTEXOPlayerSkyTvActivity.this.K1.removeCallbacksAndMessages(null);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity24 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity24.K = strI;
                        nSTEXOPlayerSkyTvActivity24.L = strX;
                        nSTEXOPlayerSkyTvActivity24.f2.setCurrentEpgChannelID(NSTEXOPlayerSkyTvActivity.this.K);
                        NSTEXOPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTEXOPlayerSkyTvActivity.this.L);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity25 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity25.n3(nSTEXOPlayerSkyTvActivity25.L);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity26 = NSTEXOPlayerSkyTvActivity.this;
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity27 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity26.u2 = new f0(nSTEXOPlayerSkyTvActivity27, nSTEXOPlayerSkyTvActivity27.K, null).execute(new String[0]);
                        NSTEXOPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                        if (NSTEXOPlayerSkyTvActivity.this.C1 != null) {
                            NSTEXOPlayerSkyTvActivity.this.C1.putString("currentlyPlayingVideo", String.valueOf(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).Y()));
                            NSTEXOPlayerSkyTvActivity.this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).e0()));
                            NSTEXOPlayerSkyTvActivity.this.C1.apply();
                        }
                        if (NSTEXOPlayerSkyTvActivity.this.D1 != null) {
                            NSTEXOPlayerSkyTvActivity.this.D1.putInt("currentlyPlayingVideoPosition", i2);
                            NSTEXOPlayerSkyTvActivity.this.D1.apply();
                        }
                        nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity.d3.notifyDataSetChanged();
                        return;
                    }
                    NSTEXOPlayerSkyTvActivity.this.n2();
                }
                int iS = c.h.a.h.n.e.S(arrayListG.get(i2).P());
                String strI2 = arrayListG.get(i2).I();
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity28 = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity28.s2(nSTEXOPlayerSkyTvActivity28.x0, iS);
                String strE02 = arrayListG.get(i2).e0();
                if (NSTEXOPlayerSkyTvActivity.this.c2.equals("m3u")) {
                    if (!NSTEXOPlayerSkyTvActivity.this.A1.equals(arrayListG.get(i2).e0())) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity29 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity29.c1 = nSTEXOPlayerSkyTvActivity29.P2;
                        NSTEXOPlayerSkyTvActivity.this.f2.setCurrentWindowIndex(i2);
                        NSTEXOPlayerSkyTvActivity.this.N2 = c.h.a.h.n.e.S(arrayListG.get(i2).P());
                        NSTEXOPlayerSkyTvActivity.this.O2 = arrayListG.get(i2).g();
                        if (NSTEXOPlayerSkyTvActivity.this.z0 != null) {
                            NSTEXOPlayerSkyTvActivity.this.z0.clear();
                            NSTEXOPlayerSkyTvActivity.this.z0.addAll(this.f28815b);
                        }
                        NSTEXOPlayerSkyTvActivity.this.f2.setTitle(arrayListG.get(i2).P() + " - " + arrayListG.get(i2).getName());
                        NSTEXOPlayerSkyTvActivity.this.A1 = arrayListG.get(i2).e0();
                        c.h.a.k.e.a.f().q(NSTEXOPlayerSkyTvActivity.this.A1);
                        if (!NSTEXOPlayerSkyTvActivity.this.c1.equals("-1") && !NSTEXOPlayerSkyTvActivity.this.c1.equals("0") && !NSTEXOPlayerSkyTvActivity.this.c1.equals("-6")) {
                            NSTEXOPlayerSkyTvActivity.this.c1 = arrayListG.get(i2).g();
                            NSTEXOPlayerSkyTvActivity.this.d1 = arrayListG.get(i2).B();
                            if (NSTEXOPlayerSkyTvActivity.this.d1.isEmpty()) {
                                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity30 = NSTEXOPlayerSkyTvActivity.this;
                                nSTEXOPlayerSkyTvActivity30.d1 = nSTEXOPlayerSkyTvActivity30.d2(nSTEXOPlayerSkyTvActivity30.c1);
                            }
                        }
                        String strX2 = arrayListG.get(i2).X();
                        try {
                            if (strX2.equals(BuildConfig.FLAVOR) || strX2.isEmpty()) {
                                NSTEXOPlayerSkyTvActivity.this.v.setImageDrawable(NSTEXOPlayerSkyTvActivity.this.f28731k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                            } else {
                                c.k.b.t.q(NSTEXOPlayerSkyTvActivity.this.f28731k).l(strX2).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(NSTEXOPlayerSkyTvActivity.this.v);
                            }
                        } catch (Exception unused) {
                            NSTEXOPlayerSkyTvActivity.this.v.setImageDrawable(NSTEXOPlayerSkyTvActivity.this.f28731k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                        }
                        NSTEXOPlayerSkyTvActivity.this.K1.removeCallbacksAndMessages(null);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity31 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity31.K = strI2;
                        nSTEXOPlayerSkyTvActivity31.L = strX2;
                        nSTEXOPlayerSkyTvActivity31.f2.setCurrentEpgChannelID(NSTEXOPlayerSkyTvActivity.this.K);
                        NSTEXOPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTEXOPlayerSkyTvActivity.this.L);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity32 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity32.n3(nSTEXOPlayerSkyTvActivity32.L);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity33 = NSTEXOPlayerSkyTvActivity.this;
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity34 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity33.u2 = new f0(nSTEXOPlayerSkyTvActivity34, nSTEXOPlayerSkyTvActivity34.K, null).execute(new String[0]);
                        NSTEXOPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                        NSTEXOPlayerSkyTvActivity.this.R1 = i2;
                        NSTEXOPlayerSkyTvActivity.this.f2.B();
                        if (NSTEXOPlayerSkyTvActivity.this.l2.booleanValue()) {
                            NSTEXOPlayerSkyTvActivity.this.z3 = Uri.parse(strE02);
                            NSTEXOPlayerSkyTvActivity.this.f2.t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f28726f));
                            NSTEXOPlayerSkyTvActivity.this.E2();
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity35 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity35.A3 = 0;
                            nSTEXOPlayerSkyTvActivity35.C3 = false;
                        }
                        if (NSTEXOPlayerSkyTvActivity.this.C1 != null) {
                            NSTEXOPlayerSkyTvActivity.this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayListG.get(i2).e0()));
                            NSTEXOPlayerSkyTvActivity.this.C1.apply();
                        }
                        if (NSTEXOPlayerSkyTvActivity.this.D1 != null) {
                            NSTEXOPlayerSkyTvActivity.this.D1.putInt("currentlyPlayingVideoPosition", i2);
                            NSTEXOPlayerSkyTvActivity.this.D1.apply();
                        }
                        nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity.d3.notifyDataSetChanged();
                        return;
                    }
                    NSTEXOPlayerSkyTvActivity.this.n2();
                }
                if (NSTEXOPlayerSkyTvActivity.this.z1 != c.h.a.h.n.e.R(arrayListG.get(i2).Y())) {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity36 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity36.c1 = nSTEXOPlayerSkyTvActivity36.P2;
                    NSTEXOPlayerSkyTvActivity.this.f2.setCurrentWindowIndex(i2);
                    NSTEXOPlayerSkyTvActivity.this.N2 = c.h.a.h.n.e.S(arrayListG.get(i2).P());
                    NSTEXOPlayerSkyTvActivity.this.O2 = arrayListG.get(i2).g();
                    if (NSTEXOPlayerSkyTvActivity.this.z0 != null) {
                        NSTEXOPlayerSkyTvActivity.this.z0.clear();
                        NSTEXOPlayerSkyTvActivity.this.z0.addAll(this.f28815b);
                    }
                    NSTEXOPlayerSkyTvActivity.this.f2.setTitle(arrayListG.get(i2).P() + " - " + arrayListG.get(i2).getName());
                    NSTEXOPlayerSkyTvActivity.this.z1 = c.h.a.h.n.e.R(arrayListG.get(i2).Y());
                    c.h.a.k.e.a.f().q(String.valueOf(NSTEXOPlayerSkyTvActivity.this.z1));
                    if (!NSTEXOPlayerSkyTvActivity.this.c1.equals("-1") && !NSTEXOPlayerSkyTvActivity.this.c1.equals("0") && !NSTEXOPlayerSkyTvActivity.this.c1.equals("-6")) {
                        NSTEXOPlayerSkyTvActivity.this.c1 = arrayListG.get(i2).g();
                        NSTEXOPlayerSkyTvActivity.this.d1 = arrayListG.get(i2).B();
                        if (NSTEXOPlayerSkyTvActivity.this.d1.isEmpty()) {
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity37 = NSTEXOPlayerSkyTvActivity.this;
                            nSTEXOPlayerSkyTvActivity37.d1 = nSTEXOPlayerSkyTvActivity37.d2(nSTEXOPlayerSkyTvActivity37.c1);
                        }
                    }
                    String strX3 = arrayListG.get(i2).X();
                    try {
                        if (strX3.equals(BuildConfig.FLAVOR) || strX3.isEmpty()) {
                            NSTEXOPlayerSkyTvActivity.this.v.setImageDrawable(NSTEXOPlayerSkyTvActivity.this.f28731k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                        } else {
                            c.k.b.t.q(NSTEXOPlayerSkyTvActivity.this.f28731k).l(strX3).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(NSTEXOPlayerSkyTvActivity.this.v);
                        }
                    } catch (Exception unused2) {
                        NSTEXOPlayerSkyTvActivity.this.v.setImageDrawable(NSTEXOPlayerSkyTvActivity.this.f28731k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                    }
                    NSTEXOPlayerSkyTvActivity.this.K1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity38 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity38.K = strI2;
                    nSTEXOPlayerSkyTvActivity38.L = strX3;
                    nSTEXOPlayerSkyTvActivity38.f2.setCurrentEpgChannelID(NSTEXOPlayerSkyTvActivity.this.K);
                    NSTEXOPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTEXOPlayerSkyTvActivity.this.L);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity39 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity39.n3(nSTEXOPlayerSkyTvActivity39.L);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity40 = NSTEXOPlayerSkyTvActivity.this;
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity41 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity40.u2 = new f0(nSTEXOPlayerSkyTvActivity41, nSTEXOPlayerSkyTvActivity41.K, null).execute(new String[0]);
                    NSTEXOPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyTvActivity.this.R1 = i2;
                    NSTEXOPlayerSkyTvActivity.this.f2.B();
                    if (NSTEXOPlayerSkyTvActivity.this.l2.booleanValue()) {
                        NSTEXOPlayerSkyTvActivity.this.z3 = Uri.parse(NSTEXOPlayerSkyTvActivity.this.f28732l + c.h.a.h.n.e.R(arrayListG.get(i2).Y()) + NSTEXOPlayerSkyTvActivity.this.k0);
                        NSTEXOPlayerSkyTvActivity.this.f2.t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f28726f));
                        NSTEXOPlayerSkyTvActivity.this.E2();
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity42 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity42.A3 = 0;
                        nSTEXOPlayerSkyTvActivity42.C3 = false;
                    }
                    if (NSTEXOPlayerSkyTvActivity.this.C1 != null) {
                        NSTEXOPlayerSkyTvActivity.this.C1.putString("currentlyPlayingVideo", String.valueOf(arrayListG.get(i2).Y()));
                        NSTEXOPlayerSkyTvActivity.this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayListG.get(i2).e0()));
                        NSTEXOPlayerSkyTvActivity.this.C1.apply();
                    }
                    if (NSTEXOPlayerSkyTvActivity.this.D1 != null) {
                        NSTEXOPlayerSkyTvActivity.this.D1.putInt("currentlyPlayingVideoPosition", i2);
                        NSTEXOPlayerSkyTvActivity.this.D1.apply();
                    }
                    nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity.d3.notifyDataSetChanged();
                    return;
                }
                NSTEXOPlayerSkyTvActivity.this.n2();
            } catch (Exception unused3) {
            }
        }
    }

    public class w implements AdapterView.OnItemLongClickListener {

        public class a implements PopupMenu.OnMenuItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f28818a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f28819b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f28820c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f28821d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f28822e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f28823f;

            /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a$a, reason: collision with other inner class name */
            public class DialogC0291a extends Dialog implements View.OnClickListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public Activity f28825b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public TextView f28826c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public TextView f28827d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public TextView f28828e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public LinearLayout f28829f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public LinearLayout f28830g;

                /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a$a$a, reason: collision with other inner class name */
                public class ViewOnFocusChangeListenerC0292a implements View.OnFocusChangeListener {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public View f28832b;

                    public ViewOnFocusChangeListenerC0292a(View view) {
                        this.f28832b = view;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    @SuppressLint({"ResourceType"})
                    public void onFocusChange(View view, boolean z) {
                        int i2;
                        LinearLayout linearLayout;
                        if (z) {
                            View view2 = this.f28832b;
                            i2 = R.drawable.blue_btn_effect;
                            if (view2 == null || view2.getTag() == null || !this.f28832b.getTag().equals("1")) {
                                View view3 = this.f28832b;
                                if (view3 == null || view3.getTag() == null || !this.f28832b.getTag().equals("2")) {
                                    return;
                                }
                                linearLayout = DialogC0291a.this.f28830g;
                            }
                            linearLayout = DialogC0291a.this.f28829f;
                        } else {
                            View view4 = this.f28832b;
                            i2 = R.drawable.black_button_dark;
                            if (view4 == null || view4.getTag() == null || !this.f28832b.getTag().equals("1")) {
                                View view5 = this.f28832b;
                                if (view5 == null || view5.getTag() == null || !this.f28832b.getTag().equals("2")) {
                                    return;
                                }
                                linearLayout = DialogC0291a.this.f28830g;
                            }
                            linearLayout = DialogC0291a.this.f28829f;
                        }
                        linearLayout.setBackgroundResource(i2);
                    }
                }

                public DialogC0291a(Activity activity) {
                    super(activity);
                    this.f28825b = activity;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:7:0x0010, B:9:0x001c, B:11:0x0037, B:12:0x003d, B:16:0x005c, B:18:0x006e, B:19:0x007c, B:21:0x008f, B:20:0x0080, B:13:0x0045, B:15:0x0055), top: B:27:0x0010 }] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:7:0x0010, B:9:0x001c, B:11:0x0037, B:12:0x003d, B:16:0x005c, B:18:0x006e, B:19:0x007c, B:21:0x008f, B:20:0x0080, B:13:0x0045, B:15:0x0055), top: B:27:0x0010 }] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r2) {
                    /*
                        r1 = this;
                        int r2 = r2.getId()
                        r0 = 2131427652(0x7f0b0144, float:1.8476926E38)
                        if (r2 == r0) goto Lb1
                        r0 = 2131427680(0x7f0b0160, float:1.8476983E38)
                        if (r2 == r0) goto L10
                        goto Lb4
                    L10:
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        android.app.ProgressDialog r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.a1(r2)     // Catch: java.lang.Exception -> Lb4
                        if (r2 != 0) goto L45
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        android.content.Context r0 = r2.f28731k     // Catch: java.lang.Exception -> Lb4
                        android.app.ProgressDialog r0 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.j2(r0)     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.b1(r2, r0)     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        android.app.ProgressDialog r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.a1(r2)     // Catch: java.lang.Exception -> Lb4
                        if (r2 == 0) goto L5c
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                    L3d:
                        android.app.ProgressDialog r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.a1(r2)     // Catch: java.lang.Exception -> Lb4
                        r2.show()     // Catch: java.lang.Exception -> Lb4
                        goto L5c
                    L45:
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        android.app.ProgressDialog r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.a1(r2)     // Catch: java.lang.Exception -> Lb4
                        boolean r2 = r2.isShowing()     // Catch: java.lang.Exception -> Lb4
                        if (r2 != 0) goto L5c
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        goto L3d
                    L5c:
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        java.lang.String r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.j1(r2)     // Catch: java.lang.Exception -> Lb4
                        java.lang.String r0 = "m3u"
                        boolean r2 = r2.equals(r0)     // Catch: java.lang.Exception -> Lb4
                        if (r2 == 0) goto L80
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        c.h.a.i.q.f r0 = r2.U     // Catch: java.lang.Exception -> Lb4
                        java.lang.String r2 = r2.J     // Catch: java.lang.Exception -> Lb4
                        java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> Lb4
                    L7c:
                        r0.L0(r2)     // Catch: java.lang.Exception -> Lb4
                        goto L8f
                    L80:
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        c.h.a.i.q.f r0 = r2.U     // Catch: java.lang.Exception -> Lb4
                        int r2 = r2.I     // Catch: java.lang.Exception -> Lb4
                        java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> Lb4
                        goto L7c
                    L8f:
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        java.lang.String r0 = "-6"
                        r2.K2(r0)     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        c.h.a.k.b.r r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.E1(r2)     // Catch: java.lang.Exception -> Lb4
                        r2.w()     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$w r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        r2.C2()     // Catch: java.lang.Exception -> Lb4
                        goto Lb4
                    Lb1:
                        r1.dismiss()
                    Lb4:
                        r1.dismiss()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.DialogC0291a.onClick(android.view.View):void");
                }

                @Override // android.app.Dialog
                public void onCreate(Bundle bundle) {
                    try {
                        super.onCreate(bundle);
                        if (NSTEXOPlayerSkyTvActivity.this.J2.A().equals(c.h.a.h.n.a.s0)) {
                            setContentView(R.layout.custom_alert_layout_tv);
                        } else {
                            setContentView(R.layout.custom_alert_layout);
                        }
                        this.f28826c = (TextView) findViewById(R.id.btn_yes);
                        this.f28827d = (TextView) findViewById(R.id.btn_no);
                        this.f28829f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
                        this.f28830g = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
                        TextView textView = (TextView) findViewById(R.id.txt_dia);
                        this.f28828e = textView;
                        textView.setText(NSTEXOPlayerSkyTvActivity.this.f28731k.getResources().getString(R.string.you_want_to_remove_this_channel_from_recently_watched));
                        this.f28826c.setOnClickListener(this);
                        this.f28827d.setOnClickListener(this);
                        TextView textView2 = this.f28826c;
                        textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0292a(textView2));
                        TextView textView3 = this.f28827d;
                        textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0292a(textView3));
                    } catch (Exception unused) {
                    }
                }
            }

            public a(String str, String str2, int i2, String str3, String str4, String str5) {
                this.f28818a = str;
                this.f28819b = str2;
                this.f28820c = i2;
                this.f28821d = str3;
                this.f28822e = str4;
                this.f28823f = str5;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
            
                r4 = r10.f28824g.f28817a;
                r4.y2 = true;
                r4.V2();
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            
                if (r10.f28824g.f28817a.c2.equals("m3u") == false) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                r4 = r10.f28824g.f28817a;
                r5 = r4.J;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
            
                r4.S = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
            
                r4 = r10.f28824g.f28817a;
                r5 = c.h.a.h.n.e.G(r4.f28731k, r4.I, r4.k0, "live");
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
            
                r4 = new android.content.Intent(r10.f28824g.f28817a.f28731k, (java.lang.Class<?>) com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity.class);
                r4.putExtra("url", r10.f28824g.f28817a.S);
                r4.putExtra("app_name", r10.f28824g.f28817a.M2.get(r3).a());
                r4.putExtra("packagename", r10.f28824g.f28817a.M2.get(r3).b());
                r10.f28824g.f28817a.f28731k.startActivity(r4);
             */
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onMenuItemClick(android.view.MenuItem r11) {
                /*
                    Method dump skipped, instruction units count: 396
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.w.a.onMenuItemClick(android.view.MenuItem):boolean");
            }
        }

        public class b implements PopupMenu.OnDismissListener {
            public b() {
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public void onDismiss(PopupMenu popupMenu) {
            }
        }

        public w() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            String strG;
            String strE0;
            String name;
            String strP;
            String strZ;
            int iR;
            Menu menu;
            Menu menu2;
            MenuItem item;
            try {
                if (NSTEXOPlayerSkyTvActivity.this.d3 != null) {
                    ArrayList<c.h.a.i.f> arrayListG = NSTEXOPlayerSkyTvActivity.this.d3.g();
                    if (arrayListG != null && arrayListG.size() > 0) {
                        strG = arrayListG.get(i2).g();
                        iR = c.h.a.h.n.e.R(arrayListG.get(i2).Y());
                        strE0 = arrayListG.get(i2).e0();
                        name = arrayListG.get(i2).getName();
                        strP = arrayListG.get(i2).P();
                        arrayListG.get(i2).X();
                        strZ = arrayListG.get(i2).Z();
                    } else if (NSTEXOPlayerSkyTvActivity.this.x0 == null || NSTEXOPlayerSkyTvActivity.this.x0.size() <= 0) {
                        strG = BuildConfig.FLAVOR;
                        strE0 = strG;
                        name = strE0;
                        strP = name;
                        strZ = strP;
                        iR = 0;
                    } else {
                        String strG2 = ((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).g();
                        iR = c.h.a.h.n.e.R(((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).Y());
                        String name2 = ((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).getName();
                        strE0 = ((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).e0();
                        String strP2 = ((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).P();
                        ((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).X();
                        strZ = ((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.x0.get(i2)).Z();
                        strP = strP2;
                        name = name2;
                        strG = strG2;
                    }
                    PopupMenu popupMenu = new PopupMenu(NSTEXOPlayerSkyTvActivity.this, view);
                    popupMenu.getMenuInflater().inflate(R.menu.menu_players_selection_with_fav, popupMenu.getMenu());
                    if (NSTEXOPlayerSkyTvActivity.this.P2.equals("-6")) {
                        popupMenu.getMenu().getItem(6).setVisible(true);
                    } else {
                        popupMenu.getMenu().getItem(6).setVisible(false);
                    }
                    if (NSTEXOPlayerSkyTvActivity.this.c2.equals("m3u")) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                        ArrayList<c.h.a.i.c> arrayListU = nSTEXOPlayerSkyTvActivity.U.U(strE0, c.h.a.i.q.m.z(nSTEXOPlayerSkyTvActivity.f28731k));
                        if (arrayListU == null || arrayListU.size() <= 0) {
                            menu = popupMenu.getMenu();
                            item = menu.getItem(2);
                        } else {
                            menu2 = popupMenu.getMenu();
                            item = menu2.getItem(3);
                        }
                    } else {
                        ArrayList<c.h.a.i.b> arrayListL = NSTEXOPlayerSkyTvActivity.this.B1.l(iR, strG, strZ, c.h.a.i.q.m.z(NSTEXOPlayerSkyTvActivity.this.f28731k));
                        if (arrayListL == null || arrayListL.size() <= 0) {
                            menu = popupMenu.getMenu();
                            item = menu.getItem(2);
                        } else {
                            menu2 = popupMenu.getMenu();
                            item = menu2.getItem(3);
                        }
                    }
                    item.setVisible(true);
                    NSTEXOPlayerSkyTvActivity.this.M2 = new ArrayList<>();
                    c.h.a.i.q.d dVar = new c.h.a.i.q.d(NSTEXOPlayerSkyTvActivity.this.f28731k);
                    NSTEXOPlayerSkyTvActivity.this.M2 = dVar.l();
                    try {
                        ArrayList<ExternalPlayerModelClass> arrayList = NSTEXOPlayerSkyTvActivity.this.M2;
                        if (arrayList != null && arrayList.size() > 0) {
                            for (int i3 = 0; i3 < NSTEXOPlayerSkyTvActivity.this.M2.size(); i3++) {
                                popupMenu.getMenu().add(0, i3, i3, NSTEXOPlayerSkyTvActivity.this.M2.get(i3).a());
                            }
                        }
                    } catch (Exception unused) {
                    }
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity2.I = iR;
                    nSTEXOPlayerSkyTvActivity2.J = strE0;
                    nSTEXOPlayerSkyTvActivity2.n2 = name.replaceAll(" ", "_").toLowerCase();
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity3.n2 = nSTEXOPlayerSkyTvActivity3.n2.replaceAll("[^a-zA-Z0-9]", BuildConfig.FLAVOR).toLowerCase();
                    popupMenu.setOnMenuItemClickListener(new a(strG, name, i2, strP, strZ, NSTEXOPlayerSkyTvActivity.this.n2));
                    popupMenu.setOnDismissListener(new b());
                    popupMenu.show();
                    return true;
                }
            } catch (Exception unused2) {
            }
            return false;
        }
    }

    public class x implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity.this.b3(BuildConfig.FLAVOR, false);
                NSTEXOPlayerSkyTvActivity.this.t3 = Boolean.TRUE;
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity.this.U1.setText(BuildConfig.FLAVOR);
                NSTEXOPlayerSkyTvActivity.this.T1.setVisibility(8);
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity.this.U1.setText(BuildConfig.FLAVOR);
                NSTEXOPlayerSkyTvActivity.this.T1.setVisibility(8);
            }
        }

        public x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<c.h.a.i.f> arrayListU1;
            Handler handler;
            Runnable cVar;
            boolean zU2;
            ArrayList<c.h.a.i.f> arrayListW0;
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
            nSTEXOPlayerSkyTvActivity.V0 = nSTEXOPlayerSkyTvActivity.S1.toString();
            NSTEXOPlayerSkyTvActivity.this.U1.setText(BuildConfig.FLAVOR);
            NSTEXOPlayerSkyTvActivity.this.T1.setVisibility(8);
            if (NSTEXOPlayerSkyTvActivity.this.m3.equals("true")) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = NSTEXOPlayerSkyTvActivity.this;
                arrayListU1 = nSTEXOPlayerSkyTvActivity2.U.u1(nSTEXOPlayerSkyTvActivity2.V0, "radio_streams");
            } else {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = NSTEXOPlayerSkyTvActivity.this;
                arrayListU1 = nSTEXOPlayerSkyTvActivity3.U.u1(nSTEXOPlayerSkyTvActivity3.V0, "live");
            }
            NSTEXOPlayerSkyTvActivity.this.S1.setLength(0);
            if (arrayListU1 == null || arrayListU1.size() == 0) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity4.U1.setText(nSTEXOPlayerSkyTvActivity4.f28731k.getResources().getString(R.string.no_channel_found));
                NSTEXOPlayerSkyTvActivity.this.T1.setVisibility(0);
                handler = new Handler();
                cVar = new c();
            } else {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = NSTEXOPlayerSkyTvActivity.this;
                if (nSTEXOPlayerSkyTvActivity5.U.I1(c.h.a.i.q.m.z(nSTEXOPlayerSkyTvActivity5.f28731k)) <= 0 || NSTEXOPlayerSkyTvActivity.this.D0 == null) {
                    zU2 = false;
                } else {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity6 = NSTEXOPlayerSkyTvActivity.this;
                    zU2 = nSTEXOPlayerSkyTvActivity6.u2(arrayListU1, nSTEXOPlayerSkyTvActivity6.D0);
                }
                if (!zU2) {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity7 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity7.T0 = true;
                    nSTEXOPlayerSkyTvActivity7.U0 = true;
                    nSTEXOPlayerSkyTvActivity7.c1 = "0";
                    nSTEXOPlayerSkyTvActivity7.d1 = nSTEXOPlayerSkyTvActivity7.f28731k.getResources().getString(R.string.all);
                    NSTEXOPlayerSkyTvActivity.this.m0 = 0;
                    String strP = arrayListU1.get(0).P();
                    String strY = arrayListU1.get(0).Y();
                    String name = arrayListU1.get(0).getName();
                    String strI = arrayListU1.get(0).I();
                    String strX = arrayListU1.get(0).X();
                    String strE0 = arrayListU1.get(0).e0();
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity8 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity8.A1 = strE0;
                    nSTEXOPlayerSkyTvActivity8.N2 = c.h.a.h.n.e.S(nSTEXOPlayerSkyTvActivity8.V0);
                    NSTEXOPlayerSkyTvActivity.this.O2 = "0";
                    NSTEXOPlayerSkyTvActivity.this.f2.setTitle(NSTEXOPlayerSkyTvActivity.this.V0 + " - " + name);
                    if (NSTEXOPlayerSkyTvActivity.this.m3.equals("true")) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity9 = NSTEXOPlayerSkyTvActivity.this;
                        arrayListW0 = nSTEXOPlayerSkyTvActivity9.U.W0(nSTEXOPlayerSkyTvActivity9.c1, "radio_streams");
                    } else {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity10 = NSTEXOPlayerSkyTvActivity.this;
                        arrayListW0 = nSTEXOPlayerSkyTvActivity10.U.W0(nSTEXOPlayerSkyTvActivity10.c1, "live");
                    }
                    if (arrayListW0 != null) {
                        NSTEXOPlayerSkyTvActivity.this.v0.clear();
                    }
                    NSTEXOPlayerSkyTvActivity.this.v0 = arrayListW0;
                    if (NSTEXOPlayerSkyTvActivity.this.v0 != null && NSTEXOPlayerSkyTvActivity.this.v0.size() > 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= NSTEXOPlayerSkyTvActivity.this.v0.size()) {
                                break;
                            }
                            if (((c.h.a.i.f) NSTEXOPlayerSkyTvActivity.this.v0.get(i2)).P().equals(strP)) {
                                NSTEXOPlayerSkyTvActivity.this.f2.setCurrentWindowIndex(i2);
                                break;
                            }
                            i2++;
                        }
                    }
                    try {
                        if (strX.equals(BuildConfig.FLAVOR) || strX.isEmpty()) {
                            NSTEXOPlayerSkyTvActivity.this.v.setImageDrawable(NSTEXOPlayerSkyTvActivity.this.f28731k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                        } else {
                            c.k.b.t.q(NSTEXOPlayerSkyTvActivity.this.f28731k).l(strX).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).k(80, 55).g(NSTEXOPlayerSkyTvActivity.this.v);
                        }
                    } catch (Exception unused) {
                        NSTEXOPlayerSkyTvActivity.this.v.setImageDrawable(NSTEXOPlayerSkyTvActivity.this.f28731k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                    }
                    NSTEXOPlayerSkyTvActivity.this.f2.B();
                    k kVar = null;
                    if (NSTEXOPlayerSkyTvActivity.this.l2.booleanValue()) {
                        if (NSTEXOPlayerSkyTvActivity.this.c2.equals("m3u")) {
                            NSTEXOPlayerSkyTvActivity.this.z3 = Uri.parse(strE0);
                            NSTEXOPlayerSkyTvActivity.this.f2.t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f28726f));
                            c.h.a.k.e.a.f().q(NSTEXOPlayerSkyTvActivity.this.A1);
                        } else {
                            NSTEXOPlayerSkyTvActivity.this.z3 = Uri.parse(strE0);
                            NSTEXOPlayerSkyTvActivity.this.f2.t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f28726f));
                            c.h.a.k.e.a.f().q(strY);
                        }
                        NSTEXOPlayerSkyTvActivity.this.E2();
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity11 = NSTEXOPlayerSkyTvActivity.this;
                        nSTEXOPlayerSkyTvActivity11.A3 = 0;
                        nSTEXOPlayerSkyTvActivity11.C3 = false;
                        nSTEXOPlayerSkyTvActivity11.t3 = Boolean.FALSE;
                        NSTEXOPlayerSkyTvActivity.this.M1.removeCallbacksAndMessages(null);
                        NSTEXOPlayerSkyTvActivity.this.M1.postDelayed(new a(), 5000L);
                        NSTEXOPlayerSkyTvActivity.this.k3();
                        NSTEXOPlayerSkyTvActivity.this.e3();
                        NSTEXOPlayerSkyTvActivity.this.b2(5000);
                    }
                    NSTEXOPlayerSkyTvActivity.this.K1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity12 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity12.K = strI;
                    nSTEXOPlayerSkyTvActivity12.L = strX;
                    nSTEXOPlayerSkyTvActivity12.f2.setCurrentEpgChannelID(NSTEXOPlayerSkyTvActivity.this.K);
                    NSTEXOPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTEXOPlayerSkyTvActivity.this.L);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity13 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity13.n3(nSTEXOPlayerSkyTvActivity13.L);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity14 = NSTEXOPlayerSkyTvActivity.this;
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity15 = NSTEXOPlayerSkyTvActivity.this;
                    nSTEXOPlayerSkyTvActivity14.u2 = new f0(nSTEXOPlayerSkyTvActivity15, nSTEXOPlayerSkyTvActivity15.K, kVar).execute(new String[0]);
                    NSTEXOPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyTvActivity.this.z1 = c.h.a.h.n.e.R(strY);
                    if (NSTEXOPlayerSkyTvActivity.this.C1 != null) {
                        NSTEXOPlayerSkyTvActivity.this.C1.putString("currentlyPlayingVideo", strY);
                        NSTEXOPlayerSkyTvActivity.this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", strE0);
                        NSTEXOPlayerSkyTvActivity.this.C1.apply();
                    }
                    arrayListU1.clear();
                    return;
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity16 = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity16.U1.setText(nSTEXOPlayerSkyTvActivity16.f28731k.getResources().getString(R.string.no_channel_found));
                NSTEXOPlayerSkyTvActivity.this.T1.setVisibility(0);
                handler = new Handler();
                cVar = new b();
            }
            handler.postDelayed(cVar, 1000L);
        }
    }

    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    NSTEXOPlayerSkyTvActivity.this.l2();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class z extends AsyncTask<String, Void, Boolean> {
        public z() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(NSTEXOPlayerSkyTvActivity.this.D2());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            NSTEXOPlayerSkyTvActivity.this.b3(BuildConfig.FLAVOR, true);
            NSTEXOPlayerSkyTvActivity.this.t3 = Boolean.TRUE;
            if (NSTEXOPlayerSkyTvActivity.this.f2 != null) {
                NSTEXOPlayerSkyTvActivity.this.f2.setEPGHandler(NSTEXOPlayerSkyTvActivity.this.K1);
                NSTEXOPlayerSkyTvActivity.this.f2.setContext(NSTEXOPlayerSkyTvActivity.this.f28731k);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTEXOPlayerSkyTvActivity.this.v2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = NSTEXOPlayerSkyTvActivity.this;
                nSTEXOPlayerSkyTvActivity.v2 = NSTEXOPlayerSkyTvActivity.j2(nSTEXOPlayerSkyTvActivity.f28731k);
                if (NSTEXOPlayerSkyTvActivity.this.v2 == null) {
                    return;
                }
            } else if (NSTEXOPlayerSkyTvActivity.this.v2.isShowing()) {
                return;
            }
            NSTEXOPlayerSkyTvActivity.this.v2.show();
        }
    }

    public NSTEXOPlayerSkyTvActivity() {
        Boolean bool = Boolean.FALSE;
        this.W1 = bool;
        this.X1 = bool;
        this.b2 = BuildConfig.FLAVOR;
        this.h2 = BuildConfig.FLAVOR;
        this.i2 = bool;
        this.k2 = BuildConfig.FLAVOR;
        Boolean bool2 = Boolean.TRUE;
        this.l2 = bool2;
        this.m2 = null;
        this.o2 = -1;
        this.p2 = 0;
        this.q2 = BuildConfig.FLAVOR;
        this.r2 = bool2;
        this.s2 = null;
        this.t2 = null;
        this.u2 = null;
        this.w2 = false;
        this.x2 = 0;
        this.y2 = false;
        this.z2 = 4;
        this.A2 = f28729i[0];
        this.D2 = bool;
        this.E2 = bool;
        this.F2 = bool;
        this.G2 = bool;
        this.H2 = bool;
        this.I2 = bool;
        this.N2 = 0;
        this.O2 = "0";
        this.P2 = "0";
        this.Q2 = bool2;
        this.a3 = "mobile";
        this.h3 = 0;
        this.k3 = BuildConfig.FLAVOR;
        this.l3 = "false";
        this.m3 = "false";
        this.n3 = "-10";
        this.o3 = 0;
        this.p3 = false;
        this.q3 = true;
        this.s3 = null;
        this.t3 = bool;
        this.u3 = false;
        this.A3 = 0;
        this.B3 = 5;
        this.C3 = false;
        this.D3 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void J2(DialogInterface dialogInterface) {
        this.E3 = false;
    }

    public static boolean g2() {
        ProgressBar progressBar = f28730j;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public static ProgressDialog j2(Context context) {
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            try {
                progressDialog.setMessage(context.getResources().getString(R.string.please_wait));
                progressDialog.show();
            } catch (Exception unused) {
            }
            progressDialog.setCancelable(false);
            return progressDialog;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static long k2(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String o2(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    public final void A2() {
        LinearLayout linearLayout = this.C;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.D;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public void B2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.ll_no_cat_found_player;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public void C2() {
        try {
            ProgressDialog progressDialog = this.v2;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.v2.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D2() {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.D2():boolean");
    }

    public final void E2() {
        if (this.z3 != null) {
            V2();
            if (this.v3 == null) {
                l2 l2VarB = c.h.a.k.c.i.b(this, false);
                c.f.a.b.e3.w wVar = new c.f.a.b.e3.w(this.w3);
                c.f.a.b.g3.f fVar = new c.f.a.b.g3.f(this);
                this.x3 = fVar;
                fVar.J(this.y3);
                n2 n2VarZ = new n2.b(this, l2VarB).A(wVar).B(this.x3).z();
                this.v3 = n2VarZ;
                n2VarZ.y(new e0(this, null));
                this.v3.M0(new c.f.a.b.j3.r(this.x3));
                this.v3.q1(c.f.a.b.t2.p.f10154a, true);
                this.v3.v(true);
                this.f2.setPlayer(this.v3);
            }
            this.v3.b(0, p1.b(this.z3));
            this.v3.prepare();
        }
    }

    public final void F2() {
        String str;
        TextView textView;
        Resources resources;
        int i2;
        StringBuilder sb;
        StringBuilder sb2;
        this.J2 = new c.h.a.k.d.a.a(this.f28731k);
        this.R2 = AnimationUtils.loadAnimation(this.f28731k, R.anim.trans_top_in);
        this.S2 = AnimationUtils.loadAnimation(this.f28731k, R.anim.trans_top_out);
        this.W2 = AnimationUtils.loadAnimation(this.f28731k, R.anim.player_fade_in_animation);
        this.X2 = AnimationUtils.loadAnimation(this.f28731k, R.anim.player_fade_out_animation);
        this.Z2 = AnimationUtils.loadAnimation(this.f28731k, R.anim.subtitle_slide_out_right);
        this.Y2 = AnimationUtils.loadAnimation(this.f28731k, R.anim.subtitle_slide_in_right);
        this.U2 = AnimationUtils.loadAnimation(this.f28731k, R.anim.zoom_in);
        this.V2 = AnimationUtils.loadAnimation(this.f28731k, R.anim.zoom_out);
        this.T2 = AnimationUtils.loadAnimation(this.f28731k, R.anim.trans_bottom_in);
        this.i3 = AnimationUtils.loadAnimation(this.f28731k, R.anim.player_live_left_side_in);
        this.j3 = AnimationUtils.loadAnimation(this.f28731k, R.anim.player_live_left_side_out);
        this.r3 = new c.h.a.i.q.g(this.f28731k);
        this.f3 = new LinearLayoutManager(this.f28731k);
        this.g3 = new LinearLayoutManager(this.f28731k);
        SharedPreferences sharedPreferences = this.f28731k.getSharedPreferences("loginPrefs", 0);
        this.B2 = sharedPreferences;
        this.z2 = sharedPreferences.getInt("aspect_ratio", this.z2);
        this.K2 = new Handler();
        this.V = getSharedPreferences("loginPrefs", 0);
        this.W = this.f28731k.getSharedPreferences("loginPrefs", 0);
        this.X = this.f28731k.getSharedPreferences("pref.using_media_codec", 0);
        this.Y = this.f28731k.getSharedPreferences("allowedFormat", 0);
        SharedPreferences sharedPreferences2 = getSharedPreferences("currentlyPlayingVideo", 0);
        this.Z = sharedPreferences2;
        this.C1 = sharedPreferences2.edit();
        SharedPreferences sharedPreferences3 = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.f0 = sharedPreferences3;
        this.D1 = sharedPreferences3.edit();
        SharedPreferences sharedPreferences4 = getSharedPreferences("sortsky", 0);
        this.G0 = sharedPreferences4;
        this.H0 = sharedPreferences4.edit();
        String string = this.G0.getString("sort", BuildConfig.FLAVOR);
        if (string != null && string.equals(BuildConfig.FLAVOR)) {
            this.H0.putString("sort", "0");
            this.H0.apply();
        }
        this.L2 = new Handler(Looper.getMainLooper());
        this.g0 = this.f28731k.getSharedPreferences("currentSubtitleTrack", 0);
        this.h0 = this.f28731k.getSharedPreferences("currentAudioTrack", 0);
        this.i0 = this.f28731k.getSharedPreferences("currentVideoTrack", 0);
        this.O1 = this.h0.edit();
        this.P1 = this.i0.edit();
        this.N1 = this.g0.edit();
        this.O1.clear();
        this.O1.apply();
        this.P1.clear();
        this.P1.apply();
        this.N1.clear();
        this.N1.apply();
        if (c.h.a.i.q.m.f(this.f28731k).equals("m3u")) {
            this.c2 = "m3u";
        } else {
            this.c2 = "api";
        }
        String string2 = this.V.getString("username", BuildConfig.FLAVOR);
        String string3 = this.V.getString("password", BuildConfig.FLAVOR);
        String string4 = this.Y.getString("allowedFormat", BuildConfig.FLAVOR);
        this.k0 = string4;
        if (string4 == null || string4.isEmpty() || this.k0.equals(BuildConfig.FLAVOR) || !this.k0.equals("default")) {
            String str2 = this.k0;
            if (str2 == null || str2.isEmpty() || this.k0.equals(BuildConfig.FLAVOR) || !this.k0.equals("ts")) {
                String str3 = this.k0;
                str = (str3 == null || str3.isEmpty() || this.k0.equals(BuildConfig.FLAVOR) || !this.k0.equals("m3u8")) ? ".ts" : ".m3u8";
                this.k0 = BuildConfig.FLAVOR;
            }
            this.k0 = str;
        } else {
            this.k0 = BuildConfig.FLAVOR;
        }
        String string5 = this.V.getString("serverUrl", BuildConfig.FLAVOR);
        String string6 = this.V.getString("serverProtocol", BuildConfig.FLAVOR);
        String string7 = this.V.getString("serverPortHttps", BuildConfig.FLAVOR);
        String string8 = this.V.getString("serverPort", BuildConfig.FLAVOR);
        String string9 = this.V.getString("serverPortRtmp", BuildConfig.FLAVOR);
        if (string6 != null) {
            switch (string6) {
                case "http":
                    if (string5 != null && !string5.startsWith("http://")) {
                        sb2 = new StringBuilder();
                        sb2.append("http://");
                        sb2.append(string5);
                        string5 = sb2.toString();
                    }
                    string7 = string8;
                    break;
                case "rmtp":
                    if (string5 != null && !string5.startsWith("rmtp://")) {
                        string5 = "rmtp://" + string5;
                    }
                    string7 = string9;
                    break;
                case "https":
                    if (string5 != null && !string5.startsWith("https://")) {
                        string5 = "https://" + string5;
                        break;
                    }
                    break;
                default:
                    if (string5 != null && !string5.startsWith("http://") && !string5.startsWith("https://")) {
                        sb2 = new StringBuilder();
                        sb2.append("http://");
                        sb2.append(string5);
                        string5 = sb2.toString();
                    }
                    string7 = string8;
                    break;
            }
        } else {
            string7 = BuildConfig.FLAVOR;
        }
        this.q2 = getIntent().getStringExtra("OPENED_CAT_ID");
        this.d1 = getIntent().getStringExtra("OPENED_CAT_NAME");
        this.p2 = getIntent().getIntExtra("OPENED_STREAM_ID", 0);
        this.R1 = getIntent().getIntExtra("VIDEO_NUM", 0);
        String stringExtra = getIntent().getStringExtra("FROM_SEARCH");
        this.l3 = stringExtra;
        if (stringExtra == null) {
            this.l3 = "false";
        }
        this.c1 = this.q2;
        this.d2 = getIntent().getStringExtra("VIDEO_URL");
        getIntent().getStringExtra("STREAM_TYPE");
        String stringExtra2 = getIntent().getStringExtra("RADIO");
        this.m3 = stringExtra2;
        if (stringExtra2 == null) {
            this.m3 = "false";
        }
        if (this.m3.equals("true")) {
            ImageView imageView = this.iv_radio;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            textView = this.header_page_title;
            if (textView != null) {
                resources = this.f28731k.getResources();
                i2 = R.string.radio;
                textView.setText(resources.getString(i2));
            }
        } else {
            this.m3 = "false";
            textView = this.header_page_title;
            if (textView != null) {
                resources = this.f28731k.getResources();
                i2 = R.string.live_sky;
                textView.setText(resources.getString(i2));
            }
        }
        getIntent().getStringExtra("VIDEO_TITLE");
        getIntent().getStringExtra("EPG_CHANNEL_ID");
        getIntent().getStringExtra("EPG_CHANNEL_LOGO");
        if (this.k0.equals(BuildConfig.FLAVOR)) {
            sb = new StringBuilder();
            sb.append(string5);
            sb.append(":");
            sb.append(string7);
            sb.append("/");
        } else {
            sb = new StringBuilder();
            sb.append(string5);
            sb.append(":");
            sb.append(string7);
            sb.append("/live/");
        }
        sb.append(string2);
        sb.append("/");
        sb.append(string3);
        sb.append("/");
        this.b2 = sb.toString();
        this.f28732l = c.h.a.h.n.e.t(this.b2);
        this.U = new c.h.a.i.q.f(this);
        this.B1 = new c.h.a.i.q.a(this.f28731k);
        this.H1 = new Handler();
        this.I1 = new Handler();
        this.J1 = new Handler();
        this.K1 = new Handler();
        this.L1 = new Handler();
        this.p = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.i.i() + c.h.a.k.d.c.a.i.h());
        this.M1 = new Handler();
        PlayerView playerView = (PlayerView) findViewById(R.id.player_view);
        this.f2 = playerView;
        playerView.setErrorMessageProvider(new d0(this, null));
        this.B = (ProgressBar) findViewById(R.id.progressBar);
        this.A = (LinearLayout) findViewById(R.id.ll_seekbar_time);
        this.v = (ImageView) findViewById(R.id.iv_channel_logo);
        this.w = (TextView) findViewById(R.id.tv_current_program);
        this.x = (TextView) findViewById(R.id.tv_current_time);
        this.y = (TextView) findViewById(R.id.tv_next_program);
        this.z = (TextView) findViewById(R.id.tv_next_program_time);
        this.n0 = (TextView) findViewById(R.id.tv_categories_view);
        this.K0 = (RecyclerView) findViewById(R.id.my_recycler_view);
        this.L0 = (ProgressBar) findViewById(R.id.pb_loader);
        this.M0 = (Toolbar) findViewById(R.id.toolbar);
        this.O0 = (TextView) findViewById(R.id.tv_no_record_found);
        this.P0 = (LinearLayout) findViewById(R.id.ll_no_left_channel_found);
        this.Q0 = (LinearLayout) findViewById(R.id.ll_no_left_channel_found_player);
        this.R0 = (AppBarLayout) findViewById(R.id.appbar_toolbar);
        f28730j = (ProgressBar) findViewById(R.id.app_video_loading);
        this.i1 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        this.X0 = (RelativeLayout) findViewById(R.id.rl_nst_player_sky_layout);
        this.Y0 = (LinearLayout) findViewById(R.id.ll_layout_to_hide_4);
        this.Z0 = (RelativeLayout) findViewById(R.id.rl_layout_to_hide_5);
        this.a1 = (RelativeLayout) findViewById(R.id.rl_layout_to_hide_6);
        this.b1 = (RelativeLayout) findViewById(R.id.rl_video_box);
        this.r1 = (LinearLayout) findViewById(R.id.ll_epg1_box);
        this.t1 = (LinearLayout) findViewById(R.id.ll_epg2_box);
        this.u1 = (LinearLayout) findViewById(R.id.ll_epg3_box);
        this.v1 = (LinearLayout) findViewById(R.id.ll_epg4_box);
        this.w1 = (LinearLayout) findViewById(R.id.ll_no_guide);
        this.x1 = (LinearLayout) findViewById(R.id.ll_epg_loader);
        this.e1 = (TextView) findViewById(R.id.tv_epg1_date);
        this.g1 = (TextView) findViewById(R.id.tv_epg2_date);
        this.j1 = (TextView) findViewById(R.id.tv_epg3_date);
        this.l1 = (TextView) findViewById(R.id.tv_epg4_date);
        this.f1 = (TextView) findViewById(R.id.tv_epg1_desc);
        this.h1 = (TextView) findViewById(R.id.tv_epg2_desc);
        this.k1 = (TextView) findViewById(R.id.tv_epg3_desc);
        this.m1 = (TextView) findViewById(R.id.tv_epg4_desc);
        this.n1 = (TextView) findViewById(R.id.tv_epg1_program);
        this.o1 = (TextView) findViewById(R.id.tv_epg2_program);
        this.p1 = (TextView) findViewById(R.id.tv_epg3_program);
        this.q1 = (TextView) findViewById(R.id.tv_epg4_program);
        this.g2 = new Date();
        this.E1 = (TextView) findViewById(R.id.date);
        this.G1 = (TextView) findViewById(R.id.time);
        this.Q1 = (TextView) findViewById(R.id.player_overlay_info);
        this.T1 = (LinearLayout) findViewById(R.id.ll_channel_jumping);
        this.U1 = (TextView) findViewById(R.id.app_channel_jumping_text);
        this.t = (LinearLayout) findViewById(R.id.app_video_status);
        this.u = (TextView) findViewById(R.id.app_video_status_text);
        this.C = (LinearLayout) findViewById(R.id.ll_pb_left_channel_list);
        this.D = (LinearLayout) findViewById(R.id.ll_pb_left_channel_list_player);
        Locale locale = Locale.US;
        this.e2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.a3 = this.J2.A().equals(c.h.a.h.n.a.s0) ? "tv" : "mobile";
        this.a2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.M0.x(R.menu.menu_search);
        this.R0.requestFocusFromTouch();
        v0(this.M0);
        Thread thread = this.s3;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new y());
            this.s3 = thread2;
            thread2.start();
        }
        SharedPreferences sharedPreferences5 = this.f28731k.getSharedPreferences("timeFormat", 0);
        f28724d = sharedPreferences5;
        this.j0 = new SimpleDateFormat(sharedPreferences5.getString("timeFormat", c.h.a.h.n.a.m0), locale);
        f28726f = false;
        findViewById(R.id.app_video_box).setOnClickListener(this);
        this.N = (ListView) findViewById(R.id.lv_ch_left_side);
        this.O = (ListView) findViewById(R.id.lv_ch_left_side_player);
        this.l0 = (RelativeLayout) findViewById(R.id.rl_categories_view);
        this.f28733m = findViewById(R.id.iv_play);
        this.f28734n = findViewById(R.id.iv_pause);
        View viewFindViewById = findViewById(R.id.btn_list);
        this.f28735o = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this);
        }
        View viewFindViewById2 = findViewById(R.id.exo_multiplayer);
        this.q = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this);
            this.q.setVisibility(0);
        }
        this.s1 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        View viewFindViewById3 = findViewById(R.id.vlc_exo_audio);
        this.r = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this);
        }
        this.M = (RelativeLayout) findViewById(R.id.middle);
        m2();
        P2();
        Q2();
        PlayerView playerView2 = this.f2;
        playerView2.C(this, playerView2, this.ll_player_header_footer, this.W2, this.X2, this.ll_pause_play, this.T2, this.U2, null, this.R2, this.S2, this.rl_episodes_box, this.j3, f28730j);
        f28727g = o2(this.f28731k);
        this.o0 = new ArrayList<>();
        this.p0 = new ArrayList<>();
        this.q0 = new ArrayList<>();
        this.r0 = new ArrayList<>();
        this.s0 = new ArrayList<>();
        this.t0 = new ArrayList<>();
        this.u0 = new ArrayList<>();
        this.v0 = new ArrayList<>();
        this.w0 = new ArrayList<>();
        this.x0 = new ArrayList<>();
        this.y0 = new ArrayList<>();
        this.z0 = new ArrayList<>();
        f28728h = getApplicationContext().getPackageName();
        this.A0 = new ArrayList<>();
        this.B0 = new ArrayList<>();
        this.C0 = new ArrayList<>();
        this.F1 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.g.f() + c.h.a.k.d.c.a.g.h());
        TextView textView2 = this.n0;
        if (textView2 != null) {
            textView2.setText(this.d1);
            this.n0.setSelected(true);
        }
        if (this.l3.equals("true")) {
            n2();
        }
    }

    public boolean G2() {
        if (Build.VERSION.SDK_INT < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        a.i.h.a.q(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 101);
        return false;
    }

    public void K2(String str) {
        this.P2 = str;
        try {
            SearchView searchView = this.N0;
            if (searchView != null && this.Z1 != null) {
                searchView.d0(BuildConfig.FLAVOR, false);
                this.Z1.collapseActionView();
            }
        } catch (Exception unused) {
        }
        try {
            if (this.Y1 != null) {
                if (this.P2.equals("-6")) {
                    this.Y1.getItem(2).getSubMenu().findItem(R.id.nav_delete_all).setVisible(true);
                } else {
                    this.Y1.getItem(2).getSubMenu().findItem(R.id.nav_delete_all).setVisible(false);
                }
            }
        } catch (Exception unused2) {
        }
        X1(true);
    }

    public final void L2() {
        ProgressBar progressBar = this.B;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(this.f28731k.getResources().getString(R.string.now_loading));
        }
        TextView textView2 = this.x;
        if (textView2 != null) {
            textView2.setText(BuildConfig.FLAVOR);
        }
        TextView textView3 = this.y;
        if (textView3 != null) {
            textView3.setText(this.f28731k.getResources().getString(R.string.next_loading));
        }
        TextView textView4 = this.z;
        if (textView4 != null) {
            textView4.setText(BuildConfig.FLAVOR);
        }
    }

    public final void M2() {
        int currentWindowIndex = this.f2.getCurrentWindowIndex();
        if (currentWindowIndex == this.z0.size() - 1) {
            this.f2.setCurrentWindowIndex(0);
        } else {
            this.f2.setCurrentWindowIndex(currentWindowIndex + 1);
        }
    }

    public void N2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        if (this.ll_no_cat_found != null) {
            this.ll_no_cat_found_player.setVisibility(0);
        }
    }

    public void O2() {
        c.h.a.h.n.a.G = Boolean.TRUE;
        this.H = true;
        this.t.setVisibility(0);
        this.u.setText(this.f28731k.getResources().getString(R.string.no_channel_found));
        this.x1.setVisibility(8);
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            findViewById(R.id.watrmrk).setVisibility(8);
        }
    }

    public final void P2() {
        this.iv_play.setOnClickListener(this);
        this.iv_pause.setOnClickListener(this);
        this.ll_back_click.setOnClickListener(this);
        this.iv_back.setOnClickListener(this);
        this.ll_audio_subtitle_settings_click.setOnClickListener(this);
        this.iv_audio_subtitle_track.setOnClickListener(this);
        this.ll_channels_list.setOnClickListener(this);
        this.ll_previous_channel.setOnClickListener(this);
        this.ll_next_channel.setOnClickListener(this);
        this.ll_crop.setOnClickListener(this);
        this.ll_multi_screen.setOnClickListener(this);
        this.iv_back_episodes.setOnClickListener(this);
        this.iv_back_settings.setOnClickListener(this);
        this.rl_search_cat.setOnClickListener(this);
    }

    public final void Q2() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.addTextChangedListener(new e());
        }
    }

    public final void R1(String str, int i2, String str2, String str3, String str4, int i3) {
        new g0(str, i2, str2, str3, str4, i3).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public final void R2() {
        n2 n2Var;
        try {
            if (!this.l2.booleanValue() || (n2Var = this.v3) == null) {
                return;
            }
            n2Var.a0();
        } catch (Exception unused) {
        }
    }

    public final void S1(String str, String str2, String str3, int i2) {
        new h0(str, str2, str3, i2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public final void S2() {
        n2 n2Var;
        try {
            if (!this.l2.booleanValue() || (n2Var = this.v3) == null) {
                return;
            }
            n2Var.b0();
        } catch (Exception unused) {
        }
    }

    public final void T1(Configuration configuration) {
        PlayerView playerView;
        boolean z2;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            playerView = this.f2;
            z2 = false;
        } else {
            decorView.setSystemUiVisibility(256);
            playerView = this.f2;
            z2 = true;
        }
        playerView.setAdjustViewBounds(z2);
    }

    @SuppressLint({"SetTextI18n"})
    public final void T2(ArrayList<c.h.a.i.f> arrayList) {
        c.h.a.k.e.a aVarF;
        String strValueOf;
        String str;
        String str2;
        String str3;
        if (arrayList == null || arrayList.size() <= 0 || this.R1 >= arrayList.size()) {
            return;
        }
        int iS = c.h.a.h.n.e.S(arrayList.get(this.R1).P());
        this.N2 = iS;
        this.O2 = arrayList.get(this.R1).g();
        int i2 = this.R1;
        this.x2 = i2;
        String name = arrayList.get(i2).getName();
        int iR = c.h.a.h.n.e.R(arrayList.get(this.R1).Y());
        String strI = arrayList.get(this.R1).I();
        String strX = arrayList.get(this.R1).X();
        arrayList.get(this.R1).P();
        this.d2 = arrayList.get(this.R1).e0();
        String strO0 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.h.a() + c.h.a.k.d.c.a.h.i());
        try {
            if (strX.equals(BuildConfig.FLAVOR) || strX.isEmpty()) {
                this.v.setImageDrawable(this.f28731k.getResources().getDrawable(R.drawable.logo_placeholder_white));
            } else {
                c.k.b.t.q(this.f28731k).l(strX).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(this.v);
            }
        } catch (Exception unused) {
            this.v.setImageDrawable(this.f28731k.getResources().getDrawable(R.drawable.logo_placeholder_white));
        }
        this.f2.setCurrentWindowIndex(this.R1);
        SharedPreferences.Editor editor = this.C1;
        if (editor != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(arrayList.get(this.R1).Y()));
            this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayList.get(this.R1).e0()));
            this.C1.apply();
        }
        SharedPreferences.Editor editor2 = this.D1;
        if (editor2 != null) {
            editor2.putInt("currentlyPlayingVideoPosition", this.R1);
            this.D1.apply();
        }
        SimpleDateFormat simpleDateFormat = this.e2;
        if (k2(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.f28731k))), this.a2.format(this.g2)) >= c.h.a.k.d.c.a.d.p() && (str2 = this.s1) != null && this.i1 != null && (!f28727g.equals(str2) || (this.s1 != null && (str3 = this.i1) != null && !f28728h.equals(str3)))) {
            this.l2 = Boolean.FALSE;
            this.f2.setVisibility(8);
            this.t.setVisibility(0);
            this.u.setText(strO0 + this.p + this.F1);
        }
        this.z1 = iR;
        this.y1 = strI;
        this.A1 = this.d2;
        if (this.c2.equals("m3u")) {
            aVarF = c.h.a.k.e.a.f();
            strValueOf = this.A1;
        } else {
            aVarF = c.h.a.k.e.a.f();
            strValueOf = String.valueOf(this.z1);
        }
        aVarF.q(strValueOf);
        this.f2.setTitle(iS + " - " + name);
        this.f2.B();
        if (!f28726f) {
            if (this.f2.getFullScreenValue().booleanValue()) {
                f28726f = this.f2.getFullScreenValue().booleanValue();
            } else {
                f28726f = false;
            }
        }
        if (this.l2.booleanValue()) {
            if (this.c2.equals("m3u")) {
                str = this.d2;
            } else {
                str = this.f28732l + iR + this.k0;
            }
            this.z3 = Uri.parse(str);
            this.f2.t(Boolean.valueOf(f28726f));
            E2();
            this.A3 = 0;
            this.C3 = false;
        }
        this.K1.removeCallbacksAndMessages(null);
        this.K = strI;
        this.L = strX;
        this.f2.setCurrentEpgChannelID(strI);
        this.f2.setCurrentChannelLogo(this.L);
        n3(this.L);
        this.u2 = new f0(this, this.K, null).execute(new String[0]);
        this.W1 = Boolean.TRUE;
    }

    public void U1() {
        f2();
        this.s2 = new a0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    public final void U2() {
        int currentWindowIndex = this.f2.getCurrentWindowIndex();
        if (currentWindowIndex == 0) {
            this.f2.setCurrentWindowIndex(this.z0.size() - 1);
        } else {
            this.f2.setCurrentWindowIndex(currentWindowIndex - 1);
        }
    }

    public void V1() {
        f2();
        this.s2 = new a0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    public void V2() {
        try {
            n2 n2Var = this.v3;
            if (n2Var != null) {
                n2Var.g1();
                this.v3 = null;
                this.x3 = null;
            }
        } catch (Exception unused) {
        }
    }

    public String W1() {
        c.h.a.i.q.f fVar;
        String str;
        String str2;
        AsyncTask asyncTask;
        try {
            this.x2 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.v0;
            if (arrayList != null && this.t0 != null) {
                arrayList.clear();
                this.t0.clear();
            }
            if (this.m3.equals("true")) {
                fVar = this.U;
                str = this.c1;
                str2 = "radio_streams";
            } else {
                fVar = this.U;
                str = this.c1;
                str2 = "live";
            }
            this.A0 = fVar.W0(str, str2);
            this.v0 = this.A0;
            ArrayList<c.h.a.i.f> arrayList2 = this.w0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.J2.C()));
            String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f28731k)));
            boolean zB = this.J2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.U.z1(null, str3) : null;
            this.f0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f28731k).equals("m3u") ? this.Z.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.Z.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.v0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "all_channels_with_cat";
            }
            for (int i2 = 0; i2 < this.v0.size(); i2++) {
                AsyncTask asyncTask2 = this.s2;
                if (asyncTask2 != null && asyncTask2.isCancelled()) {
                    return "all_channels_with_cat";
                }
                if (c.h.a.i.q.m.f(this.f28731k).equals("m3u")) {
                    if (this.v0.get(i2).e0().equals(string)) {
                        this.x2 = i2;
                    }
                } else if (this.v0.get(i2).Y().equals(string)) {
                    this.x2 = i2;
                }
                c.h.a.i.f fVar2 = new c.h.a.i.f();
                fVar2.u0(this.v0.get(i2).P());
                fVar2.t0(this.v0.get(i2).getName());
                fVar2.C0(this.v0.get(i2).Z());
                fVar2.B0(this.v0.get(i2).Y());
                fVar2.A0(this.v0.get(i2).X());
                fVar2.l0(this.v0.get(i2).I());
                fVar2.f0(this.v0.get(i2).f());
                fVar2.g0(this.v0.get(i2).g());
                fVar2.j0(this.v0.get(i2).D());
                fVar2.D0(this.v0.get(i2).a0());
                fVar2.k0(this.v0.get(i2).F());
                fVar2.E0(this.v0.get(i2).b0());
                fVar2.F0(this.v0.get(i2).d0());
                fVar2.h0(this.v0.get(i2).B());
                fVar2.z0(this.v0.get(i2).W());
                fVar2.p0(this.v0.get(i2).M());
                fVar2.i0(this.v0.get(i2).C());
                fVar2.G0(this.v0.get(i2).e0());
                if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayListZ1.size() || ((asyncTask = this.s2) != null && asyncTask.isCancelled())) {
                            break;
                        }
                        if (this.v0.get(i2).I().equals(arrayListZ1.get(i3).a())) {
                            int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f28731k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f28731k)).longValue(), this.f28731k);
                            if (iZ != 0) {
                                iZ = 100 - iZ;
                            }
                            fVar2.m0(iZ);
                            fVar2.v0(arrayListZ1.get(i3).m());
                        } else {
                            i3++;
                        }
                    }
                }
                this.w0.add(fVar2);
            }
            return "all_channels_with_cat";
        } catch (Exception unused) {
            return "all_channels_with_cat";
        }
    }

    public final void W2(String str, int i2, String str2, String str3, int i3) {
        new i0(str, i2, str2, str3, i3).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void X1(boolean z2) {
        ProgressDialog progressDialogJ2;
        f2();
        if (z2) {
            ProgressDialog progressDialog = this.v2;
            if (progressDialog == null) {
                progressDialogJ2 = j2(this.f28731k);
                this.v2 = progressDialogJ2;
                if (progressDialogJ2 != null) {
                    progressDialogJ2.show();
                }
            } else if (!progressDialog.isShowing()) {
                progressDialogJ2 = this.v2;
                progressDialogJ2.show();
            }
        }
        this.s2 = new b0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    public final void X2(String str, String str2, int i2) {
        new j0(str, i2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void Y1() {
        f2();
        this.s2 = new a0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    public void Y2() {
        this.t2 = new z().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void Z1() {
        f2();
        this.s2 = new a0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "recently_watched");
    }

    @SuppressLint({"NewApi"})
    public void Z2(ArrayList<c.h.a.i.f> arrayList) {
        c.h.a.i.q.f fVar;
        String str;
        String str2;
        try {
            if (arrayList == null) {
                this.P = new ArrayList<>();
                return;
            }
            this.G = false;
            this.O0.setVisibility(8);
            if (arrayList.size() == 0) {
                if (this.w2) {
                    TextView textView = this.O0;
                    if (textView == null) {
                        return;
                    }
                    this.G = true;
                    textView.setFocusable(true);
                    this.O0.requestFocus();
                } else {
                    this.w2 = true;
                    ArrayList<c.h.a.i.f> arrayList2 = this.v0;
                    if (arrayList2 != null && this.t0 != null) {
                        arrayList2.clear();
                        this.t0.clear();
                    }
                    if (this.m3.equals("true")) {
                        fVar = this.U;
                        str = this.c1;
                        str2 = "radio_streams";
                    } else {
                        fVar = this.U;
                        str = this.c1;
                        str2 = "live";
                    }
                    this.v0 = fVar.W0(str, str2);
                    ArrayList<c.h.a.i.f> arrayList3 = this.v0;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        Z2(this.v0);
                        return;
                    }
                    TextView textView2 = this.O0;
                    if (textView2 == null) {
                        return;
                    }
                    this.G = true;
                    textView2.setFocusable(true);
                    this.O0.requestFocus();
                }
                this.O0.setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    public String a2() {
        AsyncTask asyncTask;
        AsyncTask asyncTask2;
        try {
            this.h3 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.x0;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.x0 = this.U.g1();
            ArrayList<c.h.a.i.f> arrayList2 = this.y0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.J2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f28731k)));
            boolean zB = this.J2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.U.z1(null, str) : null;
            this.f0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f28731k).equals("m3u") ? this.Z.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.Z.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.x0;
            if (arrayList3 != null && arrayList3.size() > 0) {
                for (int i2 = 0; i2 < this.x0.size() && ((asyncTask = this.s2) == null || !asyncTask.isCancelled()); i2++) {
                    if (c.h.a.i.q.m.f(this.f28731k).equals("m3u")) {
                        if (this.x0.get(i2).e0().equals(string)) {
                            this.h3 = i2;
                            this.R1 = i2;
                        }
                    } else if (this.x0.get(i2).Y().equals(string)) {
                        this.h3 = i2;
                        this.R1 = i2;
                    }
                    c.h.a.i.f fVar = new c.h.a.i.f();
                    fVar.u0(this.x0.get(i2).P());
                    fVar.t0(this.x0.get(i2).getName());
                    fVar.C0(this.x0.get(i2).Z());
                    fVar.B0(this.x0.get(i2).Y());
                    fVar.A0(this.x0.get(i2).X());
                    fVar.l0(this.x0.get(i2).I());
                    fVar.f0(this.x0.get(i2).f());
                    fVar.g0(this.x0.get(i2).g());
                    fVar.j0(this.x0.get(i2).D());
                    fVar.D0(this.x0.get(i2).a0());
                    fVar.k0(this.x0.get(i2).F());
                    fVar.E0(this.x0.get(i2).b0());
                    fVar.F0(this.x0.get(i2).d0());
                    fVar.h0(this.x0.get(i2).B());
                    fVar.z0(this.x0.get(i2).W());
                    fVar.p0(this.x0.get(i2).M());
                    fVar.i0(this.x0.get(i2).C());
                    fVar.G0(this.x0.get(i2).e0());
                    if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                        int i3 = 0;
                        while (true) {
                            if (i3 < arrayListZ1.size() && ((asyncTask2 = this.s2) == null || !asyncTask2.isCancelled())) {
                                if (this.x0.get(i2).I().equals(arrayListZ1.get(i3).a())) {
                                    int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f28731k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f28731k)).longValue(), this.f28731k);
                                    if (iZ != 0) {
                                        iZ = 100 - iZ;
                                    }
                                    fVar.m0(iZ);
                                    fVar.v0(arrayListZ1.get(i3).m());
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    this.y0.add(fVar);
                }
            }
            this.x0 = this.y0;
            return "all_channels_with_cat";
        } catch (Exception unused) {
            return "all_channels_with_cat";
        }
    }

    @SuppressLint({"NewApi"})
    public void a3(ArrayList<c.h.a.i.f> arrayList) {
        ListView listView;
        try {
            if (this.k3.equals("player")) {
                if (arrayList != null && arrayList.size() > 0) {
                    ListView listView2 = this.O;
                    if (listView2 != null) {
                        listView2.setVisibility(0);
                    }
                    this.G = false;
                    if (this.O != null) {
                        c.h.a.k.b.t tVar = new c.h.a.k.b.t(this, arrayList);
                        this.e3 = tVar;
                        this.O.setAdapter((ListAdapter) tVar);
                        this.O.setSelection(this.h3);
                        this.O.requestFocus();
                        this.O.setOnItemClickListener(new t(arrayList));
                        return;
                    }
                    return;
                }
                LinearLayout linearLayout = this.P0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.Q0;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                listView = this.O;
                if (listView == null) {
                    return;
                }
            } else {
                if (arrayList != null && arrayList.size() > 0) {
                    ListView listView3 = this.N;
                    if (listView3 != null) {
                        listView3.setVisibility(0);
                    }
                    this.G = false;
                    if (this.N != null) {
                        c.h.a.k.b.s sVar = new c.h.a.k.b.s(this, arrayList);
                        this.d3 = sVar;
                        this.N.setAdapter((ListAdapter) sVar);
                        this.N.setSelection(this.h3);
                        if (!f28726f) {
                            this.N.requestFocus();
                        }
                        this.N.setOnItemSelectedListener(new u());
                        this.N.setOnItemClickListener(new v(arrayList));
                        this.N.setOnItemLongClickListener(new w());
                        return;
                    }
                    return;
                }
                LinearLayout linearLayout3 = this.P0;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                LinearLayout linearLayout4 = this.Q0;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                listView = this.N;
                if (listView == null) {
                    return;
                }
            }
            listView.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    public final void b2(int i2) {
        this.f2.V = new g();
        PlayerView playerView = this.f2;
        playerView.U.postDelayed(playerView.V, i2);
    }

    public final void b3(String str, boolean z2) {
        String str2;
        String str3;
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        if (z2 && this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.X2);
            this.ll_player_header_footer.setVisibility(8);
        }
        this.k3 = str;
        if (str.equals("player")) {
            this.rl_episodes_box_player.startAnimation(this.i3);
            this.rl_episodes_box_player.setVisibility(0);
        }
        String str4 = this.n3;
        if ((str4 != null && str4.equals("-1")) || (((str2 = this.n3) != null && str2.equals("0")) || ((str3 = this.n3) != null && str3.equals("-6")))) {
            String str5 = this.n3;
            this.O2 = str5;
            this.P2 = str5;
        }
        if (this.k3.equals("player")) {
            c.h.a.k.b.r rVar = new c.h.a.k.b.r(this.f28731k, this.O2, this.k3, this.m3);
            this.c3 = rVar;
            this.P2 = this.O2;
            this.recycler_view_left_sidebar_player.setAdapter(rVar);
            recyclerView = this.recycler_view_left_sidebar_player;
            linearLayoutManager = this.g3;
        } else {
            c.h.a.k.b.r rVar2 = new c.h.a.k.b.r(this.f28731k, this.O2, this.k3, this.m3);
            this.b3 = rVar2;
            this.P2 = this.O2;
            this.recycler_view_left_sidebar.setAdapter(rVar2);
            recyclerView = this.recycler_view_left_sidebar;
            linearLayoutManager = this.f3;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        X1(z2);
    }

    public void c2(int i2) {
        this.f2.V = new f();
        PlayerView playerView = this.f2;
        playerView.U.postDelayed(playerView.V, i2);
    }

    public final void c3() {
        try {
            new l(this).show();
        } catch (Exception unused) {
        }
    }

    public String d2(String str) {
        ArrayList<c.h.a.i.e> arrayList = this.q0;
        if (arrayList != null && arrayList.size() > 0) {
            for (c.h.a.i.e eVar : this.q0) {
                if (eVar.b() != null && !eVar.b().isEmpty() && eVar.b().equalsIgnoreCase(str)) {
                    this.d1 = eVar.c();
                }
            }
        }
        return this.d1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x034a A[PHI: r5 r8
  0x034a: PHI (r5v1 java.util.ArrayList<java.lang.String>) = 
  (r5v0 java.util.ArrayList<java.lang.String>)
  (r5v0 java.util.ArrayList<java.lang.String>)
  (r5v0 java.util.ArrayList<java.lang.String>)
  (r5v0 java.util.ArrayList<java.lang.String>)
  (r5v0 java.util.ArrayList<java.lang.String>)
  (r5v2 java.util.ArrayList<java.lang.String>)
  (r5v2 java.util.ArrayList<java.lang.String>)
 binds: [B:3:0x0021, B:18:0x0067, B:20:0x006f, B:22:0x0073, B:24:0x0079, B:69:0x034a, B:70:0x034a] A[DONT_GENERATE, DONT_INLINE]
  0x034a: PHI (r8v1 java.lang.String) = 
  (r8v0 java.lang.String)
  (r8v0 java.lang.String)
  (r8v0 java.lang.String)
  (r8v0 java.lang.String)
  (r8v0 java.lang.String)
  (r8v2 java.lang.String)
  (r8v2 java.lang.String)
 binds: [B:3:0x0021, B:18:0x0067, B:20:0x006f, B:22:0x0073, B:24:0x0079, B:69:0x034a, B:70:0x034a] A[DONT_GENERATE, DONT_INLINE]] */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> d3(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.d3(java.lang.String):java.util.HashMap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z2 = keyEvent.getAction() == 0;
        if (keyCode == 82) {
            try {
                keyEvent = z2 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
                return keyEvent;
            } catch (Exception unused) {
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void e2(int i2, String str, String str2) {
    }

    public void e3() {
        View view;
        if (this.rl_settings_box.getVisibility() == 8 && this.ll_player_header_footer.getVisibility() == 8) {
            this.K1.removeCallbacksAndMessages(null);
            n3(this.L);
            this.u2 = new f0(this, this.K, null).execute(new String[0]);
            this.J1.removeCallbacksAndMessages(null);
            this.ll_player_header_footer.startAnimation(this.W2);
            this.ll_bottom_footer_icons.startAnimation(this.W2);
            this.ll_top_right_setting.startAnimation(this.W2);
            this.ll_top_left_back.startAnimation(this.W2);
            this.ll_bottom_footer_icons.setVisibility(0);
            this.ll_top_right_setting.setVisibility(0);
            this.ll_top_left_back.setVisibility(0);
            this.ll_player_header_footer.setVisibility(0);
            try {
                View view2 = this.f28734n;
                if (view2 == null || view2.getVisibility() != 0) {
                    View view3 = this.f28733m;
                    if (view3 == null || view3.getVisibility() != 0) {
                        return;
                    } else {
                        view = this.f28733m;
                    }
                } else {
                    view = this.f28734n;
                }
                view.requestFocus();
            } catch (Exception unused) {
            }
        }
    }

    public final void f2() {
        AsyncTask asyncTask = this.s2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            c.h.a.i.q.m.K(0, this.f28731k);
        } else {
            c.h.a.i.q.m.K(1, this.f28731k);
            this.s2.cancel(true);
        }
    }

    public void f3() {
        if (this.ll_player_header_footer.getVisibility() == 8) {
            this.ll_player_header_footer.startAnimation(this.W2);
            this.ll_player_header_footer.setVisibility(0);
            if (this.ll_brightness.getVisibility() == 8) {
                this.ll_brightness.startAnimation(this.W2);
                this.ll_brightness.setVisibility(0);
            }
            if (this.ll_pause_play.getVisibility() == 8) {
                this.ll_pause_play.startAnimation(this.W2);
                this.ll_pause_play.setVisibility(0);
            }
            if (this.ll_volume.getVisibility() == 8) {
                this.ll_volume.startAnimation(this.W2);
                this.ll_volume.setVisibility(0);
            }
        }
    }

    public final void g3() {
        LinearLayout linearLayout;
        if (this.k3.equals("player")) {
            linearLayout = this.D;
            if (linearLayout == null) {
                return;
            }
        } else {
            linearLayout = this.C;
            if (linearLayout == null) {
                return;
            }
        }
        linearLayout.setVisibility(0);
    }

    public final void h2() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.setText(BuildConfig.FLAVOR);
            this.et_search_left_side.clearFocus();
        }
    }

    public final void h3(Activity activity) {
        new q((NSTEXOPlayerSkyTvActivity) activity, activity).show();
    }

    public final void i2() {
        try {
            SearchView searchView = this.N0;
            if (searchView == null || this.Z1 == null) {
                return;
            }
            searchView.d0(BuildConfig.FLAVOR, false);
            this.Z1.collapseActionView();
        } catch (Exception unused) {
        }
    }

    public final void i3() {
        try {
            if (this.E3 || !c.h.a.k.c.l.i0(this.x3)) {
                return;
            }
            this.E3 = true;
            c.h.a.k.c.l.R(this.x3, new DialogInterface.OnDismissListener() { // from class: c.h.a.k.c.b
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f17762b.J2(dialogInterface);
                }
            }).J(getSupportFragmentManager(), null);
        } catch (Exception unused) {
        }
    }

    public final void j3() {
        float fApplyDimension;
        ProgressDialog progressDialogJ2;
        try {
            if (c.h.a.h.n.a.G.booleanValue()) {
                findViewById(R.id.app_video_box).setOnClickListener(this);
            }
            this.Y0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.a1.setVisibility(0);
            try {
                fApplyDimension = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
            } catch (Exception unused) {
                fApplyDimension = 8.0f;
            }
            int i2 = (int) fApplyDimension;
            this.X0.setPadding(i2, i2, i2, i2);
            RelativeLayout relativeLayout = this.rl_episodes_box;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b1.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = 0;
            this.b1.setLayoutParams(layoutParams);
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            f28726f = false;
            ListView listView = this.N;
            if (listView != null) {
                listView.requestFocus();
            }
            if (this.t3.booleanValue()) {
                return;
            }
            ProgressDialog progressDialog = this.v2;
            if (progressDialog == null) {
                progressDialogJ2 = j2(this.f28731k);
                this.v2 = progressDialogJ2;
                if (progressDialogJ2 != null) {
                    progressDialogJ2.show();
                }
            } else if (!progressDialog.isShowing()) {
                progressDialogJ2 = this.v2;
                progressDialogJ2.show();
            }
            this.M1.removeCallbacksAndMessages(null);
            b3(BuildConfig.FLAVOR, false);
            this.t3 = Boolean.TRUE;
        } catch (Exception e2) {
            Log.e("exection", BuildConfig.FLAVOR + e2);
        }
    }

    public void k3() {
        Handler handler = this.f2.U;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void l2() {
        runOnUiThread(new s());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int l3() {
        /*
            r6 = this;
            int r0 = r6.z2
            r1 = 1
            int r0 = r0 + r1
            r6.z2 = r0
            java.lang.String r0 = "loginPrefs"
            r2 = 0
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r0, r2)
            r6.B2 = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.C2 = r0
            int r0 = r6.z2
            int[] r3 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.f28729i
            int r4 = r3.length
            int r0 = r0 % r4
            r6.z2 = r0
            r0 = r3[r0]
            r6.A2 = r0
            r0 = 2131428290(0x7f0b03c2, float:1.847822E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3 = 2131427466(0x7f0b008a, float:1.847655E38)
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.google.android.exoplayer2.ui.PlayerView r4 = r6.f2
            int r5 = r6.A2
            r4.setResizeMode(r5)
            int r4 = r6.z2
            if (r4 != 0) goto L4d
            android.content.res.Resources r1 = r6.getResources()
            r4 = 2132017787(0x7f14027b, float:1.9673862E38)
        L45:
            java.lang.String r1 = r1.getString(r4)
        L49:
            r3.setText(r1)
            goto L79
        L4d:
            if (r4 != r1) goto L57
            android.content.res.Resources r1 = r6.getResources()
            r4 = 2132017785(0x7f140279, float:1.9673858E38)
            goto L45
        L57:
            r1 = 2
            if (r4 != r1) goto L62
            android.content.res.Resources r1 = r6.getResources()
            r4 = 2132018755(0x7f140643, float:1.9675826E38)
            goto L45
        L62:
            r1 = 3
            if (r4 != r1) goto L6d
            android.content.res.Resources r1 = r6.getResources()
            r4 = 2132017976(0x7f140338, float:1.9674246E38)
            goto L45
        L6d:
            r1 = 4
            if (r4 != r1) goto L73
            java.lang.String r1 = "16:9"
            goto L49
        L73:
            r1 = 5
            if (r4 != r1) goto L79
            java.lang.String r1 = "4:3"
            goto L49
        L79:
            android.content.SharedPreferences$Editor r1 = r6.C2
            int r3 = r6.z2
            java.lang.String r4 = "aspect_ratio"
            r1.putInt(r4, r3)
            android.content.SharedPreferences$Editor r1 = r6.C2
            r1.apply()
            r0.setVisibility(r2)
            android.widget.LinearLayout r1 = r6.ll_pause_play
            if (r1 == 0) goto L9b
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L9b
            android.widget.LinearLayout r1 = r6.ll_pause_play
            r2 = 8
            r1.setVisibility(r2)
        L9b:
            android.os.Handler r1 = r6.K2
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.os.Handler r1 = r6.K2
            com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$o r2 = new com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity$o
            r2.<init>(r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r2, r3)
            int r0 = r6.A2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.l3():int");
    }

    public final void m2() {
        ImageView imageView = this.iv_play;
        imageView.setOnFocusChangeListener(new c0(imageView));
        ImageView imageView2 = this.iv_pause;
        imageView2.setOnFocusChangeListener(new c0(imageView2));
        ImageView imageView3 = this.iv_back;
        imageView3.setOnFocusChangeListener(new c0(imageView3));
        ImageView imageView4 = this.iv_audio_subtitle_track;
        imageView4.setOnFocusChangeListener(new c0(imageView4));
        LinearLayout linearLayout = this.ll_channels_list;
        linearLayout.setOnFocusChangeListener(new c0(linearLayout));
        LinearLayout linearLayout2 = this.ll_previous_channel;
        linearLayout2.setOnFocusChangeListener(new c0(linearLayout2));
        LinearLayout linearLayout3 = this.ll_next_channel;
        linearLayout3.setOnFocusChangeListener(new c0(linearLayout3));
        LinearLayout linearLayout4 = this.ll_crop;
        linearLayout4.setOnFocusChangeListener(new c0(linearLayout4));
        LinearLayout linearLayout5 = this.ll_multi_screen;
        linearLayout5.setOnFocusChangeListener(new c0(linearLayout5));
        ImageView imageView5 = this.iv_back_episodes;
        imageView5.setOnFocusChangeListener(new c0(imageView5));
        ImageView imageView6 = this.iv_back_settings;
        imageView6.setOnFocusChangeListener(new c0(imageView6));
        RelativeLayout relativeLayout = this.rl_search_cat;
        relativeLayout.setOnFocusChangeListener(new c0(relativeLayout));
    }

    public final void m3() {
        k3();
        if (this.ll_player_header_footer.getVisibility() == 0) {
            y2();
        } else {
            e3();
            b2(5000);
        }
    }

    public void n2() {
        RelativeLayout relativeLayout = this.X0;
        if (relativeLayout != null) {
            relativeLayout.setPadding(0, 0, 0, 0);
        }
        f28726f = true;
        k3();
        e3();
        b2(5000);
        String strK = c.h.a.i.q.m.k(this.f28731k);
        if (!c.h.a.i.q.m.l(this.f28731k).equals("default_native") && !new c.h.a.i.q.d(this.f28731k).d(strK)) {
            c.h.a.i.q.m.S("default_native", "default", this.f28731k);
        }
        String strL = c.h.a.i.q.m.l(this.f28731k);
        if (strL == null || strL.equalsIgnoreCase("default_native")) {
            if (c.h.a.h.n.a.G.booleanValue()) {
                LinearLayout linearLayout = this.ll_toolbar;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                findViewById(R.id.app_video_box).setOnClickListener(null);
                this.Y0.setVisibility(8);
                this.Z0.setVisibility(8);
                this.a1.setVisibility(8);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b1.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.b1.setLayoutParams(layoutParams);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                n2 n2Var = this.v3;
                ((n2Var == null || !n2Var.isPlaying()) ? this.f28733m : this.f28734n).requestFocus();
                return;
            }
            return;
        }
        V2();
        this.y2 = true;
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.f0 = sharedPreferences;
        int i2 = sharedPreferences.getInt("currentlyPlayingVideoPosition", 0);
        ArrayList<c.h.a.i.f> arrayListG = this.d3.g();
        this.R1 = i2;
        if (arrayListG == null || arrayListG.size() <= 0 || this.R1 >= arrayListG.size()) {
            ArrayList<c.h.a.i.f> arrayList = this.x0;
            if (arrayList != null && arrayList.size() > 0 && this.R1 < this.x0.size()) {
                this.o2 = c.h.a.h.n.e.S(this.x0.get(this.R1).Y());
                this.d2 = this.x0.get(this.R1).e0();
                this.x0.get(this.R1).getName();
            }
        } else {
            this.o2 = c.h.a.h.n.e.S(arrayListG.get(this.R1).Y());
            this.d2 = arrayListG.get(this.R1).e0();
        }
        this.I = this.o2;
        this.J = this.d2;
        f28726f = false;
        PlayerView playerView = this.f2;
        if (playerView != null) {
            playerView.t(Boolean.FALSE);
        }
        if (this.c2.equals("m3u")) {
            if (this.l2.booleanValue()) {
                String strK2 = c.h.a.i.q.m.k(this.f28731k);
                Intent intent = new Intent(this.f28731k, (Class<?>) PlayExternalPlayerActivity.class);
                intent.putExtra("url", this.J);
                intent.putExtra("packagename", strL);
                intent.putExtra("app_name", strK2);
                this.f28731k.startActivity(intent);
                return;
            }
            return;
        }
        if (this.o2 == -1 || !this.l2.booleanValue()) {
            return;
        }
        String strG = c.h.a.h.n.e.G(this.f28731k, this.o2, this.k0, "live");
        String strK3 = c.h.a.i.q.m.k(this.f28731k);
        Intent intent2 = new Intent(this.f28731k, (Class<?>) PlayExternalPlayerActivity.class);
        intent2.putExtra("url", strG);
        intent2.putExtra("packagename", strL);
        intent2.putExtra("app_name", strK3);
        this.f28731k.startActivity(intent2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:4:0x0008, B:6:0x0010, B:8:0x0014, B:9:0x0030, B:11:0x0034, B:13:0x0038), top: B:22:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n3(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 21
            r2 = 2131231551(0x7f08033f, float:1.8079186E38)
            if (r6 == 0) goto L30
            java.lang.String r3 = ""
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Exception -> L46
            if (r3 != 0) goto L30
            android.widget.ImageView r3 = r5.v     // Catch: java.lang.Exception -> L46
            if (r3 == 0) goto L5c
            android.content.Context r3 = r5.f28731k     // Catch: java.lang.Exception -> L46
            c.k.b.t r3 = c.k.b.t.q(r3)     // Catch: java.lang.Exception -> L46
            c.k.b.x r6 = r3.l(r6)     // Catch: java.lang.Exception -> L46
            r3 = 80
            r4 = 55
            c.k.b.x r6 = r6.k(r3, r4)     // Catch: java.lang.Exception -> L46
            c.k.b.x r6 = r6.j(r2)     // Catch: java.lang.Exception -> L46
            android.widget.ImageView r3 = r5.v     // Catch: java.lang.Exception -> L46
            r6.g(r3)     // Catch: java.lang.Exception -> L46
            goto L5c
        L30:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L46
            if (r6 < r1) goto L5c
            android.widget.ImageView r6 = r5.v     // Catch: java.lang.Exception -> L46
            if (r6 == 0) goto L5c
            android.content.Context r3 = r5.f28731k     // Catch: java.lang.Exception -> L46
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Exception -> L46
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r2, r0)     // Catch: java.lang.Exception -> L46
            r6.setImageDrawable(r3)     // Catch: java.lang.Exception -> L46
            goto L5c
        L46:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L5c
            android.widget.ImageView r6 = r5.v
            if (r6 == 0) goto L5c
            android.content.Context r1 = r5.f28731k
            android.content.res.Resources r1 = r1.getResources()
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r2, r0)
            r6.setImageDrawable(r0)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.n3(java.lang.String):void");
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 101) {
            try {
                if (G2()) {
                    SharedPreferences sharedPreferences = getSharedPreferences("downloadStatus", 0);
                    f28725e = sharedPreferences;
                    String string = sharedPreferences.getString("downloadStatus", BuildConfig.FLAVOR);
                    c.h.a.h.n.e eVar = new c.h.a.h.n.e();
                    if (string.equals("processing")) {
                        eVar.h0(this);
                    } else {
                        eVar.k0(this, this.n2, this.k0, this.f28732l, this.I, this.J);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[Catch: Exception -> 0x00b7, PHI: r0
  0x00aa: PHI (r0v8 android.widget.LinearLayout) = (r0v7 android.widget.LinearLayout), (r0v25 android.widget.LinearLayout) binds: [B:41:0x00b3, B:37:0x00a8] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00b7, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x000f, B:8:0x001c, B:10:0x0024, B:12:0x0031, B:14:0x0035, B:16:0x003e, B:18:0x004d, B:19:0x0054, B:21:0x005c, B:22:0x0063, B:24:0x006b, B:25:0x0072, B:27:0x007f, B:28:0x0084, B:30:0x008c, B:31:0x0091, B:33:0x0099, B:34:0x009e, B:36:0x00a6, B:38:0x00aa, B:39:0x00ad, B:40:0x00b1), top: B:47:0x0000 }] */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBackPressed() {
        /*
            r4 = this;
            r4.k3()     // Catch: java.lang.Exception -> Lb7
            android.widget.RelativeLayout r0 = r4.rl_episodes_box_player     // Catch: java.lang.Exception -> Lb7
            r1 = 8
            if (r0 == 0) goto L1c
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L1c
            android.widget.RelativeLayout r0 = r4.rl_episodes_box_player     // Catch: java.lang.Exception -> Lb7
            android.view.animation.Animation r2 = r4.j3     // Catch: java.lang.Exception -> Lb7
            r0.startAnimation(r2)     // Catch: java.lang.Exception -> Lb7
            android.widget.RelativeLayout r0 = r4.rl_episodes_box_player     // Catch: java.lang.Exception -> Lb7
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> Lb7
            return
        L1c:
            android.widget.RelativeLayout r0 = r4.rl_settings_box     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L31
            android.widget.RelativeLayout r0 = r4.rl_settings_box     // Catch: java.lang.Exception -> Lb7
            android.view.animation.Animation r2 = r4.Z2     // Catch: java.lang.Exception -> Lb7
            r0.startAnimation(r2)     // Catch: java.lang.Exception -> Lb7
            android.widget.RelativeLayout r0 = r4.rl_settings_box     // Catch: java.lang.Exception -> Lb7
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> Lb7
            return
        L31:
            boolean r0 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.f28726f     // Catch: java.lang.Exception -> Lb7
            if (r0 == 0) goto Lb7
            android.widget.LinearLayout r0 = r4.ll_player_header_footer     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            r2 = 0
            if (r0 != 0) goto Lb1
            android.widget.LinearLayout r0 = r4.ll_player_header_footer     // Catch: java.lang.Exception -> Lb7
            android.view.animation.Animation r3 = r4.X2     // Catch: java.lang.Exception -> Lb7
            r0.startAnimation(r3)     // Catch: java.lang.Exception -> Lb7
            android.widget.LinearLayout r0 = r4.ll_brightness     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L54
            android.widget.LinearLayout r0 = r4.ll_brightness     // Catch: java.lang.Exception -> Lb7
            android.view.animation.Animation r3 = r4.X2     // Catch: java.lang.Exception -> Lb7
            r0.startAnimation(r3)     // Catch: java.lang.Exception -> Lb7
        L54:
            android.widget.LinearLayout r0 = r4.ll_pause_play     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L63
            android.widget.LinearLayout r0 = r4.ll_pause_play     // Catch: java.lang.Exception -> Lb7
            android.view.animation.Animation r3 = r4.X2     // Catch: java.lang.Exception -> Lb7
            r0.startAnimation(r3)     // Catch: java.lang.Exception -> Lb7
        L63:
            android.widget.LinearLayout r0 = r4.ll_volume     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L72
            android.widget.LinearLayout r0 = r4.ll_volume     // Catch: java.lang.Exception -> Lb7
            android.view.animation.Animation r3 = r4.X2     // Catch: java.lang.Exception -> Lb7
            r0.startAnimation(r3)     // Catch: java.lang.Exception -> Lb7
        L72:
            android.widget.LinearLayout r0 = r4.ll_player_header_footer     // Catch: java.lang.Exception -> Lb7
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> Lb7
            android.widget.LinearLayout r0 = r4.ll_brightness     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L84
            android.widget.LinearLayout r0 = r4.ll_brightness     // Catch: java.lang.Exception -> Lb7
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> Lb7
        L84:
            android.widget.LinearLayout r0 = r4.ll_pause_play     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L91
            android.widget.LinearLayout r0 = r4.ll_pause_play     // Catch: java.lang.Exception -> Lb7
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> Lb7
        L91:
            android.widget.LinearLayout r0 = r4.ll_volume     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L9e
            android.widget.LinearLayout r0 = r4.ll_volume     // Catch: java.lang.Exception -> Lb7
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> Lb7
        L9e:
            android.widget.LinearLayout r0 = r4.ll_click_to_play     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto Lb6
            android.widget.LinearLayout r0 = r4.ll_toolbar     // Catch: java.lang.Exception -> Lb7
            if (r0 == 0) goto Lad
        Laa:
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> Lb7
        Lad:
            r4.j3()     // Catch: java.lang.Exception -> Lb7
            goto Lb6
        Lb1:
            android.widget.LinearLayout r0 = r4.ll_toolbar     // Catch: java.lang.Exception -> Lb7
            if (r0 == 0) goto Lad
            goto Laa
        Lb6:
            return
        Lb7:
            super.onBackPressed()
            r0 = 2130772003(0x7f010023, float:1.7147112E38)
            r1 = 2130772000(0x7f010020, float:1.7147106E38)
            r4.overridePendingTransition(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.onBackPressed():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0484  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.onClick(android.view.View):void");
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T1(configuration);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        f.e eVarT;
        f.d dVarW;
        this.f28731k = this;
        super.onCreate(bundle);
        this.w3 = c.h.a.k.c.i.d(this);
        SharedPreferences sharedPreferences = getSharedPreferences("auto_start", 0);
        this.F3 = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("subtitle_active", true);
        if (bundle != null) {
            dVarW = (f.d) bundle.getParcelable("track_selector_parameters");
        } else {
            if (z2) {
                eVarT = new f.e(this);
            } else {
                eVarT = new f.e(this);
                eVarT = eVarT.T(1);
            }
            dVarW = eVarT.w();
        }
        this.y3 = dVarW;
        setContentView(R.layout.activity_exoplayer_sky_tv);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        F2();
        RelativeLayout relativeLayout = this.X0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new k());
        }
        this.D0 = t2();
        SharedPreferences.Editor editor = this.C1;
        if (editor != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(this.p2));
            this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "0");
            this.C1.apply();
        }
        this.U.G0();
        if (this.l3.equals("false")) {
            Y2();
        } else {
            String str = this.c1;
            this.O2 = str;
            c.h.a.k.b.r rVar = new c.h.a.k.b.r(this.f28731k, str, BuildConfig.FLAVOR, this.m3);
            this.b3 = rVar;
            this.P2 = this.O2;
            this.recycler_view_left_sidebar.setAdapter(rVar);
            this.recycler_view_left_sidebar.setLayoutManager(this.f3);
            X1(true);
        }
        c.h.a.h.n.e.J(this.f28731k);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.M0.x(R.menu.menu_search);
        this.Y1 = menu;
        this.Z1 = menu.getItem(2).getSubMenu().findItem(R.id.empty);
        if (c.h.a.i.q.m.f(this.f28731k).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(R.id.menu_load_channels_vod1).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f28731k.getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.M0.getChildCount(); i2++) {
            if (Build.VERSION.SDK_INT >= 21 && (this.M0.getChildAt(i2) instanceof ActionMenuView)) {
                ((Toolbar.e) this.M0.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
        return true;
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            f2();
            V2();
        } catch (Exception unused) {
        }
    }

    @Override // a.b.k.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        if (f28726f && this.ll_bottom_footer_icons.getVisibility() == 8 && this.rl_settings_box.getVisibility() == 8 && this.rl_episodes_box_player.getVisibility() == 8) {
            if (i2 == 20) {
                if (this.l2.booleanValue()) {
                    findViewById(R.id.ll_previous_channel).performClick();
                }
                return true;
            }
            if (i2 == 19) {
                if (this.l2.booleanValue()) {
                    findViewById(R.id.ll_next_channel).performClick();
                }
                return true;
            }
        }
        if (i2 == 166) {
            if (f28726f && this.l2.booleanValue()) {
                findViewById(R.id.ll_next_channel).performClick();
            }
            return true;
        }
        if (i2 != 167) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (f28726f && this.l2.booleanValue()) {
            findViewById(R.id.ll_previous_channel).performClick();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        StringBuilder sb;
        boolean z2 = keyEvent.getRepeatCount() == 0;
        if (i2 != 62) {
            if (i2 != 66) {
                if (i2 != 79) {
                    if (i2 == 82) {
                        Menu menu = this.Y1;
                        if (menu != null) {
                            menu.performIdentifierAction(R.id.empty, 0);
                        }
                        return true;
                    }
                    if (i2 != 85 && i2 != 86 && i2 != 126 && i2 != 127) {
                        switch (i2) {
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                                if (f28726f) {
                                    this.L1.removeCallbacksAndMessages(null);
                                    int i3 = 7;
                                    if (i2 == 7) {
                                        this.S1.append(0);
                                    } else if (i2 == 8) {
                                        this.S1.append(1);
                                    } else {
                                        if (i2 == 9) {
                                            sb = this.S1;
                                            i3 = 2;
                                        } else if (i2 == 10) {
                                            this.S1.append(3);
                                        } else if (i2 == 11) {
                                            sb = this.S1;
                                            i3 = 4;
                                        } else if (i2 == 12) {
                                            sb = this.S1;
                                            i3 = 5;
                                        } else if (i2 == 13) {
                                            sb = this.S1;
                                            i3 = 6;
                                        } else if (i2 == 14) {
                                            sb = this.S1;
                                        } else if (i2 == 15) {
                                            this.S1.append(8);
                                        } else if (i2 == 16) {
                                            this.S1.append(9);
                                        }
                                        sb.append(i3);
                                    }
                                    this.U1.setText(this.S1.toString());
                                    this.T1.setVisibility(0);
                                    this.L1.postDelayed(new x(), 3000L);
                                }
                                return true;
                            default:
                                switch (i2) {
                                    case 19:
                                    case 20:
                                    case 22:
                                        k3();
                                        b2(5000);
                                        return true;
                                    case 21:
                                        k3();
                                        b2(5000);
                                        if (f28726f && this.ll_player_header_footer.getVisibility() == 8 && this.rl_episodes_box_player.getVisibility() == 8) {
                                            b3("player", true);
                                        }
                                        return true;
                                    case 23:
                                        break;
                                    default:
                                        return super.onKeyUp(i2, keyEvent);
                                }
                                break;
                        }
                    }
                }
            }
            if (!f28726f) {
                return true;
            }
            n2 n2Var = this.v3;
            if (n2Var == null || n2Var.getPlaybackState() != 3) {
                m3();
            } else if (this.rl_settings_box.getVisibility() == 8) {
                m3();
                (this.v3.isPlaying() ? this.iv_pause : this.iv_play).requestFocus();
            }
            return true;
        }
        if (this.l2.booleanValue()) {
            n2 n2Var2 = this.v3;
            ((n2Var2 == null || !z2 || n2Var2.isPlaying()) ? this.iv_pause : this.iv_play).performClick();
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.Z1 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f28731k) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(this.f28731k.getResources().getString(R.string.logout_title)).f(this.f28731k.getResources().getString(R.string.logout_message)).j(this.f28731k.getResources().getString(R.string.yes), new i()).g(this.f28731k.getResources().getString(R.string.no), new h()).n();
        }
        if (itemId == R.id.action_search) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.N0 = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(R.string.search_channel));
                    this.N0.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.N0.findViewById(R.id.search_close_btn);
                    ((ImageView) this.N0.findViewById(R.id.search_go_btn)).setImageResource(R.drawable.menu_close_selector);
                    imageView.setImageResource(R.drawable.menu_close_selector);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.N0.setOnQueryTextListener(new j());
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        if (itemId == R.id.menu_load_channels_vod1 && c.h.a.i.q.m.f(this.f28731k).equals("m3u")) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f28731k.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f28731k.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f28731k.getResources().getString(R.string.yes), new m());
            aVar.g(this.f28731k.getResources().getString(R.string.no), new n());
            aVar.n();
        }
        if (itemId == R.id.menu_sort) {
            h3(this);
        }
        if (itemId == R.id.nav_delete_all) {
            c3();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        Handler handler;
        super.onPause();
        try {
            Thread thread = this.s3;
            if (thread != null && thread.isAlive()) {
                this.s3.interrupt();
            }
        } catch (Exception unused) {
        }
        try {
            if (this.t3.booleanValue() || (handler = this.M1) == null) {
                return;
            }
            handler.removeCallbacksAndMessages(null);
        } catch (Exception unused2) {
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity, a.i.h.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0) {
                G2();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                b.a aVar = new b.a(this, R.style.AlertDialogCustom);
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.permission_alertbox, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(R.id.btn_grant);
                Button button2 = (Button) viewInflate.findViewById(R.id.btn_cancel);
                button.setOnFocusChangeListener(new e.j(button, this));
                button2.setOnFocusChangeListener(new e.j(button2, this));
                button.setOnClickListener(new p());
                button2.setOnClickListener(new r());
                aVar.setView(viewInflate);
                this.j2 = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.j2.getWindow();
                window.getClass();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.j2.show();
                this.j2.getWindow().setAttributes(layoutParams);
                this.j2.setCancelable(false);
                this.j2.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.s3;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new y());
            this.s3 = thread2;
            thread2.start();
        }
        c.h.a.h.n.e.g(this.f28731k);
        if (this.y2) {
            this.y2 = false;
            j3();
        } else if (this.v3 == null) {
            E2();
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            V2();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            T1(getResources().getConfiguration());
        }
    }

    public void p2() {
        c.h.a.i.q.a aVar;
        Context context;
        ArrayList<c.h.a.i.f> arrayList;
        try {
            String str = "live";
            if (this.c2.equals("m3u")) {
                new ArrayList();
                c.h.a.i.q.f fVar = this.U;
                if (fVar == null) {
                    return;
                }
                ArrayList<c.h.a.i.c> arrayListB1 = fVar.B1("live");
                arrayList = new ArrayList<>();
                ArrayList<String> arrayList2 = this.D0;
                if (arrayList2 != null && arrayList2.size() > 0 && arrayListB1 != null && arrayListB1.size() > 0) {
                    arrayListB1 = w2(arrayListB1, this.D0);
                }
                for (c.h.a.i.c cVar : arrayListB1) {
                    ArrayList<c.h.a.i.f> arrayListF1 = this.U.F1(cVar.a(), cVar.c());
                    if (arrayListF1 != null && arrayListF1.size() > 0) {
                        arrayList.add(arrayListF1.get(0));
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
            } else {
                new ArrayList();
                if (this.B1 == null) {
                    return;
                }
                if (this.m3.equals("true")) {
                    aVar = this.B1;
                    str = "radio_streams";
                    context = this.f28731k;
                } else {
                    aVar = this.B1;
                    context = this.f28731k;
                }
                ArrayList<c.h.a.i.b> arrayListP = aVar.p(str, c.h.a.i.q.m.z(context));
                arrayList = new ArrayList<>();
                ArrayList<String> arrayList3 = this.D0;
                if (arrayList3 != null && arrayList3.size() > 0 && arrayListP != null && arrayListP.size() > 0) {
                    arrayListP = v2(arrayListP, this.D0);
                }
                for (c.h.a.i.b bVar : arrayListP) {
                    c.h.a.i.f fVarD1 = new c.h.a.i.q.f(this.f28731k).D1(bVar.a(), String.valueOf(bVar.e()));
                    if (fVarD1 != null) {
                        arrayList.add(fVarD1);
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
            }
            this.P = arrayList;
        } catch (Exception unused) {
        }
    }

    public String q2() {
        AsyncTask asyncTask;
        try {
            this.x2 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.v0;
            if (arrayList != null && this.t0 != null) {
                arrayList.clear();
                this.t0.clear();
            }
            this.P = new ArrayList<>();
            p2();
            this.v0 = this.P;
            ArrayList<c.h.a.i.f> arrayList2 = this.w0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.J2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f28731k)));
            boolean zB = this.J2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.U.z1(null, str) : null;
            this.f0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f28731k).equals("m3u") ? this.Z.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.Z.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.v0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "get_fav";
            }
            for (int i2 = 0; i2 < this.v0.size(); i2++) {
                AsyncTask asyncTask2 = this.s2;
                if (asyncTask2 != null && asyncTask2.isCancelled()) {
                    return "get_fav";
                }
                if (c.h.a.i.q.m.f(this.f28731k).equals("m3u")) {
                    if (this.v0.get(i2).e0().equals(string)) {
                        this.x2 = i2;
                    }
                } else if (this.v0.get(i2).Y().equals(string)) {
                    this.x2 = i2;
                }
                c.h.a.i.f fVar = new c.h.a.i.f();
                fVar.u0(this.v0.get(i2).P());
                fVar.t0(this.v0.get(i2).getName());
                fVar.C0(this.v0.get(i2).Z());
                fVar.B0(this.v0.get(i2).Y());
                fVar.A0(this.v0.get(i2).X());
                fVar.l0(this.v0.get(i2).I());
                fVar.f0(this.v0.get(i2).f());
                fVar.g0(this.v0.get(i2).g());
                fVar.j0(this.v0.get(i2).D());
                fVar.D0(this.v0.get(i2).a0());
                fVar.k0(this.v0.get(i2).F());
                fVar.E0(this.v0.get(i2).b0());
                fVar.F0(this.v0.get(i2).d0());
                fVar.h0(this.v0.get(i2).B());
                fVar.z0(this.v0.get(i2).W());
                fVar.p0(this.v0.get(i2).M());
                fVar.i0(this.v0.get(i2).C());
                fVar.G0(this.v0.get(i2).e0());
                if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayListZ1.size() || ((asyncTask = this.s2) != null && asyncTask.isCancelled())) {
                            break;
                        }
                        if (this.v0.get(i2).I().equals(arrayListZ1.get(i3).a())) {
                            int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f28731k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f28731k)).longValue(), this.f28731k);
                            if (iZ != 0) {
                                iZ = 100 - iZ;
                            }
                            fVar.m0(iZ);
                            fVar.v0(arrayListZ1.get(i3).m());
                        } else {
                            i3++;
                        }
                    }
                }
                this.w0.add(fVar);
                this.x0 = this.w0;
            }
            return "get_fav";
        } catch (Exception unused) {
            return "get_fav";
        }
    }

    public String r2() {
        AsyncTask asyncTask;
        AsyncTask asyncTask2;
        c.h.a.i.q.a aVar;
        String str;
        Context context;
        boolean z2;
        try {
            this.h3 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.x0;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<c.h.a.i.f> arrayList2 = this.y0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            ArrayList<c.h.a.i.b> arrayList3 = new ArrayList<>();
            if (this.B1 != null) {
                if (this.m3.equals("true")) {
                    aVar = this.B1;
                    str = "radio_streams";
                    context = this.f28731k;
                } else {
                    aVar = this.B1;
                    str = "live";
                    context = this.f28731k;
                }
                ArrayList<c.h.a.i.b> arrayListP = aVar.p(str, c.h.a.i.q.m.z(context));
                ArrayList<c.h.a.i.f> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = this.D0;
                if (arrayList5 == null || arrayList5.size() <= 0 || arrayListP == null || arrayListP.size() <= 0) {
                    arrayList3 = arrayListP;
                } else {
                    try {
                        for (c.h.a.i.b bVar : arrayListP) {
                            Iterator<String> it = this.D0.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = false;
                                    break;
                                }
                                if (bVar.a().equals(it.next())) {
                                    z2 = true;
                                    break;
                                }
                            }
                            if (!z2) {
                                arrayList3.add(bVar);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    for (c.h.a.i.b bVar2 : arrayList3) {
                        c.h.a.i.f fVarD1 = new c.h.a.i.q.f(this.f28731k).D1(bVar2.a(), String.valueOf(bVar2.e()));
                        if (fVarD1 != null) {
                            arrayList4.add(fVarD1);
                        }
                    }
                } catch (Exception unused2) {
                }
                if (arrayList4.size() != 0) {
                    this.x0 = arrayList4;
                }
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.J2.C()));
            String str2 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f28731k)));
            boolean zB = this.J2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.U.z1(null, str2) : null;
            this.f0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f28731k).equals("m3u") ? this.Z.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.Z.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList6 = this.x0;
            if (arrayList6 != null && arrayList6.size() > 0) {
                for (int i2 = 0; i2 < this.x0.size() && ((asyncTask = this.s2) == null || !asyncTask.isCancelled()); i2++) {
                    if (c.h.a.i.q.m.f(this.f28731k).equals("m3u")) {
                        if (this.x0.get(i2).e0().equals(string)) {
                            this.h3 = i2;
                        }
                    } else if (this.x0.get(i2).Y().equals(string)) {
                        this.h3 = i2;
                    }
                    c.h.a.i.f fVar = new c.h.a.i.f();
                    fVar.u0(this.x0.get(i2).P());
                    fVar.t0(this.x0.get(i2).getName());
                    fVar.C0(this.x0.get(i2).Z());
                    fVar.B0(this.x0.get(i2).Y());
                    fVar.A0(this.x0.get(i2).X());
                    fVar.l0(this.x0.get(i2).I());
                    fVar.f0(this.x0.get(i2).f());
                    fVar.g0(this.x0.get(i2).g());
                    fVar.j0(this.x0.get(i2).D());
                    fVar.D0(this.x0.get(i2).a0());
                    fVar.k0(this.x0.get(i2).F());
                    fVar.E0(this.x0.get(i2).b0());
                    fVar.F0(this.x0.get(i2).d0());
                    fVar.h0(this.x0.get(i2).B());
                    fVar.z0(this.x0.get(i2).W());
                    fVar.p0(this.x0.get(i2).M());
                    fVar.i0(this.x0.get(i2).C());
                    fVar.G0(this.x0.get(i2).e0());
                    if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                        int i3 = 0;
                        while (true) {
                            if (i3 < arrayListZ1.size() && ((asyncTask2 = this.s2) == null || !asyncTask2.isCancelled())) {
                                if (this.x0.get(i2).I().equals(arrayListZ1.get(i3).a())) {
                                    int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f28731k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f28731k)).longValue(), this.f28731k);
                                    if (iZ != 0) {
                                        iZ = 100 - iZ;
                                    }
                                    fVar.m0(iZ);
                                    fVar.v0(arrayListZ1.get(i3).m());
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    this.y0.add(fVar);
                }
            }
            this.x0 = this.y0;
            return "get_fav";
        } catch (Exception unused3) {
            return "get_fav";
        }
    }

    public int s2(ArrayList<c.h.a.i.f> arrayList, int i2) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            try {
                if (c.h.a.h.n.e.S(arrayList.get(i3).P()) == i2) {
                    return i3;
                }
            } catch (Exception unused) {
                return 0;
            }
        }
        return 0;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public final ArrayList<String> t2() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.U.d1(c.h.a.i.q.m.z(this.f28731k));
        this.F0 = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.D0.add(iVar.b());
                }
            }
        }
        return this.D0;
    }

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }

    public final boolean u2(ArrayList<c.h.a.i.f> arrayList, ArrayList<String> arrayList2) {
        try {
            for (c.h.a.i.f fVar : arrayList) {
                Iterator<String> it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (fVar.g().equals(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final ArrayList<c.h.a.i.b> v2(ArrayList<c.h.a.i.b> arrayList, ArrayList<String> arrayList2) {
        try {
            this.I0 = new ArrayList<>();
            for (c.h.a.i.b bVar : arrayList) {
                boolean z2 = false;
                Iterator<String> it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (bVar.a().equals(it.next())) {
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    this.I0.add(bVar);
                }
            }
        } catch (Exception unused) {
        }
        return this.I0;
    }

    public final ArrayList<c.h.a.i.c> w2(ArrayList<c.h.a.i.c> arrayList, ArrayList<String> arrayList2) {
        this.J0 = new ArrayList<>();
        if (arrayList == null) {
            return null;
        }
        try {
            for (c.h.a.i.c cVar : arrayList) {
                boolean z2 = false;
                if (arrayList2 != null) {
                    Iterator<String> it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (cVar.a().equals(it.next())) {
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        this.J0.add(cVar);
                    }
                }
            }
            return this.J0;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void x2() {
        ProgressBar progressBar = this.B;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(this.f28731k.getResources().getString(R.string.now_program_found));
        }
        TextView textView2 = this.x;
        if (textView2 != null) {
            textView2.setText(BuildConfig.FLAVOR);
        }
        TextView textView3 = this.y;
        if (textView3 != null) {
            textView3.setText(this.f28731k.getResources().getString(R.string.next_program_found));
        }
        TextView textView4 = this.z;
        if (textView4 != null) {
            textView4.setText(BuildConfig.FLAVOR);
        }
    }

    public final void y2() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.X2);
            this.ll_bottom_footer_icons.startAnimation(this.X2);
            this.ll_top_right_setting.startAnimation(this.X2);
            this.ll_top_left_back.startAnimation(this.X2);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.X2);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.X2);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.X2);
            }
            this.ll_player_header_footer.setVisibility(8);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.setVisibility(8);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.setVisibility(8);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.setVisibility(8);
            }
            this.ll_bottom_footer_icons.setVisibility(8);
            this.ll_top_right_setting.setVisibility(8);
            this.ll_top_left_back.setVisibility(8);
        }
    }

    public void z2() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.X2);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.X2);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.X2);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.X2);
            }
            this.ll_player_header_footer.setVisibility(8);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.setVisibility(8);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.setVisibility(8);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.setVisibility(8);
            }
            this.ll_bottom_footer_icons.setVisibility(8);
            this.ll_top_right_setting.setVisibility(8);
            this.ll_top_left_back.setVisibility(8);
        }
    }
}
