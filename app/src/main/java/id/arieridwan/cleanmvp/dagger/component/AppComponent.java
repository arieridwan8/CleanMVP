package id.arieridwan.cleanmvp.dagger.component;

import javax.inject.Singleton;
import dagger.Component;
import id.arieridwan.cleanmvp.dagger.module.ApiModule;
import id.arieridwan.cleanmvp.dagger.module.AppModule;
import retrofit2.Retrofit;

/**
 * Created by arieridwan on 16/03/2017.
 */
@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
    Retrofit retrofit();
}
