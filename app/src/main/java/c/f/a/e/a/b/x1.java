package c.f.a.e.a.b;

/* JADX INFO: loaded from: classes2.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15672e;

    public x1() {
    }

    public x1(int i2, String str, long j2, long j3, int i3) {
        this();
        this.f15668a = i2;
        this.f15669b = str;
        this.f15670c = j2;
        this.f15671d = j3;
        this.f15672e = i3;
    }

    public int a() {
        return this.f15668a;
    }

    public String b() {
        return this.f15669b;
    }

    public long c() {
        return this.f15670c;
    }

    public long d() {
        return this.f15671d;
    }

    public int e() {
        return this.f15672e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x1 x1Var = (x1) obj;
            if (this.f15668a == x1Var.a() && ((str = this.f15669b) != null ? str.equals(x1Var.b()) : x1Var.b() == null) && this.f15670c == x1Var.c() && this.f15671d == x1Var.d() && this.f15672e == x1Var.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = (this.f15668a ^ 1000003) * 1000003;
        String str = this.f15669b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f15670c;
        long j3 = this.f15671d;
        return ((((((i2 ^ iHashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f15672e;
    }

    public String toString() {
        int i2 = this.f15668a;
        String str = this.f15669b;
        long j2 = this.f15670c;
        long j3 = this.f15671d;
        int i3 = this.f15672e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i2);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j2);
        sb.append(", remainingBytes=");
        sb.append(j3);
        sb.append(", previousChunk=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
