package com.example.tv1gus.Clases;

import java.util.ArrayList;


public class Controlador {

    ArrayList<Canal> canales= new ArrayList();


    public void agregarCanales(){

        canales.add(new Canal(1,"CNN Chile","#"));
        canales.add(new Canal(7,"canal 7","#"));
        canales.add(new Canal(8,"24 horas","#"));
        canales.add(new Canal(9,"Mega","#"));
        canales.add(new Canal(11,"chilevision","#"));
        canales.add(new Canal(13,"13c","#"));

    }

    public String buscarCanal (int id){
        String url = null;
        for (Canal canal : canales){
            if (canal.getId() == id){
                url = canal.getUrl();
                break;
               
            }
        }
        return url;

    }

    public void test(){


    }



}
