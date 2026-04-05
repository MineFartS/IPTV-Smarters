package c.f.a.e.a.b;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15359a = new c.f.a.e.a.e.a("ExtractorSessionStoreView");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f15360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.e.a.e.z<s2> f15361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f15362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.e.a.e.z<Executor> f15363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Integer, x0> f15364f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f15365g = new ReentrantLock();

    public a1(v vVar, c.f.a.e.a.e.z<s2> zVar, o0 o0Var, c.f.a.e.a.e.z<Executor> zVar2) {
        this.f15360b = vVar;
        this.f15361c = zVar;
        this.f15362d = o0Var;
        this.f15363e = zVar2;
    }

    public static String s(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new k0("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    public static <T> List<T> t(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    public final void a() {
        this.f15365g.lock();
    }

    public final void b() {
        this.f15365g.unlock();
    }

    public final Map<Integer, x0> c() {
        return this.f15364f;
    }

    public final boolean d(Bundle bundle) {
        return ((Boolean) q(new q0(this, bundle, null))).booleanValue();
    }

    public final boolean e(Bundle bundle) {
        return ((Boolean) q(new q0(this, bundle))).booleanValue();
    }

    public final void f(final String str, final int i2, final long j2) {
        q(new z0(this, str, i2, j2) { // from class: c.f.a.e.a.b.r0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a1 f15588a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f15589b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f15590c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f15591d;

            {
                this.f15588a = this;
                this.f15589b = str;
                this.f15590c = i2;
                this.f15591d = j2;
            }

            @Override // c.f.a.e.a.b.z0
            public final Object a() {
                this.f15588a.l(this.f15589b, this.f15590c, this.f15591d);
                return null;
            }
        });
    }

    public final void g(int i2) {
        q(new s0(this, i2));
    }

    public final /* synthetic */ Map h(List list) {
        int i2;
        Map<String, x0> mapP = p(list);
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            final x0 x0Var = mapP.get(str);
            if (x0Var == null) {
                i2 = 8;
            } else {
                if (j1.d(x0Var.f15667c.f15656c)) {
                    try {
                        x0Var.f15667c.f15656c = 6;
                        this.f15363e.a().execute(new Runnable(this, x0Var) { // from class: c.f.a.e.a.b.u0

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final a1 f15627b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final x0 f15628c;

                            {
                                this.f15627b = this;
                                this.f15628c = x0Var;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f15627b.g(this.f15628c.f15665a);
                            }
                        });
                        this.f15362d.a(str);
                    } catch (k0 unused) {
                        f15359a.d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(x0Var.f15665a), str);
                    }
                }
                i2 = x0Var.f15667c.f15656c;
            }
            map.put(str, Integer.valueOf(i2));
        }
        return map;
    }

    public final /* synthetic */ Map i(List list) {
        HashMap map = new HashMap();
        for (x0 x0Var : this.f15364f.values()) {
            String str = x0Var.f15667c.f15654a;
            if (list.contains(str)) {
                x0 x0Var2 = (x0) map.get(str);
                if ((x0Var2 == null ? -1 : x0Var2.f15665a) < x0Var.f15665a) {
                    map.put(str, x0Var);
                }
            }
        }
        return map;
    }

    public final /* synthetic */ Boolean j(Bundle bundle) {
        int i2 = bundle.getInt("session_id");
        if (i2 == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, x0> map = this.f15364f;
        Integer numValueOf = Integer.valueOf(i2);
        if (!map.containsKey(numValueOf)) {
            return Boolean.TRUE;
        }
        if (this.f15364f.get(numValueOf).f15667c.f15656c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!j1.g(r0.f15667c.f15656c, bundle.getInt(c.f.a.e.a.e.d0.a("status", s(bundle)))));
    }

    public final /* synthetic */ Boolean k(Bundle bundle) {
        int i2 = bundle.getInt("session_id");
        if (i2 == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, x0> map = this.f15364f;
        Integer numValueOf = Integer.valueOf(i2);
        boolean z = true;
        if (map.containsKey(numValueOf)) {
            x0 x0VarR = r(i2);
            int i3 = bundle.getInt(c.f.a.e.a.e.d0.a("status", x0VarR.f15667c.f15654a));
            if (j1.g(x0VarR.f15667c.f15656c, i3)) {
                f15359a.a("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(x0VarR.f15667c.f15656c));
                w0 w0Var = x0VarR.f15667c;
                String str = w0Var.f15654a;
                int i4 = w0Var.f15656c;
                if (i4 == 4) {
                    this.f15361c.a().b(i2, str);
                } else if (i4 == 5) {
                    this.f15361c.a().g(i2);
                } else if (i4 == 6) {
                    this.f15361c.a().e(Arrays.asList(str));
                }
            } else {
                x0VarR.f15667c.f15656c = i3;
                if (j1.e(i3)) {
                    g(i2);
                    this.f15362d.a(x0VarR.f15667c.f15654a);
                } else {
                    for (y0 y0Var : x0VarR.f15667c.f15658e) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c.f.a.e.a.e.d0.b("chunk_intents", x0VarR.f15667c.f15654a, y0Var.f15676a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (parcelableArrayList.get(i5) != null && ((Intent) parcelableArrayList.get(i5)).getData() != null) {
                                    y0Var.f15679d.get(i5).f15640a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String strS = s(bundle);
            long j2 = bundle.getLong(c.f.a.e.a.e.d0.a("pack_version", strS));
            int i6 = bundle.getInt(c.f.a.e.a.e.d0.a("status", strS));
            long j3 = bundle.getLong(c.f.a.e.a.e.d0.a("total_bytes_to_download", strS));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(c.f.a.e.a.e.d0.a("slice_ids", strS));
            ArrayList arrayList = new ArrayList();
            for (String str2 : t(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(c.f.a.e.a.e.d0.b("chunk_intents", strS, str2));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = t(parcelableArrayList2).iterator();
                while (it.hasNext()) {
                    if (((Intent) it.next()) == null) {
                        z = false;
                    }
                    arrayList2.add(new v0(z));
                    z = true;
                }
                String string = bundle.getString(c.f.a.e.a.e.d0.b("uncompressed_hash_sha256", strS, str2));
                long j4 = bundle.getLong(c.f.a.e.a.e.d0.b("uncompressed_size", strS, str2));
                int i7 = bundle.getInt(c.f.a.e.a.e.d0.b("patch_format", strS, str2), 0);
                arrayList.add(i7 != 0 ? new y0(str2, string, j4, arrayList2, 0, i7) : new y0(str2, string, j4, arrayList2, bundle.getInt(c.f.a.e.a.e.d0.b("compression_format", strS, str2), 0), 0));
                z = true;
            }
            this.f15364f.put(Integer.valueOf(i2), new x0(i2, bundle.getInt("app_version_code"), new w0(strS, j2, i6, j3, arrayList)));
        }
        return Boolean.TRUE;
    }

    public final /* synthetic */ void l(String str, int i2, long j2) {
        x0 x0Var = p(Arrays.asList(str)).get(str);
        if (x0Var == null || j1.e(x0Var.f15667c.f15656c)) {
            f15359a.b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f15360b.b(str, i2, j2);
        x0Var.f15667c.f15656c = 4;
    }

    public final /* synthetic */ void m(int i2) {
        r(i2).f15667c.f15656c = 5;
    }

    public final /* synthetic */ void n(int i2) {
        x0 x0VarR = r(i2);
        if (!j1.e(x0VarR.f15667c.f15656c)) {
            throw new k0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i2)), i2);
        }
        v vVar = this.f15360b;
        w0 w0Var = x0VarR.f15667c;
        vVar.b(w0Var.f15654a, x0VarR.f15666b, w0Var.f15655b);
        w0 w0Var2 = x0VarR.f15667c;
        int i3 = w0Var2.f15656c;
        if (i3 == 5 || i3 == 6) {
            this.f15360b.c(w0Var2.f15654a, x0VarR.f15666b, w0Var2.f15655b);
        }
    }

    public final void o(int i2) {
        q(new s0(this, i2, null));
    }

    public final Map<String, x0> p(final List<String> list) {
        final byte[] bArr = null;
        return (Map) q(new z0(this, list, bArr) { // from class: c.f.a.e.a.b.t0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a1 f15611a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f15612b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f15613c = 1;

            {
                this.f15611a = this;
                this.f15612b = list;
            }

            @Override // c.f.a.e.a.b.z0
            public final Object a() {
                return this.f15613c != 0 ? this.f15611a.i(this.f15612b) : this.f15611a.h(this.f15612b);
            }
        });
    }

    public final <T> T q(z0<T> z0Var) {
        try {
            a();
            return z0Var.a();
        } finally {
            b();
        }
    }

    public final x0 r(int i2) {
        Map<Integer, x0> map = this.f15364f;
        Integer numValueOf = Integer.valueOf(i2);
        x0 x0Var = map.get(numValueOf);
        if (x0Var != null) {
            return x0Var;
        }
        throw new k0(String.format("Could not find session %d while trying to get it", numValueOf), i2);
    }
}
