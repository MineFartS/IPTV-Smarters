package c.f.a.c.d.v;

import c.f.a.c.d.e;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements e.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Status f12155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.c.d.d f12156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12159f;

    public i0(Status status) {
        this(status, null, null, null, false);
    }

    public i0(Status status, c.f.a.c.d.d dVar, String str, String str2, boolean z) {
        this.f12155b = status;
        this.f12156c = dVar;
        this.f12157d = str;
        this.f12158e = str2;
        this.f12159f = z;
    }

    @Override // c.f.a.c.f.o.j
    public final Status C() {
        return this.f12155b;
    }

    @Override // c.f.a.c.d.e.a
    public final boolean d() {
        return this.f12159f;
    }

    @Override // c.f.a.c.d.e.a
    public final String f() {
        return this.f12157d;
    }

    @Override // c.f.a.c.d.e.a
    public final String getSessionId() {
        return this.f12158e;
    }

    @Override // c.f.a.c.d.e.a
    public final c.f.a.c.d.d t() {
        return this.f12156c;
    }
}
