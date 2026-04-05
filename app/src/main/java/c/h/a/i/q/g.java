package c.h.a.i.q;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class g extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f17255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17260h;

    public g(Context context) {
        super(context, "iptv_smarters_multi_user.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.f17256d = "CREATE TABLE IF NOT EXISTS login_user(server_url TEXT,user_created TEXT)";
        this.f17257e = "CREATE TABLE IF NOT EXISTS multi_user(auto_id INTEGER PRIMARY KEY,name TEXT,username TEXT,password TEXT,magportal TEXT,magportal2 TEXT)";
        this.f17258f = "ALTER TABLE multi_user ADD COLUMN magportal2 TEXT;";
        this.f17259g = "CREATE TABLE IF NOT EXISTS multi_user_m3u(auto_id INTEGER PRIMARY KEY,name TEXT,username TEXT,password TEXT,magportal TEXT,type_of_m3u TEXT)";
        this.f17260h = "CREATE TABLE IF NOT EXISTS multi_user_epg_m3u(auto_id INTEGER PRIMARY KEY,user_id TEXT,epgurl TEXT)";
        this.f17254b = context;
    }

    public void d(String str, String str2, String str3, String str4, String str5) {
        try {
            this.f17255c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str.replaceAll("'", BuildConfig.FLAVOR));
            contentValues.put("username", str2);
            contentValues.put("password", str3);
            contentValues.put("magportal", str4);
            contentValues.put("magportal2", str5);
            this.f17255c.insert("multi_user", null, contentValues);
            this.f17255c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void i(String str, String str2, String str3, String str4, String str5) {
        try {
            this.f17255c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str.replaceAll("'", BuildConfig.FLAVOR));
            contentValues.put("username", str2);
            contentValues.put("password", str3);
            contentValues.put("magportal", str4);
            contentValues.put("type_of_m3u", str5);
            this.f17255c.insert("multi_user_m3u", null, contentValues);
            this.f17255c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public boolean l(String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb;
        int i2;
        try {
            String strReplaceAll = str.replaceAll("'", BuildConfig.FLAVOR);
            if (str5.equals("m3u")) {
                sb = new StringBuilder();
                sb.append("SELECT  count(*) FROM multi_user_m3u WHERE name ='");
                sb.append(strReplaceAll);
                sb.append("' AND ");
                sb.append("username");
                sb.append(" ='");
                sb.append(str2);
                sb.append("' AND ");
                sb.append("password");
                sb.append(" ='");
                sb.append(str3);
                sb.append("' AND ");
                sb.append("magportal");
                sb.append("='");
                sb.append(str4);
                sb.append("'");
            } else {
                sb = new StringBuilder();
                sb.append("SELECT  count(*) FROM multi_user WHERE name ='");
                sb.append(strReplaceAll);
                sb.append("' AND ");
                sb.append("username");
                sb.append(" ='");
                sb.append(str2);
                sb.append("' AND ");
                sb.append("password");
                sb.append(" ='");
                sb.append(str3);
                sb.append("' AND (");
                sb.append("magportal");
                sb.append(" LIKE '%");
                sb.append(str4);
                sb.append("%' OR ");
                sb.append("magportal2");
                sb.append(" LIKE '%");
                sb.append(str6);
                sb.append("%' )");
            }
            String string = sb.toString();
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17255c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(string, null);
            cursorRawQuery.moveToFirst();
            i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return i2 > 0;
    }

    public void m(int i2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f17255c = writableDatabase;
        writableDatabase.execSQL("DELETE FROM multi_user WHERE auto_id='" + i2 + "'");
        this.f17255c.close();
    }

    public void n(int i2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f17255c = writableDatabase;
        writableDatabase.execSQL("DELETE FROM multi_user_m3u WHERE auto_id='" + i2 + "'");
        this.f17255c.execSQL("DELETE FROM multi_user_epg_m3u WHERE user_id='" + i2 + "'");
        this.f17255c.close();
    }

    public ArrayList<c.h.a.i.i> o() {
        ArrayList<c.h.a.i.i> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17255c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT  * FROM multi_user ORDER BY auto_id DESC", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.i iVar = new c.h.a.i.i();
                    iVar.j(cursorRawQuery.getString(1));
                    iVar.l(cursorRawQuery.getString(2));
                    iVar.k(cursorRawQuery.getString(3));
                    iVar.h(cursorRawQuery.getString(4));
                    iVar.i(cursorRawQuery.getString(5));
                    arrayList.add(iVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f17257e);
        sQLiteDatabase.execSQL(this.f17260h);
        sQLiteDatabase.execSQL(this.f17259g);
        sQLiteDatabase.execSQL(this.f17256d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 < 2) {
            sQLiteDatabase.execSQL(this.f17260h);
            sQLiteDatabase.execSQL(this.f17259g);
        }
        if (i2 < 3) {
            sQLiteDatabase.execSQL(this.f17258f);
        }
        if (i2 < 4) {
            sQLiteDatabase.execSQL(this.f17256d);
        }
    }

    public ArrayList<c.h.a.i.i> p() {
        ArrayList<c.h.a.i.i> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17255c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT  * FROM multi_user_m3u ORDER BY auto_id DESC", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.i iVar = new c.h.a.i.i();
                    iVar.j(cursorRawQuery.getString(1));
                    iVar.l(cursorRawQuery.getString(2));
                    iVar.k(cursorRawQuery.getString(3));
                    iVar.h(cursorRawQuery.getString(4));
                    iVar.g(cursorRawQuery.getString(5));
                    arrayList.add(iVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public int q(String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb;
        String str7;
        try {
            if (str5.equals("m3u")) {
                sb = new StringBuilder();
                sb.append("SELECT auto_id FROM multi_user_m3u WHERE name='");
                sb.append(str);
                sb.append("' AND ");
                sb.append("username");
                sb.append("='");
                sb.append(str2);
                sb.append("' AND ");
                sb.append("password");
                sb.append("='");
                sb.append(str3);
                sb.append("' AND ");
                sb.append("magportal");
                sb.append(" LIKE '%");
                sb.append(str4);
                str7 = "%'";
            } else {
                sb = new StringBuilder();
                sb.append("SELECT auto_id FROM multi_user WHERE name='");
                sb.append(str);
                sb.append("' AND ");
                sb.append("username");
                sb.append("='");
                sb.append(str2);
                sb.append("' AND ");
                sb.append("password");
                sb.append("='");
                sb.append(str3);
                sb.append("' AND (");
                sb.append("magportal");
                sb.append(" LIKE '%");
                sb.append(str4);
                sb.append("%' OR ");
                sb.append("magportal2");
                sb.append(" LIKE '%");
                sb.append(str6);
                str7 = "%' )";
            }
            sb.append(str7);
            String string = sb.toString();
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17255c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(string, null);
            if (cursorRawQuery == null || !cursorRawQuery.moveToFirst()) {
                return -1;
            }
            int i2 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("auto_id"));
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return -1;
        }
    }

    public ArrayList<c.h.a.i.i> r(int i2) {
        ArrayList<c.h.a.i.i> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17255c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT  * FROM multi_user_m3u WHERE auto_id ='" + i2 + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.i iVar = new c.h.a.i.i();
                    iVar.j(cursorRawQuery.getString(1));
                    iVar.l(cursorRawQuery.getString(2));
                    iVar.k(cursorRawQuery.getString(3));
                    iVar.h(cursorRawQuery.getString(4));
                    iVar.g(cursorRawQuery.getString(5));
                    arrayList.add(iVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public void s(int i2, String str) {
        this.f17255c = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("magportal2", str);
            this.f17255c.update("multi_user", contentValues, "auto_id = ?", new String[]{String.valueOf(i2)});
            this.f17255c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }
}
