package com.mytests.micronaut.controllers;

import com.mytests.micronaut.data.Tab3;
import com.mytests.micronaut.repositories.Tab3RepoRx;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import jakarta.inject.Inject;

/**
 * *
 * <p>Created by irina on 08.09.2021.</p>
 * <p>Project: micronaut-jpa-reactive</p>
 * *
 */
@Controller("/tab3")
public class Tab3Controller {
     @Inject
    Tab3RepoRx repo;
   

    @Get("/all")
    public Flowable<Tab3> all() {
        return repo.findAll();
    }
    @Get("/byFirstContains/{foo}")
    public Flowable<Tab3> byFirstContains(String foo) {
        return repo.findByFirstContains(foo);
    }

    @Get("/singleByThird/{ttt}")
    public Single<Tab3> singleByThird(@PathVariable String ttt) {
         return repo.findByThird(Integer.parseInt(ttt));
    }

    @Get("/maybe/{t}/{s}")
    public Single<Tab3> maybe(@PathVariable String t, @PathVariable String s) {
        return repo.findByThirdAndSecond(Integer.parseInt(t), s).doOnSuccess(tab3 -> System.out.println("success")).flatMapSingle(Single::just).doOnError(tab3 -> System.out.println("not found")).onErrorReturn(throwable -> {return new Tab3();});
    }

    @Get("/byId")
    public Tab3 byId() {
        return repo.findById(1).blockingGet();
    }
}
