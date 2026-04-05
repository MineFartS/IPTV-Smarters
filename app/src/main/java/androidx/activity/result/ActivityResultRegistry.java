package androidx.activity.result;

import a.p.f;
import a.p.i;
import a.p.k;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Random f4016a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, String> f4017b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Integer> f4018c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, d> f4019d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<String> f4020e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Map<String, c<?>> f4021f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, Object> f4022g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f4023h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends a.a.e.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.a.e.f.a f4030c;

        public a(String str, int i2, a.a.e.f.a aVar) {
            this.f4028a = str;
            this.f4029b = i2;
            this.f4030c = aVar;
        }

        @Override // a.a.e.c
        public void b(I i2, a.i.h.c cVar) {
            ActivityResultRegistry.this.f4020e.add(this.f4028a);
            ActivityResultRegistry.this.f(this.f4029b, this.f4030c, i2, cVar);
        }

        @Override // a.a.e.c
        public void c() {
            ActivityResultRegistry.this.l(this.f4028a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class b<I> extends a.a.e.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.a.e.f.a f4034c;

        public b(String str, int i2, a.a.e.f.a aVar) {
            this.f4032a = str;
            this.f4033b = i2;
            this.f4034c = aVar;
        }

        @Override // a.a.e.c
        public void b(I i2, a.i.h.c cVar) {
            ActivityResultRegistry.this.f4020e.add(this.f4032a);
            ActivityResultRegistry.this.f(this.f4033b, this.f4034c, i2, cVar);
        }

        @Override // a.a.e.c
        public void c() {
            ActivityResultRegistry.this.l(this.f4032a);
        }
    }

    public static class c<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.a.e.b<O> f4036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a.a.e.f.a<?, O> f4037b;

        public c(a.a.e.b<O> bVar, a.a.e.f.a<?, O> aVar) {
            this.f4036a = bVar;
            this.f4037b = aVar;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f4038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<i> f4039b = new ArrayList<>();

        public d(f fVar) {
            this.f4038a = fVar;
        }

        public void a(i iVar) {
            this.f4038a.a(iVar);
            this.f4039b.add(iVar);
        }

        public void b() {
            Iterator<i> it = this.f4039b.iterator();
            while (it.hasNext()) {
                this.f4038a.c(it.next());
            }
            this.f4039b.clear();
        }
    }

    public final void a(int i2, String str) {
        this.f4017b.put(Integer.valueOf(i2), str);
        this.f4018c.put(str, Integer.valueOf(i2));
    }

    public final boolean b(int i2, int i3, Intent intent) {
        String str = this.f4017b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f4020e.remove(str);
        d(str, i3, intent, this.f4021f.get(str));
        return true;
    }

    public final <O> boolean c(int i2, @SuppressLint({"UnknownNullness"}) O o2) {
        a.a.e.b<?> bVar;
        String str = this.f4017b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f4020e.remove(str);
        c<?> cVar = this.f4021f.get(str);
        if (cVar != null && (bVar = cVar.f4036a) != null) {
            bVar.a(o2);
            return true;
        }
        this.f4023h.remove(str);
        this.f4022g.put(str, o2);
        return true;
    }

    public final <O> void d(String str, int i2, Intent intent, c<O> cVar) {
        a.a.e.b<O> bVar;
        if (cVar != null && (bVar = cVar.f4036a) != null) {
            bVar.a(cVar.f4037b.c(i2, intent));
        } else {
            this.f4022g.remove(str);
            this.f4023h.putParcelable(str, new a.a.e.a(i2, intent));
        }
    }

    public final int e() {
        int iNextInt = this.f4016a.nextInt(2147418112);
        while (true) {
            int i2 = iNextInt + 65536;
            if (!this.f4017b.containsKey(Integer.valueOf(i2))) {
                return i2;
            }
            iNextInt = this.f4016a.nextInt(2147418112);
        }
    }

    public abstract <I, O> void f(int i2, a.a.e.f.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i3, a.i.h.c cVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        int size = stringArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(integerArrayList.get(i2).intValue(), stringArrayList.get(i2));
        }
        this.f4020e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f4016a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f4023h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f4017b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f4017b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f4020e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f4023h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f4016a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> a.a.e.c<I> i(String str, a.a.e.f.a<I, O> aVar, a.a.e.b<O> bVar) {
        int iK = k(str);
        this.f4021f.put(str, new c<>(bVar, aVar));
        if (this.f4022g.containsKey(str)) {
            Object obj = this.f4022g.get(str);
            this.f4022g.remove(str);
            bVar.a(obj);
        }
        a.a.e.a aVar2 = (a.a.e.a) this.f4023h.getParcelable(str);
        if (aVar2 != null) {
            this.f4023h.remove(str);
            bVar.a(aVar.c(aVar2.c(), aVar2.b()));
        }
        return new b(str, iK, aVar);
    }

    public final <I, O> a.a.e.c<I> j(final String str, k kVar, final a.a.e.f.a<I, O> aVar, final a.a.e.b<O> bVar) {
        f lifecycle = kVar.getLifecycle();
        if (lifecycle.b().isAtLeast(f.c.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + kVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        int iK = k(str);
        d dVar = this.f4019d.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        dVar.a(new i() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // a.p.i
            public void d(k kVar2, f.b bVar2) {
                if (!f.b.ON_START.equals(bVar2)) {
                    if (f.b.ON_STOP.equals(bVar2)) {
                        ActivityResultRegistry.this.f4021f.remove(str);
                        return;
                    } else {
                        if (f.b.ON_DESTROY.equals(bVar2)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f4021f.put(str, new c<>(bVar, aVar));
                if (ActivityResultRegistry.this.f4022g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f4022g.get(str);
                    ActivityResultRegistry.this.f4022g.remove(str);
                    bVar.a(obj);
                }
                a.a.e.a aVar2 = (a.a.e.a) ActivityResultRegistry.this.f4023h.getParcelable(str);
                if (aVar2 != null) {
                    ActivityResultRegistry.this.f4023h.remove(str);
                    bVar.a(aVar.c(aVar2.c(), aVar2.b()));
                }
            }
        });
        this.f4019d.put(str, dVar);
        return new a(str, iK, aVar);
    }

    public final int k(String str) {
        Integer num = this.f4018c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iE = e();
        a(iE, str);
        return iE;
    }

    public final void l(String str) {
        Integer numRemove;
        if (!this.f4020e.contains(str) && (numRemove = this.f4018c.remove(str)) != null) {
            this.f4017b.remove(numRemove);
        }
        this.f4021f.remove(str);
        if (this.f4022g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f4022g.get(str));
            this.f4022g.remove(str);
        }
        if (this.f4023h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f4023h.getParcelable(str));
            this.f4023h.remove(str);
        }
        d dVar = this.f4019d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f4019d.remove(str);
        }
    }
}
