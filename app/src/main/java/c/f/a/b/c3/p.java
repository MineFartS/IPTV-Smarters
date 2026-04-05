package c.f.a.b.c3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import c.f.a.b.c3.a0;
import c.f.a.b.j3.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.ChartFactory;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f6755a = p(3, 4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f6756b = {Name.MARK, "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.b.u2.b f6759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f6760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6761g;

    public static final class b implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cursor f6762b;

        public b(Cursor cursor) {
            this.f6762b = cursor;
        }

        @Override // c.f.a.b.c3.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f6762b.close();
        }

        @Override // c.f.a.b.c3.t
        public /* synthetic */ boolean g0() {
            return s.a(this);
        }

        @Override // c.f.a.b.c3.t
        public int getPosition() {
            return this.f6762b.getPosition();
        }

        @Override // c.f.a.b.c3.t
        public boolean j(int i2) {
            return this.f6762b.moveToPosition(i2);
        }

        @Override // c.f.a.b.c3.t
        public r k0() {
            return p.n(this.f6762b);
        }
    }

    public p(c.f.a.b.u2.b bVar) {
        this(bVar, BuildConfig.FLAVOR);
    }

    public p(c.f.a.b.u2.b bVar, String str) {
        this.f6757c = str;
        this.f6759e = bVar;
        this.f6758d = "ExoPlayerDownloads" + str;
        this.f6760f = new Object();
    }

    public static List<i0> j(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : x0.U0(str, ",")) {
            String[] strArrU0 = x0.U0(str2, "\\.");
            c.f.a.b.j3.g.g(strArrU0.length == 3);
            arrayList.add(new i0(Integer.parseInt(strArrU0[0]), Integer.parseInt(strArrU0[1]), Integer.parseInt(strArrU0[2])));
        }
        return arrayList;
    }

    public static String k(List<i0> list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            i0 i0Var = list.get(i2);
            sb.append(i0Var.f6746b);
            sb.append('.');
            sb.append(i0Var.f6747c);
            sb.append('.');
            sb.append(i0Var.f6748d);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static r n(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        a0.b bVarF = new a0.b((String) c.f.a.b.j3.g.e(cursor.getString(0)), Uri.parse((String) c.f.a.b.j3.g.e(cursor.getString(2)))).e(cursor.getString(1)).f(j(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        a0 a0VarA = bVarF.d(blob).b(cursor.getString(4)).c(cursor.getBlob(5)).a();
        z zVar = new z();
        zVar.f6839a = cursor.getLong(13);
        zVar.f6840b = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        return new r(a0VarA, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2 == 4 ? cursor.getInt(11) : 0, zVar);
    }

    public static r o(Cursor cursor) {
        a0 a0VarA = new a0.b((String) c.f.a.b.j3.g.e(cursor.getString(0)), Uri.parse((String) c.f.a.b.j3.g.e(cursor.getString(2)))).e(q(cursor.getString(1))).f(j(cursor.getString(3))).b(cursor.getString(4)).c(cursor.getBlob(5)).a();
        z zVar = new z();
        zVar.f6839a = cursor.getLong(13);
        zVar.f6840b = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        return new r(a0VarA, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2 == 4 ? cursor.getInt(11) : 0, zVar);
    }

    public static String p(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state");
        sb.append(" IN (");
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            sb.append(iArr[i2]);
        }
        sb.append(')');
        return sb.toString();
    }

    public static String q(String str) {
        return "dash".equals(str) ? "application/dash+xml" : "hls".equals(str) ? "application/x-mpegURL" : "ss".equals(str) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
    }

    @Override // c.f.a.b.c3.w
    public t a(int... iArr) throws c.f.a.b.u2.a {
        l();
        return new b(m(p(iArr), null));
    }

    @Override // c.f.a.b.c3.j0
    public void b() throws c.f.a.b.u2.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f6759e.getWritableDatabase().update(this.f6758d, contentValues, null, null);
        } catch (SQLException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
    }

    @Override // c.f.a.b.c3.j0
    public void c(String str, int i2) throws c.f.a.b.u2.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i2));
            this.f6759e.getWritableDatabase().update(this.f6758d, contentValues, f6755a + " AND id = ?", new String[]{str});
        } catch (SQLException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
    }

    @Override // c.f.a.b.c3.j0
    public void d() throws c.f.a.b.u2.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f6759e.getWritableDatabase().update(this.f6758d, contentValues, "state = 2", null);
        } catch (SQLException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
    }

    @Override // c.f.a.b.c3.w
    public r e(String str) throws c.f.a.b.u2.a {
        l();
        try {
            Cursor cursorM = m("id = ?", new String[]{str});
            try {
                if (cursorM.getCount() == 0) {
                    cursorM.close();
                    return null;
                }
                cursorM.moveToNext();
                r rVarN = n(cursorM);
                cursorM.close();
                return rVarN;
            } finally {
            }
        } catch (SQLiteException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
        throw new c.f.a.b.u2.a(e2);
    }

    @Override // c.f.a.b.c3.j0
    public void f(r rVar) throws c.f.a.b.u2.a {
        l();
        try {
            s(rVar, this.f6759e.getWritableDatabase());
        } catch (SQLiteException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
    }

    @Override // c.f.a.b.c3.j0
    public void g(String str) throws c.f.a.b.u2.a {
        l();
        try {
            this.f6759e.getWritableDatabase().delete(this.f6758d, "id = ?", new String[]{str});
        } catch (SQLiteException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
    }

    @Override // c.f.a.b.c3.j0
    public void h(int i2) throws c.f.a.b.u2.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i2));
            this.f6759e.getWritableDatabase().update(this.f6758d, contentValues, f6755a, null);
        } catch (SQLException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
    }

    public final void l() {
        synchronized (this.f6760f) {
            if (this.f6761g) {
                return;
            }
            try {
                int iB = c.f.a.b.u2.d.b(this.f6759e.getReadableDatabase(), 0, this.f6757c);
                if (iB != 3) {
                    SQLiteDatabase writableDatabase = this.f6759e.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        c.f.a.b.u2.d.d(writableDatabase, 0, this.f6757c, 3);
                        List<r> listR = iB == 2 ? r(writableDatabase) : new ArrayList<>();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f6758d);
                        writableDatabase.execSQL("CREATE TABLE " + this.f6758d + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator<r> it = listR.iterator();
                        while (it.hasNext()) {
                            s(it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.f6761g = true;
            } catch (SQLException e2) {
                throw new c.f.a.b.u2.a(e2);
            }
        }
    }

    public final Cursor m(String str, String[] strArr) throws c.f.a.b.u2.a {
        try {
            return this.f6759e.getReadableDatabase().query(this.f6758d, f6756b, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
    }

    public final List<r> r(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!x0.Z0(sQLiteDatabase, this.f6758d)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.f6758d, new String[]{Name.MARK, ChartFactory.TITLE, "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(o(cursorQuery));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th2;
                }
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void s(r rVar, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = rVar.f6766a.f6667f;
        if (bArr == null) {
            bArr = x0.f9301f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(Name.MARK, rVar.f6766a.f6663b);
        contentValues.put("mime_type", rVar.f6766a.f6665d);
        contentValues.put("uri", rVar.f6766a.f6664c.toString());
        contentValues.put("stream_keys", k(rVar.f6766a.f6666e));
        contentValues.put("custom_cache_key", rVar.f6766a.f6668g);
        contentValues.put("data", rVar.f6766a.f6669h);
        contentValues.put("state", Integer.valueOf(rVar.f6767b));
        contentValues.put("start_time_ms", Long.valueOf(rVar.f6768c));
        contentValues.put("update_time_ms", Long.valueOf(rVar.f6769d));
        contentValues.put("content_length", Long.valueOf(rVar.f6770e));
        contentValues.put("stop_reason", Integer.valueOf(rVar.f6771f));
        contentValues.put("failure_reason", Integer.valueOf(rVar.f6772g));
        contentValues.put("percent_downloaded", Float.valueOf(rVar.b()));
        contentValues.put("bytes_downloaded", Long.valueOf(rVar.a()));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f6758d, null, contentValues);
    }
}
