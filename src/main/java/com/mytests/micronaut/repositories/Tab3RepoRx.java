package com.mytests.micronaut.repositories;


import com.mytests.micronaut.data.Tab3;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.reactive.RxJavaCrudRepository;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;

@Repository
public interface Tab3RepoRx extends RxJavaCrudRepository<Tab3,Integer> {

    
    Flowable<Tab3> findByFirstContains(String first);
    
    Single<Tab3> findByThird(int third);

    
    Maybe<Tab3> findByThirdAndSecond(int third, String second);
}