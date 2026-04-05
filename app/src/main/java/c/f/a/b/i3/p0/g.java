package c.f.a.b.i3.p0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f8987a = {"name", Name.LENGTH, "last_touch_timestamp"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.u2.b f8988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8989c;

    public g(c.f.a.b.u2.b bVar) {
        this.f8988b = bVar;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    public static String d(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    public Map<String, f> b() throws c.f.a.b.u2.a {
        try {
            Cursor cursorC = c();
            try {
                HashMap map = new HashMap(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    map.put((String) c.f.a.b.j3.g.e(cursorC.getString(0)), new f(cursorC.getLong(1), cursorC.getLong(2)));
                }
                cursorC.close();
                return map;
            } finally {
            }
        } catch (SQLException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
    }

    public final Cursor c() {
        c.f.a.b.j3.g.e(this.f8989c);
        return this.f8988b.getReadableDatabase().query(this.f8989c, f8987a, null, null, null, null, null);
    }

    public void e(long j2) throws c.f.a.b.u2.a {
        try {
            String hexString = Long.toHexString(j2);
            this.f8989c = d(hexString);
            if (c.f.a.b.u2.d.b(this.f8988b.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f8988b.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    c.f.a.b.u2.d.d(writableDatabase, 2, hexString, 1);
                    a(writableDatabase, this.f8989c);
                    writableDatabase.execSQL("CREATE TABLE " + this.f8989c + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
    }

    public void f(String str) throws c.f.a.b.u2.a {
        c.f.a.b.j3.g.e(this.f8989c);
        try {
            this.f8988b.getWritableDatabase().delete(this.f8989c, "name = ?", new String[]{str});
        } catch (SQLException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
    }

    public void g(Set<String> set) throws c.f.a.b.u2.a {
        c.f.a.b.j3.g.e(this.f8989c);
        try {
            SQLiteDatabase writableDatabase = this.f8988b.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f8989c, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
    }

    public void h(String str, long j2, long j3) throws c.f.a.b.u2.a {
        c.f.a.b.j3.g.e(this.f8989c);
        try {
            SQLiteDatabase writableDatabase = this.f8988b.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(Name.LENGTH, Long.valueOf(j2));
            contentValues.put("last_touch_timestamp", Long.valueOf(j3));
            writableDatabase.replaceOrThrow(this.f8989c, null, contentValues);
        } catch (SQLException e2) {
            throw new c.f.a.b.u2.a(e2);
        }
    }
}
