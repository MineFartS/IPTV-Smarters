package c.f.a.b.f3;

import c.f.a.b.v2.h;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends c.f.a.b.v2.i<j, k, h> implements g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f8093n;

    public d(String str) {
        super(new j[2], new k[2]);
        this.f8093n = str;
        u(1024);
    }

    @Override // c.f.a.b.f3.g
    public void a(long j2) {
    }

    @Override // c.f.a.b.v2.c
    public final String getName() {
        return this.f8093n;
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final j g() {
        return new j();
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final k h() {
        return new e(new h.a() { // from class: c.f.a.b.f3.b
            @Override // c.f.a.b.v2.h.a
            public final void a(c.f.a.b.v2.h hVar) {
                this.f8062a.r((k) hVar);
            }
        });
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final h i(Throwable th) {
        return new h("Unexpected decode error", th);
    }

    public abstract f y(byte[] bArr, int i2, boolean z);

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final h j(j jVar, k kVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) c.f.a.b.j3.g.e(jVar.f10276c);
            kVar.g(jVar.f10278e, y(byteBuffer.array(), byteBuffer.limit(), z), jVar.f8096i);
            kVar.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (h e2) {
            return e2;
        }
    }
}
