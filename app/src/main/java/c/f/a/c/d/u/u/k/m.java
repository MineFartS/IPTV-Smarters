package c.f.a.c.d.u.u.k;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import c.f.a.c.d.u.u.i;
import c.f.a.c.j.c.w0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaNotificationService;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f12043a = new c.f.a.c.d.v.b("MediaSessionManager");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.c.d.u.c f12045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.c.j.c.o f12046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ComponentName f12047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f12048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f12049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f12050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f12051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.f.a.c.d.u.u.i f12052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CastDevice f12053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MediaSessionCompat f12054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MediaSessionCompat.Callback f12055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12056n;

    public m(Context context, c.f.a.c.d.u.c cVar, c.f.a.c.j.c.o oVar) {
        this.f12044b = context;
        this.f12045c = cVar;
        this.f12046d = oVar;
        if (cVar.I() == null || TextUtils.isEmpty(cVar.I().I())) {
            this.f12047e = null;
        } else {
            this.f12047e = new ComponentName(context, cVar.I().I());
        }
        b bVar = new b(context);
        this.f12048f = bVar;
        bVar.d(new o(this));
        b bVar2 = new b(context);
        this.f12049g = bVar2;
        bVar2.d(new n(this));
        this.f12050h = new w0(Looper.getMainLooper());
        this.f12051i = new Runnable(this) { // from class: c.f.a.c.d.u.u.k.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final m f12042b;

            {
                this.f12042b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12042b.q();
            }
        };
    }

    public static Bitmap l(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = width;
        int i2 = (int) (((9.0f * f2) / 16.0f) + 0.5f);
        float f3 = (i2 - height) / 2;
        RectF rectF = new RectF(0.0f, f3, f2, height + f3);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i2, config);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return bitmapCreateBitmap;
    }

    @Override // c.f.a.c.d.u.u.i.b
    public final void a() {
        r(false);
    }

    @Override // c.f.a.c.d.u.u.i.b
    public final void b() {
        r(false);
    }

    @Override // c.f.a.c.d.u.u.i.b
    public final void c() {
        r(false);
    }

    @Override // c.f.a.c.d.u.u.i.b
    public final void d() {
        r(false);
    }

    @Override // c.f.a.c.d.u.u.i.b
    public final void e() {
        r(false);
    }

    @Override // c.f.a.c.d.u.u.i.b
    public final void f() {
    }

    public final void h(int i2, MediaInfo mediaInfo) {
        PendingIntent activity;
        MediaSessionCompat mediaSessionCompat = this.f12054l;
        if (mediaSessionCompat == null) {
            return;
        }
        if (i2 == 0) {
            mediaSessionCompat.setPlaybackState(new PlaybackStateCompat.Builder().setState(0, 0L, 1.0f).build());
            this.f12054l.setMetadata(new MediaMetadataCompat.Builder().build());
            return;
        }
        this.f12054l.setPlaybackState(new PlaybackStateCompat.Builder().setState(i2, this.f12052j.r() ? 0L : this.f12052j.l().c0(), 1.0f).setActions(this.f12052j.r() ? 512L : 768L).build());
        MediaSessionCompat mediaSessionCompat2 = this.f12054l;
        if (this.f12047e == null) {
            activity = null;
        } else {
            Intent intent = new Intent();
            intent.setComponent(this.f12047e);
            activity = PendingIntent.getActivity(this.f12044b, 0, intent, 134217728);
        }
        mediaSessionCompat2.setSessionActivity(activity);
        if (this.f12054l != null) {
            c.f.a.c.d.l lVarP = mediaInfo.P();
            this.f12054l.setMetadata(n().putString(MediaMetadataCompat.METADATA_KEY_TITLE, lVarP.K("com.google.android.gms.cast.metadata.TITLE")).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, lVarP.K("com.google.android.gms.cast.metadata.TITLE")).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, lVarP.K("com.google.android.gms.cast.metadata.SUBTITLE")).putLong(MediaMetadataCompat.METADATA_KEY_DURATION, this.f12052j.r() ? 0L : mediaInfo.R()).build());
            Uri uriM = m(lVarP, 0);
            if (uriM != null) {
                this.f12048f.e(uriM);
            } else {
                i(null, 0);
            }
            Uri uriM2 = m(lVarP, 3);
            if (uriM2 != null) {
                this.f12049g.e(uriM2);
            } else {
                i(null, 3);
            }
        }
    }

    public final void i(Bitmap bitmap, int i2) {
        MediaSessionCompat mediaSessionCompat = this.f12054l;
        if (mediaSessionCompat == null) {
            return;
        }
        if (i2 != 0) {
            if (i2 == 3) {
                mediaSessionCompat.setMetadata(n().putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap).build());
            }
        } else {
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmap.eraseColor(0);
                mediaSessionCompat = this.f12054l;
            }
            mediaSessionCompat.setMetadata(n().putBitmap(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap).build());
        }
    }

    public final void j(c.f.a.c.d.u.u.i iVar, CastDevice castDevice) {
        c.f.a.c.d.u.c cVar;
        if (this.f12056n || (cVar = this.f12045c) == null || cVar.I() == null || iVar == null || castDevice == null) {
            return;
        }
        this.f12052j = iVar;
        iVar.b(this);
        this.f12053k = castDevice;
        if (!c.f.a.c.f.t.l.g()) {
            ((AudioManager) this.f12044b.getSystemService("audio")).requestAudioFocus(null, 3, 3);
        }
        ComponentName componentName = new ComponentName(this.f12044b, this.f12045c.I().K());
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f12044b, 0, intent, 0);
        if (this.f12045c.I().L()) {
            this.f12054l = new MediaSessionCompat(this.f12044b, "CastMediaSession", componentName, broadcast);
            h(0, null);
            CastDevice castDevice2 = this.f12053k;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.J())) {
                this.f12054l.setMetadata(new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, this.f12044b.getResources().getString(c.f.a.c.d.u.n.f11885b, this.f12053k.J())).build());
            }
            q qVar = new q(this);
            this.f12055m = qVar;
            this.f12054l.setCallback(qVar);
            this.f12054l.setActive(true);
            this.f12046d.c1(this.f12054l);
        }
        this.f12056n = true;
        r(false);
    }

    public final Uri m(c.f.a.c.d.l lVar, int i2) {
        c.f.a.c.f.p.a aVarA = this.f12045c.I().J() != null ? this.f12045c.I().J().a(lVar, i2) : lVar.M() ? lVar.I().get(0) : null;
        if (aVarA == null) {
            return null;
        }
        return aVarA.J();
    }

    public final MediaMetadataCompat.Builder n() {
        MediaSessionCompat mediaSessionCompat = this.f12054l;
        MediaMetadataCompat metadata = mediaSessionCompat == null ? null : mediaSessionCompat.getController().getMetadata();
        return metadata == null ? new MediaMetadataCompat.Builder() : new MediaMetadataCompat.Builder(metadata);
    }

    public final void o() {
        if (this.f12045c.I().M() == null) {
            return;
        }
        f12043a.a("Stopping notification service.", new Object[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            MediaNotificationService.b();
            return;
        }
        Intent intent = new Intent(this.f12044b, (Class<?>) MediaNotificationService.class);
        intent.setPackage(this.f12044b.getPackageName());
        intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
        this.f12044b.stopService(intent);
    }

    public final void p() {
        if (this.f12045c.J()) {
            this.f12050h.removeCallbacks(this.f12051i);
            Intent intent = new Intent(this.f12044b, (Class<?>) ReconnectionService.class);
            intent.setPackage(this.f12044b.getPackageName());
            this.f12044b.stopService(intent);
        }
    }

    public final /* synthetic */ void q() {
        s(false);
    }

    public final void r(boolean z) {
        boolean z2;
        boolean z3;
        c.f.a.c.d.o oVarI;
        c.f.a.c.d.u.u.i iVar = this.f12052j;
        if (iVar == null) {
            return;
        }
        MediaInfo mediaInfoJ = iVar.j();
        int i2 = 6;
        if (!this.f12052j.q()) {
            if (this.f12052j.u()) {
                i2 = 3;
            } else if (this.f12052j.t()) {
                i2 = 2;
            } else if (!this.f12052j.s() || (oVarI = this.f12052j.i()) == null || oVarI.M() == null) {
                i2 = 0;
            } else {
                mediaInfoJ = oVarI.M();
            }
        }
        if (mediaInfoJ == null || mediaInfoJ.P() == null) {
            i2 = 0;
        }
        h(i2, mediaInfoJ);
        if (!this.f12052j.p()) {
            o();
            p();
            return;
        }
        if (i2 != 0) {
            if (this.f12053k != null && MediaNotificationService.a(this.f12045c)) {
                Intent intent = new Intent(this.f12044b, (Class<?>) MediaNotificationService.class);
                intent.putExtra("extra_media_notification_force_update", z);
                intent.setPackage(this.f12044b.getPackageName());
                intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
                intent.putExtra("extra_media_info", this.f12052j.j());
                intent.putExtra("extra_remote_media_client_player_state", this.f12052j.n());
                intent.putExtra("extra_cast_device", this.f12053k);
                MediaSessionCompat mediaSessionCompat = this.f12054l;
                if (mediaSessionCompat != null) {
                    intent.putExtra("extra_media_session_token", mediaSessionCompat == null ? null : mediaSessionCompat.getSessionToken());
                }
                c.f.a.c.d.q qVarL = this.f12052j.l();
                int iB0 = qVarL.b0();
                if (iB0 == 1 || iB0 == 2 || iB0 == 3) {
                    z2 = true;
                    z3 = true;
                } else {
                    Integer numN = qVarL.N(qVarL.L());
                    if (numN != null) {
                        z3 = numN.intValue() > 0;
                        z2 = numN.intValue() < qVarL.Z() - 1;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                }
                intent.putExtra("extra_can_skip_next", z2);
                intent.putExtra("extra_can_skip_prev", z3);
                f12043a.a("Starting notification service.", new Object[0]);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f12044b.startForegroundService(intent);
                } else {
                    this.f12044b.startService(intent);
                }
            }
            if (this.f12052j.s()) {
                return;
            }
            s(true);
        }
    }

    public final void s(boolean z) {
        if (this.f12045c.J()) {
            this.f12050h.removeCallbacks(this.f12051i);
            Intent intent = new Intent(this.f12044b, (Class<?>) ReconnectionService.class);
            intent.setPackage(this.f12044b.getPackageName());
            try {
                this.f12044b.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.f12050h.postDelayed(this.f12051i, 1000L);
                }
            }
        }
    }

    public final void t(int i2) {
        if (this.f12056n) {
            this.f12056n = false;
            c.f.a.c.d.u.u.i iVar = this.f12052j;
            if (iVar != null) {
                iVar.O(this);
            }
            if (!c.f.a.c.f.t.l.g()) {
                ((AudioManager) this.f12044b.getSystemService("audio")).abandonAudioFocus(null);
            }
            this.f12046d.c1(null);
            b bVar = this.f12048f;
            if (bVar != null) {
                bVar.b();
            }
            b bVar2 = this.f12049g;
            if (bVar2 != null) {
                bVar2.b();
            }
            MediaSessionCompat mediaSessionCompat = this.f12054l;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setSessionActivity(null);
                this.f12054l.setCallback(null);
                this.f12054l.setMetadata(new MediaMetadataCompat.Builder().build());
                h(0, null);
                this.f12054l.setActive(false);
                this.f12054l.release();
                this.f12054l = null;
            }
            this.f12052j = null;
            this.f12053k = null;
            this.f12055m = null;
            o();
            if (i2 == 0) {
                p();
            }
        }
    }
}
