package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
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
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import c.h.a.k.d.c.a.c;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback;
import com.nst.iptvsmarterstvbox.model.pojo.PanelAvailableChannelsPojo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import mbanje.kurt.fabbutton.FabButton;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeConstants;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerVOD extends FrameLayout implements MediaController.MediaPlayerControl, c.h.a.k.f.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f29801b = {0, 1, 2, 3, 4, 5};
    public int A;
    public SeekBar A0;
    public final View.OnClickListener A1;
    public long B;
    public boolean B0;
    public IMediaPlayer.OnInfoListener B1;
    public boolean C;
    public boolean C0;
    public IMediaPlayer.OnErrorListener C1;
    public boolean D;
    public TextView D0;
    public IMediaPlayer.OnBufferingUpdateListener D1;
    public boolean E;
    public StringBuilder E0;
    public IMediaPlayer.OnSeekCompleteListener E1;
    public int F;
    public Formatter F0;
    public IMediaPlayer.OnTimedTextListener F1;
    public Handler G;
    public SharedPreferences G0;
    public c.a G1;
    public Handler H;
    public SharedPreferences.Editor H0;
    public int H1;
    public int I;
    public c.h.a.i.q.k I0;
    public int I1;
    public boolean J;
    public c.h.a.i.q.f J0;
    public List<Integer> J1;
    public int K;
    public c.h.a.i.q.j K0;
    public int K1;
    public int L;
    public boolean L0;
    public int L1;
    public boolean M;
    public int M0;
    public boolean M1;
    public SharedPreferences N;
    public int N0;
    public SharedPreferences.Editor O;
    public long O0;
    public SharedPreferences P;
    public int P0;
    public SharedPreferences Q;
    public boolean Q0;
    public Context R;
    public String R0;
    public c.h.a.k.d.a.a S;
    public String S0;
    public c.h.a.k.d.c.a.c T;
    public String T0;
    public int U;
    public ArrayList<c.h.a.i.f> U0;
    public int V;
    public boolean V0;
    public long W;
    public boolean W0;
    public SharedPreferences X0;
    public SharedPreferences Y0;
    public SharedPreferences Z0;
    public SharedPreferences a1;
    public SharedPreferences.Editor b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29802c;
    public SharedPreferences.Editor c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f29803d;
    public SharedPreferences.Editor d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29804e;
    public int e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, String> f29805f;
    public long f0;
    public boolean f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29806g;
    public long g0;
    public boolean g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29807h;
    public long h0;
    public boolean h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29808i;
    public TextView i0;
    public boolean i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.b f29809j;
    public Activity j0;
    public c.h.a.i.q.l j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IMediaPlayer f29810k;
    public NSTIJKPlayerVOD k0;
    public boolean k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29811l;
    public AudioManager l0;
    public c.h.a.k.a.m l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29812m;
    public int m0;
    public SharedPreferences m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29813n;
    public float n0;
    public c.h.a.j.j n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29814o;
    public GestureDetector o0;
    public RelativeLayout o1;
    public int p;
    public int p0;
    public FabButton p1;
    public c.h.a.k.d.c.a.b q;
    public View q0;
    public int q1;
    public IMediaPlayer.OnCompletionListener r;
    public c0 r0;
    public Runnable r1;
    public IMediaPlayer.OnPreparedListener s;
    public a.b.k.b s0;
    public Handler s1;
    public int t;
    public Button t0;
    public PopupWindow t1;
    public IMediaPlayer.OnErrorListener u;
    public Boolean u0;
    public Button u1;
    public IMediaPlayer.OnInfoListener v;
    public Boolean v0;
    public final SeekBar.OnSeekBarChangeListener v1;
    public int w;
    public Boolean w0;
    public Handler w1;
    public boolean x;
    public Boolean x0;
    public IMediaPlayer.OnVideoSizeChangedListener x1;
    public boolean y;
    public Boolean y0;
    public IMediaPlayer.OnPreparedListener y1;
    public boolean z;
    public Boolean z0;
    public IMediaPlayer.OnCompletionListener z1;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerVOD.this.n1();
        }
    }

    public class a0 implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f29816b;

        public a0(View view) {
            this.f29816b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29816b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29816b, "scaleY", f2);
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
                View view2 = this.f29816b;
                if (view2 != null && view2.getTag() != null && this.f29816b.getTag().equals("1") && NSTIJKPlayerVOD.this.t0 != null) {
                    NSTIJKPlayerVOD.this.t0.setBackgroundResource(R.drawable.black_button_dark);
                }
                a(1.0f);
                b(1.0f);
                return;
            }
            View view3 = this.f29816b;
            if (view3 != null && view3.getTag() != null && this.f29816b.getTag().equals("2")) {
                view.setBackground(NSTIJKPlayerVOD.this.getResources().getDrawable(R.drawable.selector_checkbox));
                return;
            }
            float f2 = z ? 1.12f : 1.0f;
            a(f2);
            b(f2);
            View view4 = this.f29816b;
            if (view4 == null || view4.getTag() == null || !this.f29816b.getTag().equals("1") || NSTIJKPlayerVOD.this.t0 == null) {
                return;
            }
            NSTIJKPlayerVOD.this.t0.setBackgroundResource(R.drawable.back_btn_effect);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerVOD.this.y1();
        }
    }

    public class b0 extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f29819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f29820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f29821d;

        public b0() {
        }

        public void a(boolean z) {
            if (z || NSTIJKPlayerVOD.this.C) {
                NSTIJKPlayerVOD.this.N1(false);
                NSTIJKPlayerVOD.this.r0.b(R.id.app_video_top_box).a();
                NSTIJKPlayerVOD.this.r0.b(R.id.controls).a();
                NSTIJKPlayerVOD.this.r0.b(R.id.app_video_fullscreen).d();
                NSTIJKPlayerVOD.this.r0.b(R.id.ll_seekbar_time).a();
                NSTIJKPlayerVOD.this.p1();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f29819b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (motionEvent == null || motionEvent2 == null) {
                return Boolean.parseBoolean(null);
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY() - motionEvent2.getY();
            motionEvent2.getX();
            if (this.f29819b) {
                this.f29821d = Math.abs(f2) >= Math.abs(f3);
                this.f29820c = x > ((float) NSTIJKPlayerVOD.this.p0) * 0.5f;
                this.f29819b = false;
            }
            if (!this.f29821d) {
                float height = y / NSTIJKPlayerVOD.this.k0.getHeight();
                if (this.f29820c) {
                    NSTIJKPlayerVOD.this.w1(height);
                } else {
                    NSTIJKPlayerVOD.this.v1(height);
                }
            }
            return super.onScroll(motionEvent, motionEvent2, f2, f3);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (NSTIJKPlayerVOD.this.C) {
                a(false);
            } else {
                LinearLayout linearLayout = (LinearLayout) NSTIJKPlayerVOD.this.j0.findViewById(R.id.app_video_top_box);
                LinearLayout linearLayout2 = (LinearLayout) NSTIJKPlayerVOD.this.j0.findViewById(R.id.controls);
                LinearLayout linearLayout3 = (LinearLayout) NSTIJKPlayerVOD.this.j0.findViewById(R.id.ll_seekbar_time);
                if (linearLayout.getVisibility() == 0) {
                    linearLayout.setVisibility(8);
                    linearLayout2.setVisibility(8);
                    linearLayout3.setVisibility(8);
                    return true;
                }
                NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
                nSTIJKPlayerVOD.M1(nSTIJKPlayerVOD.F);
            }
            return true;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerVOD.this.y1();
        }
    }

    public class c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f29824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f29825b;

        public c0(Activity activity) {
            this.f29824a = activity;
        }

        public c0 a() {
            View view = this.f29825b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public c0 b(int i2) {
            this.f29825b = this.f29824a.findViewById(i2);
            return this;
        }

        public c0 c(int i2) {
            View view = this.f29825b;
            if (view instanceof ImageView) {
                ((ImageView) view).setImageResource(i2);
            }
            return this;
        }

        public c0 d() {
            View view = this.f29825b;
            if (view != null) {
                view.setVisibility(4);
            }
            return this;
        }

        public c0 e() {
            View view = this.f29825b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public c0 f(CharSequence charSequence) {
            View view = this.f29825b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public c0 g(int i2) {
            View view = this.f29825b;
            if (view != null) {
                view.setVisibility(i2);
            }
            return this;
        }

        public c0 h() {
            View view = this.f29825b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == R.id.fabbutton_ring || view.getId() == R.id.ll_determinate) {
                NSTIJKPlayerVOD.this.y1();
            } else if (view.getId() == R.id.cancel_autoplay) {
                NSTIJKPlayerVOD.this.n1();
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerVOD.this.q1++;
            NSTIJKPlayerVOD.this.p1.setProgress(NSTIJKPlayerVOD.this.q1);
            if (NSTIJKPlayerVOD.this.q1 <= 140) {
                NSTIJKPlayerVOD.this.s1.postDelayed(NSTIJKPlayerVOD.this.r1, 70L);
            }
            if (NSTIJKPlayerVOD.this.q1 == 120) {
                NSTIJKPlayerVOD.this.y1();
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
            if (NSTIJKPlayerVOD.this.v != null) {
                NSTIJKPlayerVOD.this.v.onInfo(iMediaPlayer, i2, i3);
            }
            if (i2 == 3) {
                NSTIJKPlayerVOD.this.R1(2);
                str = NSTIJKPlayerVOD.this.f29802c;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i2 == 10005) {
                NSTIJKPlayerVOD.this.R1(1);
                str = NSTIJKPlayerVOD.this.f29802c;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i2 == 901) {
                str = NSTIJKPlayerVOD.this.f29802c;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i2 != 902) {
                    if (i2 == 10001) {
                        NSTIJKPlayerVOD.this.p = i3;
                        Log.d(NSTIJKPlayerVOD.this.f29802c, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i3);
                        if (NSTIJKPlayerVOD.this.T != null) {
                            NSTIJKPlayerVOD.this.T.setVideoRotation(i3);
                        }
                    } else if (i2 != 10002) {
                        switch (i2) {
                            case 700:
                                str = NSTIJKPlayerVOD.this.f29802c;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerVOD.this.R1(1);
                                str = NSTIJKPlayerVOD.this.f29802c;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerVOD.this.R1(6);
                                str = NSTIJKPlayerVOD.this.f29802c;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerVOD.this.f29802c;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i3;
                                break;
                            default:
                                switch (i2) {
                                    case 800:
                                        str = NSTIJKPlayerVOD.this.f29802c;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerVOD.this.f29802c;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerVOD.this.f29802c;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerVOD.this.f29802c;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerVOD.this.f29802c;
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
            Log.d(NSTIJKPlayerVOD.this.f29802c, "Error: " + i2 + "," + i3);
            NSTIJKPlayerVOD.this.f29807h = -1;
            NSTIJKPlayerVOD.this.f29808i = -1;
            if (NSTIJKPlayerVOD.this.q != null) {
                NSTIJKPlayerVOD.this.q.d();
            }
            NSTIJKPlayerVOD.this.R1(-1);
            if (NSTIJKPlayerVOD.this.u == null || NSTIJKPlayerVOD.this.u.onError(NSTIJKPlayerVOD.this.f29810k, i2, i3)) {
            }
            return true;
        }
    }

    public class h implements IMediaPlayer.OnBufferingUpdateListener {
        public h() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i2) {
            NSTIJKPlayerVOD.this.t = i2;
        }
    }

    public class i implements IMediaPlayer.OnSeekCompleteListener {
        public i() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerVOD.this.h0 = System.currentTimeMillis();
        }
    }

    public class j implements IMediaPlayer.OnTimedTextListener {
        public j() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            if (ijkTimedText == null) {
                NSTIJKPlayerVOD.this.i0.setVisibility(8);
                return;
            }
            String strReplace = ijkTimedText.getText().replace("{\\b1}", BuildConfig.FLAVOR).replace("{\\b0}", BuildConfig.FLAVOR).replace("{\\i1}", BuildConfig.FLAVOR).replace("{\\i0}", BuildConfig.FLAVOR).replace("{\\c}", BuildConfig.FLAVOR);
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.m1 = nSTIJKPlayerVOD.R.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                NSTIJKPlayerVOD.this.i0.setTextSize(2, Float.parseFloat(NSTIJKPlayerVOD.this.m1.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0)));
            } catch (Exception unused) {
            }
            NSTIJKPlayerVOD.this.i0.setVisibility(0);
            NSTIJKPlayerVOD.this.i0.setText(strReplace);
        }
    }

    public class k extends c.d.a.r.h.g<Bitmap> {
        public k() {
        }

        @Override // c.d.a.r.h.j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, c.d.a.r.g.c cVar) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
            RelativeLayout relativeLayout = NSTIJKPlayerVOD.this.o1;
            if (relativeLayout != null) {
                relativeLayout.setBackground(bitmapDrawable);
            }
        }
    }

    public class l implements c.a {
        public l() {
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void a(c.b bVar, int i2, int i3, int i4) {
            if (bVar.a() != NSTIJKPlayerVOD.this.T) {
                Log.e(NSTIJKPlayerVOD.this.f29802c, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerVOD.this.f29813n = i3;
            NSTIJKPlayerVOD.this.f29814o = i4;
            boolean z = true;
            boolean z2 = NSTIJKPlayerVOD.this.f29808i == 3;
            if (NSTIJKPlayerVOD.this.T.c() && (NSTIJKPlayerVOD.this.f29811l != i3 || NSTIJKPlayerVOD.this.f29812m != i4)) {
                z = false;
            }
            if (NSTIJKPlayerVOD.this.f29810k != null && z2 && z) {
                if (NSTIJKPlayerVOD.this.w != 0) {
                    NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
                    nSTIJKPlayerVOD.seekTo(nSTIJKPlayerVOD.w);
                }
                NSTIJKPlayerVOD.this.start();
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void b(c.b bVar, int i2, int i3) {
            if (bVar.a() != NSTIJKPlayerVOD.this.T) {
                Log.e(NSTIJKPlayerVOD.this.f29802c, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerVOD.this.f29809j = bVar;
            if (NSTIJKPlayerVOD.this.f29810k == null) {
                NSTIJKPlayerVOD.this.x1();
            } else {
                NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
                nSTIJKPlayerVOD.b1(nSTIJKPlayerVOD.f29810k, bVar);
            }
        }

        @Override // c.h.a.k.d.c.a.c.a
        public void c(c.b bVar) {
            if (bVar.a() != NSTIJKPlayerVOD.this.T) {
                Log.e(NSTIJKPlayerVOD.this.f29802c, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                NSTIJKPlayerVOD.this.f29809j = null;
                NSTIJKPlayerVOD.this.A1();
            }
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f29836b;

        public m(LinearLayout linearLayout) {
            this.f29836b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29836b.setVisibility(8);
        }
    }

    public class n implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f29839c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                n.this.f29839c.dismiss();
            }
        }

        public n(int i2, PopupWindow popupWindow) {
            this.f29838b = i2;
            this.f29839c = popupWindow;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.d1 = nSTIJKPlayerVOD.a1.edit();
            if (i2 == 111 || i2 == 11111111) {
                NSTIJKPlayerVOD.this.d1.putInt("currentVideoTrack", -1);
                NSTIJKPlayerVOD.this.h1(this.f29838b);
            } else {
                NSTIJKPlayerVOD.this.d1.putInt("currentVideoTrack", i2);
                NSTIJKPlayerVOD.this.D1(i2);
                int currentPosition = NSTIJKPlayerVOD.this.k0.getCurrentPosition();
                if (currentPosition != 0) {
                    NSTIJKPlayerVOD nSTIJKPlayerVOD2 = NSTIJKPlayerVOD.this;
                    nSTIJKPlayerVOD2.G0 = nSTIJKPlayerVOD2.j0.getSharedPreferences("currentSeekTime", 0);
                    NSTIJKPlayerVOD nSTIJKPlayerVOD3 = NSTIJKPlayerVOD.this;
                    nSTIJKPlayerVOD3.H0 = nSTIJKPlayerVOD3.G0.edit();
                    NSTIJKPlayerVOD.this.H0.putString("currentSeekTime", String.valueOf(currentPosition));
                    NSTIJKPlayerVOD.this.H0.apply();
                }
                NSTIJKPlayerVOD.this.x1();
                NSTIJKPlayerVOD.this.start();
                NSTIJKPlayerVOD.this.setCurrentPositionSeekbar(currentPosition);
                NSTIJKPlayerVOD.this.setProgress(true);
            }
            NSTIJKPlayerVOD.this.d1.apply();
            new Handler().postDelayed(new a(), 500L);
        }
    }

    public class o implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f29843c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f29843c.dismiss();
            }
        }

        public o(int i2, PopupWindow popupWindow) {
            this.f29842b = i2;
            this.f29843c = popupWindow;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.c1 = nSTIJKPlayerVOD.Z0.edit();
            if (i2 == 1111 || i2 == 1111111) {
                NSTIJKPlayerVOD.this.c1.putInt("currentAudioTrack", -1);
                NSTIJKPlayerVOD.this.h1(this.f29842b);
            } else {
                NSTIJKPlayerVOD.this.c1.putInt("currentAudioTrack", i2);
                int currentPosition = (int) NSTIJKPlayerVOD.this.f29810k.getCurrentPosition();
                NSTIJKPlayerVOD.this.D1(i2);
                NSTIJKPlayerVOD.this.f29810k.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            NSTIJKPlayerVOD.this.c1.apply();
            new Handler().postDelayed(new a(), 500L);
        }
    }

    public class p implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f29847c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.f29847c.dismiss();
            }
        }

        public p(int i2, PopupWindow popupWindow) {
            this.f29846b = i2;
            this.f29847c = popupWindow;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i2) {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.b1 = nSTIJKPlayerVOD.Y0.edit();
            if (i2 == 11111 || i2 == 111111) {
                NSTIJKPlayerVOD.this.b1.putInt("currentSubtitleTrack", -1);
                NSTIJKPlayerVOD.this.h1(this.f29846b);
            } else {
                NSTIJKPlayerVOD.this.b1.putInt("currentSubtitleTrack", i2);
                NSTIJKPlayerVOD.this.D1(i2);
            }
            NSTIJKPlayerVOD.this.b1.apply();
            new Handler().postDelayed(new a(), 500L);
        }
    }

    public class q implements DialogInterface.OnDismissListener {
        public q() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (NSTIJKPlayerVOD.this.k0 != null) {
                NSTIJKPlayerVOD.this.k0.o1();
            }
        }
    }

    public class r implements DialogInterface.OnShowListener {
        public r() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Button button;
            Resources resources;
            int i2;
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.t0 = nSTIJKPlayerVOD.s0.e(-2);
            NSTIJKPlayerVOD.this.t0.setTag("1");
            Button button2 = NSTIJKPlayerVOD.this.t0;
            NSTIJKPlayerVOD nSTIJKPlayerVOD2 = NSTIJKPlayerVOD.this;
            button2.setOnFocusChangeListener(nSTIJKPlayerVOD2.new a0(nSTIJKPlayerVOD2.t0));
            NSTIJKPlayerVOD.this.t0.setTextColor(NSTIJKPlayerVOD.this.j0.getResources().getColor(R.color.white));
            NSTIJKPlayerVOD.this.t0.setTextSize(16.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NSTIJKPlayerVOD.this.t0.getLayoutParams();
            marginLayoutParams.setMargins(0, 10, 50, 10);
            if (NSTIJKPlayerVOD.this.S.A().equals(c.h.a.h.n.a.s0)) {
                button = NSTIJKPlayerVOD.this.t0;
                resources = NSTIJKPlayerVOD.this.j0.getResources();
                i2 = R.drawable.black_button_dark;
            } else {
                button = NSTIJKPlayerVOD.this.t0;
                resources = NSTIJKPlayerVOD.this.j0.getResources();
                i2 = R.drawable.back_btn_effect;
            }
            button.setBackground(resources.getDrawable(i2));
            marginLayoutParams.width = 240;
            marginLayoutParams.height = 135;
        }
    }

    public class s implements SeekBar.OnSeekBarChangeListener {
        public s() {
        }

        public final String a(long j2) {
            int i2 = (int) (j2 / 1000);
            int i3 = i2 % 60;
            int i4 = (i2 / 60) % 60;
            int i5 = i2 / 3600;
            return i5 > 0 ? String.format("%02d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)) : String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            if (z && NSTIJKPlayerVOD.this.f29810k != null) {
                NSTIJKPlayerVOD.this.r0.b(R.id.app_video_status).a();
                double duration = NSTIJKPlayerVOD.this.k0.getDuration();
                double d2 = i2;
                Double.isNaN(d2);
                Double.isNaN(duration);
                int i3 = (int) (duration * ((d2 * 1.0d) / 1000.0d));
                a(i3);
                NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
                if (nSTIJKPlayerVOD.i1) {
                    nSTIJKPlayerVOD.k0.seekTo(i3);
                }
                TextView textView = NSTIJKPlayerVOD.this.D0;
                StringBuilder sb = new StringBuilder();
                NSTIJKPlayerVOD nSTIJKPlayerVOD2 = NSTIJKPlayerVOD.this;
                sb.append(nSTIJKPlayerVOD2.V1(nSTIJKPlayerVOD2.k0.getCurrentPosition()));
                sb.append("/");
                NSTIJKPlayerVOD nSTIJKPlayerVOD3 = NSTIJKPlayerVOD.this;
                sb.append(nSTIJKPlayerVOD3.V1(nSTIJKPlayerVOD3.k0.getDuration()));
                textView.setText(sb.toString());
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.h1 = true;
            nSTIJKPlayerVOD.M1(DateTimeConstants.MILLIS_PER_HOUR);
            NSTIJKPlayerVOD.this.w1.removeMessages(1);
            NSTIJKPlayerVOD nSTIJKPlayerVOD2 = NSTIJKPlayerVOD.this;
            if (nSTIJKPlayerVOD2.i1) {
                nSTIJKPlayerVOD2.l0.setStreamMute(3, true);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (NSTIJKPlayerVOD.this.f29810k == null) {
                return;
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            if (!nSTIJKPlayerVOD.i1) {
                NSTIJKPlayerVOD nSTIJKPlayerVOD2 = nSTIJKPlayerVOD.k0;
                double duration = NSTIJKPlayerVOD.this.k0.getDuration();
                double progress = seekBar.getProgress();
                Double.isNaN(progress);
                Double.isNaN(duration);
                nSTIJKPlayerVOD2.seekTo((int) (duration * ((progress * 1.0d) / 1000.0d)));
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD3 = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD3.M1(nSTIJKPlayerVOD3.F);
            NSTIJKPlayerVOD.this.w1.removeMessages(1);
            NSTIJKPlayerVOD.this.l0.setStreamMute(3, false);
            NSTIJKPlayerVOD nSTIJKPlayerVOD4 = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD4.h1 = false;
            nSTIJKPlayerVOD4.w1.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    public class t implements View.OnTouchListener {
        public t() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            if (NSTIJKPlayerVOD.this.o0.onTouchEvent(motionEvent)) {
                return true;
            }
            if ((motionEvent.getAction() & 255) != 1) {
                return false;
            }
            NSTIJKPlayerVOD.this.i1();
            return false;
        }
    }

    public class u extends Handler {
        public u(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                NSTIJKPlayerVOD.this.H1();
                NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
                if (nSTIJKPlayerVOD.h1 || !nSTIJKPlayerVOD.C) {
                    return;
                }
                NSTIJKPlayerVOD.this.w1.sendMessageDelayed(NSTIJKPlayerVOD.this.w1.obtainMessage(1), 300L);
                NSTIJKPlayerVOD.this.Z1();
                return;
            }
            if (i2 == 2) {
                NSTIJKPlayerVOD.this.l1(false);
                return;
            }
            if (i2 == 3) {
                if (NSTIJKPlayerVOD.this.B >= 0) {
                    NSTIJKPlayerVOD.this.k0.seekTo((int) NSTIJKPlayerVOD.this.B);
                    NSTIJKPlayerVOD.this.B = -1L;
                    return;
                }
                return;
            }
            if (i2 != 4) {
                return;
            }
            NSTIJKPlayerVOD.this.r0.b(R.id.app_video_volume_box).a();
            NSTIJKPlayerVOD.this.r0.b(R.id.app_video_brightness_box).a();
            NSTIJKPlayerVOD.this.r0.b(R.id.app_video_fastForward_box).a();
        }
    }

    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activity;
            StringBuilder sb;
            Resources resources;
            int i2;
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.K++;
            nSTIJKPlayerVOD.m1();
            if (NSTIJKPlayerVOD.this.S0.equals("dfo") || NSTIJKPlayerVOD.this.S0.equals("devicedata")) {
                activity = NSTIJKPlayerVOD.this.j0;
                sb = new StringBuilder();
                resources = NSTIJKPlayerVOD.this.j0.getResources();
                i2 = R.string.can_not_play;
            } else {
                activity = NSTIJKPlayerVOD.this.j0;
                sb = new StringBuilder();
                resources = NSTIJKPlayerVOD.this.j0.getResources();
                i2 = R.string.play_back_error;
            }
            sb.append(resources.getString(i2));
            sb.append(" (");
            sb.append(NSTIJKPlayerVOD.this.K);
            sb.append("/");
            sb.append(NSTIJKPlayerVOD.this.L);
            sb.append(")");
            c.h.a.h.n.e.l0(activity, sb.toString());
            NSTIJKPlayerVOD.this.x1();
            NSTIJKPlayerVOD.this.start();
        }
    }

    public class w implements IMediaPlayer.OnVideoSizeChangedListener {
        public w() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i2, int i3, int i4, int i5) {
            NSTIJKPlayerVOD.this.f29811l = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerVOD.this.f29812m = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerVOD.this.U = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerVOD.this.V = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerVOD.this.f29811l == 0 || NSTIJKPlayerVOD.this.f29812m == 0) {
                return;
            }
            if (NSTIJKPlayerVOD.this.T != null) {
                NSTIJKPlayerVOD.this.T.a(NSTIJKPlayerVOD.this.f29811l, NSTIJKPlayerVOD.this.f29812m);
                NSTIJKPlayerVOD.this.T.b(NSTIJKPlayerVOD.this.U, NSTIJKPlayerVOD.this.V);
            }
            NSTIJKPlayerVOD.this.requestLayout();
        }
    }

    public class x implements IMediaPlayer.OnPreparedListener {
        public x() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerVOD.this.f0 = System.currentTimeMillis();
            NSTIJKPlayerVOD.this.f29807h = 2;
            if (NSTIJKPlayerVOD.this.s != null) {
                NSTIJKPlayerVOD.this.s.onPrepared(NSTIJKPlayerVOD.this.f29810k);
            }
            if (NSTIJKPlayerVOD.this.q != null) {
                NSTIJKPlayerVOD.this.q.setEnabled(true);
            }
            NSTIJKPlayerVOD.this.f29811l = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerVOD.this.f29812m = iMediaPlayer.getVideoHeight();
            int i2 = NSTIJKPlayerVOD.this.w;
            if (i2 != 0) {
                NSTIJKPlayerVOD.this.seekTo(i2);
            }
            if (NSTIJKPlayerVOD.this.f29811l == 0 || NSTIJKPlayerVOD.this.f29812m == 0) {
                if (NSTIJKPlayerVOD.this.f29808i == 3) {
                    NSTIJKPlayerVOD.this.start();
                    return;
                }
                return;
            }
            if (NSTIJKPlayerVOD.this.T != null) {
                NSTIJKPlayerVOD.this.T.a(NSTIJKPlayerVOD.this.f29811l, NSTIJKPlayerVOD.this.f29812m);
                NSTIJKPlayerVOD.this.T.b(NSTIJKPlayerVOD.this.U, NSTIJKPlayerVOD.this.V);
                if (!NSTIJKPlayerVOD.this.T.c() || (NSTIJKPlayerVOD.this.f29813n == NSTIJKPlayerVOD.this.f29811l && NSTIJKPlayerVOD.this.f29814o == NSTIJKPlayerVOD.this.f29812m)) {
                    if (NSTIJKPlayerVOD.this.f29808i == 3) {
                        NSTIJKPlayerVOD.this.start();
                        if (NSTIJKPlayerVOD.this.q != null) {
                            NSTIJKPlayerVOD.this.q.show();
                            return;
                        }
                        return;
                    }
                    if (NSTIJKPlayerVOD.this.isPlaying()) {
                        return;
                    }
                    if ((i2 != 0 || NSTIJKPlayerVOD.this.getCurrentPosition() > 0) && NSTIJKPlayerVOD.this.q != null) {
                        NSTIJKPlayerVOD.this.q.show(0);
                    }
                }
            }
        }
    }

    public class y implements IMediaPlayer.OnCompletionListener {

        public class a extends c.d.a.r.h.g<Bitmap> {
            public a() {
            }

            @Override // c.d.a.r.h.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(Bitmap bitmap, c.d.a.r.g.c cVar) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                RelativeLayout relativeLayout = NSTIJKPlayerVOD.this.o1;
                if (relativeLayout != null) {
                    relativeLayout.setBackground(bitmapDrawable);
                }
            }
        }

        public y() {
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01a1  */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer r6) {
            /*
                Method dump skipped, instruction units count: 450
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD.y.onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer):void");
        }
    }

    public class z implements PopupWindow.OnDismissListener {
        public z() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (NSTIJKPlayerVOD.this.s1 != null && NSTIJKPlayerVOD.this.r1 != null) {
                NSTIJKPlayerVOD.this.s1.removeCallbacks(NSTIJKPlayerVOD.this.r1);
            }
            NSTIJKPlayerVOD.this.u1.performClick();
            NSTIJKPlayerVOD.this.o1();
        }
    }

    public NSTIJKPlayerVOD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29802c = "NSTIJKPlayerVOD";
        this.f29806g = 0;
        this.f29807h = 0;
        this.f29808i = 0;
        this.f29809j = null;
        this.f29810k = null;
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
        this.n0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.u0 = bool;
        this.v0 = bool;
        this.w0 = bool;
        this.x0 = bool;
        this.y0 = bool;
        this.z0 = bool;
        this.B0 = false;
        this.C0 = false;
        this.L0 = false;
        this.Q0 = false;
        this.V0 = false;
        this.W0 = false;
        this.f1 = false;
        this.g1 = false;
        this.k1 = false;
        this.q1 = 0;
        this.v1 = new s();
        this.w1 = new u(Looper.getMainLooper());
        this.x1 = new w();
        this.y1 = new x();
        this.z1 = new y();
        this.A1 = new d();
        this.B1 = new f();
        this.C1 = new g();
        this.D1 = new h();
        this.E1 = new i();
        this.F1 = new j();
        this.G1 = new l();
        this.H1 = 4;
        this.I1 = f29801b[0];
        this.J1 = new ArrayList();
        this.K1 = 0;
        this.L1 = 0;
        this.M1 = false;
        s1(context);
    }

    private void getRunnable() {
        boolean[] zArr = {false};
        e eVar = new e();
        this.r1 = eVar;
        if (zArr[0]) {
            return;
        }
        eVar.run();
    }

    public void A1() {
        IMediaPlayer iMediaPlayer = this.f29810k;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void B1(boolean z2) {
        this.f1 = z2;
    }

    public void C1() {
        Handler handler = this.G;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void D1(int i2) {
        c.h.a.k.d.c.a.f.e(this.f29810k, i2);
    }

    public void E1(Activity activity, NSTIJKPlayerVOD nSTIJKPlayerVOD, SeekBar seekBar, TextView textView) {
        this.j0 = activity;
        this.k0 = nSTIJKPlayerVOD;
        this.G = new Handler();
        this.A0 = seekBar;
        this.D0 = textView;
        this.H = new Handler();
        this.I0 = new c.h.a.i.q.k(activity);
        this.J0 = new c.h.a.i.q.f(activity);
        this.r0 = new c0(activity);
    }

    public void F1(Context context, ArrayList<c.h.a.i.f> arrayList, int i2) {
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

    public void G1() {
        int iU1;
        Context context = getContext();
        if (c.h.a.k.e.a.f() == null || (iU1 = U1(c.h.a.k.e.a.f().k(), c.h.a.i.q.m.z(context))) > 0 || iU1 != 0 || this.S0.equals("dfo") || this.S0.equals("devicedata")) {
            return;
        }
        I1(context, c.h.a.k.e.a.f().c(), c.h.a.k.e.a.f().d());
    }

    public final int H1() {
        int currentPosition;
        if (this.h1) {
            return 0;
        }
        if (this.f1) {
            l1(true);
            this.f1 = false;
            return 0;
        }
        if (this.k0.getProgress()) {
            this.k0.setProgress(false);
            currentPosition = this.k0.getCurrentPositionSeekbar();
            this.k0.seekTo(currentPosition);
        } else {
            currentPosition = this.k0.getCurrentPosition();
        }
        int duration = this.k0.getDuration();
        SeekBar seekBar = this.A0;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((((long) currentPosition) * 1000) / ((long) duration)));
            }
            this.A0.setSecondaryProgress(this.k0.getBufferPercentage() * 10);
        }
        if (duration == 0) {
            this.D0.setText("Live");
        } else {
            this.D0.setText(V1(currentPosition) + "/" + V1(duration));
        }
        return currentPosition;
    }

    public final void I1(Context context, ArrayList<c.h.a.i.f> arrayList, int i2) {
        if (this.I0.w(c.h.a.i.q.m.z(context)) >= 100) {
            new ArrayList();
            ArrayList<c.h.a.i.f> arrayListQ = this.I0.q("movie", c.h.a.i.q.m.z(context), "getOnedata");
            if (arrayListQ.isEmpty()) {
                this.I0.p(Integer.parseInt(arrayListQ.get(0).Y()), "movie");
            }
        }
        F1(context, arrayList, i2);
    }

    public void J1(String str, boolean z2, String str2, long j2, int i2, String str3, ArrayList<c.h.a.i.f> arrayList, int i3, int i4, String str4, String str5) {
        this.S0 = str5;
        L1(Uri.parse(str), z2, str2, j2, i2, str3, arrayList, i3, i4, str4);
    }

    public final void K1(Uri uri, Map<String, String> map, boolean z2, String str, long j2, int i2, String str2, ArrayList<c.h.a.i.f> arrayList, int i3, int i4, String str3) {
        this.f29803d = uri;
        this.f29804e = str;
        this.f29805f = map;
        this.w = 0;
        this.J = z2;
        this.T0 = str2;
        this.O0 = j2;
        this.M0 = i2;
        this.P0 = i4;
        this.U0 = arrayList;
        this.K0 = new c.h.a.i.q.j(this.j0);
        this.I0 = new c.h.a.i.q.k(this.j0);
        this.j1 = new c.h.a.i.q.l(this.j0);
        this.l1 = new c.h.a.k.a.m(this.j0);
        this.J0 = new c.h.a.i.q.f(this.j0);
        this.N0 = c.h.a.i.q.m.z(this.j0);
        this.I = i3;
        this.R0 = str3;
        T1();
        x1();
        requestLayout();
        invalidate();
    }

    public void L1(Uri uri, boolean z2, String str, long j2, int i2, String str2, ArrayList<c.h.a.i.f> arrayList, int i3, int i4, String str3) {
        K1(uri, null, z2, str, j2, i2, str2, arrayList, i3, i4, str3);
    }

    public void M1(int i2) {
        if (!this.C) {
            this.r0.b(R.id.app_video_top_box).h();
            this.r0.b(R.id.controls).h();
            this.r0.b(R.id.ll_seekbar_time).h();
            N1(true);
            this.C = true;
        }
        Z1();
        this.w1.sendEmptyMessage(1);
        this.w1.removeMessages(2);
        if (i2 != 0) {
            this.w1.sendMessageDelayed(this.G.obtainMessage(2), i2);
        }
    }

    public void N1(boolean z2) {
        this.r0.b(R.id.app_video_currentTime).g(z2 ? 0 : 8);
        this.r0.b(R.id.app_video_endTime).g(z2 ? 0 : 8);
        this.r0.b(R.id.app_video_seekBar).g(z2 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c1  */
    @android.annotation.SuppressLint({"StringFormatInvalid"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O1() {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD.O1():void");
    }

    public final void P1(String str) {
        this.r0.b(R.id.video_view).a();
        this.r0.b(R.id.app_video_status).h();
        this.r0.b(R.id.app_video_status_text).f(str);
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    public void Q1(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, PopupWindow popupWindow, TextView textView, TextView textView2, TextView textView3) {
        TextView textView4;
        int i2;
        int i3;
        IMediaPlayer iMediaPlayer = this.f29810k;
        if (iMediaPlayer == null) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        this.z0 = bool;
        this.y0 = bool;
        this.x0 = bool;
        this.v0 = bool;
        this.u0 = bool;
        this.w0 = bool;
        int iD = c.h.a.k.d.c.a.f.d(iMediaPlayer, 1);
        int iD2 = c.h.a.k.d.c.a.f.d(this.f29810k, 2);
        int iD3 = c.h.a.k.d.c.a.f.d(this.f29810k, 3);
        ITrackInfo[] trackInfo = this.f29810k.getTrackInfo();
        if (trackInfo == null || trackInfo.length <= 0) {
            textView4 = textView3;
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
                ITrackInfo[] iTrackInfoArr = trackInfo;
                IMediaFormat format = iTrackInfo.getFormat();
                if (format != null && (format instanceof IjkMediaFormat)) {
                    i3 = length;
                    if (trackType == 1) {
                        Boolean bool2 = Boolean.TRUE;
                        this.x0 = bool2;
                        if (!this.u0.booleanValue()) {
                            this.u0 = bool2;
                            RadioButton radioButton = new RadioButton(this.j0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(R.color.black));
                            radioButton.setTextSize(18.0f);
                            radioButton.setId(11111111);
                            radioButton.setPadding(10, 10, 15, 10);
                            radioButton.setOnFocusChangeListener(new a0(radioButton));
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
                        radioButton2.setTextColor(getResources().getColor(R.color.black));
                        radioButton2.setTextSize(18.0f);
                        radioButton2.setPadding(10, 10, 15, 10);
                        radioButton2.setOnFocusChangeListener(new a0(radioButton2));
                        if (i6 == iD) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new n(iD, popupWindow));
                        i4++;
                        i5 = i6;
                        trackInfo = iTrackInfoArr;
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.y0 = bool3;
                        if (!this.v0.booleanValue()) {
                            this.v0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.j0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(R.color.black));
                            radioButton3.setTextSize(18.0f);
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(10, 10, 15, 10);
                            radioButton3.setOnFocusChangeListener(new a0(radioButton3));
                            if (iD2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.j0);
                        radioButton4.setText(i6 + ", " + iTrackInfo.getInfoInline() + ", " + c1(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(R.color.black));
                        radioButton4.setTextSize(18.0f);
                        if (i6 == -1) {
                            radioButton4.setId(1111);
                        } else {
                            radioButton4.setId(i6);
                        }
                        radioButton4.setPadding(10, 10, 15, 10);
                        radioButton4.setOnFocusChangeListener(new a0(radioButton4));
                        if (i6 == iD2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new o(iD2, popupWindow));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.z0 = bool4;
                        if (!this.w0.booleanValue()) {
                            this.w0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.j0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(R.color.black));
                            radioButton5.setTextSize(18.0f);
                            radioButton5.setId(111111);
                            radioButton5.setPadding(10, 10, 15, 10);
                            radioButton5.setOnFocusChangeListener(new a0(radioButton5));
                            if (iD3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.j0);
                        radioButton6.setText(i6 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(R.color.black));
                        radioButton6.setTextSize(18.0f);
                        if (i6 == -1) {
                            radioButton6.setId(11111);
                        } else {
                            radioButton6.setId(i6);
                        }
                        radioButton6.setPadding(10, 10, 15, 10);
                        radioButton6.setOnFocusChangeListener(new a0(radioButton6));
                        if (i6 == iD3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new p(iD3, popupWindow));
                    }
                } else {
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
            textView4 = textView3;
            if (this.z0.booleanValue()) {
                textView4.setVisibility(8);
                return;
            }
        }
        textView4.setVisibility(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R1(int r14) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD.R1(int):void");
    }

    public void S1() {
        c.h.a.k.d.b.a.d(null);
    }

    public void T1() {
        IMediaPlayer iMediaPlayer = this.f29810k;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f29810k.release();
            this.f29810k = null;
            this.f29807h = 0;
            this.f29808i = 0;
            ((AudioManager) this.R.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    @Override // c.h.a.k.f.m
    public void U(String str) {
    }

    public final int U1(int i2, int i3) {
        return this.I0.Q(String.valueOf(i2), i3);
    }

    public final String V1(int i2) {
        int i3 = i2 / 1000;
        int i4 = i3 % 60;
        int i5 = (i3 / 60) % 60;
        int i6 = i3 / 3600;
        this.E0.setLength(0);
        return (i6 > 0 ? this.F0.format("%d:%02d:%02d", Integer.valueOf(i6), Integer.valueOf(i5), Integer.valueOf(i4)) : this.F0.format("%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4))).toString();
    }

    public int W1() {
        String string;
        Resources resources;
        int i2;
        this.H1++;
        SharedPreferences sharedPreferences = this.j0.getSharedPreferences("loginPrefs", 0);
        this.N = sharedPreferences;
        this.O = sharedPreferences.edit();
        int i3 = this.H1;
        int[] iArr = f29801b;
        int length = i3 % iArr.length;
        this.H1 = length;
        this.I1 = iArr[length];
        if (this.T != null) {
            LinearLayout linearLayout = (LinearLayout) this.j0.findViewById(R.id.ll_aspect_ratio);
            TextView textView = (TextView) this.j0.findViewById(R.id.app_aspect_ratio_text);
            this.T.setAspectRatio(this.I1);
            int i4 = this.H1;
            if (i4 == 0) {
                resources = getResources();
                i2 = R.string.fit_parent;
            } else if (i4 == 1) {
                resources = getResources();
                i2 = R.string.fill_parent;
            } else if (i4 == 2) {
                resources = getResources();
                i2 = R.string.wrap_parent;
            } else if (i4 == 3) {
                resources = getResources();
                i2 = R.string.match_parent;
            } else {
                if (i4 == 4) {
                    string = "16:9";
                } else {
                    if (i4 == 5) {
                        string = "4:3";
                    }
                    this.O.putInt("aspect_ratio", this.H1);
                    this.O.apply();
                    linearLayout.setVisibility(0);
                    this.H.removeCallbacksAndMessages(null);
                    this.H.postDelayed(new m(linearLayout), 3000L);
                }
                textView.setText(string);
                this.O.putInt("aspect_ratio", this.H1);
                this.O.apply();
                linearLayout.setVisibility(0);
                this.H.removeCallbacksAndMessages(null);
                this.H.postDelayed(new m(linearLayout), 3000L);
            }
            string = resources.getString(i2);
            textView.setText(string);
            this.O.putInt("aspect_ratio", this.H1);
            this.O.apply();
            linearLayout.setVisibility(0);
            this.H.removeCallbacksAndMessages(null);
            this.H.postDelayed(new m(linearLayout), 3000L);
        }
        return this.I1;
    }

    public final void X1() {
        if (this.q.a()) {
            this.q.d();
        } else {
            this.q.show();
        }
    }

    @Override // c.h.a.k.f.m
    public void Y(VodInfoCallback vodInfoCallback) {
        List<String> listA = vodInfoCallback.a().a();
        if (listA == null || listA.size() <= 0) {
            return;
        }
        try {
            c.d.a.g.u(this.R.getApplicationContext()).q(listA.get(new Random().nextInt(listA.size()))).J().m(new k());
        } catch (Exception unused) {
        }
    }

    public final void Y1() {
        View viewFindViewById = this.j0.findViewById(R.id.app_video_box);
        this.q0 = viewFindViewById;
        viewFindViewById.setClickable(true);
        this.q0.setOnTouchListener(new t());
    }

    public final void Z1() {
        c0 c0VarB;
        IMediaPlayer iMediaPlayer = this.f29810k;
        if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
            this.r0.b(R.id.exo_pause).a();
            c0VarB = this.r0.b(R.id.exo_play);
        } else {
            this.r0.b(R.id.exo_play).a();
            c0VarB = this.r0.b(R.id.exo_pause);
        }
        c0VarB.h();
    }

    @Override // c.h.a.k.f.b
    public void a() {
    }

    public final void a1() {
        c.h.a.k.d.c.a.b bVar;
        if (this.f29810k == null || (bVar = this.q) == null) {
            return;
        }
        bVar.b(this);
        this.q.c(getParent() instanceof View ? (View) getParent() : this);
        this.q.setEnabled(u1());
    }

    @Override // c.h.a.k.f.b
    public void b() {
    }

    public final void b1(IMediaPlayer iMediaPlayer, c.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
    }

    public final String c1(String str) {
        return TextUtils.isEmpty(str) ? "und" : str;
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

    @SuppressLint({"ResourceType", "InflateParams"})
    public void d(Context context, String str) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.auto_play_popup_layout, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(context);
        this.t1 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.t1.setWidth(-1);
        this.t1.setHeight(-1);
        this.t1.setFocusable(true);
        this.t1.setOutsideTouchable(false);
        ((TextView) viewInflate.findViewById(R.id.tv_episode_title)).setText(str);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.ll_determinate);
        linearLayout.requestFocus();
        this.p1 = (FabButton) viewInflate.findViewById(R.id.determinate);
        this.u1 = (Button) viewInflate.findViewById(R.id.cancel_autoplay);
        this.o1 = (RelativeLayout) viewInflate.findViewById(R.id.rl_next_episode);
        this.s1 = new Handler();
        this.p1.e(false);
        this.q1 = 0;
        this.p1.d(true);
        this.p1.setProgress(this.q1);
        getRunnable();
        this.t1.setOnDismissListener(new z());
        this.u1.setOnClickListener(new a());
        this.p1.setOnClickListener(new b());
        linearLayout.setOnClickListener(new c());
        this.t1.showAtLocation(viewInflate, 1, 0, 0);
    }

    public final String d1(int i2, int i3, int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        if (i4 > 1 || i5 > 1) {
            sb.append("[");
            sb.append(i4);
            sb.append(":");
            sb.append(i5);
            sb.append("]");
        }
        return sb.toString();
    }

    public final String e1(long j2) {
        long j3 = j2 / 1000;
        long j4 = j3 / 3600;
        long j5 = (j3 % 3600) / 60;
        long j6 = j3 % 60;
        return j2 <= 0 ? "--:--" : j4 >= 100 ? String.format(Locale.US, "%d:%02d:%02d", Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)) : j4 > 0 ? String.format(Locale.US, "%02d:%02d:%02d", Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)) : String.format(Locale.US, "%02d:%02d", Long.valueOf(j5), Long.valueOf(j6));
    }

    public final String f1(int i2) {
        return getContext().getString(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? R.string.TrackType_unknown : R.string.TrackType_metadata : R.string.TrackType_subtitle : R.string.TrackType_timedtext : R.string.TrackType_audio : R.string.TrackType_video);
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
    public tv.danmaku.ijk.media.player.IMediaPlayer g1(int r11) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD.g1(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f29810k != null) {
            return this.t;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (u1()) {
            return (int) this.f29810k.getCurrentPosition();
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
        if (u1()) {
            return (int) this.f29810k.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.J);
    }

    public boolean getProgress() {
        return this.g1;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f29810k;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    public void h1(int i2) {
        c.h.a.k.d.c.a.f.b(this.f29810k, i2);
    }

    public final void i1() {
        this.A = -1;
        this.n0 = -1.0f;
        if (this.B >= 0) {
            this.w1.removeMessages(3);
            this.w1.sendEmptyMessage(3);
        }
        this.w1.removeMessages(4);
        this.w1.sendEmptyMessageDelayed(4, 500L);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return u1() && (iMediaPlayer = this.f29810k) != null && iMediaPlayer.isPlaying();
    }

    public void j1() {
        c.h.a.k.d.b.a.d(this.f29810k);
    }

    public void k1(Boolean bool) {
        this.J = bool.booleanValue();
    }

    public void l1(boolean z2) {
        if (z2 || this.C) {
            this.w1.removeMessages(1);
            N1(false);
            this.r0.b(R.id.app_video_top_box).a();
            this.r0.b(R.id.controls).a();
            this.r0.b(R.id.app_video_fullscreen).d();
            this.r0.b(R.id.ll_seekbar_time).a();
            this.C = false;
            p1();
        }
    }

    public final void m1() {
        this.r0.b(R.id.app_video_loading).a();
        this.r0.b(R.id.app_video_status).a();
        N1(false);
        p1();
    }

    public final void n1() {
        Runnable runnable;
        Handler handler = this.s1;
        if (handler != null && (runnable = this.r1) != null) {
            handler.removeCallbacks(runnable);
        }
        PopupWindow popupWindow = this.t1;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        M1(this.F);
    }

    @SuppressLint({"InlinedApi"})
    public void o1() {
        this.k0.setSystemUiVisibility(4871);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z2 = (i2 == 4 || i2 == 24 || i2 == 25 || i2 == 164 || i2 == 82 || i2 == 5 || i2 == 6) ? false : true;
        if (u1() && z2 && this.q != null) {
            if (i2 == 79 || i2 == 85) {
                IMediaPlayer iMediaPlayer = this.f29810k;
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
                IMediaPlayer iMediaPlayer2 = this.f29810k;
                if (iMediaPlayer2 != null && !iMediaPlayer2.isPlaying()) {
                    start();
                    this.q.d();
                }
                return true;
            }
            if (i2 == 86 || i2 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f29810k;
                if (iMediaPlayer3 != null && iMediaPlayer3.isPlaying()) {
                    pause();
                    this.q.show();
                }
                return true;
            }
            X1();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public void p1() {
        this.r0.b(R.id.app_video_top_box).a();
        this.r0.b(R.id.controls).a();
        this.r0.b(R.id.ll_seekbar_time).a();
        this.C = false;
        this.G.removeCallbacksAndMessages(null);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (u1() && (iMediaPlayer = this.f29810k) != null && iMediaPlayer.isPlaying()) {
            this.f29810k.pause();
            this.f29807h = 4;
        }
        this.f29808i = 4;
    }

    public final void q1() {
        boolean zP = this.S.p();
        this.M1 = zP;
        if (zP) {
            c.h.a.k.d.b.a.b(getContext());
            this.f29810k = c.h.a.k.d.b.a.a();
        }
    }

    public final void r1() {
        this.J1.clear();
        if (this.S.s()) {
            this.J1.add(1);
        }
        if (this.S.t() && Build.VERSION.SDK_INT >= 14) {
            this.J1.add(2);
        }
        if (this.S.r()) {
            this.J1.add(0);
        }
        if (this.J1.isEmpty()) {
            this.J1.add(1);
        }
        int iIntValue = this.J1.get(this.K1).intValue();
        this.L1 = iIntValue;
        setRender(iIntValue);
    }

    public final void s1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.R = applicationContext;
        this.S = new c.h.a.k.d.a.a(applicationContext);
        this.n1 = new c.h.a.j.j(this, this.R);
        q1();
        r1();
        this.f29811l = 0;
        this.f29812m = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f29807h = 0;
        this.f29808i = 0;
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

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i2) {
        if (u1()) {
            this.g0 = System.currentTimeMillis();
            this.f29810k.seekTo(i2);
            i2 = 0;
        }
        this.w = i2;
    }

    public void setCurrentPositionSeekbar(int i2) {
        this.e1 = i2;
    }

    public void setCurrentWindowIndex(int i2) {
        this.I = i2;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setListData(String str) {
        d(this.j0, str);
    }

    public void setMediaController(c.h.a.k.d.c.a.b bVar) {
        c.h.a.k.d.c.a.b bVar2 = this.q;
        if (bVar2 != null) {
            bVar2.d();
        }
        this.q = bVar;
        a1();
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
                Log.e(this.f29802c, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i2)));
                return;
            }
            c.h.a.k.d.c.a.i iVar = new c.h.a.k.d.c.a.i(getContext());
            gVar = iVar;
            if (this.f29810k != null) {
                iVar.getSurfaceHolder().b(this.f29810k);
                iVar.a(this.f29810k.getVideoWidth(), this.f29810k.getVideoHeight());
                iVar.b(this.f29810k.getVideoSarNum(), this.f29810k.getVideoSarDen());
                iVar.setAspectRatio(this.I1);
                gVar = iVar;
            }
        }
        setRenderView(gVar);
    }

    public void setRenderView(c.h.a.k.d.c.a.c cVar) {
        int i2;
        int i3;
        if (this.T != null) {
            IMediaPlayer iMediaPlayer = this.f29810k;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.T.getView();
            this.T.e(this.G1);
            this.T = null;
            removeView(view);
        }
        if (cVar == null) {
            return;
        }
        this.T = cVar;
        SharedPreferences sharedPreferences = this.R.getSharedPreferences("loginPrefs", 0);
        this.N = sharedPreferences;
        int i4 = sharedPreferences.getInt("aspect_ratio", 4);
        this.H1 = i4;
        cVar.setAspectRatio(i4);
        int i5 = this.f29811l;
        if (i5 > 0 && (i3 = this.f29812m) > 0) {
            cVar.a(i5, i3);
        }
        int i6 = this.U;
        if (i6 > 0 && (i2 = this.V) > 0) {
            cVar.b(i6, i2);
        }
        View view2 = this.T.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.T.d(this.G1);
        this.T.setVideoRotation(this.p);
    }

    public void setTitle(CharSequence charSequence) {
        this.r0.b(R.id.app_video_title).f(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (u1()) {
            this.f29810k.start();
            this.f29807h = 3;
        }
        this.f29808i = 3;
    }

    public boolean t1() {
        return this.M1;
    }

    public final boolean u1() {
        int i2;
        return (this.f29810k == null || (i2 = this.f29807h) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    public final void v1(float f2) {
        Activity activity = this.j0;
        if (activity != null) {
            if (this.n0 < 0.0f) {
                float f3 = activity.getWindow().getAttributes().screenBrightness;
                this.n0 = f3;
                if (f3 <= 0.0f) {
                    this.n0 = 0.5f;
                } else if (f3 < 0.01f) {
                    this.n0 = 0.01f;
                }
            }
            Log.d(getClass().getSimpleName(), "brightness:" + this.n0 + ",percent:" + f2);
            this.r0.b(R.id.app_video_volume_box).a();
            this.r0.b(R.id.app_video_brightness_box).h();
            WindowManager.LayoutParams attributes = this.j0.getWindow().getAttributes();
            float f4 = this.n0 + f2;
            attributes.screenBrightness = f4;
            if (f4 > 1.0f) {
                attributes.screenBrightness = 1.0f;
            } else if (f4 < 0.01f) {
                attributes.screenBrightness = 0.01f;
            }
            this.r0.b(R.id.app_video_brightness).f(((int) (attributes.screenBrightness * 100.0f)) + "%");
            this.j0.getWindow().setAttributes(attributes);
        }
    }

    public final void w1(float f2) {
        try {
            AudioManager audioManager = this.l0;
            if (audioManager != null) {
                if (this.A == -1) {
                    int streamVolume = audioManager.getStreamVolume(3);
                    this.A = streamVolume;
                    if (streamVolume < 0) {
                        this.A = 0;
                    }
                }
                l1(true);
                int i2 = this.m0;
                int i3 = ((int) (f2 * i2)) + this.A;
                if (i3 <= i2) {
                    i2 = i3 < 0 ? 0 : i3;
                }
                this.l0.setStreamVolume(3, i2, 0);
                double d2 = i2;
                Double.isNaN(d2);
                double d3 = d2 * 1.0d;
                double d4 = this.m0;
                Double.isNaN(d4);
                int i4 = (int) ((d3 / d4) * 100.0d);
                String str = i4 + "%";
                if (i4 == 0) {
                    str = "off";
                }
                this.r0.b(R.id.app_video_volume_icon).c(i4 == 0 ? R.drawable.ic_volume_off_white_36dp : R.drawable.ic_volume_up_white_36dp);
                this.r0.b(R.id.app_video_brightness_box).a();
                this.r0.b(R.id.app_video_volume_box).h();
                this.r0.b(R.id.app_video_volume).f(str).h();
            }
        } catch (Exception unused) {
        }
    }

    @TargetApi(23)
    public void x1() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f29803d == null || this.f29809j == null) {
            return;
        }
        z1(false);
        try {
            ((AudioManager) this.R.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            try {
                try {
                    try {
                        this.f29810k = g1(this.S.x());
                        getContext();
                        this.f29810k.setOnPreparedListener(this.y1);
                        this.f29810k.setOnVideoSizeChangedListener(this.x1);
                        this.f29810k.setOnCompletionListener(this.z1);
                        this.f29810k.setOnErrorListener(this.C1);
                        this.f29810k.setOnInfoListener(this.B1);
                        this.f29810k.setOnBufferingUpdateListener(this.D1);
                        this.f29810k.setOnSeekCompleteListener(this.E1);
                        this.f29810k.setOnTimedTextListener(this.F1);
                        this.t = 0;
                        String scheme = this.f29803d.getScheme();
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 23 && this.S.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                            this.f29810k.setDataSource(new c.h.a.k.d.c.a.a(new File(this.f29803d.toString())));
                        } else if (i2 >= 14) {
                            this.f29810k.setDataSource(this.R, this.f29803d, this.f29805f);
                        } else {
                            this.f29810k.setDataSource(this.f29803d.toString());
                        }
                        b1(this.f29810k, this.f29809j);
                        this.f29810k.setAudioStreamType(3);
                        this.f29810k.setScreenOnWhilePlaying(true);
                        this.W = System.currentTimeMillis();
                        this.f29810k.prepareAsync();
                        this.p0 = this.j0.getResources().getDisplayMetrics().widthPixels;
                        AudioManager audioManager = (AudioManager) this.j0.getSystemService("audio");
                        this.l0 = audioManager;
                        this.m0 = audioManager.getStreamMaxVolume(3);
                        this.o0 = new GestureDetector(this.j0, new b0());
                        Y1();
                        SeekBar seekBar = this.A0;
                        if (seekBar != null) {
                            seekBar.setOnSeekBarChangeListener(this.v1);
                            this.A0.setMax(1000);
                        }
                        this.E0 = new StringBuilder();
                        this.F0 = new Formatter(this.E0, Locale.getDefault());
                        this.f29807h = 1;
                    } catch (Exception e2) {
                        Log.w(this.f29802c, "Unable to open content: " + this.f29803d, e2);
                        this.f29807h = -1;
                        this.f29808i = -1;
                        onErrorListener = this.C1;
                        iMediaPlayer = this.f29810k;
                        onErrorListener.onError(iMediaPlayer, 1, 0);
                    }
                } catch (IllegalArgumentException e3) {
                    Log.w(this.f29802c, "Unable to open content: " + this.f29803d, e3);
                    this.f29807h = -1;
                    this.f29808i = -1;
                    onErrorListener = this.C1;
                    iMediaPlayer = this.f29810k;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (NullPointerException e4) {
                Log.w(this.f29802c, "Unable to open content: " + this.f29803d, e4);
                this.f29807h = -1;
                this.f29808i = -1;
                onErrorListener = this.C1;
                iMediaPlayer = this.f29810k;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (IOException e5) {
            Log.w(this.f29802c, "Unable to open content: " + this.f29803d, e5);
            this.f29807h = -1;
            this.f29808i = -1;
            onErrorListener = this.C1;
            iMediaPlayer = this.f29810k;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    public final void y1() {
        n1();
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.j0.findViewById(R.id.exo_next);
        if (appCompatImageView != null) {
            appCompatImageView.performClick();
        }
    }

    public void z1(boolean z2) {
        IMediaPlayer iMediaPlayer = this.f29810k;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f29810k.release();
            this.f29810k = null;
            this.f29807h = 0;
            if (z2) {
                this.f29808i = 0;
            }
            ((AudioManager) this.R.getSystemService("audio")).abandonAudioFocus(null);
        }
    }
}
