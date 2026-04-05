package c.f.a.c.k.b;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ua extends p9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set<Integer> f14374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<Integer, pa> f14375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f14376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f14377h;

    public ua(x9 x9Var) {
        super(x9Var);
    }

    @Override // c.f.a.c.k.b.p9
    public final boolean k() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:403:0x0a68, code lost:
    
        r7 = r63.f14413a.c().r();
        r9 = c.f.a.c.k.b.y3.x(r63.f14373d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0a7c, code lost:
    
        if (r8.w() == false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0a7e, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0a87, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0a88, code lost:
    
        r7.c("Invalid property filter ID. appId, id", r9, java.lang.String.valueOf(r8));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x078d A[Catch: all -> 0x0753, TRY_LEAVE, TryCatch #27 {all -> 0x0753, blocks: (B:254:0x06e5, B:256:0x06eb, B:257:0x06f0, B:259:0x0701, B:262:0x0713, B:264:0x0720, B:267:0x0738, B:290:0x076b, B:292:0x078d, B:266:0x0725, B:272:0x0748), top: B:441:0x06e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9 A[Catch: SQLiteException -> 0x0238, all -> 0x0b4b, TryCatch #23 {SQLiteException -> 0x0238, blocks: (B:58:0x01b3, B:60:0x01b9, B:62:0x01ca, B:65:0x01dd, B:66:0x01e2, B:67:0x01ec, B:68:0x01fc, B:70:0x0209), top: B:462:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01dd A[Catch: SQLiteException -> 0x0238, all -> 0x0b4b, TRY_ENTER, TryCatch #23 {SQLiteException -> 0x0238, blocks: (B:58:0x01b3, B:60:0x01b9, B:62:0x01ca, B:65:0x01dd, B:66:0x01e2, B:67:0x01ec, B:68:0x01fc, B:70:0x0209), top: B:462:0x01b3 }] */
    /* JADX WARN: Type inference failed for: r4v30, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v70, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v75, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r5v77, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<c.f.a.c.j.h.l1> l(java.lang.String r64, java.util.List<c.f.a.c.j.h.q1> r65, java.util.List<c.f.a.c.j.h.j2> r66, java.lang.Long r67, java.lang.Long r68) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.ua.l(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    public final pa m(int i2) {
        Map<Integer, pa> map = this.f14375f;
        Integer numValueOf = Integer.valueOf(i2);
        if (map.containsKey(numValueOf)) {
            return this.f14375f.get(numValueOf);
        }
        pa paVar = new pa(this, this.f14373d, null);
        this.f14375f.put(numValueOf, paVar);
        return paVar;
    }

    public final boolean o(int i2, int i3) {
        Map<Integer, pa> map = this.f14375f;
        Integer numValueOf = Integer.valueOf(i2);
        if (map.get(numValueOf) == null) {
            return false;
        }
        return this.f14375f.get(numValueOf).f14232d.get(i3);
    }
}
