package c.f.a.b.t2;

import c.f.a.b.k1;
import c.f.a.b.z1;
import java.nio.ByteBuffer;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public interface v {

    public static final class a extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k1 f10178b;

        public a(String str, k1 k1Var) {
            super(str);
            this.f10178b = k1Var;
        }

        public a(Throwable th, k1 k1Var) {
            super(th);
            this.f10178b = k1Var;
        }
    }

    public static final class b extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f10180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k1 f10181d;

        public b(int i2, int i3, int i4, int i5, k1 k1Var, boolean z, Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i2);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(", ");
            sb.append(i5);
            sb.append(")");
            sb.append(z ? " (recoverable)" : BuildConfig.FLAVOR);
            super(sb.toString(), exc);
            this.f10179b = i2;
            this.f10180c = z;
            this.f10181d = k1Var;
        }
    }

    public interface c {
        void a(boolean z);

        void b(long j2);

        void c(Exception exc);

        void d(int i2, long j2, long j3);

        void e(long j2);

        void f();

        void g();
    }

    public static final class d extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10183c;

        public d(long j2, long j3) {
            super("Unexpected audio track timestamp discontinuity: expected " + j3 + ", got " + j2);
            this.f10182b = j2;
            this.f10183c = j3;
        }
    }

    public static final class e extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f10185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k1 f10186d;

        public e(int i2, k1 k1Var, boolean z) {
            super("AudioTrack write failed: " + i2);
            this.f10185c = z;
            this.f10184b = i2;
            this.f10186d = k1Var;
        }
    }

    boolean a(k1 k1Var);

    boolean b();

    z1 c();

    void d(z1 z1Var);

    void e();

    boolean f();

    void flush();

    void g(int i2);

    long h(boolean z);

    void i();

    void j(p pVar);

    void k();

    void l();

    boolean m(ByteBuffer byteBuffer, long j2, int i2);

    void n(c cVar);

    int o(k1 k1Var);

    void p(k1 k1Var, int i2, int[] iArr);

    void pause();

    void play();

    void q();

    void r(boolean z);

    void reset();

    void s(z zVar);

    void setVolume(float f2);
}
