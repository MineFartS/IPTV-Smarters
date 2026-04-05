package a.i.r.i0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0046c f2079a;

    public static final class a implements InterfaceC0046c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputContentInfo f2080a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f2080a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f2080a = (InputContentInfo) obj;
        }

        @Override // a.i.r.i0.c.InterfaceC0046c
        public Uri a() {
            return this.f2080a.getContentUri();
        }

        @Override // a.i.r.i0.c.InterfaceC0046c
        public void b() {
            this.f2080a.requestPermission();
        }

        @Override // a.i.r.i0.c.InterfaceC0046c
        public Uri c() {
            return this.f2080a.getLinkUri();
        }

        @Override // a.i.r.i0.c.InterfaceC0046c
        public Object d() {
            return this.f2080a;
        }

        @Override // a.i.r.i0.c.InterfaceC0046c
        public ClipDescription getDescription() {
            return this.f2080a.getDescription();
        }
    }

    public static final class b implements InterfaceC0046c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f2081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ClipDescription f2082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f2083c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f2081a = uri;
            this.f2082b = clipDescription;
            this.f2083c = uri2;
        }

        @Override // a.i.r.i0.c.InterfaceC0046c
        public Uri a() {
            return this.f2081a;
        }

        @Override // a.i.r.i0.c.InterfaceC0046c
        public void b() {
        }

        @Override // a.i.r.i0.c.InterfaceC0046c
        public Uri c() {
            return this.f2083c;
        }

        @Override // a.i.r.i0.c.InterfaceC0046c
        public Object d() {
            return null;
        }

        @Override // a.i.r.i0.c.InterfaceC0046c
        public ClipDescription getDescription() {
            return this.f2082b;
        }
    }

    /* JADX INFO: renamed from: a.i.r.i0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0046c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public c(InterfaceC0046c interfaceC0046c) {
        this.f2079a = interfaceC0046c;
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f2079a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public static c f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f2079a.a();
    }

    public ClipDescription b() {
        return this.f2079a.getDescription();
    }

    public Uri c() {
        return this.f2079a.c();
    }

    public void d() {
        this.f2079a.b();
    }

    public Object e() {
        return this.f2079a.d();
    }
}
