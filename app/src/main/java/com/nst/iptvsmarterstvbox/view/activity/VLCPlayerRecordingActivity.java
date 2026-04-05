package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.c;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import c.h.a.h.n.e;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class VLCPlayerRecordingActivity extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f26890e;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            try {
                try {
                    VLCPlayerRecordingActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=org.videolan.vlc")));
                } catch (ActivityNotFoundException unused) {
                    VLCPlayerRecordingActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=org.videolan.vlc")));
                }
            } catch (ActivityNotFoundException e2) {
                e.l0(VLCPlayerRecordingActivity.this.f26890e, String.valueOf(e2));
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            VLCPlayerRecordingActivity.this.finish();
        }
    }

    public final void A0() {
        this.f26890e = this;
        String stringExtra = getIntent().getStringExtra("VIDEO_PATH");
        this.f26889d = stringExtra;
        try {
            Uri uri = Uri.parse(stringExtra);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage("org.videolan.vlc");
            intent.setDataAndTypeAndNormalize(uri, "video/*");
            startActivityForResult(intent, 42);
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
            finish();
        } catch (ActivityNotFoundException unused) {
            B0();
        }
    }

    public void B0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(R.string.media_player));
        builder.setMessage(getResources().getString(R.string.alert_vlc_player));
        builder.setPositiveButton(getResources().getString(R.string.install_it), new a());
        builder.setNegativeButton(getResources().getString(R.string.cancel_small), new b());
        builder.setCancelable(false);
        builder.create().show();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z0();
        A0();
        getWindow().setFlags(1024, 1024);
    }

    public final void z0() {
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
}
