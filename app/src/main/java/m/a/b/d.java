package m.a.b;

import android.content.Context;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import m.a.b.c;
import m.a.b.g.i;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f31131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.b f31132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f31133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.d f31136f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f31137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f31138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f31139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c.InterfaceC0318c f31140e;

        public a(Context context, String str, String str2, c.InterfaceC0318c interfaceC0318c) {
            this.f31137b = context;
            this.f31138c = str;
            this.f31139d = str2;
            this.f31140e = interfaceC0318c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d.this.g(this.f31137b, this.f31138c, this.f31139d);
                this.f31140e.a();
            } catch (UnsatisfiedLinkError | m.a.b.b e2) {
                this.f31140e.b(e2);
            }
        }
    }

    public class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31142a;

        public b(String str) {
            this.f31142a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f31142a);
        }
    }

    public d() {
        this(new e(), new m.a.b.a());
    }

    public d(c.b bVar, c.a aVar) {
        this.f31131a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f31132b = bVar;
        this.f31133c = aVar;
    }

    public void b(Context context, String str, String str2) {
        File fileC = c(context);
        File fileD = d(context, str, str2);
        File[] fileArrListFiles = fileC.listFiles(new b(this.f31132b.a(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f31134d || !file.getAbsolutePath().equals(fileD.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public File c(Context context) {
        return context.getDir("lib", 0);
    }

    public File d(Context context, String str, String str2) {
        String strA = this.f31132b.a(str);
        if (f.a(str2)) {
            return new File(c(context), strA);
        }
        return new File(c(context), strA + InstructionFileId.DOT + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, c.InterfaceC0318c interfaceC0318c) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (f.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        i("Beginning load of %s...", str);
        if (interfaceC0318c == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, interfaceC0318c)).start();
        }
    }

    public final void g(Context context, String str, String str2) throws Throwable {
        i iVar;
        if (this.f31131a.contains(str) && !this.f31134d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f31132b.loadLibrary(str);
            this.f31131a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e2) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e2));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileD = d(context, str, str2);
            if (!fileD.exists() || this.f31134d) {
                if (this.f31134d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                this.f31133c.a(context, this.f31132b.c(), this.f31132b.a(str), fileD, this);
            }
            try {
                if (this.f31135e) {
                    i iVar2 = null;
                    try {
                        iVar = new i(fileD);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        List<String> listL = iVar.l();
                        iVar.close();
                        Iterator<String> it = listL.iterator();
                        while (it.hasNext()) {
                            e(context, this.f31132b.b(it.next()));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        iVar2 = iVar;
                        iVar2.close();
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
            this.f31132b.d(fileD.getAbsolutePath());
            this.f31131a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    public void h(String str) {
        c.d dVar = this.f31136f;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }
}
