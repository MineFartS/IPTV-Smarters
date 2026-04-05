package c.h.a.k.h.d.d;

import c.f.b.b.b0;
import c.f.b.b.d0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class a implements c.h.a.k.h.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<c.h.a.k.h.d.c.a> f17928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, c.h.a.k.h.d.c.a> f17929b = new HashMap();

    public a(Map<c.h.a.k.h.d.c.a, List<c.h.a.k.h.d.c.b>> map) {
        this.f17928a = b0.h();
        this.f17928a = b0.i(map.keySet());
        h();
    }

    @Override // c.h.a.k.h.d.b
    public c.h.a.k.h.d.c.b a(int i2, int i3) {
        return this.f17928a.get(i2).e().get(i3);
    }

    @Override // c.h.a.k.h.d.b
    public List<c.h.a.k.h.d.c.b> b(int i2) {
        if (i2 >= this.f17928a.size() || this.f17928a.get(i2) == null) {
            return null;
        }
        return this.f17928a.get(i2).e();
    }

    @Override // c.h.a.k.h.d.b
    public boolean c() {
        return !this.f17928a.isEmpty();
    }

    @Override // c.h.a.k.h.d.b
    public c.h.a.k.h.d.c.a d(int i2) {
        return this.f17928a.get(i2);
    }

    @Override // c.h.a.k.h.d.b
    public c.h.a.k.h.d.c.a e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        c.h.a.k.h.d.c.a aVar = this.f17929b.get(str4);
        return aVar != null ? aVar : g(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // c.h.a.k.h.d.b
    public int f() {
        return this.f17928a.size();
    }

    public c.h.a.k.h.d.c.a g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int size = this.f17928a.size();
        c.h.a.k.h.d.c.a aVar = new c.h.a.k.h.d.c.a(str2, str, size, str3, str4, str5, str6, str7, str6);
        if (size > 0) {
            c.h.a.k.h.d.c.a aVar2 = this.f17928a.get(size - 1);
            aVar2.n(aVar);
            aVar.o(aVar2);
        }
        this.f17928a.add(aVar);
        this.f17929b.put(aVar.i(), aVar);
        return aVar;
    }

    public final void h() {
        this.f17929b = d0.g();
        for (int i2 = 0; i2 < this.f17928a.size(); i2++) {
            c.h.a.k.h.d.c.a aVar = this.f17928a.get(i2);
            this.f17929b.put(aVar.i(), aVar);
        }
    }
}
