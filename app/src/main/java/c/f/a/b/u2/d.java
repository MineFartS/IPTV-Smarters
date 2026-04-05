package c.f.a.b.u2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static String[] a(int i2, String str) {
        return new String[]{Integer.toString(i2), str};
    }

    public static int b(SQLiteDatabase sQLiteDatabase, int i2, String str) throws a {
        try {
        } catch (SQLException e2) {
            throw new a(e2);
        }
        if (!x0.Z0(sQLiteDatabase, "ExoPlayerVersions")) {
            return -1;
        }
        Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", a(i2, str), null, null, null);
        try {
            if (cursorQuery.getCount() == 0) {
                cursorQuery.close();
                return -1;
            }
            cursorQuery.moveToNext();
            int i3 = cursorQuery.getInt(0);
            cursorQuery.close();
            return i3;
        } finally {
        }
        throw new a(e2);
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i2, String str) throws a {
        try {
            if (x0.Z0(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", a(i2, str));
            }
        } catch (SQLException e2) {
            throw new a(e2);
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i2, String str, int i3) throws a {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i2));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i3));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e2) {
            throw new a(e2);
        }
    }
}
