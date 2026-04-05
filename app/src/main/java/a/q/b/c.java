package a.q.b;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class c<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0065c<D> f3057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b<D> f3058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f3059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3060e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3061f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3062g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3063h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3064i = false;

    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            c.this.o();
        }
    }

    public interface b<D> {
        void a(c<D> cVar);
    }

    /* JADX INFO: renamed from: a.q.b.c$c, reason: collision with other inner class name */
    public interface InterfaceC0065c<D> {
        void a(c<D> cVar, D d2);
    }

    public c(Context context) {
        this.f3059d = context.getApplicationContext();
    }

    public void a() {
        this.f3061f = true;
        m();
    }

    public boolean b() {
        return n();
    }

    public void c() {
        this.f3064i = false;
    }

    public String d(D d2) {
        StringBuilder sb = new StringBuilder(64);
        a.i.q.b.a(d2, sb);
        sb.append("}");
        return sb.toString();
    }

    public void e() {
        b<D> bVar = this.f3058c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void f(D d2) {
        InterfaceC0065c<D> interfaceC0065c = this.f3057b;
        if (interfaceC0065c != null) {
            interfaceC0065c.a(this, d2);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f3056a);
        printWriter.print(" mListener=");
        printWriter.println(this.f3057b);
        if (this.f3060e || this.f3063h || this.f3064i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f3060e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f3063h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f3064i);
        }
        if (this.f3061f || this.f3062g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f3061f);
            printWriter.print(" mReset=");
            printWriter.println(this.f3062g);
        }
    }

    public void h() {
        p();
    }

    public Context i() {
        return this.f3059d;
    }

    public boolean j() {
        return this.f3061f;
    }

    public boolean k() {
        return this.f3062g;
    }

    public boolean l() {
        return this.f3060e;
    }

    public void m() {
    }

    public boolean n() {
        throw null;
    }

    public void o() {
        if (this.f3060e) {
            h();
        } else {
            this.f3063h = true;
        }
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
        throw null;
    }

    public void s() {
        throw null;
    }

    public void t(int i2, InterfaceC0065c<D> interfaceC0065c) {
        if (this.f3057b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f3057b = interfaceC0065c;
        this.f3056a = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        a.i.q.b.a(this, sb);
        sb.append(" id=");
        sb.append(this.f3056a);
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        q();
        this.f3062g = true;
        this.f3060e = false;
        this.f3061f = false;
        this.f3063h = false;
        this.f3064i = false;
    }

    public void v() {
        if (this.f3064i) {
            o();
        }
    }

    public final void w() {
        this.f3060e = true;
        this.f3062g = false;
        this.f3061f = false;
        r();
    }

    public void x() {
        this.f3060e = false;
        s();
    }

    public boolean y() {
        boolean z = this.f3063h;
        this.f3063h = false;
        this.f3064i |= z;
        return z;
    }

    public void z(InterfaceC0065c<D> interfaceC0065c) {
        InterfaceC0065c<D> interfaceC0065c2 = this.f3057b;
        if (interfaceC0065c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0065c2 != interfaceC0065c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f3057b = null;
    }
}
