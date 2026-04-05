package io.realm.internal;

import e.a.f;
import e.a.g.d;
import e.a.g.e;

/* JADX INFO: loaded from: classes2.dex */
@KeepMember
public class OsObject implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f30402b = nativeGetFinalizerPtr();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e<b> f30404d;

    public static class a implements e.a<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f30405a;

        public a(String[] strArr) {
            this.f30405a = strArr;
        }

        public final e.a.a b() {
            String[] strArr = this.f30405a;
            boolean z = strArr == null;
            if (z) {
                strArr = new String[0];
            }
            return new c(strArr, z);
        }

        @Override // e.a.g.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(b bVar, Object obj) {
            bVar.a((e.a.e) obj, b());
        }
    }

    public static class b<T extends e.a.e> extends e.b<T, f<T>> {
        public void a(T t, e.a.a aVar) {
            ((f) this.f30348b).a(t, aVar);
        }
    }

    public static class c implements e.a.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f30406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f30407b;

        public c(String[] strArr, boolean z) {
            this.f30406a = strArr;
            this.f30407b = z;
        }
    }

    public static native long nativeGetFinalizerPtr();

    @KeepMember
    private void notifyChangeListeners(String[] strArr) {
        this.f30404d.c(new a(strArr));
    }

    @Override // e.a.g.d
    public long getNativeFinalizerPtr() {
        return f30402b;
    }

    @Override // e.a.g.d
    public long getNativePtr() {
        return this.f30403c;
    }
}
