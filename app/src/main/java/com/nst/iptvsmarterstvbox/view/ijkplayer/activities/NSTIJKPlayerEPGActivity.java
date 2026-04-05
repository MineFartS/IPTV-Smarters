package minefarts.iptvsmarters.view.ijkplayer.activities;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.i.f;
import c.h.a.i.q.i;
import c.h.a.i.q.m;
import c.h.a.k.d.c.a.g;
import c.h.a.k.d.c.a.h;
import c.k.b.t;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerEPG;
import minefarts.iptvsmarters.view.ijkplayer.widget.preference.IjkListPreference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.LocalDateTime;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerEPGActivity extends a.b.k.c implements SurfaceHolder.Callback, View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static SharedPreferences f29167d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SharedPreferences f29168e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f29169f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f29170g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f29171h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static ProgressBar f29172i;
    public TextView A;
    public Animation A1;
    public LinearLayout B;
    public Animation B1;
    public ProgressBar C;
    public Animation C1;
    public ProgressBar D;
    public int D0;
    public Animation D1;
    public c.h.a.i.q.a E0;
    public Animation E1;
    public SharedPreferences.Editor F0;
    public Animation F1;
    public SharedPreferences.Editor G0;
    public Animation G1;
    public RelativeLayout H;
    public TextView H0;
    public Animation H1;
    public ArrayList<f> I;
    public TextView I0;
    public Animation I1;
    public ArrayList<f> J;
    public Handler J0;
    public String J1;
    public Handler K0;
    public String K1;
    public Handler L0;
    public String L1;
    public Handler M0;
    public int M1;
    public c.h.a.i.q.f N;
    public SharedPreferences.Editor N0;
    public Animation N1;
    public SharedPreferences O;
    public SharedPreferences.Editor O0;
    public Animation O1;
    public SharedPreferences P;
    public SharedPreferences.Editor P0;
    public SharedPreferences Q;
    public SharedPreferences R;
    public SharedPreferences S;
    public LinearLayout S0;
    public SharedPreferences T;
    public TextView T0;
    public SharedPreferences U;
    public SimpleDateFormat V;
    public Boolean V0;
    public String W;
    public Menu W0;
    public String X;
    public DateFormat X0;
    public String Y0;
    public ArrayList<c.h.a.i.e> Z;
    public NSTIJKPlayerEPG Z0;
    public String a1;
    public Boolean b1;
    public String c1;
    public int d1;
    public String e1;
    public ArrayList<c.h.a.i.e> f0;
    public SharedPreferences f1;

    @BindView
    public FrameLayout fl_sub_font_size;
    public ArrayList<c.h.a.i.e> g0;
    public String g1;
    public ArrayList<c.h.a.i.e> h0;
    public String h1;
    public ArrayList<f> i0;
    public String i1;

    @BindView
    public ImageView iv_audio_subtitle_track;

    @BindView
    public ImageView iv_back;

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
    public ImageView iv_unlock_button;
    public ArrayList<f> j0;
    public Long j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f29174k;
    public ArrayList<f> k0;
    public String k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f29175l;
    public ArrayList<f> l0;
    public String l1;

    @BindView
    public LinearLayout ll_audio_subtitle_settings;

    @BindView
    public LinearLayout ll_audio_subtitle_settings_click;

    @BindView
    public LinearLayout ll_back;

    @BindView
    public LinearLayout ll_back_click;

    @BindView
    public LinearLayout ll_brightness;

    @BindView
    public LinearLayout ll_channels_list;

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
    public LinearLayout ll_player_header_footer;

    @BindView
    public LinearLayout ll_restart;

    @BindView
    public LinearLayout ll_screen_locked;

    @BindView
    public LinearLayout ll_volume;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f29176m;
    public ArrayList<f> m0;
    public Boolean m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f29177n;
    public ArrayList<f> n0;
    public SharedPreferences n1;

    @BindView
    public TextView no_audio_track;

    @BindView
    public TextView no_subtitle_track;

    @BindView
    public TextView no_video_track;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f29178o;
    public ArrayList<f> o0;
    public Date o1;
    public ImageView p;
    public Boolean p1;
    public View q;
    public ArrayList<c.h.a.i.e> q0;
    public Boolean q1;
    public ArrayList<i> r0;
    public Boolean r1;

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
    public LinearLayout s;
    public ProgressBar s0;
    public Boolean s1;

    @BindView
    public SeekBar sb_brightness;

    @BindView
    public SeekBar sb_volume;
    public TextView t;
    public TextView t0;
    public Boolean t1;

    @BindView
    public TextView tv_brightness;

    @BindView
    public TextView tv_episode_name;

    @BindView
    public ImageView tv_seek_left;

    @BindView
    public ImageView tv_seek_right;

    @BindView
    public TextView tv_sub_font_size;

    @BindView
    public TextView tv_volume;
    public TextView u;
    public TextView u0;
    public Boolean u1;
    public SeekBar v;
    public c.h.a.k.d.a.a v1;
    public ImageView w;
    public Handler w1;
    public TextView x;
    public c.e.a.a.a x1;
    public TextView y;
    public SimpleDateFormat y1;
    public TextView z;
    public String z0;
    public String z1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f29173j = this;
    public boolean r = false;
    public boolean E = true;
    public boolean F = false;
    public boolean G = false;
    public boolean K = true;
    public long L = 2500;
    public boolean M = true;
    public int Y = 0;
    public ArrayList<String> p0 = new ArrayList<>();
    public boolean v0 = true;
    public boolean w0 = false;
    public boolean x0 = false;
    public boolean y0 = false;
    public boolean A0 = true;
    public String B0 = BuildConfig.FLAVOR;
    public String C0 = BuildConfig.FLAVOR;
    public int Q0 = 0;
    public StringBuilder R0 = new StringBuilder();
    public int U0 = -1;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f29179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29180c;

        public a(String str, String str2) {
            this.f29179b = str;
            this.f29180c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity = NSTIJKPlayerEPGActivity.this;
            nSTIJKPlayerEPGActivity.g1 = this.f29179b;
            nSTIJKPlayerEPGActivity.h1 = this.f29180c;
            nSTIJKPlayerEPGActivity.Z0.setCurrentEpgChannelID(NSTIJKPlayerEPGActivity.this.g1);
            NSTIJKPlayerEPGActivity.this.Z0.setCurrentChannelLogo(NSTIJKPlayerEPGActivity.this.h1);
            NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity2 = NSTIJKPlayerEPGActivity.this;
            nSTIJKPlayerEPGActivity2.m1(nSTIJKPlayerEPGActivity2.g1, nSTIJKPlayerEPGActivity2.h1);
        }
    }

    public class b implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerEPGActivity.this.T0.setText(BuildConfig.FLAVOR);
                NSTIJKPlayerEPGActivity.this.S0.setVisibility(8);
            }
        }

        /* JADX INFO: renamed from: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerEPGActivity$b$b, reason: collision with other inner class name */
        public class RunnableC0293b implements Runnable {
            public RunnableC0293b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerEPGActivity.this.T0.setText(BuildConfig.FLAVOR);
                NSTIJKPlayerEPGActivity.this.S0.setVisibility(8);
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            Runnable runnableC0293b;
            boolean zV0;
            NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity = NSTIJKPlayerEPGActivity.this;
            nSTIJKPlayerEPGActivity.z0 = nSTIJKPlayerEPGActivity.R0.toString();
            NSTIJKPlayerEPGActivity.this.T0.setText(BuildConfig.FLAVOR);
            NSTIJKPlayerEPGActivity.this.S0.setVisibility(8);
            NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity2 = NSTIJKPlayerEPGActivity.this;
            ArrayList<f> arrayListU1 = nSTIJKPlayerEPGActivity2.N.u1(nSTIJKPlayerEPGActivity2.z0, "live");
            NSTIJKPlayerEPGActivity.this.R0.setLength(0);
            if (arrayListU1 == null || arrayListU1.size() == 0) {
                NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity3 = NSTIJKPlayerEPGActivity.this;
                nSTIJKPlayerEPGActivity3.T0.setText(nSTIJKPlayerEPGActivity3.f29173j.getResources().getString(R.string.no_channel_found));
                NSTIJKPlayerEPGActivity.this.S0.setVisibility(0);
                handler = new Handler();
                runnableC0293b = new RunnableC0293b();
            } else {
                NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity4 = NSTIJKPlayerEPGActivity.this;
                if (nSTIJKPlayerEPGActivity4.N.I1(m.z(nSTIJKPlayerEPGActivity4.f29173j)) <= 0 || NSTIJKPlayerEPGActivity.this.p0 == null) {
                    zV0 = false;
                } else {
                    NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity5 = NSTIJKPlayerEPGActivity.this;
                    zV0 = nSTIJKPlayerEPGActivity5.V0(arrayListU1, nSTIJKPlayerEPGActivity5.p0);
                }
                if (!zV0) {
                    NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity6 = NSTIJKPlayerEPGActivity.this;
                    nSTIJKPlayerEPGActivity6.x0 = true;
                    nSTIJKPlayerEPGActivity6.y0 = true;
                    nSTIJKPlayerEPGActivity6.B0 = "0";
                    String strY = arrayListU1.get(0).Y();
                    String name = arrayListU1.get(0).getName();
                    String strI = arrayListU1.get(0).I();
                    String strX = arrayListU1.get(0).X();
                    String strE0 = arrayListU1.get(0).e0();
                    NSTIJKPlayerEPGActivity.this.Z0.setTitle(NSTIJKPlayerEPGActivity.this.z0 + " - " + name);
                    NSTIJKPlayerEPGActivity.this.Z0.Y0();
                    if (NSTIJKPlayerEPGActivity.this.X.equals("m3u")) {
                        NSTIJKPlayerEPGActivity.this.Z0.c1(Uri.parse(strE0), NSTIJKPlayerEPGActivity.this.w0, name);
                    } else {
                        NSTIJKPlayerEPGActivity.this.Z0.c1(Uri.parse(NSTIJKPlayerEPGActivity.this.f29174k + c.h.a.h.n.e.R(strY) + NSTIJKPlayerEPGActivity.this.W), NSTIJKPlayerEPGActivity.this.w0, name);
                    }
                    NSTIJKPlayerEPGActivity.this.Z0.J = 0;
                    NSTIJKPlayerEPGActivity.this.Z0.L = false;
                    NSTIJKPlayerEPGActivity.this.Z0.start();
                    NSTIJKPlayerEPGActivity.this.L0.removeCallbacksAndMessages(null);
                    NSTIJKPlayerEPGActivity.this.b1();
                    NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity7 = NSTIJKPlayerEPGActivity.this;
                    nSTIJKPlayerEPGActivity7.g1 = strI;
                    nSTIJKPlayerEPGActivity7.h1 = strX;
                    nSTIJKPlayerEPGActivity7.Z0.setCurrentEpgChannelID(NSTIJKPlayerEPGActivity.this.g1);
                    NSTIJKPlayerEPGActivity.this.Z0.setCurrentChannelLogo(NSTIJKPlayerEPGActivity.this.h1);
                    NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity8 = NSTIJKPlayerEPGActivity.this;
                    nSTIJKPlayerEPGActivity8.m1(nSTIJKPlayerEPGActivity8.g1, nSTIJKPlayerEPGActivity8.h1);
                    NSTIJKPlayerEPGActivity.this.D0 = c.h.a.h.n.e.R(strY);
                    if (NSTIJKPlayerEPGActivity.this.F0 != null) {
                        NSTIJKPlayerEPGActivity.this.F0.putString("currentlyPlayingVideo", strY);
                        NSTIJKPlayerEPGActivity.this.F0.apply();
                    }
                    arrayListU1.clear();
                    return;
                }
                NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity9 = NSTIJKPlayerEPGActivity.this;
                nSTIJKPlayerEPGActivity9.T0.setText(nSTIJKPlayerEPGActivity9.f29173j.getResources().getString(R.string.no_channel_found));
                NSTIJKPlayerEPGActivity.this.S0.setVisibility(0);
                handler = new Handler();
                runnableC0293b = new a();
            }
            handler.postDelayed(runnableC0293b, 1000L);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEPGActivity.this.Y0();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEPGActivity.this.X0();
        }
    }

    public class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f29187b;

        public e(View view) {
            this.f29187b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29187b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29187b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29187b, "scaleY", f2);
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
                View view8 = this.f29187b;
                if (view8 == null || view8.getTag() == null || !this.f29187b.getTag().equals("1")) {
                    View view9 = this.f29187b;
                    if (view9 == null || view9.getTag() == null || !this.f29187b.getTag().equals("2")) {
                        View view10 = this.f29187b;
                        if (view10 == null || view10.getTag() == null || !this.f29187b.getTag().equals("3")) {
                            View view11 = this.f29187b;
                            if ((view11 != null && view11.getTag() != null && this.f29187b.getTag().equals("4")) || (((view5 = this.f29187b) != null && view5.getTag() != null && this.f29187b.getTag().equals("5")) || (((view6 = this.f29187b) != null && view6.getTag() != null && this.f29187b.getTag().equals("6")) || ((view7 = this.f29187b) != null && view7.getTag() != null && this.f29187b.getTag().equals("7"))))) {
                                view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(R.drawable.icon_shadow_light));
                                return;
                            }
                            View view12 = this.f29187b;
                            if (view12 != null && view12.getTag() != null && this.f29187b.getTag().equals("8")) {
                                return;
                            }
                            View view13 = this.f29187b;
                            if (view13 == null || view13.getTag() == null || !this.f29187b.getTag().equals("9")) {
                                View view14 = this.f29187b;
                                if (view14 == null || view14.getTag() == null || !this.f29187b.getTag().equals("10")) {
                                    return;
                                }
                                view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                                b(f2);
                                c(f2);
                                linearLayout2 = NSTIJKPlayerEPGActivity.this.ll_restart;
                            }
                        }
                        view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                        b(f2);
                        c(f2);
                        return;
                    }
                    view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                    b(f2);
                    c(f2);
                    linearLayout2 = NSTIJKPlayerEPGActivity.this.ll_audio_subtitle_settings;
                } else {
                    view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                    b(f2);
                    c(f2);
                    linearLayout2 = NSTIJKPlayerEPGActivity.this.ll_back;
                }
                linearLayout2.setVisibility(0);
                return;
            }
            if (z) {
                return;
            }
            f2 = z ? 1.08f : 1.0f;
            View view15 = this.f29187b;
            if (view15 == null || view15.getTag() == null || !this.f29187b.getTag().equals("1")) {
                View view16 = this.f29187b;
                if (view16 == null || view16.getTag() == null || !this.f29187b.getTag().equals("2")) {
                    View view17 = this.f29187b;
                    if (view17 == null || view17.getTag() == null || !this.f29187b.getTag().equals("3")) {
                        View view18 = this.f29187b;
                        if ((view18 != null && view18.getTag() != null && this.f29187b.getTag().equals("4")) || (((view2 = this.f29187b) != null && view2.getTag() != null && this.f29187b.getTag().equals("5")) || (((view3 = this.f29187b) != null && view3.getTag() != null && this.f29187b.getTag().equals("6")) || ((view4 = this.f29187b) != null && view4.getTag() != null && this.f29187b.getTag().equals("7"))))) {
                            view.setBackground(null);
                            return;
                        }
                        View view19 = this.f29187b;
                        if (view19 != null && view19.getTag() != null && this.f29187b.getTag().equals("8")) {
                            return;
                        }
                        View view20 = this.f29187b;
                        if (view20 == null || view20.getTag() == null || !this.f29187b.getTag().equals("9")) {
                            View view21 = this.f29187b;
                            if (view21 == null || view21.getTag() == null || !this.f29187b.getTag().equals("10")) {
                                return;
                            }
                            view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                            b(f2);
                            c(f2);
                            a(z);
                            linearLayout = NSTIJKPlayerEPGActivity.this.ll_restart;
                        }
                    }
                    view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                    b(f2);
                    c(f2);
                    a(z);
                    return;
                }
                view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                b(f2);
                c(f2);
                a(z);
                linearLayout = NSTIJKPlayerEPGActivity.this.ll_audio_subtitle_settings;
            } else {
                view.setBackground(NSTIJKPlayerEPGActivity.this.getResources().getDrawable(R.drawable.icon_shadow));
                b(f2);
                c(f2);
                a(z);
                linearLayout = NSTIJKPlayerEPGActivity.this.ll_back;
            }
            linearLayout.setVisibility(8);
        }
    }

    public NSTIJKPlayerEPGActivity() {
        Boolean bool = Boolean.FALSE;
        this.V0 = bool;
        this.Y0 = BuildConfig.FLAVOR;
        this.b1 = bool;
        this.c1 = BuildConfig.FLAVOR;
        this.d1 = 0;
        this.m1 = Boolean.TRUE;
        this.p1 = bool;
        this.q1 = bool;
        this.r1 = bool;
        this.s1 = bool;
        this.t1 = bool;
        this.u1 = bool;
        this.J1 = "mobile";
        this.K1 = "0";
        this.L1 = "0";
        this.M1 = 0;
    }

    public static boolean K0() {
        ProgressBar progressBar = f29172i;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public static long L0(SimpleDateFormat simpleDateFormat, String str, String str2) {
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

    public void F0() {
        int iI1 = this.N.I1(m.z(this.f29173j));
        ArrayList<f> arrayListX0 = this.N.X0("0", "live");
        this.I = arrayListX0;
        if (iI1 <= 0 || arrayListX0 == null) {
            this.k0 = arrayListX0;
            return;
        }
        ArrayList<String> arrayList = this.p0;
        if (arrayList != null) {
            this.j0 = U0(arrayListX0, arrayList);
        }
        this.k0 = this.j0;
    }

    public void G0(String str) {
        c.h.a.i.q.f fVar = this.N;
        if (fVar != null) {
            this.m0 = fVar.X0(str, "live");
        }
        this.k0 = this.m0;
    }

    public void H0() {
        this.J = new ArrayList<>();
        P0();
        this.k0 = this.J;
    }

    public final void I0(int i2) {
        if (f29171h) {
            return;
        }
        this.Z0.d1 = new d();
        NSTIJKPlayerEPG nSTIJKPlayerEPG = this.Z0;
        nSTIJKPlayerEPG.c1.postDelayed(nSTIJKPlayerEPG.d1, i2);
    }

    public void J0(int i2) {
        if (f29171h) {
            return;
        }
        this.Z0.d1 = new c();
        NSTIJKPlayerEPG nSTIJKPlayerEPG = this.Z0;
        nSTIJKPlayerEPG.c1.postDelayed(nSTIJKPlayerEPG.d1, i2);
    }

    public final void M0() {
        ImageView imageView = this.iv_play;
        imageView.setOnFocusChangeListener(new e(imageView));
        ImageView imageView2 = this.iv_pause;
        imageView2.setOnFocusChangeListener(new e(imageView2));
        ImageView imageView3 = this.iv_back;
        imageView3.setOnFocusChangeListener(new e(imageView3));
        ImageView imageView4 = this.iv_audio_subtitle_track;
        imageView4.setOnFocusChangeListener(new e(imageView4));
        ImageView imageView5 = this.iv_hp_play_from_beginning;
        imageView5.setOnFocusChangeListener(new e(imageView5));
        LinearLayout linearLayout = this.ll_channels_list;
        linearLayout.setOnFocusChangeListener(new e(linearLayout));
        LinearLayout linearLayout2 = this.ll_crop;
        linearLayout2.setOnFocusChangeListener(new e(linearLayout2));
        LinearLayout linearLayout3 = this.ll_multi_screen;
        linearLayout3.setOnFocusChangeListener(new e(linearLayout3));
        ImageView imageView6 = this.iv_back_episodes;
        imageView6.setOnFocusChangeListener(new e(imageView6));
        ImageView imageView7 = this.iv_back_settings;
        imageView7.setOnFocusChangeListener(new e(imageView7));
        ImageView imageView8 = this.iv_hp_lock;
        imageView8.setOnFocusChangeListener(new e(imageView8));
        ImageView imageView9 = this.iv_hp_lock;
        imageView9.setOnFocusChangeListener(new e(imageView9));
    }

    public void N0() {
        if (this.Z0 != null) {
            Z0();
        }
        NSTIJKPlayerEPG nSTIJKPlayerEPG = this.Z0;
        ((nSTIJKPlayerEPG == null || !nSTIJKPlayerEPG.isPlaying()) ? this.f29175l : this.f29176m).requestFocus();
    }

    public void P0() {
        ArrayList<f> arrayList;
        if (this.X.equals("m3u")) {
            c.h.a.i.q.f fVar = this.N;
            if (fVar == null) {
                return;
            }
            ArrayList<c.h.a.i.c> arrayListB1 = fVar.B1("live");
            arrayList = new ArrayList<>();
            for (c.h.a.i.c cVar : arrayListB1) {
                ArrayList<f> arrayListF1 = this.N.F1(cVar.a(), cVar.c());
                if (arrayListF1 != null && arrayListF1.size() > 0) {
                    arrayList.add(arrayListF1.get(0));
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
        } else {
            c.h.a.i.q.a aVar = this.E0;
            if (aVar == null) {
                return;
            }
            ArrayList<c.h.a.i.b> arrayListP = aVar.p("live", m.z(this.f29173j));
            arrayList = new ArrayList<>();
            for (c.h.a.i.b bVar : arrayListP) {
                f fVarD1 = new c.h.a.i.q.f(this.f29173j).D1(bVar.a(), String.valueOf(bVar.e()));
                if (fVarD1 != null) {
                    arrayList.add(fVarD1);
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
        }
        this.J = arrayList;
    }

    public int Q0(ArrayList<f> arrayList, int i2) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (c.h.a.h.n.e.S(arrayList.get(i3).P()) == i2) {
                return i3;
            }
        }
        return 0;
    }

    public final ArrayList<String> R0() {
        ArrayList<i> arrayListD1 = this.N.d1(m.z(this.f29173j));
        this.r0 = arrayListD1;
        if (arrayListD1 != null) {
            for (i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.p0.add(iVar.b());
                }
            }
        }
        return this.p0;
    }

    public int S0(long j2, long j3, Context context) {
        if (context != null) {
            long millis = LocalDateTime.now().toDateTime().getMillis();
            Long l2 = this.j1;
            if (l2 != null) {
                millis += l2.longValue();
            }
            if (j2 < j3 && millis < j3) {
                if (millis <= j2) {
                    return 100;
                }
                return (int) (((j3 - millis) * 100) / (j3 - j2));
            }
        }
        return 0;
    }

    public long T0(Context context) {
        if (context == null) {
            return 0L;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
        f29168e = sharedPreferences;
        if (sharedPreferences != null) {
            return c.h.a.h.n.e.w(sharedPreferences.getString("selectedEPGShift", c.h.a.h.n.a.k0));
        }
        return 0L;
    }

    public final ArrayList<f> U0(ArrayList<f> arrayList, ArrayList<String> arrayList2) {
        for (f fVar : arrayList) {
            boolean z = false;
            Iterator<String> it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (fVar.g().equals(it.next())) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                this.i0.add(fVar);
            }
        }
        return this.i0;
    }

    public final boolean V0(ArrayList<f> arrayList, ArrayList<String> arrayList2) {
        for (f fVar : arrayList) {
            Iterator<String> it = arrayList2.iterator();
            while (it.hasNext()) {
                if (fVar.g().equals(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void W0() {
        this.C.setProgress(0);
        this.x.setText(this.f29173j.getResources().getString(R.string.now_program_found));
        this.y.setText(BuildConfig.FLAVOR);
        this.z.setText(this.f29173j.getResources().getString(R.string.next_program_found));
        this.A.setText(BuildConfig.FLAVOR);
    }

    public final void X0() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.G1);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.G1);
            }
            if (!this.z1.equals("true") && this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.G1);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.G1);
            }
            if (!this.z1.equals("true") && this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.G1);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.G1);
            }
            this.ll_player_header_footer.setVisibility(8);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.setVisibility(8);
            }
            if (!this.z1.equals("true") && this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.setVisibility(8);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.setVisibility(8);
            }
            if (!this.z1.equals("true") && this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.setVisibility(8);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.setVisibility(8);
            }
        }
    }

    public void Y0() {
        if (f29171h || this.ll_player_header_footer.getVisibility() != 0) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.G1);
        if (this.ll_brightness.getVisibility() == 0) {
            this.ll_brightness.startAnimation(this.G1);
        }
        if (!this.z1.equals("true") && this.tv_seek_left.getVisibility() == 0) {
            this.tv_seek_left.startAnimation(this.G1);
        }
        if (this.ll_pause_play.getVisibility() == 0) {
            this.ll_pause_play.startAnimation(this.G1);
        }
        if (!this.z1.equals("true") && this.tv_seek_right.getVisibility() == 0) {
            this.tv_seek_right.startAnimation(this.G1);
        }
        if (this.ll_volume.getVisibility() == 0) {
            this.ll_volume.startAnimation(this.G1);
        }
        this.ll_player_header_footer.setVisibility(8);
        if (this.ll_brightness.getVisibility() == 0) {
            this.ll_brightness.setVisibility(8);
        }
        if (!this.z1.equals("true") && this.tv_seek_left.getVisibility() == 0) {
            this.tv_seek_left.setVisibility(8);
        }
        if (this.ll_pause_play.getVisibility() == 0) {
            this.ll_pause_play.setVisibility(8);
        }
        if (!this.z1.equals("true") && this.tv_seek_right.getVisibility() == 0) {
            this.tv_seek_right.setVisibility(8);
        }
        if (this.ll_volume.getVisibility() == 0) {
            this.ll_volume.setVisibility(8);
        }
    }

    public final void Z0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public boolean a1(long j2, long j3, Context context) {
        if (context != null) {
            long millis = LocalDateTime.now().toDateTime().getMillis();
            Long l2 = this.j1;
            if (l2 != null) {
                millis += l2.longValue();
            }
            if (j2 <= millis && j3 >= millis) {
                return true;
            }
        }
        return false;
    }

    public final void b1() {
        this.C.setProgress(0);
        this.x.setText(this.f29173j.getResources().getString(R.string.now_loading));
        this.y.setText(BuildConfig.FLAVOR);
        this.z.setText(this.f29173j.getResources().getString(R.string.next_loading));
        this.A.setText(BuildConfig.FLAVOR);
    }

    public void d1() {
        this.s.setVisibility(0);
        this.t.setText(this.f29173j.getResources().getString(R.string.no_channel_found));
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            findViewById(R.id.watrmrk).setVisibility(8);
        }
    }

    public final void e1() {
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

    public final void f1(ArrayList<f> arrayList, int i2) {
        NSTIJKPlayerEPG nSTIJKPlayerEPG;
        Uri uri;
        String str;
        String str2;
        if (arrayList == null || arrayList.size() <= 0 || this.Q0 >= arrayList.size()) {
            return;
        }
        if (this.Q0 == 0) {
            this.Q0 = Q0(arrayList, i2);
        }
        String name = arrayList.get(this.Q0).getName();
        String strP = arrayList.get(this.Q0).P();
        int iR = c.h.a.h.n.e.R(arrayList.get(this.Q0).Y());
        String strE0 = arrayList.get(this.Q0).e0();
        String strO0 = c.h.a.h.n.e.o0(h.a() + h.i());
        String strI = arrayList.get(this.Q0).I();
        String strX = arrayList.get(this.Q0).X();
        try {
            if (strX.equals(BuildConfig.FLAVOR) || strX.isEmpty()) {
                this.w.setImageDrawable(this.f29173j.getResources().getDrawable(R.drawable.logo_placeholder_white));
            } else {
                t.q(this.f29173j).l(strX).j(R.drawable.logo_placeholder_white).d(R.drawable.logo_placeholder_white).g(this.w);
            }
        } catch (Exception unused) {
            this.w.setImageDrawable(this.f29173j.getResources().getDrawable(R.drawable.logo_placeholder_white));
        }
        SharedPreferences.Editor editor = this.F0;
        if (editor != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(arrayList.get(this.Q0).Y()));
            this.F0.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayList.get(this.Q0).e0()));
            this.F0.apply();
        }
        SharedPreferences.Editor editor2 = this.G0;
        if (editor2 != null) {
            editor2.putInt("currentlyPlayingVideoPosition", this.Q0);
            this.G0.apply();
        }
        this.D0 = iR;
        this.Z0.setTitle(strP + " - " + name);
        this.Z0.setCurrentWindowIndex(this.Q0);
        SimpleDateFormat simpleDateFormat = this.y1;
        if (L0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.f29173j))), this.X0.format(this.o1)) >= c.h.a.k.d.c.a.d.p() && (str = this.a1) != null && this.e1 != null && (!f29170g.equals(str) || (this.a1 != null && (str2 = this.e1) != null && !f29169f.equals(str2)))) {
            this.m1 = Boolean.FALSE;
            this.x1.a(R.id.app_video_status).d();
            this.x1.a(R.id.app_video_status_text).b(strO0 + this.l1 + this.i1);
        }
        try {
            if (this.m1.booleanValue()) {
                if (this.X.equals("m3u")) {
                    nSTIJKPlayerEPG = this.Z0;
                    uri = Uri.parse(strE0);
                } else {
                    nSTIJKPlayerEPG = this.Z0;
                    uri = Uri.parse(this.f29174k + iR + this.W);
                }
                nSTIJKPlayerEPG.c1(uri, this.w0, name);
                NSTIJKPlayerEPG nSTIJKPlayerEPG2 = this.Z0;
                nSTIJKPlayerEPG2.J = 0;
                nSTIJKPlayerEPG2.L = false;
                this.L0.removeCallbacksAndMessages(null);
                b1();
                this.L0.postDelayed(new a(strI, strX), 300L);
            }
        } catch (Exception unused2) {
        }
    }

    public final void g1() {
        try {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.Z0;
            if (nSTIJKPlayerEPG != null) {
                if (nSTIJKPlayerEPG.T0()) {
                    this.Z0.M0();
                } else {
                    this.Z0.k1();
                    this.Z0.W0(true);
                    this.Z0.h1();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused) {
        }
    }

    public void h1() {
        if (f29171h || this.ll_player_header_footer.getVisibility() != 8) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.F1);
        this.ll_player_header_footer.setVisibility(0);
    }

    public void i1() {
        if (f29171h || this.ll_player_header_footer.getVisibility() != 8) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.F1);
        this.ll_player_header_footer.setVisibility(0);
        if (this.ll_brightness.getVisibility() == 8) {
            this.ll_brightness.startAnimation(this.F1);
            this.ll_brightness.setVisibility(0);
        }
        if (!this.z1.equals("true") && this.tv_seek_left.getVisibility() == 8) {
            this.tv_seek_left.startAnimation(this.F1);
            this.tv_seek_left.setVisibility(0);
        }
        if (this.ll_pause_play.getVisibility() == 8) {
            this.ll_pause_play.startAnimation(this.F1);
            this.ll_pause_play.setVisibility(0);
        }
        if (!this.z1.equals("true") && this.tv_seek_right.getVisibility() == 8) {
            this.tv_seek_right.startAnimation(this.F1);
            this.tv_seek_right.setVisibility(0);
        }
        if (this.ll_volume.getVisibility() == 8) {
            this.ll_volume.startAnimation(this.F1);
            this.ll_volume.setVisibility(0);
        }
    }

    public final void j1() {
        if (this.rl_settings_box.getVisibility() == 8) {
            this.rl_settings_box.startAnimation(this.H1);
            this.rl_settings_box.setVisibility(0);
            this.iv_back_settings.requestFocus();
        }
    }

    public void k1() {
        Handler handler;
        if (f29171h || (handler = this.Z0.c1) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public final void l1() {
        k1();
        if (this.ll_player_header_footer.getVisibility() == 0) {
            X0();
        } else {
            h1();
            I0(5000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:4:0x000d, B:6:0x0013, B:7:0x002f, B:9:0x0033), top: B:43:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerEPGActivity.m1(java.lang.String, java.lang.String):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        RelativeLayout relativeLayout;
        try {
            k1();
            relativeLayout = this.rl_episodes_box;
        } catch (Exception unused) {
        }
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            this.rl_episodes_box.startAnimation(this.O1);
            this.rl_episodes_box.setVisibility(8);
            return;
        }
        if (this.rl_settings_box.getVisibility() == 0) {
            this.rl_settings_box.startAnimation(this.I1);
            this.rl_settings_box.setVisibility(8);
            return;
        }
        if (this.w0 && this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.G1);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.G1);
            }
            if (!this.z1.equals("true") && this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.G1);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.G1);
            }
            if (!this.z1.equals("true") && this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.G1);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.G1);
            }
            this.ll_player_header_footer.setVisibility(8);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.setVisibility(8);
            }
            if (!this.z1.equals("true") && this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.setVisibility(8);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.setVisibility(8);
            }
            if (!this.z1.equals("true") && this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.setVisibility(8);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.setVisibility(8);
                return;
            }
            return;
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView;
        ImageView imageView2;
        switch (view.getId()) {
            case R.id.iv_audio_subtitle_track /* 2131428108 */:
            case R.id.ll_audio_subtitle_settings_click /* 2131428295 */:
                k1();
                X0();
                j1();
                return;
            case R.id.iv_back /* 2131428110 */:
            case R.id.ll_back_click /* 2131428298 */:
            case R.id.ll_multi_screen /* 2131428410 */:
                onBackPressed();
                break;
            case R.id.iv_back_episodes /* 2131428114 */:
            case R.id.iv_back_settings /* 2131428116 */:
                break;
            case R.id.iv_pause /* 2131428173 */:
                try {
                    if (this.J1.equals("tv")) {
                        k1();
                        h1();
                        this.Z0.pause();
                        this.iv_pause.setVisibility(8);
                        this.iv_play.setVisibility(0);
                        this.iv_play.requestFocus();
                    } else {
                        k1();
                        i1();
                        this.Z0.pause();
                        this.iv_pause.setVisibility(8);
                        this.iv_play.setVisibility(0);
                    }
                    return;
                } catch (Exception e2) {
                    Log.e("NSTIJPLAYERACTIVTY", "exection " + e2);
                    return;
                }
            case R.id.iv_play /* 2131428174 */:
                if (!this.J1.equals("tv")) {
                    boolean playerIsPrepared = this.Z0.getPlayerIsPrepared();
                    k1();
                    i1();
                    if (playerIsPrepared) {
                        J0(1000);
                        this.Z0.start();
                        this.iv_play.setVisibility(8);
                        imageView = this.iv_pause;
                    } else {
                        J0(5000);
                        imageView = this.iv_play;
                    }
                    imageView.setVisibility(0);
                    return;
                }
                boolean playerIsPrepared2 = this.Z0.getPlayerIsPrepared();
                k1();
                h1();
                if (playerIsPrepared2) {
                    I0(1000);
                    this.Z0.start();
                    this.iv_play.setVisibility(8);
                    this.iv_pause.setVisibility(0);
                    imageView2 = this.iv_pause;
                } else {
                    I0(5000);
                    this.iv_play.setVisibility(0);
                    imageView2 = this.iv_play;
                }
                imageView2.requestFocus();
                return;
            case R.id.iv_unlock_button /* 2131428204 */:
                k1();
                f29171h = false;
                this.ll_screen_locked.startAnimation(this.B1);
                this.ll_screen_locked.setVisibility(8);
                i1();
                J0(3000);
                return;
            case R.id.ll_channels_list /* 2131428323 */:
                k1();
                X0();
                return;
            case R.id.ll_crop /* 2131428328 */:
                k1();
                I0(5000);
                NSTIJKPlayerEPG nSTIJKPlayerEPG = this.Z0;
                if (nSTIJKPlayerEPG != null) {
                    nSTIJKPlayerEPG.n1();
                    return;
                }
                return;
            case R.id.ll_hp_lock_click /* 2131428383 */:
                k1();
                X0();
                f29171h = true;
                this.Z0.e1();
                this.Z0.H0(3000);
                return;
            default:
                return;
        }
        onBackPressed();
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i2;
        String str;
        StringBuilder sb;
        StringBuilder sb2;
        this.f29173j = this;
        super.onCreate(bundle);
        this.v1 = new c.h.a.k.d.a.a(this.f29173j);
        this.n1 = this.f29173j.getSharedPreferences("loginPrefs", 0);
        this.x1 = new c.e.a.a.a(this);
        this.w1 = new Handler();
        if (this.v1.A().equals(c.h.a.h.n.a.s0)) {
            this.J1 = "tv";
            i2 = R.layout.honey_player_epg_tv;
        } else {
            this.J1 = "mobile";
            i2 = R.layout.honey_player_epg;
        }
        setContentView(i2);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        this.A1 = AnimationUtils.loadAnimation(this.f29173j, R.anim.trans_top_in);
        this.B1 = AnimationUtils.loadAnimation(this.f29173j, R.anim.trans_top_out);
        this.F1 = AnimationUtils.loadAnimation(this.f29173j, R.anim.player_fade_in_animation);
        this.G1 = AnimationUtils.loadAnimation(this.f29173j, R.anim.player_fade_out_animation);
        this.I1 = AnimationUtils.loadAnimation(this.f29173j, R.anim.subtitle_slide_out_right);
        this.H1 = AnimationUtils.loadAnimation(this.f29173j, R.anim.subtitle_slide_in_right);
        this.D1 = AnimationUtils.loadAnimation(this.f29173j, R.anim.zoom_in);
        this.E1 = AnimationUtils.loadAnimation(this.f29173j, R.anim.zoom_out);
        this.C1 = AnimationUtils.loadAnimation(this.f29173j, R.anim.trans_bottom_in);
        this.N1 = AnimationUtils.loadAnimation(this.f29173j, R.anim.player_live_left_side_in);
        this.O1 = AnimationUtils.loadAnimation(this.f29173j, R.anim.player_live_left_side_out);
        this.O = getSharedPreferences("loginPrefs", 0);
        f29168e = this.f29173j.getSharedPreferences("loginPrefs", 0);
        this.P = this.f29173j.getSharedPreferences("allowedFormat", 0);
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideo", 0);
        this.Q = sharedPreferences;
        this.F0 = sharedPreferences.edit();
        SharedPreferences sharedPreferences2 = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.R = sharedPreferences2;
        this.G0 = sharedPreferences2.edit();
        this.f1 = this.f29173j.getSharedPreferences("openedVideo", 0);
        this.S = this.f29173j.getSharedPreferences("currentSubtitleTrack", 0);
        this.T = this.f29173j.getSharedPreferences("currentAudioTrack", 0);
        this.U = this.f29173j.getSharedPreferences("currentVideoTrack", 0);
        this.O0 = this.T.edit();
        this.P0 = this.U.edit();
        this.N0 = this.S.edit();
        this.O0.clear();
        this.O0.apply();
        this.P0.clear();
        this.P0.apply();
        this.N0.clear();
        this.N0.apply();
        if (m.f(this.f29173j).equals("m3u")) {
            this.X = "m3u";
        } else {
            this.X = "api";
        }
        String string = this.O.getString("username", BuildConfig.FLAVOR);
        String string2 = this.O.getString("password", BuildConfig.FLAVOR);
        String string3 = this.O.getString("serverUrl", BuildConfig.FLAVOR);
        String string4 = this.O.getString("serverProtocol", BuildConfig.FLAVOR);
        String string5 = this.O.getString("serverPortHttps", BuildConfig.FLAVOR);
        String string6 = this.O.getString("serverPort", BuildConfig.FLAVOR);
        String string7 = this.O.getString("serverPortRtmp", BuildConfig.FLAVOR);
        if (string4 != null) {
            switch (string4) {
                case "http":
                    if (string3 != null && !string3.startsWith("http://")) {
                        sb2 = new StringBuilder();
                        sb2.append("http://");
                        sb2.append(string3);
                        string3 = sb2.toString();
                    }
                    string5 = string6;
                    break;
                case "rmtp":
                    if (string3 != null && !string3.startsWith("rmtp://")) {
                        string3 = "rmtp://" + string3;
                    }
                    string5 = string7;
                    break;
                case "https":
                    if (string3 != null && !string3.startsWith("https://")) {
                        string3 = "https://" + string3;
                        break;
                    }
                    break;
                default:
                    if (string3 != null && !string3.startsWith("http://") && !string3.startsWith("https://")) {
                        sb2 = new StringBuilder();
                        sb2.append("http://");
                        sb2.append(string3);
                        string3 = sb2.toString();
                    }
                    string5 = string6;
                    break;
            }
        } else {
            string5 = BuildConfig.FLAVOR;
        }
        String string8 = this.P.getString("allowedFormat", BuildConfig.FLAVOR);
        this.W = string8;
        if (string8 == null || string8.isEmpty() || this.W.equals(BuildConfig.FLAVOR) || !this.W.equals("default")) {
            String str2 = this.W;
            if (str2 == null || str2.isEmpty() || this.W.equals(BuildConfig.FLAVOR) || !this.W.equals("ts")) {
                String str3 = this.W;
                str = (str3 == null || str3.isEmpty() || this.W.equals(BuildConfig.FLAVOR) || !this.W.equals("m3u8")) ? ".ts" : ".m3u8";
                this.W = BuildConfig.FLAVOR;
            }
            this.W = str;
        } else {
            this.W = BuildConfig.FLAVOR;
        }
        int intExtra = getIntent().getIntExtra("OPENED_STREAM_ID", 0);
        this.k1 = getIntent().getStringExtra("VIDEO_URL");
        this.d1 = getIntent().getIntExtra("VIDEO_NUM", 0);
        getIntent().getStringExtra("STREAM_TYPE");
        String stringExtra = getIntent().getStringExtra("VIDEO_TITLE");
        String stringExtra2 = getIntent().getStringExtra("OPENED_CAT_ID");
        String stringExtra3 = getIntent().getStringExtra("EPG_CHANNEL_ID");
        this.z1 = getIntent().getStringExtra("MultiPlayer");
        String stringExtra4 = getIntent().getStringExtra("EPG_CHANNEL_LOGO");
        SharedPreferences.Editor editorEdit = this.f1.edit();
        editorEdit.putInt("openedVideoID", intExtra);
        editorEdit.putString("LOGIN_PREF_OPENED_VIDEO_URL_M3U", this.k1);
        editorEdit.putString("name", stringExtra);
        editorEdit.putInt("num", this.d1);
        editorEdit.putString("epgChannelId", stringExtra3);
        editorEdit.putString("channelLogo", stringExtra4);
        editorEdit.apply();
        if (this.W.equals(BuildConfig.FLAVOR)) {
            sb = new StringBuilder();
            sb.append(string3);
            sb.append(":");
            sb.append(string5);
            sb.append("/");
        } else {
            sb = new StringBuilder();
            sb.append(string3);
            sb.append(":");
            sb.append(string5);
            sb.append("/live/");
        }
        sb.append(string);
        sb.append("/");
        sb.append(string2);
        sb.append("/");
        this.Y0 = sb.toString();
        this.f29174k = c.h.a.h.n.e.t(this.Y0);
        this.N = new c.h.a.i.q.f(this);
        this.E0 = new c.h.a.i.q.a(this.f29173j);
        this.J0 = new Handler();
        this.K0 = new Handler();
        this.L0 = new Handler();
        this.M0 = new Handler();
        NSTIJKPlayerEPG nSTIJKPlayerEPG = (NSTIJKPlayerEPG) findViewById(R.id.video_view);
        this.Z0 = nSTIJKPlayerEPG;
        nSTIJKPlayerEPG.setLiveStreamDBHandler(this.N);
        M0();
        e1();
        this.p = (ImageView) findViewById(R.id.tv_seek_left);
        String str4 = this.z1;
        if (str4 == null || !str4.equals("true")) {
            ImageView imageView = this.p;
            if (imageView != null) {
                imageView.setOnClickListener(this);
            }
        } else {
            ImageView imageView2 = this.p;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        this.f29177n = (ImageView) findViewById(R.id.tv_seek_right);
        this.f29178o = findViewById(R.id.ll_multi_screen);
        String str5 = this.z1;
        if (str5 == null || !str5.equals("true")) {
            ImageView imageView3 = this.f29177n;
            if (imageView3 != null) {
                imageView3.setOnClickListener(this);
            }
            View view = this.f29178o;
            if (view != null) {
                view.setOnClickListener(this);
            }
        } else {
            ImageView imageView4 = this.f29177n;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
        }
        NSTIJKPlayerEPG nSTIJKPlayerEPG2 = this.Z0;
        nSTIJKPlayerEPG2.a1(this, nSTIJKPlayerEPG2, this.rg_video, this.rg_audio, this.rg_subtitle, this.no_video_track, this.no_audio_track, this.no_subtitle_track, this.tv_sub_font_size, this.sb_brightness, this.sb_volume, this.ll_player_header_footer, this.F1, this.G1, this.tv_seek_left, this.tv_seek_right, this.ll_brightness, this.ll_volume, this.tv_brightness, this.ll_pause_play, this.C1, this.D1, this.tv_volume, this.rl_settings_box, this.I1, this.ll_screen_locked, this.A1, this.B1, this.rl_episodes_box, this.O1, this.z1, this.fl_sub_font_size);
        this.C = (ProgressBar) findViewById(R.id.progressBar);
        this.B = (LinearLayout) findViewById(R.id.ll_seekbar_time);
        this.w = (ImageView) findViewById(R.id.iv_channel_logo);
        this.x = (TextView) findViewById(R.id.tv_current_program);
        this.y = (TextView) findViewById(R.id.tv_current_time);
        this.z = (TextView) findViewById(R.id.tv_next_program);
        this.A = (TextView) findViewById(R.id.tv_next_program_time);
        f29172i = (ProgressBar) findViewById(R.id.app_video_loading);
        this.s0 = (ProgressBar) findViewById(R.id.pb_loader);
        this.t0 = (TextView) findViewById(R.id.tv_noStream);
        this.u0 = (TextView) findViewById(R.id.tv_no_record_found);
        this.H0 = (TextView) findViewById(R.id.date);
        this.I0 = (TextView) findViewById(R.id.time);
        this.S0 = (LinearLayout) findViewById(R.id.ll_channel_jumping);
        this.T0 = (TextView) findViewById(R.id.app_channel_jumping_text);
        this.v = (SeekBar) findViewById(R.id.vlcSeekbar);
        this.s = (LinearLayout) findViewById(R.id.app_video_status);
        this.t = (TextView) findViewById(R.id.app_video_status_text);
        this.u = (TextView) findViewById(R.id.txtDisplay);
        this.D = (ProgressBar) findViewById(R.id.pb_listview_loader);
        try {
            IjkMediaPlayer.loadLibrariesOnce(null);
            IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        } catch (Exception | UnsatisfiedLinkError unused) {
        }
        this.i1 = c.h.a.h.n.e.o0(g.f() + IjkListPreference.Y());
        SharedPreferences sharedPreferences3 = this.f29173j.getSharedPreferences("timeFormat", 0);
        f29167d = sharedPreferences3;
        String string9 = sharedPreferences3.getString("timeFormat", c.h.a.h.n.a.m0);
        Locale locale = Locale.US;
        this.V = new SimpleDateFormat(string9, locale);
        this.l1 = c.h.a.h.n.e.o0(IjkListPreference.Z() + IjkListPreference.X());
        findViewById(R.id.ll_multi_screen).setOnClickListener(this);
        this.w0 = true;
        View viewFindViewById = findViewById(R.id.iv_play);
        this.f29175l = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this);
        }
        this.e1 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        View viewFindViewById2 = findViewById(R.id.iv_pause);
        this.f29176m = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this);
        }
        f29170g = O0(this.f29173j);
        f29169f = getApplicationContext().getPackageName();
        View viewFindViewById3 = findViewById(R.id.btn_list);
        this.q = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this);
        }
        this.y1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.X0 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.a1 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        this.o1 = new Date();
        this.H = (RelativeLayout) findViewById(R.id.middle);
        this.Z = new ArrayList<>();
        this.f0 = new ArrayList<>();
        this.g0 = new ArrayList<>();
        this.h0 = new ArrayList<>();
        this.i0 = new ArrayList<>();
        this.j0 = new ArrayList<>();
        this.k0 = new ArrayList<>();
        this.l0 = new ArrayList<>();
        this.m0 = new ArrayList<>();
        this.n0 = new ArrayList<>();
        this.o0 = new ArrayList<>();
        this.q0 = this.N.o1();
        c.h.a.i.e eVar = new c.h.a.i.e();
        c.h.a.i.e eVar2 = new c.h.a.i.e();
        c.h.a.i.e eVar3 = new c.h.a.i.e();
        eVar.g("0");
        eVar.h(this.f29173j.getResources().getString(R.string.all));
        eVar2.g("-1");
        eVar2.h(this.f29173j.getResources().getString(R.string.favourites));
        int iT1 = this.N.T1("-2", "live");
        this.U0 = iT1;
        if (iT1 != 0 && iT1 > 0) {
            eVar3.g("-2");
            eVar3.h(this.f29173j.getResources().getString(R.string.uncategories));
            ArrayList<c.h.a.i.e> arrayList = this.q0;
            arrayList.add(arrayList.size(), eVar3);
        }
        this.N.I1(m.z(this.f29173j));
        this.p0 = R0();
        stringExtra2.hashCode();
        if (stringExtra2.equals("0")) {
            this.B0 = "0";
        } else if (stringExtra2.equals("-1")) {
            this.B0 = "-1";
        } else {
            this.B0 = stringExtra2;
        }
        this.Z0.setEPGHandler(this.L0);
        this.Z0.setContext(this.f29173j);
        this.j1 = Long.valueOf(T0(this.f29173j));
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.Z0 != null) {
                g1();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        View view;
        StringBuilder sb;
        boolean z = keyEvent.getRepeatCount() == 0;
        if (i2 != 62) {
            if (i2 != 66) {
                if (i2 != 79) {
                    if (i2 == 82) {
                        Menu menu = this.W0;
                        if (menu != null) {
                            menu.performIdentifierAction(R.id.empty, 0);
                        }
                        return true;
                    }
                    if (i2 != 85) {
                        if (i2 != 86) {
                            if (i2 == 126) {
                                if (z && !this.Z0.isPlaying()) {
                                    this.Z0.start();
                                    this.f29176m.requestFocus();
                                }
                                return true;
                            }
                            if (i2 != 127) {
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
                                        String str = this.z1;
                                        if (str != null && str.equals("false") && this.w0) {
                                            this.M0.removeCallbacksAndMessages(null);
                                            int i3 = 7;
                                            if (i2 == 7) {
                                                this.R0.append(0);
                                            } else if (i2 == 8) {
                                                this.R0.append(1);
                                            } else {
                                                if (i2 == 9) {
                                                    sb = this.R0;
                                                    i3 = 2;
                                                } else if (i2 == 10) {
                                                    sb = this.R0;
                                                    i3 = 3;
                                                } else if (i2 == 11) {
                                                    sb = this.R0;
                                                    i3 = 4;
                                                } else if (i2 == 12) {
                                                    sb = this.R0;
                                                    i3 = 5;
                                                } else if (i2 == 13) {
                                                    sb = this.R0;
                                                    i3 = 6;
                                                } else if (i2 == 14) {
                                                    sb = this.R0;
                                                } else if (i2 == 15) {
                                                    this.R0.append(8);
                                                } else if (i2 == 16) {
                                                    this.R0.append(9);
                                                }
                                                sb.append(i3);
                                            }
                                            this.T0.setText(this.R0.toString());
                                            this.S0.setVisibility(0);
                                            this.M0.postDelayed(new b(), 3000L);
                                        }
                                        return true;
                                    default:
                                        switch (i2) {
                                            case 19:
                                            case 20:
                                            case 21:
                                            case 22:
                                                k1();
                                                I0(5000);
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
                        if (z && this.Z0.isPlaying()) {
                            this.Z0.pause();
                            this.f29175l.requestFocus();
                        }
                        return true;
                    }
                }
            }
            if (!this.w0) {
                return true;
            }
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.Z0;
            if (nSTIJKPlayerEPG == null || !nSTIJKPlayerEPG.getPlayerIsPrepared()) {
                l1();
            } else if (this.rl_settings_box.getVisibility() == 8) {
                l1();
                (this.Z0.isPlaying() ? this.iv_pause : this.iv_play).requestFocus();
            }
            return true;
        }
        if (!z || this.Z0.isPlaying()) {
            this.Z0.pause();
            view = this.f29175l;
        } else {
            this.Z0.start();
            view = this.f29176m;
        }
        view.requestFocus();
        return true;
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    @Override // a.l.d.e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r3 = this;
            super.onResume()
            minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerEPG r0 = r3.Z0
            if (r0 == 0) goto La
            r3.Z0()
        La:
            java.lang.String r0 = r3.B0
            java.lang.String r1 = ""
            if (r0 == 0) goto L2e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            java.lang.String r0 = r3.B0
            java.lang.String r2 = "0"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2e
            r3.F0()
            java.util.ArrayList<c.h.a.i.f> r0 = r3.k0
            if (r0 == 0) goto L67
            int r0 = r0.size()
            if (r0 == 0) goto L67
            goto L5f
        L2e:
            java.lang.String r0 = r3.B0
            if (r0 == 0) goto L50
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L50
            java.lang.String r0 = r3.B0
            java.lang.String r1 = "-1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            r3.H0()
            java.util.ArrayList<c.h.a.i.f> r0 = r3.k0
            if (r0 == 0) goto L67
            int r0 = r0.size()
            if (r0 == 0) goto L67
            goto L5f
        L50:
            java.lang.String r0 = r3.B0
            r3.G0(r0)
            java.util.ArrayList<c.h.a.i.f> r0 = r3.k0
            if (r0 == 0) goto L67
            int r0 = r0.size()
            if (r0 == 0) goto L67
        L5f:
            java.util.ArrayList<c.h.a.i.f> r0 = r3.k0
            int r1 = r3.d1
            r3.f1(r0, r1)
            goto L6a
        L67:
            r3.d1()
        L6a:
            r3.N0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerEPGActivity.onResume():void");
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.Z0;
            if (nSTIJKPlayerEPG != null) {
                nSTIJKPlayerEPG.N0(Boolean.valueOf(this.w0));
                g1();
            }
        } catch (Exception unused) {
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

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }
}
