package k;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Reader f30534b;

    public class a extends d0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v f30535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f30536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l.e f30537e;

        public a(v vVar, long j2, l.e eVar) {
            this.f30535c = vVar;
            this.f30536d = j2;
            this.f30537e = eVar;
        }

        @Override // k.d0
        public long l() {
            return this.f30536d;
        }

        @Override // k.d0
        @Nullable
        public v m() {
            return this.f30535c;
        }

        @Override // k.d0
        public l.e p() {
            return this.f30537e;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b extends Reader {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.e f30538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Charset f30539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f30540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Reader f30541e;

        public b(l.e eVar, Charset charset) {
            this.f30538b = eVar;
            this.f30539c = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f30540d = true;
            Reader reader = this.f30541e;
            if (reader != null) {
                reader.close();
            } else {
                this.f30538b.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) throws IOException {
            if (this.f30540d) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f30541e;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f30538b.inputStream(), k.g0.c.a(this.f30538b, this.f30539c));
                this.f30541e = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i2, i3);
        }
    }

    public static d0 n(@Nullable v vVar, long j2, l.e eVar) {
        if (eVar != null) {
            return new a(vVar, j2, eVar);
        }
        throw new NullPointerException("source == null");
    }

    public static d0 o(@Nullable v vVar, byte[] bArr) {
        return n(vVar, bArr.length, new l.c().i0(bArr));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        k.g0.c.c(p());
    }

    public final Reader d() {
        Reader reader = this.f30534b;
        if (reader != null) {
            return reader;
        }
        b bVar = new b(p(), i());
        this.f30534b = bVar;
        return bVar;
    }

    public final Charset i() {
        v vVarM = m();
        return vVarM != null ? vVarM.b(k.g0.c.f30564j) : k.g0.c.f30564j;
    }

    public abstract long l();

    @Nullable
    public abstract v m();

    public abstract l.e p();

    public final String q() {
        l.e eVarP = p();
        try {
            return eVarP.S(k.g0.c.a(eVarP, i()));
        } finally {
            k.g0.c.c(eVarP);
        }
    }
}
