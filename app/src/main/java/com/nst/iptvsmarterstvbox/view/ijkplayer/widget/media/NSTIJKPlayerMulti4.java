package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.MediaController;
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
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerMulti4 extends FrameLayout implements MediaController.MediaPlayerControl {
    public int A;
    public int B;
    public boolean C;
    public SharedPreferences D;
    public SharedPreferences E;
    public Context F;
    public c.h.a.k.d.a.a G;
    public c.h.a.k.d.c.a.c H;
    public int I;
    public int J;
    public Activity K;
    public NSTIJKPlayerMulti4 L;
    public AudioManager M;
    public i N;
    public c.h.a.i.q.f O;
    public Context P;
    public IMediaPlayer.OnVideoSizeChangedListener Q;
    public IMediaPlayer.OnPreparedListener R;
    public IMediaPlayer.OnCompletionListener S;
    public IMediaPlayer.OnInfoListener T;
    public IMediaPlayer.OnErrorListener U;
    public IMediaPlayer.OnBufferingUpdateListener V;
    public c.a W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f29626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f29627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, String> f29628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29630f;
    public List<Integer> f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29631g;
    public int g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.b f29632h;
    public int h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IMediaPlayer f29633i;
    public boolean i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.h.a.k.d.c.a.b f29639o;
    public IMediaPlayer.OnCompletionListener p;
    public IMediaPlayer.OnPreparedListener q;
    public int r;
    public IMediaPlayer.OnErrorListener s;
    public IMediaPlayer.OnInfoListener t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public Handler y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = NSTIJKPlayerMulti4.this;
            nSTIJKPlayerMulti4.A++;
            nSTIJKPlayerMulti4.K();
            c.h.a.h.n.e.l0(NSTIJKPlayerMulti4.this.K, NSTIJKPlayerMulti4.this.K.getResources().getString(R.string.play_back_error) + " (" + NSTIJKPlayerMulti4.this.A + "/" + NSTIJKPlayerMulti4.this.B + ")");
            NSTIJKPlayerMulti4.this.S();
            NSTIJKPlayerMulti4.this.start();
        }
    }

    public class b implements IMediaPlayer.OnVideoSizeChangedListener {
        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i2, int i3, int i4, int i5) {
            NSTIJKPlayerMulti4.this.f29634j = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerMulti4.this.f29635k = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerMulti4.this.I = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerMulti4.this.J = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerMulti4.this.f29634j == 0 || NSTIJKPlayerMulti4.this.f29635k == 0) {
                return;
            }
            if (NSTIJKPlayerMulti4.this.H != null) {
                NSTIJKPlayerMulti4.this.H.a(NSTIJKPlayerMulti4.this.f29634j, NSTIJKPlayerMulti4.this.f29635k);
                NSTIJKPlayerMulti4.this.H.b(NSTIJKPlayerMulti4.this.I, NSTIJKPlayerMulti4.this.J);
            }
            NSTIJKPlayerMulti4.this.requestLayout();
        }
    }

    public class c implements IMediaPlayer.OnPreparedListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerMulti4.this.f29630f = 2;
            if (NSTIJKPlayerMulti4.this.q != null) {
                NSTIJKPlayerMulti4.this.q.onPrepared(NSTIJKPlayerMulti4.this.f29633i);
            }
            if (NSTIJKPlayerMulti4.this.f29639o != null) {
                NSTIJKPlayerMulti4.this.f29639o.setEnabled(true);
            }
            NSTIJKPlayerMulti4.this.f29634j = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerMulti4.this.f29635k = iMediaPlayer.getVideoHeight();
            if (NSTIJKPlayerMulti4.this.f29634j == 0 || NSTIJKPlayerMulti4.this.f29635k == 0) {
                if (NSTIJKPlayerMulti4.this.f29631g == 3) {
                    NSTIJKPlayerMulti4.this.start();
                }
            } else if (NSTIJKPlayerMulti4.this.H != null) {
                NSTIJKPlayerMulti4.this.H.a(NSTIJKPlayerMulti4.this.f29634j, NSTIJKPlayerMulti4.this.f29635k);
                NSTIJKPlayerMulti4.this.H.b(NSTIJKPlayerMulti4.this.I, NSTIJKPlayerMulti4.this.J);
                if ((!NSTIJKPlayerMulti4.this.H.c() || (NSTIJKPlayerMulti4.this.f29636l == NSTIJKPlayerMulti4.this.f29634j && NSTIJKPlayerMulti4.this.f29637m == NSTIJKPlayerMulti4.this.f29635k)) && NSTIJKPlayerMulti4.this.f29631g == 3) {
                    NSTIJKPlayerMulti4.this.start();
                    if (NSTIJKPlayerMulti4.this.f29639o != null) {
                        NSTIJKPlayerMulti4.this.f29639o.show();
                    }
                }
            }
        }
    }

    public class d implements IMediaPlayer.OnCompletionListener {
        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerMulti4.this.f29630f = 5;
            NSTIJKPlayerMulti4.this.f29631g = 5;
            if (NSTIJKPlayerMulti4.this.f29639o != null) {
                NSTIJKPlayerMulti4.this.f29639o.d();
            }
            NSTIJKPlayerMulti4.this.a0(-1);
            if (NSTIJKPlayerMulti4.this.p != null) {
                NSTIJKPlayerMulti4.this.p.onCompletion(NSTIJKPlayerMulti4.this.f29633i);
            }
        }
    }

    public class e implements IMediaPlayer.OnInfoListener {
        public e() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i2, int i3) {
            String str;
            String str2;
            if (NSTIJKPlayerMulti4.this.t != null) {
                NSTIJKPlayerMulti4.this.t.onInfo(iMediaPlayer, i2, i3);
            }
            if (i2 == 3) {
                NSTIJKPlayerMulti4.this.a0(2);
                str = NSTIJKPlayerMulti4.this.f29626b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i2 == 10005) {
                NSTIJKPlayerMulti4.this.a0(1);
                str = NSTIJKPlayerMulti4.this.f29626b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i2 == 901) {
                str = NSTIJKPlayerMulti4.this.f29626b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i2 != 902) {
                    if (i2 == 10001) {
                        NSTIJKPlayerMulti4.this.f29638n = i3;
                        Log.d(NSTIJKPlayerMulti4.this.f29626b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i3);
                        if (NSTIJKPlayerMulti4.this.H != null) {
                            NSTIJKPlayerMulti4.this.H.setVideoRotation(i3);
                        }
                    } else if (i2 != 10002) {
                        switch (i2) {
                            case 700:
                                str = NSTIJKPlayerMulti4.this.f29626b;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerMulti4.this.a0(1);
                                str = NSTIJKPlayerMulti4.this.f29626b;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerMulti4.this.a0(6);
                                str = NSTIJKPlayerMulti4.this.f29626b;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerMulti4.this.f29626b;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i3;
                                break;
                            default:
                                switch (i2) {
                                    case 800:
                                        str = NSTIJKPlayerMulti4.this.f29626b;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerMulti4.this.f29626b;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerMulti4.this.f29626b;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerMulti4.this.f29626b;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerMulti4.this.f29626b;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            }
            Log.d(str, str2);
            return true;
        }
    }

    public class f implements IMediaPlayer.OnErrorListener {
        public f() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i2, int i3) {
            Log.d(NSTIJKPlayerMulti4.this.f29626b, "Error: " + i2 + "," + i3);
            NSTIJKPlayerMulti4.this.f29630f = -1;
            NSTIJKPlayerMulti4.this.f29631g = -1;
            if (NSTIJKPlayerMulti4.this.f29639o != null) {
                NSTIJKPlayerMulti4.this.f29639o.d();
            }
            NSTIJKPlayerMulti4.this.a0(-1);
            if (NSTIJKPlayerMulti4.this.s == null || NSTIJKPlayerMulti4.this.s.onError(NSTIJKPlayerMulti4.this.f29633i, i2, i3)) {
            }
            return true;
        }
    }

    public class g implements IMediaPlayer.OnBufferingUpdateListener {
        public g() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i2) {
            NSTIJKPlayerMulti4.this.r = i2;
        }
    }

    public class h implements c.a {
        public h() {
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void a(c.b bVar, int i2, int i3, int i4) {
            if (bVar.a() != NSTIJKPlayerMulti4.this.H) {
                Log.e(NSTIJKPlayerMulti4.this.f29626b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerMulti4.this.f29636l = i3;
            NSTIJKPlayerMulti4.this.f29637m = i4;
            boolean z = true;
            boolean z2 = NSTIJKPlayerMulti4.this.f29631g == 3;
            if (NSTIJKPlayerMulti4.this.H.c() && (NSTIJKPlayerMulti4.this.f29634j != i3 || NSTIJKPlayerMulti4.this.f29635k != i4)) {
                z = false;
            }
            if (NSTIJKPlayerMulti4.this.f29633i != null && z2 && z) {
                if (NSTIJKPlayerMulti4.this.u != 0) {
                    NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = NSTIJKPlayerMulti4.this;
                    nSTIJKPlayerMulti4.seekTo(nSTIJKPlayerMulti4.u);
                }
                NSTIJKPlayerMulti4.this.start();
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void b(c.b bVar, int i2, int i3) {
            if (bVar.a() != NSTIJKPlayerMulti4.this.H) {
                Log.e(NSTIJKPlayerMulti4.this.f29626b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerMulti4.this.f29632h = bVar;
            if (NSTIJKPlayerMulti4.this.f29633i == null) {
                NSTIJKPlayerMulti4.this.S();
            } else {
                NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = NSTIJKPlayerMulti4.this;
                nSTIJKPlayerMulti4.H(nSTIJKPlayerMulti4.f29633i, bVar);
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void c(c.b bVar) {
            if (bVar.a() != NSTIJKPlayerMulti4.this.H) {
                Log.e(NSTIJKPlayerMulti4.this.f29626b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                NSTIJKPlayerMulti4.this.f29632h = null;
                NSTIJKPlayerMulti4.this.U();
            }
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f29648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f29649b;

        public i(Activity activity) {
            this.f29648a = activity;
        }

        public i a() {
            View view = this.f29649b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public i b(int i2) {
            this.f29649b = this.f29648a.findViewById(i2);
            return this;
        }

        public i c() {
            View view = this.f29649b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public i d(CharSequence charSequence) {
            View view = this.f29649b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public i e() {
            View view = this.f29649b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerMulti4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29626b = "NSTIJKPlayerMulti4";
        this.f29629e = 0;
        this.f29630f = 0;
        this.f29631g = 0;
        this.f29632h = null;
        this.f29633i = null;
        this.v = true;
        this.w = true;
        this.x = true;
        this.A = 0;
        this.B = 5;
        this.C = false;
        this.Q = new b();
        this.R = new c();
        this.S = new d();
        this.T = new e();
        this.U = new f();
        this.V = new g();
        this.W = new h();
        this.f0 = new ArrayList();
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = false;
        O(context);
    }

    public final void G() {
        c.h.a.k.d.c.a.b bVar;
        if (this.f29633i == null || (bVar = this.f29639o) == null) {
            return;
        }
        bVar.b(this);
        this.f29639o.c(getParent() instanceof View ? (View) getParent() : this);
        this.f29639o.setEnabled(Q());
    }

    public final void H(IMediaPlayer iMediaPlayer, c.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer I(int r11) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4.I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void J() {
        c.h.a.k.d.b.a.d(this.f29633i);
    }

    public final void K() {
        this.N.b(R.id.app_video_loading_4).a();
        this.N.b(R.id.app_video_status_4).a();
        L();
    }

    public void L() {
        this.N.b(R.id.app_video_top_box_4).a();
        this.N.b(R.id.controls_4).a();
        this.N.b(R.id.ll_seekbar_time_4).a();
        this.y.removeCallbacksAndMessages(null);
    }

    public final void M() {
        boolean zP = this.G.p();
        this.i0 = zP;
        if (zP) {
            c.h.a.k.d.b.a.b(getContext());
            this.f29633i = c.h.a.k.d.b.a.a();
        }
    }

    public final void N() {
        this.f0.clear();
        if (this.G.s()) {
            this.f0.add(1);
        }
        if (this.G.t() && Build.VERSION.SDK_INT >= 14) {
            this.f0.add(2);
        }
        if (this.G.r()) {
            this.f0.add(0);
        }
        if (this.f0.isEmpty()) {
            this.f0.add(1);
        }
        int iIntValue = this.f0.get(this.g0).intValue();
        this.h0 = iIntValue;
        setRender(iIntValue);
    }

    public final void O(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.F = applicationContext;
        this.G = new c.h.a.k.d.a.a(applicationContext);
        M();
        N();
        this.f29634j = 0;
        this.f29635k = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f29630f = 0;
        this.f29631g = 0;
    }

    public boolean P() {
        return this.i0;
    }

    public final boolean Q() {
        int i2;
        return (this.f29633i == null || (i2 = this.f29630f) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    public void R() {
        IMediaPlayer iMediaPlayer = this.f29633i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @TargetApi(23)
    public void S() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f29627c == null || this.f29632h == null) {
            return;
        }
        T(false);
        try {
            ((AudioManager) this.F.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        this.N.b(R.id.app_video_status_4).a();
        try {
            try {
                IMediaPlayer iMediaPlayerI = I(this.G.x());
                this.f29633i = iMediaPlayerI;
                iMediaPlayerI.setOnPreparedListener(this.R);
                this.f29633i.setOnVideoSizeChangedListener(this.Q);
                this.f29633i.setOnCompletionListener(this.S);
                this.f29633i.setOnErrorListener(this.U);
                this.f29633i.setOnInfoListener(this.T);
                this.f29633i.setOnBufferingUpdateListener(this.V);
                this.r = 0;
                String scheme = this.f29627c.getScheme();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23 && this.G.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                    this.f29633i.setDataSource(new c.h.a.k.d.c.a.a(new File(this.f29627c.toString())));
                } else if (i2 >= 14) {
                    this.f29633i.setDataSource(this.F, this.f29627c, this.f29628d);
                } else {
                    this.f29633i.setDataSource(this.f29627c.toString());
                }
                H(this.f29633i, this.f29632h);
                this.f29633i.setAudioStreamType(3);
                this.f29633i.setScreenOnWhilePlaying(true);
                this.f29633i.prepareAsync();
                this.M = (AudioManager) this.K.getSystemService("audio");
                this.f29630f = 1;
            } catch (IOException e2) {
                Log.w(this.f29626b, "Unable to open content: " + this.f29627c, e2);
                this.f29630f = -1;
                this.f29631g = -1;
                onErrorListener = this.U;
                iMediaPlayer = this.f29633i;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            } catch (NullPointerException e3) {
                Log.w(this.f29626b, "Unable to open content: " + this.f29627c, e3);
                this.f29630f = -1;
                this.f29631g = -1;
                onErrorListener = this.U;
                iMediaPlayer = this.f29633i;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (IllegalArgumentException e4) {
            Log.w(this.f29626b, "Unable to open content: " + this.f29627c, e4);
            this.f29630f = -1;
            this.f29631g = -1;
            onErrorListener = this.U;
            iMediaPlayer = this.f29633i;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        } catch (Exception e5) {
            Log.w(this.f29626b, "Unable to open content: " + this.f29627c, e5);
            this.f29630f = -1;
            this.f29631g = -1;
            onErrorListener = this.U;
            iMediaPlayer = this.f29633i;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    public void T(boolean z) {
        IMediaPlayer iMediaPlayer = this.f29633i;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f29633i.release();
            this.f29633i = null;
            this.f29630f = 0;
            if (z) {
                this.f29631g = 0;
            }
            ((AudioManager) this.F.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void U() {
        IMediaPlayer iMediaPlayer = this.f29633i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void V() {
        Handler handler = this.y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void W(Activity activity, NSTIJKPlayerMulti4 nSTIJKPlayerMulti4) {
        this.K = activity;
        this.L = nSTIJKPlayerMulti4;
        this.y = new Handler();
        this.N = new i(activity);
    }

    public final void X(Uri uri, Map<String, String> map, boolean z, String str) {
        this.f29627c = uri;
        this.f29628d = map;
        this.u = 0;
        this.z = z;
        c0();
        S();
        requestLayout();
        invalidate();
    }

    public void Y(Uri uri, boolean z, String str) {
        X(uri, null, z, str);
    }

    public final void Z(String str) {
        this.N.b(R.id.video_view_4).a();
        this.N.b(R.id.app_video_status_4).e();
        this.N.b(R.id.app_video_status_text_4).d(str);
    }

    public final void a0(int i2) {
        this.f29629e = i2;
        if (i2 == -1) {
            if (this.A < this.B) {
                this.C = true;
                this.y.postDelayed(new a(), 3000L);
                return;
            }
            K();
            this.f29627c = null;
            Z(this.K.getResources().getString(R.string.small_problem));
            c0();
            this.C = false;
            return;
        }
        if (i2 == 1) {
            this.N.b(R.id.app_video_loading_4).e();
            return;
        }
        if (i2 == 3) {
            this.A = 0;
            this.N.b(R.id.exo_play).a();
            this.N.b(R.id.exo_pause).e();
            if (this.z) {
                this.N.b(R.id.exo_pause).c();
            }
        } else {
            if (i2 != 6) {
                if (i2 != 2) {
                    if (i2 == 4) {
                        this.N.b(R.id.exo_play).e();
                        this.N.b(R.id.exo_pause).a();
                        if (this.z) {
                            this.N.b(R.id.exo_play).c();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.A = 0;
                this.N.b(R.id.app_video_status_4).a();
                this.N.b(R.id.video_view_4).e();
                this.N.b(R.id.exo_play).a();
                this.N.b(R.id.exo_pause).e();
                this.N.b(R.id.app_video_loading_4).a();
                if (this.K.findViewById(R.id.app_video_box_4).isFocusable()) {
                    return;
                }
                R();
                return;
            }
            this.A = 0;
            this.N.b(R.id.app_video_status_4).a();
            this.N.b(R.id.video_view_4).e();
            this.N.b(R.id.exo_play).a();
            this.N.b(R.id.exo_pause).e();
        }
        this.N.b(R.id.app_video_loading_4).a();
    }

    public void b0() {
        c.h.a.k.d.b.a.d(null);
    }

    public void c0() {
        IMediaPlayer iMediaPlayer = this.f29633i;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f29633i.release();
            this.f29633i = null;
            this.f29630f = 0;
            this.f29631g = 0;
            ((AudioManager) this.F.getSystemService("audio")).abandonAudioFocus(null);
            c.b bVar = this.f29632h;
            if (bVar == null || bVar.c() == null) {
                return;
            }
            this.f29632h.c().setFormat(-2);
            this.f29632h.c().setFormat(-1);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.x;
    }

    public void d0() {
        IMediaPlayer iMediaPlayer = this.f29633i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f29633i != null) {
            return this.r;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (Q()) {
            return (int) this.f29633i.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (Q()) {
            return (int) this.f29633i.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return Q() && (iMediaPlayer = this.f29633i) != null && iMediaPlayer.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z = (i2 == 4 || i2 == 24 || i2 == 25 || i2 == 164 || i2 == 82 || i2 == 5 || i2 == 6) ? false : true;
        if (Q() && z && this.f29639o != null) {
            if (i2 == 79 || i2 == 85) {
                IMediaPlayer iMediaPlayer = this.f29633i;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f29639o.d();
                } else {
                    pause();
                    this.f29639o.show();
                }
                return true;
            }
            if (i2 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f29633i;
                if (iMediaPlayer2 != null && !iMediaPlayer2.isPlaying()) {
                    start();
                    this.f29639o.d();
                }
                return true;
            }
            if (i2 == 86 || i2 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f29633i;
                if (iMediaPlayer3 != null && iMediaPlayer3.isPlaying()) {
                    pause();
                    this.f29639o.show();
                }
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (Q() && (iMediaPlayer = this.f29633i) != null && iMediaPlayer.isPlaying()) {
            this.f29633i.pause();
            this.f29630f = 4;
        }
        this.f29631g = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i2) {
        if (Q()) {
            this.f29633i.seekTo(i2);
            i2 = 0;
        }
        this.u = i2;
    }

    public void setContext(Context context) {
        this.P = context;
    }

    public void setLiveStreamDBHandler(c.h.a.i.q.f fVar) {
        this.O = fVar;
    }

    public void setMediaController(c.h.a.k.d.c.a.b bVar) {
        c.h.a.k.d.c.a.b bVar2 = this.f29639o;
        if (bVar2 != null) {
            bVar2.d();
        }
        this.f29639o = bVar;
        G();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.p = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.s = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.t = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.q = onPreparedListener;
    }

    public void setRender(int i2) {
        c.h.a.k.d.c.a.c gVar;
        if (i2 == 0) {
            gVar = null;
        } else if (i2 == 1) {
            gVar = new c.h.a.k.d.c.a.g(getContext());
        } else {
            if (i2 != 2) {
                Log.e(this.f29626b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i2)));
                return;
            }
            c.h.a.k.d.c.a.i iVar = new c.h.a.k.d.c.a.i(getContext());
            gVar = iVar;
            if (this.f29633i != null) {
                iVar.getSurfaceHolder().b(this.f29633i);
                iVar.a(this.f29633i.getVideoWidth(), this.f29633i.getVideoHeight());
                iVar.b(this.f29633i.getVideoSarNum(), this.f29633i.getVideoSarDen());
                gVar = iVar;
            }
        }
        setRenderView(gVar);
    }

    public void setRenderView(c.h.a.k.d.c.a.c cVar) {
        int i2;
        int i3;
        if (this.H != null) {
            IMediaPlayer iMediaPlayer = this.f29633i;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.H.getView();
            this.H.e(this.W);
            this.H = null;
            removeView(view);
        }
        if (cVar == null) {
            return;
        }
        this.H = cVar;
        this.D = this.F.getSharedPreferences("loginPrefs", 0);
        int i4 = this.f29634j;
        if (i4 > 0 && (i3 = this.f29635k) > 0) {
            cVar.a(i4, i3);
        }
        int i5 = this.I;
        if (i5 > 0 && (i2 = this.J) > 0) {
            cVar.b(i5, i2);
        }
        View view2 = this.H.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.H.d(this.W);
        this.H.setVideoRotation(this.f29638n);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (Q()) {
            this.f29633i.start();
            this.f29630f = 3;
        }
        this.f29631g = 3;
    }
}
