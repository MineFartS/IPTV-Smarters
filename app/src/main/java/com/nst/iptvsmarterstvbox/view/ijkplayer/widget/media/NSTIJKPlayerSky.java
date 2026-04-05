package minefarts.iptvsmarters.view.ijkplayer.widget.media;

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
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TextView;
import c.h.a.k.d.c.a.c;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.VodInfoCallback;
import minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity;
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
public class NSTIJKPlayerSky extends FrameLayout implements MediaController.MediaPlayerControl, c.h.a.k.f.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f29678b = {0, 1, 2, 3, 4, 5};
    public int A;
    public Formatter A0;
    public boolean A1;
    public long B;
    public boolean B0;
    public boolean B1;
    public boolean C;
    public boolean C0;
    public String C1;
    public boolean D;
    public SharedPreferences D0;
    public String D1;
    public int E;
    public SharedPreferences E0;
    public Handler E1;
    public Handler F;
    public SharedPreferences F0;
    public Context F1;
    public Handler G;
    public SharedPreferences G0;
    public c.h.a.i.q.f G1;
    public int H;
    public SharedPreferences.Editor H0;
    public w H1;
    public boolean I;
    public SharedPreferences.Editor I0;
    public final SeekBar.OnSeekBarChangeListener I1;
    public int J;
    public SharedPreferences.Editor J0;
    public final SeekBar.OnSeekBarChangeListener J1;
    public int K;
    public boolean K0;
    public IMediaPlayer.OnVideoSizeChangedListener K1;
    public boolean L;
    public boolean L0;
    public IMediaPlayer.OnPreparedListener L1;
    public SharedPreferences M;
    public SharedPreferences M0;
    public IMediaPlayer.OnCompletionListener M1;
    public SharedPreferences.Editor N;
    public c.h.a.j.j N0;
    public IMediaPlayer.OnInfoListener N1;
    public SharedPreferences O;
    public boolean O0;
    public IMediaPlayer.OnErrorListener O1;
    public Context P;
    public TextView P0;
    public IMediaPlayer.OnBufferingUpdateListener P1;
    public c.h.a.k.d.a.a Q;
    public TextView Q0;
    public IMediaPlayer.OnSeekCompleteListener Q1;
    public c.h.a.k.d.c.a.c R;
    public TextView R0;
    public IMediaPlayer.OnTimedTextListener R1;
    public int S;
    public RadioGroup S0;
    public c.a S1;
    public int T;
    public RadioGroup T0;
    public int T1;
    public long U;
    public RadioGroup U0;
    public int U1;
    public long V;
    public SharedPreferences.Editor V0;
    public List<Integer> V1;
    public long W;
    public TextView W0;
    public int W1;
    public FrameLayout X0;
    public int X1;
    public a.b.k.b Y0;
    public boolean Y1;
    public SeekBar Z0;
    public SeekBar a1;
    public LinearLayout b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29679c;
    public Handler c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f29680d;
    public Runnable d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29681e;
    public Handler e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, String> f29682f;
    public long f0;
    public Runnable f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29683g;
    public TextView g0;
    public Animation g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29684h;
    public String h0;
    public Animation h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29685i;
    public Activity i0;
    public ImageView i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.b f29686j;
    public NSTIJKPlayerSky j0;
    public ImageView j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IMediaPlayer f29687k;
    public AudioManager k0;
    public LinearLayout k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29688l;
    public int l0;
    public LinearLayout l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29689m;
    public float m0;
    public int m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29690n;
    public GestureDetector n0;
    public TextView n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29691o;
    public int o0;
    public TextView o1;
    public int p;
    public View p0;
    public LinearLayout p1;
    public c.h.a.k.d.c.a.b q;
    public z q0;
    public Animation q1;
    public IMediaPlayer.OnCompletionListener r;
    public Button r0;
    public Animation r1;
    public IMediaPlayer.OnPreparedListener s;
    public Boolean s0;
    public RelativeLayout s1;
    public int t;
    public Boolean t0;
    public Animation t1;
    public IMediaPlayer.OnErrorListener u;
    public Boolean u0;
    public LinearLayout u1;
    public IMediaPlayer.OnInfoListener v;
    public Boolean v0;
    public Animation v1;
    public int w;
    public Boolean w0;
    public Animation w1;
    public boolean x;
    public Boolean x0;
    public Animation x1;
    public boolean y;
    public boolean y0;
    public SharedPreferences y1;
    public boolean z;
    public StringBuilder z0;
    public RelativeLayout z1;

    public class a implements IMediaPlayer.OnInfoListener {
        public a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i2, int i3) {
            String str;
            String str2;
            if (NSTIJKPlayerSky.this.v != null) {
                NSTIJKPlayerSky.this.v.onInfo(iMediaPlayer, i2, i3);
            }
            if (i2 == 3) {
                NSTIJKPlayerSky.this.i1(2);
                str = NSTIJKPlayerSky.this.f29679c;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i2 == 10005) {
                NSTIJKPlayerSky.this.i1(1);
                str = NSTIJKPlayerSky.this.f29679c;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i2 == 901) {
                str = NSTIJKPlayerSky.this.f29679c;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i2 != 902) {
                    if (i2 == 10001) {
                        NSTIJKPlayerSky.this.p = i3;
                        Log.d(NSTIJKPlayerSky.this.f29679c, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i3);
                        c.h.a.k.d.c.a.c cVar = NSTIJKPlayerSky.this.R;
                        if (cVar != null) {
                            cVar.setVideoRotation(i3);
                        }
                    } else if (i2 != 10002) {
                        switch (i2) {
                            case 700:
                                str = NSTIJKPlayerSky.this.f29679c;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerSky.this.i1(1);
                                str = NSTIJKPlayerSky.this.f29679c;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerSky.this.i1(6);
                                str = NSTIJKPlayerSky.this.f29679c;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerSky.this.f29679c;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i3;
                                break;
                            default:
                                switch (i2) {
                                    case 800:
                                        str = NSTIJKPlayerSky.this.f29679c;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerSky.this.f29679c;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerSky.this.f29679c;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerSky.this.f29679c;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerSky.this.f29679c;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            }
            Log.d(str, str2);
            return true;
        }
    }

    public class b implements IMediaPlayer.OnErrorListener {
        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i2, int i3) {
            Log.d(NSTIJKPlayerSky.this.f29679c, "Error: " + i2 + "," + i3);
            NSTIJKPlayerSky.this.f29684h = -1;
            NSTIJKPlayerSky.this.f29685i = -1;
            if (NSTIJKPlayerSky.this.q != null) {
                NSTIJKPlayerSky.this.q.d();
            }
            NSTIJKPlayerSky.this.i1(-1);
            if (NSTIJKPlayerSky.this.u == null || NSTIJKPlayerSky.this.u.onError(NSTIJKPlayerSky.this.f29687k, i2, i3)) {
            }
            return true;
        }
    }

    public class c implements IMediaPlayer.OnBufferingUpdateListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i2) {
            NSTIJKPlayerSky.this.t = i2;
        }
    }

    public class d implements IMediaPlayer.OnSeekCompleteListener {
        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSky.this.f0 = System.currentTimeMillis();
        }
    }

    public class e implements IMediaPlayer.OnTimedTextListener {
        public e() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            TextView textView;
            if (ijkTimedText == null) {
                NSTIJKPlayerSky.this.g0.setVisibility(8);
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
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            nSTIJKPlayerSky.M0 = nSTIJKPlayerSky.P.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                NSTIJKPlayerSky.this.g0.setTextSize(2, Float.parseFloat(NSTIJKPlayerSky.this.M0.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0)));
            } catch (Exception unused2) {
            }
            if (NSTIJKPlayerSky.this.getShowOrHideSubtitles().equals("visible")) {
                NSTIJKPlayerSky.this.g0.setVisibility(0);
            } else {
                NSTIJKPlayerSky.this.g0.setVisibility(8);
            }
            if (sb.length() > 0) {
                textView = NSTIJKPlayerSky.this.g0;
                strReplace = sb.toString();
            } else {
                textView = NSTIJKPlayerSky.this.g0;
            }
            textView.setText(strReplace);
        }
    }

    public class f implements c.a {
        public f() {
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void a(c.b bVar, int i2, int i3, int i4) {
            c.h.a.k.d.c.a.c cVarA = bVar.a();
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            if (cVarA != nSTIJKPlayerSky.R) {
                Log.e(nSTIJKPlayerSky.f29679c, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerSky.f29690n = i3;
            NSTIJKPlayerSky.this.f29691o = i4;
            boolean z = true;
            boolean z2 = NSTIJKPlayerSky.this.f29685i == 3;
            if (NSTIJKPlayerSky.this.R.c() && (NSTIJKPlayerSky.this.f29688l != i3 || NSTIJKPlayerSky.this.f29689m != i4)) {
                z = false;
            }
            if (NSTIJKPlayerSky.this.f29687k != null && z2 && z) {
                if (NSTIJKPlayerSky.this.w != 0) {
                    NSTIJKPlayerSky nSTIJKPlayerSky2 = NSTIJKPlayerSky.this;
                    nSTIJKPlayerSky2.seekTo(nSTIJKPlayerSky2.w);
                }
                NSTIJKPlayerSky.this.start();
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void b(c.b bVar, int i2, int i3) {
            c.h.a.k.d.c.a.c cVarA = bVar.a();
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            if (cVarA != nSTIJKPlayerSky.R) {
                Log.e(nSTIJKPlayerSky.f29679c, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerSky.f29686j = bVar;
            if (NSTIJKPlayerSky.this.f29687k == null) {
                NSTIJKPlayerSky.this.V0();
            } else {
                NSTIJKPlayerSky nSTIJKPlayerSky2 = NSTIJKPlayerSky.this;
                nSTIJKPlayerSky2.I0(nSTIJKPlayerSky2.f29687k, bVar);
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void c(c.b bVar) {
            c.h.a.k.d.c.a.c cVarA = bVar.a();
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            if (cVarA != nSTIJKPlayerSky.R) {
                Log.e(nSTIJKPlayerSky.f29679c, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                nSTIJKPlayerSky.f29686j = null;
                NSTIJKPlayerSky.this.X0();
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f29698b;

        public g(LinearLayout linearLayout) {
            this.f29698b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29698b.setVisibility(8);
            if (NSTIJKPlayerSky.this.b1.getVisibility() != 0 || NSTIJKPlayerSky.this.p1 == null) {
                return;
            }
            NSTIJKPlayerSky.this.p1.setVisibility(0);
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSky.this.n1();
        }
    }

    public class i implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29701b;

        public i(int i2) {
            this.f29701b = i2;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            nSTIJKPlayerSky.J0 = nSTIJKPlayerSky.G0.edit();
            if (i2 == 111 || i2 == 11111111) {
                NSTIJKPlayerSky.this.J0.putInt("currentVideoTrack", -1);
                NSTIJKPlayerSky.this.L0(this.f29701b);
            } else {
                NSTIJKPlayerSky.this.J0.putInt("currentVideoTrack", i2);
                NSTIJKPlayerSky.this.b1(i2);
            }
            NSTIJKPlayerSky.this.J0.apply();
        }
    }

    public class j implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29703b;

        public j(int i2) {
            this.f29703b = i2;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            nSTIJKPlayerSky.I0 = nSTIJKPlayerSky.F0.edit();
            if (i2 == 1111 || i2 == 1111111) {
                NSTIJKPlayerSky.this.I0.putInt("currentAudioTrack", -1);
                NSTIJKPlayerSky.this.L0(this.f29703b);
            } else {
                NSTIJKPlayerSky.this.I0.putInt("currentAudioTrack", i2);
                int currentPosition = (int) NSTIJKPlayerSky.this.f29687k.getCurrentPosition();
                NSTIJKPlayerSky.this.b1(i2);
                NSTIJKPlayerSky.this.f29687k.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            NSTIJKPlayerSky.this.I0.apply();
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
            NSTIJKPlayerSky.this.m0 = i2;
            int i4 = (int) ((NSTIJKPlayerSky.this.m0 / 255.0f) * 100.0f);
            if (i4 < 20) {
                textView = NSTIJKPlayerSky.this.n1;
                resources = NSTIJKPlayerSky.this.getResources();
                i3 = R.drawable.hp_bright_1;
            } else if (i4 < 30) {
                textView = NSTIJKPlayerSky.this.n1;
                resources = NSTIJKPlayerSky.this.getResources();
                i3 = R.drawable.hp_bright_2;
            } else if (i4 < 40) {
                textView = NSTIJKPlayerSky.this.n1;
                resources = NSTIJKPlayerSky.this.getResources();
                i3 = R.drawable.hp_bright_3;
            } else if (i4 < 50) {
                textView = NSTIJKPlayerSky.this.n1;
                resources = NSTIJKPlayerSky.this.getResources();
                i3 = R.drawable.hp_bright_4;
            } else if (i4 < 60) {
                textView = NSTIJKPlayerSky.this.n1;
                resources = NSTIJKPlayerSky.this.getResources();
                i3 = R.drawable.hp_bright_5;
            } else if (i4 < 70) {
                textView = NSTIJKPlayerSky.this.n1;
                resources = NSTIJKPlayerSky.this.getResources();
                i3 = R.drawable.hp_bright_6;
            } else {
                textView = NSTIJKPlayerSky.this.n1;
                resources = NSTIJKPlayerSky.this.getResources();
                i3 = R.drawable.hp_bright_7;
            }
            textView.setBackground(resources.getDrawable(i3));
            WindowManager.LayoutParams attributes = NSTIJKPlayerSky.this.i0.getWindow().getAttributes();
            attributes.screenBrightness = NSTIJKPlayerSky.this.m0 / 255.0f;
            NSTIJKPlayerSky.this.Q.R((int) NSTIJKPlayerSky.this.m0);
            NSTIJKPlayerSky.this.i0.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSky.this.k1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSky.this.k1();
            NSTIJKPlayerSky.this.G0(3000);
        }
    }

    public class l implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29706b;

        public l(int i2) {
            this.f29706b = i2;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            nSTIJKPlayerSky.H0 = nSTIJKPlayerSky.E0.edit();
            if (i2 == 11111 || i2 == 111111) {
                TextView textView = NSTIJKPlayerSky.this.g0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NSTIJKPlayerSky.this.H0.putInt("currentSubtitleTrack", -1);
                NSTIJKPlayerSky.this.L0(this.f29706b);
            } else {
                TextView textView2 = NSTIJKPlayerSky.this.g0;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                NSTIJKPlayerSky.this.H0.putInt("currentSubtitleTrack", i2);
                NSTIJKPlayerSky.this.b1(i2);
            }
            NSTIJKPlayerSky.this.H0.apply();
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(DialogInterface dialogInterface, int i2) {
            NSTIJKPlayerSky nSTIJKPlayerSky;
            String str;
            switch (i2) {
                case 0:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "10";
                    break;
                case 1:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "12";
                    break;
                case 2:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "14";
                    break;
                case 3:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "16";
                    break;
                case 4:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "18";
                    break;
                case 5:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "20";
                    break;
                case 6:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "22";
                    break;
                case 7:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "24";
                    break;
                case 8:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "26";
                    break;
                case 9:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "28";
                    break;
                case 10:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "30";
                    break;
                case 11:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "32";
                    break;
                case 12:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "34";
                    break;
                case 13:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "36";
                    break;
                case 14:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "38";
                    break;
                case 15:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "40";
                    break;
                default:
                    return;
            }
            nSTIJKPlayerSky.o1(str);
            NSTIJKPlayerSky.this.W0.setText(str);
            dialogInterface.cancel();
        }
    }

    public class n implements DialogInterface.OnDismissListener {
        public n() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class o implements SeekBar.OnSeekBarChangeListener {
        public o() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            TextView textView;
            Drawable drawable;
            Resources resources;
            if (NSTIJKPlayerSky.this.k0 != null) {
                try {
                    NSTIJKPlayerSky.this.k0.setStreamVolume(3, i2, 0);
                    int streamVolume = (int) ((NSTIJKPlayerSky.this.k0.getStreamVolume(3) / NSTIJKPlayerSky.this.l0) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        textView = NSTIJKPlayerSky.this.o1;
                        drawable = NSTIJKPlayerSky.this.getResources().getDrawable(R.drawable.hp_volume_mute);
                    } else if (streamVolume < 40) {
                        textView = NSTIJKPlayerSky.this.o1;
                        drawable = NSTIJKPlayerSky.this.getResources().getDrawable(R.drawable.hp_volume_1);
                    } else if (streamVolume < 80) {
                        textView = NSTIJKPlayerSky.this.o1;
                        drawable = NSTIJKPlayerSky.this.getResources().getDrawable(R.drawable.hp_volume_2);
                    } else {
                        if (streamVolume < 100) {
                            textView = NSTIJKPlayerSky.this.o1;
                            resources = NSTIJKPlayerSky.this.getResources();
                        } else {
                            textView = NSTIJKPlayerSky.this.o1;
                            resources = NSTIJKPlayerSky.this.getResources();
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
            NSTIJKPlayerSky.this.k1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSky.this.k1();
            NSTIJKPlayerSky.this.G0(3000);
        }
    }

    public class p implements View.OnTouchListener {
        public p() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return (((LinearLayout) NSTIJKPlayerSky.this.i0.findViewById(R.id.ll_layout_to_hide_1)).getVisibility() == 0 || motionEvent == null || !NSTIJKPlayerSky.this.n0.onTouchEvent(motionEvent)) ? false : true;
        }
    }

    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            nSTIJKPlayerSky.J++;
            c.h.a.h.n.e.l0(nSTIJKPlayerSky.i0, NSTIJKPlayerSky.this.i0.getResources().getString(R.string.play_back_error) + " (" + NSTIJKPlayerSky.this.J + "/" + NSTIJKPlayerSky.this.K + ")");
            NSTIJKPlayerSky.this.V0();
            NSTIJKPlayerSky.this.start();
        }
    }

    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSky.this.P0();
        }
    }

    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSky.this.O0();
        }
    }

    public class t implements IMediaPlayer.OnVideoSizeChangedListener {
        public t() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i2, int i3, int i4, int i5) {
            NSTIJKPlayerSky.this.f29688l = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSky.this.f29689m = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerSky.this.S = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerSky.this.T = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerSky.this.f29688l == 0 || NSTIJKPlayerSky.this.f29689m == 0) {
                return;
            }
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            c.h.a.k.d.c.a.c cVar = nSTIJKPlayerSky.R;
            if (cVar != null) {
                cVar.a(nSTIJKPlayerSky.f29688l, NSTIJKPlayerSky.this.f29689m);
                NSTIJKPlayerSky nSTIJKPlayerSky2 = NSTIJKPlayerSky.this;
                nSTIJKPlayerSky2.R.b(nSTIJKPlayerSky2.S, NSTIJKPlayerSky.this.T);
            }
            NSTIJKPlayerSky.this.requestLayout();
        }
    }

    public class u implements IMediaPlayer.OnPreparedListener {
        public u() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSky.this.V = System.currentTimeMillis();
            NSTIJKPlayerSky.this.f29684h = 2;
            if (NSTIJKPlayerSky.this.s != null) {
                NSTIJKPlayerSky.this.s.onPrepared(NSTIJKPlayerSky.this.f29687k);
            }
            if (NSTIJKPlayerSky.this.q != null) {
                NSTIJKPlayerSky.this.q.setEnabled(true);
            }
            NSTIJKPlayerSky.this.f29688l = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSky.this.f29689m = iMediaPlayer.getVideoHeight();
            int i2 = NSTIJKPlayerSky.this.w;
            if (i2 != 0) {
                NSTIJKPlayerSky.this.seekTo(i2);
            }
            if (NSTIJKPlayerSky.this.f29688l == 0 || NSTIJKPlayerSky.this.f29689m == 0) {
                if (NSTIJKPlayerSky.this.f29685i == 3) {
                    NSTIJKPlayerSky.this.start();
                    return;
                }
                return;
            }
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            c.h.a.k.d.c.a.c cVar = nSTIJKPlayerSky.R;
            if (cVar != null) {
                cVar.a(nSTIJKPlayerSky.f29688l, NSTIJKPlayerSky.this.f29689m);
                NSTIJKPlayerSky nSTIJKPlayerSky2 = NSTIJKPlayerSky.this;
                nSTIJKPlayerSky2.R.b(nSTIJKPlayerSky2.S, NSTIJKPlayerSky.this.T);
                if (!NSTIJKPlayerSky.this.R.c() || (NSTIJKPlayerSky.this.f29690n == NSTIJKPlayerSky.this.f29688l && NSTIJKPlayerSky.this.f29691o == NSTIJKPlayerSky.this.f29689m)) {
                    if (NSTIJKPlayerSky.this.f29685i == 3) {
                        NSTIJKPlayerSky.this.start();
                        if (NSTIJKPlayerSky.this.q != null) {
                            NSTIJKPlayerSky.this.q.show();
                            return;
                        }
                        return;
                    }
                    if (NSTIJKPlayerSky.this.isPlaying()) {
                        return;
                    }
                    if ((i2 != 0 || NSTIJKPlayerSky.this.getCurrentPosition() > 0) && NSTIJKPlayerSky.this.q != null) {
                        NSTIJKPlayerSky.this.q.show(0);
                    }
                }
            }
        }
    }

    public class v implements IMediaPlayer.OnCompletionListener {
        public v() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSky.this.f29684h = 5;
            NSTIJKPlayerSky.this.f29685i = 5;
            if (NSTIJKPlayerSky.this.q != null) {
                NSTIJKPlayerSky.this.q.d();
            }
            NSTIJKPlayerSky.this.k1();
            NSTIJKPlayerSky.this.f1();
            NSTIJKPlayerSky.this.G0(5000);
            if (NSTIJKPlayerSky.this.r != null) {
                NSTIJKPlayerSky.this.r.onCompletion(NSTIJKPlayerSky.this.f29687k);
            }
        }
    }

    public static abstract class w {
        public abstract void a();

        public abstract void b();
    }

    public class x implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f29718b;

        public x(View view) {
            this.f29718b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29718b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29718b, "scaleY", f2);
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
                View view2 = this.f29718b;
                if (view2 != null && view2.getTag() != null && this.f29718b.getTag().equals("1") && NSTIJKPlayerSky.this.r0 != null) {
                    NSTIJKPlayerSky.this.r0.setBackgroundResource(R.drawable.black_button_dark);
                }
                a(1.0f);
                b(1.0f);
                return;
            }
            View view3 = this.f29718b;
            if (view3 != null && view3.getTag() != null && this.f29718b.getTag().equals("2")) {
                view.setBackground(NSTIJKPlayerSky.this.getResources().getDrawable(R.drawable.selector_tracks_layout));
                return;
            }
            float f2 = z ? 1.12f : 1.0f;
            a(f2);
            b(f2);
            View view4 = this.f29718b;
            if (view4 == null || view4.getTag() == null || !this.f29718b.getTag().equals("1") || NSTIJKPlayerSky.this.r0 == null) {
                return;
            }
            NSTIJKPlayerSky.this.r0.setBackgroundResource(R.drawable.back_btn_effect);
        }
    }

    public class y extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f29720b;

        public y() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f29720b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            NSTIJKPlayerSky.this.q1();
            return true;
        }
    }

    public class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f29722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f29723b;

        public z(Activity activity) {
            this.f29722a = activity;
        }

        public z a() {
            View view = this.f29723b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public z b(int i2) {
            this.f29723b = this.f29722a.findViewById(i2);
            return this;
        }

        public z c() {
            View view = this.f29723b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public z d(CharSequence charSequence) {
            View view = this.f29723b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public z e() {
            View view = this.f29723b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerSky(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29679c = "NSTIJKPlayerSky";
        this.f29683g = 0;
        this.f29684h = 0;
        this.f29685i = 0;
        this.f29686j = null;
        this.f29687k = null;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = -1;
        this.B = -1L;
        this.C = true;
        this.D = false;
        this.E = 7000;
        this.H = 0;
        this.J = 0;
        this.K = 5;
        this.L = false;
        this.U = 0L;
        this.V = 0L;
        this.W = 0L;
        this.f0 = 0L;
        this.h0 = "visible";
        this.m0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.s0 = bool;
        this.t0 = bool;
        this.u0 = bool;
        this.v0 = bool;
        this.w0 = bool;
        this.x0 = bool;
        this.y0 = false;
        this.B0 = false;
        this.C0 = false;
        this.K0 = false;
        this.L0 = false;
        this.O0 = false;
        this.m1 = 0;
        this.B1 = false;
        this.I1 = new k();
        this.J1 = new o();
        this.K1 = new t();
        this.L1 = new u();
        this.M1 = new v();
        this.N1 = new a();
        this.O1 = new b();
        this.P1 = new c();
        this.Q1 = new d();
        this.R1 = new e();
        this.S1 = new f();
        this.T1 = 4;
        this.U1 = f29678b[0];
        this.V1 = new ArrayList();
        this.W1 = 0;
        this.X1 = 0;
        this.Y1 = false;
        S0(context);
    }

    public final void F0() {
        c.h.a.k.d.c.a.b bVar;
        if (this.f29687k == null || (bVar = this.q) == null) {
            return;
        }
        bVar.b(this);
        this.q.c(getParent() instanceof View ? (View) getParent() : this);
        this.q.setEnabled(U0());
    }

    public void G0(int i2) {
        if (NSTIJKPlayerSkyActivity.f29220j) {
            return;
        }
        s sVar = new s();
        this.d1 = sVar;
        this.c1.postDelayed(sVar, i2);
    }

    public void H0(int i2) {
        r rVar = new r();
        this.f1 = rVar;
        this.e1.postDelayed(rVar, i2);
    }

    public final void I0(IMediaPlayer iMediaPlayer, c.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    public final String J0(String str) {
        return TextUtils.isEmpty(str) ? "und" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[PHI: r2
  0x0054: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v6 java.lang.String) binds: [B:10:0x0030, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer K0(int r10) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSky.K0(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void L0(int i2) {
        c.h.a.k.d.c.a.f.b(this.f29687k, i2);
    }

    public void M0() {
        c.h.a.k.d.b.a.d(this.f29687k);
    }

    public void N0(Boolean bool) {
        this.I = bool.booleanValue();
    }

    public void O0() {
        if (NSTIJKPlayerSkyActivity.f29220j || this.b1.getVisibility() != 0) {
            return;
        }
        this.b1.startAnimation(this.h1);
        if (this.k1.getVisibility() == 0) {
            this.k1.startAnimation(this.h1);
        }
        if (this.i1.getVisibility() == 0) {
            this.i1.startAnimation(this.h1);
        }
        if (this.p1.getVisibility() == 0) {
            this.p1.startAnimation(this.h1);
        }
        if (this.j1.getVisibility() == 0) {
            this.j1.startAnimation(this.h1);
        }
        if (this.l1.getVisibility() == 0) {
            this.l1.startAnimation(this.h1);
        }
        this.b1.setVisibility(8);
        if (this.k1.getVisibility() == 0) {
            this.k1.setVisibility(8);
        }
        if (this.i1.getVisibility() == 0) {
            this.i1.setVisibility(8);
        }
        if (this.p1.getVisibility() == 0) {
            this.p1.setVisibility(8);
        }
        if (this.j1.getVisibility() == 0) {
            this.j1.setVisibility(8);
        }
        if (this.l1.getVisibility() == 0) {
            this.l1.setVisibility(8);
        }
    }

    public void P0() {
        if (this.u1.getVisibility() == 0) {
            this.u1.startAnimation(this.w1);
            this.u1.setVisibility(8);
        }
    }

    public final void Q0() {
        boolean zP = this.Q.p();
        this.Y1 = zP;
        if (zP) {
            c.h.a.k.d.b.a.b(getContext());
            this.f29687k = c.h.a.k.d.b.a.a();
        }
    }

    public final void R0() {
        this.V1.clear();
        if (this.Q.s()) {
            this.V1.add(1);
        }
        if (this.Q.t() && Build.VERSION.SDK_INT >= 14) {
            this.V1.add(2);
        }
        if (this.Q.r()) {
            this.V1.add(0);
        }
        if (this.V1.isEmpty()) {
            this.V1.add(1);
        }
        int iIntValue = this.V1.get(this.W1).intValue();
        this.X1 = iIntValue;
        setRender(iIntValue);
    }

    public final void S0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.P = applicationContext;
        this.Q = new c.h.a.k.d.a.a(applicationContext);
        this.N0 = new c.h.a.j.j(this, this.P);
        Q0();
        R0();
        this.f29688l = 0;
        this.f29689m = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f29684h = 0;
        this.f29685i = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        this.M0 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0);
        TextView textView = new TextView(context);
        this.g0 = textView;
        try {
            textView.setTextSize(2, Float.parseFloat(string));
        } catch (Exception unused) {
        }
        this.g0.setTextColor(context.getResources().getColor(R.color.white));
        this.g0.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(this.g0, layoutParams);
    }

    public boolean T0() {
        return this.Y1;
    }

    @Override // c.h.a.k.f.m
    public void U(String str) {
    }

    public final boolean U0() {
        int i2;
        return (this.f29687k == null || (i2 = this.f29684h) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    @TargetApi(23)
    public void V0() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f29680d == null || this.f29686j == null) {
            return;
        }
        W0(false);
        try {
            ((AudioManager) this.P.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            try {
                try {
                    this.f29687k = K0(this.Q.x());
                    getContext();
                    this.f29687k.setOnPreparedListener(this.L1);
                    this.f29687k.setOnVideoSizeChangedListener(this.K1);
                    this.f29687k.setOnCompletionListener(this.M1);
                    this.f29687k.setOnErrorListener(this.O1);
                    this.f29687k.setOnInfoListener(this.N1);
                    this.f29687k.setOnBufferingUpdateListener(this.P1);
                    this.f29687k.setOnSeekCompleteListener(this.Q1);
                    this.f29687k.setOnTimedTextListener(this.R1);
                    this.t = 0;
                    String scheme = this.f29680d.getScheme();
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23 && this.Q.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                        this.f29687k.setDataSource(new c.h.a.k.d.c.a.a(new File(this.f29680d.toString())));
                    } else if (i2 >= 14) {
                        this.f29687k.setDataSource(this.P, this.f29680d, this.f29682f);
                    } else {
                        this.f29687k.setDataSource(this.f29680d.toString());
                    }
                    I0(this.f29687k, this.f29686j);
                    this.f29687k.setAudioStreamType(3);
                    this.f29687k.setScreenOnWhilePlaying(true);
                    this.U = System.currentTimeMillis();
                    this.f29687k.prepareAsync();
                    this.o0 = this.i0.getResources().getDisplayMetrics().widthPixels;
                    AudioManager audioManager = (AudioManager) this.i0.getSystemService("audio");
                    this.k0 = audioManager;
                    this.l0 = audioManager.getStreamMaxVolume(3);
                    int streamVolume = this.k0.getStreamVolume(3);
                    this.a1.setMax(this.k0.getStreamMaxVolume(3));
                    this.a1.setProgress(streamVolume);
                    this.n0 = new GestureDetector(this.i0, new y());
                    s1();
                    this.z0 = new StringBuilder();
                    this.A0 = new Formatter(this.z0, Locale.getDefault());
                    this.f29684h = 1;
                } catch (NullPointerException e2) {
                    Log.w(this.f29679c, "Unable to open content: " + this.f29680d, e2);
                    this.f29684h = -1;
                    this.f29685i = -1;
                    onErrorListener = this.O1;
                    iMediaPlayer = this.f29687k;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                } catch (Exception e3) {
                    Log.w(this.f29679c, "Unable to open content: " + this.f29680d, e3);
                    this.f29684h = -1;
                    this.f29685i = -1;
                    onErrorListener = this.O1;
                    iMediaPlayer = this.f29687k;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (IOException e4) {
                Log.w(this.f29679c, "Unable to open content: " + this.f29680d, e4);
                this.f29684h = -1;
                this.f29685i = -1;
                onErrorListener = this.O1;
                iMediaPlayer = this.f29687k;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (IllegalArgumentException e5) {
            Log.w(this.f29679c, "Unable to open content: " + this.f29680d, e5);
            this.f29684h = -1;
            this.f29685i = -1;
            onErrorListener = this.O1;
            iMediaPlayer = this.f29687k;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    public void W0(boolean z2) {
        IMediaPlayer iMediaPlayer = this.f29687k;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f29687k.release();
            this.f29687k = null;
            this.f29684h = 0;
            if (z2) {
                this.f29685i = 0;
            }
            ((AudioManager) this.P.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void X0() {
        IMediaPlayer iMediaPlayer = this.f29687k;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    @Override // c.h.a.k.f.m
    public void Y(VodInfoCallback vodInfoCallback) {
    }

    public void Y0() {
        Handler handler = this.F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public int Z0() {
        c.h.a.k.d.c.a.c cVar = this.R;
        if (cVar == null || cVar.getView() == null || this.R.getView().getHeight() == 0) {
            return 0;
        }
        return this.R.getView().getHeight();
    }

    @Override // c.h.a.k.f.b
    public void a() {
    }

    public int a1() {
        c.h.a.k.d.c.a.c cVar = this.R;
        if (cVar == null || cVar.getView() == null || this.R.getView().getWidth() == 0) {
            return 0;
        }
        return this.R.getView().getWidth();
    }

    @Override // c.h.a.k.f.b
    public void b() {
    }

    public void b1(int i2) {
        c.h.a.k.d.c.a.f.e(this.f29687k, i2);
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
    }

    public void c1(Activity activity, NSTIJKPlayerSky nSTIJKPlayerSky, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, SeekBar seekBar, SeekBar seekBar2, LinearLayout linearLayout, Animation animation, Animation animation2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView5, LinearLayout linearLayout4, Animation animation3, Animation animation4, TextView textView6, RelativeLayout relativeLayout, Animation animation5, LinearLayout linearLayout5, Animation animation6, Animation animation7, RelativeLayout relativeLayout2, Animation animation8, FrameLayout frameLayout) {
        this.i0 = activity;
        this.j0 = nSTIJKPlayerSky;
        this.F = new Handler();
        this.G = new Handler();
        this.S0 = radioGroup;
        this.T0 = radioGroup2;
        this.U0 = radioGroup3;
        this.R0 = textView;
        this.Q0 = textView2;
        this.P0 = textView3;
        this.W0 = textView4;
        this.Z0 = seekBar;
        this.a1 = seekBar2;
        this.b1 = linearLayout;
        this.c1 = new Handler();
        this.e1 = new Handler();
        this.g1 = animation;
        this.h1 = animation2;
        this.i1 = imageView;
        this.j1 = imageView2;
        this.k1 = linearLayout2;
        this.l1 = linearLayout3;
        this.Z0.setOnSeekBarChangeListener(this.I1);
        this.a1.setOnSeekBarChangeListener(this.J1);
        this.n1 = textView5;
        seekBar.setKeyProgressIncrement(1);
        float f2 = this.i0.getWindow().getAttributes().screenBrightness;
        this.m0 = f2;
        if (f2 == -1.0f) {
            this.m0 = this.Q != null ? r3.o() : c.h.a.h.n.a.r0;
        }
        seekBar.setProgress((int) this.m0);
        this.p1 = linearLayout4;
        this.q1 = animation3;
        this.r1 = animation4;
        this.o1 = textView6;
        this.s1 = relativeLayout;
        this.t1 = animation5;
        this.u1 = linearLayout5;
        this.v1 = animation6;
        this.w1 = animation7;
        this.z1 = relativeLayout2;
        this.x1 = animation8;
        this.X0 = frameLayout;
        this.q0 = new z(activity);
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

    public final void d1(Uri uri, Map<String, String> map, boolean z2, String str) {
        this.f29680d = uri;
        this.f29681e = str;
        this.f29682f = map;
        this.w = 0;
        this.I = z2;
        this.H = this.H;
        m1();
        V0();
        requestLayout();
        invalidate();
    }

    public void e1(Uri uri, boolean z2, String str) {
        d1(uri, null, z2, str);
    }

    public void f1() {
        if (!NSTIJKPlayerSkyActivity.f29220j && NSTIJKPlayerSkyActivity.f29216f && this.b1.getVisibility() == 8) {
            t1();
            this.b1.startAnimation(this.g1);
            this.b1.setVisibility(0);
            if (this.k1.getVisibility() == 8) {
                this.k1.startAnimation(this.g1);
                this.k1.setVisibility(0);
            }
            if (this.i1.getVisibility() == 8) {
                this.i1.startAnimation(this.g1);
                this.i1.setVisibility(0);
            }
            if (this.p1.getVisibility() == 8 && !NSTIJKPlayerSkyActivity.S1()) {
                this.p1.startAnimation(this.g1);
                this.p1.setVisibility(0);
            }
            if (this.j1.getVisibility() == 8) {
                this.j1.startAnimation(this.g1);
                this.j1.setVisibility(0);
            }
            if (this.l1.getVisibility() == 8) {
                this.l1.startAnimation(this.g1);
                this.l1.setVisibility(0);
            }
        }
    }

    public void g1() {
        if (this.b1.getVisibility() == 8) {
            this.u1.startAnimation(this.v1);
            this.u1.setVisibility(0);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f29687k != null) {
            return this.t;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (U0()) {
            return (int) this.f29687k.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.H;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (U0()) {
            return (int) this.f29687k.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.I);
    }

    public int getNewSeekPosition() {
        return (int) this.B;
    }

    public boolean getPlayerIsPrepared() {
        return this.O0;
    }

    public String getShowOrHideSubtitles() {
        return this.h0;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f29687k;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    public void h1(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout) {
        TextView textView5;
        int i2;
        ITrackInfo[] iTrackInfoArr;
        int i3;
        if (this.f29687k == null) {
            return;
        }
        radioGroup.removeAllViews();
        radioGroup2.removeAllViews();
        radioGroup3.removeAllViews();
        try {
            SharedPreferences sharedPreferences = this.i0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.M0 = sharedPreferences;
            textView4.setText(sharedPreferences.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0));
            frameLayout.setOnClickListener(new h());
        } catch (Exception unused) {
        }
        Boolean bool = Boolean.FALSE;
        this.x0 = bool;
        this.w0 = bool;
        this.v0 = bool;
        this.t0 = bool;
        this.s0 = bool;
        this.u0 = bool;
        int iD = c.h.a.k.d.c.a.f.d(this.f29687k, 1);
        int iD2 = c.h.a.k.d.c.a.f.d(this.f29687k, 2);
        int iD3 = c.h.a.k.d.c.a.f.d(this.f29687k, 3);
        ITrackInfo[] trackInfo = this.f29687k.getTrackInfo();
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
                        this.v0 = bool2;
                        if (!this.s0.booleanValue()) {
                            this.s0 = bool2;
                            RadioButton radioButton = new RadioButton(this.i0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(R.color.white));
                            radioButton.setTextSize(13.0f);
                            radioButton.setId(11111111);
                            if (Build.VERSION.SDK_INT >= 21) {
                                radioButton.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.P, R.color.white)));
                            }
                            radioButton.setPadding(0, 0, 16, 0);
                            radioButton.setOnFocusChangeListener(new x(radioButton));
                            if (iD == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.i0);
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
                            radioButton2.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.P, R.color.white)));
                        }
                        radioButton2.setPadding(0, 0, 16, 0);
                        radioButton2.setOnFocusChangeListener(new x(radioButton2));
                        if (i6 == iD) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new i(iD));
                        i4++;
                        i5 = i6;
                        trackInfo = iTrackInfoArr;
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.w0 = bool3;
                        if (!this.t0.booleanValue()) {
                            this.t0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.i0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(R.color.white));
                            radioButton3.setTextSize(13.0f);
                            if (Build.VERSION.SDK_INT >= 21) {
                                radioButton3.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.P, R.color.white)));
                            }
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(0, 0, 16, 0);
                            radioButton3.setOnFocusChangeListener(new x(radioButton3));
                            if (iD2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.i0);
                        radioButton4.setText(i6 + ", " + iTrackInfo.getInfoInline() + ", " + J0(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(R.color.white));
                        radioButton4.setTextSize(13.0f);
                        if (Build.VERSION.SDK_INT >= 21) {
                            radioButton4.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.P, R.color.white)));
                        }
                        if (i6 == -1) {
                            radioButton4.setId(1111);
                        } else {
                            radioButton4.setId(i6);
                        }
                        radioButton4.setPadding(0, 0, 16, 0);
                        radioButton4.setOnFocusChangeListener(new x(radioButton4));
                        if (i6 == iD2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new j(iD2));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.x0 = bool4;
                        if (!this.u0.booleanValue()) {
                            this.u0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.i0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(R.color.white));
                            radioButton5.setTextSize(13.0f);
                            if (Build.VERSION.SDK_INT >= 21) {
                                radioButton5.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.P, R.color.white)));
                            }
                            radioButton5.setId(111111);
                            radioButton5.setPadding(0, 0, 16, 0);
                            radioButton5.setOnFocusChangeListener(new x(radioButton5));
                            if (iD3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.i0);
                        radioButton6.setText(i6 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(R.color.white));
                        radioButton6.setTextSize(13.0f);
                        if (Build.VERSION.SDK_INT >= 21) {
                            radioButton6.setButtonTintList(ColorStateList.valueOf(a.i.i.b.d(this.P, R.color.white)));
                        }
                        if (i6 == -1) {
                            radioButton6.setId(11111);
                        } else {
                            radioButton6.setId(i6);
                        }
                        radioButton6.setPadding(0, 0, 16, 0);
                        radioButton6.setOnFocusChangeListener(new x(radioButton6));
                        if (i6 == iD3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new l(iD3));
                    }
                } else {
                    iTrackInfoArr = trackInfo;
                    i3 = length;
                }
                i4++;
                i5 = i6;
                trackInfo = iTrackInfoArr;
            }
            if (this.v0.booleanValue()) {
                i2 = 0;
                textView.setVisibility(8);
            } else {
                i2 = 0;
                textView.setVisibility(0);
            }
            if (this.w0.booleanValue()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(i2);
            }
            if (this.x0.booleanValue()) {
                textView3.setVisibility(8);
                return;
            }
            textView5 = textView3;
        }
        textView5.setVisibility(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i1(int r18) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSky.i1(int):void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return U0() && (iMediaPlayer = this.f29687k) != null && iMediaPlayer.isPlaying();
    }

    public void j1() {
        c.h.a.k.d.b.a.d(null);
    }

    public void k1() {
        Handler handler;
        if (NSTIJKPlayerSkyActivity.f29220j || (handler = this.c1) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public void l1() {
        Handler handler = this.e1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void m1() {
        IMediaPlayer iMediaPlayer = this.f29687k;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f29687k.release();
            this.f29687k = null;
            this.f29684h = 0;
            this.f29685i = 0;
            ((AudioManager) this.P.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void n1() {
        int i2;
        CharSequence[] charSequenceArr = {"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40"};
        b.a aVar = new b.a(this.F1);
        aVar.setTitle(getResources().getString(R.string.subtitle_font_size));
        String string = this.M0.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0);
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
        aVar.l(charSequenceArr, i2, new m());
        a.b.k.b bVarCreate = aVar.create();
        this.Y0 = bVarCreate;
        bVarCreate.setOnDismissListener(new n());
        this.Y0.show();
    }

    public final void o1(String str) {
        try {
            SharedPreferences sharedPreferences = this.i0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.M0 = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.V0 = editorEdit;
            if (editorEdit != null) {
                editorEdit.putString("pref.using_sub_font_size", str);
                this.V0.apply();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z2 = (i2 == 4 || i2 == 24 || i2 == 25 || i2 == 164 || i2 == 82 || i2 == 5 || i2 == 6) ? false : true;
        if (U0() && z2 && this.q != null) {
            if (i2 == 79 || i2 == 85) {
                IMediaPlayer iMediaPlayer = this.f29687k;
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
                IMediaPlayer iMediaPlayer2 = this.f29687k;
                if (iMediaPlayer2 != null && !iMediaPlayer2.isPlaying()) {
                    start();
                    this.q.d();
                }
                return true;
            }
            if (i2 == 86 || i2 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f29687k;
                if (iMediaPlayer3 != null && iMediaPlayer3.isPlaying()) {
                    pause();
                    this.q.show();
                }
                return true;
            }
            r1();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int p1() {
        /*
            r6 = this;
            int r0 = r6.T1
            r1 = 1
            int r0 = r0 + r1
            r6.T1 = r0
            android.app.Activity r0 = r6.i0
            java.lang.String r2 = "loginPrefs"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
            r6.M = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.N = r0
            int r0 = r6.T1
            int[] r2 = minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSky.f29678b
            int r4 = r2.length
            int r0 = r0 % r4
            r6.T1 = r0
            r0 = r2[r0]
            r6.U1 = r0
            c.h.a.k.d.c.a.c r0 = r6.R
            if (r0 == 0) goto Lb7
            android.app.Activity r0 = r6.i0
            r2 = 2131428290(0x7f0b03c2, float:1.847822E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.app.Activity r2 = r6.i0
            r4 = 2131427466(0x7f0b008a, float:1.847655E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            c.h.a.k.d.c.a.c r4 = r6.R
            int r5 = r6.U1
            r4.setAspectRatio(r5)
            int r4 = r6.T1
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
            android.content.SharedPreferences$Editor r1 = r6.N
            int r2 = r6.T1
            java.lang.String r4 = "aspect_ratio"
            r1.putInt(r4, r2)
            android.content.SharedPreferences$Editor r1 = r6.N
            r1.apply()
            r0.setVisibility(r3)
            android.widget.LinearLayout r1 = r6.p1
            if (r1 == 0) goto La5
            int r1 = r1.getVisibility()
            if (r1 != 0) goto La5
            android.widget.LinearLayout r1 = r6.p1
            r2 = 8
            r1.setVisibility(r2)
        La5:
            android.os.Handler r1 = r6.G
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.os.Handler r1 = r6.G
            minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSky$g r2 = new minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSky$g
            r2.<init>(r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r2, r3)
        Lb7:
            int r0 = r6.U1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSky.p1():int");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (U0() && (iMediaPlayer = this.f29687k) != null && iMediaPlayer.isPlaying()) {
            this.f29687k.pause();
            this.f29684h = 4;
        }
        this.f29685i = 4;
    }

    public void q1() {
        RelativeLayout relativeLayout;
        if (NSTIJKPlayerSkyActivity.f29220j) {
            l1();
            if (this.u1.getVisibility() == 0) {
                P0();
                return;
            } else {
                g1();
                H0(3000);
                return;
            }
        }
        SeekBar seekBar = this.a1;
        if (seekBar != null) {
            seekBar.setProgress(this.k0.getStreamVolume(3));
        }
        k1();
        if (this.s1.getVisibility() == 0) {
            this.s1.startAnimation(this.t1);
            relativeLayout = this.s1;
        } else {
            if (this.z1.getVisibility() != 0) {
                if (this.b1.getVisibility() == 0) {
                    O0();
                    return;
                } else {
                    f1();
                    G0(5000);
                    return;
                }
            }
            this.z1.startAnimation(this.x1);
            relativeLayout = this.z1;
        }
        relativeLayout.setVisibility(8);
    }

    public final void r1() {
        if (this.q.a()) {
            this.q.d();
        } else {
            this.q.show();
        }
    }

    public final void s1() {
        View viewFindViewById = this.i0.findViewById(R.id.app_video_box);
        this.p0 = viewFindViewById;
        viewFindViewById.setClickable(true);
        this.p0.setOnTouchListener(new p());
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i2) {
        if (U0()) {
            this.W = System.currentTimeMillis();
            this.f29687k.seekTo(i2);
            i2 = 0;
        }
        this.w = i2;
    }

    public void setAdjustViewBounds(boolean z2) {
        if (this.A1 == z2) {
            return;
        }
        this.A1 = z2;
        if (z2) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setContext(Context context) {
        this.F1 = context;
    }

    public void setCurrentChannelLogo(String str) {
        this.D1 = str;
    }

    public void setCurrentEpgChannelID(String str) {
        this.C1 = str;
    }

    public void setCurrentWindowIndex(int i2) {
        this.H = i2;
    }

    public void setEPGHandler(Handler handler) {
        this.E1 = handler;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setLiveStreamDBHandler(c.h.a.i.q.f fVar) {
        this.G1 = fVar;
    }

    public void setMediaController(c.h.a.k.d.c.a.b bVar) {
        c.h.a.k.d.c.a.b bVar2 = this.q;
        if (bVar2 != null) {
            bVar2.d();
        }
        this.q = bVar;
        F0();
    }

    public void setMovieListener(w wVar) {
        this.H1 = wVar;
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

    public void setRender(int i2) {
        c.h.a.k.d.c.a.c gVar;
        if (i2 == 0) {
            gVar = null;
        } else if (i2 == 1) {
            gVar = new c.h.a.k.d.c.a.g(getContext());
        } else {
            if (i2 != 2) {
                Log.e(this.f29679c, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i2)));
                return;
            }
            c.h.a.k.d.c.a.i iVar = new c.h.a.k.d.c.a.i(getContext());
            gVar = iVar;
            if (this.f29687k != null) {
                iVar.getSurfaceHolder().b(this.f29687k);
                iVar.a(this.f29687k.getVideoWidth(), this.f29687k.getVideoHeight());
                iVar.b(this.f29687k.getVideoSarNum(), this.f29687k.getVideoSarDen());
                iVar.setAspectRatio(this.U1);
                gVar = iVar;
            }
        }
        setRenderView(gVar);
    }

    public void setRenderView(c.h.a.k.d.c.a.c cVar) {
        int i2;
        int i3;
        if (this.R != null) {
            IMediaPlayer iMediaPlayer = this.f29687k;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.R.getView();
            this.R.e(this.S1);
            this.R = null;
            removeView(view);
        }
        if (cVar == null) {
            return;
        }
        this.R = cVar;
        SharedPreferences sharedPreferences = this.P.getSharedPreferences("loginPrefs", 0);
        this.M = sharedPreferences;
        int i4 = sharedPreferences.getInt("aspect_ratio", 4);
        this.T1 = i4;
        cVar.setAspectRatio(i4);
        int i5 = this.f29688l;
        if (i5 > 0 && (i3 = this.f29689m) > 0) {
            cVar.a(i5, i3);
        }
        int i6 = this.S;
        if (i6 > 0 && (i2 = this.T) > 0) {
            cVar.b(i6, i2);
        }
        View view2 = this.R.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.R.d(this.S1);
        this.R.setVideoRotation(this.p);
    }

    public void setShowOrHideSubtitles(String str) {
        this.h0 = str;
    }

    public void setTitle(CharSequence charSequence) {
        this.q0.b(R.id.tv_episode_name).d(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (U0()) {
            this.f29687k.start();
            this.f29684h = 3;
        }
        this.f29685i = 3;
    }

    public void t1() {
        ProgressBar progressBar = (ProgressBar) this.i0.findViewById(R.id.progressBar);
        TextView textView = (TextView) this.i0.findViewById(R.id.tv_current_program);
        TextView textView2 = (TextView) this.i0.findViewById(R.id.tv_current_time);
        TextView textView3 = (TextView) this.i0.findViewById(R.id.tv_next_program);
        TextView textView4 = (TextView) this.i0.findViewById(R.id.tv_next_program_time);
        ImageView imageView = (ImageView) this.i0.findViewById(R.id.iv_channel_logo);
        LinearLayout linearLayout = (LinearLayout) this.i0.findViewById(R.id.ll_epg1_box);
        LinearLayout linearLayout2 = (LinearLayout) this.i0.findViewById(R.id.ll_epg2_box);
        LinearLayout linearLayout3 = (LinearLayout) this.i0.findViewById(R.id.ll_epg3_box);
        LinearLayout linearLayout4 = (LinearLayout) this.i0.findViewById(R.id.ll_epg4_box);
        LinearLayout linearLayout5 = (LinearLayout) this.i0.findViewById(R.id.ll_no_guide);
        LinearLayout linearLayout6 = (LinearLayout) this.i0.findViewById(R.id.ll_epg_loader);
        TextView textView5 = (TextView) this.i0.findViewById(R.id.tv_epg1_date);
        TextView textView6 = (TextView) this.i0.findViewById(R.id.tv_epg2_date);
        TextView textView7 = (TextView) this.i0.findViewById(R.id.tv_epg3_date);
        TextView textView8 = (TextView) this.i0.findViewById(R.id.tv_epg4_date);
        TextView textView9 = (TextView) this.i0.findViewById(R.id.tv_epg1_program);
        TextView textView10 = (TextView) this.i0.findViewById(R.id.tv_epg2_program);
        TextView textView11 = (TextView) this.i0.findViewById(R.id.tv_epg3_program);
        TextView textView12 = (TextView) this.i0.findViewById(R.id.tv_epg4_program);
        Handler handler = this.E1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        new NSTIJKPlayerSkyActivity().U2(this.C1, this.D1, this.G1, this.F1, progressBar, textView, textView2, textView3, textView4, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
    }

    public final void u1() {
        try {
            IMediaPlayer iMediaPlayer = this.f29687k;
            if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                this.q0.b(R.id.iv_pause).a();
                this.q0.b(R.id.iv_play).e();
                w wVar = this.H1;
                if (wVar != null) {
                    wVar.b();
                }
            } else {
                this.q0.b(R.id.iv_play).a();
                this.q0.b(R.id.iv_pause).e();
                w wVar2 = this.H1;
                if (wVar2 != null) {
                    wVar2.a();
                }
            }
        } catch (Exception unused) {
        }
    }
}
