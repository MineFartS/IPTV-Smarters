package minefarts.iptvsmarters.view.ijkplayer.widget.media;

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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TableLayout;
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
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerSeriesThumbnail extends FrameLayout implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f29651b = {0, 1, 2, 3, 4, 5};
    public int A;
    public LinearLayout A0;
    public long B;
    public LinearLayout B0;
    public boolean C;
    public ImageView C0;
    public boolean D;
    public LinearLayout D0;
    public int E;
    public LinearLayout E0;
    public Handler F;
    public ProgressBar F0;
    public Handler G;
    public int G0;
    public int H;
    public Handler H0;
    public boolean I;
    public IMediaPlayer.OnVideoSizeChangedListener I0;
    public int J;
    public IMediaPlayer.OnPreparedListener J0;
    public int K;
    public IMediaPlayer.OnCompletionListener K0;
    public boolean L;
    public IMediaPlayer.OnInfoListener L0;
    public SharedPreferences M;
    public IMediaPlayer.OnErrorListener M0;
    public SharedPreferences N;
    public IMediaPlayer.OnBufferingUpdateListener N0;
    public Context O;
    public IMediaPlayer.OnSeekCompleteListener O0;
    public c.h.a.k.d.a.a P;
    public IMediaPlayer.OnTimedTextListener P0;
    public c.h.a.k.d.c.a.c Q;
    public c.a Q0;
    public int R;
    public int R0;
    public int S;
    public int S0;
    public long T;
    public List<Integer> T0;
    public long U;
    public int U0;
    public long V;
    public int V0;
    public long W;
    public boolean W0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f29653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, String> f29655f;
    public TextView f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29656g;
    public Activity g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29657h;
    public NSTIJKPlayerSeriesThumbnail h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29658i;
    public AudioManager i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.b f29659j;
    public int j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IMediaPlayer f29660k;
    public float k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29661l;
    public int l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29662m;
    public k m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29663n;
    public Boolean n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29664o;
    public Boolean o0;
    public int p;
    public Boolean p0;
    public c.h.a.k.d.c.a.b q;
    public Boolean q0;
    public IMediaPlayer.OnCompletionListener r;
    public Boolean r0;
    public IMediaPlayer.OnPreparedListener s;
    public Boolean s0;
    public int t;
    public SharedPreferences t0;
    public IMediaPlayer.OnErrorListener u;
    public SharedPreferences u0;
    public IMediaPlayer.OnInfoListener v;
    public SharedPreferences v0;
    public int w;
    public SharedPreferences w0;
    public boolean x;
    public c.h.a.i.q.f x0;
    public boolean y;
    public Context y0;
    public boolean z;
    public NSTIJKPlayerSeriesThumbnail z0;

    public class a implements c.a {
        public a() {
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void a(c.b bVar, int i2, int i3, int i4) {
            if (bVar.a() != NSTIJKPlayerSeriesThumbnail.this.Q) {
                Log.e(NSTIJKPlayerSeriesThumbnail.this.f29652c, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerSeriesThumbnail.this.f29663n = i3;
            NSTIJKPlayerSeriesThumbnail.this.f29664o = i4;
            boolean z = true;
            boolean z2 = NSTIJKPlayerSeriesThumbnail.this.f29658i == 3;
            if (NSTIJKPlayerSeriesThumbnail.this.Q.c() && (NSTIJKPlayerSeriesThumbnail.this.f29661l != i3 || NSTIJKPlayerSeriesThumbnail.this.f29662m != i4)) {
                z = false;
            }
            if (NSTIJKPlayerSeriesThumbnail.this.f29660k != null && z2 && z) {
                if (NSTIJKPlayerSeriesThumbnail.this.w != 0) {
                    NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail = NSTIJKPlayerSeriesThumbnail.this;
                    nSTIJKPlayerSeriesThumbnail.seekTo(nSTIJKPlayerSeriesThumbnail.w);
                }
                NSTIJKPlayerSeriesThumbnail.this.start();
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void b(c.b bVar, int i2, int i3) {
            if (bVar.a() != NSTIJKPlayerSeriesThumbnail.this.Q) {
                Log.e(NSTIJKPlayerSeriesThumbnail.this.f29652c, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerSeriesThumbnail.this.f29659j = bVar;
            if (NSTIJKPlayerSeriesThumbnail.this.f29660k == null) {
                NSTIJKPlayerSeriesThumbnail.this.U();
            } else {
                NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail = NSTIJKPlayerSeriesThumbnail.this;
                nSTIJKPlayerSeriesThumbnail.H(nSTIJKPlayerSeriesThumbnail.f29660k, bVar);
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void c(c.b bVar) {
            if (bVar.a() != NSTIJKPlayerSeriesThumbnail.this.Q) {
                Log.e(NSTIJKPlayerSeriesThumbnail.this.f29652c, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                NSTIJKPlayerSeriesThumbnail.this.f29659j = null;
                NSTIJKPlayerSeriesThumbnail.this.W();
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 2) {
                NSTIJKPlayerSeriesThumbnail.this.L(false);
            } else {
                if (i2 != 4) {
                    return;
                }
                NSTIJKPlayerSeriesThumbnail.this.m0.b(R.id.app_video_volume_box).a();
                NSTIJKPlayerSeriesThumbnail.this.m0.b(R.id.app_video_brightness_box).a();
                NSTIJKPlayerSeriesThumbnail.this.m0.b(R.id.app_video_fastForward_box).a();
            }
        }
    }

    public class c implements IMediaPlayer.OnVideoSizeChangedListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i2, int i3, int i4, int i5) {
            NSTIJKPlayerSeriesThumbnail.this.f29661l = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSeriesThumbnail.this.f29662m = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerSeriesThumbnail.this.R = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerSeriesThumbnail.this.S = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerSeriesThumbnail.this.f29661l == 0 || NSTIJKPlayerSeriesThumbnail.this.f29662m == 0) {
                return;
            }
            if (NSTIJKPlayerSeriesThumbnail.this.Q != null) {
                NSTIJKPlayerSeriesThumbnail.this.Q.a(NSTIJKPlayerSeriesThumbnail.this.f29661l, NSTIJKPlayerSeriesThumbnail.this.f29662m);
                NSTIJKPlayerSeriesThumbnail.this.Q.b(NSTIJKPlayerSeriesThumbnail.this.R, NSTIJKPlayerSeriesThumbnail.this.S);
            }
            NSTIJKPlayerSeriesThumbnail.this.requestLayout();
        }
    }

    public class d implements IMediaPlayer.OnPreparedListener {
        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSeriesThumbnail.this.U = System.currentTimeMillis();
            NSTIJKPlayerSeriesThumbnail.this.f29657h = 2;
            if (NSTIJKPlayerSeriesThumbnail.this.s != null) {
                NSTIJKPlayerSeriesThumbnail.this.s.onPrepared(NSTIJKPlayerSeriesThumbnail.this.f29660k);
            }
            if (NSTIJKPlayerSeriesThumbnail.this.q != null) {
                NSTIJKPlayerSeriesThumbnail.this.q.setEnabled(true);
            }
            NSTIJKPlayerSeriesThumbnail.this.f29661l = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSeriesThumbnail.this.f29662m = iMediaPlayer.getVideoHeight();
            int i2 = NSTIJKPlayerSeriesThumbnail.this.w;
            if (i2 != 0) {
                NSTIJKPlayerSeriesThumbnail.this.seekTo(i2);
            }
            if (NSTIJKPlayerSeriesThumbnail.this.f29661l == 0 || NSTIJKPlayerSeriesThumbnail.this.f29662m == 0) {
                if (NSTIJKPlayerSeriesThumbnail.this.f29658i == 3) {
                    NSTIJKPlayerSeriesThumbnail.this.start();
                    return;
                }
                return;
            }
            if (NSTIJKPlayerSeriesThumbnail.this.Q != null) {
                NSTIJKPlayerSeriesThumbnail.this.Q.a(NSTIJKPlayerSeriesThumbnail.this.f29661l, NSTIJKPlayerSeriesThumbnail.this.f29662m);
                NSTIJKPlayerSeriesThumbnail.this.Q.b(NSTIJKPlayerSeriesThumbnail.this.R, NSTIJKPlayerSeriesThumbnail.this.S);
                if (!NSTIJKPlayerSeriesThumbnail.this.Q.c() || (NSTIJKPlayerSeriesThumbnail.this.f29663n == NSTIJKPlayerSeriesThumbnail.this.f29661l && NSTIJKPlayerSeriesThumbnail.this.f29664o == NSTIJKPlayerSeriesThumbnail.this.f29662m)) {
                    if (NSTIJKPlayerSeriesThumbnail.this.f29658i == 3) {
                        NSTIJKPlayerSeriesThumbnail.this.start();
                        if (NSTIJKPlayerSeriesThumbnail.this.q != null) {
                            NSTIJKPlayerSeriesThumbnail.this.q.show();
                            return;
                        }
                        return;
                    }
                    if (NSTIJKPlayerSeriesThumbnail.this.isPlaying()) {
                        return;
                    }
                    if ((i2 != 0 || NSTIJKPlayerSeriesThumbnail.this.getCurrentPosition() > 0) && NSTIJKPlayerSeriesThumbnail.this.q != null) {
                        NSTIJKPlayerSeriesThumbnail.this.q.show(0);
                    }
                }
            }
        }
    }

    public class e implements IMediaPlayer.OnCompletionListener {
        public e() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSeriesThumbnail.this.f29657h = 5;
            NSTIJKPlayerSeriesThumbnail.this.f29658i = 5;
            if (NSTIJKPlayerSeriesThumbnail.this.q != null) {
                NSTIJKPlayerSeriesThumbnail.this.q.d();
            }
            NSTIJKPlayerSeriesThumbnail.this.c0(-1);
            if (NSTIJKPlayerSeriesThumbnail.this.r != null) {
                NSTIJKPlayerSeriesThumbnail.this.r.onCompletion(NSTIJKPlayerSeriesThumbnail.this.f29660k);
            }
        }
    }

    public class f implements IMediaPlayer.OnInfoListener {
        public f() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i2, int i3) {
            String str;
            String str2;
            if (NSTIJKPlayerSeriesThumbnail.this.v != null) {
                NSTIJKPlayerSeriesThumbnail.this.v.onInfo(iMediaPlayer, i2, i3);
            }
            if (i2 == 3) {
                NSTIJKPlayerSeriesThumbnail.this.c0(2);
                str = NSTIJKPlayerSeriesThumbnail.this.f29652c;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i2 == 10005) {
                NSTIJKPlayerSeriesThumbnail.this.c0(1);
                str = NSTIJKPlayerSeriesThumbnail.this.f29652c;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i2 == 901) {
                str = NSTIJKPlayerSeriesThumbnail.this.f29652c;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i2 != 902) {
                    if (i2 == 10001) {
                        NSTIJKPlayerSeriesThumbnail.this.p = i3;
                        Log.d(NSTIJKPlayerSeriesThumbnail.this.f29652c, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i3);
                        if (NSTIJKPlayerSeriesThumbnail.this.Q != null) {
                            NSTIJKPlayerSeriesThumbnail.this.Q.setVideoRotation(i3);
                        }
                    } else if (i2 != 10002) {
                        switch (i2) {
                            case 700:
                                str = NSTIJKPlayerSeriesThumbnail.this.f29652c;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerSeriesThumbnail.this.c0(1);
                                str = NSTIJKPlayerSeriesThumbnail.this.f29652c;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerSeriesThumbnail.this.c0(6);
                                str = NSTIJKPlayerSeriesThumbnail.this.f29652c;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerSeriesThumbnail.this.f29652c;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i3;
                                break;
                            default:
                                switch (i2) {
                                    case 800:
                                        str = NSTIJKPlayerSeriesThumbnail.this.f29652c;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerSeriesThumbnail.this.f29652c;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerSeriesThumbnail.this.f29652c;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerSeriesThumbnail.this.f29652c;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerSeriesThumbnail.this.f29652c;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            }
            Log.d(str, str2);
            return true;
        }
    }

    public class g implements IMediaPlayer.OnErrorListener {
        public g() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i2, int i3) {
            Log.d(NSTIJKPlayerSeriesThumbnail.this.f29652c, "Error: " + i2 + "," + i3);
            NSTIJKPlayerSeriesThumbnail.this.f29657h = -1;
            NSTIJKPlayerSeriesThumbnail.this.f29658i = -1;
            if (NSTIJKPlayerSeriesThumbnail.this.q != null) {
                NSTIJKPlayerSeriesThumbnail.this.q.d();
            }
            NSTIJKPlayerSeriesThumbnail.this.c0(-1);
            if (NSTIJKPlayerSeriesThumbnail.this.u == null || NSTIJKPlayerSeriesThumbnail.this.u.onError(NSTIJKPlayerSeriesThumbnail.this.f29660k, i2, i3)) {
            }
            return true;
        }
    }

    public class h implements IMediaPlayer.OnBufferingUpdateListener {
        public h() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i2) {
            NSTIJKPlayerSeriesThumbnail.this.t = i2;
        }
    }

    public class i implements IMediaPlayer.OnSeekCompleteListener {
        public i() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSeriesThumbnail.this.W = System.currentTimeMillis();
        }
    }

    public class j implements IMediaPlayer.OnTimedTextListener {
        public j() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            if (ijkTimedText != null) {
                NSTIJKPlayerSeriesThumbnail.this.f0.setText(ijkTimedText.getText().replace("{\\b1}", BuildConfig.FLAVOR).replace("{\\b0}", BuildConfig.FLAVOR).replace("{\\i1}", BuildConfig.FLAVOR).replace("{\\i0}", BuildConfig.FLAVOR));
            }
        }
    }

    public class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f29675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f29676b;

        public k(Activity activity) {
            this.f29675a = activity;
        }

        public k a() {
            View view = this.f29676b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public k b(int i2) {
            this.f29676b = this.f29675a.findViewById(i2);
            return this;
        }

        public k c() {
            View view = this.f29676b;
            if (view != null) {
                view.setVisibility(4);
            }
            return this;
        }

        public k d() {
            View view = this.f29676b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public k e(CharSequence charSequence) {
            View view = this.f29676b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public k f(int i2) {
            View view = this.f29676b;
            if (view != null) {
                view.setVisibility(i2);
            }
            return this;
        }

        public k g() {
            View view = this.f29676b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerSeriesThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29652c = "NSTIJKPlayerEPG";
        this.f29656g = 0;
        this.f29657h = 0;
        this.f29658i = 0;
        this.f29659j = null;
        this.f29660k = null;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = -1;
        this.B = -1L;
        this.D = false;
        this.E = 7000;
        this.H = 0;
        this.J = 0;
        this.K = 5;
        this.L = false;
        this.T = 0L;
        this.U = 0L;
        this.V = 0L;
        this.W = 0L;
        this.k0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.n0 = bool;
        this.o0 = bool;
        this.p0 = bool;
        this.q0 = bool;
        this.r0 = bool;
        this.s0 = bool;
        this.G0 = 0;
        this.H0 = new b(Looper.getMainLooper());
        this.I0 = new c();
        this.J0 = new d();
        this.K0 = new e();
        this.L0 = new f();
        this.M0 = new g();
        this.N0 = new h();
        this.O0 = new i();
        this.P0 = new j();
        this.Q0 = new a();
        this.R0 = 4;
        this.S0 = f29651b[0];
        this.T0 = new ArrayList();
        this.U0 = 0;
        this.V0 = 0;
        this.W0 = false;
        Q(context);
    }

    public final void G() {
        c.h.a.k.d.c.a.b bVar;
        if (this.f29660k == null || (bVar = this.q) == null) {
            return;
        }
        bVar.b(this);
        this.q.c(getParent() instanceof View ? (View) getParent() : this);
        this.q.setEnabled(S());
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
    public tv.danmaku.ijk.media.player.IMediaPlayer I(int r11) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail.I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void J(int i2) {
        c.h.a.k.d.c.a.f.b(this.f29660k, i2);
    }

    public void K() {
        c.h.a.k.d.b.a.d(this.f29660k);
    }

    public void L(boolean z) {
        if (z || this.C) {
            b0(false);
            this.m0.b(R.id.app_video_top_box).a();
            this.m0.b(R.id.controls).a();
            this.m0.b(R.id.app_video_fullscreen).c();
            this.m0.b(R.id.ll_seekbar_time).a();
            this.C = false;
            N();
        }
    }

    public void M(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, LinearLayout linearLayout3, LinearLayout linearLayout4, ProgressBar progressBar, int i2) {
        this.z0 = nSTIJKPlayerSeriesThumbnail;
        this.A0 = linearLayout;
        this.B0 = linearLayout2;
        this.C0 = imageView;
        this.D0 = linearLayout3;
        this.E0 = linearLayout4;
        this.F0 = progressBar;
        this.G0 = i2;
    }

    public void N() {
        this.m0.b(R.id.app_video_top_box).a();
        this.m0.b(R.id.controls).a();
        this.m0.b(R.id.ll_seekbar_time).a();
        this.C = false;
        this.F.removeCallbacksAndMessages(null);
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            this.m0.b(R.id.watrmrk).g();
        }
    }

    public final void O() {
        boolean zP = this.P.p();
        this.W0 = zP;
        if (zP) {
            c.h.a.k.d.b.a.b(getContext());
            this.f29660k = c.h.a.k.d.b.a.a();
        }
    }

    public final void P() {
        this.T0.clear();
        if (this.P.s()) {
            this.T0.add(1);
        }
        if (this.P.t() && Build.VERSION.SDK_INT >= 14) {
            this.T0.add(2);
        }
        if (this.P.r()) {
            this.T0.add(0);
        }
        if (this.T0.isEmpty()) {
            this.T0.add(1);
        }
        int iIntValue = this.T0.get(this.U0).intValue();
        this.V0 = iIntValue;
        setRender(iIntValue);
    }

    public final void Q(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.O = applicationContext;
        this.P = new c.h.a.k.d.a.a(applicationContext);
        O();
        P();
        this.f29661l = 0;
        this.f29662m = 0;
        this.f29657h = 0;
        this.f29658i = 0;
        TextView textView = new TextView(context);
        this.f0 = textView;
        textView.setTextSize(24.0f);
        this.f0.setTextColor(context.getResources().getColor(R.color.white));
        this.f0.setGravity(17);
        addView(this.f0, new FrameLayout.LayoutParams(-1, -2, 80));
    }

    public boolean R() {
        return this.W0;
    }

    public final boolean S() {
        int i2;
        return (this.f29660k == null || (i2 = this.f29657h) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    public void T() {
        IMediaPlayer iMediaPlayer = this.f29660k;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @TargetApi(23)
    public void U() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f29653d == null || this.f29659j == null) {
            return;
        }
        V(false);
        try {
            ((AudioManager) this.O.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            try {
                this.f29660k = I(this.P.x());
                getContext();
                this.f29660k.setOnPreparedListener(this.J0);
                this.f29660k.setOnVideoSizeChangedListener(this.I0);
                this.f29660k.setOnCompletionListener(this.K0);
                this.f29660k.setOnErrorListener(this.M0);
                this.f29660k.setOnInfoListener(this.L0);
                this.f29660k.setOnBufferingUpdateListener(this.N0);
                this.f29660k.setOnSeekCompleteListener(this.O0);
                this.f29660k.setOnTimedTextListener(this.P0);
                this.t = 0;
                String scheme = this.f29653d.getScheme();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23 && this.P.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                    this.f29660k.setDataSource(new c.h.a.k.d.c.a.a(new File(this.f29653d.toString())));
                } else if (i2 >= 14) {
                    this.f29660k.setDataSource(this.O, this.f29653d, this.f29655f);
                } else {
                    this.f29660k.setDataSource(this.f29653d.toString());
                }
                H(this.f29660k, this.f29659j);
                this.f29660k.setAudioStreamType(3);
                this.f29660k.setScreenOnWhilePlaying(true);
                this.T = System.currentTimeMillis();
                this.f29660k.prepareAsync();
                this.l0 = this.g0.getResources().getDisplayMetrics().widthPixels;
                AudioManager audioManager = (AudioManager) this.g0.getSystemService("audio");
                this.i0 = audioManager;
                this.j0 = audioManager.getStreamMaxVolume(3);
                T();
                this.f29657h = 1;
            } catch (NullPointerException e2) {
                Log.w(this.f29652c, "Unable to open content: " + this.f29653d, e2);
                this.f29657h = -1;
                this.f29658i = -1;
                onErrorListener = this.M0;
                iMediaPlayer = this.f29660k;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            } catch (Exception e3) {
                Log.w(this.f29652c, "Unable to open content: " + this.f29653d, e3);
                this.f29657h = -1;
                this.f29658i = -1;
                onErrorListener = this.M0;
                iMediaPlayer = this.f29660k;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (IOException e4) {
            Log.w(this.f29652c, "Unable to open content: " + this.f29653d, e4);
            this.f29657h = -1;
            this.f29658i = -1;
            onErrorListener = this.M0;
            iMediaPlayer = this.f29660k;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        } catch (IllegalArgumentException e5) {
            Log.w(this.f29652c, "Unable to open content: " + this.f29653d, e5);
            this.f29657h = -1;
            this.f29658i = -1;
            onErrorListener = this.M0;
            iMediaPlayer = this.f29660k;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    public void V(boolean z) {
        IMediaPlayer iMediaPlayer = this.f29660k;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f29660k.release();
            this.f29660k = null;
            this.f29657h = 0;
            if (z) {
                this.f29658i = 0;
            }
            ((AudioManager) this.O.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void W() {
        IMediaPlayer iMediaPlayer = this.f29660k;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void X(int i2) {
        c.h.a.k.d.c.a.f.e(this.f29660k, i2);
    }

    public void Y(Activity activity, NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
        this.g0 = activity;
        this.h0 = nSTIJKPlayerSeriesThumbnail;
        this.F = new Handler();
        this.G = new Handler();
        this.m0 = new k(activity);
    }

    public final void Z(Uri uri, Map<String, String> map, boolean z, String str) {
        this.f29653d = uri;
        this.f29654e = str;
        this.f29655f = map;
        this.w = 0;
        this.I = z;
        e0();
        U();
        requestLayout();
        invalidate();
    }

    public void a0(Uri uri, boolean z, String str) {
        Z(uri, null, z, str);
    }

    public void b0(boolean z) {
        this.m0.b(R.id.app_video_currentTime).f(z ? 0 : 8);
        this.m0.b(R.id.app_video_endTime).f(z ? 0 : 8);
        this.m0.b(R.id.app_video_seekBar).f(z ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c0(int r13) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail.c0(int):void");
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

    public void d0() {
        c.h.a.k.d.b.a.d(null);
    }

    public void e0() {
        IMediaPlayer iMediaPlayer = this.f29660k;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f29660k.release();
            this.f29660k = null;
            this.f29657h = 0;
            this.f29658i = 0;
            ((AudioManager) this.O.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public final void f0() {
        if (this.q.a()) {
            this.q.d();
        } else {
            this.q.show();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f29660k != null) {
            return this.t;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (S()) {
            return (int) this.f29660k.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.H;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (S()) {
            return (int) this.f29660k.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.I);
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f29660k;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return S() && (iMediaPlayer = this.f29660k) != null && iMediaPlayer.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z = (i2 == 4 || i2 == 24 || i2 == 25 || i2 == 164 || i2 == 82 || i2 == 5 || i2 == 6) ? false : true;
        if (S() && z && this.q != null) {
            if (i2 == 79 || i2 == 85) {
                IMediaPlayer iMediaPlayer = this.f29660k;
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
                IMediaPlayer iMediaPlayer2 = this.f29660k;
                if (iMediaPlayer2 != null && !iMediaPlayer2.isPlaying()) {
                    start();
                    this.q.d();
                }
                return true;
            }
            if (i2 == 86 || i2 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f29660k;
                if (iMediaPlayer3 != null && iMediaPlayer3.isPlaying()) {
                    pause();
                    this.q.show();
                }
                return true;
            }
            f0();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (S() && (iMediaPlayer = this.f29660k) != null && iMediaPlayer.isPlaying()) {
            this.f29660k.pause();
            this.f29657h = 4;
        }
        this.f29658i = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i2) {
        if (S()) {
            this.V = System.currentTimeMillis();
            this.f29660k.seekTo(i2);
            i2 = 0;
        }
        this.w = i2;
    }

    public void setContext(Context context) {
        this.y0 = context;
    }

    public void setCurrentWindowIndex(int i2) {
        this.H = i2;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setLiveStreamDBHandler(c.h.a.i.q.f fVar) {
        this.x0 = fVar;
    }

    public void setMediaController(c.h.a.k.d.c.a.b bVar) {
        c.h.a.k.d.c.a.b bVar2 = this.q;
        if (bVar2 != null) {
            bVar2.d();
        }
        this.q = bVar;
        G();
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
                Log.e(this.f29652c, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i2)));
                return;
            }
            c.h.a.k.d.c.a.i iVar = new c.h.a.k.d.c.a.i(getContext());
            gVar = iVar;
            if (this.f29660k != null) {
                iVar.getSurfaceHolder().b(this.f29660k);
                iVar.a(this.f29660k.getVideoWidth(), this.f29660k.getVideoHeight());
                iVar.b(this.f29660k.getVideoSarNum(), this.f29660k.getVideoSarDen());
                iVar.setAspectRatio(this.S0);
                gVar = iVar;
            }
        }
        setRenderView(gVar);
    }

    public void setRenderView(c.h.a.k.d.c.a.c cVar) {
        int i2;
        int i3;
        if (this.Q != null) {
            IMediaPlayer iMediaPlayer = this.f29660k;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.Q.getView();
            this.Q.e(this.Q0);
            this.Q = null;
            removeView(view);
        }
        if (cVar == null) {
            return;
        }
        this.Q = cVar;
        SharedPreferences sharedPreferences = this.O.getSharedPreferences("loginPrefs", 0);
        this.M = sharedPreferences;
        int i4 = sharedPreferences.getInt("aspect_ratio", 4);
        this.R0 = i4;
        cVar.setAspectRatio(i4);
        int i5 = this.f29661l;
        if (i5 > 0 && (i3 = this.f29662m) > 0) {
            cVar.a(i5, i3);
        }
        int i6 = this.R;
        if (i6 > 0 && (i2 = this.S) > 0) {
            cVar.b(i6, i2);
        }
        View view2 = this.Q.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.Q.d(this.Q0);
        this.Q.setVideoRotation(this.p);
    }

    public void setTitle(CharSequence charSequence) {
        this.m0.b(R.id.app_video_title).e(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (S()) {
            this.f29660k.start();
            this.f29657h = 3;
        }
        this.f29658i = 3;
    }
}
