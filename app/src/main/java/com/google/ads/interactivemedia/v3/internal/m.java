package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class m implements bla {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f22383f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bla f22382e = new m(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bla f22381d = new m(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bla f22380c = new m(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bla f22379b = new m(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bla f22378a = new m();

    private m() {
    }

    private m(int i2) {
        this.f22383f = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bla
    public final boolean a(int i2) {
        int i3 = this.f22383f;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? ac.a(i2) != null : ab.b(i2) != null : aa.b(i2) != null : l.a(i2) != null : n.b(i2) != null;
    }
}
