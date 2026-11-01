package com.transsion.shorttv.ui.activity;

import ae.g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.c;
import androidx.activity.ComponentActivity;
import androidx.core.os.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import androidx.view.ViewModelLazy;
import androidx.view.v;
import androidx.view.v0;
import androidx.view.x0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.therouter.TheRouter;
import com.transsion.ad.bidding.video.BiddingVideoManager;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.ad.playeroverlayad.ShortTvPlayerOverlayAdManager;
import com.transsion.shorttv.base.activity.BaseActivity;
import com.transsion.shorttv.ui.fragment.ShortTvDetailListFragment;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import du.l;
import hu.k;
import hu.n;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.y0;
import mt.b;

/* compiled from: source.java */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010:\u001a\u0004\u0018\u0001068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00109R\"\u0010>\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010$\u001a\u0004\b<\u0010\u000e\"\u0004\b=\u0010\t¨\u0006A"}, d2 = {"Lcom/transsion/shorttv/ui/activity/ShortTvListActivity;", "Lcom/transsion/shorttv/base/activity/BaseActivity;", "Ldu/l;", "<init>", "()V", "", "forceReplace", "", "h0", "(Z)V", "g0", "d0", "()Ldu/l;", "isStatusDark", "()Z", "isMonitorNetworkState", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "onPause", "", g.f568b, "I", "ep", "", "h", "J", "ms", "i", "Z", "isHistoryFirst", "", j.f35131b, "Ljava/lang/String;", "subjectId", CampaignEx.JSON_KEY_AD_K, "ops", "Lcom/transsion/shorttv/ui/fragment/ShortTvDetailListFragment;", "l", "Lcom/transsion/shorttv/ui/fragment/ShortTvDetailListFragment;", "fragment", "Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "m", "Lkotlin/Lazy;", "c0", "()Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "shortTvViewModel", "Lhu/k;", "n", "b0", "()Lhu/k;", "pageLifecycleProvider", "o", "e0", "setActivityPaused", "isActivityPaused", TtmlNode.TAG_P, "a", "shortTvLib_release"}, k = 1, mv = {2, 1, 0}, xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ShortTvListActivity extends BaseActivity<l> {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public long ms;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean isHistoryFirst;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String subjectId;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public String ops;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private ShortTvDetailListFragment fragment;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy shortTvViewModel;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isActivityPaused;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int ep = -1;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy pageLifecycleProvider = LazyKt.b(new Function0() { // from class: com.transsion.shorttv.ui.activity.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ShortTvListActivity.a0();
            return null;
        }
    });

    /* compiled from: source.java */
    /* renamed from: com.transsion.shorttv.ui.activity.ShortTvListActivity$a, reason: from kotlin metadata */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(Companion companion, Context context, String str, Integer num, long j11, boolean z11, String str2, int i11, Object obj) {
            Integer num2;
            long j12;
            boolean z12;
            String str3;
            if ((i11 & 4) != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            if ((i11 & 8) != 0) {
                j12 = 0;
            } else {
                j12 = j11;
            }
            if ((i11 & 16) != 0) {
                z12 = false;
            } else {
                z12 = z11;
            }
            if ((i11 & 32) != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            companion.a(context, str, num2, j12, z12, str3);
        }

        public final void a(Context context, String subjectId, Integer num, long j11, boolean z11, String str) {
            Intrinsics.h(context, "context");
            Intrinsics.h(subjectId, "subjectId");
            Intent intent = new Intent(context, (Class<?>) ShortTvListActivity.class);
            Bundle a11 = d.a();
            a11.putString("id", subjectId);
            a11.putString("ops", str);
            if (num != null) {
                a11.putInt("ep", num.intValue());
                a11.putLong("ms", j11);
                a11.putBoolean("historyFist", z11);
            }
            intent.putExtras(a11);
            context.startActivity(intent);
        }

        private Companion() {
        }
    }

    public ShortTvListActivity() {
        final Function0 function0 = null;
        this.shortTvViewModel = new ViewModelLazy(Reflection.b(ShortTvViewModel.class), new Function0<x0>() { // from class: com.transsion.shorttv.ui.activity.ShortTvListActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final x0 invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new Function0<v0.c>() { // from class: com.transsion.shorttv.ui.activity.ShortTvListActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final v0.c invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<p1.a>() { // from class: com.transsion.shorttv.ui.activity.ShortTvListActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final p1.a invoke() {
                p1.a aVar;
                Function0 function02 = Function0.this;
                return (function02 == null || (aVar = (p1.a) function02.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : aVar;
            }
        });
    }

    public static /* synthetic */ k a0() {
        f0();
        return null;
    }

    private final k b0() {
        c.a(this.pageLifecycleProvider.getValue());
        return null;
    }

    private final ShortTvViewModel c0() {
        return (ShortTvViewModel) this.shortTvViewModel.getValue();
    }

    private static final k f0() {
        iu.a c11 = bt.c.f16744a.c();
        if (c11 != null) {
            c11.n();
            return null;
        }
        return null;
    }

    private final void g0() {
        BiddingVideoManager.Companion companion = BiddingVideoManager.f41614w;
        BiddingVideoManager.Companion.b(companion, "ShortTvPlayerUnlockPlayScene", null, 2, null);
        BiddingVideoManager.Companion.b(companion, "ShortTvPlayerUnlockDownloadScene", null, 2, null);
        kotlinx.coroutines.k.d(v.a(this), y0.b(), null, new ShortTvListActivity$preloadAd$1("ShortTvPlayerOverlayScene", null), 2, null);
    }

    private final void h0(boolean forceReplace) {
        ShortTvDetailListFragment shortTvDetailListFragment;
        Fragment k02 = getSupportFragmentManager().k0("ShortTvDetailListFragment");
        Bundle bundle = null;
        if (k02 instanceof ShortTvDetailListFragment) {
            shortTvDetailListFragment = (ShortTvDetailListFragment) k02;
        } else {
            shortTvDetailListFragment = null;
        }
        this.fragment = shortTvDetailListFragment;
        if (forceReplace || shortTvDetailListFragment == null) {
            ShortTvDetailListFragment shortTvDetailListFragment2 = new ShortTvDetailListFragment();
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                bundle = new Bundle(extras);
            }
            shortTvDetailListFragment2.setArguments(bundle);
            this.fragment = shortTvDetailListFragment2;
            x p11 = getSupportFragmentManager().p();
            int i11 = R$id.flContent;
            ShortTvDetailListFragment shortTvDetailListFragment3 = this.fragment;
            Intrinsics.e(shortTvDetailListFragment3);
            p11.t(i11, shortTvDetailListFragment3, "ShortTvDetailListFragment");
            p11.l();
        }
    }

    static /* synthetic */ void i0(ShortTvListActivity shortTvListActivity, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        shortTvListActivity.h0(z11);
    }

    @Override // com.transsion.shorttv.base.activity.BaseCommonActivity
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public l getViewBinding() {
        l c11 = l.c(getLayoutInflater());
        Intrinsics.g(c11, "inflate(...)");
        return c11;
    }

    /* renamed from: e0, reason: from getter */
    public final boolean getIsActivityPaused() {
        return this.isActivityPaused;
    }

    @Override // com.transsion.shorttv.base.activity.BaseCommonActivity
    public boolean isMonitorNetworkState() {
        return false;
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.transsion.shorttv.base.activity.BaseActivity, com.transsion.shorttv.base.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b.f72757a.i(1, this);
        ShortTvPlayerOverlayAdManager.f54009a.d(v.a(this));
        b0();
        g0();
        TheRouter.l(this);
        i0(this, false, 1, null);
        hu.j T = T();
        if (T != null) {
            T.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.transsion.shorttv.base.activity.BaseActivity, com.transsion.shorttv.base.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        n j11;
        super.onDestroy();
        ShortTvPlayerOverlayAdManager.f54009a.b();
        b0();
        iu.a c11 = bt.c.f16744a.c();
        if (c11 != null && (j11 = c11.j()) != null) {
            j11.f(false);
        }
        ju.c.f69317a.n("");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        ShortTvDetailListFragment shortTvDetailListFragment;
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        int intExtra = intent.getIntExtra("ep", -1);
        boolean c11 = Intrinsics.c(this.subjectId, intent.getStringExtra("id"));
        setIntent(intent);
        TheRouter.l(this);
        if (c11) {
            if (intExtra >= 0 && (shortTvDetailListFragment = this.fragment) != null) {
                shortTvDetailListFragment.q1(intExtra);
                return;
            }
            return;
        }
        ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
        if (shortTvDetailListFragment2 != null) {
            shortTvDetailListFragment2.o1();
        }
        c0().d1();
        h0(true);
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity, com.transsion.shorttv.base.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        ShortTvDetailListFragment shortTvDetailListFragment;
        super.onPause();
        this.isActivityPaused = true;
        ShortTvDetailListFragment shortTvDetailListFragment2 = this.fragment;
        if (shortTvDetailListFragment2 != null) {
            shortTvDetailListFragment2.m1();
        }
        if (isFinishing() && (shortTvDetailListFragment = this.fragment) != null) {
            shortTvDetailListFragment.o1();
        }
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity, com.transsion.shorttv.base.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.isActivityPaused = false;
        ShortTvDetailListFragment shortTvDetailListFragment = this.fragment;
        if (shortTvDetailListFragment != null) {
            shortTvDetailListFragment.n1();
        }
        ju.c.f69317a.f();
    }
}
