package c.f.a.b.t2;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f10187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10192f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f10193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f10194b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f10195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f10196d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f10197e;

        public a(AudioTrack audioTrack) {
            this.f10193a = audioTrack;
        }

        public long a() {
            return this.f10197e;
        }

        public long b() {
            return this.f10194b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f10193a.getTimestamp(this.f10194b);
            if (timestamp) {
                long j2 = this.f10194b.framePosition;
                if (this.f10196d > j2) {
                    this.f10195c++;
                }
                this.f10196d = j2;
                this.f10197e = j2 + (this.f10195c << 32);
            }
            return timestamp;
        }
    }

    public x(AudioTrack audioTrack) {
        if (x0.f9296a >= 19) {
            this.f10187a = new a(audioTrack);
            g();
        } else {
            this.f10187a = null;
            h(3);
        }
    }

    public void a() {
        if (this.f10188b == 4) {
            g();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.f10187a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.f10187a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f10188b == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    @android.annotation.TargetApi(19)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(long r8) {
        /*
            r7 = this;
            c.f.a.b.t2.x$a r0 = r7.f10187a
            r1 = 0
            if (r0 == 0) goto L71
            long r2 = r7.f10191e
            long r2 = r8 - r2
            long r4 = r7.f10190d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L10
            goto L71
        L10:
            r7.f10191e = r8
            boolean r0 = r0.c()
            int r2 = r7.f10188b
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L49
            r8 = 2
            if (r2 == r4) goto L33
            if (r2 == r8) goto L30
            if (r2 == r3) goto L2d
            r8 = 4
            if (r2 != r8) goto L27
            goto L70
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L2d:
            if (r0 == 0) goto L70
            goto L45
        L30:
            if (r0 != 0) goto L70
            goto L45
        L33:
            if (r0 == 0) goto L45
            c.f.a.b.t2.x$a r9 = r7.f10187a
            long r1 = r9.a()
            long r3 = r7.f10192f
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L70
            r7.h(r8)
            goto L70
        L45:
            r7.g()
            goto L70
        L49:
            if (r0 == 0) goto L63
            c.f.a.b.t2.x$a r8 = r7.f10187a
            long r8 = r8.b()
            long r2 = r7.f10189c
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 < 0) goto L71
            c.f.a.b.t2.x$a r8 = r7.f10187a
            long r8 = r8.a()
            r7.f10192f = r8
            r7.h(r4)
            goto L70
        L63:
            long r1 = r7.f10189c
            long r8 = r8 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 <= 0) goto L70
            r7.h(r3)
        L70:
            r1 = r0
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.t2.x.e(long):boolean");
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f10187a != null) {
            h(0);
        }
    }

    public final void h(int i2) {
        this.f10188b = i2;
        long j2 = 10000;
        if (i2 == 0) {
            this.f10191e = 0L;
            this.f10192f = -1L;
            this.f10189c = System.nanoTime() / 1000;
        } else if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                j2 = 10000000;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
                j2 = 500000;
            }
        }
        this.f10190d = j2;
    }
}
