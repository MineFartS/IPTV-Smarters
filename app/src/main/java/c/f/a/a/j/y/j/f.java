package c.f.a.a.j.y.j;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobInfoSchedulerService f6272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JobParameters f6273c;

    public f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f6272b = jobInfoSchedulerService;
        this.f6273c = jobParameters;
    }

    public static Runnable a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new f(jobInfoSchedulerService, jobParameters);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6272b.jobFinished(this.f6273c, false);
    }
}
