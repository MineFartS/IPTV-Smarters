package a.n.q;

import android.util.Property;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0<PropertyT extends Property> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<PropertyT> f2754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<PropertyT> f2755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f2756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f2757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<f0> f2758e;

    public e0() {
        ArrayList arrayList = new ArrayList();
        this.f2754a = arrayList;
        this.f2755b = Collections.unmodifiableList(arrayList);
        this.f2756c = new int[4];
        this.f2757d = new float[4];
        this.f2758e = new ArrayList(4);
    }

    public final float a(int i2) {
        return this.f2757d[i2];
    }

    public void b() {
        for (int i2 = 0; i2 < this.f2758e.size(); i2++) {
            this.f2758e.get(i2).c(this);
        }
    }

    public final void c() {
        if (this.f2754a.size() < 2) {
            return;
        }
        float fA = a(0);
        int i2 = 1;
        while (i2 < this.f2754a.size()) {
            float fA2 = a(i2);
            if (fA2 < fA) {
                int i3 = i2 - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", Integer.valueOf(i2), this.f2754a.get(i2).getName(), Integer.valueOf(i3), this.f2754a.get(i3).getName()));
            }
            if (fA == -3.4028235E38f && fA2 == Float.MAX_VALUE) {
                int i4 = i2 - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i4), this.f2754a.get(i4).getName(), Integer.valueOf(i2), this.f2754a.get(i2).getName()));
            }
            i2++;
            fA = fA2;
        }
    }
}
