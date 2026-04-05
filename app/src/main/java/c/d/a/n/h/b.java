package c.d.a.n.h;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class b implements c<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5506b;

    public b(byte[] bArr, String str) {
        this.f5505a = bArr;
        this.f5506b = str;
    }

    @Override // c.d.a.n.h.c
    public void a() {
    }

    @Override // c.d.a.n.h.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream b(c.d.a.i iVar) {
        return new ByteArrayInputStream(this.f5505a);
    }

    @Override // c.d.a.n.h.c
    public void cancel() {
    }

    @Override // c.d.a.n.h.c
    public String getId() {
        return this.f5506b;
    }
}
