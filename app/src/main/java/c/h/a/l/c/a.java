package c.h.a.l.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import c.h.a.l.e.b;
import minefarts.iptvsmarters.miscelleneious.MyApplication;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f17983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<c.h.a.l.e.a> f17984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17990j;

    public a(Context context) {
        super(context, "vpndatabase.db", (SQLiteDatabase.CursorFactory) null, 6);
        this.f17984d = null;
        this.f17985e = "CREATE TABLE IF NOT EXISTS vpntable(id INTEGER PRIMARY KEY,filename TEXT,filename1 TEXT,filepath TEXT,username TEXT,name TEXT,user_id TEXT,profilename TEXT,type TEXT)";
        this.f17986f = "CREATE TABLE IF NOT EXISTS vpntablelogin(id TEXT,filename TEXT,filename1 TEXT,filepath TEXT,username TEXT,name TEXT,profilename TEXT,type TEXT)";
        this.f17987g = "ALTER TABLE vpntable ADD COLUMN filename1 TEXT;";
        this.f17988h = "ALTER TABLE vpntablelogin ADD COLUMN filename1 TEXT;";
        this.f17989i = "ALTER TABLE vpnsmarterstable ADD COLUMN flag TEXT;";
        this.f17990j = "CREATE TABLE IF NOT EXISTS vpnsmarterstable(id INTEGER PRIMARY KEY,file_name TEXT,filepath TEXT,vpn_username TEXT,vpn_password TEXT,user_id TEXT,auth_user_pass TEXT,remember TEXT,server_name TEXT,flag TEXT)";
        this.f17982b = context;
    }

    public void d(ArrayList<c.h.a.l.e.a> arrayList) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            int size = arrayList.size();
            if (size != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    contentValues.put("file_name", arrayList.get(i2).a());
                    contentValues.put("server_name", arrayList.get(i2).e());
                    contentValues.put("filepath", arrayList.get(i2).d());
                    contentValues.put("vpn_username", arrayList.get(i2).h());
                    contentValues.put("vpn_password", arrayList.get(i2).g());
                    contentValues.put("auth_user_pass", arrayList.get(i2).i());
                    contentValues.put("remember", arrayList.get(i2).j());
                    contentValues.put("user_id", arrayList.get(i2).f());
                    contentValues.put("flag", arrayList.get(i2).b());
                    writableDatabase.insert("vpnsmarterstable", null, contentValues);
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            Log.w("msg", "exception");
        }
    }

    public void i(SQLiteDatabase sQLiteDatabase, ArrayList<c.h.a.l.e.a> arrayList) {
        try {
            sQLiteDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            int size = arrayList.size();
            if (size != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    contentValues.put("file_name", arrayList.get(i2).a());
                    contentValues.put("server_name", arrayList.get(i2).e());
                    contentValues.put("filepath", arrayList.get(i2).d());
                    contentValues.put("vpn_username", arrayList.get(i2).h());
                    contentValues.put("vpn_password", arrayList.get(i2).g());
                    contentValues.put("auth_user_pass", arrayList.get(i2).i());
                    contentValues.put("remember", arrayList.get(i2).j());
                    contentValues.put("user_id", arrayList.get(i2).f());
                    sQLiteDatabase.insert("vpnsmarterstable", null, contentValues);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            Log.w("msg", "exception");
        }
    }

    public boolean l(String str, String str2, String str3) {
        String str4 = "SELECT  * FROM vpnsmarterstable WHERE  file_name='" + str + "'  AND server_name='" + str2 + "' AND filepath='" + str3 + "'";
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17983c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(str4, null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count > 0;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return false;
        }
    }

    public boolean m(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT  * FROM vpnsmarterstable WHERE  file_name='" + str + "'  AND server_name='" + str2 + "' AND filepath='" + str3 + "'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count > 0;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return false;
        }
    }

    public void n() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f17983c = writableDatabase;
            writableDatabase.delete("vpnsmarterstable", null, null);
            this.f17983c.close();
        } catch (Exception unused) {
        }
    }

    public void o(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    o(file2);
                }
            }
            file.delete();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f17985e);
        sQLiteDatabase.execSQL(this.f17986f);
        sQLiteDatabase.execSQL(this.f17990j);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 < 4) {
            sQLiteDatabase.execSQL(this.f17987g);
            sQLiteDatabase.execSQL(this.f17988h);
        }
        if (i2 < 5) {
            sQLiteDatabase.execSQL(this.f17990j);
            t(sQLiteDatabase);
        }
        if (i2 < 6) {
            sQLiteDatabase.execSQL(this.f17989i);
        }
    }

    public void p(int i2) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f17983c = writableDatabase;
            writableDatabase.delete("vpnsmarterstable", "id='" + i2 + "'", null);
            this.f17983c.close();
        } catch (Exception unused) {
        }
    }

    public ArrayList<c.h.a.l.e.a> q() {
        ArrayList<c.h.a.l.e.a> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17983c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT  * FROM vpnsmarterstable", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    c.h.a.l.e.a aVar = new c.h.a.l.e.a();
                    aVar.n(cursorRawQuery.getInt(0));
                    aVar.l(cursorRawQuery.getString(1));
                    aVar.p(cursorRawQuery.getString(2));
                    aVar.t(cursorRawQuery.getString(3));
                    aVar.s(cursorRawQuery.getString(4));
                    aVar.r(cursorRawQuery.getString(5));
                    aVar.k(cursorRawQuery.getString(6));
                    aVar.o(cursorRawQuery.getString(7));
                    aVar.q(cursorRawQuery.getString(8));
                    aVar.m(cursorRawQuery.getString(9));
                    arrayList.add(aVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final ArrayList<b> r(SQLiteDatabase sQLiteDatabase) {
        ArrayList<b> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT  * FROM vpntablelogin", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    b bVar = new b();
                    bVar.g(cursorRawQuery.getInt(0));
                    bVar.d(cursorRawQuery.getString(1));
                    bVar.e(cursorRawQuery.getString(2));
                    bVar.f(cursorRawQuery.getString(3));
                    bVar.l(cursorRawQuery.getString(4));
                    bVar.h(cursorRawQuery.getString(5));
                    bVar.i(cursorRawQuery.getColumnName(6));
                    bVar.j("login");
                    arrayList.add(bVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public final ArrayList<b> s(SQLiteDatabase sQLiteDatabase) {
        ArrayList<b> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT  * FROM vpntable", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    b bVar = new b();
                    bVar.g(cursorRawQuery.getInt(0));
                    bVar.d(cursorRawQuery.getString(1));
                    bVar.e(cursorRawQuery.getString(2));
                    bVar.f(cursorRawQuery.getString(3));
                    bVar.l(cursorRawQuery.getString(4));
                    bVar.h(cursorRawQuery.getString(5));
                    bVar.i(cursorRawQuery.getColumnName(6));
                    bVar.j("settings");
                    arrayList.add(bVar);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public final void t(SQLiteDatabase sQLiteDatabase) {
        File file;
        File[] fileArrListFiles;
        int i2;
        int i3;
        File[] fileArr;
        try {
            String strValueOf = String.valueOf(new File(this.f17982b.getFilesDir() + "/VPNIPTVSmarters"));
            this.f17984d = new ArrayList<>();
            if (strValueOf.isEmpty()) {
                return;
            }
            File file2 = new File(strValueOf);
            if (file2.exists()) {
                for (File file3 : file2.listFiles()) {
                    if (file3.isDirectory() && (fileArrListFiles = file3.listFiles()) != null && fileArrListFiles.length > 0) {
                        int length = fileArrListFiles.length;
                        int i4 = 0;
                        while (i4 < length) {
                            File file4 = fileArrListFiles[i4];
                            if (file4 == null || !file4.getName().endsWith(".ovpn")) {
                                i2 = i4;
                                i3 = length;
                                fileArr = fileArrListFiles;
                                StringBuilder sb = new StringBuilder();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file4));
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        sb.append(line);
                                        sb.append('\n');
                                    }
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                }
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(new File(MyApplication.a().getFilesDir() + "/VPNIPTVSmarters", file4.getName()));
                                    fileOutputStream.write(sb.toString().getBytes());
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (Exception unused2) {
                                }
                            } else {
                                String strReplaceAll = file4.getName().replaceAll(".ovpn", BuildConfig.FLAVOR);
                                StringBuilder sb2 = new StringBuilder();
                                try {
                                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file4));
                                    while (true) {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            break;
                                        }
                                        sb2.append(line2);
                                        sb2.append('\n');
                                    }
                                    bufferedReader2.close();
                                } catch (IOException unused3) {
                                }
                                try {
                                    StringBuilder sb3 = new StringBuilder();
                                    i2 = i4;
                                    try {
                                        sb3.append(MyApplication.a().getFilesDir());
                                        sb3.append("/");
                                        sb3.append("VPNIPTVSmarters");
                                        File file5 = new File(sb3.toString(), file4.getName());
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(file5);
                                        fileOutputStream2.write(sb2.toString().getBytes());
                                        fileOutputStream2.flush();
                                        fileOutputStream2.close();
                                        if (m(sQLiteDatabase, file4.getName(), strReplaceAll, String.valueOf(file5))) {
                                            i3 = length;
                                            fileArr = fileArrListFiles;
                                        } else {
                                            i3 = length;
                                            fileArr = fileArrListFiles;
                                            try {
                                                u(sQLiteDatabase, file4.getName(), strReplaceAll, sb2.toString(), file5);
                                            } catch (Exception e2) {
                                                e = e2;
                                                e.printStackTrace();
                                            }
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        i3 = length;
                                        fileArr = fileArrListFiles;
                                        e.printStackTrace();
                                        i4 = i2 + 1;
                                        length = i3;
                                        fileArrListFiles = fileArr;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    i2 = i4;
                                }
                            }
                            i4 = i2 + 1;
                            length = i3;
                            fileArrListFiles = fileArr;
                        }
                    }
                }
                if (this.f17984d.size() > 0) {
                    i(sQLiteDatabase, this.f17984d);
                }
                if (!new c.h.a.k.d.a.a(this.f17982b).A().equals(c.h.a.h.n.a.s0)) {
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 23) {
                        file = new File(this.f17982b.getFilesDir() + "/VPNIPTVSmarters");
                    } else if (i5 >= 19) {
                        file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters");
                    } else {
                        file = new File(Environment.getExternalStorageDirectory() + "/Documents", "VPNIPTVSmarters");
                    }
                } else if (Build.VERSION.SDK_INT >= 19) {
                    file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters");
                } else {
                    file = new File(Environment.getExternalStorageDirectory() + "/Documents", "VPNIPTVSmarters");
                }
                try {
                    o(file);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        } catch (Exception unused4) {
        }
    }

    public final void u(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, File file) {
        String strB;
        String strC;
        c.h.a.l.e.a aVar = new c.h.a.l.e.a();
        if (str3.contains("auth-user-pass")) {
            aVar.k("1");
        } else {
            aVar.k("0");
        }
        aVar.o("0");
        ArrayList<b> arrayListR = r(sQLiteDatabase);
        ArrayList<b> arrayListS = s(sQLiteDatabase);
        int i2 = 0;
        if (arrayListR == null || arrayListR.size() <= 0) {
            strB = BuildConfig.FLAVOR;
            strC = strB;
        } else {
            for (int i3 = 0; i3 < arrayListR.size(); i3++) {
                if (arrayListR.get(i3).a().equals(str)) {
                    strC = arrayListR.get(i3).c();
                    strB = arrayListR.get(i3).b();
                    break;
                }
            }
            strB = BuildConfig.FLAVOR;
            strC = strB;
        }
        if (strC.equals(BuildConfig.FLAVOR) && strB.equals(BuildConfig.FLAVOR) && arrayListS != null && arrayListS.size() > 0) {
            while (true) {
                if (i2 >= arrayListS.size()) {
                    break;
                }
                if (arrayListS.get(i2).a().equals(str)) {
                    strC = arrayListS.get(i2).c();
                    strB = arrayListS.get(i2).b();
                    break;
                }
                i2++;
            }
        }
        aVar.t(strC);
        aVar.s(strB);
        aVar.q(str2);
        aVar.l(str);
        aVar.r("0");
        aVar.p(String.valueOf(file));
        this.f17984d.add(aVar);
    }

    public int v(c.h.a.l.e.a aVar) {
        int iC = aVar.c();
        int iUpdate = 0;
        try {
            this.f17983c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("vpn_username", aVar.h());
            contentValues.put("vpn_password", aVar.g());
            iUpdate = this.f17983c.update("vpnsmarterstable", contentValues, "id='" + iC + "'", null);
            this.f17983c.close();
            return iUpdate;
        } catch (Exception unused) {
            return iUpdate;
        }
    }
}
