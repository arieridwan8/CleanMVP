package id.arieridwan.cleanmvp.api;

import id.arieridwan.cleanmvp.api.dao.ExchangeRateDao;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by arieridwan on 16/03/2017.
 */

public interface ApiInterface {

    String URL = "/latest";

    @GET(URL)
    Observable<ExchangeRateDao> getExchangeRate(@Query("base") String base,
                                                @Query("symbols") String symbols);

}
