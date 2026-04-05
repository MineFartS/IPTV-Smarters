package c.f.a.d.j0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14921a;

    public i(float f2) {
        this.f14921a = f2;
    }

    @Override // c.f.a.d.j0.c
    public float a(RectF rectF) {
        return this.f14921a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f14921a == ((i) obj).f14921a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14921a)});
    }
}
