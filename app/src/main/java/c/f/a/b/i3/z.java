package c.f.a.b.i3;

import android.net.Uri;
import c.f.a.b.i3.p;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f9143b = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p.a f9144c = new p.a() { // from class: c.f.a.b.i3.c
        @Override // c.f.a.b.i3.p.a
        public final p a() {
            return z.f();
        }
    };

    public static /* synthetic */ z f() {
        return new z();
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return null;
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // c.f.a.b.i3.p
    public void close() {
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) throws IOException {
        throw new IOException("DummyDataSource cannot be opened");
    }

    @Override // c.f.a.b.i3.p
    public void h(n0 n0Var) {
    }

    @Override // c.f.a.b.i3.p
    public /* synthetic */ Map q() {
        return o.a(this);
    }
}
