package c.f.a.b.e3.e1.p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f7191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<f> f7192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f7193e;

    public g(String str, long j2, List<a> list, List<f> list2) {
        this(str, j2, list, list2, null);
    }

    public g(String str, long j2, List<a> list, List<f> list2, e eVar) {
        this.f7189a = str;
        this.f7190b = j2;
        this.f7191c = Collections.unmodifiableList(list);
        this.f7192d = Collections.unmodifiableList(list2);
        this.f7193e = eVar;
    }

    public int a(int i2) {
        int size = this.f7191c.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f7191c.get(i3).f7147b == i2) {
                return i3;
            }
        }
        return -1;
    }
}
