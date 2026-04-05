package c.f.a.e.a.d;

import com.google.android.play.core.install.InstallState;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends InstallState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15705e;

    public a(int i2, long j2, long j3, int i3, String str) {
        this.f15701a = i2;
        this.f15702b = j2;
        this.f15703c = j3;
        this.f15704d = i3;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f15705e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long b() {
        return this.f15702b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int c() {
        return this.f15704d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int d() {
        return this.f15701a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String e() {
        return this.f15705e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.f15701a == installState.d() && this.f15702b == installState.b() && this.f15703c == installState.f() && this.f15704d == installState.c() && this.f15705e.equals(installState.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long f() {
        return this.f15703c;
    }

    public final int hashCode() {
        int i2 = this.f15701a;
        long j2 = this.f15702b;
        long j3 = this.f15703c;
        return ((((((((i2 ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f15704d) * 1000003) ^ this.f15705e.hashCode();
    }

    public final String toString() {
        int i2 = this.f15701a;
        long j2 = this.f15702b;
        long j3 = this.f15703c;
        int i3 = this.f15704d;
        String str = this.f15705e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", installErrorCode=");
        sb.append(i3);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
