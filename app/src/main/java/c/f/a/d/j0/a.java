package c.f.a.d.j0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14885a;

    public a(float f2) {
        this.f14885a = f2;
    }

    @Override // c.f.a.d.j0.c
    public float a(RectF rectF) {
        return this.f14885a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f14885a == ((a) obj).f14885a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14885a)});
    }
}
