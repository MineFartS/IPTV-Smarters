package c.f.a.b.e3.e1.p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f7148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e> f7149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e> f7150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f7151f;

    public a(int i2, int i3, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        this.f7146a = i2;
        this.f7147b = i3;
        this.f7148c = Collections.unmodifiableList(list);
        this.f7149d = Collections.unmodifiableList(list2);
        this.f7150e = Collections.unmodifiableList(list3);
        this.f7151f = Collections.unmodifiableList(list4);
    }
}
