package com.nst.iptvsmarterstvbox.view.activity;

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
import androidx.core.content.FileProvider;
import c.h.a.h.n.e;
import com.nst.iptvsmarterstvbox.R;
import java.io.File;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class PlayExternalPlayerActivity extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f26029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26030f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26031g = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26032h = BuildConfig.FLAVOR;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            try {
                try {
                    PlayExternalPlayerActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + PlayExternalPlayerActivity.this.f26030f)));
                } catch (ActivityNotFoundException e2) {
                    e.l0(PlayExternalPlayerActivity.this.f26029e, String.valueOf(e2));
                }
            } catch (ActivityNotFoundException unused) {
                PlayExternalPlayerActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + PlayExternalPlayerActivity.this.f26030f)));
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            PlayExternalPlayerActivity.this.finish();
        }
    }

    public final boolean A0(String str) {
        Context context = this.f26029e;
        if (context != null) {
            try {
                context.getPackageManager().getPackageInfo(str, 1);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public final void B0() {
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

    public final void C0() {
        this.f26029e = this;
        this.f26030f = getIntent().getStringExtra("packagename");
        this.f26031g = this.f26030f + ".ActivityScreen";
        this.f26032h = getIntent().getStringExtra("app_name");
        this.f26028d = getIntent().getStringExtra("url");
        if (A0(this.f26030f)) {
            if (this.f26029e == null) {
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(this.f26030f);
                intent.setDataAndType(Uri.parse(this.f26028d), "video/*");
                intent.addFlags(1);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                finish();
                return;
            } catch (ActivityNotFoundException | Exception unused) {
            } catch (Exception unused2) {
                File file = new File(this.f26028d);
                Uri uriE = FileProvider.e(this.f26029e, this.f26029e.getApplicationContext().getPackageName() + ".provider", file);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setPackage(this.f26030f);
                intent2.setDataAndType(uriE, "video/*");
                intent2.addFlags(1);
                startActivity(intent2);
                overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                finish();
                return;
            }
        }
        D0();
    }

    public void D0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(R.string.media_player));
        builder.setMessage(this.f26032h + " " + getResources().getString(R.string.alert_player));
        builder.setPositiveButton(getResources().getString(R.string.install_it), new a());
        builder.setNegativeButton(getResources().getString(R.string.cancel_small), new b());
        builder.setCancelable(false);
        builder.create().show();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        B0();
        C0();
        getWindow().setFlags(1024, 1024);
    }
}
