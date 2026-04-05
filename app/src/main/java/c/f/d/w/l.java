package c.f.d.w;

import c.f.d.r;
import c.f.d.w.n.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    public static final class a extends Writer {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Appendable f16537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0203a f16538c = new C0203a();

        /* JADX INFO: renamed from: c.f.d.w.l$a$a, reason: collision with other inner class name */
        public static class C0203a implements CharSequence {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public char[] f16539b;

            @Override // java.lang.CharSequence
            public char charAt(int i2) {
                return this.f16539b[i2];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f16539b.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f16539b, i2, i3 - i2);
            }
        }

        public a(Appendable appendable) {
            this.f16537b = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
            this.f16537b.append((char) i2);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
            C0203a c0203a = this.f16538c;
            c0203a.f16539b = cArr;
            this.f16537b.append(c0203a, i2, i3 + i2);
        }
    }

    public static c.f.d.j a(c.f.d.y.a aVar) {
        boolean z;
        try {
            try {
                aVar.B0();
                z = false;
                try {
                    return n.X.b(aVar);
                } catch (EOFException e2) {
                    e = e2;
                    if (z) {
                        return c.f.d.l.f16461a;
                    }
                    throw new r(e);
                }
            } catch (c.f.d.y.d e3) {
                throw new r(e3);
            } catch (IOException e4) {
                throw new c.f.d.k(e4);
            } catch (NumberFormatException e5) {
                throw new r(e5);
            }
        } catch (EOFException e6) {
            e = e6;
            z = true;
        }
    }

    public static void b(c.f.d.j jVar, c.f.d.y.c cVar) {
        n.X.d(cVar, jVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
