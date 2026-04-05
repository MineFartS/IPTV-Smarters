package c.f.a.b.c3;

import android.net.Uri;
import c.f.a.b.c3.a0;
import c.f.a.b.j3.x0;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.j3.h f6754a;

    public n(File file) {
        this.f6754a = new c.f.a.b.j3.h(file);
    }

    public static String c(Uri uri, String str) {
        return str != null ? str : uri.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3680(0xe60, float:5.157E-42)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L38
            r1 = 103407(0x193ef, float:1.44904E-40)
            if (r0 == r1) goto L2e
            r1 = 3075986(0x2eef92, float:4.310374E-39)
            if (r0 == r1) goto L24
            r1 = 1131547531(0x43720b8b, float:242.04509)
            if (r0 == r1) goto L1a
            goto L42
        L1a:
            java.lang.String r0 = "progressive"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L42
            r4 = 3
            goto L43
        L24:
            java.lang.String r0 = "dash"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L42
            r4 = 0
            goto L43
        L2e:
            java.lang.String r0 = "hls"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L42
            r4 = 1
            goto L43
        L38:
            java.lang.String r0 = "ss"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L42
            r4 = 2
            goto L43
        L42:
            r4 = -1
        L43:
            if (r4 == 0) goto L52
            if (r4 == r3) goto L4f
            if (r4 == r2) goto L4c
            java.lang.String r4 = "video/x-unknown"
            return r4
        L4c:
            java.lang.String r4 = "application/vnd.ms-sstr+xml"
            return r4
        L4f:
            java.lang.String r4 = "application/x-mpegURL"
            return r4
        L52:
            java.lang.String r4 = "application/dash+xml"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.c3.n.d(java.lang.String):java.lang.String");
    }

    public static a0 f(DataInputStream dataInputStream) throws IOException {
        byte[] bArr;
        String utf = dataInputStream.readUTF();
        int i2 = dataInputStream.readInt();
        Uri uri = Uri.parse(dataInputStream.readUTF());
        boolean z = dataInputStream.readBoolean();
        int i3 = dataInputStream.readInt();
        String utf2 = null;
        if (i3 != 0) {
            bArr = new byte[i3];
            dataInputStream.readFully(bArr);
        } else {
            bArr = null;
        }
        boolean z2 = true;
        boolean z3 = i2 == 0 && "progressive".equals(utf);
        ArrayList arrayList = new ArrayList();
        if (!z3) {
            int i4 = dataInputStream.readInt();
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(g(utf, i2, dataInputStream));
            }
        }
        if (i2 >= 2 || (!"dash".equals(utf) && !"hls".equals(utf) && !"ss".equals(utf))) {
            z2 = false;
        }
        if (!z2 && dataInputStream.readBoolean()) {
            utf2 = dataInputStream.readUTF();
        }
        String strC = i2 < 3 ? c(uri, utf2) : dataInputStream.readUTF();
        if (z) {
            throw new a0.c();
        }
        return new a0.b(strC, uri).e(d(utf)).f(arrayList).b(utf2).c(bArr).a();
    }

    public static i0 g(String str, int i2, DataInputStream dataInputStream) {
        return new i0((("hls".equals(str) || "ss".equals(str)) && i2 == 0) ? 0 : dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt());
    }

    public void a() {
        this.f6754a.a();
    }

    public boolean b() {
        return this.f6754a.c();
    }

    public a0[] e() {
        if (!b()) {
            return new a0[0];
        }
        try {
            InputStream inputStreamD = this.f6754a.d();
            DataInputStream dataInputStream = new DataInputStream(inputStreamD);
            int i2 = dataInputStream.readInt();
            if (i2 > 0) {
                throw new IOException("Unsupported action file version: " + i2);
            }
            int i3 = dataInputStream.readInt();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i3; i4++) {
                try {
                    arrayList.add(f(dataInputStream));
                } catch (a0.c unused) {
                }
            }
            a0[] a0VarArr = (a0[]) arrayList.toArray(new a0[0]);
            x0.o(inputStreamD);
            return a0VarArr;
        } catch (Throwable th) {
            x0.o(null);
            throw th;
        }
    }
}
