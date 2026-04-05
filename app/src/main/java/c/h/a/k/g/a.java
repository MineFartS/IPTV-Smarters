package c.h.a.k.g;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import c.h.a.i.q.f;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f17891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, String> f17892b = new HashMap<>();

    public final String a(String str) {
        byte[] bytes = new byte[0];
        if (Build.VERSION.SDK_INT >= 19) {
            bytes = str.getBytes(StandardCharsets.UTF_8);
        }
        return Base64.encodeToString(bytes, 0).replace("\n", BuildConfig.FLAVOR);
    }

    public String b(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    inputStream.close();
                    return sb.toString();
                }
                sb.append(line + "\n");
            }
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public String c(InputStream inputStream, Context context) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String str = BuildConfig.FLAVOR;
            do {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if ((line.contains("http://") && !line.contains("tvg-logo")) || (line.contains("https://") && !line.contains("tvg-logo"))) {
                    str = line;
                }
            } while (str.equals(BuildConfig.FLAVOR));
            inputStream.close();
            return str;
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025a A[PHI: r37
  0x025a: PHI (r37v23 java.lang.String) = (r37v22 java.lang.String), (r37v24 java.lang.String), (r37v24 java.lang.String) binds: [B:59:0x017d, B:1153:0x025a, B:102:0x0258] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0278 A[Catch: Exception -> 0x025a, TryCatch #64 {Exception -> 0x025a, blocks: (B:64:0x0197, B:66:0x019d, B:69:0x01a4, B:90:0x0227, B:101:0x0254, B:105:0x0278, B:107:0x0288, B:111:0x0292, B:113:0x0298, B:114:0x02a6, B:115:0x02aa, B:110:0x028f, B:116:0x02b3, B:118:0x02be, B:121:0x02c7, B:123:0x02cf, B:126:0x02dc, B:124:0x02d3, B:125:0x02d7, B:96:0x0240, B:74:0x01bd, B:78:0x01d2, B:84:0x01fe, B:88:0x0217, B:83:0x01f9, B:82:0x01eb, B:80:0x01d8, B:86:0x0204), top: B:1321:0x0197, inners: #5, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:1401:0x022f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7 A[Catch: Exception -> 0x049d, TRY_LEAVE, TryCatch #35 {Exception -> 0x049d, blocks: (B:16:0x00d1, B:18:0x00d7, B:22:0x00e7), top: B:1263:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0827 A[PHI: r9 r13 r22 r70
  0x0827: PHI (r9v27 java.lang.String) = (r9v26 java.lang.String), (r9v28 java.lang.String) binds: [B:250:0x0825, B:246:0x0814] A[DONT_GENERATE, DONT_INLINE]
  0x0827: PHI (r13v43 java.lang.String) = (r13v42 java.lang.String), (r13v44 java.lang.String) binds: [B:250:0x0825, B:246:0x0814] A[DONT_GENERATE, DONT_INLINE]
  0x0827: PHI (r22v38 java.util.ArrayList<c.h.a.i.f>) = (r22v37 java.util.ArrayList<c.h.a.i.f>), (r22v39 java.util.ArrayList<c.h.a.i.f>) binds: [B:250:0x0825, B:246:0x0814] A[DONT_GENERATE, DONT_INLINE]
  0x0827: PHI (r70v9 java.util.ArrayList<c.h.a.i.f>) = (r70v8 java.util.ArrayList<c.h.a.i.f>), (r70v10 java.util.ArrayList<c.h.a.i.f>) binds: [B:250:0x0825, B:246:0x0814] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0d24  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0f06  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x10ec  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x12be  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x1490  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x1660  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x1832  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x1a04  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x1bc3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d2 A[Catch: Exception -> 0x025a, TRY_ENTER, TRY_LEAVE, TryCatch #64 {Exception -> 0x025a, blocks: (B:64:0x0197, B:66:0x019d, B:69:0x01a4, B:90:0x0227, B:101:0x0254, B:105:0x0278, B:107:0x0288, B:111:0x0292, B:113:0x0298, B:114:0x02a6, B:115:0x02aa, B:110:0x028f, B:116:0x02b3, B:118:0x02be, B:121:0x02c7, B:123:0x02cf, B:126:0x02dc, B:124:0x02d3, B:125:0x02d7, B:96:0x0240, B:74:0x01bd, B:78:0x01d2, B:84:0x01fe, B:88:0x0217, B:83:0x01f9, B:82:0x01eb, B:80:0x01d8, B:86:0x0204), top: B:1321:0x0197, inners: #5, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:799:0x1d82  */
    /* JADX WARN: Removed duplicated region for block: B:848:0x1f41  */
    /* JADX WARN: Removed duplicated region for block: B:897:0x2100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0240 A[Catch: Exception -> 0x025a, TRY_ENTER, TRY_LEAVE, TryCatch #64 {Exception -> 0x025a, blocks: (B:64:0x0197, B:66:0x019d, B:69:0x01a4, B:90:0x0227, B:101:0x0254, B:105:0x0278, B:107:0x0288, B:111:0x0292, B:113:0x0298, B:114:0x02a6, B:115:0x02aa, B:110:0x028f, B:116:0x02b3, B:118:0x02be, B:121:0x02c7, B:123:0x02cf, B:126:0x02dc, B:124:0x02d3, B:125:0x02d7, B:96:0x0240, B:74:0x01bd, B:78:0x01d2, B:84:0x01fe, B:88:0x0217, B:83:0x01f9, B:82:0x01eb, B:80:0x01d8, B:86:0x0204), top: B:1321:0x0197, inners: #5, #16 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(java.io.InputStream r73, android.content.Context r74) {
        /*
            Method dump skipped, instruction units count: 10056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.k.g.a.d(java.io.InputStream, android.content.Context):boolean");
    }
}
