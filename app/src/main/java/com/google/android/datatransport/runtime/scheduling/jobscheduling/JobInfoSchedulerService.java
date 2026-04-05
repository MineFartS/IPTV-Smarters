package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import c.f.a.a.j.b0.a;
import c.f.a.a.j.m;
import c.f.a.a.j.r;
import c.f.a.a.j.y.j.f;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        r.f(getApplicationContext());
        m.a aVarD = m.a().b(string).d(a.b(i2));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        r.c().e().g(aVarD.a(), i3, f.a(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
