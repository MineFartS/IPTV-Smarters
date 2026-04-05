package m.a.b;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    public interface a {
        void a(Context context, String[] strArr, String str, File file, m.a.b.d dVar);
    }

    public interface b {
        String a(String str);

        String b(String str);

        String[] c();

        void d(String str);

        void loadLibrary(String str);
    }

    /* JADX INFO: renamed from: m.a.b.c$c, reason: collision with other inner class name */
    public interface InterfaceC0318c {
        void a();

        void b(Throwable th);
    }

    public interface d {
        void a(String str);
    }

    public static void a(Context context, String str) {
        b(context, str, null, null);
    }

    public static void b(Context context, String str, String str2, InterfaceC0318c interfaceC0318c) {
        new m.a.b.d().f(context, str, str2, interfaceC0318c);
    }
}
