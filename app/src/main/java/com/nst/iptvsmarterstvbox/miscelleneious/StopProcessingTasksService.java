package minefarts.iptvsmarters.miscelleneious;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import c.h.a.h.n.a;
import c.h.a.i.q.c;
import c.h.a.i.q.e;
import c.h.a.i.q.f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class StopProcessingTasksService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Log.d("honey", "Service Destroyed");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        Log.d("honey", "Service Started");
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        Log.e("honey", "END");
        try {
            f fVar = new f(getApplicationContext());
            if (a.q0) {
                String strValueOf = "0";
                ArrayList<c> arrayListS0 = fVar.S0();
                if (arrayListS0 != null && arrayListS0.size() > 0) {
                    strValueOf = String.valueOf(arrayListS0.get(0).c());
                }
                try {
                    if (fVar.w1(strValueOf) != 0) {
                        fVar.v2("epg", "1", strValueOf);
                    } else {
                        fVar.v2("epg", "2", strValueOf);
                    }
                } catch (Exception unused) {
                }
            }
            ArrayList<e> arrayListA2 = fVar.a2();
            if (arrayListA2 != null && arrayListA2.size() > 0) {
                for (int i2 = 0; i2 < arrayListA2.size(); i2++) {
                    if (arrayListA2.get(i2).f() == null || !arrayListA2.get(i2).f().equals("live")) {
                        if (arrayListA2.get(i2).f() == null || !arrayListA2.get(i2).f().equals("movies")) {
                            if (arrayListA2.get(i2).f() != null && arrayListA2.get(i2).f().equals("series") && arrayListA2.get(i2).d().equals("3")) {
                                fVar.u2("series", "2");
                            }
                        } else if (arrayListA2.get(i2).d().equals("3")) {
                            fVar.u2("movies", "2");
                        }
                    } else if (arrayListA2.get(i2).d().equals("3")) {
                        try {
                            fVar.u2("live", "2");
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        } catch (Exception unused3) {
        }
        stopSelf();
    }
}
