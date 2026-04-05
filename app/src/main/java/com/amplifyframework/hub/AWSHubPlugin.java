package com.amplifyframework.hub;

import a.i.q.d;
import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AWSHubPlugin extends HubPlugin<Void> {
    private final Set<Subscription> subscriptions = new HashSet();
    private final ExecutorService executorService = Executors.newCachedThreadPool();

    public static final class Subscription {
        private final HubChannel channel;
        private final HubEventFilter hubEventFilter;
        private final HubSubscriber hubSubscriber;
        private final SubscriptionToken subscriptionToken;

        public Subscription(SubscriptionToken subscriptionToken, HubChannel hubChannel, HubEventFilter hubEventFilter, HubSubscriber hubSubscriber) {
            subscriptionToken.getClass();
            this.subscriptionToken = subscriptionToken;
            hubChannel.getClass();
            this.channel = hubChannel;
            hubEventFilter.getClass();
            this.hubEventFilter = hubEventFilter;
            hubSubscriber.getClass();
            this.hubSubscriber = hubSubscriber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Subscription.class != obj.getClass()) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            if (d.a(this.subscriptionToken, subscription.subscriptionToken) && this.channel == subscription.channel && d.a(this.hubEventFilter, subscription.hubEventFilter)) {
                return d.a(this.hubSubscriber, subscription.hubSubscriber);
            }
            return false;
        }

        public HubChannel getHubChannel() {
            return this.channel;
        }

        public HubEventFilter getHubEventFilter() {
            return this.hubEventFilter;
        }

        public HubSubscriber getHubSubscriber() {
            return this.hubSubscriber;
        }

        public SubscriptionToken getSubscriptionToken() {
            return this.subscriptionToken;
        }

        public int hashCode() {
            return (((((this.subscriptionToken.hashCode() * 31) + this.channel.hashCode()) * 31) + this.hubEventFilter.hashCode()) * 31) + this.hubSubscriber.hashCode();
        }

        public String toString() {
            return "Subscription{subscriptionToken=" + this.subscriptionToken + ", channel=" + this.channel + ", hubEventFilter=" + this.hubEventFilter + ", hubSubscriber=" + this.hubSubscriber + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda$publish$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a(HubChannel hubChannel, final HubEvent hubEvent) {
        synchronized (this.subscriptions) {
            for (final Subscription subscription : this.subscriptions) {
                if (subscription.getHubChannel().equals(hubChannel) && subscription.getHubEventFilter().filter(hubEvent)) {
                    this.executorService.execute(new Runnable() { // from class: c.b.d.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            subscription.getHubSubscriber().onEvent(hubEvent);
                        }
                    });
                }
            }
        }
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(JSONObject jSONObject, Context context) {
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public Void getEscapeHatch() {
        return null;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return "awsHubPlugin";
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "1.24.0";
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public <T> void publish(final HubChannel hubChannel, final HubEvent<T> hubEvent) {
        hubChannel.getClass();
        hubEvent.getClass();
        this.executorService.execute(new Runnable() { // from class: c.b.d.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f5067b.a(hubChannel, hubEvent);
            }
        });
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public SubscriptionToken subscribe(HubChannel hubChannel, HubEventFilter hubEventFilter, HubSubscriber hubSubscriber) {
        hubChannel.getClass();
        hubEventFilter.getClass();
        hubSubscriber.getClass();
        SubscriptionToken subscriptionTokenCreate = SubscriptionToken.create();
        synchronized (this.subscriptions) {
            this.subscriptions.add(new Subscription(subscriptionTokenCreate, hubChannel, hubEventFilter, hubSubscriber));
        }
        return subscriptionTokenCreate;
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public SubscriptionToken subscribe(HubChannel hubChannel, HubSubscriber hubSubscriber) {
        return subscribe(hubChannel, HubEventFilters.always(), hubSubscriber);
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public void unsubscribe(SubscriptionToken subscriptionToken) {
        subscriptionToken.getClass();
        synchronized (this.subscriptions) {
            Iterator<Subscription> it = this.subscriptions.iterator();
            while (it.hasNext()) {
                if (it.next().getSubscriptionToken().equals(subscriptionToken)) {
                    it.remove();
                }
            }
        }
    }
}
