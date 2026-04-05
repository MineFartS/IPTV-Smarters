package c.c.b.w;

import c.c.b.b;
import c.c.b.n;
import c.c.b.r;
import c.c.b.s;
import c.c.b.u;
import c.c.b.v;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class b implements c.c.b.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f5267a = v.f5259b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public final g f5268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f5270d;

    public b(a aVar) {
        this(aVar, new c(ProgressEvent.PART_FAILED_EVENT_CODE));
    }

    public b(a aVar, c cVar) {
        this.f5269c = aVar;
        this.f5268b = aVar;
        this.f5270d = cVar;
    }

    public static void b(String str, n<?> nVar, u uVar) throws u {
        r rVarE = nVar.E();
        int iF = nVar.F();
        try {
            rVarE.a(uVar);
            nVar.b(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iF)));
        } catch (u e2) {
            nVar.b(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iF)));
            throw e2;
        }
    }

    public static List<c.c.b.g> c(List<c.c.b.g> list, b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<c.c.b.g> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<c.c.b.g> list2 = aVar.f5190h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (c.c.b.g gVar : aVar.f5190h) {
                    if (!treeSet.contains(gVar.a())) {
                        arrayList.add(gVar);
                    }
                }
            }
        } else if (!aVar.f5189g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f5189g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new c.c.b.g(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
    
        throw new java.io.IOException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0126, code lost:
    
        throw new c.c.b.s(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [c.c.b.w.b] */
    @Override // c.c.b.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.c.b.k a(c.c.b.n<?> r29) throws c.c.b.u {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.b.w.b.a(c.c.b.n):c.c.b.k");
    }

    public final Map<String, String> d(b.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        String str = aVar.f5184b;
        if (str != null) {
            map.put(Headers.GET_OBJECT_IF_NONE_MATCH, str);
        }
        long j2 = aVar.f5186d;
        if (j2 > 0) {
            map.put(Headers.GET_OBJECT_IF_MODIFIED_SINCE, e.a(j2));
        }
        return map;
    }

    public final byte[] e(InputStream inputStream, int i2) throws IOException {
        k kVar = new k(this.f5270d, i2);
        try {
            if (inputStream == null) {
                throw new s();
            }
            byte[] bArrA = this.f5270d.a(1024);
            while (true) {
                int i3 = inputStream.read(bArrA);
                if (i3 == -1) {
                    break;
                }
                kVar.write(bArrA, 0, i3);
            }
            byte[] byteArray = kVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused) {
                v.e("Error occurred when closing InputStream", new Object[0]);
            }
            this.f5270d.b(bArrA);
            kVar.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    v.e("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.f5270d.b(null);
            kVar.close();
            throw th;
        }
    }

    public final void f(long j2, n<?> nVar, byte[] bArr, int i2) {
        if (f5267a || j2 > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = nVar;
            objArr[1] = Long.valueOf(j2);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : Constants.NULL_VERSION_ID;
            objArr[3] = Integer.valueOf(i2);
            objArr[4] = Integer.valueOf(nVar.E().c());
            v.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }
}
