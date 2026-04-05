package a.i.h;

import a.i.h.j;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f1743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.e f1744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RemoteViews f1745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RemoteViews f1746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<Bundle> f1747f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f1748g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RemoteViews f1750i;

    public k(j.e eVar) {
        Icon icon;
        List<String> listE;
        Bundle bundle;
        String str;
        this.f1744c = eVar;
        this.f1742a = eVar.f1722a;
        int i2 = Build.VERSION.SDK_INT;
        Context context = eVar.f1722a;
        this.f1743b = i2 >= 26 ? new Notification.Builder(context, eVar.L) : new Notification.Builder(context);
        Notification notification = eVar.T;
        this.f1743b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f1730i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f1726e).setContentText(eVar.f1727f).setContentInfo(eVar.f1732k).setContentIntent(eVar.f1728g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f1729h, (notification.flags & 128) != 0).setLargeIcon(eVar.f1731j).setNumber(eVar.f1733l).setProgress(eVar.u, eVar.v, eVar.w);
        if (i2 < 21) {
            this.f1743b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i2 >= 16) {
            this.f1743b.setSubText(eVar.r).setUsesChronometer(eVar.f1736o).setPriority(eVar.f1734m);
            Iterator<j.a> it = eVar.f1723b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle2 = eVar.E;
            if (bundle2 != null) {
                this.f1748g.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.A) {
                    this.f1748g.putBoolean("android.support.localOnly", true);
                }
                String str2 = eVar.x;
                if (str2 != null) {
                    this.f1748g.putString("android.support.groupKey", str2);
                    if (eVar.y) {
                        bundle = this.f1748g;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f1748g;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = eVar.z;
                if (str3 != null) {
                    this.f1748g.putString("android.support.sortKey", str3);
                }
            }
            this.f1745d = eVar.I;
            this.f1746e = eVar.J;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 17) {
            this.f1743b.setShowWhen(eVar.f1735n);
        }
        if (i3 >= 19 && i3 < 21 && (listE = e(g(eVar.f1724c), eVar.W)) != null && !listE.isEmpty()) {
            this.f1748g.putStringArray("android.people", (String[]) listE.toArray(new String[listE.size()]));
        }
        if (i3 >= 20) {
            this.f1743b.setLocalOnly(eVar.A).setGroup(eVar.x).setGroupSummary(eVar.y).setSortKey(eVar.z);
            this.f1749h = eVar.Q;
        }
        if (i3 >= 21) {
            this.f1743b.setCategory(eVar.D).setColor(eVar.F).setVisibility(eVar.G).setPublicVersion(eVar.H).setSound(notification.sound, notification.audioAttributes);
            List listE2 = i3 < 28 ? e(g(eVar.f1724c), eVar.W) : eVar.W;
            if (listE2 != null && !listE2.isEmpty()) {
                Iterator it2 = listE2.iterator();
                while (it2.hasNext()) {
                    this.f1743b.addPerson((String) it2.next());
                }
            }
            this.f1750i = eVar.K;
            if (eVar.f1725d.size() > 0) {
                Bundle bundle3 = eVar.e().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i4 = 0; i4 < eVar.f1725d.size(); i4++) {
                    bundle5.putBundle(Integer.toString(i4), l.b(eVar.f1725d.get(i4)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                eVar.e().putBundle("android.car.EXTENSIONS", bundle3);
                this.f1748g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (icon = eVar.V) != null) {
            this.f1743b.setSmallIcon(icon);
        }
        if (i5 >= 24) {
            this.f1743b.setExtras(eVar.E).setRemoteInputHistory(eVar.t);
            RemoteViews remoteViews = eVar.I;
            if (remoteViews != null) {
                this.f1743b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.J;
            if (remoteViews2 != null) {
                this.f1743b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.K;
            if (remoteViews3 != null) {
                this.f1743b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            this.f1743b.setBadgeIconType(eVar.M).setSettingsText(eVar.s).setShortcutId(eVar.N).setTimeoutAfter(eVar.P).setGroupAlertBehavior(eVar.Q);
            if (eVar.C) {
                this.f1743b.setColorized(eVar.B);
            }
            if (!TextUtils.isEmpty(eVar.L)) {
                this.f1743b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 28) {
            Iterator<m> it3 = eVar.f1724c.iterator();
            while (it3.hasNext()) {
                this.f1743b.addPerson(it3.next().h());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.f1743b.setAllowSystemGeneratedContextualActions(eVar.R);
            this.f1743b.setBubbleMetadata(j.d.a(eVar.S));
            if (eVar.O != null) {
                throw null;
            }
        }
        if (eVar.U) {
            if (this.f1744c.y) {
                this.f1749h = 2;
            } else {
                this.f1749h = 1;
            }
            this.f1743b.setVibrate(null);
            this.f1743b.setSound(null);
            int i7 = notification.defaults & (-2);
            notification.defaults = i7;
            int i8 = i7 & (-3);
            notification.defaults = i8;
            this.f1743b.setDefaults(i8);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f1744c.x)) {
                    this.f1743b.setGroup("silent");
                }
                this.f1743b.setGroupAlertBehavior(this.f1749h);
            }
        }
    }

    public static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        a.f.b bVar = new a.f.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    public static List<String> g(List<m> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<m> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    @Override // a.i.h.i
    public Notification.Builder a() {
        return this.f1743b;
    }

    public final void b(j.a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 20) {
            if (i2 >= 16) {
                this.f1747f.add(l.f(this.f1743b, aVar));
                return;
            }
            return;
        }
        IconCompat iconCompatF = aVar.f();
        Notification.Action.Builder builder = i2 >= 23 ? new Notification.Action.Builder(iconCompatF != null ? iconCompatF.v() : null, aVar.j(), aVar.a()) : new Notification.Action.Builder(iconCompatF != null ? iconCompatF.h() : 0, aVar.j(), aVar.a());
        if (aVar.g() != null) {
            for (RemoteInput remoteInput : n.b(aVar.g())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.h());
        if (i3 >= 28) {
            builder.setSemanticAction(aVar.h());
        }
        if (i3 >= 29) {
            builder.setContextual(aVar.k());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.i());
        builder.addExtras(bundle);
        this.f1743b.addAction(builder.build());
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsK;
        RemoteViews remoteViewsI;
        j.g gVar = this.f1744c.q;
        if (gVar != null) {
            gVar.b(this);
        }
        RemoteViews remoteViewsJ = gVar != null ? gVar.j(this) : null;
        Notification notificationD = d();
        if (remoteViewsJ != null || (remoteViewsJ = this.f1744c.I) != null) {
            notificationD.contentView = remoteViewsJ;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16 && gVar != null && (remoteViewsI = gVar.i(this)) != null) {
            notificationD.bigContentView = remoteViewsI;
        }
        if (i2 >= 21 && gVar != null && (remoteViewsK = this.f1744c.q.k(this)) != null) {
            notificationD.headsUpContentView = remoteViewsK;
        }
        if (i2 >= 16 && gVar != null && (bundleA = j.a(notificationD)) != null) {
            gVar.a(bundleA);
        }
        return notificationD;
    }

    public Notification d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            return this.f1743b.build();
        }
        if (i2 >= 24) {
            Notification notificationBuild = this.f1743b.build();
            if (this.f1749h != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 && this.f1749h == 2) {
                    h(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 && this.f1749h == 1) {
                    h(notificationBuild);
                }
            }
            return notificationBuild;
        }
        if (i2 >= 21) {
            this.f1743b.setExtras(this.f1748g);
            Notification notificationBuild2 = this.f1743b.build();
            RemoteViews remoteViews = this.f1745d;
            if (remoteViews != null) {
                notificationBuild2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f1746e;
            if (remoteViews2 != null) {
                notificationBuild2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f1750i;
            if (remoteViews3 != null) {
                notificationBuild2.headsUpContentView = remoteViews3;
            }
            if (this.f1749h != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 && this.f1749h == 2) {
                    h(notificationBuild2);
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 && this.f1749h == 1) {
                    h(notificationBuild2);
                }
            }
            return notificationBuild2;
        }
        if (i2 >= 20) {
            this.f1743b.setExtras(this.f1748g);
            Notification notificationBuild3 = this.f1743b.build();
            RemoteViews remoteViews4 = this.f1745d;
            if (remoteViews4 != null) {
                notificationBuild3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f1746e;
            if (remoteViews5 != null) {
                notificationBuild3.bigContentView = remoteViews5;
            }
            if (this.f1749h != 0) {
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 && this.f1749h == 2) {
                    h(notificationBuild3);
                }
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 && this.f1749h == 1) {
                    h(notificationBuild3);
                }
            }
            return notificationBuild3;
        }
        if (i2 >= 19) {
            SparseArray<Bundle> sparseArrayA = l.a(this.f1747f);
            if (sparseArrayA != null) {
                this.f1748g.putSparseParcelableArray("android.support.actionExtras", sparseArrayA);
            }
            this.f1743b.setExtras(this.f1748g);
            Notification notificationBuild4 = this.f1743b.build();
            RemoteViews remoteViews6 = this.f1745d;
            if (remoteViews6 != null) {
                notificationBuild4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f1746e;
            if (remoteViews7 != null) {
                notificationBuild4.bigContentView = remoteViews7;
            }
            return notificationBuild4;
        }
        if (i2 < 16) {
            return this.f1743b.getNotification();
        }
        Notification notificationBuild5 = this.f1743b.build();
        Bundle bundleA = j.a(notificationBuild5);
        Bundle bundle = new Bundle(this.f1748g);
        for (String str : this.f1748g.keySet()) {
            if (bundleA.containsKey(str)) {
                bundle.remove(str);
            }
        }
        bundleA.putAll(bundle);
        SparseArray<Bundle> sparseArrayA2 = l.a(this.f1747f);
        if (sparseArrayA2 != null) {
            j.a(notificationBuild5).putSparseParcelableArray("android.support.actionExtras", sparseArrayA2);
        }
        RemoteViews remoteViews8 = this.f1745d;
        if (remoteViews8 != null) {
            notificationBuild5.contentView = remoteViews8;
        }
        RemoteViews remoteViews9 = this.f1746e;
        if (remoteViews9 != null) {
            notificationBuild5.bigContentView = remoteViews9;
        }
        return notificationBuild5;
    }

    public Context f() {
        return this.f1742a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i2 = notification.defaults & (-2);
        notification.defaults = i2;
        notification.defaults = i2 & (-3);
    }
}
