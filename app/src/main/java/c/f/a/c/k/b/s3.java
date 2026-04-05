package c.f.a.c.k.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class s3 extends f4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r3 f14291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14292d;

    public s3(c5 c5Var) {
        super(c5Var);
        Context contextB = this.f14413a.b();
        this.f14413a.z();
        this.f14291c = new r3(this, contextB, "google_app_measurement_local.db");
    }

    @Override // c.f.a.c.k.b.f4
    public final boolean l() {
        return false;
    }

    public final void o() {
        int iDelete;
        g();
        try {
            SQLiteDatabase sQLiteDatabaseV = v();
            if (sQLiteDatabaseV == null || (iDelete = sQLiteDatabaseV.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f14413a.c().w().b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e2) {
            this.f14413a.c().o().b("Error resetting local analytics data. error", e2);
        }
    }

    public final boolean p(t tVar) {
        Parcel parcelObtain = Parcel.obtain();
        u.a(tVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return x(0, bArrMarshall);
        }
        this.f14413a.c().p().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean q(aa aaVar) {
        Parcel parcelObtain = Parcel.obtain();
        ba.a(aaVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return x(1, bArrMarshall);
        }
        this.f14413a.c().p().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean r(b bVar) {
        byte[] bArrL = this.f14413a.G().L(bVar);
        if (bArrL.length <= 131072) {
            return x(2, bArrL);
        }
        this.f14413a.c().p().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0230 A[PHI: r9 r15
  0x0230: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:144:0x021e, B:159:0x024b, B:152:0x022e] A[DONT_GENERATE, DONT_INLINE]
  0x0230: PHI (r15v7 android.database.sqlite.SQLiteDatabase) = 
  (r15v5 android.database.sqlite.SQLiteDatabase)
  (r15v6 android.database.sqlite.SQLiteDatabase)
  (r15v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:144:0x021e, B:159:0x024b, B:152:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x024e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x024e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x024e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<c.f.a.c.f.q.w.a> s(int r24) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.s3.s(int):java.util.List");
    }

    public final boolean t() {
        return x(3, new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[PHI: r4
  0x0069: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:29:0x0060, B:35:0x007c, B:32:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.g()
            boolean r1 = r10.f14292d
            r2 = 0
            if (r1 == 0) goto Lb
            return r2
        Lb:
            boolean r1 = r10.w()
            if (r1 == 0) goto L97
            r1 = 5
            r3 = 0
            r4 = 5
        L14:
            if (r3 >= r1) goto L88
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.v()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            if (r5 != 0) goto L21
            r10.f14292d = r6     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            return r2
        L21:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r8 = 3
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r7[r2] = r8     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            java.lang.String r8 = "messages"
            java.lang.String r9 = "type == ?"
            r5.delete(r8, r9, r7)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.endTransaction()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.close()
            return r6
        L3e:
            r0 = move-exception
            goto L82
        L40:
            r7 = move-exception
            goto L44
        L42:
            r7 = move-exception
            goto L6d
        L44:
            if (r5 == 0) goto L4f
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L3e
            if (r8 == 0) goto L4f
            r5.endTransaction()     // Catch: java.lang.Throwable -> L3e
        L4f:
            c.f.a.c.k.b.c5 r8 = r10.f14413a     // Catch: java.lang.Throwable -> L3e
            c.f.a.c.k.b.y3 r8 = r8.c()     // Catch: java.lang.Throwable -> L3e
            c.f.a.c.k.b.w3 r8 = r8.o()     // Catch: java.lang.Throwable -> L3e
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L3e
            r10.f14292d = r6     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L7f
            goto L69
        L61:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L3e
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L3e
            int r4 = r4 + 20
            if (r5 == 0) goto L7f
        L69:
            r5.close()
            goto L7f
        L6d:
            c.f.a.c.k.b.c5 r8 = r10.f14413a     // Catch: java.lang.Throwable -> L3e
            c.f.a.c.k.b.y3 r8 = r8.c()     // Catch: java.lang.Throwable -> L3e
            c.f.a.c.k.b.w3 r8 = r8.o()     // Catch: java.lang.Throwable -> L3e
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L3e
            r10.f14292d = r6     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L7f
            goto L69
        L7f:
            int r3 = r3 + 1
            goto L14
        L82:
            if (r5 == 0) goto L87
            r5.close()
        L87:
            throw r0
        L88:
            c.f.a.c.k.b.c5 r0 = r10.f14413a
            c.f.a.c.k.b.y3 r0 = r0.c()
            c.f.a.c.k.b.w3 r0 = r0.r()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.s3.u():boolean");
    }

    public final SQLiteDatabase v() {
        if (this.f14292d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f14291c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f14292d = true;
        return null;
    }

    public final boolean w() {
        Context contextB = this.f14413a.b();
        this.f14413a.z();
        return contextB.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116 A[PHI: r8
  0x0116: PHI (r8v3 android.database.sqlite.SQLiteDatabase) = (r8v2 android.database.sqlite.SQLiteDatabase), (r8v4 android.database.sqlite.SQLiteDatabase) binds: [B:55:0x00e6, B:70:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(int r17, byte[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.s3.x(int, byte[]):boolean");
    }
}
