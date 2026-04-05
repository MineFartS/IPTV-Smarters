package a.t.k;

import a.t.l.g;
import a.w.a.b;
import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class d extends a.b.k.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f3260e = Log.isLoggable("MediaRouteCtrlDialog", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f3261f = (int) TimeUnit.SECONDS.toMillis(30);
    public TextView A;
    public boolean B;
    public LinearLayout C;
    public RelativeLayout D;
    public LinearLayout E;
    public View F;
    public OverlayListView G;
    public r H;
    public List<g.C0076g> I;
    public Set<g.C0076g> J;
    public Set<g.C0076g> K;
    public Set<g.C0076g> L;
    public SeekBar M;
    public q N;
    public g.C0076g O;
    public int P;
    public int Q;
    public int R;
    public final int S;
    public Map<g.C0076g, SeekBar> T;
    public MediaControllerCompat U;
    public o V;
    public PlaybackStateCompat W;
    public MediaDescriptionCompat X;
    public n Y;
    public Bitmap Z;
    public Uri f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a.t.l.g f3262g;
    public boolean g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f3263h;
    public Bitmap h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g.C0076g f3264i;
    public int i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f3265j;
    public boolean j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3266k;
    public boolean k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3267l;
    public boolean l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3268m;
    public boolean m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f3269n;
    public boolean n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f3270o;
    public int o0;
    public Button p;
    public int p0;
    public ImageButton q;
    public int q0;
    public ImageButton r;
    public Interpolator r0;
    public MediaRouteExpandCollapseButton s;
    public Interpolator s0;
    public FrameLayout t;
    public Interpolator t0;
    public LinearLayout u;
    public Interpolator u0;
    public FrameLayout v;
    public final AccessibilityManager v0;
    public FrameLayout w;
    public Runnable w0;
    public ImageView x;
    public TextView y;
    public TextView z;

    public class a implements OverlayListView.a.InterfaceC0094a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g.C0076g f3271a;

        public a(g.C0076g c0076g) {
            this.f3271a = c0076g;
        }

        @Override // androidx.mediarouter.app.OverlayListView.a.InterfaceC0094a
        public void a() {
            d.this.L.remove(this.f3271a);
            d.this.H.notifyDataSetChanged();
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d.this.G.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            d.this.H();
        }
    }

    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d.this.q(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: a.t.k.d$d, reason: collision with other inner class name */
    public class RunnableC0071d implements Runnable {
        public RunnableC0071d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.G();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PendingIntent sessionActivity;
            MediaControllerCompat mediaControllerCompat = d.this.U;
            if (mediaControllerCompat == null || (sessionActivity = mediaControllerCompat.getSessionActivity()) == null) {
                return;
            }
            try {
                sessionActivity.send();
                d.this.dismiss();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
            }
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            boolean z = !dVar.l0;
            dVar.l0 = z;
            if (z) {
                dVar.G.setVisibility(0);
            }
            d.this.B();
            d.this.L(true);
        }
    }

    public class i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f3280b;

        public i(boolean z) {
            this.f3280b = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d.this.v.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            d dVar = d.this;
            if (dVar.m0) {
                dVar.n0 = true;
            } else {
                dVar.M(this.f3280b);
            }
        }
    }

    public class j extends Animation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f3282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f3283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f3284d;

        public j(int i2, int i3, View view) {
            this.f3282b = i2;
            this.f3283c = i3;
            this.f3284d = view;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f2, Transformation transformation) {
            d.E(this.f3284d, this.f3282b - ((int) ((r3 - this.f3283c) * f2)));
        }
    }

    public class k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f3286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f3287c;

        public k(Map map, Map map2) {
            this.f3286b = map;
            this.f3287c = map2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d.this.G.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            d.this.i(this.f3286b, this.f3287c);
        }
    }

    public class l implements Animation.AnimationListener {
        public l() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            d.this.G.b();
            d dVar = d.this;
            dVar.G.postDelayed(dVar.w0, dVar.o0);
        }
    }

    public final class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            int id = view.getId();
            if (id == 16908313 || id == 16908314) {
                if (d.this.f3264i.w()) {
                    d.this.f3262g.n(id == 16908313 ? 2 : 1);
                }
            } else {
                if (id == a.t.d.v) {
                    d dVar = d.this;
                    if (dVar.U == null || (playbackStateCompat = dVar.W) == null) {
                        return;
                    }
                    int i2 = 0;
                    int i3 = playbackStateCompat.getState() != 3 ? 0 : 1;
                    if (i3 != 0 && d.this.x()) {
                        d.this.U.getTransportControls().pause();
                        i2 = a.t.h.f3184l;
                    } else if (i3 != 0 && d.this.z()) {
                        d.this.U.getTransportControls().stop();
                        i2 = a.t.h.f3186n;
                    } else if (i3 == 0 && d.this.y()) {
                        d.this.U.getTransportControls().play();
                        i2 = a.t.h.f3185m;
                    }
                    AccessibilityManager accessibilityManager = d.this.v0;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled() || i2 == 0) {
                        return;
                    }
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
                    accessibilityEventObtain.setPackageName(d.this.f3265j.getPackageName());
                    accessibilityEventObtain.setClassName(m.class.getName());
                    accessibilityEventObtain.getText().add(d.this.f3265j.getString(i2));
                    d.this.v0.sendAccessibilityEvent(accessibilityEventObtain);
                    return;
                }
                if (id != a.t.d.t) {
                    return;
                }
            }
            d.this.dismiss();
        }
    }

    public class n extends AsyncTask<Void, Void, Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f3291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f3292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f3294d;

        public n() {
            MediaDescriptionCompat mediaDescriptionCompat = d.this.X;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            if (d.v(iconBitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                iconBitmap = null;
            }
            this.f3291a = iconBitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = d.this.X;
            this.f3292b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStreamE;
            Bitmap bitmap = this.f3291a;
            ?? r4 = 0;
            if (bitmap == null) {
                Uri uri = this.f3292b;
                try {
                    if (uri != null) {
                        try {
                            inputStreamE = e(uri);
                        } catch (IOException e2) {
                            e = e2;
                            inputStreamE = null;
                        } catch (Throwable th) {
                            th = th;
                            if (r4 != 0) {
                                try {
                                    r4.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                        try {
                            if (inputStreamE == null) {
                                Log.w("MediaRouteCtrlDialog", "Unable to open: " + this.f3292b);
                                if (inputStreamE != null) {
                                    try {
                                        inputStreamE.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                return null;
                            }
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeStream(inputStreamE, null, options);
                            if (options.outWidth == 0 || options.outHeight == 0) {
                                try {
                                    inputStreamE.close();
                                } catch (IOException unused3) {
                                }
                                return null;
                            }
                            try {
                                inputStreamE.reset();
                            } catch (IOException unused4) {
                                inputStreamE.close();
                                inputStreamE = e(this.f3292b);
                                if (inputStreamE == null) {
                                    Log.w("MediaRouteCtrlDialog", "Unable to open: " + this.f3292b);
                                    if (inputStreamE != null) {
                                        try {
                                            inputStreamE.close();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                    return null;
                                }
                            }
                            options.inJustDecodeBounds = false;
                            options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / d.this.r(options.outWidth, options.outHeight)));
                            if (isCancelled()) {
                                try {
                                    inputStreamE.close();
                                } catch (IOException unused6) {
                                }
                                return null;
                            }
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamE, null, options);
                            try {
                                inputStreamE.close();
                            } catch (IOException unused7) {
                            }
                            bitmap = bitmapDecodeStream;
                        } catch (IOException e3) {
                            e = e3;
                            Log.w("MediaRouteCtrlDialog", "Unable to open: " + this.f3292b, e);
                            if (inputStreamE != null) {
                                try {
                                    inputStreamE.close();
                                } catch (IOException unused8) {
                                }
                            }
                            bitmap = null;
                        }
                    } else {
                        bitmap = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r4 = uri;
                }
            }
            if (d.v(bitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't use recycled bitmap: " + bitmap);
                return null;
            }
            if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
                a.w.a.b bVarA = new b.C0087b(bitmap).c(1).a();
                this.f3293c = bVarA.f().isEmpty() ? 0 : bVarA.f().get(0).e();
            }
            return bitmap;
        }

        public Bitmap b() {
            return this.f3291a;
        }

        public Uri c() {
            return this.f3292b;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            d dVar = d.this;
            dVar.Y = null;
            if (a.i.q.d.a(dVar.Z, this.f3291a) && a.i.q.d.a(d.this.f0, this.f3292b)) {
                return;
            }
            d dVar2 = d.this;
            dVar2.Z = this.f3291a;
            dVar2.h0 = bitmap;
            dVar2.f0 = this.f3292b;
            dVar2.i0 = this.f3293c;
            dVar2.g0 = true;
            d.this.I(SystemClock.uptimeMillis() - this.f3294d > 120);
        }

        public final InputStream e(Uri uri) throws IOException {
            InputStream inputStreamOpenInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || TransferTable.COLUMN_FILE.equals(lowerCase)) {
                inputStreamOpenInputStream = d.this.f3265j.getContentResolver().openInputStream(uri);
            } else {
                URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
                int i2 = d.f3261f;
                uRLConnectionOpenConnection.setConnectTimeout(i2);
                uRLConnectionOpenConnection.setReadTimeout(i2);
                inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
            }
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStreamOpenInputStream);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            this.f3294d = SystemClock.uptimeMillis();
            d.this.n();
        }
    }

    public final class o extends MediaControllerCompat.Callback {
        public o() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            d.this.X = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            d.this.J();
            d.this.I(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            d dVar = d.this;
            dVar.W = playbackStateCompat;
            dVar.I(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            d dVar = d.this;
            MediaControllerCompat mediaControllerCompat = dVar.U;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(dVar.V);
                d.this.U = null;
            }
        }
    }

    public final class p extends g.a {
        public p() {
        }

        @Override // a.t.l.g.a
        public void e(a.t.l.g gVar, g.C0076g c0076g) {
            d.this.I(true);
        }

        @Override // a.t.l.g.a
        public void i(a.t.l.g gVar, g.C0076g c0076g) {
            d.this.I(false);
        }

        @Override // a.t.l.g.a
        public void k(a.t.l.g gVar, g.C0076g c0076g) {
            SeekBar seekBar = d.this.T.get(c0076g);
            int iO = c0076g.o();
            if (d.f3260e) {
                Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + iO);
            }
            if (seekBar == null || d.this.O == c0076g) {
                return;
            }
            seekBar.setProgress(iO);
        }
    }

    public class q implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f3298b = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                if (dVar.O != null) {
                    dVar.O = null;
                    if (dVar.j0) {
                        dVar.I(dVar.k0);
                    }
                }
            }
        }

        public q() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            if (z) {
                g.C0076g c0076g = (g.C0076g) seekBar.getTag();
                if (d.f3260e) {
                    Log.d("MediaRouteCtrlDialog", "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i2 + ")");
                }
                c0076g.A(i2);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            d dVar = d.this;
            if (dVar.O != null) {
                dVar.M.removeCallbacks(this.f3298b);
            }
            d.this.O = (g.C0076g) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            d.this.M.postDelayed(this.f3298b, 500L);
        }
    }

    public class r extends ArrayAdapter<g.C0076g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f3301b;

        public r(Context context, List<g.C0076g> list) {
            super(context, 0, list);
            this.f3301b = a.t.k.i.g(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(a.t.g.f3169h, viewGroup, false);
            } else {
                d.this.R(view);
            }
            g.C0076g item = getItem(i2);
            if (item != null) {
                boolean zU = item.u();
                TextView textView = (TextView) view.findViewById(a.t.d.I);
                textView.setEnabled(zU);
                textView.setText(item.i());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(a.t.d.R);
                a.t.k.i.q(viewGroup.getContext(), mediaRouteVolumeSlider, d.this.G);
                mediaRouteVolumeSlider.setTag(item);
                d.this.T.put(item, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.b(!zU);
                mediaRouteVolumeSlider.setEnabled(zU);
                if (zU) {
                    if (d.this.A(item)) {
                        mediaRouteVolumeSlider.setMax(item.q());
                        mediaRouteVolumeSlider.setProgress(item.o());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(d.this.N);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(a.t.d.Q)).setAlpha(zU ? 255 : (int) (this.f3301b * 255.0f));
                ((LinearLayout) view.findViewById(a.t.d.S)).setVisibility(d.this.L.contains(item) ? 4 : 0);
                Set<g.C0076g> set = d.this.J;
                if (set != null && set.contains(item)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            return false;
        }
    }

    public d(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context, int i2) {
        Context contextB = a.t.k.i.b(context, i2, true);
        super(contextB, a.t.k.i.c(contextB));
        this.B = true;
        this.w0 = new RunnableC0071d();
        this.f3265j = getContext();
        this.V = new o();
        a.t.l.g gVarF = a.t.l.g.f(this.f3265j);
        this.f3262g = gVarF;
        this.f3263h = new p();
        this.f3264i = gVarF.i();
        F(gVarF.g());
        this.S = this.f3265j.getResources().getDimensionPixelSize(a.t.b.f3136d);
        this.v0 = (AccessibilityManager) this.f3265j.getSystemService("accessibility");
        if (Build.VERSION.SDK_INT >= 21) {
            this.s0 = AnimationUtils.loadInterpolator(contextB, a.t.f.f3161b);
            this.t0 = AnimationUtils.loadInterpolator(contextB, a.t.f.f3160a);
        }
        this.u0 = new AccelerateDecelerateInterpolator();
    }

    public static void E(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static boolean S(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    public static int t(View view) {
        return view.getLayoutParams().height;
    }

    public static boolean v(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    public boolean A(g.C0076g c0076g) {
        return this.B && c0076g.p() == 1;
    }

    public void B() {
        this.r0 = Build.VERSION.SDK_INT >= 21 ? this.l0 ? this.s0 : this.t0 : this.u0;
    }

    public View C(Bundle bundle) {
        return null;
    }

    public final void D(boolean z) {
        List<g.C0076g> listF = s() == null ? null : s().F();
        if (listF == null) {
            this.I.clear();
        } else if (!a.t.k.h.g(this.I, listF)) {
            HashMap mapC = z ? a.t.k.h.c(this.G, this.H) : null;
            HashMap mapB = z ? a.t.k.h.b(this.f3265j, this.G, this.H) : null;
            this.J = a.t.k.h.d(this.I, listF);
            this.K = a.t.k.h.e(this.I, listF);
            this.I.addAll(0, this.J);
            this.I.removeAll(this.K);
            this.H.notifyDataSetChanged();
            if (z && this.l0 && this.J.size() + this.K.size() > 0) {
                h(mapC, mapB);
                return;
            } else {
                this.J = null;
                this.K = null;
                return;
            }
        }
        this.H.notifyDataSetChanged();
    }

    public final void F(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.U;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.V);
            this.U = null;
        }
        if (token != null && this.f3267l) {
            try {
                this.U = new MediaControllerCompat(this.f3265j, token);
            } catch (RemoteException e2) {
                Log.e("MediaRouteCtrlDialog", "Error creating media controller in setMediaSession.", e2);
            }
            MediaControllerCompat mediaControllerCompat2 = this.U;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.registerCallback(this.V);
            }
            MediaControllerCompat mediaControllerCompat3 = this.U;
            MediaMetadataCompat metadata = mediaControllerCompat3 == null ? null : mediaControllerCompat3.getMetadata();
            this.X = metadata == null ? null : metadata.getDescription();
            MediaControllerCompat mediaControllerCompat4 = this.U;
            this.W = mediaControllerCompat4 != null ? mediaControllerCompat4.getPlaybackState() : null;
            J();
            I(false);
        }
    }

    public void G() {
        m(true);
        this.G.requestLayout();
        this.G.getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }

    public void H() {
        Set<g.C0076g> set = this.J;
        if (set == null || set.size() == 0) {
            q(true);
        } else {
            p();
        }
    }

    public void I(boolean z) {
        if (this.O != null) {
            this.j0 = true;
            this.k0 = z | this.k0;
            return;
        }
        this.j0 = false;
        this.k0 = false;
        if (!this.f3264i.w() || this.f3264i.t()) {
            dismiss();
            return;
        }
        if (this.f3266k) {
            this.A.setText(this.f3264i.i());
            this.f3270o.setVisibility(this.f3264i.a() ? 0 : 8);
            if (this.f3269n == null && this.g0) {
                if (v(this.h0)) {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.h0);
                } else {
                    this.x.setImageBitmap(this.h0);
                    this.x.setBackgroundColor(this.i0);
                }
                n();
            }
            Q();
            P();
            L(z);
        }
    }

    public void J() {
        if (this.f3269n == null && w()) {
            n nVar = this.Y;
            if (nVar != null) {
                nVar.cancel(true);
            }
            n nVar2 = new n();
            this.Y = nVar2;
            nVar2.execute(new Void[0]);
        }
    }

    public void K() {
        int iA = a.t.k.h.a(this.f3265j);
        getWindow().setLayout(iA, -2);
        View decorView = getWindow().getDecorView();
        this.f3268m = (iA - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.f3265j.getResources();
        this.P = resources.getDimensionPixelSize(a.t.b.f3134b);
        this.Q = resources.getDimensionPixelSize(a.t.b.f3133a);
        this.R = resources.getDimensionPixelSize(a.t.b.f3135c);
        this.Z = null;
        this.f0 = null;
        J();
        I(false);
    }

    public void L(boolean z) {
        this.v.requestLayout();
        this.v.getViewTreeObserver().addOnGlobalLayoutListener(new i(z));
    }

    public void M(boolean z) {
        int iR;
        Bitmap bitmap;
        int iT = t(this.C);
        E(this.C, -1);
        O(l());
        View decorView = getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 1073741824), 0);
        E(this.C, iT);
        if (this.f3269n == null && (this.x.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) this.x.getDrawable()).getBitmap()) != null) {
            iR = r(bitmap.getWidth(), bitmap.getHeight());
            this.x.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        } else {
            iR = 0;
        }
        int iU = u(l());
        int size = this.I.size();
        int size2 = s() == null ? 0 : this.Q * s().F().size();
        if (size > 0) {
            size2 += this.S;
        }
        int iMin = Math.min(size2, this.R);
        if (!this.l0) {
            iMin = 0;
        }
        int iMax = Math.max(iR, iMin) + iU;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - (this.u.getMeasuredHeight() - this.v.getMeasuredHeight());
        if (this.f3269n != null || iR <= 0 || iMax > iHeight) {
            if (t(this.G) + this.C.getMeasuredHeight() >= this.v.getMeasuredHeight()) {
                this.x.setVisibility(8);
            }
            iMax = iMin + iU;
            iR = 0;
        } else {
            this.x.setVisibility(0);
            E(this.x, iR);
        }
        if (!l() || iMax > iHeight) {
            this.D.setVisibility(8);
        } else {
            this.D.setVisibility(0);
        }
        O(this.D.getVisibility() == 0);
        int iU2 = u(this.D.getVisibility() == 0);
        int iMax2 = Math.max(iR, iMin) + iU2;
        if (iMax2 > iHeight) {
            iMin -= iMax2 - iHeight;
        } else {
            iHeight = iMax2;
        }
        this.C.clearAnimation();
        this.G.clearAnimation();
        this.v.clearAnimation();
        LinearLayout linearLayout = this.C;
        if (z) {
            k(linearLayout, iU2);
            k(this.G, iMin);
            k(this.v, iHeight);
        } else {
            E(linearLayout, iU2);
            E(this.G, iMin);
            E(this.v, iHeight);
        }
        E(this.t, rect.height());
        D(z);
    }

    public final void O(boolean z) {
        int i2 = 0;
        this.F.setVisibility((this.E.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.C;
        if (this.E.getVisibility() == 8 && !z) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.t.k.d.P():void");
    }

    public final void Q() {
        if (!A(this.f3264i)) {
            this.E.setVisibility(8);
        } else if (this.E.getVisibility() == 8) {
            this.E.setVisibility(0);
            this.M.setMax(this.f3264i.q());
            this.M.setProgress(this.f3264i.o());
            this.s.setVisibility(s() != null ? 0 : 8);
        }
    }

    public void R(View view) {
        E((LinearLayout) view.findViewById(a.t.d.S), this.Q);
        View viewFindViewById = view.findViewById(a.t.d.Q);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        int i2 = this.P;
        layoutParams.width = i2;
        layoutParams.height = i2;
        viewFindViewById.setLayoutParams(layoutParams);
    }

    public final void h(Map<g.C0076g, Rect> map, Map<g.C0076g, BitmapDrawable> map2) {
        this.G.setEnabled(false);
        this.G.requestLayout();
        this.m0 = true;
        this.G.getViewTreeObserver().addOnGlobalLayoutListener(new k(map, map2));
    }

    public void i(Map<g.C0076g, Rect> map, Map<g.C0076g, BitmapDrawable> map2) {
        OverlayListView.a aVarD;
        Set<g.C0076g> set = this.J;
        if (set == null || this.K == null) {
            return;
        }
        int size = set.size() - this.K.size();
        l lVar = new l();
        int firstVisiblePosition = this.G.getFirstVisiblePosition();
        boolean z = false;
        for (int i2 = 0; i2 < this.G.getChildCount(); i2++) {
            View childAt = this.G.getChildAt(i2);
            g.C0076g item = this.H.getItem(firstVisiblePosition + i2);
            Rect rect = map.get(item);
            int top = childAt.getTop();
            int i3 = rect != null ? rect.top : (this.Q * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            Set<g.C0076g> set2 = this.J;
            if (set2 != null && set2.contains(item)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(this.p0);
                animationSet.addAnimation(alphaAnimation);
                i3 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i3 - top, 0.0f);
            translateAnimation.setDuration(this.o0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(this.r0);
            if (!z) {
                animationSet.setAnimationListener(lVar);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(item);
            map2.remove(item);
        }
        for (Map.Entry<g.C0076g, BitmapDrawable> entry : map2.entrySet()) {
            g.C0076g key = entry.getKey();
            BitmapDrawable value = entry.getValue();
            Rect rect2 = map.get(key);
            if (this.K.contains(key)) {
                aVarD = new OverlayListView.a(value, rect2).c(1.0f, 0.0f).e(this.q0).f(this.r0);
            } else {
                aVarD = new OverlayListView.a(value, rect2).g(this.Q * size).e(this.o0).f(this.r0).d(new a(key));
                this.L.add(key);
            }
            this.G.a(aVarD);
        }
    }

    public final void k(View view, int i2) {
        j jVar = new j(t(view), i2, view);
        jVar.setDuration(this.o0);
        if (Build.VERSION.SDK_INT >= 21) {
            jVar.setInterpolator(this.r0);
        }
        view.startAnimation(jVar);
    }

    public final boolean l() {
        return this.f3269n == null && !(this.X == null && this.W == null);
    }

    public void m(boolean z) {
        Set<g.C0076g> set;
        int firstVisiblePosition = this.G.getFirstVisiblePosition();
        for (int i2 = 0; i2 < this.G.getChildCount(); i2++) {
            View childAt = this.G.getChildAt(i2);
            g.C0076g item = this.H.getItem(firstVisiblePosition + i2);
            if (!z || (set = this.J) == null || !set.contains(item)) {
                ((LinearLayout) childAt.findViewById(a.t.d.S)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.G.c();
        if (z) {
            return;
        }
        q(false);
    }

    public void n() {
        this.g0 = false;
        this.h0 = null;
        this.i0 = 0;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3267l = true;
        this.f3262g.b(a.t.l.f.f3357a, this.f3263h, 2);
        F(this.f3262g.g());
    }

    @Override // a.b.k.b, a.b.k.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setContentView(a.t.g.f3168g);
        findViewById(R.id.button3).setVisibility(8);
        m mVar = new m();
        FrameLayout frameLayout = (FrameLayout) findViewById(a.t.d.D);
        this.t = frameLayout;
        frameLayout.setOnClickListener(new e());
        LinearLayout linearLayout = (LinearLayout) findViewById(a.t.d.B);
        this.u = linearLayout;
        linearLayout.setOnClickListener(new f());
        int iD = a.t.k.i.d(this.f3265j);
        Button button = (Button) findViewById(R.id.button2);
        this.f3270o = button;
        button.setText(a.t.h.f3180h);
        this.f3270o.setTextColor(iD);
        this.f3270o.setOnClickListener(mVar);
        Button button2 = (Button) findViewById(R.id.button1);
        this.p = button2;
        button2.setText(a.t.h.f3187o);
        this.p.setTextColor(iD);
        this.p.setOnClickListener(mVar);
        this.A = (TextView) findViewById(a.t.d.I);
        ImageButton imageButton = (ImageButton) findViewById(a.t.d.t);
        this.r = imageButton;
        imageButton.setOnClickListener(mVar);
        this.w = (FrameLayout) findViewById(a.t.d.z);
        this.v = (FrameLayout) findViewById(a.t.d.A);
        g gVar = new g();
        ImageView imageView = (ImageView) findViewById(a.t.d.f3141a);
        this.x = imageView;
        imageView.setOnClickListener(gVar);
        findViewById(a.t.d.y).setOnClickListener(gVar);
        this.C = (LinearLayout) findViewById(a.t.d.H);
        this.F = findViewById(a.t.d.u);
        this.D = (RelativeLayout) findViewById(a.t.d.N);
        this.y = (TextView) findViewById(a.t.d.x);
        this.z = (TextView) findViewById(a.t.d.w);
        ImageButton imageButton2 = (ImageButton) findViewById(a.t.d.v);
        this.q = imageButton2;
        imageButton2.setOnClickListener(mVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(a.t.d.O);
        this.E = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(a.t.d.R);
        this.M = seekBar;
        seekBar.setTag(this.f3264i);
        q qVar = new q();
        this.N = qVar;
        this.M.setOnSeekBarChangeListener(qVar);
        this.G = (OverlayListView) findViewById(a.t.d.P);
        this.I = new ArrayList();
        r rVar = new r(this.G.getContext(), this.I);
        this.H = rVar;
        this.G.setAdapter((ListAdapter) rVar);
        this.L = new HashSet();
        a.t.k.i.p(this.f3265j, this.C, this.G, s() != null);
        a.t.k.i.q(this.f3265j, (MediaRouteVolumeSlider) this.M, this.C);
        HashMap map = new HashMap();
        this.T = map;
        map.put(this.f3264i, this.M);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(a.t.d.E);
        this.s = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new h());
        B();
        this.o0 = this.f3265j.getResources().getInteger(a.t.e.f3156a);
        this.p0 = this.f3265j.getResources().getInteger(a.t.e.f3157b);
        this.q0 = this.f3265j.getResources().getInteger(a.t.e.f3158c);
        View viewC = C(bundle);
        this.f3269n = viewC;
        if (viewC != null) {
            this.w.addView(viewC);
            this.w.setVisibility(0);
        }
        this.f3266k = true;
        K();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f3262g.k(this.f3263h);
        F(null);
        this.f3267l = false;
        super.onDetachedFromWindow();
    }

    @Override // a.b.k.b, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 25 && i2 != 24) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.f3264i.B(i2 == 25 ? -1 : 1);
        return true;
    }

    @Override // a.b.k.b, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 25 || i2 == 24) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public final void p() {
        c cVar = new c();
        int firstVisiblePosition = this.G.getFirstVisiblePosition();
        boolean z = false;
        for (int i2 = 0; i2 < this.G.getChildCount(); i2++) {
            View childAt = this.G.getChildAt(i2);
            if (this.J.contains(this.H.getItem(firstVisiblePosition + i2))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(this.p0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(cVar);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    public void q(boolean z) {
        this.J = null;
        this.K = null;
        this.m0 = false;
        if (this.n0) {
            this.n0 = false;
            L(z);
        }
        this.G.setEnabled(true);
    }

    public int r(int i2, int i3) {
        return i2 >= i3 ? (int) (((this.f3268m * i3) / i2) + 0.5f) : (int) (((this.f3268m * 9.0f) / 16.0f) + 0.5f);
    }

    public final g.f s() {
        g.C0076g c0076g = this.f3264i;
        if (c0076g instanceof g.f) {
            return (g.f) c0076g;
        }
        return null;
    }

    public final int u(boolean z) {
        if (!z && this.E.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = 0 + this.C.getPaddingTop() + this.C.getPaddingBottom();
        if (z) {
            paddingTop += this.D.getMeasuredHeight();
        }
        if (this.E.getVisibility() == 0) {
            paddingTop += this.E.getMeasuredHeight();
        }
        return (z && this.E.getVisibility() == 0) ? paddingTop + this.F.getMeasuredHeight() : paddingTop;
    }

    public final boolean w() {
        MediaDescriptionCompat mediaDescriptionCompat = this.X;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.X;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        n nVar = this.Y;
        Bitmap bitmapB = nVar == null ? this.Z : nVar.b();
        n nVar2 = this.Y;
        Uri uriC = nVar2 == null ? this.f0 : nVar2.c();
        if (bitmapB != iconBitmap) {
            return true;
        }
        return bitmapB == null && !S(uriC, iconUri);
    }

    public boolean x() {
        return (this.W.getActions() & 514) != 0;
    }

    public boolean y() {
        return (this.W.getActions() & 516) != 0;
    }

    public boolean z() {
        return (this.W.getActions() & 1) != 0;
    }
}
