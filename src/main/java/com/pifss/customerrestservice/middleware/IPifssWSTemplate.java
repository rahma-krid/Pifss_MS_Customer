package com.pifss.customerrestservice.middleware;

public interface IPifssWSTemplate {

    <T,R> R SendAndReceive (T t,  String uri, R r);

}
