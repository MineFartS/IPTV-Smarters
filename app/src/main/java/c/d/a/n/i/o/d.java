package c.d.a.n.i.o;

import c.d.a.n.i.o.a;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class d implements a.InterfaceC0104a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f5635b;

    public interface a {
        File a();
    }

    public d(a aVar, int i2) {
        this.f5634a = i2;
        this.f5635b = aVar;
    }

    @Override // c.d.a.n.i.o.a.InterfaceC0104a
    public c.d.a.n.i.o.a build() {
        File fileA = this.f5635b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.mkdirs() || (fileA.exists() && fileA.isDirectory())) {
            return e.d(fileA, this.f5634a);
        }
        return null;
    }
}
