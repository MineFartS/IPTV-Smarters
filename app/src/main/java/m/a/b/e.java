package m.a.b;

import android.os.Build;
import m.a.b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements c.b {
    @Override // m.a.b.c.b
    public String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // m.a.b.c.b
    public String b(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // m.a.b.c.b
    public String[] c() {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr.length > 0) {
                return strArr;
            }
        }
        String str = Build.CPU_ABI2;
        return !f.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // m.a.b.c.b
    public void d(String str) {
        System.load(str);
    }

    @Override // m.a.b.c.b
    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }
}
