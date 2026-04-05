package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class agv implements ahp, akc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ags f19642a = ags.f19628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ahk f19643b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private abo f19646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private akj f19647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f19648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private aho f19649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private agz f19650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Uri f19651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ahf f19652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19653l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final afo f19655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ajr f19656o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ahl> f19645d = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<Uri, agu> f19644c = new HashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f19654m = -9223372036854775807L;

    public agv(afo afoVar, ajr ajrVar, ahk ahkVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f19655n = afoVar;
        this.f19643b = ahkVar;
        this.f19656o = ajrVar;
    }

    public static /* synthetic */ ahf g(agv agvVar, ahf ahfVar, ahf ahfVar2) {
        long jB;
        int i2;
        ahc ahcVarY;
        int size;
        int size2;
        int size3;
        if (ahfVar != null) {
            long j2 = ahfVar2.f19711g;
            long j3 = ahfVar.f19711g;
            if (j2 <= j3 && (j2 < j3 || ((size = ahfVar2.f19718n.size() - ahfVar.f19718n.size()) == 0 ? !((size2 = ahfVar2.f19719o.size()) > (size3 = ahfVar.f19719o.size()) || (size2 == size3 && ahfVar2.f19715k && !ahfVar.f19715k)) : size <= 0))) {
                return (!ahfVar2.f19715k || ahfVar.f19715k) ? ahfVar : new ahf(ahfVar.f19705a, ahfVar.s, ahfVar.t, ahfVar.f19706b, ahfVar.f19707c, ahfVar.f19708d, ahfVar.f19709e, ahfVar.f19710f, ahfVar.f19711g, ahfVar.f19712h, ahfVar.f19713i, ahfVar.f19714j, ahfVar.u, true, ahfVar.f19716l, ahfVar.f19717m, ahfVar.f19718n, ahfVar.f19719o, ahfVar.r, ahfVar.p);
            }
        }
        if (ahfVar2.f19716l) {
            jB = ahfVar2.f19708d;
        } else {
            ahf ahfVar3 = agvVar.f19652k;
            jB = ahfVar3 != null ? ahfVar3.f19708d : 0L;
            if (ahfVar != null) {
                int size4 = ahfVar.f19718n.size();
                ahc ahcVarY2 = y(ahfVar, ahfVar2);
                if (ahcVarY2 != null) {
                    jB = ahfVar.f19708d + ahcVarY2.f19693g;
                } else if (size4 == ahfVar2.f19711g - ahfVar.f19711g) {
                    jB = ahfVar.b();
                }
            }
        }
        long j4 = jB;
        if (ahfVar2.f19709e) {
            i2 = ahfVar2.f19710f;
        } else {
            ahf ahfVar4 = agvVar.f19652k;
            i2 = ahfVar4 != null ? ahfVar4.f19710f : 0;
            if (ahfVar != null && (ahcVarY = y(ahfVar, ahfVar2)) != null) {
                i2 = (ahfVar.f19710f + ahcVarY.f19692f) - ahfVar2.f19718n.get(0).f19692f;
            }
        }
        return new ahf(ahfVar2.f19705a, ahfVar2.s, ahfVar2.t, ahfVar2.f19706b, ahfVar2.f19707c, j4, true, i2, ahfVar2.f19711g, ahfVar2.f19712h, ahfVar2.f19713i, ahfVar2.f19714j, ahfVar2.u, ahfVar2.f19715k, ahfVar2.f19716l, ahfVar2.f19717m, ahfVar2.f19718n, ahfVar2.f19719o, ahfVar2.r, ahfVar2.p);
    }

    public static /* synthetic */ void j(agv agvVar, Uri uri, ahf ahfVar) {
        if (uri.equals(agvVar.f19651j)) {
            if (agvVar.f19652k == null) {
                agvVar.f19653l = !ahfVar.f19715k;
                agvVar.f19654m = ahfVar.f19708d;
            }
            agvVar.f19652k = ahfVar;
            agvVar.f19649h.y(ahfVar);
        }
        int size = agvVar.f19645d.size();
        for (int i2 = 0; i2 < size; i2++) {
            agvVar.f19645d.get(i2).i();
        }
    }

    public static /* synthetic */ boolean r(agv agvVar) {
        List<agy> list = agvVar.f19650i.f19670c;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i2 = 0; i2 < size; i2++) {
            agu aguVar = agvVar.f19644c.get(list.get(i2).f19662a);
            ajr.b(aguVar);
            if (jElapsedRealtime > aguVar.f19639i) {
                Uri uri = aguVar.f19632b;
                agvVar.f19651j = uri;
                aguVar.l(agvVar.x(uri));
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean s(agv agvVar, Uri uri, long j2) {
        int size = agvVar.f19645d.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            z |= !agvVar.f19645d.get(i2).s(uri, j2);
        }
        return z;
    }

    private final Uri x(Uri uri) {
        ahb ahbVar;
        ahf ahfVar = this.f19652k;
        if (ahfVar == null || !ahfVar.r.f19704e || (ahbVar = ahfVar.p.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(ahbVar.f19685a));
        int i2 = ahbVar.f19686b;
        if (i2 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i2));
        }
        return builderBuildUpon.build();
    }

    private static ahc y(ahf ahfVar, ahf ahfVar2) {
        int i2 = (int) (ahfVar2.f19711g - ahfVar.f19711g);
        List<ahc> list = ahfVar.f19718n;
        if (i2 < list.size()) {
            return list.get(i2);
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ void C(akf akfVar, long j2, long j3, boolean z) {
        akm akmVar = (akm) akfVar;
        long j4 = akmVar.f19987a;
        akmVar.b();
        akmVar.d();
        akmVar.a();
        this.f19646e.d(new aax(), 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ void D(akf akfVar, long j2, long j3) {
        akm akmVar = (akm) akfVar;
        ahg ahgVar = (ahg) akmVar.c();
        boolean z = ahgVar instanceof ahf;
        agz agzVarB = z ? agz.b(ahgVar.s) : (agz) ahgVar;
        this.f19650i = agzVarB;
        this.f19651j = agzVarB.f19670c.get(0).f19662a;
        List<Uri> list = agzVarB.f19669b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Uri uri = list.get(i2);
            this.f19644c.put(uri, new agu(this, uri));
        }
        akmVar.b();
        akmVar.d();
        akmVar.a();
        aax aaxVar = new aax();
        agu aguVar = this.f19644c.get(this.f19651j);
        if (z) {
            aguVar.m((ahf) ahgVar, aaxVar);
        } else {
            aguVar.g();
        }
        this.f19646e.f(aaxVar, 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final long a() {
        return this.f19654m;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final agz f() {
        return this.f19650i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final ahf h(Uri uri, boolean z) {
        ahf ahfVarC = this.f19644c.get(uri).c();
        if (ahfVarC != null && z && !uri.equals(this.f19651j)) {
            List<agy> list = this.f19650i.f19670c;
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (uri.equals(list.get(i2).f19662a)) {
                    ahf ahfVar = this.f19652k;
                    if (ahfVar == null || !ahfVar.f19715k) {
                        this.f19651j = uri;
                        this.f19644c.get(uri).l(x(uri));
                    }
                } else {
                    i2++;
                }
            }
        }
        return ahfVarC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final void k(ahl ahlVar) {
        this.f19645d.add(ahlVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final void l(Uri uri) throws IOException {
        this.f19644c.get(uri).h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final void m() throws IOException {
        akj akjVar = this.f19647f;
        if (akjVar != null) {
            akjVar.a();
        }
        Uri uri = this.f19651j;
        if (uri != null) {
            l(uri);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final void n(Uri uri) {
        this.f19644c.get(uri).g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final void o(ahl ahlVar) {
        this.f19645d.remove(ahlVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final void p(Uri uri, abo aboVar, aho ahoVar) {
        this.f19648g = amn.v();
        this.f19646e = aboVar;
        this.f19649h = ahoVar;
        akm akmVar = new akm(this.f19655n.a(), uri, 4, this.f19643b.a());
        ajr.f(this.f19647f == null);
        akj akjVar = new akj("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f19647f = akjVar;
        akjVar.b(akmVar, this, ajr.i(akmVar.f19989c));
        aboVar.j(new aax(akmVar.f19988b), akmVar.f19989c);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final void q() {
        this.f19651j = null;
        this.f19652k = null;
        this.f19650i = null;
        this.f19654m = -9223372036854775807L;
        this.f19647f.i();
        this.f19647f = null;
        Iterator<agu> it = this.f19644c.values().iterator();
        while (it.hasNext()) {
            it.next().i();
        }
        this.f19648g.removeCallbacksAndMessages(null);
        this.f19648g = null;
        this.f19644c.clear();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final boolean t() {
        return this.f19653l;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ akd u(akf akfVar, long j2, long j3, IOException iOException, int i2) {
        akm akmVar = (akm) akfVar;
        long j4 = akmVar.f19987a;
        akmVar.b();
        akmVar.d();
        akmVar.a();
        aax aaxVar = new aax();
        new abc(akmVar.f19989c);
        long j5 = ajr.j(new akb(iOException, i2));
        boolean z = j5 == -9223372036854775807L;
        this.f19646e.h(aaxVar, akmVar.f19989c, iOException, z);
        return z ? akj.f19983c : akj.c(false, j5);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final boolean v(Uri uri) {
        return this.f19644c.get(uri).j();
    }
}
