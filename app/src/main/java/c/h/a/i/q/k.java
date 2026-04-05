package c.h.a.i.q;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.nst.iptvsmarterstvbox.model.pojo.PanelAvailableChannelsPojo;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class k extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f17273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17277g;

    public k(Context context) {
        super(context, "iptv_movie_streams_recent_watch.db", (SQLiteDatabase.CursorFactory) null, 3);
        this.f17274d = "CREATE TABLE IF NOT EXISTS iptv_movie_streams_recent_watch(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,user_id_referred TEXT,movie_elapsed_time TEXT,movie_duration TEXT,is_watched TEXT,rating_from_ten TEXT,rating_from_five TEXT)";
        this.f17275e = "ALTER TABLE iptv_movie_streams_recent_watch ADD COLUMN is_watched TEXT;";
        this.f17276f = "ALTER TABLE iptv_movie_streams_recent_watch ADD COLUMN rating_from_ten TEXT;";
        this.f17277g = "ALTER TABLE iptv_movie_streams_recent_watch ADD COLUMN rating_from_five TEXT;";
        this.f17272b = context;
    }

    public int Q(String str, int i2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE stream_id='" + str + "' AND user_id_referred='" + i2 + "'", null);
            cursorRawQuery.moveToFirst();
            int i3 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i3;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return 0;
        }
    }

    public int U() {
        int iZ = m.z(this.f17272b);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_watched", "0");
            return writableDatabase.update("iptv_movie_streams_recent_watch", contentValues, "user_id_referred=" + iZ, null);
        } catch (Exception unused) {
            return 0;
        }
    }

    public int V(String str) {
        int iZ = m.z(this.f17272b);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_watched", "0");
            return writableDatabase.update("iptv_movie_streams_recent_watch", contentValues, "stream_id=" + str + " AND user_id_referred=" + iZ, null);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: SQLiteException -> 0x0098, SQLiteDatabaseLockedException -> 0x009c, TryCatch #3 {SQLiteDatabaseLockedException -> 0x009c, SQLiteException -> 0x0098, blocks: (B:3:0x0005, B:6:0x003e, B:8:0x0044, B:11:0x0058, B:18:0x006d, B:20:0x0073, B:22:0x008e, B:25:0x0094, B:14:0x005f, B:16:0x0063), top: B:33:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c0(java.lang.String r7, java.lang.String r8, boolean r9, long r10) {
        /*
            r6 = this;
            java.lang.String r9 = "exception"
            java.lang.String r0 = "msg"
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            java.lang.String r3 = "SELECT rowid FROM iptv_movie_streams_recent_watch WHERE stream_type = '"
            r2.append(r3)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            r2.append(r8)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            java.lang.String r8 = "' AND "
            r2.append(r8)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            java.lang.String r8 = "stream_id"
            r2.append(r8)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            java.lang.String r8 = " = '"
            r2.append(r8)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            r2.append(r7)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            java.lang.String r7 = "'"
            r2.append(r7)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            java.lang.String r7 = r2.toString()     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            r6.getReadableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            android.database.sqlite.SQLiteDatabase r8 = r6.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            r2 = 0
            android.database.Cursor r7 = r8.rawQuery(r7, r2)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            r2 = 1
            java.lang.String r3 = ""
            if (r7 == 0) goto L5f
            boolean r4 = r7.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            if (r4 == 0) goto L6c
        L44:
            java.lang.String r4 = "id"
            int r4 = r7.getColumnIndex(r4)     // Catch: java.lang.NumberFormatException -> L57 android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            java.lang.String r4 = r7.getString(r4)     // Catch: java.lang.NumberFormatException -> L57 android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L57 android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L57 android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            goto L58
        L57:
            r4 = r3
        L58:
            boolean r5 = r7.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            if (r5 != 0) goto L44
            goto L6d
        L5f:
            android.content.Context r4 = r6.f17272b     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            if (r4 == 0) goto L6c
            java.lang.String r5 = "cursor is null"
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r2)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            r4.show()     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
        L6c:
            r4 = r3
        L6d:
            boolean r3 = r4.equals(r3)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            if (r3 != 0) goto L92
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            java.lang.String r5 = "movie_elapsed_time"
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            r3.put(r5, r10)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            java.lang.String r10 = "iptv_movie_streams_recent_watch"
            java.lang.String r11 = "id= ?"
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            r5[r1] = r4     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            r8.update(r10, r3, r11, r5)     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
            if (r7 == 0) goto L91
            r7.close()     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
        L91:
            return r2
        L92:
            if (r7 == 0) goto L97
            r7.close()     // Catch: android.database.sqlite.SQLiteException -> L98 android.database.sqlite.SQLiteDatabaseLockedException -> L9c
        L97:
            return r1
        L98:
            android.util.Log.w(r0, r9)
            return r1
        L9c:
            android.util.Log.w(r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.i.q.k.c0(java.lang.String, java.lang.String, boolean, long):boolean");
    }

    public void d(PanelAvailableChannelsPojo panelAvailableChannelsPojo) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            if (panelAvailableChannelsPojo.l() != null) {
                contentValues.put("num", String.valueOf(panelAvailableChannelsPojo.l()));
            } else {
                contentValues.put("num", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.k() != null) {
                contentValues.put("name", panelAvailableChannelsPojo.k());
            } else {
                contentValues.put("name", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.r() != null) {
                contentValues.put("stream_type", panelAvailableChannelsPojo.r());
            } else {
                contentValues.put("stream_type", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.q() != null) {
                contentValues.put("stream_id", panelAvailableChannelsPojo.q());
            } else {
                contentValues.put("stream_id", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.p() != null) {
                contentValues.put("stream_icon", panelAvailableChannelsPojo.p());
            } else {
                contentValues.put("stream_icon", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.g() != null) {
                contentValues.put("epg_channel_id", panelAvailableChannelsPojo.g());
            } else {
                contentValues.put("epg_channel_id", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.a() != null) {
                contentValues.put("added", panelAvailableChannelsPojo.a());
            } else {
                contentValues.put("added", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.b() != null) {
                contentValues.put("categoryID", panelAvailableChannelsPojo.b());
            } else {
                contentValues.put("categoryID", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.e() != null) {
                contentValues.put("custom_sid", panelAvailableChannelsPojo.e());
            } else {
                contentValues.put("custom_sid", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.s() != null) {
                contentValues.put("tv_archive", panelAvailableChannelsPojo.s());
            } else {
                contentValues.put("tv_archive", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.f() != null) {
                contentValues.put("direct_source", panelAvailableChannelsPojo.f());
            } else {
                contentValues.put("direct_source", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.t() != null) {
                contentValues.put("tv_archive_duration", panelAvailableChannelsPojo.t());
            } else {
                contentValues.put("tv_archive_duration", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.u() != null) {
                contentValues.put("type_name", String.valueOf(panelAvailableChannelsPojo.u()));
            } else {
                contentValues.put("type_name", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.c() != null) {
                contentValues.put("category_name", panelAvailableChannelsPojo.c());
            } else {
                contentValues.put("category_name", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.o() != null) {
                contentValues.put("series_no", String.valueOf(panelAvailableChannelsPojo.o()));
            } else {
                contentValues.put("series_no", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.h() != null) {
                contentValues.put("series_no", String.valueOf(panelAvailableChannelsPojo.o()));
            } else {
                contentValues.put("series_no", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.h() != null) {
                contentValues.put("live", panelAvailableChannelsPojo.h());
            } else {
                contentValues.put("live", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.d() != null) {
                contentValues.put("container_extension", String.valueOf(panelAvailableChannelsPojo.d()));
            } else {
                contentValues.put("container_extension", BuildConfig.FLAVOR);
            }
            contentValues.put("user_id_referred", panelAvailableChannelsPojo.v() != -1 ? Integer.valueOf(panelAvailableChannelsPojo.v()) : -1);
            if (panelAvailableChannelsPojo.j() != -1) {
                contentValues.put("movie_elapsed_time", Long.valueOf(panelAvailableChannelsPojo.j()));
            } else {
                contentValues.put("movie_elapsed_time", (Integer) (-1));
            }
            if (panelAvailableChannelsPojo.i() != -1) {
                contentValues.put("movie_duration", Long.valueOf(panelAvailableChannelsPojo.i()));
            } else {
                contentValues.put("movie_duration", (Integer) (-1));
            }
            contentValues.put("is_watched", "1");
            if (panelAvailableChannelsPojo.n() != null) {
                contentValues.put("rating_from_ten", panelAvailableChannelsPojo.n());
            } else {
                contentValues.put("rating_from_ten", BuildConfig.FLAVOR);
            }
            if (panelAvailableChannelsPojo.m() != null) {
                contentValues.put("rating_from_five", String.valueOf(panelAvailableChannelsPojo.m()));
            } else {
                contentValues.put("rating_from_five", BuildConfig.FLAVOR);
            }
            writableDatabase.insert("iptv_movie_streams_recent_watch", null, contentValues);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            Log.w("msg", "exception");
        }
    }

    public void i(ArrayList<c.h.a.i.f> arrayList) {
        try {
            int iZ = m.z(this.f17272b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                contentValues.put("num", arrayList.get(i2).P());
                contentValues.put("name", arrayList.get(i2).getName());
                contentValues.put("stream_type", arrayList.get(i2).Z());
                contentValues.put("stream_id", arrayList.get(i2).Y());
                contentValues.put("stream_icon", arrayList.get(i2).X());
                contentValues.put("epg_channel_id", BuildConfig.FLAVOR);
                contentValues.put("added", arrayList.get(i2).f());
                contentValues.put("categoryID", arrayList.get(i2).g());
                contentValues.put("custom_sid", BuildConfig.FLAVOR);
                contentValues.put("tv_archive", BuildConfig.FLAVOR);
                contentValues.put("direct_source", BuildConfig.FLAVOR);
                contentValues.put("tv_archive_duration", BuildConfig.FLAVOR);
                contentValues.put("type_name", BuildConfig.FLAVOR);
                contentValues.put("category_name", BuildConfig.FLAVOR);
                contentValues.put("series_no", BuildConfig.FLAVOR);
                contentValues.put("live", BuildConfig.FLAVOR);
                contentValues.put("container_extension", arrayList.get(i2).C());
                contentValues.put("user_id_referred", Integer.valueOf(iZ));
                contentValues.put("movie_elapsed_time", Long.valueOf(arrayList.get(i2).O()));
                contentValues.put("movie_duration", Long.valueOf(arrayList.get(i2).N()));
                contentValues.put("is_watched", arrayList.get(i2).L());
                contentValues.put("rating_from_ten", arrayList.get(i2).T());
                contentValues.put("rating_from_five", arrayList.get(i2).S());
                writableDatabase.insert("iptv_movie_streams_recent_watch", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            Log.w("msg", "exception");
        }
    }

    public void l(int i2) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f17273c = writableDatabase;
            writableDatabase.delete("iptv_movie_streams_recent_watch", "user_id_referred='" + i2 + "'", null);
            this.f17273c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void m(String str, int i2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f17273c = writableDatabase;
        writableDatabase.delete("iptv_movie_streams_recent_watch", "stream_type='" + str + "' AND user_id_referred=" + i2 + BuildConfig.FLAVOR, null);
        this.f17273c.close();
    }

    public void n(String str) {
        try {
            int iZ = m.z(this.f17272b);
            getWritableDatabase().execSQL("DELETE FROM iptv_movie_streams_recent_watch WHERE user_id_referred = '" + iZ + "' AND stream_id IN (" + str + ")");
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void o(String str) {
        try {
            int iZ = m.z(this.f17272b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f17273c = writableDatabase;
            writableDatabase.delete("iptv_movie_streams_recent_watch", "stream_id='" + str + "'  AND  user_id_referred=" + iZ + BuildConfig.FLAVOR, null);
            this.f17273c.close();
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f17274d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 < 2) {
            sQLiteDatabase.execSQL(this.f17275e);
        }
        if (i2 < 3) {
            sQLiteDatabase.execSQL(this.f17276f);
            sQLiteDatabase.execSQL(this.f17277g);
        }
    }

    public void p(int i2, String str) {
        try {
            int iZ = m.z(this.f17272b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f17273c = writableDatabase;
            writableDatabase.delete("iptv_movie_streams_recent_watch", "stream_id='" + i2 + "'  AND stream_type='" + str + "' AND user_id_referred=" + iZ + BuildConfig.FLAVOR, null);
            this.f17273c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5 A[Catch: SQLiteDatabaseLockedException | SQLiteException -> 0x01ab, LOOP:0: B:27:0x00c5->B:42:?, LOOP_START, TRY_LEAVE, TryCatch #1 {SQLiteDatabaseLockedException | SQLiteException -> 0x01ab, blocks: (B:25:0x00b7, B:27:0x00c5, B:29:0x00cb, B:29:0x00cb, B:31:0x00d7, B:31:0x00d7, B:33:0x01a7, B:33:0x01a7), top: B:39:0x00b7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<c.h.a.i.f> q(java.lang.String r8, int r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.i.q.k.q(java.lang.String, int, java.lang.String):java.util.ArrayList");
    }

    public ArrayList<c.h.a.i.f> r() {
        m.z(this.f17272b);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT stream_id FROM iptv_movie_streams_recent_watch WHERE stream_type LIKE '%movie%' AND user_id_referred=" + m.z(this.f17272b) + " ", null);
            ArrayList<c.h.a.i.f> arrayList = new ArrayList<>();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.f fVar = new c.h.a.i.f();
                    int i2 = 0;
                    try {
                        i2 = Integer.parseInt(cursorRawQuery.getString(0));
                    } catch (NumberFormatException unused) {
                    }
                    fVar.B0(String.valueOf(i2));
                    arrayList.add(fVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e A[Catch: SQLiteDatabaseLockedException | SQLiteException -> 0x0164, LOOP:0: B:12:0x007e->B:27:?, LOOP_START, TRY_LEAVE, TryCatch #0 {SQLiteDatabaseLockedException | SQLiteException -> 0x0164, blocks: (B:10:0x0070, B:12:0x007e, B:14:0x0084, B:14:0x0084, B:16:0x0090, B:16:0x0090, B:18:0x0160, B:18:0x0160), top: B:22:0x0070 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<c.h.a.i.f> s(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.i.q.k.s(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public ArrayList<c.h.a.i.f> t() {
        int iZ = m.z(this.f17272b);
        ArrayList<c.h.a.i.f> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  movie_elapsed_time,movie_duration,is_watched,stream_id FROM iptv_movie_streams_recent_watch WHERE user_id_referred=" + iZ, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.f fVar = new c.h.a.i.f();
                    fVar.r0(cursorRawQuery.getLong(0));
                    fVar.q0(cursorRawQuery.getLong(1));
                    fVar.o0(cursorRawQuery.getString(2));
                    fVar.B0(cursorRawQuery.getString(3));
                    arrayList.add(fVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return null;
        }
    }

    public int u(int i2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE user_id_referred='" + i2 + "'", null);
            cursorRawQuery.moveToFirst();
            int i3 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i3;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return 0;
        }
    }

    public ArrayList<c.h.a.i.f> v(int i2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_movie_streams_recent_watch WHERE stream_id = '" + i2 + "' AND user_id_referred = '" + m.z(this.f17272b) + "' ORDER BY " + Name.MARK + " DESC LIMIT 1", null);
            ArrayList<c.h.a.i.f> arrayList = new ArrayList<>();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.f fVar = new c.h.a.i.f();
                    try {
                        fVar.n0(Integer.parseInt(cursorRawQuery.getString(0)));
                    } catch (NumberFormatException unused) {
                    }
                    fVar.u0(cursorRawQuery.getString(1));
                    fVar.t0(cursorRawQuery.getString(2));
                    fVar.C0(cursorRawQuery.getString(3));
                    fVar.B0(cursorRawQuery.getString(4));
                    fVar.A0(cursorRawQuery.getString(5));
                    fVar.l0(cursorRawQuery.getString(6));
                    fVar.f0(cursorRawQuery.getString(7));
                    fVar.g0(cursorRawQuery.getString(8));
                    fVar.j0(cursorRawQuery.getString(9));
                    fVar.D0(cursorRawQuery.getString(10));
                    fVar.k0(cursorRawQuery.getString(11));
                    fVar.E0(cursorRawQuery.getString(12));
                    fVar.F0(cursorRawQuery.getString(13));
                    fVar.h0(cursorRawQuery.getString(14));
                    fVar.z0(cursorRawQuery.getString(15));
                    fVar.p0(cursorRawQuery.getString(16));
                    fVar.i0(cursorRawQuery.getString(17));
                    fVar.H0(cursorRawQuery.getInt(18));
                    fVar.r0(cursorRawQuery.getLong(19));
                    fVar.q0(cursorRawQuery.getLong(20));
                    fVar.o0(cursorRawQuery.getString(21));
                    fVar.y0(cursorRawQuery.getString(22));
                    fVar.x0(cursorRawQuery.getString(23));
                    arrayList.add(fVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused2) {
            return null;
        }
    }

    public int w(int i2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE user_id_referred=" + i2 + BuildConfig.FLAVOR, null);
            cursorRawQuery.moveToFirst();
            int i3 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i3;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return 0;
        }
    }

    public ArrayList<c.h.a.i.f> x(String str, int i2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_movie_streams_recent_watch WHERE stream_id = '" + str + "' AND user_id_referred = '" + i2 + "' LIMIT 1", null);
            ArrayList<c.h.a.i.f> arrayList = new ArrayList<>();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.f fVar = new c.h.a.i.f();
                    try {
                        fVar.n0(Integer.parseInt(cursorRawQuery.getString(0)));
                    } catch (NumberFormatException unused) {
                    }
                    fVar.u0(cursorRawQuery.getString(1));
                    fVar.t0(cursorRawQuery.getString(2));
                    fVar.C0(cursorRawQuery.getString(3));
                    fVar.B0(cursorRawQuery.getString(4));
                    fVar.A0(cursorRawQuery.getString(5));
                    fVar.l0(cursorRawQuery.getString(6));
                    fVar.f0(cursorRawQuery.getString(7));
                    fVar.g0(cursorRawQuery.getString(8));
                    fVar.j0(cursorRawQuery.getString(9));
                    fVar.D0(cursorRawQuery.getString(10));
                    fVar.k0(cursorRawQuery.getString(11));
                    fVar.E0(cursorRawQuery.getString(12));
                    fVar.F0(cursorRawQuery.getString(13));
                    fVar.h0(cursorRawQuery.getString(14));
                    fVar.z0(cursorRawQuery.getString(15));
                    fVar.p0(cursorRawQuery.getString(16));
                    fVar.i0(cursorRawQuery.getString(17));
                    fVar.H0(cursorRawQuery.getInt(18));
                    fVar.r0(cursorRawQuery.getLong(19));
                    fVar.q0(cursorRawQuery.getLong(20));
                    fVar.o0(cursorRawQuery.getString(21));
                    fVar.y0(cursorRawQuery.getString(22));
                    fVar.x0(cursorRawQuery.getString(23));
                    arrayList.add(fVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused2) {
            return null;
        }
    }

    public int y() {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE user_id_referred=" + m.z(this.f17272b) + " AND is_watched=1", null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return 0;
        }
    }
}
