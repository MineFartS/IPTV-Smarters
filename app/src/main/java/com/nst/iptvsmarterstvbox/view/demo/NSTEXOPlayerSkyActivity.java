package com.nst.iptvsmarterstvbox.view.demo;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.mediarouter.app.MediaRouteButton;
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
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky;
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
public class NSTEXOPlayerSkyActivity extends a.b.k.c implements SurfaceHolder.Callback, View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static SharedPreferences f28643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SharedPreferences f28644e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f28646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f28647h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ProgressBar f28649j;
    public TextView A;
    public ArrayList<c.h.a.i.f> A0;
    public String A1;
    public AsyncTask A2;
    public boolean A3;
    public TextView B;
    public ArrayList<c.h.a.i.f> B0;
    public LinearLayout B1;
    public AsyncTask B2;
    public String B3;
    public LinearLayout C;
    public ArrayList<c.h.a.i.f> C0;
    public LinearLayout C1;
    public boolean C2;
    public SharedPreferences C3;
    public ProgressBar D;
    public ArrayList<c.h.a.i.f> D0;
    public LinearLayout D1;
    public int D2;
    public boolean D3;
    public ProgressBar E;
    public ArrayList<c.h.a.i.f> E0;
    public LinearLayout E1;
    public boolean E2;
    public c.h.a.i.q.g E3;
    public LinearLayout F;
    public ArrayList<c.h.a.i.f> F0;
    public LinearLayout F1;
    public int F2;
    public String F3;
    public LinearLayout G;
    public ArrayList<c.h.a.i.f> G0;
    public String G1;
    public int G2;
    public Thread G3;
    public ArrayList<c.h.a.i.f> H0;
    public int H1;
    public SharedPreferences H2;
    public n2 H3;
    public ArrayList<c.h.a.i.f> I0;
    public SharedPreferences.Editor I2;
    public p.a I3;
    public c.h.a.i.q.a J1;
    public Boolean J2;
    public c.f.a.b.g3.f J3;
    public ArrayList<c.h.a.i.e> K0;
    public SharedPreferences.Editor K1;
    public Boolean K2;
    public f.d K3;
    public int L;
    public ArrayList<c.h.a.i.q.i> L0;
    public SharedPreferences.Editor L1;
    public Boolean L2;
    public Uri L3;
    public String M;
    public SharedPreferences M0;
    public TextView M1;
    public Boolean M2;
    public int M3;
    public String N;
    public SharedPreferences.Editor N0;
    public String N1;
    public Boolean N2;
    public int N3;
    public String O;
    public ArrayList<c.h.a.i.b> O0;
    public TextView O1;
    public Boolean O2;
    public boolean O3;
    public RelativeLayout P;
    public ArrayList<c.h.a.i.c> P0;
    public Handler P1;
    public c.h.a.k.d.a.a P2;
    public boolean P3;
    public ListView Q;
    public RecyclerView Q0;
    public Handler Q1;
    public Handler Q2;
    public GestureDetector Q3;
    public ListView R;
    public ProgressBar R0;
    public Handler R1;
    public c.f.a.c.d.u.s<c.f.a.c.d.u.d> R2;
    public AudioManager R3;
    public ArrayList<c.h.a.i.f> S;
    public Toolbar S0;
    public Handler S1;
    public c.f.a.c.d.u.d S2;
    public float S3;
    public SearchView T0;
    public Handler T1;
    public c.f.a.c.d.u.b T2;
    public int T3;
    public TextView U0;
    public SharedPreferences.Editor U1;
    public c.f.a.c.d.u.e U2;
    public int U3;
    public String V;
    public LinearLayout V0;
    public SharedPreferences.Editor V1;
    public Handler V2;
    public Handler V3;
    public AppBarLayout W0;
    public SharedPreferences.Editor W1;
    public ArrayList<ExternalPlayerModelClass> W2;
    public Runnable W3;
    public c.h.a.i.q.f X;
    public TextView X1;
    public int X2;
    public Handler X3;
    public SharedPreferences Y;
    public String Y2;
    public Runnable Y3;
    public c.h.a.k.b.u Z;
    public String Z2;
    public boolean Z3;
    public String a1;
    public LinearLayout a2;
    public Boolean a3;
    public SharedPreferences a4;
    public TextView b2;
    public Animation b3;
    public NSTIJKPlayerSky.w b4;
    public RelativeLayout c1;
    public Animation c3;
    public final SeekBar.OnSeekBarChangeListener c4;

    @BindView
    public MediaRouteButton cast_button;
    public RelativeLayout d1;
    public Boolean d2;
    public Animation d3;
    public final SeekBar.OnSeekBarChangeListener d4;
    public LinearLayout e1;
    public Boolean e2;
    public Animation e3;
    public SharedPreferences f0;
    public LinearLayout f1;
    public Menu f2;
    public Animation f3;
    public SharedPreferences g0;
    public RelativeLayout g1;
    public MenuItem g2;
    public Animation g3;
    public SharedPreferences h0;
    public RelativeLayout h1;
    public DateFormat h2;
    public Animation h3;

    @BindView
    public TextView header_page_title;
    public SharedPreferences i0;
    public RelativeLayout i1;
    public String i2;
    public Animation i3;

    @BindView
    public ImageView iv_audio_subtitle_track;

    @BindView
    public ImageView iv_back;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public ImageView iv_back_episodes;

    @BindView
    public ImageView iv_back_settings;

    @BindView
    public ImageView iv_hp_lock;

    @BindView
    public ImageView iv_hp_play_from_beginning;

    @BindView
    public ImageView iv_pause;

    @BindView
    public ImageView iv_play;

    @BindView
    public ImageView iv_radio;

    @BindView
    public ImageView iv_unlock_button;
    public SharedPreferences j0;
    public RelativeLayout j1;
    public String j2;
    public Animation j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f28650k;
    public SharedPreferences k0;
    public String k2;
    public String k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f28651l;
    public SharedPreferences l0;
    public SimpleDateFormat l2;
    public c.h.a.k.b.r l3;

    @BindView
    public LinearLayout ll_audio_subtitle_settings;

    @BindView
    public LinearLayout ll_audio_subtitle_settings_click;

    @BindView
    public LinearLayout ll_back;

    @BindView
    public LinearLayout ll_back_click;

    @BindView
    public LinearLayout ll_bottom_1;

    @BindView
    public LinearLayout ll_bottom_2;

    @BindView
    public LinearLayout ll_brightness;

    @BindView
    public LinearLayout ll_casting_to_tv;

    @BindView
    public LinearLayout ll_channels_list;

    @BindView
    public LinearLayout ll_chromecast_click;

    @BindView
    public LinearLayout ll_crop;

    @BindView
    public LinearLayout ll_hp_lock_click;

    @BindView
    public LinearLayout ll_multi_screen;

    @BindView
    public LinearLayout ll_no_cat_found;

    @BindView
    public LinearLayout ll_pause_play;

    @BindView
    public LinearLayout ll_pb_left_categories;

    @BindView
    public LinearLayout ll_player_header_footer;

    @BindView
    public LinearLayout ll_restart;

    @BindView
    public LinearLayout ll_screen_locked;

    @BindView
    public LinearLayout ll_volume;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f28652m;
    public SharedPreferences m0;
    public TextView m1;
    public PlayerView m2;
    public c.h.a.k.b.s m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f28653n;
    public SimpleDateFormat n0;
    public TextView n1;
    public Date n2;
    public LinearLayoutManager n3;

    @BindView
    public TextView no_audio_track;

    @BindView
    public TextView no_subtitle_track;

    @BindView
    public TextView no_video_track;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f28654o;
    public String o0;
    public TextView o1;
    public String o2;
    public String o3;
    public ImageView p;
    public RelativeLayout p0;
    public TextView p1;
    public Boolean p2;
    public String p3;
    public View q;
    public String q1;
    public a.b.k.b q2;
    public int q3;
    public String r;
    public TextView r0;
    public TextView r1;
    public String r2;
    public Animation r3;

    @BindView
    public RecyclerView recycler_view_left_sidebar;

    @BindView
    public RelativeLayout rl_episodes_box;

    @BindView
    public RelativeLayout rl_settings_box;
    public View s;
    public AppCompatImageView s0;
    public TextView s1;
    public Boolean s2;
    public Animation s3;

    @BindView
    public SeekBar sb_brightness;

    @BindView
    public SeekBar sb_volume;
    public View t;
    public AppCompatImageView t0;
    public TextView t1;
    public c.h.a.k.h.d.c.b t2;
    public boolean t3;

    @BindView
    public TextView tv_brightness;

    @BindView
    public TextView tv_casting_status_text;

    @BindView
    public TextView tv_channel_name;

    @BindView
    public TextView tv_episode_name;

    @BindView
    public TextView tv_page_name_right_side;

    @BindView
    public TextView tv_program_name;

    @BindView
    public ImageView tv_seek_left;

    @BindView
    public ImageView tv_seek_right;

    @BindView
    public TextView tv_start_stop;

    @BindView
    public TextView tv_volume;
    public ArrayList<c.h.a.i.e> u0;
    public TextView u1;
    public String u2;
    public boolean u3;
    public LinearLayout v;
    public ArrayList<c.h.a.i.e> v0;
    public TextView v1;
    public int v2;
    public PictureInPictureParams.Builder v3;
    public TextView w;
    public ArrayList<c.h.a.i.e> w0;
    public TextView w1;
    public int w2;
    public BroadcastReceiver w3;
    public ImageView x;
    public ArrayList<c.h.a.i.e> x0;
    public TextView x1;
    public String x2;
    public String x3;
    public TextView y;
    public ArrayList<c.h.a.i.e> y0;
    public TextView y1;
    public Boolean y2;
    public String y3;
    public TextView z;
    public ArrayList<c.h.a.i.f> z0;
    public LinearLayout z1;
    public AsyncTask z2;
    public String z3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f28645f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f28648i = {0, 1, 2, 3, 4, 5};
    public boolean u = false;
    public boolean H = true;
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public boolean T = true;
    public long U = 2500;
    public boolean W = true;
    public int q0 = 0;
    public ArrayList<String> J0 = new ArrayList<>();
    public boolean X0 = true;
    public boolean Y0 = false;
    public boolean Z0 = false;
    public boolean b1 = true;
    public String k1 = BuildConfig.FLAVOR;
    public String l1 = BuildConfig.FLAVOR;
    public String I1 = BuildConfig.FLAVOR;
    public int Y1 = 0;
    public StringBuilder Z1 = new StringBuilder();
    public int c2 = -1;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity;
            AsyncTask<String, Void, HashMap<String, ArrayList<String>>> asyncTaskExecute;
            if (NSTEXOPlayerSkyActivity.this.B2 != null && NSTEXOPlayerSkyActivity.this.B2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                NSTEXOPlayerSkyActivity.this.B2.cancel(true);
            }
            ArrayList<c.h.a.i.f> arrayListE = NSTEXOPlayerSkyActivity.this.Z.e();
            k kVar = null;
            if (arrayListE != null && arrayListE.size() > 0) {
                String strI = arrayListE.get(i2).I();
                NSTEXOPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                asyncTaskExecute = new m0(NSTEXOPlayerSkyActivity.this, strI, kVar).execute(new String[0]);
            } else {
                if (NSTEXOPlayerSkyActivity.this.B0 == null || NSTEXOPlayerSkyActivity.this.B0.size() <= 0) {
                    return;
                }
                String strI2 = ((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).I();
                NSTEXOPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                asyncTaskExecute = new m0(NSTEXOPlayerSkyActivity.this, strI2, kVar).execute(new String[0]);
            }
            nSTEXOPlayerSkyActivity.B2 = asyncTaskExecute;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class a0 implements View.OnClickListener {
        public a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                NSTEXOPlayerSkyActivity.this.p2 = Boolean.TRUE;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", NSTEXOPlayerSkyActivity.this.getPackageName(), null));
                NSTEXOPlayerSkyActivity.this.startActivityForResult(intent, 101);
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                Toast.makeText(nSTEXOPlayerSkyActivity, nSTEXOPlayerSkyActivity.f28650k.getResources().getString(R.string.grant_the_permission), 1).show();
            } catch (Exception unused) {
            }
            NSTEXOPlayerSkyActivity.this.q2.dismiss();
        }
    }

    public class b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28657b;

        public b(ArrayList arrayList) {
            this.f28657b = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity;
            try {
                if (NSTEXOPlayerSkyActivity.this.B2 != null && NSTEXOPlayerSkyActivity.this.B2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    NSTEXOPlayerSkyActivity.this.B2.cancel(true);
                }
                c.h.a.h.n.a.G = Boolean.TRUE;
                ArrayList<c.h.a.i.f> arrayListE = NSTEXOPlayerSkyActivity.this.Z.e();
                if (arrayListE == null || arrayListE.size() <= 0) {
                    if (NSTEXOPlayerSkyActivity.this.B0 == null || NSTEXOPlayerSkyActivity.this.B0.size() <= 0) {
                        return;
                    }
                    c.h.a.h.n.e.S(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).P());
                    String strI = ((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).I();
                    String strX = ((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).X();
                    String strE0 = ((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).e0();
                    if (NSTEXOPlayerSkyActivity.this.j2.equals("m3u")) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = NSTEXOPlayerSkyActivity.this;
                        if (!nSTEXOPlayerSkyActivity2.I1.equals(((c.h.a.i.f) nSTEXOPlayerSkyActivity2.B0.get(i2)).e0())) {
                            NSTEXOPlayerSkyActivity.this.m2.setCurrentWindowIndex(i2);
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity3.X2 = c.h.a.h.n.e.S(((c.h.a.i.f) nSTEXOPlayerSkyActivity3.B0.get(i2)).P());
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity4.Y2 = ((c.h.a.i.f) nSTEXOPlayerSkyActivity4.B0.get(i2)).g();
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity5.F3 = nSTEXOPlayerSkyActivity5.k1;
                            if (nSTEXOPlayerSkyActivity5.F0 != null) {
                                NSTEXOPlayerSkyActivity.this.F0.clear();
                                NSTEXOPlayerSkyActivity.this.F0.addAll(this.f28657b);
                            }
                            NSTEXOPlayerSkyActivity.this.m2.setTitle(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).P() + " - " + ((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).getName());
                            NSTEXOPlayerSkyActivity.this.y3 = ((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).P() + " - " + ((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).getName();
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity6.I1 = ((c.h.a.i.f) nSTEXOPlayerSkyActivity6.B0.get(i2)).e0();
                            c.h.a.k.e.a.f().q(NSTEXOPlayerSkyActivity.this.I1);
                            if (!NSTEXOPlayerSkyActivity.this.k1.equals("-1") && !NSTEXOPlayerSkyActivity.this.k1.equals("0") && !NSTEXOPlayerSkyActivity.this.k1.equals("-6")) {
                                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity7 = NSTEXOPlayerSkyActivity.this;
                                nSTEXOPlayerSkyActivity7.k1 = ((c.h.a.i.f) nSTEXOPlayerSkyActivity7.B0.get(i2)).g();
                                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity8 = NSTEXOPlayerSkyActivity.this;
                                nSTEXOPlayerSkyActivity8.l1 = ((c.h.a.i.f) nSTEXOPlayerSkyActivity8.B0.get(i2)).B();
                                if (NSTEXOPlayerSkyActivity.this.l1.isEmpty()) {
                                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity9 = NSTEXOPlayerSkyActivity.this;
                                    nSTEXOPlayerSkyActivity9.l1 = nSTEXOPlayerSkyActivity9.c2(nSTEXOPlayerSkyActivity9.k1);
                                }
                            }
                            NSTEXOPlayerSkyActivity.this.Y1 = i2;
                            NSTEXOPlayerSkyActivity.this.m2.B();
                            if (NSTEXOPlayerSkyActivity.this.s2.booleanValue()) {
                                NSTEXOPlayerSkyActivity.this.L3 = Uri.parse(strE0);
                                NSTEXOPlayerSkyActivity.this.m2.t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f28645f));
                                NSTEXOPlayerSkyActivity.this.x3 = String.valueOf(Uri.parse(strE0));
                                NSTEXOPlayerSkyActivity.this.D2();
                                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity10 = NSTEXOPlayerSkyActivity.this;
                                nSTEXOPlayerSkyActivity10.M3 = 0;
                                nSTEXOPlayerSkyActivity10.O3 = false;
                            }
                            NSTEXOPlayerSkyActivity.this.S1.removeCallbacksAndMessages(null);
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity11 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity11.N = strI;
                            nSTEXOPlayerSkyActivity11.O = strX;
                            nSTEXOPlayerSkyActivity11.z3 = strX;
                            NSTEXOPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTEXOPlayerSkyActivity.this.N);
                            NSTEXOPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTEXOPlayerSkyActivity.this.O);
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity12 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity12.s3(nSTEXOPlayerSkyActivity12.O);
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity13 = NSTEXOPlayerSkyActivity.this;
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity14 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity13.B2 = new m0(nSTEXOPlayerSkyActivity14, nSTEXOPlayerSkyActivity14.N, null).execute(new String[0]);
                            NSTEXOPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                            if (NSTEXOPlayerSkyActivity.this.K1 != null) {
                                NSTEXOPlayerSkyActivity.this.K1.putString("currentlyPlayingVideo", String.valueOf(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).Y()));
                                NSTEXOPlayerSkyActivity.this.K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).e0()));
                                NSTEXOPlayerSkyActivity.this.K1.apply();
                            }
                            if (NSTEXOPlayerSkyActivity.this.L1 != null) {
                                NSTEXOPlayerSkyActivity.this.L1.putInt("currentlyPlayingVideoPosition", i2);
                                NSTEXOPlayerSkyActivity.this.L1.apply();
                            }
                            nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity.Z.notifyDataSetChanged();
                            return;
                        }
                        NSTEXOPlayerSkyActivity.this.j2(true);
                    }
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity15 = NSTEXOPlayerSkyActivity.this;
                    if (nSTEXOPlayerSkyActivity15.H1 != c.h.a.h.n.e.R(((c.h.a.i.f) nSTEXOPlayerSkyActivity15.B0.get(i2)).Y())) {
                        NSTEXOPlayerSkyActivity.this.m2.setCurrentWindowIndex(i2);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity16 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity16.X2 = c.h.a.h.n.e.S(((c.h.a.i.f) nSTEXOPlayerSkyActivity16.B0.get(i2)).P());
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity17 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity17.Y2 = ((c.h.a.i.f) nSTEXOPlayerSkyActivity17.B0.get(i2)).g();
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity18 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity18.F3 = nSTEXOPlayerSkyActivity18.k1;
                        if (nSTEXOPlayerSkyActivity18.F0 != null) {
                            NSTEXOPlayerSkyActivity.this.F0.clear();
                            NSTEXOPlayerSkyActivity.this.F0.addAll(this.f28657b);
                        }
                        NSTEXOPlayerSkyActivity.this.m2.setTitle(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).P() + " - " + ((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).getName());
                        NSTEXOPlayerSkyActivity.this.y3 = ((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).P() + " - " + ((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).getName();
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity19 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity19.H1 = c.h.a.h.n.e.R(((c.h.a.i.f) nSTEXOPlayerSkyActivity19.B0.get(i2)).Y());
                        c.h.a.k.e.a.f().q(String.valueOf(NSTEXOPlayerSkyActivity.this.H1));
                        if (!NSTEXOPlayerSkyActivity.this.k1.equals("-1") && !NSTEXOPlayerSkyActivity.this.k1.equals("0") && !NSTEXOPlayerSkyActivity.this.k1.equals("-6")) {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity20 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity20.k1 = ((c.h.a.i.f) nSTEXOPlayerSkyActivity20.B0.get(i2)).g();
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity21 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity21.l1 = ((c.h.a.i.f) nSTEXOPlayerSkyActivity21.B0.get(i2)).B();
                            if (NSTEXOPlayerSkyActivity.this.l1.isEmpty()) {
                                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity22 = NSTEXOPlayerSkyActivity.this;
                                nSTEXOPlayerSkyActivity22.l1 = nSTEXOPlayerSkyActivity22.c2(nSTEXOPlayerSkyActivity22.k1);
                            }
                        }
                        NSTEXOPlayerSkyActivity.this.Y1 = i2;
                        NSTEXOPlayerSkyActivity.this.m2.B();
                        if (NSTEXOPlayerSkyActivity.this.s2.booleanValue()) {
                            NSTEXOPlayerSkyActivity.this.L3 = Uri.parse(NSTEXOPlayerSkyActivity.this.f28651l + c.h.a.h.n.e.R(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).Y()) + NSTEXOPlayerSkyActivity.this.o0);
                            NSTEXOPlayerSkyActivity.this.m2.t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f28645f));
                            NSTEXOPlayerSkyActivity.this.x3 = String.valueOf(Uri.parse(NSTEXOPlayerSkyActivity.this.f28651l + c.h.a.h.n.e.R(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).Y()) + ".m3u8"));
                            NSTEXOPlayerSkyActivity.this.D2();
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity23 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity23.M3 = 0;
                            nSTEXOPlayerSkyActivity23.O3 = false;
                        }
                        NSTEXOPlayerSkyActivity.this.S1.removeCallbacksAndMessages(null);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity24 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity24.N = strI;
                        nSTEXOPlayerSkyActivity24.O = strX;
                        nSTEXOPlayerSkyActivity24.z3 = strX;
                        NSTEXOPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTEXOPlayerSkyActivity.this.N);
                        NSTEXOPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTEXOPlayerSkyActivity.this.O);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity25 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity25.s3(nSTEXOPlayerSkyActivity25.O);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity26 = NSTEXOPlayerSkyActivity.this;
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity27 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity26.B2 = new m0(nSTEXOPlayerSkyActivity27, nSTEXOPlayerSkyActivity27.N, null).execute(new String[0]);
                        NSTEXOPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                        if (NSTEXOPlayerSkyActivity.this.K1 != null) {
                            NSTEXOPlayerSkyActivity.this.K1.putString("currentlyPlayingVideo", String.valueOf(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).Y()));
                            NSTEXOPlayerSkyActivity.this.K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).e0()));
                            NSTEXOPlayerSkyActivity.this.K1.apply();
                        }
                        if (NSTEXOPlayerSkyActivity.this.L1 != null) {
                            NSTEXOPlayerSkyActivity.this.L1.putInt("currentlyPlayingVideoPosition", i2);
                            NSTEXOPlayerSkyActivity.this.L1.apply();
                        }
                        nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity.Z.notifyDataSetChanged();
                        return;
                    }
                    NSTEXOPlayerSkyActivity.this.j2(true);
                }
                int iS = c.h.a.h.n.e.S(arrayListE.get(i2).P());
                String strI2 = arrayListE.get(i2).I();
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity28 = NSTEXOPlayerSkyActivity.this;
                nSTEXOPlayerSkyActivity28.o2(nSTEXOPlayerSkyActivity28.B0, iS);
                String strE02 = arrayListE.get(i2).e0();
                if (NSTEXOPlayerSkyActivity.this.j2.equals("m3u")) {
                    if (!NSTEXOPlayerSkyActivity.this.I1.equals(arrayListE.get(i2).e0())) {
                        NSTEXOPlayerSkyActivity.this.m2.setCurrentWindowIndex(i2);
                        NSTEXOPlayerSkyActivity.this.X2 = c.h.a.h.n.e.S(arrayListE.get(i2).P());
                        NSTEXOPlayerSkyActivity.this.Y2 = arrayListE.get(i2).g();
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity29 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity29.F3 = nSTEXOPlayerSkyActivity29.k1;
                        if (nSTEXOPlayerSkyActivity29.F0 != null) {
                            NSTEXOPlayerSkyActivity.this.F0.clear();
                            NSTEXOPlayerSkyActivity.this.F0.addAll(this.f28657b);
                        }
                        NSTEXOPlayerSkyActivity.this.m2.setTitle(arrayListE.get(i2).P() + " - " + arrayListE.get(i2).getName());
                        NSTEXOPlayerSkyActivity.this.y3 = arrayListE.get(i2).P() + " - " + arrayListE.get(i2).getName();
                        NSTEXOPlayerSkyActivity.this.I1 = arrayListE.get(i2).e0();
                        c.h.a.k.e.a.f().q(NSTEXOPlayerSkyActivity.this.I1);
                        if (!NSTEXOPlayerSkyActivity.this.k1.equals("-1") && !NSTEXOPlayerSkyActivity.this.k1.equals("0") && !NSTEXOPlayerSkyActivity.this.k1.equals("-6")) {
                            NSTEXOPlayerSkyActivity.this.k1 = arrayListE.get(i2).g();
                            NSTEXOPlayerSkyActivity.this.l1 = arrayListE.get(i2).B();
                            if (NSTEXOPlayerSkyActivity.this.l1.isEmpty()) {
                                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity30 = NSTEXOPlayerSkyActivity.this;
                                nSTEXOPlayerSkyActivity30.l1 = nSTEXOPlayerSkyActivity30.c2(nSTEXOPlayerSkyActivity30.k1);
                            }
                        }
                        String strX2 = arrayListE.get(i2).X();
                        try {
                            if (strX2.equals(BuildConfig.FLAVOR) || strX2.isEmpty()) {
                                NSTEXOPlayerSkyActivity.this.x.setImageDrawable(NSTEXOPlayerSkyActivity.this.f28650k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                            } else {
                                c.k.b.t.q(NSTEXOPlayerSkyActivity.this.f28650k).l(strX2).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(NSTEXOPlayerSkyActivity.this.x);
                            }
                        } catch (Exception unused) {
                            NSTEXOPlayerSkyActivity.this.x.setImageDrawable(NSTEXOPlayerSkyActivity.this.f28650k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                        }
                        NSTEXOPlayerSkyActivity.this.S1.removeCallbacksAndMessages(null);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity31 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity31.N = strI2;
                        nSTEXOPlayerSkyActivity31.O = strX2;
                        nSTEXOPlayerSkyActivity31.z3 = strX2;
                        NSTEXOPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTEXOPlayerSkyActivity.this.N);
                        NSTEXOPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTEXOPlayerSkyActivity.this.O);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity32 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity32.s3(nSTEXOPlayerSkyActivity32.O);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity33 = NSTEXOPlayerSkyActivity.this;
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity34 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity33.B2 = new m0(nSTEXOPlayerSkyActivity34, nSTEXOPlayerSkyActivity34.N, null).execute(new String[0]);
                        NSTEXOPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                        NSTEXOPlayerSkyActivity.this.Y1 = i2;
                        NSTEXOPlayerSkyActivity.this.m2.B();
                        if (NSTEXOPlayerSkyActivity.this.s2.booleanValue()) {
                            NSTEXOPlayerSkyActivity.this.L3 = Uri.parse(strE02);
                            NSTEXOPlayerSkyActivity.this.m2.t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f28645f));
                            NSTEXOPlayerSkyActivity.this.x3 = String.valueOf(Uri.parse(strE02));
                            NSTEXOPlayerSkyActivity.this.D2();
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity35 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity35.M3 = 0;
                            nSTEXOPlayerSkyActivity35.O3 = false;
                        }
                        if (NSTEXOPlayerSkyActivity.this.K1 != null) {
                            NSTEXOPlayerSkyActivity.this.K1.putString("currentlyPlayingVideo", String.valueOf(arrayListE.get(i2).Y()));
                            NSTEXOPlayerSkyActivity.this.K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayListE.get(i2).e0()));
                            NSTEXOPlayerSkyActivity.this.K1.apply();
                        }
                        if (NSTEXOPlayerSkyActivity.this.L1 != null) {
                            NSTEXOPlayerSkyActivity.this.L1.putInt("currentlyPlayingVideoPosition", i2);
                            NSTEXOPlayerSkyActivity.this.L1.apply();
                        }
                        nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity.Z.notifyDataSetChanged();
                        return;
                    }
                    NSTEXOPlayerSkyActivity.this.j2(true);
                }
                if (NSTEXOPlayerSkyActivity.this.H1 != c.h.a.h.n.e.R(arrayListE.get(i2).Y())) {
                    NSTEXOPlayerSkyActivity.this.m2.setCurrentWindowIndex(i2);
                    NSTEXOPlayerSkyActivity.this.X2 = c.h.a.h.n.e.S(arrayListE.get(i2).P());
                    NSTEXOPlayerSkyActivity.this.Y2 = arrayListE.get(i2).g();
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity36 = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity36.F3 = nSTEXOPlayerSkyActivity36.k1;
                    if (nSTEXOPlayerSkyActivity36.F0 != null) {
                        NSTEXOPlayerSkyActivity.this.F0.clear();
                        NSTEXOPlayerSkyActivity.this.F0.addAll(this.f28657b);
                    }
                    NSTEXOPlayerSkyActivity.this.m2.setTitle(arrayListE.get(i2).P() + " - " + arrayListE.get(i2).getName());
                    NSTEXOPlayerSkyActivity.this.y3 = arrayListE.get(i2).P() + " - " + arrayListE.get(i2).getName();
                    NSTEXOPlayerSkyActivity.this.H1 = c.h.a.h.n.e.R(arrayListE.get(i2).Y());
                    c.h.a.k.e.a.f().q(String.valueOf(NSTEXOPlayerSkyActivity.this.H1));
                    if (!NSTEXOPlayerSkyActivity.this.k1.equals("-1") && !NSTEXOPlayerSkyActivity.this.k1.equals("0") && !NSTEXOPlayerSkyActivity.this.k1.equals("-6")) {
                        NSTEXOPlayerSkyActivity.this.k1 = arrayListE.get(i2).g();
                        NSTEXOPlayerSkyActivity.this.l1 = arrayListE.get(i2).B();
                        if (NSTEXOPlayerSkyActivity.this.l1.isEmpty()) {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity37 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity37.l1 = nSTEXOPlayerSkyActivity37.c2(nSTEXOPlayerSkyActivity37.k1);
                        }
                    }
                    String strX3 = arrayListE.get(i2).X();
                    try {
                        try {
                            if (strX3.equals(BuildConfig.FLAVOR) || strX3.isEmpty()) {
                                NSTEXOPlayerSkyActivity.this.x.setImageDrawable(NSTEXOPlayerSkyActivity.this.f28650k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                            } else {
                                c.k.b.t.q(NSTEXOPlayerSkyActivity.this.f28650k).l(strX3).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(NSTEXOPlayerSkyActivity.this.x);
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        NSTEXOPlayerSkyActivity.this.x.setImageDrawable(NSTEXOPlayerSkyActivity.this.f28650k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                    }
                    NSTEXOPlayerSkyActivity.this.S1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity38 = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity38.N = strI2;
                    nSTEXOPlayerSkyActivity38.O = strX3;
                    nSTEXOPlayerSkyActivity38.z3 = strX3;
                    NSTEXOPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTEXOPlayerSkyActivity.this.N);
                    NSTEXOPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTEXOPlayerSkyActivity.this.O);
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity39 = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity39.s3(nSTEXOPlayerSkyActivity39.O);
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity40 = NSTEXOPlayerSkyActivity.this;
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity41 = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity40.B2 = new m0(nSTEXOPlayerSkyActivity41, nSTEXOPlayerSkyActivity41.N, null).execute(new String[0]);
                    NSTEXOPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyActivity.this.Y1 = i2;
                    NSTEXOPlayerSkyActivity.this.m2.B();
                    if (NSTEXOPlayerSkyActivity.this.s2.booleanValue()) {
                        NSTEXOPlayerSkyActivity.this.L3 = Uri.parse(NSTEXOPlayerSkyActivity.this.f28651l + c.h.a.h.n.e.R(arrayListE.get(i2).Y()) + NSTEXOPlayerSkyActivity.this.o0);
                        NSTEXOPlayerSkyActivity.this.m2.t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f28645f));
                        NSTEXOPlayerSkyActivity.this.x3 = String.valueOf(Uri.parse(NSTEXOPlayerSkyActivity.this.f28651l + c.h.a.h.n.e.R(arrayListE.get(i2).Y()) + ".m3u8"));
                        NSTEXOPlayerSkyActivity.this.D2();
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity42 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity42.M3 = 0;
                        nSTEXOPlayerSkyActivity42.O3 = false;
                    }
                    if (NSTEXOPlayerSkyActivity.this.K1 != null) {
                        NSTEXOPlayerSkyActivity.this.K1.putString("currentlyPlayingVideo", String.valueOf(arrayListE.get(i2).Y()));
                        NSTEXOPlayerSkyActivity.this.K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayListE.get(i2).e0()));
                        NSTEXOPlayerSkyActivity.this.K1.apply();
                    }
                    if (NSTEXOPlayerSkyActivity.this.L1 != null) {
                        NSTEXOPlayerSkyActivity.this.L1.putInt("currentlyPlayingVideoPosition", i2);
                        NSTEXOPlayerSkyActivity.this.L1.apply();
                    }
                    nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity.Z.notifyDataSetChanged();
                    return;
                }
                NSTEXOPlayerSkyActivity.this.j2(true);
            } catch (Exception unused4) {
            }
        }
    }

    public class b0 implements View.OnClickListener {
        public b0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTEXOPlayerSkyActivity.this.q2.dismiss();
        }
    }

    public class c implements AdapterView.OnItemLongClickListener {

        public class a implements PopupMenu.OnMenuItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f28661a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f28662b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f28663c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f28664d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f28665e;

            public a(String str, String str2, String str3, String str4, String str5) {
                this.f28661a = str;
                this.f28662b = str2;
                this.f28663c = str3;
                this.f28664d = str4;
                this.f28665e = str5;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
            
                r4 = r10.f28666f.f28660a;
                r4.E2 = true;
                r4.V2();
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            
                if (r10.f28666f.f28660a.j2.equals("m3u") == false) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                r4 = r10.f28666f.f28660a;
                r5 = r4.M;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
            
                r4.V = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
            
                r4 = r10.f28666f.f28660a;
                r5 = c.h.a.h.n.e.G(r4.f28650k, r4.L, r4.o0, "live");
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
            
                r4 = new android.content.Intent(r10.f28666f.f28660a.f28650k, (java.lang.Class<?>) com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity.class);
                r4.putExtra("url", r10.f28666f.f28660a.V);
                r4.putExtra("app_name", r10.f28666f.f28660a.W2.get(r3).a());
                r4.putExtra("packagename", r10.f28666f.f28660a.W2.get(r3).b());
                r10.f28666f.f28660a.f28650k.startActivity(r4);
             */
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onMenuItemClick(android.view.MenuItem r11) {
                /*
                    Method dump skipped, instruction units count: 362
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.c.a.onMenuItemClick(android.view.MenuItem):boolean");
            }
        }

        public class b implements PopupMenu.OnDismissListener {
            public b() {
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public void onDismiss(PopupMenu popupMenu) {
            }
        }

        public c() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:5|6|(2:12|(10:17|18|(2:20|(2:27|28)(2:24|25))(2:29|(2:34|28)(2:33|25))|26|35|51|36|(3:40|(3:43|44|41)|55)|45|46)(1:16))(1:10)|11|18|(0)(0)|26|35|51|36|(4:38|40|(1:41)|55)|45|46) */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0125 A[Catch: Exception -> 0x0221, TryCatch #1 {Exception -> 0x0221, blocks: (B:3:0x0007, B:5:0x000d, B:8:0x0015, B:10:0x001b, B:18:0x00fd, B:20:0x0125, B:22:0x0135, B:24:0x013b, B:25:0x013f, B:26:0x0143, B:35:0x0174, B:45:0x01df, B:27:0x0147, B:28:0x014b, B:29:0x0150, B:31:0x0164, B:33:0x016a, B:34:0x016f, B:12:0x006d, B:14:0x0075, B:16:0x0081), top: B:53:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0150 A[Catch: Exception -> 0x0221, TryCatch #1 {Exception -> 0x0221, blocks: (B:3:0x0007, B:5:0x000d, B:8:0x0015, B:10:0x001b, B:18:0x00fd, B:20:0x0125, B:22:0x0135, B:24:0x013b, B:25:0x013f, B:26:0x0143, B:35:0x0174, B:45:0x01df, B:27:0x0147, B:28:0x014b, B:29:0x0150, B:31:0x0164, B:33:0x016a, B:34:0x016f, B:12:0x006d, B:14:0x0075, B:16:0x0081), top: B:53:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01a5 A[Catch: Exception -> 0x01df, TRY_LEAVE, TryCatch #0 {Exception -> 0x01df, blocks: (B:36:0x018e, B:38:0x0194, B:41:0x019b, B:43:0x01a5), top: B:51:0x018e }] */
        @Override // android.widget.AdapterView.OnItemLongClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onItemLongClick(android.widget.AdapterView<?> r18, android.view.View r19, int r20, long r21) {
            /*
                Method dump skipped, instruction units count: 546
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.c.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
        }
    }

    public class c0 implements Runnable {
        public c0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(NSTEXOPlayerSkyActivity.this.f28650k);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = NSTEXOPlayerSkyActivity.this.O1;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = NSTEXOPlayerSkyActivity.this.M1;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyActivity.this.b2.setText(BuildConfig.FLAVOR);
                NSTEXOPlayerSkyActivity.this.a2.setVisibility(8);
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyActivity.this.b2.setText(BuildConfig.FLAVOR);
                NSTEXOPlayerSkyActivity.this.a2.setVisibility(8);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<c.h.a.i.f> arrayListU1;
            Handler handler;
            Runnable bVar;
            boolean zQ2;
            ArrayList<c.h.a.i.f> arrayListW0;
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity.a1 = nSTEXOPlayerSkyActivity.Z1.toString();
            NSTEXOPlayerSkyActivity.this.b2.setText(BuildConfig.FLAVOR);
            NSTEXOPlayerSkyActivity.this.a2.setVisibility(8);
            if (NSTEXOPlayerSkyActivity.this.B3.equals("true")) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = NSTEXOPlayerSkyActivity.this;
                arrayListU1 = nSTEXOPlayerSkyActivity2.X.u1(nSTEXOPlayerSkyActivity2.a1, "radio_streams");
            } else {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = NSTEXOPlayerSkyActivity.this;
                arrayListU1 = nSTEXOPlayerSkyActivity3.X.u1(nSTEXOPlayerSkyActivity3.a1, "live");
            }
            NSTEXOPlayerSkyActivity.this.Z1.setLength(0);
            if (arrayListU1 == null || arrayListU1.size() == 0) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = NSTEXOPlayerSkyActivity.this;
                nSTEXOPlayerSkyActivity4.b2.setText(nSTEXOPlayerSkyActivity4.f28650k.getResources().getString(R.string.no_channel_found));
                NSTEXOPlayerSkyActivity.this.a2.setVisibility(0);
                handler = new Handler();
                bVar = new b();
            } else {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = NSTEXOPlayerSkyActivity.this;
                if (nSTEXOPlayerSkyActivity5.X.I1(c.h.a.i.q.m.z(nSTEXOPlayerSkyActivity5.f28650k)) <= 0 || NSTEXOPlayerSkyActivity.this.J0 == null) {
                    zQ2 = false;
                } else {
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = NSTEXOPlayerSkyActivity.this;
                    zQ2 = nSTEXOPlayerSkyActivity6.q2(arrayListU1, nSTEXOPlayerSkyActivity6.J0);
                }
                if (!zQ2) {
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity7 = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity7.Y0 = true;
                    nSTEXOPlayerSkyActivity7.Z0 = true;
                    nSTEXOPlayerSkyActivity7.k1 = "0";
                    nSTEXOPlayerSkyActivity7.l1 = nSTEXOPlayerSkyActivity7.f28650k.getResources().getString(R.string.all);
                    NSTEXOPlayerSkyActivity.this.q0 = 0;
                    String strP = arrayListU1.get(0).P();
                    String strY = arrayListU1.get(0).Y();
                    String name = arrayListU1.get(0).getName();
                    String strI = arrayListU1.get(0).I();
                    String strX = arrayListU1.get(0).X();
                    String strE0 = arrayListU1.get(0).e0();
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity8 = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity8.I1 = strE0;
                    nSTEXOPlayerSkyActivity8.X2 = c.h.a.h.n.e.S(nSTEXOPlayerSkyActivity8.a1);
                    NSTEXOPlayerSkyActivity.this.Y2 = "0";
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity9 = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity9.F3 = nSTEXOPlayerSkyActivity9.k1;
                    nSTEXOPlayerSkyActivity9.m2.setTitle(NSTEXOPlayerSkyActivity.this.a1 + " - " + name);
                    NSTEXOPlayerSkyActivity.this.y3 = NSTEXOPlayerSkyActivity.this.a1 + " - " + name;
                    if (NSTEXOPlayerSkyActivity.this.B3.equals("true")) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity10 = NSTEXOPlayerSkyActivity.this;
                        arrayListW0 = nSTEXOPlayerSkyActivity10.X.W0(nSTEXOPlayerSkyActivity10.k1, "radio_streams");
                    } else {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity11 = NSTEXOPlayerSkyActivity.this;
                        arrayListW0 = nSTEXOPlayerSkyActivity11.X.W0(nSTEXOPlayerSkyActivity11.k1, "live");
                    }
                    if (arrayListW0 != null) {
                        NSTEXOPlayerSkyActivity.this.B0.clear();
                    }
                    NSTEXOPlayerSkyActivity.this.B0 = arrayListW0;
                    if (NSTEXOPlayerSkyActivity.this.B0 != null && NSTEXOPlayerSkyActivity.this.B0.size() > 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= NSTEXOPlayerSkyActivity.this.B0.size()) {
                                break;
                            }
                            if (((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.B0.get(i2)).P().equals(strP)) {
                                NSTEXOPlayerSkyActivity.this.m2.setCurrentWindowIndex(i2);
                                break;
                            }
                            i2++;
                        }
                    }
                    try {
                        if (strX.equals(BuildConfig.FLAVOR) || strX.isEmpty()) {
                            NSTEXOPlayerSkyActivity.this.x.setImageDrawable(NSTEXOPlayerSkyActivity.this.f28650k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                        } else {
                            c.k.b.t.q(NSTEXOPlayerSkyActivity.this.f28650k).l(strX).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).k(80, 55).g(NSTEXOPlayerSkyActivity.this.x);
                        }
                    } catch (Exception unused) {
                        NSTEXOPlayerSkyActivity.this.x.setImageDrawable(NSTEXOPlayerSkyActivity.this.f28650k.getResources().getDrawable(R.drawable.logo_placeholder_white));
                    }
                    NSTEXOPlayerSkyActivity.this.m2.B();
                    if (NSTEXOPlayerSkyActivity.this.s2.booleanValue()) {
                        if (NSTEXOPlayerSkyActivity.this.j2.equals("m3u")) {
                            NSTEXOPlayerSkyActivity.this.L3 = Uri.parse(strE0);
                            NSTEXOPlayerSkyActivity.this.m2.t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f28645f));
                            NSTEXOPlayerSkyActivity.this.x3 = String.valueOf(Uri.parse(strE0));
                            c.h.a.k.e.a.f().q(NSTEXOPlayerSkyActivity.this.I1);
                        } else {
                            NSTEXOPlayerSkyActivity.this.L3 = Uri.parse(NSTEXOPlayerSkyActivity.this.f28651l + c.h.a.h.n.e.R(strY) + NSTEXOPlayerSkyActivity.this.o0);
                            NSTEXOPlayerSkyActivity.this.m2.t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f28645f));
                            NSTEXOPlayerSkyActivity.this.x3 = String.valueOf(Uri.parse(NSTEXOPlayerSkyActivity.this.f28651l + c.h.a.h.n.e.R(strY) + ".m3u8"));
                            c.h.a.k.e.a.f().q(strY);
                        }
                        NSTEXOPlayerSkyActivity.this.D2();
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity12 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity12.M3 = 0;
                        nSTEXOPlayerSkyActivity12.O3 = false;
                    }
                    NSTEXOPlayerSkyActivity.this.S1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity13 = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity13.N = strI;
                    nSTEXOPlayerSkyActivity13.O = strX;
                    nSTEXOPlayerSkyActivity13.z3 = strX;
                    NSTEXOPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTEXOPlayerSkyActivity.this.N);
                    NSTEXOPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTEXOPlayerSkyActivity.this.O);
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity14 = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity14.s3(nSTEXOPlayerSkyActivity14.O);
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity15 = NSTEXOPlayerSkyActivity.this;
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity16 = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity15.B2 = new m0(nSTEXOPlayerSkyActivity16, nSTEXOPlayerSkyActivity16.N, null).execute(new String[0]);
                    NSTEXOPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyActivity.this.H1 = c.h.a.h.n.e.R(strY);
                    if (NSTEXOPlayerSkyActivity.this.K1 != null) {
                        NSTEXOPlayerSkyActivity.this.K1.putString("currentlyPlayingVideo", strY);
                        NSTEXOPlayerSkyActivity.this.K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", strE0);
                        NSTEXOPlayerSkyActivity.this.K1.apply();
                    }
                    NSTEXOPlayerSkyActivity.this.Z.notifyDataSetChanged();
                    arrayListU1.clear();
                    return;
                }
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity17 = NSTEXOPlayerSkyActivity.this;
                nSTEXOPlayerSkyActivity17.b2.setText(nSTEXOPlayerSkyActivity17.f28650k.getResources().getString(R.string.no_channel_found));
                NSTEXOPlayerSkyActivity.this.a2.setVisibility(0);
                handler = new Handler();
                bVar = new a();
            }
            handler.postDelayed(bVar, 1000L);
        }
    }

    public class d0 implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28672b;

        public d0(ArrayList arrayList) {
            this.f28672b = arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:159:0x0b7d  */
        @Override // android.widget.AdapterView.OnItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemClick(android.widget.AdapterView<?> r18, android.view.View r19, int r20, long r21) {
            /*
                Method dump skipped, instruction units count: 3079
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.d0.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28675c;

        public e(String str, int i2) {
            this.f28674b = str;
            this.f28675c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity;
            String str;
            if (NSTEXOPlayerSkyActivity.this.j2.equals("m3u")) {
                NSTEXOPlayerSkyActivity.this.L3 = Uri.parse(this.f28674b);
                NSTEXOPlayerSkyActivity.this.m2.t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f28645f));
                nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                str = this.f28674b;
            } else {
                NSTEXOPlayerSkyActivity.this.L3 = Uri.parse(NSTEXOPlayerSkyActivity.this.f28651l + c.h.a.h.n.e.R(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.F0.get(this.f28675c)).Y()) + NSTEXOPlayerSkyActivity.this.o0);
                NSTEXOPlayerSkyActivity.this.m2.t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f28645f));
                nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                str = NSTEXOPlayerSkyActivity.this.f28651l + c.h.a.h.n.e.R(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.F0.get(this.f28675c)).Y()) + ".m3u8";
            }
            nSTEXOPlayerSkyActivity.x3 = String.valueOf(Uri.parse(str));
            NSTEXOPlayerSkyActivity.this.D2();
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity2.M3 = 0;
            nSTEXOPlayerSkyActivity2.O3 = false;
            nSTEXOPlayerSkyActivity2.S1.removeCallbacksAndMessages(null);
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity3.N = ((c.h.a.i.f) nSTEXOPlayerSkyActivity3.F0.get(this.f28675c)).I();
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity4.O = ((c.h.a.i.f) nSTEXOPlayerSkyActivity4.F0.get(this.f28675c)).X();
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity5.z3 = nSTEXOPlayerSkyActivity5.O;
            NSTEXOPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTEXOPlayerSkyActivity.this.N);
            NSTEXOPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTEXOPlayerSkyActivity.this.O);
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity6.s3(nSTEXOPlayerSkyActivity6.O);
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity7 = NSTEXOPlayerSkyActivity.this;
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity8 = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity7.B2 = new m0(nSTEXOPlayerSkyActivity8, nSTEXOPlayerSkyActivity8.N, null).execute(new String[0]);
        }
    }

    public class e0 implements Runnable {
        public e0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    NSTEXOPlayerSkyActivity.this.h2();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28679c;

        public f(String str, int i2) {
            this.f28678b = str;
            this.f28679c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity;
            String str;
            if (NSTEXOPlayerSkyActivity.this.j2.equals("m3u")) {
                NSTEXOPlayerSkyActivity.this.L3 = Uri.parse(this.f28678b);
                NSTEXOPlayerSkyActivity.this.m2.t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f28645f));
                nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                str = this.f28678b;
            } else {
                NSTEXOPlayerSkyActivity.this.L3 = Uri.parse(NSTEXOPlayerSkyActivity.this.f28651l + c.h.a.h.n.e.R(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.F0.get(this.f28679c)).Y()) + NSTEXOPlayerSkyActivity.this.o0);
                NSTEXOPlayerSkyActivity.this.m2.t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f28645f));
                nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                str = NSTEXOPlayerSkyActivity.this.f28651l + c.h.a.h.n.e.R(((c.h.a.i.f) NSTEXOPlayerSkyActivity.this.F0.get(this.f28679c)).Y()) + ".m3u8";
            }
            nSTEXOPlayerSkyActivity.x3 = String.valueOf(Uri.parse(str));
            NSTEXOPlayerSkyActivity.this.D2();
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity2.M3 = 0;
            nSTEXOPlayerSkyActivity2.O3 = false;
            nSTEXOPlayerSkyActivity2.S1.removeCallbacksAndMessages(null);
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity3.N = ((c.h.a.i.f) nSTEXOPlayerSkyActivity3.F0.get(this.f28679c)).I();
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity4.O = ((c.h.a.i.f) nSTEXOPlayerSkyActivity4.F0.get(this.f28679c)).X();
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity5.z3 = nSTEXOPlayerSkyActivity5.O;
            NSTEXOPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTEXOPlayerSkyActivity.this.N);
            NSTEXOPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTEXOPlayerSkyActivity.this.O);
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity6.s3(nSTEXOPlayerSkyActivity6.O);
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity7 = NSTEXOPlayerSkyActivity.this;
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity8 = NSTEXOPlayerSkyActivity.this;
            nSTEXOPlayerSkyActivity7.B2 = new m0(nSTEXOPlayerSkyActivity8, nSTEXOPlayerSkyActivity8.N, null).execute(new String[0]);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class f0 extends AsyncTask<String, Void, Boolean> {
        public f0() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(NSTEXOPlayerSkyActivity.this.C2());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (NSTEXOPlayerSkyActivity.this.m2 != null) {
                NSTEXOPlayerSkyActivity.this.m2.setEPGHandler(NSTEXOPlayerSkyActivity.this.S1);
                NSTEXOPlayerSkyActivity.this.m2.setContext(NSTEXOPlayerSkyActivity.this.f28650k);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyActivity.this.v2();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class g0 extends AsyncTask<String, Void, String> {
        public g0() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                r0 = 0
                r7 = r7[r0]     // Catch: java.lang.Exception -> L5d
                r1 = -1
                int r2 = r7.hashCode()     // Catch: java.lang.Exception -> L5d
                r3 = 3
                r4 = 2
                r5 = 1
                switch(r2) {
                    case -74797390: goto L2c;
                    case 47612238: goto L22;
                    case 301138327: goto L18;
                    case 613425326: goto Lf;
                    default: goto Le;
                }     // Catch: java.lang.Exception -> L5d
            Le:
                goto L36
            Lf:
                java.lang.String r2 = "all_channels"
                boolean r7 = r7.equals(r2)     // Catch: java.lang.Exception -> L5d
                if (r7 == 0) goto L36
                goto L37
            L18:
                java.lang.String r0 = "recently_watched"
                boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L5d
                if (r7 == 0) goto L36
                r0 = 3
                goto L37
            L22:
                java.lang.String r0 = "all_channels_with_cat"
                boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L5d
                if (r7 == 0) goto L36
                r0 = 1
                goto L37
            L2c:
                java.lang.String r0 = "get_fav"
                boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L5d
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
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity r7 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.this     // Catch: java.lang.Exception -> L5d
                java.lang.String r7 = r7.X1()     // Catch: java.lang.Exception -> L5d
                return r7
            L48:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity r7 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.this     // Catch: java.lang.Exception -> L5d
                java.lang.String r7 = r7.m2()     // Catch: java.lang.Exception -> L5d
                return r7
            L4f:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity r7 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.this     // Catch: java.lang.Exception -> L5d
                java.lang.String r7 = r7.S1()     // Catch: java.lang.Exception -> L5d
                return r7
            L56:
                com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity r7 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.this     // Catch: java.lang.Exception -> L5d
                java.lang.String r7 = r7.Q1()     // Catch: java.lang.Exception -> L5d
                return r7
            L5d:
                java.lang.String r7 = "error"
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.g0.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTEXOPlayerSkyActivity.this.C0 != null) {
                    if (!NSTEXOPlayerSkyActivity.this.e2.booleanValue()) {
                        NSTEXOPlayerSkyActivity.this.e2 = Boolean.TRUE;
                        if (NSTEXOPlayerSkyActivity.this.C0.size() != 0) {
                            if (NSTEXOPlayerSkyActivity.this.F0 != null) {
                                NSTEXOPlayerSkyActivity.this.F0.clear();
                                NSTEXOPlayerSkyActivity.this.F0.addAll(NSTEXOPlayerSkyActivity.this.C0);
                            }
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity.T2(nSTEXOPlayerSkyActivity.C0);
                        } else {
                            c.h.a.h.n.a.G = Boolean.FALSE;
                            NSTEXOPlayerSkyActivity.this.P2();
                            NSTEXOPlayerSkyActivity.this.m2.setVisibility(8);
                            NSTEXOPlayerSkyActivity.this.v.setVisibility(0);
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity2.w.setText(nSTEXOPlayerSkyActivity2.getResources().getString(R.string.no_channel_found));
                        }
                    }
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = NSTEXOPlayerSkyActivity.this;
                    if (nSTEXOPlayerSkyActivity3.Y0 && nSTEXOPlayerSkyActivity3.Z0 && !nSTEXOPlayerSkyActivity3.a1.equals(BuildConfig.FLAVOR)) {
                        NSTEXOPlayerSkyActivity.this.D2 = 0;
                        try {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = NSTEXOPlayerSkyActivity.this;
                            nSTEXOPlayerSkyActivity4.D2 = nSTEXOPlayerSkyActivity4.o2(nSTEXOPlayerSkyActivity4.C0, c.h.a.h.n.e.S(NSTEXOPlayerSkyActivity.this.a1));
                        } catch (NumberFormatException | Exception unused) {
                        }
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity5.Y0 = false;
                        nSTEXOPlayerSkyActivity5.Z0 = false;
                    }
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity6.Y2(nSTEXOPlayerSkyActivity6.C0);
                }
                NSTEXOPlayerSkyActivity.this.x2();
            } catch (Exception unused2) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            TextView textView;
            String string;
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity;
            super.onPreExecute();
            try {
                NSTEXOPlayerSkyActivity.this.i3();
                TextView textView2 = NSTEXOPlayerSkyActivity.this.U0;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = NSTEXOPlayerSkyActivity.this;
                if (nSTEXOPlayerSkyActivity2.r0 != null) {
                    if (!nSTEXOPlayerSkyActivity2.k1.equals(BuildConfig.FLAVOR) && NSTEXOPlayerSkyActivity.this.k1.equals("0")) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity3.r0.setText(nSTEXOPlayerSkyActivity3.f28650k.getResources().getString(R.string.all));
                        nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                    } else if (!NSTEXOPlayerSkyActivity.this.k1.equals(BuildConfig.FLAVOR) && NSTEXOPlayerSkyActivity.this.k1.equals("-1")) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity4.r0.setText(nSTEXOPlayerSkyActivity4.f28650k.getResources().getString(R.string.favourites));
                        nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                    } else if (NSTEXOPlayerSkyActivity.this.k1.equals(BuildConfig.FLAVOR) || !NSTEXOPlayerSkyActivity.this.k1.equals("-6")) {
                        if (NSTEXOPlayerSkyActivity.this.l1.equals(BuildConfig.FLAVOR)) {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = NSTEXOPlayerSkyActivity.this;
                            textView = nSTEXOPlayerSkyActivity5.r0;
                            string = nSTEXOPlayerSkyActivity5.getResources().getString(R.string.uncategories);
                        } else {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = NSTEXOPlayerSkyActivity.this;
                            textView = nSTEXOPlayerSkyActivity6.r0;
                            string = nSTEXOPlayerSkyActivity6.l1;
                        }
                        textView.setText(string);
                        nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                    } else {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity7 = NSTEXOPlayerSkyActivity.this;
                        nSTEXOPlayerSkyActivity7.r0.setText(nSTEXOPlayerSkyActivity7.f28650k.getResources().getString(R.string.recently_watched));
                        nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                    }
                    nSTEXOPlayerSkyActivity.r0.setSelected(true);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyActivity.this.u2();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class h0 extends AsyncTask<String, Void, String> {
        public h0() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return NSTEXOPlayerSkyActivity.this.Z2.equals("-1") ? NSTEXOPlayerSkyActivity.this.n2() : NSTEXOPlayerSkyActivity.this.Z2.equals("-6") ? NSTEXOPlayerSkyActivity.this.X1() : NSTEXOPlayerSkyActivity.this.U1();
            } catch (Exception unused) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTEXOPlayerSkyActivity.this.D0 != null) {
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                    nSTEXOPlayerSkyActivity.Z2(nSTEXOPlayerSkyActivity.D0);
                }
                NSTEXOPlayerSkyActivity.this.w2();
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            NSTEXOPlayerSkyActivity.this.h3();
            LinearLayout linearLayout = NSTEXOPlayerSkyActivity.this.V0;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (NSTEXOPlayerSkyActivity.this.R != null) {
                NSTEXOPlayerSkyActivity.this.R.setVisibility(8);
            }
        }
    }

    public class i extends BroadcastReceiver {
        public i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"media_control".equals(intent.getAction())) {
                return;
            }
            int intExtra = intent.getIntExtra("control_type", 0);
            if (intExtra == 1) {
                NSTEXOPlayerSkyActivity.this.S2();
                if (Build.VERSION.SDK_INT >= 26) {
                    NSTEXOPlayerSkyActivity.this.t3(R.drawable.hplib_ic_pause, "pause", 2, 2);
                    return;
                }
                return;
            }
            if (intExtra != 2) {
                return;
            }
            NSTEXOPlayerSkyActivity.this.R2();
            if (Build.VERSION.SDK_INT >= 26) {
                NSTEXOPlayerSkyActivity.this.t3(R.drawable.hp_play, "play", 1, 1);
            }
        }
    }

    public class i0 implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f28687b;

        public i0(View view) {
            this.f28687b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28687b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28687b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28687b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            View view3;
            View view4;
            LinearLayout linearLayout;
            View view5;
            View view6;
            View view7;
            LinearLayout linearLayout2;
            if (z) {
                f2 = z ? 1.08f : 1.0f;
                View view8 = this.f28687b;
                if (view8 == null || view8.getTag() == null || !this.f28687b.getTag().equals("1")) {
                    View view9 = this.f28687b;
                    if (view9 == null || view9.getTag() == null || !this.f28687b.getTag().equals("2")) {
                        View view10 = this.f28687b;
                        if (view10 == null || view10.getTag() == null || !this.f28687b.getTag().equals("3")) {
                            View view11 = this.f28687b;
                            if ((view11 != null && view11.getTag() != null && this.f28687b.getTag().equals("4")) || (((view5 = this.f28687b) != null && view5.getTag() != null && this.f28687b.getTag().equals("5")) || (((view6 = this.f28687b) != null && view6.getTag() != null && this.f28687b.getTag().equals("6")) || ((view7 = this.f28687b) != null && view7.getTag() != null && this.f28687b.getTag().equals("7"))))) {
                                view.setBackground(NSTEXOPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow_light));
                                return;
                            }
                            View view12 = this.f28687b;
                            if (view12 != null && view12.getTag() != null && this.f28687b.getTag().equals("8")) {
                                return;
                            }
                            View view13 = this.f28687b;
                            if (view13 == null || view13.getTag() == null || !this.f28687b.getTag().equals("9")) {
                                View view14 = this.f28687b;
                                if (view14 == null || view14.getTag() == null || !this.f28687b.getTag().equals("10")) {
                                    return;
                                }
                                view.setBackground(NSTEXOPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                                b(f2);
                                c(f2);
                                linearLayout2 = NSTEXOPlayerSkyActivity.this.ll_restart;
                            }
                        }
                        view.setBackground(NSTEXOPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                        b(f2);
                        c(f2);
                        return;
                    }
                    view.setBackground(NSTEXOPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                    b(f2);
                    c(f2);
                    linearLayout2 = NSTEXOPlayerSkyActivity.this.ll_audio_subtitle_settings;
                } else {
                    view.setBackground(NSTEXOPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                    b(f2);
                    c(f2);
                    linearLayout2 = NSTEXOPlayerSkyActivity.this.ll_back;
                }
                linearLayout2.setVisibility(0);
                return;
            }
            if (z) {
                return;
            }
            f2 = z ? 1.08f : 1.0f;
            View view15 = this.f28687b;
            if (view15 == null || view15.getTag() == null || !this.f28687b.getTag().equals("1")) {
                View view16 = this.f28687b;
                if (view16 == null || view16.getTag() == null || !this.f28687b.getTag().equals("2")) {
                    View view17 = this.f28687b;
                    if (view17 == null || view17.getTag() == null || !this.f28687b.getTag().equals("3")) {
                        View view18 = this.f28687b;
                        if ((view18 != null && view18.getTag() != null && this.f28687b.getTag().equals("4")) || (((view2 = this.f28687b) != null && view2.getTag() != null && this.f28687b.getTag().equals("5")) || (((view3 = this.f28687b) != null && view3.getTag() != null && this.f28687b.getTag().equals("6")) || ((view4 = this.f28687b) != null && view4.getTag() != null && this.f28687b.getTag().equals("7"))))) {
                            view.setBackground(null);
                            return;
                        }
                        View view19 = this.f28687b;
                        if (view19 != null && view19.getTag() != null && this.f28687b.getTag().equals("8")) {
                            return;
                        }
                        View view20 = this.f28687b;
                        if (view20 == null || view20.getTag() == null || !this.f28687b.getTag().equals("9")) {
                            View view21 = this.f28687b;
                            if (view21 == null || view21.getTag() == null || !this.f28687b.getTag().equals("10")) {
                                return;
                            }
                            view.setBackground(NSTEXOPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                            b(f2);
                            c(f2);
                            a(z);
                            linearLayout = NSTEXOPlayerSkyActivity.this.ll_restart;
                        }
                    }
                    view.setBackground(NSTEXOPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                    b(f2);
                    c(f2);
                    a(z);
                    return;
                }
                view.setBackground(NSTEXOPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                b(f2);
                c(f2);
                a(z);
                linearLayout = NSTEXOPlayerSkyActivity.this.ll_audio_subtitle_settings;
            } else {
                view.setBackground(NSTEXOPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                b(f2);
                c(f2);
                a(z);
                linearLayout = NSTEXOPlayerSkyActivity.this.ll_back;
            }
            linearLayout.setVisibility(8);
        }
    }

    public class j extends NSTIJKPlayerSky.w {
        public j() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.w
        public void a() {
            NSTEXOPlayerSkyActivity.this.t3(R.drawable.hplib_ic_pause, "pause", 2, 2);
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.w
        public void b() {
            NSTEXOPlayerSkyActivity.this.t3(R.drawable.hp_play, "play", 1, 1);
        }
    }

    public class j0 implements c.f.a.b.j3.q<x1> {
        public j0() {
        }

        public /* synthetic */ j0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, k kVar) {
            this();
        }

        @Override // c.f.a.b.j3.q
        @SuppressLint({"StringFormatInvalid"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> a(x1 x1Var) {
            String string = NSTEXOPlayerSkyActivity.this.getString(R.string.error_generic);
            Throwable cause = x1Var.getCause();
            if (cause instanceof t.a) {
                t.a aVar = (t.a) cause;
                c.f.a.b.a3.s sVar = aVar.f6494d;
                string = sVar == null ? aVar.getCause() instanceof v.c ? NSTEXOPlayerSkyActivity.this.getString(R.string.error_querying_decoders) : aVar.f6493c ? NSTEXOPlayerSkyActivity.this.getString(R.string.error_no_secure_decoder, new Object[]{aVar.f6492b}) : NSTEXOPlayerSkyActivity.this.getString(R.string.error_no_decoder, new Object[]{aVar.f6492b}) : NSTEXOPlayerSkyActivity.this.getString(R.string.error_instantiating_decoder, new Object[]{sVar.f6479a});
            }
            return Pair.create(0, string);
        }
    }

    public class k implements c.f.a.c.d.u.s<c.f.a.c.d.u.d> {
        public k() {
        }

        public final void a(c.f.a.c.d.u.d dVar) {
            NSTEXOPlayerSkyActivity.this.S2 = dVar;
            try {
                c.f.a.c.d.l lVar = new c.f.a.c.d.l(1);
                lVar.N("com.google.android.gms.cast.metadata.TITLE", NSTEXOPlayerSkyActivity.this.y3);
                lVar.b(new c.f.a.c.f.p.a(Uri.parse(NSTEXOPlayerSkyActivity.this.z3)));
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                c.h.a.h.m.a.b(nSTEXOPlayerSkyActivity.V2, nSTEXOPlayerSkyActivity.S2.p(), NSTEXOPlayerSkyActivity.this.x3, lVar, NSTEXOPlayerSkyActivity.this.f28650k);
            } catch (Exception unused) {
            }
            NSTEXOPlayerSkyActivity.this.invalidateOptionsMenu();
        }

        public final void b() {
            NSTEXOPlayerSkyActivity.this.invalidateOptionsMenu();
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void i(c.f.a.c.d.u.d dVar, int i2) {
            b();
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void o(c.f.a.c.d.u.d dVar) {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void m(c.f.a.c.d.u.d dVar, int i2) {
            b();
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void l(c.f.a.c.d.u.d dVar, boolean z) {
            a(dVar);
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(c.f.a.c.d.u.d dVar, String str) {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void k(c.f.a.c.d.u.d dVar, int i2) {
            b();
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void j(c.f.a.c.d.u.d dVar, String str) {
            a(dVar);
        }

        @Override // c.f.a.c.d.u.s
        @SuppressLint({"SetTextI18n"})
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void n(c.f.a.c.d.u.d dVar) {
            TextView textView;
            StringBuilder sb;
            String string;
            NSTEXOPlayerSkyActivity.this.S2 = dVar;
            if (NSTEXOPlayerSkyActivity.this.S2 != null) {
                if (NSTEXOPlayerSkyActivity.this.m2 != null) {
                    NSTEXOPlayerSkyActivity.this.R2();
                }
                LinearLayout linearLayout = NSTEXOPlayerSkyActivity.this.ll_casting_to_tv;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                if (nSTEXOPlayerSkyActivity.tv_casting_status_text != null) {
                    if (nSTEXOPlayerSkyActivity.S2.o() == null || NSTEXOPlayerSkyActivity.this.S2.o().J() == null) {
                        textView = NSTEXOPlayerSkyActivity.this.tv_casting_status_text;
                        sb = new StringBuilder();
                        string = NSTEXOPlayerSkyActivity.this.getResources().getString(R.string.connecting_please_wait);
                    } else {
                        textView = NSTEXOPlayerSkyActivity.this.tv_casting_status_text;
                        sb = new StringBuilder();
                        sb.append(NSTEXOPlayerSkyActivity.this.getResources().getString(R.string.connecting_to));
                        sb.append(" ");
                        string = NSTEXOPlayerSkyActivity.this.S2.o().J();
                    }
                    sb.append(string);
                    sb.append("...");
                    textView.setText(sb.toString());
                }
            }
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void g(c.f.a.c.d.u.d dVar, int i2) {
        }
    }

    public class k0 implements a2.e {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                if (nSTEXOPlayerSkyActivity.P3) {
                    return;
                }
                nSTEXOPlayerSkyActivity.M3++;
                c.h.a.h.n.e.l0(nSTEXOPlayerSkyActivity.f28650k, NSTEXOPlayerSkyActivity.this.f28650k.getResources().getString(R.string.play_back_error) + " (" + NSTEXOPlayerSkyActivity.this.M3 + "/" + NSTEXOPlayerSkyActivity.this.N3 + ")");
                NSTEXOPlayerSkyActivity.this.V2();
                NSTEXOPlayerSkyActivity.this.D2();
            }
        }

        public k0() {
        }

        public /* synthetic */ k0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, k kVar) {
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
                j.a aVarG = NSTEXOPlayerSkyActivity.this.J3.g();
                if (aVarG != null) {
                    aVarG.i(2);
                    aVarG.i(1);
                }
            } catch (Exception unused) {
            }
        }

        public final void c() {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
            if (nSTEXOPlayerSkyActivity.M3 >= nSTEXOPlayerSkyActivity.N3) {
                e(NSTEXOPlayerSkyActivity.this.f28650k.getResources().getString(R.string.small_problem));
                NSTEXOPlayerSkyActivity.this.V2();
                NSTEXOPlayerSkyActivity.this.O3 = false;
                NSTEXOPlayerSkyActivity.f28649j.setVisibility(8);
                return;
            }
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = NSTEXOPlayerSkyActivity.this;
            if (nSTEXOPlayerSkyActivity2.P3) {
                return;
            }
            nSTEXOPlayerSkyActivity2.O3 = true;
            nSTEXOPlayerSkyActivity2.P1.postDelayed(new a(), 3000L);
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
            NSTEXOPlayerSkyActivity.this.v.setVisibility(0);
            NSTEXOPlayerSkyActivity.this.w.setText(str);
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
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
            if (nSTEXOPlayerSkyActivity.P3) {
                return;
            }
            if (x1Var.f10319c == 1002) {
                nSTEXOPlayerSkyActivity.D2();
            } else if (!x1Var.toString().contains("com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException")) {
                c();
            } else {
                c.h.a.h.n.e.l0(NSTEXOPlayerSkyActivity.this.f28650k, "Audio track issue found. Please change the audio track to none.");
                NSTEXOPlayerSkyActivity.this.D2();
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
                if (NSTEXOPlayerSkyActivity.f2()) {
                    return;
                }
                LinearLayout linearLayout = NSTEXOPlayerSkyActivity.this.ll_pause_play;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    NSTEXOPlayerSkyActivity.this.ll_pause_play.setVisibility(8);
                }
                NSTEXOPlayerSkyActivity.f28649j.setVisibility(0);
                return;
            }
            if (i2 == 4) {
                c();
                return;
            }
            if (i2 == 3) {
                if (NSTEXOPlayerSkyActivity.this.ll_player_header_footer.getVisibility() == 0) {
                    NSTEXOPlayerSkyActivity.this.ll_pause_play.setVisibility(0);
                }
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                nSTEXOPlayerSkyActivity.M3 = 0;
                nSTEXOPlayerSkyActivity.f28652m.setVisibility(8);
                NSTEXOPlayerSkyActivity.this.f28653n.setVisibility(0);
                if (NSTEXOPlayerSkyActivity.f28645f) {
                    NSTEXOPlayerSkyActivity.this.f28653n.requestFocus();
                }
                NSTEXOPlayerSkyActivity.f28649j.setVisibility(8);
                c.h.a.i.q.f fVar = NSTEXOPlayerSkyActivity.this.X;
                if (fVar != null) {
                    fVar.L0(c.h.a.k.e.a.f().h());
                    NSTEXOPlayerSkyActivity.this.X.t(c.h.a.k.e.a.f().h());
                    NSTEXOPlayerSkyActivity.this.X.G0();
                }
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void z(q1 q1Var) {
            c2.j(this, q1Var);
        }
    }

    public class l extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f28694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f28695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f28696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f28697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f28698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f28699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f28700h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f28702b;

            public a(View view) {
                this.f28702b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f28702b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f28702b.getTag().equals("1")) {
                        View view3 = this.f28702b;
                        if (view3 == null || view3.getTag() == null || !this.f28702b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = l.this.f28698f;
                    }
                    linearLayout = l.this.f28697e;
                } else {
                    View view4 = this.f28702b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f28702b.getTag().equals("1")) {
                        View view5 = this.f28702b;
                        if (view5 == null || view5.getTag() == null || !this.f28702b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = l.this.f28698f;
                    }
                    linearLayout = l.this.f28697e;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Activity activity, Activity activity2) {
            super(activity);
            this.f28700h = activity2;
            this.f28694b = activity;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: Exception -> 0x0172, PHI: r0
  0x0049: PHI (r0v24 java.lang.String) = 
  (r0v17 java.lang.String)
  (r0v18 java.lang.String)
  (r0v19 java.lang.String)
  (r0v20 java.lang.String)
  (r0v25 java.lang.String)
 binds: [B:37:0x00fd, B:31:0x00d2, B:25:0x00a8, B:19:0x007e, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {Exception -> 0x0172, blocks: (B:7:0x0010, B:10:0x003b, B:13:0x0049, B:43:0x0118, B:45:0x0122, B:62:0x016b, B:46:0x0128, B:49:0x0130, B:51:0x0136, B:53:0x0142, B:54:0x0148, B:56:0x014e, B:58:0x0154, B:60:0x0160, B:61:0x0166, B:14:0x0050, B:15:0x0057, B:17:0x0072, B:21:0x0081, B:23:0x009c, B:27:0x00ab, B:29:0x00c6, B:33:0x00d6, B:35:0x00f1, B:39:0x0101, B:41:0x010d, B:42:0x0113), top: B:68:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: Exception -> 0x0172, PHI: r0
  0x0050: PHI (r0v21 java.lang.String) = 
  (r0v17 java.lang.String)
  (r0v18 java.lang.String)
  (r0v19 java.lang.String)
  (r0v20 java.lang.String)
  (r0v25 java.lang.String)
 binds: [B:37:0x00fd, B:31:0x00d2, B:25:0x00a8, B:19:0x007e, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0172, blocks: (B:7:0x0010, B:10:0x003b, B:13:0x0049, B:43:0x0118, B:45:0x0122, B:62:0x016b, B:46:0x0128, B:49:0x0130, B:51:0x0136, B:53:0x0142, B:54:0x0148, B:56:0x014e, B:58:0x0154, B:60:0x0160, B:61:0x0166, B:14:0x0050, B:15:0x0057, B:17:0x0072, B:21:0x0081, B:23:0x009c, B:27:0x00ab, B:29:0x00c6, B:33:0x00d6, B:35:0x00f1, B:39:0x0101, B:41:0x010d, B:42:0x0113), top: B:68:0x0010 }] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.view.View r6) {
            /*
                Method dump skipped, instruction units count: 374
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.l.onClick(android.view.View):void");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00f6  */
        @Override // android.app.Dialog
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCreate(android.os.Bundle r11) {
            /*
                Method dump skipped, instruction units count: 386
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.l.onCreate(android.os.Bundle):void");
        }
    }

    public class l0 extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f28704b;

        public l0() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f28704b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            NSTEXOPlayerSkyActivity.this.q3();
            return true;
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class m0 extends AsyncTask<String, Void, HashMap<String, ArrayList<String>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28707a;

        public m0(String str) {
            this.f28707a = str;
        }

        public /* synthetic */ m0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, String str, k kVar) {
            this(str);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap<String, ArrayList<String>> doInBackground(String... strArr) {
            try {
                return NSTEXOPlayerSkyActivity.this.d3(this.f28707a);
            } catch (Exception unused) {
                return new HashMap<>();
            }
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x0307 -> B:257:0x030c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x0309 -> B:257:0x030c). Please report as a decompilation issue!!! */
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
                Method dump skipped, instruction units count: 993
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.m0.onPostExecute(java.util.HashMap):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                NSTEXOPlayerSkyActivity.this.K2();
                LinearLayout linearLayout = NSTEXOPlayerSkyActivity.this.z1;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = NSTEXOPlayerSkyActivity.this.B1;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                LinearLayout linearLayout3 = NSTEXOPlayerSkyActivity.this.C1;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = NSTEXOPlayerSkyActivity.this.D1;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                LinearLayout linearLayout5 = NSTEXOPlayerSkyActivity.this.E1;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                LinearLayout linearLayout6 = NSTEXOPlayerSkyActivity.this.F1;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class n implements DialogInterface.OnClickListener {
        public n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(NSTEXOPlayerSkyActivity.this.f28650k);
        }
    }

    public class o implements SearchView.l {
        public o() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
            if (nSTEXOPlayerSkyActivity.I) {
                nSTEXOPlayerSkyActivity.I = false;
                return false;
            }
            nSTEXOPlayerSkyActivity.U0.setVisibility(8);
            c.h.a.k.b.u uVar = NSTEXOPlayerSkyActivity.this.Z;
            if (uVar != null) {
                uVar.getFilter().filter(str);
            }
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            NSTEXOPlayerSkyActivity.this.V2();
            c.h.a.h.n.e.N(NSTEXOPlayerSkyActivity.this.f28650k);
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

    public class r implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f28713b;

        public r(LinearLayout linearLayout) {
            this.f28713b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            this.f28713b.setVisibility(8);
            if (NSTEXOPlayerSkyActivity.this.ll_player_header_footer.getVisibility() != 0 || (linearLayout = NSTEXOPlayerSkyActivity.this.ll_pause_play) == null) {
                return;
            }
            linearLayout.setVisibility(0);
        }
    }

    public class s implements View.OnTouchListener {
        public s() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return (NSTEXOPlayerSkyActivity.this.e1.getVisibility() == 0 || motionEvent == null || !NSTEXOPlayerSkyActivity.this.Q3.onTouchEvent(motionEvent)) ? false : true;
        }
    }

    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyActivity.this.y2();
        }
    }

    public class u implements c.f.a.c.d.u.e {
        public u() {
        }
    }

    public class v implements SeekBar.OnSeekBarChangeListener {
        public v() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            TextView textView;
            Resources resources;
            int i3;
            NSTEXOPlayerSkyActivity.this.S3 = i2;
            int i4 = (int) ((NSTEXOPlayerSkyActivity.this.S3 / 255.0f) * 100.0f);
            if (i4 < 20) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                textView = nSTEXOPlayerSkyActivity.tv_brightness;
                resources = nSTEXOPlayerSkyActivity.getResources();
                i3 = R.drawable.hp_bright_1;
            } else if (i4 < 30) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = NSTEXOPlayerSkyActivity.this;
                textView = nSTEXOPlayerSkyActivity2.tv_brightness;
                resources = nSTEXOPlayerSkyActivity2.getResources();
                i3 = R.drawable.hp_bright_2;
            } else if (i4 < 40) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = NSTEXOPlayerSkyActivity.this;
                textView = nSTEXOPlayerSkyActivity3.tv_brightness;
                resources = nSTEXOPlayerSkyActivity3.getResources();
                i3 = R.drawable.hp_bright_3;
            } else if (i4 < 50) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = NSTEXOPlayerSkyActivity.this;
                textView = nSTEXOPlayerSkyActivity4.tv_brightness;
                resources = nSTEXOPlayerSkyActivity4.getResources();
                i3 = R.drawable.hp_bright_4;
            } else if (i4 < 60) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = NSTEXOPlayerSkyActivity.this;
                textView = nSTEXOPlayerSkyActivity5.tv_brightness;
                resources = nSTEXOPlayerSkyActivity5.getResources();
                i3 = R.drawable.hp_bright_5;
            } else if (i4 < 70) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = NSTEXOPlayerSkyActivity.this;
                textView = nSTEXOPlayerSkyActivity6.tv_brightness;
                resources = nSTEXOPlayerSkyActivity6.getResources();
                i3 = R.drawable.hp_bright_6;
            } else {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity7 = NSTEXOPlayerSkyActivity.this;
                textView = nSTEXOPlayerSkyActivity7.tv_brightness;
                resources = nSTEXOPlayerSkyActivity7.getResources();
                i3 = R.drawable.hp_bright_7;
            }
            textView.setBackground(resources.getDrawable(i3));
            WindowManager.LayoutParams attributes = NSTEXOPlayerSkyActivity.this.getWindow().getAttributes();
            attributes.screenBrightness = NSTEXOPlayerSkyActivity.this.S3 / 255.0f;
            NSTEXOPlayerSkyActivity.this.P2.R((int) NSTEXOPlayerSkyActivity.this.S3);
            NSTEXOPlayerSkyActivity.this.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTEXOPlayerSkyActivity.this.n3();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTEXOPlayerSkyActivity.this.n3();
            NSTEXOPlayerSkyActivity.this.Z1(3000);
        }
    }

    public class w implements SeekBar.OnSeekBarChangeListener {
        public w() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            TextView textView;
            Drawable drawable;
            Resources resources;
            if (NSTEXOPlayerSkyActivity.this.R3 != null) {
                try {
                    NSTEXOPlayerSkyActivity.this.R3.setStreamVolume(3, i2, 0);
                    int streamVolume = (int) ((NSTEXOPlayerSkyActivity.this.R3.getStreamVolume(3) / NSTEXOPlayerSkyActivity.this.U3) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = NSTEXOPlayerSkyActivity.this;
                        textView = nSTEXOPlayerSkyActivity.tv_volume;
                        drawable = nSTEXOPlayerSkyActivity.getResources().getDrawable(R.drawable.hp_volume_mute);
                    } else if (streamVolume < 40) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = NSTEXOPlayerSkyActivity.this;
                        textView = nSTEXOPlayerSkyActivity2.tv_volume;
                        drawable = nSTEXOPlayerSkyActivity2.getResources().getDrawable(R.drawable.hp_volume_1);
                    } else if (streamVolume < 80) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = NSTEXOPlayerSkyActivity.this;
                        textView = nSTEXOPlayerSkyActivity3.tv_volume;
                        drawable = nSTEXOPlayerSkyActivity3.getResources().getDrawable(R.drawable.hp_volume_2);
                    } else {
                        if (streamVolume < 100) {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = NSTEXOPlayerSkyActivity.this;
                            textView = nSTEXOPlayerSkyActivity4.tv_volume;
                            resources = nSTEXOPlayerSkyActivity4.getResources();
                        } else {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = NSTEXOPlayerSkyActivity.this;
                            textView = nSTEXOPlayerSkyActivity5.tv_volume;
                            resources = nSTEXOPlayerSkyActivity5.getResources();
                        }
                        drawable = resources.getDrawable(R.drawable.hp_volume_3);
                    }
                    textView.setBackground(drawable);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTEXOPlayerSkyActivity.this.n3();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTEXOPlayerSkyActivity.this.n3();
            NSTEXOPlayerSkyActivity.this.Z1(3000);
        }
    }

    public class x implements View.OnClickListener {
        public x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTEXOPlayerSkyActivity.this.j2(true);
        }
    }

    public class y implements View.OnClickListener {
        public y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(NSTEXOPlayerSkyActivity.this.f28650k);
        }
    }

    public class z implements View.OnClickListener {
        public z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTEXOPlayerSkyActivity.this.onBackPressed();
        }
    }

    public NSTEXOPlayerSkyActivity() {
        Boolean bool = Boolean.FALSE;
        this.d2 = bool;
        this.e2 = bool;
        this.i2 = BuildConfig.FLAVOR;
        this.o2 = BuildConfig.FLAVOR;
        this.p2 = bool;
        this.r2 = BuildConfig.FLAVOR;
        Boolean bool2 = Boolean.TRUE;
        this.s2 = bool2;
        this.t2 = null;
        this.v2 = -1;
        this.w2 = 0;
        this.x2 = BuildConfig.FLAVOR;
        this.y2 = bool2;
        this.z2 = null;
        this.A2 = null;
        this.B2 = null;
        this.C2 = false;
        this.D2 = 0;
        this.E2 = false;
        this.F2 = 4;
        this.G2 = f28648i[0];
        this.J2 = bool;
        this.K2 = bool;
        this.L2 = bool;
        this.M2 = bool;
        this.N2 = bool;
        this.O2 = bool;
        this.X2 = 0;
        this.Y2 = "0";
        this.Z2 = "0";
        this.a3 = bool2;
        this.k3 = "mobile";
        this.o3 = "0";
        this.p3 = "0";
        this.q3 = 0;
        this.t3 = false;
        this.u3 = false;
        this.x3 = BuildConfig.FLAVOR;
        this.y3 = BuildConfig.FLAVOR;
        this.z3 = BuildConfig.FLAVOR;
        this.A3 = false;
        this.B3 = "false";
        this.D3 = c.h.a.h.n.a.c0;
        this.F3 = "-10";
        this.G3 = null;
        this.M3 = 0;
        this.N3 = 5;
        this.O3 = false;
        this.P3 = false;
        this.S3 = -1.0f;
        this.b4 = new j();
        this.c4 = new v();
        this.d4 = new w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void H2(DialogInterface dialogInterface) {
        this.Z3 = false;
    }

    public static boolean f2() {
        ProgressBar progressBar = f28649j;
        return progressBar != null && progressBar.getVisibility() == 0;
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

    public final void A2() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final void B2() {
        try {
            this.I = true;
            this.S0.e();
            TextView textView = this.U0;
            if (textView == null || this.J) {
                return;
            }
            textView.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C2() {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.C2():boolean");
    }

    public final void D2() {
        if (this.L3 != null) {
            V2();
            if (this.H3 == null) {
                l2 l2VarB = c.h.a.k.c.i.b(this, false);
                c.f.a.b.e3.w wVar = new c.f.a.b.e3.w(this.I3);
                c.f.a.b.g3.f fVar = new c.f.a.b.g3.f(this);
                this.J3 = fVar;
                fVar.J(this.K3);
                n2 n2VarZ = new n2.b(this, l2VarB).A(wVar).B(this.J3).z();
                this.H3 = n2VarZ;
                n2VarZ.y(new k0(this, null));
                this.H3.M0(new c.f.a.b.j3.r(this.J3));
                this.H3.q1(c.f.a.b.t2.p.f10154a, true);
                this.H3.v(true);
                this.m2.setPlayer(this.H3);
            }
            this.H3.b(0, p1.b(this.L3));
            this.H3.prepare();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E2() {
        /*
            Method dump skipped, instruction units count: 2592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.E2():void");
    }

    public boolean F2() {
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

    public void J2(String str, String str2) {
        this.Z2 = str;
        T1();
    }

    public final void K2() {
        ProgressBar progressBar = this.D;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.y;
        if (textView != null) {
            textView.setText(this.f28650k.getResources().getString(R.string.now_loading));
        }
        TextView textView2 = this.z;
        if (textView2 != null) {
            textView2.setText(BuildConfig.FLAVOR);
        }
        TextView textView3 = this.A;
        if (textView3 != null) {
            textView3.setText(this.f28650k.getResources().getString(R.string.next_loading));
        }
        TextView textView4 = this.B;
        if (textView4 != null) {
            textView4.setText(BuildConfig.FLAVOR);
        }
    }

    public void L2() {
        if (this.m2 == null) {
            return;
        }
        Z1(0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            Rational rational = new Rational(this.m2.getWidth(), this.m2.getHeight());
            if (i2 >= 26) {
                try {
                    try {
                        j2(false);
                        this.v3.setAspectRatio(rational).build();
                        enterPictureInPictureMode(this.v3.build());
                    } catch (Exception unused) {
                        j2(false);
                        this.v3.setAspectRatio(new Rational(this.m2.getWidth(), this.m2.getHeight())).build();
                        enterPictureInPictureMode(this.v3.build());
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final void M1(String str, int i2, String str2, String str3, String str4) {
        if (this.f28650k == null || this.Z == null || this.J1 == null) {
            return;
        }
        c.h.a.i.b bVar = new c.h.a.i.b();
        bVar.h(str);
        bVar.m(i2);
        bVar.l(str3);
        bVar.k(str2);
        bVar.o(c.h.a.i.q.m.z(this.f28650k));
        this.J1.i(bVar, str4);
        this.Z.notifyDataSetChanged();
        c.h.a.h.n.e.l0(this.f28650k, str2 + this.f28650k.getResources().getString(R.string.add_fav));
    }

    public final void M2() {
        int currentWindowIndex = this.m2.getCurrentWindowIndex();
        if (currentWindowIndex == this.F0.size() - 1) {
            this.m2.setCurrentWindowIndex(0);
        } else {
            this.m2.setCurrentWindowIndex(currentWindowIndex + 1);
        }
    }

    public final void N1(String str, String str2, String str3) {
        if (this.f28650k == null || this.Z == null || this.X == null) {
            return;
        }
        c.h.a.i.c cVar = new c.h.a.i.c();
        cVar.h(str2);
        cVar.i(c.h.a.i.q.m.z(this.f28650k));
        cVar.g(str3);
        cVar.e(str);
        this.X.Q(cVar);
        this.Z.notifyDataSetChanged();
        c.h.a.h.n.e.l0(this.f28650k, str3 + this.f28650k.getResources().getString(R.string.add_fav));
    }

    public void N2() {
        B2();
        this.C2 = false;
        this.D2 = 0;
        AsyncTask asyncTask = this.A2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            ArrayList<c.h.a.i.e> arrayList = this.w0;
            if (arrayList != null && arrayList.size() > 0) {
                this.q0 = this.q0 != this.w0.size() + (-1) ? this.q0 + 1 : 0;
                if (this.q0 != 0 || this.B0 == null) {
                    ArrayList<c.h.a.i.e> arrayList2 = this.w0;
                    if (arrayList2 == null || arrayList2.size() <= 0 || this.q0 >= this.w0.size()) {
                        return;
                    }
                    String strB = this.w0.get(this.q0).b();
                    String strC = this.w0.get(this.q0).c();
                    this.k1 = strB;
                    this.l1 = strC;
                    if (strB != null && !strB.equals(BuildConfig.FLAVOR) && this.k1.equals("-1")) {
                        V1();
                        return;
                    }
                    String str = this.k1;
                    if (str == null || str.equals(BuildConfig.FLAVOR) || !this.k1.equals("-6")) {
                        R1();
                        return;
                    } else {
                        W1();
                        return;
                    }
                }
                this.k1 = "0";
                this.l1 = this.f28650k.getResources().getString(R.string.all);
            }
            P1();
        }
    }

    public final void O1(Configuration configuration) {
        PlayerView playerView;
        boolean z2;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            playerView = this.m2;
            z2 = false;
        } else {
            decorView.setSystemUiVisibility(256);
            playerView = this.m2;
            z2 = true;
        }
        playerView.setAdjustViewBounds(z2);
    }

    public void O2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.ll_pb_left_categories;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public void P1() {
        e2();
        this.z2 = new g0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    public void P2() {
        c.h.a.h.n.a.G = Boolean.TRUE;
        this.K = true;
        this.v.setVisibility(0);
        this.w.setText(this.f28650k.getResources().getString(R.string.no_channel_found));
        this.F1.setVisibility(8);
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            findViewById(R.id.watrmrk).setVisibility(8);
        }
    }

    public String Q1() {
        c.h.a.i.q.f fVar;
        String str;
        try {
            this.D2 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.B0;
            if (arrayList != null && this.z0 != null) {
                arrayList.clear();
                this.z0.clear();
            }
            if (this.B3.equals("true")) {
                fVar = this.X;
                str = "radio_streams";
            } else {
                fVar = this.X;
                str = "live";
            }
            this.B0 = fVar.W0("0", str);
            ArrayList<c.h.a.i.f> arrayList2 = this.C0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.P2.C()));
            String str2 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f28650k)));
            boolean zB = this.P2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.X.z1(null, str2) : null;
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f28650k).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.B0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "all_channels";
            }
            for (int i2 = 0; i2 < this.B0.size(); i2++) {
                if (c.h.a.i.q.m.f(this.f28650k).equals("m3u")) {
                    if (this.B0.get(i2).e0().equals(string)) {
                        this.D2 = i2;
                    }
                } else if (this.B0.get(i2).Y().equals(string)) {
                    this.D2 = i2;
                }
                c.h.a.i.f fVar2 = new c.h.a.i.f();
                fVar2.u0(this.B0.get(i2).P());
                fVar2.t0(this.B0.get(i2).getName());
                fVar2.C0(this.B0.get(i2).Z());
                fVar2.B0(this.B0.get(i2).Y());
                fVar2.A0(this.B0.get(i2).X());
                fVar2.l0(this.B0.get(i2).I());
                fVar2.f0(this.B0.get(i2).f());
                fVar2.g0(this.B0.get(i2).g());
                fVar2.j0(this.B0.get(i2).D());
                fVar2.D0(this.B0.get(i2).a0());
                fVar2.k0(this.B0.get(i2).F());
                fVar2.E0(this.B0.get(i2).b0());
                fVar2.F0(this.B0.get(i2).d0());
                fVar2.h0(this.B0.get(i2).B());
                fVar2.z0(this.B0.get(i2).W());
                fVar2.p0(this.B0.get(i2).M());
                fVar2.i0(this.B0.get(i2).C());
                fVar2.G0(this.B0.get(i2).e0());
                if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayListZ1.size()) {
                            break;
                        }
                        if (this.B0.get(i2).I().equals(arrayListZ1.get(i3).a())) {
                            int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f28650k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f28650k)).longValue(), this.f28650k);
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
                this.C0.add(fVar2);
            }
            return "all_channels";
        } catch (Exception unused) {
            return "all_channels";
        }
    }

    public final void Q2() {
        this.iv_play.setOnClickListener(this);
        this.iv_pause.setOnClickListener(this);
        this.ll_back_click.setOnClickListener(this);
        this.iv_back.setOnClickListener(this);
        this.ll_audio_subtitle_settings_click.setOnClickListener(this);
        this.iv_audio_subtitle_track.setOnClickListener(this);
        this.ll_channels_list.setOnClickListener(this);
        this.ll_crop.setOnClickListener(this);
        this.ll_multi_screen.setOnClickListener(this);
        this.iv_back_episodes.setOnClickListener(this);
        this.iv_back_settings.setOnClickListener(this);
        this.ll_hp_lock_click.setOnClickListener(this);
        this.iv_unlock_button.setOnClickListener(this);
        this.iv_hp_play_from_beginning.setOnClickListener(this);
    }

    public void R1() {
        e2();
        this.z2 = new g0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    public final void R2() {
        n2 n2Var;
        try {
            if (!this.s2.booleanValue() || (n2Var = this.H3) == null) {
                return;
            }
            n2Var.a0();
        } catch (Exception unused) {
        }
    }

    public String S1() {
        c.h.a.i.q.f fVar;
        String str;
        String str2;
        try {
            this.D2 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.B0;
            if (arrayList != null && this.z0 != null) {
                arrayList.clear();
                this.z0.clear();
            }
            if (this.B3.equals("true")) {
                fVar = this.X;
                str = this.k1;
                str2 = "radio_streams";
            } else {
                fVar = this.X;
                str = this.k1;
                str2 = "live";
            }
            this.G0 = fVar.W0(str, str2);
            this.B0 = this.G0;
            ArrayList<c.h.a.i.f> arrayList2 = this.C0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.P2.C()));
            String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f28650k)));
            boolean zB = this.P2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.X.z1(null, str3) : null;
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f28650k).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.B0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "all_channels_with_cat";
            }
            for (int i2 = 0; i2 < this.B0.size(); i2++) {
                if (c.h.a.i.q.m.f(this.f28650k).equals("m3u")) {
                    if (this.B0.get(i2).e0().equals(string)) {
                        this.D2 = i2;
                    }
                } else if (this.B0.get(i2).Y().equals(string)) {
                    this.D2 = i2;
                }
                c.h.a.i.f fVar2 = new c.h.a.i.f();
                fVar2.u0(this.B0.get(i2).P());
                fVar2.t0(this.B0.get(i2).getName());
                fVar2.C0(this.B0.get(i2).Z());
                fVar2.B0(this.B0.get(i2).Y());
                fVar2.A0(this.B0.get(i2).X());
                fVar2.l0(this.B0.get(i2).I());
                fVar2.f0(this.B0.get(i2).f());
                fVar2.g0(this.B0.get(i2).g());
                fVar2.j0(this.B0.get(i2).D());
                fVar2.D0(this.B0.get(i2).a0());
                fVar2.k0(this.B0.get(i2).F());
                fVar2.E0(this.B0.get(i2).b0());
                fVar2.F0(this.B0.get(i2).d0());
                fVar2.h0(this.B0.get(i2).B());
                fVar2.z0(this.B0.get(i2).W());
                fVar2.p0(this.B0.get(i2).M());
                fVar2.i0(this.B0.get(i2).C());
                fVar2.G0(this.B0.get(i2).e0());
                if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayListZ1.size()) {
                            break;
                        }
                        if (this.B0.get(i2).I().equals(arrayListZ1.get(i3).a())) {
                            int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f28650k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f28650k)).longValue(), this.f28650k);
                            if (iZ != 0) {
                                iZ = 100 - iZ;
                            }
                            fVar2.v0(arrayListZ1.get(i3).m());
                            fVar2.m0(iZ);
                        } else {
                            i3++;
                        }
                    }
                }
                this.C0.add(fVar2);
            }
            return "all_channels_with_cat";
        } catch (Exception unused) {
            return "all_channels_with_cat";
        }
    }

    public final void S2() {
        n2 n2Var;
        try {
            if (!this.s2.booleanValue() || (n2Var = this.H3) == null) {
                return;
            }
            n2Var.b0();
        } catch (Exception unused) {
        }
    }

    public void T1() {
        e2();
        this.z2 = new h0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    @SuppressLint({"SetTextI18n"})
    public final void T2(ArrayList<c.h.a.i.f> arrayList) {
        c.h.a.k.e.a aVarF;
        String strValueOf;
        String str;
        String str2;
        String str3;
        if (arrayList == null || arrayList.size() <= 0 || this.Y1 >= arrayList.size()) {
            return;
        }
        int iS = c.h.a.h.n.e.S(arrayList.get(this.Y1).P());
        this.X2 = iS;
        if (!arrayList.get(this.Y1).g().equals(BuildConfig.FLAVOR)) {
            this.Y2 = arrayList.get(this.Y1).g();
        }
        int i2 = this.Y1;
        this.D2 = i2;
        String name = arrayList.get(i2).getName();
        int iR = c.h.a.h.n.e.R(arrayList.get(this.Y1).Y());
        String strI = arrayList.get(this.Y1).I();
        String strX = arrayList.get(this.Y1).X();
        arrayList.get(this.Y1).P();
        this.k2 = arrayList.get(this.Y1).e0();
        String strO0 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.h.a() + c.h.a.k.d.c.a.h.i());
        try {
            if (strX.equals(BuildConfig.FLAVOR) || strX.isEmpty()) {
                this.x.setImageDrawable(this.f28650k.getResources().getDrawable(R.drawable.logo_placeholder_white));
            } else {
                c.k.b.t.q(this.f28650k).l(strX).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(this.x);
            }
        } catch (Exception unused) {
            this.x.setImageDrawable(this.f28650k.getResources().getDrawable(R.drawable.logo_placeholder_white));
        }
        this.m2.setCurrentWindowIndex(this.Y1);
        SharedPreferences.Editor editor = this.K1;
        if (editor != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(arrayList.get(this.Y1).Y()));
            this.K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayList.get(this.Y1).e0()));
            this.K1.apply();
        }
        SharedPreferences.Editor editor2 = this.L1;
        if (editor2 != null) {
            editor2.putInt("currentlyPlayingVideoPosition", this.Y1);
            this.L1.apply();
        }
        SimpleDateFormat simpleDateFormat = this.l2;
        if (g2(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.f28650k))), this.h2.format(this.n2)) >= c.h.a.k.d.c.a.d.p() && (str2 = this.A1) != null && this.q1 != null && (!f28646g.equals(str2) || (this.A1 != null && (str3 = this.q1) != null && !f28647h.equals(str3)))) {
            this.s2 = Boolean.FALSE;
            this.m2.setVisibility(8);
            this.v.setVisibility(0);
            this.w.setText(strO0 + this.r + this.N1);
        }
        this.H1 = iR;
        this.G1 = strI;
        this.I1 = this.k2;
        if (this.j2.equals("m3u")) {
            aVarF = c.h.a.k.e.a.f();
            strValueOf = this.I1;
        } else {
            aVarF = c.h.a.k.e.a.f();
            strValueOf = String.valueOf(this.H1);
        }
        aVarF.q(strValueOf);
        this.m2.setTitle(iS + " - " + name);
        this.y3 = iS + " - " + name;
        this.m2.B();
        if (!f28645f) {
            if (this.m2.getFullScreenValue().booleanValue()) {
                f28645f = this.m2.getFullScreenValue().booleanValue();
            } else {
                f28645f = false;
            }
        }
        if (this.s2.booleanValue()) {
            if (this.j2.equals("m3u")) {
                this.L3 = Uri.parse(this.k2);
                this.m2.t(Boolean.valueOf(f28645f));
                str = this.k2;
            } else {
                this.L3 = Uri.parse(this.f28651l + iR + this.o0);
                this.m2.t(Boolean.valueOf(f28645f));
                str = this.f28651l + iR + ".m3u8";
            }
            this.x3 = String.valueOf(Uri.parse(str));
            D2();
            this.M3 = 0;
            this.O3 = false;
        }
        this.S1.removeCallbacksAndMessages(null);
        this.N = strI;
        this.O = strX;
        this.z3 = strX;
        this.m2.setCurrentEpgChannelID(strI);
        this.m2.setCurrentChannelLogo(this.O);
        s3(this.O);
        this.B2 = new m0(this, this.N, null).execute(new String[0]);
        ListView listView = this.Q;
        if (listView != null) {
            listView.requestFocus();
        }
        this.d2 = Boolean.TRUE;
    }

    public String U1() {
        c.h.a.i.q.f fVar;
        String str;
        String str2;
        try {
            this.q3 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.D0;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (this.B3.equals("true")) {
                fVar = this.X;
                str = this.Z2;
                str2 = "radio_streams";
            } else {
                fVar = this.X;
                str = this.Z2;
                str2 = "live";
            }
            this.D0 = fVar.W0(str, str2);
            ArrayList<c.h.a.i.f> arrayList2 = this.E0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.P2.C()));
            String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f28650k)));
            boolean zB = this.P2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.X.z1(null, str3) : null;
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f28650k).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.D0;
            if (arrayList3 != null && arrayList3.size() > 0) {
                for (int i2 = 0; i2 < this.D0.size(); i2++) {
                    if (c.h.a.i.q.m.f(this.f28650k).equals("m3u")) {
                        if (this.D0.get(i2).e0().equals(string)) {
                            this.q3 = i2;
                        }
                    } else if (this.D0.get(i2).Y().equals(string)) {
                        this.q3 = i2;
                    }
                    c.h.a.i.f fVar2 = new c.h.a.i.f();
                    fVar2.u0(this.D0.get(i2).P());
                    fVar2.t0(this.D0.get(i2).getName());
                    fVar2.C0(this.D0.get(i2).Z());
                    fVar2.B0(this.D0.get(i2).Y());
                    fVar2.A0(this.D0.get(i2).X());
                    fVar2.l0(this.D0.get(i2).I());
                    fVar2.f0(this.D0.get(i2).f());
                    fVar2.g0(this.D0.get(i2).g());
                    fVar2.j0(this.D0.get(i2).D());
                    fVar2.D0(this.D0.get(i2).a0());
                    fVar2.k0(this.D0.get(i2).F());
                    fVar2.E0(this.D0.get(i2).b0());
                    fVar2.F0(this.D0.get(i2).d0());
                    fVar2.h0(this.D0.get(i2).B());
                    fVar2.z0(this.D0.get(i2).W());
                    fVar2.p0(this.D0.get(i2).M());
                    fVar2.i0(this.D0.get(i2).C());
                    fVar2.G0(this.D0.get(i2).e0());
                    if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayListZ1.size()) {
                                break;
                            }
                            if (this.D0.get(i2).I().equals(arrayListZ1.get(i3).a())) {
                                int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f28650k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f28650k)).longValue(), this.f28650k);
                                if (iZ != 0) {
                                    iZ = 100 - iZ;
                                }
                                fVar2.v0(arrayListZ1.get(i3).m());
                                fVar2.m0(iZ);
                            } else {
                                i3++;
                            }
                        }
                    }
                    this.E0.add(fVar2);
                }
            }
            this.D0 = this.E0;
            return "all_channels_with_cat";
        } catch (Exception unused) {
            return "all_channels_with_cat";
        }
    }

    public final void U2() {
        int currentWindowIndex = this.m2.getCurrentWindowIndex();
        if (currentWindowIndex == 0) {
            this.m2.setCurrentWindowIndex(this.F0.size() - 1);
        } else {
            this.m2.setCurrentWindowIndex(currentWindowIndex - 1);
        }
    }

    public void V1() {
        e2();
        this.z2 = new g0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    public void V2() {
        try {
            n2 n2Var = this.H3;
            if (n2Var != null) {
                n2Var.g1();
                this.H3 = null;
                this.J3 = null;
            }
        } catch (Exception unused) {
        }
    }

    public void W1() {
        e2();
        this.z2 = new g0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "recently_watched");
    }

    public final void W2(String str, int i2, String str2, String str3) {
        c.h.a.i.q.a aVar;
        Context context = this.f28650k;
        if (context == null || this.Z == null || (aVar = this.J1) == null) {
            return;
        }
        aVar.o(i2, str, str3, str2, c.h.a.i.q.m.z(context));
        this.Z.notifyDataSetChanged();
        c.h.a.h.n.e.l0(this.f28650k, str2 + this.f28650k.getResources().getString(R.string.rem_fav));
    }

    public String X1() {
        try {
            this.D2 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.D0;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<c.h.a.i.f> arrayList2 = this.B0;
            if (arrayList2 != null && this.z0 != null) {
                arrayList2.clear();
                this.z0.clear();
            }
            ArrayList<c.h.a.i.f> arrayList3 = this.G0;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            ArrayList<c.h.a.i.f> arrayListG1 = this.X.g1();
            this.G0 = arrayListG1;
            this.B0 = arrayListG1;
            ArrayList<c.h.a.i.f> arrayList4 = this.C0;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.P2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f28650k)));
            boolean zB = this.P2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.X.z1(null, str) : null;
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f28650k).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList5 = this.B0;
            if (arrayList5 == null || arrayList5.size() <= 0) {
                return "all_channels_with_cat";
            }
            for (int i2 = 0; i2 < this.B0.size(); i2++) {
                if (c.h.a.i.q.m.f(this.f28650k).equals("m3u")) {
                    if (this.B0.get(i2).e0().equals(string)) {
                        this.D2 = i2;
                    }
                } else if (this.B0.get(i2).Y().equals(string)) {
                    this.D2 = i2;
                }
                c.h.a.i.f fVar = new c.h.a.i.f();
                fVar.u0(this.B0.get(i2).P());
                fVar.t0(this.B0.get(i2).getName());
                fVar.C0(this.B0.get(i2).Z());
                fVar.B0(this.B0.get(i2).Y());
                fVar.A0(this.B0.get(i2).X());
                fVar.l0(this.B0.get(i2).I());
                fVar.f0(this.B0.get(i2).f());
                fVar.g0(this.B0.get(i2).g());
                fVar.j0(this.B0.get(i2).D());
                fVar.D0(this.B0.get(i2).a0());
                fVar.k0(this.B0.get(i2).F());
                fVar.E0(this.B0.get(i2).b0());
                fVar.F0(this.B0.get(i2).d0());
                fVar.h0(this.B0.get(i2).B());
                fVar.z0(this.B0.get(i2).W());
                fVar.p0(this.B0.get(i2).M());
                fVar.i0(this.B0.get(i2).C());
                fVar.G0(this.B0.get(i2).e0());
                if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayListZ1.size()) {
                            break;
                        }
                        if (this.B0.get(i2).I().equals(arrayListZ1.get(i3).a())) {
                            int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f28650k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f28650k)).longValue(), this.f28650k);
                            if (iZ != 0) {
                                iZ = 100 - iZ;
                            }
                            fVar.v0(arrayListZ1.get(i3).m());
                            fVar.m0(iZ);
                        } else {
                            i3++;
                        }
                    }
                }
                this.C0.add(fVar);
            }
            this.D0 = this.C0;
            return "all_channels_with_cat";
        } catch (Exception unused) {
            return "all_channels_with_cat";
        }
    }

    public final void X2(String str, String str2) {
        c.h.a.i.q.f fVar;
        Context context = this.f28650k;
        if (context == null || this.Z == null || (fVar = this.X) == null) {
            return;
        }
        fVar.I0(str, c.h.a.i.q.m.z(context));
        this.Z.notifyDataSetChanged();
        c.h.a.h.n.e.l0(this.f28650k, str2 + this.f28650k.getResources().getString(R.string.rem_fav));
    }

    public final void Y1(int i2) {
        if (PlayerView.f24013b) {
            return;
        }
        h hVar = new h();
        this.Y3 = hVar;
        this.X3.postDelayed(hVar, i2);
    }

    @SuppressLint({"NewApi"})
    public void Y2(ArrayList<c.h.a.i.f> arrayList) {
        c.h.a.i.q.f fVar;
        String str;
        String str2;
        try {
            if (arrayList == null) {
                this.S = new ArrayList<>();
                c.h.a.k.b.u uVar = new c.h.a.k.b.u(this, this.S);
                this.Z = uVar;
                ListView listView = this.Q;
                if (listView != null) {
                    listView.setAdapter((ListAdapter) uVar);
                    return;
                }
                return;
            }
            this.J = false;
            this.U0.setVisibility(8);
            if (arrayList.size() == 0) {
                if (this.C2) {
                    TextView textView = this.U0;
                    if (textView != null) {
                        this.J = true;
                        textView.setFocusable(true);
                        this.U0.requestFocus();
                        this.U0.setVisibility(0);
                    }
                } else {
                    this.C2 = true;
                    ArrayList<c.h.a.i.f> arrayList2 = this.B0;
                    if (arrayList2 != null && this.z0 != null) {
                        arrayList2.clear();
                        this.z0.clear();
                    }
                    if (this.B3.equals("true")) {
                        fVar = this.X;
                        str = this.k1;
                        str2 = "radio_streams";
                    } else {
                        fVar = this.X;
                        str = this.k1;
                        str2 = "live";
                    }
                    this.B0 = fVar.W0(str, str2);
                    ArrayList<c.h.a.i.f> arrayList3 = this.B0;
                    if (arrayList3 == null || arrayList3.size() <= 0) {
                        TextView textView2 = this.U0;
                        if (textView2 != null) {
                            this.J = true;
                            textView2.setFocusable(true);
                            this.U0.requestFocus();
                            this.U0.setVisibility(0);
                        }
                    } else {
                        Y2(this.B0);
                    }
                }
            }
            Log.e("honey", "if part");
            c.h.a.k.b.u uVar2 = new c.h.a.k.b.u(this, arrayList);
            this.Z = uVar2;
            uVar2.f(this.U0);
            ListView listView2 = this.Q;
            if (listView2 != null) {
                listView2.setAdapter((ListAdapter) this.Z);
                int i2 = this.D2;
                if (i2 != 0) {
                    this.Q.setSelection(i2);
                }
                if (this.a3.booleanValue()) {
                    this.Q.requestFocus();
                    this.a3 = Boolean.FALSE;
                }
                this.Q.setOnItemSelectedListener(new a());
                this.Q.setOnItemClickListener(new b(arrayList));
                this.Q.setOnItemLongClickListener(new c());
            }
        } catch (Exception unused) {
        }
    }

    public void Z1(int i2) {
        if (PlayerView.f24013b) {
            return;
        }
        g gVar = new g();
        this.Y3 = gVar;
        this.X3.postDelayed(gVar, i2);
    }

    @SuppressLint({"NewApi"})
    public void Z2(ArrayList<c.h.a.i.f> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    ListView listView = this.R;
                    if (listView != null) {
                        listView.setVisibility(0);
                    }
                    this.J = false;
                    c.h.a.k.b.s sVar = new c.h.a.k.b.s(this, arrayList);
                    this.m3 = sVar;
                    ListView listView2 = this.R;
                    if (listView2 != null) {
                        listView2.setAdapter((ListAdapter) sVar);
                        this.R.setSelection(this.q3);
                        this.R.setOnItemClickListener(new d0(arrayList));
                        return;
                    }
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        LinearLayout linearLayout = this.V0;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        ListView listView3 = this.R;
        if (listView3 != null) {
            listView3.setVisibility(8);
        }
    }

    public void a2(int i2) {
        t tVar = new t();
        this.W3 = tVar;
        this.V3.postDelayed(tVar, i2);
    }

    public void a3(String str) {
        TextView textView = this.tv_channel_name;
        if (textView != null) {
            textView.setText(str);
            this.tv_channel_name.setSelected(true);
        }
    }

    public void b2() {
        B2();
        this.C2 = false;
        this.D2 = 0;
        AsyncTask asyncTask = this.A2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            ArrayList<c.h.a.i.e> arrayList = this.w0;
            if (arrayList != null && arrayList.size() > 0) {
                int size = this.q0;
                if (size == 0) {
                    size = this.w0.size();
                }
                this.q0 = size - 1;
                if (this.q0 != 0 || this.B0 == null) {
                    ArrayList<c.h.a.i.e> arrayList2 = this.w0;
                    if (arrayList2 == null || arrayList2.size() <= 0 || this.q0 >= this.w0.size()) {
                        return;
                    }
                    String strB = this.w0.get(this.q0).b();
                    String strC = this.w0.get(this.q0).c();
                    this.k1 = strB;
                    this.l1 = strC;
                    if (strB != null && !strB.equals(BuildConfig.FLAVOR) && this.k1.equals("-1")) {
                        V1();
                        return;
                    }
                    String str = this.k1;
                    if (str == null || str.equals(BuildConfig.FLAVOR) || !this.k1.equals("-6")) {
                        R1();
                        return;
                    } else {
                        W1();
                        return;
                    }
                }
                if (this.k1.equals("0")) {
                    return;
                }
                this.k1 = "0";
                this.l1 = this.f28650k.getResources().getString(R.string.all);
            }
            P1();
        }
    }

    public final void b3() {
        this.R2 = new k();
    }

    public String c2(String str) {
        ArrayList<c.h.a.i.e> arrayList = this.w0;
        if (arrayList != null && arrayList.size() > 0) {
            for (c.h.a.i.e eVar : this.w0) {
                if (eVar.b() != null && !eVar.b().isEmpty() && eVar.b().equalsIgnoreCase(str)) {
                    this.l1 = eVar.c();
                }
            }
        }
        return this.l1;
    }

    public final void c3() {
        String str;
        String str2;
        RecyclerView recyclerView;
        this.ll_player_header_footer.startAnimation(this.h3);
        this.ll_player_header_footer.setVisibility(8);
        this.rl_episodes_box.startAnimation(this.r3);
        this.rl_episodes_box.setVisibility(0);
        this.ll_pb_left_categories.setVisibility(0);
        this.recycler_view_left_sidebar.setVisibility(8);
        this.R.setVisibility(8);
        if (this.l3 != null && (recyclerView = this.recycler_view_left_sidebar) != null) {
            recyclerView.setAdapter(null);
        }
        String str3 = this.F3;
        if ((str3 != null && str3.equals("-1")) || (((str = this.F3) != null && str.equals("0")) || ((str2 = this.F3) != null && str2.equals("-6")))) {
            String str4 = this.F3;
            this.Y2 = str4;
            this.Z2 = str4;
        }
        this.l3 = new c.h.a.k.b.r(this.f28650k, this.Y2, "player", this.B3);
        this.Z2 = this.Y2;
        this.recycler_view_left_sidebar.setVisibility(0);
        T1();
        this.recycler_view_left_sidebar.setAdapter(this.l3);
        this.recycler_view_left_sidebar.setLayoutManager(this.n3);
    }

    public void d2(int i2, String str, String str2) {
        RecyclerView recyclerView = this.recycler_view_left_sidebar;
        if (recyclerView != null) {
            recyclerView.n1(i2);
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.d3(java.lang.String):java.util.HashMap");
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
        AsyncTask asyncTask = this.z2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            c.h.a.i.q.m.K(0, this.f28650k);
        } else {
            c.h.a.i.q.m.K(1, this.f28650k);
            this.z2.cancel(true);
        }
    }

    public void e3() {
        if (PlayerView.f24013b || this.ll_player_header_footer.getVisibility() != 8) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.g3);
        this.ll_player_header_footer.setVisibility(0);
    }

    public void f3() {
        if (PlayerView.f24013b || this.ll_player_header_footer.getVisibility() != 8) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.g3);
        this.ll_player_header_footer.setVisibility(0);
        if (this.ll_brightness.getVisibility() == 8) {
            this.ll_brightness.startAnimation(this.g3);
            this.ll_brightness.setVisibility(0);
        }
        if (this.tv_seek_left.getVisibility() == 8) {
            this.tv_seek_left.startAnimation(this.g3);
            this.tv_seek_left.setVisibility(0);
        }
        if (this.ll_pause_play.getVisibility() == 8) {
            this.ll_pause_play.startAnimation(this.g3);
            this.ll_pause_play.setVisibility(0);
        }
        if (this.tv_seek_right.getVisibility() == 8) {
            this.tv_seek_right.startAnimation(this.g3);
            this.tv_seek_right.setVisibility(0);
        }
        if (this.ll_volume.getVisibility() == 8) {
            this.ll_volume.startAnimation(this.g3);
            this.ll_volume.setVisibility(0);
        }
    }

    public void g3() {
        ProgressBar progressBar;
        if (!PlayerView.f24013b && f28645f && this.ll_player_header_footer.getVisibility() == 8) {
            Handler handler = this.S1;
            k kVar = null;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            s3(this.O);
            this.B2 = new m0(this, this.N, kVar).execute(new String[0]);
            this.ll_player_header_footer.startAnimation(this.g3);
            this.ll_player_header_footer.setVisibility(0);
            if (this.ll_brightness.getVisibility() == 8) {
                this.ll_brightness.startAnimation(this.g3);
                this.ll_brightness.setVisibility(0);
            }
            if (this.tv_seek_left.getVisibility() == 8) {
                this.tv_seek_left.startAnimation(this.g3);
                this.tv_seek_left.setVisibility(0);
            }
            if (this.ll_pause_play.getVisibility() == 8 && (progressBar = f28649j) != null && progressBar.getVisibility() != 0) {
                this.ll_pause_play.startAnimation(this.g3);
                this.ll_pause_play.setVisibility(0);
            }
            if (this.tv_seek_right.getVisibility() == 8) {
                this.tv_seek_right.startAnimation(this.g3);
                this.tv_seek_right.setVisibility(0);
            }
            if (this.ll_volume.getVisibility() == 8) {
                this.ll_volume.startAnimation(this.g3);
                this.ll_volume.setVisibility(0);
            }
        }
    }

    public void h2() {
        runOnUiThread(new c0());
    }

    public final void h3() {
        LinearLayout linearLayout = this.F;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public final void i2() {
        ImageView imageView = this.iv_play;
        imageView.setOnFocusChangeListener(new i0(imageView));
        ImageView imageView2 = this.iv_pause;
        imageView2.setOnFocusChangeListener(new i0(imageView2));
        ImageView imageView3 = this.iv_back;
        imageView3.setOnFocusChangeListener(new i0(imageView3));
        ImageView imageView4 = this.iv_audio_subtitle_track;
        imageView4.setOnFocusChangeListener(new i0(imageView4));
        ImageView imageView5 = this.iv_hp_play_from_beginning;
        imageView5.setOnFocusChangeListener(new i0(imageView5));
        LinearLayout linearLayout = this.ll_channels_list;
        linearLayout.setOnFocusChangeListener(new i0(linearLayout));
        LinearLayout linearLayout2 = this.ll_crop;
        linearLayout2.setOnFocusChangeListener(new i0(linearLayout2));
        LinearLayout linearLayout3 = this.ll_multi_screen;
        linearLayout3.setOnFocusChangeListener(new i0(linearLayout3));
        ImageView imageView6 = this.iv_back_episodes;
        imageView6.setOnFocusChangeListener(new i0(imageView6));
        ImageView imageView7 = this.iv_back_settings;
        imageView7.setOnFocusChangeListener(new i0(imageView7));
        ImageView imageView8 = this.iv_hp_lock;
        imageView8.setOnFocusChangeListener(new i0(imageView8));
        ImageView imageView9 = this.iv_hp_lock;
        imageView9.setOnFocusChangeListener(new i0(imageView9));
    }

    public final void i3() {
        ProgressBar progressBar = this.E;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public void j2(boolean z2) {
        f28645f = z2;
        String strK = c.h.a.i.q.m.k(this.f28650k);
        if (!c.h.a.i.q.m.l(this.f28650k).equals("default_native") && !new c.h.a.i.q.d(this.f28650k).d(strK)) {
            c.h.a.i.q.m.S("default_native", "default", this.f28650k);
        }
        String strL = c.h.a.i.q.m.l(this.f28650k);
        if (!z2 || strL == null || strL.equalsIgnoreCase("default_native")) {
            PlayerView playerView = this.m2;
            if (playerView != null) {
                playerView.t(Boolean.valueOf(f28645f));
            }
            if (c.h.a.h.n.a.G.booleanValue()) {
                Toolbar toolbar = this.S0;
                if (toolbar != null) {
                    toolbar.setVisibility(8);
                }
                findViewById(R.id.app_video_box).setOnClickListener(null);
                this.e1.setVisibility(8);
                this.f1.setVisibility(8);
                this.g1.setVisibility(8);
                this.h1.setVisibility(8);
                this.i1.setVisibility(8);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.j1.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.j1.setLayoutParams(layoutParams);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                this.c1.setVisibility(8);
                n2 n2Var = this.H3;
                ((n2Var == null || !n2Var.isPlaying()) ? this.f28652m : this.f28653n).requestFocus();
                return;
            }
            return;
        }
        V2();
        this.E2 = true;
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.j0 = sharedPreferences;
        int i2 = sharedPreferences.getInt("currentlyPlayingVideoPosition", 0);
        ArrayList<c.h.a.i.f> arrayListE = this.Z.e();
        this.Y1 = i2;
        if (arrayListE == null || arrayListE.size() <= 0 || this.Y1 >= arrayListE.size()) {
            ArrayList<c.h.a.i.f> arrayList = this.B0;
            if (arrayList != null && arrayList.size() > 0 && this.Y1 < this.B0.size()) {
                this.v2 = c.h.a.h.n.e.S(this.B0.get(this.Y1).Y());
                this.k2 = this.B0.get(this.Y1).e0();
                this.B0.get(this.Y1).getName();
            }
        } else {
            this.v2 = c.h.a.h.n.e.S(arrayListE.get(this.Y1).Y());
            this.k2 = arrayListE.get(this.Y1).e0();
        }
        this.L = this.v2;
        this.M = this.k2;
        f28645f = false;
        PlayerView playerView2 = this.m2;
        if (playerView2 != null) {
            playerView2.t(Boolean.FALSE);
        }
        if (this.j2.equals("m3u")) {
            if (this.s2.booleanValue()) {
                String strK2 = c.h.a.i.q.m.k(this.f28650k);
                Intent intent = new Intent(this.f28650k, (Class<?>) PlayExternalPlayerActivity.class);
                intent.putExtra("url", this.M);
                intent.putExtra("packagename", strL);
                intent.putExtra("app_name", strK2);
                this.f28650k.startActivity(intent);
                return;
            }
            return;
        }
        if (this.v2 == -1 || !this.s2.booleanValue()) {
            return;
        }
        String strG = c.h.a.h.n.e.G(this.f28650k, this.v2, this.o0, "live");
        String strK3 = c.h.a.i.q.m.k(this.f28650k);
        Intent intent2 = new Intent(this.f28650k, (Class<?>) PlayExternalPlayerActivity.class);
        intent2.putExtra("url", strG);
        intent2.putExtra("packagename", strL);
        intent2.putExtra("app_name", strK3);
        this.f28650k.startActivity(intent2);
    }

    public void j3() {
        if (this.ll_player_header_footer.getVisibility() == 8) {
            this.ll_screen_locked.startAnimation(this.b3);
            this.ll_screen_locked.setVisibility(0);
        }
    }

    public final void k3(Activity activity) {
        new l((NSTEXOPlayerSkyActivity) activity, activity).show();
    }

    public void l2() {
        c.h.a.i.q.a aVar;
        Context context;
        ArrayList<c.h.a.i.f> arrayList;
        try {
            String str = "live";
            if (this.j2.equals("m3u")) {
                new ArrayList();
                c.h.a.i.q.f fVar = this.X;
                if (fVar == null) {
                    return;
                }
                ArrayList<c.h.a.i.c> arrayListB1 = fVar.B1("live");
                arrayList = new ArrayList<>();
                ArrayList<String> arrayList2 = this.J0;
                if (arrayList2 != null && arrayList2.size() > 0 && arrayListB1 != null && arrayListB1.size() > 0) {
                    arrayListB1 = s2(arrayListB1, this.J0);
                }
                for (c.h.a.i.c cVar : arrayListB1) {
                    ArrayList<c.h.a.i.f> arrayListF1 = this.X.F1(cVar.a(), cVar.c());
                    if (arrayListF1 != null && arrayListF1.size() > 0) {
                        arrayList.add(arrayListF1.get(0));
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
            } else {
                new ArrayList();
                if (this.J1 == null) {
                    return;
                }
                if (this.B3.equals("true")) {
                    aVar = this.J1;
                    str = "radio_streams";
                    context = this.f28650k;
                } else {
                    aVar = this.J1;
                    context = this.f28650k;
                }
                ArrayList<c.h.a.i.b> arrayListP = aVar.p(str, c.h.a.i.q.m.z(context));
                arrayList = new ArrayList<>();
                ArrayList<String> arrayList3 = this.J0;
                if (arrayList3 != null && arrayList3.size() > 0 && arrayListP != null && arrayListP.size() > 0) {
                    arrayListP = r2(arrayListP, this.J0);
                }
                for (c.h.a.i.b bVar : arrayListP) {
                    c.h.a.i.f fVarD1 = new c.h.a.i.q.f(this.f28650k).D1(bVar.a(), String.valueOf(bVar.e()));
                    if (fVarD1 != null) {
                        arrayList.add(fVarD1);
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
            }
            this.S = arrayList;
        } catch (Exception unused) {
        }
    }

    public final void l3() {
        try {
            if (this.Z3 || !c.h.a.k.c.l.i0(this.J3)) {
                return;
            }
            this.Z3 = true;
            c.h.a.k.c.l.R(this.J3, new DialogInterface.OnDismissListener() { // from class: c.h.a.k.c.a
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f17761b.H2(dialogInterface);
                }
            }).J(getSupportFragmentManager(), null);
        } catch (Exception unused) {
        }
    }

    public String m2() {
        try {
            this.D2 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.B0;
            if (arrayList != null && this.z0 != null) {
                arrayList.clear();
                this.z0.clear();
            }
            this.S = new ArrayList<>();
            l2();
            this.B0 = this.S;
            ArrayList<c.h.a.i.f> arrayList2 = this.C0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.P2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f28650k)));
            boolean zB = this.P2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.X.z1(null, str) : null;
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f28650k).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.B0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "get_fav";
            }
            for (int i2 = 0; i2 < this.B0.size(); i2++) {
                if (c.h.a.i.q.m.f(this.f28650k).equals("m3u")) {
                    if (this.B0.get(i2).e0().equals(string)) {
                        this.D2 = i2;
                    }
                } else if (this.B0.get(i2).Y().equals(string)) {
                    this.D2 = i2;
                }
                c.h.a.i.f fVar = new c.h.a.i.f();
                fVar.u0(this.B0.get(i2).P());
                fVar.t0(this.B0.get(i2).getName());
                fVar.C0(this.B0.get(i2).Z());
                fVar.B0(this.B0.get(i2).Y());
                fVar.A0(this.B0.get(i2).X());
                fVar.l0(this.B0.get(i2).I());
                fVar.f0(this.B0.get(i2).f());
                fVar.g0(this.B0.get(i2).g());
                fVar.j0(this.B0.get(i2).D());
                fVar.D0(this.B0.get(i2).a0());
                fVar.k0(this.B0.get(i2).F());
                fVar.E0(this.B0.get(i2).b0());
                fVar.F0(this.B0.get(i2).d0());
                fVar.h0(this.B0.get(i2).B());
                fVar.z0(this.B0.get(i2).W());
                fVar.p0(this.B0.get(i2).M());
                fVar.i0(this.B0.get(i2).C());
                fVar.G0(this.B0.get(i2).e0());
                if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayListZ1.size()) {
                            break;
                        }
                        if (this.B0.get(i2).I().equals(arrayListZ1.get(i3).a())) {
                            int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f28650k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f28650k)).longValue(), this.f28650k);
                            if (iZ != 0) {
                                iZ = 100 - iZ;
                            }
                            fVar.v0(arrayListZ1.get(i3).m());
                            fVar.m0(iZ);
                        } else {
                            i3++;
                        }
                    }
                }
                this.C0.add(fVar);
            }
            return "get_fav";
        } catch (Exception unused) {
            return "get_fav";
        }
    }

    public final void m3() {
        ListView listView;
        try {
            if (c.h.a.h.n.a.G.booleanValue()) {
                findViewById(R.id.app_video_box).setOnClickListener(this);
            }
            this.e1.setVisibility(0);
            this.f1.setVisibility(0);
            this.g1.setVisibility(0);
            this.h1.setVisibility(0);
            this.i1.setVisibility(0);
            this.c1.setVisibility(0);
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.j1.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = 0;
            this.j1.setLayoutParams(layoutParams);
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            f28645f = false;
            if (this.Y0) {
                if (!this.Z0 || this.a1.equals(BuildConfig.FLAVOR)) {
                    SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
                    this.j0 = sharedPreferences;
                    this.Q.setSelection(sharedPreferences.getInt("currentlyPlayingVideoPosition", 0));
                    this.Y0 = false;
                    this.Z0 = false;
                } else {
                    String str = this.k1;
                    if (str != null && !str.equals(BuildConfig.FLAVOR) && this.k1.equals("0")) {
                        P1();
                    }
                }
                listView = this.Q;
                if (listView == null) {
                    return;
                }
            } else {
                listView = this.Q;
                if (listView == null) {
                    return;
                }
            }
            listView.requestFocus();
        } catch (Exception e2) {
            Log.e("exection", BuildConfig.FLAVOR + e2);
        }
    }

    public String n2() {
        boolean z2;
        try {
            this.q3 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.D0;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<c.h.a.i.f> arrayList2 = this.E0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            ArrayList<c.h.a.i.f> arrayList3 = new ArrayList<>();
            if (c.h.a.i.q.m.f(this.f28650k).equals("m3u")) {
                new ArrayList();
                ArrayList<c.h.a.i.c> arrayListB1 = this.X.B1("live");
                if (this.J0 != null) {
                    this.J0 = p2();
                }
                ArrayList<String> arrayList4 = this.J0;
                if (arrayList4 != null && arrayList4.size() > 0 && arrayListB1 != null && arrayListB1.size() > 0) {
                    arrayListB1 = s2(arrayListB1, this.J0);
                }
                for (c.h.a.i.c cVar : arrayListB1) {
                    ArrayList<c.h.a.i.f> arrayListF1 = this.X.F1(cVar.a(), cVar.c());
                    if (arrayListF1 != null && arrayListF1.size() > 0) {
                        arrayList3.add(arrayListF1.get(0));
                    }
                }
            } else {
                ArrayList<c.h.a.i.b> arrayList5 = new ArrayList<>();
                if (this.J1 != null) {
                    ArrayList<c.h.a.i.b> arrayListP = this.B3.equals("true") ? this.J1.p("radio_streams", c.h.a.i.q.m.z(this.f28650k)) : this.J1.p("live", c.h.a.i.q.m.z(this.f28650k));
                    ArrayList<String> arrayList6 = this.J0;
                    if (arrayList6 == null || arrayList6.size() <= 0 || arrayListP == null || arrayListP.size() <= 0) {
                        arrayList5 = arrayListP;
                    } else {
                        try {
                            for (c.h.a.i.b bVar : arrayListP) {
                                Iterator<String> it = this.J0.iterator();
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
                                    arrayList5.add(bVar);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    for (c.h.a.i.b bVar2 : arrayList5) {
                        c.h.a.i.f fVarD1 = new c.h.a.i.q.f(this.f28650k).D1(bVar2.a(), String.valueOf(bVar2.e()));
                        if (fVarD1 != null) {
                            arrayList3.add(fVarD1);
                        }
                    }
                }
            }
            if (arrayList3.size() != 0) {
                this.D0 = arrayList3;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.P2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f28650k)));
            boolean zB = this.P2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.X.z1(null, str) : null;
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f28650k).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList7 = this.D0;
            if (arrayList7 != null && arrayList7.size() > 0) {
                for (int i2 = 0; i2 < this.D0.size(); i2++) {
                    if (c.h.a.i.q.m.f(this.f28650k).equals("m3u")) {
                        if (this.D0.get(i2).e0().equals(string)) {
                            this.q3 = i2;
                        }
                    } else if (this.D0.get(i2).Y().equals(string)) {
                        this.q3 = i2;
                    }
                    c.h.a.i.f fVar = new c.h.a.i.f();
                    fVar.u0(this.D0.get(i2).P());
                    fVar.t0(this.D0.get(i2).getName());
                    fVar.C0(this.D0.get(i2).Z());
                    fVar.B0(this.D0.get(i2).Y());
                    fVar.A0(this.D0.get(i2).X());
                    fVar.l0(this.D0.get(i2).I());
                    fVar.f0(this.D0.get(i2).f());
                    fVar.g0(this.D0.get(i2).g());
                    fVar.j0(this.D0.get(i2).D());
                    fVar.D0(this.D0.get(i2).a0());
                    fVar.k0(this.D0.get(i2).F());
                    fVar.E0(this.D0.get(i2).b0());
                    fVar.F0(this.D0.get(i2).d0());
                    fVar.h0(this.D0.get(i2).B());
                    fVar.z0(this.D0.get(i2).W());
                    fVar.p0(this.D0.get(i2).M());
                    fVar.i0(this.D0.get(i2).C());
                    fVar.G0(this.D0.get(i2).e0());
                    if (zB && arrayListZ1 != null && arrayListZ1.size() > 0) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayListZ1.size()) {
                                break;
                            }
                            if (this.D0.get(i2).I().equals(arrayListZ1.get(i3).a())) {
                                int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f28650k)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f28650k)).longValue(), this.f28650k);
                                if (iZ != 0) {
                                    iZ = 100 - iZ;
                                }
                                fVar.v0(arrayListZ1.get(i3).m());
                                fVar.m0(iZ);
                            } else {
                                i3++;
                            }
                        }
                    }
                    this.E0.add(fVar);
                }
            }
            this.D0 = this.E0;
            return "get_fav";
        } catch (Exception unused2) {
            return "get_fav";
        }
    }

    public void n3() {
        Handler handler;
        if (PlayerView.f24013b || (handler = this.X3) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
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

    public void o3() {
        Handler handler = this.V3;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 101) {
            try {
                if (F2()) {
                    SharedPreferences sharedPreferences = getSharedPreferences("downloadStatus", 0);
                    f28644e = sharedPreferences;
                    String string = sharedPreferences.getString("downloadStatus", BuildConfig.FLAVOR);
                    c.h.a.h.n.e eVar = new c.h.a.h.n.e();
                    if (string.equals("processing")) {
                        eVar.h0(this);
                    } else {
                        eVar.k0(this, this.u2, this.o0, this.f28651l, this.L, this.M);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        RelativeLayout relativeLayout;
        try {
            n3();
            relativeLayout = this.rl_episodes_box;
        } catch (Exception unused) {
        }
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            this.rl_episodes_box.startAnimation(this.s3);
            this.rl_episodes_box.setVisibility(8);
            return;
        }
        if (this.rl_settings_box.getVisibility() == 0) {
            this.rl_settings_box.startAnimation(this.j3);
            this.rl_settings_box.setVisibility(8);
            return;
        }
        if (f28645f) {
            if (this.ll_player_header_footer.getVisibility() != 0) {
                Toolbar toolbar = this.S0;
                if (toolbar != null) {
                    toolbar.setVisibility(0);
                }
                m3();
                return;
            }
            this.ll_player_header_footer.startAnimation(this.h3);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.h3);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.h3);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.h3);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.h3);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.h3);
            }
            this.ll_player_header_footer.setVisibility(8);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.setVisibility(8);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.setVisibility(8);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.setVisibility(8);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.setVisibility(8);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.setVisibility(8);
                return;
            }
            return;
        }
        if (this.k3.equals("mobile") && this.t3 && this.D3) {
            try {
                L2();
            } catch (Exception unused2) {
                super.onBackPressed();
            }
        } else {
            super.onBackPressed();
        }
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04ce  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 1552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.onClick(android.view.View):void");
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        O1(configuration);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        f.e eVarT;
        f.d dVarW;
        this.f28650k = this;
        A2();
        super.onCreate(bundle);
        this.I3 = c.h.a.k.c.i.d(this);
        SharedPreferences sharedPreferences = getSharedPreferences("auto_start", 0);
        this.a4 = sharedPreferences;
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
        this.K3 = dVarW;
        SharedPreferences sharedPreferences2 = this.f28650k.getSharedPreferences("auto_start", 0);
        this.C3 = sharedPreferences2;
        boolean z3 = sharedPreferences2.getBoolean("picinpic", c.h.a.h.n.a.c0);
        this.D3 = z3;
        if (z3 && Build.VERSION.SDK_INT >= 26) {
            this.v3 = new PictureInPictureParams.Builder();
        }
        setContentView(R.layout.activity_exoplayer_sky);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        this.P2 = new c.h.a.k.d.a.a(this.f28650k);
        try {
            this.U2 = new u();
            this.T2 = c.f.a.c.d.u.b.e(this);
        } catch (Exception unused) {
        }
        E2();
        RelativeLayout relativeLayout = this.d1;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new x());
        }
        this.J0 = p2();
        String str = this.k1;
        this.F3 = str;
        if (str == null || str.equals(BuildConfig.FLAVOR) || !this.k1.equals("0")) {
            String str2 = this.k1;
            if (str2 == null || str2.equals(BuildConfig.FLAVOR) || !this.k1.equals("-1")) {
                String str3 = this.k1;
                if (str3 == null || str3.equals(BuildConfig.FLAVOR) || !this.k1.equals("-6")) {
                    R1();
                } else {
                    W1();
                }
            } else {
                V1();
            }
        } else {
            P1();
        }
        this.A2 = new f0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.S0.x(R.menu.menu_search);
        this.f2 = menu;
        this.g2 = menu.getItem(2).getSubMenu().findItem(R.id.empty);
        if (c.h.a.i.q.m.f(this.f28650k).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(R.id.menu_load_channels_vod1).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f28650k.getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.S0.getChildCount(); i2++) {
            if (this.S0.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.S0.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
        return true;
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            e2();
            this.P3 = true;
            V2();
            c.f.a.c.d.u.b.e(this.f28650k).c().e(this.R2, c.f.a.c.d.u.d.class);
        } catch (Exception unused) {
        }
    }

    @Override // a.b.k.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        boolean z2 = f28645f;
        if (z2) {
            if (i2 == 20) {
                this.s2.booleanValue();
                return true;
            }
            if (i2 == 19) {
                this.s2.booleanValue();
                return true;
            }
        }
        if (i2 == 166) {
            if (z2) {
                this.s2.booleanValue();
            }
            return true;
        }
        if (i2 != 167) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (z2) {
            this.s2.booleanValue();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        n2 n2Var;
        StringBuilder sb;
        keyEvent.getRepeatCount();
        if (i2 != 62) {
            if (i2 != 66) {
                if (i2 != 79) {
                    if (i2 == 82) {
                        Menu menu = this.f2;
                        if (menu != null) {
                            menu.performIdentifierAction(R.id.empty, 0);
                        }
                    } else if (i2 != 85 && i2 != 86 && i2 != 126 && i2 != 127) {
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
                                if (f28645f) {
                                    this.T1.removeCallbacksAndMessages(null);
                                    int i3 = 7;
                                    if (i2 == 7) {
                                        this.Z1.append(0);
                                    } else if (i2 == 8) {
                                        this.Z1.append(1);
                                    } else {
                                        if (i2 == 9) {
                                            sb = this.Z1;
                                            i3 = 2;
                                        } else if (i2 == 10) {
                                            sb = this.Z1;
                                            i3 = 3;
                                        } else if (i2 == 11) {
                                            sb = this.Z1;
                                            i3 = 4;
                                        } else if (i2 == 12) {
                                            sb = this.Z1;
                                            i3 = 5;
                                        } else if (i2 == 13) {
                                            sb = this.Z1;
                                            i3 = 6;
                                        } else if (i2 == 14) {
                                            sb = this.Z1;
                                        } else if (i2 == 15) {
                                            this.Z1.append(8);
                                        } else if (i2 == 16) {
                                            this.Z1.append(9);
                                        }
                                        sb.append(i3);
                                    }
                                    this.b2.setText(this.Z1.toString());
                                    this.a2.setVisibility(0);
                                    this.T1.postDelayed(new d(), 3000L);
                                }
                                return true;
                            default:
                                switch (i2) {
                                    case 20:
                                        boolean z2 = f28645f;
                                    case 19:
                                        return true;
                                    case 21:
                                    case 22:
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
            return true;
        }
        try {
            if (this.s2.booleanValue() && (n2Var = this.H3) != null) {
                if (n2Var == null || !n2Var.isPlaying()) {
                    S2();
                } else {
                    R2();
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // a.l.d.e, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", true);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        B2();
        this.g2 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f28650k) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(this.f28650k.getResources().getString(R.string.logout_title)).f(this.f28650k.getResources().getString(R.string.logout_message)).j(this.f28650k.getResources().getString(R.string.yes), new n()).g(this.f28650k.getResources().getString(R.string.no), new m()).n();
        }
        if (itemId == R.id.action_search) {
            SearchView searchView = (SearchView) a.i.r.j.b(menuItem);
            this.T0 = searchView;
            searchView.setQueryHint(this.f28650k.getResources().getString(R.string.search_channel));
            this.T0.setIconifiedByDefault(false);
            this.T0.setOnQueryTextListener(new o());
            return true;
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f28650k.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f28650k.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f28650k.getResources().getString(R.string.yes), new p());
            aVar.g(this.f28650k.getResources().getString(R.string.no), new q());
            aVar.n();
        }
        if (itemId == R.id.menu_sort) {
            k3(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.G3;
            if (thread != null && thread.isAlive()) {
                this.G3.interrupt();
            }
        } catch (Exception unused) {
        }
        this.P3 = true;
        try {
            c.f.a.c.d.u.b bVar = this.T2;
            if (bVar != null) {
                bVar.c().e(this.R2, c.f.a.c.d.u.d.class);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            if (z2) {
                PlayerView playerView = this.m2;
                if (playerView != null && playerView.C != null) {
                    playerView.setShowOrHideSubtitles("gone");
                    this.m2.C.setVisibility(8);
                }
                i iVar = new i();
                this.w3 = iVar;
                registerReceiver(iVar, new IntentFilter("media_control"));
                return;
            }
            f28645f = true;
            unregisterReceiver(this.w3);
            this.u3 = false;
            this.w3 = null;
            PlayerView playerView2 = this.m2;
            if (playerView2 == null || playerView2.C == null) {
                return;
            }
            playerView2.setShowOrHideSubtitles("visible");
            this.m2.C.setVisibility(0);
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity, a.i.h.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0) {
                F2();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                b.a aVar = new b.a(this, R.style.AlertDialogCustom);
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.permission_alertbox, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(R.id.btn_grant);
                Button button2 = (Button) viewInflate.findViewById(R.id.btn_cancel);
                button.setOnFocusChangeListener(new e.j(button, this));
                button2.setOnFocusChangeListener(new e.j(button2, this));
                button.setOnClickListener(new a0());
                button2.setOnClickListener(new b0());
                aVar.setView(viewInflate);
                this.q2 = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.q2.getWindow();
                window.getClass();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.q2.show();
                this.q2.getWindow().setAttributes(layoutParams);
                this.q2.setCancelable(false);
                this.q2.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        AppOpsManager appOpsManager;
        A2();
        super.onResume();
        this.P3 = false;
        Thread thread = this.G3;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new e0());
            this.G3 = thread2;
            thread2.start();
        }
        Context context = this.f28650k;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("auto_start", 0);
            this.C3 = sharedPreferences;
            boolean z2 = sharedPreferences.getBoolean("picinpic", c.h.a.h.n.a.c0);
            this.D3 = z2;
            if (z2 && this.k3.equals("mobile")) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 26) {
                    this.v3 = new PictureInPictureParams.Builder();
                }
                if (i2 >= 26) {
                    try {
                        if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.f28650k.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f28650k.getPackageName()) == 0) {
                            this.t3 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
            intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
            setIntent(intent);
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            if (!String.valueOf(getIntent().getIntExtra("OPENED_STREAM_ID", 0)).equals(c.h.a.i.q.m.f(this.f28650k).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR))) {
                this.x2 = getIntent().getStringExtra("OPENED_CAT_ID");
                this.l1 = getIntent().getStringExtra("OPENED_CAT_NAME");
                this.w2 = getIntent().getIntExtra("OPENED_STREAM_ID", 0);
                this.Y1 = getIntent().getIntExtra("VIDEO_NUM", 0);
                this.k1 = this.x2;
                this.k2 = getIntent().getStringExtra("VIDEO_URL");
                this.e2 = Boolean.FALSE;
                String str = this.k1;
                if (str == null || str.equals(BuildConfig.FLAVOR) || !this.k1.equals("0")) {
                    String str2 = this.k1;
                    if (str2 == null || str2.equals(BuildConfig.FLAVOR) || !this.k1.equals("-1")) {
                        String str3 = this.k1;
                        if (str3 == null || str3.equals(BuildConfig.FLAVOR) || !this.k1.equals("-6")) {
                            R1();
                        } else {
                            W1();
                        }
                    } else {
                        V1();
                    }
                } else {
                    P1();
                }
            }
        }
        c.h.a.h.n.e.g(this.f28650k);
        try {
            c.f.a.c.d.u.b bVar = this.T2;
            if (bVar != null) {
                bVar.c().a(this.R2, c.f.a.c.d.u.d.class);
            }
        } catch (Exception unused2) {
        }
        B2();
        if (!this.E2) {
            if (this.H3 == null) {
                D2();
                return;
            }
            return;
        }
        this.E2 = false;
        ArrayList<c.h.a.i.f> arrayList = this.B0;
        if (arrayList == null || arrayList.size() == 0) {
            c.h.a.h.n.a.G = Boolean.FALSE;
            P2();
        } else {
            T2(this.B0);
        }
        c.h.a.k.b.u uVar = this.Z;
        if (uVar != null) {
            uVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            c.f.a.c.d.u.b.e(this.f28650k).c().a(this.R2, c.f.a.c.d.u.d.class);
        } catch (Exception unused) {
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            this.P3 = true;
            V2();
            if (this.k3.equals("mobile") && !this.A3 && this.t3 && this.D3 && Build.VERSION.SDK_INT >= 21) {
                finishAndRemoveTask();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (this.k3.equals("mobile") && this.t3 && this.D3 && !this.A3 && !isInPictureInPictureMode()) {
            try {
                L2();
                this.u3 = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        A2();
        if (z2) {
            O1(getResources().getConfiguration());
        }
    }

    public final ArrayList<String> p2() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.X.d1(c.h.a.i.q.m.z(this.f28650k));
        this.L0 = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.J0.add(iVar.b());
                }
            }
        }
        return this.J0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int p3() {
        /*
            r6 = this;
            int r0 = r6.F2
            r1 = 1
            int r0 = r0 + r1
            r6.F2 = r0
            java.lang.String r0 = "loginPrefs"
            r2 = 0
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r0, r2)
            r6.H2 = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.I2 = r0
            int r0 = r6.F2
            int[] r3 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.f28648i
            int r4 = r3.length
            int r0 = r0 % r4
            r6.F2 = r0
            r0 = r3[r0]
            r6.G2 = r0
            r0 = 2131428290(0x7f0b03c2, float:1.847822E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3 = 2131427466(0x7f0b008a, float:1.847655E38)
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.google.android.exoplayer2.ui.PlayerView r4 = r6.m2
            int r5 = r6.G2
            r4.setResizeMode(r5)
            int r4 = r6.F2
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
            android.content.SharedPreferences$Editor r1 = r6.I2
            int r3 = r6.F2
            java.lang.String r4 = "aspect_ratio"
            r1.putInt(r4, r3)
            android.content.SharedPreferences$Editor r1 = r6.I2
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
            android.os.Handler r1 = r6.Q2
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.os.Handler r1 = r6.Q2
            com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity$r r2 = new com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity$r
            r2.<init>(r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r2, r3)
            int r0 = r6.G2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.p3():int");
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

    public void q3() {
        RelativeLayout relativeLayout;
        if (PlayerView.f24013b) {
            o3();
            if (this.ll_screen_locked.getVisibility() == 0) {
                y2();
                return;
            } else {
                j3();
                a2(3000);
                return;
            }
        }
        SeekBar seekBar = this.sb_volume;
        if (seekBar != null) {
            seekBar.setProgress(this.R3.getStreamVolume(3));
        }
        n3();
        if (this.rl_settings_box.getVisibility() == 0) {
            this.rl_settings_box.startAnimation(this.j3);
            relativeLayout = this.rl_settings_box;
        } else {
            if (this.rl_episodes_box.getVisibility() != 0) {
                if (this.ll_player_header_footer.getVisibility() == 0) {
                    v2();
                    return;
                } else {
                    g3();
                    Z1(5000);
                    return;
                }
            }
            this.rl_episodes_box.startAnimation(this.s3);
            relativeLayout = this.rl_episodes_box;
        }
        relativeLayout.setVisibility(8);
    }

    public final ArrayList<c.h.a.i.b> r2(ArrayList<c.h.a.i.b> arrayList, ArrayList<String> arrayList2) {
        try {
            this.O0 = new ArrayList<>();
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
                    this.O0.add(bVar);
                }
            }
        } catch (Exception unused) {
        }
        return this.O0;
    }

    public final void r3() {
        LinearLayout linearLayout = this.G;
        if (linearLayout != null) {
            linearLayout.setClickable(true);
            this.G.setOnTouchListener(new s());
        }
    }

    public final ArrayList<c.h.a.i.c> s2(ArrayList<c.h.a.i.c> arrayList, ArrayList<String> arrayList2) {
        this.P0 = new ArrayList<>();
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
                        this.P0.add(cVar);
                    }
                }
            }
            return this.P0;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: Exception -> 0x0046, TryCatch #1 {Exception -> 0x0046, blocks: (B:4:0x0008, B:6:0x0010, B:8:0x0014, B:9:0x0030, B:11:0x0034, B:13:0x0038), top: B:25:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s3(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 21
            r2 = 2131231551(0x7f08033f, float:1.8079186E38)
            if (r6 == 0) goto L30
            java.lang.String r3 = ""
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Exception -> L46
            if (r3 != 0) goto L30
            android.widget.ImageView r3 = r5.x     // Catch: java.lang.Exception -> L46
            if (r3 == 0) goto L5c
            android.content.Context r3 = r5.f28650k     // Catch: java.lang.Exception -> L46
            c.k.b.t r3 = c.k.b.t.q(r3)     // Catch: java.lang.Exception -> L46
            c.k.b.x r6 = r3.l(r6)     // Catch: java.lang.Exception -> L46
            r3 = 80
            r4 = 55
            c.k.b.x r6 = r6.k(r3, r4)     // Catch: java.lang.Exception -> L46
            c.k.b.x r6 = r6.j(r2)     // Catch: java.lang.Exception -> L46
            android.widget.ImageView r3 = r5.x     // Catch: java.lang.Exception -> L46
            r6.g(r3)     // Catch: java.lang.Exception -> L46
            goto L5c
        L30:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L46
            if (r6 < r1) goto L5c
            android.widget.ImageView r6 = r5.x     // Catch: java.lang.Exception -> L46
            if (r6 == 0) goto L5c
            android.content.Context r3 = r5.f28650k     // Catch: java.lang.Exception -> L46
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Exception -> L46
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r2, r0)     // Catch: java.lang.Exception -> L46
            r6.setImageDrawable(r3)     // Catch: java.lang.Exception -> L46
            goto L5c
        L46:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L5c
            android.widget.ImageView r6 = r5.x     // Catch: java.lang.Exception -> L5c
            if (r6 == 0) goto L5c
            android.content.Context r1 = r5.f28650k     // Catch: java.lang.Exception -> L5c
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L5c
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r2, r0)     // Catch: java.lang.Exception -> L5c
            r6.setImageDrawable(r0)     // Catch: java.lang.Exception -> L5c
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity.s3(java.lang.String):void");
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
        ProgressBar progressBar = this.D;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.y;
        if (textView != null) {
            textView.setText(this.f28650k.getResources().getString(R.string.now_program_found));
        }
        TextView textView2 = this.z;
        if (textView2 != null) {
            textView2.setText(BuildConfig.FLAVOR);
        }
        TextView textView3 = this.A;
        if (textView3 != null) {
            textView3.setText(this.f28650k.getResources().getString(R.string.next_program_found));
        }
        TextView textView4 = this.B;
        if (textView4 != null) {
            textView4.setText(BuildConfig.FLAVOR);
        }
    }

    public void t3(int i2, String str, int i3, int i4) {
        try {
            if (this.k3.equals("mobile") && this.t3 && this.D3) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new RemoteAction(Icon.createWithResource(this, i2), str, str, PendingIntent.getBroadcast(this, i4, new Intent("media_control").putExtra("control_type", i3), 0)));
                this.v3.setActions(arrayList);
                setPictureInPictureParams(this.v3.build());
            }
        } catch (Exception unused) {
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
            this.ll_player_header_footer.startAnimation(this.h3);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.h3);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.h3);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.h3);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.h3);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.h3);
            }
            this.ll_player_header_footer.setVisibility(8);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.setVisibility(8);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.setVisibility(8);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.setVisibility(8);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.setVisibility(8);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.setVisibility(8);
            }
        }
    }

    public void v2() {
        if (PlayerView.f24013b || this.ll_player_header_footer.getVisibility() != 0) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.h3);
        if (this.ll_brightness.getVisibility() == 0) {
            this.ll_brightness.startAnimation(this.h3);
        }
        if (this.tv_seek_left.getVisibility() == 0) {
            this.tv_seek_left.startAnimation(this.h3);
        }
        if (this.ll_pause_play.getVisibility() == 0) {
            this.ll_pause_play.startAnimation(this.h3);
        }
        if (this.tv_seek_right.getVisibility() == 0) {
            this.tv_seek_right.startAnimation(this.h3);
        }
        if (this.ll_volume.getVisibility() == 0) {
            this.ll_volume.startAnimation(this.h3);
        }
        this.ll_player_header_footer.setVisibility(8);
        if (this.ll_brightness.getVisibility() == 0) {
            this.ll_brightness.setVisibility(8);
        }
        if (this.tv_seek_left.getVisibility() == 0) {
            this.tv_seek_left.setVisibility(8);
        }
        if (this.ll_pause_play.getVisibility() == 0) {
            this.ll_pause_play.setVisibility(8);
        }
        if (this.tv_seek_right.getVisibility() == 0) {
            this.tv_seek_right.setVisibility(8);
        }
        if (this.ll_volume.getVisibility() == 0) {
            this.ll_volume.setVisibility(8);
        }
    }

    public final void w2() {
        LinearLayout linearLayout = this.F;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final void x2() {
        ProgressBar progressBar = this.E;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public void y2() {
        if (this.ll_screen_locked.getVisibility() == 0) {
            this.ll_screen_locked.startAnimation(this.c3);
            this.ll_screen_locked.setVisibility(8);
        }
    }

    public void z2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }
}
