package androidx.lifecycle;

import a.p.d;
import a.p.f;
import a.p.i;
import a.p.k;

/* JADX INFO: loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f4614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f4615c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4616a;

        static {
            int[] iArr = new int[f.b.values().length];
            f4616a = iArr;
            try {
                iArr[f.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4616a[f.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4616a[f.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4616a[f.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4616a[f.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4616a[f.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4616a[f.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(d dVar, i iVar) {
        this.f4614b = dVar;
        this.f4615c = iVar;
    }

    @Override // a.p.i
    public void d(k kVar, f.b bVar) {
        switch (a.f4616a[bVar.ordinal()]) {
            case 1:
                this.f4614b.b(kVar);
                break;
            case 2:
                this.f4614b.i(kVar);
                break;
            case 3:
                this.f4614b.a(kVar);
                break;
            case 4:
                this.f4614b.e(kVar);
                break;
            case 5:
                this.f4614b.f(kVar);
                break;
            case 6:
                this.f4614b.h(kVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        i iVar = this.f4615c;
        if (iVar != null) {
            iVar.d(kVar, bVar);
        }
    }
}
