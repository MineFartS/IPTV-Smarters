package c.h.a.i.q;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class d extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f17232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17233d;

    public d(Context context) {
        super(context, "externalplayerdatabase.db", (SQLiteDatabase.CursorFactory) null, 3);
        this.f17233d = "CREATE TABLE IF NOT EXISTS table_external_player(id INTEGER PRIMARY KEY,appname TEXT,packagename TEXT,appicon TEXT,user_id_referred TEXT)";
        this.f17231b = context;
    }

    public boolean d(String str) {
        ArrayList arrayList = new ArrayList();
        String str2 = "SELECT  * FROM table_external_player WHERE appname='" + str + "'";
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17232c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                    externalPlayerModelClass.d(cursorRawQuery.getString(1));
                    arrayList.add(externalPlayerModelClass);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList.size() > 0;
    }

    public void i(String str, String str2) {
        try {
            this.f17232c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("appname", str);
            contentValues.put("packagename", str2);
            this.f17232c.insert("table_external_player", null, contentValues);
            this.f17232c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public ArrayList<ExternalPlayerModelClass> l() {
        ArrayList<ExternalPlayerModelClass> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f17232c = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT  * FROM table_external_player ", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                    externalPlayerModelClass.e(cursorRawQuery.getInt(0));
                    externalPlayerModelClass.d(cursorRawQuery.getString(1));
                    externalPlayerModelClass.f(cursorRawQuery.getString(2));
                    externalPlayerModelClass.c(cursorRawQuery.getString(3));
                    arrayList.add(externalPlayerModelClass);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public int m(String str) {
        int iDelete = 0;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f17232c = writableDatabase;
            iDelete = writableDatabase.delete("table_external_player", "appname='" + str + "' ", null);
            this.f17232c.close();
            return iDelete;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return iDelete;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f17233d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
