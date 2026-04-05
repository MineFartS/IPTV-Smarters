package a.s;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3101c;

    public e(String str, int i2, int i3) {
        this.f3099a = str;
        this.f3100b = i2;
        this.f3101c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return (this.f3100b < 0 || eVar.f3100b < 0) ? TextUtils.equals(this.f3099a, eVar.f3099a) && this.f3101c == eVar.f3101c : TextUtils.equals(this.f3099a, eVar.f3099a) && this.f3100b == eVar.f3100b && this.f3101c == eVar.f3101c;
    }

    public int hashCode() {
        return a.i.q.d.b(this.f3099a, Integer.valueOf(this.f3101c));
    }
}
