package id.arieridwan.cleanmvp;

import android.app.Application;
import id.arieridwan.cleanmvp.dagger.component.DaggerAppComponent;
import id.arieridwan.cleanmvp.dagger.module.ApiModule;
import id.arieridwan.cleanmvp.dagger.component.AppComponent;
import id.arieridwan.cleanmvp.dagger.module.AppModule;

/**
 * Created by arieridwan on 16/03/2017.
 */

public class MyApp extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

}
