package c.h.a.i.q;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.GetSeriesStreamCallback;
import com.nst.iptvsmarterstvbox.model.callback.GetSeriesStreamCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamsCallback;
import com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel;
import com.nst.iptvsmarterstvbox.model.callback.VodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodStreamsCallback;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.ChartFactory;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class f extends SQLiteOpenHelper {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f17241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f17249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f17250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f17251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f17252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f17253o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public f(Context context) {
        super(context, "iptv_live_streams_tv.db", (SQLiteDatabase.CursorFactory) null, 7);
        this.f17242d = 0;
        this.f17243e = "CREATE TABLE IF NOT EXISTS iptv_live_category(id_live INTEGER PRIMARY KEY,categoryID_live TEXT,categoryname_live TEXT,paent_id TEXT,user_id_referred TEXT)";
        this.f17244f = "CREATE TABLE IF NOT EXISTS iptv_movie_category(id_movie INTEGER PRIMARY KEY,categoryID_movie TEXT,categoryname_movie TEXT,paent_id TEXT,user_id_referred TEXT)";
        this.f17245g = "CREATE TABLE IF NOT EXISTS iptv_live_streams_category(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT)";
        this.f17246h = "CREATE TABLE IF NOT EXISTS iptv_m3u_all_category(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT,user_id_referred TEXT)";
        this.f17247i = "CREATE TABLE IF NOT EXISTS iptv_live_category_m3u(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT,user_id_referred TEXT)";
        this.f17248j = "CREATE TABLE IF NOT EXISTS iptv_movie_category_m3u(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT,paent_id TEXT,user_id_referred TEXT)";
        this.f17249k = "CREATE TABLE IF NOT EXISTS iptv_series_category_m3u(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT,user_id_referred TEXT)";
        this.f17250l = "CREATE TABLE IF NOT EXISTS iptv_password_table(id_password INTEGER PRIMARY KEY,user_detail TEXT,password TEXT,user_id_referred TEXT)";
        this.f17251m = "CREATE TABLE IF NOT EXISTS iptv_password_table_m3u(id_password INTEGER PRIMARY KEY,user_detail TEXT,password TEXT,user_id_referred TEXT)";
        this.f17252n = "ALTER TABLE iptv_password_table ADD COLUMN user_id_referred TEXT;";
        this.f17253o = "CREATE TABLE IF NOT EXISTS iptv_password_status_table(id_password_status INTEGER PRIMARY KEY,password_status_cat_id TEXT,password_user_detail TEXT,password_status TEXT,user_id_referred TEXT)";
        this.p = "CREATE TABLE IF NOT EXISTS iptv_password_status_table_m3u(id_password_status INTEGER PRIMARY KEY,password_status_cat_id TEXT,password_user_detail TEXT,password_status TEXT,user_id_referred TEXT)";
        this.q = "ALTER TABLE iptv_password_status_table ADD COLUMN user_id_referred TEXT;";
        this.r = "CREATE TABLE IF NOT EXISTS iptv_live_streams(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,rating_from_ten TEXT,rating_from_five TEXT,user_id_referred TEXT)";
        this.s = "CREATE TABLE IF NOT EXISTS iptv_live_streams_m3u(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,url TEXT,user_id_referred TEXT)";
        this.t = "CREATE TABLE IF NOT EXISTS iptv_recent_watched_m3u(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,url TEXT,user_id_referred TEXT,movie_elapsed_time TEXT,movie_duration TEXT)";
        this.u = "CREATE TABLE IF NOT EXISTS iptv_live_streams_m3u_all(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,url TEXT,container_extension TEXT,user_id_referred TEXT,move_to TEXT)";
        this.v = "CREATE TABLE IF NOT EXISTS epg(id_epg_aut0 INTEGER PRIMARY KEY,title TEXT,start TEXT,stop TEXT,description TEXT,channel_id TEXT,user_id_referred TEXT,source_ref_id TEXT)";
        this.w = "CREATE TABLE IF NOT EXISTS epg_m3u(id_epg_aut0 INTEGER PRIMARY KEY,title TEXT,start TEXT,stop TEXT,description TEXT,channel_id TEXT,user_id_referred TEXT,source_ref_id TEXT)";
        this.x = "CREATE TABLE IF NOT EXISTS iptv_m3u_favourites(id INTEGER PRIMARY KEY,url TEXT,user_id_referred TEXT,name TEXT,categoryID TEXT)";
        this.y = "CREATE TABLE IF NOT EXISTS iptv_vod_streams(id_auto_vod INTEGER PRIMARY KEY,num_ TEXT,name TEXT,streamType TEXT,streamId TEXT,streamIcon TEXT,added TEXT,categoryId TEXT,seriesNo TEXT,containerExtension TEXT,customSid TEXT,directSource TEXT)";
        this.z = "CREATE TABLE IF NOT EXISTS iptv_import_status(id INTEGER PRIMARY KEY,type TEXT,status TEXT,date TEXT,time TEXT,user_id_referred TEXT,app_type TEXT,source_ref_id TEXT)";
        this.A = "CREATE TABLE IF NOT EXISTS iptv_mag_portal_table(id_auto_mag INTEGER PRIMARY KEY,mag_portal TEXT)";
        this.B = "CREATE TABLE IF NOT EXISTS series_m3u_streams(series_m3u_streams_auto_inc INTEGER PRIMARY KEY,series_m3u_stream_id TEXT,series_m3u_stream_title TEXT,series_m3u_stream_container_ext TEXT,series_m3u_stream_container_image TEXT,series_m3u_stream_container_cat_id TEXT)";
        this.C = "ALTER TABLE iptv_live_streams ADD COLUMN rating_from_ten TEXT;";
        this.D = "ALTER TABLE iptv_live_streams ADD COLUMN rating_from_five TEXT;";
        this.E = "CREATE TABLE IF NOT EXISTS iptv_epg_sources(auto_id INTEGER PRIMARY KEY,user_id_referred TEXT,name TEXT,source_type TEXT,epgurl TEXT,default_source TEXT)";
        this.F = "CREATE TABLE IF NOT EXISTS iptv_epg_sources_m3u(auto_id INTEGER PRIMARY KEY,user_id_referred TEXT,name TEXT,source_type TEXT,epgurl TEXT,default_source TEXT)";
        this.G = "CREATE TABLE IF NOT EXISTS iptv_live_watched(id INTEGER PRIMARY KEY,stream_id_url TEXT,user_id_referred TEXT,app_type TEXT)";
        this.H = "CREATE TABLE IF NOT EXISTS series_category_v2(id_series_v2 INTEGER PRIMARY KEY,category_name_series_v2 TEXT,category_id_series_v2 TEXT,user_id_referred TEXT)";
        this.I = "CREATE TABLE IF NOT EXISTS series_streams_v2(id_series_stream_v2 INTEGER PRIMARY KEY,num_series_stream_v2 TEXT,name_series_stream_v2 TEXT,stream_type_series_stream_v2 TEXT,stream_id_series_stream_v2 TEXT,stream_cover_series_stream_v2 TEXT,plot_series_stream_v2 TEXT,cast_series_stream_v2 TEXT,director_series_stream_v2 TEXT,genre_series_stream_v2 TEXT,release_date_series_stream_v2 TEXT,last_modified_series_stream_v2 TEXT,rating_series_stream_v2 TEXT,category_id_series_stream_v2 TEXT,youtube_trailer TEXT,backdrop TEXT,user_id_referred TEXT)";
        this.f17240b = context;
    }

    public void A0() {
        try {
            String strF = m.f(this.f17240b);
            int iZ = m.z(this.f17240b);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE user_id_referred = '" + iZ + "' AND app_type = '" + strF + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public int A1(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u , iptv_m3u_favourites WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='" + str + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "user_id_referred=iptv_m3u_favourites" + InstructionFileId.DOT + "user_id_referred AND iptv_m3u_favourites" + InstructionFileId.DOT + "user_id_referred ='" + m.z(this.f17240b) + "'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void B0(String str, int i2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f17241c = writableDatabase;
        writableDatabase.delete("iptv_recent_watched_m3u", "stream_type='" + str + "' AND user_id_referred=" + i2 + BuildConfig.FLAVOR, null);
        this.f17241c.close();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0095. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public ArrayList<c.h.a.i.c> B1(String str) {
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        String str3;
        String string;
        SQLiteDatabase readableDatabase;
        ArrayList<c.h.a.i.c> arrayList;
        int i2;
        String strM = str.equals("live") ? m.m(this.f17240b) : str.equals("series") ? m.w(this.f17240b) : m.E(this.f17240b);
        int iZ = m.z(this.f17240b);
        ArrayList<c.h.a.i.c> arrayList2 = new ArrayList<>();
        strM.hashCode();
        byte b2 = -1;
        switch (strM.hashCode()) {
            case 48:
                if (strM.equals("0")) {
                    b2 = 0;
                }
                break;
            case 50:
                if (strM.equals("2")) {
                    b2 = 1;
                }
                break;
            case 51:
                if (strM.equals("3")) {
                    b2 = 2;
                }
                break;
            case 52:
                if (strM.equals("4")) {
                    b2 = 3;
                }
                break;
            case 53:
                if (strM.equals("5")) {
                    b2 = 4;
                }
                break;
        }
        ArrayList<c.h.a.i.c> arrayList3 = arrayList2;
        switch (b2) {
            case 0:
                sb = new StringBuilder();
                sb.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb.append(str);
                sb.append("' AND ");
                sb.append("iptv_live_streams_m3u");
                sb.append(InstructionFileId.DOT);
                sb.append("user_id_referred");
                sb.append("=");
                sb.append("iptv_m3u_favourites");
                sb.append(InstructionFileId.DOT);
                sb.append("user_id_referred");
                sb.append(" AND ");
                sb.append("iptv_m3u_favourites");
                sb.append(InstructionFileId.DOT);
                sb.append("user_id_referred");
                sb.append(" ='");
                sb.append(iZ);
                sb.append("')");
                string = sb.toString();
                break;
            case 1:
                sb = new StringBuilder();
                sb.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb.append(str);
                sb.append("' AND ");
                sb.append("iptv_live_streams_m3u");
                sb.append(InstructionFileId.DOT);
                sb.append("user_id_referred");
                sb.append("=");
                sb.append("iptv_m3u_favourites");
                sb.append(InstructionFileId.DOT);
                sb.append("user_id_referred");
                sb.append(" AND ");
                sb.append("iptv_m3u_favourites");
                sb.append(InstructionFileId.DOT);
                sb.append("user_id_referred");
                sb.append(" ='");
                sb.append(iZ);
                sb.append("') ORDER BY ");
                sb.append("iptv_m3u_favourites");
                sb.append(InstructionFileId.DOT);
                sb.append("name");
                str2 = " ASC ";
                sb.append(str2);
                string = sb.toString();
                break;
            case 2:
                sb = new StringBuilder();
                sb.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb.append(str);
                sb.append("' AND ");
                sb.append("iptv_live_streams_m3u");
                sb.append(InstructionFileId.DOT);
                sb.append("user_id_referred");
                sb.append("=");
                sb.append("iptv_m3u_favourites");
                sb.append(InstructionFileId.DOT);
                sb.append("user_id_referred");
                sb.append(" AND ");
                sb.append("iptv_m3u_favourites");
                sb.append(InstructionFileId.DOT);
                sb.append("user_id_referred");
                sb.append(" ='");
                sb.append(iZ);
                sb.append("') ORDER BY ");
                sb.append("iptv_m3u_favourites");
                sb.append(InstructionFileId.DOT);
                sb.append("name");
                str2 = " DESC ";
                sb.append(str2);
                string = sb.toString();
                break;
            case 3:
                sb2 = new StringBuilder();
                sb2.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb2.append(str);
                sb2.append("' AND ");
                sb2.append("iptv_live_streams_m3u");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append("=");
                sb2.append("iptv_m3u_favourites");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append(" AND ");
                sb2.append("iptv_m3u_favourites");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append(" ='");
                sb2.append(iZ);
                sb2.append("' ORDER BY cast(");
                sb2.append("iptv_live_streams_m3u");
                sb2.append(InstructionFileId.DOT);
                sb2.append("num");
                str3 = " as REAL) ASC)";
                sb2.append(str3);
                string = sb2.toString();
                break;
            case 4:
                sb2 = new StringBuilder();
                sb2.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb2.append(str);
                sb2.append("' AND ");
                sb2.append("iptv_live_streams_m3u");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append("=");
                sb2.append("iptv_m3u_favourites");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append(" AND ");
                sb2.append("iptv_m3u_favourites");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append(" ='");
                sb2.append(iZ);
                sb2.append("' ORDER BY cast(");
                sb2.append("iptv_live_streams_m3u");
                sb2.append(InstructionFileId.DOT);
                sb2.append("num");
                str3 = " as REAL) DESC)";
                sb2.append(str3);
                string = sb2.toString();
                break;
            default:
                sb = new StringBuilder();
                sb.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb.append(str);
                sb.append("' AND ");
                sb.append("iptv_live_streams_m3u");
                sb.append(InstructionFileId.DOT);
                sb.append("user_id_referred");
                sb.append("=");
                sb.append("iptv_m3u_favourites");
                sb.append(InstructionFileId.DOT);
                sb.append("user_id_referred");
                sb.append(" AND ");
                sb.append("iptv_m3u_favourites");
                sb.append(InstructionFileId.DOT);
                sb.append("user_id_referred");
                sb.append(" ='");
                sb.append(iZ);
                sb.append("')");
                string = sb.toString();
                break;
        }
        try {
            readableDatabase = getReadableDatabase();
        } catch (SQLiteDatabaseLockedException unused) {
        } catch (Exception unused2) {
        }
        try {
            this.f17241c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(string, null);
            if (cursorRawQuery.moveToFirst()) {
                while (true) {
                    c.h.a.i.c cVar = new c.h.a.i.c();
                    try {
                        i2 = Integer.parseInt(cursorRawQuery.getString(0));
                    } catch (NumberFormatException unused3) {
                        i2 = 0;
                    }
                    cVar.f(i2);
                    cVar.h(cursorRawQuery.getString(1));
                    cVar.i(Integer.parseInt(cursorRawQuery.getString(2)));
                    cVar.g(cursorRawQuery.getString(3));
                    cVar.e(cursorRawQuery.getString(4));
                    arrayList = arrayList3;
                    try {
                        arrayList.add(cVar);
                        if (cursorRawQuery.moveToNext()) {
                            arrayList3 = arrayList;
                        }
                    } catch (SQLiteDatabaseLockedException unused4) {
                        return arrayList;
                    } catch (Exception unused5) {
                        return arrayList;
                    }
                }
            } else {
                arrayList = arrayList3;
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException unused6) {
            return arrayList3;
        } catch (Exception unused7) {
            return arrayList3;
        }
    }

    public void C0(int i2, String str) {
        try {
            String str2 = str.equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources";
            getWritableDatabase().execSQL("DELETE FROM " + str2 + " WHERE user_id_referred = '" + i2 + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public int C1(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_import_status WHERE user_id_referred = '" + m.z(this.f17240b) + "' AND app_type = '" + str + "'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void D0() {
        try {
            int iZ = m.z(this.f17240b);
            String strF = m.f(this.f17240b);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE stream_id_url NOT IN (SELECT stream_id FROM iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred ='" + iZ + "' ) AND user_id_referred = '" + iZ + "' AND app_type = '" + strF + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public c.h.a.i.f D1(String str, String str2) {
        int iZ = m.z(this.f17240b);
        new ArrayList();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams WHERE categoryID='" + str + "'  AND user_id_referred = '" + iZ + "' AND stream_id='" + str2 + "' LIMIT 1", null);
            c.h.a.i.f fVar = new c.h.a.i.f();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    fVar.n0(Integer.parseInt(cursorRawQuery.getString(0)));
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
                    fVar.y0(cursorRawQuery.getString(18));
                    fVar.x0(cursorRawQuery.getString(19));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return fVar;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public void E0() {
        try {
            int iZ = m.z(this.f17240b);
            String strF = m.f(this.f17240b);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE stream_id_url NOT IN (SELECT url FROM iptv_live_streams_m3u WHERE stream_type LIKE '%live%' AND user_id_referred ='" + iZ + "' ) AND user_id_referred = '" + iZ + "' AND app_type = '" + strF + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public int E1(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams WHERE categoryID='" + str + "' AND user_id_referred='" + m.z(this.f17240b) + "'", null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void F0(int i2) {
        try {
            int iZ = m.z(this.f17240b);
            String str = m.f(this.f17240b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources";
            getWritableDatabase().execSQL("DELETE FROM " + str + " WHERE user_id_referred = '" + iZ + "' AND auto_id = '" + i2 + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public ArrayList<c.h.a.i.f> F1(String str, String str2) {
        ArrayList<c.h.a.i.f> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams_m3u WHERE categoryID='" + str + "' AND url='" + str2 + "' AND user_id_referred='" + m.z(this.f17240b) + "'", null);
            c.h.a.i.f fVar = new c.h.a.i.f();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    fVar.u0(cursorRawQuery.getString(1));
                    fVar.t0(cursorRawQuery.getString(2));
                    fVar.C0(cursorRawQuery.getString(3));
                    fVar.B0(cursorRawQuery.getString(4));
                    fVar.A0(cursorRawQuery.getString(5));
                    fVar.l0(cursorRawQuery.getString(6));
                    fVar.f0(cursorRawQuery.getString(7));
                    fVar.g0(cursorRawQuery.getString(8));
                    fVar.j0(cursorRawQuery.getString(9));
                    fVar.k0(cursorRawQuery.getString(11));
                    fVar.E0(cursorRawQuery.getString(12));
                    fVar.F0(cursorRawQuery.getString(13));
                    fVar.h0(cursorRawQuery.getString(14));
                    fVar.z0(cursorRawQuery.getString(15));
                    fVar.p0(cursorRawQuery.getString(16));
                    fVar.i0(cursorRawQuery.getString(17));
                    fVar.G0(cursorRawQuery.getString(18));
                    arrayList.add(fVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public void G0() {
        try {
            c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f17240b);
            String strF = m.f(this.f17240b);
            int iZ = m.z(this.f17240b);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE user_id_referred = '" + iZ + "' AND app_type = '" + strF + "' AND " + Name.MARK + " NOT IN ( SELECT " + Name.MARK + " FROM iptv_live_watched WHERE user_id_referred = '" + iZ + "' AND app_type = '" + strF + "' ORDER BY " + Name.MARK + " DESC LIMIT " + aVar.z() + ")");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public SeriesDBModel G1(String str, String str2) {
        String str3 = "SELECT  * FROM iptv_live_streams_m3u WHERE categoryID='" + str + "' AND url='" + str2 + "' AND user_id_referred='" + m.z(this.f17240b) + "'";
        SeriesDBModel seriesDBModel = new SeriesDBModel();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str3, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    seriesDBModel.u(Integer.parseInt(cursorRawQuery.getString(0)));
                    seriesDBModel.w(cursorRawQuery.getString(1));
                    seriesDBModel.v(cursorRawQuery.getString(2));
                    seriesDBModel.x(cursorRawQuery.getString(3));
                    seriesDBModel.I(c.h.a.h.n.e.S(cursorRawQuery.getString(4)));
                    seriesDBModel.B(cursorRawQuery.getString(5));
                    seriesDBModel.F(BuildConfig.FLAVOR);
                    seriesDBModel.A(BuildConfig.FLAVOR);
                    seriesDBModel.C(BuildConfig.FLAVOR);
                    seriesDBModel.D(BuildConfig.FLAVOR);
                    seriesDBModel.H(BuildConfig.FLAVOR);
                    seriesDBModel.E(BuildConfig.FLAVOR);
                    seriesDBModel.G(BuildConfig.FLAVOR);
                    seriesDBModel.t(cursorRawQuery.getString(8));
                    seriesDBModel.z(BuildConfig.FLAVOR);
                    seriesDBModel.s(BuildConfig.FLAVOR);
                    seriesDBModel.y(cursorRawQuery.getString(18));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return seriesDBModel;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public void H0() {
        try {
            int iZ = m.z(this.f17240b);
            m.f(this.f17240b);
            getWritableDatabase().execSQL("DELETE FROM iptv_m3u_favourites WHERE url NOT IN (SELECT url FROM iptv_live_streams_m3u WHERE user_id_referred ='" + iZ + "' ) AND user_id_referred = '" + iZ + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public int H1() {
        int iZ = m.z(this.f17240b);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM " + (m.f(this.f17240b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources") + " WHERE user_id_referred='" + iZ + "' AND source_type = 'panel'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void I0(String str, int i2) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f17241c = writableDatabase;
            writableDatabase.delete("iptv_m3u_favourites", "url='" + str + "' AND user_id_referred=" + i2, null);
            this.f17241c.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public int I1(int i2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM " + (m.f(this.f17240b).equals("m3u") ? "iptv_password_status_table_m3u" : "iptv_password_status_table") + " WHERE user_id_referred=" + i2 + BuildConfig.FLAVOR, null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void J0(int i2, String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f17241c = writableDatabase;
            writableDatabase.delete("iptv_import_status", "user_id_referred='" + i2 + "' AND app_type='" + str + "'", null);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public i J1(String str, String str2, int i2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM " + (m.f(this.f17240b).equals("m3u") ? "iptv_password_status_table_m3u" : "iptv_password_status_table") + " WHERE password_user_detail = '" + str + "' AND password_status_cat_id = '" + str2 + "' AND user_id_referred = " + i2 + BuildConfig.FLAVOR, null);
            i iVar = new i();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    iVar.e(Integer.parseInt(cursorRawQuery.getString(0)));
                    iVar.g(cursorRawQuery.getString(1));
                    iVar.h(cursorRawQuery.getString(2));
                    iVar.f(cursorRawQuery.getString(3));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return iVar;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public void K0(int i2, String str, String str2) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f17241c = writableDatabase;
            writableDatabase.delete("iptv_import_status", "user_id_referred='" + i2 + "' AND app_type='" + str2 + "' AND source_ref_id='" + str + "'", null);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public int K1(int i2, String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_recent_watched_m3u WHERE user_id_referred=" + i2 + " AND stream_type='" + str + "'", null);
            cursorRawQuery.moveToFirst();
            int i3 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i3;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void L0(String str) {
        try {
            String strF = m.f(this.f17240b);
            int iZ = m.z(this.f17240b);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE stream_id_url = '" + str + "' AND user_id_referred = '" + iZ + "' AND app_type = '" + strF + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public ArrayList<c.h.a.i.f> L1(String str) {
        ArrayList<c.h.a.i.f> arrayList;
        ArrayList<c.h.a.i.f> arrayList2;
        int iZ = m.z(this.f17240b);
        String strF = m.f(this.f17240b);
        ArrayList<c.h.a.i.f> arrayList3 = new ArrayList<>();
        String str2 = "stopped live movies";
        if (!strF.equals("m3u")) {
            ArrayList<c.h.a.i.f> arrayList4 = arrayList3;
            StringBuilder sb = new StringBuilder();
            String str3 = "honey";
            sb.append("SELECT  * FROM iptv_live_streams WHERE name LIKE '%");
            sb.append(str);
            sb.append("%'  AND ");
            sb.append("iptv_live_streams");
            sb.append(InstructionFileId.DOT);
            sb.append("user_id_referred");
            sb.append(" = '");
            sb.append(iZ);
            sb.append("' AND ");
            sb.append("iptv_live_streams");
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" NOT IN (SELECT ");
            sb.append("iptv_password_status_table");
            sb.append(InstructionFileId.DOT);
            sb.append("password_status_cat_id");
            sb.append(" FROM ");
            sb.append("iptv_password_status_table");
            sb.append(" WHERE ");
            sb.append("iptv_password_status_table");
            sb.append(InstructionFileId.DOT);
            sb.append("user_id_referred");
            sb.append(" ='");
            sb.append(iZ);
            sb.append("' AND ");
            sb.append("iptv_password_status_table");
            sb.append(InstructionFileId.DOT);
            sb.append("password_status");
            sb.append(" ='1')");
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask = c.h.a.h.n.e.f17066h;
                            if (asyncTask != null && asyncTask.isCancelled()) {
                                Log.e(str3, str2);
                                break;
                            }
                            String str4 = str2;
                            String str5 = str3;
                            c.h.a.i.f fVar = new c.h.a.i.f();
                            fVar.n0(Integer.parseInt(cursorRawQuery.getString(0)));
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
                            fVar.y0(cursorRawQuery.getString(18));
                            fVar.x0(cursorRawQuery.getString(19));
                            arrayList = arrayList4;
                            arrayList.add(fVar);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            str2 = str4;
                            str3 = str5;
                            arrayList4 = arrayList;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    cursorRawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String str6 = "honey";
        sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE name LIKE '%");
        sb2.append(str);
        sb2.append("%'  AND ");
        sb2.append("iptv_live_streams_m3u");
        sb2.append(InstructionFileId.DOT);
        sb2.append("user_id_referred");
        sb2.append("='");
        sb2.append(iZ);
        sb2.append("' AND ");
        sb2.append("iptv_live_streams_m3u");
        sb2.append(InstructionFileId.DOT);
        sb2.append("stream_type");
        sb2.append(" IN ('movie','live') AND ");
        sb2.append("iptv_live_streams_m3u");
        sb2.append(InstructionFileId.DOT);
        sb2.append("categoryID");
        sb2.append(" NOT IN (SELECT ");
        sb2.append("iptv_password_status_table_m3u");
        sb2.append(InstructionFileId.DOT);
        sb2.append("password_status_cat_id");
        sb2.append(" FROM ");
        sb2.append("iptv_password_status_table_m3u");
        sb2.append(" WHERE ");
        sb2.append("iptv_password_status_table_m3u");
        sb2.append(InstructionFileId.DOT);
        sb2.append("user_id_referred");
        sb2.append(" ='");
        sb2.append(iZ);
        sb2.append("' AND ");
        sb2.append("iptv_password_status_table_m3u");
        sb2.append(InstructionFileId.DOT);
        sb2.append("password_status");
        sb2.append(" ='1')");
        try {
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery(sb2.toString(), null);
                if (cursorRawQuery2.moveToFirst()) {
                    while (true) {
                        AsyncTask asyncTask2 = c.h.a.h.n.e.f17066h;
                        if (asyncTask2 != null && asyncTask2.isCancelled()) {
                            Log.e(str6, str2);
                            break;
                        }
                        String str7 = str2;
                        String str8 = str6;
                        c.h.a.i.f fVar2 = new c.h.a.i.f();
                        fVar2.n0(Integer.parseInt(cursorRawQuery2.getString(0)));
                        fVar2.u0(cursorRawQuery2.getString(1));
                        fVar2.t0(cursorRawQuery2.getString(2));
                        fVar2.C0(cursorRawQuery2.getString(3));
                        fVar2.B0(cursorRawQuery2.getString(4));
                        fVar2.A0(cursorRawQuery2.getString(5));
                        fVar2.l0(cursorRawQuery2.getString(6));
                        fVar2.f0(cursorRawQuery2.getString(7));
                        fVar2.g0(cursorRawQuery2.getString(8));
                        fVar2.j0(cursorRawQuery2.getString(9));
                        fVar2.D0(cursorRawQuery2.getString(10));
                        fVar2.k0(cursorRawQuery2.getString(11));
                        fVar2.E0(cursorRawQuery2.getString(12));
                        fVar2.F0(cursorRawQuery2.getString(13));
                        fVar2.h0(cursorRawQuery2.getString(14));
                        fVar2.z0(cursorRawQuery2.getString(15));
                        fVar2.p0(cursorRawQuery2.getString(16));
                        fVar2.i0(cursorRawQuery2.getString(17));
                        fVar2.G0(cursorRawQuery2.getString(18));
                        arrayList2 = arrayList3;
                        arrayList2.add(fVar2);
                        if (!cursorRawQuery2.moveToNext()) {
                            break;
                        }
                        arrayList3 = arrayList2;
                        str2 = str7;
                        str6 = str8;
                    }
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = arrayList3;
                }
                cursorRawQuery2.close();
                return arrayList2;
            } catch (SQLiteDatabaseLockedException unused5) {
                return null;
            } catch (Exception unused6) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused7) {
            return null;
        } catch (Exception unused8) {
            return null;
        }
    }

    public void M0(int i2, String str) {
        String str2;
        String str3;
        if (str.equals("m3u")) {
            str2 = "iptv_password_table_m3u";
            str3 = "iptv_password_status_table_m3u";
        } else {
            str2 = "iptv_password_table";
            str3 = "iptv_password_status_table";
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f17241c = writableDatabase;
            writableDatabase.delete(str2, "user_id_referred='" + i2 + "'", null);
            this.f17241c.delete(str3, "user_id_referred='" + i2 + "'", null);
            this.f17241c.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public ArrayList<SeriesDBModel> M1(String str) {
        int iZ = m.z(this.f17240b);
        boolean zEquals = m.f(this.f17240b).equals("m3u");
        String str2 = BuildConfig.FLAVOR;
        if (!zEquals) {
            StringBuilder sb = new StringBuilder();
            String str3 = "stopped series";
            sb.append("SELECT  * FROM series_streams_v2 WHERE name_series_stream_v2 LIKE '%");
            sb.append(str);
            sb.append("%'  AND ");
            sb.append("series_streams_v2");
            sb.append(InstructionFileId.DOT);
            sb.append("user_id_referred");
            sb.append(" = '");
            sb.append(iZ);
            sb.append("' AND ");
            sb.append("series_streams_v2");
            sb.append(InstructionFileId.DOT);
            sb.append("category_id_series_stream_v2");
            sb.append(" NOT IN (SELECT ");
            sb.append("iptv_password_status_table");
            sb.append(InstructionFileId.DOT);
            sb.append("password_status_cat_id");
            sb.append(" FROM ");
            sb.append("iptv_password_status_table");
            sb.append(" WHERE ");
            sb.append("iptv_password_status_table");
            sb.append(InstructionFileId.DOT);
            sb.append("user_id_referred");
            sb.append(" ='");
            sb.append(iZ);
            sb.append("' AND ");
            sb.append("iptv_password_status_table");
            sb.append(InstructionFileId.DOT);
            sb.append("password_status");
            sb.append(" ='1')");
            String string = sb.toString();
            ArrayList<SeriesDBModel> arrayList = new ArrayList<>();
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery(string, null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask = c.h.a.h.n.e.f17066h;
                            if (asyncTask != null && asyncTask.isCancelled()) {
                                Log.e("honey", str3);
                                break;
                            }
                            String str4 = str3;
                            SeriesDBModel seriesDBModel = new SeriesDBModel();
                            seriesDBModel.u(Integer.parseInt(cursorRawQuery.getString(0)));
                            seriesDBModel.w(cursorRawQuery.getString(1));
                            seriesDBModel.v(cursorRawQuery.getString(2));
                            seriesDBModel.x(cursorRawQuery.getString(3));
                            seriesDBModel.I(c.h.a.h.n.e.S(cursorRawQuery.getString(4)));
                            seriesDBModel.B(cursorRawQuery.getString(5));
                            seriesDBModel.F(cursorRawQuery.getString(6));
                            seriesDBModel.A(cursorRawQuery.getString(7));
                            seriesDBModel.C(cursorRawQuery.getString(8));
                            seriesDBModel.D(cursorRawQuery.getString(9));
                            seriesDBModel.H(cursorRawQuery.getString(10));
                            seriesDBModel.E(cursorRawQuery.getString(11));
                            seriesDBModel.G(cursorRawQuery.getString(12));
                            seriesDBModel.t(cursorRawQuery.getString(13));
                            seriesDBModel.z(cursorRawQuery.getString(14));
                            seriesDBModel.s(cursorRawQuery.getString(15));
                            arrayList.add(seriesDBModel);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            str3 = str4;
                        }
                    }
                    cursorRawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String str5 = "stopped series";
        sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE name LIKE '%");
        sb2.append(str);
        sb2.append("%'  AND ");
        sb2.append("iptv_live_streams_m3u");
        sb2.append(InstructionFileId.DOT);
        sb2.append("user_id_referred");
        sb2.append("='");
        sb2.append(iZ);
        sb2.append("' AND ");
        sb2.append("iptv_live_streams_m3u");
        sb2.append(InstructionFileId.DOT);
        sb2.append("stream_type");
        sb2.append("='series' AND ");
        sb2.append("iptv_live_streams_m3u");
        sb2.append(InstructionFileId.DOT);
        sb2.append("categoryID");
        sb2.append(" NOT IN (SELECT ");
        sb2.append("iptv_password_status_table_m3u");
        sb2.append(InstructionFileId.DOT);
        sb2.append("password_status_cat_id");
        sb2.append(" FROM ");
        sb2.append("iptv_password_status_table_m3u");
        sb2.append(" WHERE ");
        sb2.append("iptv_password_status_table_m3u");
        sb2.append(InstructionFileId.DOT);
        sb2.append("user_id_referred");
        sb2.append(" ='");
        sb2.append(iZ);
        sb2.append("' AND ");
        sb2.append("iptv_password_status_table_m3u");
        sb2.append(InstructionFileId.DOT);
        sb2.append("password_status");
        sb2.append(" ='1')");
        String string2 = sb2.toString();
        ArrayList<SeriesDBModel> arrayList2 = new ArrayList<>();
        try {
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery(string2, null);
                if (cursorRawQuery2.moveToFirst()) {
                    while (true) {
                        AsyncTask asyncTask2 = c.h.a.h.n.e.f17066h;
                        if (asyncTask2 != null && asyncTask2.isCancelled()) {
                            Log.e("honey", str5);
                            break;
                        }
                        String str6 = str5;
                        SeriesDBModel seriesDBModel2 = new SeriesDBModel();
                        seriesDBModel2.u(Integer.parseInt(cursorRawQuery2.getString(0)));
                        seriesDBModel2.w(cursorRawQuery2.getString(1));
                        seriesDBModel2.v(cursorRawQuery2.getString(2));
                        seriesDBModel2.x(cursorRawQuery2.getString(3));
                        seriesDBModel2.I(c.h.a.h.n.e.S(cursorRawQuery2.getString(4)));
                        seriesDBModel2.B(cursorRawQuery2.getString(5));
                        String str7 = str2;
                        seriesDBModel2.F(str7);
                        seriesDBModel2.A(str7);
                        seriesDBModel2.C(str7);
                        seriesDBModel2.D(str7);
                        seriesDBModel2.H(str7);
                        seriesDBModel2.E(str7);
                        seriesDBModel2.G(str7);
                        seriesDBModel2.t(cursorRawQuery2.getString(8));
                        seriesDBModel2.z(str7);
                        seriesDBModel2.s(str7);
                        seriesDBModel2.y(cursorRawQuery2.getString(18));
                        arrayList2.add(seriesDBModel2);
                        if (!cursorRawQuery2.moveToNext()) {
                            break;
                        }
                        str2 = str7;
                        str5 = str6;
                    }
                }
                cursorRawQuery2.close();
                return arrayList2;
            } catch (SQLiteDatabaseLockedException unused5) {
                return null;
            } catch (Exception unused6) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused7) {
            return null;
        } catch (Exception unused8) {
            return null;
        }
    }

    public ArrayList<c.h.a.i.f> N0(String str) {
        String str2 = "SELECT stream_id_series_stream_v2,category_id_series_stream_v2,name_series_stream_v2,num_series_stream_v2 FROM series_streams_v2 WHERE stream_id_series_stream_v2 IN(" + str + ") AND user_id_referred = '" + m.z(this.f17240b) + "'";
        ArrayList<c.h.a.i.f> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.f fVar = new c.h.a.i.f();
                    fVar.C0("series");
                    fVar.B0(cursorRawQuery.getString(0));
                    fVar.g0(cursorRawQuery.getString(1));
                    fVar.t0(cursorRawQuery.getString(2));
                    fVar.u0(cursorRawQuery.getString(3));
                    arrayList.add(fVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public int N1(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM series_streams_v2 WHERE category_id_series_stream_v2='" + str + "'", null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<c.h.a.i.f> O0(String str) {
        String str2 = "SELECT stream_type,stream_id,categoryID,name,num FROM iptv_live_streams WHERE stream_id IN(" + str + ") AND user_id_referred = '" + m.z(this.f17240b) + "'";
        ArrayList<c.h.a.i.f> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.f fVar = new c.h.a.i.f();
                    fVar.C0(cursorRawQuery.getString(0));
                    fVar.B0(cursorRawQuery.getString(1));
                    fVar.g0(cursorRawQuery.getString(2));
                    fVar.t0(cursorRawQuery.getString(3));
                    fVar.u0(cursorRawQuery.getString(4));
                    arrayList.add(fVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public SeriesDBModel O1(String str) {
        String str2 = "SELECT  * FROM series_streams_v2 WHERE stream_id_series_stream_v2 ='" + str + "' AND user_id_referred = '" + m.z(this.f17240b) + "'";
        new ArrayList();
        SeriesDBModel seriesDBModel = new SeriesDBModel();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    seriesDBModel.u(Integer.parseInt(cursorRawQuery.getString(0)));
                    seriesDBModel.w(cursorRawQuery.getString(1));
                    seriesDBModel.v(cursorRawQuery.getString(2));
                    seriesDBModel.x(cursorRawQuery.getString(3));
                    seriesDBModel.I(c.h.a.h.n.e.S(cursorRawQuery.getString(4)));
                    seriesDBModel.B(cursorRawQuery.getString(5));
                    seriesDBModel.F(cursorRawQuery.getString(6));
                    seriesDBModel.A(cursorRawQuery.getString(7));
                    seriesDBModel.C(cursorRawQuery.getString(8));
                    seriesDBModel.D(cursorRawQuery.getString(9));
                    seriesDBModel.H(cursorRawQuery.getString(10));
                    seriesDBModel.E(cursorRawQuery.getString(11));
                    seriesDBModel.G(cursorRawQuery.getString(12));
                    seriesDBModel.t(cursorRawQuery.getString(13));
                    seriesDBModel.z(cursorRawQuery.getString(14));
                    seriesDBModel.s(cursorRawQuery.getString(15));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return seriesDBModel;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<c.h.a.i.f> P0(String str) {
        String str2 = "SELECT stream_id FROM iptv_live_streams WHERE stream_id IN(" + str + ") AND user_id_referred = '" + m.z(this.f17240b) + "'";
        ArrayList<c.h.a.i.f> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.f fVar = new c.h.a.i.f();
                    fVar.B0(cursorRawQuery.getString(0));
                    arrayList.add(fVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public c.h.a.i.f P1(String str, int i2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_recent_watched_m3u WHERE url = '" + str + "' AND user_id_referred = '" + i2 + "'", null);
            c.h.a.i.f fVar = new c.h.a.i.f();
            if (cursorRawQuery.moveToFirst()) {
                do {
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
                    fVar.G0(cursorRawQuery.getString(18));
                    fVar.H0(cursorRawQuery.getInt(19));
                    fVar.r0(cursorRawQuery.getLong(20));
                    fVar.q0(cursorRawQuery.getLong(21));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return fVar;
        } catch (SQLiteDatabaseLockedException | Exception unused2) {
            return null;
        }
    }

    public void Q(c.h.a.i.c cVar) {
        try {
            this.f17241c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", cVar.c());
            contentValues.put("user_id_referred", Integer.valueOf(cVar.d()));
            contentValues.put("name", cVar.b());
            contentValues.put("categoryID", cVar.a());
            this.f17241c.insert("iptv_m3u_favourites", null, contentValues);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public ArrayList<c.h.a.i.f> Q0(String str) {
        String str2 = "SELECT num,name,stream_type,stream_id,stream_icon,added,categoryID,container_extension,rating_from_ten,rating_from_five FROM iptv_live_streams WHERE stream_id IN(" + str + ") AND user_id_referred = '" + m.z(this.f17240b) + "' AND stream_type LIKE '%movie%'";
        ArrayList<c.h.a.i.f> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.f fVar = new c.h.a.i.f();
                    fVar.u0(cursorRawQuery.getString(0));
                    fVar.t0(cursorRawQuery.getString(1));
                    fVar.C0(cursorRawQuery.getString(2));
                    fVar.B0(cursorRawQuery.getString(3));
                    fVar.A0(cursorRawQuery.getString(4));
                    fVar.f0(cursorRawQuery.getString(5));
                    fVar.g0(cursorRawQuery.getString(6));
                    fVar.i0(cursorRawQuery.getString(7));
                    fVar.y0(cursorRawQuery.getString(8));
                    fVar.x0(cursorRawQuery.getString(9));
                    arrayList.add(fVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public int Q1(String str) {
        StringBuilder sb;
        String str2;
        int iZ = m.z(this.f17240b);
        if (m.f(this.f17240b).equals("m3u")) {
            sb = new StringBuilder();
            sb.append("SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE stream_type='");
            sb.append(str);
            str2 = "' AND ";
        } else {
            sb = new StringBuilder();
            sb.append("SELECT  COUNT(*) FROM iptv_live_streams WHERE stream_type LIKE '%");
            sb.append(str);
            str2 = "%' AND ";
        }
        sb.append(str2);
        sb.append("user_id_referred");
        sb.append("='");
        sb.append(iZ);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<GetEpisdoeDetailsCallback> R0(String str) {
        String str2 = "SELECT  category_id_series_stream_v2,stream_cover_series_stream_v2,num_series_stream_v2,name_series_stream_v2,stream_id_series_stream_v2 FROM series_streams_v2 WHERE stream_id_series_stream_v2 IN(" + str + ") AND user_id_referred = '" + m.z(this.f17240b) + "'";
        ArrayList<GetEpisdoeDetailsCallback> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                    getEpisdoeDetailsCallback.w(cursorRawQuery.getString(0));
                    getEpisdoeDetailsCallback.N(cursorRawQuery.getString(1));
                    getEpisdoeDetailsCallback.Q(cursorRawQuery.getString(2));
                    getEpisdoeDetailsCallback.P(cursorRawQuery.getString(3));
                    getEpisdoeDetailsCallback.O(cursorRawQuery.getString(4));
                    arrayList.add(getEpisdoeDetailsCallback);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public int R1(String str, String str2) {
        int iZ = m.z(this.f17240b);
        if (str2.equals("live")) {
            try {
                Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams WHERE ( stream_type LIKE '%" + str2 + "%' OR stream_type LIKE '%radio%' )  AND categoryID='" + str + "' AND user_id_referred='" + iZ + "'", null);
                cursorRawQuery.moveToFirst();
                int i2 = cursorRawQuery.getInt(0);
                cursorRawQuery.close();
                return i2;
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                return 0;
            }
        }
        if (str2.equals("movie")) {
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams WHERE ( stream_type LIKE '%" + str2 + "%' OR stream_type LIKE '%radio%' )  AND categoryID='" + str + "' AND user_id_referred='" + iZ + "'", null);
                cursorRawQuery2.moveToFirst();
                int i3 = cursorRawQuery2.getInt(0);
                cursorRawQuery2.close();
                return i3;
            } catch (SQLiteDatabaseLockedException | Exception unused2) {
                return 0;
            }
        }
        try {
            Cursor cursorRawQuery3 = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams WHERE ( stream_type LIKE '%" + str2 + "%' OR stream_type LIKE '%radio%' )  AND categoryID='" + str + "' AND user_id_referred='" + iZ + "'", null);
            cursorRawQuery3.moveToFirst();
            int i4 = cursorRawQuery3.getInt(0);
            cursorRawQuery3.close();
            return i4;
        } catch (SQLiteDatabaseLockedException | Exception unused3) {
            return 0;
        }
    }

    public ArrayList<c> S0() {
        int iZ = m.z(this.f17240b);
        String str = "SELECT  * FROM " + (m.f(this.f17240b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources") + " WHERE user_id_referred ='" + iZ + "' AND default_source = '1' LIMIT 1";
        try {
            ArrayList<c> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c cVar = new c();
                    cVar.h(c.h.a.h.n.e.S(cursorRawQuery.getString(0)));
                    cVar.k(cursorRawQuery.getString(1));
                    cVar.i(cursorRawQuery.getString(2));
                    cVar.j(cursorRawQuery.getString(3));
                    cVar.g(cursorRawQuery.getString(4));
                    cVar.f(cursorRawQuery.getString(5));
                    arrayList.add(cVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public int S1(String str) {
        StringBuilder sb;
        String str2;
        int iZ = m.z(this.f17240b);
        if (m.f(this.f17240b).equals("m3u")) {
            sb = new StringBuilder();
            sb.append("SELECT iptv_live_streams_m3u.url  FROM epg_m3u , iptv_live_streams_m3u WHERE iptv_live_streams_m3u.user_id_referred = '");
            sb.append(iZ);
            sb.append("' AND ");
            sb.append("epg_m3u");
            sb.append(InstructionFileId.DOT);
            sb.append("source_ref_id");
            sb.append(" = '");
            sb.append(str);
            sb.append("' AND ");
            sb.append("epg_m3u");
            sb.append(InstructionFileId.DOT);
            sb.append("channel_id");
            sb.append(" = ");
            sb.append("iptv_live_streams_m3u");
            sb.append(InstructionFileId.DOT);
            sb.append("epg_channel_id");
            sb.append(" AND ");
            sb.append("iptv_live_streams_m3u");
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" NOT IN (SELECT ");
            sb.append("iptv_password_status_table_m3u");
            sb.append(InstructionFileId.DOT);
            sb.append("password_status_cat_id");
            sb.append(" FROM ");
            sb.append("iptv_password_status_table_m3u");
            sb.append(" WHERE ");
            sb.append("iptv_password_status_table_m3u");
            sb.append(InstructionFileId.DOT);
            sb.append("user_id_referred");
            sb.append(" ='");
            sb.append(iZ);
            sb.append("' AND ");
            sb.append("iptv_password_status_table_m3u");
            sb.append(InstructionFileId.DOT);
            sb.append("password_status");
            sb.append(" ='1') GROUP BY ");
            sb.append("iptv_live_streams_m3u");
            sb.append(InstructionFileId.DOT);
            str2 = "url";
        } else {
            sb = new StringBuilder();
            sb.append("SELECT iptv_live_streams.stream_id  FROM epg , iptv_live_streams WHERE iptv_live_streams.user_id_referred = '");
            sb.append(iZ);
            sb.append("' AND ");
            sb.append("epg");
            sb.append(InstructionFileId.DOT);
            sb.append("source_ref_id");
            sb.append(" = '");
            sb.append(str);
            sb.append("' AND ");
            sb.append("epg");
            sb.append(InstructionFileId.DOT);
            sb.append("channel_id");
            sb.append(" = ");
            sb.append("iptv_live_streams");
            sb.append(InstructionFileId.DOT);
            sb.append("epg_channel_id");
            sb.append(" AND ");
            sb.append("iptv_live_streams");
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" NOT IN (SELECT ");
            sb.append("iptv_password_status_table");
            sb.append(InstructionFileId.DOT);
            sb.append("password_status_cat_id");
            sb.append(" FROM ");
            sb.append("iptv_password_status_table");
            sb.append(" WHERE ");
            sb.append("iptv_password_status_table");
            sb.append(InstructionFileId.DOT);
            sb.append("user_id_referred");
            sb.append(" ='");
            sb.append(iZ);
            sb.append("' AND ");
            sb.append("iptv_password_status_table");
            sb.append(InstructionFileId.DOT);
            sb.append("password_status");
            sb.append(" ='1') GROUP BY ");
            sb.append("iptv_live_streams");
            sb.append(InstructionFileId.DOT);
            str2 = "stream_id";
        }
        sb.append(str2);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException unused) {
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    public ArrayList<c.h.a.i.f> T0(String str) {
        int iZ = m.z(this.f17240b);
        ArrayList<c.h.a.i.f> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT stream_id FROM iptv_live_streams WHERE stream_type LIKE '%" + str + "%'  AND iptv_live_streams" + InstructionFileId.DOT + "user_id_referred='" + iZ + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    int i2 = 0;
                    try {
                        i2 = Integer.parseInt(cursorRawQuery.getString(0));
                    } catch (NumberFormatException unused) {
                    }
                    c.h.a.i.f fVar = new c.h.a.i.f();
                    fVar.B0(String.valueOf(i2));
                    arrayList.add(fVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused2) {
            return null;
        }
    }

    public int T1(String str, String str2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams WHERE ( stream_type LIKE '%" + str2 + "%' )  AND categoryID='" + str + "' AND user_id_referred = '" + m.z(this.f17240b) + "'", null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<c.h.a.i.c> U(String str, int i2) {
        ArrayList<c.h.a.i.c> arrayList = new ArrayList<>();
        try {
            String str2 = "SELECT  * FROM iptv_m3u_favourites WHERE url='" + str + "' AND user_id_referred=" + i2 + BuildConfig.FLAVOR;
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17241c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.c cVar = new c.h.a.i.c();
                    cVar.f(Integer.parseInt(cursorRawQuery.getString(0)));
                    cVar.h(str);
                    cVar.i(i2);
                    cVar.g(cursorRawQuery.getString(3));
                    cVar.e(cursorRawQuery.getString(4));
                    arrayList.add(cVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
            return arrayList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f0 A[Catch: SQLiteDatabaseLockedException | Exception -> 0x01a0, LOOP:0: B:19:0x00f0->B:37:?, LOOP_START, TryCatch #0 {SQLiteDatabaseLockedException | Exception -> 0x01a0, blocks: (B:17:0x00e2, B:19:0x00f0, B:21:0x019c), top: B:32:0x00e2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<c.h.a.i.f> U0(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.i.q.f.U0(java.lang.String):java.util.ArrayList");
    }

    public int U1(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM series_m3u_streams WHERE series_m3u_stream_container_cat_id ='" + str + "'", null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int V(String str) {
        int iZ = m.z(this.f17240b);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM " + (m.f(this.f17240b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources") + " WHERE user_id_referred ='" + iZ + "' AND epgurl = '" + str + "'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5 A[Catch: SQLiteDatabaseLockedException | Exception -> 0x0199, LOOP:0: B:27:0x00c5->B:42:?, LOOP_START, TRY_LEAVE, TryCatch #1 {SQLiteDatabaseLockedException | Exception -> 0x0199, blocks: (B:25:0x00b7, B:27:0x00c5, B:29:0x00cb, B:29:0x00cb, B:31:0x00d7, B:31:0x00d7, B:33:0x0195, B:33:0x0195), top: B:39:0x00b7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<c.h.a.i.f> V0(java.lang.String r8, int r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.i.q.f.V0(java.lang.String, int, java.lang.String):java.util.ArrayList");
    }

    public int V1(Boolean bool) {
        StringBuilder sb;
        String str;
        int iZ = m.z(this.f17240b);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            sb.append("SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE categoryID='' AND user_id_referred='");
            sb.append(iZ);
            sb.append("' AND ");
            sb.append("move_to");
            sb.append(" NOT IN ('live','movie','series') OR ");
            sb.append("move_to");
            str = " IS NULL";
        } else {
            sb = new StringBuilder();
            sb.append("SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE categoryID='' AND user_id_referred='");
            sb.append(iZ);
            str = "'";
        }
        sb.append(str);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:143:0x085a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0d59  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x182a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x1902  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0399  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<c.h.a.i.f> W0(java.lang.String r50, java.lang.String r51) {
        /*
            Method dump skipped, instruction units count: 6634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.i.q.f.W0(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public int W1(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE categoryID='' AND user_id_referred='" + m.z(this.f17240b) + "' AND stream_type='" + str + "'", null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<c.h.a.i.f> X0(String str, String str2) {
        String string;
        ArrayList<c.h.a.i.f> arrayList;
        String str3;
        ArrayList<c.h.a.i.f> arrayList2 = new ArrayList<>();
        int iZ = m.z(this.f17240b);
        if (m.f(this.f17240b).equals("m3u")) {
            if (str.equals("0")) {
                str3 = "SELECT  * FROM iptv_live_streams_m3u WHERE stream_type ='" + str2 + "' AND user_id_referred='" + iZ + "'";
            } else if (str.equals("-2") || str.equals("-3") || str.equals(Constants.NULL_VERSION_ID)) {
                str3 = BuildConfig.FLAVOR;
            } else {
                str3 = "SELECT  * FROM iptv_live_streams_m3u WHERE stream_type ='" + str2 + "' AND categoryID ='" + str + "' AND user_id_referred='" + iZ + "'";
            }
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery(str3, null);
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            c.h.a.i.f fVar = new c.h.a.i.f();
                            fVar.n0(Integer.parseInt(cursorRawQuery.getString(0)));
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
                            fVar.G0(cursorRawQuery.getString(18));
                            arrayList2.add(fVar);
                        } while (cursorRawQuery.moveToNext());
                    }
                    cursorRawQuery.close();
                    return arrayList2;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        ArrayList<c.h.a.i.f> arrayList3 = arrayList2;
        if (str.equals("0") && str2.equals("live")) {
            string = "SELECT  * FROM iptv_live_streams WHERE (stream_type LIKE '%" + str2 + "%' OR stream_type LIKE '%radio%' ) AND user_id_referred='" + iZ + "'";
        } else if (str.equals("-2") || str.equals("-3")) {
            string = "SELECT  * FROM iptv_live_streams WHERE (stream_type LIKE '%" + str2 + "%' OR stream_type LIKE '%radio%' ) AND categoryID ='" + str + "' AND user_id_referred='" + iZ + "'";
        } else {
            StringBuilder sb = str.equals(Constants.NULL_VERSION_ID) ? new StringBuilder() : new StringBuilder();
            sb.append("SELECT  * FROM iptv_live_streams WHERE categoryID ='");
            sb.append(str);
            sb.append("' AND ");
            sb.append("user_id_referred");
            sb.append("='");
            sb.append(iZ);
            sb.append("'");
            string = sb.toString();
        }
        try {
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery(string, null);
                if (cursorRawQuery2.moveToFirst()) {
                    while (true) {
                        c.h.a.i.f fVar2 = new c.h.a.i.f();
                        fVar2.n0(Integer.parseInt(cursorRawQuery2.getString(0)));
                        fVar2.u0(cursorRawQuery2.getString(1));
                        fVar2.t0(cursorRawQuery2.getString(2));
                        fVar2.C0(cursorRawQuery2.getString(3));
                        fVar2.B0(cursorRawQuery2.getString(4));
                        fVar2.A0(cursorRawQuery2.getString(5));
                        fVar2.l0(cursorRawQuery2.getString(6));
                        fVar2.f0(cursorRawQuery2.getString(7));
                        fVar2.g0(cursorRawQuery2.getString(8));
                        fVar2.j0(cursorRawQuery2.getString(9));
                        fVar2.D0(cursorRawQuery2.getString(10));
                        fVar2.k0(cursorRawQuery2.getString(11));
                        fVar2.E0(cursorRawQuery2.getString(12));
                        fVar2.F0(cursorRawQuery2.getString(13));
                        fVar2.h0(cursorRawQuery2.getString(14));
                        fVar2.z0(cursorRawQuery2.getString(15));
                        fVar2.p0(cursorRawQuery2.getString(16));
                        fVar2.i0(cursorRawQuery2.getString(17));
                        arrayList = arrayList3;
                        arrayList.add(fVar2);
                        if (!cursorRawQuery2.moveToNext()) {
                            break;
                        }
                        arrayList3 = arrayList;
                    }
                } else {
                    arrayList = arrayList3;
                }
                cursorRawQuery2.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException unused5) {
                return null;
            } catch (Exception unused6) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused7) {
            return null;
        } catch (Exception unused8) {
            return null;
        }
    }

    public int X1(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM series_streams_v2 WHERE category_id_series_stream_v2 ='" + str + "' AND user_id_referred = '" + m.z(this.f17240b) + "'", null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<c.h.a.i.b> Y0() {
        String str = "SELECT GROUP_CONCAT(stream_id_url) AS stream_id_url , app_type FROM iptv_live_watched WHERE user_id_referred=" + m.z(this.f17240b) + " GROUP BY app_type";
        ArrayList<c.h.a.i.b> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17241c = readableDatabase;
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

    public e Y1(String str) {
        String str2;
        int iZ = m.z(this.f17240b);
        String strF = m.f(this.f17240b);
        if (str.equals("epg")) {
            ArrayList<c> arrayListS0 = S0();
            str2 = "SELECT * FROM iptv_import_status WHERE type = '" + str + "' AND user_id_referred = '" + iZ + "' AND app_type = '" + strF + "' AND source_ref_id = '" + ((arrayListS0 == null || arrayListS0.size() <= 0) ? "0" : String.valueOf(arrayListS0.get(0).c())) + "'";
        } else {
            str2 = "SELECT * FROM iptv_import_status WHERE type = '" + str + "' AND user_id_referred = '" + iZ + "' AND app_type = '" + strF + "'";
        }
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            e eVar = new e();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    eVar.h(c.h.a.h.n.e.S(cursorRawQuery.getString(0)));
                    eVar.l(cursorRawQuery.getString(1));
                    eVar.j(cursorRawQuery.getString(2));
                    eVar.g(cursorRawQuery.getString(3));
                    eVar.k(cursorRawQuery.getString(4));
                    eVar.i(cursorRawQuery.getString(7));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return eVar;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<c.h.a.i.e> Z0(String str) {
        ArrayList<c.h.a.i.e> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_movie_category WHERE paent_id='" + str + "' AND user_id_referred='" + m.z(this.f17240b) + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.e eVar = new c.h.a.i.e();
                    eVar.f(Integer.parseInt(cursorRawQuery.getString(0)));
                    eVar.g(cursorRawQuery.getString(1));
                    eVar.h(cursorRawQuery.getString(2));
                    eVar.j(Integer.parseInt(cursorRawQuery.getString(3)));
                    arrayList.add(eVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public e Z1(String str, String str2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_import_status WHERE type = '" + str + "' AND user_id_referred = '" + m.z(this.f17240b) + "' AND app_type = '" + m.f(this.f17240b) + "' AND source_ref_id = '" + str2 + "'", null);
            e eVar = new e();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    eVar.h(c.h.a.h.n.e.S(cursorRawQuery.getString(0)));
                    eVar.l(cursorRawQuery.getString(1));
                    eVar.j(cursorRawQuery.getString(2));
                    eVar.g(cursorRawQuery.getString(3));
                    eVar.k(cursorRawQuery.getString(4));
                    eVar.i(cursorRawQuery.getString(7));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return eVar;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<c.h.a.i.e> a1() {
        ArrayList<c.h.a.i.e> arrayList;
        int i2;
        ArrayList<c.h.a.i.e> arrayList2;
        ArrayList<c.h.a.i.e> arrayList3 = new ArrayList<>();
        int iZ = m.z(this.f17240b);
        ArrayList<c.h.a.i.e> arrayList4 = arrayList3;
        if (m.f(this.f17240b).equals("m3u")) {
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT iptv_movie_category_m3u.* , COUNT(iptv_live_streams_m3u.id) AS TOTAL_COUNT FROM iptv_movie_category_m3u,iptv_live_streams_m3u WHERE iptv_movie_category_m3u.categoryID = iptv_live_streams_m3u.categoryID AND iptv_movie_category_m3u.user_id_referred = '" + iZ + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "user_id_referred = '" + iZ + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "stream_type = 'movie' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table_m3u WHERE iptv_password_status_table_m3u" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status ='1') GROUP BY iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID ORDER BY iptv_movie_category_m3u" + InstructionFileId.DOT + Name.MARK, null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            c.h.a.i.e eVar = new c.h.a.i.e();
                            eVar.f(Integer.parseInt(cursorRawQuery.getString(0)));
                            eVar.g(cursorRawQuery.getString(1));
                            eVar.h(cursorRawQuery.getString(2));
                            eVar.i(c.h.a.h.n.e.S(cursorRawQuery.getString(5)));
                            arrayList2 = arrayList4;
                            arrayList2.add(eVar);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            arrayList4 = arrayList2;
                        }
                    } else {
                        arrayList2 = arrayList4;
                    }
                    cursorRawQuery.close();
                    return arrayList2;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        try {
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT iptv_movie_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_movie_category,iptv_live_streams WHERE iptv_movie_category.categoryID_movie = iptv_live_streams.categoryID AND iptv_movie_category.user_id_referred = '" + iZ + "' AND iptv_live_streams" + InstructionFileId.DOT + "user_id_referred = '" + iZ + "' AND iptv_live_streams" + InstructionFileId.DOT + "stream_type = 'movie' AND iptv_live_streams" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1') GROUP BY iptv_live_streams" + InstructionFileId.DOT + "categoryID ORDER BY iptv_movie_category" + InstructionFileId.DOT + "id_movie", null);
                if (cursorRawQuery2.moveToFirst()) {
                    while (true) {
                        try {
                            i2 = Integer.parseInt(cursorRawQuery2.getString(3));
                        } catch (NumberFormatException unused5) {
                            i2 = 0;
                        }
                        c.h.a.i.e eVar2 = new c.h.a.i.e();
                        eVar2.f(Integer.parseInt(cursorRawQuery2.getString(0)));
                        eVar2.g(cursorRawQuery2.getString(1));
                        eVar2.h(cursorRawQuery2.getString(2));
                        eVar2.j(i2);
                        eVar2.i(c.h.a.h.n.e.S(cursorRawQuery2.getString(5)));
                        arrayList = arrayList4;
                        arrayList.add(eVar2);
                        if (!cursorRawQuery2.moveToNext()) {
                            break;
                        }
                        arrayList4 = arrayList;
                    }
                } else {
                    arrayList = arrayList4;
                }
                cursorRawQuery2.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException unused6) {
                return null;
            } catch (Exception unused7) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused8) {
            return null;
        } catch (Exception unused9) {
            return null;
        }
    }

    public ArrayList<e> a2() {
        int iZ = m.z(this.f17240b);
        String strF = m.f(this.f17240b);
        ArrayList<e> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_import_status WHERE user_id_referred = '" + iZ + "' AND app_type = '" + strF + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    e eVar = new e();
                    eVar.h(c.h.a.h.n.e.S(cursorRawQuery.getString(0)));
                    eVar.l(cursorRawQuery.getString(1));
                    eVar.j(cursorRawQuery.getString(2));
                    eVar.g(cursorRawQuery.getString(3));
                    eVar.k(cursorRawQuery.getString(4));
                    eVar.i(cursorRawQuery.getString(7));
                    arrayList.add(eVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<c.h.a.i.e> b1() {
        StringBuilder sb;
        String str;
        int i2;
        ArrayList<c.h.a.i.e> arrayList = new ArrayList<>();
        int iZ = m.z(this.f17240b);
        if (m.f(this.f17240b).equals("m3u")) {
            sb = new StringBuilder();
            sb.append("SELECT * FROM iptv_movie_category_m3u WHERE user_id_referred='");
            sb.append(iZ);
            sb.append("' AND ");
            sb.append("categoryID");
            str = " IS NOT NULL";
        } else {
            sb = new StringBuilder();
            sb.append("SELECT iptv_movie_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_movie_category,iptv_live_streams WHERE iptv_movie_category.categoryID_movie = iptv_live_streams.categoryID AND iptv_movie_category.user_id_referred = '");
            sb.append(iZ);
            sb.append("' AND ");
            sb.append("iptv_live_streams");
            sb.append(InstructionFileId.DOT);
            sb.append("stream_type");
            sb.append(" = 'movie' GROUP BY ");
            sb.append("iptv_live_streams");
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" ORDER BY ");
            sb.append("iptv_movie_category");
            sb.append(InstructionFileId.DOT);
            str = "id_movie";
        }
        sb.append(str);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    try {
                        i2 = Integer.parseInt(cursorRawQuery.getString(3));
                    } catch (NumberFormatException unused) {
                        i2 = 0;
                    }
                    c.h.a.i.e eVar = new c.h.a.i.e();
                    eVar.f(Integer.parseInt(cursorRawQuery.getString(0)));
                    eVar.g(cursorRawQuery.getString(1));
                    eVar.h(cursorRawQuery.getString(2));
                    eVar.j(i2);
                    eVar.i(c.h.a.h.n.e.S(cursorRawQuery.getString(5)));
                    arrayList.add(eVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused2) {
            return null;
        }
    }

    public void b2(ArrayList<e> arrayList, String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                int iZ = m.z(this.f17240b);
                ContentValues contentValues = new ContentValues();
                int size = arrayList.size();
                if (size != 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        contentValues.put("type", arrayList.get(i2).f());
                        contentValues.put("status", arrayList.get(i2).d());
                        contentValues.put("date", arrayList.get(i2).a());
                        contentValues.put("time", arrayList.get(i2).e());
                        contentValues.put("user_id_referred", Integer.valueOf(iZ));
                        contentValues.put("app_type", str);
                        contentValues.put("source_ref_id", arrayList.get(i2).c());
                        writableDatabase.insert("iptv_import_status", null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }

    public final int c0(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_category WHERE categoryID_live ='" + str + "' AND user_id_referred='" + m.z(this.f17240b) + "'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<h> c1(int i2) {
        StringBuilder sb;
        String str;
        ArrayList<h> arrayList = new ArrayList<>();
        if (m.f(this.f17240b).equals("m3u")) {
            sb = new StringBuilder();
            str = "SELECT * FROM iptv_password_table_m3u WHERE user_id_referred=";
        } else {
            sb = new StringBuilder();
            str = "SELECT * FROM iptv_password_table WHERE user_id_referred=";
        }
        sb.append(str);
        sb.append(i2);
        sb.append(BuildConfig.FLAVOR);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    h hVar = new h();
                    hVar.d(Integer.parseInt(cursorRawQuery.getString(0)));
                    hVar.e(cursorRawQuery.getString(1));
                    hVar.g(cursorRawQuery.getString(2));
                    arrayList.add(hVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public int c2(String str, int i2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_recent_watched_m3u WHERE url='" + str + "' AND user_id_referred='" + i2 + "'", null);
            cursorRawQuery.moveToFirst();
            int i3 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i3;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void d(Map<String, c.h.a.i.g> map) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                for (c.h.a.i.g gVar : map.values()) {
                    if (gVar.a() != null) {
                        contentValues.put("categoryID", gVar.a());
                    } else {
                        contentValues.put("categoryID", BuildConfig.FLAVOR);
                    }
                    if (gVar.b() != null) {
                        contentValues.put("categoryname", gVar.b());
                    } else {
                        contentValues.put("categoryname", BuildConfig.FLAVOR);
                    }
                    contentValues.put("user_id_referred", Integer.valueOf(m.z(this.f17240b)));
                    writableDatabase.insert("iptv_m3u_all_category", null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }

    public ArrayList<i> d1(int i2) {
        ArrayList<i> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM " + (m.f(this.f17240b).equals("m3u") ? "iptv_password_status_table_m3u" : "iptv_password_status_table") + " WHERE user_id_referred=" + i2 + BuildConfig.FLAVOR, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    i iVar = new i();
                    iVar.e(Integer.parseInt(cursorRawQuery.getString(0)));
                    iVar.g(cursorRawQuery.getString(1));
                    iVar.h(cursorRawQuery.getString(2));
                    iVar.f(cursorRawQuery.getString(3));
                    arrayList.add(iVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public int d2() {
        try {
            String strF = m.f(this.f17240b);
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_watched WHERE user_id_referred='" + m.z(this.f17240b) + "' AND app_type = '" + strF + "'", null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int e1(int i2) {
        int i3;
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_live_streams WHERE stream_type ='movie' AND user_id_referred = '" + m.z(this.f17240b) + "'  ORDER BY " + Name.MARK + " DESC LIMIT " + i2, null);
            if (cursorRawQuery.moveToFirst()) {
                i3 = 0;
                while (true) {
                    AsyncTask asyncTask = c.h.a.h.n.e.f17063e;
                    if (asyncTask != null && asyncTask.isCancelled()) {
                        Log.e("honey", "stopped");
                        break;
                    }
                    i3++;
                    if (!cursorRawQuery.moveToNext()) {
                        break;
                    }
                }
            } else {
                i3 = 0;
            }
            cursorRawQuery.close();
            return i3;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void e2() {
        int iZ = m.z(this.f17240b);
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.execSQL("DELETE FROM iptv_m3u_all_category WHERE user_id_referred='" + iZ + "'");
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public int f1(int i2) {
        int i3;
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM series_streams_v2 WHERE user_id_referred = '" + m.z(this.f17240b) + "' ORDER BY id_series_stream_v2 DESC LIMIT " + i2, null);
            if (cursorRawQuery.moveToFirst()) {
                i3 = 0;
                while (true) {
                    AsyncTask asyncTask = c.h.a.h.n.e.f17063e;
                    if (asyncTask != null && asyncTask.isCancelled()) {
                        Log.e("honey", "stopped");
                        break;
                    }
                    i3++;
                    if (!cursorRawQuery.moveToNext()) {
                        break;
                    }
                }
            } else {
                i3 = 0;
            }
            cursorRawQuery.close();
            return i3;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void f2(int i2) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.execSQL("DELETE FROM iptv_movie_category_m3u WHERE user_id_referred='" + i2 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_series_category_m3u WHERE user_id_referred='" + i2 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_live_category_m3u WHERE user_id_referred='" + i2 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_live_streams_m3u WHERE user_id_referred='" + i2 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_m3u_all_category WHERE user_id_referred='" + i2 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_m3u_favourites WHERE user_id_referred='" + i2 + "'");
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public ArrayList<c.h.a.i.f> g1() {
        ArrayList<c.h.a.i.f> arrayList;
        ArrayList<c.h.a.i.f> arrayList2;
        int iZ = m.z(this.f17240b);
        String strF = m.f(this.f17240b);
        ArrayList<c.h.a.i.f> arrayList3 = new ArrayList<>();
        if (strF.equals("m3u")) {
            try {
                Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT iptv_live_streams_m3u.* FROM iptv_live_streams_m3u INNER JOIN iptv_live_watched ON iptv_live_streams_m3u.url = iptv_live_watched.stream_id_url AND iptv_live_streams_m3u.stream_type LIKE '%live%'  AND iptv_live_streams_m3u.user_id_referred ='" + iZ + "' AND iptv_live_watched" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_live_watched" + InstructionFileId.DOT + "app_type ='m3u' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table_m3u WHERE iptv_password_status_table_m3u" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status ='1') ORDER BY iptv_live_watched" + InstructionFileId.DOT + Name.MARK + " DESC", null);
                if (cursorRawQuery.moveToFirst()) {
                    while (m.b(this.f17240b) != 1) {
                        try {
                            c.h.a.i.f fVar = new c.h.a.i.f();
                            fVar.n0(Integer.parseInt(cursorRawQuery.getString(0)));
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
                            fVar.G0(cursorRawQuery.getString(18));
                            arrayList2 = arrayList3;
                            arrayList2.add(fVar);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            arrayList3 = arrayList2;
                        } catch (SQLiteDatabaseLockedException unused) {
                            return null;
                        } catch (Exception unused2) {
                            return null;
                        }
                    }
                    m.K(0, this.f17240b);
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = arrayList3;
                }
                cursorRawQuery.close();
                return arrayList2;
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        ArrayList<c.h.a.i.f> arrayList4 = arrayList3;
        try {
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT iptv_live_streams.* FROM iptv_live_streams INNER JOIN iptv_live_watched ON iptv_live_streams.stream_id = iptv_live_watched.stream_id_url AND iptv_live_streams.stream_type LIKE '%live%'  AND iptv_live_streams.user_id_referred ='" + iZ + "' AND iptv_live_watched" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_live_watched" + InstructionFileId.DOT + "app_type ='api' AND iptv_live_streams" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1') ORDER BY iptv_live_watched" + InstructionFileId.DOT + Name.MARK + " DESC", null);
                if (cursorRawQuery2.moveToFirst()) {
                    while (m.b(this.f17240b) != 1) {
                        try {
                            c.h.a.i.f fVar2 = new c.h.a.i.f();
                            fVar2.n0(Integer.parseInt(cursorRawQuery2.getString(0)));
                            fVar2.u0(cursorRawQuery2.getString(1));
                            fVar2.t0(cursorRawQuery2.getString(2));
                            fVar2.C0(cursorRawQuery2.getString(3));
                            fVar2.B0(cursorRawQuery2.getString(4));
                            fVar2.A0(cursorRawQuery2.getString(5));
                            fVar2.l0(cursorRawQuery2.getString(6));
                            fVar2.f0(cursorRawQuery2.getString(7));
                            fVar2.g0(cursorRawQuery2.getString(8));
                            fVar2.j0(cursorRawQuery2.getString(9));
                            fVar2.D0(cursorRawQuery2.getString(10));
                            fVar2.k0(cursorRawQuery2.getString(11));
                            fVar2.E0(cursorRawQuery2.getString(12));
                            fVar2.F0(cursorRawQuery2.getString(13));
                            fVar2.h0(cursorRawQuery2.getString(14));
                            fVar2.z0(cursorRawQuery2.getString(15));
                            fVar2.p0(cursorRawQuery2.getString(16));
                            fVar2.i0(cursorRawQuery2.getString(17));
                            fVar2.y0(cursorRawQuery2.getString(18));
                            fVar2.x0(cursorRawQuery2.getString(19));
                            arrayList = arrayList4;
                            arrayList.add(fVar2);
                            if (!cursorRawQuery2.moveToNext()) {
                                break;
                            }
                            arrayList4 = arrayList;
                        } catch (SQLiteDatabaseLockedException unused5) {
                            return null;
                        } catch (Exception unused6) {
                            return null;
                        }
                    }
                    m.K(0, this.f17240b);
                }
                arrayList = arrayList4;
                cursorRawQuery2.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException unused7) {
                return null;
            } catch (Exception unused8) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused9) {
        } catch (Exception unused10) {
        }
    }

    public void g2(int i2, String str) {
        try {
            String str2 = str.equals("m3u") ? "epg_m3u" : "epg";
            getWritableDatabase().execSQL("DELETE FROM " + str2 + " WHERE user_id_referred = '" + i2 + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public ArrayList<c.h.a.i.e> h1() {
        ArrayList<c.h.a.i.e> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_series_category_m3u WHERE user_id_referred='" + m.z(this.f17240b) + "' AND categoryID IS NOT NULL", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.e eVar = new c.h.a.i.e();
                    eVar.f(Integer.parseInt(cursorRawQuery.getString(0)));
                    eVar.g(cursorRawQuery.getString(1));
                    eVar.h(cursorRawQuery.getString(2));
                    eVar.j(0);
                    arrayList.add(eVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public void h2(String str) {
        try {
            int iZ = m.z(this.f17240b);
            String str2 = m.f(this.f17240b).equals("m3u") ? "epg_m3u" : "epg";
            getWritableDatabase().execSQL("DELETE FROM " + str2 + " WHERE user_id_referred = '" + iZ + "' AND source_ref_id = '" + str + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public boolean i(List<LiveStreamsCallback> list) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    int iZ = m.z(this.f17240b);
                    ContentValues contentValues = new ContentValues();
                    for (LiveStreamsCallback liveStreamsCallback : list) {
                        c.h.a.h.n.e.f17067i = true;
                        if (liveStreamsCallback.g() != null) {
                            contentValues.put("num", String.valueOf(liveStreamsCallback.g()));
                        } else {
                            contentValues.put("num", BuildConfig.FLAVOR);
                        }
                        if (liveStreamsCallback.f() != null) {
                            contentValues.put("name", liveStreamsCallback.f());
                        } else {
                            contentValues.put("name", BuildConfig.FLAVOR);
                        }
                        if (liveStreamsCallback.j() != null) {
                            contentValues.put("stream_type", liveStreamsCallback.j());
                        } else {
                            contentValues.put("stream_type", BuildConfig.FLAVOR);
                        }
                        if (liveStreamsCallback.i() != null) {
                            contentValues.put("stream_id", liveStreamsCallback.i());
                        } else {
                            contentValues.put("stream_id", BuildConfig.FLAVOR);
                        }
                        if (liveStreamsCallback.h() != null) {
                            contentValues.put("stream_icon", liveStreamsCallback.h());
                        } else {
                            contentValues.put("stream_icon", BuildConfig.FLAVOR);
                        }
                        if (liveStreamsCallback.e() != null) {
                            contentValues.put("epg_channel_id", liveStreamsCallback.e());
                        } else {
                            contentValues.put("epg_channel_id", BuildConfig.FLAVOR);
                        }
                        if (liveStreamsCallback.a() != null) {
                            contentValues.put("added", liveStreamsCallback.a());
                        } else {
                            contentValues.put("added", BuildConfig.FLAVOR);
                        }
                        if (liveStreamsCallback.b() == null || c0(liveStreamsCallback.b()) <= 0) {
                            contentValues.put("categoryID", "-2");
                        } else {
                            contentValues.put("categoryID", liveStreamsCallback.b());
                        }
                        if (liveStreamsCallback.c() != null) {
                            contentValues.put("custom_sid", liveStreamsCallback.c());
                        } else {
                            contentValues.put("custom_sid", BuildConfig.FLAVOR);
                        }
                        if (liveStreamsCallback.k() != null) {
                            contentValues.put("tv_archive", liveStreamsCallback.k());
                        } else {
                            contentValues.put("tv_archive", BuildConfig.FLAVOR);
                        }
                        if (liveStreamsCallback.d() != null) {
                            contentValues.put("direct_source", liveStreamsCallback.d());
                        } else {
                            contentValues.put("direct_source", BuildConfig.FLAVOR);
                        }
                        if (liveStreamsCallback.l() != null) {
                            contentValues.put("tv_archive_duration", liveStreamsCallback.l());
                        } else {
                            contentValues.put("tv_archive_duration", BuildConfig.FLAVOR);
                        }
                        contentValues.put("type_name", BuildConfig.FLAVOR);
                        contentValues.put("category_name", BuildConfig.FLAVOR);
                        contentValues.put("series_no", BuildConfig.FLAVOR);
                        contentValues.put("live", BuildConfig.FLAVOR);
                        contentValues.put("container_extension", BuildConfig.FLAVOR);
                        contentValues.put("rating_from_ten", BuildConfig.FLAVOR);
                        contentValues.put("rating_from_five", BuildConfig.FLAVOR);
                        contentValues.put("user_id_referred", Integer.valueOf(iZ));
                        writableDatabase.insert("iptv_live_streams", null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    c.h.a.h.n.e.f17067i = false;
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    Log.w("msg", "exception");
                    writableDatabase.endTransaction();
                    c.h.a.h.n.e.f17067i = false;
                    return false;
                }
            } catch (Exception unused2) {
                writableDatabase.endTransaction();
                c.h.a.h.n.e.f17067i = false;
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public ArrayList<c.h.a.i.e> i1() {
        int iZ = m.z(this.f17240b);
        ArrayList<c.h.a.i.e> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT series_category_v2.* FROM series_category_v2,series_streams_v2 WHERE series_category_v2.category_id_series_v2 = series_streams_v2.category_id_series_stream_v2 AND series_category_v2.user_id_referred = '" + iZ + "' GROUP BY series_streams_v2" + InstructionFileId.DOT + "category_id_series_stream_v2 ORDER BY series_category_v2" + InstructionFileId.DOT + "id_series_v2", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.e eVar = new c.h.a.i.e();
                    eVar.f(Integer.parseInt(cursorRawQuery.getString(0)));
                    eVar.h(cursorRawQuery.getString(1));
                    eVar.g(cursorRawQuery.getString(2));
                    arrayList.add(eVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public void i2() {
        try {
            int iZ = m.z(this.f17240b);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_category WHERE user_id_referred = '" + iZ + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public ArrayList<c.h.a.i.e> j1() {
        ArrayList<c.h.a.i.e> arrayList = new ArrayList<>();
        int iZ = m.z(this.f17240b);
        if (!m.f(this.f17240b).equals("m3u")) {
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT series_category_v2.* , COUNT(series_streams_v2.id_series_stream_v2) AS TOTAL_COUNT FROM series_category_v2,series_streams_v2 WHERE series_category_v2.category_id_series_v2 = series_streams_v2.category_id_series_stream_v2 AND series_category_v2.user_id_referred = '" + iZ + "' AND series_streams_v2" + InstructionFileId.DOT + "user_id_referred = '" + iZ + "' AND series_streams_v2" + InstructionFileId.DOT + "category_id_series_stream_v2 NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1') GROUP BY series_streams_v2" + InstructionFileId.DOT + "category_id_series_stream_v2 ORDER BY series_category_v2" + InstructionFileId.DOT + "id_series_v2", null);
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            c.h.a.i.e eVar = new c.h.a.i.e();
                            eVar.f(Integer.parseInt(cursorRawQuery.getString(0)));
                            eVar.h(cursorRawQuery.getString(1));
                            eVar.g(cursorRawQuery.getString(2));
                            eVar.i(c.h.a.h.n.e.S(cursorRawQuery.getString(4)));
                            arrayList.add(eVar);
                        } while (cursorRawQuery.moveToNext());
                    }
                    cursorRawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        try {
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT iptv_series_category_m3u.* , COUNT(iptv_live_streams_m3u.id) AS TOTAL_COUNT FROM iptv_series_category_m3u,iptv_live_streams_m3u WHERE iptv_series_category_m3u.categoryID = iptv_live_streams_m3u.categoryID AND iptv_series_category_m3u.user_id_referred = '" + iZ + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "user_id_referred = '" + iZ + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "stream_type = 'series' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table_m3u WHERE iptv_password_status_table_m3u" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status ='1') GROUP BY iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID ORDER BY iptv_series_category_m3u" + InstructionFileId.DOT + Name.MARK, null);
                if (cursorRawQuery2.moveToFirst()) {
                    do {
                        c.h.a.i.e eVar2 = new c.h.a.i.e();
                        eVar2.f(Integer.parseInt(cursorRawQuery2.getString(0)));
                        eVar2.g(cursorRawQuery2.getString(1));
                        eVar2.h(cursorRawQuery2.getString(2));
                        eVar2.i(c.h.a.h.n.e.S(cursorRawQuery2.getString(4)));
                        arrayList.add(eVar2);
                    } while (cursorRawQuery2.moveToNext());
                }
                cursorRawQuery2.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException unused5) {
                return null;
            } catch (Exception unused6) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused7) {
            return null;
        } catch (Exception unused8) {
            return null;
        }
    }

    public void j2() {
        try {
            int iZ = m.z(this.f17240b);
            getReadableDatabase();
            getWritableDatabase().execSQL("delete from iptv_live_streams WHERE (stream_type LIKE '%live%' OR stream_type LIKE '%radio%' ) AND user_id_referred = '" + iZ + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public ArrayList<SeriesDBModel> k1() {
        int iZ = m.z(this.f17240b);
        ArrayList<SeriesDBModel> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT stream_id_series_stream_v2 FROM series_streams_v2 WHERE series_streams_v2.user_id_referred='" + iZ + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    int i2 = 0;
                    try {
                        i2 = Integer.parseInt(cursorRawQuery.getString(0));
                    } catch (NumberFormatException unused) {
                    }
                    SeriesDBModel seriesDBModel = new SeriesDBModel();
                    seriesDBModel.I(i2);
                    arrayList.add(seriesDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused2) {
            return null;
        }
    }

    public void k2() {
        try {
            int iZ = m.z(this.f17240b);
            getWritableDatabase().execSQL("DELETE FROM iptv_movie_category WHERE user_id_referred = '" + iZ + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public boolean l(ArrayList<c.h.a.i.f> arrayList, String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    for (c.h.a.i.f fVar : arrayList) {
                        if (fVar.getName() == null) {
                            Log.e("sdsadsd", "addAllAvailableChannel:" + fVar.getName());
                        }
                        if (fVar.P() != null) {
                            contentValues.put("num", String.valueOf(fVar.P()));
                        } else {
                            contentValues.put("num", BuildConfig.FLAVOR);
                        }
                        if (fVar.getName() != null) {
                            contentValues.put("name", fVar.getName());
                        } else {
                            contentValues.put("name", BuildConfig.FLAVOR);
                        }
                        contentValues.put("stream_type", str);
                        if (fVar.Y() != null) {
                            contentValues.put("stream_id", fVar.Y());
                        } else {
                            contentValues.put("stream_id", BuildConfig.FLAVOR);
                        }
                        if (fVar.X() != null) {
                            contentValues.put("stream_icon", fVar.X());
                        } else {
                            contentValues.put("stream_icon", BuildConfig.FLAVOR);
                        }
                        if (fVar.I() != null) {
                            contentValues.put("epg_channel_id", fVar.I());
                        } else {
                            contentValues.put("epg_channel_id", BuildConfig.FLAVOR);
                        }
                        if (fVar.f() != null) {
                            contentValues.put("added", fVar.f());
                        } else {
                            contentValues.put("added", BuildConfig.FLAVOR);
                        }
                        if (fVar.g() != null) {
                            contentValues.put("categoryID", fVar.g());
                        } else {
                            contentValues.put("categoryID", BuildConfig.FLAVOR);
                        }
                        if (fVar.D() != null) {
                            contentValues.put("custom_sid", fVar.D());
                        } else {
                            contentValues.put("custom_sid", BuildConfig.FLAVOR);
                        }
                        if (fVar.a0() != null) {
                            contentValues.put("tv_archive", fVar.a0());
                        } else {
                            contentValues.put("tv_archive", BuildConfig.FLAVOR);
                        }
                        if (fVar.F() != null) {
                            contentValues.put("direct_source", fVar.F());
                        } else {
                            contentValues.put("direct_source", BuildConfig.FLAVOR);
                        }
                        if (fVar.b0() != null) {
                            contentValues.put("tv_archive_duration", fVar.b0());
                        } else {
                            contentValues.put("tv_archive_duration", BuildConfig.FLAVOR);
                        }
                        if (fVar.d0() != null) {
                            contentValues.put("type_name", String.valueOf(fVar.d0()));
                        } else {
                            contentValues.put("type_name", BuildConfig.FLAVOR);
                        }
                        if (fVar.B() != null) {
                            contentValues.put("category_name", fVar.B());
                        } else {
                            contentValues.put("category_name", BuildConfig.FLAVOR);
                        }
                        if (fVar.W() != null) {
                            contentValues.put("series_no", String.valueOf(fVar.W()));
                        } else {
                            contentValues.put("series_no", BuildConfig.FLAVOR);
                        }
                        if (fVar.M() != null) {
                            contentValues.put("live", fVar.M());
                        } else {
                            contentValues.put("live", BuildConfig.FLAVOR);
                        }
                        if (fVar.C() != null) {
                            contentValues.put("container_extension", String.valueOf(fVar.C()));
                        } else {
                            contentValues.put("container_extension", BuildConfig.FLAVOR);
                        }
                        if (fVar.e0() != null) {
                            contentValues.put("url", fVar.e0());
                        } else {
                            contentValues.put("url", BuildConfig.FLAVOR);
                        }
                        contentValues.put("user_id_referred", Integer.valueOf(m.z(this.f17240b)));
                        writableDatabase.insert("iptv_live_streams_m3u", null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    writableDatabase.close();
                    Log.e("sdsadsd", "addAllAvailableChannel: Transaction end");
                    return true;
                } catch (Exception unused) {
                    writableDatabase.endTransaction();
                    Log.w("msg", "exception");
                    return false;
                }
            } catch (SQLiteDatabaseLockedException unused2) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public int l1() {
        StringBuilder sb;
        String str;
        int iZ = m.z(this.f17240b);
        if (m.f(this.f17240b).equals("m3u")) {
            sb = new StringBuilder();
            str = "SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE stream_type='series' AND user_id_referred='";
        } else {
            sb = new StringBuilder();
            str = "SELECT  COUNT(*) FROM series_streams_v2 WHERE user_id_referred = '";
        }
        sb.append(str);
        sb.append(iZ);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void l2() {
        try {
            int iZ = m.z(this.f17240b);
            getWritableDatabase().execSQL("DELETE FROM series_category_v2 WHERE user_id_referred = '" + iZ + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public boolean m(List<VodStreamsCallback> list) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    int iZ = m.z(this.f17240b);
                    ContentValues contentValues = new ContentValues();
                    for (VodStreamsCallback vodStreamsCallback : list) {
                        c.h.a.h.n.e.f17067i = true;
                        if (vodStreamsCallback.g() != null) {
                            contentValues.put("num", String.valueOf(vodStreamsCallback.g()));
                        } else {
                            contentValues.put("num", BuildConfig.FLAVOR);
                        }
                        if (vodStreamsCallback.f() != null) {
                            contentValues.put("name", vodStreamsCallback.f());
                        } else {
                            contentValues.put("name", BuildConfig.FLAVOR);
                        }
                        if (vodStreamsCallback.m() != null) {
                            contentValues.put("stream_type", vodStreamsCallback.m());
                        } else {
                            contentValues.put("stream_type", BuildConfig.FLAVOR);
                        }
                        if (vodStreamsCallback.l() != null) {
                            contentValues.put("stream_id", vodStreamsCallback.l());
                        } else {
                            contentValues.put("stream_id", BuildConfig.FLAVOR);
                        }
                        if (vodStreamsCallback.k() != null) {
                            contentValues.put("stream_icon", vodStreamsCallback.k());
                        } else {
                            contentValues.put("stream_icon", BuildConfig.FLAVOR);
                        }
                        contentValues.put("epg_channel_id", BuildConfig.FLAVOR);
                        if (vodStreamsCallback.a() != null) {
                            contentValues.put("added", vodStreamsCallback.a());
                        } else {
                            contentValues.put("added", BuildConfig.FLAVOR);
                        }
                        if (vodStreamsCallback.b() == null || s0(vodStreamsCallback.b()) <= 0) {
                            contentValues.put("categoryID", "-3");
                        } else {
                            contentValues.put("categoryID", vodStreamsCallback.b());
                        }
                        if (vodStreamsCallback.d() != null) {
                            contentValues.put("custom_sid", vodStreamsCallback.d());
                        } else {
                            contentValues.put("custom_sid", BuildConfig.FLAVOR);
                        }
                        contentValues.put("tv_archive", BuildConfig.FLAVOR);
                        if (vodStreamsCallback.e() != null) {
                            contentValues.put("direct_source", vodStreamsCallback.e());
                        } else {
                            contentValues.put("direct_source", BuildConfig.FLAVOR);
                        }
                        contentValues.put("tv_archive_duration", BuildConfig.FLAVOR);
                        contentValues.put("type_name", BuildConfig.FLAVOR);
                        contentValues.put("category_name", BuildConfig.FLAVOR);
                        if (vodStreamsCallback.j() != null) {
                            contentValues.put("series_no", String.valueOf(vodStreamsCallback.j()));
                        } else {
                            contentValues.put("series_no", BuildConfig.FLAVOR);
                        }
                        contentValues.put("live", BuildConfig.FLAVOR);
                        if (vodStreamsCallback.c() != null) {
                            contentValues.put("container_extension", String.valueOf(vodStreamsCallback.c()));
                        } else {
                            contentValues.put("container_extension", BuildConfig.FLAVOR);
                        }
                        if (vodStreamsCallback.h() != null) {
                            contentValues.put("rating_from_ten", vodStreamsCallback.h());
                        } else {
                            contentValues.put("rating_from_ten", BuildConfig.FLAVOR);
                        }
                        if (vodStreamsCallback.i() != null) {
                            contentValues.put("rating_from_five", String.valueOf(vodStreamsCallback.i()));
                        } else {
                            contentValues.put("rating_from_five", BuildConfig.FLAVOR);
                        }
                        contentValues.put("user_id_referred", Integer.valueOf(iZ));
                        writableDatabase.insert("iptv_live_streams", null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    c.h.a.h.n.e.f17067i = false;
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    writableDatabase.endTransaction();
                    c.h.a.h.n.e.f17067i = false;
                    Log.w("msg", "exception");
                    return false;
                }
            } catch (Exception unused2) {
                writableDatabase.endTransaction();
                c.h.a.h.n.e.f17067i = false;
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public ArrayList<SeriesDBModel> m1(String str) {
        StringBuilder sb;
        String str2;
        String string;
        StringBuilder sb2;
        String str3;
        String str4 = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strW = m.w(this.f17240b);
        int iZ = m.z(this.f17240b);
        if (str4.equals(BuildConfig.FLAVOR) || str4.equals("0")) {
            if (strW.equals("0")) {
                string = "SELECT  * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '" + iZ + "' AND series_streams_v2" + InstructionFileId.DOT + "category_id_series_stream_v2 NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1')";
            } else {
                if (strW.equals("3")) {
                    sb = new StringBuilder();
                    sb.append("SELECT  * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("series_streams_v2");
                    sb.append(InstructionFileId.DOT);
                    sb.append("category_id_series_stream_v2");
                    sb.append(" NOT IN (SELECT ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status_cat_id");
                    sb.append(" FROM ");
                    sb.append("iptv_password_status_table");
                    sb.append(" WHERE ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("user_id_referred");
                    sb.append(" ='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status");
                    sb.append(" ='1') ORDER BY ");
                    sb.append("name_series_stream_v2");
                    str2 = " DESC";
                } else if (strW.equals("2")) {
                    sb = new StringBuilder();
                    sb.append("SELECT  * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("series_streams_v2");
                    sb.append(InstructionFileId.DOT);
                    sb.append("category_id_series_stream_v2");
                    sb.append(" NOT IN (SELECT ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status_cat_id");
                    sb.append(" FROM ");
                    sb.append("iptv_password_status_table");
                    sb.append(" WHERE ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("user_id_referred");
                    sb.append(" ='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status");
                    sb.append(" ='1') ORDER BY ");
                    sb.append("name_series_stream_v2");
                    str2 = " ASC";
                } else if (strW.equals("6")) {
                    sb = new StringBuilder();
                    sb.append("SELECT  * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("series_streams_v2");
                    sb.append(InstructionFileId.DOT);
                    sb.append("category_id_series_stream_v2");
                    sb.append(" NOT IN (SELECT ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status_cat_id");
                    sb.append(" FROM ");
                    sb.append("iptv_password_status_table");
                    sb.append(" WHERE ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("user_id_referred");
                    sb.append(" ='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status");
                    sb.append(" ='1') ORDER BY cast(");
                    sb.append("rating_series_stream_v2");
                    str2 = " as REAL) DESC ";
                } else if (strW.equals("1")) {
                    sb = new StringBuilder();
                    sb.append("SELECT  * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("series_streams_v2");
                    sb.append(InstructionFileId.DOT);
                    sb.append("category_id_series_stream_v2");
                    sb.append(" NOT IN (SELECT ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status_cat_id");
                    sb.append(" FROM ");
                    sb.append("iptv_password_status_table");
                    sb.append(" WHERE ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("user_id_referred");
                    sb.append(" ='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status");
                    sb.append(" ='1') ORDER BY ");
                    sb.append("last_modified_series_stream_v2");
                    str2 = " DESC ";
                } else {
                    sb = new StringBuilder();
                    sb.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("series_streams_v2");
                    sb.append(InstructionFileId.DOT);
                    sb.append("category_id_series_stream_v2");
                    sb.append(" NOT IN (SELECT ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status_cat_id");
                    sb.append(" FROM ");
                    sb.append("iptv_password_status_table");
                    sb.append(" WHERE ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("user_id_referred");
                    sb.append(" ='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_password_status_table");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status");
                    sb.append(" ='1') ORDER BY ");
                    sb.append("id_series_stream_v2");
                    str2 = " DESC";
                }
                sb.append(str2);
                string = sb.toString();
            }
            ArrayList<SeriesDBModel> arrayList = new ArrayList<>();
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery(string, null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask = c.h.a.h.n.e.f17063e;
                            if (asyncTask != null && asyncTask.isCancelled()) {
                                Log.e("honey", "stopped");
                                break;
                            }
                            SeriesDBModel seriesDBModel = new SeriesDBModel();
                            seriesDBModel.u(Integer.parseInt(cursorRawQuery.getString(0)));
                            seriesDBModel.w(cursorRawQuery.getString(1));
                            seriesDBModel.v(cursorRawQuery.getString(2));
                            seriesDBModel.x(cursorRawQuery.getString(3));
                            seriesDBModel.I(c.h.a.h.n.e.S(cursorRawQuery.getString(4)));
                            seriesDBModel.B(cursorRawQuery.getString(5));
                            seriesDBModel.F(cursorRawQuery.getString(6));
                            seriesDBModel.A(cursorRawQuery.getString(7));
                            seriesDBModel.C(cursorRawQuery.getString(8));
                            seriesDBModel.D(cursorRawQuery.getString(9));
                            seriesDBModel.H(cursorRawQuery.getString(10));
                            seriesDBModel.E(cursorRawQuery.getString(11));
                            seriesDBModel.G(cursorRawQuery.getString(12));
                            seriesDBModel.t(cursorRawQuery.getString(13));
                            seriesDBModel.z(cursorRawQuery.getString(14));
                            seriesDBModel.s(cursorRawQuery.getString(15));
                            arrayList.add(seriesDBModel);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                        }
                    }
                    cursorRawQuery.close();
                    Log.e("honey testing", "milli: " + (System.currentTimeMillis() - jCurrentTimeMillis));
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        if (str4.equals("-5")) {
            c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f17240b);
            sb2 = new StringBuilder();
            sb2.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
            sb2.append(iZ);
            sb2.append("' AND ");
            sb2.append("series_streams_v2");
            sb2.append(InstructionFileId.DOT);
            sb2.append("category_id_series_stream_v2");
            sb2.append(" NOT IN (SELECT ");
            sb2.append("iptv_password_status_table");
            sb2.append(InstructionFileId.DOT);
            sb2.append("password_status_cat_id");
            sb2.append(" FROM ");
            sb2.append("iptv_password_status_table");
            sb2.append(" WHERE ");
            sb2.append("iptv_password_status_table");
            sb2.append(InstructionFileId.DOT);
            sb2.append("user_id_referred");
            sb2.append(" ='");
            sb2.append(iZ);
            sb2.append("' AND ");
            sb2.append("iptv_password_status_table");
            sb2.append(InstructionFileId.DOT);
            sb2.append("password_status");
            sb2.append(" ='1') ORDER BY ");
            sb2.append("last_modified_series_stream_v2");
            sb2.append(" DESC LIMIT ");
            sb2.append(aVar.y());
        } else {
            if (str4.equals("-6")) {
                str4 = "-5";
            }
            if (strW.equals("0")) {
                sb2 = new StringBuilder();
                sb2.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                sb2.append(iZ);
                sb2.append("' AND ");
                sb2.append("category_id_series_stream_v2");
                sb2.append(" ='");
                sb2.append(str4);
                sb2.append("' AND ");
                sb2.append("series_streams_v2");
                sb2.append(InstructionFileId.DOT);
                sb2.append("category_id_series_stream_v2");
                sb2.append(" NOT IN (SELECT ");
                sb2.append("iptv_password_status_table");
                sb2.append(InstructionFileId.DOT);
                sb2.append("password_status_cat_id");
                sb2.append(" FROM ");
                sb2.append("iptv_password_status_table");
                sb2.append(" WHERE ");
                sb2.append("iptv_password_status_table");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append(" ='");
                sb2.append(iZ);
                sb2.append("' AND ");
                sb2.append("iptv_password_status_table");
                sb2.append(InstructionFileId.DOT);
                sb2.append("password_status");
                sb2.append(" ='1')");
            } else {
                if (strW.equals("3")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" ='");
                    sb2.append(str4);
                    sb2.append("' AND ");
                    sb2.append("series_streams_v2");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    sb2.append("name_series_stream_v2");
                    str3 = " DESC";
                } else if (strW.equals("2")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" ='");
                    sb2.append(str4);
                    sb2.append("' AND ");
                    sb2.append("series_streams_v2");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    sb2.append("name_series_stream_v2");
                    str3 = " ASC";
                } else if (strW.equals("6")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" ='");
                    sb2.append(str4);
                    sb2.append("' AND ");
                    sb2.append("series_streams_v2");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY cast(");
                    sb2.append("rating_series_stream_v2");
                    str3 = " as REAL) DESC ";
                } else if (strW.equals("1")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" ='");
                    sb2.append(str4);
                    sb2.append("' AND ");
                    sb2.append("series_streams_v2");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    sb2.append("last_modified_series_stream_v2");
                    str3 = " DESC ";
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" ='");
                    sb2.append(str4);
                    sb2.append("' AND ");
                    sb2.append("series_streams_v2");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    sb2.append("id_series_stream_v2");
                    str3 = " DESC";
                }
                sb2.append(str3);
            }
        }
        String string2 = sb2.toString();
        ArrayList<SeriesDBModel> arrayList2 = new ArrayList<>();
        try {
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery(string2, null);
                if (cursorRawQuery2.moveToFirst()) {
                    while (true) {
                        AsyncTask asyncTask2 = c.h.a.h.n.e.f17063e;
                        if (asyncTask2 != null && asyncTask2.isCancelled()) {
                            Log.e("honey", "stopped");
                            break;
                        }
                        SeriesDBModel seriesDBModel2 = new SeriesDBModel();
                        seriesDBModel2.u(Integer.parseInt(cursorRawQuery2.getString(0)));
                        seriesDBModel2.w(cursorRawQuery2.getString(1));
                        seriesDBModel2.v(cursorRawQuery2.getString(2));
                        seriesDBModel2.x(cursorRawQuery2.getString(3));
                        seriesDBModel2.I(c.h.a.h.n.e.S(cursorRawQuery2.getString(4)));
                        seriesDBModel2.B(cursorRawQuery2.getString(5));
                        seriesDBModel2.F(cursorRawQuery2.getString(6));
                        seriesDBModel2.A(cursorRawQuery2.getString(7));
                        seriesDBModel2.C(cursorRawQuery2.getString(8));
                        seriesDBModel2.D(cursorRawQuery2.getString(9));
                        seriesDBModel2.H(cursorRawQuery2.getString(10));
                        seriesDBModel2.E(cursorRawQuery2.getString(11));
                        seriesDBModel2.G(cursorRawQuery2.getString(12));
                        seriesDBModel2.t(cursorRawQuery2.getString(13));
                        seriesDBModel2.z(cursorRawQuery2.getString(14));
                        seriesDBModel2.s(cursorRawQuery2.getString(15));
                        arrayList2.add(seriesDBModel2);
                        if (!cursorRawQuery2.moveToNext()) {
                            break;
                        }
                    }
                }
                cursorRawQuery2.close();
                return arrayList2;
            } catch (SQLiteDatabaseLockedException unused5) {
                return null;
            } catch (Exception unused6) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused7) {
            return null;
        } catch (Exception unused8) {
            return null;
        }
    }

    public void m2() {
        try {
            int iZ = m.z(this.f17240b);
            getWritableDatabase().execSQL("DELETE FROM series_streams_v2 WHERE user_id_referred = '" + iZ + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public boolean n(ArrayList<GetSeriesStreamCallback> arrayList) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    int size = arrayList.size();
                    if (size != 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            c.h.a.h.n.e.f17067i = true;
                            if (arrayList.get(i2).i() != null) {
                                contentValues.put("num_series_stream_v2", String.valueOf(arrayList.get(i2).i()));
                            } else {
                                contentValues.put("num_series_stream_v2", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).h() != null) {
                                contentValues.put("name_series_stream_v2", arrayList.get(i2).h());
                            } else {
                                contentValues.put("name_series_stream_v2", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).n() != null) {
                                contentValues.put("stream_type_series_stream_v2", String.valueOf(arrayList.get(i2).n()));
                            } else {
                                contentValues.put("stream_type_series_stream_v2", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).m() != null) {
                                contentValues.put("stream_id_series_stream_v2", arrayList.get(i2).m());
                            } else {
                                contentValues.put("stream_id_series_stream_v2", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).d() != null) {
                                contentValues.put("stream_cover_series_stream_v2", arrayList.get(i2).d());
                            } else {
                                contentValues.put("stream_cover_series_stream_v2", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).j() != null) {
                                contentValues.put("plot_series_stream_v2", arrayList.get(i2).j());
                            } else {
                                contentValues.put("plot_series_stream_v2", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).b() != null) {
                                contentValues.put("cast_series_stream_v2", arrayList.get(i2).b());
                            } else {
                                contentValues.put("cast_series_stream_v2", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).e() != null) {
                                contentValues.put("director_series_stream_v2", String.valueOf(arrayList.get(i2).e()));
                            } else {
                                contentValues.put("director_series_stream_v2", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).f() != null) {
                                contentValues.put("genre_series_stream_v2", arrayList.get(i2).f());
                            } else {
                                contentValues.put("genre_series_stream_v2", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).l() != null) {
                                contentValues.put("release_date_series_stream_v2", String.valueOf(arrayList.get(i2).l()));
                            } else {
                                contentValues.put("release_date_series_stream_v2", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).g() != null) {
                                contentValues.put("last_modified_series_stream_v2", String.valueOf(arrayList.get(i2).g()));
                            } else {
                                contentValues.put("last_modified_series_stream_v2", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).k() != null) {
                                contentValues.put("rating_series_stream_v2", String.valueOf(arrayList.get(i2).k()));
                            } else {
                                contentValues.put("rating_series_stream_v2", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).c() == null || w0(arrayList.get(i2).c()) <= 0) {
                                contentValues.put("category_id_series_stream_v2", "-5");
                            } else {
                                contentValues.put("category_id_series_stream_v2", String.valueOf(arrayList.get(i2).c()));
                            }
                            if (arrayList.get(i2).o() != null) {
                                contentValues.put("youtube_trailer", String.valueOf(arrayList.get(i2).o()));
                            } else {
                                contentValues.put("youtube_trailer", BuildConfig.FLAVOR);
                            }
                            if (arrayList.get(i2).a() != null) {
                                contentValues.put("backdrop", arrayList.get(i2).a().toString());
                            } else {
                                contentValues.put("backdrop", BuildConfig.FLAVOR);
                            }
                            contentValues.put("user_id_referred", Integer.valueOf(m.z(this.f17240b)));
                            writableDatabase.insert("series_streams_v2", null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    c.h.a.h.n.e.f17067i = false;
                    return true;
                } catch (Exception e2) {
                    writableDatabase.endTransaction();
                    c.h.a.h.n.e.f17067i = false;
                    Log.w("msg", "exception:" + e2.getMessage());
                    return false;
                }
            } catch (SQLiteDatabaseLockedException unused) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                c.h.a.h.n.e.f17067i = false;
                return false;
            }
        } catch (Exception unused2) {
        }
    }

    public ArrayList<SeriesDBModel> n1(String str) {
        String string;
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        String str3;
        String str4;
        String strW = m.w(this.f17240b);
        int iZ = m.z(this.f17240b);
        boolean zEquals = str.equals("0");
        String str5 = BuildConfig.FLAVOR;
        if (zEquals) {
            strW.hashCode();
            switch (strW) {
                case "0":
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    str3 = " ='1')";
                    break;
                case "1":
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    str4 = "added";
                    sb2.append(str4);
                    str3 = " DESC";
                    break;
                case "3":
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    str4 = "name";
                    sb2.append(str4);
                    str3 = " DESC";
                    break;
                case "4":
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY cast(");
                    sb2.append("num");
                    str3 = " as REAL) ASC";
                    break;
                case "5":
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY cast(");
                    sb2.append("num");
                    str3 = " as REAL) DESC";
                    break;
                default:
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(iZ);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    sb2.append("name");
                    str3 = " ASC";
                    break;
            }
            sb2.append(str3);
            string = sb2.toString();
        } else if (str.equals("-2") || str.equals("-3") || str.equals(Constants.NULL_VERSION_ID)) {
            string = str5;
        } else {
            strW.hashCode();
            switch (strW) {
                case "0":
                    sb = new StringBuilder();
                    sb.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_live_streams_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("categoryID");
                    sb.append(" ='");
                    sb.append(str);
                    sb.append("' AND ");
                    sb.append("iptv_live_streams_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("categoryID");
                    sb.append(" NOT IN (SELECT ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status_cat_id");
                    sb.append(" FROM ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(" WHERE ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("user_id_referred");
                    sb.append(" ='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status");
                    str2 = " ='1')";
                    break;
                case "1":
                    sb = new StringBuilder();
                    sb.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_live_streams_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("categoryID");
                    sb.append(" ='");
                    sb.append(str);
                    sb.append("' AND ");
                    sb.append("iptv_live_streams_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("categoryID");
                    sb.append(" NOT IN (SELECT ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status_cat_id");
                    sb.append(" FROM ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(" WHERE ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("user_id_referred");
                    sb.append(" ='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status");
                    sb.append(" ='1') ORDER BY ");
                    sb.append("added");
                    str2 = " DESC";
                    break;
                case "3":
                    sb = new StringBuilder();
                    sb.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_live_streams_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("categoryID");
                    sb.append(" ='");
                    sb.append(str);
                    sb.append("' AND ");
                    sb.append("iptv_live_streams_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("categoryID");
                    sb.append(" NOT IN (SELECT ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status_cat_id");
                    sb.append(" FROM ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(" WHERE ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("user_id_referred");
                    sb.append(" ='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status");
                    sb.append(" ='1') ORDER BY ");
                    sb.append("name");
                    str2 = " DESC";
                    break;
                case "4":
                    sb = new StringBuilder();
                    sb.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_live_streams_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("categoryID");
                    sb.append(" ='");
                    sb.append(str);
                    sb.append("' AND ");
                    sb.append("iptv_live_streams_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("categoryID");
                    sb.append(" NOT IN (SELECT ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status_cat_id");
                    sb.append(" FROM ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(" WHERE ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("user_id_referred");
                    sb.append(" ='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status");
                    sb.append(" ='1') ORDER BY cast(");
                    sb.append("num");
                    str2 = " as REAL) ASC";
                    break;
                case "5":
                    sb = new StringBuilder();
                    sb.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_live_streams_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("categoryID");
                    sb.append(" ='");
                    sb.append(str);
                    sb.append("' AND ");
                    sb.append("iptv_live_streams_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("categoryID");
                    sb.append(" NOT IN (SELECT ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status_cat_id");
                    sb.append(" FROM ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(" WHERE ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("user_id_referred");
                    sb.append(" ='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status");
                    sb.append(" ='1') ORDER BY cast(");
                    sb.append("num");
                    str2 = " as REAL) DESC";
                    break;
                default:
                    sb = new StringBuilder();
                    sb.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_live_streams_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("categoryID");
                    sb.append(" ='");
                    sb.append(str);
                    sb.append("' AND ");
                    sb.append("iptv_live_streams_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("categoryID");
                    sb.append(" NOT IN (SELECT ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status_cat_id");
                    sb.append(" FROM ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(" WHERE ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("user_id_referred");
                    sb.append(" ='");
                    sb.append(iZ);
                    sb.append("' AND ");
                    sb.append("iptv_password_status_table_m3u");
                    sb.append(InstructionFileId.DOT);
                    sb.append("password_status");
                    sb.append(" ='1') ORDER BY ");
                    sb.append("name");
                    str2 = " ASC";
                    break;
            }
            sb.append(str2);
            string = sb.toString();
        }
        ArrayList<SeriesDBModel> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(string, null);
            if (cursorRawQuery.moveToFirst()) {
                while (true) {
                    try {
                        if (m.b(this.f17240b) == 1) {
                            m.K(0, this.f17240b);
                        } else {
                            SeriesDBModel seriesDBModel = new SeriesDBModel();
                            seriesDBModel.u(Integer.parseInt(cursorRawQuery.getString(0)));
                            seriesDBModel.w(cursorRawQuery.getString(1));
                            seriesDBModel.v(cursorRawQuery.getString(2));
                            seriesDBModel.x(cursorRawQuery.getString(3));
                            seriesDBModel.I(c.h.a.h.n.e.S(cursorRawQuery.getString(4)));
                            seriesDBModel.B(cursorRawQuery.getString(5));
                            String str6 = str5;
                            seriesDBModel.F(str6);
                            seriesDBModel.A(str6);
                            seriesDBModel.C(str6);
                            seriesDBModel.D(str6);
                            seriesDBModel.H(str6);
                            seriesDBModel.E(str6);
                            seriesDBModel.G(str6);
                            seriesDBModel.t(cursorRawQuery.getString(8));
                            seriesDBModel.z(str6);
                            seriesDBModel.s(str6);
                            seriesDBModel.y(cursorRawQuery.getString(18));
                            arrayList.add(seriesDBModel);
                            if (cursorRawQuery.moveToNext()) {
                                str5 = str6;
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        return null;
                    } catch (Exception unused2) {
                        return null;
                    }
                }
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException unused3) {
            return null;
        } catch (Exception unused4) {
            return null;
        }
    }

    public void n2() {
        try {
            int iZ = m.z(this.f17240b);
            getReadableDatabase();
            getWritableDatabase().execSQL("delete from iptv_live_streams WHERE stream_type LIKE '%movie%' AND user_id_referred = '" + iZ + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void o(ArrayList<c.h.a.i.g> arrayList, String str) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        String str2 = str.equals("live") ? "iptv_live_category_m3u" : str.equals("movie") ? "iptv_movie_category_m3u" : str.equals("series") ? "iptv_series_category_m3u" : BuildConfig.FLAVOR;
        try {
            ContentValues contentValues = new ContentValues();
            int iZ = m.z(this.f17240b);
            for (c.h.a.i.g gVar : arrayList) {
                contentValues.put("categoryID", gVar.a());
                contentValues.put("categoryname", gVar.b());
                contentValues.put("user_id_referred", Integer.valueOf(iZ));
                writableDatabase.insert(str2, null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            writableDatabase.endTransaction();
            Log.w("msg", "exception");
        }
    }

    public ArrayList<c.h.a.i.e> o1() {
        ArrayList<c.h.a.i.e> arrayList;
        ArrayList<c.h.a.i.e> arrayList2;
        int i2;
        ArrayList<c.h.a.i.e> arrayList3 = new ArrayList<>();
        int iZ = m.z(this.f17240b);
        ArrayList<c.h.a.i.e> arrayList4 = arrayList3;
        if (m.f(this.f17240b).equals("m3u")) {
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT iptv_live_category_m3u.* , COUNT(iptv_live_streams_m3u.id) AS TOTAL_COUNT FROM iptv_live_category_m3u,iptv_live_streams_m3u WHERE iptv_live_category_m3u.categoryID = iptv_live_streams_m3u.categoryID AND iptv_live_category_m3u.user_id_referred = '" + iZ + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "user_id_referred = '" + iZ + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "stream_type = 'live' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table_m3u WHERE iptv_password_status_table_m3u" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status ='1') GROUP BY iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID ORDER BY iptv_live_category_m3u" + InstructionFileId.DOT + Name.MARK, null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            c.h.a.i.e eVar = new c.h.a.i.e();
                            eVar.f(Integer.parseInt(cursorRawQuery.getString(0)));
                            eVar.g(cursorRawQuery.getString(1));
                            eVar.h(cursorRawQuery.getString(2));
                            eVar.i(c.h.a.h.n.e.S(cursorRawQuery.getString(4)));
                            arrayList = arrayList4;
                            arrayList.add(eVar);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            arrayList4 = arrayList;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    cursorRawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        try {
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT iptv_live_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_live_category,iptv_live_streams WHERE iptv_live_category.categoryID_live = iptv_live_streams.categoryID AND iptv_live_category.user_id_referred = '" + iZ + "' AND iptv_live_streams" + InstructionFileId.DOT + "user_id_referred = '" + iZ + "' AND ( iptv_live_streams" + InstructionFileId.DOT + "stream_type = 'live' OR iptv_live_streams" + InstructionFileId.DOT + "stream_type = 'created_live' ) AND iptv_live_streams" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1') GROUP BY iptv_live_streams" + InstructionFileId.DOT + "categoryID ORDER BY iptv_live_category" + InstructionFileId.DOT + "id_live", null);
                if (cursorRawQuery2.moveToFirst()) {
                    while (true) {
                        try {
                            i2 = Integer.parseInt(cursorRawQuery2.getString(3));
                        } catch (NumberFormatException unused5) {
                            i2 = 0;
                        }
                        c.h.a.i.e eVar2 = new c.h.a.i.e();
                        eVar2.f(Integer.parseInt(cursorRawQuery2.getString(0)));
                        eVar2.g(cursorRawQuery2.getString(1));
                        eVar2.h(cursorRawQuery2.getString(2));
                        eVar2.j(i2);
                        eVar2.i(c.h.a.h.n.e.S(cursorRawQuery2.getString(5)));
                        arrayList2 = arrayList4;
                        arrayList2.add(eVar2);
                        if (!cursorRawQuery2.moveToNext()) {
                            break;
                        }
                        arrayList4 = arrayList2;
                    }
                } else {
                    arrayList2 = arrayList4;
                }
                cursorRawQuery2.close();
                return arrayList2;
            } catch (SQLiteDatabaseLockedException unused6) {
                return null;
            } catch (Exception unused7) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused8) {
            return null;
        } catch (Exception unused9) {
            return null;
        }
    }

    public void o2(String str) {
        String str2;
        try {
            int iZ = m.z(this.f17240b);
            getReadableDatabase();
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("0")) {
                str2 = "DELETE FROM iptv_live_streams_m3u WHERE user_id_referred='" + iZ + "'";
            } else {
                str2 = "DELETE FROM iptv_live_streams_m3u WHERE categoryID ='" + str + "' AND user_id_referred='" + iZ + "'";
            }
            writableDatabase.execSQL(str2);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f17243e);
        sQLiteDatabase.execSQL(this.f17244f);
        sQLiteDatabase.execSQL(this.v);
        sQLiteDatabase.execSQL(this.f17250l);
        sQLiteDatabase.execSQL(this.f17253o);
        sQLiteDatabase.execSQL(this.f17245g);
        sQLiteDatabase.execSQL(this.r);
        sQLiteDatabase.execSQL(this.y);
        sQLiteDatabase.execSQL(this.A);
        sQLiteDatabase.execSQL(this.u);
        sQLiteDatabase.execSQL(this.f17246h);
        sQLiteDatabase.execSQL(this.x);
        sQLiteDatabase.execSQL(this.B);
        sQLiteDatabase.execSQL(this.s);
        sQLiteDatabase.execSQL(this.f17247i);
        sQLiteDatabase.execSQL(this.f17248j);
        sQLiteDatabase.execSQL(this.f17249k);
        sQLiteDatabase.execSQL(this.p);
        sQLiteDatabase.execSQL(this.f17251m);
        sQLiteDatabase.execSQL(this.t);
        sQLiteDatabase.execSQL(this.H);
        sQLiteDatabase.execSQL(this.I);
        sQLiteDatabase.execSQL(this.f17251m);
        sQLiteDatabase.execSQL(this.z);
        sQLiteDatabase.execSQL(this.w);
        sQLiteDatabase.execSQL(this.E);
        sQLiteDatabase.execSQL(this.F);
        sQLiteDatabase.execSQL(this.G);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 < 3) {
            sQLiteDatabase.execSQL(this.f17252n);
            sQLiteDatabase.execSQL(this.q);
        }
        if (i2 < 4) {
            sQLiteDatabase.execSQL(this.u);
            sQLiteDatabase.execSQL(this.f17246h);
            sQLiteDatabase.execSQL(this.x);
            sQLiteDatabase.execSQL(this.B);
            sQLiteDatabase.execSQL(this.s);
            sQLiteDatabase.execSQL(this.f17247i);
            sQLiteDatabase.execSQL(this.f17248j);
            sQLiteDatabase.execSQL(this.f17249k);
            sQLiteDatabase.execSQL(this.p);
            sQLiteDatabase.execSQL(this.f17251m);
            sQLiteDatabase.execSQL(this.t);
        }
        if (i2 < 5) {
            sQLiteDatabase.execSQL(this.C);
            sQLiteDatabase.execSQL(this.D);
        }
        if (i2 < 6) {
            sQLiteDatabase.execSQL(this.z);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS iptv_live_category");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS iptv_movie_category");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS series_category_v2");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS iptv_live_streams");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS series_streams_v2");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS epg");
            sQLiteDatabase.execSQL(this.f17243e);
            sQLiteDatabase.execSQL(this.f17244f);
            sQLiteDatabase.execSQL(this.H);
            sQLiteDatabase.execSQL(this.r);
            sQLiteDatabase.execSQL(this.I);
            sQLiteDatabase.execSQL(this.v);
            sQLiteDatabase.execSQL(this.w);
            sQLiteDatabase.execSQL(this.E);
            sQLiteDatabase.execSQL(this.F);
        }
        if (i2 < 7) {
            sQLiteDatabase.execSQL(this.G);
        }
    }

    public void p(List<XMLTVProgrammePojo> list) {
        try {
            int iZ = m.z(this.f17240b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            String str = m.f(this.f17240b).equals("m3u") ? "epg_m3u" : "epg";
            try {
                ContentValues contentValues = new ContentValues();
                int size = list.size();
                if (size != 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        contentValues.put(ChartFactory.TITLE, list.get(i2).m());
                        contentValues.put("start", list.get(i2).j());
                        contentValues.put("stop", list.get(i2).l());
                        contentValues.put("description", list.get(i2).b());
                        contentValues.put("channel_id", list.get(i2).a());
                        contentValues.put("user_id_referred", Integer.valueOf(iZ));
                        contentValues.put("source_ref_id", list.get(i2).i());
                        writableDatabase.insert(str, null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }

    public ArrayList<c.h.a.i.e> p1(String str) {
        String str2;
        int i2;
        ArrayList<c.h.a.i.e> arrayList = new ArrayList<>();
        int iZ = m.z(this.f17240b);
        String strF = m.f(this.f17240b);
        System.currentTimeMillis();
        if (strF.equals("m3u")) {
            str2 = "SELECT * FROM iptv_live_category_m3u WHERE user_id_referred='" + iZ + "' AND categoryID IS NOT NULL";
        } else {
            str2 = "SELECT iptv_live_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_live_category,iptv_live_streams WHERE iptv_live_category.categoryID_live = iptv_live_streams.categoryID AND iptv_live_category.user_id_referred = '" + iZ + "' AND iptv_live_streams" + InstructionFileId.DOT + "stream_type LIKE '%" + str + "%'  GROUP BY iptv_live_streams" + InstructionFileId.DOT + "categoryID ORDER BY iptv_live_category" + InstructionFileId.DOT + "id_live";
        }
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                System.currentTimeMillis();
                do {
                    try {
                        i2 = Integer.parseInt(cursorRawQuery.getString(3));
                    } catch (NumberFormatException unused) {
                        i2 = 0;
                    }
                    c.h.a.i.e eVar = new c.h.a.i.e();
                    eVar.f(Integer.parseInt(cursorRawQuery.getString(0)));
                    eVar.g(cursorRawQuery.getString(1));
                    eVar.h(cursorRawQuery.getString(2));
                    eVar.j(i2);
                    arrayList.add(eVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused2) {
            return null;
        }
    }

    public void p2(String str) {
        String str2;
        try {
            int iZ = m.z(this.f17240b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("0")) {
                str2 = "DELETE FROM iptv_live_category_m3u WHERE user_id_referred='" + iZ + "'";
            } else {
                str2 = "DELETE FROM iptv_live_category_m3u WHERE categoryID ='" + str + "' AND user_id_referred='" + iZ + "'";
            }
            writableDatabase.execSQL(str2);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void q(String str, String str2, String str3, String str4) {
        try {
            String str5 = m.f(this.f17240b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources";
            int iZ = m.z(this.f17240b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("user_id_referred", Integer.valueOf(iZ));
            contentValues.put("name", str);
            contentValues.put("source_type", str2);
            contentValues.put("epgurl", str3);
            contentValues.put("default_source", str4);
            writableDatabase.insert(str5, null, contentValues);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public ArrayList<c.h.a.i.e> q1() {
        int i2;
        ArrayList<c.h.a.i.e> arrayList = new ArrayList<>();
        int iZ = m.z(this.f17240b);
        m.f(this.f17240b);
        System.currentTimeMillis();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT iptv_live_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_live_category,iptv_live_streams WHERE iptv_live_category.categoryID_live = iptv_live_streams.categoryID AND iptv_live_category.user_id_referred = '" + iZ + "' AND iptv_live_streams" + InstructionFileId.DOT + "user_id_referred = '" + iZ + "' AND iptv_live_streams" + InstructionFileId.DOT + "stream_type = 'radio_streams' AND iptv_live_streams" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1') GROUP BY iptv_live_streams" + InstructionFileId.DOT + "categoryID ORDER BY iptv_live_category" + InstructionFileId.DOT + "id_live", null);
            if (cursorRawQuery.moveToFirst()) {
                System.currentTimeMillis();
                do {
                    try {
                        i2 = Integer.parseInt(cursorRawQuery.getString(3));
                    } catch (NumberFormatException unused) {
                        i2 = 0;
                    }
                    c.h.a.i.e eVar = new c.h.a.i.e();
                    eVar.f(Integer.parseInt(cursorRawQuery.getString(0)));
                    eVar.g(cursorRawQuery.getString(1));
                    eVar.h(cursorRawQuery.getString(2));
                    eVar.j(i2);
                    eVar.i(c.h.a.h.n.e.S(cursorRawQuery.getString(5)));
                    arrayList.add(eVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused2) {
            return null;
        }
    }

    public void q2(String str) {
        String str2;
        try {
            int iZ = m.z(this.f17240b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("0")) {
                str2 = "DELETE FROM iptv_movie_category_m3u WHERE user_id_referred='" + iZ + "'";
            } else {
                str2 = "DELETE FROM iptv_movie_category_m3u WHERE categoryID ='" + str + "' AND user_id_referred='" + iZ + "'";
            }
            writableDatabase.execSQL(str2);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public boolean r(List<XMLTVProgrammePojo> list) {
        try {
            int iZ = m.z(this.f17240b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            String str = m.f(this.f17240b).equals("m3u") ? "epg_m3u" : "epg";
            try {
                ContentValues contentValues = new ContentValues();
                int size = list.size();
                if (size != 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        contentValues.put(ChartFactory.TITLE, list.get(i2).m());
                        contentValues.put("start", list.get(i2).j());
                        contentValues.put("stop", list.get(i2).l());
                        contentValues.put("description", list.get(i2).b());
                        contentValues.put("channel_id", list.get(i2).a());
                        contentValues.put("user_id_referred", Integer.valueOf(iZ));
                        contentValues.put("source_ref_id", list.get(i2).i());
                        writableDatabase.insert(str, null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            } catch (Exception unused2) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public ArrayList<c.h.a.i.e> r1() {
        ArrayList<c.h.a.i.e> arrayList = new ArrayList<>();
        int iZ = m.z(this.f17240b);
        new ArrayList();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_m3u_all_category WHERE user_id_referred='" + iZ + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.e eVar = new c.h.a.i.e();
                    eVar.f(Integer.parseInt(cursorRawQuery.getString(0)));
                    eVar.g(cursorRawQuery.getString(1));
                    eVar.h(cursorRawQuery.getString(2));
                    eVar.j(Integer.parseInt(cursorRawQuery.getString(3)));
                    arrayList.add(eVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public void r2(String str) {
        String str2;
        try {
            int iZ = m.z(this.f17240b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("0")) {
                str2 = "DELETE FROM iptv_series_category_m3u WHERE user_id_referred='" + iZ + "'";
            } else {
                str2 = "DELETE FROM iptv_series_category_m3u WHERE categoryID ='" + str + "' AND user_id_referred='" + iZ + "'";
            }
            writableDatabase.execSQL(str2);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public boolean s(List<LiveStreamCategoriesCallback> list) {
        try {
            int iZ = m.z(this.f17240b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    int size = list.size();
                    if (size != 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            c.h.a.h.n.e.f17067i = true;
                            contentValues.put("categoryID_live", list.get(i2).a());
                            contentValues.put("categoryname_live", list.get(i2).b());
                            contentValues.put("paent_id", list.get(i2).c());
                            contentValues.put("user_id_referred", Integer.valueOf(iZ));
                            writableDatabase.insert("iptv_live_category", null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    c.h.a.h.n.e.f17067i = false;
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    writableDatabase.endTransaction();
                    c.h.a.h.n.e.f17067i = false;
                    Log.w("msg", "exception");
                    return false;
                }
            } catch (Exception unused2) {
                writableDatabase.endTransaction();
                c.h.a.h.n.e.f17067i = false;
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
            c.h.a.h.n.e.f17067i = false;
            return false;
        }
    }

    public final int s0(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_movie_category WHERE categoryID_movie ='" + str + "' AND user_id_referred='" + m.z(this.f17240b) + "'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<c.h.a.i.g> s1(String str) {
        int iZ = m.z(this.f17240b);
        ArrayList<c.h.a.i.g> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  iptv_m3u_all_category.* FROM iptv_m3u_all_category,iptv_live_streams_m3u WHERE iptv_live_streams_m3u.user_id_referred = " + iZ + " AND iptv_live_streams_m3u" + InstructionFileId.DOT + "stream_type = '" + str + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID=iptv_m3u_all_category" + InstructionFileId.DOT + "categoryID GROUP BY iptv_m3u_all_category" + InstructionFileId.DOT + "categoryID", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.i.g gVar = new c.h.a.i.g();
                    gVar.c(cursorRawQuery.getString(1));
                    gVar.d(cursorRawQuery.getString(2));
                    arrayList.add(gVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094 A[Catch: Exception -> 0x00b3, SQLiteDatabaseLockedException -> 0x00b7, TryCatch #2 {SQLiteDatabaseLockedException -> 0x00b7, Exception -> 0x00b3, blocks: (B:7:0x001a, B:9:0x0061, B:11:0x0067, B:18:0x008e, B:20:0x0094, B:22:0x00a9, B:25:0x00af, B:14:0x0080, B:16:0x0084), top: B:31:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean s2(java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "exception"
            java.lang.String r1 = "msg"
            java.lang.String r2 = ""
            android.content.Context r3 = r8.f17240b
            java.lang.String r3 = c.h.a.i.q.m.f(r3)
            java.lang.String r4 = "m3u"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L17
            java.lang.String r3 = "iptv_password_table_m3u"
            goto L19
        L17:
            java.lang.String r3 = "iptv_password_table"
        L19:
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5.<init>()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r6 = "SELECT rowid FROM "
            r5.append(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5.append(r3)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r6 = " WHERE "
            r5.append(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r6 = "user_detail"
            r5.append(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r6 = " = '"
            r5.append(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5.append(r9)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r9 = "' AND "
            r5.append(r9)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r9 = "user_id_referred"
            r5.append(r9)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r9 = " = "
            r5.append(r9)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5.append(r11)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5.append(r2)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r8.getReadableDatabase()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            android.database.sqlite.SQLiteDatabase r11 = r8.getWritableDatabase()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5 = 0
            android.database.Cursor r9 = r11.rawQuery(r9, r5)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5 = 1
            if (r9 == 0) goto L80
            boolean r6 = r9.moveToFirst()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            if (r6 == 0) goto L8d
        L67:
            java.lang.String r6 = "id_password"
            int r6 = r9.getColumnIndex(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r6 = r9.getString(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            boolean r7 = r9.moveToNext()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            if (r7 != 0) goto L67
            goto L8e
        L80:
            android.content.Context r6 = r8.f17240b     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            if (r6 == 0) goto L8d
            java.lang.String r7 = "cursor is null"
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r5)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r6.show()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
        L8d:
            r6 = r2
        L8e:
            boolean r2 = r6.equals(r2)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            if (r2 != 0) goto Lad
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r2.<init>()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r7 = "password"
            r2.put(r7, r10)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r10 = "id_password= ?"
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r7[r4] = r6     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r11.update(r3, r2, r10, r7)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            if (r9 == 0) goto Lac
            r9.close()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
        Lac:
            return r5
        Lad:
            if (r9 == 0) goto Lb2
            r9.close()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
        Lb2:
            return r4
        Lb3:
            android.util.Log.w(r1, r0)
            return r4
        Lb7:
            android.util.Log.w(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.i.q.f.s2(java.lang.String, java.lang.String, int):boolean");
    }

    public void t(String str) {
        try {
            String strF = m.f(this.f17240b);
            int iZ = m.z(this.f17240b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("stream_id_url", str);
            contentValues.put("user_id_referred", Integer.valueOf(iZ));
            contentValues.put("app_type", strF);
            writableDatabase.insert("iptv_live_watched", null, contentValues);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public int t1(String str, String str2) {
        String str3;
        int iZ = m.z(this.f17240b);
        if (str.equals("0")) {
            str3 = "SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE user_id_referred='" + iZ + "' AND stream_type='" + str2 + "'";
        } else if (str.equals("-1")) {
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = "SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE categoryID='" + str + "' AND user_id_referred='" + iZ + "' AND stream_type='" + str2 + "'";
        }
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str3, null);
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i2;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void t2(String str, String str2, String str3, String str4, int i2) {
        int iZ = m.z(this.f17240b);
        String str5 = m.f(this.f17240b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources";
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("user_id_referred", Integer.valueOf(iZ));
            contentValues2.put("name", str);
            contentValues2.put("source_type", str2);
            contentValues2.put("epgurl", str3);
            contentValues2.put("default_source", str4);
            if (str4.equals("1")) {
                contentValues.put("default_source", "0");
                writableDatabase.update(str5, contentValues, "user_id_referred = ?", new String[]{String.valueOf(iZ)});
            }
            writableDatabase.update(str5, contentValues2, "auto_id = ? AND user_id_referred = ?", new String[]{String.valueOf(i2), String.valueOf(iZ)});
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public void u(ArrayList<c.h.a.i.f> arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        int iZ = m.z(this.f17240b);
        String strF = m.f(this.f17240b);
        try {
            ContentValues contentValues = new ContentValues();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                contentValues.put("stream_id_url", arrayList.get(i2).Y());
                contentValues.put("user_id_referred", Integer.valueOf(iZ));
                contentValues.put("app_type", strF);
                writableDatabase.insert("iptv_live_watched", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            writableDatabase.endTransaction();
            Log.w("msg", "exception");
        }
    }

    public ArrayList<c.h.a.i.f> u1(String str, String str2) {
        if (str != null) {
            ArrayList<c.h.a.i.f> arrayList = new ArrayList<>();
            int iZ = m.z(this.f17240b);
            if (m.f(this.f17240b).equals("m3u")) {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE '%live%' AND num='" + str + "' AND user_id_referred='" + iZ + "' LIMIT 1", null);
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            c.h.a.i.f fVar = new c.h.a.i.f();
                            fVar.n0(Integer.parseInt(cursorRawQuery.getString(0)));
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
                            fVar.G0(cursorRawQuery.getString(18));
                            arrayList.add(fVar);
                        } while (cursorRawQuery.moveToNext());
                    }
                    cursorRawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException | Exception unused) {
                    return null;
                }
            }
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams WHERE stream_type LIKE '%" + str2 + "%' AND num='" + str + "' AND user_id_referred='" + iZ + "' LIMIT 1", null);
                if (cursorRawQuery2.moveToFirst()) {
                    do {
                        c.h.a.i.f fVar2 = new c.h.a.i.f();
                        fVar2.n0(Integer.parseInt(cursorRawQuery2.getString(0)));
                        fVar2.u0(cursorRawQuery2.getString(1));
                        fVar2.t0(cursorRawQuery2.getString(2));
                        fVar2.C0(cursorRawQuery2.getString(3));
                        fVar2.B0(cursorRawQuery2.getString(4));
                        fVar2.A0(cursorRawQuery2.getString(5));
                        fVar2.l0(cursorRawQuery2.getString(6));
                        fVar2.f0(cursorRawQuery2.getString(7));
                        fVar2.g0(cursorRawQuery2.getString(8));
                        fVar2.j0(cursorRawQuery2.getString(9));
                        fVar2.D0(cursorRawQuery2.getString(10));
                        fVar2.k0(cursorRawQuery2.getString(11));
                        fVar2.E0(cursorRawQuery2.getString(12));
                        fVar2.F0(cursorRawQuery2.getString(13));
                        fVar2.h0(cursorRawQuery2.getString(14));
                        fVar2.z0(cursorRawQuery2.getString(15));
                        fVar2.p0(cursorRawQuery2.getString(16));
                        fVar2.i0(cursorRawQuery2.getString(17));
                        arrayList.add(fVar2);
                    } while (cursorRawQuery2.moveToNext());
                }
                cursorRawQuery2.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException | Exception unused2) {
            }
        }
        return null;
    }

    public void u2(String str, String str2) {
        try {
            int iZ = m.z(this.f17240b);
            String strF = m.f(this.f17240b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", str2);
            contentValues.put("date", c.h.a.h.n.e.i());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            writableDatabase.update("iptv_import_status", contentValues, "type = ? AND user_id_referred = ? AND app_type = ?", new String[]{String.valueOf(str), String.valueOf(iZ), String.valueOf(strF)});
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public boolean v(List<VodCategoriesCallback> list) {
        try {
            int iZ = m.z(this.f17240b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    int size = list.size();
                    if (size != 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            c.h.a.h.n.e.f17067i = true;
                            contentValues.put("categoryID_movie", list.get(i2).a());
                            contentValues.put("categoryname_movie", list.get(i2).b());
                            contentValues.put("paent_id", list.get(i2).c());
                            contentValues.put("user_id_referred", Integer.valueOf(iZ));
                            writableDatabase.insert("iptv_movie_category", null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    c.h.a.h.n.e.f17067i = false;
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    Log.w("msg", "exception");
                    writableDatabase.endTransaction();
                    c.h.a.h.n.e.f17067i = false;
                    return false;
                }
            } catch (Exception unused2) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                c.h.a.h.n.e.f17067i = false;
                return false;
            }
        } catch (Exception unused3) {
            c.h.a.h.n.e.f17067i = false;
            return false;
        }
    }

    public ArrayList<XMLTVProgrammePojo> v1(String str) {
        int iZ = m.z(this.f17240b);
        ArrayList<XMLTVProgrammePojo> arrayList = new ArrayList<>();
        String str2 = m.f(this.f17240b).equals("m3u") ? "epg_m3u" : "epg";
        ArrayList<c> arrayListS0 = S0();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM " + str2 + " WHERE channel_id='" + str + "' AND user_id_referred='" + iZ + "' AND source_ref_id='" + ((arrayListS0 == null || arrayListS0.size() <= 0) ? "0" : String.valueOf(arrayListS0.get(0).c())) + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    XMLTVProgrammePojo xMLTVProgrammePojo = new XMLTVProgrammePojo();
                    xMLTVProgrammePojo.A(cursorRawQuery.getString(1));
                    xMLTVProgrammePojo.x(cursorRawQuery.getString(2));
                    xMLTVProgrammePojo.z(cursorRawQuery.getString(3));
                    xMLTVProgrammePojo.p(cursorRawQuery.getString(4));
                    xMLTVProgrammePojo.o(cursorRawQuery.getString(5));
                    xMLTVProgrammePojo.w(cursorRawQuery.getString(7));
                    arrayList.add(xMLTVProgrammePojo);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public void v2(String str, String str2, String str3) {
        try {
            int iZ = m.z(this.f17240b);
            String strF = m.f(this.f17240b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", str2);
            contentValues.put("date", c.h.a.h.n.e.i());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            writableDatabase.update("iptv_import_status", contentValues, "type = ? AND user_id_referred = ? AND app_type = ? AND source_ref_id = ?", new String[]{String.valueOf(str), String.valueOf(iZ), String.valueOf(strF), String.valueOf(str3)});
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void w(h hVar) {
        String strF = m.f(this.f17240b);
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("user_detail", hVar.a());
            contentValues.put("password", hVar.c());
            contentValues.put("user_id_referred", Integer.valueOf(hVar.b()));
            writableDatabase.insert(strF.equals("m3u") ? "iptv_password_table_m3u" : "iptv_password_table", null, contentValues);
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public final int w0(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM series_category_v2 WHERE category_id_series_v2 ='" + str + "' AND user_id_referred = '" + m.z(this.f17240b) + "'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int w1(String str) {
        StringBuilder sb;
        String str2;
        int iZ = m.z(this.f17240b);
        if (m.f(this.f17240b).equals("m3u")) {
            sb = new StringBuilder();
            str2 = "SELECT  * FROM epg_m3u WHERE user_id_referred='";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT  * FROM epg WHERE user_id_referred='";
        }
        sb.append(str2);
        sb.append(iZ);
        sb.append("' AND ");
        sb.append("source_ref_id");
        sb.append("='");
        sb.append(str);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void w2() {
        int iZ = m.z(this.f17240b);
        String str = m.f(this.f17240b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources";
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("default_source", "1");
            writableDatabase.update(str, contentValues, "user_id_referred = ? AND source_type = ?", new String[]{String.valueOf(iZ), "panel"});
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public void x(i iVar) {
        String str = m.f(this.f17240b).equals("m3u") ? "iptv_password_status_table_m3u" : "iptv_password_status_table";
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("password_status_cat_id", iVar.b());
            contentValues.put("password_user_detail", iVar.c());
            contentValues.put("password_status", iVar.a());
            contentValues.put("user_id_referred", Integer.valueOf(iVar.d()));
            writableDatabase.insert(str, null, contentValues);
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public ArrayList<XMLTVProgrammePojo> x1(String str, String str2) {
        ArrayList<XMLTVProgrammePojo> arrayList;
        ArrayList<XMLTVProgrammePojo> arrayList2;
        int iZ = m.z(this.f17240b);
        ArrayList<XMLTVProgrammePojo> arrayList3 = new ArrayList<>();
        String strF = m.f(this.f17240b);
        ArrayList<c> arrayListS0 = S0();
        String strValueOf = (arrayListS0 == null || arrayListS0.size() <= 0) ? "0" : String.valueOf(arrayListS0.get(0).c());
        ArrayList<XMLTVProgrammePojo> arrayList4 = arrayList3;
        if (!strF.equals("m3u")) {
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT DISTINCT title,start,stop,description,channel_id,num,name,stream_id,stream_icon,categoryID FROM epg , iptv_live_streams WHERE epg.user_id_referred = '" + iZ + "' AND iptv_live_streams" + InstructionFileId.DOT + "user_id_referred = '" + iZ + "' AND epg" + InstructionFileId.DOT + "source_ref_id = '" + strValueOf + "' AND epg" + InstructionFileId.DOT + "channel_id = iptv_live_streams" + InstructionFileId.DOT + "epg_channel_id AND epg" + InstructionFileId.DOT + ChartFactory.TITLE + " LIKE '%" + str + "%' AND stop>='" + str2 + "' AND iptv_live_streams" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1') ORDER BY epg" + InstructionFileId.DOT + "stop ASC", null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask = c.h.a.h.n.e.f17066h;
                            if (asyncTask != null && asyncTask.isCancelled()) {
                                Log.e("honey", "stopped epg");
                                break;
                            }
                            XMLTVProgrammePojo xMLTVProgrammePojo = new XMLTVProgrammePojo();
                            xMLTVProgrammePojo.A(cursorRawQuery.getString(0));
                            xMLTVProgrammePojo.x(cursorRawQuery.getString(1));
                            xMLTVProgrammePojo.z(cursorRawQuery.getString(2));
                            xMLTVProgrammePojo.p(cursorRawQuery.getString(3));
                            xMLTVProgrammePojo.o(cursorRawQuery.getString(4));
                            xMLTVProgrammePojo.u(cursorRawQuery.getString(5));
                            xMLTVProgrammePojo.t(cursorRawQuery.getString(6));
                            xMLTVProgrammePojo.v(cursorRawQuery.getString(7));
                            xMLTVProgrammePojo.s(cursorRawQuery.getString(8));
                            xMLTVProgrammePojo.r(cursorRawQuery.getString(9));
                            arrayList = arrayList4;
                            arrayList.add(xMLTVProgrammePojo);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            arrayList4 = arrayList;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    cursorRawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        try {
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT DISTINCT title,start,stop,description,channel_id,num,name,stream_icon,categoryID,url FROM epg_m3u , iptv_live_streams_m3u WHERE epg_m3u.user_id_referred = '" + iZ + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "user_id_referred = '" + iZ + "' AND epg_m3u" + InstructionFileId.DOT + "source_ref_id = '" + strValueOf + "' AND epg_m3u" + InstructionFileId.DOT + "channel_id = iptv_live_streams_m3u" + InstructionFileId.DOT + "epg_channel_id AND epg_m3u" + InstructionFileId.DOT + ChartFactory.TITLE + " LIKE '%" + str + "%' AND stop>='" + str2 + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table_m3u WHERE iptv_password_status_table_m3u" + InstructionFileId.DOT + "user_id_referred ='" + iZ + "' AND iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status ='1') ORDER BY epg_m3u" + InstructionFileId.DOT + "stop ASC", null);
                if (cursorRawQuery2.moveToFirst()) {
                    while (true) {
                        AsyncTask asyncTask2 = c.h.a.h.n.e.f17066h;
                        if (asyncTask2 != null && asyncTask2.isCancelled()) {
                            Log.e("honey", "stopped epg");
                            break;
                        }
                        XMLTVProgrammePojo xMLTVProgrammePojo2 = new XMLTVProgrammePojo();
                        xMLTVProgrammePojo2.A(cursorRawQuery2.getString(0));
                        xMLTVProgrammePojo2.x(cursorRawQuery2.getString(1));
                        xMLTVProgrammePojo2.z(cursorRawQuery2.getString(2));
                        xMLTVProgrammePojo2.p(cursorRawQuery2.getString(3));
                        xMLTVProgrammePojo2.o(cursorRawQuery2.getString(4));
                        xMLTVProgrammePojo2.u(cursorRawQuery2.getString(5));
                        xMLTVProgrammePojo2.t(cursorRawQuery2.getString(6));
                        xMLTVProgrammePojo2.v(BuildConfig.FLAVOR);
                        xMLTVProgrammePojo2.s(cursorRawQuery2.getString(7));
                        xMLTVProgrammePojo2.r(cursorRawQuery2.getString(8));
                        xMLTVProgrammePojo2.B(cursorRawQuery2.getString(9));
                        arrayList2 = arrayList4;
                        arrayList2.add(xMLTVProgrammePojo2);
                        if (!cursorRawQuery2.moveToNext()) {
                            break;
                        }
                        arrayList4 = arrayList2;
                    }
                } else {
                    arrayList2 = arrayList4;
                }
                cursorRawQuery2.close();
                return arrayList2;
            } catch (SQLiteDatabaseLockedException unused5) {
                return null;
            } catch (Exception unused6) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused7) {
            return null;
        } catch (Exception unused8) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2 A[Catch: Exception -> 0x00c1, SQLiteDatabaseLockedException -> 0x00c5, TryCatch #2 {SQLiteDatabaseLockedException -> 0x00c5, Exception -> 0x00c1, blocks: (B:7:0x001e, B:9:0x006f, B:11:0x0075, B:18:0x009c, B:20:0x00a2, B:22:0x00b7, B:25:0x00bd, B:14:0x008e, B:16:0x0092), top: B:31:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean x2(java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.i.q.f.x2(java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    public boolean y(ArrayList<GetSeriesStreamCategoriesCallback> arrayList) {
        try {
            int iZ = m.z(this.f17240b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                int size = arrayList.size();
                if (size != 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        c.h.a.h.n.e.f17067i = true;
                        contentValues.put("category_id_series_v2", arrayList.get(i2).a());
                        contentValues.put("category_name_series_v2", arrayList.get(i2).b());
                        contentValues.put("user_id_referred", Integer.valueOf(iZ));
                        writableDatabase.insert("series_category_v2", null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                c.h.a.h.n.e.f17067i = false;
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                c.h.a.h.n.e.f17067i = false;
                return false;
            } catch (Exception e2) {
                Log.w("msg", "exception: " + e2.getMessage());
                writableDatabase.endTransaction();
                c.h.a.h.n.e.f17067i = false;
                return false;
            }
        } catch (Exception unused2) {
            c.h.a.h.n.e.f17067i = false;
            return false;
        }
    }

    public ArrayList<c> y1() {
        int iZ = m.z(this.f17240b);
        String str = "SELECT  * FROM " + (m.f(this.f17240b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources") + " WHERE user_id_referred ='" + iZ + "' ORDER BY source_type DESC , auto_id DESC";
        try {
            ArrayList<c> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c cVar = new c();
                    cVar.h(c.h.a.h.n.e.S(cursorRawQuery.getString(0)));
                    cVar.k(cursorRawQuery.getString(1));
                    cVar.i(cursorRawQuery.getString(2));
                    cVar.j(cursorRawQuery.getString(3));
                    cVar.g(cursorRawQuery.getString(4));
                    cVar.f(cursorRawQuery.getString(5));
                    arrayList.add(cVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<XMLTVProgrammePojo> z1(String str, String str2) {
        int iZ = m.z(this.f17240b);
        String str3 = m.f(this.f17240b).equals("m3u") ? "epg_m3u" : "epg";
        ArrayList<c> arrayListS0 = S0();
        String strValueOf = (arrayListS0 == null || arrayListS0.size() <= 0) ? "0" : String.valueOf(arrayListS0.get(0).c());
        ArrayList<XMLTVProgrammePojo> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM " + str3 + " WHERE user_id_referred='" + iZ + "' AND source_ref_id='" + strValueOf + "' AND '" + str2 + "' BETWEEN start AND stop", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    XMLTVProgrammePojo xMLTVProgrammePojo = new XMLTVProgrammePojo();
                    xMLTVProgrammePojo.A(cursorRawQuery.getString(1));
                    xMLTVProgrammePojo.x(cursorRawQuery.getString(2));
                    xMLTVProgrammePojo.z(cursorRawQuery.getString(3));
                    xMLTVProgrammePojo.p(cursorRawQuery.getString(4));
                    xMLTVProgrammePojo.o(cursorRawQuery.getString(5));
                    xMLTVProgrammePojo.w(cursorRawQuery.getString(7));
                    arrayList.add(xMLTVProgrammePojo);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }
}
