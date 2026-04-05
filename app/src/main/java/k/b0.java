package k;

import java.io.File;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    public class a extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f30478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l.f f30479b;

        public a(v vVar, l.f fVar) {
            this.f30478a = vVar;
            this.f30479b = fVar;
        }

        @Override // k.b0
        public long a() {
            return this.f30479b.size();
        }

        @Override // k.b0
        @Nullable
        public v b() {
            return this.f30478a;
        }

        @Override // k.b0
        public void h(l.d dVar) {
            dVar.j0(this.f30479b);
        }
    }

    public class b extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f30480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f30482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f30483d;

        public b(v vVar, int i2, byte[] bArr, int i3) {
            this.f30480a = vVar;
            this.f30481b = i2;
            this.f30482c = bArr;
            this.f30483d = i3;
        }

        @Override // k.b0
        public long a() {
            return this.f30481b;
        }

        @Override // k.b0
        @Nullable
        public v b() {
            return this.f30480a;
        }

        @Override // k.b0
        public void h(l.d dVar) {
            dVar.f(this.f30482c, this.f30483d, this.f30481b);
        }
    }

    public class c extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f30484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f30485b;

        public c(v vVar, File file) {
            this.f30484a = vVar;
            this.f30485b = file;
        }

        @Override // k.b0
        public long a() {
            return this.f30485b.length();
        }

        @Override // k.b0
        @Nullable
        public v b() {
            return this.f30484a;
        }

        @Override // k.b0
        public void h(l.d dVar) {
            l.t tVarI = null;
            try {
                tVarI = l.m.i(this.f30485b);
                dVar.X(tVarI);
            } finally {
                k.g0.c.c(tVarI);
            }
        }
    }

    public static b0 c(@Nullable v vVar, File file) {
        if (file != null) {
            return new c(vVar, file);
        }
        throw new NullPointerException("content == null");
    }

    public static b0 d(@Nullable v vVar, String str) {
        Charset charset = k.g0.c.f30564j;
        if (vVar != null) {
            Charset charsetA = vVar.a();
            if (charsetA == null) {
                vVar = v.c(vVar + "; charset=utf-8");
            } else {
                charset = charsetA;
            }
        }
        return f(vVar, str.getBytes(charset));
    }

    public static b0 e(@Nullable v vVar, l.f fVar) {
        return new a(vVar, fVar);
    }

    public static b0 f(@Nullable v vVar, byte[] bArr) {
        return g(vVar, bArr, 0, bArr.length);
    }

    public static b0 g(@Nullable v vVar, byte[] bArr, int i2, int i3) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        k.g0.c.b(bArr.length, i2, i3);
        return new b(vVar, i3, bArr, i2);
    }

    public long a() {
        return -1L;
    }

    @Nullable
    public abstract v b();

    public abstract void h(l.d dVar);
}
