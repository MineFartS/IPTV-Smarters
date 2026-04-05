package c.f.a.d.j0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14887b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f14886a;
            f2 += ((b) cVar).f14887b;
        }
        this.f14886a = cVar;
        this.f14887b = f2;
    }

    @Override // c.f.a.d.j0.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f14886a.a(rectF) + this.f14887b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14886a.equals(bVar.f14886a) && this.f14887b == bVar.f14887b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14886a, Float.valueOf(this.f14887b)});
    }
}
