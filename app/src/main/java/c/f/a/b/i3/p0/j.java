package c.f.a.b.i3.p0;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class j implements Comparable<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f8995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8996g;

    public j(String str, long j2, long j3, long j4, File file) {
        this.f8991b = str;
        this.f8992c = j2;
        this.f8993d = j3;
        this.f8994e = file != null;
        this.f8995f = file;
        this.f8996g = j4;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        if (!this.f8991b.equals(jVar.f8991b)) {
            return this.f8991b.compareTo(jVar.f8991b);
        }
        long j2 = this.f8992c - jVar.f8992c;
        if (j2 == 0) {
            return 0;
        }
        return j2 < 0 ? -1 : 1;
    }

    public boolean d() {
        return !this.f8994e;
    }

    public boolean g() {
        return this.f8993d == -1;
    }

    public String toString() {
        return "[" + this.f8992c + ", " + this.f8993d + "]";
    }
}
