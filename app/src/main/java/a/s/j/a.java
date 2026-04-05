package a.s.j;

import a.i.h.i;
import a.i.h.j;
import a.s.f;
import a.s.g;
import a.s.h;
import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes.dex */
public class a extends j.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f3120e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediaSessionCompat.Token f3121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PendingIntent f3123h;

    @Override // a.i.h.j.g
    public void b(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            iVar.a().setStyle(m(new Notification.MediaStyle()));
        } else if (this.f3122g) {
            iVar.a().setOngoing(true);
        }
    }

    @Override // a.i.h.j.g
    public RemoteViews i(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return n();
    }

    @Override // a.i.h.j.g
    public RemoteViews j(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return o();
    }

    public Notification.MediaStyle m(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f3120e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f3121f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.getToken());
        }
        return mediaStyle;
    }

    public RemoteViews n() {
        int iMin = Math.min(this.f1738a.f1723b.size(), 5);
        RemoteViews remoteViewsC = c(false, q(iMin), false);
        remoteViewsC.removeAllViews(f.f3105d);
        if (iMin > 0) {
            for (int i2 = 0; i2 < iMin; i2++) {
                remoteViewsC.addView(f.f3105d, p(this.f1738a.f1723b.get(i2)));
            }
        }
        if (this.f3122g) {
            int i3 = f.f3103b;
            remoteViewsC.setViewVisibility(i3, 0);
            remoteViewsC.setInt(i3, "setAlpha", this.f1738a.f1722a.getResources().getInteger(g.f3107a));
            remoteViewsC.setOnClickPendingIntent(i3, this.f3123h);
        } else {
            remoteViewsC.setViewVisibility(f.f3103b, 8);
        }
        return remoteViewsC;
    }

    public RemoteViews o() {
        RemoteViews remoteViewsC = c(false, r(), true);
        int size = this.f1738a.f1723b.size();
        int[] iArr = this.f3120e;
        int iMin = iArr == null ? 0 : Math.min(iArr.length, 3);
        remoteViewsC.removeAllViews(f.f3105d);
        if (iMin > 0) {
            for (int i2 = 0; i2 < iMin; i2++) {
                if (i2 >= size) {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i2), Integer.valueOf(size - 1)));
                }
                remoteViewsC.addView(f.f3105d, p(this.f1738a.f1723b.get(this.f3120e[i2])));
            }
        }
        if (this.f3122g) {
            remoteViewsC.setViewVisibility(f.f3104c, 8);
            int i3 = f.f3103b;
            remoteViewsC.setViewVisibility(i3, 0);
            remoteViewsC.setOnClickPendingIntent(i3, this.f3123h);
            remoteViewsC.setInt(i3, "setAlpha", this.f1738a.f1722a.getResources().getInteger(g.f3107a));
        } else {
            remoteViewsC.setViewVisibility(f.f3104c, 0);
            remoteViewsC.setViewVisibility(f.f3103b, 8);
        }
        return remoteViewsC;
    }

    public final RemoteViews p(j.a aVar) {
        boolean z = aVar.a() == null;
        RemoteViews remoteViews = new RemoteViews(this.f1738a.f1722a.getPackageName(), h.f3108a);
        int i2 = f.f3102a;
        remoteViews.setImageViewResource(i2, aVar.e());
        if (!z) {
            remoteViews.setOnClickPendingIntent(i2, aVar.a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(i2, aVar.j());
        }
        return remoteViews;
    }

    public int q(int i2) {
        return i2 <= 3 ? h.f3110c : h.f3109b;
    }

    public int r() {
        return h.f3111d;
    }

    public a s(MediaSessionCompat.Token token) {
        this.f3121f = token;
        return this;
    }

    public a t(int... iArr) {
        this.f3120e = iArr;
        return this;
    }
}
