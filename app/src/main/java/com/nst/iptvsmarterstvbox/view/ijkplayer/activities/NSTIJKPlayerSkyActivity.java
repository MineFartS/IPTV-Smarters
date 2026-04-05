package minefarts.iptvsmarters.view.ijkplayer.activities;

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
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Rational;
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
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
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
import c.h.a.h.n.e;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.pojo.ExternalPlayerModelClass;
import minefarts.iptvsmarters.model.pojo.XMLTVProgrammePojo;
import minefarts.iptvsmarters.view.activity.NewDashboardActivity;
import minefarts.iptvsmarters.view.activity.PlayExternalPlayerActivity;
import minefarts.iptvsmarters.view.activity.SettingsActivity;
import minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSky;
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
public class NSTIJKPlayerSkyActivity extends a.b.k.c implements SurfaceHolder.Callback, View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static SharedPreferences f29214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SharedPreferences f29215e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f29217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f29218h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static ProgressBar f29221k;
    public TextView A;
    public ArrayList<c.h.a.i.f> A0;
    public String A1;
    public AsyncTask A2;
    public String A3;
    public TextView B;
    public ArrayList<c.h.a.i.f> B0;
    public LinearLayout B1;
    public AsyncTask B2;
    public SharedPreferences B3;
    public TextView C;
    public ArrayList<c.h.a.i.f> C0;
    public LinearLayout C1;
    public boolean C2;
    public boolean C3;
    public LinearLayout D;
    public ArrayList<c.h.a.i.f> D0;
    public LinearLayout D1;
    public int D2;
    public c.h.a.i.q.g D3;
    public ProgressBar E;
    public ArrayList<c.h.a.i.f> E0;
    public LinearLayout E1;
    public boolean E2;
    public String E3;
    public ProgressBar F;
    public ArrayList<c.h.a.i.f> F0;
    public LinearLayout F1;
    public int F2;
    public Thread F3;
    public LinearLayout G;
    public ArrayList<c.h.a.i.f> G0;
    public String G1;
    public int G2;
    public NSTIJKPlayerSky.w G3;
    public ArrayList<c.h.a.i.f> H0;
    public int H1;
    public SharedPreferences H2;
    public ArrayList<c.h.a.i.f> I0;
    public Boolean I2;
    public c.h.a.i.q.a J1;
    public Boolean J2;
    public ArrayList<c.h.a.i.e> K0;
    public SharedPreferences.Editor K1;
    public Boolean K2;
    public int L;
    public ArrayList<c.h.a.i.q.i> L0;
    public SharedPreferences.Editor L1;
    public Boolean L2;
    public String M;
    public SharedPreferences M0;
    public TextView M1;
    public Boolean M2;
    public String N;
    public SharedPreferences.Editor N0;
    public String N1;
    public Boolean N2;
    public String O;
    public ArrayList<c.h.a.i.b> O0;
    public TextView O1;
    public c.h.a.k.d.a.a O2;
    public RelativeLayout P;
    public ArrayList<c.h.a.i.c> P0;
    public Handler P1;
    public Handler P2;
    public ListView Q;
    public RecyclerView Q0;
    public Handler Q1;
    public c.f.a.c.d.u.s<c.f.a.c.d.u.d> Q2;
    public ListView R;
    public ProgressBar R0;
    public Handler R1;
    public c.f.a.c.d.u.d R2;
    public ArrayList<c.h.a.i.f> S;
    public Toolbar S0;
    public Handler S1;
    public c.f.a.c.d.u.b S2;
    public SearchView T0;
    public Handler T1;
    public c.f.a.c.d.u.e T2;
    public TextView U0;
    public SharedPreferences.Editor U1;
    public Handler U2;
    public String V;
    public LinearLayout V0;
    public SharedPreferences.Editor V1;
    public ArrayList<ExternalPlayerModelClass> V2;
    public AppBarLayout W0;
    public SharedPreferences.Editor W1;
    public int W2;
    public c.h.a.i.q.f X;
    public TextView X1;
    public String X2;
    public SharedPreferences Y;
    public String Y2;
    public c.h.a.k.b.u Z;
    public Boolean Z2;
    public String a1;
    public LinearLayout a2;
    public Animation a3;
    public TextView b2;
    public Animation b3;
    public RelativeLayout c1;
    public Animation c3;

    @BindView
    public MediaRouteButton cast_button;
    public RelativeLayout d1;
    public Boolean d2;
    public Animation d3;
    public LinearLayout e1;
    public Boolean e2;
    public Animation e3;
    public SharedPreferences f0;
    public LinearLayout f1;
    public Menu f2;
    public Animation f3;

    @BindView
    public FrameLayout fl_sub_font_size;
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
    public String j3;
    public SharedPreferences k0;
    public String k2;
    public c.h.a.k.b.r k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f29222l;
    public SharedPreferences l0;
    public SimpleDateFormat l2;
    public c.h.a.k.b.s l3;

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
    public String f29223m;
    public SharedPreferences m0;
    public TextView m1;
    public NSTIJKPlayerSky m2;
    public LinearLayoutManager m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f29224n;
    public SimpleDateFormat n0;
    public TextView n1;
    public Date n2;
    public String n3;

    @BindView
    public TextView no_audio_track;

    @BindView
    public TextView no_subtitle_track;

    @BindView
    public TextView no_video_track;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f29225o;
    public String o0;
    public TextView o1;
    public String o2;
    public String o3;
    public ImageView p;
    public RelativeLayout p0;
    public TextView p1;
    public Boolean p2;
    public int p3;
    public ImageView q;
    public String q1;
    public a.b.k.b q2;
    public Animation q3;
    public View r;
    public TextView r0;
    public TextView r1;
    public String r2;
    public Animation r3;

    @BindView
    public RecyclerView recycler_view_left_sidebar;

    @BindView
    public RadioGroup rg_audio;

    @BindView
    public RadioGroup rg_subtitle;

    @BindView
    public RadioGroup rg_video;

    @BindView
    public RelativeLayout rl_episodes_box;

    @BindView
    public RelativeLayout rl_settings_box;
    public String s;
    public AppCompatImageView s0;
    public TextView s1;
    public Boolean s2;
    public boolean s3;

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
    public TextView tv_sub_font_size;

    @BindView
    public TextView tv_volume;
    public View u;
    public ArrayList<c.h.a.i.e> u0;
    public TextView u1;
    public String u2;
    public PictureInPictureParams.Builder u3;
    public ArrayList<c.h.a.i.e> v0;
    public TextView v1;
    public int v2;
    public BroadcastReceiver v3;
    public LinearLayout w;
    public ArrayList<c.h.a.i.e> w0;
    public TextView w1;
    public int w2;
    public String w3;
    public TextView x;
    public ArrayList<c.h.a.i.e> x0;
    public TextView x1;
    public String x2;
    public String x3;
    public ImageView y;
    public ArrayList<c.h.a.i.e> y0;
    public TextView y1;
    public Boolean y2;
    public String y3;
    public TextView z;
    public ArrayList<c.h.a.i.f> z0;
    public LinearLayout z1;
    public AsyncTask z2;
    public boolean z3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f29216f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f29219i = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f29220j = false;
    public boolean v = false;
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
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
            AsyncTask<String, Void, HashMap<String, ArrayList<String>>> asyncTaskExecute;
            if (NSTIJKPlayerSkyActivity.this.B2 != null && NSTIJKPlayerSkyActivity.this.B2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                NSTIJKPlayerSkyActivity.this.B2.cancel(true);
            }
            ArrayList<c.h.a.i.f> arrayListE = NSTIJKPlayerSkyActivity.this.Z.e();
            k kVar = null;
            if (arrayListE != null && arrayListE.size() > 0) {
                String strI = arrayListE.get(i2).I();
                NSTIJKPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                asyncTaskExecute = new e0(NSTIJKPlayerSkyActivity.this, strI, kVar).execute(new String[0]);
            } else {
                if (NSTIJKPlayerSkyActivity.this.B0 == null || NSTIJKPlayerSkyActivity.this.B0.size() <= 0) {
                    return;
                }
                String strI2 = ((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).I();
                NSTIJKPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                asyncTaskExecute = new e0(NSTIJKPlayerSkyActivity.this, strI2, kVar).execute(new String[0]);
            }
            nSTIJKPlayerSkyActivity.B2 = asyncTaskExecute;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class a0 extends AsyncTask<String, Void, Boolean> {
        public a0() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(NSTIJKPlayerSkyActivity.this.o2());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (NSTIJKPlayerSkyActivity.this.m2 != null) {
                NSTIJKPlayerSkyActivity.this.m2.setEPGHandler(NSTIJKPlayerSkyActivity.this.S1);
                NSTIJKPlayerSkyActivity.this.m2.setContext(NSTIJKPlayerSkyActivity.this.f29222l);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f29228b;

        public b(ArrayList arrayList) {
            this.f29228b = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
            try {
                if (NSTIJKPlayerSkyActivity.this.B2 != null && NSTIJKPlayerSkyActivity.this.B2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    NSTIJKPlayerSkyActivity.this.B2.cancel(true);
                }
                c.h.a.h.n.a.G = Boolean.TRUE;
                ArrayList<c.h.a.i.f> arrayListE = NSTIJKPlayerSkyActivity.this.Z.e();
                if (arrayListE == null || arrayListE.size() <= 0) {
                    if (NSTIJKPlayerSkyActivity.this.B0 == null || NSTIJKPlayerSkyActivity.this.B0.size() <= 0) {
                        return;
                    }
                    c.h.a.h.n.e.S(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).P());
                    String strI = ((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).I();
                    String strX = ((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).X();
                    String strE0 = ((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).e0();
                    if (NSTIJKPlayerSkyActivity.this.j2.equals("m3u")) {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = NSTIJKPlayerSkyActivity.this;
                        if (!nSTIJKPlayerSkyActivity2.I1.equals(((c.h.a.i.f) nSTIJKPlayerSkyActivity2.B0.get(i2)).e0())) {
                            NSTIJKPlayerSkyActivity.this.m2.setCurrentWindowIndex(i2);
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity3.W2 = c.h.a.h.n.e.S(((c.h.a.i.f) nSTIJKPlayerSkyActivity3.B0.get(i2)).P());
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity4.X2 = ((c.h.a.i.f) nSTIJKPlayerSkyActivity4.B0.get(i2)).g();
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity5.E3 = nSTIJKPlayerSkyActivity5.k1;
                            if (nSTIJKPlayerSkyActivity5.F0 != null) {
                                NSTIJKPlayerSkyActivity.this.F0.clear();
                                NSTIJKPlayerSkyActivity.this.F0.addAll(this.f29228b);
                            }
                            NSTIJKPlayerSkyActivity.this.m2.setTitle(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).P() + " - " + ((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).getName());
                            NSTIJKPlayerSkyActivity.this.x3 = ((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).P() + " - " + ((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).getName();
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity6.I1 = ((c.h.a.i.f) nSTIJKPlayerSkyActivity6.B0.get(i2)).e0();
                            c.h.a.k.e.a.f().q(NSTIJKPlayerSkyActivity.this.I1);
                            if (!NSTIJKPlayerSkyActivity.this.k1.equals("-1") && !NSTIJKPlayerSkyActivity.this.k1.equals("0") && !NSTIJKPlayerSkyActivity.this.k1.equals("-6")) {
                                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity7 = NSTIJKPlayerSkyActivity.this;
                                nSTIJKPlayerSkyActivity7.k1 = ((c.h.a.i.f) nSTIJKPlayerSkyActivity7.B0.get(i2)).g();
                                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity8 = NSTIJKPlayerSkyActivity.this;
                                nSTIJKPlayerSkyActivity8.l1 = ((c.h.a.i.f) nSTIJKPlayerSkyActivity8.B0.get(i2)).B();
                                if (NSTIJKPlayerSkyActivity.this.l1.isEmpty()) {
                                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity9 = NSTIJKPlayerSkyActivity.this;
                                    nSTIJKPlayerSkyActivity9.l1 = nSTIJKPlayerSkyActivity9.P1(nSTIJKPlayerSkyActivity9.k1);
                                }
                            }
                            NSTIJKPlayerSkyActivity.this.Y1 = i2;
                            NSTIJKPlayerSkyActivity.this.m2.Y0();
                            if (NSTIJKPlayerSkyActivity.this.s2.booleanValue()) {
                                NSTIJKPlayerSkyActivity.this.m2.e1(Uri.parse(strE0), NSTIJKPlayerSkyActivity.f29216f, ((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).getName());
                                NSTIJKPlayerSkyActivity.this.w3 = String.valueOf(Uri.parse(strE0));
                                NSTIJKPlayerSkyActivity.this.m2.J = 0;
                                NSTIJKPlayerSkyActivity.this.m2.L = false;
                                NSTIJKPlayerSkyActivity.this.m2.start();
                            }
                            NSTIJKPlayerSkyActivity.this.S1.removeCallbacksAndMessages(null);
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity10 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity10.N = strI;
                            nSTIJKPlayerSkyActivity10.O = strX;
                            nSTIJKPlayerSkyActivity10.y3 = strX;
                            NSTIJKPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTIJKPlayerSkyActivity.this.N);
                            NSTIJKPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTIJKPlayerSkyActivity.this.O);
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity11 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity11.T2(nSTIJKPlayerSkyActivity11.O);
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity12 = NSTIJKPlayerSkyActivity.this;
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity13 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity12.B2 = new e0(nSTIJKPlayerSkyActivity13, nSTIJKPlayerSkyActivity13.N, null).execute(new String[0]);
                            NSTIJKPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                            if (NSTIJKPlayerSkyActivity.this.K1 != null) {
                                NSTIJKPlayerSkyActivity.this.K1.putString("currentlyPlayingVideo", String.valueOf(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).Y()));
                                NSTIJKPlayerSkyActivity.this.K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).e0()));
                                NSTIJKPlayerSkyActivity.this.K1.apply();
                            }
                            if (NSTIJKPlayerSkyActivity.this.L1 != null) {
                                NSTIJKPlayerSkyActivity.this.L1.putInt("currentlyPlayingVideoPosition", i2);
                                NSTIJKPlayerSkyActivity.this.L1.apply();
                            }
                            nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity.Z.notifyDataSetChanged();
                            return;
                        }
                        NSTIJKPlayerSkyActivity.this.W1(true);
                    }
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity14 = NSTIJKPlayerSkyActivity.this;
                    if (nSTIJKPlayerSkyActivity14.H1 != c.h.a.h.n.e.R(((c.h.a.i.f) nSTIJKPlayerSkyActivity14.B0.get(i2)).Y())) {
                        NSTIJKPlayerSkyActivity.this.m2.setCurrentWindowIndex(i2);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity15 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity15.W2 = c.h.a.h.n.e.S(((c.h.a.i.f) nSTIJKPlayerSkyActivity15.B0.get(i2)).P());
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity16 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity16.X2 = ((c.h.a.i.f) nSTIJKPlayerSkyActivity16.B0.get(i2)).g();
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity17 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity17.E3 = nSTIJKPlayerSkyActivity17.k1;
                        if (nSTIJKPlayerSkyActivity17.F0 != null) {
                            NSTIJKPlayerSkyActivity.this.F0.clear();
                            NSTIJKPlayerSkyActivity.this.F0.addAll(this.f29228b);
                        }
                        NSTIJKPlayerSkyActivity.this.m2.setTitle(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).P() + " - " + ((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).getName());
                        NSTIJKPlayerSkyActivity.this.x3 = ((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).P() + " - " + ((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).getName();
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity18 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity18.H1 = c.h.a.h.n.e.R(((c.h.a.i.f) nSTIJKPlayerSkyActivity18.B0.get(i2)).Y());
                        c.h.a.k.e.a.f().q(String.valueOf(NSTIJKPlayerSkyActivity.this.H1));
                        if (!NSTIJKPlayerSkyActivity.this.k1.equals("-1") && !NSTIJKPlayerSkyActivity.this.k1.equals("0") && !NSTIJKPlayerSkyActivity.this.k1.equals("-6")) {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity19 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity19.k1 = ((c.h.a.i.f) nSTIJKPlayerSkyActivity19.B0.get(i2)).g();
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity20 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity20.l1 = ((c.h.a.i.f) nSTIJKPlayerSkyActivity20.B0.get(i2)).B();
                            if (NSTIJKPlayerSkyActivity.this.l1.isEmpty()) {
                                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity21 = NSTIJKPlayerSkyActivity.this;
                                nSTIJKPlayerSkyActivity21.l1 = nSTIJKPlayerSkyActivity21.P1(nSTIJKPlayerSkyActivity21.k1);
                            }
                        }
                        NSTIJKPlayerSkyActivity.this.Y1 = i2;
                        NSTIJKPlayerSkyActivity.this.m2.Y0();
                        if (NSTIJKPlayerSkyActivity.this.s2.booleanValue()) {
                            NSTIJKPlayerSkyActivity.this.m2.e1(Uri.parse(NSTIJKPlayerSkyActivity.this.f29223m + c.h.a.h.n.e.R(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).Y()) + NSTIJKPlayerSkyActivity.this.o0), NSTIJKPlayerSkyActivity.f29216f, ((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).getName());
                            NSTIJKPlayerSkyActivity.this.w3 = String.valueOf(Uri.parse(NSTIJKPlayerSkyActivity.this.f29223m + c.h.a.h.n.e.R(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).Y()) + ".m3u8"));
                            NSTIJKPlayerSkyActivity.this.m2.J = 0;
                            NSTIJKPlayerSkyActivity.this.m2.L = false;
                            NSTIJKPlayerSkyActivity.this.m2.start();
                        }
                        NSTIJKPlayerSkyActivity.this.S1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity22 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity22.N = strI;
                        nSTIJKPlayerSkyActivity22.O = strX;
                        nSTIJKPlayerSkyActivity22.y3 = strX;
                        NSTIJKPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTIJKPlayerSkyActivity.this.N);
                        NSTIJKPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTIJKPlayerSkyActivity.this.O);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity23 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity23.T2(nSTIJKPlayerSkyActivity23.O);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity24 = NSTIJKPlayerSkyActivity.this;
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity25 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity24.B2 = new e0(nSTIJKPlayerSkyActivity25, nSTIJKPlayerSkyActivity25.N, null).execute(new String[0]);
                        NSTIJKPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                        if (NSTIJKPlayerSkyActivity.this.K1 != null) {
                            NSTIJKPlayerSkyActivity.this.K1.putString("currentlyPlayingVideo", String.valueOf(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).Y()));
                            NSTIJKPlayerSkyActivity.this.K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).e0()));
                            NSTIJKPlayerSkyActivity.this.K1.apply();
                        }
                        if (NSTIJKPlayerSkyActivity.this.L1 != null) {
                            NSTIJKPlayerSkyActivity.this.L1.putInt("currentlyPlayingVideoPosition", i2);
                            NSTIJKPlayerSkyActivity.this.L1.apply();
                        }
                        nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity.Z.notifyDataSetChanged();
                        return;
                    }
                    NSTIJKPlayerSkyActivity.this.W1(true);
                }
                int iS = c.h.a.h.n.e.S(arrayListE.get(i2).P());
                String strI2 = arrayListE.get(i2).I();
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity26 = NSTIJKPlayerSkyActivity.this;
                nSTIJKPlayerSkyActivity26.b2(nSTIJKPlayerSkyActivity26.B0, iS);
                String strE02 = arrayListE.get(i2).e0();
                if (NSTIJKPlayerSkyActivity.this.j2.equals("m3u")) {
                    if (!NSTIJKPlayerSkyActivity.this.I1.equals(arrayListE.get(i2).e0())) {
                        NSTIJKPlayerSkyActivity.this.m2.setCurrentWindowIndex(i2);
                        NSTIJKPlayerSkyActivity.this.W2 = c.h.a.h.n.e.S(arrayListE.get(i2).P());
                        NSTIJKPlayerSkyActivity.this.X2 = arrayListE.get(i2).g();
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity27 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity27.E3 = nSTIJKPlayerSkyActivity27.k1;
                        if (nSTIJKPlayerSkyActivity27.F0 != null) {
                            NSTIJKPlayerSkyActivity.this.F0.clear();
                            NSTIJKPlayerSkyActivity.this.F0.addAll(this.f29228b);
                        }
                        NSTIJKPlayerSkyActivity.this.m2.setTitle(arrayListE.get(i2).P() + " - " + arrayListE.get(i2).getName());
                        NSTIJKPlayerSkyActivity.this.x3 = arrayListE.get(i2).P() + " - " + arrayListE.get(i2).getName();
                        NSTIJKPlayerSkyActivity.this.I1 = arrayListE.get(i2).e0();
                        c.h.a.k.e.a.f().q(NSTIJKPlayerSkyActivity.this.I1);
                        if (!NSTIJKPlayerSkyActivity.this.k1.equals("-1") && !NSTIJKPlayerSkyActivity.this.k1.equals("0") && !NSTIJKPlayerSkyActivity.this.k1.equals("-6")) {
                            NSTIJKPlayerSkyActivity.this.k1 = arrayListE.get(i2).g();
                            NSTIJKPlayerSkyActivity.this.l1 = arrayListE.get(i2).B();
                            if (NSTIJKPlayerSkyActivity.this.l1.isEmpty()) {
                                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity28 = NSTIJKPlayerSkyActivity.this;
                                nSTIJKPlayerSkyActivity28.l1 = nSTIJKPlayerSkyActivity28.P1(nSTIJKPlayerSkyActivity28.k1);
                            }
                        }
                        String strX2 = arrayListE.get(i2).X();
                        try {
                            if (strX2.equals(BuildConfig.FLAVOR) || strX2.isEmpty()) {
                                NSTIJKPlayerSkyActivity.this.y.setImageDrawable(NSTIJKPlayerSkyActivity.this.f29222l.getResources().getDrawable(R.drawable.logo_placeholder_white));
                            } else {
                                c.k.b.t.q(NSTIJKPlayerSkyActivity.this.f29222l).l(strX2).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(NSTIJKPlayerSkyActivity.this.y);
                            }
                        } catch (Exception unused) {
                            NSTIJKPlayerSkyActivity.this.y.setImageDrawable(NSTIJKPlayerSkyActivity.this.f29222l.getResources().getDrawable(R.drawable.logo_placeholder_white));
                        }
                        NSTIJKPlayerSkyActivity.this.S1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity29 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity29.N = strI2;
                        nSTIJKPlayerSkyActivity29.O = strX2;
                        nSTIJKPlayerSkyActivity29.y3 = strX2;
                        NSTIJKPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTIJKPlayerSkyActivity.this.N);
                        NSTIJKPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTIJKPlayerSkyActivity.this.O);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity30 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity30.T2(nSTIJKPlayerSkyActivity30.O);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity31 = NSTIJKPlayerSkyActivity.this;
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity32 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity31.B2 = new e0(nSTIJKPlayerSkyActivity32, nSTIJKPlayerSkyActivity32.N, null).execute(new String[0]);
                        NSTIJKPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyActivity.this.Y1 = i2;
                        NSTIJKPlayerSkyActivity.this.m2.Y0();
                        if (NSTIJKPlayerSkyActivity.this.s2.booleanValue()) {
                            NSTIJKPlayerSkyActivity.this.m2.e1(Uri.parse(strE02), NSTIJKPlayerSkyActivity.f29216f, arrayListE.get(i2).getName());
                            NSTIJKPlayerSkyActivity.this.w3 = String.valueOf(Uri.parse(strE02));
                            NSTIJKPlayerSkyActivity.this.m2.J = 0;
                            NSTIJKPlayerSkyActivity.this.m2.L = false;
                            NSTIJKPlayerSkyActivity.this.m2.start();
                        }
                        if (NSTIJKPlayerSkyActivity.this.K1 != null) {
                            NSTIJKPlayerSkyActivity.this.K1.putString("currentlyPlayingVideo", String.valueOf(arrayListE.get(i2).Y()));
                            NSTIJKPlayerSkyActivity.this.K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayListE.get(i2).e0()));
                            NSTIJKPlayerSkyActivity.this.K1.apply();
                        }
                        if (NSTIJKPlayerSkyActivity.this.L1 != null) {
                            NSTIJKPlayerSkyActivity.this.L1.putInt("currentlyPlayingVideoPosition", i2);
                            NSTIJKPlayerSkyActivity.this.L1.apply();
                        }
                        nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity.Z.notifyDataSetChanged();
                        return;
                    }
                    NSTIJKPlayerSkyActivity.this.W1(true);
                }
                if (NSTIJKPlayerSkyActivity.this.H1 != c.h.a.h.n.e.R(arrayListE.get(i2).Y())) {
                    NSTIJKPlayerSkyActivity.this.m2.setCurrentWindowIndex(i2);
                    NSTIJKPlayerSkyActivity.this.W2 = c.h.a.h.n.e.S(arrayListE.get(i2).P());
                    NSTIJKPlayerSkyActivity.this.X2 = arrayListE.get(i2).g();
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity33 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity33.E3 = nSTIJKPlayerSkyActivity33.k1;
                    if (nSTIJKPlayerSkyActivity33.F0 != null) {
                        NSTIJKPlayerSkyActivity.this.F0.clear();
                        NSTIJKPlayerSkyActivity.this.F0.addAll(this.f29228b);
                    }
                    NSTIJKPlayerSkyActivity.this.m2.setTitle(arrayListE.get(i2).P() + " - " + arrayListE.get(i2).getName());
                    NSTIJKPlayerSkyActivity.this.x3 = arrayListE.get(i2).P() + " - " + arrayListE.get(i2).getName();
                    NSTIJKPlayerSkyActivity.this.H1 = c.h.a.h.n.e.R(arrayListE.get(i2).Y());
                    c.h.a.k.e.a.f().q(String.valueOf(NSTIJKPlayerSkyActivity.this.H1));
                    if (!NSTIJKPlayerSkyActivity.this.k1.equals("-1") && !NSTIJKPlayerSkyActivity.this.k1.equals("0") && !NSTIJKPlayerSkyActivity.this.k1.equals("-6")) {
                        NSTIJKPlayerSkyActivity.this.k1 = arrayListE.get(i2).g();
                        NSTIJKPlayerSkyActivity.this.l1 = arrayListE.get(i2).B();
                        if (NSTIJKPlayerSkyActivity.this.l1.isEmpty()) {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity34 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity34.l1 = nSTIJKPlayerSkyActivity34.P1(nSTIJKPlayerSkyActivity34.k1);
                        }
                    }
                    String strX3 = arrayListE.get(i2).X();
                    try {
                        try {
                            if (strX3.equals(BuildConfig.FLAVOR) || strX3.isEmpty()) {
                                NSTIJKPlayerSkyActivity.this.y.setImageDrawable(NSTIJKPlayerSkyActivity.this.f29222l.getResources().getDrawable(R.drawable.logo_placeholder_white));
                            } else {
                                c.k.b.t.q(NSTIJKPlayerSkyActivity.this.f29222l).l(strX3).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(NSTIJKPlayerSkyActivity.this.y);
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        NSTIJKPlayerSkyActivity.this.y.setImageDrawable(NSTIJKPlayerSkyActivity.this.f29222l.getResources().getDrawable(R.drawable.logo_placeholder_white));
                    }
                    NSTIJKPlayerSkyActivity.this.S1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity35 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity35.N = strI2;
                    nSTIJKPlayerSkyActivity35.O = strX3;
                    nSTIJKPlayerSkyActivity35.y3 = strX3;
                    NSTIJKPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTIJKPlayerSkyActivity.this.N);
                    NSTIJKPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTIJKPlayerSkyActivity.this.O);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity36 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity36.T2(nSTIJKPlayerSkyActivity36.O);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity37 = NSTIJKPlayerSkyActivity.this;
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity38 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity37.B2 = new e0(nSTIJKPlayerSkyActivity38, nSTIJKPlayerSkyActivity38.N, null).execute(new String[0]);
                    NSTIJKPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyActivity.this.Y1 = i2;
                    NSTIJKPlayerSkyActivity.this.m2.Y0();
                    if (NSTIJKPlayerSkyActivity.this.s2.booleanValue()) {
                        NSTIJKPlayerSkyActivity.this.m2.e1(Uri.parse(NSTIJKPlayerSkyActivity.this.f29223m + c.h.a.h.n.e.R(arrayListE.get(i2).Y()) + NSTIJKPlayerSkyActivity.this.o0), NSTIJKPlayerSkyActivity.f29216f, arrayListE.get(i2).getName());
                        NSTIJKPlayerSkyActivity.this.w3 = String.valueOf(Uri.parse(NSTIJKPlayerSkyActivity.this.f29223m + c.h.a.h.n.e.R(arrayListE.get(i2).Y()) + ".m3u8"));
                        NSTIJKPlayerSkyActivity.this.m2.J = 0;
                        NSTIJKPlayerSkyActivity.this.m2.L = false;
                        NSTIJKPlayerSkyActivity.this.m2.start();
                    }
                    if (NSTIJKPlayerSkyActivity.this.K1 != null) {
                        NSTIJKPlayerSkyActivity.this.K1.putString("currentlyPlayingVideo", String.valueOf(arrayListE.get(i2).Y()));
                        NSTIJKPlayerSkyActivity.this.K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayListE.get(i2).e0()));
                        NSTIJKPlayerSkyActivity.this.K1.apply();
                    }
                    if (NSTIJKPlayerSkyActivity.this.L1 != null) {
                        NSTIJKPlayerSkyActivity.this.L1.putInt("currentlyPlayingVideoPosition", i2);
                        NSTIJKPlayerSkyActivity.this.L1.apply();
                    }
                    nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity.Z.notifyDataSetChanged();
                    return;
                }
                NSTIJKPlayerSkyActivity.this.W1(true);
            } catch (Exception unused4) {
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class b0 extends AsyncTask<String, Void, String> {
        public b0() {
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
                minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity r7 = minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.this     // Catch: java.lang.Exception -> L5d
                java.lang.String r7 = r7.L1()     // Catch: java.lang.Exception -> L5d
                return r7
            L48:
                minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity r7 = minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.this     // Catch: java.lang.Exception -> L5d
                java.lang.String r7 = r7.Z1()     // Catch: java.lang.Exception -> L5d
                return r7
            L4f:
                minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity r7 = minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.this     // Catch: java.lang.Exception -> L5d
                java.lang.String r7 = r7.G1()     // Catch: java.lang.Exception -> L5d
                return r7
            L56:
                minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity r7 = minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.this     // Catch: java.lang.Exception -> L5d
                java.lang.String r7 = r7.E1()     // Catch: java.lang.Exception -> L5d
                return r7
            L5d:
                java.lang.String r7 = "error"
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.b0.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTIJKPlayerSkyActivity.this.C0 != null) {
                    if (!NSTIJKPlayerSkyActivity.this.e2.booleanValue()) {
                        NSTIJKPlayerSkyActivity.this.e2 = Boolean.TRUE;
                        if (NSTIJKPlayerSkyActivity.this.C0.size() != 0) {
                            if (NSTIJKPlayerSkyActivity.this.F0 != null) {
                                NSTIJKPlayerSkyActivity.this.F0.clear();
                                NSTIJKPlayerSkyActivity.this.F0.addAll(NSTIJKPlayerSkyActivity.this.C0);
                            }
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity.z2(nSTIJKPlayerSkyActivity.C0);
                        } else {
                            c.h.a.h.n.a.G = Boolean.FALSE;
                            NSTIJKPlayerSkyActivity.this.x2();
                            NSTIJKPlayerSkyActivity.this.m2.setVisibility(8);
                            NSTIJKPlayerSkyActivity.this.w.setVisibility(0);
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity2.x.setText(nSTIJKPlayerSkyActivity2.getResources().getString(R.string.no_channel_found));
                        }
                    }
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = NSTIJKPlayerSkyActivity.this;
                    if (nSTIJKPlayerSkyActivity3.Y0 && nSTIJKPlayerSkyActivity3.Z0 && !nSTIJKPlayerSkyActivity3.a1.equals(BuildConfig.FLAVOR)) {
                        NSTIJKPlayerSkyActivity.this.D2 = 0;
                        try {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = NSTIJKPlayerSkyActivity.this;
                            nSTIJKPlayerSkyActivity4.D2 = nSTIJKPlayerSkyActivity4.b2(nSTIJKPlayerSkyActivity4.C0, c.h.a.h.n.e.S(NSTIJKPlayerSkyActivity.this.a1));
                        } catch (NumberFormatException | Exception unused) {
                        }
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity5.Y0 = false;
                        nSTIJKPlayerSkyActivity5.Z0 = false;
                    }
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity6.E2(nSTIJKPlayerSkyActivity6.C0);
                }
                NSTIJKPlayerSkyActivity.this.k2();
            } catch (Exception unused2) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            TextView textView;
            String string;
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
            super.onPreExecute();
            try {
                NSTIJKPlayerSkyActivity.this.O2();
                TextView textView2 = NSTIJKPlayerSkyActivity.this.U0;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = NSTIJKPlayerSkyActivity.this;
                if (nSTIJKPlayerSkyActivity2.r0 != null) {
                    if (!nSTIJKPlayerSkyActivity2.k1.equals(BuildConfig.FLAVOR) && NSTIJKPlayerSkyActivity.this.k1.equals("0")) {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity3.r0.setText(nSTIJKPlayerSkyActivity3.f29222l.getResources().getString(R.string.all));
                        nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                    } else if (!NSTIJKPlayerSkyActivity.this.k1.equals(BuildConfig.FLAVOR) && NSTIJKPlayerSkyActivity.this.k1.equals("-1")) {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity4.r0.setText(nSTIJKPlayerSkyActivity4.f29222l.getResources().getString(R.string.favourites));
                        nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                    } else if (NSTIJKPlayerSkyActivity.this.k1.equals(BuildConfig.FLAVOR) || !NSTIJKPlayerSkyActivity.this.k1.equals("-6")) {
                        if (NSTIJKPlayerSkyActivity.this.l1.equals(BuildConfig.FLAVOR)) {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = NSTIJKPlayerSkyActivity.this;
                            textView = nSTIJKPlayerSkyActivity5.r0;
                            string = nSTIJKPlayerSkyActivity5.getResources().getString(R.string.uncategories);
                        } else {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = NSTIJKPlayerSkyActivity.this;
                            textView = nSTIJKPlayerSkyActivity6.r0;
                            string = nSTIJKPlayerSkyActivity6.l1;
                        }
                        textView.setText(string);
                        nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                    } else {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity7 = NSTIJKPlayerSkyActivity.this;
                        nSTIJKPlayerSkyActivity7.r0.setText(nSTIJKPlayerSkyActivity7.f29222l.getResources().getString(R.string.recently_watched));
                        nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                    }
                    nSTIJKPlayerSkyActivity.r0.setSelected(true);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements AdapterView.OnItemLongClickListener {

        public class a implements PopupMenu.OnMenuItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f29232a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f29233b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f29234c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f29235d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f29236e;

            public a(String str, String str2, String str3, String str4, String str5) {
                this.f29232a = str;
                this.f29233b = str2;
                this.f29234c = str3;
                this.f29235d = str4;
                this.f29236e = str5;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
            
                r4 = r10.f29237f.f29231a;
                r4.E2 = true;
                r4.B2();
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            
                if (r10.f29237f.f29231a.j2.equals("m3u") == false) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                r4 = r10.f29237f.f29231a;
                r5 = r4.M;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
            
                r4.V = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
            
                r4 = r10.f29237f.f29231a;
                r5 = c.h.a.h.n.e.G(r4.f29222l, r4.L, r4.o0, "live");
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
            
                r4 = new android.content.Intent(r10.f29237f.f29231a.f29222l, (java.lang.Class<?>) minefarts.iptvsmarters.view.activity.PlayExternalPlayerActivity.class);
                r4.putExtra("url", r10.f29237f.f29231a.V);
                r4.putExtra("app_name", r10.f29237f.f29231a.V2.get(r3).a());
                r4.putExtra("packagename", r10.f29237f.f29231a.V2.get(r3).b());
                r10.f29237f.f29231a.f29222l.startActivity(r4);
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
                throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.c.a.onMenuItemClick(android.view.MenuItem):boolean");
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
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.c.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class c0 extends AsyncTask<String, Void, String> {
        public c0() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return NSTIJKPlayerSkyActivity.this.Y2.equals("-1") ? NSTIJKPlayerSkyActivity.this.a2() : NSTIJKPlayerSkyActivity.this.Y2.equals("-6") ? NSTIJKPlayerSkyActivity.this.L1() : NSTIJKPlayerSkyActivity.this.I1();
            } catch (Exception unused) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (NSTIJKPlayerSkyActivity.this.D0 != null) {
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity.F2(nSTIJKPlayerSkyActivity.D0);
                }
                NSTIJKPlayerSkyActivity.this.j2();
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            NSTIJKPlayerSkyActivity.this.N2();
            LinearLayout linearLayout = NSTIJKPlayerSkyActivity.this.V0;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (NSTIJKPlayerSkyActivity.this.R != null) {
                NSTIJKPlayerSkyActivity.this.R.setVisibility(8);
            }
        }
    }

    public class d implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyActivity.this.b2.setText(BuildConfig.FLAVOR);
                NSTIJKPlayerSkyActivity.this.a2.setVisibility(8);
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerSkyActivity.this.b2.setText(BuildConfig.FLAVOR);
                NSTIJKPlayerSkyActivity.this.a2.setVisibility(8);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<c.h.a.i.f> arrayListU1;
            Handler handler;
            Runnable bVar;
            boolean zD2;
            ArrayList<c.h.a.i.f> arrayListW0;
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
            nSTIJKPlayerSkyActivity.a1 = nSTIJKPlayerSkyActivity.Z1.toString();
            NSTIJKPlayerSkyActivity.this.b2.setText(BuildConfig.FLAVOR);
            NSTIJKPlayerSkyActivity.this.a2.setVisibility(8);
            if (NSTIJKPlayerSkyActivity.this.A3.equals("true")) {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = NSTIJKPlayerSkyActivity.this;
                arrayListU1 = nSTIJKPlayerSkyActivity2.X.u1(nSTIJKPlayerSkyActivity2.a1, "radio_streams");
            } else {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = NSTIJKPlayerSkyActivity.this;
                arrayListU1 = nSTIJKPlayerSkyActivity3.X.u1(nSTIJKPlayerSkyActivity3.a1, "live");
            }
            NSTIJKPlayerSkyActivity.this.Z1.setLength(0);
            if (arrayListU1 == null || arrayListU1.size() == 0) {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = NSTIJKPlayerSkyActivity.this;
                nSTIJKPlayerSkyActivity4.b2.setText(nSTIJKPlayerSkyActivity4.f29222l.getResources().getString(R.string.no_channel_found));
                NSTIJKPlayerSkyActivity.this.a2.setVisibility(0);
                handler = new Handler();
                bVar = new b();
            } else {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = NSTIJKPlayerSkyActivity.this;
                if (nSTIJKPlayerSkyActivity5.X.I1(c.h.a.i.q.m.z(nSTIJKPlayerSkyActivity5.f29222l)) <= 0 || NSTIJKPlayerSkyActivity.this.J0 == null) {
                    zD2 = false;
                } else {
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = NSTIJKPlayerSkyActivity.this;
                    zD2 = nSTIJKPlayerSkyActivity6.d2(arrayListU1, nSTIJKPlayerSkyActivity6.J0);
                }
                if (!zD2) {
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity7 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity7.Y0 = true;
                    nSTIJKPlayerSkyActivity7.Z0 = true;
                    nSTIJKPlayerSkyActivity7.k1 = "0";
                    nSTIJKPlayerSkyActivity7.l1 = nSTIJKPlayerSkyActivity7.f29222l.getResources().getString(R.string.all);
                    NSTIJKPlayerSkyActivity.this.q0 = 0;
                    String strP = arrayListU1.get(0).P();
                    String strY = arrayListU1.get(0).Y();
                    String name = arrayListU1.get(0).getName();
                    String strI = arrayListU1.get(0).I();
                    String strX = arrayListU1.get(0).X();
                    String strE0 = arrayListU1.get(0).e0();
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity8 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity8.I1 = strE0;
                    nSTIJKPlayerSkyActivity8.W2 = c.h.a.h.n.e.S(nSTIJKPlayerSkyActivity8.a1);
                    NSTIJKPlayerSkyActivity.this.X2 = "0";
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity9 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity9.E3 = nSTIJKPlayerSkyActivity9.k1;
                    nSTIJKPlayerSkyActivity9.m2.setTitle(NSTIJKPlayerSkyActivity.this.a1 + " - " + name);
                    NSTIJKPlayerSkyActivity.this.x3 = NSTIJKPlayerSkyActivity.this.a1 + " - " + name;
                    if (NSTIJKPlayerSkyActivity.this.A3.equals("true")) {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity10 = NSTIJKPlayerSkyActivity.this;
                        arrayListW0 = nSTIJKPlayerSkyActivity10.X.W0(nSTIJKPlayerSkyActivity10.k1, "radio_streams");
                    } else {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity11 = NSTIJKPlayerSkyActivity.this;
                        arrayListW0 = nSTIJKPlayerSkyActivity11.X.W0(nSTIJKPlayerSkyActivity11.k1, "live");
                    }
                    if (arrayListW0 != null) {
                        NSTIJKPlayerSkyActivity.this.B0.clear();
                    }
                    NSTIJKPlayerSkyActivity.this.B0 = arrayListW0;
                    if (NSTIJKPlayerSkyActivity.this.B0 != null && NSTIJKPlayerSkyActivity.this.B0.size() > 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= NSTIJKPlayerSkyActivity.this.B0.size()) {
                                break;
                            }
                            if (((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.B0.get(i2)).P().equals(strP)) {
                                NSTIJKPlayerSkyActivity.this.m2.setCurrentWindowIndex(i2);
                                break;
                            }
                            i2++;
                        }
                    }
                    try {
                        if (strX.equals(BuildConfig.FLAVOR) || strX.isEmpty()) {
                            NSTIJKPlayerSkyActivity.this.y.setImageDrawable(NSTIJKPlayerSkyActivity.this.f29222l.getResources().getDrawable(R.drawable.logo_placeholder_white));
                        } else {
                            c.k.b.t.q(NSTIJKPlayerSkyActivity.this.f29222l).l(strX).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).k(80, 55).g(NSTIJKPlayerSkyActivity.this.y);
                        }
                    } catch (Exception unused) {
                        NSTIJKPlayerSkyActivity.this.y.setImageDrawable(NSTIJKPlayerSkyActivity.this.f29222l.getResources().getDrawable(R.drawable.logo_placeholder_white));
                    }
                    NSTIJKPlayerSkyActivity.this.m2.Y0();
                    if (NSTIJKPlayerSkyActivity.this.s2.booleanValue()) {
                        if (NSTIJKPlayerSkyActivity.this.j2.equals("m3u")) {
                            NSTIJKPlayerSkyActivity.this.m2.e1(Uri.parse(strE0), NSTIJKPlayerSkyActivity.f29216f, name);
                            NSTIJKPlayerSkyActivity.this.w3 = String.valueOf(Uri.parse(strE0));
                            c.h.a.k.e.a.f().q(NSTIJKPlayerSkyActivity.this.I1);
                        } else {
                            NSTIJKPlayerSkyActivity.this.m2.e1(Uri.parse(NSTIJKPlayerSkyActivity.this.f29223m + c.h.a.h.n.e.R(strY) + NSTIJKPlayerSkyActivity.this.o0), NSTIJKPlayerSkyActivity.f29216f, name);
                            NSTIJKPlayerSkyActivity.this.w3 = String.valueOf(Uri.parse(NSTIJKPlayerSkyActivity.this.f29223m + c.h.a.h.n.e.R(strY) + ".m3u8"));
                            c.h.a.k.e.a.f().q(strY);
                        }
                        NSTIJKPlayerSkyActivity.this.m2.J = 0;
                        NSTIJKPlayerSkyActivity.this.m2.L = false;
                        NSTIJKPlayerSkyActivity.this.m2.start();
                    }
                    NSTIJKPlayerSkyActivity.this.S1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity12 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity12.N = strI;
                    nSTIJKPlayerSkyActivity12.O = strX;
                    nSTIJKPlayerSkyActivity12.y3 = strX;
                    NSTIJKPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTIJKPlayerSkyActivity.this.N);
                    NSTIJKPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTIJKPlayerSkyActivity.this.O);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity13 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity13.T2(nSTIJKPlayerSkyActivity13.O);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity14 = NSTIJKPlayerSkyActivity.this;
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity15 = NSTIJKPlayerSkyActivity.this;
                    nSTIJKPlayerSkyActivity14.B2 = new e0(nSTIJKPlayerSkyActivity15, nSTIJKPlayerSkyActivity15.N, null).execute(new String[0]);
                    NSTIJKPlayerSkyActivity.this.R1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyActivity.this.H1 = c.h.a.h.n.e.R(strY);
                    if (NSTIJKPlayerSkyActivity.this.K1 != null) {
                        NSTIJKPlayerSkyActivity.this.K1.putString("currentlyPlayingVideo", strY);
                        NSTIJKPlayerSkyActivity.this.K1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", strE0);
                        NSTIJKPlayerSkyActivity.this.K1.apply();
                    }
                    NSTIJKPlayerSkyActivity.this.Z.notifyDataSetChanged();
                    arrayListU1.clear();
                    return;
                }
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity16 = NSTIJKPlayerSkyActivity.this;
                nSTIJKPlayerSkyActivity16.b2.setText(nSTIJKPlayerSkyActivity16.f29222l.getResources().getString(R.string.no_channel_found));
                NSTIJKPlayerSkyActivity.this.a2.setVisibility(0);
                handler = new Handler();
                bVar = new a();
            }
            handler.postDelayed(bVar, 1000L);
        }
    }

    public class d0 implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f29243b;

        public d0(View view) {
            this.f29243b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29243b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29243b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29243b, "scaleY", f2);
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
                View view8 = this.f29243b;
                if (view8 == null || view8.getTag() == null || !this.f29243b.getTag().equals("1")) {
                    View view9 = this.f29243b;
                    if (view9 == null || view9.getTag() == null || !this.f29243b.getTag().equals("2")) {
                        View view10 = this.f29243b;
                        if (view10 == null || view10.getTag() == null || !this.f29243b.getTag().equals("3")) {
                            View view11 = this.f29243b;
                            if ((view11 != null && view11.getTag() != null && this.f29243b.getTag().equals("4")) || (((view5 = this.f29243b) != null && view5.getTag() != null && this.f29243b.getTag().equals("5")) || (((view6 = this.f29243b) != null && view6.getTag() != null && this.f29243b.getTag().equals("6")) || ((view7 = this.f29243b) != null && view7.getTag() != null && this.f29243b.getTag().equals("7"))))) {
                                view.setBackground(NSTIJKPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow_light));
                                return;
                            }
                            View view12 = this.f29243b;
                            if (view12 != null && view12.getTag() != null && this.f29243b.getTag().equals("8")) {
                                return;
                            }
                            View view13 = this.f29243b;
                            if (view13 == null || view13.getTag() == null || !this.f29243b.getTag().equals("9")) {
                                View view14 = this.f29243b;
                                if (view14 == null || view14.getTag() == null || !this.f29243b.getTag().equals("10")) {
                                    return;
                                }
                                view.setBackground(NSTIJKPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                                b(f2);
                                c(f2);
                                linearLayout2 = NSTIJKPlayerSkyActivity.this.ll_restart;
                            }
                        }
                        view.setBackground(NSTIJKPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                        b(f2);
                        c(f2);
                        return;
                    }
                    view.setBackground(NSTIJKPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                    b(f2);
                    c(f2);
                    linearLayout2 = NSTIJKPlayerSkyActivity.this.ll_audio_subtitle_settings;
                } else {
                    view.setBackground(NSTIJKPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                    b(f2);
                    c(f2);
                    linearLayout2 = NSTIJKPlayerSkyActivity.this.ll_back;
                }
                linearLayout2.setVisibility(0);
                return;
            }
            if (z) {
                return;
            }
            f2 = z ? 1.08f : 1.0f;
            View view15 = this.f29243b;
            if (view15 == null || view15.getTag() == null || !this.f29243b.getTag().equals("1")) {
                View view16 = this.f29243b;
                if (view16 == null || view16.getTag() == null || !this.f29243b.getTag().equals("2")) {
                    View view17 = this.f29243b;
                    if (view17 == null || view17.getTag() == null || !this.f29243b.getTag().equals("3")) {
                        View view18 = this.f29243b;
                        if ((view18 != null && view18.getTag() != null && this.f29243b.getTag().equals("4")) || (((view2 = this.f29243b) != null && view2.getTag() != null && this.f29243b.getTag().equals("5")) || (((view3 = this.f29243b) != null && view3.getTag() != null && this.f29243b.getTag().equals("6")) || ((view4 = this.f29243b) != null && view4.getTag() != null && this.f29243b.getTag().equals("7"))))) {
                            view.setBackground(null);
                            return;
                        }
                        View view19 = this.f29243b;
                        if (view19 != null && view19.getTag() != null && this.f29243b.getTag().equals("8")) {
                            return;
                        }
                        View view20 = this.f29243b;
                        if (view20 == null || view20.getTag() == null || !this.f29243b.getTag().equals("9")) {
                            View view21 = this.f29243b;
                            if (view21 == null || view21.getTag() == null || !this.f29243b.getTag().equals("10")) {
                                return;
                            }
                            view.setBackground(NSTIJKPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                            b(f2);
                            c(f2);
                            a(z);
                            linearLayout = NSTIJKPlayerSkyActivity.this.ll_restart;
                        }
                    }
                    view.setBackground(NSTIJKPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                    b(f2);
                    c(f2);
                    a(z);
                    return;
                }
                view.setBackground(NSTIJKPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                b(f2);
                c(f2);
                a(z);
                linearLayout = NSTIJKPlayerSkyActivity.this.ll_audio_subtitle_settings;
            } else {
                view.setBackground(NSTIJKPlayerSkyActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                b(f2);
                c(f2);
                a(z);
                linearLayout = NSTIJKPlayerSkyActivity.this.ll_back;
            }
            linearLayout.setVisibility(8);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f29245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f29247d;

        public e(String str, String str2, int i2) {
            this.f29245b = str;
            this.f29246c = str2;
            this.f29247d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
            String str;
            if (NSTIJKPlayerSkyActivity.this.j2.equals("m3u")) {
                NSTIJKPlayerSkyActivity.this.m2.e1(Uri.parse(this.f29245b), NSTIJKPlayerSkyActivity.f29216f, this.f29246c);
                nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                str = this.f29245b;
            } else {
                NSTIJKPlayerSkyActivity.this.m2.e1(Uri.parse(NSTIJKPlayerSkyActivity.this.f29223m + c.h.a.h.n.e.R(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.F0.get(this.f29247d)).Y()) + NSTIJKPlayerSkyActivity.this.o0), NSTIJKPlayerSkyActivity.f29216f, this.f29246c);
                nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                str = NSTIJKPlayerSkyActivity.this.f29223m + c.h.a.h.n.e.R(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.F0.get(this.f29247d)).Y()) + ".m3u8";
            }
            nSTIJKPlayerSkyActivity.w3 = String.valueOf(Uri.parse(str));
            NSTIJKPlayerSkyActivity.this.m2.J = 0;
            NSTIJKPlayerSkyActivity.this.m2.L = false;
            NSTIJKPlayerSkyActivity.this.m2.start();
            NSTIJKPlayerSkyActivity.this.S1.removeCallbacksAndMessages(null);
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = NSTIJKPlayerSkyActivity.this;
            nSTIJKPlayerSkyActivity2.N = ((c.h.a.i.f) nSTIJKPlayerSkyActivity2.F0.get(this.f29247d)).I();
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = NSTIJKPlayerSkyActivity.this;
            nSTIJKPlayerSkyActivity3.O = ((c.h.a.i.f) nSTIJKPlayerSkyActivity3.F0.get(this.f29247d)).X();
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = NSTIJKPlayerSkyActivity.this;
            nSTIJKPlayerSkyActivity4.y3 = nSTIJKPlayerSkyActivity4.O;
            NSTIJKPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTIJKPlayerSkyActivity.this.N);
            NSTIJKPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTIJKPlayerSkyActivity.this.O);
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = NSTIJKPlayerSkyActivity.this;
            nSTIJKPlayerSkyActivity5.T2(nSTIJKPlayerSkyActivity5.O);
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = NSTIJKPlayerSkyActivity.this;
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity7 = NSTIJKPlayerSkyActivity.this;
            nSTIJKPlayerSkyActivity6.B2 = new e0(nSTIJKPlayerSkyActivity7, nSTIJKPlayerSkyActivity7.N, null).execute(new String[0]);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class e0 extends AsyncTask<String, Void, HashMap<String, ArrayList<String>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f29249a;

        public e0(String str) {
            this.f29249a = str;
        }

        public /* synthetic */ e0(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity, String str, k kVar) {
            this(str);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap<String, ArrayList<String>> doInBackground(String... strArr) {
            try {
                return NSTIJKPlayerSkyActivity.this.K2(this.f29249a);
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
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.e0.onPostExecute(java.util.HashMap):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                NSTIJKPlayerSkyActivity.this.s2();
                LinearLayout linearLayout = NSTIJKPlayerSkyActivity.this.z1;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = NSTIJKPlayerSkyActivity.this.B1;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                LinearLayout linearLayout3 = NSTIJKPlayerSkyActivity.this.C1;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = NSTIJKPlayerSkyActivity.this.D1;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                LinearLayout linearLayout5 = NSTIJKPlayerSkyActivity.this.E1;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                LinearLayout linearLayout6 = NSTIJKPlayerSkyActivity.this.F1;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f29251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f29253d;

        public f(String str, String str2, int i2) {
            this.f29251b = str;
            this.f29252c = str2;
            this.f29253d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
            String str;
            if (NSTIJKPlayerSkyActivity.this.j2.equals("m3u")) {
                NSTIJKPlayerSkyActivity.this.m2.e1(Uri.parse(this.f29251b), NSTIJKPlayerSkyActivity.f29216f, this.f29252c);
                nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                str = this.f29251b;
            } else {
                NSTIJKPlayerSkyActivity.this.m2.e1(Uri.parse(NSTIJKPlayerSkyActivity.this.f29223m + c.h.a.h.n.e.R(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.F0.get(this.f29253d)).Y()) + NSTIJKPlayerSkyActivity.this.o0), NSTIJKPlayerSkyActivity.f29216f, this.f29252c);
                nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                str = NSTIJKPlayerSkyActivity.this.f29223m + c.h.a.h.n.e.R(((c.h.a.i.f) NSTIJKPlayerSkyActivity.this.F0.get(this.f29253d)).Y()) + ".m3u8";
            }
            nSTIJKPlayerSkyActivity.w3 = String.valueOf(Uri.parse(str));
            NSTIJKPlayerSkyActivity.this.m2.J = 0;
            NSTIJKPlayerSkyActivity.this.m2.L = false;
            NSTIJKPlayerSkyActivity.this.m2.start();
            NSTIJKPlayerSkyActivity.this.S1.removeCallbacksAndMessages(null);
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = NSTIJKPlayerSkyActivity.this;
            nSTIJKPlayerSkyActivity2.N = ((c.h.a.i.f) nSTIJKPlayerSkyActivity2.F0.get(this.f29253d)).I();
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = NSTIJKPlayerSkyActivity.this;
            nSTIJKPlayerSkyActivity3.O = ((c.h.a.i.f) nSTIJKPlayerSkyActivity3.F0.get(this.f29253d)).X();
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = NSTIJKPlayerSkyActivity.this;
            nSTIJKPlayerSkyActivity4.y3 = nSTIJKPlayerSkyActivity4.O;
            NSTIJKPlayerSkyActivity.this.m2.setCurrentEpgChannelID(NSTIJKPlayerSkyActivity.this.N);
            NSTIJKPlayerSkyActivity.this.m2.setCurrentChannelLogo(NSTIJKPlayerSkyActivity.this.O);
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = NSTIJKPlayerSkyActivity.this;
            nSTIJKPlayerSkyActivity5.T2(nSTIJKPlayerSkyActivity5.O);
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = NSTIJKPlayerSkyActivity.this;
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity7 = NSTIJKPlayerSkyActivity.this;
            nSTIJKPlayerSkyActivity6.B2 = new e0(nSTIJKPlayerSkyActivity7, nSTIJKPlayerSkyActivity7.N, null).execute(new String[0]);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyActivity.this.i2();
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyActivity.this.h2();
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
                NSTIJKPlayerSkyActivity.this.m2.start();
                if (Build.VERSION.SDK_INT >= 26) {
                    NSTIJKPlayerSkyActivity.this.V2(R.drawable.hplib_ic_pause, "pause", 2, 2);
                    return;
                }
                return;
            }
            if (intExtra != 2) {
                return;
            }
            NSTIJKPlayerSkyActivity.this.m2.pause();
            if (Build.VERSION.SDK_INT >= 26) {
                NSTIJKPlayerSkyActivity.this.V2(R.drawable.hp_play, "play", 1, 1);
            }
        }
    }

    public class j extends NSTIJKPlayerSky.w {
        public j() {
        }

        @Override // minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSky.w
        public void a() {
            NSTIJKPlayerSkyActivity.this.V2(R.drawable.hplib_ic_pause, "pause", 2, 2);
        }

        @Override // minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSky.w
        public void b() {
            NSTIJKPlayerSkyActivity.this.V2(R.drawable.hp_play, "play", 1, 1);
        }
    }

    public class k implements c.f.a.c.d.u.s<c.f.a.c.d.u.d> {
        public k() {
        }

        public final void a(c.f.a.c.d.u.d dVar) {
            NSTIJKPlayerSkyActivity.this.R2 = dVar;
            try {
                c.f.a.c.d.l lVar = new c.f.a.c.d.l(1);
                lVar.N("com.google.android.gms.cast.metadata.TITLE", NSTIJKPlayerSkyActivity.this.x3);
                lVar.b(new c.f.a.c.f.p.a(Uri.parse(NSTIJKPlayerSkyActivity.this.y3)));
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                c.h.a.h.m.a.b(nSTIJKPlayerSkyActivity.U2, nSTIJKPlayerSkyActivity.R2.p(), NSTIJKPlayerSkyActivity.this.w3, lVar, NSTIJKPlayerSkyActivity.this.f29222l);
            } catch (Exception unused) {
            }
            NSTIJKPlayerSkyActivity.this.invalidateOptionsMenu();
        }

        public final void b() {
            NSTIJKPlayerSkyActivity.this.invalidateOptionsMenu();
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
            NSTIJKPlayerSkyActivity.this.R2 = dVar;
            if (NSTIJKPlayerSkyActivity.this.R2 != null) {
                if (NSTIJKPlayerSkyActivity.this.m2 != null) {
                    NSTIJKPlayerSkyActivity.this.m2.pause();
                }
                LinearLayout linearLayout = NSTIJKPlayerSkyActivity.this.ll_casting_to_tv;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                if (nSTIJKPlayerSkyActivity.tv_casting_status_text != null) {
                    if (nSTIJKPlayerSkyActivity.R2.o() == null || NSTIJKPlayerSkyActivity.this.R2.o().J() == null) {
                        textView = NSTIJKPlayerSkyActivity.this.tv_casting_status_text;
                        sb = new StringBuilder();
                        string = NSTIJKPlayerSkyActivity.this.getResources().getString(R.string.connecting_please_wait);
                    } else {
                        textView = NSTIJKPlayerSkyActivity.this.tv_casting_status_text;
                        sb = new StringBuilder();
                        sb.append(NSTIJKPlayerSkyActivity.this.getResources().getString(R.string.connecting_to));
                        sb.append(" ");
                        string = NSTIJKPlayerSkyActivity.this.R2.o().J();
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

    public class l extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f29260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f29261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f29262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f29263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f29264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f29265g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f29266h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f29268b;

            public a(View view) {
                this.f29268b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f29268b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f29268b.getTag().equals("1")) {
                        View view3 = this.f29268b;
                        if (view3 == null || view3.getTag() == null || !this.f29268b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = l.this.f29264f;
                    }
                    linearLayout = l.this.f29263e;
                } else {
                    View view4 = this.f29268b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f29268b.getTag().equals("1")) {
                        View view5 = this.f29268b;
                        if (view5 == null || view5.getTag() == null || !this.f29268b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = l.this.f29264f;
                    }
                    linearLayout = l.this.f29263e;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Activity activity, Activity activity2) {
            super(activity);
            this.f29266h = activity2;
            this.f29260b = activity;
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
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.l.onClick(android.view.View):void");
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
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.l.onCreate(android.os.Bundle):void");
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

    public class n implements DialogInterface.OnClickListener {
        public n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(NSTIJKPlayerSkyActivity.this.f29222l);
        }
    }

    public class o implements SearchView.l {
        public o() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
            if (nSTIJKPlayerSkyActivity.I) {
                nSTIJKPlayerSkyActivity.I = false;
                return false;
            }
            nSTIJKPlayerSkyActivity.U0.setVisibility(8);
            c.h.a.k.b.u uVar = NSTIJKPlayerSkyActivity.this.Z;
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
            NSTIJKPlayerSkyActivity.this.B2();
            c.h.a.h.n.e.N(NSTIJKPlayerSkyActivity.this.f29222l);
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

    public class r implements c.f.a.c.d.u.e {
        public r() {
        }
    }

    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyActivity.this.W1(true);
        }
    }

    public class t implements View.OnClickListener {
        public t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(NSTIJKPlayerSkyActivity.this.f29222l);
        }
    }

    public class u implements View.OnClickListener {
        public u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyActivity.this.onBackPressed();
        }
    }

    public class v implements View.OnClickListener {
        public v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                NSTIJKPlayerSkyActivity.this.p2 = Boolean.TRUE;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", NSTIJKPlayerSkyActivity.this.getPackageName(), null));
                NSTIJKPlayerSkyActivity.this.startActivityForResult(intent, 101);
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = NSTIJKPlayerSkyActivity.this;
                Toast.makeText(nSTIJKPlayerSkyActivity, nSTIJKPlayerSkyActivity.f29222l.getResources().getString(R.string.grant_the_permission), 1).show();
            } catch (Exception unused) {
            }
            NSTIJKPlayerSkyActivity.this.q2.dismiss();
        }
    }

    public class w implements View.OnClickListener {
        public w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyActivity.this.q2.dismiss();
        }
    }

    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(NSTIJKPlayerSkyActivity.this.f29222l);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = NSTIJKPlayerSkyActivity.this.O1;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = NSTIJKPlayerSkyActivity.this.M1;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class y implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f29282b;

        public y(ArrayList arrayList) {
            this.f29282b = arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:161:0x0bc5  */
        @Override // android.widget.AdapterView.OnItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemClick(android.widget.AdapterView<?> r18, android.view.View r19, int r20, long r21) {
            /*
                Method dump skipped, instruction units count: 3151
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.y.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    NSTIJKPlayerSkyActivity.this.U1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public NSTIJKPlayerSkyActivity() {
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
        this.G2 = f29219i[0];
        this.I2 = bool;
        this.J2 = bool;
        this.K2 = bool;
        this.L2 = bool;
        this.M2 = bool;
        this.N2 = bool;
        this.W2 = 0;
        this.X2 = "0";
        this.Y2 = "0";
        this.Z2 = bool2;
        this.j3 = "mobile";
        this.n3 = "0";
        this.o3 = "0";
        this.p3 = 0;
        this.s3 = false;
        this.t3 = false;
        this.w3 = BuildConfig.FLAVOR;
        this.x3 = BuildConfig.FLAVOR;
        this.y3 = BuildConfig.FLAVOR;
        this.z3 = false;
        this.A3 = "false";
        this.C3 = c.h.a.h.n.a.c0;
        this.E3 = "-10";
        this.F3 = null;
        this.G3 = new j();
    }

    public static boolean S1() {
        ProgressBar progressBar = f29221k;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public static long T1(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String X1(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    public final void A1(String str, int i2, String str2, String str3, String str4) {
        if (this.f29222l == null || this.Z == null || this.J1 == null) {
            return;
        }
        c.h.a.i.b bVar = new c.h.a.i.b();
        bVar.h(str);
        bVar.m(i2);
        bVar.l(str3);
        bVar.k(str2);
        bVar.o(c.h.a.i.q.m.z(this.f29222l));
        this.J1.i(bVar, str4);
        this.Z.notifyDataSetChanged();
        c.h.a.h.n.e.l0(this.f29222l, str2 + this.f29222l.getResources().getString(R.string.add_fav));
    }

    public final void A2() {
        int currentWindowIndex = this.m2.getCurrentWindowIndex();
        if (currentWindowIndex == 0) {
            this.m2.setCurrentWindowIndex(this.F0.size() - 1);
        } else {
            this.m2.setCurrentWindowIndex(currentWindowIndex - 1);
        }
    }

    public final void B1(String str, String str2, String str3) {
        if (this.f29222l == null || this.Z == null || this.X == null) {
            return;
        }
        c.h.a.i.c cVar = new c.h.a.i.c();
        cVar.h(str2);
        cVar.i(c.h.a.i.q.m.z(this.f29222l));
        cVar.g(str3);
        cVar.e(str);
        this.X.Q(cVar);
        this.Z.notifyDataSetChanged();
        c.h.a.h.n.e.l0(this.f29222l, str3 + this.f29222l.getResources().getString(R.string.add_fav));
    }

    public void B2() {
        try {
            NSTIJKPlayerSky nSTIJKPlayerSky = this.m2;
            if (nSTIJKPlayerSky != null) {
                if (nSTIJKPlayerSky.T0()) {
                    this.m2.M0();
                } else {
                    this.m2.m1();
                    this.m2.W0(true);
                    this.m2.j1();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused) {
        }
    }

    public final void C1(Configuration configuration) {
        NSTIJKPlayerSky nSTIJKPlayerSky;
        boolean z2;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            nSTIJKPlayerSky = this.m2;
            z2 = false;
        } else {
            decorView.setSystemUiVisibility(256);
            nSTIJKPlayerSky = this.m2;
            z2 = true;
        }
        nSTIJKPlayerSky.setAdjustViewBounds(z2);
    }

    public final void C2(String str, int i2, String str2, String str3) {
        c.h.a.i.q.a aVar;
        Context context = this.f29222l;
        if (context == null || this.Z == null || (aVar = this.J1) == null) {
            return;
        }
        aVar.o(i2, str, str3, str2, c.h.a.i.q.m.z(context));
        this.Z.notifyDataSetChanged();
        c.h.a.h.n.e.l0(this.f29222l, str2 + this.f29222l.getResources().getString(R.string.rem_fav));
    }

    public void D1() {
        R1();
        this.z2 = new b0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    public final void D2(String str, String str2) {
        c.h.a.i.q.f fVar;
        Context context = this.f29222l;
        if (context == null || this.Z == null || (fVar = this.X) == null) {
            return;
        }
        fVar.I0(str, c.h.a.i.q.m.z(context));
        this.Z.notifyDataSetChanged();
        c.h.a.h.n.e.l0(this.f29222l, str2 + this.f29222l.getResources().getString(R.string.rem_fav));
    }

    public String E1() {
        c.h.a.i.q.f fVar;
        String str;
        try {
            this.D2 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.B0;
            if (arrayList != null && this.z0 != null) {
                arrayList.clear();
                this.z0.clear();
            }
            if (this.A3.equals("true")) {
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
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.O2.C()));
            String str2 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f29222l)));
            boolean zB = this.O2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.X.z1(null, str2) : null;
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f29222l).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.B0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "all_channels";
            }
            for (int i2 = 0; i2 < this.B0.size(); i2++) {
                if (c.h.a.i.q.m.f(this.f29222l).equals("m3u")) {
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
                            int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f29222l)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f29222l)).longValue(), this.f29222l);
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

    @SuppressLint({"NewApi"})
    public void E2(ArrayList<c.h.a.i.f> arrayList) {
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
                    if (this.A3.equals("true")) {
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
                        E2(this.B0);
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
                if (this.Z2.booleanValue()) {
                    this.Q.requestFocus();
                    this.Z2 = Boolean.FALSE;
                }
                this.Q.setOnItemSelectedListener(new a());
                this.Q.setOnItemClickListener(new b(arrayList));
                this.Q.setOnItemLongClickListener(new c());
            }
        } catch (Exception unused) {
        }
    }

    public void F1() {
        R1();
        this.z2 = new b0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    @SuppressLint({"NewApi"})
    public void F2(ArrayList<c.h.a.i.f> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    ListView listView = this.R;
                    if (listView != null) {
                        listView.setVisibility(0);
                    }
                    this.J = false;
                    c.h.a.k.b.s sVar = new c.h.a.k.b.s(this, arrayList);
                    this.l3 = sVar;
                    ListView listView2 = this.R;
                    if (listView2 != null) {
                        listView2.setAdapter((ListAdapter) sVar);
                        this.R.setSelection(this.p3);
                        this.R.setOnItemClickListener(new y(arrayList));
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

    public String G1() {
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
            if (this.A3.equals("true")) {
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
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.O2.C()));
            String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f29222l)));
            boolean zB = this.O2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.X.z1(null, str3) : null;
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f29222l).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.B0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "all_channels_with_cat";
            }
            for (int i2 = 0; i2 < this.B0.size(); i2++) {
                if (c.h.a.i.q.m.f(this.f29222l).equals("m3u")) {
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
                            int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f29222l)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f29222l)).longValue(), this.f29222l);
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

    public void G2(String str) {
        TextView textView = this.tv_channel_name;
        if (textView != null) {
            textView.setText(str);
            this.tv_channel_name.setSelected(true);
        }
    }

    public void H1() {
        R1();
        this.z2 = new c0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    public final void H2() {
        this.Q2 = new k();
    }

    public String I1() {
        c.h.a.i.q.f fVar;
        String str;
        String str2;
        try {
            this.p3 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.D0;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (this.A3.equals("true")) {
                fVar = this.X;
                str = this.Y2;
                str2 = "radio_streams";
            } else {
                fVar = this.X;
                str = this.Y2;
                str2 = "live";
            }
            this.D0 = fVar.W0(str, str2);
            ArrayList<c.h.a.i.f> arrayList2 = this.E0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.O2.C()));
            String str3 = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f29222l)));
            boolean zB = this.O2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.X.z1(null, str3) : null;
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f29222l).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.D0;
            if (arrayList3 != null && arrayList3.size() > 0) {
                for (int i2 = 0; i2 < this.D0.size(); i2++) {
                    if (c.h.a.i.q.m.f(this.f29222l).equals("m3u")) {
                        if (this.D0.get(i2).e0().equals(string)) {
                            this.p3 = i2;
                        }
                    } else if (this.D0.get(i2).Y().equals(string)) {
                        this.p3 = i2;
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
                                int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f29222l)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f29222l)).longValue(), this.f29222l);
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

    public void J1() {
        R1();
        this.z2 = new b0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    public final void J2() {
        String str;
        String str2;
        RecyclerView recyclerView;
        this.ll_player_header_footer.startAnimation(this.g3);
        this.ll_player_header_footer.setVisibility(8);
        this.rl_episodes_box.startAnimation(this.q3);
        this.rl_episodes_box.setVisibility(0);
        this.ll_pb_left_categories.setVisibility(0);
        this.recycler_view_left_sidebar.setVisibility(8);
        this.R.setVisibility(8);
        if (this.k3 != null && (recyclerView = this.recycler_view_left_sidebar) != null) {
            recyclerView.setAdapter(null);
        }
        String str3 = this.E3;
        if ((str3 != null && str3.equals("-1")) || (((str = this.E3) != null && str.equals("0")) || ((str2 = this.E3) != null && str2.equals("-6")))) {
            String str4 = this.E3;
            this.X2 = str4;
            this.Y2 = str4;
        }
        this.k3 = new c.h.a.k.b.r(this.f29222l, this.X2, "player", this.A3);
        this.Y2 = this.X2;
        this.recycler_view_left_sidebar.setVisibility(0);
        H1();
        this.recycler_view_left_sidebar.setAdapter(this.k3);
        this.recycler_view_left_sidebar.setLayoutManager(this.m3);
    }

    public void K1() {
        R1();
        this.z2 = new b0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "recently_watched");
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
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> K2(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.K2(java.lang.String):java.util.HashMap");
    }

    public String L1() {
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
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.O2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f29222l)));
            boolean zB = this.O2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.X.z1(null, str) : null;
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f29222l).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList5 = this.B0;
            if (arrayList5 == null || arrayList5.size() <= 0) {
                return "all_channels_with_cat";
            }
            for (int i2 = 0; i2 < this.B0.size(); i2++) {
                if (c.h.a.i.q.m.f(this.f29222l).equals("m3u")) {
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
                            int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f29222l)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f29222l)).longValue(), this.f29222l);
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

    public void L2() {
        if (f29220j || this.ll_player_header_footer.getVisibility() != 8) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.f3);
        this.ll_player_header_footer.setVisibility(0);
    }

    public final void M1(int i2) {
        if (f29220j) {
            return;
        }
        this.m2.d1 = new h();
        NSTIJKPlayerSky nSTIJKPlayerSky = this.m2;
        nSTIJKPlayerSky.c1.postDelayed(nSTIJKPlayerSky.d1, i2);
    }

    public void M2() {
        if (f29220j || this.ll_player_header_footer.getVisibility() != 8) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.f3);
        this.ll_player_header_footer.setVisibility(0);
        if (this.ll_brightness.getVisibility() == 8) {
            this.ll_brightness.startAnimation(this.f3);
            this.ll_brightness.setVisibility(0);
        }
        if (this.tv_seek_left.getVisibility() == 8) {
            this.tv_seek_left.startAnimation(this.f3);
            this.tv_seek_left.setVisibility(0);
        }
        if (this.ll_pause_play.getVisibility() == 8) {
            this.ll_pause_play.startAnimation(this.f3);
            this.ll_pause_play.setVisibility(0);
        }
        if (this.tv_seek_right.getVisibility() == 8) {
            this.tv_seek_right.startAnimation(this.f3);
            this.tv_seek_right.setVisibility(0);
        }
        if (this.ll_volume.getVisibility() == 8) {
            this.ll_volume.startAnimation(this.f3);
            this.ll_volume.setVisibility(0);
        }
    }

    public void N1(int i2) {
        if (f29220j) {
            return;
        }
        this.m2.d1 = new g();
        NSTIJKPlayerSky nSTIJKPlayerSky = this.m2;
        nSTIJKPlayerSky.c1.postDelayed(nSTIJKPlayerSky.d1, i2);
    }

    public final void N2() {
        LinearLayout linearLayout = this.G;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public void O1() {
        n2();
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
                        J1();
                        return;
                    }
                    String str = this.k1;
                    if (str == null || str.equals(BuildConfig.FLAVOR) || !this.k1.equals("-6")) {
                        F1();
                        return;
                    } else {
                        K1();
                        return;
                    }
                }
                if (this.k1.equals("0")) {
                    return;
                }
                this.k1 = "0";
                this.l1 = this.f29222l.getResources().getString(R.string.all);
            }
            D1();
        }
    }

    public final void O2() {
        ProgressBar progressBar = this.F;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public String P1(String str) {
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

    public final void P2() {
        if (this.rl_settings_box.getVisibility() == 8) {
            this.rl_settings_box.startAnimation(this.h3);
            this.rl_settings_box.setVisibility(0);
            this.iv_back_settings.requestFocus();
        }
    }

    public void Q1(int i2, String str, String str2) {
        RecyclerView recyclerView = this.recycler_view_left_sidebar;
        if (recyclerView != null) {
            recyclerView.n1(i2);
        }
    }

    public final void Q2(Activity activity) {
        new l((NSTIJKPlayerSkyActivity) activity, activity).show();
    }

    public final void R1() {
        AsyncTask asyncTask = this.z2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            c.h.a.i.q.m.K(0, this.f29222l);
        } else {
            c.h.a.i.q.m.K(1, this.f29222l);
            this.z2.cancel(true);
        }
    }

    public final void R2() {
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
            f29216f = false;
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
                        D1();
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

    public void S2() {
        Handler handler;
        if (f29220j || (handler = this.m2.c1) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: Exception -> 0x0046, TryCatch #1 {Exception -> 0x0046, blocks: (B:4:0x0008, B:6:0x0010, B:8:0x0014, B:9:0x0030, B:11:0x0034, B:13:0x0038), top: B:25:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void T2(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 21
            r2 = 2131231551(0x7f08033f, float:1.8079186E38)
            if (r6 == 0) goto L30
            java.lang.String r3 = ""
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Exception -> L46
            if (r3 != 0) goto L30
            android.widget.ImageView r3 = r5.y     // Catch: java.lang.Exception -> L46
            if (r3 == 0) goto L5c
            android.content.Context r3 = r5.f29222l     // Catch: java.lang.Exception -> L46
            c.k.b.t r3 = c.k.b.t.q(r3)     // Catch: java.lang.Exception -> L46
            c.k.b.x r6 = r3.l(r6)     // Catch: java.lang.Exception -> L46
            r3 = 80
            r4 = 55
            c.k.b.x r6 = r6.k(r3, r4)     // Catch: java.lang.Exception -> L46
            c.k.b.x r6 = r6.j(r2)     // Catch: java.lang.Exception -> L46
            android.widget.ImageView r3 = r5.y     // Catch: java.lang.Exception -> L46
            r6.g(r3)     // Catch: java.lang.Exception -> L46
            goto L5c
        L30:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L46
            if (r6 < r1) goto L5c
            android.widget.ImageView r6 = r5.y     // Catch: java.lang.Exception -> L46
            if (r6 == 0) goto L5c
            android.content.Context r3 = r5.f29222l     // Catch: java.lang.Exception -> L46
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Exception -> L46
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r2, r0)     // Catch: java.lang.Exception -> L46
            r6.setImageDrawable(r3)     // Catch: java.lang.Exception -> L46
            goto L5c
        L46:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L5c
            android.widget.ImageView r6 = r5.y     // Catch: java.lang.Exception -> L5c
            if (r6 == 0) goto L5c
            android.content.Context r1 = r5.f29222l     // Catch: java.lang.Exception -> L5c
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L5c
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r2, r0)     // Catch: java.lang.Exception -> L5c
            r6.setImageDrawable(r0)     // Catch: java.lang.Exception -> L5c
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.T2(java.lang.String):void");
    }

    public void U1() {
        runOnUiThread(new x());
    }

    public void U2(String str, String str2, c.h.a.i.q.f fVar, Context context, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.X = fVar;
        this.f29222l = context;
        this.E = progressBar;
        this.z = textView;
        this.A = textView2;
        this.B = textView3;
        this.C = textView4;
        this.y = imageView;
        this.z1 = linearLayout;
        this.B1 = linearLayout2;
        this.C1 = linearLayout3;
        this.D1 = linearLayout4;
        this.E1 = linearLayout5;
        this.F1 = linearLayout6;
        this.m1 = textView5;
        this.o1 = textView6;
        this.r1 = textView7;
        this.t1 = textView8;
        this.v1 = textView9;
        this.w1 = textView10;
        this.x1 = textView11;
        this.y1 = textView12;
        SharedPreferences sharedPreferences = context.getSharedPreferences("timeFormat", 0);
        f29214d = sharedPreferences;
        this.n0 = new SimpleDateFormat(sharedPreferences.getString("timeFormat", c.h.a.h.n.a.m0), Locale.US);
        T2(str2);
        this.B2 = new e0(this, str, null).execute(new String[0]);
    }

    public final void V1() {
        ImageView imageView = this.iv_play;
        imageView.setOnFocusChangeListener(new d0(imageView));
        ImageView imageView2 = this.iv_pause;
        imageView2.setOnFocusChangeListener(new d0(imageView2));
        ImageView imageView3 = this.iv_back;
        imageView3.setOnFocusChangeListener(new d0(imageView3));
        ImageView imageView4 = this.iv_audio_subtitle_track;
        imageView4.setOnFocusChangeListener(new d0(imageView4));
        ImageView imageView5 = this.iv_hp_play_from_beginning;
        imageView5.setOnFocusChangeListener(new d0(imageView5));
        LinearLayout linearLayout = this.ll_channels_list;
        linearLayout.setOnFocusChangeListener(new d0(linearLayout));
        LinearLayout linearLayout2 = this.ll_crop;
        linearLayout2.setOnFocusChangeListener(new d0(linearLayout2));
        LinearLayout linearLayout3 = this.ll_multi_screen;
        linearLayout3.setOnFocusChangeListener(new d0(linearLayout3));
        ImageView imageView6 = this.iv_back_episodes;
        imageView6.setOnFocusChangeListener(new d0(imageView6));
        ImageView imageView7 = this.iv_back_settings;
        imageView7.setOnFocusChangeListener(new d0(imageView7));
        ImageView imageView8 = this.iv_hp_lock;
        imageView8.setOnFocusChangeListener(new d0(imageView8));
        ImageView imageView9 = this.iv_hp_lock;
        imageView9.setOnFocusChangeListener(new d0(imageView9));
    }

    public void V2(int i2, String str, int i3, int i4) {
        try {
            if (this.j3.equals("mobile") && this.s3 && this.C3) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new RemoteAction(Icon.createWithResource(this, i2), str, str, PendingIntent.getBroadcast(this, i4, new Intent("media_control").putExtra("control_type", i3), 0)));
                this.u3.setActions(arrayList);
                setPictureInPictureParams(this.u3.build());
            }
        } catch (Exception unused) {
        }
    }

    public void W1(boolean z2) {
        f29216f = z2;
        String strK = c.h.a.i.q.m.k(this.f29222l);
        if (!c.h.a.i.q.m.l(this.f29222l).equals("default") && !new c.h.a.i.q.d(this.f29222l).d(strK)) {
            c.h.a.i.q.m.S("default", "default", this.f29222l);
        }
        String strL = c.h.a.i.q.m.l(this.f29222l);
        if (!z2 || strL == null || strL.equalsIgnoreCase("default")) {
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
                NSTIJKPlayerSky nSTIJKPlayerSky = this.m2;
                ((nSTIJKPlayerSky == null || !nSTIJKPlayerSky.isPlaying()) ? this.f29224n : this.f29225o).requestFocus();
                return;
            }
            return;
        }
        B2();
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
        f29216f = false;
        NSTIJKPlayerSky nSTIJKPlayerSky2 = this.m2;
        if (nSTIJKPlayerSky2 != null) {
            nSTIJKPlayerSky2.N0(Boolean.FALSE);
        }
        if (this.j2.equals("m3u")) {
            if (this.s2.booleanValue()) {
                String strK2 = c.h.a.i.q.m.k(this.f29222l);
                Intent intent = new Intent(this.f29222l, (Class<?>) PlayExternalPlayerActivity.class);
                intent.putExtra("url", this.M);
                intent.putExtra("packagename", strL);
                intent.putExtra("app_name", strK2);
                this.f29222l.startActivity(intent);
                return;
            }
            return;
        }
        if (this.v2 == -1 || !this.s2.booleanValue()) {
            return;
        }
        String strG = c.h.a.h.n.e.G(this.f29222l, this.v2, this.o0, "live");
        String strK3 = c.h.a.i.q.m.k(this.f29222l);
        Intent intent2 = new Intent(this.f29222l, (Class<?>) PlayExternalPlayerActivity.class);
        intent2.putExtra("url", strG);
        intent2.putExtra("packagename", strL);
        intent2.putExtra("app_name", strK3);
        this.f29222l.startActivity(intent2);
    }

    public void Y1() {
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
                    arrayListB1 = f2(arrayListB1, this.J0);
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
                if (this.A3.equals("true")) {
                    aVar = this.J1;
                    str = "radio_streams";
                    context = this.f29222l;
                } else {
                    aVar = this.J1;
                    context = this.f29222l;
                }
                ArrayList<c.h.a.i.b> arrayListP = aVar.p(str, c.h.a.i.q.m.z(context));
                arrayList = new ArrayList<>();
                ArrayList<String> arrayList3 = this.J0;
                if (arrayList3 != null && arrayList3.size() > 0 && arrayListP != null && arrayListP.size() > 0) {
                    arrayListP = e2(arrayListP, this.J0);
                }
                for (c.h.a.i.b bVar : arrayListP) {
                    c.h.a.i.f fVarD1 = new c.h.a.i.q.f(this.f29222l).D1(bVar.a(), String.valueOf(bVar.e()));
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

    public String Z1() {
        try {
            this.D2 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.B0;
            if (arrayList != null && this.z0 != null) {
                arrayList.clear();
                this.z0.clear();
            }
            this.S = new ArrayList<>();
            Y1();
            this.B0 = this.S;
            ArrayList<c.h.a.i.f> arrayList2 = this.C0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.O2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f29222l)));
            boolean zB = this.O2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.X.z1(null, str) : null;
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f29222l).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList3 = this.B0;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return "get_fav";
            }
            for (int i2 = 0; i2 < this.B0.size(); i2++) {
                if (c.h.a.i.q.m.f(this.f29222l).equals("m3u")) {
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
                            int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f29222l)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f29222l)).longValue(), this.f29222l);
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

    public String a2() {
        boolean z2;
        try {
            this.p3 = 0;
            ArrayList<c.h.a.i.f> arrayList = this.D0;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<c.h.a.i.f> arrayList2 = this.E0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            ArrayList<c.h.a.i.f> arrayList3 = new ArrayList<>();
            if (c.h.a.i.q.m.f(this.f29222l).equals("m3u")) {
                new ArrayList();
                ArrayList<c.h.a.i.c> arrayListB1 = this.X.B1("live");
                if (this.J0 != null) {
                    this.J0 = c2();
                }
                ArrayList<String> arrayList4 = this.J0;
                if (arrayList4 != null && arrayList4.size() > 0 && arrayListB1 != null && arrayListB1.size() > 0) {
                    arrayListB1 = f2(arrayListB1, this.J0);
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
                    ArrayList<c.h.a.i.b> arrayListP = this.A3.equals("true") ? this.J1.p("radio_streams", c.h.a.i.q.m.z(this.f29222l)) : this.J1.p("live", c.h.a.i.q.m.z(this.f29222l));
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
                        c.h.a.i.f fVarD1 = new c.h.a.i.q.f(this.f29222l).D1(bVar2.a(), String.valueOf(bVar2.e()));
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
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(this.O2.C()));
            String str = simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(this.f29222l)));
            boolean zB = this.O2.B();
            ArrayList<XMLTVProgrammePojo> arrayListZ1 = zB ? this.X.z1(null, str) : null;
            this.j0 = getSharedPreferences("currentlyPlayingVideo", 0);
            String string = c.h.a.i.q.m.f(this.f29222l).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR);
            ArrayList<c.h.a.i.f> arrayList7 = this.D0;
            if (arrayList7 != null && arrayList7.size() > 0) {
                for (int i2 = 0; i2 < this.D0.size(); i2++) {
                    if (c.h.a.i.q.m.f(this.f29222l).equals("m3u")) {
                        if (this.D0.get(i2).e0().equals(string)) {
                            this.p3 = i2;
                        }
                    } else if (this.D0.get(i2).Y().equals(string)) {
                        this.p3 = i2;
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
                                int iZ = c.h.a.h.n.e.z(Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).j(), this.f29222l)).longValue(), Long.valueOf(c.h.a.h.n.e.n(arrayListZ1.get(i3).l(), this.f29222l)).longValue(), this.f29222l);
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

    public int b2(ArrayList<c.h.a.i.f> arrayList, int i2) {
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

    public final ArrayList<String> c2() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.X.d1(c.h.a.i.q.m.z(this.f29222l));
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

    public final boolean d2(ArrayList<c.h.a.i.f> arrayList, ArrayList<String> arrayList2) {
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

    public final ArrayList<c.h.a.i.b> e2(ArrayList<c.h.a.i.b> arrayList, ArrayList<String> arrayList2) {
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

    public final ArrayList<c.h.a.i.c> f2(ArrayList<c.h.a.i.c> arrayList, ArrayList<String> arrayList2) {
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

    public final void g2() {
        ProgressBar progressBar = this.E;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.z;
        if (textView != null) {
            textView.setText(this.f29222l.getResources().getString(R.string.now_program_found));
        }
        TextView textView2 = this.A;
        if (textView2 != null) {
            textView2.setText(BuildConfig.FLAVOR);
        }
        TextView textView3 = this.B;
        if (textView3 != null) {
            textView3.setText(this.f29222l.getResources().getString(R.string.next_program_found));
        }
        TextView textView4 = this.C;
        if (textView4 != null) {
            textView4.setText(BuildConfig.FLAVOR);
        }
    }

    public final void h2() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.g3);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.g3);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.g3);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.g3);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.g3);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.g3);
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

    public void i2() {
        if (f29220j || this.ll_player_header_footer.getVisibility() != 0) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.g3);
        if (this.ll_brightness.getVisibility() == 0) {
            this.ll_brightness.startAnimation(this.g3);
        }
        if (this.tv_seek_left.getVisibility() == 0) {
            this.tv_seek_left.startAnimation(this.g3);
        }
        if (this.ll_pause_play.getVisibility() == 0) {
            this.ll_pause_play.startAnimation(this.g3);
        }
        if (this.tv_seek_right.getVisibility() == 0) {
            this.tv_seek_right.startAnimation(this.g3);
        }
        if (this.ll_volume.getVisibility() == 0) {
            this.ll_volume.startAnimation(this.g3);
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

    public final void j2() {
        LinearLayout linearLayout = this.G;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final void k2() {
        ProgressBar progressBar = this.F;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public void l2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final void m2() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final void n2() {
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
    public final boolean o2() {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.o2():boolean");
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 101) {
            try {
                if (q2()) {
                    SharedPreferences sharedPreferences = getSharedPreferences("downloadStatus", 0);
                    f29215e = sharedPreferences;
                    String string = sharedPreferences.getString("downloadStatus", BuildConfig.FLAVOR);
                    c.h.a.h.n.e eVar = new c.h.a.h.n.e();
                    if (string.equals("processing")) {
                        eVar.h0(this);
                    } else {
                        eVar.k0(this, this.u2, this.o0, this.f29223m, this.L, this.M);
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
            S2();
            relativeLayout = this.rl_episodes_box;
        } catch (Exception unused) {
        }
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            this.rl_episodes_box.startAnimation(this.r3);
            this.rl_episodes_box.setVisibility(8);
            return;
        }
        if (this.rl_settings_box.getVisibility() == 0) {
            this.rl_settings_box.startAnimation(this.i3);
            this.rl_settings_box.setVisibility(8);
            return;
        }
        if (f29216f) {
            if (this.ll_player_header_footer.getVisibility() != 0) {
                Toolbar toolbar = this.S0;
                if (toolbar != null) {
                    toolbar.setVisibility(0);
                }
                R2();
                return;
            }
            this.ll_player_header_footer.startAnimation(this.g3);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.g3);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.g3);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.g3);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.g3);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.g3);
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
        if (this.j3.equals("mobile") && this.s3 && this.C3) {
            try {
                t2();
            } catch (Exception unused2) {
                super.onBackPressed();
            }
        } else {
            super.onBackPressed();
        }
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04c1  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 1544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.onClick(android.view.View):void");
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1(configuration);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29222l = this;
        m2();
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = this.f29222l.getSharedPreferences("auto_start", 0);
        this.B3 = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("picinpic", c.h.a.h.n.a.c0);
        this.C3 = z2;
        if (z2 && Build.VERSION.SDK_INT >= 26) {
            this.u3 = new PictureInPictureParams.Builder();
        }
        setContentView(R.layout.activity_vlcplayer_sky);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        this.O2 = new c.h.a.k.d.a.a(this.f29222l);
        try {
            this.T2 = new r();
            this.S2 = c.f.a.c.d.u.b.e(this);
        } catch (Exception unused) {
        }
        p2();
        RelativeLayout relativeLayout = this.d1;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new s());
        }
        this.J0 = c2();
        String str = this.k1;
        this.E3 = str;
        if (str == null || str.equals(BuildConfig.FLAVOR) || !this.k1.equals("0")) {
            String str2 = this.k1;
            if (str2 == null || str2.equals(BuildConfig.FLAVOR) || !this.k1.equals("-1")) {
                String str3 = this.k1;
                if (str3 == null || str3.equals(BuildConfig.FLAVOR) || !this.k1.equals("-6")) {
                    F1();
                } else {
                    K1();
                }
            } else {
                J1();
            }
        } else {
            D1();
        }
        this.A2 = new a0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.S0.x(R.menu.menu_search);
        this.f2 = menu;
        this.g2 = menu.getItem(2).getSubMenu().findItem(R.id.empty);
        if (c.h.a.i.q.m.f(this.f29222l).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(R.id.menu_load_channels_vod1).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f29222l.getResources().getDisplayMetrics());
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
            R1();
            B2();
            c.f.a.c.d.u.b.e(this.f29222l).c().e(this.Q2, c.f.a.c.d.u.d.class);
        } catch (Exception unused) {
        }
    }

    @Override // a.b.k.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        boolean z2 = f29216f;
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
        NSTIJKPlayerSky nSTIJKPlayerSky;
        StringBuilder sb;
        boolean z2 = keyEvent.getRepeatCount() == 0;
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
                                if (f29216f) {
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
                                        boolean z3 = f29216f;
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
        if (this.s2.booleanValue() && (nSTIJKPlayerSky = this.m2) != null && nSTIJKPlayerSky.getPlayerIsPrepared()) {
            ((!z2 || this.m2.isPlaying()) ? this.iv_pause : this.iv_play).performClick();
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
        n2();
        this.g2 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f29222l) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(this.f29222l.getResources().getString(R.string.logout_title)).f(this.f29222l.getResources().getString(R.string.logout_message)).j(this.f29222l.getResources().getString(R.string.yes), new n()).g(this.f29222l.getResources().getString(R.string.no), new m()).n();
        }
        if (itemId == R.id.action_search) {
            SearchView searchView = (SearchView) a.i.r.j.b(menuItem);
            this.T0 = searchView;
            searchView.setQueryHint(this.f29222l.getResources().getString(R.string.search_channel));
            this.T0.setIconifiedByDefault(false);
            this.T0.setOnQueryTextListener(new o());
            return true;
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f29222l.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f29222l.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f29222l.getResources().getString(R.string.yes), new p());
            aVar.g(this.f29222l.getResources().getString(R.string.no), new q());
            aVar.n();
        }
        if (itemId == R.id.menu_sort) {
            Q2(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.F3;
            if (thread != null && thread.isAlive()) {
                this.F3.interrupt();
            }
        } catch (Exception unused) {
        }
        try {
            c.f.a.c.d.u.b bVar = this.S2;
            if (bVar != null) {
                bVar.c().e(this.Q2, c.f.a.c.d.u.d.class);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            if (z2) {
                NSTIJKPlayerSky nSTIJKPlayerSky = this.m2;
                if (nSTIJKPlayerSky != null && nSTIJKPlayerSky.g0 != null) {
                    nSTIJKPlayerSky.setShowOrHideSubtitles("gone");
                    this.m2.g0.setVisibility(8);
                }
                i iVar = new i();
                this.v3 = iVar;
                registerReceiver(iVar, new IntentFilter("media_control"));
                return;
            }
            f29216f = true;
            unregisterReceiver(this.v3);
            this.t3 = false;
            this.v3 = null;
            NSTIJKPlayerSky nSTIJKPlayerSky2 = this.m2;
            if (nSTIJKPlayerSky2 != null && nSTIJKPlayerSky2.g0 != null) {
                nSTIJKPlayerSky2.setShowOrHideSubtitles("visible");
                this.m2.g0.setVisibility(0);
            }
            NSTIJKPlayerSky nSTIJKPlayerSky3 = this.m2;
            if (nSTIJKPlayerSky3 != null) {
                nSTIJKPlayerSky3.isPlaying();
            }
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
                q2();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                b.a aVar = new b.a(this, R.style.AlertDialogCustom);
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.permission_alertbox, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(R.id.btn_grant);
                Button button2 = (Button) viewInflate.findViewById(R.id.btn_cancel);
                button.setOnFocusChangeListener(new e.j((View) button, this));
                button2.setOnFocusChangeListener(new e.j((View) button2, this));
                button.setOnClickListener(new v());
                button2.setOnClickListener(new w());
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
        m2();
        super.onResume();
        Thread thread = this.F3;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new z());
            this.F3 = thread2;
            thread2.start();
        }
        Context context = this.f29222l;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("auto_start", 0);
            this.B3 = sharedPreferences;
            boolean z2 = sharedPreferences.getBoolean("picinpic", c.h.a.h.n.a.c0);
            this.C3 = z2;
            if (z2 && this.j3.equals("mobile")) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 26) {
                    this.u3 = new PictureInPictureParams.Builder();
                }
                if (i2 >= 26) {
                    try {
                        if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.f29222l.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f29222l.getPackageName()) == 0) {
                            this.s3 = true;
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
            if (!String.valueOf(getIntent().getIntExtra("OPENED_STREAM_ID", 0)).equals(c.h.a.i.q.m.f(this.f29222l).equals("m3u") ? this.i0.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", BuildConfig.FLAVOR) : this.i0.getString("currentlyPlayingVideo", BuildConfig.FLAVOR))) {
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
                            F1();
                        } else {
                            K1();
                        }
                    } else {
                        J1();
                    }
                } else {
                    D1();
                }
            }
        }
        c.h.a.h.n.e.g(this.f29222l);
        c.f.a.c.d.u.b bVar = this.S2;
        if (bVar != null) {
            bVar.c().a(this.Q2, c.f.a.c.d.u.d.class);
        }
        n2();
        if (this.E2) {
            this.E2 = false;
            ArrayList<c.h.a.i.f> arrayList = this.B0;
            if (arrayList == null || arrayList.size() == 0) {
                c.h.a.h.n.a.G = Boolean.FALSE;
                x2();
            } else {
                z2(this.B0);
            }
            c.h.a.k.b.u uVar = this.Z;
            if (uVar != null) {
                uVar.notifyDataSetChanged();
            }
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            c.f.a.c.d.u.b.e(this.f29222l).c().a(this.Q2, c.f.a.c.d.u.d.class);
        } catch (Exception unused) {
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            B2();
            if (this.j3.equals("mobile") && !this.z3 && this.s3 && this.C3 && Build.VERSION.SDK_INT >= 21) {
                finishAndRemoveTask();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (this.j3.equals("mobile") && this.s3 && this.C3 && !this.z3 && !isInPictureInPictureMode()) {
            try {
                t2();
                this.t3 = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        m2();
        if (z2) {
            C1(getResources().getConfiguration());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p2() {
        /*
            Method dump skipped, instruction units count: 2595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.p2():void");
    }

    public boolean q2() {
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

    public void r2(String str, String str2) {
        this.Y2 = str;
        H1();
    }

    public final void s2() {
        ProgressBar progressBar = this.E;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.z;
        if (textView != null) {
            textView.setText(this.f29222l.getResources().getString(R.string.now_loading));
        }
        TextView textView2 = this.A;
        if (textView2 != null) {
            textView2.setText(BuildConfig.FLAVOR);
        }
        TextView textView3 = this.B;
        if (textView3 != null) {
            textView3.setText(this.f29222l.getResources().getString(R.string.next_loading));
        }
        TextView textView4 = this.C;
        if (textView4 != null) {
            textView4.setText(BuildConfig.FLAVOR);
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

    public void t2() {
        if (this.m2 == null) {
            return;
        }
        N1(0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            Rational rational = (this.m2.a1() == 0 || this.m2.Z0() == 0) ? new Rational(this.m2.getWidth(), this.m2.getHeight()) : new Rational(this.m2.a1(), this.m2.Z0());
            if (i2 >= 26) {
                try {
                    try {
                        W1(false);
                        this.u3.setAspectRatio(rational).build();
                        enterPictureInPictureMode(this.u3.build());
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    W1(false);
                    this.u3.setAspectRatio(new Rational(this.m2.getWidth(), this.m2.getHeight())).build();
                    enterPictureInPictureMode(this.u3.build());
                }
            }
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
        int currentWindowIndex = this.m2.getCurrentWindowIndex();
        if (currentWindowIndex == this.F0.size() - 1) {
            this.m2.setCurrentWindowIndex(0);
        } else {
            this.m2.setCurrentWindowIndex(currentWindowIndex + 1);
        }
    }

    public void v2() {
        n2();
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
                        J1();
                        return;
                    }
                    String str = this.k1;
                    if (str == null || str.equals(BuildConfig.FLAVOR) || !this.k1.equals("-6")) {
                        F1();
                        return;
                    } else {
                        K1();
                        return;
                    }
                }
                this.k1 = "0";
                this.l1 = this.f29222l.getResources().getString(R.string.all);
            }
            D1();
        }
    }

    public void w2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.ll_pb_left_categories;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public void x2() {
        c.h.a.h.n.a.G = Boolean.TRUE;
        this.K = true;
        this.w.setVisibility(0);
        this.x.setText(this.f29222l.getResources().getString(R.string.no_channel_found));
        this.F1.setVisibility(8);
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            findViewById(R.id.watrmrk).setVisibility(8);
        }
    }

    public final void y2() {
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
        if (Build.VERSION.SDK_INT >= 26) {
            this.m2.setMovieListener(this.G3);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void z2(ArrayList<c.h.a.i.f> arrayList) {
        c.h.a.k.e.a aVarF;
        String strValueOf;
        String str;
        String str2;
        String str3;
        if (arrayList == null || arrayList.size() <= 0 || this.Y1 >= arrayList.size()) {
            return;
        }
        int iS = c.h.a.h.n.e.S(arrayList.get(this.Y1).P());
        this.W2 = iS;
        if (!arrayList.get(this.Y1).g().equals(BuildConfig.FLAVOR)) {
            this.X2 = arrayList.get(this.Y1).g();
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
                this.y.setImageDrawable(this.f29222l.getResources().getDrawable(R.drawable.logo_placeholder_white));
            } else {
                c.k.b.t.q(this.f29222l).l(strX).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(this.y);
            }
        } catch (Exception unused) {
            this.y.setImageDrawable(this.f29222l.getResources().getDrawable(R.drawable.logo_placeholder_white));
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
        if (T1(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.f29222l))), this.h2.format(this.n2)) >= c.h.a.k.d.c.a.d.p() && (str2 = this.A1) != null && this.q1 != null && (!f29217g.equals(str2) || (this.A1 != null && (str3 = this.q1) != null && !f29218h.equals(str3)))) {
            this.s2 = Boolean.FALSE;
            this.m2.setVisibility(8);
            this.w.setVisibility(0);
            this.x.setText(strO0 + this.s + this.N1);
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
        this.x3 = iS + " - " + name;
        this.m2.Y0();
        if (!f29216f) {
            if (this.m2.getFullScreenValue().booleanValue()) {
                f29216f = this.m2.getFullScreenValue().booleanValue();
            } else {
                f29216f = false;
            }
        }
        if (this.s2.booleanValue()) {
            if (this.j2.equals("m3u")) {
                this.m2.e1(Uri.parse(this.k2), f29216f, name);
                str = this.k2;
            } else {
                this.m2.e1(Uri.parse(this.f29223m + iR + this.o0), f29216f, name);
                str = this.f29223m + iR + ".m3u8";
            }
            this.w3 = String.valueOf(Uri.parse(str));
            NSTIJKPlayerSky nSTIJKPlayerSky = this.m2;
            nSTIJKPlayerSky.J = 0;
            nSTIJKPlayerSky.L = false;
            nSTIJKPlayerSky.start();
        }
        this.S1.removeCallbacksAndMessages(null);
        this.N = strI;
        this.O = strX;
        this.y3 = strX;
        this.m2.setCurrentEpgChannelID(strI);
        this.m2.setCurrentChannelLogo(this.O);
        T2(this.O);
        this.B2 = new e0(this, this.N, null).execute(new String[0]);
        ListView listView = this.Q;
        if (listView != null) {
            listView.requestFocus();
        }
        this.d2 = Boolean.TRUE;
    }
}
