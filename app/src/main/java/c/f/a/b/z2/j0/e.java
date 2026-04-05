package c.f.a.b.z2.j0;

import c.f.a.b.j3.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10894a;

    public static final class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f10896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<a> f10897d;

        public a(int i2, long j2) {
            super(i2);
            this.f10895b = j2;
            this.f10896c = new ArrayList();
            this.f10897d = new ArrayList();
        }

        public void d(a aVar) {
            this.f10897d.add(aVar);
        }

        public void e(b bVar) {
            this.f10896c.add(bVar);
        }

        public a f(int i2) {
            int size = this.f10897d.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.f10897d.get(i3);
                if (aVar.f10894a == i2) {
                    return aVar;
                }
            }
            return null;
        }

        public b g(int i2) {
            int size = this.f10896c.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = this.f10896c.get(i3);
                if (bVar.f10894a == i2) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // c.f.a.b.z2.j0.e
        public String toString() {
            return e.a(this.f10894a) + " leaves: " + Arrays.toString(this.f10896c.toArray()) + " containers: " + Arrays.toString(this.f10897d.toArray());
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0 f10898b;

        public b(int i2, i0 i0Var) {
            super(i2);
            this.f10898b = i0Var;
        }
    }

    public e(int i2) {
        this.f10894a = i2;
    }

    public static String a(int i2) {
        return BuildConfig.FLAVOR + ((char) ((i2 >> 24) & 255)) + ((char) ((i2 >> 16) & 255)) + ((char) ((i2 >> 8) & 255)) + ((char) (i2 & 255));
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public static int c(int i2) {
        return (i2 >> 24) & 255;
    }

    public String toString() {
        return a(this.f10894a);
    }
}
