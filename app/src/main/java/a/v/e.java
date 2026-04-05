package a.v;

import a.p.f;
import a.p.x;
import a.p.y;
import android.content.Context;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a.p.k, y, a.z.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f3534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f3535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a.p.l f3536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a.z.b f3537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UUID f3538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f.c f3539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f.c f3540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f3541j;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3542a;

        static {
            int[] iArr = new int[f.b.values().length];
            f3542a = iArr;
            try {
                iArr[f.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3542a[f.b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3542a[f.b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3542a[f.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3542a[f.b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3542a[f.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3542a[f.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public e(Context context, k kVar, Bundle bundle, a.p.k kVar2, g gVar) {
        this(context, kVar, bundle, kVar2, gVar, UUID.randomUUID(), null);
    }

    public e(Context context, k kVar, Bundle bundle, a.p.k kVar2, g gVar, UUID uuid, Bundle bundle2) {
        this.f3536e = new a.p.l(this);
        a.z.b bVarA = a.z.b.a(this);
        this.f3537f = bVarA;
        this.f3539h = f.c.CREATED;
        this.f3540i = f.c.RESUMED;
        this.f3533b = context;
        this.f3538g = uuid;
        this.f3534c = kVar;
        this.f3535d = bundle;
        this.f3541j = gVar;
        bVarA.c(bundle2);
        if (kVar2 != null) {
            this.f3539h = kVar2.getLifecycle().b();
        }
    }

    public static f.c d(f.b bVar) {
        switch (a.f3542a[bVar.ordinal()]) {
            case 1:
            case 2:
                return f.c.CREATED;
            case 3:
            case 4:
                return f.c.STARTED;
            case 5:
                return f.c.RESUMED;
            case 6:
                return f.c.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + bVar);
        }
    }

    public Bundle a() {
        return this.f3535d;
    }

    public k b() {
        return this.f3534c;
    }

    public f.c c() {
        return this.f3540i;
    }

    public void e(f.b bVar) {
        this.f3539h = d(bVar);
        i();
    }

    public void f(Bundle bundle) {
        this.f3535d = bundle;
    }

    public void g(Bundle bundle) {
        this.f3537f.d(bundle);
    }

    @Override // a.p.k
    public a.p.f getLifecycle() {
        return this.f3536e;
    }

    @Override // a.z.c
    public SavedStateRegistry getSavedStateRegistry() {
        return this.f3537f.b();
    }

    @Override // a.p.y
    public x getViewModelStore() {
        g gVar = this.f3541j;
        if (gVar != null) {
            return gVar.h(this.f3538g);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public void h(f.c cVar) {
        this.f3540i = cVar;
        i();
    }

    public void i() {
        a.p.l lVar;
        f.c cVar;
        if (this.f3539h.ordinal() < this.f3540i.ordinal()) {
            lVar = this.f3536e;
            cVar = this.f3539h;
        } else {
            lVar = this.f3536e;
            cVar = this.f3540i;
        }
        lVar.o(cVar);
    }
}
