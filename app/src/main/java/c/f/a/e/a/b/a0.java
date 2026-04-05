package c.f.a.e.a.b;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, AssetPackState> f15358b;

    public a0(long j2, Map<String, AssetPackState> map) {
        this.f15357a = j2;
        this.f15358b = map;
    }

    @Override // c.f.a.e.a.b.c
    public final Map<String, AssetPackState> e() {
        return this.f15358b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f15357a == cVar.f() && this.f15358b.equals(cVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // c.f.a.e.a.b.c
    public final long f() {
        return this.f15357a;
    }

    public final int hashCode() {
        long j2 = this.f15357a;
        return this.f15358b.hashCode() ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j2 = this.f15357a;
        String strValueOf = String.valueOf(this.f15358b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j2);
        sb.append(", packStates=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
