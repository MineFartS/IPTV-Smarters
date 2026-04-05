package com.nst.iptvsmarterstvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.AppOpsManager;
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
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import android.util.Rational;
import android.view.KeyEvent;
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
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import c.f.a.c.d.u.s;
import c.h.a.i.p;
import c.h.a.i.q.l;
import c.h.a.k.a.m;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.cast.MediaInfo;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.pojo.PanelAvailableChannelsPojo;
import com.nst.iptvsmarterstvbox.view.adapter.EpisodeDetailAdapter;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class HoneyPlayer extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f25659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f25660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ProgressBar f25661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f25662g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f25663h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f25664i = true;
    public Handler A;
    public c.e.a.a.a A0;
    public String B;
    public LinearLayout B0;
    public SharedPreferences C0;
    public l D;
    public c.h.a.i.q.k E;
    public m F;
    public SharedPreferences G;
    public SharedPreferences H;
    public SharedPreferences H0;
    public SharedPreferences I;
    public SharedPreferences.Editor I0;
    public SharedPreferences.Editor J;
    public SharedPreferences K;
    public SharedPreferences L;
    public SharedPreferences M;
    public SharedPreferences N;
    public SharedPreferences N0;
    public SharedPreferences O;
    public SharedPreferences.Editor O0;
    public SharedPreferences P;
    public SharedPreferences P0;
    public SharedPreferences.Editor Q;
    public c.f.a.c.d.u.d Q0;
    public SharedPreferences.Editor R;
    public c.f.a.c.d.u.b R0;
    public SharedPreferences.Editor S;
    public SharedPreferences.Editor T;
    public SharedPreferences.Editor U;
    public String V;
    public String W;
    public String X;
    public c.h.a.i.q.f Y;
    public ArrayList<c.h.a.i.f> Z;
    public s<c.f.a.c.d.u.d> Z0;
    public ArrayList<GetEpisdoeDetailsCallback> a1;
    public Handler b1;
    public Runnable c1;

    @BindView
    public TextView cancel_autoplay;

    @BindView
    public MediaRouteButton cast_button;
    public a.b.k.b d1;
    public BroadcastReceiver e1;
    public ArrayList<c.h.a.i.f> f0;

    @BindView
    public FrameLayout fl_seek_left;

    @BindView
    public FrameLayout fl_seek_right;

    @BindView
    public FrameLayout fl_sub_font_size;
    public List<GetEpisdoeDetailsCallback> g0;
    public PictureInPictureParams.Builder h1;

    @BindView
    public SeekBar hp_seekbar;
    public int i0;
    public ArrayList<File> i1;

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
    public ImageView iv_movie_poster_box;

    @BindView
    public ImageView iv_next_episode;

    @BindView
    public ImageView iv_pause;

    @BindView
    public ImageView iv_play;

    @BindView
    public ImageView iv_playback;

    @BindView
    public ImageView iv_unlock_button;
    public SimpleDateFormat k0;
    public SharedPreferences k1;
    public Date l0;

    @BindView
    public LinearLayout ll_aspect_ratio;

    @BindView
    public LinearLayout ll_audio_subtitle_settings;

    @BindView
    public LinearLayout ll_audio_subtitle_settings_click;

    @BindView
    public LinearLayout ll_auto_play_next_episode;

    @BindView
    public LinearLayout ll_back;

    @BindView
    public LinearLayout ll_back_click;

    @BindView
    public LinearLayout ll_brightness;

    @BindView
    public LinearLayout ll_casting_to_tv;

    @BindView
    public LinearLayout ll_chromecast_click;

    @BindView
    public LinearLayout ll_crop;

    @BindView
    public LinearLayout ll_episodes;

    @BindView
    public LinearLayout ll_hp_lock_click;

    @BindView
    public LinearLayout ll_next_episode;

    @BindView
    public LinearLayout ll_pause_play;

    @BindView
    public LinearLayout ll_play_button_main_layout;

    @BindView
    public LinearLayout ll_playback_speed;

    @BindView
    public LinearLayout ll_player_footer;

    @BindView
    public LinearLayout ll_player_header;

    @BindView
    public LinearLayout ll_restart;

    @BindView
    public LinearLayout ll_screen_locked;

    @BindView
    public LinearLayout ll_season_button_main_layout;

    @BindView
    public LinearLayout ll_volume;
    public DateFormat m0;

    @BindView
    public TableLayout mHudView;

    @BindView
    public NSTIJKPlayerEpisodes mVideoView;

    @BindView
    public RecyclerView myRecyclerView;
    public String n0;

    @BindView
    public TextView no_audio_track;

    @BindView
    public TextView no_subtitle_track;

    @BindView
    public TextView no_video_track;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EpisodeDetailAdapter f25670o;
    public String o0;
    public RecyclerView.p p;
    public String p0;
    public Context q;
    public String q0;
    public Animation r;

    @BindView
    public RadioGroup rg_audio;

    @BindView
    public RadioGroup rg_subtitle;

    @BindView
    public RadioGroup rg_video;

    @BindView
    public RelativeLayout rl_episodes_box;

    @BindView
    public RelativeLayout rl_movie_poster_box;

    @BindView
    public RelativeLayout rl_next_episode;

    @BindView
    public RelativeLayout rl_settings_box;
    public Animation s;

    @BindView
    public SeekBar sb_brightness;

    @BindView
    public SeekBar sb_volume;
    public Animation t;

    @BindView
    public TextView tv_autoplay_next_episode_button;

    @BindView
    public TextView tv_brightness;

    @BindView
    public TextView tv_casting_status_text;

    @BindView
    public TextView tv_current_season;

    @BindView
    public TextView tv_end_time;

    @BindView
    public TextView tv_episode_name;

    @BindView
    public TextView tv_seconds_left;

    @BindView
    public TextView tv_seek_count_left;

    @BindView
    public TextView tv_seek_count_right;

    @BindView
    public TextView tv_seek_left;

    @BindView
    public TextView tv_seek_right;

    @BindView
    public TextView tv_speed;

    @BindView
    public TextView tv_start_time;

    @BindView
    public TextView tv_sub_font_size;

    @BindView
    public TextView tv_volume;
    public Animation u;
    public Animation v;
    public Animation w;
    public Animation x;
    public Animation y;
    public Animation z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25665j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25666k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25667l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25668m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<GetEpisdoeDetailsCallback> f25669n = new ArrayList();
    public String C = BuildConfig.FLAVOR;
    public String h0 = BuildConfig.FLAVOR;
    public Boolean j0 = Boolean.TRUE;
    public int r0 = -1;
    public int s0 = -1;
    public int t0 = 0;
    public String u0 = BuildConfig.FLAVOR;
    public String v0 = BuildConfig.FLAVOR;
    public String w0 = BuildConfig.FLAVOR;
    public String x0 = BuildConfig.FLAVOR;
    public String y0 = BuildConfig.FLAVOR;
    public String z0 = BuildConfig.FLAVOR;
    public String D0 = BuildConfig.FLAVOR;
    public String E0 = BuildConfig.FLAVOR;
    public String F0 = BuildConfig.FLAVOR;
    public String G0 = BuildConfig.FLAVOR;
    public int J0 = 0;
    public float K0 = -1.0f;
    public boolean L0 = false;
    public String M0 = "mobile";
    public String S0 = BuildConfig.FLAVOR;
    public String T0 = BuildConfig.FLAVOR;
    public String U0 = BuildConfig.FLAVOR;
    public String V0 = BuildConfig.FLAVOR;
    public int W0 = 0;
    public int X0 = 0;
    public int Y0 = 0;
    public boolean f1 = false;
    public boolean g1 = false;
    public ArrayList<File> j1 = new ArrayList<>();
    public boolean l1 = c.h.a.h.n.a.c0;
    public final c.h.a.h.m.c m1 = new c.h.a.h.m.c(this);
    public NSTIJKPlayerEpisodes.g0 n1 = new g();

    public class a implements c.k.b.e {
        public a() {
        }

        @Override // c.k.b.e
        public void a() {
            HoneyPlayer.this.D1();
        }

        @Override // c.k.b.e
        public void onSuccess() {
            RelativeLayout relativeLayout = HoneyPlayer.this.rl_movie_poster_box;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
        }
    }

    public class b implements s<c.f.a.c.d.u.d> {
        public b() {
        }

        public final void a(c.f.a.c.d.u.d dVar) {
            HoneyPlayer.this.Q0 = dVar;
            try {
                String str = BuildConfig.FLAVOR;
                String strY = c.h.a.i.q.m.y(HoneyPlayer.this.q);
                if ((strY == null || !strY.equals("local")) && ((strY == null || !strY.equals("devicedata")) && (strY == null || !strY.equals("loadurl")))) {
                    if (strY != null && strY.equals("series")) {
                        str = HoneyPlayer.this.getResources().getString(R.string.season_number) + " - " + HoneyPlayer.this.V0;
                    }
                    MediaInfo mediaInfoA = c.h.a.h.m.a.a(HoneyPlayer.this.T0, str, BuildConfig.FLAVOR, 0, HoneyPlayer.this.S0, "videos/mp4", HoneyPlayer.this.U0, BuildConfig.FLAVOR, null);
                    NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
                    if (nSTIJKPlayerEpisodes != null) {
                        if (nSTIJKPlayerEpisodes.getCurrentPosition() != 0) {
                            HoneyPlayer honeyPlayer = HoneyPlayer.this;
                            honeyPlayer.W0 = honeyPlayer.mVideoView.getCurrentPosition();
                        }
                        c.h.a.h.m.a.c(HoneyPlayer.this.W0, true, mediaInfoA, HoneyPlayer.this.Q0, HoneyPlayer.this.q);
                    }
                } else {
                    HoneyPlayer.this.l1();
                }
            } catch (Exception e2) {
                Log.e("honey", "onApplicationConnected: " + e2.getMessage());
            }
            HoneyPlayer.this.invalidateOptionsMenu();
        }

        public final void b() {
            HoneyPlayer.this.invalidateOptionsMenu();
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
            Log.e("honey", "onSessionResuming");
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
            HoneyPlayer.this.Q0 = dVar;
            if (HoneyPlayer.this.Q0 != null) {
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
                if (nSTIJKPlayerEpisodes != null) {
                    nSTIJKPlayerEpisodes.y1();
                    HoneyPlayer.this.mVideoView.pause();
                }
                LinearLayout linearLayout = HoneyPlayer.this.ll_casting_to_tv;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                HoneyPlayer honeyPlayer = HoneyPlayer.this;
                if (honeyPlayer.tv_casting_status_text != null) {
                    if (honeyPlayer.Q0.o() == null || HoneyPlayer.this.Q0.o().J() == null) {
                        textView = HoneyPlayer.this.tv_casting_status_text;
                        sb = new StringBuilder();
                        string = HoneyPlayer.this.getResources().getString(R.string.connecting_please_wait);
                    } else {
                        textView = HoneyPlayer.this.tv_casting_status_text;
                        sb = new StringBuilder();
                        sb.append(HoneyPlayer.this.getResources().getString(R.string.connecting_to));
                        sb.append(" ");
                        string = HoneyPlayer.this.Q0.o().J();
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

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
            float f2;
            switch (i2) {
                case 0:
                    HoneyPlayer.this.p1("0.25x");
                    HoneyPlayer.this.tv_speed.setText(HoneyPlayer.this.getResources().getString(R.string.speed) + " (0.25x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
                    f2 = 0.25f;
                    break;
                case 1:
                    HoneyPlayer.this.p1("0.5x");
                    HoneyPlayer.this.tv_speed.setText(HoneyPlayer.this.getResources().getString(R.string.speed) + " (0.5x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
                    f2 = 0.5f;
                    break;
                case 2:
                    HoneyPlayer.this.p1("0.75x");
                    HoneyPlayer.this.tv_speed.setText(HoneyPlayer.this.getResources().getString(R.string.speed) + " (0.75x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
                    f2 = 0.75f;
                    break;
                case 3:
                    HoneyPlayer.this.p1("1x (Normal)");
                    HoneyPlayer.this.tv_speed.setText(HoneyPlayer.this.getResources().getString(R.string.speed) + " (1x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
                    f2 = 1.0f;
                    break;
                case 4:
                    HoneyPlayer.this.p1("1.25x");
                    HoneyPlayer.this.tv_speed.setText(HoneyPlayer.this.getResources().getString(R.string.speed) + " (1.25x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
                    f2 = 1.25f;
                    break;
                case 5:
                    HoneyPlayer.this.p1("1.5x");
                    HoneyPlayer.this.tv_speed.setText(HoneyPlayer.this.getResources().getString(R.string.speed) + " (1.5x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
                    f2 = 1.5f;
                    break;
                case 6:
                    HoneyPlayer.this.p1("1.75x");
                    HoneyPlayer.this.tv_speed.setText(HoneyPlayer.this.getResources().getString(R.string.speed) + " (1.75x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
                    f2 = 1.75f;
                    break;
                case 7:
                    HoneyPlayer.this.p1("2x");
                    HoneyPlayer.this.tv_speed.setText(HoneyPlayer.this.getResources().getString(R.string.speed) + " (2x)");
                    nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
                    f2 = 2.0f;
                    break;
                default:
                    return;
            }
            nSTIJKPlayerEpisodes.setSpeed(f2);
            dialogInterface.cancel();
        }
    }

    public class d implements DialogInterface.OnDismissListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
            if (nSTIJKPlayerEpisodes != null) {
                nSTIJKPlayerEpisodes.y1();
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HoneyPlayer.this.a1();
        }
    }

    public class f extends BroadcastReceiver {
        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
            int currentPosition;
            if (intent == null || !"media_control".equals(intent.getAction())) {
                return;
            }
            int intExtra = intent.getIntExtra("control_type", 0);
            if (intExtra == 1) {
                HoneyPlayer.this.mVideoView.start();
                if (Build.VERSION.SDK_INT >= 26) {
                    HoneyPlayer.this.H1(R.drawable.hplib_ic_pause, "pause", 2, 2);
                    return;
                }
                return;
            }
            if (intExtra == 2) {
                HoneyPlayer.this.mVideoView.pause();
                if (Build.VERSION.SDK_INT >= 26) {
                    HoneyPlayer.this.H1(R.drawable.hp_play, "play", 1, 1);
                    return;
                }
                return;
            }
            if (intExtra != 4) {
                if (intExtra != 5) {
                    return;
                }
                nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
                currentPosition = nSTIJKPlayerEpisodes.getCurrentPosition() + Constants.MAXIMUM_UPLOAD_PARTS;
            } else if (HoneyPlayer.this.mVideoView.getCurrentPosition() - 10000 <= 0) {
                HoneyPlayer.this.mVideoView.seekTo(0);
                return;
            } else {
                nSTIJKPlayerEpisodes = HoneyPlayer.this.mVideoView;
                currentPosition = nSTIJKPlayerEpisodes.getCurrentPosition() - 10000;
            }
            nSTIJKPlayerEpisodes.seekTo(currentPosition);
        }
    }

    public class g extends NSTIJKPlayerEpisodes.g0 {
        public g() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.g0
        public void a() {
            HoneyPlayer.this.H1(R.drawable.hplib_ic_pause, "pause", 2, 2);
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.g0
        public void b() {
            HoneyPlayer.this.H1(R.drawable.hp_play, "play", 1, 1);
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HoneyPlayer.this.b1();
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HoneyPlayer.this.z1();
        }
    }

    public class j implements c.k.b.e {
        public j() {
        }

        @Override // c.k.b.e
        public void a() {
            HoneyPlayer.this.D1();
        }

        @Override // c.k.b.e
        public void onSuccess() {
            RelativeLayout relativeLayout = HoneyPlayer.this.rl_movie_poster_box;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f25681b;

        public k(View view) {
            this.f25681b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25681b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25681b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25681b, "scaleY", f2);
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
            int i2;
            LinearLayout linearLayout;
            int i3;
            LinearLayout linearLayout2;
            View view5;
            View view6;
            View view7;
            if (z) {
                f2 = z ? 1.08f : 1.0f;
                View view8 = this.f25681b;
                if (view8 == null || view8.getTag() == null || !this.f25681b.getTag().equals("1")) {
                    View view9 = this.f25681b;
                    if (view9 == null || view9.getTag() == null || !this.f25681b.getTag().equals("2")) {
                        View view10 = this.f25681b;
                        if (view10 == null || view10.getTag() == null || !this.f25681b.getTag().equals("3")) {
                            View view11 = this.f25681b;
                            if ((view11 != null && view11.getTag() != null && this.f25681b.getTag().equals("4")) || (((view5 = this.f25681b) != null && view5.getTag() != null && this.f25681b.getTag().equals("5")) || (((view6 = this.f25681b) != null && view6.getTag() != null && this.f25681b.getTag().equals("6")) || ((view7 = this.f25681b) != null && view7.getTag() != null && this.f25681b.getTag().equals("7"))))) {
                                view.setBackground(HoneyPlayer.this.getResources().getDrawable(R.drawable.icon_shadow_light));
                                return;
                            }
                            View view12 = this.f25681b;
                            if (view12 != null && view12.getTag() != null && this.f25681b.getTag().equals("8")) {
                                return;
                            }
                            View view13 = this.f25681b;
                            if (view13 == null || view13.getTag() == null || !this.f25681b.getTag().equals("9")) {
                                View view14 = this.f25681b;
                                if (view14 == null || view14.getTag() == null || !this.f25681b.getTag().equals("10")) {
                                    View view15 = this.f25681b;
                                    i2 = R.drawable.blue_btn_effect;
                                    if (view15 == null || view15.getTag() == null || !this.f25681b.getTag().equals("11")) {
                                        View view16 = this.f25681b;
                                        if (view16 == null || view16.getTag() == null || !this.f25681b.getTag().equals("12")) {
                                            return;
                                        }
                                        linearLayout2 = HoneyPlayer.this.ll_season_button_main_layout;
                                    }
                                    linearLayout2 = HoneyPlayer.this.ll_play_button_main_layout;
                                } else {
                                    view.setBackground(HoneyPlayer.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                                    b(f2);
                                    c(f2);
                                    linearLayout = HoneyPlayer.this.ll_restart;
                                }
                            }
                        }
                        view.setBackground(HoneyPlayer.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                        b(f2);
                        c(f2);
                        return;
                    }
                    view.setBackground(HoneyPlayer.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                    b(f2);
                    c(f2);
                    linearLayout = HoneyPlayer.this.ll_audio_subtitle_settings;
                } else {
                    view.setBackground(HoneyPlayer.this.getResources().getDrawable(R.drawable.icon_shadow_focused));
                    b(f2);
                    c(f2);
                    linearLayout = HoneyPlayer.this.ll_back;
                }
                i3 = 0;
                linearLayout.setVisibility(i3);
                return;
            }
            if (z) {
                return;
            }
            f2 = z ? 1.08f : 1.0f;
            View view17 = this.f25681b;
            if (view17 == null || view17.getTag() == null || !this.f25681b.getTag().equals("1")) {
                View view18 = this.f25681b;
                if (view18 == null || view18.getTag() == null || !this.f25681b.getTag().equals("2")) {
                    View view19 = this.f25681b;
                    if (view19 == null || view19.getTag() == null || !this.f25681b.getTag().equals("3")) {
                        View view20 = this.f25681b;
                        if ((view20 != null && view20.getTag() != null && this.f25681b.getTag().equals("4")) || (((view2 = this.f25681b) != null && view2.getTag() != null && this.f25681b.getTag().equals("5")) || (((view3 = this.f25681b) != null && view3.getTag() != null && this.f25681b.getTag().equals("6")) || ((view4 = this.f25681b) != null && view4.getTag() != null && this.f25681b.getTag().equals("7"))))) {
                            view.setBackground(null);
                            return;
                        }
                        View view21 = this.f25681b;
                        if (view21 != null && view21.getTag() != null && this.f25681b.getTag().equals("8")) {
                            return;
                        }
                        View view22 = this.f25681b;
                        if (view22 == null || view22.getTag() == null || !this.f25681b.getTag().equals("9")) {
                            View view23 = this.f25681b;
                            if (view23 == null || view23.getTag() == null || !this.f25681b.getTag().equals("10")) {
                                View view24 = this.f25681b;
                                i2 = R.drawable.black_button_dark;
                                if (view24 == null || view24.getTag() == null || !this.f25681b.getTag().equals("11")) {
                                    View view25 = this.f25681b;
                                    if (view25 == null || view25.getTag() == null || !this.f25681b.getTag().equals("12")) {
                                        return;
                                    }
                                    linearLayout2 = HoneyPlayer.this.ll_season_button_main_layout;
                                }
                                linearLayout2 = HoneyPlayer.this.ll_play_button_main_layout;
                            } else {
                                view.setBackground(HoneyPlayer.this.getResources().getDrawable(R.drawable.icon_shadow));
                                b(f2);
                                c(f2);
                                a(z);
                                linearLayout = HoneyPlayer.this.ll_restart;
                            }
                        }
                    }
                    view.setBackground(HoneyPlayer.this.getResources().getDrawable(R.drawable.icon_shadow));
                    b(f2);
                    c(f2);
                    a(z);
                    return;
                }
                view.setBackground(HoneyPlayer.this.getResources().getDrawable(R.drawable.icon_shadow));
                b(f2);
                c(f2);
                a(z);
                linearLayout = HoneyPlayer.this.ll_audio_subtitle_settings;
            } else {
                view.setBackground(HoneyPlayer.this.getResources().getDrawable(R.drawable.icon_shadow));
                b(f2);
                c(f2);
                a(z);
                linearLayout = HoneyPlayer.this.ll_back;
            }
            i3 = 8;
            linearLayout.setVisibility(i3);
            return;
            linearLayout2.setBackgroundResource(i2);
        }
    }

    public static boolean P0() {
        ProgressBar progressBar = f25661f;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public static long S0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String U0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    public static String Z0(String str) {
        Matcher matcher = Pattern.compile("(?:youtube(?:-nocookie)?\\.com\\/(?:[^\\/\\n\\s]+\\/\\S+\\/|(?:v|e(?:mbed)?)\\/|\\S*?[?&]v=)|youtu\\.be\\/)([a-zA-Z0-9_-]{11})", 2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public void A1(int i2) {
        i iVar = new i();
        this.c1 = iVar;
        this.b1.postDelayed(iVar, i2);
    }

    public final void B1() {
        if (this.rl_settings_box.getVisibility() == 8) {
            this.rl_settings_box.startAnimation(this.y);
            this.rl_settings_box.setVisibility(0);
            this.iv_back_settings.requestFocus();
        }
    }

    public void C1() {
        Handler handler;
        if (f25663h || O0() || (handler = this.mVideoView.J1) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public void D1() {
        Handler handler = this.b1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        RelativeLayout relativeLayout = this.rl_movie_poster_box;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    public final int E1(int i2, int i3) {
        return this.E.Q(String.valueOf(i2), i3);
    }

    public final int F1(String str, int i2) {
        return this.Y.c2(str, i2);
    }

    public final void G1() {
        C1();
        if (this.B0.getVisibility() == 0) {
            a1();
        } else {
            x1();
            M0(5000);
        }
    }

    public void H1(int i2, String str, int i3, int i4) {
        try {
            if (this.M0.equals("mobile") && this.g1 && this.l1) {
                ArrayList arrayList = new ArrayList();
                PendingIntent broadcast = PendingIntent.getBroadcast(this, i4, new Intent("media_control").putExtra("control_type", i3), 0);
                Icon iconCreateWithResource = Icon.createWithResource(this, i2);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 4, new Intent("media_control").putExtra("control_type", 4), 0);
                PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 5, new Intent("media_control").putExtra("control_type", 5), 0);
                Icon iconCreateWithResource2 = Icon.createWithResource(this, R.drawable.hp_rewind);
                Icon iconCreateWithResource3 = Icon.createWithResource(this, R.drawable.hp_forward);
                arrayList.add(new RemoteAction(iconCreateWithResource2, "rewind", "rewind", broadcast2));
                arrayList.add(new RemoteAction(iconCreateWithResource, str, str, broadcast));
                arrayList.add(new RemoteAction(iconCreateWithResource3, "forward", "forward", broadcast3));
                this.h1.setActions(arrayList);
                setPictureInPictureParams(this.h1.build());
            }
        } catch (Exception unused) {
        }
    }

    public final void K0(Configuration configuration) {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        boolean z;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            nSTIJKPlayerEpisodes = this.mVideoView;
            z = false;
        } else {
            decorView.setSystemUiVisibility(256);
            nSTIJKPlayerEpisodes = this.mVideoView;
            z = true;
        }
        nSTIJKPlayerEpisodes.setAdjustViewBounds(z);
    }

    public void L0() {
        File[] fileArrB = c.h.a.h.n.e.B(this.q);
        for (File file : fileArrB) {
            if (file.toString().endsWith(".ts")) {
                Arrays.asList(file);
            }
        }
        if (fileArrB.length > 0) {
            ArrayList<File> arrayList = this.j1;
            if (arrayList != null) {
                arrayList.clear();
            }
            for (File file2 : fileArrB) {
                if (file2.toString().endsWith(".ts")) {
                    this.j1.addAll(Arrays.asList(file2));
                }
            }
            Collections.reverse(this.j1);
            this.i1 = this.j1;
        }
    }

    public final void M0(int i2) {
        if (f25663h) {
            return;
        }
        this.mVideoView.K1 = new e();
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        nSTIJKPlayerEpisodes.J1.postDelayed(nSTIJKPlayerEpisodes.K1, i2);
    }

    public void N0(int i2) {
        if (f25663h) {
            return;
        }
        this.mVideoView.K1 = new h();
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        nSTIJKPlayerEpisodes.J1.postDelayed(nSTIJKPlayerEpisodes.K1, i2);
    }

    public boolean O0() {
        RelativeLayout relativeLayout = this.rl_next_episode;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    public final void Q0() {
        int iRound;
        int iS;
        int iRound2;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        List<GetEpisdoeDetailsCallback> list = this.g0;
        if (list == null || list.size() <= 0) {
            return;
        }
        List<GetEpisdoeDetailsCallback> list2 = this.f25669n;
        if (list2 != null) {
            list2.clear();
        }
        if (this.D != null) {
            if (this.mVideoView != null) {
                this.H0 = this.q.getSharedPreferences("currentSeekTime", 0);
                long currentPosition = this.mVideoView.getCurrentPosition();
                SharedPreferences sharedPreferences = this.q.getSharedPreferences("currentSeekTime", 0);
                this.H0 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.I0 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.I0.apply();
                if ((this.mVideoView == null || c.h.a.k.e.a.f().b() == null || !this.W.equals("m3u")) && c.h.a.k.e.a.f() != null && c.h.a.k.e.a.f().e() != null && currentPosition != -1 && currentPosition != 0) {
                    ArrayList<GetEpisdoeDetailsCallback> arrayListC = this.F.c(c.h.a.k.e.a.f().e());
                    this.a1 = arrayListC;
                    if (arrayListC != null && arrayListC.size() > 0) {
                        try {
                            int iW0 = W0(this.g0, c.h.a.h.n.e.S(c.h.a.k.e.a.f().e()));
                            GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                            getEpisdoeDetailsCallback.G(this.g0.get(iW0).j());
                            getEpisdoeDetailsCallback.R(this.g0.get(iW0).u());
                            getEpisdoeDetailsCallback.x(this.g0.get(iW0).c());
                            getEpisdoeDetailsCallback.v(this.g0.get(iW0).a());
                            getEpisdoeDetailsCallback.N(this.g0.get(iW0).q());
                            getEpisdoeDetailsCallback.w(this.g0.get(iW0).b());
                            getEpisdoeDetailsCallback.D(String.valueOf(currentPosition));
                            getEpisdoeDetailsCallback.O(this.g0.get(iW0).r());
                            getEpisdoeDetailsCallback.H(this.g0.get(iW0).k());
                            getEpisdoeDetailsCallback.K(this.g0.get(iW0).n());
                            getEpisdoeDetailsCallback.J(this.g0.get(iW0).m());
                            getEpisdoeDetailsCallback.Q(this.g0.get(iW0).t());
                            getEpisdoeDetailsCallback.M(this.g0.get(iW0).p());
                            getEpisdoeDetailsCallback.E(this.g0.get(iW0).h());
                            getEpisdoeDetailsCallback.P(this.g0.get(iW0).s());
                            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.mVideoView;
                            getEpisdoeDetailsCallback.C(nSTIJKPlayerEpisodes2 != null ? String.valueOf(nSTIJKPlayerEpisodes2.getDuration() / 1000) : this.g0.get(iW0).f());
                            this.F.b(this.g0.get(iW0).j());
                            this.F.i(this.q, this.g0.get(iW0).r());
                            this.F.g(this.q, getEpisdoeDetailsCallback);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            ArrayList<GetEpisdoeDetailsCallback> arrayListR = this.D.r("getalldata");
            for (int i2 = 0; i2 < this.g0.size(); i2++) {
                if (this.g0.get(i2).p().equals(Integer.valueOf(this.X0))) {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback2 = this.g0.get(i2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayListR.size()) {
                            break;
                        }
                        if (this.g0.get(i2).j().equals(arrayListR.get(i3).j())) {
                            getEpisdoeDetailsCallback2.D(arrayListR.get(i3).g());
                            try {
                                iRound = Math.round(Integer.parseInt(arrayListR.get(i3).g()) / 1000.0f);
                            } catch (Exception unused2) {
                                iRound = 0;
                            }
                            try {
                                iS = (!getEpisdoeDetailsCallback2.f().equals(BuildConfig.FLAVOR) || (nSTIJKPlayerEpisodes = this.mVideoView) == null) ? c.h.a.h.n.e.S(getEpisdoeDetailsCallback2.f()) : nSTIJKPlayerEpisodes.getDuration() / 1000;
                            } catch (Exception unused3) {
                                iS = 0;
                            }
                            try {
                                iRound2 = Math.round((iRound / iS) * 100.0f);
                            } catch (Exception unused4) {
                                iRound2 = 0;
                            }
                            getEpisdoeDetailsCallback2.F(iRound2);
                        } else {
                            i3++;
                        }
                    }
                    this.f25669n.add(getEpisdoeDetailsCallback2);
                }
            }
        }
    }

    public final void R0(String str) {
        this.E.o(str);
    }

    public final void T0() {
        ImageView imageView = this.iv_play;
        imageView.setOnFocusChangeListener(new k(imageView));
        ImageView imageView2 = this.iv_pause;
        imageView2.setOnFocusChangeListener(new k(imageView2));
        ImageView imageView3 = this.iv_back;
        imageView3.setOnFocusChangeListener(new k(imageView3));
        SeekBar seekBar = this.hp_seekbar;
        seekBar.setOnFocusChangeListener(new k(seekBar));
        ImageView imageView4 = this.iv_audio_subtitle_track;
        imageView4.setOnFocusChangeListener(new k(imageView4));
        ImageView imageView5 = this.iv_hp_play_from_beginning;
        imageView5.setOnFocusChangeListener(new k(imageView5));
        LinearLayout linearLayout = this.ll_episodes;
        linearLayout.setOnFocusChangeListener(new k(linearLayout));
        LinearLayout linearLayout2 = this.ll_crop;
        linearLayout2.setOnFocusChangeListener(new k(linearLayout2));
        LinearLayout linearLayout3 = this.ll_playback_speed;
        linearLayout3.setOnFocusChangeListener(new k(linearLayout3));
        LinearLayout linearLayout4 = this.ll_next_episode;
        linearLayout4.setOnFocusChangeListener(new k(linearLayout4));
        ImageView imageView6 = this.iv_back_episodes;
        imageView6.setOnFocusChangeListener(new k(imageView6));
        ImageView imageView7 = this.iv_back_settings;
        imageView7.setOnFocusChangeListener(new k(imageView7));
        ImageView imageView8 = this.iv_hp_lock;
        imageView8.setOnFocusChangeListener(new k(imageView8));
        ImageView imageView9 = this.iv_hp_lock;
        imageView9.setOnFocusChangeListener(new k(imageView9));
        TextView textView = this.cancel_autoplay;
        textView.setOnFocusChangeListener(new k(textView));
        TextView textView2 = this.tv_autoplay_next_episode_button;
        textView2.setOnFocusChangeListener(new k(textView2));
    }

    public int V0(ArrayList<c.h.a.i.f> arrayList, int i2) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (c.h.a.h.n.e.S(arrayList.get(i3).Y()) == i2) {
                return i3;
            }
        }
        return 0;
    }

    public int W0(List<GetEpisdoeDetailsCallback> list, int i2) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (c.h.a.h.n.e.S(list.get(i3).j()) == i2) {
                return i3;
            }
        }
        return 0;
    }

    public final ArrayList<c.h.a.i.f> X0(int i2, int i3) {
        return this.E.x(String.valueOf(i2), i3);
    }

    public final c.h.a.i.f Y0(String str, int i2) {
        return this.Y.P1(str, i2);
    }

    public final void a1() {
        if (this.B0.getVisibility() == 0) {
            this.B0.startAnimation(this.x);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.x);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.x);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.x);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.x);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.x);
            }
            this.B0.setVisibility(8);
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
        this.mVideoView.h1 = false;
    }

    public void b1() {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.y1();
            this.mVideoView.z2.removeMessages(1);
        }
        if (f25663h || this.B0.getVisibility() != 0) {
            return;
        }
        this.B0.startAnimation(this.x);
        if (this.ll_brightness.getVisibility() == 0) {
            this.ll_brightness.startAnimation(this.x);
        }
        if (this.tv_seek_left.getVisibility() == 0) {
            this.tv_seek_left.startAnimation(this.x);
        }
        if (this.ll_pause_play.getVisibility() == 0) {
            this.ll_pause_play.startAnimation(this.x);
        }
        if (this.tv_seek_right.getVisibility() == 0) {
            this.tv_seek_right.startAnimation(this.x);
        }
        if (this.ll_volume.getVisibility() == 0) {
            this.ll_volume.startAnimation(this.x);
        }
        this.B0.setVisibility(8);
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

    public final void d1() {
        this.b1 = new Handler();
        this.A = new Handler();
        this.r = AnimationUtils.loadAnimation(this.q, R.anim.trans_top_in);
        this.s = AnimationUtils.loadAnimation(this.q, R.anim.trans_top_out);
        this.w = AnimationUtils.loadAnimation(this.q, R.anim.player_fade_in_animation);
        this.x = AnimationUtils.loadAnimation(this.q, R.anim.player_fade_out_animation);
        this.z = AnimationUtils.loadAnimation(this.q, R.anim.subtitle_slide_out_right);
        this.y = AnimationUtils.loadAnimation(this.q, R.anim.subtitle_slide_in_right);
        this.u = AnimationUtils.loadAnimation(this.q, R.anim.zoom_in);
        this.v = AnimationUtils.loadAnimation(this.q, R.anim.zoom_out);
        this.t = AnimationUtils.loadAnimation(this.q, R.anim.trans_bottom_in);
        try {
            v1();
        } catch (Exception unused) {
        }
        if (this.M0.equals("mobile")) {
            try {
                c.f.a.c.d.u.b bVarE = c.f.a.c.d.u.b.e(this);
                this.R0 = bVarE;
                this.Q0 = bVarE.c().c();
                c.f.a.c.d.u.a.b(getApplicationContext(), this.cast_button);
            } catch (Exception unused2) {
            }
        }
    }

    public void e1() {
        if (this.mVideoView == null) {
            return;
        }
        N0(0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            Rational rational = (this.mVideoView.K1() == 0 || this.mVideoView.J1() == 0) ? new Rational(this.mVideoView.getWidth(), this.mVideoView.getHeight()) : new Rational(this.mVideoView.K1(), this.mVideoView.J1());
            if (i2 >= 26) {
                try {
                    this.h1.setAspectRatio(rational).build();
                    enterPictureInPictureMode(this.h1.build());
                } catch (Exception unused) {
                    this.h1.setAspectRatio(new Rational(this.mVideoView.getWidth(), this.mVideoView.getHeight())).build();
                    enterPictureInPictureMode(this.h1.build());
                }
            }
        }
    }

    public final void f1() {
        List<GetEpisdoeDetailsCallback> list;
        int iD = c.h.a.k.e.a.f().d();
        String str = this.z0;
        str.hashCode();
        if (str.equals("series") && (list = this.g0) != null && list.size() > 0 && iD == this.g0.size() - 1) {
            c.h.a.k.e.a.f().o(0);
        } else {
            c.h.a.k.e.a.f().o(iD + 1);
        }
    }

    public void g1(String str) {
        a1();
        this.A0.a(R.id.app_video_status).d();
        this.A0.a(R.id.app_video_status_text).b(str);
    }

    public final void h1() {
        this.iv_play.setOnClickListener(this);
        this.iv_pause.setOnClickListener(this);
        this.ll_back_click.setOnClickListener(this);
        this.iv_back.setOnClickListener(this);
        this.hp_seekbar.setOnClickListener(this);
        this.ll_audio_subtitle_settings_click.setOnClickListener(this);
        this.iv_audio_subtitle_track.setOnClickListener(this);
        this.ll_episodes.setOnClickListener(this);
        this.ll_crop.setOnClickListener(this);
        this.ll_playback_speed.setOnClickListener(this);
        this.ll_next_episode.setOnClickListener(this);
        this.iv_back_episodes.setOnClickListener(this);
        this.iv_back_settings.setOnClickListener(this);
        this.ll_hp_lock_click.setOnClickListener(this);
        this.iv_unlock_button.setOnClickListener(this);
        this.iv_hp_play_from_beginning.setOnClickListener(this);
        if (Build.VERSION.SDK_INT >= 26) {
            this.mVideoView.setMovieListener(this.n1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i1(java.util.ArrayList<c.h.a.i.f> r31, int r32) {
        /*
            Method dump skipped, instruction units count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.i1(java.util.ArrayList, int):void");
    }

    public final void j1(ArrayList<File> arrayList, int i2) {
        String str;
        String str2;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        String name = arrayList.get(i2).getName();
        String strO0 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.h.a() + c.h.a.k.d.c.a.h.i());
        SimpleDateFormat simpleDateFormat = this.k0;
        if (S0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.q))), this.m0.format(this.l0)) >= c.h.a.k.d.c.a.d.p() && (str = this.p0) != null && this.q0 != null && (!f25659d.equals(str) || (this.p0 != null && (str2 = this.q0) != null && !f25660e.equals(str2)))) {
            this.j0 = Boolean.FALSE;
            this.A0.a(R.id.app_video_status).d();
            this.A0.a(R.id.app_video_status_text).b(strO0 + this.n0 + this.o0);
        }
        if (this.j0.booleanValue()) {
            c.h.a.k.e.a.f().o(i2);
            this.tv_episode_name.setText(name);
            r1();
            String str3 = this.X;
            this.S0 = str3;
            this.mVideoView.U1(str3, true, name, 0L, 0, BuildConfig.FLAVOR, null, 0, 0, this.W, "nst");
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
            if (nSTIJKPlayerEpisodes != null) {
                nSTIJKPlayerEpisodes.K = 0;
                nSTIJKPlayerEpisodes.M = false;
                nSTIJKPlayerEpisodes.start();
            }
        }
    }

    public final void k1(List<GetEpisdoeDetailsCallback> list, int i2) {
        int i3;
        String str;
        String str2;
        int i4;
        int i5;
        String str3;
        int i6;
        long jLongValue;
        int iS;
        int iRound;
        int iRound2;
        String str4;
        String str5;
        SharedPreferences.Editor editor;
        if (list == null || list.size() <= 0) {
            return;
        }
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        if (nSTIJKPlayerEpisodes != null && nSTIJKPlayerEpisodes.getPlayerIsPrepared()) {
            if (this.mVideoView.M0 == i2) {
                return;
            }
        }
        C1();
        x1();
        M0(5000);
        int iW0 = W0(list, i2);
        String strU = list.get(iW0).u();
        this.U0 = list.get(iW0).n();
        this.T0 = strU;
        this.V0 = String.valueOf(list.get(iW0).p());
        this.W0 = c.h.a.h.n.e.S(list.get(iW0).g());
        this.X0 = list.get(iW0).p().intValue();
        c.h.a.h.n.e.o0(c.h.a.k.d.c.a.h.a() + c.h.a.k.d.c.a.h.i());
        list.get(iW0).j();
        int iR = c.h.a.h.n.e.R(list.get(iW0).j());
        int i7 = this.s0;
        String strC = list.get(iW0).c();
        list.get(iW0).b();
        this.h0 = list.get(iW0).j();
        c.h.a.k.e.a.f().o(iW0);
        int iH = this.F.h(this.h0, c.h.a.i.q.m.z(this.q));
        SharedPreferences.Editor editor2 = this.Q;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideo", String.valueOf(list.get(iW0).j()));
            this.Q.apply();
        }
        String str6 = this.z0;
        if (str6 != null && str6.equals("series") && (editor = this.Q) != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(list.get(iW0).j()));
            this.Q.apply();
        }
        SharedPreferences.Editor editor3 = this.R;
        if (editor3 != null) {
            editor3.putString("currentlyPlayingVideoPosition", String.valueOf(iW0));
            this.R.apply();
        }
        SimpleDateFormat simpleDateFormat = this.k0;
        if (S0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.q))), this.m0.format(this.l0)) >= c.h.a.k.d.c.a.d.p() && (str4 = this.p0) != null && this.q0 != null && (!f25659d.equals(str4) || (this.p0 != null && (str5 = this.q0) != null && !f25660e.equals(str5)))) {
            this.j0 = Boolean.FALSE;
        }
        this.i0 = iR;
        this.tv_episode_name.setText(strU);
        if (iH == 0 && this.j0.booleanValue()) {
            r1();
            this.mVideoView.setProgress(false);
            if (this.W.equals("m3u")) {
                c.h.a.k.e.a.f().l("m3u");
                String str7 = this.B;
                this.S0 = str7;
                i4 = i7;
                str3 = strU;
                this.mVideoView.U1(str7, true, strU, 0L, 0, BuildConfig.FLAVOR, null, iW0, 0, this.W, "nst");
                i3 = iW0;
                str = InstructionFileId.DOT;
                str2 = strC;
                i5 = iR;
            } else {
                i4 = i7;
                str3 = strU;
                String strValueOf = String.valueOf(Uri.parse(this.X + iR + InstructionFileId.DOT + strC));
                this.S0 = strValueOf;
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.mVideoView;
                ArrayList<c.h.a.i.f> arrayList = this.f0;
                String str8 = this.W;
                str2 = strC;
                str = InstructionFileId.DOT;
                i3 = iW0;
                i5 = iR;
                nSTIJKPlayerEpisodes2.U1(strValueOf, true, str3, 0L, iR, BuildConfig.FLAVOR, arrayList, iW0, 0, str8, "nst");
            }
            c.h.a.i.a.c().f(list);
            c.h.a.k.e.a.f().p(this.h0);
            c.h.a.k.e.a.f().t(i5);
            c.h.a.k.e.a.f().n(list);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.mVideoView;
            i6 = 0;
            nSTIJKPlayerEpisodes3.K = 0;
            nSTIJKPlayerEpisodes3.M = false;
            nSTIJKPlayerEpisodes3.start();
        } else {
            i3 = iW0;
            str = InstructionFileId.DOT;
            str2 = strC;
            i4 = i7;
            i5 = iR;
            str3 = strU;
            i6 = 0;
        }
        if (iH <= 0 || this.F.a(this.h0) <= 0) {
            return;
        }
        try {
            jLongValue = this.D.w(this.h0).longValue();
        } catch (Exception unused) {
            jLongValue = 0;
        }
        if (i4 == 0) {
            iS = c.h.a.h.n.e.S(this.D.v(this.h0).toString());
            this.s0 = iS;
        } else {
            iS = i4;
        }
        if (this.mVideoView == null || !this.j0.booleanValue()) {
            return;
        }
        r1();
        String strValueOf2 = String.valueOf(Uri.parse(this.X + this.h0 + str + str2));
        this.S0 = strValueOf2;
        this.mVideoView.setProgress(true);
        c.h.a.k.e.a.f().u(jLongValue);
        this.mVideoView.setCurrentPositionSeekbar((int) jLongValue);
        try {
            iRound = Math.round(c.h.a.h.n.e.S(String.valueOf(jLongValue)) / 1000.0f);
        } catch (Exception unused2) {
            iRound = 0;
            iS = 0;
        }
        try {
            iRound2 = Math.round((iRound / iS) * 100.0f);
        } catch (Exception unused3) {
            iRound2 = 0;
        }
        if (iRound2 >= 99) {
            this.mVideoView.setCurrentPositionSeekbar(i6);
        }
        c.h.a.i.a.c().f(list);
        c.h.a.k.e.a.f().p(this.h0);
        this.mVideoView.U1(strValueOf2, true, str3, 0L, i5, BuildConfig.FLAVOR, this.f0, i3, 0, this.W, "nst");
        this.mVideoView.start();
    }

    public final void l1() {
        MediaInfo mediaInfoA;
        c.f.a.c.d.u.d dVar;
        try {
            String strY = c.h.a.i.q.m.y(this.q);
            boolean zEquals = strY.equals("loadurl");
            String strSubstring = BuildConfig.FLAVOR;
            if (zEquals) {
                String str = this.F0;
                this.G0 = str;
                int iLastIndexOf = str.lastIndexOf(47);
                if (iLastIndexOf > 1) {
                    strSubstring = this.G0.substring(iLastIndexOf + 1);
                }
                String str2 = this.G0;
                this.S0 = str2;
                mediaInfoA = c.h.a.h.m.a.a(strSubstring, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, str2, "videos/mp4", this.U0, BuildConfig.FLAVOR, null);
                dVar = this.Q0;
            } else {
                int ipAddress = ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
                String str3 = String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
                String strSubstring2 = InstructionFileId.DOT;
                if (strY.equals("devicedata")) {
                    this.G0 = this.F0;
                }
                int iLastIndexOf2 = this.G0.lastIndexOf(47);
                if (iLastIndexOf2 > 1) {
                    strSubstring = this.G0.substring(iLastIndexOf2 + 1);
                    strSubstring2 = this.G0.substring(0, iLastIndexOf2);
                }
                this.m1.b();
                this.m1.a(str3, strSubstring2);
                String str4 = "http://" + str3 + ":8080/" + strSubstring;
                this.S0 = str4;
                mediaInfoA = c.h.a.h.m.a.a(strSubstring, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, str4, "videos/mp4", this.U0, BuildConfig.FLAVOR, null);
                dVar = this.Q0;
            }
            c.h.a.h.m.a.c(0, true, mediaInfoA, dVar, this.q);
        } catch (Exception unused) {
        }
    }

    public void m1(String str, int i2, String str2, String str3) {
        if (this.mVideoView != null) {
            RelativeLayout relativeLayout = this.rl_episodes_box;
            if (relativeLayout != null) {
                relativeLayout.startAnimation(this.x);
                this.rl_episodes_box.setVisibility(8);
            }
            this.v0 = str2;
            TextView textView = this.tv_episode_name;
            if (textView != null) {
                textView.setText(str2);
            }
            SeekBar seekBar = this.hp_seekbar;
            if (seekBar != null) {
                seekBar.setProgress(0);
            }
            k1(this.g0, i2);
        }
    }

    public final void n1() {
        try {
            SharedPreferences.Editor editorEdit = this.N0.edit();
            this.O0 = editorEdit;
            if (editorEdit != null) {
                editorEdit.putString("pref.using_playback_speed", "1x (Normal)");
                this.O0.apply();
            }
            this.tv_speed.setText(getResources().getString(R.string.speed) + " (1x)");
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o1() {
        /*
            r17 = this;
            r0 = r17
            r1 = 8
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            r2 = 0
            java.lang.String r3 = "0.25x"
            r1[r2] = r3
            r4 = 1
            java.lang.String r5 = "0.5x"
            r1[r4] = r5
            r6 = 2
            java.lang.String r7 = "0.75x"
            r1[r6] = r7
            r8 = 3
            java.lang.String r9 = "1x (Normal)"
            r1[r8] = r9
            r10 = 4
            java.lang.String r11 = "1.25x"
            r1[r10] = r11
            r12 = 5
            java.lang.String r13 = "1.5x"
            r1[r12] = r13
            r14 = 6
            java.lang.String r15 = "1.75x"
            r1[r14] = r15
            r16 = 7
            java.lang.String r2 = "2x"
            r1[r16] = r2
            a.b.k.b$a r4 = new a.b.k.b$a
            r4.<init>(r0)
            android.content.res.Resources r6 = r17.getResources()
            r8 = 2132018290(0x7f140472, float:1.9674882E38)
            java.lang.String r6 = r6.getString(r8)
            r4.setTitle(r6)
            android.content.SharedPreferences r6 = r0.N0
            java.lang.String r8 = "pref.using_playback_speed"
            java.lang.String r6 = r6.getString(r8, r9)
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L52
        L50:
            r2 = 0
            goto L89
        L52:
            boolean r3 = r6.equals(r5)
            if (r3 == 0) goto L5a
            r2 = 1
            goto L89
        L5a:
            boolean r3 = r6.equals(r7)
            if (r3 == 0) goto L62
            r2 = 2
            goto L89
        L62:
            boolean r3 = r6.equals(r9)
            if (r3 == 0) goto L6a
            r2 = 3
            goto L89
        L6a:
            boolean r3 = r6.equals(r11)
            if (r3 == 0) goto L72
            r2 = 4
            goto L89
        L72:
            boolean r3 = r6.equals(r13)
            if (r3 == 0) goto L7a
            r2 = 5
            goto L89
        L7a:
            boolean r3 = r6.equals(r15)
            if (r3 == 0) goto L82
            r2 = 6
            goto L89
        L82:
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L50
            r2 = 7
        L89:
            com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer$c r3 = new com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer$c
            r3.<init>()
            r4.l(r1, r2, r3)
            a.b.k.b r1 = r4.create()
            r0.d1 = r1
            com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer$d r2 = new com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer$d
            r2.<init>()
            r1.setOnDismissListener(r2)
            a.b.k.b r1 = r0.d1
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.o1():void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2 = this.rl_movie_poster_box;
        if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0) {
            D1();
            return;
        }
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.y1();
        }
        RelativeLayout relativeLayout3 = this.rl_next_episode;
        if (relativeLayout3 != null && relativeLayout3.getVisibility() == 0) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.mVideoView;
            if (nSTIJKPlayerEpisodes2 != null) {
                nSTIJKPlayerEpisodes2.v1();
                return;
            }
            return;
        }
        RelativeLayout relativeLayout4 = this.rl_episodes_box;
        if (relativeLayout4 == null || relativeLayout4.getVisibility() != 0) {
            C1();
            if (this.rl_settings_box.getVisibility() != 0) {
                if (this.B0.getVisibility() != 0) {
                    c.h.a.h.n.a.V = true;
                    if (this.M0.equals("mobile") && this.g1 && this.l1) {
                        try {
                            e1();
                            return;
                        } catch (Exception unused) {
                        }
                    }
                    super.onBackPressed();
                    return;
                }
                if (this.B0.getVisibility() == 0) {
                    this.B0.startAnimation(this.x);
                    if (this.ll_brightness.getVisibility() == 0) {
                        this.ll_brightness.startAnimation(this.x);
                    }
                    if (this.tv_seek_left.getVisibility() == 0) {
                        this.tv_seek_left.startAnimation(this.x);
                    }
                    if (this.ll_pause_play.getVisibility() == 0) {
                        this.ll_pause_play.startAnimation(this.x);
                    }
                    if (this.tv_seek_right.getVisibility() == 0) {
                        this.tv_seek_right.startAnimation(this.x);
                    }
                    if (this.ll_volume.getVisibility() == 0) {
                        this.ll_volume.startAnimation(this.x);
                    }
                    this.B0.setVisibility(8);
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
                return;
            }
            this.rl_settings_box.startAnimation(this.z);
            relativeLayout = this.rl_settings_box;
        } else {
            this.rl_episodes_box.startAnimation(this.x);
            relativeLayout = this.rl_episodes_box;
        }
        relativeLayout.setVisibility(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v28 */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        int i2;
        String str;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2;
        int iS;
        String str2;
        long jLongValue;
        int iRound;
        int iRound2;
        ?? r4;
        StringBuilder sb;
        String str3;
        String str4;
        String strValueOf;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3;
        boolean z;
        String str5;
        String str6;
        String str7;
        int i3;
        ArrayList<c.h.a.i.f> arrayList;
        long j2;
        int i4;
        String str8;
        int i5;
        String str9;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes4;
        switch (view.getId()) {
            case R.id.hp_seekbar /* 2131428067 */:
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes5 = this.mVideoView;
                nSTIJKPlayerEpisodes5.seekTo(nSTIJKPlayerEpisodes5.getNewSeekPosition());
                this.mVideoView.start();
                C1();
                a1();
                break;
            case R.id.iv_audio_subtitle_track /* 2131428108 */:
            case R.id.ll_audio_subtitle_settings_click /* 2131428295 */:
                C1();
                a1();
                B1();
                break;
            case R.id.iv_back /* 2131428110 */:
            case R.id.ll_back_click /* 2131428298 */:
                onBackPressed();
                onBackPressed();
                break;
            case R.id.iv_back_episodes /* 2131428114 */:
            case R.id.iv_back_settings /* 2131428116 */:
                onBackPressed();
                break;
            case R.id.iv_hp_play_from_beginning /* 2131428152 */:
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes6 = this.mVideoView;
                if (nSTIJKPlayerEpisodes6 != null && nSTIJKPlayerEpisodes6.getPlayerIsPrepared()) {
                    C1();
                    a1();
                    this.mVideoView.seekTo(0);
                    this.mVideoView.start();
                    break;
                }
                break;
            case R.id.iv_pause /* 2131428173 */:
                boolean zEquals = this.M0.equals("tv");
                C1();
                if (!zEquals) {
                    y1();
                    this.mVideoView.pause();
                    this.mVideoView.d();
                    this.iv_pause.setVisibility(8);
                    imageView = this.iv_play;
                    i2 = 0;
                    imageView.setVisibility(i2);
                    break;
                } else {
                    x1();
                    this.mVideoView.pause();
                    this.mVideoView.d();
                    this.iv_pause.setVisibility(8);
                    this.iv_play.setVisibility(0);
                    this.iv_play.requestFocus();
                    String str10 = this.z0;
                    if (str10 != null && str10.equals("series") && this.mVideoView.getPlayerIsPrepared() && (nSTIJKPlayerEpisodes = this.mVideoView) != null && !nSTIJKPlayerEpisodes.isPlaying()) {
                        D1();
                        A1(Constants.MAXIMUM_UPLOAD_PARTS);
                        break;
                    }
                }
                break;
            case R.id.iv_play /* 2131428174 */:
                if (!this.M0.equals("tv")) {
                    if (!this.mVideoView.getPlayerIsPrepared()) {
                        i2 = 0;
                        C1();
                        y1();
                        N0(5000);
                        imageView = this.iv_play;
                        imageView.setVisibility(i2);
                    } else {
                        C1();
                        y1();
                        N0(1000);
                        this.mVideoView.start();
                        this.mVideoView.d();
                        this.iv_play.setVisibility(8);
                        imageView = this.iv_pause;
                        i2 = 0;
                        imageView.setVisibility(i2);
                    }
                } else if (!this.mVideoView.getPlayerIsPrepared()) {
                    C1();
                    x1();
                    M0(5000);
                    this.iv_play.setVisibility(0);
                    this.iv_play.requestFocus();
                } else {
                    C1();
                    x1();
                    M0(1000);
                    this.mVideoView.start();
                    this.mVideoView.d();
                    this.iv_play.setVisibility(8);
                    this.iv_pause.setVisibility(0);
                    this.iv_pause.requestFocus();
                    D1();
                }
                break;
            case R.id.iv_unlock_button /* 2131428204 */:
                C1();
                f25663h = false;
                this.ll_screen_locked.startAnimation(this.s);
                this.ll_screen_locked.setVisibility(8);
                y1();
                N0(3000);
                break;
            case R.id.ll_chromecast_click /* 2131428324 */:
                C1();
                a1();
                break;
            case R.id.ll_crop /* 2131428328 */:
                C1();
                M0(5000);
                D1();
                if (this.M0.equals("tv") && (str = this.z0) != null && str.equals("series") && this.mVideoView.getPlayerIsPrepared() && (nSTIJKPlayerEpisodes2 = this.mVideoView) != null && !nSTIJKPlayerEpisodes2.isPlaying()) {
                    A1(Constants.MAXIMUM_UPLOAD_PARTS);
                }
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes7 = this.mVideoView;
                if (nSTIJKPlayerEpisodes7 != null) {
                    nSTIJKPlayerEpisodes7.m2();
                }
                break;
            case R.id.ll_episodes /* 2131428367 */:
                C1();
                a1();
                Q0();
                w1();
                break;
            case R.id.ll_hp_lock_click /* 2131428383 */:
                C1();
                a1();
                f25663h = true;
                this.mVideoView.Y1();
                this.mVideoView.l1(3000);
                break;
            case R.id.ll_next_episode /* 2131428412 */:
                String str11 = this.z0;
                if (str11 != null && !str11.equals("movies")) {
                    C1();
                    a1();
                    f1();
                    SeekBar seekBar = this.hp_seekbar;
                    if (seekBar != null) {
                        seekBar.setProgress(0);
                    }
                    int iD = c.h.a.k.e.a.f().d();
                    String str12 = this.z0;
                    str12.hashCode();
                    if (str12.equals("series")) {
                        List<GetEpisdoeDetailsCallback> list = this.g0;
                        if (list == null || list.size() <= 1 || iD > this.g0.size() - 1) {
                            f25664i = false;
                            iS = 0;
                        } else {
                            this.v0 = this.g0.get(iD).u();
                            this.y0 = this.g0.get(iD).c();
                            this.w0 = this.g0.get(iD).j();
                            this.U0 = this.g0.get(iD).n();
                            this.T0 = this.v0;
                            this.W0 = c.h.a.h.n.e.S(this.g0.get(iD).g());
                            this.V0 = String.valueOf(this.g0.get(iD).p());
                            this.X0 = this.g0.get(iD).p().intValue();
                            iS = (!this.g0.get(iD).f().equals(BuildConfig.FLAVOR) || (nSTIJKPlayerEpisodes4 = this.mVideoView) == null) ? c.h.a.h.n.e.R(this.g0.get(iD).f()) : nSTIJKPlayerEpisodes4.getDuration() / 1000;
                            this.t0 = c.h.a.h.n.e.S(this.w0);
                            this.r0 = c.h.a.h.n.e.R(this.w0);
                            this.h0 = this.g0.get(iD).j();
                            this.tv_episode_name.setText(this.v0);
                            f25664i = true;
                        }
                    } else {
                        iS = 0;
                    }
                    this.T.clear();
                    this.T.apply();
                    this.U.clear();
                    this.U.apply();
                    this.S.clear();
                    this.S.apply();
                    if (f25664i && this.j0.booleanValue()) {
                        r1();
                        c.h.a.k.e.a.f().p(this.h0);
                        int iH = this.F.h(this.h0, c.h.a.i.q.m.z(this.q));
                        if (iH == 0) {
                            this.mVideoView.setProgress(false);
                            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes8 = this.mVideoView;
                            nSTIJKPlayerEpisodes8.K = 0;
                            nSTIJKPlayerEpisodes8.M = false;
                            if (!this.W.equals("m3u") || (str9 = this.z0) == null || str9.equals("recording")) {
                                String str13 = this.z0;
                                if (str13 == null || !str13.equals("recording")) {
                                    strValueOf = String.valueOf(Uri.parse(this.X + this.r0 + InstructionFileId.DOT + this.y0));
                                    this.S0 = strValueOf;
                                    nSTIJKPlayerEpisodes3 = this.mVideoView;
                                    z = true;
                                    str5 = this.v0;
                                    int i6 = this.r0;
                                    String str14 = this.x0;
                                    ArrayList<c.h.a.i.f> arrayList2 = this.f0;
                                    int i7 = this.t0;
                                    str6 = "nst";
                                    str7 = this.W;
                                    i3 = i7;
                                    arrayList = arrayList2;
                                    j2 = 0;
                                    i4 = i6;
                                    str8 = str14;
                                    i5 = iD;
                                } else {
                                    strValueOf = this.X;
                                    this.S0 = strValueOf;
                                    nSTIJKPlayerEpisodes3 = this.mVideoView;
                                    z = true;
                                    str5 = this.v0;
                                    j2 = 0;
                                    i4 = 0;
                                    arrayList = null;
                                    i5 = 0;
                                    i3 = 0;
                                    String str15 = this.W;
                                    str8 = BuildConfig.FLAVOR;
                                    str6 = "nst";
                                    str7 = str15;
                                }
                                nSTIJKPlayerEpisodes3.U1(strValueOf, z, str5, j2, i4, str8, arrayList, i5, i3, str7, str6);
                            } else {
                                String str16 = this.B;
                                this.S0 = str16;
                                this.mVideoView.U1(str16, true, this.v0, 0L, 0, BuildConfig.FLAVOR, null, iD, 0, this.W, "nst");
                                c.h.a.k.e.a.f().l("m3u");
                            }
                            this.mVideoView.start();
                        }
                        if (iH > 0) {
                            if (this.F.a(this.h0) > 0) {
                                try {
                                    jLongValue = this.D.w(this.h0).longValue();
                                } catch (Exception unused) {
                                    jLongValue = 0;
                                }
                                if (iS == 0) {
                                    iS = c.h.a.h.n.e.S(this.D.v(this.h0).toString());
                                    this.s0 = iS;
                                }
                                if (this.mVideoView != null) {
                                    c.h.a.k.e.a.f().u(jLongValue);
                                    this.mVideoView.setProgress(true);
                                    this.mVideoView.setCurrentPositionSeekbar((int) jLongValue);
                                    try {
                                        iRound = Math.round(c.h.a.h.n.e.S(String.valueOf(jLongValue)) / 1000.0f);
                                    } catch (Exception unused2) {
                                        iS = 0;
                                        iRound = 0;
                                    }
                                    try {
                                        iRound2 = Math.round((iRound / iS) * 100.0f);
                                    } catch (Exception unused3) {
                                        iRound2 = 0;
                                    }
                                    if (iRound2 >= 99) {
                                        r4 = 0;
                                        this.mVideoView.setCurrentPositionSeekbar(0);
                                    } else {
                                        r4 = 0;
                                    }
                                    NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes9 = this.mVideoView;
                                    nSTIJKPlayerEpisodes9.K = r4;
                                    nSTIJKPlayerEpisodes9.M = r4;
                                    if (!this.W.equals("m3u") || (str3 = this.z0) == null || str3.equals("recording")) {
                                        String str17 = this.z0;
                                        if (str17 == null || !str17.equals("recording")) {
                                            sb = new StringBuilder();
                                            sb.append(this.X);
                                            sb.append(this.r0);
                                            sb.append(InstructionFileId.DOT);
                                            sb.append(this.y0);
                                            String strValueOf2 = String.valueOf(Uri.parse(sb.toString()));
                                            this.S0 = strValueOf2;
                                            this.mVideoView.U1(strValueOf2, true, this.v0, 0L, this.r0, this.x0, this.f0, iD, this.t0, this.W, "nst");
                                            this.mVideoView.start();
                                        }
                                        String str18 = this.X;
                                        this.S0 = str18;
                                        this.mVideoView.U1(str18, true, this.v0, 0L, 0, BuildConfig.FLAVOR, null, 0, 0, this.W, "nst");
                                        this.mVideoView.start();
                                    }
                                    String str19 = this.B;
                                    this.S0 = str19;
                                    this.mVideoView.U1(str19, true, this.v0, 0L, 0, BuildConfig.FLAVOR, null, iD, 0, this.W, "nst");
                                    c.h.a.k.e.a.f().l("m3u");
                                    this.mVideoView.start();
                                }
                            } else {
                                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes10 = this.mVideoView;
                                if (nSTIJKPlayerEpisodes10 != null) {
                                    nSTIJKPlayerEpisodes10.setProgress(false);
                                    NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes11 = this.mVideoView;
                                    nSTIJKPlayerEpisodes11.K = 0;
                                    nSTIJKPlayerEpisodes11.M = false;
                                    if (!this.W.equals("m3u") || (str4 = this.z0) == null || str4.equals("recording")) {
                                        String str20 = this.z0;
                                        if (str20 == null || !str20.equals("recording")) {
                                            sb = new StringBuilder();
                                            sb.append(this.X);
                                            sb.append(this.r0);
                                            sb.append(InstructionFileId.DOT);
                                            sb.append(this.y0);
                                            String strValueOf22 = String.valueOf(Uri.parse(sb.toString()));
                                            this.S0 = strValueOf22;
                                            this.mVideoView.U1(strValueOf22, true, this.v0, 0L, this.r0, this.x0, this.f0, iD, this.t0, this.W, "nst");
                                            this.mVideoView.start();
                                        }
                                        String str182 = this.X;
                                        this.S0 = str182;
                                        this.mVideoView.U1(str182, true, this.v0, 0L, 0, BuildConfig.FLAVOR, null, 0, 0, this.W, "nst");
                                        this.mVideoView.start();
                                    }
                                    String str192 = this.B;
                                    this.S0 = str192;
                                    this.mVideoView.U1(str192, true, this.v0, 0L, 0, BuildConfig.FLAVOR, null, iD, 0, this.W, "nst");
                                    c.h.a.k.e.a.f().l("m3u");
                                    this.mVideoView.start();
                                }
                            }
                        }
                        String str21 = this.z0;
                        if ((str21 == null || !str21.equals("movies")) && (str2 = this.z0) != null && str2.equals("series")) {
                            c.h.a.k.e.a.f().p(this.h0);
                            c.h.a.i.a.c().f(this.g0);
                            c.h.a.k.e.a.f().t(c.h.a.h.n.e.R(this.g0.get(iD).j()));
                            c.h.a.k.e.a.f().n(this.g0);
                        }
                        c.h.a.k.e.a.f().o(iD);
                    }
                    String str22 = this.z0;
                    str22.hashCode();
                    if (str22.equals("series")) {
                        this.i0 = c.h.a.h.n.e.R(this.g0.get(iD).j());
                        SharedPreferences.Editor editor = this.Q;
                        if (editor != null) {
                            editor.putString("currentlyPlayingVideo", String.valueOf(this.g0.get(iD).j()));
                            this.Q.apply();
                        }
                    }
                    SharedPreferences.Editor editor2 = this.R;
                    if (editor2 != null) {
                        editor2.putString("currentlyPlayingVideoPosition", String.valueOf(iD));
                        this.R.apply();
                    }
                    break;
                }
                break;
            case R.id.ll_playback_speed /* 2131428434 */:
                C1();
                a1();
                o1();
                break;
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K0(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x030e  */
    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r49) {
        /*
            Method dump skipped, instruction units count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.onCreate(android.os.Bundle):void");
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        TextView textView;
        super.onDestroy();
        try {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
            if (nSTIJKPlayerEpisodes != null && (textView = nSTIJKPlayerEpisodes.r1) != null) {
                textView.performClick();
            }
        } catch (Exception e2) {
            Log.e("fsgd", "fdfh", e2);
        }
        try {
            r1();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        boolean z = keyEvent.getRepeatCount() == 0;
        String str = this.z0;
        if (str != null && str.equals("series") && this.M0.equals("tv") && i2 != 4) {
            D1();
            if (this.mVideoView.getPlayerIsPrepared() && (nSTIJKPlayerEpisodes = this.mVideoView) != null && !nSTIJKPlayerEpisodes.isPlaying()) {
                A1(Constants.MAXIMUM_UPLOAD_PARTS);
            }
        }
        if (i2 != 46) {
            if (i2 != 62) {
                if (i2 != 66) {
                    if (i2 != 79 && i2 != 85 && i2 != 86) {
                        if (i2 != 89) {
                            if (i2 != 90) {
                                if (i2 != 126 && i2 != 127) {
                                    if (i2 != 274) {
                                        if (i2 != 275) {
                                            switch (i2) {
                                                case 19:
                                                    C1();
                                                    this.mVideoView.d();
                                                    if (this.rl_settings_box.getVisibility() != 0 && this.rl_episodes_box.getVisibility() != 0 && this.rl_next_episode.getVisibility() != 0 && this.rl_next_episode.getVisibility() != 0) {
                                                        if (this.B0.getVisibility() == 8) {
                                                            this.B0.startAnimation(this.w);
                                                            this.B0.setVisibility(0);
                                                            this.iv_play.requestFocus();
                                                            this.iv_pause.requestFocus();
                                                        }
                                                        M0(5000);
                                                    }
                                                    return true;
                                                case 20:
                                                    C1();
                                                    this.mVideoView.d();
                                                    if (this.rl_settings_box.getVisibility() != 0 && this.rl_episodes_box.getVisibility() != 0 && this.rl_next_episode.getVisibility() != 0 && this.rl_next_episode.getVisibility() != 0) {
                                                        if (this.B0.getVisibility() == 8) {
                                                            this.B0.startAnimation(this.w);
                                                            this.B0.setVisibility(0);
                                                            this.iv_play.requestFocus();
                                                            this.iv_pause.requestFocus();
                                                        }
                                                        M0(5000);
                                                    }
                                                    return true;
                                                case 21:
                                                    C1();
                                                    this.mVideoView.d();
                                                    if (this.rl_settings_box.getVisibility() == 0 || this.rl_episodes_box.getVisibility() == 0) {
                                                        return false;
                                                    }
                                                    if (this.rl_next_episode.getVisibility() != 0 && this.rl_next_episode.getVisibility() != 0) {
                                                        if (this.B0.getVisibility() == 8) {
                                                            this.B0.startAnimation(this.w);
                                                            this.B0.setVisibility(0);
                                                            if (!this.hp_seekbar.isFocused()) {
                                                                this.hp_seekbar.requestFocus();
                                                            }
                                                        }
                                                        if (this.hp_seekbar.isFocused()) {
                                                            D1();
                                                        } else {
                                                            M0(5000);
                                                        }
                                                    }
                                                    return true;
                                                case 22:
                                                    C1();
                                                    this.mVideoView.d();
                                                    if (this.rl_settings_box.getVisibility() == 0 || this.rl_episodes_box.getVisibility() == 0) {
                                                        return false;
                                                    }
                                                    if (this.rl_next_episode.getVisibility() != 0 && this.rl_next_episode.getVisibility() != 0) {
                                                        if (this.B0.getVisibility() == 8) {
                                                            this.B0.startAnimation(this.w);
                                                            this.B0.setVisibility(0);
                                                            if (!this.hp_seekbar.isFocused()) {
                                                                this.hp_seekbar.requestFocus();
                                                            }
                                                        }
                                                        if (this.hp_seekbar.isFocused()) {
                                                            D1();
                                                        } else {
                                                            M0(5000);
                                                        }
                                                    }
                                                    return true;
                                                case 23:
                                                    break;
                                                default:
                                                    return super.onKeyUp(i2, keyEvent);
                                            }
                                        }
                                    }
                                }
                            }
                            try {
                                C1();
                                if (this.B0.getVisibility() == 8) {
                                    this.B0.startAnimation(this.w);
                                    this.B0.setVisibility(0);
                                    if (!this.hp_seekbar.isFocused()) {
                                        this.hp_seekbar.requestFocus();
                                    }
                                }
                                M0(5000);
                                this.hp_seekbar.setProgress(this.hp_seekbar.getProgress() + 10);
                                this.mVideoView.L1(this.hp_seekbar.getProgress());
                            } catch (Exception unused) {
                            }
                            return true;
                        }
                        try {
                            C1();
                            if (this.B0.getVisibility() == 8) {
                                this.B0.startAnimation(this.w);
                                this.B0.setVisibility(0);
                                if (!this.hp_seekbar.isFocused()) {
                                    this.hp_seekbar.requestFocus();
                                }
                            }
                            M0(5000);
                            this.hp_seekbar.setProgress(this.hp_seekbar.getProgress() - 10);
                            this.mVideoView.L1(this.hp_seekbar.getProgress());
                        } catch (Exception unused2) {
                        }
                        return true;
                    }
                }
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.mVideoView;
                if (nSTIJKPlayerEpisodes2 == null || !nSTIJKPlayerEpisodes2.getPlayerIsPrepared()) {
                    G1();
                } else if (this.rl_settings_box.getVisibility() == 8) {
                    (this.mVideoView.isPlaying() ? this.iv_pause : this.iv_play).performClick();
                }
                return true;
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.mVideoView;
            if (nSTIJKPlayerEpisodes3 != null && nSTIJKPlayerEpisodes3.getPlayerIsPrepared()) {
                ((!z || this.mVideoView.isPlaying()) ? this.iv_pause : this.iv_play).performClick();
            }
        }
        return true;
    }

    @Override // a.l.d.e, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", true);
        setIntent(intent);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        String str = this.z0;
        if (str == null || !str.equals("movies")) {
            String str2 = this.z0;
            if (str2 != null && str2.equals("series")) {
                Q0();
            }
        } else {
            s1(0);
        }
        getIntent().getAction();
        try {
            c.f.a.c.d.u.b bVar = this.R0;
            if (bVar != null) {
                bVar.c().e(this.Z0, c.f.a.c.d.u.d.class);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (z) {
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
                if (nSTIJKPlayerEpisodes != null && nSTIJKPlayerEpisodes.i0 != null) {
                    nSTIJKPlayerEpisodes.setShowOrHideSubtitles("gone");
                    this.mVideoView.i0.setVisibility(8);
                }
                f fVar = new f();
                this.e1 = fVar;
                registerReceiver(fVar, new IntentFilter("media_control"));
                return;
            }
            unregisterReceiver(this.e1);
            this.f1 = false;
            this.e1 = null;
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.mVideoView;
            if (nSTIJKPlayerEpisodes2 != null && nSTIJKPlayerEpisodes2.i0 != null) {
                nSTIJKPlayerEpisodes2.setShowOrHideSubtitles("visible");
                this.mVideoView.i0.setVisibility(0);
                this.mVideoView.y1();
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.mVideoView;
            if (nSTIJKPlayerEpisodes3 != null) {
                nSTIJKPlayerEpisodes3.isPlaying();
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        AppOpsManager appOpsManager;
        super.onResume();
        Context context = this.q;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("auto_start", 0);
            this.k1 = sharedPreferences;
            boolean z = sharedPreferences.getBoolean("picinpic", c.h.a.h.n.a.c0);
            this.l1 = z;
            if (z && this.M0.equals("mobile")) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 26) {
                    this.h1 = new PictureInPictureParams.Builder();
                }
                if (i2 >= 26) {
                    try {
                        if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.q.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.q.getPackageName()) == 0) {
                            this.g1 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        String str = this.z0;
        if (str == null || !str.equals("series")) {
            String str2 = this.z0;
            if (str2 != null && str2.equals("movies")) {
                Intent intent = getIntent();
                if (intent != null && intent.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
                    intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
                    setIntent(intent);
                    if (getIntent().getIntExtra("OPENED_STREAM_ID", 0) != this.r0) {
                        this.Z = p.b().g();
                        q1();
                    }
                }
            }
        } else {
            Intent intent2 = getIntent();
            if (intent2 != null && intent2.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
                intent2.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
                setIntent(intent2);
                if (getIntent().getIntExtra("OPENED_STREAM_ID", 0) != this.r0) {
                    this.g0 = c.h.a.i.a.c().b();
                    q1();
                }
            }
        }
        c.h.a.h.n.e.g(this.q);
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.y1();
            if (this.L0) {
                f25662g = false;
            }
        }
        c.f.a.c.d.u.b bVar = this.R0;
        if (bVar != null) {
            bVar.c().a(this.Z0, c.f.a.c.d.u.d.class);
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            r1();
            if (this.M0.equals("mobile") && this.g1 && this.l1 && Build.VERSION.SDK_INT >= 21) {
                finishAndRemoveTask();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (this.M0.equals("mobile") && this.g1 && this.l1 && !isInPictureInPictureMode()) {
            try {
                e1();
                this.f1 = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            K0(getResources().getConfiguration());
        }
    }

    public final void p1(String str) {
        SharedPreferences.Editor editorEdit = this.N0.edit();
        this.O0 = editorEdit;
        if (editorEdit != null) {
            editorEdit.putString("pref.using_playback_speed", str);
            this.O0.apply();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:175:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q1() {
        /*
            Method dump skipped, instruction units count: 2100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.q1():void");
    }

    public final void r1() {
        try {
            if (this.mVideoView != null) {
                this.H0 = this.q.getSharedPreferences("currentSeekTime", 0);
                long currentPosition = this.mVideoView.getCurrentPosition();
                SharedPreferences sharedPreferences = this.q.getSharedPreferences("currentSeekTime", 0);
                this.H0 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.I0 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.I0.apply();
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
                if (nSTIJKPlayerEpisodes != null && currentPosition != -1 && currentPosition != 0) {
                    nSTIJKPlayerEpisodes.setCurrentPositionSeekbar(nSTIJKPlayerEpisodes.getCurrentPosition());
                    this.mVideoView.setProgress(true);
                    this.mVideoView.I1(true);
                }
                String str = this.z0;
                if (str == null || !str.equals("movies")) {
                    String str2 = this.z0;
                    if (str2 != null && str2.equals("series") && ((this.mVideoView == null || c.h.a.k.e.a.f().b() == null || !this.W.equals("m3u")) && c.h.a.k.e.a.f() != null && c.h.a.k.e.a.f().e() != null && currentPosition != -1 && currentPosition != 0)) {
                        ArrayList<GetEpisdoeDetailsCallback> arrayListC = this.F.c(c.h.a.k.e.a.f().e());
                        this.a1 = arrayListC;
                        if (arrayListC != null && arrayListC.size() > 0) {
                            try {
                                int iW0 = W0(this.g0, c.h.a.h.n.e.S(c.h.a.k.e.a.f().e()));
                                GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                                getEpisdoeDetailsCallback.G(this.g0.get(iW0).j());
                                getEpisdoeDetailsCallback.R(this.g0.get(iW0).u());
                                getEpisdoeDetailsCallback.x(this.g0.get(iW0).c());
                                getEpisdoeDetailsCallback.v(this.g0.get(iW0).a());
                                getEpisdoeDetailsCallback.N(this.g0.get(iW0).q());
                                getEpisdoeDetailsCallback.w(this.g0.get(iW0).b());
                                getEpisdoeDetailsCallback.D(String.valueOf(currentPosition));
                                getEpisdoeDetailsCallback.O(this.g0.get(iW0).r());
                                getEpisdoeDetailsCallback.H(this.g0.get(iW0).k());
                                getEpisdoeDetailsCallback.K(this.g0.get(iW0).n());
                                getEpisdoeDetailsCallback.J(this.g0.get(iW0).m());
                                getEpisdoeDetailsCallback.Q(this.g0.get(iW0).t());
                                getEpisdoeDetailsCallback.M(this.g0.get(iW0).p());
                                getEpisdoeDetailsCallback.E(this.g0.get(iW0).h());
                                getEpisdoeDetailsCallback.P(this.g0.get(iW0).s());
                                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.mVideoView;
                                getEpisdoeDetailsCallback.C(nSTIJKPlayerEpisodes2 != null ? String.valueOf(nSTIJKPlayerEpisodes2.getDuration() / 1000) : this.g0.get(iW0).f());
                                this.F.b(this.g0.get(iW0).j());
                                this.F.i(this.q, this.g0.get(iW0).r());
                                this.F.g(this.q, getEpisdoeDetailsCallback);
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else {
                    s1(1);
                }
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.mVideoView;
            if (nSTIJKPlayerEpisodes3 != null) {
                if (nSTIJKPlayerEpisodes3.C1()) {
                    this.mVideoView.s1();
                } else {
                    this.mVideoView.h2();
                    this.mVideoView.G1(true);
                    this.mVideoView.d2();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused2) {
        }
    }

    public final void s1(int i2) {
        long currentPosition;
        ArrayList<c.h.a.i.f> arrayListX0;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        if (nSTIJKPlayerEpisodes != null) {
            if (i2 == 0) {
                this.H0 = this.q.getSharedPreferences("currentSeekTime", 0);
                currentPosition = this.mVideoView.getCurrentPosition();
                SharedPreferences sharedPreferences = this.q.getSharedPreferences("currentSeekTime", 0);
                this.H0 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.I0 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.I0.apply();
            } else {
                currentPosition = nSTIJKPlayerEpisodes.getCurrentPosition();
            }
            long j2 = currentPosition;
            new c.h.a.i.f();
            if (this.W.equals("m3u")) {
                Y0(String.valueOf(Uri.parse(this.B)), c.h.a.i.q.m.z(this.q));
                return;
            }
            if (this.mVideoView == null || c.h.a.k.e.a.f().k() == -1 || j2 == -1 || j2 == 0 || (arrayListX0 = X0(this.r0, c.h.a.i.q.m.z(this.q))) == null || arrayListX0.size() <= 0) {
                return;
            }
            try {
                int iV0 = V0(this.Z, this.r0);
                R0(this.Z.get(iV0).Y());
                t1(this.q, this.Z, iV0, j2);
            } catch (Exception unused) {
            }
        }
    }

    public void t1(Context context, ArrayList<c.h.a.i.f> arrayList, int i2, long j2) {
        String strP = arrayList.get(i2).P();
        String name = arrayList.get(i2).getName();
        String strZ = arrayList.get(i2).Z();
        String strY = arrayList.get(i2).Y();
        String strX = arrayList.get(i2).X();
        String strI = arrayList.get(i2).I();
        String strF = arrayList.get(i2).f();
        String strG = arrayList.get(i2).g();
        String strD = arrayList.get(i2).D();
        String strA0 = arrayList.get(i2).a0();
        String strF2 = arrayList.get(i2).F();
        String strB0 = arrayList.get(i2).b0();
        String strD0 = arrayList.get(i2).d0();
        String strB = arrayList.get(i2).B();
        String strW = arrayList.get(i2).W();
        String strM = arrayList.get(i2).M();
        String strC = arrayList.get(i2).C();
        String.valueOf(arrayList.get(i2).N());
        String strValueOf = String.valueOf(arrayList.get(i2).T());
        String strValueOf2 = String.valueOf(arrayList.get(i2).S());
        PanelAvailableChannelsPojo panelAvailableChannelsPojo = new PanelAvailableChannelsPojo();
        panelAvailableChannelsPojo.H(Integer.valueOf(c.h.a.h.n.e.S(strP)));
        panelAvailableChannelsPojo.G(name);
        panelAvailableChannelsPojo.N(strZ);
        panelAvailableChannelsPojo.M(strY);
        panelAvailableChannelsPojo.L(strX);
        panelAvailableChannelsPojo.C(strI);
        panelAvailableChannelsPojo.w(strF);
        panelAvailableChannelsPojo.x(strG);
        panelAvailableChannelsPojo.A(strD);
        panelAvailableChannelsPojo.O(Integer.valueOf(c.h.a.h.n.e.S(strA0)));
        panelAvailableChannelsPojo.B(strF2);
        panelAvailableChannelsPojo.P(strB0);
        panelAvailableChannelsPojo.Q(strD0);
        panelAvailableChannelsPojo.y(strB);
        panelAvailableChannelsPojo.K(strW);
        panelAvailableChannelsPojo.D(strM);
        panelAvailableChannelsPojo.z(strC);
        panelAvailableChannelsPojo.R(c.h.a.i.q.m.z(context));
        long j3 = 0;
        try {
            panelAvailableChannelsPojo.F(j2);
        } catch (Exception unused) {
            panelAvailableChannelsPojo.F(0L);
        }
        int i3 = this.s0;
        if (i3 != 0) {
            try {
                panelAvailableChannelsPojo.E(i3);
            } catch (Exception unused2) {
                panelAvailableChannelsPojo.E(j3);
            }
            panelAvailableChannelsPojo.J(strValueOf);
            panelAvailableChannelsPojo.I(strValueOf2);
            this.E.d(panelAvailableChannelsPojo);
        }
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        if (nSTIJKPlayerEpisodes != null) {
            int duration = nSTIJKPlayerEpisodes.getDuration() / 1000;
            this.s0 = duration;
            j3 = duration;
        }
        panelAvailableChannelsPojo.E(j3);
        panelAvailableChannelsPojo.J(strValueOf);
        panelAvailableChannelsPojo.I(strValueOf2);
        this.E.d(panelAvailableChannelsPojo);
    }

    public final void u1() {
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.q, 1);
            this.p = gridLayoutManager;
            this.myRecyclerView.setLayoutManager(gridLayoutManager);
            this.myRecyclerView.setItemAnimator(new a.y.e.c());
        }
    }

    public final void v1() {
        this.Z0 = new b();
    }

    public final void w1() {
        this.B0.startAnimation(this.x);
        this.B0.setVisibility(8);
        this.rl_episodes_box.startAnimation(this.w);
        this.rl_episodes_box.setVisibility(0);
        List<GetEpisdoeDetailsCallback> list = this.f25669n;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.tv_current_season.setText(getResources().getString(R.string.season_number) + " - " + this.f25669n.get(0).p());
        try {
            u1();
            EpisodeDetailAdapter episodeDetailAdapter = new EpisodeDetailAdapter(this.q, null, null, null, "from_player", this.M0);
            this.f25670o = episodeDetailAdapter;
            this.myRecyclerView.setAdapter(episodeDetailAdapter);
            this.myRecyclerView.requestFocus();
        } catch (Exception unused) {
        }
    }

    public void x1() {
        if (f25663h || O0() || this.rl_settings_box.getVisibility() != 8 || this.B0.getVisibility() != 8) {
            return;
        }
        this.B0.startAnimation(this.w);
        this.B0.setVisibility(0);
    }

    public void y1() {
        if (f25663h || O0() || this.B0.getVisibility() != 8) {
            return;
        }
        this.B0.startAnimation(this.w);
        this.B0.setVisibility(0);
        if (this.ll_brightness.getVisibility() == 8) {
            this.ll_brightness.startAnimation(this.w);
            this.ll_brightness.setVisibility(0);
        }
        if (this.tv_seek_left.getVisibility() == 8) {
            this.tv_seek_left.startAnimation(this.w);
            this.tv_seek_left.setVisibility(0);
        }
        if (this.ll_pause_play.getVisibility() == 8) {
            this.ll_pause_play.startAnimation(this.w);
            this.ll_pause_play.setVisibility(0);
        }
        if (this.tv_seek_right.getVisibility() == 8) {
            this.tv_seek_right.startAnimation(this.w);
            this.tv_seek_right.setVisibility(0);
        }
        if (this.ll_volume.getVisibility() == 8) {
            this.ll_volume.startAnimation(this.w);
            this.ll_volume.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z1() {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer.z1():void");
    }
}
