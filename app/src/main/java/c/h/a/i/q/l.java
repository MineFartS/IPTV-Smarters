package c.h.a.i.q;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import minefarts.iptvsmarters.model.callback.GetEpisdoeDetailsCallback;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class l extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f17286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f17287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f17288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f17289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f17290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f17291o;
    public final String p;
    public Context q;
    public SQLiteDatabase r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public l(Context context) {
        super(context, "iptv_series_recent_watch.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.f17278b = Name.MARK;
        this.f17279c = "episode_id";
        this.f17280d = "episode_name";
        this.f17281e = "containerExtension";
        this.f17282f = "added";
        this.f17283g = "cover";
        this.f17284h = "image";
        this.f17285i = "episode_icon";
        this.f17286j = "series_main_image";
        this.f17287k = "is_recent_watched";
        this.f17288l = "series_num";
        this.f17289m = "season_num";
        this.f17290n = "episode_num";
        this.f17291o = "series_name";
        this.p = "episode_duration_sec";
        this.s = "CREATE TABLE IF NOT EXISTS iptv_series_recent_watch(id INTEGER PRIMARY KEY,episode_id TEXT," + this.f17280d + " TEXT," + this.f17281e + " TEXT,added TEXT," + this.f17285i + " TEXT,series_id TEXT,user_id_referred TEXT,elapsed_time TEXT,cat_id TEXT,cover TEXT,image TEXT,series_main_image TEXT,is_recent_watched TEXT,series_num TEXT,season_num TEXT,episode_num TEXT,series_name TEXT,episode_duration_sec TEXT)";
        this.t = "ALTER TABLE iptv_series_recent_watch ADD COLUMN series_main_image TEXT;";
        this.u = "ALTER TABLE iptv_series_recent_watch ADD COLUMN is_recent_watched TEXT;";
        this.v = "ALTER TABLE iptv_series_recent_watch ADD COLUMN series_num TEXT;";
        this.w = "ALTER TABLE iptv_series_recent_watch ADD COLUMN season_num TEXT;";
        this.x = "ALTER TABLE iptv_series_recent_watch ADD COLUMN episode_num TEXT;";
        this.y = "ALTER TABLE iptv_series_recent_watch ADD COLUMN series_name TEXT;";
        this.z = "ALTER TABLE iptv_series_recent_watch ADD COLUMN episode_duration_sec TEXT;";
        this.q = context;
    }

    public int Q(String str) {
        int iZ = m.z(this.q);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_recent_watched", "0");
            return writableDatabase.update("iptv_series_recent_watch", contentValues, "series_id=" + str + " AND user_id_referred=" + iZ, null);
        } catch (Exception unused) {
            return 0;
        }
    }

    public int U(String str, Long l2) {
        int iZ = m.z(this.q);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("elapsed_time", l2);
            return writableDatabase.update("iptv_series_recent_watch", contentValues, "episode_id=" + str + " AND user_id_referred=" + iZ, null);
        } catch (Exception unused) {
            return 0;
        }
    }

    public void d(GetEpisdoeDetailsCallback getEpisdoeDetailsCallback) {
        int iZ = m.z(this.q);
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            if (getEpisdoeDetailsCallback.j() != null) {
                contentValues.put("episode_id", getEpisdoeDetailsCallback.j());
            } else {
                contentValues.put("episode_id", BuildConfig.FLAVOR);
            }
            if (getEpisdoeDetailsCallback.u() != null) {
                contentValues.put(this.f17280d, getEpisdoeDetailsCallback.u());
            } else {
                contentValues.put(this.f17280d, BuildConfig.FLAVOR);
            }
            if (getEpisdoeDetailsCallback.c() != null) {
                contentValues.put(this.f17281e, getEpisdoeDetailsCallback.c());
            } else {
                contentValues.put(this.f17281e, BuildConfig.FLAVOR);
            }
            if (getEpisdoeDetailsCallback.a() != null) {
                contentValues.put("added", getEpisdoeDetailsCallback.a());
            } else {
                contentValues.put("added", BuildConfig.FLAVOR);
            }
            if (getEpisdoeDetailsCallback.g() != null) {
                contentValues.put("elapsed_time", getEpisdoeDetailsCallback.g());
            } else {
                contentValues.put("elapsed_time", BuildConfig.FLAVOR);
            }
            if (getEpisdoeDetailsCallback.q() != null) {
                contentValues.put(this.f17285i, getEpisdoeDetailsCallback.q());
            } else {
                contentValues.put(this.f17285i, BuildConfig.FLAVOR);
            }
            contentValues.put("user_id_referred", Integer.valueOf(iZ));
            contentValues.put("cat_id", getEpisdoeDetailsCallback.b());
            contentValues.put("series_id", getEpisdoeDetailsCallback.r());
            if (getEpisdoeDetailsCallback.k() != null) {
                contentValues.put("cover", getEpisdoeDetailsCallback.k());
            } else {
                contentValues.put("cover", BuildConfig.FLAVOR);
            }
            if (getEpisdoeDetailsCallback.n() != null) {
                contentValues.put("image", getEpisdoeDetailsCallback.n());
            } else {
                contentValues.put("image", BuildConfig.FLAVOR);
            }
            if (getEpisdoeDetailsCallback.m() != null) {
                contentValues.put("series_main_image", getEpisdoeDetailsCallback.m());
            } else {
                contentValues.put("series_main_image", BuildConfig.FLAVOR);
            }
            contentValues.put("is_recent_watched", "1");
            if (getEpisdoeDetailsCallback.t() != null) {
                contentValues.put("series_num", getEpisdoeDetailsCallback.t());
            } else {
                contentValues.put("series_num", BuildConfig.FLAVOR);
            }
            if (getEpisdoeDetailsCallback.p() != null) {
                contentValues.put("season_num", getEpisdoeDetailsCallback.p());
            } else {
                contentValues.put("season_num", BuildConfig.FLAVOR);
            }
            if (getEpisdoeDetailsCallback.h() != null) {
                contentValues.put("episode_num", getEpisdoeDetailsCallback.h());
            } else {
                contentValues.put("episode_num", BuildConfig.FLAVOR);
            }
            if (getEpisdoeDetailsCallback.s() != null) {
                contentValues.put("series_name", getEpisdoeDetailsCallback.s());
            } else {
                contentValues.put("series_name", BuildConfig.FLAVOR);
            }
            if (getEpisdoeDetailsCallback.f() != null) {
                contentValues.put("episode_duration_sec", getEpisdoeDetailsCallback.f());
            } else {
                contentValues.put("episode_duration_sec", BuildConfig.FLAVOR);
            }
            writableDatabase.insert("iptv_series_recent_watch", null, contentValues);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            Log.w("msg", "exception");
        }
    }

    public void i(ArrayList<GetEpisdoeDetailsCallback> arrayList) {
        int iZ = m.z(this.q);
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                contentValues.put("episode_id", arrayList.get(i2).j());
                contentValues.put(this.f17280d, arrayList.get(i2).u());
                contentValues.put(this.f17281e, arrayList.get(i2).c());
                contentValues.put("added", arrayList.get(i2).a());
                contentValues.put("elapsed_time", arrayList.get(i2).g());
                contentValues.put(this.f17285i, arrayList.get(i2).q());
                contentValues.put("user_id_referred", Integer.valueOf(iZ));
                contentValues.put("cat_id", arrayList.get(i2).b());
                contentValues.put("series_id", arrayList.get(i2).r());
                contentValues.put("cover", arrayList.get(i2).k());
                contentValues.put("image", arrayList.get(i2).n());
                contentValues.put("series_main_image", arrayList.get(i2).m());
                contentValues.put("is_recent_watched", arrayList.get(i2).l());
                contentValues.put("series_num", arrayList.get(i2).t());
                contentValues.put("season_num", arrayList.get(i2).p());
                contentValues.put("episode_num", arrayList.get(i2).h());
                contentValues.put("series_name", arrayList.get(i2).s());
                contentValues.put("episode_duration_sec", arrayList.get(i2).f());
                writableDatabase.insert("iptv_series_recent_watch", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void l() {
        int iZ = m.z(this.q);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.r = writableDatabase;
        writableDatabase.delete("iptv_series_recent_watch", "user_id_referred=" + iZ + BuildConfig.FLAVOR, null);
        this.r.close();
    }

    public void m(String str) {
        try {
            int iZ = m.z(this.q);
            getWritableDatabase().execSQL("DELETE FROM iptv_series_recent_watch WHERE user_id_referred = '" + iZ + "' AND series_id IN (" + str + ")");
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void n(String str) {
        try {
            int iZ = m.z(this.q);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.r = writableDatabase;
            writableDatabase.delete("iptv_series_recent_watch", "episode_id='" + str + "'  AND  user_id_referred=" + iZ + BuildConfig.FLAVOR, null);
            this.r.close();
        } catch (Exception unused) {
        }
    }

    public ArrayList<GetEpisdoeDetailsCallback> o() {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT series_id FROM iptv_series_recent_watch WHERE user_id_referred=" + m.z(this.q) + " ", null);
            ArrayList<GetEpisdoeDetailsCallback> arrayList = new ArrayList<>();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    int i2 = 0;
                    try {
                        i2 = Integer.parseInt(cursorRawQuery.getString(0));
                    } catch (NumberFormatException unused) {
                    }
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                    getEpisdoeDetailsCallback.O(String.valueOf(i2));
                    arrayList.add(getEpisdoeDetailsCallback);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused2) {
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.s);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 < 2) {
            sQLiteDatabase.execSQL(this.t);
            sQLiteDatabase.execSQL(this.u);
            sQLiteDatabase.execSQL(this.v);
            sQLiteDatabase.execSQL(this.w);
            sQLiteDatabase.execSQL(this.x);
            sQLiteDatabase.execSQL(this.y);
            sQLiteDatabase.execSQL(this.z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e A[Catch: SQLiteDatabaseLockedException | SQLiteException -> 0x012b, LOOP:0: B:12:0x007e->B:20:?, LOOP_START, TryCatch #0 {SQLiteDatabaseLockedException | SQLiteException -> 0x012b, blocks: (B:10:0x0070, B:12:0x007e, B:14:0x0127), top: B:17:0x0070 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<minefarts.iptvsmarters.model.callback.GetEpisdoeDetailsCallback> p(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.i.q.l.p(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public ArrayList<GetEpisdoeDetailsCallback> q() {
        int iZ = m.z(this.q);
        ArrayList<GetEpisdoeDetailsCallback> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  episode_id," + this.f17280d + "," + this.f17281e + ",added,elapsed_time,image,series_main_image,is_recent_watched,season_num,episode_num,episode_duration_sec,series_id FROM iptv_series_recent_watch WHERE user_id_referred=" + iZ + BuildConfig.FLAVOR, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                    getEpisdoeDetailsCallback.G(cursorRawQuery.getString(0));
                    getEpisdoeDetailsCallback.R(cursorRawQuery.getString(1));
                    getEpisdoeDetailsCallback.x(cursorRawQuery.getString(2));
                    getEpisdoeDetailsCallback.v(cursorRawQuery.getString(3));
                    getEpisdoeDetailsCallback.D(cursorRawQuery.getString(4));
                    getEpisdoeDetailsCallback.K(cursorRawQuery.getString(5));
                    getEpisdoeDetailsCallback.J(cursorRawQuery.getString(6));
                    getEpisdoeDetailsCallback.I(cursorRawQuery.getString(7));
                    getEpisdoeDetailsCallback.M(Integer.valueOf(cursorRawQuery.getInt(8)));
                    getEpisdoeDetailsCallback.E(Integer.valueOf(cursorRawQuery.getInt(9)));
                    getEpisdoeDetailsCallback.C(cursorRawQuery.getString(10));
                    getEpisdoeDetailsCallback.O(cursorRawQuery.getString(11));
                    arrayList.add(getEpisdoeDetailsCallback);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca A[Catch: SQLiteDatabaseLockedException | SQLiteException -> 0x0177, LOOP:0: B:27:0x00ca->B:35:?, LOOP_START, TryCatch #0 {SQLiteDatabaseLockedException | SQLiteException -> 0x0177, blocks: (B:25:0x00bc, B:27:0x00ca, B:29:0x0173), top: B:32:0x00bc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<minefarts.iptvsmarters.model.callback.GetEpisdoeDetailsCallback> r(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.i.q.l.r(java.lang.String):java.util.ArrayList");
    }

    public ArrayList<GetEpisdoeDetailsCallback> s(String str) {
        int iZ = m.z(this.q);
        ArrayList<GetEpisdoeDetailsCallback> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_series_recent_watch WHERE episode_id='" + str + "'  AND  user_id_referred=" + iZ, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                    getEpisdoeDetailsCallback.G(cursorRawQuery.getString(1));
                    getEpisdoeDetailsCallback.R(cursorRawQuery.getString(2));
                    getEpisdoeDetailsCallback.x(cursorRawQuery.getString(3));
                    getEpisdoeDetailsCallback.v(cursorRawQuery.getString(4));
                    getEpisdoeDetailsCallback.N(cursorRawQuery.getString(5));
                    getEpisdoeDetailsCallback.O(cursorRawQuery.getString(6));
                    getEpisdoeDetailsCallback.D(cursorRawQuery.getString(8));
                    getEpisdoeDetailsCallback.w(cursorRawQuery.getString(9));
                    getEpisdoeDetailsCallback.H(cursorRawQuery.getString(10));
                    getEpisdoeDetailsCallback.K(cursorRawQuery.getString(11));
                    getEpisdoeDetailsCallback.J(cursorRawQuery.getString(12));
                    getEpisdoeDetailsCallback.I(cursorRawQuery.getString(13));
                    getEpisdoeDetailsCallback.Q(cursorRawQuery.getString(14));
                    getEpisdoeDetailsCallback.M(Integer.valueOf(cursorRawQuery.getInt(15)));
                    getEpisdoeDetailsCallback.E(Integer.valueOf(cursorRawQuery.getInt(16)));
                    getEpisdoeDetailsCallback.P(cursorRawQuery.getString(17));
                    getEpisdoeDetailsCallback.C(cursorRawQuery.getString(18));
                    arrayList.add(getEpisdoeDetailsCallback);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return null;
        }
    }

    public ArrayList<GetEpisdoeDetailsCallback> t(String str) {
        int iZ = m.z(this.q);
        ArrayList<GetEpisdoeDetailsCallback> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_series_recent_watch WHERE series_id='" + str + "'  AND  user_id_referred=" + iZ + " ORDER BY " + Name.MARK + " DESC LIMIT 1", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                    getEpisdoeDetailsCallback.G(cursorRawQuery.getString(1));
                    getEpisdoeDetailsCallback.R(cursorRawQuery.getString(2));
                    getEpisdoeDetailsCallback.x(cursorRawQuery.getString(3));
                    getEpisdoeDetailsCallback.v(cursorRawQuery.getString(4));
                    getEpisdoeDetailsCallback.N(cursorRawQuery.getString(5));
                    getEpisdoeDetailsCallback.O(cursorRawQuery.getString(6));
                    getEpisdoeDetailsCallback.D(cursorRawQuery.getString(8));
                    getEpisdoeDetailsCallback.w(cursorRawQuery.getString(9));
                    getEpisdoeDetailsCallback.H(cursorRawQuery.getString(10));
                    getEpisdoeDetailsCallback.K(cursorRawQuery.getString(11));
                    getEpisdoeDetailsCallback.J(cursorRawQuery.getString(12));
                    getEpisdoeDetailsCallback.I(cursorRawQuery.getString(13));
                    getEpisdoeDetailsCallback.Q(cursorRawQuery.getString(14));
                    getEpisdoeDetailsCallback.M(Integer.valueOf(cursorRawQuery.getInt(15)));
                    getEpisdoeDetailsCallback.E(Integer.valueOf(cursorRawQuery.getInt(16)));
                    getEpisdoeDetailsCallback.P(cursorRawQuery.getString(17));
                    getEpisdoeDetailsCallback.C(cursorRawQuery.getString(18));
                    arrayList.add(getEpisdoeDetailsCallback);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return null;
        }
    }

    public int u() {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_series_recent_watch WHERE user_id_referred=" + m.z(this.q) + " AND is_recent_watched=1", null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return 0;
        }
    }

    public Long v(String str) {
        long jValueOf = -1L;
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_series_recent_watch WHERE user_id_referred=" + m.z(this.q) + " AND episode_id=" + str + " LIMIT 1", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    jValueOf = Long.valueOf(Long.parseLong(cursorRawQuery.getString(18)));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
        return jValueOf;
    }

    public Long w(String str) {
        long jValueOf = -1L;
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_series_recent_watch WHERE user_id_referred=" + m.z(this.q) + " AND episode_id=" + str + " LIMIT 1", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    jValueOf = Long.valueOf(Long.parseLong(cursorRawQuery.getString(8)));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
        return jValueOf;
    }

    public int x(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_series_recent_watch WHERE episode_id='" + str + "' AND user_id_referred='" + m.z(this.q) + "'", null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return 0;
        }
    }

    public int y() {
        int iZ = m.z(this.q);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_recent_watched", "0");
            return writableDatabase.update("iptv_series_recent_watch", contentValues, "user_id_referred=" + iZ, null);
        } catch (Exception unused) {
            return 0;
        }
    }
}
