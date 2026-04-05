package c.f.a.e.a.b;

import com.google.android.play.core.assetpacks.AssetPackState;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends AssetPackState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15696g;

    public z(String str, int i2, int i3, long j2, long j3, int i4, int i5) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f15690a = str;
        this.f15691b = i2;
        this.f15692c = i3;
        this.f15693d = j2;
        this.f15694e = j3;
        this.f15695f = i4;
        this.f15696g = i5;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int a() {
        return this.f15696g;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long c() {
        return this.f15693d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int e() {
        return this.f15692c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f15690a.equals(assetPackState.f()) && this.f15691b == assetPackState.g() && this.f15692c == assetPackState.e() && this.f15693d == assetPackState.c() && this.f15694e == assetPackState.h() && this.f15695f == assetPackState.i() && this.f15696g == assetPackState.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String f() {
        return this.f15690a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int g() {
        return this.f15691b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long h() {
        return this.f15694e;
    }

    public final int hashCode() {
        int iHashCode = this.f15690a.hashCode();
        int i2 = this.f15691b;
        int i3 = this.f15692c;
        long j2 = this.f15693d;
        long j3 = this.f15694e;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f15695f) * 1000003) ^ this.f15696g;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int i() {
        return this.f15695f;
    }

    public final String toString() {
        String str = this.f15690a;
        int i2 = this.f15691b;
        int i3 = this.f15692c;
        long j2 = this.f15693d;
        long j3 = this.f15694e;
        int i4 = this.f15695f;
        int i5 = this.f15696g;
        StringBuilder sb = new StringBuilder(str.length() + 217);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", transferProgressPercentage=");
        sb.append(i4);
        sb.append(", updateAvailability=");
        sb.append(i5);
        sb.append("}");
        return sb.toString();
    }
}
