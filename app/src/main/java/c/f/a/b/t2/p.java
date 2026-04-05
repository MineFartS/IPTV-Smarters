package c.f.a.b.t2;

import android.media.AudioAttributes;
import c.f.a.b.j3.x0;
import c.f.a.b.v0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f10154a = new b().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0<p> f10155b = new v0() { // from class: c.f.a.b.t2.a
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AudioAttributes f10160g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10161a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10162b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10163c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10164d = 1;

        public p a() {
            return new p(this.f10161a, this.f10162b, this.f10163c, this.f10164d);
        }
    }

    public p(int i2, int i3, int i4, int i5) {
        this.f10156c = i2;
        this.f10157d = i3;
        this.f10158e = i4;
        this.f10159f = i5;
    }

    public AudioAttributes a() {
        if (this.f10160g == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10156c).setFlags(this.f10157d).setUsage(this.f10158e);
            if (x0.f9296a >= 29) {
                usage.setAllowedCapturePolicy(this.f10159f);
            }
            this.f10160g = usage.build();
        }
        return this.f10160g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f10156c == pVar.f10156c && this.f10157d == pVar.f10157d && this.f10158e == pVar.f10158e && this.f10159f == pVar.f10159f;
    }

    public int hashCode() {
        return ((((((527 + this.f10156c) * 31) + this.f10157d) * 31) + this.f10158e) * 31) + this.f10159f;
    }
}
