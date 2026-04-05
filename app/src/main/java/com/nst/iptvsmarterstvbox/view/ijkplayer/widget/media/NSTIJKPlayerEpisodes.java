package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TextView;
import c.h.a.k.d.c.a.c;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback;
import com.nst.iptvsmarterstvbox.model.pojo.PanelAvailableChannelsPojo;
import com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.renderer.DefaultRenderer;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerEpisodes extends FrameLayout implements MediaController.MediaPlayerControl, c.h.a.k.f.m, View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f29492b = {0, 1, 2, 3, 4, 5};
    public int A;
    public SeekBar A0;
    public RadioGroup A1;
    public IMediaPlayer.OnVideoSizeChangedListener A2;
    public long B;
    public boolean B0;
    public RadioGroup B1;
    public IMediaPlayer.OnPreparedListener B2;
    public boolean C;
    public TextView C0;
    public SharedPreferences.Editor C1;
    public IMediaPlayer.OnCompletionListener C2;
    public boolean D;
    public TextView D0;
    public TextView D1;
    public final View.OnClickListener D2;
    public boolean E;
    public StringBuilder E0;
    public FrameLayout E1;
    public IMediaPlayer.OnInfoListener E2;
    public int F;
    public Formatter F0;
    public a.b.k.b F1;
    public IMediaPlayer.OnErrorListener F2;
    public Handler G;
    public SharedPreferences G0;
    public SeekBar G1;
    public IMediaPlayer.OnBufferingUpdateListener G2;
    public Handler H;
    public SharedPreferences.Editor H0;
    public SeekBar H1;
    public IMediaPlayer.OnSeekCompleteListener H2;
    public int I;
    public c.h.a.i.q.k I0;
    public LinearLayout I1;
    public IMediaPlayer.OnTimedTextListener I2;
    public boolean J;
    public c.h.a.i.q.f J0;
    public Handler J1;
    public c.a J2;
    public int K;
    public c.h.a.i.q.j K0;
    public Runnable K1;
    public int K2;
    public int L;
    public boolean L0;
    public Handler L1;
    public int L2;
    public boolean M;
    public int M0;
    public Runnable M1;
    public List<Integer> M2;
    public SharedPreferences N;
    public int N0;
    public Handler N1;
    public int N2;
    public SharedPreferences.Editor O;
    public long O0;
    public Handler O1;
    public int O2;
    public SharedPreferences P;
    public int P0;
    public Handler P1;
    public boolean P2;
    public Context Q;
    public boolean Q0;
    public Runnable Q1;
    public c.h.a.k.d.a.a R;
    public String R0;
    public boolean R1;
    public c.h.a.k.d.c.a.c S;
    public String S0;
    public Animation S1;
    public int T;
    public String T0;
    public Animation T1;
    public int U;
    public ArrayList<c.h.a.i.f> U0;
    public TextView U1;
    public c.h.a.k.d.c.a.d V;
    public boolean V0;
    public TextView V1;
    public long W;
    public SharedPreferences W0;
    public LinearLayout W1;
    public SharedPreferences X0;
    public LinearLayout X1;
    public SharedPreferences Y0;
    public int Y1;
    public SharedPreferences Z0;
    public TextView Z1;
    public SharedPreferences a1;
    public TextView a2;
    public SharedPreferences.Editor b1;
    public LinearLayout b2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29493c;
    public SharedPreferences.Editor c1;
    public String c2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f29494d;
    public SharedPreferences.Editor d1;
    public String d2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29495e;
    public int e1;
    public TextView e2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, String> f29496f;
    public long f0;
    public boolean f1;
    public TextView f2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29497g;
    public long g0;
    public boolean g1;
    public FrameLayout g2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29498h;
    public long h0;
    public boolean h1;
    public FrameLayout h2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29499i;
    public TextView i0;
    public boolean i1;
    public Animation i2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.b f29500j;
    public String j0;
    public c.h.a.i.q.l j1;
    public Animation j2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IMediaPlayer f29501k;
    public Activity k0;
    public boolean k1;
    public RelativeLayout k2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29502l;
    public NSTIJKPlayerEpisodes l0;
    public c.h.a.k.a.m l1;
    public Animation l2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29503m;
    public AudioManager m0;
    public SharedPreferences m1;
    public LinearLayout m2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29504n;
    public int n0;
    public c.h.a.j.j n1;
    public Animation n2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29505o;
    public float o0;
    public RelativeLayout o1;
    public Animation o2;
    public int p;
    public GestureDetector p0;
    public ImageView p1;
    public SharedPreferences p2;
    public c.h.a.k.d.c.a.b q;
    public int q0;
    public int q1;
    public RelativeLayout q2;
    public IMediaPlayer.OnCompletionListener r;
    public View r0;
    public TextView r1;
    public boolean r2;
    public IMediaPlayer.OnPreparedListener s;
    public j0 s0;
    public TextView s1;
    public boolean s2;
    public int t;
    public Button t0;
    public TextView t1;
    public int t2;
    public IMediaPlayer.OnErrorListener u;
    public Boolean u0;
    public LinearLayout u1;
    public boolean u2;
    public IMediaPlayer.OnInfoListener v;
    public Boolean v0;
    public boolean v1;
    public g0 v2;
    public int w;
    public Boolean w0;
    public TextView w1;
    public final SeekBar.OnSeekBarChangeListener w2;
    public boolean x;
    public Boolean x0;
    public TextView x1;
    public final SeekBar.OnSeekBarChangeListener x2;
    public boolean y;
    public Boolean y0;
    public TextView y1;
    public final SeekBar.OnSeekBarChangeListener y2;
    public boolean z;
    public Boolean z0;
    public RadioGroup z1;
    public Handler z2;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerEpisodes.this.F1();
        }
    }

    public class a0 implements View.OnTouchListener {
        public a0() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return motionEvent != null && NSTIJKPlayerEpisodes.this.p0.onTouchEvent(motionEvent);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEpisodes.this.x1();
        }
    }

    public class b0 extends Handler {
        public b0(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                NSTIJKPlayerEpisodes.this.S1();
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                if (nSTIJKPlayerEpisodes.h1 || !nSTIJKPlayerEpisodes.C) {
                    return;
                }
                NSTIJKPlayerEpisodes.this.z2.sendMessageDelayed(NSTIJKPlayerEpisodes.this.z2.obtainMessage(1), 300L);
                NSTIJKPlayerEpisodes.this.q2();
                return;
            }
            if (i2 == 2) {
                NSTIJKPlayerEpisodes.this.t1(false);
                return;
            }
            if (i2 == 3) {
                if (NSTIJKPlayerEpisodes.this.B >= 0) {
                    NSTIJKPlayerEpisodes.this.l0.seekTo((int) NSTIJKPlayerEpisodes.this.B);
                    NSTIJKPlayerEpisodes.this.B = -1L;
                    return;
                }
                return;
            }
            if (i2 != 4) {
                return;
            }
            NSTIJKPlayerEpisodes.this.s0.b(R.id.app_video_volume_box).a();
            NSTIJKPlayerEpisodes.this.s0.b(R.id.app_video_brightness_box).a();
            NSTIJKPlayerEpisodes.this.s0.b(R.id.app_video_fastForward_box).a();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEpisodes.this.w1();
        }
    }

    public class c0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f29511b;

        public c0(long j2) {
            this.f29511b = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activity;
            StringBuilder sb;
            Resources resources;
            int i2;
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes.K++;
            nSTIJKPlayerEpisodes.u1();
            if (NSTIJKPlayerEpisodes.this.S0.equals("dfo") || NSTIJKPlayerEpisodes.this.S0.equals("devicedata")) {
                activity = NSTIJKPlayerEpisodes.this.k0;
                sb = new StringBuilder();
                resources = NSTIJKPlayerEpisodes.this.k0.getResources();
                i2 = R.string.can_not_play;
            } else {
                activity = NSTIJKPlayerEpisodes.this.k0;
                sb = new StringBuilder();
                resources = NSTIJKPlayerEpisodes.this.k0.getResources();
                i2 = R.string.play_back_error;
            }
            sb.append(resources.getString(i2));
            sb.append(" (");
            sb.append(NSTIJKPlayerEpisodes.this.K);
            sb.append("/");
            sb.append(NSTIJKPlayerEpisodes.this.L);
            sb.append(")");
            c.h.a.h.n.e.l0(activity, sb.toString());
            NSTIJKPlayerEpisodes.this.l0.setProgress(true);
            if (this.f29511b != 0) {
                NSTIJKPlayerEpisodes.this.l0.setCurrentPositionSeekbar((int) this.f29511b);
            }
            NSTIJKPlayerEpisodes.this.E1();
            NSTIJKPlayerEpisodes.this.start();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            String str;
            if (NSTIJKPlayerEpisodes.this.l0.getCurrentPosition() + NSTIJKPlayerEpisodes.this.Y1 > 0) {
                NSTIJKPlayerEpisodes.this.l0.seekTo(NSTIJKPlayerEpisodes.this.l0.getCurrentPosition() + NSTIJKPlayerEpisodes.this.Y1);
            } else {
                NSTIJKPlayerEpisodes.this.l0.seekTo(0);
            }
            NSTIJKPlayerEpisodes.this.Y1 = 0;
            NSTIJKPlayerEpisodes.this.h2.startAnimation(NSTIJKPlayerEpisodes.this.T1);
            NSTIJKPlayerEpisodes.this.h2.setVisibility(8);
            if (NSTIJKPlayerEpisodes.this.d2 == null || !NSTIJKPlayerEpisodes.this.d2.equals("catch_up")) {
                textView = NSTIJKPlayerEpisodes.this.U1;
                str = "-10s";
            } else {
                textView = NSTIJKPlayerEpisodes.this.U1;
                str = "-60s";
            }
            textView.setText(str);
            if (NSTIJKPlayerEpisodes.this.I1.getVisibility() == 8) {
                NSTIJKPlayerEpisodes.this.U1.startAnimation(NSTIJKPlayerEpisodes.this.T1);
                NSTIJKPlayerEpisodes.this.U1.setVisibility(8);
            }
            NSTIJKPlayerEpisodes.this.k1(1000);
        }
    }

    public class d0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29514b;

        public d0(int i2) {
            this.f29514b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2 = this.f29514b;
            if (i2 != 0) {
                NSTIJKPlayerEpisodes.this.p1(i2);
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this.l0;
            double duration = NSTIJKPlayerEpisodes.this.l0.getDuration();
            double progress = NSTIJKPlayerEpisodes.this.A0.getProgress();
            Double.isNaN(progress);
            Double.isNaN(duration);
            nSTIJKPlayerEpisodes.seekTo((int) (duration * ((progress * 1.0d) / 1000.0d)));
            NSTIJKPlayerEpisodes.this.l0.start();
            NSTIJKPlayerEpisodes.this.z2.removeMessages(1);
            NSTIJKPlayerEpisodes.this.m0.setStreamMute(3, false);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes2.h1 = false;
            nSTIJKPlayerEpisodes2.z2.sendEmptyMessageDelayed(1, 1000L);
            NSTIJKPlayerEpisodes.this.k1(1000);
        }
    }

    public class e0 implements View.OnClickListener {
        public e0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerEpisodes.this.v1();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            String str;
            NSTIJKPlayerEpisodes.this.l0.seekTo(NSTIJKPlayerEpisodes.this.l0.getCurrentPosition() + NSTIJKPlayerEpisodes.this.Y1);
            NSTIJKPlayerEpisodes.this.Y1 = 0;
            NSTIJKPlayerEpisodes.this.g2.startAnimation(NSTIJKPlayerEpisodes.this.T1);
            NSTIJKPlayerEpisodes.this.g2.setVisibility(8);
            if (NSTIJKPlayerEpisodes.this.d2 == null || !NSTIJKPlayerEpisodes.this.d2.equals("catch_up")) {
                textView = NSTIJKPlayerEpisodes.this.V1;
                str = "+10s";
            } else {
                textView = NSTIJKPlayerEpisodes.this.V1;
                str = "+60s";
            }
            textView.setText(str);
            if (NSTIJKPlayerEpisodes.this.I1.getVisibility() == 8) {
                NSTIJKPlayerEpisodes.this.V1.startAnimation(NSTIJKPlayerEpisodes.this.T1);
                NSTIJKPlayerEpisodes.this.V1.setVisibility(8);
            }
            NSTIJKPlayerEpisodes.this.k1(1000);
        }
    }

    public class f0 implements View.OnClickListener {
        public f0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerEpisodes.this.F1();
        }
    }

    public class g implements IMediaPlayer.OnVideoSizeChangedListener {
        public g() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i2, int i3, int i4, int i5) {
            NSTIJKPlayerEpisodes.this.f29502l = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerEpisodes.this.f29503m = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerEpisodes.this.T = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerEpisodes.this.U = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerEpisodes.this.f29502l == 0 || NSTIJKPlayerEpisodes.this.f29503m == 0) {
                return;
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            c.h.a.k.d.c.a.c cVar = nSTIJKPlayerEpisodes.S;
            if (cVar != null) {
                cVar.a(nSTIJKPlayerEpisodes.f29502l, NSTIJKPlayerEpisodes.this.f29503m);
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
                nSTIJKPlayerEpisodes2.S.b(nSTIJKPlayerEpisodes2.T, NSTIJKPlayerEpisodes.this.U);
            }
            NSTIJKPlayerEpisodes.this.requestLayout();
        }
    }

    public static abstract class g0 {
        public abstract void a();

        public abstract void b();
    }

    public class h implements IMediaPlayer.OnPreparedListener {
        public h() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerEpisodes.this.f0 = System.currentTimeMillis();
            NSTIJKPlayerEpisodes.this.V.n(NSTIJKPlayerEpisodes.this.f0 - NSTIJKPlayerEpisodes.this.W);
            NSTIJKPlayerEpisodes.this.f29498h = 2;
            if (NSTIJKPlayerEpisodes.this.s != null) {
                NSTIJKPlayerEpisodes.this.s.onPrepared(NSTIJKPlayerEpisodes.this.f29501k);
            }
            if (NSTIJKPlayerEpisodes.this.q != null) {
                NSTIJKPlayerEpisodes.this.q.setEnabled(true);
            }
            NSTIJKPlayerEpisodes.this.f29502l = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerEpisodes.this.f29503m = iMediaPlayer.getVideoHeight();
            int i2 = NSTIJKPlayerEpisodes.this.w;
            if (i2 != 0) {
                NSTIJKPlayerEpisodes.this.seekTo(i2);
            }
            if (NSTIJKPlayerEpisodes.this.f29502l == 0 || NSTIJKPlayerEpisodes.this.f29503m == 0) {
                if (NSTIJKPlayerEpisodes.this.f29499i == 3) {
                    NSTIJKPlayerEpisodes.this.start();
                    return;
                }
                return;
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            c.h.a.k.d.c.a.c cVar = nSTIJKPlayerEpisodes.S;
            if (cVar != null) {
                cVar.a(nSTIJKPlayerEpisodes.f29502l, NSTIJKPlayerEpisodes.this.f29503m);
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
                nSTIJKPlayerEpisodes2.S.b(nSTIJKPlayerEpisodes2.T, NSTIJKPlayerEpisodes.this.U);
                if (!NSTIJKPlayerEpisodes.this.S.c() || (NSTIJKPlayerEpisodes.this.f29504n == NSTIJKPlayerEpisodes.this.f29502l && NSTIJKPlayerEpisodes.this.f29505o == NSTIJKPlayerEpisodes.this.f29503m)) {
                    if (NSTIJKPlayerEpisodes.this.f29499i == 3) {
                        NSTIJKPlayerEpisodes.this.start();
                        if (NSTIJKPlayerEpisodes.this.q != null) {
                            NSTIJKPlayerEpisodes.this.q.show();
                            return;
                        }
                        return;
                    }
                    if (NSTIJKPlayerEpisodes.this.isPlaying()) {
                        return;
                    }
                    if ((i2 != 0 || NSTIJKPlayerEpisodes.this.getCurrentPosition() > 0) && NSTIJKPlayerEpisodes.this.q != null) {
                        NSTIJKPlayerEpisodes.this.q.show(0);
                    }
                }
            }
        }
    }

    public class h0 implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f29522b;

        public h0(View view) {
            this.f29522b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29522b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29522b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            if (!z) {
                if (z) {
                    return;
                }
                View view2 = this.f29522b;
                if (view2 != null && view2.getTag() != null && this.f29522b.getTag().equals("1") && NSTIJKPlayerEpisodes.this.t0 != null) {
                    NSTIJKPlayerEpisodes.this.t0.setBackgroundResource(R.drawable.black_button_dark);
                }
                a(1.0f);
                b(1.0f);
                return;
            }
            View view3 = this.f29522b;
            if (view3 != null && view3.getTag() != null && this.f29522b.getTag().equals("2")) {
                view.setBackground(NSTIJKPlayerEpisodes.this.getResources().getDrawable(R.drawable.selector_tracks_layout));
                return;
            }
            float f2 = z ? 1.12f : 1.0f;
            a(f2);
            b(f2);
            View view4 = this.f29522b;
            if (view4 == null || view4.getTag() == null || !this.f29522b.getTag().equals("1") || NSTIJKPlayerEpisodes.this.t0 == null) {
                return;
            }
            NSTIJKPlayerEpisodes.this.t0.setBackgroundResource(R.drawable.back_btn_effect);
        }
    }

    public class i implements IMediaPlayer.OnCompletionListener {
        public i() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer r3) {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.i.onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer):void");
        }
    }

    public class i0 extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f29525b;

        public i0() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (NSTIJKPlayerEpisodes.this.l0 == null) {
                return true;
            }
            if (motionEvent.getX() < NSTIJKPlayerEpisodes.this.l0.getWidth() / 2.0f) {
                NSTIJKPlayerEpisodes.this.M1();
                return true;
            }
            NSTIJKPlayerEpisodes.this.N1();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f29525b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            NSTIJKPlayerEpisodes.this.n2();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == R.id.fabbutton_ring || view.getId() == R.id.ll_determinate) {
                NSTIJKPlayerEpisodes.this.F1();
            } else if (view.getId() == R.id.cancel_autoplay) {
                NSTIJKPlayerEpisodes.this.v1();
            }
        }
    }

    public class j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f29528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f29529b;

        public j0(Activity activity) {
            this.f29528a = activity;
        }

        public j0 a() {
            View view = this.f29529b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public j0 b(int i2) {
            this.f29529b = this.f29528a.findViewById(i2);
            return this;
        }

        public j0 c() {
            View view = this.f29529b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public j0 d(CharSequence charSequence) {
            View view = this.f29529b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public j0 e() {
            View view = this.f29529b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public class k implements SeekBar.OnSeekBarChangeListener {
        public k() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            TextView textView;
            Resources resources;
            int i3;
            NSTIJKPlayerEpisodes.this.o0 = i2;
            int i4 = (int) ((NSTIJKPlayerEpisodes.this.o0 / 255.0f) * 100.0f);
            if (i4 < 20) {
                textView = NSTIJKPlayerEpisodes.this.Z1;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i3 = R.drawable.hp_bright_1;
            } else if (i4 < 30) {
                textView = NSTIJKPlayerEpisodes.this.Z1;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i3 = R.drawable.hp_bright_2;
            } else if (i4 < 40) {
                textView = NSTIJKPlayerEpisodes.this.Z1;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i3 = R.drawable.hp_bright_3;
            } else if (i4 < 50) {
                textView = NSTIJKPlayerEpisodes.this.Z1;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i3 = R.drawable.hp_bright_4;
            } else if (i4 < 60) {
                textView = NSTIJKPlayerEpisodes.this.Z1;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i3 = R.drawable.hp_bright_5;
            } else if (i4 < 70) {
                textView = NSTIJKPlayerEpisodes.this.Z1;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i3 = R.drawable.hp_bright_6;
            } else {
                textView = NSTIJKPlayerEpisodes.this.Z1;
                resources = NSTIJKPlayerEpisodes.this.getResources();
                i3 = R.drawable.hp_bright_7;
            }
            textView.setBackground(resources.getDrawable(i3));
            WindowManager.LayoutParams attributes = NSTIJKPlayerEpisodes.this.k0.getWindow().getAttributes();
            attributes.screenBrightness = NSTIJKPlayerEpisodes.this.o0 / 255.0f;
            NSTIJKPlayerEpisodes.this.R.R((int) NSTIJKPlayerEpisodes.this.o0);
            NSTIJKPlayerEpisodes.this.k0.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEpisodes.this.f2();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEpisodes.this.f2();
            NSTIJKPlayerEpisodes.this.k1(3000);
        }
    }

    public class l implements IMediaPlayer.OnInfoListener {
        public l() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i2, int i3) {
            String str;
            String str2;
            if (NSTIJKPlayerEpisodes.this.v != null) {
                NSTIJKPlayerEpisodes.this.v.onInfo(iMediaPlayer, i2, i3);
            }
            if (i2 == 3) {
                NSTIJKPlayerEpisodes.this.c2(2);
                str = NSTIJKPlayerEpisodes.this.f29493c;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i2 == 10005) {
                NSTIJKPlayerEpisodes.this.c2(1);
                str = NSTIJKPlayerEpisodes.this.f29493c;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i2 == 901) {
                str = NSTIJKPlayerEpisodes.this.f29493c;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i2 != 902) {
                    if (i2 == 10001) {
                        NSTIJKPlayerEpisodes.this.p = i3;
                        Log.d(NSTIJKPlayerEpisodes.this.f29493c, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i3);
                        c.h.a.k.d.c.a.c cVar = NSTIJKPlayerEpisodes.this.S;
                        if (cVar != null) {
                            cVar.setVideoRotation(i3);
                        }
                    } else if (i2 != 10002) {
                        switch (i2) {
                            case 700:
                                str = NSTIJKPlayerEpisodes.this.f29493c;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerEpisodes.this.c2(1);
                                str = NSTIJKPlayerEpisodes.this.f29493c;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerEpisodes.this.c2(6);
                                str = NSTIJKPlayerEpisodes.this.f29493c;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerEpisodes.this.f29493c;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i3;
                                break;
                            default:
                                switch (i2) {
                                    case 800:
                                        str = NSTIJKPlayerEpisodes.this.f29493c;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerEpisodes.this.f29493c;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerEpisodes.this.f29493c;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerEpisodes.this.f29493c;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerEpisodes.this.f29493c;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            }
            Log.d(str, str2);
            return true;
        }
    }

    public class m implements IMediaPlayer.OnErrorListener {
        public m() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i2, int i3) {
            Log.d(NSTIJKPlayerEpisodes.this.f29493c, "Error: " + i2 + "," + i3);
            NSTIJKPlayerEpisodes.this.f29498h = -1;
            NSTIJKPlayerEpisodes.this.f29499i = -1;
            if (NSTIJKPlayerEpisodes.this.q != null) {
                NSTIJKPlayerEpisodes.this.q.d();
            }
            NSTIJKPlayerEpisodes.this.c2(-1);
            if (NSTIJKPlayerEpisodes.this.u == null || NSTIJKPlayerEpisodes.this.u.onError(NSTIJKPlayerEpisodes.this.f29501k, i2, i3)) {
            }
            return true;
        }
    }

    public class n implements IMediaPlayer.OnBufferingUpdateListener {
        public n() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i2) {
            NSTIJKPlayerEpisodes.this.t = i2;
        }
    }

    public class o implements IMediaPlayer.OnSeekCompleteListener {
        public o() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerEpisodes.this.h0 = System.currentTimeMillis();
            NSTIJKPlayerEpisodes.this.V.o(NSTIJKPlayerEpisodes.this.h0 - NSTIJKPlayerEpisodes.this.g0);
        }
    }

    public class p implements IMediaPlayer.OnTimedTextListener {
        public p() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            TextView textView;
            if (ijkTimedText == null) {
                NSTIJKPlayerEpisodes.this.i0.setVisibility(8);
                return;
            }
            String strReplace = ijkTimedText.getText().replace("{\\b1}", BuildConfig.FLAVOR).replace("{\\b0}", BuildConfig.FLAVOR).replace("{\\i1}", BuildConfig.FLAVOR).replace("{\\i0}", BuildConfig.FLAVOR).replace("{\\c}", BuildConfig.FLAVOR);
            StringBuilder sb = new StringBuilder();
            try {
                if (strReplace.contains("{")) {
                    for (String strSubstring : strReplace.split("\\{")) {
                        if (strSubstring.contains("}")) {
                            strSubstring = strSubstring.substring(strSubstring.lastIndexOf("}") + 1);
                        }
                        sb.append(strSubstring);
                    }
                }
            } catch (Exception unused) {
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes.m1 = nSTIJKPlayerEpisodes.Q.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                NSTIJKPlayerEpisodes.this.i0.setTextSize(2, Float.parseFloat(NSTIJKPlayerEpisodes.this.m1.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0)));
            } catch (Exception unused2) {
            }
            if (NSTIJKPlayerEpisodes.this.getShowOrHideSubtitles().equals("visible")) {
                NSTIJKPlayerEpisodes.this.i0.setVisibility(0);
            } else {
                NSTIJKPlayerEpisodes.this.i0.setVisibility(8);
            }
            if (sb.length() > 0) {
                textView = NSTIJKPlayerEpisodes.this.i0;
                strReplace = sb.toString();
            } else {
                textView = NSTIJKPlayerEpisodes.this.i0;
            }
            textView.setText(strReplace);
        }
    }

    public class q implements c.a {
        public q() {
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void a(c.b bVar, int i2, int i3, int i4) {
            c.h.a.k.d.c.a.c cVarA = bVar.a();
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            if (cVarA != nSTIJKPlayerEpisodes.S) {
                Log.e(nSTIJKPlayerEpisodes.f29493c, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerEpisodes.f29504n = i3;
            NSTIJKPlayerEpisodes.this.f29505o = i4;
            boolean z = true;
            boolean z2 = NSTIJKPlayerEpisodes.this.f29499i == 3;
            if (NSTIJKPlayerEpisodes.this.S.c() && (NSTIJKPlayerEpisodes.this.f29502l != i3 || NSTIJKPlayerEpisodes.this.f29503m != i4)) {
                z = false;
            }
            if (NSTIJKPlayerEpisodes.this.f29501k != null && z2 && z) {
                if (NSTIJKPlayerEpisodes.this.w != 0) {
                    NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
                    nSTIJKPlayerEpisodes2.seekTo(nSTIJKPlayerEpisodes2.w);
                }
                NSTIJKPlayerEpisodes.this.start();
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void b(c.b bVar, int i2, int i3) {
            c.h.a.k.d.c.a.c cVarA = bVar.a();
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            if (cVarA != nSTIJKPlayerEpisodes.S) {
                Log.e(nSTIJKPlayerEpisodes.f29493c, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerEpisodes.f29500j = bVar;
            if (NSTIJKPlayerEpisodes.this.f29501k == null) {
                NSTIJKPlayerEpisodes.this.E1();
            } else {
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
                nSTIJKPlayerEpisodes2.m1(nSTIJKPlayerEpisodes2.f29501k, bVar);
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void c(c.b bVar) {
            c.h.a.k.d.c.a.c cVarA = bVar.a();
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            if (cVarA != nSTIJKPlayerEpisodes.S) {
                Log.e(nSTIJKPlayerEpisodes.f29493c, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                nSTIJKPlayerEpisodes.f29500j = null;
                NSTIJKPlayerEpisodes.this.H1();
            }
        }
    }

    public class r implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f29538b;

        public r(LinearLayout linearLayout) {
            this.f29538b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29538b.setVisibility(8);
            if (NSTIJKPlayerEpisodes.this.I1.getVisibility() != 0 || NSTIJKPlayerEpisodes.this.b2 == null) {
                return;
            }
            NSTIJKPlayerEpisodes.this.b2.setVisibility(0);
        }
    }

    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerEpisodes.this.k2();
        }
    }

    public class t implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29541b;

        public t(int i2) {
            this.f29541b = i2;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes.d1 = nSTIJKPlayerEpisodes.Z0.edit();
            if (i2 == 111 || i2 == 11111111) {
                NSTIJKPlayerEpisodes.this.d1.putInt("currentVideoTrack", -1);
                NSTIJKPlayerEpisodes.this.r1(this.f29541b);
            } else {
                NSTIJKPlayerEpisodes.this.d1.putInt("currentVideoTrack", i2);
                NSTIJKPlayerEpisodes.this.O1(i2);
            }
            NSTIJKPlayerEpisodes.this.d1.apply();
        }
    }

    public class u implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29543b;

        public u(int i2) {
            this.f29543b = i2;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes.c1 = nSTIJKPlayerEpisodes.Y0.edit();
            if (i2 == 1111 || i2 == 1111111) {
                NSTIJKPlayerEpisodes.this.c1.putInt("currentAudioTrack", -1);
                NSTIJKPlayerEpisodes.this.r1(this.f29543b);
            } else {
                NSTIJKPlayerEpisodes.this.c1.putInt("currentAudioTrack", i2);
                int currentPosition = (int) NSTIJKPlayerEpisodes.this.f29501k.getCurrentPosition();
                NSTIJKPlayerEpisodes.this.O1(i2);
                NSTIJKPlayerEpisodes.this.f29501k.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            NSTIJKPlayerEpisodes.this.c1.apply();
        }
    }

    public class v implements SeekBar.OnSeekBarChangeListener {
        public v() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            TextView textView;
            Drawable drawable;
            Resources resources;
            if (NSTIJKPlayerEpisodes.this.m0 != null) {
                try {
                    NSTIJKPlayerEpisodes.this.m0.setStreamVolume(3, i2, 0);
                    int streamVolume = (int) ((NSTIJKPlayerEpisodes.this.m0.getStreamVolume(3) / NSTIJKPlayerEpisodes.this.n0) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        textView = NSTIJKPlayerEpisodes.this.a2;
                        drawable = NSTIJKPlayerEpisodes.this.getResources().getDrawable(R.drawable.hp_volume_mute);
                    } else if (streamVolume < 40) {
                        textView = NSTIJKPlayerEpisodes.this.a2;
                        drawable = NSTIJKPlayerEpisodes.this.getResources().getDrawable(R.drawable.hp_volume_1);
                    } else if (streamVolume < 80) {
                        textView = NSTIJKPlayerEpisodes.this.a2;
                        drawable = NSTIJKPlayerEpisodes.this.getResources().getDrawable(R.drawable.hp_volume_2);
                    } else {
                        if (streamVolume < 100) {
                            textView = NSTIJKPlayerEpisodes.this.a2;
                            resources = NSTIJKPlayerEpisodes.this.getResources();
                        } else {
                            textView = NSTIJKPlayerEpisodes.this.a2;
                            resources = NSTIJKPlayerEpisodes.this.getResources();
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
            NSTIJKPlayerEpisodes.this.f2();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEpisodes.this.f2();
            NSTIJKPlayerEpisodes.this.k1(3000);
        }
    }

    public class w implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29546b;

        public w(int i2) {
            this.f29546b = i2;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes.b1 = nSTIJKPlayerEpisodes.X0.edit();
            if (i2 == 11111 || i2 == 111111) {
                TextView textView = NSTIJKPlayerEpisodes.this.i0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NSTIJKPlayerEpisodes.this.b1.putInt("currentSubtitleTrack", -1);
                NSTIJKPlayerEpisodes.this.r1(this.f29546b);
            } else {
                TextView textView2 = NSTIJKPlayerEpisodes.this.i0;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                NSTIJKPlayerEpisodes.this.b1.putInt("currentSubtitleTrack", i2);
                NSTIJKPlayerEpisodes.this.O1(i2);
            }
            NSTIJKPlayerEpisodes.this.b1.apply();
        }
    }

    public class x implements DialogInterface.OnClickListener {
        public x() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(DialogInterface dialogInterface, int i2) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
            String str;
            switch (i2) {
                case 0:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "10";
                    break;
                case 1:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "12";
                    break;
                case 2:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "14";
                    break;
                case 3:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "16";
                    break;
                case 4:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "18";
                    break;
                case 5:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "20";
                    break;
                case 6:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "22";
                    break;
                case 7:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "24";
                    break;
                case 8:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "26";
                    break;
                case 9:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "28";
                    break;
                case 10:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "30";
                    break;
                case 11:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "32";
                    break;
                case 12:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "34";
                    break;
                case 13:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "36";
                    break;
                case 14:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "38";
                    break;
                case 15:
                    nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                    str = "40";
                    break;
                default:
                    return;
            }
            nSTIJKPlayerEpisodes.l2(str);
            NSTIJKPlayerEpisodes.this.D1.setText(str);
            dialogInterface.cancel();
        }
    }

    public class y implements DialogInterface.OnDismissListener {
        public y() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class z implements SeekBar.OnSeekBarChangeListener {
        public z() {
        }

        public String a(long j2) {
            int i2 = (int) (j2 / 1000);
            int i3 = i2 % 60;
            int i4 = (i2 / 60) % 60;
            int i5 = i2 / 3600;
            return i5 > 0 ? String.format("%02d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)) : String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            if (z && NSTIJKPlayerEpisodes.this.f29501k != null) {
                NSTIJKPlayerEpisodes.this.s0.b(R.id.app_video_status).a();
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
                double duration = nSTIJKPlayerEpisodes.l0.getDuration();
                Double.isNaN(i2);
                Double.isNaN(duration);
                nSTIJKPlayerEpisodes.B = (int) (duration * ((r6 * 1.0d) / 1000.0d));
                a(NSTIJKPlayerEpisodes.this.B);
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
                nSTIJKPlayerEpisodes2.h1 = true;
                nSTIJKPlayerEpisodes2.z2.removeMessages(1);
                if (NSTIJKPlayerEpisodes.this.l0.isPlaying()) {
                    NSTIJKPlayerEpisodes.this.l0.pause();
                }
                NSTIJKPlayerEpisodes.this.f2();
                TextView textView = NSTIJKPlayerEpisodes.this.C0;
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = NSTIJKPlayerEpisodes.this;
                textView.setText(nSTIJKPlayerEpisodes3.j2((int) nSTIJKPlayerEpisodes3.B));
                TextView textView2 = NSTIJKPlayerEpisodes.this.D0;
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes4 = NSTIJKPlayerEpisodes.this;
                textView2.setText(nSTIJKPlayerEpisodes4.j2(nSTIJKPlayerEpisodes4.l0.getDuration()));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes.h1 = true;
            nSTIJKPlayerEpisodes.z2.removeMessages(1);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = NSTIJKPlayerEpisodes.this;
            if (nSTIJKPlayerEpisodes2.i1) {
                nSTIJKPlayerEpisodes2.m0.setStreamMute(3, true);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (NSTIJKPlayerEpisodes.this.f29501k == null) {
                return;
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = NSTIJKPlayerEpisodes.this;
            if (!nSTIJKPlayerEpisodes.i1) {
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = nSTIJKPlayerEpisodes.l0;
                double duration = NSTIJKPlayerEpisodes.this.l0.getDuration();
                double progress = seekBar.getProgress();
                Double.isNaN(progress);
                Double.isNaN(duration);
                nSTIJKPlayerEpisodes2.seekTo((int) (duration * ((progress * 1.0d) / 1000.0d)));
            }
            NSTIJKPlayerEpisodes.this.l0.start();
            NSTIJKPlayerEpisodes.this.f2();
            NSTIJKPlayerEpisodes.this.k1(0);
            NSTIJKPlayerEpisodes.this.z2.removeMessages(1);
            NSTIJKPlayerEpisodes.this.m0.setStreamMute(3, false);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = NSTIJKPlayerEpisodes.this;
            nSTIJKPlayerEpisodes3.h1 = false;
            nSTIJKPlayerEpisodes3.z2.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    public NSTIJKPlayerEpisodes(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29493c = "NSTIJKPlayerEpisodes";
        this.f29497g = 0;
        this.f29498h = 0;
        this.f29499i = 0;
        this.f29500j = null;
        this.f29501k = null;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = -1;
        this.B = -1L;
        this.D = true;
        this.E = false;
        this.F = 7000;
        this.I = 0;
        this.K = 0;
        this.L = 5;
        this.M = false;
        this.W = 0L;
        this.f0 = 0L;
        this.g0 = 0L;
        this.h0 = 0L;
        this.j0 = "visible";
        this.o0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.u0 = bool;
        this.v0 = bool;
        this.w0 = bool;
        this.x0 = bool;
        this.y0 = bool;
        this.z0 = bool;
        this.B0 = false;
        this.L0 = false;
        this.Q0 = false;
        this.V0 = false;
        this.f1 = false;
        this.g1 = false;
        this.k1 = false;
        this.q1 = 0;
        this.v1 = false;
        this.R1 = false;
        this.Y1 = 0;
        this.s2 = false;
        this.t2 = 5;
        this.u2 = false;
        this.w2 = new k();
        this.x2 = new v();
        this.y2 = new z();
        this.z2 = new b0(Looper.getMainLooper());
        this.A2 = new g();
        this.B2 = new h();
        this.C2 = new i();
        this.D2 = new j();
        this.E2 = new l();
        this.F2 = new m();
        this.G2 = new n();
        this.H2 = new o();
        this.I2 = new p();
        this.J2 = new q();
        this.K2 = 4;
        this.L2 = f29492b[0];
        this.M2 = new ArrayList();
        this.N2 = 0;
        this.O2 = 0;
        this.P2 = false;
        B1(context);
    }

    public final void A1() {
        this.M2.clear();
        if (this.R.s()) {
            this.M2.add(1);
        }
        if (this.R.t() && Build.VERSION.SDK_INT >= 14) {
            this.M2.add(2);
        }
        if (this.R.r()) {
            this.M2.add(0);
        }
        if (this.M2.isEmpty()) {
            this.M2.add(1);
        }
        int iIntValue = this.M2.get(this.N2).intValue();
        this.O2 = iIntValue;
        setRender(iIntValue);
    }

    public final void B1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.Q = applicationContext;
        this.R = new c.h.a.k.d.a.a(applicationContext);
        this.n1 = new c.h.a.j.j(this, this.Q);
        z1();
        A1();
        this.f29502l = 0;
        this.f29503m = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f29498h = 0;
        this.f29499i = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        this.m1 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0);
        TextView textView = new TextView(context);
        this.i0 = textView;
        try {
            textView.setTextSize(2, Float.parseFloat(string));
        } catch (Exception unused) {
        }
        this.i0.setTextColor(context.getResources().getColor(R.color.white));
        this.i0.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(this.i0, layoutParams);
    }

    public boolean C1() {
        return this.P2;
    }

    public final boolean D1() {
        int i2;
        return (this.f29501k == null || (i2 = this.f29498h) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    @TargetApi(23)
    public void E1() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f29494d == null || this.f29500j == null) {
            return;
        }
        G1(false);
        try {
            ((AudioManager) this.Q.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            try {
                try {
                    this.f29501k = q1(this.R.x());
                    getContext();
                    this.f29501k.setOnPreparedListener(this.B2);
                    this.f29501k.setOnVideoSizeChangedListener(this.A2);
                    this.f29501k.setOnCompletionListener(this.C2);
                    this.f29501k.setOnErrorListener(this.F2);
                    this.f29501k.setOnInfoListener(this.E2);
                    this.f29501k.setOnBufferingUpdateListener(this.G2);
                    this.f29501k.setOnSeekCompleteListener(this.H2);
                    this.f29501k.setOnTimedTextListener(this.I2);
                    this.t = 0;
                    String scheme = this.f29494d.getScheme();
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23 && this.R.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                        this.f29501k.setDataSource(new c.h.a.k.d.c.a.a(new File(this.f29494d.toString())));
                    } else if (i2 >= 14) {
                        this.f29501k.setDataSource(this.Q, this.f29494d, this.f29496f);
                    } else {
                        this.f29501k.setDataSource(this.f29494d.toString());
                    }
                    m1(this.f29501k, this.f29500j);
                    this.f29501k.setAudioStreamType(3);
                    this.f29501k.setScreenOnWhilePlaying(true);
                    this.W = System.currentTimeMillis();
                    this.f29501k.prepareAsync();
                    this.q0 = this.k0.getResources().getDisplayMetrics().widthPixels;
                    AudioManager audioManager = (AudioManager) this.k0.getSystemService("audio");
                    this.m0 = audioManager;
                    this.n0 = audioManager.getStreamMaxVolume(3);
                    int streamVolume = this.m0.getStreamVolume(3);
                    this.H1.setMax(this.m0.getStreamMaxVolume(3));
                    this.H1.setProgress(streamVolume);
                    this.p0 = new GestureDetector(this.k0, new i0());
                    this.R1 = false;
                    p2();
                    SeekBar seekBar = this.A0;
                    if (seekBar != null) {
                        seekBar.setMax(1000);
                        this.A0.setKeyProgressIncrement(5);
                        this.A0.setOnSeekBarChangeListener(this.y2);
                    }
                    this.E0 = new StringBuilder();
                    this.F0 = new Formatter(this.E0, Locale.getDefault());
                    c.h.a.k.d.c.a.d dVar = this.V;
                    if (dVar != null) {
                        dVar.l(this.f29501k);
                    }
                    this.f29498h = 1;
                } catch (NullPointerException e2) {
                    Log.w(this.f29493c, "Unable to open content: " + this.f29494d, e2);
                    this.f29498h = -1;
                    this.f29499i = -1;
                    onErrorListener = this.F2;
                    iMediaPlayer = this.f29501k;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                } catch (Exception e3) {
                    Log.w(this.f29493c, "Unable to open content: " + this.f29494d, e3);
                    this.f29498h = -1;
                    this.f29499i = -1;
                    onErrorListener = this.F2;
                    iMediaPlayer = this.f29501k;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (IOException e4) {
                Log.w(this.f29493c, "Unable to open content: " + this.f29494d, e4);
                this.f29498h = -1;
                this.f29499i = -1;
                onErrorListener = this.F2;
                iMediaPlayer = this.f29501k;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (IllegalArgumentException e5) {
            Log.w(this.f29493c, "Unable to open content: " + this.f29494d, e5);
            this.f29498h = -1;
            this.f29499i = -1;
            onErrorListener = this.F2;
            iMediaPlayer = this.f29501k;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    public final void F1() {
        try {
            v1();
            LinearLayout linearLayout = (LinearLayout) this.k0.findViewById(R.id.ll_next_episode);
            if (linearLayout != null) {
                linearLayout.performClick();
            }
        } catch (Exception unused) {
        }
    }

    public void G1(boolean z2) {
        try {
            e2();
            IMediaPlayer iMediaPlayer = this.f29501k;
            if (iMediaPlayer != null) {
                iMediaPlayer.reset();
                this.f29501k.release();
                this.f29501k = null;
                this.f29498h = 0;
                if (z2) {
                    this.f29499i = 0;
                }
                ((AudioManager) this.Q.getSystemService("audio")).abandonAudioFocus(null);
            }
        } catch (Exception unused) {
        }
    }

    public void H1() {
        IMediaPlayer iMediaPlayer = this.f29501k;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void I1(boolean z2) {
        this.f1 = z2;
    }

    public int J1() {
        c.h.a.k.d.c.a.c cVar = this.S;
        if (cVar == null || cVar.getView() == null || this.S.getView().getHeight() == 0) {
            return 0;
        }
        return this.S.getView().getHeight();
    }

    public int K1() {
        c.h.a.k.d.c.a.c cVar = this.S;
        if (cVar == null || cVar.getView() == null || this.S.getView().getWidth() == 0) {
            return 0;
        }
        return this.S.getView().getWidth();
    }

    public void L1(int i2) {
        if (this.f29501k == null) {
            return;
        }
        double duration = this.l0.getDuration();
        Double.isNaN(i2);
        Double.isNaN(duration);
        this.B = (int) (duration * ((r2 * 1.0d) / 1000.0d));
        this.h1 = true;
        this.z2.removeMessages(1);
        if (this.l0.isPlaying()) {
            this.l0.pause();
        }
        f2();
        this.C0.setText(j2((int) this.B));
        this.D0.setText(j2(this.l0.getDuration()));
        Handler handler = this.O1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.O1.postDelayed(new e(), 1000L);
        }
    }

    public final void M1() {
        TextView textView;
        StringBuilder sb;
        f2();
        if (HoneyPlayer.f25663h || o1() || this.l0 == null || this.g2.getVisibility() != 8) {
            return;
        }
        this.N1.removeCallbacksAndMessages(null);
        String str = this.c2;
        if (str != null && !str.equals(BuildConfig.FLAVOR)) {
            this.Y1 -= 10000;
        }
        String str2 = this.d2;
        this.Y1 = (str2 == null || !str2.equals("catch_up")) ? this.Y1 - 10000 : this.Y1 - DateTimeConstants.MILLIS_PER_MINUTE;
        if (this.Y1 > 0) {
            textView = this.f2;
            sb = new StringBuilder();
            sb.append("+");
        } else {
            textView = this.f2;
            sb = new StringBuilder();
        }
        sb.append(this.Y1 / 1000);
        sb.append("s");
        textView.setText(sb.toString());
        this.U1.setText(BuildConfig.FLAVOR);
        this.U1.startAnimation(this.j2);
        this.U1.setVisibility(0);
        if (this.h2.getVisibility() == 8) {
            this.h2.startAnimation(this.i2);
            this.h2.setVisibility(0);
        } else {
            this.h2.startAnimation(this.j2);
        }
        this.N1.postDelayed(new d(), 1000L);
    }

    public void N1() {
        TextView textView;
        StringBuilder sb;
        f2();
        if (HoneyPlayer.f25663h || o1() || this.l0 == null || this.h2.getVisibility() != 8) {
            return;
        }
        this.N1.removeCallbacksAndMessages(null);
        String str = this.c2;
        if (str != null && !str.equals(BuildConfig.FLAVOR)) {
            this.Y1 += Constants.MAXIMUM_UPLOAD_PARTS;
        }
        String str2 = this.d2;
        if (str2 == null || !str2.equals("catch_up")) {
            this.Y1 += Constants.MAXIMUM_UPLOAD_PARTS;
        } else {
            this.Y1 += DateTimeConstants.MILLIS_PER_MINUTE;
        }
        if (this.Y1 > 0) {
            textView = this.e2;
            sb = new StringBuilder();
            sb.append("+");
        } else {
            textView = this.e2;
            sb = new StringBuilder();
        }
        sb.append(this.Y1 / 1000);
        sb.append("s");
        textView.setText(sb.toString());
        this.V1.setText(BuildConfig.FLAVOR);
        this.V1.startAnimation(this.j2);
        this.V1.setVisibility(0);
        if (this.g2.getVisibility() == 8) {
            this.g2.startAnimation(this.i2);
            this.g2.setVisibility(0);
        } else {
            this.g2.startAnimation(this.j2);
        }
        this.N1.postDelayed(new f(), 1000L);
    }

    public void O1(int i2) {
        c.h.a.k.d.c.a.f.e(this.f29501k, i2);
    }

    public void P1(Activity activity, NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes, SeekBar seekBar, TextView textView, TextView textView2, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, SeekBar seekBar2, SeekBar seekBar3, LinearLayout linearLayout, Animation animation, Animation animation2, TextView textView7, TextView textView8, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView9, LinearLayout linearLayout4, String str, String str2, TextView textView10, FrameLayout frameLayout, Animation animation3, Animation animation4, TextView textView11, FrameLayout frameLayout2, TextView textView12, RelativeLayout relativeLayout, Animation animation5, LinearLayout linearLayout5, Animation animation6, Animation animation7, RelativeLayout relativeLayout2, ImageView imageView, TextView textView13, RelativeLayout relativeLayout3, TextView textView14, TextView textView15, LinearLayout linearLayout6, FrameLayout frameLayout3) {
        this.k0 = activity;
        this.l0 = nSTIJKPlayerEpisodes;
        this.G = new Handler();
        this.A0 = seekBar;
        this.C0 = textView;
        this.D0 = textView2;
        this.H = new Handler();
        this.I0 = new c.h.a.i.q.k(activity);
        this.J0 = new c.h.a.i.q.f(activity);
        this.z1 = radioGroup;
        this.A1 = radioGroup2;
        this.B1 = radioGroup3;
        this.y1 = textView3;
        this.x1 = textView4;
        this.w1 = textView5;
        this.D1 = textView6;
        this.G1 = seekBar2;
        this.H1 = seekBar3;
        this.I1 = linearLayout;
        this.J1 = new Handler();
        this.L1 = new Handler();
        this.N1 = new Handler();
        this.P1 = new Handler();
        this.O1 = new Handler();
        this.S1 = animation;
        this.T1 = animation2;
        this.U1 = textView7;
        textView7.setOnClickListener(this);
        this.V1 = textView8;
        textView8.setOnClickListener(this);
        this.W1 = linearLayout2;
        this.X1 = linearLayout3;
        this.G1.setOnSeekBarChangeListener(this.w2);
        this.H1.setOnSeekBarChangeListener(this.x2);
        this.Z1 = textView9;
        seekBar2.setKeyProgressIncrement(1);
        float f2 = this.k0.getWindow().getAttributes().screenBrightness;
        this.o0 = f2;
        if (f2 == -1.0f) {
            this.o0 = this.R != null ? r3.o() : c.h.a.h.n.a.r0;
        }
        seekBar2.setProgress((int) this.o0);
        this.b2 = linearLayout4;
        this.c2 = str;
        this.d2 = str2;
        this.e2 = textView10;
        this.f2 = textView11;
        this.g2 = frameLayout;
        this.h2 = frameLayout2;
        this.i2 = animation3;
        this.j2 = animation4;
        this.a2 = textView12;
        this.k2 = relativeLayout;
        this.l2 = animation5;
        this.m2 = linearLayout5;
        this.n2 = animation6;
        this.o2 = animation7;
        this.o1 = relativeLayout2;
        this.p1 = imageView;
        this.r1 = textView13;
        this.q2 = relativeLayout3;
        this.s1 = textView14;
        this.t1 = textView15;
        this.u1 = linearLayout6;
        this.s0 = new j0(activity);
        this.E1 = frameLayout3;
    }

    public void Q1(Context context, ArrayList<c.h.a.i.f> arrayList, int i2) {
        String strP = arrayList.get(i2).P();
        String name = arrayList.get(i2).getName();
        String strZ = arrayList.get(i2).Z();
        String strY = arrayList.get(i2).Y();
        String strX = arrayList.get(i2).X();
        String strI = arrayList.get(i2).I();
        String strF = arrayList.get(i2).f();
        String strG = arrayList.get(i2).g();
        String strD = arrayList.get(i2).D();
        arrayList.get(i2).a0();
        String strF2 = arrayList.get(i2).F();
        String strB0 = arrayList.get(i2).b0();
        String strD0 = arrayList.get(i2).d0();
        String strB = arrayList.get(i2).B();
        String strW = arrayList.get(i2).W();
        String strM = arrayList.get(i2).M();
        String strC = arrayList.get(i2).C();
        String strT = arrayList.get(i2).T();
        String strS = arrayList.get(i2).S();
        PanelAvailableChannelsPojo panelAvailableChannelsPojo = new PanelAvailableChannelsPojo();
        panelAvailableChannelsPojo.H(Integer.valueOf(strP));
        panelAvailableChannelsPojo.G(name);
        panelAvailableChannelsPojo.N(strZ);
        panelAvailableChannelsPojo.M(strY);
        panelAvailableChannelsPojo.L(strX);
        panelAvailableChannelsPojo.C(strI);
        panelAvailableChannelsPojo.w(strF);
        panelAvailableChannelsPojo.x(strG);
        panelAvailableChannelsPojo.A(strD);
        panelAvailableChannelsPojo.O(0);
        panelAvailableChannelsPojo.B(strF2);
        panelAvailableChannelsPojo.P(strB0);
        panelAvailableChannelsPojo.Q(strD0);
        panelAvailableChannelsPojo.y(strB);
        panelAvailableChannelsPojo.K(strW);
        panelAvailableChannelsPojo.D(strM);
        panelAvailableChannelsPojo.z(strC);
        panelAvailableChannelsPojo.R(c.h.a.i.q.m.z(context));
        panelAvailableChannelsPojo.F(0L);
        panelAvailableChannelsPojo.E(0L);
        panelAvailableChannelsPojo.J(strT);
        panelAvailableChannelsPojo.I(strS);
        this.I0.d(panelAvailableChannelsPojo);
    }

    public void R1() {
        int iI2;
        Context context = getContext();
        if (c.h.a.k.e.a.f() == null || (iI2 = i2(c.h.a.k.e.a.f().k(), c.h.a.i.q.m.z(context))) > 0 || iI2 != 0 || this.S0.equals("dfo") || this.S0.equals("devicedata")) {
            return;
        }
        T1(context, c.h.a.k.e.a.f().c(), c.h.a.k.e.a.f().d());
    }

    public final int S1() {
        if (this.h1) {
            return 0;
        }
        if (this.f1) {
            t1(true);
            this.f1 = false;
            return 0;
        }
        int currentPosition = this.l0.getCurrentPosition();
        int duration = this.l0.getDuration();
        SeekBar seekBar = this.A0;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((((long) currentPosition) * 1000) / ((long) duration)));
            }
            this.A0.setSecondaryProgress(this.l0.getBufferPercentage() * 10);
        }
        try {
            if (duration == 0) {
                this.C0.setText("Live");
                this.D0.setText(BuildConfig.FLAVOR);
            } else {
                this.C0.setText(j2(currentPosition));
                this.D0.setText(j2(duration));
            }
        } catch (Exception unused) {
        }
        return currentPosition;
    }

    public final void T1(Context context, ArrayList<c.h.a.i.f> arrayList, int i2) {
        Q1(context, arrayList, i2);
    }

    @Override // c.h.a.k.f.m
    public void U(String str) {
    }

    public void U1(String str, boolean z2, String str2, long j2, int i2, String str3, ArrayList<c.h.a.i.f> arrayList, int i3, int i4, String str4, String str5) {
        this.S0 = str5;
        W1(Uri.parse(str), z2, str2, j2, i2, str3, arrayList, i3, i4, str4);
    }

    public final void V1(Uri uri, Map<String, String> map, boolean z2, String str, long j2, int i2, String str2, ArrayList<c.h.a.i.f> arrayList, int i3, int i4, String str3) {
        this.f29494d = uri;
        this.f29495e = str;
        this.f29496f = map;
        this.w = 0;
        this.J = z2;
        this.T0 = str2;
        this.O0 = j2;
        this.M0 = i2;
        this.P0 = i4;
        this.U0 = arrayList;
        this.K0 = new c.h.a.i.q.j(this.k0);
        this.I0 = new c.h.a.i.q.k(this.k0);
        this.j1 = new c.h.a.i.q.l(this.k0);
        this.l1 = new c.h.a.k.a.m(this.k0);
        this.J0 = new c.h.a.i.q.f(this.k0);
        this.N0 = c.h.a.i.q.m.z(this.k0);
        this.I = i3;
        this.R0 = str3;
        h2();
        E1();
        requestLayout();
        invalidate();
    }

    public void W1(Uri uri, boolean z2, String str, long j2, int i2, String str2, ArrayList<c.h.a.i.f> arrayList, int i3, int i4, String str3) {
        V1(uri, null, z2, str, j2, i2, str2, arrayList, i3, i4, str3);
    }

    public void X1() {
        if (HoneyPlayer.f25663h || o1() || this.I1.getVisibility() != 8) {
            return;
        }
        d();
        this.I1.startAnimation(this.S1);
        this.I1.setVisibility(0);
        if (this.W1.getVisibility() == 8) {
            this.W1.startAnimation(this.S1);
            this.W1.setVisibility(0);
        }
        if (this.U1.getVisibility() == 8) {
            this.U1.startAnimation(this.S1);
            this.U1.setVisibility(0);
        }
        if (this.b2.getVisibility() == 8 && !HoneyPlayer.P0()) {
            this.b2.startAnimation(this.S1);
            this.b2.setVisibility(0);
        }
        if (this.V1.getVisibility() == 8) {
            this.V1.startAnimation(this.S1);
            this.V1.setVisibility(0);
        }
        if (this.X1.getVisibility() == 8) {
            this.X1.startAnimation(this.S1);
            this.X1.setVisibility(0);
        }
    }

    @Override // c.h.a.k.f.m
    public void Y(VodInfoCallback vodInfoCallback) {
    }

    public void Y1() {
        if (this.I1.getVisibility() == 8) {
            this.m2.startAnimation(this.n2);
            this.m2.setVisibility(0);
        }
    }

    public final void Z1(String str) {
        this.s0.b(R.id.video_view).a();
        this.s0.b(R.id.app_video_status).e();
        this.s0.b(R.id.app_video_status_text).d(str);
    }

    @Override // c.h.a.k.f.b
    public void a() {
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    public void a2(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout) {
        TextView textView5;
        int i2;
        ITrackInfo[] iTrackInfoArr;
        int i3;
        if (this.f29501k == null) {
            return;
        }
        radioGroup.removeAllViews();
        radioGroup2.removeAllViews();
        radioGroup3.removeAllViews();
        try {
            SharedPreferences sharedPreferences = this.k0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.m1 = sharedPreferences;
            textView4.setText(sharedPreferences.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0));
            frameLayout.setOnClickListener(new s());
        } catch (Exception unused) {
        }
        Boolean bool = Boolean.FALSE;
        this.z0 = bool;
        this.y0 = bool;
        this.x0 = bool;
        this.v0 = bool;
        this.u0 = bool;
        this.w0 = bool;
        int iD = c.h.a.k.d.c.a.f.d(this.f29501k, 1);
        int iD2 = c.h.a.k.d.c.a.f.d(this.f29501k, 2);
        int iD3 = c.h.a.k.d.c.a.f.d(this.f29501k, 3);
        ITrackInfo[] trackInfo = this.f29501k.getTrackInfo();
        if (trackInfo == null || trackInfo.length <= 0) {
            textView5 = textView3;
            i2 = 0;
            textView.setVisibility(0);
            textView2.setVisibility(0);
        } else {
            int i4 = 0;
            int i5 = -1;
            for (int length = trackInfo.length; i4 < length; length = i3) {
                ITrackInfo iTrackInfo = trackInfo[i4];
                int i6 = i5 + 1;
                int trackType = iTrackInfo.getTrackType();
                IMediaFormat format = iTrackInfo.getFormat();
                if (format != null && (format instanceof IjkMediaFormat)) {
                    iTrackInfoArr = trackInfo;
                    i3 = length;
                    if (trackType == 1) {
                        Boolean bool2 = Boolean.TRUE;
                        this.x0 = bool2;
                        if (!this.u0.booleanValue()) {
                            this.u0 = bool2;
                            RadioButton radioButton = new RadioButton(this.k0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(R.color.white));
                            radioButton.setTextSize(13.0f);
                            radioButton.setId(11111111);
                            if (Build.VERSION.SDK_INT >= 21) {
                                radioButton.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.Q, R.color.white)));
                            }
                            radioButton.setPadding(0, 0, 16, 0);
                            radioButton.setOnFocusChangeListener(new h0(radioButton));
                            if (iD == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.k0);
                        iTrackInfo.getInfoInline();
                        radioButton2.setText(i6 + ", " + iTrackInfo.getInfoInline());
                        if (i6 == -1) {
                            radioButton2.setId(111);
                        } else {
                            radioButton2.setId(i6);
                        }
                        radioButton2.setTextColor(getResources().getColor(R.color.white));
                        radioButton2.setTextSize(13.0f);
                        if (Build.VERSION.SDK_INT >= 21) {
                            radioButton2.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.Q, R.color.white)));
                        }
                        radioButton2.setPadding(0, 0, 16, 0);
                        radioButton2.setOnFocusChangeListener(new h0(radioButton2));
                        if (i6 == iD) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new t(iD));
                        i4++;
                        i5 = i6;
                        trackInfo = iTrackInfoArr;
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.y0 = bool3;
                        if (!this.v0.booleanValue()) {
                            this.v0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.k0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(R.color.white));
                            radioButton3.setTextSize(13.0f);
                            if (Build.VERSION.SDK_INT >= 21) {
                                radioButton3.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.Q, R.color.white)));
                            }
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(0, 0, 16, 0);
                            radioButton3.setOnFocusChangeListener(new h0(radioButton3));
                            if (iD2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.k0);
                        radioButton4.setText(i6 + ", " + iTrackInfo.getInfoInline() + ", " + n1(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(R.color.white));
                        radioButton4.setTextSize(13.0f);
                        if (Build.VERSION.SDK_INT >= 21) {
                            radioButton4.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.Q, R.color.white)));
                        }
                        if (i6 == -1) {
                            radioButton4.setId(1111);
                        } else {
                            radioButton4.setId(i6);
                        }
                        radioButton4.setPadding(0, 0, 16, 0);
                        radioButton4.setOnFocusChangeListener(new h0(radioButton4));
                        if (i6 == iD2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new u(iD2));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.z0 = bool4;
                        if (!this.w0.booleanValue()) {
                            this.w0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.k0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(R.color.white));
                            radioButton5.setTextSize(13.0f);
                            if (Build.VERSION.SDK_INT >= 21) {
                                radioButton5.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.Q, R.color.white)));
                            }
                            radioButton5.setId(111111);
                            radioButton5.setPadding(0, 0, 16, 0);
                            radioButton5.setOnFocusChangeListener(new h0(radioButton5));
                            if (iD3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.k0);
                        radioButton6.setText(i6 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(R.color.white));
                        radioButton6.setTextSize(13.0f);
                        if (Build.VERSION.SDK_INT >= 21) {
                            radioButton6.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.Q, R.color.white)));
                        }
                        if (i6 == -1) {
                            radioButton6.setId(11111);
                        } else {
                            radioButton6.setId(i6);
                        }
                        radioButton6.setPadding(0, 0, 16, 0);
                        radioButton6.setOnFocusChangeListener(new h0(radioButton6));
                        if (i6 == iD3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new w(iD3));
                    }
                } else {
                    iTrackInfoArr = trackInfo;
                    i3 = length;
                }
                i4++;
                i5 = i6;
                trackInfo = iTrackInfoArr;
            }
            if (this.x0.booleanValue()) {
                i2 = 0;
                textView.setVisibility(8);
            } else {
                i2 = 0;
                textView.setVisibility(0);
            }
            if (this.y0.booleanValue()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(i2);
            }
            if (this.z0.booleanValue()) {
                textView3.setVisibility(8);
                return;
            }
            textView5 = textView3;
        }
        textView5.setVisibility(i2);
    }

    @Override // c.h.a.k.f.b
    public void b() {
    }

    public void b2() {
        try {
            SharedPreferences sharedPreferences = this.k0.getSharedPreferences("auto_start", 0);
            this.a1 = sharedPreferences;
            String string = sharedPreferences.getString("autoplay_seconds", c.h.a.h.n.a.b0);
            int iS = c.h.a.h.n.e.S(c.h.a.h.n.a.b0);
            if (string != null && string.contains("s")) {
                iS = c.h.a.h.n.e.S(string.split("s")[0]);
            }
            if (this.P1 != null) {
                this.Q1 = new d0(iS);
                e2();
                this.P1.postDelayed(this.Q1, 1000L);
            }
        } catch (Exception unused) {
        }
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c2(int r18) {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.c2(int):void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.x;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.y;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.z;
    }

    public void d() {
        if (!this.C) {
            this.C = true;
        }
        q2();
        Handler handler = this.z2;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    public void d2() {
        c.h.a.k.d.b.a.d(null);
    }

    public void e2() {
        Handler handler = this.P1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void f2() {
        Handler handler;
        if (HoneyPlayer.f25663h || (handler = this.J1) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public void g2() {
        Handler handler = this.L1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f29501k != null) {
            return this.t;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (D1()) {
            return (int) this.f29501k.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentPositionSeekbar() {
        return this.e1;
    }

    public int getCurrentWindowIndex() {
        return this.I;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (D1()) {
            return (int) this.f29501k.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.J);
    }

    public int getNewSeekPosition() {
        return (int) this.B;
    }

    public boolean getPlayerIsPrepared() {
        return this.v1;
    }

    public boolean getProgress() {
        return this.g1;
    }

    public String getShowOrHideSubtitles() {
        return this.j0;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f29501k;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    public void h2() {
        try {
            IMediaPlayer iMediaPlayer = this.f29501k;
            if (iMediaPlayer != null) {
                iMediaPlayer.stop();
                this.f29501k.release();
                this.f29501k = null;
                c.h.a.k.d.c.a.d dVar = this.V;
                if (dVar != null) {
                    dVar.l(null);
                }
                this.f29498h = 0;
                this.f29499i = 0;
                ((AudioManager) this.Q.getSystemService("audio")).abandonAudioFocus(null);
            }
        } catch (Exception unused) {
        }
    }

    public final int i2(int i2, int i3) {
        return this.I0.Q(String.valueOf(i2), i3);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return D1() && (iMediaPlayer = this.f29501k) != null && iMediaPlayer.isPlaying();
    }

    public final void j1() {
        c.h.a.k.d.c.a.b bVar;
        if (this.f29501k == null || (bVar = this.q) == null) {
            return;
        }
        bVar.b(this);
        this.q.c(getParent() instanceof View ? (View) getParent() : this);
        this.q.setEnabled(D1());
    }

    public String j2(int i2) {
        int i3 = i2 / 1000;
        int i4 = i3 % 60;
        int i5 = (i3 / 60) % 60;
        int i6 = i3 / 3600;
        try {
            this.E0.setLength(0);
            return i6 > 0 ? this.F0.format("%d:%02d:%02d", Integer.valueOf(i6), Integer.valueOf(i5), Integer.valueOf(i4)).toString() : this.F0.format("%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4)).toString();
        } catch (Exception unused) {
            return this.F0.format("%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4)).toString();
        }
    }

    public void k1(int i2) {
        if (HoneyPlayer.f25663h) {
            return;
        }
        if (!o1()) {
            this.K1 = new c();
        }
        this.J1.postDelayed(this.K1, i2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void k2() {
        int i2;
        CharSequence[] charSequenceArr = {"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40"};
        b.a aVar = new b.a(getContext());
        aVar.setTitle(getResources().getString(R.string.subtitle_font_size));
        String string = this.m1.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0);
        string.hashCode();
        byte b2 = -1;
        switch (string.hashCode()) {
            case 1567:
                if (string.equals("10")) {
                    b2 = 0;
                }
                break;
            case 1569:
                if (string.equals("12")) {
                    b2 = 1;
                }
                break;
            case 1571:
                if (string.equals("14")) {
                    b2 = 2;
                }
                break;
            case 1573:
                if (string.equals("16")) {
                    b2 = 3;
                }
                break;
            case 1575:
                if (string.equals("18")) {
                    b2 = 4;
                }
                break;
            case 1598:
                if (string.equals("20")) {
                    b2 = 5;
                }
                break;
            case 1600:
                if (string.equals("22")) {
                    b2 = 6;
                }
                break;
            case 1602:
                if (string.equals("24")) {
                    b2 = 7;
                }
                break;
            case 1604:
                if (string.equals("26")) {
                    b2 = 8;
                }
                break;
            case 1606:
                if (string.equals("28")) {
                    b2 = 9;
                }
                break;
            case 1629:
                if (string.equals("30")) {
                    b2 = 10;
                }
                break;
            case 1631:
                if (string.equals("32")) {
                    b2 = 11;
                }
                break;
            case 1633:
                if (string.equals("34")) {
                    b2 = 12;
                }
                break;
            case 1635:
                if (string.equals("36")) {
                    b2 = DateTimeFieldType.HALFDAY_OF_DAY;
                }
                break;
            case 1637:
                if (string.equals("38")) {
                    b2 = DateTimeFieldType.HOUR_OF_HALFDAY;
                }
                break;
            case 1660:
                if (string.equals("40")) {
                    b2 = DateTimeFieldType.CLOCKHOUR_OF_HALFDAY;
                }
                break;
        }
        switch (b2) {
            case 0:
            default:
                i2 = 0;
                break;
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
            case 8:
                i2 = 8;
                break;
            case 9:
                i2 = 9;
                break;
            case 10:
                i2 = 10;
                break;
            case 11:
                i2 = 11;
                break;
            case 12:
                i2 = 12;
                break;
            case 13:
                i2 = 13;
                break;
            case 14:
                i2 = 14;
                break;
            case 15:
                i2 = 15;
                break;
        }
        aVar.l(charSequenceArr, i2, new x());
        try {
            a.b.k.b bVarCreate = aVar.create();
            this.F1 = bVarCreate;
            bVarCreate.setOnDismissListener(new y());
            this.F1.show();
        } catch (Exception unused) {
        }
    }

    public void l1(int i2) {
        b bVar = new b();
        this.M1 = bVar;
        this.L1.postDelayed(bVar, i2);
    }

    public final void l2(String str) {
        try {
            SharedPreferences sharedPreferences = this.k0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.m1 = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.C1 = editorEdit;
            if (editorEdit != null) {
                editorEdit.putString("pref.using_sub_font_size", str);
                this.C1.apply();
            }
        } catch (Exception unused) {
        }
    }

    public final void m1(IMediaPlayer iMediaPlayer, c.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m2() {
        /*
            r6 = this;
            int r0 = r6.K2
            r1 = 1
            int r0 = r0 + r1
            r6.K2 = r0
            android.app.Activity r0 = r6.k0
            java.lang.String r2 = "loginPrefs"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
            r6.N = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.O = r0
            int r0 = r6.K2
            int[] r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.f29492b
            int r4 = r2.length
            int r0 = r0 % r4
            r6.K2 = r0
            r0 = r2[r0]
            r6.L2 = r0
            c.h.a.k.d.c.a.c r0 = r6.S
            if (r0 == 0) goto Lb7
            android.app.Activity r0 = r6.k0
            r2 = 2131428290(0x7f0b03c2, float:1.847822E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.app.Activity r2 = r6.k0
            r4 = 2131427466(0x7f0b008a, float:1.847655E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            c.h.a.k.d.c.a.c r4 = r6.S
            int r5 = r6.L2
            r4.setAspectRatio(r5)
            int r4 = r6.K2
            if (r4 != 0) goto L57
            android.content.res.Resources r1 = r6.getResources()
            r4 = 2132017787(0x7f14027b, float:1.9673862E38)
        L4f:
            java.lang.String r1 = r1.getString(r4)
        L53:
            r2.setText(r1)
            goto L83
        L57:
            if (r4 != r1) goto L61
            android.content.res.Resources r1 = r6.getResources()
            r4 = 2132017785(0x7f140279, float:1.9673858E38)
            goto L4f
        L61:
            r1 = 2
            if (r4 != r1) goto L6c
            android.content.res.Resources r1 = r6.getResources()
            r4 = 2132018755(0x7f140643, float:1.9675826E38)
            goto L4f
        L6c:
            r1 = 3
            if (r4 != r1) goto L77
            android.content.res.Resources r1 = r6.getResources()
            r4 = 2132017976(0x7f140338, float:1.9674246E38)
            goto L4f
        L77:
            r1 = 4
            if (r4 != r1) goto L7d
            java.lang.String r1 = "16:9"
            goto L53
        L7d:
            r1 = 5
            if (r4 != r1) goto L83
            java.lang.String r1 = "4:3"
            goto L53
        L83:
            android.content.SharedPreferences$Editor r1 = r6.O
            int r2 = r6.K2
            java.lang.String r4 = "aspect_ratio"
            r1.putInt(r4, r2)
            android.content.SharedPreferences$Editor r1 = r6.O
            r1.apply()
            r0.setVisibility(r3)
            android.widget.LinearLayout r1 = r6.b2
            if (r1 == 0) goto La5
            int r1 = r1.getVisibility()
            if (r1 != 0) goto La5
            android.widget.LinearLayout r1 = r6.b2
            r2 = 8
            r1.setVisibility(r2)
        La5:
            android.os.Handler r1 = r6.H
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.os.Handler r1 = r6.H
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$r r2 = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$r
            r2.<init>(r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r2, r3)
        Lb7:
            int r0 = r6.L2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.m2():int");
    }

    public final String n1(String str) {
        return TextUtils.isEmpty(str) ? "und" : str;
    }

    public void n2() {
        this.l0.y1();
        RelativeLayout relativeLayout = this.q2;
        if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
            if (HoneyPlayer.f25663h) {
                if (o1()) {
                    return;
                }
                g2();
                if (this.m2.getVisibility() == 0) {
                    x1();
                    return;
                } else {
                    Y1();
                    l1(3000);
                    return;
                }
            }
            if (o1()) {
                return;
            }
            SeekBar seekBar = this.H1;
            if (seekBar != null) {
                seekBar.setProgress(this.m0.getStreamVolume(3));
            }
            f2();
            if (this.k2.getVisibility() == 0) {
                this.k2.startAnimation(this.l2);
                this.k2.setVisibility(8);
            } else if (this.I1.getVisibility() == 0) {
                w1();
            } else {
                X1();
                k1(5000);
            }
        }
    }

    public boolean o1() {
        RelativeLayout relativeLayout = this.o1;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    public final void o2() {
        if (this.q.a()) {
            this.q.d();
        } else {
            this.q.show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.tv_seek_left) {
            M1();
        } else {
            if (id != R.id.tv_seek_right) {
                return;
            }
            N1();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z2 = (i2 == 4 || i2 == 24 || i2 == 25 || i2 == 164 || i2 == 82 || i2 == 5 || i2 == 6) ? false : true;
        if (D1() && z2 && this.q != null) {
            if (i2 == 79 || i2 == 85) {
                IMediaPlayer iMediaPlayer = this.f29501k;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.q.d();
                } else {
                    pause();
                    this.q.show();
                }
                return true;
            }
            if (i2 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f29501k;
                if (iMediaPlayer2 != null && !iMediaPlayer2.isPlaying()) {
                    start();
                    this.q.d();
                }
                return true;
            }
            if (i2 == 86 || i2 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f29501k;
                if (iMediaPlayer3 != null && iMediaPlayer3.isPlaying()) {
                    pause();
                    this.q.show();
                }
                return true;
            }
            o2();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public final void p1(int i2) {
        Handler handler;
        Activity activity;
        List<GetEpisdoeDetailsCallback> listB;
        try {
            if (this.P1 != null) {
                if ((getDuration() / 1000) - (getCurrentPosition() / 1000) < i2) {
                    this.u2 = true;
                    this.t2--;
                }
                int i3 = this.t2;
                if (i3 >= i2 || i3 == 0 || !this.u2) {
                    if (i3 != 0 && i3 != 1) {
                        e2();
                        handler = this.P1;
                    }
                    e2();
                    F1();
                    return;
                }
                Log.e(this.f29493c, "timeup: " + this.t2);
                TextView textView = this.s1;
                if (textView != null) {
                    textView.setText(String.valueOf(this.t2));
                }
                TextView textView2 = this.t1;
                if (textView2 != null && this.r1 != null && !textView2.isFocused() && !this.r1.isFocused()) {
                    f2();
                    k1(0);
                    this.t1.requestFocus();
                }
                if (this.o1 != null) {
                    try {
                        if (Build.VERSION.SDK_INT < 24 || (activity = this.k0) == null || !activity.isInPictureInPictureMode()) {
                            this.s2 = false;
                        } else {
                            this.o1.setVisibility(8);
                            this.s2 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
                RelativeLayout relativeLayout = this.o1;
                if (relativeLayout != null && relativeLayout.getVisibility() == 8 && !this.s2) {
                    this.o1.setVisibility(0);
                    if (this.p1 != null && (listB = c.h.a.i.a.c().b()) != null && listB.size() > 0) {
                        if (this.I == listB.size() - 1) {
                            this.I = 0;
                        } else {
                            this.I++;
                        }
                        if (listB.size() > 1 && this.I <= listB.size() - 1) {
                            try {
                                c.k.b.t.q(this.Q.getApplicationContext()).l(listB.get(this.I).n()).g(this.p1);
                            } catch (Exception e2) {
                                Log.e(this.f29493c, "honey: " + e2.getMessage());
                            }
                        }
                    }
                    this.r1.setOnClickListener(new e0());
                    this.t1.setOnClickListener(new f0());
                    this.u1.setOnClickListener(new a());
                }
                e2();
                handler = this.P1;
                handler.postDelayed(this.Q1, 1000L);
            }
        } catch (Exception unused2) {
        }
    }

    public final void p2() {
        View viewFindViewById = this.k0.findViewById(R.id.app_video_box);
        this.r0 = viewFindViewById;
        viewFindViewById.setClickable(true);
        this.r0.setOnTouchListener(new a0());
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (D1() && (iMediaPlayer = this.f29501k) != null && iMediaPlayer.isPlaying()) {
            this.f29501k.pause();
            this.f29498h = 4;
        }
        this.f29499i = 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[PHI: r3
  0x005a: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v7 java.lang.String) binds: [B:10:0x0036, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer q1(int r10) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.q1(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public final void q2() {
        IMediaPlayer iMediaPlayer = this.f29501k;
        if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
            this.s0.b(R.id.iv_pause).a();
            this.s0.b(R.id.iv_play).e();
            g0 g0Var = this.v2;
            if (g0Var != null) {
                g0Var.b();
                return;
            }
            return;
        }
        this.s0.b(R.id.iv_play).a();
        this.s0.b(R.id.iv_pause).e();
        g0 g0Var2 = this.v2;
        if (g0Var2 != null) {
            g0Var2.a();
        }
    }

    public void r1(int i2) {
        c.h.a.k.d.c.a.f.b(this.f29501k, i2);
    }

    public void s1() {
        c.h.a.k.d.b.a.d(this.f29501k);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i2) {
        if (D1()) {
            this.g0 = System.currentTimeMillis();
            this.f29501k.seekTo(i2);
            i2 = 0;
        }
        this.w = i2;
    }

    public void setAdjustViewBounds(boolean z2) {
        if (this.r2 == z2) {
            return;
        }
        this.r2 = z2;
        if (z2) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setCurrentPositionSeekbar(int i2) {
        this.e1 = i2;
    }

    public void setCurrentWindowIndex(int i2) {
        this.I = i2;
    }

    public void setHudView(TableLayout tableLayout) {
        this.V = new c.h.a.k.d.c.a.d(getContext(), tableLayout);
    }

    public void setMediaController(c.h.a.k.d.c.a.b bVar) {
        c.h.a.k.d.c.a.b bVar2 = this.q;
        if (bVar2 != null) {
            bVar2.d();
        }
        this.q = bVar;
        j1();
    }

    public void setMovieListener(g0 g0Var) {
        this.v2 = g0Var;
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.r = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.u = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.v = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.s = onPreparedListener;
    }

    public void setProgress(boolean z2) {
        this.g1 = z2;
    }

    public void setRender(int i2) {
        c.h.a.k.d.c.a.c gVar;
        if (i2 == 0) {
            gVar = null;
        } else if (i2 == 1) {
            gVar = new c.h.a.k.d.c.a.g(getContext());
        } else {
            if (i2 != 2) {
                Log.e(this.f29493c, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i2)));
                return;
            }
            c.h.a.k.d.c.a.i iVar = new c.h.a.k.d.c.a.i(getContext());
            gVar = iVar;
            if (this.f29501k != null) {
                iVar.getSurfaceHolder().b(this.f29501k);
                iVar.a(this.f29501k.getVideoWidth(), this.f29501k.getVideoHeight());
                iVar.b(this.f29501k.getVideoSarNum(), this.f29501k.getVideoSarDen());
                iVar.setAspectRatio(this.L2);
                gVar = iVar;
            }
        }
        setRenderView(gVar);
    }

    public void setRenderView(c.h.a.k.d.c.a.c cVar) {
        int i2;
        int i3;
        if (this.S != null) {
            IMediaPlayer iMediaPlayer = this.f29501k;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.S.getView();
            this.S.e(this.J2);
            this.S = null;
            removeView(view);
        }
        if (cVar == null) {
            return;
        }
        this.S = cVar;
        SharedPreferences sharedPreferences = this.Q.getSharedPreferences("loginPrefs", 0);
        this.N = sharedPreferences;
        int i4 = sharedPreferences.getInt("aspect_ratio", 4);
        this.K2 = i4;
        cVar.setAspectRatio(i4);
        int i5 = this.f29502l;
        if (i5 > 0 && (i3 = this.f29503m) > 0) {
            cVar.a(i5, i3);
        }
        int i6 = this.T;
        if (i6 > 0 && (i2 = this.U) > 0) {
            cVar.b(i6, i2);
        }
        View view2 = this.S.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.S.d(this.J2);
        this.S.setVideoRotation(this.p);
    }

    public void setShowOrHideSubtitles(String str) {
        this.j0 = str;
    }

    public void setSpeed(float f2) {
        try {
            ((IjkMediaPlayer) this.f29501k).setSpeed(f2);
            this.l0.y1();
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (D1()) {
            this.f29501k.start();
            this.f29498h = 3;
        }
        this.f29499i = 3;
    }

    public void t1(boolean z2) {
    }

    public final void u1() {
    }

    public void v1() {
        Runnable runnable;
        Handler handler = this.P1;
        if (handler != null && (runnable = this.Q1) != null) {
            handler.removeCallbacks(runnable);
        }
        this.R1 = true;
        this.o1.setAnimation(this.T1);
        this.o1.setVisibility(8);
    }

    public void w1() {
        this.l0.y1();
        this.z2.removeMessages(1);
        if (HoneyPlayer.f25663h || this.I1.getVisibility() != 0) {
            return;
        }
        this.I1.startAnimation(this.T1);
        if (this.W1.getVisibility() == 0) {
            this.W1.startAnimation(this.T1);
        }
        if (this.U1.getVisibility() == 0) {
            this.U1.startAnimation(this.T1);
        }
        if (this.b2.getVisibility() == 0) {
            this.b2.startAnimation(this.T1);
        }
        if (this.V1.getVisibility() == 0) {
            this.V1.startAnimation(this.T1);
        }
        if (this.X1.getVisibility() == 0) {
            this.X1.startAnimation(this.T1);
        }
        this.I1.setVisibility(8);
        if (this.W1.getVisibility() == 0) {
            this.W1.setVisibility(8);
        }
        if (this.U1.getVisibility() == 0) {
            this.U1.setVisibility(8);
        }
        if (this.b2.getVisibility() == 0) {
            this.b2.setVisibility(8);
        }
        if (this.V1.getVisibility() == 0) {
            this.V1.setVisibility(8);
        }
        if (this.X1.getVisibility() == 0) {
            this.X1.setVisibility(8);
        }
    }

    public void x1() {
        this.l0.y1();
        if (this.m2.getVisibility() == 0) {
            this.m2.startAnimation(this.o2);
            this.m2.setVisibility(8);
        }
    }

    @SuppressLint({"InlinedApi"})
    public void y1() {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.l0;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.setSystemUiVisibility(1799);
        }
    }

    public final void z1() {
        boolean zP = this.R.p();
        this.P2 = zP;
        if (zP) {
            c.h.a.k.d.b.a.b(getContext());
            IMediaPlayer iMediaPlayerA = c.h.a.k.d.b.a.a();
            this.f29501k = iMediaPlayerA;
            c.h.a.k.d.c.a.d dVar = this.V;
            if (dVar != null) {
                dVar.l(iMediaPlayerA);
            }
        }
    }
}
