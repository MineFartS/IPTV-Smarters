package c.f.a.e.a.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15560a = new c.f.a.e.a.e.a("AssetPackServiceImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Intent f15561b = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f15563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.f.a.e.a.e.k<c.f.a.e.a.e.j0> f15564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.f.a.e.a.e.k<c.f.a.e.a.e.j0> f15565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f15566g = new AtomicBoolean();

    public o(Context context, o0 o0Var) {
        this.f15562c = context.getPackageName();
        this.f15563d = o0Var;
        if (c.f.a.e.a.e.o.a(context)) {
            Context contextB = c.f.a.e.a.g.a.b(context);
            c.f.a.e.a.e.a aVar = f15560a;
            Intent intent = f15561b;
            this.f15564e = new c.f.a.e.a.e.k<>(contextB, aVar, "AssetPackService", intent, t2.f15622b);
            this.f15565f = new c.f.a.e.a.e.k<>(c.f.a.e.a.g.a.b(context), aVar, "AssetPackService-keepAlive", intent, t2.f15621a);
        }
        f15560a.a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle f(int i2, String str) {
        Bundle bundleH = h(i2);
        bundleH.putString("module_name", str);
        return bundleH;
    }

    public static Bundle h(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i2);
        return bundle;
    }

    public static Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10901);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    public static /* synthetic */ ArrayList k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* synthetic */ Bundle m(Map map) {
        Bundle bundleI = i();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleI.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleI;
    }

    public static /* synthetic */ Bundle q(int i2, String str, String str2, int i3) {
        Bundle bundleF = f(i2, str);
        bundleF.putString("slice_id", str2);
        bundleF.putInt("chunk_number", i3);
        return bundleF;
    }

    public static /* synthetic */ List u(o oVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = c.b((Bundle) it.next(), oVar.f15563d).e().values().iterator().next();
            if (next == null) {
                f15560a.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (j1.d(next.g())) {
                arrayList.add(next.f());
            }
        }
        return arrayList;
    }

    public static <T> c.f.a.e.a.i.d<T> y() {
        f15560a.b("onError(%d)", -11);
        return c.f.a.e.a.i.f.c(new a(-11));
    }

    @Override // c.f.a.e.a.b.s2
    public final void a(int i2, String str, String str2, int i3) {
        if (this.f15564e == null) {
            throw new k0("The Play Store app is not installed or is an unofficial version.", i2);
        }
        f15560a.d("notifyChunkTransferred", new Object[0]);
        c.f.a.e.a.i.m mVar = new c.f.a.e.a.i.m();
        this.f15564e.a(new e(this, mVar, i2, str, str2, i3, mVar));
    }

    @Override // c.f.a.e.a.b.s2
    public final void b(int i2, String str) {
        x(i2, str, 10);
    }

    @Override // c.f.a.e.a.b.s2
    public final c.f.a.e.a.i.d<ParcelFileDescriptor> c(int i2, String str, String str2, int i3) {
        if (this.f15564e == null) {
            return y();
        }
        f15560a.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i3), Integer.valueOf(i2));
        c.f.a.e.a.i.m mVar = new c.f.a.e.a.i.m();
        this.f15564e.a(new h(this, mVar, i2, str, str2, i3, mVar));
        return mVar.c();
    }

    @Override // c.f.a.e.a.b.s2
    public final c.f.a.e.a.i.d<List<String>> d(Map<String, Long> map) {
        if (this.f15564e == null) {
            return y();
        }
        f15560a.d("syncPacks", new Object[0]);
        c.f.a.e.a.i.m mVar = new c.f.a.e.a.i.m();
        this.f15564e.a(new v2(this, mVar, map, mVar));
        return mVar.c();
    }

    @Override // c.f.a.e.a.b.s2
    public final void e(List<String> list) {
        if (this.f15564e == null) {
            return;
        }
        f15560a.d("cancelDownloads(%s)", list);
        c.f.a.e.a.i.m mVar = new c.f.a.e.a.i.m();
        this.f15564e.a(new u2(this, mVar, list, mVar));
    }

    @Override // c.f.a.e.a.b.s2
    public final void g(int i2) {
        if (this.f15564e == null) {
            throw new k0("The Play Store app is not installed or is an unofficial version.", i2);
        }
        f15560a.d("notifySessionFailed", new Object[0]);
        c.f.a.e.a.i.m mVar = new c.f.a.e.a.i.m();
        this.f15564e.a(new g(this, mVar, i2, mVar));
    }

    @Override // c.f.a.e.a.b.s2
    public final synchronized void j() {
        if (this.f15565f == null) {
            f15560a.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        c.f.a.e.a.e.a aVar = f15560a;
        aVar.d("keepAlive", new Object[0]);
        if (!this.f15566g.compareAndSet(false, true)) {
            aVar.d("Service is already kept alive.", new Object[0]);
        } else {
            c.f.a.e.a.i.m mVar = new c.f.a.e.a.i.m();
            this.f15565f.a(new i(this, mVar, mVar));
        }
    }

    public final void x(int i2, String str, int i3) {
        if (this.f15564e == null) {
            throw new k0("The Play Store app is not installed or is an unofficial version.", i2);
        }
        f15560a.d("notifyModuleCompleted", new Object[0]);
        c.f.a.e.a.i.m mVar = new c.f.a.e.a.i.m();
        this.f15564e.a(new f(this, mVar, i2, str, mVar, i3));
    }
}
