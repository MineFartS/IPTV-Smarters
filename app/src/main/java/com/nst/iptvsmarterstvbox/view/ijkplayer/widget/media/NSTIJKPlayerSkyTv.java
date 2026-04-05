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
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
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
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback;
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.renderer.DefaultRenderer;
import org.joda.time.DateTimeFieldType;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerSkyTv extends FrameLayout implements MediaController.MediaPlayerControl, c.h.a.k.f.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c.h.a.i.q.f f29725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f29726c = {0, 1, 2, 3, 4, 5};
    public boolean A;
    public StringBuilder A0;
    public Handler A1;
    public int B;
    public Formatter B0;
    public Context B1;
    public long C;
    public boolean C0;
    public LinearLayout C1;
    public boolean D;
    public boolean D0;
    public LinearLayout D1;
    public boolean E;
    public SharedPreferences E0;
    public LinearLayout E1;
    public int F;
    public SharedPreferences F0;
    public v F1;
    public Handler G;
    public SharedPreferences G0;
    public final SeekBar.OnSeekBarChangeListener G1;
    public Handler H;
    public SharedPreferences H0;
    public final SeekBar.OnSeekBarChangeListener H1;
    public int I;
    public SharedPreferences.Editor I0;
    public IMediaPlayer.OnVideoSizeChangedListener I1;
    public boolean J;
    public SharedPreferences.Editor J0;
    public IMediaPlayer.OnPreparedListener J1;
    public int K;
    public SharedPreferences.Editor K0;
    public IMediaPlayer.OnCompletionListener K1;
    public int L;
    public boolean L0;
    public IMediaPlayer.OnInfoListener L1;
    public boolean M;
    public boolean M0;
    public IMediaPlayer.OnErrorListener M1;
    public SharedPreferences N;
    public SharedPreferences N0;
    public IMediaPlayer.OnBufferingUpdateListener N1;
    public SharedPreferences.Editor O;
    public c.h.a.j.j O0;
    public IMediaPlayer.OnSeekCompleteListener O1;
    public SharedPreferences P;
    public boolean P0;
    public IMediaPlayer.OnTimedTextListener P1;
    public Context Q;
    public TextView Q0;
    public c.a Q1;
    public c.h.a.k.d.a.a R;
    public TextView R0;
    public int R1;
    public c.h.a.k.d.c.a.c S;
    public TextView S0;
    public int S1;
    public int T;
    public RadioGroup T0;
    public List<Integer> T1;
    public int U;
    public RadioGroup U0;
    public int U1;
    public long V;
    public RadioGroup V0;
    public int V1;
    public long W;
    public SharedPreferences.Editor W0;
    public boolean W1;
    public TextView X0;
    public FrameLayout Y0;
    public a.b.k.b Z0;
    public SeekBar a1;
    public SeekBar b1;
    public LinearLayout c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29727d;
    public Handler d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f29728e;
    public Runnable e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29729f;
    public long f0;
    public Animation f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, String> f29730g;
    public long g0;
    public Animation g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29731h;
    public TextView h0;
    public LinearLayout h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29732i;
    public String i0;
    public LinearLayout i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29733j;
    public Activity j0;
    public int j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.b f29734k;
    public NSTIJKPlayerSkyTv k0;
    public TextView k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IMediaPlayer f29735l;
    public AudioManager l0;
    public TextView l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29736m;
    public int m0;
    public LinearLayout m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29737n;
    public float n0;
    public Animation n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29738o;
    public GestureDetector o0;
    public Animation o1;
    public int p;
    public int p0;
    public RelativeLayout p1;
    public int q;
    public View q0;
    public Animation q1;
    public c.h.a.k.d.c.a.b r;
    public y r0;
    public Animation r1;
    public IMediaPlayer.OnCompletionListener s;
    public Button s0;
    public Animation s1;
    public IMediaPlayer.OnPreparedListener t;
    public Boolean t0;
    public Animation t1;
    public int u;
    public Boolean u0;
    public SharedPreferences u1;
    public IMediaPlayer.OnErrorListener v;
    public Boolean v0;
    public RelativeLayout v1;
    public IMediaPlayer.OnInfoListener w;
    public Boolean w0;
    public boolean w1;
    public int x;
    public Boolean x0;
    public boolean x1;
    public boolean y;
    public Boolean y0;
    public String y1;
    public boolean z;
    public boolean z0;
    public String z1;

    public class a implements IMediaPlayer.OnErrorListener {
        public a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i2, int i3) {
            Log.d(NSTIJKPlayerSkyTv.this.f29727d, "Error: " + i2 + "," + i3);
            NSTIJKPlayerSkyTv.this.f29732i = -1;
            NSTIJKPlayerSkyTv.this.f29733j = -1;
            if (NSTIJKPlayerSkyTv.this.r != null) {
                NSTIJKPlayerSkyTv.this.r.d();
            }
            NSTIJKPlayerSkyTv.this.d1(-1);
            if (NSTIJKPlayerSkyTv.this.v == null || NSTIJKPlayerSkyTv.this.v.onError(NSTIJKPlayerSkyTv.this.f29735l, i2, i3)) {
            }
            return true;
        }
    }

    public class b implements IMediaPlayer.OnBufferingUpdateListener {
        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i2) {
            NSTIJKPlayerSkyTv.this.u = i2;
        }
    }

    public class c implements IMediaPlayer.OnSeekCompleteListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSkyTv.this.g0 = System.currentTimeMillis();
        }
    }

    public class d implements IMediaPlayer.OnTimedTextListener {
        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            TextView textView;
            if (ijkTimedText == null) {
                NSTIJKPlayerSkyTv.this.h0.setVisibility(8);
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
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            nSTIJKPlayerSkyTv.N0 = nSTIJKPlayerSkyTv.Q.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                NSTIJKPlayerSkyTv.this.h0.setTextSize(2, Float.parseFloat(NSTIJKPlayerSkyTv.this.N0.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0)));
            } catch (Exception unused2) {
            }
            if (NSTIJKPlayerSkyTv.this.getShowOrHideSubtitles().equals("visible")) {
                NSTIJKPlayerSkyTv.this.h0.setVisibility(0);
            } else {
                NSTIJKPlayerSkyTv.this.h0.setVisibility(8);
            }
            if (sb.length() > 0) {
                textView = NSTIJKPlayerSkyTv.this.h0;
                strReplace = sb.toString();
            } else {
                textView = NSTIJKPlayerSkyTv.this.h0;
            }
            textView.setText(strReplace);
        }
    }

    public class e implements c.a {
        public e() {
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void a(c.b bVar, int i2, int i3, int i4) {
            c.h.a.k.d.c.a.c cVarA = bVar.a();
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            if (cVarA != nSTIJKPlayerSkyTv.S) {
                Log.e(nSTIJKPlayerSkyTv.f29727d, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerSkyTv.f29738o = i3;
            NSTIJKPlayerSkyTv.this.p = i4;
            boolean z = true;
            boolean z2 = NSTIJKPlayerSkyTv.this.f29733j == 3;
            if (NSTIJKPlayerSkyTv.this.S.c() && (NSTIJKPlayerSkyTv.this.f29736m != i3 || NSTIJKPlayerSkyTv.this.f29737n != i4)) {
                z = false;
            }
            if (NSTIJKPlayerSkyTv.this.f29735l != null && z2 && z) {
                if (NSTIJKPlayerSkyTv.this.x != 0) {
                    NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = NSTIJKPlayerSkyTv.this;
                    nSTIJKPlayerSkyTv2.seekTo(nSTIJKPlayerSkyTv2.x);
                }
                NSTIJKPlayerSkyTv.this.start();
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void b(c.b bVar, int i2, int i3) {
            c.h.a.k.d.c.a.c cVarA = bVar.a();
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            if (cVarA != nSTIJKPlayerSkyTv.S) {
                Log.e(nSTIJKPlayerSkyTv.f29727d, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerSkyTv.f29734k = bVar;
            if (NSTIJKPlayerSkyTv.this.f29735l == null) {
                NSTIJKPlayerSkyTv.this.T0();
            } else {
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = NSTIJKPlayerSkyTv.this;
                nSTIJKPlayerSkyTv2.H0(nSTIJKPlayerSkyTv2.f29735l, bVar);
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void c(c.b bVar) {
            c.h.a.k.d.c.a.c cVarA = bVar.a();
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            if (cVarA != nSTIJKPlayerSkyTv.S) {
                Log.e(nSTIJKPlayerSkyTv.f29727d, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                nSTIJKPlayerSkyTv.f29734k = null;
                NSTIJKPlayerSkyTv.this.V0();
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f29744b;

        public f(LinearLayout linearLayout) {
            this.f29744b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29744b.setVisibility(8);
            if (NSTIJKPlayerSkyTv.this.c1.getVisibility() != 0 || NSTIJKPlayerSkyTv.this.m1 == null) {
                return;
            }
            NSTIJKPlayerSkyTv.this.m1.setVisibility(0);
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyTv.this.h1();
        }
    }

    public class h implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29747b;

        public h(int i2) {
            this.f29747b = i2;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            nSTIJKPlayerSkyTv.K0 = nSTIJKPlayerSkyTv.H0.edit();
            if (i2 == 111 || i2 == 11111111) {
                NSTIJKPlayerSkyTv.this.K0.putInt("currentVideoTrack", -1);
                NSTIJKPlayerSkyTv.this.K0(this.f29747b);
            } else {
                NSTIJKPlayerSkyTv.this.K0.putInt("currentVideoTrack", i2);
                NSTIJKPlayerSkyTv.this.X0(i2);
            }
            NSTIJKPlayerSkyTv.this.K0.apply();
        }
    }

    public class i implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29749b;

        public i(int i2) {
            this.f29749b = i2;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            nSTIJKPlayerSkyTv.J0 = nSTIJKPlayerSkyTv.G0.edit();
            if (i2 == 1111 || i2 == 1111111) {
                NSTIJKPlayerSkyTv.this.J0.putInt("currentAudioTrack", -1);
                NSTIJKPlayerSkyTv.this.K0(this.f29749b);
            } else {
                NSTIJKPlayerSkyTv.this.J0.putInt("currentAudioTrack", i2);
                int currentPosition = (int) NSTIJKPlayerSkyTv.this.f29735l.getCurrentPosition();
                NSTIJKPlayerSkyTv.this.X0(i2);
                NSTIJKPlayerSkyTv.this.f29735l.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            NSTIJKPlayerSkyTv.this.J0.apply();
        }
    }

    public class j implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29751b;

        public j(int i2) {
            this.f29751b = i2;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            nSTIJKPlayerSkyTv.I0 = nSTIJKPlayerSkyTv.F0.edit();
            if (i2 == 11111 || i2 == 111111) {
                TextView textView = NSTIJKPlayerSkyTv.this.h0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NSTIJKPlayerSkyTv.this.I0.putInt("currentSubtitleTrack", -1);
                NSTIJKPlayerSkyTv.this.K0(this.f29751b);
            } else {
                TextView textView2 = NSTIJKPlayerSkyTv.this.h0;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                NSTIJKPlayerSkyTv.this.I0.putInt("currentSubtitleTrack", i2);
                NSTIJKPlayerSkyTv.this.X0(i2);
            }
            NSTIJKPlayerSkyTv.this.I0.apply();
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
            NSTIJKPlayerSkyTv.this.n0 = i2;
            int i4 = (int) ((NSTIJKPlayerSkyTv.this.n0 / 255.0f) * 100.0f);
            if (i4 < 20) {
                textView = NSTIJKPlayerSkyTv.this.k1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i3 = R.drawable.hp_bright_1;
            } else if (i4 < 30) {
                textView = NSTIJKPlayerSkyTv.this.k1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i3 = R.drawable.hp_bright_2;
            } else if (i4 < 40) {
                textView = NSTIJKPlayerSkyTv.this.k1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i3 = R.drawable.hp_bright_3;
            } else if (i4 < 50) {
                textView = NSTIJKPlayerSkyTv.this.k1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i3 = R.drawable.hp_bright_4;
            } else if (i4 < 60) {
                textView = NSTIJKPlayerSkyTv.this.k1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i3 = R.drawable.hp_bright_5;
            } else if (i4 < 70) {
                textView = NSTIJKPlayerSkyTv.this.k1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i3 = R.drawable.hp_bright_6;
            } else {
                textView = NSTIJKPlayerSkyTv.this.k1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i3 = R.drawable.hp_bright_7;
            }
            textView.setBackground(resources.getDrawable(i3));
            WindowManager.LayoutParams attributes = NSTIJKPlayerSkyTv.this.j0.getWindow().getAttributes();
            attributes.screenBrightness = NSTIJKPlayerSkyTv.this.n0 / 255.0f;
            NSTIJKPlayerSkyTv.this.R.R((int) NSTIJKPlayerSkyTv.this.n0);
            NSTIJKPlayerSkyTv.this.j0.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSkyTv.this.f1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSkyTv.this.f1();
            NSTIJKPlayerSkyTv.this.G0(3000);
        }
    }

    public class l implements DialogInterface.OnClickListener {
        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(DialogInterface dialogInterface, int i2) {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
            String str;
            switch (i2) {
                case 0:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "10";
                    break;
                case 1:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "12";
                    break;
                case 2:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "14";
                    break;
                case 3:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "16";
                    break;
                case 4:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "18";
                    break;
                case 5:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "20";
                    break;
                case 6:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "22";
                    break;
                case 7:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "24";
                    break;
                case 8:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "26";
                    break;
                case 9:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "28";
                    break;
                case 10:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "30";
                    break;
                case 11:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "32";
                    break;
                case 12:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "34";
                    break;
                case 13:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "36";
                    break;
                case 14:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "38";
                    break;
                case 15:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "40";
                    break;
                default:
                    return;
            }
            nSTIJKPlayerSkyTv.i1(str);
            NSTIJKPlayerSkyTv.this.X0.setText(str);
            dialogInterface.cancel();
        }
    }

    public class m implements DialogInterface.OnDismissListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class n implements SeekBar.OnSeekBarChangeListener {
        public n() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            TextView textView;
            Drawable drawable;
            Resources resources;
            if (NSTIJKPlayerSkyTv.this.l0 != null) {
                try {
                    NSTIJKPlayerSkyTv.this.l0.setStreamVolume(3, i2, 0);
                    int streamVolume = (int) ((NSTIJKPlayerSkyTv.this.l0.getStreamVolume(3) / NSTIJKPlayerSkyTv.this.m0) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        textView = NSTIJKPlayerSkyTv.this.l1;
                        drawable = NSTIJKPlayerSkyTv.this.getResources().getDrawable(R.drawable.hp_volume_mute);
                    } else if (streamVolume < 40) {
                        textView = NSTIJKPlayerSkyTv.this.l1;
                        drawable = NSTIJKPlayerSkyTv.this.getResources().getDrawable(R.drawable.hp_volume_1);
                    } else if (streamVolume < 80) {
                        textView = NSTIJKPlayerSkyTv.this.l1;
                        drawable = NSTIJKPlayerSkyTv.this.getResources().getDrawable(R.drawable.hp_volume_2);
                    } else {
                        if (streamVolume < 100) {
                            textView = NSTIJKPlayerSkyTv.this.l1;
                            resources = NSTIJKPlayerSkyTv.this.getResources();
                        } else {
                            textView = NSTIJKPlayerSkyTv.this.l1;
                            resources = NSTIJKPlayerSkyTv.this.getResources();
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
            NSTIJKPlayerSkyTv.this.f1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSkyTv.this.f1();
            NSTIJKPlayerSkyTv.this.G0(3000);
        }
    }

    public class o implements View.OnTouchListener {
        public o() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return (((LinearLayout) NSTIJKPlayerSkyTv.this.j0.findViewById(R.id.ll_layout_to_hide_4)).getVisibility() == 0 || motionEvent == null || !NSTIJKPlayerSkyTv.this.o0.onTouchEvent(motionEvent)) ? false : true;
        }
    }

    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            nSTIJKPlayerSkyTv.K++;
            c.h.a.h.n.e.l0(nSTIJKPlayerSkyTv.j0, NSTIJKPlayerSkyTv.this.j0.getResources().getString(R.string.play_back_error) + " (" + NSTIJKPlayerSkyTv.this.K + "/" + NSTIJKPlayerSkyTv.this.L + ")");
            NSTIJKPlayerSkyTv.this.T0();
            NSTIJKPlayerSkyTv.this.start();
        }
    }

    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTv.this.N0();
        }
    }

    public class r implements IMediaPlayer.OnVideoSizeChangedListener {
        public r() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i2, int i3, int i4, int i5) {
            NSTIJKPlayerSkyTv.this.f29736m = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSkyTv.this.f29737n = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerSkyTv.this.T = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerSkyTv.this.U = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerSkyTv.this.f29736m == 0 || NSTIJKPlayerSkyTv.this.f29737n == 0) {
                return;
            }
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            c.h.a.k.d.c.a.c cVar = nSTIJKPlayerSkyTv.S;
            if (cVar != null) {
                cVar.a(nSTIJKPlayerSkyTv.f29736m, NSTIJKPlayerSkyTv.this.f29737n);
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = NSTIJKPlayerSkyTv.this;
                nSTIJKPlayerSkyTv2.S.b(nSTIJKPlayerSkyTv2.T, NSTIJKPlayerSkyTv.this.U);
            }
            NSTIJKPlayerSkyTv.this.requestLayout();
        }
    }

    public class s implements IMediaPlayer.OnPreparedListener {
        public s() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSkyTv.this.W = System.currentTimeMillis();
            NSTIJKPlayerSkyTv.this.f29732i = 2;
            if (NSTIJKPlayerSkyTv.this.t != null) {
                NSTIJKPlayerSkyTv.this.t.onPrepared(NSTIJKPlayerSkyTv.this.f29735l);
            }
            if (NSTIJKPlayerSkyTv.this.r != null) {
                NSTIJKPlayerSkyTv.this.r.setEnabled(true);
            }
            NSTIJKPlayerSkyTv.this.f29736m = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSkyTv.this.f29737n = iMediaPlayer.getVideoHeight();
            int i2 = NSTIJKPlayerSkyTv.this.x;
            if (i2 != 0) {
                NSTIJKPlayerSkyTv.this.seekTo(i2);
            }
            if (NSTIJKPlayerSkyTv.this.f29736m == 0 || NSTIJKPlayerSkyTv.this.f29737n == 0) {
                if (NSTIJKPlayerSkyTv.this.f29733j == 3) {
                    NSTIJKPlayerSkyTv.this.start();
                    return;
                }
                return;
            }
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            c.h.a.k.d.c.a.c cVar = nSTIJKPlayerSkyTv.S;
            if (cVar != null) {
                cVar.a(nSTIJKPlayerSkyTv.f29736m, NSTIJKPlayerSkyTv.this.f29737n);
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = NSTIJKPlayerSkyTv.this;
                nSTIJKPlayerSkyTv2.S.b(nSTIJKPlayerSkyTv2.T, NSTIJKPlayerSkyTv.this.U);
                if (!NSTIJKPlayerSkyTv.this.S.c() || (NSTIJKPlayerSkyTv.this.f29738o == NSTIJKPlayerSkyTv.this.f29736m && NSTIJKPlayerSkyTv.this.p == NSTIJKPlayerSkyTv.this.f29737n)) {
                    if (NSTIJKPlayerSkyTv.this.f29733j == 3) {
                        NSTIJKPlayerSkyTv.this.start();
                        if (NSTIJKPlayerSkyTv.this.r != null) {
                            NSTIJKPlayerSkyTv.this.r.show();
                            return;
                        }
                        return;
                    }
                    if (NSTIJKPlayerSkyTv.this.isPlaying()) {
                        return;
                    }
                    if ((i2 != 0 || NSTIJKPlayerSkyTv.this.getCurrentPosition() > 0) && NSTIJKPlayerSkyTv.this.r != null) {
                        NSTIJKPlayerSkyTv.this.r.show(0);
                    }
                }
            }
        }
    }

    public class t implements IMediaPlayer.OnCompletionListener {
        public t() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSkyTv.this.f29732i = 5;
            NSTIJKPlayerSkyTv.this.f29733j = 5;
            if (NSTIJKPlayerSkyTv.this.r != null) {
                NSTIJKPlayerSkyTv.this.r.d();
            }
            NSTIJKPlayerSkyTv.this.f1();
            NSTIJKPlayerSkyTv.this.b1();
            NSTIJKPlayerSkyTv.this.G0(5000);
            if (NSTIJKPlayerSkyTv.this.s != null) {
                NSTIJKPlayerSkyTv.this.s.onCompletion(NSTIJKPlayerSkyTv.this.f29735l);
            }
        }
    }

    public class u implements IMediaPlayer.OnInfoListener {
        public u() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i2, int i3) {
            String str;
            String str2;
            if (NSTIJKPlayerSkyTv.this.w != null) {
                NSTIJKPlayerSkyTv.this.w.onInfo(iMediaPlayer, i2, i3);
            }
            if (i2 == 3) {
                NSTIJKPlayerSkyTv.this.d1(2);
                str = NSTIJKPlayerSkyTv.this.f29727d;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i2 == 10005) {
                NSTIJKPlayerSkyTv.this.d1(1);
                str = NSTIJKPlayerSkyTv.this.f29727d;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i2 == 901) {
                str = NSTIJKPlayerSkyTv.this.f29727d;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i2 != 902) {
                    if (i2 == 10001) {
                        NSTIJKPlayerSkyTv.this.q = i3;
                        Log.d(NSTIJKPlayerSkyTv.this.f29727d, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i3);
                        c.h.a.k.d.c.a.c cVar = NSTIJKPlayerSkyTv.this.S;
                        if (cVar != null) {
                            cVar.setVideoRotation(i3);
                        }
                    } else if (i2 != 10002) {
                        switch (i2) {
                            case 700:
                                str = NSTIJKPlayerSkyTv.this.f29727d;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerSkyTv.this.d1(1);
                                str = NSTIJKPlayerSkyTv.this.f29727d;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerSkyTv.this.d1(6);
                                str = NSTIJKPlayerSkyTv.this.f29727d;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerSkyTv.this.f29727d;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i3;
                                break;
                            default:
                                switch (i2) {
                                    case 800:
                                        str = NSTIJKPlayerSkyTv.this.f29727d;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerSkyTv.this.f29727d;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerSkyTv.this.f29727d;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerSkyTv.this.f29727d;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerSkyTv.this.f29727d;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            }
            Log.d(str, str2);
            return true;
        }
    }

    public static abstract class v {
    }

    public class w implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f29764b;

        public w(View view) {
            this.f29764b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29764b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29764b, "scaleY", f2);
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
                View view2 = this.f29764b;
                if (view2 != null && view2.getTag() != null && this.f29764b.getTag().equals("1") && NSTIJKPlayerSkyTv.this.s0 != null) {
                    NSTIJKPlayerSkyTv.this.s0.setBackgroundResource(R.drawable.black_button_dark);
                }
                a(1.0f);
                b(1.0f);
                return;
            }
            View view3 = this.f29764b;
            if (view3 != null && view3.getTag() != null && this.f29764b.getTag().equals("2")) {
                view.setBackground(NSTIJKPlayerSkyTv.this.getResources().getDrawable(R.drawable.selector_tracks_layout));
                return;
            }
            float f2 = z ? 1.12f : 1.0f;
            a(f2);
            b(f2);
            View view4 = this.f29764b;
            if (view4 == null || view4.getTag() == null || !this.f29764b.getTag().equals("1") || NSTIJKPlayerSkyTv.this.s0 == null) {
                return;
            }
            NSTIJKPlayerSkyTv.this.s0.setBackgroundResource(R.drawable.back_btn_effect);
        }
    }

    public class x extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f29766b;

        public x() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f29766b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            NSTIJKPlayerSkyTv.this.k1();
            return true;
        }
    }

    public class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f29768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f29769b;

        public y(Activity activity) {
            this.f29768a = activity;
        }

        public y a() {
            View view = this.f29769b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public y b(int i2) {
            this.f29769b = this.f29768a.findViewById(i2);
            return this;
        }

        public y c() {
            View view = this.f29769b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public y d(CharSequence charSequence) {
            View view = this.f29769b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public y e() {
            View view = this.f29769b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public static class z extends AsyncTask<String, Void, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f29771a;

        public z(Context context) {
            this.f29771a = context;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                c.h.a.i.q.f fVar = NSTIJKPlayerSkyTv.f29725b;
                if (fVar != null) {
                    fVar.L0(c.h.a.k.e.a.f().h());
                    NSTIJKPlayerSkyTv.f29725b.t(c.h.a.k.e.a.f().h());
                    NSTIJKPlayerSkyTv.f29725b.G0();
                }
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            try {
                if (bool.booleanValue()) {
                    Context context = this.f29771a;
                    if (context instanceof NSTIJKPlayerSkyTvActivity) {
                        ((NSTIJKPlayerSkyTvActivity) context).K2(2);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public NSTIJKPlayerSkyTv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29727d = "NSTIJKPlayerSkyTv";
        this.f29731h = 0;
        this.f29732i = 0;
        this.f29733j = 0;
        this.f29734k = null;
        this.f29735l = null;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = -1;
        this.C = -1L;
        this.D = true;
        this.E = false;
        this.F = 7000;
        this.I = 0;
        this.K = 0;
        this.L = 5;
        this.M = false;
        this.V = 0L;
        this.W = 0L;
        this.f0 = 0L;
        this.g0 = 0L;
        this.i0 = "visible";
        this.n0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.t0 = bool;
        this.u0 = bool;
        this.v0 = bool;
        this.w0 = bool;
        this.x0 = bool;
        this.y0 = bool;
        this.z0 = false;
        this.C0 = false;
        this.D0 = false;
        this.L0 = false;
        this.M0 = false;
        this.P0 = false;
        this.j1 = 0;
        this.x1 = false;
        this.G1 = new k();
        this.H1 = new n();
        this.I1 = new r();
        this.J1 = new s();
        this.K1 = new t();
        this.L1 = new u();
        this.M1 = new a();
        this.N1 = new b();
        this.O1 = new c();
        this.P1 = new d();
        this.Q1 = new e();
        this.R1 = 4;
        this.S1 = f29726c[0];
        this.T1 = new ArrayList();
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = false;
        Q0(context);
    }

    public final void F0() {
        c.h.a.k.d.c.a.b bVar;
        if (this.f29735l == null || (bVar = this.r) == null) {
            return;
        }
        bVar.b(this);
        this.r.c(getParent() instanceof View ? (View) getParent() : this);
        this.r.setEnabled(S0());
    }

    public void G0(int i2) {
        q qVar = new q();
        this.e1 = qVar;
        this.d1.postDelayed(qVar, i2);
    }

    public final void H0(IMediaPlayer iMediaPlayer, c.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    public final String I0(String str) {
        return TextUtils.isEmpty(str) ? "und" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[PHI: r2
  0x0054: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v6 java.lang.String) binds: [B:10:0x0030, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer J0(int r10) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv.J0(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void K0(int i2) {
        c.h.a.k.d.c.a.f.b(this.f29735l, i2);
    }

    public void L0() {
        c.h.a.k.d.b.a.d(this.f29735l);
    }

    public void M0(Boolean bool) {
        this.J = bool.booleanValue();
    }

    public void N0() {
        if (this.c1.getVisibility() == 0) {
            this.c1.startAnimation(this.g1);
            this.C1.startAnimation(this.g1);
            this.D1.startAnimation(this.g1);
            this.E1.startAnimation(this.g1);
            if (this.h1.getVisibility() == 0) {
                this.h1.startAnimation(this.g1);
            }
            if (this.m1.getVisibility() == 0) {
                this.m1.startAnimation(this.g1);
            }
            if (this.i1.getVisibility() == 0) {
                this.i1.startAnimation(this.g1);
            }
            this.c1.setVisibility(8);
            if (this.h1.getVisibility() == 0) {
                this.h1.setVisibility(8);
            }
            if (this.m1.getVisibility() == 0) {
                this.m1.setVisibility(8);
            }
            if (this.i1.getVisibility() == 0) {
                this.i1.setVisibility(8);
            }
            this.C1.setVisibility(8);
            this.D1.setVisibility(8);
            this.E1.setVisibility(8);
        }
    }

    public final void O0() {
        boolean zP = this.R.p();
        this.W1 = zP;
        if (zP) {
            c.h.a.k.d.b.a.b(getContext());
            this.f29735l = c.h.a.k.d.b.a.a();
        }
    }

    public final void P0() {
        this.T1.clear();
        if (this.R.s()) {
            this.T1.add(1);
        }
        if (this.R.t() && Build.VERSION.SDK_INT >= 14) {
            this.T1.add(2);
        }
        if (this.R.r()) {
            this.T1.add(0);
        }
        if (this.T1.isEmpty()) {
            this.T1.add(1);
        }
        int iIntValue = this.T1.get(this.U1).intValue();
        this.V1 = iIntValue;
        setRender(iIntValue);
    }

    public final void Q0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.Q = applicationContext;
        this.R = new c.h.a.k.d.a.a(applicationContext);
        this.O0 = new c.h.a.j.j(this, this.Q);
        O0();
        P0();
        this.f29736m = 0;
        this.f29737n = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f29732i = 0;
        this.f29733j = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        this.N0 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0);
        TextView textView = new TextView(context);
        this.h0 = textView;
        try {
            textView.setTextSize(2, Float.parseFloat(string));
        } catch (Exception unused) {
        }
        this.h0.setTextColor(context.getResources().getColor(R.color.white));
        this.h0.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(this.h0, layoutParams);
    }

    public boolean R0() {
        return this.W1;
    }

    public final boolean S0() {
        int i2;
        return (this.f29735l == null || (i2 = this.f29732i) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    @TargetApi(23)
    public void T0() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f29728e == null || this.f29734k == null) {
            return;
        }
        U0(false);
        try {
            ((AudioManager) this.Q.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            try {
                try {
                    this.f29735l = J0(this.R.x());
                    getContext();
                    this.f29735l.setOnPreparedListener(this.J1);
                    this.f29735l.setOnVideoSizeChangedListener(this.I1);
                    this.f29735l.setOnCompletionListener(this.K1);
                    this.f29735l.setOnErrorListener(this.M1);
                    this.f29735l.setOnInfoListener(this.L1);
                    this.f29735l.setOnBufferingUpdateListener(this.N1);
                    this.f29735l.setOnSeekCompleteListener(this.O1);
                    this.f29735l.setOnTimedTextListener(this.P1);
                    this.u = 0;
                    String scheme = this.f29728e.getScheme();
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23 && this.R.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                        this.f29735l.setDataSource(new c.h.a.k.d.c.a.a(new File(this.f29728e.toString())));
                    } else if (i2 >= 14) {
                        this.f29735l.setDataSource(this.Q, this.f29728e, this.f29730g);
                    } else {
                        this.f29735l.setDataSource(this.f29728e.toString());
                    }
                    H0(this.f29735l, this.f29734k);
                    this.f29735l.setAudioStreamType(3);
                    this.f29735l.setScreenOnWhilePlaying(true);
                    this.V = System.currentTimeMillis();
                    this.f29735l.prepareAsync();
                    this.p0 = this.j0.getResources().getDisplayMetrics().widthPixels;
                    AudioManager audioManager = (AudioManager) this.j0.getSystemService("audio");
                    this.l0 = audioManager;
                    this.m0 = audioManager.getStreamMaxVolume(3);
                    int streamVolume = this.l0.getStreamVolume(3);
                    this.b1.setMax(this.l0.getStreamMaxVolume(3));
                    this.b1.setProgress(streamVolume);
                    this.o0 = new GestureDetector(this.j0, new x());
                    m1();
                    this.A0 = new StringBuilder();
                    this.B0 = new Formatter(this.A0, Locale.getDefault());
                    this.f29732i = 1;
                } catch (NullPointerException e2) {
                    Log.w(this.f29727d, "Unable to open content: " + this.f29728e, e2);
                    this.f29732i = -1;
                    this.f29733j = -1;
                    onErrorListener = this.M1;
                    iMediaPlayer = this.f29735l;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                } catch (Exception e3) {
                    Log.w(this.f29727d, "Unable to open content: " + this.f29728e, e3);
                    this.f29732i = -1;
                    this.f29733j = -1;
                    onErrorListener = this.M1;
                    iMediaPlayer = this.f29735l;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (IOException e4) {
                Log.w(this.f29727d, "Unable to open content: " + this.f29728e, e4);
                this.f29732i = -1;
                this.f29733j = -1;
                onErrorListener = this.M1;
                iMediaPlayer = this.f29735l;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (IllegalArgumentException e5) {
            Log.w(this.f29727d, "Unable to open content: " + this.f29728e, e5);
            this.f29732i = -1;
            this.f29733j = -1;
            onErrorListener = this.M1;
            iMediaPlayer = this.f29735l;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    @Override // c.h.a.k.f.m
    public void U(String str) {
    }

    public void U0(boolean z2) {
        IMediaPlayer iMediaPlayer = this.f29735l;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f29735l.release();
            this.f29735l = null;
            this.f29732i = 0;
            if (z2) {
                this.f29733j = 0;
            }
            ((AudioManager) this.Q.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void V0() {
        IMediaPlayer iMediaPlayer = this.f29735l;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void W0() {
        Handler handler = this.G;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void X0(int i2) {
        c.h.a.k.d.c.a.f.e(this.f29735l, i2);
    }

    @Override // c.h.a.k.f.m
    public void Y(VodInfoCallback vodInfoCallback) {
    }

    public void Y0(Activity activity, NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, SeekBar seekBar, SeekBar seekBar2, LinearLayout linearLayout, Animation animation, Animation animation2, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView5, LinearLayout linearLayout4, Animation animation3, Animation animation4, TextView textView6, RelativeLayout relativeLayout, Animation animation5, Animation animation6, Animation animation7, RelativeLayout relativeLayout2, Animation animation8, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, FrameLayout frameLayout) {
        this.j0 = activity;
        this.k0 = nSTIJKPlayerSkyTv;
        this.G = new Handler();
        this.H = new Handler();
        this.T0 = radioGroup;
        this.U0 = radioGroup2;
        this.V0 = radioGroup3;
        this.S0 = textView;
        this.R0 = textView2;
        this.Q0 = textView3;
        this.X0 = textView4;
        this.a1 = seekBar;
        this.b1 = seekBar2;
        this.c1 = linearLayout;
        this.d1 = new Handler();
        this.f1 = animation;
        this.g1 = animation2;
        this.h1 = linearLayout2;
        this.i1 = linearLayout3;
        this.a1.setOnSeekBarChangeListener(this.G1);
        this.b1.setOnSeekBarChangeListener(this.H1);
        this.k1 = textView5;
        seekBar.setKeyProgressIncrement(1);
        float f2 = this.j0.getWindow().getAttributes().screenBrightness;
        this.n0 = f2;
        if (f2 == -1.0f) {
            this.n0 = this.R != null ? r3.o() : c.h.a.h.n.a.r0;
        }
        seekBar.setProgress((int) this.n0);
        this.m1 = linearLayout4;
        this.n1 = animation3;
        this.o1 = animation4;
        this.l1 = textView6;
        this.p1 = relativeLayout;
        this.q1 = animation5;
        this.r1 = animation6;
        this.s1 = animation7;
        this.v1 = relativeLayout2;
        this.t1 = animation8;
        this.E1 = linearLayout7;
        this.D1 = linearLayout6;
        this.C1 = linearLayout5;
        this.r0 = new y(activity);
        this.Y0 = frameLayout;
    }

    public final void Z0(Uri uri, Map<String, String> map, boolean z2, String str) {
        this.f29728e = uri;
        this.f29729f = str;
        this.f29730g = map;
        this.x = 0;
        this.J = z2;
        this.I = this.I;
        g1();
        T0();
        requestLayout();
        invalidate();
    }

    @Override // c.h.a.k.f.b
    public void a() {
    }

    public void a1(Uri uri, boolean z2, String str) {
        Z0(uri, null, z2, str);
    }

    @Override // c.h.a.k.f.b
    public void b() {
    }

    public void b1() {
        if (NSTIJKPlayerSkyTvActivity.f29288f && this.c1.getVisibility() == 8) {
            this.c1.startAnimation(this.f1);
            this.c1.setVisibility(0);
            if (this.h1.getVisibility() == 8) {
                this.h1.startAnimation(this.f1);
                this.h1.setVisibility(0);
            }
            if (this.m1.getVisibility() == 8 && !NSTIJKPlayerSkyTvActivity.c2()) {
                this.m1.startAnimation(this.f1);
                this.m1.setVisibility(0);
            }
            if (this.i1.getVisibility() == 8) {
                this.i1.startAnimation(this.f1);
                this.i1.setVisibility(0);
            }
            this.C1.startAnimation(this.f1);
            this.C1.setVisibility(0);
            this.D1.startAnimation(this.f1);
            this.D1.setVisibility(0);
            this.E1.startAnimation(this.f1);
            this.E1.setVisibility(0);
        }
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    public void c1(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout) {
        TextView textView5;
        int i2;
        ITrackInfo[] iTrackInfoArr;
        int i3;
        if (this.f29735l == null) {
            return;
        }
        radioGroup.removeAllViews();
        radioGroup2.removeAllViews();
        radioGroup3.removeAllViews();
        try {
            SharedPreferences sharedPreferences = this.j0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.N0 = sharedPreferences;
            textView4.setText(sharedPreferences.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0));
            frameLayout.setOnClickListener(new g());
        } catch (Exception unused) {
        }
        Boolean bool = Boolean.FALSE;
        this.y0 = bool;
        this.x0 = bool;
        this.w0 = bool;
        this.u0 = bool;
        this.t0 = bool;
        this.v0 = bool;
        int iD = c.h.a.k.d.c.a.f.d(this.f29735l, 1);
        int iD2 = c.h.a.k.d.c.a.f.d(this.f29735l, 2);
        int iD3 = c.h.a.k.d.c.a.f.d(this.f29735l, 3);
        ITrackInfo[] trackInfo = this.f29735l.getTrackInfo();
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
                        this.w0 = bool2;
                        if (!this.t0.booleanValue()) {
                            this.t0 = bool2;
                            RadioButton radioButton = new RadioButton(this.j0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(R.color.white));
                            radioButton.setTextSize(13.0f);
                            radioButton.setId(11111111);
                            if (Build.VERSION.SDK_INT >= 21) {
                                radioButton.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.Q, R.color.white)));
                            }
                            radioButton.setPadding(0, 0, 16, 0);
                            radioButton.setOnFocusChangeListener(new w(radioButton));
                            if (iD == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.j0);
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
                        radioButton2.setOnFocusChangeListener(new w(radioButton2));
                        if (i6 == iD) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new h(iD));
                        i4++;
                        i5 = i6;
                        trackInfo = iTrackInfoArr;
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.x0 = bool3;
                        if (!this.u0.booleanValue()) {
                            this.u0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.j0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(R.color.white));
                            radioButton3.setTextSize(13.0f);
                            if (Build.VERSION.SDK_INT >= 21) {
                                radioButton3.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.Q, R.color.white)));
                            }
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(0, 0, 16, 0);
                            radioButton3.setOnFocusChangeListener(new w(radioButton3));
                            if (iD2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.j0);
                        radioButton4.setText(i6 + ", " + iTrackInfo.getInfoInline() + ", " + I0(iTrackInfo.getLanguage()));
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
                        radioButton4.setOnFocusChangeListener(new w(radioButton4));
                        if (i6 == iD2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new i(iD2));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.y0 = bool4;
                        if (!this.v0.booleanValue()) {
                            this.v0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.j0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(R.color.white));
                            radioButton5.setTextSize(13.0f);
                            if (Build.VERSION.SDK_INT >= 21) {
                                radioButton5.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.Q, R.color.white)));
                            }
                            radioButton5.setId(111111);
                            radioButton5.setPadding(0, 0, 16, 0);
                            radioButton5.setOnFocusChangeListener(new w(radioButton5));
                            if (iD3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.j0);
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
                        radioButton6.setOnFocusChangeListener(new w(radioButton6));
                        if (i6 == iD3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new j(iD3));
                    }
                } else {
                    iTrackInfoArr = trackInfo;
                    i3 = length;
                }
                i4++;
                i5 = i6;
                trackInfo = iTrackInfoArr;
            }
            if (this.w0.booleanValue()) {
                i2 = 0;
                textView.setVisibility(8);
            } else {
                i2 = 0;
                textView.setVisibility(0);
            }
            if (this.x0.booleanValue()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(i2);
            }
            if (this.y0.booleanValue()) {
                textView3.setVisibility(8);
                return;
            }
            textView5 = textView3;
        }
        textView5.setVisibility(i2);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.y;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.z;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d1(int r18) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv.d1(int):void");
    }

    public void e1() {
        c.h.a.k.d.b.a.d(null);
    }

    public void f1() {
        Handler handler = this.d1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void g1() {
        IMediaPlayer iMediaPlayer = this.f29735l;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f29735l.release();
            this.f29735l = null;
            this.f29732i = 0;
            this.f29733j = 0;
            ((AudioManager) this.Q.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f29735l != null) {
            return this.u;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (S0()) {
            return (int) this.f29735l.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.I;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (S0()) {
            return (int) this.f29735l.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.J);
    }

    public int getNewSeekPosition() {
        return (int) this.C;
    }

    public boolean getPlayerIsPrepared() {
        return this.P0;
    }

    public String getShowOrHideSubtitles() {
        return this.i0;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f29735l;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void h1() {
        int i2;
        CharSequence[] charSequenceArr = {"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40"};
        b.a aVar = new b.a(this.B1);
        aVar.setTitle(getResources().getString(R.string.subtitle_font_size));
        String string = this.N0.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0);
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
        aVar.l(charSequenceArr, i2, new l());
        a.b.k.b bVarCreate = aVar.create();
        this.Z0 = bVarCreate;
        bVarCreate.setOnDismissListener(new m());
        this.Z0.show();
    }

    public final void i1(String str) {
        try {
            SharedPreferences sharedPreferences = this.j0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.N0 = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.W0 = editorEdit;
            if (editorEdit != null) {
                editorEdit.putString("pref.using_sub_font_size", str);
                this.W0.apply();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return S0() && (iMediaPlayer = this.f29735l) != null && iMediaPlayer.isPlaying();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int j1() {
        /*
            r6 = this;
            int r0 = r6.R1
            r1 = 1
            int r0 = r0 + r1
            r6.R1 = r0
            android.app.Activity r0 = r6.j0
            java.lang.String r2 = "loginPrefs"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
            r6.N = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.O = r0
            int r0 = r6.R1
            int[] r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv.f29726c
            int r4 = r2.length
            int r0 = r0 % r4
            r6.R1 = r0
            r0 = r2[r0]
            r6.S1 = r0
            c.h.a.k.d.c.a.c r0 = r6.S
            if (r0 == 0) goto Lb7
            android.app.Activity r0 = r6.j0
            r2 = 2131428290(0x7f0b03c2, float:1.847822E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.app.Activity r2 = r6.j0
            r4 = 2131427466(0x7f0b008a, float:1.847655E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            c.h.a.k.d.c.a.c r4 = r6.S
            int r5 = r6.S1
            r4.setAspectRatio(r5)
            int r4 = r6.R1
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
            int r2 = r6.R1
            java.lang.String r4 = "aspect_ratio"
            r1.putInt(r4, r2)
            android.content.SharedPreferences$Editor r1 = r6.O
            r1.apply()
            r0.setVisibility(r3)
            android.widget.LinearLayout r1 = r6.m1
            if (r1 == 0) goto La5
            int r1 = r1.getVisibility()
            if (r1 != 0) goto La5
            android.widget.LinearLayout r1 = r6.m1
            r2 = 8
            r1.setVisibility(r2)
        La5:
            android.os.Handler r1 = r6.H
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.os.Handler r1 = r6.H
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$f r2 = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$f
            r2.<init>(r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r2, r3)
        Lb7:
            int r0 = r6.S1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv.j1():int");
    }

    public void k1() {
        RelativeLayout relativeLayout;
        SeekBar seekBar = this.b1;
        if (seekBar != null) {
            seekBar.setProgress(this.l0.getStreamVolume(3));
        }
        f1();
        if (this.p1.getVisibility() == 0) {
            this.p1.startAnimation(this.q1);
            relativeLayout = this.p1;
        } else {
            if (this.v1.getVisibility() != 0) {
                if (this.c1.getVisibility() == 0) {
                    N0();
                    return;
                } else {
                    b1();
                    G0(5000);
                    return;
                }
            }
            this.v1.startAnimation(this.t1);
            relativeLayout = this.v1;
        }
        relativeLayout.setVisibility(8);
    }

    public final void l1() {
        if (this.r.a()) {
            this.r.d();
        } else {
            this.r.show();
        }
    }

    public final void m1() {
        View viewFindViewById = this.j0.findViewById(R.id.app_video_box);
        this.q0 = viewFindViewById;
        viewFindViewById.setClickable(true);
        this.q0.setOnTouchListener(new o());
    }

    public final void n1() {
        try {
            IMediaPlayer iMediaPlayer = this.f29735l;
            if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                this.r0.b(R.id.iv_pause).a();
                this.r0.b(R.id.iv_play).e();
                if (this.F1 != null) {
                    throw null;
                }
                return;
            }
            this.r0.b(R.id.iv_play).a();
            this.r0.b(R.id.iv_pause).e();
            if (this.F1 != null) {
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z2 = (i2 == 4 || i2 == 24 || i2 == 25 || i2 == 164 || i2 == 82 || i2 == 5 || i2 == 6) ? false : true;
        if (S0() && z2 && this.r != null) {
            if (i2 == 79 || i2 == 85) {
                IMediaPlayer iMediaPlayer = this.f29735l;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.r.d();
                } else {
                    pause();
                    this.r.show();
                }
                return true;
            }
            if (i2 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f29735l;
                if (iMediaPlayer2 != null && !iMediaPlayer2.isPlaying()) {
                    start();
                    this.r.d();
                }
                return true;
            }
            if (i2 == 86 || i2 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f29735l;
                if (iMediaPlayer3 != null && iMediaPlayer3.isPlaying()) {
                    pause();
                    this.r.show();
                }
                return true;
            }
            l1();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (S0() && (iMediaPlayer = this.f29735l) != null && iMediaPlayer.isPlaying()) {
            this.f29735l.pause();
            this.f29732i = 4;
        }
        this.f29733j = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i2) {
        if (S0()) {
            this.f0 = System.currentTimeMillis();
            this.f29735l.seekTo(i2);
            i2 = 0;
        }
        this.x = i2;
    }

    public void setAdjustViewBounds(boolean z2) {
        if (this.w1 == z2) {
            return;
        }
        this.w1 = z2;
        if (z2) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setContext(Context context) {
        this.B1 = context;
    }

    public void setCurrentChannelLogo(String str) {
        this.z1 = str;
    }

    public void setCurrentEpgChannelID(String str) {
        this.y1 = str;
    }

    public void setCurrentWindowIndex(int i2) {
        this.I = i2;
    }

    public void setEPGHandler(Handler handler) {
        this.A1 = handler;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setLiveStreamDBHandler(c.h.a.i.q.f fVar) {
        f29725b = fVar;
    }

    public void setMediaController(c.h.a.k.d.c.a.b bVar) {
        c.h.a.k.d.c.a.b bVar2 = this.r;
        if (bVar2 != null) {
            bVar2.d();
        }
        this.r = bVar;
        F0();
    }

    public void setMovieListener(v vVar) {
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.s = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.v = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.w = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.t = onPreparedListener;
    }

    public void setRender(int i2) {
        c.h.a.k.d.c.a.c gVar;
        if (i2 == 0) {
            gVar = null;
        } else if (i2 == 1) {
            gVar = new c.h.a.k.d.c.a.g(getContext());
        } else {
            if (i2 != 2) {
                Log.e(this.f29727d, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i2)));
                return;
            }
            c.h.a.k.d.c.a.i iVar = new c.h.a.k.d.c.a.i(getContext());
            gVar = iVar;
            if (this.f29735l != null) {
                iVar.getSurfaceHolder().b(this.f29735l);
                iVar.a(this.f29735l.getVideoWidth(), this.f29735l.getVideoHeight());
                iVar.b(this.f29735l.getVideoSarNum(), this.f29735l.getVideoSarDen());
                iVar.setAspectRatio(this.S1);
                gVar = iVar;
            }
        }
        setRenderView(gVar);
    }

    public void setRenderView(c.h.a.k.d.c.a.c cVar) {
        int i2;
        int i3;
        if (this.S != null) {
            IMediaPlayer iMediaPlayer = this.f29735l;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.S.getView();
            this.S.e(this.Q1);
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
        this.R1 = i4;
        cVar.setAspectRatio(i4);
        int i5 = this.f29736m;
        if (i5 > 0 && (i3 = this.f29737n) > 0) {
            cVar.a(i5, i3);
        }
        int i6 = this.T;
        if (i6 > 0 && (i2 = this.U) > 0) {
            cVar.b(i6, i2);
        }
        View view2 = this.S.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.S.d(this.Q1);
        this.S.setVideoRotation(this.q);
    }

    public void setShowOrHideSubtitles(String str) {
        this.i0 = str;
    }

    public void setTitle(CharSequence charSequence) {
        this.r0.b(R.id.tv_episode_name).d(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (S0()) {
            this.f29735l.start();
            this.f29732i = 3;
        }
        this.f29733j = 3;
    }
}
