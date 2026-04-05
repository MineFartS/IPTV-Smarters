package n.a.a;

import a.b.k.b;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import pub.devrel.easypermissions.AppSettingsDialogHolderActivity;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Parcelable, DialogInterface.OnClickListener {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f31208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f31210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f31211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DialogInterface.OnClickListener f31212i;

    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    /* JADX INFO: renamed from: n.a.a.b$b, reason: collision with other inner class name */
    public static class C0319b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f31213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f31214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f31215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f31216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f31217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f31218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public DialogInterface.OnClickListener f31219g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f31220h = -1;

        public C0319b(Activity activity) {
            this.f31213a = activity;
            this.f31214b = activity;
        }

        public b a() {
            this.f31215c = TextUtils.isEmpty(this.f31215c) ? this.f31214b.getString(d.f31221a) : this.f31215c;
            this.f31216d = TextUtils.isEmpty(this.f31216d) ? this.f31214b.getString(d.f31222b) : this.f31216d;
            this.f31217e = TextUtils.isEmpty(this.f31217e) ? this.f31214b.getString(R.string.ok) : this.f31217e;
            this.f31218f = TextUtils.isEmpty(this.f31218f) ? this.f31214b.getString(R.string.cancel) : this.f31218f;
            int i2 = this.f31220h;
            if (i2 <= 0) {
                i2 = 16061;
            }
            this.f31220h = i2;
            return new b(this.f31213a, this.f31214b, this.f31215c, this.f31216d, this.f31217e, this.f31218f, this.f31219g, this.f31220h, null);
        }
    }

    public b(Parcel parcel) {
        this.f31205b = parcel.readString();
        this.f31206c = parcel.readString();
        this.f31207d = parcel.readString();
        this.f31208e = parcel.readString();
        this.f31209f = parcel.readInt();
    }

    public /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    public b(Object obj, Context context, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, int i2) {
        this.f31211h = obj;
        this.f31210g = context;
        this.f31205b = str;
        this.f31206c = str2;
        this.f31207d = str3;
        this.f31208e = str4;
        this.f31212i = onClickListener;
        this.f31209f = i2;
    }

    public /* synthetic */ b(Object obj, Context context, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, int i2, a aVar) {
        this(obj, context, str, str2, str3, str4, onClickListener, i2);
    }

    public void b(Object obj) {
        this.f31211h = obj;
    }

    public void c(Context context) {
        this.f31210g = context;
    }

    public void d(DialogInterface.OnClickListener onClickListener) {
        this.f31212i = onClickListener;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e() {
        if (this.f31212i == null) {
            h(AppSettingsDialogHolderActivity.y0(this.f31210g, this));
        } else {
            f();
        }
    }

    public void f() {
        new b.a(this.f31210g).b(false).setTitle(this.f31206c).f(this.f31205b).j(this.f31207d, this).g(this.f31208e, this.f31212i).create().show();
    }

    public final void h(Intent intent) {
        Object obj = this.f31211h;
        if (obj instanceof Activity) {
            ((Activity) obj).startActivityForResult(intent, this.f31209f);
        } else if (obj instanceof Fragment) {
            ((Fragment) obj).startActivityForResult(intent, this.f31209f);
        } else if (obj instanceof android.app.Fragment) {
            ((android.app.Fragment) obj).startActivityForResult(intent, this.f31209f);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.f31210g.getPackageName(), null));
        h(intent);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f31205b);
        parcel.writeString(this.f31206c);
        parcel.writeString(this.f31207d);
        parcel.writeString(this.f31208e);
        parcel.writeInt(this.f31209f);
    }
}
