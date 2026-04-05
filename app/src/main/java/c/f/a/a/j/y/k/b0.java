package c.f.a.a.j.y.k;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import c.f.a.a.j.h;
import c.f.a.a.j.z.b;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b0 implements c.f.a.a.j.y.k.c, c.f.a.a.j.z.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.a.a.b f6330b = c.f.a.a.b.b("proto");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f6331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.a.j.a0.a f6332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.a.j.a0.a f6333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.a.j.y.k.d f6334f;

    public interface b<T, U> {
        U apply(T t);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f6336b;

        public c(String str, String str2) {
            this.f6335a = str;
            this.f6336b = str2;
        }
    }

    public interface d<T> {
        T a();
    }

    public b0(c.f.a.a.j.a0.a aVar, c.f.a.a.j.a0.a aVar2, c.f.a.a.j.y.k.d dVar, h0 h0Var) {
        this.f6331c = h0Var;
        this.f6332d = aVar;
        this.f6333e = aVar2;
        this.f6334f = dVar;
    }

    public static /* synthetic */ Long A0(b0 b0Var, c.f.a.a.j.m mVar, c.f.a.a.j.h hVar, SQLiteDatabase sQLiteDatabase) {
        if (b0Var.r()) {
            return -1L;
        }
        long jL = b0Var.l(sQLiteDatabase, mVar);
        int iE = b0Var.f6334f.e();
        byte[] bArrA = hVar.e().a();
        boolean z = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jL));
        contentValues.put("transport_name", hVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.k()));
        contentValues.put("payload_encoding", hVar.e().b().a());
        contentValues.put("code", hVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            double length = bArrA.length;
            double d2 = iE;
            Double.isNaN(length);
            Double.isNaN(d2);
            int iCeil = (int) Math.ceil(length / d2);
            for (int i2 = 1; i2 <= iCeil; i2++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i2 - 1) * iE, Math.min(i2 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i2));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : hVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ byte[] B0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr2 = (byte[]) arrayList.get(i2);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ Object C0(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Object D0(long j2, c.f.a.a.j.m mVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{mVar.b(), String.valueOf(c.f.a.a.j.b0.a.a(mVar.d()))}) < 1) {
            contentValues.put("backend_name", mVar.b());
            contentValues.put("priority", Integer.valueOf(c.f.a.a.j.b0.a.a(mVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static byte[] G0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static c.f.a.a.b J0(String str) {
        return str == null ? f6330b : c.f.a.a.b.b(str);
    }

    public static String K0(Iterable<i> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T L0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Boolean Q(b0 b0Var, c.f.a.a.j.m mVar, SQLiteDatabase sQLiteDatabase) {
        Long lP = b0Var.p(sQLiteDatabase, mVar);
        return lP == null ? Boolean.FALSE : (Boolean) L0(b0Var.m().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lP.toString()}), u.a());
    }

    public static /* synthetic */ List U(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(c.f.a.a.j.m.a().b(cursor.getString(1)).d(c.f.a.a.j.b0.a.b(cursor.getInt(2))).c(G0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ List V(SQLiteDatabase sQLiteDatabase) {
        return (List) L0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), t.a());
    }

    public static /* synthetic */ List c0(b0 b0Var, c.f.a.a.j.m mVar, SQLiteDatabase sQLiteDatabase) {
        List<i> listE0 = b0Var.E0(sQLiteDatabase, mVar);
        return b0Var.s(listE0, b0Var.F0(sQLiteDatabase, listE0));
    }

    public static /* synthetic */ Object s0(b0 b0Var, List list, c.f.a.a.j.m mVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            h.a aVarK = c.f.a.a.j.h.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            aVarK.h(z ? new c.f.a.a.j.g(J0(cursor.getString(4)), cursor.getBlob(5)) : new c.f.a.a.j.g(J0(cursor.getString(4)), b0Var.H0(j2)));
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(i.a(j2, mVar, aVarK.d()));
        }
        return null;
    }

    public static /* synthetic */ Object u(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Object v(Throwable th) {
        throw new c.f.a.a.j.z.a("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ SQLiteDatabase w(Throwable th) {
        throw new c.f.a.a.j.z.a("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Object w0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j2 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j2));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j2), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Long y(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    @Override // c.f.a.a.j.y.k.c
    public int A() {
        return ((Integer) q(m.a(this.f6332d.a() - this.f6334f.c()))).intValue();
    }

    @Override // c.f.a.a.j.y.k.c
    public void B(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            m().compileStatement("DELETE FROM events WHERE _id in " + K0(iterable)).execute();
        }
    }

    public final List<i> E0(SQLiteDatabase sQLiteDatabase, c.f.a.a.j.m mVar) {
        ArrayList arrayList = new ArrayList();
        Long lP = p(sQLiteDatabase, mVar);
        if (lP == null) {
            return arrayList;
        }
        L0(sQLiteDatabase.query("events", new String[]{TransferTable.COLUMN_ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lP.toString()}, null, null, null, String.valueOf(this.f6334f.d())), n.a(this, arrayList, mVar));
        return arrayList;
    }

    @Override // c.f.a.a.j.y.k.c
    public Iterable<i> F(c.f.a.a.j.m mVar) {
        return (Iterable) q(k.a(this, mVar));
    }

    public final Map<Long, Set<c>> F0(SQLiteDatabase sQLiteDatabase, List<i> list) {
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).c());
            if (i2 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        L0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), p.a(map));
        return map;
    }

    @Override // c.f.a.a.j.y.k.c
    public void G(c.f.a.a.j.m mVar, long j2) {
        q(j.a(j2, mVar));
    }

    public final byte[] H0(long j2) {
        return (byte[]) L0(m().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num"), o.a());
    }

    public final <T> T I0(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.f6333e.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f6333e.a() >= ((long) this.f6334f.b()) + jA) {
                    return bVar.apply(e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // c.f.a.a.j.y.k.c
    public Iterable<c.f.a.a.j.m> K() {
        return (Iterable) q(l.a());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6331c.close();
    }

    @Override // c.f.a.a.j.z.b
    public <T> T d(b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseM = m();
        i(sQLiteDatabaseM);
        try {
            T tExecute = aVar.execute();
            sQLiteDatabaseM.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseM.endTransaction();
        }
    }

    @Override // c.f.a.a.j.y.k.c
    public i h0(c.f.a.a.j.m mVar, c.f.a.a.j.h hVar) {
        c.f.a.a.j.w.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", mVar.d(), hVar.j(), mVar.b());
        long jLongValue = ((Long) q(w.a(this, mVar, hVar))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return i.a(jLongValue, mVar, hVar);
    }

    public final void i(SQLiteDatabase sQLiteDatabase) {
        I0(q.b(sQLiteDatabase), r.a());
    }

    public final long l(SQLiteDatabase sQLiteDatabase, c.f.a.a.j.m mVar) {
        Long lP = p(sQLiteDatabase, mVar);
        if (lP != null) {
            return lP.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", mVar.b());
        contentValues.put("priority", Integer.valueOf(c.f.a.a.j.b0.a.a(mVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (mVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(mVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public SQLiteDatabase m() {
        h0 h0Var = this.f6331c;
        h0Var.getClass();
        return (SQLiteDatabase) I0(s.b(h0Var), v.a());
    }

    @Override // c.f.a.a.j.y.k.c
    public long m0(c.f.a.a.j.m mVar) {
        return ((Long) L0(m().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{mVar.b(), String.valueOf(c.f.a.a.j.b0.a.a(mVar.d()))}), z.a())).longValue();
    }

    public final long n() {
        return m().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long o() {
        return m().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final Long p(SQLiteDatabase sQLiteDatabase, c.f.a.a.j.m mVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(mVar.b(), String.valueOf(c.f.a.a.j.b0.a.a(mVar.d()))));
        if (mVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(mVar.c(), 0));
        }
        return (Long) L0(sQLiteDatabase.query("transport_contexts", new String[]{TransferTable.COLUMN_ID}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), x.a());
    }

    public final <T> T q(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseM = m();
        sQLiteDatabaseM.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseM);
            sQLiteDatabaseM.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseM.endTransaction();
        }
    }

    @Override // c.f.a.a.j.y.k.c
    public boolean q0(c.f.a.a.j.m mVar) {
        return ((Boolean) q(a0.a(this, mVar))).booleanValue();
    }

    public final boolean r() {
        return n() * o() >= this.f6334f.f();
    }

    @Override // c.f.a.a.j.y.k.c
    public void r0(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            q(y.a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + K0(iterable)));
        }
    }

    public final List<i> s(List<i> list, Map<Long, Set<c>> map) {
        ListIterator<i> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            i next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                h.a aVarL = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarL.c(cVar.f6335a, cVar.f6336b);
                }
                listIterator.set(i.a(next.c(), next.d(), aVarL.d()));
            }
        }
        return list;
    }
}
