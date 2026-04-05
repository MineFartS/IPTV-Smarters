package a.q.a;

import a.p.k;
import a.p.y;
import a.q.b.c;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a.q.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0062a<D> {
        void a(c<D> cVar, D d2);

        c<D> b(int i2, Bundle bundle);

        void c(c<D> cVar);
    }

    public static <T extends k & y> a b(T t) {
        return new b(t, t.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> c<D> c(int i2, Bundle bundle, InterfaceC0062a<D> interfaceC0062a);

    public abstract void d();
}
