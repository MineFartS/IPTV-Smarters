package c.f.a.c.k.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import c.f.a.c.j.h.sb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends p9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f13980d = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f13981e = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f13982f = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f13983g = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f13984h = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f13985i = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f13986j = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f13987k = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f13988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l9 f13989m;

    public j(x9 x9Var) {
        super(x9Var);
        this.f13989m = new l9(this.f14413a.a());
        this.f14413a.z();
        this.f13988l = new i(this, this.f14413a.b(), "google_app_measurement.db");
    }

    public static final void H(ContentValues contentValues, String str, Object obj) {
        c.f.a.c.f.q.o.e("value");
        c.f.a.c.f.q.o.i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x023d: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:101:0x023d */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    public final void G(String str, long j2, long j3, w9 w9Var) throws Throwable {
        ?? IsEmpty;
        Cursor cursor;
        Cursor cursorRawQuery;
        String string;
        char c2;
        String str2;
        String[] strArr;
        c.f.a.c.f.q.o.i(w9Var);
        g();
        i();
        Cursor cursor2 = null;
        string = null;
        string = null;
        String string2 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseN = N();
                IsEmpty = TextUtils.isEmpty(null);
                String str3 = BuildConfig.FLAVOR;
                try {
                    if (IsEmpty != 0) {
                        String[] strArr2 = j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)};
                        if (j3 != -1) {
                            str3 = "rowid <= ? and ";
                        }
                        StringBuilder sb = new StringBuilder(str3.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str3);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseN.rawQuery(sb.toString(), strArr2);
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                        }
                    } else {
                        String[] strArr3 = j3 != -1 ? new String[]{null, String.valueOf(j3)} : new String[]{null};
                        if (j3 != -1) {
                            str3 = " and rowid <= ?";
                        }
                        StringBuilder sb2 = new StringBuilder(str3.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str3);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseN.rawQuery(sb2.toString(), strArr3);
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                        }
                    }
                    Cursor cursor3 = cursorRawQuery;
                    String str4 = string;
                    try {
                        Cursor cursorQuery = sQLiteDatabaseN.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, str4}, null, null, "rowid", "2");
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                this.f14413a.c().o().b("Raw event metadata record is missing. appId", y3.x(string2));
                                cursorQuery.close();
                                return;
                            }
                            try {
                                try {
                                    c.f.a.c.j.h.y1 y1VarM = ((c.f.a.c.j.h.x1) z9.I(c.f.a.c.j.h.y1.K0(), cursorQuery.getBlob(0))).m();
                                    if (cursorQuery.moveToNext()) {
                                        this.f14413a.c().r().b("Get multiple raw event metadata records, expected one. appId", y3.x(string2));
                                    }
                                    cursorQuery.close();
                                    c.f.a.c.f.q.o.i(y1VarM);
                                    w9Var.f14424a = y1VarM;
                                    if (j3 != -1) {
                                        c2 = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{string2, str4, String.valueOf(j3)};
                                    } else {
                                        c2 = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{string2, str4};
                                    }
                                    String[] strArr4 = new String[4];
                                    strArr4[0] = "rowid";
                                    strArr4[c2] = "name";
                                    strArr4[2] = "timestamp";
                                    strArr4[3] = "data";
                                    Cursor cursorQuery2 = sQLiteDatabaseN.query("raw_events", strArr4, str2, strArr, null, null, "rowid", null);
                                    if (!cursorQuery2.moveToFirst()) {
                                        this.f14413a.c().r().b("Raw event data disappeared while in transaction. appId", y3.x(string2));
                                        cursorQuery2.close();
                                        return;
                                    }
                                    do {
                                        long j4 = cursorQuery2.getLong(0);
                                        try {
                                            c.f.a.c.j.h.p1 p1Var = (c.f.a.c.j.h.p1) z9.I(c.f.a.c.j.h.q1.G(), cursorQuery2.getBlob(3));
                                            p1Var.H(cursorQuery2.getString(1));
                                            p1Var.K(cursorQuery2.getLong(2));
                                            if (!w9Var.a(j4, p1Var.m())) {
                                                cursorQuery2.close();
                                                return;
                                            }
                                        } catch (IOException e2) {
                                            this.f14413a.c().o().c("Data loss. Failed to merge raw event. appId", y3.x(string2), e2);
                                        }
                                    } while (cursorQuery2.moveToNext());
                                    cursorQuery2.close();
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    IsEmpty = cursorQuery;
                                    this.f14413a.c().o().c("Data loss. Error selecting raw event. appId", y3.x(string2), e);
                                    if (IsEmpty != 0) {
                                        IsEmpty.close();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursorQuery;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e4) {
                                this.f14413a.c().o().c("Data loss. Failed to merge raw event metadata. appId", y3.x(string2), e4);
                                cursorQuery.close();
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        IsEmpty = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                }
            } catch (SQLiteException e8) {
                e = e8;
                IsEmpty = 0;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            cursor2 = cursor;
        }
    }

    public final long I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = N().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e2) {
                this.f14413a.c().o().c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long J(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = N().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j2;
                }
                long j3 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j3;
            } catch (SQLiteException e2) {
                this.f14413a.c().o().c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void K() {
        i();
        N().beginTransaction();
    }

    public final void L() {
        i();
        N().setTransactionSuccessful();
    }

    public final void M() {
        i();
        N().endTransaction();
    }

    public final SQLiteDatabase N() {
        g();
        try {
            return this.f13988l.getWritableDatabase();
        } catch (SQLiteException e2) {
            this.f14413a.c().r().b("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c.f.a.c.k.b.p O(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.j.O(java.lang.String, java.lang.String):c.f.a.c.k.b.p");
    }

    public final void P(p pVar) {
        c.f.a.c.f.q.o.i(pVar);
        g();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", pVar.f14199a);
        contentValues.put("name", pVar.f14200b);
        contentValues.put("lifetime_count", Long.valueOf(pVar.f14201c));
        contentValues.put("current_bundle_count", Long.valueOf(pVar.f14202d));
        contentValues.put("last_fire_timestamp", Long.valueOf(pVar.f14204f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(pVar.f14205g));
        contentValues.put("last_bundled_day", pVar.f14206h);
        contentValues.put("last_sampled_complex_event_id", pVar.f14207i);
        contentValues.put("last_sampling_rate", pVar.f14208j);
        contentValues.put("current_session_count", Long.valueOf(pVar.f14203e));
        Boolean bool = pVar.f14209k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (N().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f14413a.c().o().b("Failed to insert/update event aggregates (got -1). appId", y3.x(pVar.f14199a));
            }
        } catch (SQLiteException e2) {
            this.f14413a.c().o().c("Error storing event aggregates. appId", y3.x(pVar.f14199a), e2);
        }
    }

    public final void Q(String str, String str2) {
        c.f.a.c.f.q.o.e(str);
        c.f.a.c.f.q.o.e(str2);
        g();
        i();
        try {
            N().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            this.f14413a.c().o().d("Error deleting user property. appId", y3.x(str), this.f14413a.H().r(str2), e2);
        }
    }

    public final boolean R(ca caVar) {
        c.f.a.c.f.q.o.i(caVar);
        g();
        i();
        if (S(caVar.f13807a, caVar.f13809c) == null) {
            if (ea.i0(caVar.f13809c)) {
                long jI = I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{caVar.f13807a});
                f fVarZ = this.f14413a.z();
                String str = caVar.f13807a;
                c.f.a.c.j.h.ea.a();
                if (jI >= (fVarZ.w(null, m3.x0) ? fVarZ.u(str, m3.H, 25, 100) : 25)) {
                    return false;
                }
            } else if (!"_npa".equals(caVar.f13809c)) {
                long jI2 = I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{caVar.f13807a, caVar.f13808b});
                this.f14413a.z();
                if (jI2 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", caVar.f13807a);
        contentValues.put("origin", caVar.f13808b);
        contentValues.put("name", caVar.f13809c);
        contentValues.put("set_timestamp", Long.valueOf(caVar.f13810d));
        H(contentValues, "value", caVar.f13811e);
        try {
            if (N().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f14413a.c().o().b("Failed to insert/update user property (got -1). appId", y3.x(caVar.f13807a));
            }
        } catch (SQLiteException e2) {
            this.f14413a.c().o().c("Error storing user property. appId", y3.x(caVar.f13807a), e2);
        }
        return true;
    }

    public final ca S(String str, String str2) {
        Cursor cursorQuery;
        c.f.a.c.f.q.o.e(str);
        c.f.a.c.f.q.o.e(str2);
        g();
        i();
        Cursor cursor = null;
        try {
            cursorQuery = N().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                ca caVar = new ca(str, cursorQuery.getString(2), str2, cursorQuery.getLong(0), l(cursorQuery, 1));
                if (cursorQuery.moveToNext()) {
                    this.f14413a.c().o().b("Got multiple records for user property, expected one. appId", y3.x(str));
                }
                cursorQuery.close();
                return caVar;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e3) {
            e = e3;
            this.f14413a.c().o().d("Error querying user property. appId", y3.x(str), this.f14413a.H().r(str2), e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        }
        th = th2;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00e1: MOVE (r19 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:36:0x00e1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<c.f.a.c.k.b.ca> T(java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.j.T(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        r2 = r20.f14413a.c().o();
        r20.f14413a.z();
        r2.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0157: MOVE (r19 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:49:0x0157 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<c.f.a.c.k.b.ca> U(java.lang.String r21, java.lang.String r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.j.U(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean V(b bVar) {
        c.f.a.c.f.q.o.i(bVar);
        g();
        i();
        if (S(bVar.f13737b, bVar.f13739d.f13731c) == null) {
            long jI = I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{bVar.f13737b});
            this.f14413a.z();
            if (jI >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", bVar.f13737b);
        contentValues.put("origin", bVar.f13738c);
        contentValues.put("name", bVar.f13739d.f13731c);
        H(contentValues, "value", bVar.f13739d.I());
        contentValues.put("active", Boolean.valueOf(bVar.f13741f));
        contentValues.put("trigger_event_name", bVar.f13742g);
        contentValues.put("trigger_timeout", Long.valueOf(bVar.f13744i));
        contentValues.put("timed_out_event", this.f14413a.G().L(bVar.f13743h));
        contentValues.put("creation_timestamp", Long.valueOf(bVar.f13740e));
        contentValues.put("triggered_event", this.f14413a.G().L(bVar.f13745j));
        contentValues.put("triggered_timestamp", Long.valueOf(bVar.f13739d.f13732d));
        contentValues.put("time_to_live", Long.valueOf(bVar.f13746k));
        contentValues.put("expired_event", this.f14413a.G().L(bVar.f13747l));
        try {
            if (N().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f14413a.c().o().b("Failed to insert/update conditional user property (got -1)", y3.x(bVar.f13737b));
            }
        } catch (SQLiteException e2) {
            this.f14413a.c().o().c("Error storing conditional user property", y3.x(bVar.f13737b), e2);
        }
        return true;
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0151: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:28:0x0151 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c.f.a.c.k.b.b W(java.lang.String r34, java.lang.String r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.j.W(java.lang.String, java.lang.String):c.f.a.c.k.b.b");
    }

    public final int X(String str, String str2) {
        c.f.a.c.f.q.o.e(str);
        c.f.a.c.f.q.o.e(str2);
        g();
        i();
        try {
            return N().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            this.f14413a.c().o().d("Error deleting conditional property", y3.x(str), this.f14413a.H().r(str2), e2);
            return 0;
        }
    }

    public final List<b> Y(String str, String str2, String str3) {
        c.f.a.c.f.q.o.e(str);
        g();
        i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return Z(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x008f, code lost:
    
        r3 = r41.f14413a.c().o();
        r41.f14413a.z();
        r3.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<c.f.a.c.k.b.b> Z(java.lang.String r42, java.lang.String[] r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.j.Z(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0281: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:57:0x0281 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c.f.a.c.k.b.g5 a0(java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.j.a0(java.lang.String):c.f.a.c.k.b.g5");
    }

    public final void b0(g5 g5Var) {
        c.f.a.c.f.q.o.i(g5Var);
        g();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", g5Var.N());
        contentValues.put("app_instance_id", g5Var.O());
        contentValues.put("gmp_app_id", g5Var.Q());
        contentValues.put("resettable_device_id_hash", g5Var.W());
        contentValues.put("last_bundle_index", Long.valueOf(g5Var.i()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(g5Var.a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(g5Var.c0()));
        contentValues.put("app_version", g5Var.e0());
        contentValues.put("app_store", g5Var.i0());
        contentValues.put("gmp_version", Long.valueOf(g5Var.k0()));
        contentValues.put("dev_cert_hash", Long.valueOf(g5Var.b()));
        contentValues.put("measurement_enabled", Boolean.valueOf(g5Var.f()));
        contentValues.put("day", Long.valueOf(g5Var.o()));
        contentValues.put("daily_public_events_count", Long.valueOf(g5Var.q()));
        contentValues.put("daily_events_count", Long.valueOf(g5Var.s()));
        contentValues.put("daily_conversions_count", Long.valueOf(g5Var.u()));
        contentValues.put("config_fetched_time", Long.valueOf(g5Var.j()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(g5Var.l()));
        contentValues.put("app_version_int", Long.valueOf(g5Var.g0()));
        contentValues.put("firebase_instance_id", g5Var.Y());
        contentValues.put("daily_error_events_count", Long.valueOf(g5Var.y()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(g5Var.w()));
        contentValues.put("health_monitor_sample", g5Var.B());
        contentValues.put("android_id", Long.valueOf(g5Var.E()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(g5Var.G()));
        contentValues.put("admob_app_id", g5Var.S());
        contentValues.put("dynamite_version", Long.valueOf(g5Var.d()));
        if (g5Var.K() != null) {
            if (g5Var.K().size() == 0) {
                this.f14413a.c().r().b("Safelisted events should not be an empty list. appId", g5Var.N());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", g5Var.K()));
            }
        }
        sb.a();
        if (this.f14413a.z().w(g5Var.N(), m3.j0)) {
            contentValues.put("ga_app_id", g5Var.U());
        }
        try {
            SQLiteDatabase sQLiteDatabaseN = N();
            if (sQLiteDatabaseN.update("apps", contentValues, "app_id = ?", new String[]{g5Var.N()}) == 0 && sQLiteDatabaseN.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f14413a.c().o().b("Failed to insert/update app (got -1). appId", y3.x(g5Var.N()));
            }
        } catch (SQLiteException e2) {
            this.f14413a.c().o().c("Error storing app. appId", y3.x(g5Var.N()), e2);
        }
    }

    public final h c0(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return d0(j2, str, 1L, false, false, z3, false, z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c.f.a.c.k.b.h d0(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.j.d0(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):c.f.a.c.k.b.h");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e0() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.N()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            c.f.a.c.k.b.c5 r3 = r6.f14413a     // Catch: java.lang.Throwable -> L3a
            c.f.a.c.k.b.y3 r3 = r3.c()     // Catch: java.lang.Throwable -> L3a
            c.f.a.c.k.b.w3 r3 = r3.o()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.j.e0():java.lang.String");
    }

    public final boolean f0() {
        return I("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void g0() {
        g();
        i();
        if (w()) {
            long jA = this.f14413a.A().f14179i.a();
            long jB = this.f14413a.a().b();
            long jAbs = Math.abs(jB - jA);
            this.f14413a.z();
            if (jAbs > m3.z.b(null).longValue()) {
                this.f14413a.A().f14179i.b(jB);
                g();
                i();
                if (w()) {
                    SQLiteDatabase sQLiteDatabaseN = N();
                    this.f14413a.z();
                    int iDelete = sQLiteDatabaseN.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f14413a.a().a()), String.valueOf(f.h())});
                    if (iDelete > 0) {
                        this.f14413a.c().w().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    public final void h0(List<Long> list) {
        g();
        i();
        c.f.a.c.f.q.o.i(list);
        c.f.a.c.f.q.o.k(list.size());
        if (w()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  ");
            sb2.append(Integer.MAX_VALUE);
            sb2.append(" LIMIT 1");
            if (I(sb2.toString(), null) > 0) {
                this.f14413a.c().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseN = N();
                StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < ");
                sb3.append(Integer.MAX_VALUE);
                sb3.append(")");
                sQLiteDatabaseN.execSQL(sb3.toString());
            } catch (SQLiteException e2) {
                this.f14413a.c().o().b("Error incrementing retry count. error", e2);
            }
        }
    }

    @Override // c.f.a.c.k.b.p9
    public final boolean k() {
        return false;
    }

    public final Object l(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            this.f14413a.c().o().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            this.f14413a.c().o().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f14413a.c().o().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final long m() {
        return J("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long o(String str, String str2) {
        long J;
        c.f.a.c.f.q.o.e(str);
        c.f.a.c.f.q.o.e("first_open_count");
        g();
        i();
        SQLiteDatabase sQLiteDatabaseN = N();
        sQLiteDatabaseN.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select ");
                sb.append("first_open_count");
                sb.append(" from app2 where app_id=?");
                J = J(sb.toString(), new String[]{str}, -1L);
            } finally {
                sQLiteDatabaseN.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
        if (J == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", (Integer) 0);
            contentValues.put("previous_install_count", (Integer) 0);
            if (sQLiteDatabaseN.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                this.f14413a.c().o().c("Failed to insert column (got -1). appId", y3.x(str), "first_open_count");
                return -1L;
            }
            J = 0;
            this.f14413a.c().o().d("Error inserting column. appId", y3.x(str), "first_open_count", e);
            sQLiteDatabaseN.endTransaction();
            return j2;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + J));
            if (sQLiteDatabaseN.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                this.f14413a.c().o().c("Failed to update column (got 0). appId", y3.x(str), "first_open_count");
                return -1L;
            }
            sQLiteDatabaseN.setTransactionSuccessful();
            return J;
        } catch (SQLiteException e3) {
            e = e3;
            j2 = J;
        }
    }

    public final long p() {
        return J("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean q() {
        return I("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean r() {
        return I("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final long s(String str) {
        c.f.a.c.f.q.o.e(str);
        return J("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean t(String str, Long l2, long j2, c.f.a.c.j.h.q1 q1Var) {
        g();
        i();
        c.f.a.c.f.q.o.i(q1Var);
        c.f.a.c.f.q.o.e(str);
        c.f.a.c.f.q.o.i(l2);
        byte[] bArrD = q1Var.d();
        this.f14413a.c().w().c("Saving complex main event, appId, data size", this.f14413a.H().p(str), Integer.valueOf(bArrD.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrD);
        try {
            if (N().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.f14413a.c().o().b("Failed to insert complex main event (got -1). appId", y3.x(str));
            return false;
        } catch (SQLiteException e2) {
            this.f14413a.c().o().c("Error storing complex main event. appId", y3.x(str), e2);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle u(java.lang.String r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.j.u(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0334, code lost:
    
        if (r3.C() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0336, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x033f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0340, code lost:
    
        r11.put("session_scoped", r0);
        r11.put("data", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0354, code lost:
    
        if (N().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0356, code lost:
    
        r23.f14413a.c().o().b("Failed to insert property filter (got -1). appId", c.f.a.c.k.b.y3.x(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x036a, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x036e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x036f, code lost:
    
        r3 = r23.f14413a.c().o();
        r4 = "Error storing property filter. appId";
        r7 = c.f.a.c.k.b.y3.x(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0381, code lost:
    
        i();
        g();
        c.f.a.c.f.q.o.e(r24);
        r0 = N();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03b8, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0187, code lost:
    
        r0.c(r7, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018b, code lost:
    
        r11 = r0.y().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0197, code lost:
    
        if (r11.hasNext() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a3, code lost:
    
        if (r11.next().w() != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a5, code lost:
    
        r0 = r23.f14413a.c().r();
        r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r8 = c.f.a.c.k.b.y3.x(r24);
        r10 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ba, code lost:
    
        r11 = r0.B().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d0, code lost:
    
        if (r11.hasNext() == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d2, code lost:
    
        r12 = r11.next();
        i();
        g();
        c.f.a.c.f.q.o.e(r24);
        c.f.a.c.f.q.o.i(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ec, code lost:
    
        if (android.text.TextUtils.isEmpty(r12.y()) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ee, code lost:
    
        r0 = r23.f14413a.c().r();
        r8 = c.f.a.c.k.b.y3.x(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0206, code lost:
    
        if (r12.w() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0208, code lost:
    
        r20 = java.lang.Integer.valueOf(r12.x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0213, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0215, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0220, code lost:
    
        r3 = r12.d();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r24);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0239, code lost:
    
        if (r12.w() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x023b, code lost:
    
        r8 = java.lang.Integer.valueOf(r12.x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0244, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0245, code lost:
    
        r4.put("filter_id", r8);
        r4.put("event_name", r12.y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0255, code lost:
    
        if (r12.G() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0257, code lost:
    
        r8 = java.lang.Boolean.valueOf(r12.H());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0260, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0261, code lost:
    
        r4.put("session_scoped", r8);
        r4.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0275, code lost:
    
        if (N().insertWithOnConflict("event_filters", null, r4, 5) != (-1)) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0277, code lost:
    
        r23.f14413a.c().o().b("Failed to insert event filter (got -1). appId", c.f.a.c.k.b.y3.x(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x028a, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0290, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0291, code lost:
    
        r3 = r23.f14413a.c().o();
        r4 = "Error storing event filter. appId";
        r7 = c.f.a.c.k.b.y3.x(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02a1, code lost:
    
        r3.c(r4, r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02a6, code lost:
    
        r21 = r4;
        r0 = r0.y().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02b4, code lost:
    
        if (r0.hasNext() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02b6, code lost:
    
        r3 = r0.next();
        i();
        g();
        c.f.a.c.f.q.o.e(r24);
        c.f.a.c.f.q.o.i(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02d0, code lost:
    
        if (android.text.TextUtils.isEmpty(r3.y()) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02d2, code lost:
    
        r0 = r23.f14413a.c().r();
        r7 = c.f.a.c.k.b.y3.x(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02ea, code lost:
    
        if (r3.w() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02ec, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02f5, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f6, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ff, code lost:
    
        r4 = r3.d();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0316, code lost:
    
        if (r3.w() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0318, code lost:
    
        r12 = java.lang.Integer.valueOf(r3.x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0321, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0322, code lost:
    
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.y());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.String r24, java.util.List<c.f.a.c.j.h.h0> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.j.v(java.lang.String, java.util.List):void");
    }

    public final boolean w() {
        Context contextB = this.f14413a.b();
        this.f14413a.z();
        return contextB.getDatabasePath("google_app_measurement.db").exists();
    }
}
