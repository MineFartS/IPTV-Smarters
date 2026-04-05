package c.h.a.i.q;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f17220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17224g;

    public a(Context context) {
        super(context, "iptv_smarters_tv.db", (SQLiteDatabase.CursorFactory) null, 3);
        this.f17221d = "CREATE TABLE IF NOT EXISTS iptv_favourites(id INTEGER PRIMARY KEY,type TEXT,streamID TEXT,categoryID TEXT,name TEXT,user_id_referred TEXT,num TEXT)";
        this.f17222e = "ALTER TABLE iptv_favourites ADD COLUMN name TEXT;";
        this.f17223f = "ALTER TABLE iptv_favourites ADD COLUMN user_id_referred TEXT;";
        this.f17224g = "ALTER TABLE iptv_favourites ADD COLUMN num TEXT;";
        this.f17219b = context;
    }

    public void d(ArrayList<c.h.a.i.f> arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        int iZ = m.z(this.f17219b);
        try {
            ContentValues contentValues = new ContentValues();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                contentValues.put("type", arrayList.get(i2).Z().equals("movie") ? "vod" : arrayList.get(i2).Z());
                contentValues.put("streamID", arrayList.get(i2).Y());
                contentValues.put("categoryID", arrayList.get(i2).g());
                contentValues.put("name", arrayList.get(i2).getName());
                contentValues.put("user_id_referred", Integer.valueOf(iZ));
                contentValues.put("num", arrayList.get(i2).P());
                writableDatabase.insert("iptv_favourites", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            writableDatabase.endTransaction();
            Log.w("msg", "exception");
        }
    }

    public void i(c.h.a.i.b bVar, String str) {
        try {
            this.f17220c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", str);
            contentValues.put("streamID", Integer.valueOf(bVar.e()));
            contentValues.put("categoryID", bVar.a());
            contentValues.put("name", bVar.c());
            contentValues.put("user_id_referred", Integer.valueOf(bVar.g()));
            contentValues.put("num", bVar.d());
            this.f17220c.insert("iptv_favourites", null, contentValues);
            this.f17220c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public ArrayList<c.h.a.i.b> l(int i2, String str, String str2, int i3) {
        int i4;
        ArrayList<c.h.a.i.b> arrayList = new ArrayList<>();
        try {
            String str3 = "SELECT  * FROM iptv_favourites WHERE streamID='" + i2 + "' AND categoryID='" + str + "' AND type LIKE '%" + str2 + "%'  AND user_id_referred=" + i3 + BuildConfig.FLAVOR;
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17220c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(str3, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    try {
                        i4 = Integer.parseInt(cursorRawQuery.getString(2));
                    } catch (NumberFormatException unused) {
                        i4 = -1;
                    }
                    c.h.a.i.b bVar = new c.h.a.i.b();
                    bVar.j(Integer.parseInt(cursorRawQuery.getString(0)));
                    bVar.n(cursorRawQuery.getString(1));
                    bVar.m(i4);
                    bVar.h(cursorRawQuery.getString(3));
                    arrayList.add(bVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused2) {
            Log.w("msg", "exception");
            return arrayList;
        }
    }

    public void m(int i2) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f17220c = writableDatabase;
            writableDatabase.delete("iptv_favourites", "user_id_referred='" + i2 + "'", null);
            this.f17220c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void n(String str) {
        try {
            int iZ = m.z(this.f17219b);
            getWritableDatabase().execSQL("DELETE FROM iptv_favourites WHERE user_id_referred = '" + iZ + "' AND streamID IN (" + str + ")");
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void o(int i2, String str, String str2, String str3, int i3) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f17220c = writableDatabase;
            writableDatabase.delete("iptv_favourites", "streamID='" + i2 + "' AND user_id_referred=" + i3, null);
            this.f17220c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.e("fav_oncreate", "asdfasdfsadfa");
        sQLiteDatabase.execSQL(this.f17221d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        Log.e("fav_upgrade", "oldVersion:" + i2 + "newversion:" + i3);
        if (i3 >= 3) {
            sQLiteDatabase.execSQL(this.f17222e);
            sQLiteDatabase.execSQL(this.f17223f);
            sQLiteDatabase.execSQL(this.f17224g);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(1:4)(2:5|(1:17)(2:10|(1:12)(2:13|(1:15)(1:16))))|18|(1:20)(9:23|(1:25)(2:27|(1:29)(2:30|(1:32)(2:33|(1:35)(2:36|(1:38)(1:39)))))|26|22|52|40|(1:(6:42|43|54|44|45|47))|49|50)|21|22|52|40|(0)|49|50) */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0169 A[Catch: SQLiteDatabaseLockedException | SQLiteException -> 0x01b2, LOOP:0: B:42:0x0169->B:57:?, LOOP_START, TRY_LEAVE, TryCatch #0 {SQLiteDatabaseLockedException | SQLiteException -> 0x01b2, blocks: (B:40:0x0158, B:42:0x0169, B:44:0x016f, B:44:0x016f, B:47:0x0185, B:47:0x0185, B:49:0x01af, B:49:0x01af), top: B:52:0x0158 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<c.h.a.i.b> p(java.lang.String r12, int r13) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.i.q.a.p(java.lang.String, int):java.util.ArrayList");
    }

    public ArrayList<c.h.a.i.b> q() {
        String str = "SELECT GROUP_CONCAT(streamID) AS streamID , type FROM iptv_favourites WHERE user_id_referred=" + m.z(this.f17219b) + " GROUP BY type";
        ArrayList<c.h.a.i.b> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17220c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(str, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.b bVar = new c.h.a.i.b();
                    bVar.i(cursorRawQuery.getString(0));
                    bVar.n(cursorRawQuery.getString(1));
                    arrayList.add(bVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public ArrayList<c.h.a.i.b> r(String str) {
        ArrayList<c.h.a.i.b> arrayList = new ArrayList<>();
        String str2 = "SELECT  streamID FROM iptv_favourites WHERE type LIKE '%" + str + "%' AND user_id_referred=" + m.z(this.f17219b) + " ";
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17220c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.b bVar = new c.h.a.i.b();
                    int i2 = 0;
                    try {
                        i2 = Integer.parseInt(cursorRawQuery.getString(0));
                    } catch (NumberFormatException unused) {
                    }
                    bVar.m(i2);
                    arrayList.add(bVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused2) {
        }
        return arrayList;
    }

    public int s(String str, int i2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_favourites WHERE type LIKE '%" + str + "%' AND user_id_referred=" + i2 + "  ", null);
            cursorRawQuery.moveToFirst();
            int i3 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i3;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return 0;
        }
    }
}
