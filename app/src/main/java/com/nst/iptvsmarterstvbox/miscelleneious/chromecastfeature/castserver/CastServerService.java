package minefarts.iptvsmarters.miscelleneious.chromecastfeature.castserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import c.h.a.h.m.d.b;
import c.h.a.h.m.d.c;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class CastServerService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f24930b;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.i("HTTPSERVICE", "Destroying httpService");
        this.f24930b.p();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        Log.i("HTTPSERVICE", "Creating and starting httpService");
        super.onCreate();
        c cVar = new c(intent.getStringExtra("127.0.0.1"), 8080, new File(intent.getStringExtra(InstructionFileId.DOT)), false);
        this.f24930b = cVar;
        try {
            cVar.o();
            return 2;
        } catch (IOException e2) {
            Log.i("HTTPSERVICE", "IOException: " + e2.getMessage());
            return 2;
        }
    }
}
