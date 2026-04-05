package c.f.a.c.k.b;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f14169f;

    public o(c5 c5Var, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        r rVar;
        c.f.a.c.f.q.o.e(str2);
        c.f.a.c.f.q.o.e(str3);
        this.f14164a = str2;
        this.f14165b = str3;
        this.f14166c = true == TextUtils.isEmpty(str) ? null : str;
        this.f14167d = j2;
        this.f14168e = j3;
        if (j3 != 0 && j3 > j2) {
            c5Var.c().r().b("Event created with reverse previous/current timestamps. appId", y3.x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            rVar = new r(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c5Var.c().o().a("Param name can't be null");
                } else {
                    Object objS = c5Var.G().s(next, bundle2.get(next));
                    if (objS == null) {
                        c5Var.c().r().b("Param value can't be null", c5Var.H().q(next));
                    } else {
                        c5Var.G().z(bundle2, next, objS);
                    }
                }
                it.remove();
            }
            rVar = new r(bundle2);
        }
        this.f14169f = rVar;
    }

    public o(c5 c5Var, String str, String str2, String str3, long j2, long j3, r rVar) {
        c.f.a.c.f.q.o.e(str2);
        c.f.a.c.f.q.o.e(str3);
        c.f.a.c.f.q.o.i(rVar);
        this.f14164a = str2;
        this.f14165b = str3;
        this.f14166c = true == TextUtils.isEmpty(str) ? null : str;
        this.f14167d = j2;
        this.f14168e = j3;
        if (j3 != 0 && j3 > j2) {
            c5Var.c().r().c("Event created with reverse previous/current timestamps. appId, name", y3.x(str2), y3.x(str3));
        }
        this.f14169f = rVar;
    }

    public final o a(c5 c5Var, long j2) {
        return new o(c5Var, this.f14166c, this.f14164a, this.f14165b, this.f14167d, j2, this.f14169f);
    }

    public final String toString() {
        String str = this.f14164a;
        String str2 = this.f14165b;
        String strValueOf = String.valueOf(this.f14169f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(str2).length() + strValueOf.length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }
}
