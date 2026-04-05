package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ap extends al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f20319a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final an f20320b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bj f20322d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private cd f20326h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<az> f20321c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20323e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20324f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f20325g = UUID.randomUUID().toString();

    public ap(am amVar, an anVar) {
        this.f20320b = anVar;
        l(null);
        this.f20322d = (anVar.c() == ao.HTML || anVar.c() == ao.JAVASCRIPT) ? new bk(anVar.a()) : new bm(anVar.h());
        this.f20322d.j();
        aw.a().d(this);
        bc.a().d(this.f20322d.a(), amVar.a());
    }

    private final void l(View view) {
        this.f20326h = new cd(view);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.al
    public final void b(View view, ar arVar, String str) {
        az next;
        if (this.f20324f) {
            return;
        }
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (str != null && (str.length() > 50 || !f20319a.matcher(str).matches())) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
        Iterator<az> it = this.f20321c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next.d().get() == view) {
                    break;
                }
            }
        }
        if (next == null) {
            this.f20321c.add(new az(view, arVar, str));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.al
    public final void c() {
        if (this.f20324f) {
            return;
        }
        this.f20326h.clear();
        e();
        this.f20324f = true;
        bc.a().c(this.f20322d.a());
        aw.a().e(this);
        this.f20322d.c();
        this.f20322d = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.al
    public final void d(View view) {
        if (this.f20324f) {
            return;
        }
        hd.e(view, "AdView is null");
        if (g() == view) {
            return;
        }
        l(view);
        this.f20322d.b();
        Collection<ap> collectionC = aw.a().c();
        if (collectionC == null || collectionC.size() <= 0) {
            return;
        }
        for (ap apVar : collectionC) {
            if (apVar != this && apVar.g() == view) {
                apVar.f20326h.clear();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.al
    public final void e() {
        if (this.f20324f) {
            return;
        }
        this.f20321c.clear();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.al
    public final void f() {
        if (this.f20323e) {
            return;
        }
        this.f20323e = true;
        aw.a().f(this);
        this.f20322d.h(bd.b().a());
        this.f20322d.f(this, this.f20320b);
    }

    public final View g() {
        return this.f20326h.get();
    }

    public final bj h() {
        return this.f20322d;
    }

    public final String i() {
        return this.f20325g;
    }

    public final List<az> j() {
        return this.f20321c;
    }

    public final boolean k() {
        return this.f20323e && !this.f20324f;
    }
}
