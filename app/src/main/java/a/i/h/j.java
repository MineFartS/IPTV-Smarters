package a.i.h;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class j {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f1698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f1699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n[] f1700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n[] f1701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f1704g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f1705h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f1706i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f1707j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f1708k;

        /* JADX INFO: renamed from: a.i.h.j$a$a, reason: collision with other inner class name */
        public static final class C0029a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IconCompat f1709a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CharSequence f1710b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final PendingIntent f1711c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f1712d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Bundle f1713e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public ArrayList<n> f1714f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f1715g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f1716h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f1717i;

            public C0029a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i2 != 0 ? IconCompat.f(null, BuildConfig.FLAVOR, i2) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
            }

            public C0029a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, n[] nVarArr, boolean z, int i2, boolean z2, boolean z3) {
                this.f1712d = true;
                this.f1716h = true;
                this.f1709a = iconCompat;
                this.f1710b = e.h(charSequence);
                this.f1711c = pendingIntent;
                this.f1713e = bundle;
                this.f1714f = nVarArr == null ? null : new ArrayList<>(Arrays.asList(nVarArr));
                this.f1712d = z;
                this.f1715g = i2;
                this.f1716h = z2;
                this.f1717i = z3;
            }

            public a a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<n> arrayList3 = this.f1714f;
                if (arrayList3 != null) {
                    for (n nVar : arrayList3) {
                        if (nVar.j()) {
                            arrayList.add(nVar);
                        } else {
                            arrayList2.add(nVar);
                        }
                    }
                }
                n[] nVarArr = arrayList.isEmpty() ? null : (n[]) arrayList.toArray(new n[arrayList.size()]);
                return new a(this.f1709a, this.f1710b, this.f1711c, this.f1713e, arrayList2.isEmpty() ? null : (n[]) arrayList2.toArray(new n[arrayList2.size()]), nVarArr, this.f1712d, this.f1715g, this.f1716h, this.f1717i);
            }

            public final void b() {
                if (this.f1717i && this.f1711c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }
        }

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.f(null, BuildConfig.FLAVOR, i2) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, n[] nVarArr, n[] nVarArr2, boolean z, int i2, boolean z2, boolean z3) {
            this.f1703f = true;
            this.f1699b = iconCompat;
            if (iconCompat != null && iconCompat.m() == 2) {
                this.f1706i = iconCompat.h();
            }
            this.f1707j = e.h(charSequence);
            this.f1708k = pendingIntent;
            this.f1698a = bundle == null ? new Bundle() : bundle;
            this.f1700c = nVarArr;
            this.f1701d = nVarArr2;
            this.f1702e = z;
            this.f1704g = i2;
            this.f1703f = z2;
            this.f1705h = z3;
        }

        public PendingIntent a() {
            return this.f1708k;
        }

        public boolean b() {
            return this.f1702e;
        }

        public n[] c() {
            return this.f1701d;
        }

        public Bundle d() {
            return this.f1698a;
        }

        @Deprecated
        public int e() {
            return this.f1706i;
        }

        public IconCompat f() {
            int i2;
            if (this.f1699b == null && (i2 = this.f1706i) != 0) {
                this.f1699b = IconCompat.f(null, BuildConfig.FLAVOR, i2);
            }
            return this.f1699b;
        }

        public n[] g() {
            return this.f1700c;
        }

        public int h() {
            return this.f1704g;
        }

        public boolean i() {
            return this.f1703f;
        }

        public CharSequence j() {
            return this.f1707j;
        }

        public boolean k() {
            return this.f1705h;
        }
    }

    public static class b extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bitmap f1718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public IconCompat f1719f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1720g;

        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* JADX INFO: renamed from: a.i.h.j$b$b, reason: collision with other inner class name */
        public static class C0030b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // a.i.h.j.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(a.i.h.i r6) {
            /*
                r5 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 < r1) goto L59
                android.app.Notification$BigPictureStyle r1 = new android.app.Notification$BigPictureStyle
                android.app.Notification$Builder r2 = r6.a()
                r1.<init>(r2)
                java.lang.CharSequence r2 = r5.f1739b
                android.app.Notification$BigPictureStyle r1 = r1.setBigContentTitle(r2)
                android.graphics.Bitmap r2 = r5.f1718e
                android.app.Notification$BigPictureStyle r1 = r1.bigPicture(r2)
                boolean r2 = r5.f1720g
                if (r2 == 0) goto L50
                androidx.core.graphics.drawable.IconCompat r2 = r5.f1719f
                r3 = 0
                if (r2 != 0) goto L28
            L24:
                a.i.h.j.b.a.a(r1, r3)
                goto L50
            L28:
                r4 = 23
                if (r0 < r4) goto L40
                boolean r0 = r6 instanceof a.i.h.k
                if (r0 == 0) goto L36
                a.i.h.k r6 = (a.i.h.k) r6
                android.content.Context r3 = r6.f()
            L36:
                androidx.core.graphics.drawable.IconCompat r6 = r5.f1719f
                android.graphics.drawable.Icon r6 = r6.w(r3)
                a.i.h.j.b.C0030b.a(r1, r6)
                goto L50
            L40:
                int r6 = r2.m()
                r0 = 1
                if (r6 != r0) goto L24
                androidx.core.graphics.drawable.IconCompat r6 = r5.f1719f
                android.graphics.Bitmap r6 = r6.g()
                a.i.h.j.b.a.a(r1, r6)
            L50:
                boolean r6 = r5.f1741d
                if (r6 == 0) goto L59
                java.lang.CharSequence r6 = r5.f1740c
                a.i.h.j.b.a.b(r1, r6)
            L59:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.i.h.j.b.b(a.i.h.i):void");
        }

        @Override // a.i.h.j.g
        public String h() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b m(Bitmap bitmap) {
            this.f1719f = bitmap == null ? null : IconCompat.d(bitmap);
            this.f1720g = true;
            return this;
        }

        public b n(Bitmap bitmap) {
            this.f1718e = bitmap;
            return this;
        }
    }

    public static class c extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f1721e;

        @Override // a.i.h.j.g
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f1721e);
            }
        }

        @Override // a.i.h.j.g
        public void b(i iVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(iVar.a()).setBigContentTitle(this.f1739b).bigText(this.f1721e);
                if (this.f1741d) {
                    bigTextStyleBigText.setSummaryText(this.f1740c);
                }
            }
        }

        @Override // a.i.h.j.g
        public String h() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c m(CharSequence charSequence) {
            this.f1721e = e.h(charSequence);
            return this;
        }
    }

    public static final class d {

        public static class a {
            public static Notification.BubbleMetadata a(d dVar) {
                if (dVar == null) {
                    return null;
                }
                throw null;
            }
        }

        public static class b {
            public static Notification.BubbleMetadata a(d dVar) {
                if (dVar == null) {
                    return null;
                }
                throw null;
            }
        }

        public static Notification.BubbleMetadata a(d dVar) {
            if (dVar == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return b.a(dVar);
            }
            if (i2 == 29) {
                return a.a(dVar);
            }
            return null;
        }
    }

    public static class e {
        public boolean A;
        public boolean B;
        public boolean C;
        public String D;
        public Bundle E;
        public int F;
        public int G;
        public Notification H;
        public RemoteViews I;
        public RemoteViews J;
        public RemoteViews K;
        public String L;
        public int M;
        public String N;
        public a.i.i.c O;
        public long P;
        public int Q;
        public boolean R;
        public d S;
        public Notification T;
        public boolean U;
        public Icon V;

        @Deprecated
        public ArrayList<String> W;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f1722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<a> f1723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<m> f1724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<a> f1725d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f1726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f1727f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public PendingIntent f1728g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PendingIntent f1729h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public RemoteViews f1730i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Bitmap f1731j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f1732k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1733l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1734m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f1735n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f1736o;
        public boolean p;
        public g q;
        public CharSequence r;
        public CharSequence s;
        public CharSequence[] t;
        public int u;
        public int v;
        public boolean w;
        public String x;
        public boolean y;
        public String z;

        @Deprecated
        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String str) {
            this.f1723b = new ArrayList<>();
            this.f1724c = new ArrayList<>();
            this.f1725d = new ArrayList<>();
            this.f1735n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.f1722a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f1734m = 0;
            this.W = new ArrayList<>();
            this.R = true;
        }

        public static CharSequence h(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e A(int i2) {
            this.T.icon = i2;
            return this;
        }

        public e B(Uri uri) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e C(g gVar) {
            if (this.q != gVar) {
                this.q = gVar;
                if (gVar != null) {
                    gVar.l(this);
                }
            }
            return this;
        }

        public e D(CharSequence charSequence) {
            this.T.tickerText = h(charSequence);
            return this;
        }

        public e E(long[] jArr) {
            this.T.vibrate = jArr;
            return this;
        }

        public e F(int i2) {
            this.G = i2;
            return this;
        }

        public e G(long j2) {
            this.T.when = j2;
            return this;
        }

        public e a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1723b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f1723b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new k(this).c();
        }

        public int d() {
            return this.F;
        }

        public Bundle e() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public int f() {
            return this.f1734m;
        }

        public long g() {
            if (this.f1735n) {
                return this.T.when;
            }
            return 0L;
        }

        public final Bitmap i(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f1722a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a.i.b.f1624b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a.i.b.f1623a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d2 = dimensionPixelSize;
            double dMax = Math.max(1, bitmap.getWidth());
            Double.isNaN(d2);
            Double.isNaN(dMax);
            double d3 = d2 / dMax;
            double d4 = dimensionPixelSize2;
            double dMax2 = Math.max(1, bitmap.getHeight());
            Double.isNaN(d4);
            Double.isNaN(dMax2);
            double dMin = Math.min(d3, d4 / dMax2);
            double width = bitmap.getWidth();
            Double.isNaN(width);
            int iCeil = (int) Math.ceil(width * dMin);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, iCeil, (int) Math.ceil(height * dMin), true);
        }

        public e j(boolean z) {
            r(16, z);
            return this;
        }

        public e k(String str) {
            this.L = str;
            return this;
        }

        public e l(int i2) {
            this.F = i2;
            return this;
        }

        public e m(PendingIntent pendingIntent) {
            this.f1728g = pendingIntent;
            return this;
        }

        public e n(CharSequence charSequence) {
            this.f1727f = h(charSequence);
            return this;
        }

        public e o(CharSequence charSequence) {
            this.f1726e = h(charSequence);
            return this;
        }

        public e p(int i2) {
            Notification notification = this.T;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e q(PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        public final void r(int i2, boolean z) {
            Notification notification;
            int i3;
            if (z) {
                notification = this.T;
                i3 = i2 | notification.flags;
            } else {
                notification = this.T;
                i3 = (i2 ^ (-1)) & notification.flags;
            }
            notification.flags = i3;
        }

        public e s(Bitmap bitmap) {
            this.f1731j = i(bitmap);
            return this;
        }

        public e t(int i2, int i3, int i4) {
            Notification notification = this.T;
            notification.ledARGB = i2;
            notification.ledOnMS = i3;
            notification.ledOffMS = i4;
            notification.flags = ((i3 == 0 || i4 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e u(boolean z) {
            this.A = z;
            return this;
        }

        public e v(int i2) {
            this.f1733l = i2;
            return this;
        }

        public e w(boolean z) {
            r(2, z);
            return this;
        }

        public e x(int i2) {
            this.f1734m = i2;
            return this;
        }

        public e y(int i2, int i3, boolean z) {
            this.u = i2;
            this.v = i3;
            this.w = z;
            return this;
        }

        public e z(boolean z) {
            this.f1735n = z;
            return this;
        }
    }

    public static class f extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<CharSequence> f1737e = new ArrayList<>();

        @Override // a.i.h.j.g
        public void b(i iVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(iVar.a()).setBigContentTitle(this.f1739b);
                if (this.f1741d) {
                    bigContentTitle.setSummaryText(this.f1740c);
                }
                Iterator<CharSequence> it = this.f1737e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        @Override // a.i.h.j.g
        public String h() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public f m(CharSequence charSequence) {
            if (charSequence != null) {
                this.f1737e.add(e.h(charSequence));
            }
            return this;
        }
    }

    public static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f1738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f1739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f1740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1741d = false;

        public void a(Bundle bundle) {
            if (this.f1741d) {
                bundle.putCharSequence("android.summaryText", this.f1740c);
            }
            CharSequence charSequence = this.f1739b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strH = h();
            if (strH != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strH);
            }
        }

        public abstract void b(i iVar);

        /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01fb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews c(boolean r17, int r18, boolean r19) {
            /*
                Method dump skipped, instruction units count: 513
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.i.h.j.g.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        public Bitmap d(int i2, int i3) {
            return e(i2, i3, 0);
        }

        public final Bitmap e(int i2, int i3, int i4) {
            return f(IconCompat.e(this.f1738a.f1722a, i2), i3, i4);
        }

        public final Bitmap f(IconCompat iconCompat, int i2, int i3) {
            Drawable drawableR = iconCompat.r(this.f1738a.f1722a);
            int intrinsicWidth = i3 == 0 ? drawableR.getIntrinsicWidth() : i3;
            if (i3 == 0) {
                i3 = drawableR.getIntrinsicHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Bitmap.Config.ARGB_8888);
            drawableR.setBounds(0, 0, intrinsicWidth, i3);
            if (i2 != 0) {
                drawableR.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            }
            drawableR.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        public final Bitmap g(int i2, int i3, int i4, int i5) {
            int i6 = a.i.c.f1633c;
            if (i5 == 0) {
                i5 = 0;
            }
            Bitmap bitmapE = e(i6, i5, i3);
            Canvas canvas = new Canvas(bitmapE);
            Drawable drawableMutate = this.f1738a.f1722a.getResources().getDrawable(i2).mutate();
            drawableMutate.setFilterBitmap(true);
            int i7 = (i3 - i4) / 2;
            int i8 = i4 + i7;
            drawableMutate.setBounds(i7, i7, i8, i8);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapE;
        }

        public String h() {
            return null;
        }

        public RemoteViews i(i iVar) {
            return null;
        }

        public RemoteViews j(i iVar) {
            return null;
        }

        public RemoteViews k(i iVar) {
            return null;
        }

        public void l(e eVar) {
            if (this.f1738a != eVar) {
                this.f1738a = eVar;
                if (eVar != null) {
                    eVar.C(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return notification.extras;
        }
        if (i2 >= 16) {
            return l.c(notification);
        }
        return null;
    }
}
