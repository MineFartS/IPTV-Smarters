package com.nst.iptvsmarterstvbox.view.ijkplayer.activities;

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
import android.widget.FrameLayout;
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
import c.h.a.h.n.e;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.LocalDateTime;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerSkyTvActivity extends a.b.k.c implements SurfaceHolder.Callback, View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static SharedPreferences f29286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SharedPreferences f29287e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f29289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f29290h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ProgressBar f29292j;
    public LinearLayout A;
    public ArrayList<c.h.a.i.f> A0;
    public int A2;
    public ProgressBar B;
    public ArrayList<c.h.a.i.f> B0;
    public c.h.a.i.q.a B1;
    public SharedPreferences B2;
    public LinearLayout C;
    public ArrayList<c.h.a.i.f> C0;
    public SharedPreferences.Editor C1;
    public Boolean C2;
    public LinearLayout D;
    public SharedPreferences.Editor D1;
    public Boolean D2;
    public ArrayList<c.h.a.i.e> E0;
    public TextView E1;
    public Boolean E2;
    public ArrayList<c.h.a.i.q.i> F0;
    public String F1;
    public Boolean F2;
    public SharedPreferences G0;
    public TextView G1;
    public Boolean G2;
    public SharedPreferences.Editor H0;
    public Handler H1;
    public Boolean H2;
    public int I;
    public ArrayList<c.h.a.i.b> I0;
    public Handler I1;
    public c.h.a.k.d.a.a I2;
    public String J;
    public ArrayList<c.h.a.i.c> J0;
    public Handler J1;
    public Handler J2;
    public String K;
    public RecyclerView K0;
    public Handler K1;
    public Handler K2;
    public String L;
    public ProgressBar L0;
    public Handler L1;
    public ArrayList<ExternalPlayerModelClass> L2;
    public RelativeLayout M;
    public Toolbar M0;
    public Handler M1;
    public int M2;
    public ListView N;
    public SearchView N0;
    public SharedPreferences.Editor N1;
    public String N2;
    public ListView O;
    public TextView O0;
    public SharedPreferences.Editor O1;
    public String O2;
    public ArrayList<c.h.a.i.f> P;
    public LinearLayout P0;
    public SharedPreferences.Editor P1;
    public Boolean P2;
    public LinearLayout Q0;
    public TextView Q1;
    public Animation Q2;
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
    public String Z2;
    public RelativeLayout a1;
    public DateFormat a2;
    public c.h.a.k.b.r a3;
    public RelativeLayout b1;
    public String b2;
    public c.h.a.k.b.r b3;
    public String c2;
    public c.h.a.k.b.s c3;
    public String d2;
    public c.h.a.k.b.t d3;
    public TextView e1;
    public SimpleDateFormat e2;
    public LinearLayoutManager e3;

    @BindView
    public EditText et_search_left_side;
    public SharedPreferences f0;
    public TextView f1;
    public NSTIJKPlayerSkyTv f2;
    public LinearLayoutManager f3;

    @BindView
    public FrameLayout fl_sub_font_size;
    public SharedPreferences g0;
    public TextView g1;
    public Date g2;
    public int g3;
    public SharedPreferences h0;
    public TextView h1;
    public String h2;
    public Animation h3;

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
    public String j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f29293k;
    public String k0;
    public TextView k1;
    public String k2;
    public String k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f29294l;
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
    public View f29295m;
    public TextView m1;
    public c.h.a.k.h.d.c.b m2;
    public String m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f29296n;
    public TextView n0;
    public TextView n1;
    public String n2;
    public int n3;

    @BindView
    public TextView no_audio_track;

    @BindView
    public TextView no_subtitle_track;

    @BindView
    public TextView no_video_track;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f29297o;
    public ArrayList<c.h.a.i.e> o0;
    public TextView o1;
    public int o2;
    public boolean o3;
    public String p;
    public ArrayList<c.h.a.i.e> p0;
    public TextView p1;
    public int p2;
    public boolean p3;
    public View q;
    public ArrayList<c.h.a.i.e> q0;
    public TextView q1;
    public String q2;
    public c.h.a.i.q.g q3;
    public View r;
    public ArrayList<c.h.a.i.e> r0;
    public LinearLayout r1;
    public Boolean r2;
    public Thread r3;

    @BindView
    public RecyclerView recycler_view_left_sidebar;

    @BindView
    public RecyclerView recycler_view_left_sidebar_player;

    @BindView
    public RadioGroup rg_audio;

    @BindView
    public RadioGroup rg_subtitle;

    @BindView
    public RadioGroup rg_video;

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
    public Boolean s3;

    @BindView
    public SeekBar sb_brightness;

    @BindView
    public SeekBar sb_volume;
    public LinearLayout t;
    public ArrayList<c.h.a.i.f> t0;
    public LinearLayout t1;
    public AsyncTask t2;
    public boolean t3;

    @BindView
    public TextView tv_brightness;

    @BindView
    public TextView tv_episode_name;

    @BindView
    public TextView tv_sub_font_size;

    @BindView
    public TextView tv_volume;
    public TextView u;
    public ArrayList<c.h.a.i.f> u0;
    public LinearLayout u1;
    public AsyncTask u2;
    public ImageView v;
    public ArrayList<c.h.a.i.f> v0;
    public LinearLayout v1;
    public ProgressDialog v2;
    public TextView w;
    public ArrayList<c.h.a.i.f> w0;
    public LinearLayout w1;
    public boolean w2;
    public TextView x;
    public ArrayList<c.h.a.i.f> x0;
    public LinearLayout x1;
    public int x2;
    public TextView y;
    public ArrayList<c.h.a.i.f> y0;
    public String y1;
    public boolean y2;
    public TextView z;
    public ArrayList<c.h.a.i.f> z0;
    public int z1;
    public int z2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f29288f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f29291i = {0, 1, 2, 3, 4, 5};
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
            NSTIJKPlayerSkyTvActivity.this.V2(BuildConfig.FLAVOR, false);
            NSTIJKPlayerSkyTvActivity.this.s3 = Boolean.TRUE;
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class a0 extends AsyncTask<String, String, String> {
        public a0() {
        }

        public String a() {
            c.h.a.i.q.f fVar;
            String str;
            String str2;
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            try {
                NSTIJKPlayerSkyTvActivity.this.g3 = 0;
                if (NSTIJKPlayerSkyTvActivity.this.x0 != null) {
                    NSTIJKPlayerSkyTvActivity.this.x0.clear();
                }
                if (NSTIJKPlayerSkyTvActivity.this.l3.equals("true")) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                    fVar = nSTIJKPlayerSkyTvActivity2.U;
                    str = nSTIJKPlayerSkyTvActivity2.O2;
                    str2 = "radio_streams";
                } else {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
                    fVar = nSTIJKPlayerSkyTvActivity3.U;
                    str = nSTIJKPlayerSkyTvActivity3.O2;
                    str2 = "live";
                }
                NSTIJKPlayerSkyTvActivity.this.x0 = fVar.W0(str, str2);
                if (NSTIJKPlayerSkyTvActivity.this.y0 != null) {
                    NSTIJKPlayerSkyTvActivity.this.y0.clear();
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(NSTIJKPlayerSkyTvActivity.this.I2.C()));
                String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(NSTIJKPlayerSkyTvActivity.this.f29293k)));
                boolean zB = NSTIJKPlayerSkyTvActivity.this.I2.B();
                ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? NSTIJKPlayerSkyTvActivity.this.U.z1(null, str3) : null;
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity4.f0 = nSTIJKPlayerSkyTvActivity4.getSharedPreferences("currentlyPlayingVideo", 0);
                String string = c.h.a.i.q.m.f(NSTIJKPlayerSkyTvActivity.this.f29293k).equals("m3u") ? NSTIJKPlayerSkyTvActivity.this.Z.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : NSTIJKPlayerSkyTvActivity.this.Z.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
                if (NSTIJKPlayerSkyTvActivity.this.x0 != null && NSTIJKPlayerSkyTvActivity.this.x0.size() > 0) {
                    for (int i2 = 0; i2 < NSTIJKPlayerSkyTvActivity.this.x0.size() && (NSTIJKPlayerSkyTvActivity.this.s2 == null || !NSTIJKPlayerSkyTvActivity.this.s2.isCancelled()); i2++) {
                        if (c.h.a.i.q.m.f(NSTIJKPlayerSkyTvActivity.this.f29293k).equals("m3u")) {
                            if (((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).e0().equals(string)) {
                                NSTIJKPlayerSkyTvActivity.this.g3 = i2;
                                nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity.R1 = nSTIJKPlayerSkyTvActivity.g3;
                            }
                        } else if (((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).Y().equals(string)) {
                            NSTIJKPlayerSkyTvActivity.this.g3 = i2;
                            nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity.R1 = nSTIJKPlayerSkyTvActivity.g3;
                        }
                        c.h.a.i.f fVar2 = new c.h.a.i.f();
                        fVar2.u0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).P());
                        fVar2.t0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).getName());
                        fVar2.C0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).Z());
                        fVar2.B0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).Y());
                        fVar2.A0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).X());
                        fVar2.l0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).I());
                        fVar2.f0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).f());
                        fVar2.g0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).g());
                        fVar2.j0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).D());
                        fVar2.D0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).a0());
                        fVar2.k0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).F());
                        fVar2.E0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).b0());
                        fVar2.F0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).d0());
                        fVar2.h0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).B());
                        fVar2.z0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).W());
                        fVar2.p0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).M());
                        fVar2.i0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).C());
                        fVar2.G0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).e0());
                        if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                            int i3 = 0;
                            while (true) {
                                if (i3 < arrayListZ1.size() && (NSTIJKPlayerSkyTvActivity.this.s2 == null || !NSTIJKPlayerSkyTvActivity.this.s2.isCancelled())) {
                                    if (((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).I().equals(arrayListZ1.get(i3).a())) {
                                        int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), NSTIJKPlayerSkyTvActivity.this.f29293k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), NSTIJKPlayerSkyTvActivity.this.f29293k)).longValue(), NSTIJKPlayerSkyTvActivity.this.f29293k);
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
                        NSTIJKPlayerSkyTvActivity.this.y0.add(fVar2);
                    }
                }
                NSTIJKPlayerSkyTvActivity.this.x0.clear();
                NSTIJKPlayerSkyTvActivity.this.x0.addAll(NSTIJKPlayerSkyTvActivity.this.y0);
                return "all_channels_with_cat";
            } catch (Exception unused) {
                return "all_channels_with_cat";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return NSTIJKPlayerSkyTvActivity.this.O2.equals("-1") ? c.h.a.i.q.m.f(NSTIJKPlayerSkyTvActivity.this.f29293k).equals("m3u") ? NSTIJKPlayerSkyTvActivity.this.m2() : NSTIJKPlayerSkyTvActivity.this.n2() : NSTIJKPlayerSkyTvActivity.this.O2.equals("-6") ? NSTIJKPlayerSkyTvActivity.this.W1() : a();
            } catch (Exception unused) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTIJKPlayerSkyTvActivity.this.x0 != null) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity.U2(nSTIJKPlayerSkyTvActivity.x0);
                    if (!NSTIJKPlayerSkyTvActivity.this.X1.booleanValue()) {
                        NSTIJKPlayerSkyTvActivity.this.X1 = Boolean.TRUE;
                        if (NSTIJKPlayerSkyTvActivity.this.x0 == null || NSTIJKPlayerSkyTvActivity.this.x0.size() == 0) {
                            c.h.a.h.n.a.G = Boolean.FALSE;
                            NSTIJKPlayerSkyTvActivity.this.H2();
                        } else if (NSTIJKPlayerSkyTvActivity.this.k3.equals("true") || NSTIJKPlayerSkyTvActivity.this.I2.i()) {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity2.N2(nSTIJKPlayerSkyTvActivity2.x0);
                        } else {
                            LinearLayout linearLayout = NSTIJKPlayerSkyTvActivity.this.ll_click_to_play;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(0);
                            }
                        }
                    }
                }
                NSTIJKPlayerSkyTvActivity.this.z2();
                NSTIJKPlayerSkyTvActivity.this.w2();
                NSTIJKPlayerSkyTvActivity.this.e2();
                NSTIJKPlayerSkyTvActivity.this.d2();
            } catch (Exception unused) {
                NSTIJKPlayerSkyTvActivity.this.z2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            LinearLayout linearLayout;
            super.onPreExecute();
            try {
                RelativeLayout relativeLayout = NSTIJKPlayerSkyTvActivity.this.rl_episodes_box_player;
                if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                    NSTIJKPlayerSkyTvActivity.this.j3 = BuildConfig.FLAVOR;
                } else {
                    NSTIJKPlayerSkyTvActivity.this.j3 = "player";
                }
            } catch (Exception unused) {
            }
            NSTIJKPlayerSkyTvActivity.this.a3();
            if (NSTIJKPlayerSkyTvActivity.this.j3.equals("player")) {
                if (NSTIJKPlayerSkyTvActivity.this.O != null) {
                    NSTIJKPlayerSkyTvActivity.this.O.setVisibility(8);
                }
                linearLayout = NSTIJKPlayerSkyTvActivity.this.Q0;
                if (linearLayout == null) {
                    return;
                }
            } else {
                if (NSTIJKPlayerSkyTvActivity.this.N != null) {
                    NSTIJKPlayerSkyTvActivity.this.N.setVisibility(8);
                }
                linearLayout = NSTIJKPlayerSkyTvActivity.this.P0;
                if (linearLayout == null) {
                    return;
                }
            }
            linearLayout.setVisibility(8);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f29300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f29302d;

        public b(String str, String str2, int i2) {
            this.f29300b = str;
            this.f29301c = str2;
            this.f29302d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
            String str;
            if (NSTIJKPlayerSkyTvActivity.this.c2.equals("m3u")) {
                nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTvActivity.this.f2;
                str = this.f29300b;
            } else {
                nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTvActivity.this.f2;
                str = NSTIJKPlayerSkyTvActivity.this.f29294l + c.h.a.h.n.e.R(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.z0.get(this.f29302d)).Y()) + NSTIJKPlayerSkyTvActivity.this.k0;
            }
            nSTIJKPlayerSkyTv.a1(Uri.parse(str), NSTIJKPlayerSkyTvActivity.f29288f, this.f29301c);
            NSTIJKPlayerSkyTvActivity.this.f2.K = 0;
            NSTIJKPlayerSkyTvActivity.this.f2.M = false;
            NSTIJKPlayerSkyTvActivity.this.f2.start();
            NSTIJKPlayerSkyTvActivity.this.K1.removeCallbacksAndMessages(null);
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
            nSTIJKPlayerSkyTvActivity.K = ((c.h.a.i.f) nSTIJKPlayerSkyTvActivity.z0.get(this.f29302d)).I();
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
            nSTIJKPlayerSkyTvActivity2.L = ((c.h.a.i.f) nSTIJKPlayerSkyTvActivity2.z0.get(this.f29302d)).X();
            NSTIJKPlayerSkyTvActivity.this.f2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.K);
            NSTIJKPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.L);
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
            nSTIJKPlayerSkyTvActivity3.g3(nSTIJKPlayerSkyTvActivity3.L);
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = NSTIJKPlayerSkyTvActivity.this;
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = NSTIJKPlayerSkyTvActivity.this;
            nSTIJKPlayerSkyTvActivity4.u2 = new c0(nSTIJKPlayerSkyTvActivity5, nSTIJKPlayerSkyTvActivity5.K, null).execute(new String[0]);
        }
    }

    public class b0 implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f29304b;

        public b0(View view) {
            this.f29304b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29304b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29304b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29304b, "scaleY", f2);
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
                View view10 = this.f29304b;
                if (view10 == null || view10.getTag() == null || !this.f29304b.getTag().equals("1")) {
                    View view11 = this.f29304b;
                    if (view11 == null || view11.getTag() == null || !this.f29304b.getTag().equals("2")) {
                        View view12 = this.f29304b;
                        if (view12 == null || view12.getTag() == null || !this.f29304b.getTag().equals("3")) {
                            View view13 = this.f29304b;
                            if ((view13 == null || view13.getTag() == null || !this.f29304b.getTag().equals("4")) && (((view6 = this.f29304b) == null || view6.getTag() == null || !this.f29304b.getTag().equals("5")) && (((view7 = this.f29304b) == null || view7.getTag() == null || !this.f29304b.getTag().equals("6")) && ((view8 = this.f29304b) == null || view8.getTag() == null || !this.f29304b.getTag().equals("7"))))) {
                                View view14 = this.f29304b;
                                if (view14 != null && view14.getTag() != null && this.f29304b.getTag().equals("8")) {
                                    return;
                                }
                                View view15 = this.f29304b;
                                if (view15 == null || view15.getTag() == null || !this.f29304b.getTag().equals("9")) {
                                    View view16 = this.f29304b;
                                    if (view16 != null && view16.getTag() != null && this.f29304b.getTag().equals("10")) {
                                        return;
                                    }
                                    View view17 = this.f29304b;
                                    if (view17 == null || view17.getTag() == null || !this.f29304b.getTag().equals("11")) {
                                        View view18 = this.f29304b;
                                        if (view18 == null || view18.getTag() == null || !this.f29304b.getTag().equals("12")) {
                                            View view19 = this.f29304b;
                                            if ((view19 == null || view19.getTag() == null || !this.f29304b.getTag().equals("13")) && ((view9 = this.f29304b) == null || view9.getTag() == null || !this.f29304b.getTag().equals("14"))) {
                                                return;
                                            }
                                        } else {
                                            resources = NSTIJKPlayerSkyTvActivity.this.getResources();
                                            i2 = R.drawable.blue_btn_effect;
                                        }
                                    } else {
                                        resources = NSTIJKPlayerSkyTvActivity.this.getResources();
                                        i2 = R.color.hp_cyan_dark;
                                    }
                                    drawable = resources.getDrawable(i2);
                                }
                            }
                            drawable = NSTIJKPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow_light);
                        }
                        view.setBackground(NSTIJKPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                        b(f2);
                        c(f2);
                        return;
                    }
                    view.setBackground(NSTIJKPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                    b(f2);
                    c(f2);
                    linearLayout = NSTIJKPlayerSkyTvActivity.this.ll_audio_subtitle_settings;
                } else {
                    view.setBackground(NSTIJKPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                    b(f2);
                    c(f2);
                    linearLayout = NSTIJKPlayerSkyTvActivity.this.ll_back;
                }
                i3 = 0;
                linearLayout.setVisibility(i3);
                return;
            }
            if (z) {
                return;
            }
            float f3 = z ? 1.08f : 1.0f;
            View view20 = this.f29304b;
            if (view20 == null || view20.getTag() == null || !this.f29304b.getTag().equals("1")) {
                View view21 = this.f29304b;
                if (view21 == null || view21.getTag() == null || !this.f29304b.getTag().equals("2")) {
                    View view22 = this.f29304b;
                    if (view22 == null || view22.getTag() == null || !this.f29304b.getTag().equals("3")) {
                        View view23 = this.f29304b;
                        if ((view23 == null || view23.getTag() == null || !this.f29304b.getTag().equals("4")) && (((view2 = this.f29304b) == null || view2.getTag() == null || !this.f29304b.getTag().equals("5")) && (((view3 = this.f29304b) == null || view3.getTag() == null || !this.f29304b.getTag().equals("6")) && ((view4 = this.f29304b) == null || view4.getTag() == null || !this.f29304b.getTag().equals("7"))))) {
                            View view24 = this.f29304b;
                            if (view24 != null && view24.getTag() != null && this.f29304b.getTag().equals("8")) {
                                return;
                            }
                            View view25 = this.f29304b;
                            if (view25 == null || view25.getTag() == null || !this.f29304b.getTag().equals("9")) {
                                View view26 = this.f29304b;
                                if (view26 != null && view26.getTag() != null && this.f29304b.getTag().equals("10")) {
                                    return;
                                }
                                View view27 = this.f29304b;
                                if (view27 == null || view27.getTag() == null || !this.f29304b.getTag().equals("11")) {
                                    View view28 = this.f29304b;
                                    if (view28 == null || view28.getTag() == null || !this.f29304b.getTag().equals("12")) {
                                        View view29 = this.f29304b;
                                        if ((view29 == null || view29.getTag() == null || !this.f29304b.getTag().equals("13")) && ((view5 = this.f29304b) == null || view5.getTag() == null || !this.f29304b.getTag().equals("14"))) {
                                            return;
                                        }
                                    } else {
                                        resources = NSTIJKPlayerSkyTvActivity.this.getResources();
                                        i2 = R.drawable.black_button_dark;
                                    }
                                } else {
                                    resources = NSTIJKPlayerSkyTvActivity.this.getResources();
                                    i2 = R.color.cat_search_background_live;
                                }
                                drawable = resources.getDrawable(i2);
                            }
                        }
                        view.setBackground(null);
                        return;
                    }
                    view.setBackground(NSTIJKPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                    b(f3);
                    c(f3);
                    a(z);
                    return;
                }
                view.setBackground(NSTIJKPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                b(f3);
                c(f3);
                a(z);
                linearLayout = NSTIJKPlayerSkyTvActivity.this.ll_audio_subtitle_settings;
            } else {
                view.setBackground(NSTIJKPlayerSkyTvActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                b(f3);
                c(f3);
                a(z);
                linearLayout = NSTIJKPlayerSkyTvActivity.this.ll_back;
            }
            i3 = 8;
            linearLayout.setVisibility(i3);
            return;
            view.setBackground(drawable);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.V2(BuildConfig.FLAVOR, false);
            NSTIJKPlayerSkyTvActivity.this.s3 = Boolean.TRUE;
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class c0 extends AsyncTask<String, Void, HashMap<String, ArrayList<String>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f29307a;

        public c0(String str) {
            this.f29307a = str;
        }

        public /* synthetic */ c0(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, String str, k kVar) {
            this(str);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap<String, ArrayList<String>> doInBackground(String... strArr) {
            try {
                return NSTIJKPlayerSkyTvActivity.this.X2(this.f29307a);
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
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.c0.onPostExecute(java.util.HashMap):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                NSTIJKPlayerSkyTvActivity.this.E2();
                LinearLayout linearLayout = NSTIJKPlayerSkyTvActivity.this.r1;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = NSTIJKPlayerSkyTvActivity.this.t1;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                LinearLayout linearLayout3 = NSTIJKPlayerSkyTvActivity.this.u1;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = NSTIJKPlayerSkyTvActivity.this.v1;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                LinearLayout linearLayout5 = NSTIJKPlayerSkyTvActivity.this.w1;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                LinearLayout linearLayout6 = NSTIJKPlayerSkyTvActivity.this.x1;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f29309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f29311d;

        public d(String str, String str2, int i2) {
            this.f29309b = str;
            this.f29310c = str2;
            this.f29311d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
            String str;
            if (NSTIJKPlayerSkyTvActivity.this.c2.equals("m3u")) {
                nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTvActivity.this.f2;
                str = this.f29309b;
            } else {
                nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTvActivity.this.f2;
                str = NSTIJKPlayerSkyTvActivity.this.f29294l + c.h.a.h.n.e.R(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.z0.get(this.f29311d)).Y()) + NSTIJKPlayerSkyTvActivity.this.k0;
            }
            nSTIJKPlayerSkyTv.a1(Uri.parse(str), NSTIJKPlayerSkyTvActivity.f29288f, this.f29310c);
            NSTIJKPlayerSkyTvActivity.this.f2.K = 0;
            NSTIJKPlayerSkyTvActivity.this.f2.M = false;
            NSTIJKPlayerSkyTvActivity.this.f2.start();
            NSTIJKPlayerSkyTvActivity.this.K1.removeCallbacksAndMessages(null);
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
            nSTIJKPlayerSkyTvActivity.K = ((c.h.a.i.f) nSTIJKPlayerSkyTvActivity.z0.get(this.f29311d)).I();
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
            nSTIJKPlayerSkyTvActivity2.L = ((c.h.a.i.f) nSTIJKPlayerSkyTvActivity2.z0.get(this.f29311d)).X();
            NSTIJKPlayerSkyTvActivity.this.f2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.K);
            NSTIJKPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.L);
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
            nSTIJKPlayerSkyTvActivity3.g3(nSTIJKPlayerSkyTvActivity3.L);
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = NSTIJKPlayerSkyTvActivity.this;
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = NSTIJKPlayerSkyTvActivity.this;
            nSTIJKPlayerSkyTvActivity4.u2 = new c0(nSTIJKPlayerSkyTvActivity5, nSTIJKPlayerSkyTvActivity5.K, null).execute(new String[0]);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class d0 extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f29315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f29316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f29317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f29318f;

        public d0(String str, int i2, String str2, String str3, String str4, int i3) {
            this.f29313a = str;
            this.f29314b = i2;
            this.f29315c = str2;
            this.f29316d = str3;
            this.f29317e = str4;
            this.f29318f = i3;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity.f29293k == null || nSTIJKPlayerSkyTvActivity.c3 == null || NSTIJKPlayerSkyTvActivity.this.B1 == null || NSTIJKPlayerSkyTvActivity.this.a3 == null || NSTIJKPlayerSkyTvActivity.this.N == null) {
                    return null;
                }
                c.h.a.i.b bVar = new c.h.a.i.b();
                bVar.h(this.f29313a);
                bVar.m(this.f29314b);
                bVar.l(this.f29316d);
                bVar.k(this.f29315c);
                bVar.o(c.h.a.i.q.m.z(NSTIJKPlayerSkyTvActivity.this.f29293k));
                NSTIJKPlayerSkyTvActivity.this.B1.i(bVar, this.f29317e);
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
                View childAt = NSTIJKPlayerSkyTvActivity.this.N.getChildAt(this.f29318f - NSTIJKPlayerSkyTvActivity.this.N.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(R.id.iv_favourite)).setVisibility(0);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                NSTIJKPlayerSkyTvActivity.this.a3.y(1);
                NSTIJKPlayerSkyTvActivity.this.z2();
            } catch (Exception unused) {
                NSTIJKPlayerSkyTvActivity.this.z2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTIJKPlayerSkyTvActivity.this.v2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity.v2 = NSTIJKPlayerSkyTvActivity.f2(nSTIJKPlayerSkyTvActivity.f29293k);
                if (NSTIJKPlayerSkyTvActivity.this.v2 == null) {
                    return;
                }
            } else if (NSTIJKPlayerSkyTvActivity.this.v2.isShowing()) {
                return;
            }
            NSTIJKPlayerSkyTvActivity.this.v2.show();
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
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            boolean z;
            if (charSequence == null || charSequence.toString().length() <= 0) {
                nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                z = false;
            } else {
                nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                z = true;
            }
            nSTIJKPlayerSkyTvActivity.t3 = z;
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
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L34
                boolean r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.G1(r2)     // Catch: java.lang.Exception -> L34
                if (r2 == 0) goto L34
            L14:
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L34
                c.h.a.k.b.r r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.C1(r2)     // Catch: java.lang.Exception -> L34
                if (r2 == 0) goto L34
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L34
                c.h.a.k.b.r r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.C1(r2)     // Catch: java.lang.Exception -> L34
                android.widget.Filter r2 = r2.getFilter()     // Catch: java.lang.Exception -> L34
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L34
                r2.filter(r1)     // Catch: java.lang.Exception -> L34
                java.lang.String r1 = "honey"
                java.lang.String r2 = "onTextChanged: notify"
                android.util.Log.e(r1, r2)     // Catch: java.lang.Exception -> L34
            L34:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.e.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class e0 extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f29322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f29323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f29324d;

        public e0(String str, String str2, String str3, int i2) {
            this.f29321a = str;
            this.f29322b = str2;
            this.f29323c = str3;
            this.f29324d = i2;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity.f29293k == null || nSTIJKPlayerSkyTvActivity.c3 == null) {
                    return null;
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity2.U == null || nSTIJKPlayerSkyTvActivity2.a3 == null || NSTIJKPlayerSkyTvActivity.this.N == null) {
                    return null;
                }
                c.h.a.i.c cVar = new c.h.a.i.c();
                cVar.h(this.f29322b);
                cVar.i(c.h.a.i.q.m.z(NSTIJKPlayerSkyTvActivity.this.f29293k));
                cVar.g(this.f29323c);
                cVar.e(this.f29321a);
                NSTIJKPlayerSkyTvActivity.this.U.Q(cVar);
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
                View childAt = NSTIJKPlayerSkyTvActivity.this.N.getChildAt(this.f29324d - NSTIJKPlayerSkyTvActivity.this.N.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(R.id.iv_favourite)).setVisibility(0);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                NSTIJKPlayerSkyTvActivity.this.a3.y(1);
                NSTIJKPlayerSkyTvActivity.this.z2();
            } catch (Exception unused) {
                NSTIJKPlayerSkyTvActivity.this.z2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTIJKPlayerSkyTvActivity.this.v2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity.v2 = NSTIJKPlayerSkyTvActivity.f2(nSTIJKPlayerSkyTvActivity.f29293k);
                if (NSTIJKPlayerSkyTvActivity.this.v2 == null) {
                    return;
                }
            } else if (NSTIJKPlayerSkyTvActivity.this.v2.isShowing()) {
                return;
            }
            NSTIJKPlayerSkyTvActivity.this.v2.show();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.v2();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class f0 extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f29329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f29330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f29331e;

        public f0(String str, int i2, String str2, String str3, int i3) {
            this.f29327a = str;
            this.f29328b = i2;
            this.f29329c = str2;
            this.f29330d = str3;
            this.f29331e = i3;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity.f29293k == null || nSTIJKPlayerSkyTvActivity.c3 == null || NSTIJKPlayerSkyTvActivity.this.B1 == null || NSTIJKPlayerSkyTvActivity.this.a3 == null || NSTIJKPlayerSkyTvActivity.this.N == null) {
                    return null;
                }
                NSTIJKPlayerSkyTvActivity.this.B1.o(this.f29328b, this.f29327a, this.f29330d, this.f29329c, c.h.a.i.q.m.z(NSTIJKPlayerSkyTvActivity.this.f29293k));
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
                View childAt = NSTIJKPlayerSkyTvActivity.this.N.getChildAt(this.f29331e - NSTIJKPlayerSkyTvActivity.this.N.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(R.id.iv_favourite)).setVisibility(4);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                NSTIJKPlayerSkyTvActivity.this.a3.y(1);
                NSTIJKPlayerSkyTvActivity.this.z2();
            } catch (Exception unused) {
                NSTIJKPlayerSkyTvActivity.this.z2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTIJKPlayerSkyTvActivity.this.v2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity.v2 = NSTIJKPlayerSkyTvActivity.f2(nSTIJKPlayerSkyTvActivity.f29293k);
                if (NSTIJKPlayerSkyTvActivity.this.v2 == null) {
                    return;
                }
            } else if (NSTIJKPlayerSkyTvActivity.this.v2.isShowing()) {
                return;
            }
            NSTIJKPlayerSkyTvActivity.this.v2.show();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTvActivity.this.u2();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class g0 extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29335b;

        public g0(String str, int i2) {
            this.f29334a = str;
            this.f29335b = i2;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity.f29293k == null || nSTIJKPlayerSkyTvActivity.c3 == null) {
                    return null;
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity2.U == null || nSTIJKPlayerSkyTvActivity2.a3 == null || NSTIJKPlayerSkyTvActivity.this.N == null) {
                    return null;
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity3.U.I0(this.f29334a, c.h.a.i.q.m.z(nSTIJKPlayerSkyTvActivity3.f29293k));
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
                View childAt = NSTIJKPlayerSkyTvActivity.this.N.getChildAt(this.f29335b - NSTIJKPlayerSkyTvActivity.this.N.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(R.id.iv_favourite)).setVisibility(4);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                NSTIJKPlayerSkyTvActivity.this.a3.y(1);
                NSTIJKPlayerSkyTvActivity.this.z2();
            } catch (Exception unused) {
                NSTIJKPlayerSkyTvActivity.this.z2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTIJKPlayerSkyTvActivity.this.v2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity.v2 = NSTIJKPlayerSkyTvActivity.f2(nSTIJKPlayerSkyTvActivity.f29293k);
                if (NSTIJKPlayerSkyTvActivity.this.v2 == null) {
                    return;
                }
            } else if (NSTIJKPlayerSkyTvActivity.this.v2.isShowing()) {
                return;
            }
            NSTIJKPlayerSkyTvActivity.this.v2.show();
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
            c.h.a.h.n.e.O(NSTIJKPlayerSkyTvActivity.this.f29293k);
        }
    }

    public class j implements SearchView.l {
        public j() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            if (NSTIJKPlayerSkyTvActivity.this.c3 == null) {
                return false;
            }
            NSTIJKPlayerSkyTvActivity.this.c3.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyTvActivity.this.j2();
        }
    }

    public class l extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f29341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f29342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f29343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f29344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f29345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f29346g;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f29348b;

            public a(View view) {
                this.f29348b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f29348b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f29348b.getTag().equals("1")) {
                        View view3 = this.f29348b;
                        if (view3 == null || view3.getTag() == null || !this.f29348b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = l.this.f29346g;
                    }
                    linearLayout = l.this.f29345f;
                } else {
                    View view4 = this.f29348b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f29348b.getTag().equals("1")) {
                        View view5 = this.f29348b;
                        if (view5 == null || view5.getTag() == null || !this.f29348b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = l.this.f29346g;
                    }
                    linearLayout = l.this.f29345f;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public l(Activity activity) {
            super(activity);
            this.f29341b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
            } else if (id == R.id.btn_yes) {
                try {
                    if (NSTIJKPlayerSkyTvActivity.this.v2 == null) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity2.v2 = NSTIJKPlayerSkyTvActivity.f2(nSTIJKPlayerSkyTvActivity2.f29293k);
                        if (NSTIJKPlayerSkyTvActivity.this.v2 != null) {
                            nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity.v2.show();
                        }
                        NSTIJKPlayerSkyTvActivity.this.U.A0();
                        NSTIJKPlayerSkyTvActivity.this.D2("-6");
                        NSTIJKPlayerSkyTvActivity.this.a3.w();
                        NSTIJKPlayerSkyTvActivity.this.z2();
                    } else {
                        if (!NSTIJKPlayerSkyTvActivity.this.v2.isShowing()) {
                            nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity.v2.show();
                        }
                        NSTIJKPlayerSkyTvActivity.this.U.A0();
                        NSTIJKPlayerSkyTvActivity.this.D2("-6");
                        NSTIJKPlayerSkyTvActivity.this.a3.w();
                        NSTIJKPlayerSkyTvActivity.this.z2();
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
                if (NSTIJKPlayerSkyTvActivity.this.I2.A().equals(c.h.a.h.n.a.s0)) {
                    setContentView(R.layout.custom_alert_layout_tv);
                } else {
                    setContentView(R.layout.custom_alert_layout);
                }
                this.f29342c = (TextView) findViewById(R.id.btn_yes);
                this.f29343d = (TextView) findViewById(R.id.btn_no);
                this.f29345f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
                this.f29346g = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
                TextView textView = (TextView) findViewById(R.id.txt_dia);
                this.f29344e = textView;
                textView.setText(NSTIJKPlayerSkyTvActivity.this.getResources().getString(R.string.you_want_to_remove_all_channels_from_recently_watched));
                this.f29342c.setOnClickListener(this);
                this.f29343d.setOnClickListener(this);
                TextView textView2 = this.f29342c;
                textView2.setOnFocusChangeListener(new a(textView2));
                TextView textView3 = this.f29343d;
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
            NSTIJKPlayerSkyTvActivity.this.P2();
            c.h.a.h.n.e.N(NSTIJKPlayerSkyTvActivity.this.f29293k);
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

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                NSTIJKPlayerSkyTvActivity.this.i2 = Boolean.TRUE;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", NSTIJKPlayerSkyTvActivity.this.getPackageName(), null));
                NSTIJKPlayerSkyTvActivity.this.startActivityForResult(intent, 101);
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                Toast.makeText(nSTIJKPlayerSkyTvActivity, nSTIJKPlayerSkyTvActivity.f29293k.getResources().getString(R.string.grant_the_permission), 1).show();
            } catch (Exception unused) {
            }
            NSTIJKPlayerSkyTvActivity.this.j2.dismiss();
        }
    }

    public class p extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f29353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f29354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f29355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f29356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f29357f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f29358g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f29359h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f29361b;

            public a(View view) {
                this.f29361b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f29361b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f29361b.getTag().equals("1")) {
                        View view3 = this.f29361b;
                        if (view3 == null || view3.getTag() == null || !this.f29361b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = p.this.f29357f;
                    }
                    linearLayout = p.this.f29356e;
                } else {
                    View view4 = this.f29361b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f29361b.getTag().equals("1")) {
                        View view5 = this.f29361b;
                        if (view5 == null || view5.getTag() == null || !this.f29361b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = p.this.f29357f;
                    }
                    linearLayout = p.this.f29356e;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Activity activity, Activity activity2) {
            super(activity);
            this.f29359h = activity2;
            this.f29353b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
            } else if (id == R.id.btn_yes) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f29358g.getCheckedRadioButtonId());
                    c.h.a.i.q.m.T(radioButton.getText().toString().equals(this.f29359h.getResources().getString(R.string.sort_last_added)) ? "1" : radioButton.getText().toString().equals(this.f29359h.getResources().getString(R.string.sort_atoz)) ? "2" : radioButton.getText().toString().equals(this.f29359h.getResources().getString(R.string.sort_ztoa)) ? "3" : radioButton.getText().toString().equals(this.f29359h.getResources().getString(R.string.sort_channel_number_asc)) ? "4" : radioButton.getText().toString().equals(this.f29359h.getResources().getString(R.string.sort_channel_number_decs)) ? "5" : "0", this.f29359h);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity.D2(nSTIJKPlayerSkyTvActivity.O2);
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
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.p.onCreate(android.os.Bundle):void");
        }
    }

    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyTvActivity.this.j2.dismiss();
        }
    }

    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(NSTIJKPlayerSkyTvActivity.this.f29293k);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = NSTIJKPlayerSkyTvActivity.this.G1;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = NSTIJKPlayerSkyTvActivity.this.E1;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class s implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f29365b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyTvActivity.this.u2();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyTvActivity.this.V2(BuildConfig.FLAVOR, false);
                NSTIJKPlayerSkyTvActivity.this.s3 = Boolean.TRUE;
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyTvActivity.this.V2(BuildConfig.FLAVOR, false);
                NSTIJKPlayerSkyTvActivity.this.s3 = Boolean.TRUE;
            }
        }

        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyTvActivity.this.V2(BuildConfig.FLAVOR, false);
                NSTIJKPlayerSkyTvActivity.this.s3 = Boolean.TRUE;
            }
        }

        public class e implements Runnable {
            public e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyTvActivity.this.V2(BuildConfig.FLAVOR, false);
                NSTIJKPlayerSkyTvActivity.this.s3 = Boolean.TRUE;
            }
        }

        public s(ArrayList arrayList) {
            this.f29365b = arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:159:0x0ad8  */
        @Override // android.widget.AdapterView.OnItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemClick(android.widget.AdapterView<?> r18, android.view.View r19, int r20, long r21) {
            /*
                Method dump skipped, instruction units count: 2914
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.s.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    public class t implements AdapterView.OnItemSelectedListener {
        public t() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            AsyncTask<String, Void, HashMap<String, ArrayList<String>>> asyncTaskExecute;
            try {
                if (NSTIJKPlayerSkyTvActivity.this.u2 != null && NSTIJKPlayerSkyTvActivity.this.u2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    NSTIJKPlayerSkyTvActivity.this.u2.cancel(true);
                }
                ArrayList<c.h.a.i.f> arrayListG = NSTIJKPlayerSkyTvActivity.this.c3.g();
                k kVar = null;
                if (arrayListG != null && arrayListG.size() > 0) {
                    String strI = arrayListG.get(i2).I();
                    NSTIJKPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                    nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    asyncTaskExecute = new c0(NSTIJKPlayerSkyTvActivity.this, strI, kVar).execute(new String[0]);
                } else {
                    if (NSTIJKPlayerSkyTvActivity.this.x0 == null || NSTIJKPlayerSkyTvActivity.this.x0.size() <= 0) {
                        return;
                    }
                    String strI2 = ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).I();
                    NSTIJKPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                    nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    asyncTaskExecute = new c0(NSTIJKPlayerSkyTvActivity.this, strI2, kVar).execute(new String[0]);
                }
                nSTIJKPlayerSkyTvActivity.u2 = asyncTaskExecute;
            } catch (Exception unused) {
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class u implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f29373b;

        public u(ArrayList arrayList) {
            this.f29373b = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            LinearLayout linearLayout = NSTIJKPlayerSkyTvActivity.this.ll_click_to_play;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            try {
                if (NSTIJKPlayerSkyTvActivity.this.u2 != null && NSTIJKPlayerSkyTvActivity.this.u2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    NSTIJKPlayerSkyTvActivity.this.u2.cancel(true);
                }
                c.h.a.h.n.a.G = Boolean.TRUE;
                ArrayList<c.h.a.i.f> arrayListG = NSTIJKPlayerSkyTvActivity.this.c3.g();
                if (arrayListG == null || arrayListG.size() <= 0) {
                    if (NSTIJKPlayerSkyTvActivity.this.x0 == null || NSTIJKPlayerSkyTvActivity.this.x0.size() <= 0) {
                        return;
                    }
                    c.h.a.h.n.e.S(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).P());
                    String strI = ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).I();
                    String strX = ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).X();
                    String strE0 = ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).e0();
                    if (NSTIJKPlayerSkyTvActivity.this.c2.equals("m3u")) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                        if (!nSTIJKPlayerSkyTvActivity2.A1.equals(((c.h.a.i.f) nSTIJKPlayerSkyTvActivity2.x0.get(i2)).e0())) {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity3.c1 = nSTIJKPlayerSkyTvActivity3.O2;
                            NSTIJKPlayerSkyTvActivity.this.f2.setCurrentWindowIndex(i2);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity4.M2 = c.h.a.h.n.e.S(((c.h.a.i.f) nSTIJKPlayerSkyTvActivity4.x0.get(i2)).P());
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity5.N2 = ((c.h.a.i.f) nSTIJKPlayerSkyTvActivity5.x0.get(i2)).g();
                            if (NSTIJKPlayerSkyTvActivity.this.z0 != null) {
                                NSTIJKPlayerSkyTvActivity.this.z0.clear();
                                NSTIJKPlayerSkyTvActivity.this.z0.addAll(this.f29373b);
                            }
                            NSTIJKPlayerSkyTvActivity.this.f2.setTitle(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).P() + " - " + ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).getName());
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity6 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity6.A1 = ((c.h.a.i.f) nSTIJKPlayerSkyTvActivity6.x0.get(i2)).e0();
                            c.h.a.k.e.a.f().q(NSTIJKPlayerSkyTvActivity.this.A1);
                            if (!NSTIJKPlayerSkyTvActivity.this.c1.equals("-1") && !NSTIJKPlayerSkyTvActivity.this.c1.equals("0") && !NSTIJKPlayerSkyTvActivity.this.c1.equals("-6")) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity7 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity7.c1 = ((c.h.a.i.f) nSTIJKPlayerSkyTvActivity7.x0.get(i2)).g();
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity8 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity8.d1 = ((c.h.a.i.f) nSTIJKPlayerSkyTvActivity8.x0.get(i2)).B();
                                if (NSTIJKPlayerSkyTvActivity.this.d1.isEmpty()) {
                                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity9 = NSTIJKPlayerSkyTvActivity.this;
                                    nSTIJKPlayerSkyTvActivity9.d1 = nSTIJKPlayerSkyTvActivity9.Z1(nSTIJKPlayerSkyTvActivity9.c1);
                                }
                            }
                            NSTIJKPlayerSkyTvActivity.this.R1 = i2;
                            NSTIJKPlayerSkyTvActivity.this.f2.W0();
                            if (NSTIJKPlayerSkyTvActivity.this.l2.booleanValue()) {
                                NSTIJKPlayerSkyTvActivity.this.f2.a1(Uri.parse(strE0), NSTIJKPlayerSkyTvActivity.f29288f, ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).getName());
                                NSTIJKPlayerSkyTvActivity.this.f2.K = 0;
                                NSTIJKPlayerSkyTvActivity.this.f2.M = false;
                                NSTIJKPlayerSkyTvActivity.this.f2.start();
                            }
                            NSTIJKPlayerSkyTvActivity.this.K1.removeCallbacksAndMessages(null);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity10 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity10.K = strI;
                            nSTIJKPlayerSkyTvActivity10.L = strX;
                            nSTIJKPlayerSkyTvActivity10.f2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.K);
                            NSTIJKPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.L);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity11 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity11.g3(nSTIJKPlayerSkyTvActivity11.L);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity12 = NSTIJKPlayerSkyTvActivity.this;
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity13 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity12.u2 = new c0(nSTIJKPlayerSkyTvActivity13, nSTIJKPlayerSkyTvActivity13.K, null).execute(new String[0]);
                            NSTIJKPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                            if (NSTIJKPlayerSkyTvActivity.this.C1 != null) {
                                NSTIJKPlayerSkyTvActivity.this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).e0()));
                                NSTIJKPlayerSkyTvActivity.this.C1.apply();
                            }
                            if (NSTIJKPlayerSkyTvActivity.this.D1 != null) {
                                NSTIJKPlayerSkyTvActivity.this.D1.putInt("currentlyPlayingVideoPosition", i2);
                                NSTIJKPlayerSkyTvActivity.this.D1.apply();
                            }
                            nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity.c3.notifyDataSetChanged();
                            return;
                        }
                        NSTIJKPlayerSkyTvActivity.this.j2();
                    }
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity14 = NSTIJKPlayerSkyTvActivity.this;
                    if (nSTIJKPlayerSkyTvActivity14.z1 != c.h.a.h.n.e.R(((c.h.a.i.f) nSTIJKPlayerSkyTvActivity14.x0.get(i2)).Y())) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity15 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity15.c1 = nSTIJKPlayerSkyTvActivity15.O2;
                        NSTIJKPlayerSkyTvActivity.this.f2.setCurrentWindowIndex(i2);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity16 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity16.M2 = c.h.a.h.n.e.S(((c.h.a.i.f) nSTIJKPlayerSkyTvActivity16.x0.get(i2)).P());
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity17 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity17.N2 = ((c.h.a.i.f) nSTIJKPlayerSkyTvActivity17.x0.get(i2)).g();
                        if (NSTIJKPlayerSkyTvActivity.this.z0 != null) {
                            NSTIJKPlayerSkyTvActivity.this.z0.clear();
                            NSTIJKPlayerSkyTvActivity.this.z0.addAll(this.f29373b);
                        }
                        NSTIJKPlayerSkyTvActivity.this.f2.setTitle(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).P() + " - " + ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).getName());
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity18 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity18.z1 = c.h.a.h.n.e.R(((c.h.a.i.f) nSTIJKPlayerSkyTvActivity18.x0.get(i2)).Y());
                        c.h.a.k.e.a.f().q(String.valueOf(NSTIJKPlayerSkyTvActivity.this.z1));
                        if (!NSTIJKPlayerSkyTvActivity.this.c1.equals("-1") && !NSTIJKPlayerSkyTvActivity.this.c1.equals("0") && !NSTIJKPlayerSkyTvActivity.this.c1.equals("-6")) {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity19 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity19.c1 = ((c.h.a.i.f) nSTIJKPlayerSkyTvActivity19.x0.get(i2)).g();
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity20 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity20.d1 = ((c.h.a.i.f) nSTIJKPlayerSkyTvActivity20.x0.get(i2)).B();
                            if (NSTIJKPlayerSkyTvActivity.this.d1.isEmpty()) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity21 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity21.d1 = nSTIJKPlayerSkyTvActivity21.Z1(nSTIJKPlayerSkyTvActivity21.c1);
                            }
                        }
                        NSTIJKPlayerSkyTvActivity.this.R1 = i2;
                        NSTIJKPlayerSkyTvActivity.this.f2.W0();
                        if (NSTIJKPlayerSkyTvActivity.this.l2.booleanValue()) {
                            NSTIJKPlayerSkyTvActivity.this.f2.a1(Uri.parse(NSTIJKPlayerSkyTvActivity.this.f29294l + c.h.a.h.n.e.R(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).Y()) + NSTIJKPlayerSkyTvActivity.this.k0), NSTIJKPlayerSkyTvActivity.f29288f, ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).getName());
                            NSTIJKPlayerSkyTvActivity.this.f2.K = 0;
                            NSTIJKPlayerSkyTvActivity.this.f2.M = false;
                            NSTIJKPlayerSkyTvActivity.this.f2.start();
                        }
                        NSTIJKPlayerSkyTvActivity.this.K1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity22 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity22.K = strI;
                        nSTIJKPlayerSkyTvActivity22.L = strX;
                        nSTIJKPlayerSkyTvActivity22.f2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.K);
                        NSTIJKPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.L);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity23 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity23.g3(nSTIJKPlayerSkyTvActivity23.L);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity24 = NSTIJKPlayerSkyTvActivity.this;
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity25 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity24.u2 = new c0(nSTIJKPlayerSkyTvActivity25, nSTIJKPlayerSkyTvActivity25.K, null).execute(new String[0]);
                        NSTIJKPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                        if (NSTIJKPlayerSkyTvActivity.this.C1 != null) {
                            NSTIJKPlayerSkyTvActivity.this.C1.putString("currentlyPlayingVideo", String.valueOf(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).Y()));
                            NSTIJKPlayerSkyTvActivity.this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).e0()));
                            NSTIJKPlayerSkyTvActivity.this.C1.apply();
                        }
                        if (NSTIJKPlayerSkyTvActivity.this.D1 != null) {
                            NSTIJKPlayerSkyTvActivity.this.D1.putInt("currentlyPlayingVideoPosition", i2);
                            NSTIJKPlayerSkyTvActivity.this.D1.apply();
                        }
                        nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity.c3.notifyDataSetChanged();
                        return;
                    }
                    NSTIJKPlayerSkyTvActivity.this.j2();
                }
                int iS = c.h.a.h.n.e.S(arrayListG.get(i2).P());
                String strI2 = arrayListG.get(i2).I();
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity26 = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity26.o2(nSTIJKPlayerSkyTvActivity26.x0, iS);
                String strE02 = arrayListG.get(i2).e0();
                if (NSTIJKPlayerSkyTvActivity.this.c2.equals("m3u")) {
                    if (!NSTIJKPlayerSkyTvActivity.this.A1.equals(arrayListG.get(i2).e0())) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity27 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity27.c1 = nSTIJKPlayerSkyTvActivity27.O2;
                        NSTIJKPlayerSkyTvActivity.this.f2.setCurrentWindowIndex(i2);
                        NSTIJKPlayerSkyTvActivity.this.M2 = c.h.a.h.n.e.S(arrayListG.get(i2).P());
                        NSTIJKPlayerSkyTvActivity.this.N2 = arrayListG.get(i2).g();
                        if (NSTIJKPlayerSkyTvActivity.this.z0 != null) {
                            NSTIJKPlayerSkyTvActivity.this.z0.clear();
                            NSTIJKPlayerSkyTvActivity.this.z0.addAll(this.f29373b);
                        }
                        NSTIJKPlayerSkyTvActivity.this.f2.setTitle(arrayListG.get(i2).P() + " - " + arrayListG.get(i2).getName());
                        NSTIJKPlayerSkyTvActivity.this.A1 = arrayListG.get(i2).e0();
                        c.h.a.k.e.a.f().q(NSTIJKPlayerSkyTvActivity.this.A1);
                        if (!NSTIJKPlayerSkyTvActivity.this.c1.equals("-1") && !NSTIJKPlayerSkyTvActivity.this.c1.equals("0") && !NSTIJKPlayerSkyTvActivity.this.c1.equals("-6")) {
                            NSTIJKPlayerSkyTvActivity.this.c1 = arrayListG.get(i2).g();
                            NSTIJKPlayerSkyTvActivity.this.d1 = arrayListG.get(i2).B();
                            if (NSTIJKPlayerSkyTvActivity.this.d1.isEmpty()) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity28 = NSTIJKPlayerSkyTvActivity.this;
                                nSTIJKPlayerSkyTvActivity28.d1 = nSTIJKPlayerSkyTvActivity28.Z1(nSTIJKPlayerSkyTvActivity28.c1);
                            }
                        }
                        String strX2 = arrayListG.get(i2).X();
                        try {
                            if (strX2.equals(BuildConfig.FLAVOR) || strX2.isEmpty()) {
                                NSTIJKPlayerSkyTvActivity.this.v.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f29293k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                            } else {
                                c.k.b.t.q(NSTIJKPlayerSkyTvActivity.this.f29293k).l(strX2).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(NSTIJKPlayerSkyTvActivity.this.v);
                            }
                        } catch (Exception unused) {
                            NSTIJKPlayerSkyTvActivity.this.v.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f29293k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                        }
                        NSTIJKPlayerSkyTvActivity.this.K1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity29 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity29.K = strI2;
                        nSTIJKPlayerSkyTvActivity29.L = strX2;
                        nSTIJKPlayerSkyTvActivity29.f2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.K);
                        NSTIJKPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.L);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity30 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity30.g3(nSTIJKPlayerSkyTvActivity30.L);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity31 = NSTIJKPlayerSkyTvActivity.this;
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity32 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity31.u2 = new c0(nSTIJKPlayerSkyTvActivity32, nSTIJKPlayerSkyTvActivity32.K, null).execute(new String[0]);
                        NSTIJKPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyTvActivity.this.R1 = i2;
                        NSTIJKPlayerSkyTvActivity.this.f2.W0();
                        if (NSTIJKPlayerSkyTvActivity.this.l2.booleanValue()) {
                            NSTIJKPlayerSkyTvActivity.this.f2.a1(Uri.parse(strE02), NSTIJKPlayerSkyTvActivity.f29288f, arrayListG.get(i2).getName());
                            NSTIJKPlayerSkyTvActivity.this.f2.K = 0;
                            NSTIJKPlayerSkyTvActivity.this.f2.M = false;
                            NSTIJKPlayerSkyTvActivity.this.f2.start();
                        }
                        if (NSTIJKPlayerSkyTvActivity.this.C1 != null) {
                            NSTIJKPlayerSkyTvActivity.this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayListG.get(i2).e0()));
                            NSTIJKPlayerSkyTvActivity.this.C1.apply();
                        }
                        if (NSTIJKPlayerSkyTvActivity.this.D1 != null) {
                            NSTIJKPlayerSkyTvActivity.this.D1.putInt("currentlyPlayingVideoPosition", i2);
                            NSTIJKPlayerSkyTvActivity.this.D1.apply();
                        }
                        nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity.c3.notifyDataSetChanged();
                        return;
                    }
                    NSTIJKPlayerSkyTvActivity.this.j2();
                }
                if (NSTIJKPlayerSkyTvActivity.this.z1 != c.h.a.h.n.e.R(arrayListG.get(i2).Y())) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity33 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity33.c1 = nSTIJKPlayerSkyTvActivity33.O2;
                    NSTIJKPlayerSkyTvActivity.this.f2.setCurrentWindowIndex(i2);
                    NSTIJKPlayerSkyTvActivity.this.M2 = c.h.a.h.n.e.S(arrayListG.get(i2).P());
                    NSTIJKPlayerSkyTvActivity.this.N2 = arrayListG.get(i2).g();
                    if (NSTIJKPlayerSkyTvActivity.this.z0 != null) {
                        NSTIJKPlayerSkyTvActivity.this.z0.clear();
                        NSTIJKPlayerSkyTvActivity.this.z0.addAll(this.f29373b);
                    }
                    NSTIJKPlayerSkyTvActivity.this.f2.setTitle(arrayListG.get(i2).P() + " - " + arrayListG.get(i2).getName());
                    NSTIJKPlayerSkyTvActivity.this.z1 = c.h.a.h.n.e.R(arrayListG.get(i2).Y());
                    c.h.a.k.e.a.f().q(String.valueOf(NSTIJKPlayerSkyTvActivity.this.z1));
                    if (!NSTIJKPlayerSkyTvActivity.this.c1.equals("-1") && !NSTIJKPlayerSkyTvActivity.this.c1.equals("0") && !NSTIJKPlayerSkyTvActivity.this.c1.equals("-6")) {
                        NSTIJKPlayerSkyTvActivity.this.c1 = arrayListG.get(i2).g();
                        NSTIJKPlayerSkyTvActivity.this.d1 = arrayListG.get(i2).B();
                        if (NSTIJKPlayerSkyTvActivity.this.d1.isEmpty()) {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity34 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity34.d1 = nSTIJKPlayerSkyTvActivity34.Z1(nSTIJKPlayerSkyTvActivity34.c1);
                        }
                    }
                    String strX3 = arrayListG.get(i2).X();
                    try {
                        if (strX3.equals(BuildConfig.FLAVOR) || strX3.isEmpty()) {
                            NSTIJKPlayerSkyTvActivity.this.v.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f29293k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                        } else {
                            c.k.b.t.q(NSTIJKPlayerSkyTvActivity.this.f29293k).l(strX3).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(NSTIJKPlayerSkyTvActivity.this.v);
                        }
                    } catch (Exception unused2) {
                        NSTIJKPlayerSkyTvActivity.this.v.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f29293k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                    }
                    NSTIJKPlayerSkyTvActivity.this.K1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity35 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity35.K = strI2;
                    nSTIJKPlayerSkyTvActivity35.L = strX3;
                    nSTIJKPlayerSkyTvActivity35.f2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.K);
                    NSTIJKPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.L);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity36 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity36.g3(nSTIJKPlayerSkyTvActivity36.L);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity37 = NSTIJKPlayerSkyTvActivity.this;
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity38 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity37.u2 = new c0(nSTIJKPlayerSkyTvActivity38, nSTIJKPlayerSkyTvActivity38.K, null).execute(new String[0]);
                    NSTIJKPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyTvActivity.this.R1 = i2;
                    NSTIJKPlayerSkyTvActivity.this.f2.W0();
                    if (NSTIJKPlayerSkyTvActivity.this.l2.booleanValue()) {
                        NSTIJKPlayerSkyTvActivity.this.f2.a1(Uri.parse(NSTIJKPlayerSkyTvActivity.this.f29294l + c.h.a.h.n.e.R(arrayListG.get(i2).Y()) + NSTIJKPlayerSkyTvActivity.this.k0), NSTIJKPlayerSkyTvActivity.f29288f, arrayListG.get(i2).getName());
                        NSTIJKPlayerSkyTvActivity.this.f2.K = 0;
                        NSTIJKPlayerSkyTvActivity.this.f2.M = false;
                        NSTIJKPlayerSkyTvActivity.this.f2.start();
                    }
                    if (NSTIJKPlayerSkyTvActivity.this.C1 != null) {
                        NSTIJKPlayerSkyTvActivity.this.C1.putString("currentlyPlayingVideo", String.valueOf(arrayListG.get(i2).Y()));
                        NSTIJKPlayerSkyTvActivity.this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayListG.get(i2).e0()));
                        NSTIJKPlayerSkyTvActivity.this.C1.apply();
                    }
                    if (NSTIJKPlayerSkyTvActivity.this.D1 != null) {
                        NSTIJKPlayerSkyTvActivity.this.D1.putInt("currentlyPlayingVideoPosition", i2);
                        NSTIJKPlayerSkyTvActivity.this.D1.apply();
                    }
                    nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity.c3.notifyDataSetChanged();
                    return;
                }
                NSTIJKPlayerSkyTvActivity.this.j2();
            } catch (Exception unused3) {
            }
        }
    }

    public class v implements AdapterView.OnItemLongClickListener {

        public class a implements PopupMenu.OnMenuItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f29376a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f29377b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f29378c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f29379d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f29380e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f29381f;

            /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a$a, reason: collision with other inner class name */
            public class DialogC0294a extends Dialog implements View.OnClickListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public Activity f29383b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public TextView f29384c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public TextView f29385d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public TextView f29386e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public LinearLayout f29387f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public LinearLayout f29388g;

                /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a$a$a, reason: collision with other inner class name */
                public class ViewOnFocusChangeListenerC0295a implements View.OnFocusChangeListener {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public View f29390b;

                    public ViewOnFocusChangeListenerC0295a(View view) {
                        this.f29390b = view;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    @SuppressLint({"ResourceType"})
                    public void onFocusChange(View view, boolean z) {
                        int i2;
                        LinearLayout linearLayout;
                        if (z) {
                            View view2 = this.f29390b;
                            i2 = R.drawable.blue_btn_effect;
                            if (view2 == null || view2.getTag() == null || !this.f29390b.getTag().equals("1")) {
                                View view3 = this.f29390b;
                                if (view3 == null || view3.getTag() == null || !this.f29390b.getTag().equals("2")) {
                                    return;
                                }
                                linearLayout = DialogC0294a.this.f29388g;
                            }
                            linearLayout = DialogC0294a.this.f29387f;
                        } else {
                            View view4 = this.f29390b;
                            i2 = R.drawable.black_button_dark;
                            if (view4 == null || view4.getTag() == null || !this.f29390b.getTag().equals("1")) {
                                View view5 = this.f29390b;
                                if (view5 == null || view5.getTag() == null || !this.f29390b.getTag().equals("2")) {
                                    return;
                                }
                                linearLayout = DialogC0294a.this.f29388g;
                            }
                            linearLayout = DialogC0294a.this.f29387f;
                        }
                        linearLayout.setBackgroundResource(i2);
                    }
                }

                public DialogC0294a(Activity activity) {
                    super(activity);
                    this.f29383b = activity;
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
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        android.app.ProgressDialog r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.a1(r2)     // Catch: java.lang.Exception -> Lb4
                        if (r2 != 0) goto L45
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        android.content.Context r0 = r2.f29293k     // Catch: java.lang.Exception -> Lb4
                        android.app.ProgressDialog r0 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.f2(r0)     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.b1(r2, r0)     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        android.app.ProgressDialog r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.a1(r2)     // Catch: java.lang.Exception -> Lb4
                        if (r2 == 0) goto L5c
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                    L3d:
                        android.app.ProgressDialog r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.a1(r2)     // Catch: java.lang.Exception -> Lb4
                        r2.show()     // Catch: java.lang.Exception -> Lb4
                        goto L5c
                    L45:
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        android.app.ProgressDialog r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.a1(r2)     // Catch: java.lang.Exception -> Lb4
                        boolean r2 = r2.isShowing()     // Catch: java.lang.Exception -> Lb4
                        if (r2 != 0) goto L5c
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        goto L3d
                    L5c:
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        java.lang.String r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.j1(r2)     // Catch: java.lang.Exception -> Lb4
                        java.lang.String r0 = "m3u"
                        boolean r2 = r2.equals(r0)     // Catch: java.lang.Exception -> Lb4
                        if (r2 == 0) goto L80
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        c.h.a.i.q.f r0 = r2.U     // Catch: java.lang.Exception -> Lb4
                        java.lang.String r2 = r2.J     // Catch: java.lang.Exception -> Lb4
                        java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> Lb4
                    L7c:
                        r0.L0(r2)     // Catch: java.lang.Exception -> Lb4
                        goto L8f
                    L80:
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        c.h.a.i.q.f r0 = r2.U     // Catch: java.lang.Exception -> Lb4
                        int r2 = r2.I     // Catch: java.lang.Exception -> Lb4
                        java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> Lb4
                        goto L7c
                    L8f:
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        java.lang.String r0 = "-6"
                        r2.D2(r0)     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        c.h.a.k.b.r r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.C1(r2)     // Catch: java.lang.Exception -> Lb4
                        r2.w()     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.this     // Catch: java.lang.Exception -> Lb4
                        com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> Lb4
                        r2.z2()     // Catch: java.lang.Exception -> Lb4
                        goto Lb4
                    Lb1:
                        r1.dismiss()
                    Lb4:
                        r1.dismiss()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.DialogC0294a.onClick(android.view.View):void");
                }

                @Override // android.app.Dialog
                public void onCreate(Bundle bundle) {
                    try {
                        super.onCreate(bundle);
                        if (NSTIJKPlayerSkyTvActivity.this.I2.A().equals(c.h.a.h.n.a.s0)) {
                            setContentView(R.layout.custom_alert_layout_tv);
                        } else {
                            setContentView(R.layout.custom_alert_layout);
                        }
                        this.f29384c = (TextView) findViewById(R.id.btn_yes);
                        this.f29385d = (TextView) findViewById(R.id.btn_no);
                        this.f29387f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
                        this.f29388g = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
                        TextView textView = (TextView) findViewById(R.id.txt_dia);
                        this.f29386e = textView;
                        textView.setText(NSTIJKPlayerSkyTvActivity.this.f29293k.getResources().getString(R.string.you_want_to_remove_this_channel_from_recently_watched));
                        this.f29384c.setOnClickListener(this);
                        this.f29385d.setOnClickListener(this);
                        TextView textView2 = this.f29384c;
                        textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0295a(textView2));
                        TextView textView3 = this.f29385d;
                        textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0295a(textView3));
                    } catch (Exception unused) {
                    }
                }
            }

            public a(String str, String str2, int i2, String str3, String str4, String str5) {
                this.f29376a = str;
                this.f29377b = str2;
                this.f29378c = i2;
                this.f29379d = str3;
                this.f29380e = str4;
                this.f29381f = str5;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
            
                r4 = r10.f29382g.f29375a;
                r4.y2 = true;
                r4.P2();
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            
                if (r10.f29382g.f29375a.c2.equals("m3u") == false) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                r4 = r10.f29382g.f29375a;
                r5 = r4.J;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
            
                r4.S = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
            
                r4 = r10.f29382g.f29375a;
                r5 = c.h.a.h.n.e.G(r4.f29293k, r4.I, r4.k0, "live");
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
            
                r4 = new android.content.Intent(r10.f29382g.f29375a.f29293k, (java.lang.Class<?>) com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity.class);
                r4.putExtra("url", r10.f29382g.f29375a.S);
                r4.putExtra("app_name", r10.f29382g.f29375a.L2.get(r3).a());
                r4.putExtra("packagename", r10.f29382g.f29375a.L2.get(r3).b());
                r10.f29382g.f29375a.f29293k.startActivity(r4);
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
                throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.v.a.onMenuItemClick(android.view.MenuItem):boolean");
            }
        }

        public class b implements PopupMenu.OnDismissListener {
            public b() {
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public void onDismiss(PopupMenu popupMenu) {
            }
        }

        public v() {
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
                if (NSTIJKPlayerSkyTvActivity.this.c3 != null) {
                    ArrayList<c.h.a.i.f> arrayListG = NSTIJKPlayerSkyTvActivity.this.c3.g();
                    if (arrayListG != null && arrayListG.size() > 0) {
                        strG = arrayListG.get(i2).g();
                        iR = c.h.a.h.n.e.R(arrayListG.get(i2).Y());
                        strE0 = arrayListG.get(i2).e0();
                        name = arrayListG.get(i2).getName();
                        strP = arrayListG.get(i2).P();
                        arrayListG.get(i2).X();
                        strZ = arrayListG.get(i2).Z();
                    } else if (NSTIJKPlayerSkyTvActivity.this.x0 == null || NSTIJKPlayerSkyTvActivity.this.x0.size() <= 0) {
                        strG = BuildConfig.FLAVOR;
                        strE0 = strG;
                        name = strE0;
                        strP = name;
                        strZ = strP;
                        iR = 0;
                    } else {
                        String strG2 = ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).g();
                        iR = c.h.a.h.n.e.R(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).Y());
                        String name2 = ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).getName();
                        strE0 = ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).e0();
                        String strP2 = ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).P();
                        ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).X();
                        strZ = ((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.x0.get(i2)).Z();
                        strP = strP2;
                        name = name2;
                        strG = strG2;
                    }
                    PopupMenu popupMenu = new PopupMenu(NSTIJKPlayerSkyTvActivity.this, view);
                    popupMenu.getMenuInflater().inflate(R.menu.menu_players_selection_with_fav, popupMenu.getMenu());
                    if (NSTIJKPlayerSkyTvActivity.this.O2.equals("-6")) {
                        popupMenu.getMenu().getItem(6).setVisible(true);
                    } else {
                        popupMenu.getMenu().getItem(6).setVisible(false);
                    }
                    if (NSTIJKPlayerSkyTvActivity.this.c2.equals("m3u")) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                        ArrayList<c.h.a.i.c> arrayListU = nSTIJKPlayerSkyTvActivity.U.U(strE0, c.h.a.i.q.m.z(nSTIJKPlayerSkyTvActivity.f29293k));
                        if (arrayListU == null || arrayListU.size() <= 0) {
                            menu = popupMenu.getMenu();
                            item = menu.getItem(2);
                        } else {
                            menu2 = popupMenu.getMenu();
                            item = menu2.getItem(3);
                        }
                    } else {
                        ArrayList<c.h.a.i.b> arrayListL = NSTIJKPlayerSkyTvActivity.this.B1.l(iR, strG, strZ, c.h.a.i.q.m.z(NSTIJKPlayerSkyTvActivity.this.f29293k));
                        if (arrayListL == null || arrayListL.size() <= 0) {
                            menu = popupMenu.getMenu();
                            item = menu.getItem(2);
                        } else {
                            menu2 = popupMenu.getMenu();
                            item = menu2.getItem(3);
                        }
                    }
                    item.setVisible(true);
                    NSTIJKPlayerSkyTvActivity.this.L2 = new ArrayList<>();
                    c.h.a.i.q.d dVar = new c.h.a.i.q.d(NSTIJKPlayerSkyTvActivity.this.f29293k);
                    NSTIJKPlayerSkyTvActivity.this.L2 = dVar.l();
                    try {
                        ArrayList<ExternalPlayerModelClass> arrayList = NSTIJKPlayerSkyTvActivity.this.L2;
                        if (arrayList != null && arrayList.size() > 0) {
                            for (int i3 = 0; i3 < NSTIJKPlayerSkyTvActivity.this.L2.size(); i3++) {
                                popupMenu.getMenu().add(0, i3, i3, NSTIJKPlayerSkyTvActivity.this.L2.get(i3).a());
                            }
                        }
                    } catch (Exception unused) {
                    }
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity2.I = iR;
                    nSTIJKPlayerSkyTvActivity2.J = strE0;
                    nSTIJKPlayerSkyTvActivity2.n2 = name.replaceAll(" ", "_").toLowerCase();
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity3.n2 = nSTIJKPlayerSkyTvActivity3.n2.replaceAll("[^a-zA-Z0-9]", BuildConfig.FLAVOR).toLowerCase();
                    popupMenu.setOnMenuItemClickListener(new a(strG, name, i2, strP, strZ, NSTIJKPlayerSkyTvActivity.this.n2));
                    popupMenu.setOnDismissListener(new b());
                    popupMenu.show();
                    return true;
                }
            } catch (Exception unused2) {
            }
            return false;
        }
    }

    public class w implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyTvActivity.this.V2(BuildConfig.FLAVOR, false);
                NSTIJKPlayerSkyTvActivity.this.s3 = Boolean.TRUE;
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyTvActivity.this.U1.setText(BuildConfig.FLAVOR);
                NSTIJKPlayerSkyTvActivity.this.T1.setVisibility(8);
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyTvActivity.this.U1.setText(BuildConfig.FLAVOR);
                NSTIJKPlayerSkyTvActivity.this.T1.setVisibility(8);
            }
        }

        public w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<c.h.a.i.f> arrayListU1;
            Handler handler;
            Runnable cVar;
            boolean zQ2;
            ArrayList<c.h.a.i.f> arrayListW0;
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
            nSTIJKPlayerSkyTvActivity.V0 = nSTIJKPlayerSkyTvActivity.S1.toString();
            NSTIJKPlayerSkyTvActivity.this.U1.setText(BuildConfig.FLAVOR);
            NSTIJKPlayerSkyTvActivity.this.T1.setVisibility(8);
            if (NSTIJKPlayerSkyTvActivity.this.l3.equals("true")) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                arrayListU1 = nSTIJKPlayerSkyTvActivity2.U.u1(nSTIJKPlayerSkyTvActivity2.V0, "radio_streams");
            } else {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
                arrayListU1 = nSTIJKPlayerSkyTvActivity3.U.u1(nSTIJKPlayerSkyTvActivity3.V0, "live");
            }
            NSTIJKPlayerSkyTvActivity.this.S1.setLength(0);
            if (arrayListU1 == null || arrayListU1.size() == 0) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity4.U1.setText(nSTIJKPlayerSkyTvActivity4.f29293k.getResources().getString(R.string.no_channel_found));
                NSTIJKPlayerSkyTvActivity.this.T1.setVisibility(0);
                handler = new Handler();
                cVar = new c();
            } else {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = NSTIJKPlayerSkyTvActivity.this;
                if (nSTIJKPlayerSkyTvActivity5.U.I1(c.h.a.i.q.m.z(nSTIJKPlayerSkyTvActivity5.f29293k)) <= 0 || NSTIJKPlayerSkyTvActivity.this.D0 == null) {
                    zQ2 = false;
                } else {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity6 = NSTIJKPlayerSkyTvActivity.this;
                    zQ2 = nSTIJKPlayerSkyTvActivity6.q2(arrayListU1, nSTIJKPlayerSkyTvActivity6.D0);
                }
                if (!zQ2) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity7 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity7.T0 = true;
                    nSTIJKPlayerSkyTvActivity7.U0 = true;
                    nSTIJKPlayerSkyTvActivity7.c1 = "0";
                    nSTIJKPlayerSkyTvActivity7.d1 = nSTIJKPlayerSkyTvActivity7.f29293k.getResources().getString(R.string.all);
                    NSTIJKPlayerSkyTvActivity.this.m0 = 0;
                    String strP = arrayListU1.get(0).P();
                    String strY = arrayListU1.get(0).Y();
                    String name = arrayListU1.get(0).getName();
                    String strI = arrayListU1.get(0).I();
                    String strX = arrayListU1.get(0).X();
                    String strE0 = arrayListU1.get(0).e0();
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity8 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity8.A1 = strE0;
                    nSTIJKPlayerSkyTvActivity8.M2 = c.h.a.h.n.e.S(nSTIJKPlayerSkyTvActivity8.V0);
                    NSTIJKPlayerSkyTvActivity.this.N2 = "0";
                    NSTIJKPlayerSkyTvActivity.this.f2.setTitle(NSTIJKPlayerSkyTvActivity.this.V0 + " - " + name);
                    if (NSTIJKPlayerSkyTvActivity.this.l3.equals("true")) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity9 = NSTIJKPlayerSkyTvActivity.this;
                        arrayListW0 = nSTIJKPlayerSkyTvActivity9.U.W0(nSTIJKPlayerSkyTvActivity9.c1, "radio_streams");
                    } else {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity10 = NSTIJKPlayerSkyTvActivity.this;
                        arrayListW0 = nSTIJKPlayerSkyTvActivity10.U.W0(nSTIJKPlayerSkyTvActivity10.c1, "live");
                    }
                    if (arrayListW0 != null) {
                        NSTIJKPlayerSkyTvActivity.this.v0.clear();
                    }
                    NSTIJKPlayerSkyTvActivity.this.v0 = arrayListW0;
                    if (NSTIJKPlayerSkyTvActivity.this.v0 != null && NSTIJKPlayerSkyTvActivity.this.v0.size() > 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= NSTIJKPlayerSkyTvActivity.this.v0.size()) {
                                break;
                            }
                            if (((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).P().equals(strP)) {
                                NSTIJKPlayerSkyTvActivity.this.f2.setCurrentWindowIndex(i2);
                                break;
                            }
                            i2++;
                        }
                    }
                    try {
                        if (strX.equals(BuildConfig.FLAVOR) || strX.isEmpty()) {
                            NSTIJKPlayerSkyTvActivity.this.v.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f29293k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                        } else {
                            c.k.b.t.q(NSTIJKPlayerSkyTvActivity.this.f29293k).l(strX).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).k(80, 55).g(NSTIJKPlayerSkyTvActivity.this.v);
                        }
                    } catch (Exception unused) {
                        NSTIJKPlayerSkyTvActivity.this.v.setImageDrawable(NSTIJKPlayerSkyTvActivity.this.f29293k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                    }
                    NSTIJKPlayerSkyTvActivity.this.f2.W0();
                    k kVar = null;
                    if (NSTIJKPlayerSkyTvActivity.this.l2.booleanValue()) {
                        if (NSTIJKPlayerSkyTvActivity.this.c2.equals("m3u")) {
                            NSTIJKPlayerSkyTvActivity.this.f2.a1(Uri.parse(strE0), NSTIJKPlayerSkyTvActivity.f29288f, name);
                            c.h.a.k.e.a.f().q(NSTIJKPlayerSkyTvActivity.this.A1);
                        } else {
                            NSTIJKPlayerSkyTvActivity.this.f2.a1(Uri.parse(NSTIJKPlayerSkyTvActivity.this.f29294l + c.h.a.h.n.e.R(strY) + NSTIJKPlayerSkyTvActivity.this.k0), NSTIJKPlayerSkyTvActivity.f29288f, name);
                            c.h.a.k.e.a.f().q(strY);
                        }
                        NSTIJKPlayerSkyTvActivity.this.f2.K = 0;
                        NSTIJKPlayerSkyTvActivity.this.f2.M = false;
                        NSTIJKPlayerSkyTvActivity.this.f2.start();
                        NSTIJKPlayerSkyTvActivity.this.s3 = Boolean.FALSE;
                        NSTIJKPlayerSkyTvActivity.this.M1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyTvActivity.this.M1.postDelayed(new a(), 5000L);
                        NSTIJKPlayerSkyTvActivity.this.e3();
                        NSTIJKPlayerSkyTvActivity.this.Y2();
                        NSTIJKPlayerSkyTvActivity.this.X1(5000);
                    }
                    NSTIJKPlayerSkyTvActivity.this.K1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity11 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity11.K = strI;
                    nSTIJKPlayerSkyTvActivity11.L = strX;
                    nSTIJKPlayerSkyTvActivity11.f2.setCurrentEpgChannelID(NSTIJKPlayerSkyTvActivity.this.K);
                    NSTIJKPlayerSkyTvActivity.this.f2.setCurrentChannelLogo(NSTIJKPlayerSkyTvActivity.this.L);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity12 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity12.g3(nSTIJKPlayerSkyTvActivity12.L);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity13 = NSTIJKPlayerSkyTvActivity.this;
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity14 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity13.u2 = new c0(nSTIJKPlayerSkyTvActivity14, nSTIJKPlayerSkyTvActivity14.K, kVar).execute(new String[0]);
                    NSTIJKPlayerSkyTvActivity.this.J1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyTvActivity.this.z1 = c.h.a.h.n.e.R(strY);
                    if (NSTIJKPlayerSkyTvActivity.this.C1 != null) {
                        NSTIJKPlayerSkyTvActivity.this.C1.putString("currentlyPlayingVideo", strY);
                        NSTIJKPlayerSkyTvActivity.this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", strE0);
                        NSTIJKPlayerSkyTvActivity.this.C1.apply();
                    }
                    arrayListU1.clear();
                    return;
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity15 = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity15.U1.setText(nSTIJKPlayerSkyTvActivity15.f29293k.getResources().getString(R.string.no_channel_found));
                NSTIJKPlayerSkyTvActivity.this.T1.setVisibility(0);
                handler = new Handler();
                cVar = new b();
            }
            handler.postDelayed(cVar, 1000L);
        }
    }

    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    NSTIJKPlayerSkyTvActivity.this.h2();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class y extends AsyncTask<String, Void, Boolean> {
        public y() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(NSTIJKPlayerSkyTvActivity.this.A2());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            NSTIJKPlayerSkyTvActivity.this.V2(BuildConfig.FLAVOR, true);
            NSTIJKPlayerSkyTvActivity.this.s3 = Boolean.TRUE;
            if (NSTIJKPlayerSkyTvActivity.this.f2 != null) {
                NSTIJKPlayerSkyTvActivity.this.f2.setEPGHandler(NSTIJKPlayerSkyTvActivity.this.K1);
                NSTIJKPlayerSkyTvActivity.this.f2.setContext(NSTIJKPlayerSkyTvActivity.this.f29293k);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (NSTIJKPlayerSkyTvActivity.this.v2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity.v2 = NSTIJKPlayerSkyTvActivity.f2(nSTIJKPlayerSkyTvActivity.f29293k);
                if (NSTIJKPlayerSkyTvActivity.this.v2 == null) {
                    return;
                }
            } else if (NSTIJKPlayerSkyTvActivity.this.v2.isShowing()) {
                return;
            }
            NSTIJKPlayerSkyTvActivity.this.v2.show();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class z extends AsyncTask<String, String, String> {
        public z() {
        }

        public String a() {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            c.h.a.i.q.f fVar;
            String str;
            try {
                NSTIJKPlayerSkyTvActivity.this.x2 = 0;
                if (NSTIJKPlayerSkyTvActivity.this.v0 != null && NSTIJKPlayerSkyTvActivity.this.t0 != null) {
                    NSTIJKPlayerSkyTvActivity.this.v0.clear();
                    NSTIJKPlayerSkyTvActivity.this.t0.clear();
                }
                if (NSTIJKPlayerSkyTvActivity.this.l3.equals("true")) {
                    nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    fVar = nSTIJKPlayerSkyTvActivity.U;
                    str = "radio_streams";
                } else {
                    nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                    fVar = nSTIJKPlayerSkyTvActivity.U;
                    str = "live";
                }
                nSTIJKPlayerSkyTvActivity.v0 = fVar.W0("0", str);
                if (NSTIJKPlayerSkyTvActivity.this.w0 != null) {
                    NSTIJKPlayerSkyTvActivity.this.w0.clear();
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(NSTIJKPlayerSkyTvActivity.this.I2.C()));
                String str2 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(NSTIJKPlayerSkyTvActivity.this.f29293k)));
                boolean zB = NSTIJKPlayerSkyTvActivity.this.I2.B();
                ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? NSTIJKPlayerSkyTvActivity.this.U.z1(null, str2) : null;
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                nSTIJKPlayerSkyTvActivity2.f0 = nSTIJKPlayerSkyTvActivity2.getSharedPreferences("currentlyPlayingVideo", 0);
                String string = c.h.a.i.q.m.f(NSTIJKPlayerSkyTvActivity.this.f29293k).equals("m3u") ? NSTIJKPlayerSkyTvActivity.this.Z.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : NSTIJKPlayerSkyTvActivity.this.Z.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
                if (NSTIJKPlayerSkyTvActivity.this.v0 == null || NSTIJKPlayerSkyTvActivity.this.v0.size() <= 0) {
                    return "all_channels";
                }
                for (int i2 = 0; i2 < NSTIJKPlayerSkyTvActivity.this.v0.size(); i2++) {
                    if (NSTIJKPlayerSkyTvActivity.this.s2 != null && NSTIJKPlayerSkyTvActivity.this.s2.isCancelled()) {
                        return "all_channels";
                    }
                    if (c.h.a.i.q.m.f(NSTIJKPlayerSkyTvActivity.this.f29293k).equals("m3u")) {
                        if (((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).e0().equals(string)) {
                            NSTIJKPlayerSkyTvActivity.this.x2 = i2;
                        }
                    } else if (((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).Y().equals(string)) {
                        NSTIJKPlayerSkyTvActivity.this.x2 = i2;
                    }
                    c.h.a.i.f fVar2 = new c.h.a.i.f();
                    fVar2.u0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).P());
                    fVar2.t0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).getName());
                    fVar2.C0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).Z());
                    fVar2.B0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).Y());
                    fVar2.A0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).X());
                    fVar2.l0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).I());
                    fVar2.f0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).f());
                    fVar2.g0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).g());
                    fVar2.j0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).D());
                    fVar2.D0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).a0());
                    fVar2.k0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).F());
                    fVar2.E0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).b0());
                    fVar2.F0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).d0());
                    fVar2.h0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).B());
                    fVar2.z0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).W());
                    fVar2.p0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).M());
                    fVar2.i0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).C());
                    fVar2.G0(((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).e0());
                    if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayListZ1.size() || (NSTIJKPlayerSkyTvActivity.this.s2 != null && NSTIJKPlayerSkyTvActivity.this.s2.isCancelled())) {
                                break;
                            }
                            if (((c.h.a.i.f) NSTIJKPlayerSkyTvActivity.this.v0.get(i2)).I().equals(arrayListZ1.get(i3).a())) {
                                int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), NSTIJKPlayerSkyTvActivity.this.f29293k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), NSTIJKPlayerSkyTvActivity.this.f29293k)).longValue(), NSTIJKPlayerSkyTvActivity.this.f29293k);
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
                    NSTIJKPlayerSkyTvActivity.this.w0.add(fVar2);
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
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r7 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L5b
                java.lang.String r7 = r7.W1()     // Catch: java.lang.Exception -> L5b
                return r7
            L48:
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r7 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L5b
                java.lang.String r7 = r7.m2()     // Catch: java.lang.Exception -> L5b
                return r7
            L4f:
                com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r7 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.this     // Catch: java.lang.Exception -> L5b
                java.lang.String r7 = r7.S1()     // Catch: java.lang.Exception -> L5b
                return r7
            L56:
                java.lang.String r7 = r6.a()     // Catch: java.lang.Exception -> L5b
                return r7
            L5b:
                java.lang.String r7 = "error"
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.z.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTIJKPlayerSkyTvActivity.this.w0 != null) {
                    if (!NSTIJKPlayerSkyTvActivity.this.X1.booleanValue()) {
                        NSTIJKPlayerSkyTvActivity.this.X1 = Boolean.TRUE;
                        if (NSTIJKPlayerSkyTvActivity.this.w0.size() == 0) {
                            c.h.a.h.n.a.G = Boolean.FALSE;
                            NSTIJKPlayerSkyTvActivity.this.H2();
                            NSTIJKPlayerSkyTvActivity.this.f2.setVisibility(8);
                            NSTIJKPlayerSkyTvActivity.this.t.setVisibility(0);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity.u.setText(nSTIJKPlayerSkyTvActivity.getResources().getString(R.string.no_channel_found));
                        } else if (NSTIJKPlayerSkyTvActivity.this.z0 != null) {
                            NSTIJKPlayerSkyTvActivity.this.z0.clear();
                            NSTIJKPlayerSkyTvActivity.this.z0.addAll(NSTIJKPlayerSkyTvActivity.this.w0);
                        }
                    }
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = NSTIJKPlayerSkyTvActivity.this;
                    if (nSTIJKPlayerSkyTvActivity2.T0 && nSTIJKPlayerSkyTvActivity2.U0 && !nSTIJKPlayerSkyTvActivity2.V0.equals(BuildConfig.FLAVOR)) {
                        NSTIJKPlayerSkyTvActivity.this.x2 = 0;
                        try {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = NSTIJKPlayerSkyTvActivity.this;
                            nSTIJKPlayerSkyTvActivity3.x2 = nSTIJKPlayerSkyTvActivity3.o2(nSTIJKPlayerSkyTvActivity3.w0, c.h.a.h.n.e.S(NSTIJKPlayerSkyTvActivity.this.V0));
                        } catch (NumberFormatException | Exception unused) {
                        }
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = NSTIJKPlayerSkyTvActivity.this;
                        nSTIJKPlayerSkyTvActivity4.T0 = false;
                        nSTIJKPlayerSkyTvActivity4.U0 = false;
                    }
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = NSTIJKPlayerSkyTvActivity.this;
                    nSTIJKPlayerSkyTvActivity5.T2(nSTIJKPlayerSkyTvActivity5.w0);
                }
            } catch (Exception unused2) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                TextView textView = NSTIJKPlayerSkyTvActivity.this.O0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = NSTIJKPlayerSkyTvActivity.this;
                TextView textView2 = nSTIJKPlayerSkyTvActivity.n0;
                if (textView2 != null) {
                    textView2.setText(nSTIJKPlayerSkyTvActivity.d1);
                    NSTIJKPlayerSkyTvActivity.this.n0.setSelected(true);
                }
            } catch (Exception unused) {
            }
        }
    }

    public NSTIJKPlayerSkyTvActivity() {
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
        this.A2 = f29291i[0];
        this.C2 = bool;
        this.D2 = bool;
        this.E2 = bool;
        this.F2 = bool;
        this.G2 = bool;
        this.H2 = bool;
        this.M2 = 0;
        this.N2 = "0";
        this.O2 = "0";
        this.P2 = bool2;
        this.Z2 = "mobile";
        this.g3 = 0;
        this.j3 = BuildConfig.FLAVOR;
        this.k3 = "false";
        this.l3 = "false";
        this.m3 = "-10";
        this.n3 = 0;
        this.o3 = false;
        this.p3 = true;
        this.r3 = null;
        this.s3 = bool;
        this.t3 = false;
    }

    public static boolean c2() {
        ProgressBar progressBar = f29292j;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public static ProgressDialog f2(Context context) {
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

    public static long g2(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String k2(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A2() {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.A2():boolean");
    }

    public final void B2() {
        String str;
        TextView textView;
        Resources resources;
        int i2;
        StringBuilder sb;
        StringBuilder sb2;
        this.I2 = new c.h.a.k.d.a.a(this.f29293k);
        this.Q2 = AnimationUtils.loadAnimation(this.f29293k, R.anim.trans_top_in);
        this.R2 = AnimationUtils.loadAnimation(this.f29293k, R.anim.trans_top_out);
        this.V2 = AnimationUtils.loadAnimation(this.f29293k, R.anim.player_fade_in_animation);
        this.W2 = AnimationUtils.loadAnimation(this.f29293k, R.anim.player_fade_out_animation);
        this.Y2 = AnimationUtils.loadAnimation(this.f29293k, R.anim.subtitle_slide_out_right);
        this.X2 = AnimationUtils.loadAnimation(this.f29293k, R.anim.subtitle_slide_in_right);
        this.T2 = AnimationUtils.loadAnimation(this.f29293k, R.anim.zoom_in);
        this.U2 = AnimationUtils.loadAnimation(this.f29293k, R.anim.zoom_out);
        this.S2 = AnimationUtils.loadAnimation(this.f29293k, R.anim.trans_bottom_in);
        this.h3 = AnimationUtils.loadAnimation(this.f29293k, R.anim.player_live_left_side_in);
        this.i3 = AnimationUtils.loadAnimation(this.f29293k, R.anim.player_live_left_side_out);
        this.q3 = new c.h.a.i.q.g(this.f29293k);
        this.e3 = new LinearLayoutManager(this.f29293k);
        this.f3 = new LinearLayoutManager(this.f29293k);
        SharedPreferences sharedPreferences = this.f29293k.getSharedPreferences("loginPrefs", 0);
        this.B2 = sharedPreferences;
        this.z2 = sharedPreferences.getInt("aspect_ratio", this.z2);
        this.J2 = new Handler();
        this.V = getSharedPreferences("loginPrefs", 0);
        this.W = this.f29293k.getSharedPreferences("loginPrefs", 0);
        this.X = this.f29293k.getSharedPreferences("pref.using_media_codec", 0);
        this.Y = this.f29293k.getSharedPreferences("allowedFormat", 0);
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
        this.K2 = new Handler(Looper.getMainLooper());
        this.g0 = this.f29293k.getSharedPreferences("currentSubtitleTrack", 0);
        this.h0 = this.f29293k.getSharedPreferences("currentAudioTrack", 0);
        this.i0 = this.f29293k.getSharedPreferences("currentVideoTrack", 0);
        this.O1 = this.h0.edit();
        this.P1 = this.i0.edit();
        this.N1 = this.g0.edit();
        this.O1.clear();
        this.O1.apply();
        this.P1.clear();
        this.P1.apply();
        this.N1.clear();
        this.N1.apply();
        if (c.h.a.i.q.m.f(this.f29293k).equals("m3u")) {
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
        this.k3 = stringExtra;
        if (stringExtra == null) {
            this.k3 = "false";
        }
        this.c1 = this.q2;
        this.d2 = getIntent().getStringExtra("VIDEO_URL");
        getIntent().getStringExtra("STREAM_TYPE");
        String stringExtra2 = getIntent().getStringExtra("RADIO");
        this.l3 = stringExtra2;
        if (stringExtra2 == null) {
            this.l3 = "false";
        }
        if (this.l3.equals("true")) {
            ImageView imageView = this.iv_radio;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            textView = this.header_page_title;
            if (textView != null) {
                resources = this.f29293k.getResources();
                i2 = R.string.radio;
                textView.setText(resources.getString(i2));
            }
        } else {
            this.l3 = "false";
            textView = this.header_page_title;
            if (textView != null) {
                resources = this.f29293k.getResources();
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
        this.f29294l = c.h.a.h.n.e.t(this.b2);
        this.U = new c.h.a.i.q.f(this);
        this.B1 = new c.h.a.i.q.a(this.f29293k);
        this.H1 = new Handler();
        this.I1 = new Handler();
        this.J1 = new Handler();
        this.K1 = new Handler();
        this.L1 = new Handler();
        this.p = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.i.i() + c.h.a.k.d.c.a.i.h());
        this.M1 = new Handler();
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = (NSTIJKPlayerSkyTv) findViewById(R.id.video_view);
        this.f2 = nSTIJKPlayerSkyTv;
        nSTIJKPlayerSkyTv.setLiveStreamDBHandler(this.U);
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
        f29292j = (ProgressBar) findViewById(R.id.app_video_loading);
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
        this.e2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        try {
            IjkMediaPlayer.loadLibrariesOnce(null);
            IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        } catch (Exception | UnsatisfiedLinkError unused) {
        }
        this.Z2 = this.I2.A().equals(c.h.a.h.n.a.s0) ? "tv" : "mobile";
        Locale locale = Locale.US;
        this.a2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.M0.x(R.menu.menu_search);
        this.R0.requestFocusFromTouch();
        v0(this.M0);
        Thread thread = this.r3;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new x());
            this.r3 = thread2;
            thread2.start();
        }
        SharedPreferences sharedPreferences5 = this.f29293k.getSharedPreferences("timeFormat", 0);
        f29286d = sharedPreferences5;
        this.j0 = new SimpleDateFormat(sharedPreferences5.getString("timeFormat", c.h.a.h.n.a.m0), locale);
        f29288f = false;
        findViewById(R.id.app_video_box).setOnClickListener(this);
        this.N = (ListView) findViewById(R.id.lv_ch_left_side);
        this.O = (ListView) findViewById(R.id.lv_ch_left_side_player);
        this.l0 = (RelativeLayout) findViewById(R.id.rl_categories_view);
        this.f29295m = findViewById(R.id.iv_play);
        this.f29296n = findViewById(R.id.iv_pause);
        View viewFindViewById = findViewById(R.id.btn_list);
        this.f29297o = viewFindViewById;
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
        i2();
        L2();
        M2();
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f2;
        nSTIJKPlayerSkyTv2.Y0(this, nSTIJKPlayerSkyTv2, this.rg_video, this.rg_audio, this.rg_subtitle, this.no_video_track, this.no_audio_track, this.no_subtitle_track, this.tv_sub_font_size, this.sb_brightness, this.sb_volume, this.ll_player_header_footer, this.V2, this.W2, this.ll_brightness, this.ll_volume, this.tv_brightness, this.ll_pause_play, this.S2, this.T2, this.tv_volume, this.rl_settings_box, this.Y2, this.Q2, this.R2, this.rl_episodes_box_player, this.i3, this.ll_bottom_footer_icons, this.ll_top_right_setting, this.ll_top_left_back, this.fl_sub_font_size);
        f29289g = k2(this.f29293k);
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
        f29290h = getApplicationContext().getPackageName();
        this.A0 = new ArrayList<>();
        this.B0 = new ArrayList<>();
        this.C0 = new ArrayList<>();
        this.F1 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.g.f() + c.h.a.k.d.c.a.g.h());
        TextView textView2 = this.n0;
        if (textView2 != null) {
            textView2.setText(this.d1);
            this.n0.setSelected(true);
        }
        if (this.k3.equals("true")) {
            j2();
        }
    }

    public boolean C2() {
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

    public void D2(String str) {
        this.O2 = str;
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
                if (this.O2.equals("-6")) {
                    this.Y1.getItem(2).getSubMenu().findItem(R.id.nav_delete_all).setVisible(true);
                } else {
                    this.Y1.getItem(2).getSubMenu().findItem(R.id.nav_delete_all).setVisible(false);
                }
            }
        } catch (Exception unused2) {
        }
        T1(true);
    }

    public final void E2() {
        ProgressBar progressBar = this.B;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(this.f29293k.getResources().getString(R.string.now_loading));
        }
        TextView textView2 = this.x;
        if (textView2 != null) {
            textView2.setText(BuildConfig.FLAVOR);
        }
        TextView textView3 = this.y;
        if (textView3 != null) {
            textView3.setText(this.f29293k.getResources().getString(R.string.next_loading));
        }
        TextView textView4 = this.z;
        if (textView4 != null) {
            textView4.setText(BuildConfig.FLAVOR);
        }
    }

    public final void F2() {
        int currentWindowIndex = this.f2.getCurrentWindowIndex();
        if (currentWindowIndex == this.z0.size() - 1) {
            this.f2.setCurrentWindowIndex(0);
        } else {
            this.f2.setCurrentWindowIndex(currentWindowIndex + 1);
        }
    }

    public void G2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        if (this.ll_no_cat_found != null) {
            this.ll_no_cat_found_player.setVisibility(0);
        }
    }

    public void H2() {
        c.h.a.h.n.a.G = Boolean.TRUE;
        this.H = true;
        this.t.setVisibility(0);
        this.u.setText(this.f29293k.getResources().getString(R.string.no_channel_found));
        this.x1.setVisibility(8);
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            findViewById(R.id.watrmrk).setVisibility(8);
        }
    }

    public void J2() {
        LinearLayout linearLayout = this.P0;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.Q0;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
    }

    public void K2(int i2) {
        try {
            c.h.a.k.b.r rVar = this.a3;
            if (rVar != null) {
                rVar.y(i2);
            }
        } catch (Exception unused) {
        }
    }

    public final void L2() {
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

    public final void M2() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.addTextChangedListener(new e());
        }
    }

    public final void N1(String str, int i2, String str2, String str3, String str4, int i3) {
        new d0(str, i2, str2, str3, str4, i3).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    @SuppressLint({"SetTextI18n"})
    public final void N2(ArrayList<c.h.a.i.f> arrayList) {
        c.h.a.k.e.a aVarF;
        String strValueOf;
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
        String str;
        String str2;
        String str3;
        if (arrayList == null || arrayList.size() <= 0 || this.R1 >= arrayList.size()) {
            return;
        }
        int iS = c.h.a.h.n.e.S(arrayList.get(this.R1).P());
        this.M2 = iS;
        this.N2 = arrayList.get(this.R1).g();
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
                this.v.setImageDrawable(this.f29293k.getResources().getDrawable(R.drawable.logo_placeholder_white));
            } else {
                c.k.b.t.q(this.f29293k).l(strX).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(this.v);
            }
        } catch (Exception unused) {
            this.v.setImageDrawable(this.f29293k.getResources().getDrawable(R.drawable.logo_placeholder_white));
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
        if (g2(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.f29293k))), this.a2.format(this.g2)) >= c.h.a.k.d.c.a.d.p() && (str2 = this.s1) != null && this.i1 != null && (!f29289g.equals(str2) || (this.s1 != null && (str3 = this.i1) != null && !f29290h.equals(str3)))) {
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
        this.f2.W0();
        if (!f29288f) {
            if (this.f2.getFullScreenValue().booleanValue()) {
                f29288f = this.f2.getFullScreenValue().booleanValue();
            } else {
                f29288f = false;
            }
        }
        if (this.l2.booleanValue()) {
            if (this.c2.equals("m3u")) {
                nSTIJKPlayerSkyTv = this.f2;
                str = this.d2;
            } else {
                nSTIJKPlayerSkyTv = this.f2;
                str = this.f29294l + iR + this.k0;
            }
            nSTIJKPlayerSkyTv.a1(Uri.parse(str), f29288f, name);
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f2;
            nSTIJKPlayerSkyTv2.K = 0;
            nSTIJKPlayerSkyTv2.M = false;
            nSTIJKPlayerSkyTv2.start();
        }
        this.K1.removeCallbacksAndMessages(null);
        this.K = strI;
        this.L = strX;
        this.f2.setCurrentEpgChannelID(strI);
        this.f2.setCurrentChannelLogo(this.L);
        g3(this.L);
        this.u2 = new c0(this, this.K, null).execute(new String[0]);
        this.W1 = Boolean.TRUE;
    }

    public final void O1(String str, String str2, String str3, int i2) {
        new e0(str, str2, str3, i2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public final void O2() {
        int currentWindowIndex = this.f2.getCurrentWindowIndex();
        if (currentWindowIndex == 0) {
            this.f2.setCurrentWindowIndex(this.z0.size() - 1);
        } else {
            this.f2.setCurrentWindowIndex(currentWindowIndex - 1);
        }
    }

    public final void P1(Configuration configuration) {
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
        boolean z2;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            nSTIJKPlayerSkyTv = this.f2;
            z2 = false;
        } else {
            decorView.setSystemUiVisibility(256);
            nSTIJKPlayerSkyTv = this.f2;
            z2 = true;
        }
        nSTIJKPlayerSkyTv.setAdjustViewBounds(z2);
    }

    public void P2() {
        try {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f2;
            if (nSTIJKPlayerSkyTv != null) {
                if (nSTIJKPlayerSkyTv.R0()) {
                    this.f2.L0();
                } else {
                    this.f2.g1();
                    this.f2.U0(true);
                    this.f2.e1();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused) {
        }
    }

    public void Q1() {
        b2();
        this.s2 = new z().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    public final void Q2(String str, int i2, String str2, String str3, int i3) {
        new f0(str, i2, str2, str3, i3).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void R1() {
        b2();
        this.s2 = new z().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    public final void R2(String str, String str2, int i2) {
        new g0(str, i2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public String S1() {
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
            if (this.l3.equals("true")) {
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
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.I2.C()));
            String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f29293k)));
            boolean zB = this.I2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.U.z1(null, str3) : null;
            this.f0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f29293k).equals("m3u") ? this.Z.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.Z.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.v0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "all_channels_with_cat";
            }
            for (int i2 = 0; i2 < this.v0.size(); i2++) {
                AsyncTask asyncTask2 = this.s2;
                if (asyncTask2 != null && asyncTask2.isCancelled()) {
                    return "all_channels_with_cat";
                }
                if (c.h.a.i.q.m.f(this.f29293k).equals("m3u")) {
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
                            int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f29293k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f29293k)).longValue(), this.f29293k);
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

    public void S2() {
        this.t2 = new y().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void T1(boolean z2) {
        ProgressDialog progressDialogF2;
        b2();
        if (z2) {
            ProgressDialog progressDialog = this.v2;
            if (progressDialog == null) {
                progressDialogF2 = f2(this.f29293k);
                this.v2 = progressDialogF2;
                if (progressDialogF2 != null) {
                    progressDialogF2.show();
                }
            } else if (!progressDialog.isShowing()) {
                progressDialogF2 = this.v2;
                progressDialogF2.show();
            }
        }
        this.s2 = new a0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    @SuppressLint({"NewApi"})
    public void T2(ArrayList<c.h.a.i.f> arrayList) {
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
                    if (this.l3.equals("true")) {
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
                        T2(this.v0);
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

    public void U1() {
        b2();
        this.s2 = new z().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    @SuppressLint({"NewApi"})
    public void U2(ArrayList<c.h.a.i.f> arrayList) {
        ListView listView;
        try {
            if (this.j3.equals("player")) {
                if (arrayList != null && arrayList.size() > 0) {
                    ListView listView2 = this.O;
                    if (listView2 != null) {
                        listView2.setVisibility(0);
                    }
                    this.G = false;
                    if (this.O != null) {
                        c.h.a.k.b.t tVar = new c.h.a.k.b.t(this, arrayList);
                        this.d3 = tVar;
                        this.O.setAdapter((ListAdapter) tVar);
                        this.O.setSelection(this.g3);
                        this.O.requestFocus();
                        this.O.setOnItemClickListener(new s(arrayList));
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
                        this.c3 = sVar;
                        this.N.setAdapter((ListAdapter) sVar);
                        this.N.setSelection(this.g3);
                        if (!f29288f) {
                            this.N.requestFocus();
                        }
                        this.N.setOnItemSelectedListener(new t());
                        this.N.setOnItemClickListener(new u(arrayList));
                        this.N.setOnItemLongClickListener(new v());
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

    public void V1() {
        b2();
        this.s2 = new z().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "recently_watched");
    }

    public final void V2(String str, boolean z2) {
        String str2;
        String str3;
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        if (z2 && this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.W2);
            this.ll_player_header_footer.setVisibility(8);
        }
        this.j3 = str;
        if (str.equals("player")) {
            this.rl_episodes_box_player.startAnimation(this.h3);
            this.rl_episodes_box_player.setVisibility(0);
        }
        String str4 = this.m3;
        if ((str4 != null && str4.equals("-1")) || (((str2 = this.m3) != null && str2.equals("0")) || ((str3 = this.m3) != null && str3.equals("-6")))) {
            String str5 = this.m3;
            this.N2 = str5;
            this.O2 = str5;
        }
        if (this.j3.equals("player")) {
            c.h.a.k.b.r rVar = new c.h.a.k.b.r(this.f29293k, this.N2, this.j3, this.l3);
            this.b3 = rVar;
            this.O2 = this.N2;
            this.recycler_view_left_sidebar_player.setAdapter(rVar);
            recyclerView = this.recycler_view_left_sidebar_player;
            linearLayoutManager = this.f3;
        } else {
            c.h.a.k.b.r rVar2 = new c.h.a.k.b.r(this.f29293k, this.N2, this.j3, this.l3);
            this.a3 = rVar2;
            this.O2 = this.N2;
            this.recycler_view_left_sidebar.setAdapter(rVar2);
            recyclerView = this.recycler_view_left_sidebar;
            linearLayoutManager = this.e3;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        T1(z2);
    }

    public String W1() {
        AsyncTask asyncTask;
        AsyncTask asyncTask2;
        try {
            this.g3 = 0;
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
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.I2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f29293k)));
            boolean zB = this.I2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.U.z1(null, str) : null;
            this.f0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f29293k).equals("m3u") ? this.Z.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.Z.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.x0;
            if (arrayList3 != null && arrayList3.size() > 0) {
                for (int i2 = 0; i2 < this.x0.size() && ((asyncTask = this.s2) == null || !asyncTask.isCancelled()); i2++) {
                    if (c.h.a.i.q.m.f(this.f29293k).equals("m3u")) {
                        if (this.x0.get(i2).e0().equals(string)) {
                            this.g3 = i2;
                            this.R1 = i2;
                        }
                    } else if (this.x0.get(i2).Y().equals(string)) {
                        this.g3 = i2;
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
                                    int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f29293k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f29293k)).longValue(), this.f29293k);
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

    public final void W2() {
        try {
            new l(this).show();
        } catch (Exception unused) {
        }
    }

    public final void X1(int i2) {
        this.f2.e1 = new g();
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f2;
        nSTIJKPlayerSkyTv.d1.postDelayed(nSTIJKPlayerSkyTv.e1, i2);
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
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> X2(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.X2(java.lang.String):java.util.HashMap");
    }

    public void Y1(int i2) {
        this.f2.e1 = new f();
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f2;
        nSTIJKPlayerSkyTv.d1.postDelayed(nSTIJKPlayerSkyTv.e1, i2);
    }

    public void Y2() {
        View view;
        if (this.rl_settings_box.getVisibility() == 8 && this.ll_player_header_footer.getVisibility() == 8) {
            this.K1.removeCallbacksAndMessages(null);
            g3(this.L);
            this.u2 = new c0(this, this.K, null).execute(new String[0]);
            this.J1.removeCallbacksAndMessages(null);
            this.ll_player_header_footer.startAnimation(this.V2);
            this.ll_bottom_footer_icons.startAnimation(this.V2);
            this.ll_top_right_setting.startAnimation(this.V2);
            this.ll_top_left_back.startAnimation(this.V2);
            this.ll_bottom_footer_icons.setVisibility(0);
            this.ll_top_right_setting.setVisibility(0);
            this.ll_top_left_back.setVisibility(0);
            this.ll_player_header_footer.setVisibility(0);
            try {
                View view2 = this.f29296n;
                if (view2 == null || view2.getVisibility() != 0) {
                    View view3 = this.f29295m;
                    if (view3 == null || view3.getVisibility() != 0) {
                        return;
                    } else {
                        view = this.f29295m;
                    }
                } else {
                    view = this.f29296n;
                }
                view.requestFocus();
            } catch (Exception unused) {
            }
        }
    }

    public String Z1(String str) {
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

    public void Z2() {
        if (this.ll_player_header_footer.getVisibility() == 8) {
            this.ll_player_header_footer.startAnimation(this.V2);
            this.ll_player_header_footer.setVisibility(0);
            if (this.ll_brightness.getVisibility() == 8) {
                this.ll_brightness.startAnimation(this.V2);
                this.ll_brightness.setVisibility(0);
            }
            if (this.ll_pause_play.getVisibility() == 8) {
                this.ll_pause_play.startAnimation(this.V2);
                this.ll_pause_play.setVisibility(0);
            }
            if (this.ll_volume.getVisibility() == 8) {
                this.ll_volume.startAnimation(this.V2);
                this.ll_volume.setVisibility(0);
            }
        }
    }

    public void a2(int i2, String str, String str2) {
    }

    public final void a3() {
        LinearLayout linearLayout;
        if (this.j3.equals("player")) {
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

    public final void b2() {
        AsyncTask asyncTask = this.s2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            c.h.a.i.q.m.K(0, this.f29293k);
        } else {
            c.h.a.i.q.m.K(1, this.f29293k);
            this.s2.cancel(true);
        }
    }

    public final void b3() {
        if (this.rl_settings_box.getVisibility() == 8) {
            this.rl_settings_box.startAnimation(this.X2);
            this.rl_settings_box.setVisibility(0);
            this.iv_back_settings.requestFocus();
        }
    }

    public final void c3(Activity activity) {
        new p((NSTIJKPlayerSkyTvActivity) activity, activity).show();
    }

    public final void d2() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.setText(BuildConfig.FLAVOR);
            this.et_search_left_side.clearFocus();
        }
    }

    public final void d3() {
        float fApplyDimension;
        ProgressDialog progressDialogF2;
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
            f29288f = false;
            ListView listView = this.N;
            if (listView != null) {
                listView.requestFocus();
            }
            if (this.s3.booleanValue()) {
                return;
            }
            ProgressDialog progressDialog = this.v2;
            if (progressDialog == null) {
                progressDialogF2 = f2(this.f29293k);
                this.v2 = progressDialogF2;
                if (progressDialogF2 != null) {
                    progressDialogF2.show();
                }
            } else if (!progressDialog.isShowing()) {
                progressDialogF2 = this.v2;
                progressDialogF2.show();
            }
            this.M1.removeCallbacksAndMessages(null);
            V2(BuildConfig.FLAVOR, false);
            this.s3 = Boolean.TRUE;
        } catch (Exception e2) {
            Log.e("exection", BuildConfig.FLAVOR + e2);
        }
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

    public final void e2() {
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

    public void e3() {
        Handler handler = this.f2.d1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void f3() {
        e3();
        if (this.ll_player_header_footer.getVisibility() == 0) {
            u2();
        } else {
            Y2();
            X1(5000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:4:0x0008, B:6:0x0010, B:8:0x0014, B:9:0x0030, B:11:0x0034, B:13:0x0038), top: B:22:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g3(java.lang.String r6) {
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
            android.content.Context r3 = r5.f29293k     // Catch: java.lang.Exception -> L46
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
            android.content.Context r3 = r5.f29293k     // Catch: java.lang.Exception -> L46
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Exception -> L46
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r2, r0)     // Catch: java.lang.Exception -> L46
            r6.setImageDrawable(r3)     // Catch: java.lang.Exception -> L46
            goto L5c
        L46:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L5c
            android.widget.ImageView r6 = r5.v
            if (r6 == 0) goto L5c
            android.content.Context r1 = r5.f29293k
            android.content.res.Resources r1 = r1.getResources()
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r2, r0)
            r6.setImageDrawable(r0)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.g3(java.lang.String):void");
    }

    public void h2() {
        runOnUiThread(new r());
    }

    public final void i2() {
        ImageView imageView = this.iv_play;
        imageView.setOnFocusChangeListener(new b0(imageView));
        ImageView imageView2 = this.iv_pause;
        imageView2.setOnFocusChangeListener(new b0(imageView2));
        ImageView imageView3 = this.iv_back;
        imageView3.setOnFocusChangeListener(new b0(imageView3));
        ImageView imageView4 = this.iv_audio_subtitle_track;
        imageView4.setOnFocusChangeListener(new b0(imageView4));
        LinearLayout linearLayout = this.ll_channels_list;
        linearLayout.setOnFocusChangeListener(new b0(linearLayout));
        LinearLayout linearLayout2 = this.ll_previous_channel;
        linearLayout2.setOnFocusChangeListener(new b0(linearLayout2));
        LinearLayout linearLayout3 = this.ll_next_channel;
        linearLayout3.setOnFocusChangeListener(new b0(linearLayout3));
        LinearLayout linearLayout4 = this.ll_crop;
        linearLayout4.setOnFocusChangeListener(new b0(linearLayout4));
        LinearLayout linearLayout5 = this.ll_multi_screen;
        linearLayout5.setOnFocusChangeListener(new b0(linearLayout5));
        ImageView imageView5 = this.iv_back_episodes;
        imageView5.setOnFocusChangeListener(new b0(imageView5));
        ImageView imageView6 = this.iv_back_settings;
        imageView6.setOnFocusChangeListener(new b0(imageView6));
        RelativeLayout relativeLayout = this.rl_search_cat;
        relativeLayout.setOnFocusChangeListener(new b0(relativeLayout));
    }

    public void j2() {
        RelativeLayout relativeLayout = this.X0;
        if (relativeLayout != null) {
            relativeLayout.setPadding(0, 0, 0, 0);
        }
        f29288f = true;
        e3();
        Y2();
        X1(5000);
        String strK = c.h.a.i.q.m.k(this.f29293k);
        if (!c.h.a.i.q.m.l(this.f29293k).equals("default") && !new c.h.a.i.q.d(this.f29293k).d(strK)) {
            c.h.a.i.q.m.S("default", "default", this.f29293k);
        }
        String strL = c.h.a.i.q.m.l(this.f29293k);
        if (strL == null || strL.equalsIgnoreCase("default")) {
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
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f2;
                ((nSTIJKPlayerSkyTv == null || !nSTIJKPlayerSkyTv.isPlaying()) ? this.f29295m : this.f29296n).requestFocus();
                return;
            }
            return;
        }
        P2();
        this.y2 = true;
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.f0 = sharedPreferences;
        int i2 = sharedPreferences.getInt("currentlyPlayingVideoPosition", 0);
        ArrayList<c.h.a.i.f> arrayListG = this.c3.g();
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
        f29288f = false;
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f2;
        if (nSTIJKPlayerSkyTv2 != null) {
            nSTIJKPlayerSkyTv2.M0(Boolean.FALSE);
        }
        if (this.c2.equals("m3u")) {
            if (this.l2.booleanValue()) {
                String strK2 = c.h.a.i.q.m.k(this.f29293k);
                Intent intent = new Intent(this.f29293k, (Class<?>) PlayExternalPlayerActivity.class);
                intent.putExtra("url", this.J);
                intent.putExtra("packagename", strL);
                intent.putExtra("app_name", strK2);
                this.f29293k.startActivity(intent);
                return;
            }
            return;
        }
        if (this.o2 == -1 || !this.l2.booleanValue()) {
            return;
        }
        String strG = c.h.a.h.n.e.G(this.f29293k, this.o2, this.k0, "live");
        String strK3 = c.h.a.i.q.m.k(this.f29293k);
        Intent intent2 = new Intent(this.f29293k, (Class<?>) PlayExternalPlayerActivity.class);
        intent2.putExtra("url", strG);
        intent2.putExtra("packagename", strL);
        intent2.putExtra("app_name", strK3);
        this.f29293k.startActivity(intent2);
    }

    public void l2() {
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
                    arrayListB1 = s2(arrayListB1, this.D0);
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
                if (this.l3.equals("true")) {
                    aVar = this.B1;
                    str = "radio_streams";
                    context = this.f29293k;
                } else {
                    aVar = this.B1;
                    context = this.f29293k;
                }
                ArrayList<c.h.a.i.b> arrayListP = aVar.p(str, c.h.a.i.q.m.z(context));
                arrayList = new ArrayList<>();
                ArrayList<String> arrayList3 = this.D0;
                if (arrayList3 != null && arrayList3.size() > 0 && arrayListP != null && arrayListP.size() > 0) {
                    arrayListP = r2(arrayListP, this.D0);
                }
                for (c.h.a.i.b bVar : arrayListP) {
                    c.h.a.i.f fVarD1 = new c.h.a.i.q.f(this.f29293k).D1(bVar.a(), String.valueOf(bVar.e()));
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

    public String m2() {
        AsyncTask asyncTask;
        try {
            this.x2 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.v0;
            if (arrayList != null && this.t0 != null) {
                arrayList.clear();
                this.t0.clear();
            }
            this.P = new ArrayList<>();
            l2();
            this.v0 = this.P;
            ArrayList<c.h.a.i.f> arrayList2 = this.w0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.I2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f29293k)));
            boolean zB = this.I2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.U.z1(null, str) : null;
            this.f0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f29293k).equals("m3u") ? this.Z.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.Z.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.v0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "get_fav";
            }
            for (int i2 = 0; i2 < this.v0.size(); i2++) {
                AsyncTask asyncTask2 = this.s2;
                if (asyncTask2 != null && asyncTask2.isCancelled()) {
                    return "get_fav";
                }
                if (c.h.a.i.q.m.f(this.f29293k).equals("m3u")) {
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
                            int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f29293k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f29293k)).longValue(), this.f29293k);
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

    public String n2() {
        AsyncTask asyncTask;
        AsyncTask asyncTask2;
        c.h.a.i.q.a aVar;
        String str;
        Context context;
        boolean z2;
        try {
            this.g3 = 0;
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
                if (this.l3.equals("true")) {
                    aVar = this.B1;
                    str = "radio_streams";
                    context = this.f29293k;
                } else {
                    aVar = this.B1;
                    str = "live";
                    context = this.f29293k;
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
                        c.h.a.i.f fVarD1 = new c.h.a.i.q.f(this.f29293k).D1(bVar2.a(), String.valueOf(bVar2.e()));
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
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.I2.C()));
            String str2 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f29293k)));
            boolean zB = this.I2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.U.z1(null, str2) : null;
            this.f0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f29293k).equals("m3u") ? this.Z.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.Z.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList6 = this.x0;
            if (arrayList6 != null && arrayList6.size() > 0) {
                for (int i2 = 0; i2 < this.x0.size() && ((asyncTask = this.s2) == null || !asyncTask.isCancelled()); i2++) {
                    if (c.h.a.i.q.m.f(this.f29293k).equals("m3u")) {
                        if (this.x0.get(i2).e0().equals(string)) {
                            this.g3 = i2;
                        }
                    } else if (this.x0.get(i2).Y().equals(string)) {
                        this.g3 = i2;
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
                                    int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f29293k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f29293k)).longValue(), this.f29293k);
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

    public int o2(ArrayList<c.h.a.i.f> arrayList, int i2) {
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

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 101) {
            try {
                if (C2()) {
                    SharedPreferences sharedPreferences = getSharedPreferences("downloadStatus", 0);
                    f29287e = sharedPreferences;
                    String string = sharedPreferences.getString("downloadStatus", BuildConfig.FLAVOR);
                    c.h.a.h.n.e eVar = new c.h.a.h.n.e();
                    if (string.equals("processing")) {
                        eVar.h0(this);
                    } else {
                        eVar.k0(this, this.n2, this.k0, this.f29294l, this.I, this.J);
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
            r4.e3()     // Catch: java.lang.Exception -> Lb7
            android.widget.RelativeLayout r0 = r4.rl_episodes_box_player     // Catch: java.lang.Exception -> Lb7
            r1 = 8
            if (r0 == 0) goto L1c
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L1c
            android.widget.RelativeLayout r0 = r4.rl_episodes_box_player     // Catch: java.lang.Exception -> Lb7
            android.view.animation.Animation r2 = r4.i3     // Catch: java.lang.Exception -> Lb7
            r0.startAnimation(r2)     // Catch: java.lang.Exception -> Lb7
            android.widget.RelativeLayout r0 = r4.rl_episodes_box_player     // Catch: java.lang.Exception -> Lb7
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> Lb7
            return
        L1c:
            android.widget.RelativeLayout r0 = r4.rl_settings_box     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L31
            android.widget.RelativeLayout r0 = r4.rl_settings_box     // Catch: java.lang.Exception -> Lb7
            android.view.animation.Animation r2 = r4.Y2     // Catch: java.lang.Exception -> Lb7
            r0.startAnimation(r2)     // Catch: java.lang.Exception -> Lb7
            android.widget.RelativeLayout r0 = r4.rl_settings_box     // Catch: java.lang.Exception -> Lb7
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> Lb7
            return
        L31:
            boolean r0 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.f29288f     // Catch: java.lang.Exception -> Lb7
            if (r0 == 0) goto Lb7
            android.widget.LinearLayout r0 = r4.ll_player_header_footer     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            r2 = 0
            if (r0 != 0) goto Lb1
            android.widget.LinearLayout r0 = r4.ll_player_header_footer     // Catch: java.lang.Exception -> Lb7
            android.view.animation.Animation r3 = r4.W2     // Catch: java.lang.Exception -> Lb7
            r0.startAnimation(r3)     // Catch: java.lang.Exception -> Lb7
            android.widget.LinearLayout r0 = r4.ll_brightness     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L54
            android.widget.LinearLayout r0 = r4.ll_brightness     // Catch: java.lang.Exception -> Lb7
            android.view.animation.Animation r3 = r4.W2     // Catch: java.lang.Exception -> Lb7
            r0.startAnimation(r3)     // Catch: java.lang.Exception -> Lb7
        L54:
            android.widget.LinearLayout r0 = r4.ll_pause_play     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L63
            android.widget.LinearLayout r0 = r4.ll_pause_play     // Catch: java.lang.Exception -> Lb7
            android.view.animation.Animation r3 = r4.W2     // Catch: java.lang.Exception -> Lb7
            r0.startAnimation(r3)     // Catch: java.lang.Exception -> Lb7
        L63:
            android.widget.LinearLayout r0 = r4.ll_volume     // Catch: java.lang.Exception -> Lb7
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> Lb7
            if (r0 != 0) goto L72
            android.widget.LinearLayout r0 = r4.ll_volume     // Catch: java.lang.Exception -> Lb7
            android.view.animation.Animation r3 = r4.W2     // Catch: java.lang.Exception -> Lb7
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
            r4.d3()     // Catch: java.lang.Exception -> Lb7
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
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.onBackPressed():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0494  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 1416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.onClick(android.view.View):void");
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        P1(configuration);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29293k = this;
        super.onCreate(bundle);
        setContentView(R.layout.activity_vlcplayer_sky_tv);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        B2();
        RelativeLayout relativeLayout = this.X0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new k());
        }
        this.D0 = p2();
        SharedPreferences.Editor editor = this.C1;
        if (editor != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(this.p2));
            this.C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "0");
            this.C1.apply();
        }
        this.U.G0();
        if (this.k3.equals("false")) {
            S2();
        } else {
            String str = this.c1;
            this.N2 = str;
            c.h.a.k.b.r rVar = new c.h.a.k.b.r(this.f29293k, str, BuildConfig.FLAVOR, this.l3);
            this.a3 = rVar;
            this.O2 = this.N2;
            this.recycler_view_left_sidebar.setAdapter(rVar);
            this.recycler_view_left_sidebar.setLayoutManager(this.e3);
            T1(true);
        }
        c.h.a.h.n.e.J(this.f29293k);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.M0.x(R.menu.menu_search);
        this.Y1 = menu;
        this.Z1 = menu.getItem(2).getSubMenu().findItem(R.id.empty);
        if (c.h.a.i.q.m.f(this.f29293k).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(R.id.menu_load_channels_vod1).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f29293k.getResources().getDisplayMetrics());
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
            b2();
            P2();
        } catch (Exception unused) {
        }
    }

    @Override // a.b.k.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        if (f29288f && this.ll_bottom_footer_icons.getVisibility() == 8 && this.rl_settings_box.getVisibility() == 8 && this.rl_episodes_box_player.getVisibility() == 8) {
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
            if (f29288f && this.l2.booleanValue()) {
                findViewById(R.id.ll_next_channel).performClick();
            }
            return true;
        }
        if (i2 != 167) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (f29288f && this.l2.booleanValue()) {
            findViewById(R.id.ll_previous_channel).performClick();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
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
                                if (f29288f) {
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
                                            sb = this.S1;
                                            i3 = 3;
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
                                    this.L1.postDelayed(new w(), 3000L);
                                }
                                return true;
                            default:
                                switch (i2) {
                                    case 19:
                                    case 20:
                                    case 22:
                                        e3();
                                        X1(5000);
                                        return true;
                                    case 21:
                                        e3();
                                        X1(5000);
                                        if (f29288f && this.ll_player_header_footer.getVisibility() == 8 && this.rl_episodes_box_player.getVisibility() == 8) {
                                            V2("player", true);
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
            if (!f29288f) {
                return true;
            }
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f2;
            if (nSTIJKPlayerSkyTv2 == null || !nSTIJKPlayerSkyTv2.getPlayerIsPrepared()) {
                f3();
            } else if (this.rl_settings_box.getVisibility() == 8) {
                f3();
                (this.f2.isPlaying() ? this.iv_pause : this.iv_play).requestFocus();
            }
            return true;
        }
        if (this.l2.booleanValue() && (nSTIJKPlayerSkyTv = this.f2) != null && nSTIJKPlayerSkyTv.getPlayerIsPrepared()) {
            ((!z2 || this.f2.isPlaying()) ? this.iv_pause : this.iv_play).performClick();
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
        if (itemId == R.id.action_logout1 && (context = this.f29293k) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(this.f29293k.getResources().getString(R.string.logout_title)).f(this.f29293k.getResources().getString(R.string.logout_message)).j(this.f29293k.getResources().getString(R.string.yes), new i()).g(this.f29293k.getResources().getString(R.string.no), new h()).n();
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
        if (itemId == R.id.menu_load_channels_vod1 && c.h.a.i.q.m.f(this.f29293k).equals("m3u")) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f29293k.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f29293k.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f29293k.getResources().getString(R.string.yes), new m());
            aVar.g(this.f29293k.getResources().getString(R.string.no), new n());
            aVar.n();
        }
        if (itemId == R.id.menu_sort) {
            c3(this);
        }
        if (itemId == R.id.nav_delete_all) {
            W2();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        Handler handler;
        super.onPause();
        try {
            Thread thread = this.r3;
            if (thread != null && thread.isAlive()) {
                this.r3.interrupt();
            }
        } catch (Exception unused) {
        }
        try {
            if (this.s3.booleanValue() || (handler = this.M1) == null) {
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
                C2();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                b.a aVar = new b.a(this, R.style.AlertDialogCustom);
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.permission_alertbox, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(R.id.btn_grant);
                Button button2 = (Button) viewInflate.findViewById(R.id.btn_cancel);
                button.setOnFocusChangeListener(new e.j(button, this));
                button2.setOnFocusChangeListener(new e.j(button2, this));
                button.setOnClickListener(new o());
                button2.setOnClickListener(new q());
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
        Thread thread = this.r3;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new x());
            this.r3 = thread2;
            thread2.start();
        }
        c.h.a.h.n.e.g(this.f29293k);
        if (this.y2) {
            this.y2 = false;
            d3();
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            P2();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            P1(getResources().getConfiguration());
        }
    }

    public final ArrayList<String> p2() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.U.d1(c.h.a.i.q.m.z(this.f29293k));
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

    public final boolean q2(ArrayList<c.h.a.i.f> arrayList, ArrayList<String> arrayList2) {
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

    public final ArrayList<c.h.a.i.b> r2(ArrayList<c.h.a.i.b> arrayList, ArrayList<String> arrayList2) {
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

    public final ArrayList<c.h.a.i.c> s2(ArrayList<c.h.a.i.c> arrayList, ArrayList<String> arrayList2) {
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

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public final void t2() {
        ProgressBar progressBar = this.B;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(this.f29293k.getResources().getString(R.string.now_program_found));
        }
        TextView textView2 = this.x;
        if (textView2 != null) {
            textView2.setText(BuildConfig.FLAVOR);
        }
        TextView textView3 = this.y;
        if (textView3 != null) {
            textView3.setText(this.f29293k.getResources().getString(R.string.next_program_found));
        }
        TextView textView4 = this.z;
        if (textView4 != null) {
            textView4.setText(BuildConfig.FLAVOR);
        }
    }

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }

    public final void u2() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.W2);
            this.ll_bottom_footer_icons.startAnimation(this.W2);
            this.ll_top_right_setting.startAnimation(this.W2);
            this.ll_top_left_back.startAnimation(this.W2);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.W2);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.W2);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.W2);
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

    public void v2() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.W2);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.W2);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.W2);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.W2);
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

    public final void w2() {
        LinearLayout linearLayout = this.C;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.D;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public void x2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.ll_no_cat_found_player;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public void y2() {
        LinearLayout linearLayout = this.P0;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.Q0;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public void z2() {
        try {
            ProgressDialog progressDialog = this.v2;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.v2.dismiss();
        } catch (Exception unused) {
        }
    }
}
