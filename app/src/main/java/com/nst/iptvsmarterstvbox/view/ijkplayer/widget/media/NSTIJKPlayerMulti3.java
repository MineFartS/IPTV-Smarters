package minefarts.iptvsmarters.view.ijkplayer.widget.media;

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
import minefarts.iptvsmarters.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerMulti3 extends FrameLayout implements MediaController.MediaPlayerControl {
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
    public NSTIJKPlayerMulti3 L;
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
    public String f29601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f29602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, String> f29603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29605f;
    public List<Integer> f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29606g;
    public int g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.b f29607h;
    public int h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IMediaPlayer f29608i;
    public boolean i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.h.a.k.d.c.a.b f29614o;
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
            NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = NSTIJKPlayerMulti3.this;
            nSTIJKPlayerMulti3.A++;
            nSTIJKPlayerMulti3.K();
            c.h.a.h.n.e.l0(NSTIJKPlayerMulti3.this.K, NSTIJKPlayerMulti3.this.K.getResources().getString(R.string.play_back_error) + " (" + NSTIJKPlayerMulti3.this.A + "/" + NSTIJKPlayerMulti3.this.B + ")");
            NSTIJKPlayerMulti3.this.S();
            NSTIJKPlayerMulti3.this.start();
        }
    }

    public class b implements IMediaPlayer.OnVideoSizeChangedListener {
        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i2, int i3, int i4, int i5) {
            NSTIJKPlayerMulti3.this.f29609j = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerMulti3.this.f29610k = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerMulti3.this.I = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerMulti3.this.J = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerMulti3.this.f29609j == 0 || NSTIJKPlayerMulti3.this.f29610k == 0) {
                return;
            }
            if (NSTIJKPlayerMulti3.this.H != null) {
                NSTIJKPlayerMulti3.this.H.a(NSTIJKPlayerMulti3.this.f29609j, NSTIJKPlayerMulti3.this.f29610k);
                NSTIJKPlayerMulti3.this.H.b(NSTIJKPlayerMulti3.this.I, NSTIJKPlayerMulti3.this.J);
            }
            NSTIJKPlayerMulti3.this.requestLayout();
        }
    }

    public class c implements IMediaPlayer.OnPreparedListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerMulti3.this.f29605f = 2;
            if (NSTIJKPlayerMulti3.this.q != null) {
                NSTIJKPlayerMulti3.this.q.onPrepared(NSTIJKPlayerMulti3.this.f29608i);
            }
            if (NSTIJKPlayerMulti3.this.f29614o != null) {
                NSTIJKPlayerMulti3.this.f29614o.setEnabled(true);
            }
            NSTIJKPlayerMulti3.this.f29609j = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerMulti3.this.f29610k = iMediaPlayer.getVideoHeight();
            if (NSTIJKPlayerMulti3.this.f29609j == 0 || NSTIJKPlayerMulti3.this.f29610k == 0) {
                if (NSTIJKPlayerMulti3.this.f29606g == 3) {
                    NSTIJKPlayerMulti3.this.start();
                }
            } else if (NSTIJKPlayerMulti3.this.H != null) {
                NSTIJKPlayerMulti3.this.H.a(NSTIJKPlayerMulti3.this.f29609j, NSTIJKPlayerMulti3.this.f29610k);
                NSTIJKPlayerMulti3.this.H.b(NSTIJKPlayerMulti3.this.I, NSTIJKPlayerMulti3.this.J);
                if ((!NSTIJKPlayerMulti3.this.H.c() || (NSTIJKPlayerMulti3.this.f29611l == NSTIJKPlayerMulti3.this.f29609j && NSTIJKPlayerMulti3.this.f29612m == NSTIJKPlayerMulti3.this.f29610k)) && NSTIJKPlayerMulti3.this.f29606g == 3) {
                    NSTIJKPlayerMulti3.this.start();
                    if (NSTIJKPlayerMulti3.this.f29614o != null) {
                        NSTIJKPlayerMulti3.this.f29614o.show();
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
            NSTIJKPlayerMulti3.this.f29605f = 5;
            NSTIJKPlayerMulti3.this.f29606g = 5;
            if (NSTIJKPlayerMulti3.this.f29614o != null) {
                NSTIJKPlayerMulti3.this.f29614o.d();
            }
            NSTIJKPlayerMulti3.this.a0(-1);
            if (NSTIJKPlayerMulti3.this.p != null) {
                NSTIJKPlayerMulti3.this.p.onCompletion(NSTIJKPlayerMulti3.this.f29608i);
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
            if (NSTIJKPlayerMulti3.this.t != null) {
                NSTIJKPlayerMulti3.this.t.onInfo(iMediaPlayer, i2, i3);
            }
            if (i2 == 3) {
                NSTIJKPlayerMulti3.this.a0(2);
                str = NSTIJKPlayerMulti3.this.f29601b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i2 == 10005) {
                NSTIJKPlayerMulti3.this.a0(1);
                str = NSTIJKPlayerMulti3.this.f29601b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i2 == 901) {
                str = NSTIJKPlayerMulti3.this.f29601b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i2 != 902) {
                    if (i2 == 10001) {
                        NSTIJKPlayerMulti3.this.f29613n = i3;
                        Log.d(NSTIJKPlayerMulti3.this.f29601b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i3);
                        if (NSTIJKPlayerMulti3.this.H != null) {
                            NSTIJKPlayerMulti3.this.H.setVideoRotation(i3);
                        }
                    } else if (i2 != 10002) {
                        switch (i2) {
                            case 700:
                                str = NSTIJKPlayerMulti3.this.f29601b;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerMulti3.this.a0(1);
                                str = NSTIJKPlayerMulti3.this.f29601b;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerMulti3.this.a0(6);
                                str = NSTIJKPlayerMulti3.this.f29601b;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerMulti3.this.f29601b;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i3;
                                break;
                            default:
                                switch (i2) {
                                    case 800:
                                        str = NSTIJKPlayerMulti3.this.f29601b;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerMulti3.this.f29601b;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerMulti3.this.f29601b;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerMulti3.this.f29601b;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerMulti3.this.f29601b;
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
            Log.d(NSTIJKPlayerMulti3.this.f29601b, "Error: " + i2 + "," + i3);
            NSTIJKPlayerMulti3.this.f29605f = -1;
            NSTIJKPlayerMulti3.this.f29606g = -1;
            if (NSTIJKPlayerMulti3.this.f29614o != null) {
                NSTIJKPlayerMulti3.this.f29614o.d();
            }
            NSTIJKPlayerMulti3.this.a0(-1);
            if (NSTIJKPlayerMulti3.this.s == null || NSTIJKPlayerMulti3.this.s.onError(NSTIJKPlayerMulti3.this.f29608i, i2, i3)) {
            }
            return true;
        }
    }

    public class g implements IMediaPlayer.OnBufferingUpdateListener {
        public g() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i2) {
            NSTIJKPlayerMulti3.this.r = i2;
        }
    }

    public class h implements c.a {
        public h() {
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void a(c.b bVar, int i2, int i3, int i4) {
            if (bVar.a() != NSTIJKPlayerMulti3.this.H) {
                Log.e(NSTIJKPlayerMulti3.this.f29601b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerMulti3.this.f29611l = i3;
            NSTIJKPlayerMulti3.this.f29612m = i4;
            boolean z = true;
            boolean z2 = NSTIJKPlayerMulti3.this.f29606g == 3;
            if (NSTIJKPlayerMulti3.this.H.c() && (NSTIJKPlayerMulti3.this.f29609j != i3 || NSTIJKPlayerMulti3.this.f29610k != i4)) {
                z = false;
            }
            if (NSTIJKPlayerMulti3.this.f29608i != null && z2 && z) {
                if (NSTIJKPlayerMulti3.this.u != 0) {
                    NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = NSTIJKPlayerMulti3.this;
                    nSTIJKPlayerMulti3.seekTo(nSTIJKPlayerMulti3.u);
                }
                NSTIJKPlayerMulti3.this.start();
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void b(c.b bVar, int i2, int i3) {
            if (bVar.a() != NSTIJKPlayerMulti3.this.H) {
                Log.e(NSTIJKPlayerMulti3.this.f29601b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerMulti3.this.f29607h = bVar;
            if (NSTIJKPlayerMulti3.this.f29608i == null) {
                NSTIJKPlayerMulti3.this.S();
            } else {
                NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = NSTIJKPlayerMulti3.this;
                nSTIJKPlayerMulti3.H(nSTIJKPlayerMulti3.f29608i, bVar);
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void c(c.b bVar) {
            if (bVar.a() != NSTIJKPlayerMulti3.this.H) {
                Log.e(NSTIJKPlayerMulti3.this.f29601b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                NSTIJKPlayerMulti3.this.f29607h = null;
                NSTIJKPlayerMulti3.this.U();
            }
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f29623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f29624b;

        public i(Activity activity) {
            this.f29623a = activity;
        }

        public i a() {
            View view = this.f29624b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public i b(int i2) {
            this.f29624b = this.f29623a.findViewById(i2);
            return this;
        }

        public i c() {
            View view = this.f29624b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public i d(CharSequence charSequence) {
            View view = this.f29624b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public i e() {
            View view = this.f29624b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerMulti3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29601b = "NSTIJKPlayerMulti3";
        this.f29604e = 0;
        this.f29605f = 0;
        this.f29606g = 0;
        this.f29607h = null;
        this.f29608i = null;
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
        if (this.f29608i == null || (bVar = this.f29614o) == null) {
            return;
        }
        bVar.b(this);
        this.f29614o.c(getParent() instanceof View ? (View) getParent() : this);
        this.f29614o.setEnabled(Q());
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
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerMulti3.I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void J() {
        c.h.a.k.d.b.a.d(this.f29608i);
    }

    public final void K() {
        this.N.b(R.id.app_video_loading_3).a();
        this.N.b(R.id.app_video_status_3).a();
        L();
    }

    public void L() {
        this.N.b(R.id.app_video_top_box_3).a();
        this.N.b(R.id.controls_3).a();
        this.N.b(R.id.ll_seekbar_time_3).a();
        this.y.removeCallbacksAndMessages(null);
    }

    public final void M() {
        boolean zP = this.G.p();
        this.i0 = zP;
        if (zP) {
            c.h.a.k.d.b.a.b(getContext());
            this.f29608i = c.h.a.k.d.b.a.a();
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
        this.f29609j = 0;
        this.f29610k = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f29605f = 0;
        this.f29606g = 0;
    }

    public boolean P() {
        return this.i0;
    }

    public final boolean Q() {
        int i2;
        return (this.f29608i == null || (i2 = this.f29605f) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    public void R() {
        IMediaPlayer iMediaPlayer = this.f29608i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @TargetApi(23)
    public void S() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f29602c == null || this.f29607h == null) {
            return;
        }
        T(false);
        try {
            ((AudioManager) this.F.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        this.N.b(R.id.app_video_status_3).a();
        try {
            try {
                IMediaPlayer iMediaPlayerI = I(this.G.x());
                this.f29608i = iMediaPlayerI;
                iMediaPlayerI.setOnPreparedListener(this.R);
                this.f29608i.setOnVideoSizeChangedListener(this.Q);
                this.f29608i.setOnCompletionListener(this.S);
                this.f29608i.setOnErrorListener(this.U);
                this.f29608i.setOnInfoListener(this.T);
                this.f29608i.setOnBufferingUpdateListener(this.V);
                this.r = 0;
                String scheme = this.f29602c.getScheme();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23 && this.G.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                    this.f29608i.setDataSource(new c.h.a.k.d.c.a.a(new File(this.f29602c.toString())));
                } else if (i2 >= 14) {
                    this.f29608i.setDataSource(this.F, this.f29602c, this.f29603d);
                } else {
                    this.f29608i.setDataSource(this.f29602c.toString());
                }
                H(this.f29608i, this.f29607h);
                this.f29608i.setAudioStreamType(3);
                this.f29608i.setScreenOnWhilePlaying(true);
                this.f29608i.prepareAsync();
                this.M = (AudioManager) this.K.getSystemService("audio");
                this.f29605f = 1;
            } catch (IOException e2) {
                Log.w(this.f29601b, "Unable to open content: " + this.f29602c, e2);
                this.f29605f = -1;
                this.f29606g = -1;
                onErrorListener = this.U;
                iMediaPlayer = this.f29608i;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            } catch (NullPointerException e3) {
                Log.w(this.f29601b, "Unable to open content: " + this.f29602c, e3);
                this.f29605f = -1;
                this.f29606g = -1;
                onErrorListener = this.U;
                iMediaPlayer = this.f29608i;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (IllegalArgumentException e4) {
            Log.w(this.f29601b, "Unable to open content: " + this.f29602c, e4);
            this.f29605f = -1;
            this.f29606g = -1;
            onErrorListener = this.U;
            iMediaPlayer = this.f29608i;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        } catch (Exception e5) {
            Log.w(this.f29601b, "Unable to open content: " + this.f29602c, e5);
            this.f29605f = -1;
            this.f29606g = -1;
            onErrorListener = this.U;
            iMediaPlayer = this.f29608i;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    public void T(boolean z) {
        IMediaPlayer iMediaPlayer = this.f29608i;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f29608i.release();
            this.f29608i = null;
            this.f29605f = 0;
            if (z) {
                this.f29606g = 0;
            }
            ((AudioManager) this.F.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void U() {
        IMediaPlayer iMediaPlayer = this.f29608i;
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

    public void W(Activity activity, NSTIJKPlayerMulti3 nSTIJKPlayerMulti3) {
        this.K = activity;
        this.L = nSTIJKPlayerMulti3;
        this.y = new Handler();
        this.N = new i(activity);
    }

    public final void X(Uri uri, Map<String, String> map, boolean z, String str) {
        this.f29602c = uri;
        this.f29603d = map;
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
        this.N.b(R.id.video_view_3).a();
        this.N.b(R.id.app_video_status_3).e();
        this.N.b(R.id.app_video_status_text_3).d(str);
    }

    public final void a0(int i2) {
        this.f29604e = i2;
        if (i2 == -1) {
            if (this.A < this.B) {
                this.C = true;
                this.y.postDelayed(new a(), 3000L);
                return;
            }
            K();
            this.f29602c = null;
            Z(this.K.getResources().getString(R.string.small_problem));
            c0();
            this.C = false;
            return;
        }
        if (i2 == 1) {
            this.N.b(R.id.app_video_loading_3).e();
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
                this.N.b(R.id.app_video_status_3).a();
                this.N.b(R.id.video_view_3).e();
                this.N.b(R.id.exo_play).a();
                this.N.b(R.id.exo_pause).e();
                this.N.b(R.id.app_video_loading_3).a();
                if (this.K.findViewById(R.id.app_video_box_3).isFocusable()) {
                    return;
                }
                R();
                return;
            }
            this.A = 0;
            this.N.b(R.id.app_video_status_3).a();
            this.N.b(R.id.video_view_3).e();
            this.N.b(R.id.exo_play).a();
            this.N.b(R.id.exo_pause).e();
        }
        this.N.b(R.id.app_video_loading_3).a();
    }

    public void b0() {
        c.h.a.k.d.b.a.d(null);
    }

    public void c0() {
        IMediaPlayer iMediaPlayer = this.f29608i;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f29608i.release();
            this.f29608i = null;
            this.f29605f = 0;
            this.f29606g = 0;
            ((AudioManager) this.F.getSystemService("audio")).abandonAudioFocus(null);
            c.b bVar = this.f29607h;
            if (bVar == null || bVar.c() == null) {
                return;
            }
            this.f29607h.c().setFormat(-2);
            this.f29607h.c().setFormat(-1);
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
        IMediaPlayer iMediaPlayer = this.f29608i;
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
        if (this.f29608i != null) {
            return this.r;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (Q()) {
            return (int) this.f29608i.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (Q()) {
            return (int) this.f29608i.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return Q() && (iMediaPlayer = this.f29608i) != null && iMediaPlayer.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z = (i2 == 4 || i2 == 24 || i2 == 25 || i2 == 164 || i2 == 82 || i2 == 5 || i2 == 6) ? false : true;
        if (Q() && z && this.f29614o != null) {
            if (i2 == 79 || i2 == 85) {
                IMediaPlayer iMediaPlayer = this.f29608i;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f29614o.d();
                } else {
                    pause();
                    this.f29614o.show();
                }
                return true;
            }
            if (i2 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f29608i;
                if (iMediaPlayer2 != null && !iMediaPlayer2.isPlaying()) {
                    start();
                    this.f29614o.d();
                }
                return true;
            }
            if (i2 == 86 || i2 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f29608i;
                if (iMediaPlayer3 != null && iMediaPlayer3.isPlaying()) {
                    pause();
                    this.f29614o.show();
                }
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (Q() && (iMediaPlayer = this.f29608i) != null && iMediaPlayer.isPlaying()) {
            this.f29608i.pause();
            this.f29605f = 4;
        }
        this.f29606g = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i2) {
        if (Q()) {
            this.f29608i.seekTo(i2);
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
        c.h.a.k.d.c.a.b bVar2 = this.f29614o;
        if (bVar2 != null) {
            bVar2.d();
        }
        this.f29614o = bVar;
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
                Log.e(this.f29601b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i2)));
                return;
            }
            c.h.a.k.d.c.a.i iVar = new c.h.a.k.d.c.a.i(getContext());
            gVar = iVar;
            if (this.f29608i != null) {
                iVar.getSurfaceHolder().b(this.f29608i);
                iVar.a(this.f29608i.getVideoWidth(), this.f29608i.getVideoHeight());
                iVar.b(this.f29608i.getVideoSarNum(), this.f29608i.getVideoSarDen());
                gVar = iVar;
            }
        }
        setRenderView(gVar);
    }

    public void setRenderView(c.h.a.k.d.c.a.c cVar) {
        int i2;
        int i3;
        if (this.H != null) {
            IMediaPlayer iMediaPlayer = this.f29608i;
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
        int i4 = this.f29609j;
        if (i4 > 0 && (i3 = this.f29610k) > 0) {
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
        this.H.setVideoRotation(this.f29613n);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (Q()) {
            this.f29608i.start();
            this.f29605f = 3;
        }
        this.f29606g = 3;
    }
}
