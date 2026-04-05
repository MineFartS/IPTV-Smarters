package minefarts.iptvsmarters.view.activity;

import a.b.k.c;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import c.h.a.h.n.e;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class MxPlayerRecordingActivity extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f25900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f25901f;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            try {
                try {
                    MxPlayerRecordingActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.mxtech.videoplayer.ad")));
                } catch (ActivityNotFoundException unused) {
                    MxPlayerRecordingActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=com.mxtech.videoplayer.ad")));
                }
            } catch (ActivityNotFoundException e2) {
                e.l0(MxPlayerRecordingActivity.this.f25901f, String.valueOf(e2));
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            MxPlayerRecordingActivity.this.finish();
        }
    }

    public final void A0() {
        Window window = getWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            window.clearFlags(67108864);
        }
        if (i2 >= 21) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (i2 >= 21) {
            window.setStatusBarColor(a.i.i.b.d(this, R.color.colorPrimaryDark));
        }
    }

    public final void B0() {
        this.f25901f = this;
        String stringExtra = getIntent().getStringExtra("VIDEO_PATH");
        this.f25899d = stringExtra;
        this.f25900e = Uri.parse(stringExtra);
        try {
            if (!z0("com.mxtech.videoplayer.pro")) {
                Intent intent = new Intent();
                intent.setClassName("com.mxtech.videoplayer.ad", "com.mxtech.videoplayer.ad.ActivityScreen");
                intent.putExtra("package", getPackageName());
                intent.setDataAndType(this.f25900e, "application/x-mpegURL");
                startActivity(intent);
            } else {
                if (this.f25901f == null) {
                    return;
                }
                Intent intent2 = new Intent();
                intent2.setClassName("com.mxtech.videoplayer.pro", "com.mxtech.videoplayer.pro.ActivityScreen");
                intent2.putExtra("package", getPackageName());
                intent2.setDataAndType(this.f25900e, "application/x-mpegURL");
                intent2.setPackage("com.mxtech.videoplayer.pro");
                startActivity(intent2);
                overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
            }
            finish();
        } catch (ActivityNotFoundException unused) {
            C0();
        }
    }

    public void C0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(R.string.media_player));
        builder.setMessage(getResources().getString(R.string.alert_mx_player));
        builder.setPositiveButton(getResources().getString(R.string.install_it), new a());
        builder.setNegativeButton(getResources().getString(R.string.cancel_small), new b());
        builder.setCancelable(false);
        builder.create().show();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A0();
        B0();
        getWindow().setFlags(1024, 1024);
    }

    public final boolean z0(String str) {
        Context context = this.f25901f;
        if (context != null) {
            try {
                context.getPackageManager().getPackageInfo(str, 1);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }
}
