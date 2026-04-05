package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TableLayout;
import android.widget.TextView;
import c.h.a.k.d.c.a.c;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nst.iptvsmarterstvbox.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerSmallEPG extends FrameLayout implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f29772b = {0, 1, 2, 3, 4, 5};
    public int A;
    public IMediaPlayer.OnVideoSizeChangedListener A0;
    public long B;
    public IMediaPlayer.OnPreparedListener B0;
    public boolean C;
    public IMediaPlayer.OnCompletionListener C0;
    public boolean D;
    public IMediaPlayer.OnInfoListener D0;
    public boolean E;
    public IMediaPlayer.OnErrorListener E0;
    public int F;
    public IMediaPlayer.OnBufferingUpdateListener F0;
    public Handler G;
    public IMediaPlayer.OnSeekCompleteListener G0;
    public Handler H;
    public IMediaPlayer.OnTimedTextListener H0;
    public boolean I;
    public c.a I0;
    public int J;
    public int J0;
    public boolean K;
    public int K0;
    public int L;
    public List<Integer> L0;
    public int M;
    public int M0;
    public boolean N;
    public int N0;
    public SharedPreferences O;
    public boolean O0;
    public SharedPreferences P;
    public Context Q;
    public c.h.a.k.d.a.a R;
    public c.h.a.k.d.c.a.c S;
    public int T;
    public int U;
    public long V;
    public long W;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f29774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, String> f29776f;
    public long f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29777g;
    public long g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29778h;
    public TextView h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29779i;
    public Activity i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.b f29780j;
    public NSTIJKPlayerSmallEPG j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IMediaPlayer f29781k;
    public AudioManager k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29782l;
    public int l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29783m;
    public float m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29784n;
    public int n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29785o;
    public m o0;
    public int p;
    public Boolean p0;
    public c.h.a.k.d.c.a.b q;
    public Boolean q0;
    public IMediaPlayer.OnCompletionListener r;
    public Boolean r0;
    public IMediaPlayer.OnPreparedListener s;
    public Boolean s0;
    public int t;
    public Boolean t0;
    public IMediaPlayer.OnErrorListener u;
    public Boolean u0;
    public IMediaPlayer.OnInfoListener v;
    public SharedPreferences v0;
    public int w;
    public SharedPreferences w0;
    public boolean x;
    public SharedPreferences x0;
    public boolean y;
    public SharedPreferences y0;
    public boolean z;
    public Handler z0;

    public class a implements IMediaPlayer.OnBufferingUpdateListener {
        public a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i2) {
            NSTIJKPlayerSmallEPG.this.t = i2;
        }
    }

    public class b implements IMediaPlayer.OnSeekCompleteListener {
        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSmallEPG.this.g0 = System.currentTimeMillis();
        }
    }

    public class c implements IMediaPlayer.OnTimedTextListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            if (ijkTimedText != null) {
                NSTIJKPlayerSmallEPG.this.h0.setText(ijkTimedText.getText().replace("{\\b1}", BuildConfig.FLAVOR).replace("{\\b0}", BuildConfig.FLAVOR).replace("{\\i1}", BuildConfig.FLAVOR).replace("{\\i0}", BuildConfig.FLAVOR));
            }
        }
    }

    public class d implements c.a {
        public d() {
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void a(c.b bVar, int i2, int i3, int i4) {
            if (bVar.a() != NSTIJKPlayerSmallEPG.this.S) {
                Log.e(NSTIJKPlayerSmallEPG.this.f29773c, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerSmallEPG.this.f29784n = i3;
            NSTIJKPlayerSmallEPG.this.f29785o = i4;
            boolean z = true;
            boolean z2 = NSTIJKPlayerSmallEPG.this.f29779i == 3;
            if (NSTIJKPlayerSmallEPG.this.S.c() && (NSTIJKPlayerSmallEPG.this.f29782l != i3 || NSTIJKPlayerSmallEPG.this.f29783m != i4)) {
                z = false;
            }
            if (NSTIJKPlayerSmallEPG.this.f29781k != null && z2 && z) {
                if (NSTIJKPlayerSmallEPG.this.w != 0) {
                    NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = NSTIJKPlayerSmallEPG.this;
                    nSTIJKPlayerSmallEPG.seekTo(nSTIJKPlayerSmallEPG.w);
                }
                NSTIJKPlayerSmallEPG.this.start();
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void b(c.b bVar, int i2, int i3) {
            if (bVar.a() != NSTIJKPlayerSmallEPG.this.S) {
                Log.e(NSTIJKPlayerSmallEPG.this.f29773c, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerSmallEPG.this.f29780j = bVar;
            if (NSTIJKPlayerSmallEPG.this.f29781k == null) {
                NSTIJKPlayerSmallEPG.this.V();
            } else {
                NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = NSTIJKPlayerSmallEPG.this;
                nSTIJKPlayerSmallEPG.J(nSTIJKPlayerSmallEPG.f29781k, bVar);
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void c(c.b bVar) {
            if (bVar.a() != NSTIJKPlayerSmallEPG.this.S) {
                Log.e(NSTIJKPlayerSmallEPG.this.f29773c, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                NSTIJKPlayerSmallEPG.this.f29780j = null;
                NSTIJKPlayerSmallEPG.this.X();
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSmallEPG.this.P();
        }
    }

    public class f extends Handler {
        public f(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 2) {
                NSTIJKPlayerSmallEPG.this.N(false);
            } else {
                if (i2 != 4) {
                    return;
                }
                NSTIJKPlayerSmallEPG.this.o0.b(R.id.app_video_volume_box).a();
                NSTIJKPlayerSmallEPG.this.o0.b(R.id.app_video_brightness_box).a();
                NSTIJKPlayerSmallEPG.this.o0.b(R.id.app_video_fastForward_box).a();
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = NSTIJKPlayerSmallEPG.this;
            nSTIJKPlayerSmallEPG.L++;
            nSTIJKPlayerSmallEPG.O();
            c.h.a.h.n.e.l0(NSTIJKPlayerSmallEPG.this.i0, NSTIJKPlayerSmallEPG.this.i0.getResources().getString(R.string.play_back_error) + " (" + NSTIJKPlayerSmallEPG.this.L + "/" + NSTIJKPlayerSmallEPG.this.M + ")");
            NSTIJKPlayerSmallEPG.this.V();
            NSTIJKPlayerSmallEPG.this.start();
        }
    }

    public class h implements IMediaPlayer.OnVideoSizeChangedListener {
        public h() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i2, int i3, int i4, int i5) {
            NSTIJKPlayerSmallEPG.this.f29782l = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSmallEPG.this.f29783m = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerSmallEPG.this.T = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerSmallEPG.this.U = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerSmallEPG.this.f29782l == 0 || NSTIJKPlayerSmallEPG.this.f29783m == 0) {
                return;
            }
            if (NSTIJKPlayerSmallEPG.this.S != null) {
                NSTIJKPlayerSmallEPG.this.S.a(NSTIJKPlayerSmallEPG.this.f29782l, NSTIJKPlayerSmallEPG.this.f29783m);
                NSTIJKPlayerSmallEPG.this.S.b(NSTIJKPlayerSmallEPG.this.T, NSTIJKPlayerSmallEPG.this.U);
            }
            NSTIJKPlayerSmallEPG.this.requestLayout();
        }
    }

    public class i implements IMediaPlayer.OnPreparedListener {
        public i() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSmallEPG.this.W = System.currentTimeMillis();
            NSTIJKPlayerSmallEPG.this.f29778h = 2;
            if (NSTIJKPlayerSmallEPG.this.s != null) {
                NSTIJKPlayerSmallEPG.this.s.onPrepared(NSTIJKPlayerSmallEPG.this.f29781k);
            }
            if (NSTIJKPlayerSmallEPG.this.q != null) {
                NSTIJKPlayerSmallEPG.this.q.setEnabled(true);
            }
            NSTIJKPlayerSmallEPG.this.f29782l = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSmallEPG.this.f29783m = iMediaPlayer.getVideoHeight();
            int i2 = NSTIJKPlayerSmallEPG.this.w;
            if (i2 != 0) {
                NSTIJKPlayerSmallEPG.this.seekTo(i2);
            }
            if (NSTIJKPlayerSmallEPG.this.f29782l == 0 || NSTIJKPlayerSmallEPG.this.f29783m == 0) {
                if (NSTIJKPlayerSmallEPG.this.f29779i == 3) {
                    NSTIJKPlayerSmallEPG.this.start();
                    return;
                }
                return;
            }
            if (NSTIJKPlayerSmallEPG.this.S != null) {
                NSTIJKPlayerSmallEPG.this.S.a(NSTIJKPlayerSmallEPG.this.f29782l, NSTIJKPlayerSmallEPG.this.f29783m);
                NSTIJKPlayerSmallEPG.this.S.b(NSTIJKPlayerSmallEPG.this.T, NSTIJKPlayerSmallEPG.this.U);
                if (!NSTIJKPlayerSmallEPG.this.S.c() || (NSTIJKPlayerSmallEPG.this.f29784n == NSTIJKPlayerSmallEPG.this.f29782l && NSTIJKPlayerSmallEPG.this.f29785o == NSTIJKPlayerSmallEPG.this.f29783m)) {
                    if (NSTIJKPlayerSmallEPG.this.f29779i == 3) {
                        NSTIJKPlayerSmallEPG.this.start();
                        if (NSTIJKPlayerSmallEPG.this.q != null) {
                            NSTIJKPlayerSmallEPG.this.q.show();
                            return;
                        }
                        return;
                    }
                    if (NSTIJKPlayerSmallEPG.this.isPlaying()) {
                        return;
                    }
                    if ((i2 != 0 || NSTIJKPlayerSmallEPG.this.getCurrentPosition() > 0) && NSTIJKPlayerSmallEPG.this.q != null) {
                        NSTIJKPlayerSmallEPG.this.q.show(0);
                    }
                }
            }
        }
    }

    public class j implements IMediaPlayer.OnCompletionListener {
        public j() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSmallEPG.this.f29778h = 5;
            NSTIJKPlayerSmallEPG.this.f29779i = 5;
            if (NSTIJKPlayerSmallEPG.this.q != null) {
                NSTIJKPlayerSmallEPG.this.q.d();
            }
            NSTIJKPlayerSmallEPG.this.f0(-1);
            if (NSTIJKPlayerSmallEPG.this.r != null) {
                NSTIJKPlayerSmallEPG.this.r.onCompletion(NSTIJKPlayerSmallEPG.this.f29781k);
            }
        }
    }

    public class k implements IMediaPlayer.OnInfoListener {
        public k() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i2, int i3) {
            String str;
            String str2;
            if (NSTIJKPlayerSmallEPG.this.v != null) {
                NSTIJKPlayerSmallEPG.this.v.onInfo(iMediaPlayer, i2, i3);
            }
            if (i2 == 3) {
                NSTIJKPlayerSmallEPG.this.f0(2);
                str = NSTIJKPlayerSmallEPG.this.f29773c;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i2 == 10005) {
                NSTIJKPlayerSmallEPG.this.f0(1);
                str = NSTIJKPlayerSmallEPG.this.f29773c;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i2 == 901) {
                str = NSTIJKPlayerSmallEPG.this.f29773c;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i2 != 902) {
                    if (i2 == 10001) {
                        NSTIJKPlayerSmallEPG.this.p = i3;
                        Log.d(NSTIJKPlayerSmallEPG.this.f29773c, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i3);
                        if (NSTIJKPlayerSmallEPG.this.S != null) {
                            NSTIJKPlayerSmallEPG.this.S.setVideoRotation(i3);
                        }
                    } else if (i2 != 10002) {
                        switch (i2) {
                            case 700:
                                str = NSTIJKPlayerSmallEPG.this.f29773c;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerSmallEPG.this.f0(1);
                                str = NSTIJKPlayerSmallEPG.this.f29773c;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerSmallEPG.this.f0(6);
                                str = NSTIJKPlayerSmallEPG.this.f29773c;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerSmallEPG.this.f29773c;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i3;
                                break;
                            default:
                                switch (i2) {
                                    case 800:
                                        str = NSTIJKPlayerSmallEPG.this.f29773c;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerSmallEPG.this.f29773c;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerSmallEPG.this.f29773c;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerSmallEPG.this.f29773c;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerSmallEPG.this.f29773c;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            }
            Log.d(str, str2);
            return true;
        }
    }

    public class l implements IMediaPlayer.OnErrorListener {
        public l() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i2, int i3) {
            Log.d(NSTIJKPlayerSmallEPG.this.f29773c, "Error: " + i2 + "," + i3);
            NSTIJKPlayerSmallEPG.this.f29778h = -1;
            NSTIJKPlayerSmallEPG.this.f29779i = -1;
            if (NSTIJKPlayerSmallEPG.this.q != null) {
                NSTIJKPlayerSmallEPG.this.q.d();
            }
            NSTIJKPlayerSmallEPG.this.f0(-1);
            if (NSTIJKPlayerSmallEPG.this.u == null || NSTIJKPlayerSmallEPG.this.u.onError(NSTIJKPlayerSmallEPG.this.f29781k, i2, i3)) {
            }
            return true;
        }
    }

    public class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f29798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f29799b;

        public m(Activity activity) {
            this.f29798a = activity;
        }

        public m a() {
            View view = this.f29799b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public m b(int i2) {
            this.f29799b = this.f29798a.findViewById(i2);
            return this;
        }

        public m c() {
            View view = this.f29799b;
            if (view != null) {
                view.setVisibility(4);
            }
            return this;
        }

        public m d() {
            View view = this.f29799b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public m e(CharSequence charSequence) {
            View view = this.f29799b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public m f(int i2) {
            View view = this.f29799b;
            if (view != null) {
                view.setVisibility(i2);
            }
            return this;
        }

        public m g() {
            View view = this.f29799b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerSmallEPG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29773c = "NSTIJKPlayerSmallEPG";
        this.f29777g = 0;
        this.f29778h = 0;
        this.f29779i = 0;
        this.f29780j = null;
        this.f29781k = null;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = -1;
        this.B = -1L;
        this.D = true;
        this.E = false;
        this.F = 7000;
        this.J = 0;
        this.L = 0;
        this.M = 5;
        this.N = false;
        this.V = 0L;
        this.W = 0L;
        this.f0 = 0L;
        this.g0 = 0L;
        this.m0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.p0 = bool;
        this.q0 = bool;
        this.r0 = bool;
        this.s0 = bool;
        this.t0 = bool;
        this.u0 = bool;
        this.z0 = new f(Looper.getMainLooper());
        this.A0 = new h();
        this.B0 = new i();
        this.C0 = new j();
        this.D0 = new k();
        this.E0 = new l();
        this.F0 = new a();
        this.G0 = new b();
        this.H0 = new c();
        this.I0 = new d();
        this.J0 = 4;
        this.K0 = f29772b[0];
        this.L0 = new ArrayList();
        this.M0 = 0;
        this.N0 = 0;
        this.O0 = false;
        S(context);
    }

    public final void J(IMediaPlayer iMediaPlayer, c.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer K(int r11) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG.K(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void L(int i2) {
        c.h.a.k.d.c.a.f.b(this.f29781k, i2);
    }

    public void M() {
        c.h.a.k.d.b.a.d(this.f29781k);
    }

    public void N(boolean z) {
        if (z || this.C) {
            d0(false);
            this.o0.b(R.id.app_video_top_box).a();
            this.o0.b(R.id.controls).a();
            this.o0.b(R.id.app_video_fullscreen).c();
            this.o0.b(R.id.ll_seekbar_time).a();
            this.C = false;
            P();
        }
    }

    public final void O() {
        this.o0.b(R.id.app_video_loading).a();
        this.o0.b(R.id.app_video_status).a();
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            this.o0.b(R.id.watrmrk).a();
        }
        d0(false);
        P();
    }

    public void P() {
        this.o0.b(R.id.app_video_top_box).a();
        this.o0.b(R.id.controls).a();
        this.o0.b(R.id.ll_seekbar_time).a();
        this.C = false;
        this.G.removeCallbacksAndMessages(null);
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            this.o0.b(R.id.watrmrk).g();
        }
    }

    public final void Q() {
        boolean zP = this.R.p();
        this.O0 = zP;
        if (zP) {
            c.h.a.k.d.b.a.b(getContext());
            this.f29781k = c.h.a.k.d.b.a.a();
        }
    }

    public final void R() {
        this.L0.clear();
        if (this.R.s()) {
            this.L0.add(1);
        }
        if (this.R.t() && Build.VERSION.SDK_INT >= 14) {
            this.L0.add(2);
        }
        if (this.R.r()) {
            this.L0.add(0);
        }
        if (this.L0.isEmpty()) {
            this.L0.add(1);
        }
        int iIntValue = this.L0.get(this.M0).intValue();
        this.N0 = iIntValue;
        setRender(iIntValue);
    }

    public final void S(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.Q = applicationContext;
        this.R = new c.h.a.k.d.a.a(applicationContext);
        Q();
        R();
        this.f29782l = 0;
        this.f29783m = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f29778h = 0;
        this.f29779i = 0;
        TextView textView = new TextView(context);
        this.h0 = textView;
        textView.setTextSize(24.0f);
        this.h0.setTextColor(context.getResources().getColor(R.color.white));
        this.h0.setGravity(17);
        addView(this.h0, new FrameLayout.LayoutParams(-1, -2, 80));
    }

    public boolean T() {
        return this.O0;
    }

    public final boolean U() {
        int i2;
        return (this.f29781k == null || (i2 = this.f29778h) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    @TargetApi(23)
    public void V() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f29774d == null || this.f29780j == null) {
            return;
        }
        W(false);
        try {
            ((AudioManager) this.Q.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            try {
                this.f29781k = K(this.R.x());
                getContext();
                this.f29781k.setOnPreparedListener(this.B0);
                this.f29781k.setOnVideoSizeChangedListener(this.A0);
                this.f29781k.setOnCompletionListener(this.C0);
                this.f29781k.setOnErrorListener(this.E0);
                this.f29781k.setOnInfoListener(this.D0);
                this.f29781k.setOnBufferingUpdateListener(this.F0);
                this.f29781k.setOnSeekCompleteListener(this.G0);
                this.f29781k.setOnTimedTextListener(this.H0);
                this.t = 0;
                String scheme = this.f29774d.getScheme();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23 && this.R.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                    this.f29781k.setDataSource(new c.h.a.k.d.c.a.a(new File(this.f29774d.toString())));
                } else if (i2 >= 14) {
                    this.f29781k.setDataSource(this.Q, this.f29774d, this.f29776f);
                } else {
                    this.f29781k.setDataSource(this.f29774d.toString());
                }
                J(this.f29781k, this.f29780j);
                this.f29781k.setAudioStreamType(3);
                this.f29781k.setScreenOnWhilePlaying(true);
                this.V = System.currentTimeMillis();
                this.f29781k.prepareAsync();
                this.n0 = this.i0.getResources().getDisplayMetrics().widthPixels;
                AudioManager audioManager = (AudioManager) this.i0.getSystemService("audio");
                this.k0 = audioManager;
                this.l0 = audioManager.getStreamMaxVolume(3);
                this.f29778h = 1;
            } catch (IOException e2) {
                Log.w(this.f29773c, "Unable to open content: " + this.f29774d, e2);
                this.f29778h = -1;
                this.f29779i = -1;
                onErrorListener = this.E0;
                iMediaPlayer = this.f29781k;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            } catch (IllegalArgumentException e3) {
                Log.w(this.f29773c, "Unable to open content: " + this.f29774d, e3);
                this.f29778h = -1;
                this.f29779i = -1;
                onErrorListener = this.E0;
                iMediaPlayer = this.f29781k;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (NullPointerException e4) {
            Log.w(this.f29773c, "Unable to open content: " + this.f29774d, e4);
            this.f29778h = -1;
            this.f29779i = -1;
            onErrorListener = this.E0;
            iMediaPlayer = this.f29781k;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        } catch (Exception e5) {
            Log.w(this.f29773c, "Unable to open content: " + this.f29774d, e5);
            this.f29778h = -1;
            this.f29779i = -1;
            onErrorListener = this.E0;
            iMediaPlayer = this.f29781k;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    public void W(boolean z) {
        IMediaPlayer iMediaPlayer = this.f29781k;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f29781k.release();
            this.f29781k = null;
            this.f29778h = 0;
            if (z) {
                this.f29779i = 0;
            }
            ((AudioManager) this.Q.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void X() {
        IMediaPlayer iMediaPlayer = this.f29781k;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void Y(int i2) {
        c.h.a.k.d.c.a.f.e(this.f29781k, i2);
    }

    public void Z(Activity activity, NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
        this.i0 = activity;
        this.j0 = nSTIJKPlayerSmallEPG;
        this.G = new Handler();
        this.H = new Handler();
        this.o0 = new m(activity);
    }

    public final void a0(Uri uri, Map<String, String> map, boolean z, String str) {
        this.f29774d = uri;
        this.f29775e = str;
        this.f29776f = map;
        this.w = 0;
        this.K = z;
        h0();
        V();
        requestLayout();
        invalidate();
    }

    public void b0(Uri uri, boolean z, String str) {
        a0(uri, null, z, str);
    }

    public void c0(int i2) {
        this.o0.b(R.id.app_video_top_box).g();
        this.o0.b(R.id.controls).g();
        this.o0.b(R.id.ll_seekbar_time).g();
        if (!this.E) {
            d0(true);
        }
        if (!this.I) {
            this.o0.b(R.id.app_video_fullscreen).g();
        }
        ((LinearLayout) this.i0.findViewById(R.id.ll_categories_view)).setVisibility(0);
        this.G.postDelayed(new e(), 5000L);
        j0();
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

    public void d0(boolean z) {
        this.o0.b(R.id.app_video_currentTime).f(z ? 0 : 8);
        this.o0.b(R.id.app_video_endTime).f(z ? 0 : 8);
        this.o0.b(R.id.app_video_seekBar).f(z ? 0 : 8);
    }

    public final void e0(String str) {
        this.o0.b(R.id.video_view).a();
        this.o0.b(R.id.app_video_status).g();
        this.o0.b(R.id.app_video_status_text).e(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(int r14) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG.f0(int):void");
    }

    public void g0() {
        c.h.a.k.d.b.a.d(null);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f29781k != null) {
            return this.t;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (U()) {
            return (int) this.f29781k.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.J;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (U()) {
            return (int) this.f29781k.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.K);
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f29781k;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    public void h0() {
        IMediaPlayer iMediaPlayer = this.f29781k;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f29781k.release();
            this.f29781k = null;
            this.f29778h = 0;
            this.f29779i = 0;
            ((AudioManager) this.Q.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public final void i0() {
        if (this.q.a()) {
            this.q.d();
        } else {
            this.q.show();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return U() && (iMediaPlayer = this.f29781k) != null && iMediaPlayer.isPlaying();
    }

    public final void j0() {
        m mVarB;
        IMediaPlayer iMediaPlayer = this.f29781k;
        if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
            this.o0.b(R.id.exo_pause).a();
            this.o0.b(R.id.exo_play).g();
            mVarB = this.o0.b(R.id.exo_play);
        } else {
            this.o0.b(R.id.exo_play).a();
            this.o0.b(R.id.exo_pause).g();
            mVarB = this.o0.b(R.id.exo_pause);
        }
        mVarB.d();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z = (i2 == 4 || i2 == 24 || i2 == 25 || i2 == 164 || i2 == 82 || i2 == 5 || i2 == 6) ? false : true;
        if (U() && z && this.q != null) {
            if (i2 == 79 || i2 == 85) {
                IMediaPlayer iMediaPlayer = this.f29781k;
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
                IMediaPlayer iMediaPlayer2 = this.f29781k;
                if (iMediaPlayer2 != null && !iMediaPlayer2.isPlaying()) {
                    start();
                    this.q.d();
                }
                return true;
            }
            if (i2 == 86 || i2 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f29781k;
                if (iMediaPlayer3 != null && iMediaPlayer3.isPlaying()) {
                    pause();
                    this.q.show();
                }
                return true;
            }
            i0();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (U() && (iMediaPlayer = this.f29781k) != null && iMediaPlayer.isPlaying()) {
            this.f29781k.pause();
            this.f29778h = 4;
        }
        this.f29779i = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i2) {
        if (U()) {
            this.f0 = System.currentTimeMillis();
            this.f29781k.seekTo(i2);
            i2 = 0;
        }
        this.w = i2;
    }

    public void setCurrentWindowIndex(int i2) {
        this.J = i2;
    }

    public void setHudView(TableLayout tableLayout) {
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
                Log.e(this.f29773c, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i2)));
                return;
            }
            c.h.a.k.d.c.a.i iVar = new c.h.a.k.d.c.a.i(getContext());
            gVar = iVar;
            if (this.f29781k != null) {
                iVar.getSurfaceHolder().b(this.f29781k);
                iVar.a(this.f29781k.getVideoWidth(), this.f29781k.getVideoHeight());
                iVar.b(this.f29781k.getVideoSarNum(), this.f29781k.getVideoSarDen());
                iVar.setAspectRatio(this.K0);
                gVar = iVar;
            }
        }
        setRenderView(gVar);
    }

    public void setRenderView(c.h.a.k.d.c.a.c cVar) {
        int i2;
        int i3;
        if (this.S != null) {
            IMediaPlayer iMediaPlayer = this.f29781k;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.S.getView();
            this.S.e(this.I0);
            this.S = null;
            removeView(view);
        }
        if (cVar == null) {
            return;
        }
        this.S = cVar;
        SharedPreferences sharedPreferences = this.Q.getSharedPreferences("loginPrefs", 0);
        this.O = sharedPreferences;
        int i4 = sharedPreferences.getInt("aspect_ratio", 4);
        this.J0 = i4;
        cVar.setAspectRatio(i4);
        int i5 = this.f29782l;
        if (i5 > 0 && (i3 = this.f29783m) > 0) {
            cVar.a(i5, i3);
        }
        int i6 = this.T;
        if (i6 > 0 && (i2 = this.U) > 0) {
            cVar.b(i6, i2);
        }
        View view2 = this.S.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.S.d(this.I0);
        this.S.setVideoRotation(this.p);
    }

    public void setTitle(CharSequence charSequence) {
        this.o0.b(R.id.app_video_title).e(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (U()) {
            this.f29781k.start();
            this.f29778h = 3;
        }
        this.f29779i = 3;
    }
}
